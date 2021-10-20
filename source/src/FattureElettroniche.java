// **********************************************
// Fatture Elettroniche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FattureElettroniche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FILTRI_DATAARRIVO = 0;
  private static int GRP_FILTRI_TIPOPROTOCOL = 1;

  private static int PFL_FILTRI_DAESAMINARE = 0;
  private static int PFL_FILTRI_ACCETTATE = 1;
  private static int PFL_FILTRI_RIFIUTATE = 2;
  private static int PFL_FILTRI_CANCELLATE = 3;
  private static int PFL_FILTRI_DATAARRIVDAL = 4;
  private static int PFL_FILTRI_DATAARRIVOAL = 5;
  private static int PFL_FILTRI_TIPOPROTOCOL = 6;

  private static int PPQRY_FILTRIFETBL1 = 0;


  IDPanel PAN_FILTRI;
  private static int GRP_FEDOCUMENTAL_ACCETTATA = 0;
  private static int GRP_FEDOCUMENTAL_RESPINTA = 1;
  private static int GRP_FEDOCUMENTAL_CANCELLATA = 2;

  private static int PFL_FEDOCUMENTAL_XML = 0;
  private static int PFL_FEDOCUMENTAL_RAGIONSOCIAL = 1;
  private static int PFL_FEDOCUMENTAL_CODFISPARTIV = 2;
  private static int PFL_FEDOCUMENTAL_NUMERODOCUME = 3;
  private static int PFL_FEDOCUMENTAL_DATADOCUMENT = 4;
  private static int PFL_FEDOCUMENTAL_TIPODOCUMENT = 5;
  private static int PFL_FEDOCUMENTAL_IMPORTO = 6;
  private static int PFL_FEDOCUMENTAL_TRATTAMENTIM = 7;
  private static int PFL_FEDOCUMENTAL_ENTE = 8;
  private static int PFL_FEDOCUMENTAL_PROTGENNUMER = 9;
  private static int PFL_FEDOCUMENTAL_PROGENDATARR = 10;
  private static int PFL_FEDOCUMENTAL_DATAARRIVO = 11;
  private static int PFL_FEDOCUMENTAL_DATASCADEXML = 12;
  private static int PFL_FEDOCUMENTAL_DATASCADCALC = 13;
  private static int PFL_FEDOCUMENTAL_COMUNICATPCC = 14;
  private static int PFL_FEDOCUMENTAL_CODICEFISCAL = 15;
  private static int PFL_FEDOCUMENTAL_PARTITAIVA = 16;
  private static int PFL_FEDOCUMENTAL_IDDOCUMENTO = 17;
  private static int PFL_FEDOCUMENTAL_MODELLODATI = 18;
  private static int PFL_FEDOCUMENTAL_CODICEBENEFI = 19;
  private static int PFL_FEDOCUMENTAL_IDGDM = 20;
  private static int PFL_FEDOCUMENTAL_NOMEFILEXML = 21;
  private static int PFL_FEDOCUMENTAL_INFODOCUMENT = 22;
  private static int PFL_FEDOCUMENTAL_PROGRENUMERO = 23;
  private static int PFL_FEDOCUMENTAL_PROGRESSANNO = 24;
  private static int PFL_FEDOCUMENTAL_GGGIACENZA1 = 25;
  private static int PFL_FEDOCUMENTAL_APRIFATTURA = 26;
  private static int PFL_FEDOCUMENTAL_STATODOCUMEN = 27;
  private static int PFL_FEDOCUMENTAL_DESCRIZIONE = 28;
  private static int PFL_FEDOCUMENTAL_PARERE = 29;
  private static int PFL_FEDOCUMENTAL_NOTAPARENEGA = 30;
  private static int PFL_FEDOCUMENTAL_VALIDATA = 31;
  private static int PFL_FEDOCUMENTAL_RIFIUTATA = 32;
  private static int PFL_FEDOCUMENTAL_AVVISOFORNIT = 33;
  private static int PFL_FEDOCUMENTAL_MULTISERVIZI = 34;
  private static int PFL_FEDOCUMENTAL_ESISTEALLEGATO = 35;
  private static int PFL_FEDOCUMENTAL_ACCETTAZDATA = 36;
  private static int PFL_FEDOCUMENTAL_ACCETTUTENTE = 37;
  private static int PFL_FEDOCUMENTAL_RESPINTADATA = 38;
  private static int PFL_FEDOCUMENTAL_RESPINUTENTE = 39;
  private static int PFL_FEDOCUMENTAL_MOTIVARIFIUT = 40;
  private static int PFL_FEDOCUMENTAL_ETICLABEDOCU = 41;
  private static int PFL_FEDOCUMENTAL_ETICLABEPROT = 42;
  private static int PFL_FEDOCUMENTAL_CONTROLLOBEN = 43;
  private static int PFL_FEDOCUMENTAL_PROGRUO = 44;
  private static int PFL_FEDOCUMENTAL_PARERNEGNOTA = 45;
  private static int PFL_FEDOCUMENTAL_TOOLTICONTRO = 46;
  private static int PFL_FEDOCUMENTAL_IDSDI = 47;
  private static int PFL_FEDOCUMENTAL_ULTIMOSTATO = 48;
  private static int PFL_FEDOCUMENTAL_CANCELUTENTE = 49;
  private static int PFL_FEDOCUMENTAL_CANCELLADATA = 50;
  private static int PFL_FEDOCUMENTAL_ORDINAMENTO = 51;

  private static int PPQRY_FEDOCUMENTA1 = 0;


  IDPanel PAN_FEDOCUMENTAL;

  // Definition of Global Variables
  private IDVariant SEINSERITQTN = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABILITACCETT = new IDVariant(0,IDVariant.STRING);
  public IDVariant SEINVIOESITO = new IDVariant(0,IDVariant.STRING);
  public IDVariant SEACCETEAPRI = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant INTERRUTTQTN = new IDVariant(0,IDVariant.STRING);
  public IDVariant CONTRONUMERO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant SEGNALGIACEN = new IDVariant(0,IDVariant.STRING);
  private IDVariant SEMULTISELEZ = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABILACCODRUO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABILRIFODRUO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABIPARPOODRU = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABIPARNEODRU = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABDONOCOODRU = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABIASSUOODRU = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant NOTECONTACCE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRIFETBL(IMDB);
    Init_TBL_TEMPUORITMUL(IMDB);
    Init_TBL_TEMPMOTIVAZI(IMDB);
    //
    //
    Init_PQRY_FEDOCUMENTA1(IMDB);
    Init_PQRY_FILTRIFETBL1(IMDB);
    Init_PQRY_FILTRIFETBL1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRIFETBL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FILTRIFETBL, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_FILTRIFETBL, "TBL_FILTRIFETBL");
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGDAESA, "NOMEOGGDAESA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGDAESA,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGEACCE, "NOMEOGGEACCE");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGEACCE,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGERIFI, "NOMEOGGERIFI");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGERIFI,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGTIPPRO, "NOMOGGTIPPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGECANC, "NOMEOGGECANC");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMEOGGECANC,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARDA, "NOMOGGDAARDA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARDA,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARAL, "NOMOGGDAARAL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRIFETBL,IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARAL,6,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_FILTRIFETBL, 0);
  }

  private static void Init_TBL_TEMPUORITMUL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_TEMPUORITMUL, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_TEMPUORITMUL, "TBL_TEMPUORITMUL");
    IMDB.set_FldCode(IMDBDef2.TBL_TEMPUORITMUL,IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef2.TBL_TEMPUORITMUL,IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO,1,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_TEMPUORITMUL,IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL, "NOMEOGGSEMUL");
    IMDB.SetFldParams(IMDBDef2.TBL_TEMPUORITMUL,IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_TEMPUORITMUL, 0);
  }

  private static void Init_TBL_TEMPMOTIVAZI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_TEMPMOTIVAZI, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_TEMPMOTIVAZI, "TBL_TEMPMOTIVAZI");
    IMDB.set_FldCode(IMDBDef2.TBL_TEMPMOTIVAZI,IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI, "NOMEOGGEMOTI");
    IMDB.SetFldParams(IMDBDef2.TBL_TEMPMOTIVAZI,IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI,5,255,0);
    IMDB.TblAddNew(IMDBDef2.TBL_TEMPMOTIVAZI, 0);
  }

  private static void Init_PQRY_FEDOCUMENTA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FEDOCUMENTA1, 50);
    IMDB.set_TblCode(IMDBDef10.PQRY_FEDOCUMENTA1, "PQRY_FEDOCUMENTA1");
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, "FEDOCUIDDOCU");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_ORDINAMENTO, "ORDINAMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_ORDINAMENTO,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMEENTE, "FEDOCUMEENTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMEENTE,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMODDAT, "FEDOCUMODDAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMODDAT,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATDOC, "FEDOCUDATDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATDOC,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUNUMDOC, "FEDOCUNUMDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, "FEDOCURAGSOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODFIS, "FEDOCUCODFIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODFIS,5,35,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPARIVA, "FEDOCUPARIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPARIVA,5,35,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, "FEDOCUCODBEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDGDM, "FEDOCUMIDGDM");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDGDM,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, "FEDOCUTIPDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIMPOR, "FEDOCUMIMPOR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIMPOR,3,12,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCNOMFIXM, "FEDOCNOMFIXM");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCNOMFIXM,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUINFDOC, "FEDOCUINFDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUINFDOC,5,4000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATARR, "FEDOCUDATARR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATARR,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDSDI, "FEDOCUMIDSDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDSDI,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPRONUM, "FEDOCUPRONUM");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPRONUM,3,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROANN, "FEDOCUPROANN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROANN,3,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, "FEDOCUSTADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO, "FEDOCUPROGUO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO,3,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPROGENU, "FEDOCPROGENU");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPROGENU,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOPRGEDAAR, "FEDOPRGEDAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOPRGEDAAR,6,0,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUACCDAT, "FEDOCUACCDAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUACCDAT,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUACCUTE, "FEDOCUACCUTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUACCUTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURESDAT, "FEDOCURESDAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURESDAT,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURESUTE, "FEDOCURESUTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURESUTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_XML, "XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_XML,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUESIALL, "FEDOCUESIALL");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUESIALL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_CODFISPARTIV, "CODFISPARTIV");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_CODFISPARTIV,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_MULTISERVIZI, "MULTISERVIZI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_MULTISERVIZI,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMPARER, "FEDOCUMPARER");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMPARER,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN, "FEDOCUCONBEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN,2,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_GGGIACENZA1, "GGGIACENZA1");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_GGGIACENZA1,2,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMOTRIF, "FEDOCUMOTRIF");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMOTRIF,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUAPRFAT, "FEDOCUAPRFAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUAPRFAT,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO, "FEDOCPARNENO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO,5,4000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_NOTAPARENEGA, "NOTAPARENEGA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_NOTAPARENEGA,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTOOCON, "FEDOCUTOOCON");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTOOCON,5,4000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMTRATT, "FEDOCUMTRATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMTRATT,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUULTSTA, "FEDOCUULTSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUULTSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCANDAT, "FEDOCUCANDAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCANDAT,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCANUTE, "FEDOCUCANUTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCANUTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCDATSCXM, "FEDOCDATSCXM");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCDATSCXM,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCDATSCCA, "FEDOCDATSCCA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCDATSCCA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCOMPCC, "FEDOCUCOMPCC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCOMPCC,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCFATAVFO, "FEDOCFATAVFO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCFATAVFO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_RIFIUTATA, "RIFIUTATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_RIFIUTATA,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_VALIDATA, "VALIDATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FEDOCUMENTA1,IMDBDef10.PQSL_FEDOCUMENTA1_VALIDATA,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FEDOCUMENTA1, 0);
  }

  private static void Init_PQRY_FILTRIFETBL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRIFETBL1, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRIFETBL1, "PQRY_FILTRIFETBL1");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA, "NOMEOGGDAESA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, "NOMEOGGEACCE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, "NOMEOGGERIFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, "NOMEOGGECANC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO, "NOMOGGTIPPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA, "NOMOGGDAARDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL, "NOMOGGDAARAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL,6,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FILTRIFETBL1, 0);
  }

  private static void Init_PQRY_FILTRIFETBL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRIFETBL1_RS, "PQRY_FILTRIFETBL1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA, "NOMEOGGDAESA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, "NOMEOGGEACCE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, "NOMEOGGERIFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, "NOMEOGGECANC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO, "NOMOGGTIPPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA, "NOMOGGDAARDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL, "NOMOGGDAARAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRIFETBL1_RS,IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FattureElettroniche(MyWebEntryPoint w, IMDBObj imdb)
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
  public FattureElettroniche()
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
    FormIdx = MyGlb.FRM_FATTURELETTR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C3469D73-E61F-4CE6-B278-713F1D23483F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 992;
    DesignHeight = 674;
    set_Caption(new IDVariant("Fatture Elettroniche"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 992;
    Frames[1].Height = 648;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.125;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 992;
    Frames[2].Height = 81;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 992;
    Frames[2].FixedHeight = 81;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRI = new IDPanel(w, this, 2, "PAN_FILTRI");
    Frames[2].Content = PAN_FILTRI;
    PAN_FILTRI.ShowRowSelector = false;
    PAN_FILTRI.ShowToolbar = false;
    PAN_FILTRI.ShowStatusbar = false;
    PAN_FILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRI.VS = MainFrm.VisualStyleList;
    PAN_FILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 992-MyGlb.PAN_OFFS_X, 81-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9FA20D45-788B-4B45-9DA4-6DD02A77D40B");
    PAN_FILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 644, 96, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRI.InitStatus = 1;
    PAN_FILTRI_Init();
    PAN_FILTRI_InitFields();
    PAN_FILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 992;
    Frames[3].Height = 567;
    Frames[3].Caption = "Fatture Elettroniche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 567;
    PAN_FEDOCUMENTAL = new IDPanel(w, this, 3, "PAN_FEDOCUMENTAL");
    Frames[3].Content = PAN_FEDOCUMENTAL;
    PAN_FEDOCUMENTAL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FEDOCUMENTAL.VS = MainFrm.VisualStyleList;
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 992-MyGlb.PAN_OFFS_X, 567-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "03CDB7BB-5826-4866-8769-858DE6545947");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 0, 2136, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FEDOCUMENTAL.InitStatus = 2;
    PAN_FEDOCUMENTAL_Init();
    PAN_FEDOCUMENTAL_InitFields();
    PAN_FEDOCUMENTAL_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SCARICA+BaseCmdLinIdx)
      {
        Scarica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx)
      {
        AccettaFattura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx)
      {
        Accettaeapri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx)
      {
        RifiutaFattura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOCOMANDO+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_NUOVOCOMMSE3+BaseCmdSetIdx, "M" + (MyGlb.CMD_NUOVOCOMANDO+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MODIASSEUNIT+BaseCmdLinIdx)
      {
        ModificaassegnaUnità();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI53+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI14+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI53+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELAFATTU+BaseCmdLinIdx)
      {
        Cancellalafattura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RIPRSTATFATT+BaseCmdLinIdx)
      {
        RipristinaStatoFattura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ATTCFAEDISCF+BaseCmdLinIdx)
      {
        AttivaCFAedisattivaCFWEB();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx)
      {
        Collassailpannellofiltri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VISUALERRORI+BaseCmdLinIdx)
      {
        VisualizzaErrori();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGISTATSELE+BaseCmdLinIdx)
      {
        AggiornaStatoSelezionati();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RECUPROTGENE+BaseCmdLinIdx)
      {
        RecuperaProtocolloGenerale();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONFIGUTENZE+BaseCmdLinIdx)
      {
        ConfigurazioneUtenze();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMUNICATPCC+BaseCmdLinIdx)
      {
        ComunicatoPCC();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PAREREPOSITI+BaseCmdLinIdx)
      {
        SegnalaParerePositivo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PARERENEGATI+BaseCmdLinIdx)
      {
        SegnalaParereNegativo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DOCUNONDICOM+BaseCmdLinIdx)
      {
        DichiareIlDocumentoNonDiCompetenza();
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
      if (IMDB.TblModified(IMDBDef2.TBL_FILTRIFETBL, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FATTURELETTR_FILTRIFETBL1();
      }
      PAN_FEDOCUMENTAL.UpdatePanel(MainFrm);
      PAN_FILTRI.UpdatePanel(MainFrm);
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
    return (obj instanceof FattureElettroniche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FattureElettroniche.class.getName() : (Glb.ClassWithPackage(FattureElettroniche.class) ? FattureElettroniche.class.getName().substring(FattureElettroniche.class.getPackage().getName().length() + 1) : FattureElettroniche.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // FE DOCUMENTALE On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_FEDOCUMENTAL_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FE DOCUMENTALE On Change Row Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(MainFrm.FECFAATTIVA,(new IDVariant("N"))).compareTo((new IDVariant("S")), true)!=0)
      {
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("IN_LAVORAZIONE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_SCARTATO")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DA_VERIFICARE_SU_SDI")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DECORRENZA_TERMINI")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, ABILACCODRUO.booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIASSEUNIT+BaseCmdLinIdx, ABIASSUOODRU.booleanValue());
          if (IDL.NullValue(ABILITACCETT,(new IDVariant("S"))).equals((new IDVariant("S")), true))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          // if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_XML, 0).compareTo((new IDVariant(1)), true)!=0)
          // {
            // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          // }
          // else
          // {
            // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          // }
          if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DECORRENZA_TERMINI")), true))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            if ((IDL.NullValue(MainFrm.CONSENRIFIUT,(new IDVariant("SI"))).compareTo((new IDVariant("NO")), true)!=0 || MainFrm.CONSENRIFIUT.equals((new IDVariant("")), true)) && ABILRIFODRUO.booleanValue())
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            }
          }
        }
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTATA")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("ACCETTATA")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_DA_INVIARE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_INVIATO")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("CANCELLATA")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIASSEUNIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("CANCELLATA")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELAFATTU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIPRSTATFATT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELAFATTU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIPRSTATFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      if (IDL.NullValue(MainFrm.SOSPFATTURE,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "FEDOCUMENTALEOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // FE DOCUMENTALE On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FEDOCUMENTAL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FEDOCUMENTAL);
      // 
      // FE DOCUMENTALE On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMTRATT, 0))))
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_TRATTAMENTIM,IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTOOCON, 0).stringValue()); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_XML, 0).equals((new IDVariant(0)), true))
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_XML,(new IDVariant("Trascorsi 15 giorni dalla data di arrivo")).stringValue()); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO, 0))))
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_PARERE,IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO, 0).stringValue()); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_XML, 0).equals((new IDVariant(-1)), true))
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_XML,(new IDVariant("Trascorsi più di 15 giorni dalla data di arrivo")).stringValue()); 
      }
      if (IDL.Sign(IDL.Sub(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_GGGIACENZA1, 0), IDL.ToInteger(SEGNALGIACEN))).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_FEDOCUMENTAL.set_VisualStyle(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_GGGIACENZA1,new IDVariant(MyGlb.VIS_NORFIETESROS).intValue()); 
      }
      else
      {
        PAN_FEDOCUMENTAL.set_VisualStyle(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_GGGIACENZA1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("ACCETTATA")), true))
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_APRIFATTURA,(new IDVariant("Apri fattura accettata")).stringValue()); 
      }
      else
      {
        PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_APRIFATTURA,(new IDVariant("")).stringValue()); 
      }
      PAN_FEDOCUMENTAL.set_ToolTip(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_NUMERODOCUME,(new IDVariant(PAN_FEDOCUMENTAL.FieldText(PFL_FEDOCUMENTAL_NUMERODOCUME))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "FEDOCUMENTALEOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // FE DOCUMENTALE On Change Selection
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected - Input
  // Final - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FEDOCUMENTAL_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
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
      // FE DOCUMENTALE On Change Selection Body
      // Corpo Procedura
      // 
      // if (Selected.booleanValue() && Final.booleanValue())
      // {
        // PAN_FEDOCUMENTAL.set_ActualPosition(true, (new IDVariant(PAN_FEDOCUMENTAL.SelectedRow(true))).intValue());
      // }
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_FEDOCUMENTAL.ShowMultipleSel())
      {
        C4 = PAN_FEDOCUMENTAL.MasterRS();
        if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
        if (!C4.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
        while (!PAN_FEDOCUMENTAL.RSEOF())
        {
          if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_FEDOCUMENTAL.GotoNext();
        }
        if (CurPos>0) C4.absolute(CurPos);
        if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
        {
          SEMULTISELEZ = (new IDVariant(1));
          return;
        }
        else
        {
          SEMULTISELEZ = (new IDVariant(0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "FEDOCUMENTALEOnChangeSelection", _e);
    }
  }

  // **********************************************************************
  // Filtri After Update
  // Evento notificato dopo il salvataggio sul database
  // di una riga modificata.
  // **********************************************************************
  private void PAN_FILTRI_AfterUpdate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri After Update Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) || IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) || IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(0)).booleanValue());
      }
      else
      {
        // PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
        // PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
        IDVariant v_THISABILITAM = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
        SQL.append("and   (A.STRINGA = 'ABILITA_MULTISELEZIONE') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_THISABILITAM = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_THISABILITAM,(new IDVariant("N"))).equals((new IDVariant("S")), true))
        {
          PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
          PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
          PAN_FEDOCUMENTAL.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
        }
        else
        {
          PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
          PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(0)).booleanValue());
          PAN_FEDOCUMENTAL.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
        }
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "FiltriAfterUpdate", _e);
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
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.STRINGA = 'FE_CFA_ATTIVA') ");
      SQL.append("and   (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        MainFrm.FECFAATTIVA = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_PROTINTERNO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.STRINGA = 'FE_PROTOCOLLO_INTERNO') ");
      SQL.append("and   (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROTINTERNO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_SNOT = new IDVariant(0,IDVariant.STRING);
      v_SNOT = (new IDVariant("NOTE_CONTROLLO_ACCETTAZIONE"));
      IDVariant v_VVALORENOTE = null;
      v_VVALORENOTE = (new IDVariant("N"));
      // 
      // ---------------------
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'N') as NULVALREGVAN ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(v_SNOT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VVALORENOTE = QV.Get("NULVALREGVAN", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_VVALORENOTE.equals((new IDVariant("S")), true) && ((IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true) && (!(IDL.Like(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), (new IDVariant("AMM%")))) && !(IDL.Like(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), (new IDVariant("RAG%")))) && !(IDL.Like(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), (new IDVariant("OPECONT%")))))) || IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0))
      {
        NOTECONTACCE = new IDVariant(v_VVALORENOTE);
      }
      else
      {
        NOTECONTACCE = (new IDVariant("N"));
      }
      // 
      // -------------
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        IDVariant v_VVALORE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CHIAVE = new IDVariant(0,IDVariant.STRING);
        v_CHIAVE = (new IDVariant("PRODUCTS/FATTURA_ELETTRONICA/SMISTAMENTO"));
        IDVariant v_STRINGA = new IDVariant(0,IDVariant.STRING);
        v_STRINGA = (new IDVariant("COMPETENZA_FUNZIONI_SMISTAMENTO"));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  INDE_FE_PASSIVA.TROVA_REGISTRO(" + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_STRINGA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as INFEPATRRECS ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVALORE = QV.Get("INFEPATRRECS", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VVALORE.equals((new IDVariant("S")), true))
        {
          AbilitazioniInBaseRuoloOD();
        }
      }
      else
      {
        ABILACCODRUO = (new IDVariant(-1));
        ABILRIFODRUO = (new IDVariant(-1));
        ABIPARPOODRU = (new IDVariant(-1));
        ABIPARNEODRU = (new IDVariant(-1));
        ABDONOCOODRU = (new IDVariant(-1));
        ABIASSUOODRU = (new IDVariant(-1));
      }
      if (!(ABILACCODRUO.booleanValue()))
      {
        ABILITACCETT = (new IDVariant("N"));
      }
      // 
      // --
      // 
      if (IDL.NullValue(MainFrm.FECFAATTIVA,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SCARICA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELAFATTU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIPRSTATFATT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIASSEUNIT+BaseCmdLinIdx, ABIASSUOODRU.booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI53+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP5+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP7+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP10+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATTCFAEDISCF+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      IDVariant v_THISABILITAM = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      SQL.append("and   (A.STRINGA = 'ABILITA_MULTISELEZIONE') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_THISABILITAM = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_THISABILITAM,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
        PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
        PAN_FEDOCUMENTAL.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_FEDOCUMENTAL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
        PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(0)).booleanValue());
        PAN_FEDOCUMENTAL.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      }
      LOAD_FILTFETBLUPD(v_PROTINTERNO);
      SEINVIOESITO = (new IDVariant("SI"));
      PAN_FEDOCUMENTAL.SetFieldQBEEnabled(PFL_FEDOCUMENTAL_XML, (new IDVariant(0)).booleanValue()); 
      PAN_FEDOCUMENTAL.SetFieldQBEEnabled(PFL_FEDOCUMENTAL_ESISTEALLEGATO, (new IDVariant(0)).booleanValue()); 
      IDVariant v_VPARERENEG = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'N') as NULVALREGVAN ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA/SMISTAMENTO') ");
      SQL.append("and   (A.STRINGA = 'Consenti_parere_neg_decentrato') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VPARERENEG = QV.Get("NULVALREGVAN", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_VPAREREPOS = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'N') as NULVALREGVAN ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA/SMISTAMENTO') ");
      SQL.append("and   (A.STRINGA = 'Consenti_parere_pos_decentrato') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VPAREREPOS = QV.Get("NULVALREGVAN", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_VPARERENEG.compareTo((new IDVariant("S")), true)!=0 && v_VPAREREPOS.compareTo((new IDVariant("S")), true)!=0)
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      SQL.append("and   (A.STRINGA = 'SEGNALA_GIACENZA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        SEGNALGIACEN = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      SEMULTISELEZ = (new IDVariant(0));
      PAN_FEDOCUMENTAL.set_Header(Glb.OBJ_FIELD,PFL_FEDOCUMENTAL_APRIFATTURA, (new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      SQL.append("and   (A.STRINGA = 'ABILITA_ACCETTA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        ABILITACCETT = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(ABILITACCETT,(new IDVariant("S"))).equals((new IDVariant("S")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETIRIDE, IMDBDef7.FLD_PARAMETIRIDE_DOCUMENIRIDE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((IDL.NullValue(MainFrm.CONSENRIFIUT,(new IDVariant("SI"))).equals((new IDVariant("SI")), true) || MainFrm.CONSENRIFIUT.equals((new IDVariant("")), true)) && ABILRIFODRUO.booleanValue())
      {
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IDL.NullValue(MainFrm.LABELACCETTA,(new IDVariant("ACCETTA"))).equals((new IDVariant("ACCETTA")), true) || MainFrm.LABELACCETTA.equals((new IDVariant("")), true))
      {
        PAN_FILTRI.set_Header(Glb.OBJ_FIELD,PFL_FILTRI_ACCETTATE, (new IDVariant("Accettate")).stringValue());
        MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant("Accetta le fatture selezionate")).stringValue());
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant("Le fatture selezionate saranno accettate")).stringValue());
        MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant("Accetta e apri la fattura elettronica")).stringValue());
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant("Accetta e apri la fattura elettronica")).stringValue());
        PAN_FEDOCUMENTAL.set_Header(Glb.OBJ_GROUP,GRP_FEDOCUMENTAL_ACCETTATA,(new IDVariant("Accettata")).stringValue()); 
      }
      else
      {
        PAN_FILTRI.set_Header(Glb.OBJ_FIELD,PFL_FILTRI_ACCETTATE, (new IDVariant("Registrate")).stringValue());
        MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant("Registra la fattura elettronica")).stringValue());
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant("Registra la fattura elettronica")).stringValue());
        MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant("Registra e apri la fattura elettronica")).stringValue());
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant("Registra e apri la fattura elettronica")).stringValue());
        PAN_FEDOCUMENTAL.set_Header(Glb.OBJ_GROUP,GRP_FEDOCUMENTAL_ACCETTATA,(new IDVariant("Registrata")).stringValue()); 
      }
      if (IDL.NullValue(MainFrm.FECFAATTIVA,(new IDVariant("N"))).compareTo((new IDVariant("S")), true)!=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SCARICA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCEFATTFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ACCETTAEAPRI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIASSEUNIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI53+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP5+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP7+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SEP10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELAFATTU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIPRSTATFATT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATTCFAEDISCF+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (IDL.NullValue(MainFrm.FORZASCADENZ,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // 
        // Rendo il comando visibile solo se è già visibile il
        // menu di Integrazione PCC
        // 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_COMUNICATPCC+BaseCmdLinIdx, MainFrm.CmdObj.CmdSetVisible(MyGlb.CMDS_CAINTPCC));
      }
      else
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_COMUNICATPCC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IDL.NullValue(MainFrm.SOSPFATTURE,(new IDVariant("N"))).compareTo((new IDVariant("S")), true)!=0)
      {
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FEDOCUMENTAL.SetFlags (Glb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RIFFATFATFAT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Load", _e);
    }
  }

  // **********************************************************************
  // Filtri FE TBL: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void LOAD_FILTFETBLUPD(IDVariant v_PROTINTERNO) throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRIFETBL, 0);
    while (!IMDB.Eof(IMDBDef2.TBL_FILTRIFETBL, 0))
    {
      IMDB.set_Value(IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGDAESA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGECANC, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGEACCE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGTIPPRO, 0, ((v_PROTINTERNO.equals((new IDVariant("SCARICO"))))?(new IDVariant("I")):(new IDVariant("G"))));
      IMDB.set_Value(IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGERIFI, 0, (new IDVariant("NO")));
      IMDB.TblMoveNext(IMDBDef2.TBL_FILTRIFETBL, 0);
    }
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRIFETBL, 0);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_MODASSUNIMUL)), true))
      {
        AssegnaUOMULTI();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_MOTIVARIFIUT)), true))
      {
        Rifiuta((new IDVariant("SI")), (new IDVariant("RIFIUTATA")), IMDB.Value(IMDBDef2.TBL_TEMPMOTIVAZI, IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI, 0));
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "EndModal", _e);
    }
  }

  // **********************************************************************
  // FE DOCUMENTALE On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number - Input
  // Error Message - Input
  // Native Error Number - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_FEDOCUMENTAL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FEDOCUMENTAL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // FE DOCUMENTALE On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "FEDOCUMENTALEOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Aggiorna Stati Multisel
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaStatiMultisel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Stati Multisel Body
      // Corpo Procedura
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_TOTMOD = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_FEDOCUMENTAL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          IDVariant J = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.FEAGGIORNASTATIDAGDM((new IDVariant("N")), C2.Get("FEDOCUIDDOCU"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), J);
          v_TOTMOD = IDL.Add(v_TOTMOD, J);
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0, IDL.Add((new IDVariant("Totale documenti modificati ")), IDL.ToString(v_TOTMOD)));
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      MainFrm.Show(MyGlb.FRM_SEGNALAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AggiornaStatiMultisel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Stato Selezionati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaStatoSelezionati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Stato Selezionati Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_FEDOCUMENTAL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          if (v_COUNT.equals((new IDVariant(1)), true))
          {
            v_REC = new IDVariant(I);
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      IDVariant v_TOTMOD = new IDVariant(0,IDVariant.INTEGER);
      if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
      {
        AggiornaStatiMultisel();
      }
      else
      {
        if (v_COUNT.equals((new IDVariant(1)), true))
        {
          PAN_FEDOCUMENTAL.set_ActualPosition(true, new IDVariant(v_REC).intValue());
        }
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("IN_LAVORAZIONE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_DA_INVIARE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_INVIATO")), true))
        {
          IDVariant J = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.FEAGGIORNASTATIDAGDM((new IDVariant("N")), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), J);
          v_TOTMOD = IDL.Add(v_TOTMOD, J);
          IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0, IDL.Add((new IDVariant("Totale documenti modificati ")), IDL.ToString(v_TOTMOD)));
          IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          MainFrm.Show(MyGlb.FRM_SEGNALAZIONI, (new IDVariant(2)).intValue(), this); 
        }
        else
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("La fattura è in stato ")), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0)), (new IDVariant(" per cui non è necessario effettuare l'allineamento con il GDM")))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AggiornaStatoSelezionati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora fatture con trattamenti IVA misti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ElaborafatturecontrattamentiIVAmisti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora fatture con trattamenti IVA misti Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.FATCONTROLLATRATTAMENTO();
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione avvenuta con successo"))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ElaborafatturecontrattamentiIVAmisti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nota Parere Negativo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int NotaParereNegativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nota Parere Negativo Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO, 0).compareTo((new IDVariant()), true)!=0)
      {
        MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
        ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCPARNENO, 0), (new IDVariant("Parere negativo")), (new IDVariant(0)), (new IDVariant(2000)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "NotaParereNegativo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Attiva CFA e disattiva CFWEB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AttivaCFAedisattivaCFWEB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attiva CFA e disattiva CFWEB Body
      // Corpo Procedura
      // 
      IDVariant v_VTRASCOCOMPL = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  TRASCO_SITUAZIONE A ");
      SQL.append("where (A.ESITO = 'OK') ");
      SQL.append("and   (A.STATO_AVANZAMENTO = 18) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VTRASCOCOMPL = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.NullValue(v_VTRASCOCOMPL,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant B = new IDVariant(0,IDVariant.INTEGER);
        B = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("SEI SICURO DI ATTIVARE LA GESTIONE DELLE FATTURE ELETTRONICHE DA CFA? TALE GESTIONE VERRA' DISATTIVATA IN CFWEB")), (new IDVariant("Prosegui;Annulla")))));
        if (B.equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.PASSAGGIO_CFWEB_CFA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).equals((new IDVariant("")), true))
          {
            MainFrm.set_AlertMessage((new IDVariant("GESTIONE FATTURE ELETTRONICHE ATTIVATA!"))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
        }
        else if (B.equals((new IDVariant(2)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Operazione Annullata"))); 
          return 0;
        }
        else
        {
          return 0;
        }
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("ATTENZIONE: LE TRASCO NON SONO STATE COMPLETATE, NON E' POSSIBILE INIZIARE A GESTIRE LE FATTURE ELETTRONICHE IN CFA"))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AttivaCFAedisattivaCFWEB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dichiare Il Documento Non Di Competenza
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DichiareIlDocumentoNonDiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dichiare Il Documento Non Di Competenza Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("update FE_DOCUMENTALE set ");
      SQL.append("  PROGR_UO = to_number(NULL), ");
      SQL.append("  PARERE = NULL ");
      SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      MainFrm.Cf4armDBObject.INDEFEPASSIVAFENOTIFICACAMBIOUO(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant()), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_VDESCRUO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) || ',' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) as CDUGCVSPUTCD ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDESCRUO = QV.Get("CDUGCVSPUTCD", IDVariant.STRING) ;
        }
        QV.Close();
        MainFrm.set_AlertMessage((new IDVariant("E' stato segnalato all'ufficio centrale che il documento non è di competenza"))); 
        MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant("CF")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), (new IDVariant()), IDL.Add(IDL.Add((new IDVariant("L'unità ")), v_VDESCRUO), (new IDVariant(" ha segnalato che non è di propria competenza la fattura proveniente da "))));
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "DichiareIlDocumentoNonDiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Segnala Parere Negativo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SegnalaParereNegativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Segnala Parere Negativo Body
      // Corpo Procedura
      // 
      IDVariant v_VDESCRUO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("update FE_DOCUMENTALE set ");
      SQL.append("  PARERE = 'NEGATIVO' ");
      SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) || ',' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) as CDUGCVSPUTCD ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDESCRUO = QV.Get("CDUGCVSPUTCD", IDVariant.STRING) ;
      }
      QV.Close();
      MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant("CF")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), (new IDVariant()), IDL.Add(IDL.Add((new IDVariant("L'unità ")), v_VDESCRUO), (new IDVariant(" segnala che NON si può accettare la fattura proveniente da "))));
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "SegnalaParereNegativo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Segnala Parere Positivo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SegnalaParerePositivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Segnala Parere Positivo Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("update FE_DOCUMENTALE set ");
      SQL.append("  PARERE = 'POSITIVO' ");
      SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IDVariant v_VDESCRUO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) || ',' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) as CDUGCVSPUTCD ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDESCRUO = QV.Get("CDUGCVSPUTCD", IDVariant.STRING) ;
      }
      QV.Close();
      MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant("CF")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), (new IDVariant()), IDL.Add(IDL.Add((new IDVariant("L'unità ")), v_VDESCRUO), (new IDVariant(" segnala che si può accettare la fattura proveniente da "))));
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "SegnalaParerePositivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattura Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROANN, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPRONUM, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROANN, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPRONUM, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ApriFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rifiuta Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RifiutaFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rifiuta Fattura Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_MOTIVARIFIUT, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "RifiutaFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accetta Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AccettaFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Accetta Fattura Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_RECNOTE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_RECNONNOTE = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_FEDOCUMENTAL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          if (v_COUNT.equals((new IDVariant(1)), true))
          {
            v_REC = new IDVariant(I);
          }
          if (NOTECONTACCE.equals((new IDVariant("S")), true))
          {
            if (IDL.Like(IDL.Upper(C2.Get("FEDOCUTIPDOC")), (new IDVariant("NOTA%"))))
            {
              v_RECNOTE = IDL.Add(v_RECNOTE, (new IDVariant(1)));
            }
            else
            {
              v_RECNONNOTE = IDL.Add(v_RECNONNOTE, (new IDVariant(1)));
            }
            if (v_RECNOTE.compareTo((new IDVariant(1)), true)>0)
            {
              IDVariant v_ERRBLOCC = new IDVariant(0,IDVariant.STRING);
              v_ERRBLOCC = (new IDVariant("Non è possibile Accettare massivamente più Note di Credito/Debito"));
              MainFrm.set_AlertMessage(v_ERRBLOCC); 
              return 0;
            }
            if (v_RECNOTE.compareTo((new IDVariant(0)), true)>0 && v_RECNONNOTE.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_ERRBLOCC = new IDVariant(0,IDVariant.STRING);
              v_ERRBLOCC = (new IDVariant("Non è possibile Accettare contemporaneamente Fatture e Note di Credito/Debito"));
              MainFrm.set_AlertMessage(v_ERRBLOCC); 
              return 0;
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      SEACCETEAPRI = (new IDVariant(0));
      if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
      {
        AccettazioneMultipla();
      }
      else
      {
        if (v_COUNT.equals((new IDVariant(1)), true))
        {
          // PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(0)).booleanValue());
          PAN_FEDOCUMENTAL.set_ActualPosition(true, new IDVariant(v_REC).intValue());
          // PAN_FEDOCUMENTAL.set_SelectedRow(true, IDL.Sub(v_REC, (new IDVariant(1))).intValue());
        }
        else if (v_COUNT.equals((new IDVariant(0)), true))
        {
          if (NOTECONTACCE.equals((new IDVariant("S")), true) && IDL.Like(IDL.Upper(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0)), (new IDVariant("NOTA%"))))
          {
            v_RECNOTE = IDL.Add(v_RECNOTE, (new IDVariant(1)));
          }
        }
        IDVariant v_SEPROSEGUACC = new IDVariant(0,IDVariant.STRING);
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.INDEFEPASSIVAFECONTROLLIACCETTAZIONE(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_MESSAGGIO, v_SEPROSEGUACC, SEINVIOESITO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0));
        // 
        // procedura di accettazione
        // 
        if (v_SEPROSEGUACC.equals((new IDVariant("SI")), true))
        {
          Accetta();
        }
        else
        {
          if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
          }
        }
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AccettaFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CONTROLLI RIFIUTO NON USATO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // SEINTERROMPO - Optional - Input/Output
  // **********************************************************************
  public int CONTROLLIRIFIUTONONUSATO (IDVariant SEINTERROMPO)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CONTROLLI RIFIUTO NON USATO Body
      // Corpo Procedura
      // 
      SEINTERROMPO.set((new IDVariant("SI")));
      IDVariant v_ESITO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_STATO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_INVIO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_COMPLETO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VERIFICA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.INDEFEPASSIVASTATO_FATTURA_PASSIVA(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), v_ESITO, v_STATO, v_INVIO, v_COMPLETO, v_VERIFICA);
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("IL_LAVORAZIONE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_SCARTATO")), true))
      {
        if (v_ESITO.equals((new IDVariant("NEGATIVO")), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("La fattura non può essere rifiutata: la richiesta a GDMFE dello stato ha dato esito NEGATIVO!"))); 
          return 0;
        }
        if (v_VERIFICA.equals((new IDVariant("S")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.INTEGER);
          S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("Verificare sullo SDI l' effettivo stato della fattura. La fattura viene automaticamente settata in stato DA_VERIFICARE_SU_SDI")), (new IDVariant("Prosegui;Annulla")))));
          if (S.equals((new IDVariant(2)), true))
          {
            return 0;
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("update FE_DOCUMENTALE set ");
            SQL.append("  STATO_DOCUMENTO = 'DA_VERIFICARE_SU_SDI' ");
            SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
        if (v_STATO.equals((new IDVariant("EC01")), true))
        {
          if (v_INVIO.equals((new IDVariant("INIVIATA")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta ACCETTATA con notifica di accettazione inviata allo SDI , non è possibile rifiutarla, verrà automaticamente messa in stato ACCETTATA")), (new IDVariant("Prosegui e Accetta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              SEINVIOESITO = (new IDVariant("SI"));
              Accetta();
            }
          }
          if (v_INVIO.equals((new IDVariant("DA INIVIARE")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta ACCETTATA con notifica di accettazione da inviare allo SDI, non è possibile rifiutarla, verrà automaticamente messa in stato ACCETTATA")), (new IDVariant("Prosegui e Accetta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              SEINVIOESITO = (new IDVariant("SI"));
              Accetta();
            }
          }
          if (v_INVIO.equals((new IDVariant("DA_INVIARE")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta in stato di RIFIUTO DA INVIARE (notifica di rifiuto da inviare), non è possibile accettarla, verrà automaticamente messa in stato di RIFIUTATO DA INVIARE ")), (new IDVariant("Prosegui e Rifiuta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              Rifiuta((new IDVariant("NO")), (new IDVariant("RIFIUTO_DA_INVIARE")), (new IDVariant("")));
            }
          }
        }
        if (v_STATO.equals((new IDVariant("DA_SCARICARE")), true) || v_STATO.equals((new IDVariant("IN_LAVORAZIONE")), true) || v_STATO.equals((new IDVariant("EN00")), true) || v_STATO.equals((new IDVariant("EN01")), true))
        {
          SEINVIOESITO = (new IDVariant("SI"));
          Accetta();
        }
        else if (v_STATO.equals((new IDVariant("EC01")), true) || v_STATO.equals((new IDVariant("DT")), true))
        {
          SEINVIOESITO = (new IDVariant("NO"));
          Accetta();
        }
        else if (v_STATO.equals((new IDVariant("DT")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.INTEGER);
          S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta ACCETTATA per decorrenza dei termini, non è possibile rifiutarla, verrà automaticamente messa in stato ACCETTATA")), (new IDVariant("Prosegui e Accetta;Annulla")))));
          if (S.equals((new IDVariant(2)), true))
          {
            return 0;
          }
          else
          {
            SEINVIOESITO = (new IDVariant("SI"));
            Accetta();
          }
        }
        else
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("la fattura non può essere accettata, veri+ficare dalla voce di menu interscambio SDI la fattura che risulta: ")), (new IDVariant("/n"))), (new IDVariant("Stato = "))), v_STATO), (new IDVariant("/n"))), (new IDVariant("Invio ="))), v_INVIO), (new IDVariant("/n"))), (new IDVariant("Completo ="))), v_COMPLETO), (new IDVariant("/n"))), (new IDVariant("Verifica = "))), v_VERIFICA)); 
        }
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DA_VERIFICARE_SU_SDI")), true))
      {
        Rifiuta((new IDVariant("NO")), (new IDVariant("RIFIUTA")), (new IDVariant("")));
      }
      SEINTERROMPO.set((new IDVariant("NO")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "CONTROLLIRIFIUTONONUSATO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CONTROLLI ACCETTAZIONE NON USATO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // SEINTERROMPO - Optional - Input/Output
  // **********************************************************************
  public int CONTROLLIACCETTAZIONENONUSATO (IDVariant SEINTERROMPO)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CONTROLLI ACCETTAZIONE NON USATO Body
      // Corpo Procedura
      // 
      SEINTERROMPO.set((new IDVariant("SI")));
      IDVariant v_ESITO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_STATO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_INVIO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_COMPLETO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VERIFICA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.INDEFEPASSIVASTATO_FATTURA_PASSIVA(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), v_ESITO, v_STATO, v_INVIO, v_COMPLETO, v_VERIFICA);
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("IL_LAVORAZIONE")), true) || IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("RIFIUTO_SCARTATO")), true))
      {
        if (v_ESITO.equals((new IDVariant("NEGATIVO")), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("La fattura non può essere accettata: la richiesta a GDMFE dello stato ha dato esito NEGATIVO!"))); 
          return 0;
        }
        if (v_VERIFICA.equals((new IDVariant("S")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.INTEGER);
          S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("Verificare sullo SDI l' effettivo stato della fattura. La fattura viene automaticamente settata in stato DA_VERIFICARE_SU_SDI")), (new IDVariant("Prosegui;Annulla")))));
          if (S.equals((new IDVariant(2)), true))
          {
            return 0;
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("update FE_DOCUMENTALE set ");
            SQL.append("  STATO_DOCUMENTO = 'DA_VERIFICARE_SU_SDI' ");
            SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            return 0;
          }
        }
        if (v_STATO.equals((new IDVariant("EC02")), true))
        {
          if (v_INVIO.equals((new IDVariant("INIVIATA")), true) && v_COMPLETO.equals((new IDVariant("S")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta RIFIUTATA con notifica di rifiuto inviata allo SDI da più di 15 gg, non è possibile accettarla, verrà automaticamente messa in stato RIFIUTATA")), (new IDVariant("Prosegui e Rifiuta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              Rifiuta((new IDVariant("SI")), (new IDVariant("RIFIUTATA")), (new IDVariant("")));
              return 0;
            }
          }
          if (v_INVIO.equals((new IDVariant("INIVIATA")), true) && v_COMPLETO.equals((new IDVariant("N")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta in stato di RIFIUTO INVIATO (notifica di rifiuto già inviata allo SDI in attesa di esito), non è possibile accettarla, verrà automaticamente messa in stato di RIFIUTO INVIATO")), (new IDVariant("Prosegui e Rifiuta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              Rifiuta((new IDVariant("SI")), (new IDVariant("RIFIUTO_INVIATO")), (new IDVariant("")));
              return 0;
            }
          }
          if (v_INVIO.equals((new IDVariant("DA_INVIARE")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La fattura risulta in stato di RIFIUTO DA INVIARE (notifica di rifiuto da inviare), non è possibile accettarla, verrà automaticamente messa in stato di RIFIUTATO DA INVIARE ")), (new IDVariant("Prosegui e Rifiuta;Annulla")))));
            if (S.equals((new IDVariant(2)), true))
            {
              return 0;
            }
            else
            {
              Rifiuta((new IDVariant("SI")), (new IDVariant("RIFIUTO_DA_INVIARE")), (new IDVariant("")));
              return 0;
            }
          }
        }
        if (v_STATO.equals((new IDVariant("DA_SCARICARE")), true) || v_STATO.equals((new IDVariant("IN_LAVORAZIONE")), true) || v_STATO.equals((new IDVariant("EN00")), true) || v_STATO.equals((new IDVariant("EN01")), true))
        {
          SEINVIOESITO = (new IDVariant("SI"));
          Accetta();
        }
        else if (v_STATO.equals((new IDVariant("EC01")), true) || v_STATO.equals((new IDVariant("DT")), true))
        {
          SEINVIOESITO = (new IDVariant("NO"));
          Accetta();
        }
        else
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("la fattura non può essere accettata, verificare dalla voce di menu interscambio SDI la fattura che risulta: ")), (new IDVariant("/n"))), (new IDVariant("Stato = "))), v_STATO), (new IDVariant("/n"))), (new IDVariant("Invio ="))), v_INVIO), (new IDVariant("/n"))), (new IDVariant("Completo ="))), v_COMPLETO), (new IDVariant("/n"))), (new IDVariant("Verifica = "))), v_VERIFICA)); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DA_VERIFICARE_SU_SDI")), true))
      {
      }
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0).equals((new IDVariant("DECORRENZA_TERMNINI")), true))
      {
        SEINVIOESITO = (new IDVariant("NO"));
        Accetta();
      }
      SEINTERROMPO.set((new IDVariant("NO")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "CONTROLLIACCETTAZIONENONUSATO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Errori
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaErrori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Errori Body
      // Corpo Procedura
      // 
      IDVariant v_SERVER = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.STRINGA = 'SERVER_FE') ");
      SQL.append("and   (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SERVER = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_ENTE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.STRINGA = 'Area GDM') ");
      SQL.append("and   (A.CHIAVE = 'PRODUCTS/FATTURA_ELETTRONICA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ENTE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_URL = null;
      v_URL = IDL.Add(IDL.Add(v_SERVER, (new IDVariant("jgdm/ReportErrori?ente="))), v_ENTE);
      MainFrm.set_RedirectTo(v_URL);
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "VisualizzaErrori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rifiuto Multiplo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // P MOTIVAZIONE - Optional - Input
  // **********************************************************************
  public int RifiutoMultiplo (IDVariant PMOTIVAZIONE)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Rifiuto Multiplo Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTATOT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTAOK = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTAERR = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_FEDOCUMENTAL.ShowMultipleSel())
      {
        C3 = PAN_FEDOCUMENTAL.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
        while (!PAN_FEDOCUMENTAL.RSEOF())
        {
          if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
          {
            if (C3.Get("XML").equals((new IDVariant(1)), true))
            {
              MainFrm.Cf4armDBObject.RifiutaFEMUTLI(C3.Get("FEDOCUIDDOCU"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), PMOTIVAZIONE, v_SEERRORE);
              v_CONTAERR = IDL.Add(v_CONTAERR, v_SEERRORE);
              v_CONTATOT = IDL.Add(v_CONTATOT, (new IDVariant(1)));
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_FEDOCUMENTAL.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        v_CONTAOK = IDL.Sub(v_CONTATOT, v_CONTAERR);
      }
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0, IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_CONTAOK), (new IDVariant(" FATTURE ELABORATE CON SUCCESSO, "))), IDL.ToString(v_CONTAERR)), (new IDVariant(" FATTURE NON ELABORATE"))));
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      MainFrm.Show(MyGlb.FRM_SEGNALAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "RifiutoMultiplo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Assegna UO MULTI
  // Procedure per Assegnasione per Multiselezione
  // 07/04/2017 SB: (#21469) Modifica per gestione  Parametro
  // Globalmente
  // **********************************************************************
  public int AssegnaUOMULTI ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Assegna UO MULTI Body
      // Corpo Procedura
      // 
      // 
      // paramento che consente accettazione da parte del decentrato
      // 
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      if (PAN_FEDOCUMENTAL.ShowMultipleSel())
      {
        C3 = PAN_FEDOCUMENTAL.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
        while (!PAN_FEDOCUMENTAL.RSEOF())
        {
          if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
          {
            SQL = new StringBuffer();
            SQL.append("update FE_DOCUMENTALE set ");
            SQL.append("  PROGR_UO = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
            SQL.append("  MULTISERVIZI = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGSEMUL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PARERE = NULL ");
            SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(C3.Get("FEDOCUIDDOCU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            MainFrm.Cf4armDBObject.INDEFEPASSIVAFENOTIFICACAMBIOUO(C3.Get("FEDOCUIDDOCU"), IDL.ToString(IMDB.Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, 0)), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
            // 
            // Solo se il decentrato può accettare ha senso la notifica
            // dell'assegnazione, altrimenti gli arriverà quando la
            // fattura sarà accettata
            // 
            if (MainFrm.FEACCETTADOD.equals((new IDVariant("S")), true))
            {
              MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(C3.Get("FEDOCUIDDOCU"), (new IDVariant("DOD")), (new IDVariant()), IMDB.Value(IMDBDef2.TBL_TEMPUORITMUL, IMDBDef2.FLD_TEMPUORITMUL_NOMEOGGPROUO, 0), (new IDVariant("Da esaminare la fattura proveniente da ")));
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_FEDOCUMENTAL.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_UPDATE);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AssegnaUOMULTI", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accettazione Multipla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AccettazioneMultipla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Accettazione Multipla Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTAERRORI = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTAOK = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CONTATOT = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_FEDOCUMENTAL.ShowMultipleSel())
      {
        C3 = PAN_FEDOCUMENTAL.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
        while (!PAN_FEDOCUMENTAL.RSEOF())
        {
          if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
          {
            MainFrm.Cf4armDBObject.INDEFEPASSIVAFEACCETTAZIONEMULTIPLA(C3.Get("FEDOCUIDDOCU"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SEERRORE, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0));
            v_CONTAERRORI = IDL.Add(v_CONTAERRORI, v_SEERRORE);
            v_CONTATOT = IDL.Add(v_CONTATOT, (new IDVariant(1)));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_FEDOCUMENTAL.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        v_CONTAOK = IDL.Sub(v_CONTATOT, v_CONTAERRORI);
      }
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0, IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_CONTAOK), (new IDVariant(" FATTURE ELABORATE CON SUCCESSO, "))), IDL.ToString(v_CONTAERRORI)), (new IDVariant(" FATTURE NON ELABORATE"))));
      IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      MainFrm.Show(MyGlb.FRM_SEGNALAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AccettazioneMultipla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // INS IN CONTABILITA
  // EG. Modifica del 29/11/2019: in caso di documento inserito
  // in contabilità ma errore su inserimento notifica non
  // viene aperto il documento inserito
  //     Modificato codice per aprire il documento se l
  // inserimento è andato a buon fine
  // **********************************************************************
  public int INSINCONTABILITA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // INS IN CONTABILITA Body
      // Corpo Procedura
      // 
      IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant(""));
      IDVariant v_ANNOPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMEROPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_OKINSFAT = null;
      v_OKINSFAT = (new IDVariant(-1));
      IDVariant v_VMSGINSCONT = null;
      v_VMSGINSCONT = new IDVariant(MainFrm.MESSEGINSSOG);
      if (IDL.NullValue(MainFrm.MESSEGINSSOG,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        v_MESSAGGIO = new IDVariant(MainFrm.MESSEGINSSOG);
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.InserisciinContabilita(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.NullValue(SEINVIOESITO,(new IDVariant("SI"))), MainFrm.MESSEGINSSOG, SEINSERITQTN, v_ANNOPROGR, v_NUMEROPROGR, v_SEERRORE, v_VMSGINSCONT);
      if (!(IDL.IsNull(v_VMSGINSCONT)))
      {
        // MainFrm.set_AlertMessage(v_MESSAGGIO); 
        v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_VMSGINSCONT);
        MainFrm.MESSEGINSSOG = (new IDVariant());
      }
      // 
      // seerrore=1 la fattura è stata inserita ma ci sono delle
      // segnalazioni;
      // seerrore=2 c'è stato un errore e non è stata fatto
      // il commit dell'inserimento della fattura
      // 
      if (v_SEERRORE.equals((new IDVariant(2)), true))
      {
        v_OKINSFAT = (new IDVariant(0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(""))), (new IDVariant("</br>"))), IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(" "))));
      }
      if (v_OKINSFAT.booleanValue())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant("DOD")), (new IDVariant()), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO, 0), (new IDVariant("Da completare la fattura proveniente da ")));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          // MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          IDVariant v_VMSGNOTIFATT = new IDVariant(0,IDVariant.STRING);
          v_VMSGNOTIFATT = (new IDVariant("Errore in creazione notifica per fattura creata : "));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" </br>"))), v_VMSGNOTIFATT), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())));
        }
      }
      if (IDL.NullValue(v_MESSAGGIO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(v_MESSAGGIO)); 
      }
      if (SEACCETEAPRI.equals((new IDVariant(1)), true) && v_OKINSFAT.booleanValue())
      {
        if ((MainFrm.GetForm(MyGlb.FRM_FATTURA, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_FATTURA,(new IDVariant(0)).booleanValue()); 
        }
        IDVariant v_VFEDOCPROANN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VFEDOCPRONUM = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGRESSIVO_ANNO as FEDOCUPROANN, ");
        SQL.append("  A.PROGRESSIVO_NUMERO as FEDOCUPRONUM ");
        SQL.append("from ");
        SQL.append("  FE_DOCUMENTALE A ");
        SQL.append("where (A.ID_DOCUMENTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFEDOCPROANN = QV.Get("FEDOCUPROANN", IDVariant.DECIMAL) ;
          v_VFEDOCPRONUM = QV.Get("FEDOCUPRONUM", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMANNPRO, 0, new IDVariant(new IDVariant(v_VFEDOCPROANN),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO5, IMDBDef2.FLD_FILTRO5_ROWNAMNUMPRO, 0, new IDVariant(new IDVariant(v_VFEDOCPRONUM),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_FATTURA, (new IDVariant(0)).intValue(), this); 
        SEACCETEAPRI = (new IDVariant(0));
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "INSINCONTABILITA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accetta Old
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AccettaOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accetta Old Body
      // Corpo Procedura
      // 
      ControlloNumero();
      if (IDL.NullValue(CONTRONUMERO,(new IDVariant(0))).equals((new IDVariant(-1)), true))
      {
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0)))
      {
        MainFrm.Cf4armDBObject.INDEFEPASSIVAFECONTROLLOSOGGETTO(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0));
        PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
        InserisciSoggetto();
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("impossibile accettare la fattura, il soggetto non è presente in contabilità, inserirlo con l'apposita funzione"))); 
        return 0;
      }
      IDVariant v_CONTROLLOQTN = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  INDE_FE_PASSIVA.FE_CONTROLLO_QTN(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IFPFCQFDIDFE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTROLLOQTN = QV.Get("IFPFCQFDIDFE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTROLLOQTN.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.INTEGER);
        S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La quietanza contenuta nella fattura non è presente in archivio. Si desidera inserirla prima dell'accettazione?")), (new IDVariant("Si;No;Annulla")))));
        // 
        //  
        // Scrivi un commento per questo blocco o premi backspace
        // per eliminare questo commento
        // 
        if (S.equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.INDEFEPASSIVAINSERISCEQTNDASCELTABEN(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0));
        }
        else if (S.equals((new IDVariant(2)), true))
        {
        }
        else
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_ANNOPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMEROPROGR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      IDVariant C = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.InserisciinContabilita(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant()), (new IDVariant()), SEINSERITQTN, v_ANNOPROGR, v_NUMEROPROGR, I, C);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFENOTIFICAFAT(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), (new IDVariant("DOD")), (new IDVariant()), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO, 0), (new IDVariant("E' stata assegnata una fattura elettronica da completare: ")));
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AccettaOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica assegna Unità
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ModificaassegnaUnità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Modifica assegna Unità Body
      // Corpo Procedura
      // 
      // 
      // 

      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_VTIPOSMIST = null;
      v_VTIPOSMIST = (new IDVariant());
      IDVariant v_CHIAVE = new IDVariant(0,IDVariant.STRING);
      v_CHIAVE = (new IDVariant("PRODUCTS/FATTURA_ELETTRONICA/SMISTAMENTO"));
      IDVariant v_STRINGA = new IDVariant(0,IDVariant.STRING);
      v_STRINGA = (new IDVariant("FILTRO_ASSEGNA_UNITA_DA_SMISTAMENTO"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  INDE_FE_PASSIVA.TROVA_REGISTRO(" + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_STRINGA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as INFEPATRRECS ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VTIPOSMIST = QV.Get("INFEPATRRECS", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_CUU1 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CUU2 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_RIF1 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_RIF2 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_BDO1 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_BDO2 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_IMP1 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_IMP2 = new IDVariant(0,IDVariant.STRING);
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_FEDOCUMENTAL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          if (v_COUNT.equals((new IDVariant(1)), true))
          {
            if (IDL.Length(v_VTIPOSMIST).compareTo((new IDVariant(0)), true)>0)
            {
              try
              {
                MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFECALCOLARIFERIMENTIFE(C2.Get("FEDOCUIDDOCU"), v_CUU1, v_RIF1, v_BDO1, v_IMP1);
              }
              catch (Exception e7)
              {
                MainFrm.Logmessage(new IDVariant(e7.getMessage()));
              }
            }
            v_REC = new IDVariant(I);
          }
          else
          {
            if (IDL.Length(v_VTIPOSMIST).compareTo((new IDVariant(0)), true)>0)
            {
              try
              {
                MainFrm.Cf4armDBObject.INDEFESMISTAMENTOFECALCOLARIFERIMENTIFE(C2.Get("FEDOCUIDDOCU"), v_CUU2, v_RIF2, v_BDO2, v_IMP2);
              }
              catch (Exception e) {}
              if (v_VTIPOSMIST.equals((new IDVariant("CUU")), true))
              {
                if (v_CUU1.compareTo(v_CUU2, true)!=0)
                {
                  IDVariant v_MESGERR = new IDVariant(0,IDVariant.STRING);
                  v_MESGERR = (new IDVariant("Sono state selezionate fatture con diverso Codice Univoco. Non è possibile proseguire."));
                  MainFrm.set_AlertMessage(v_MESGERR); 
                  return 0;
                }
              }
              else if (v_VTIPOSMIST.equals((new IDVariant("RIF")), true))
              {
                if (v_RIF1.compareTo(v_RIF2, true)!=0)
                {
                  IDVariant v_MESGERR = new IDVariant(0,IDVariant.STRING);
                  v_MESGERR = (new IDVariant("Sono state selezionate fatture con diverso Riferimento. Non è possibile proseguire."));
                  MainFrm.set_AlertMessage(v_MESGERR); 
                  return 0;
                }
              }
              else if (v_VTIPOSMIST.equals((new IDVariant("BDO")), true))
              {
                if (v_BDO1.compareTo(v_BDO2, true)!=0)
                {
                  IDVariant v_MESGERR = new IDVariant(0,IDVariant.STRING);
                  v_MESGERR = (new IDVariant("Sono state selezionate fatture con riferimenti a Buoni d'Ordine differenti. Non è possibile proseguire."));
                  MainFrm.set_AlertMessage(v_MESGERR); 
                  return 0;
                }
              }
              else
              {
                // 
                // IMP
                // 
                if (v_IMP1.compareTo(v_IMP2, true)!=0)
                {
                  IDVariant v_MESGERR = new IDVariant(0,IDVariant.STRING);
                  v_MESGERR = (new IDVariant("Sono state selezionate fatture con indicazione di Impegni differenti. Non è possibile proseguire."));
                  MainFrm.set_AlertMessage(v_MESGERR); 
                  return 0;
                }
              }
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGCUUFAT, 0, new IDVariant(v_CUU1));
        IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGRIFFAT, 0, new IDVariant(v_RIF1));
        IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGBDOFAT, 0, new IDVariant(v_BDO1));
        IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGIMPFAT, 0, new IDVariant(v_IMP1));
        IMDB.set_Value(IMDBDef2.TBL_IMDBMODASS, IMDBDef2.FLD_IMDBMODASS_NOMOGGFIUOSM, 0, ((IDL.Length(v_VTIPOSMIST).compareTo((new IDVariant(0)), true)>0)?v_VTIPOSMIST:(new IDVariant())));
        MainFrm.Show(MyGlb.FRM_MODASSUNIMUL, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        if (v_COUNT.equals((new IDVariant(1)), true))
        {
          PAN_FEDOCUMENTAL.set_ActualPosition(true, new IDVariant(v_REC).intValue());
        }
        if (IDL.IsNull(v_VTIPOSMIST))
        {
          IMDB.set_Value(IMDBDef2.TBL_TEMPUO3, IMDBDef2.FLD_TEMPUO3_NOMEOGGPROUO, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUPROGUO, 0),IDVariant.INTEGER));
        }
        IMDB.set_Value(IMDBDef2.TBL_TEMPUO3, IMDBDef2.FLD_TEMPUO3_NOMEOGGIDDOC, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef2.TBL_TEMPUO3, IMDBDef2.FLD_TEMPUO3_NOMEOGGSEMUL, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_MULTISERVIZI, 0));
        MainFrm.Show(MyGlb.FRM_MODASSUNPEAC, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ModificaassegnaUnità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Numero
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlloNumero ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Numero Body
      // Corpo Procedura
      // 
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      CONTRONUMERO = (new IDVariant(0));
      IDVariant v_TIPODOCUMENT = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Fattura")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD01"));
      }
      else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Acconto/Anticipo su Fattura")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD02"));
      }
      else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Acconto/Anticipo su PArcella")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD03"));
      }
      else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Nota di Credito")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD04"));
      }
      else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Nota di Debito")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD05"));
      }
      else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0).equals((new IDVariant("Parcella")), true))
      {
        v_TIPODOCUMENT = (new IDVariant("TD06"));
      }
      IDVariant v_VT03CODICE = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINT03CODICE ");
      SQL.append("from ");
      SQL.append("  T03 A ");
      SQL.append("where ((A.TIPO_DOCUMENTO LIKE '%' || " + IDL.CSql(v_TIPODOCUMENT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " || '%')) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VT03CODICE = QV.Get("MINT03CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  FAT A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_DOC = " + IDL.CSql(v_VT03CODICE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_DOC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUNUMDOC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_DOC = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATDOC, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy'))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        if (MainFrm.BLOCFATTDOPP.equals((new IDVariant("SI")), true))
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("La fattura ")), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUNUMDOC, 0)), (new IDVariant("/"))), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATDOC, 0)))), (new IDVariant(" per "))), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0)), (new IDVariant(" è già presente in archivio. Non è possibile procedere.")))); 
          CONTRONUMERO = (new IDVariant(-1));
          return 0;
        }
        else
        {
          IDVariant S = new IDVariant(0,IDVariant.INTEGER);
          S = (new IDVariant(MainFrm.MessageConfirmEx(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("La fattura ")), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUNUMDOC, 0)), (new IDVariant(" / "))), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUDATDOC, 0)))), (new IDVariant(" per "))), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0)), (new IDVariant(" è già presente in archivio. Continuare l'accettazione?"))), (new IDVariant("Continua;Annulla")))));
          if (S.equals((new IDVariant(1)), true))
          {
            CONTRONUMERO = (new IDVariant(1));
          }
          else
          {
            CONTRONUMERO = (new IDVariant(-1));
            return 0;
          }
        }
      }
      if (IDL.NullValue(CONTRONUMERO,(new IDVariant(0))).equals((new IDVariant(-1)), true))
      {
        return 0;
      }
      else
      {
        if (NOTECONTACCE.equals((new IDVariant("S")), true) && IDL.Like(IDL.Upper(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUTIPDOC, 0)), (new IDVariant("NOTA%"))))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGTICODO, 0, new IDVariant(v_TIPODOCUMENT));
          IMDB.set_Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMOGGCODBEN, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEIMPO, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIMPOR, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_ID_DOCUMENTO, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARPERACCNAC, IMDBDef2.FLD_PARPERACCNAC_NOMEOGGEAPRI, 0, ((SEACCETEAPRI.equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant())));
          MainFrm.Show(MyGlb.FRM_ACCENOTDICRE, (new IDVariant(-1)).intValue(), this); 
        }
        else
        {
          INSINCONTABILITA();
        }
        MainFrm.INTERRSOGGET = (new IDVariant("ON"));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ControlloNumero", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accetta e apri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Accettaeapri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Accetta e apri Body
      // Corpo Procedura
      // 
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_FEDOCUMENTAL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          if (v_COUNT.equals((new IDVariant(1)), true))
          {
            v_REC = new IDVariant(I);
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
        {
          MainFrm.set_AlertMessage((new IDVariant("Questa funzionalità è disabilitata in multiselezione"))); 
          return 0;
        }
        if (v_COUNT.equals((new IDVariant(1)), true))
        {
          PAN_FEDOCUMENTAL.set_ActualPosition(true, new IDVariant(v_REC).intValue());
        }
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      SEACCETEAPRI = (new IDVariant(1));
      IDVariant v_SEPROSEGUACC = new IDVariant(0,IDVariant.STRING);
      IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.INDEFEPASSIVAFECONTROLLIACCETTAZIONE(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_MESSAGGIO, v_SEPROSEGUACC, SEINVIOESITO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0));
      // 
      // procedura di accettazione
      // 
      if (v_SEPROSEGUACC.equals((new IDVariant("SI")), true))
      {
        Accetta();
      }
      else
      {
        if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Accettaeapri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo QTN
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlloQTN ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo QTN Body
      // Corpo Procedura
      // 
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      IDVariant v_CONTROLLOQTN = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  INDE_FE_PASSIVA.FE_CONTROLLO_QTN(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IFPFCQFDIDFE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTROLLOQTN = QV.Get("IFPFCQFDIDFE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTROLLOQTN.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.INTEGER);
        S = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("La quietanza contenuta nella fattura non è presente in archivio. Si desidera inserirla prima dell'accettazione?")), (new IDVariant("Si;No;Annulla")))));
        // 
        //  
        // Scrivi un commento per questo blocco o premi backspace
        // per eliminare questo commento
        // 
        if (S.equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.INDEFEPASSIVAINSERISCEQTNDASCELTABEN(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCODBEN, 0));
          SEINSERITQTN = (new IDVariant(1));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
          // INTERRUTTQTN = (new IDVariant("ON"));
          // ControlloNumero();
        }
        else if (S.equals((new IDVariant(2)), true))
        {
          // INTERRUTTQTN = (new IDVariant("ON"));
          // ControlloNumero();
          SEINSERITQTN = (new IDVariant(0));
        }
        else
        {
          // INTERRUTTQTN = (new IDVariant("OFF"));
          return 0;
        }
      }
      ControlloNumero();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ControlloQTN", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Allegati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Allegati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUESIALL, 0))))
      {
        IDVariant v_URL = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  INDE_FE_PASSIVA.FE_URL_ALLEGATI(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDGDM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as IFPFUAFDIGFE ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_URL = QV.Get("IFPFUAFDIGFE", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.IsNull(v_URL))
        {
          MainFrm.set_AlertMessage((new IDVariant("Url allegato vuoto. Controllare la configurazione dei parametri sulla tabella REGISTRO"))); 
          return 0;
        }
        MainFrm.set_RedirectTo(v_URL);
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Allegati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Collassa il pannello filtri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Collassailpannellofiltri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collassa il pannello filtri Body
      // Corpo Procedura
      // 
      PAN_FILTRI.set_Collapsed(!(PAN_FILTRI.Collapsed));
      if (!(PAN_FILTRI.Collapsed))
      {
        if (IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, 0).compareTo((new IDVariant("NO")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL, 0))))
        {
          MainFrm.CmdObj.SetCmdIcon(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("collapse_red.gif")).stringValue()); 
        }
        else
        {
          MainFrm.CmdObj.SetCmdIcon(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("collapse.gif")).stringValue()); 
        }
        MainFrm.CmdObj.SetCmdCaption(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("Collassa il pannello filtri")).stringValue()); 
        MainFrm.CmdObj.SetCmdTooltip(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("Collassa il pannello filtri")).stringValue()); 
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, 0).compareTo((new IDVariant("NO")), true)!=0 || IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, 0).compareTo((new IDVariant("NO")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARDA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGDAARAL, 0))))
        {
          MainFrm.CmdObj.SetCmdIcon(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("expand_red.gif")).stringValue()); 
          MainFrm.CmdObj.SetCmdCaption(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("SONO PRESENTI FILTRI")).stringValue()); 
          IDVariant S = null;
          S = (new IDVariant("SONO PRESENTI FILTRI"));
          // S = IDL.Add(IDL.Add(IDL.Add(((IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGDAESA, 0).equals((new IDVariant("NO"))))?(new IDVariant()):IDL.Add((new IDVariant("Fatture da esaminare")), (new IDVariant("\n")))), ((IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGEACCE, 0).equals((new IDVariant("NO"))))?(new IDVariant()):IDL.Add((new IDVariant("Fatture accettate")), (new IDVariant("\n"))))), ((IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGERIFI, 0).equals((new IDVariant("NO"))))?(new IDVariant()):IDL.Add((new IDVariant("Fatture rifiutate")), (new IDVariant("\n"))))), ((IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMEOGGECANC, 0).equals((new IDVariant("NO"))))?(new IDVariant()):(new IDVariant("Fatture cancellate"))));
          MainFrm.CmdObj.SetCmdTooltip(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), S.stringValue()); 
        }
        else
        {
          MainFrm.CmdObj.SetCmdIcon(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("expand.gif")).stringValue()); 
          MainFrm.CmdObj.SetCmdCaption(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("Espandi il pannello filtri")).stringValue()); 
          MainFrm.CmdObj.SetCmdTooltip(MyGlb.CMDS_COMANFEDOCUM+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_COLLILPANFIL+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant("Espandi il pannello filtri")).stringValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Collassailpannellofiltri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Mostra Fattura
  // **********************************************************************
  public int MostraFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mostra Fattura Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_URL = new IDVariant(0,IDVariant.STRING);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUMIDGDM, 0))))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  INDE_FE_PASSIVA.FE_URL_FATTURA(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as URFAFDIDFEFD ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_URL = QV.Get("URFAFDIDFEFD", IDVariant.STRING) ;
        }
        QV.Close();
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.set_RedirectTo(v_URL);
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "MostraFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inserisci Soggetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InserisciSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Soggetto Body
      // Corpo Procedura
      // 
      IDVariant v_SERRORE = new IDVariant(0,IDVariant.STRING);
      if (MainFrm.ANAGRACONDIV.equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI543, IMDBDef2.FLD_PARAMETRI543_NOMEOGGIDDOC, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI543, IMDBDef2.FLD_PARAMETRI543_NOMOGGRAGSOC, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0));
          MainFrm.Show(MyGlb.FRM_INSENUOVSOGG, (new IDVariant(2)).intValue(), this); 
          return 0;
        }
        else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN, 0).equals((new IDVariant(1)), true))
        {
          // 
          // Vai alla Procedura di AggiornamentoSoggetto
          // 
          MainFrm.Aggiornamentosoggetto(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), v_SERRORE);
          if (v_SERRORE.compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage(v_SERRORE); 
            return 0;
          }
          ControlloQTN();
          return 0;
        }
        else
        {
          // 
          // ControlloBen > 1
          // 
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0),IDVariant.INTEGER));
          MainFrm.Show(MyGlb.FRM_SELEZISOGGET, (new IDVariant(2)).intValue(), this); 
          return 0;
          // 
          // La Viedeata di Selezione Soggetto in caso di Anagrafe
          // Condivisa ritorna alla procedura di AggiornamentoSoggetto
          // 
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI543, IMDBDef2.FLD_PARAMETRI543_NOMEOGGIDDOC, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI543, IMDBDef2.FLD_PARAMETRI543_NOMOGGRAGSOC, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0));
          MainFrm.Show(MyGlb.FRM_INSENUOVSOGG, (new IDVariant(2)).intValue(), this); 
          return 0;
        }
        else if (IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUCONBEN, 0).compareTo((new IDVariant(1)), true)>0)
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMOGGRASOFE, 0, IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCURAGSOC, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI544, IMDBDef2.FLD_PARAMETRI544_NOMEOGGIDDOC, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0),IDVariant.INTEGER));
          MainFrm.Show(MyGlb.FRM_SELEZISOGGET, (new IDVariant(2)).intValue(), this); 
          return 0;
        }
        ControlloQTN();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "InserisciSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rifiuta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // P SE INVIO ESITO - Optional - Input
  // P TIPO RIFUTO - Optional - Input
  // P MOTIVAZIONE - Optional - Input
  // **********************************************************************
  public int Rifiuta (IDVariant PSEINVIOESITO, IDVariant PTIPORIFUTO, IDVariant PMOTIVAZIONE)
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
      // Rifiuta Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_TEMPMOTIVAZI, IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI, 0)))
      {
        return 0;
      }
      // 
      // 

      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_REC = new IDVariant(0,IDVariant.INTEGER);
      C4 = PAN_FEDOCUMENTAL.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          if (v_COUNT.equals((new IDVariant(1)), true))
          {
            v_REC = new IDVariant(I);
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (v_COUNT.compareTo((new IDVariant(1)), true)>0)
      {
        RifiutoMultiplo(PMOTIVAZIONE);
      }
      else
      {
        if (v_COUNT.equals((new IDVariant(1)), true))
        {
          PAN_FEDOCUMENTAL.set_ActualPosition(true, new IDVariant(v_REC).intValue());
        }
        IDVariant v_SEINTERROMPO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SEINVIOESITO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SEPROSEGUORI = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SEPROSEGUOAC = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.INDEFEPASSIVAFECONTROLLIRIFIUTO(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_MESSAGGIO, v_SEPROSEGUOAC, v_SEPROSEGUORI, v_SEINVIOESITO, PTIPORIFUTO);
        if (v_SEPROSEGUOAC.equals((new IDVariant("SI")), true))
        {
          if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.INTEGER);
            // MainFrm.set_AlertMessage(v_MESSAGGIO); 
            S = (new IDVariant(MainFrm.MessageConfirmEx(v_MESSAGGIO, (new IDVariant("Ok")))));
            if (IDL.NullValue(S,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
            {
            }
            SEINVIOESITO = new IDVariant(v_SEINVIOESITO);
            Accetta();
          }
        }
        if (v_SEPROSEGUORI.equals((new IDVariant("SI")), true))
        {
          IDVariant v_SMESSAGNOTIF = new IDVariant(0,IDVariant.STRING);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.RifiutaFE(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.NullValue(v_SEINVIOESITO,(new IDVariant("SI"))), IDL.NullValue(PTIPORIFUTO,(new IDVariant("RIFIUTO_DA_INVIARE"))), PMOTIVAZIONE, v_SMESSAGNOTIF);
          if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else if (IDL.NullValue(v_SMESSAGNOTIF,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            // 
            // Piero 21-05-2019 sMessaggioNotifica arriva da GDMFE
            // se ci sono stati errori
            // 
            MainFrm.set_AlertMessage(v_SMESSAGNOTIF); 
          }
          PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
        }
        if (v_SEPROSEGUORI.equals((new IDVariant("NO")), true) && v_SEPROSEGUOAC.equals((new IDVariant("NO")), true))
        {
          if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Rifiuta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accetta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Accetta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accetta Body
      // Corpo Procedura
      // 
      // 
      // serie di procedure una dentro l'altra
      // in inserisci soggetto controllo se si deve inserire
      // solamente il soggetto opppure se si deve scegliere
      // tra più soggetti in ogni caso all OK della maschera
      // che viene aperta lancio  CONTROLLO QTN se il controllo
      // è andato bene ( INTERRUTTORE QTN = ON)  passo al controllo
      // numero se anche questo va a buon fine inserisco in
      // contabilità e inserisco nelle notifiche
      // 
      // 
      SEINSERITQTN = (new IDVariant(-1));
      // 
      // Va annullata la variabile globale che contiene le segnalazioni
      // di problemi dell'inserimento soggetto
      // 
      MainFrm.MESSEGINSSOG = (new IDVariant());
      MainFrm.Cf4armDBObject.INDEFEPASSIVAFECONTROLLOSOGGETTO(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0));
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      InserisciSoggetto();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Accetta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scarica
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Scarica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scarica Body
      // Corpo Procedura
      // 
      if (MainFrm.GDMCONNTYPE.equals((new IDVariant("NO")), true))
      {
        MainFrm.Show(MyGlb.FRM_CARICAMEFILE, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        IDVariant v_PRESCARICO = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FE_DOCUMENTALE A ");
        SQL.append("where (A.STATO_DOCUMENTO = 'IN_LAVORAZIONE') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PRESCARICO = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.ImportadaGDM(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SEERRORE, v_MESSAGGIO);
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
        if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        // SCARICA_FILTFETBLUPD();
        PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
        // IDVariant v_POSTSCARICO = new IDVariant(0,IDVariant.INTEGER);
        // SQL = new StringBuffer();
        // SQL.append("select ");
        // SQL.append("  COUNT(*) as COUNT ");
        // SQL.append("from ");
        // SQL.append("  FE_DOCUMENTALE A ");
        // SQL.append("where (A.STATO_DOCUMENTO = 'IN_LAVORAZIONE') ");
        // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        // if (!QV.EOF()) QV.MoveNext();
        // if (!QV.EOF())
        // {
        //   v_POSTSCARICO = QV.Get("COUNT", IDVariant.INTEGER) ;
        // }
        // QV.Close();
        // if (IDL.Sub(v_POSTSCARICO, v_PRESCARICO).compareTo((new IDVariant(0)), true)>=0)
        // {
          // MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("ricevute ")), IDL.ToString(IDL.Sub(v_POSTSCARICO, v_PRESCARICO))), (new IDVariant(" fatture da esaminare")))); 
        // }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Scarica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri FE TBL: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void SCARICA_FILTFETBLUPD() throws SQLException
  {
  }

  // **********************************************************************
  // Cancella la fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Cancellalafattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella la fattura Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.INDEFEPASSIVAFECANCELLAFATTURA(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUSTADOC, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).equals((new IDVariant("")), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("La fattura è stata cancellata"))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "Cancellalafattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Recupera Protocollo Generale
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RecuperaProtocolloGenerale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Recupera Protocollo Generale Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  FE_DOCUMENTALE A ");
      SQL.append("where ((A.PROT_GEN_DATA_ARRIVO IS NULL)) ");
      SQL.append("and   ((A.PROT_GEN_NUMERO IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(100)), true)>0)
      {
        IDVariant I = new IDVariant(0,IDVariant.INTEGER);
        I = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("Esistono più di 100 documenti senza protocollo, si vuole procedere con l'elaborazione? L'operazione richiederà qualche minuto!")), (new IDVariant("Si;Annulla")))));
        if (I.equals((new IDVariant(2)), true))
        {
          return 0;
        }
        else if (I.equals((new IDVariant(1)), true))
        {
          IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MESS = new IDVariant(0,IDVariant.STRING);
          MainFrm.Cf4armDBObject.RECUPERA_PROTOCOLLO_GENERALE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SEERRORE, v_MESS);
          if (v_SEERRORE.compareTo((new IDVariant(0)), true)!=0)
          {
            MainFrm.set_AlertMessage(v_MESS); 
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione avvenuta con successo"))); 
          }
        }
      }
      else
      {
        IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MESS = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.RECUPERA_PROTOCOLLO_GENERALE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SEERRORE, v_MESS);
        if (v_SEERRORE.compareTo((new IDVariant(0)), true)!=0)
        {
          MainFrm.set_AlertMessage(v_MESS); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione avvenuta con successo"))); 
        }
      }
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "RecuperaProtocolloGenerale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ripristina Stato Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RipristinaStatoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ripristina Stato Fattura Body
      // Corpo Procedura
      // 
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      I = (new IDVariant(MainFrm.MessageConfirmEx(IDL.Add(IDL.Add((new IDVariant("Si vuole ripristinare il documento nello stato ")), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUULTSTA, 0)), (new IDVariant("?"))), (new IDVariant("Si;Annulla")))));
      if (I.equals((new IDVariant(2)), true))
      {
        return 0;
      }
      else if (I.equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.INDEFEPASSIVAFERIPRISTINAFATTURA(IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUIDDOCU, 0), IMDB.Value(IMDBDef10.PQRY_FEDOCUMENTA1, IMDBDef10.PQSL_FEDOCUMENTA1_FEDOCUULTSTA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).equals((new IDVariant("")), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Operazione eseguita con successo"))); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "RipristinaStatoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Configurazione Utenze
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ConfigurazioneUtenze ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Configurazione Utenze Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_CONFIGUTENZE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ConfigurazioneUtenze", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazioni In Base Ruolo OD
  // **********************************************************************
  public int AbilitazioniInBaseRuoloOD ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazioni In Base Ruolo OD Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      // 
      // ACCETTA
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'ACCOD') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABILACCODRUO = (new IDVariant(-1));
        }
        else
        {
          ABILACCODRUO = (new IDVariant(0));
        }
      }
      // 
      // RIUFIUTO
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'RIFOD') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABILRIFODRUO = (new IDVariant(-1));
        }
        else
        {
          ABILRIFODRUO = (new IDVariant(0));
        }
      }
      // 
      // PARERE POS
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'PARPOSOD') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABIPARPOODRU = (new IDVariant(-1));
        }
        else
        {
          ABIPARPOODRU = (new IDVariant(0));
        }
      }
      // 
      // PARERE NEG
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'PARNEGOD') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABIPARNEODRU = (new IDVariant(-1));
        }
        else
        {
          ABIPARNEODRU = (new IDVariant(0));
        }
      }
      // 
      // DOC NON COMP
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'DOCNC') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABDONOCOODRU = (new IDVariant(-1));
        }
        else
        {
          ABDONOCOODRU = (new IDVariant(0));
        }
      }
      // 
      // ASS UO
      // 
      {
        v_VCOUNT = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  COMPETENZE_CF4 A ");
        SQL.append("where (A.UTENTE = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COMPETENZA = 'ASSUOOD') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          ABIASSUOODRU = (new IDVariant(-1));
        }
        else
        {
          ABIASSUOODRU = (new IDVariant(0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "AbilitazioniInBaseRuoloOD", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comunicato PCC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ComunicatoPCC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Comunicato PCC Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      if (!(PAN_FEDOCUMENTAL.ShowMultipleSel()))
      {
        PAN_FEDOCUMENTAL.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      C3 = PAN_FEDOCUMENTAL.MasterRS();
      if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
      if (!C3.Bof()) PAN_FEDOCUMENTAL.GotoFirst();
      while (!PAN_FEDOCUMENTAL.RSEOF())
      {
        if (PAN_FEDOCUMENTAL.IsRowSelected(I.intValue()) && C3.Get("FEDOCUSTADOC").compareTo((new IDVariant("ACCETTATA")), true)!=0)
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update FE_DOCUMENTALE set ");
            SQL.append("  COMUNICATO_PCC = 'SI' ");
            SQL.append("where (ID_DOCUMENTO = " + IDL.CSql(C3.Get("FEDOCUIDDOCU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e6)
          {
            MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          v_SELEZIONATO = (new IDVariant(-1));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_FEDOCUMENTAL.GotoNext();
      }
      if (CurPos>0) C3.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna fattura non Accettata"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattureElettroniche", "ComunicatoPCC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri FE TBL
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FATTURELETTR_FILTRIFETBL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FILTRIFETBL1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRIFETBL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FILTRIFETBL, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FILTRIFETBL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FILTRIFETBL1_RS, 0, IMDBDef2.TBL_FILTRIFETBL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 0, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGDAESA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 1, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGEACCE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 2, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGERIFI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 3, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGECANC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 4, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGTIPPRO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 5, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARDA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRIFETBL1_RS, 6, 0, IMDBDef2.TBL_FILTRIFETBL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARAL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FILTRIFETBL, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FILTRIFETBL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRIFETBL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FILTRIFETBL1_RS, 0);
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
  private void PAN_FILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRI);
    // Stub
  }

  private void PAN_FILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_FILTRIFETBL1, IMDBDef10.PQSL_FILTRIFETBL1_NOMOGGTIPPRO, 0, (new IDVariant("Inserisci alcuni esempi separati dal punto e virgola")));
      }
      if (Cancel.isFalse())
      {
        PAN_FILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FEDOCUMENTAL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FEDOCUMENTAL, Cancel);
    // Stub
  }

  private void PAN_FEDOCUMENTAL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FEDOCUMENTAL_XML)
    {
      this.IdxPanelActived = this.PAN_FEDOCUMENTAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      MostraFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FEDOCUMENTAL_APRIFATTURA)
    {
      this.IdxPanelActived = this.PAN_FEDOCUMENTAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FEDOCUMENTAL_NOTAPARENEGA)
    {
      this.IdxPanelActived = this.PAN_FEDOCUMENTAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      NotaParereNegativo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FEDOCUMENTAL_ESISTEALLEGATO)
    {
      this.IdxPanelActived = this.PAN_FEDOCUMENTAL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Allegati();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FEDOCUMENTAL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FEDOCUMENTAL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FEDOCUMENTAL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FEDOCUMENTAL_Init()
  {

    PAN_FEDOCUMENTAL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FEDOCUMENTAL.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, "BBF52327-00EC-48D1-BD7E-45754DDAAB55");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, "Accettata");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, MyGlb.PANEL_LIST, 116, 427, 296, 49, 0, 0);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, MyGlb.PANEL_FORM, 0, 315, 200, 73, 0, 0);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, 0, 56);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, 1, 13);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, 0, 4);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, 1, 4);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_ACCETTATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, "E3DEE58A-2698-446C-8F87-B8A33B86C7F0");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, "Respinta");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, MyGlb.PANEL_LIST, 444, 427, 768, 49, 0, 0);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, MyGlb.PANEL_FORM, 0, 363, 576, 241, 0, 0);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, 0, 50);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, 1, 13);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, 0, 4);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, 1, 4);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_RESPINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, "06E22BA3-1C20-4A7A-9910-4B3847FC4357");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, "Cancellata");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, MyGlb.PANEL_LIST, 1232, 427, 284, 49, 0, 0);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, MyGlb.PANEL_FORM, 0, 675, 184, 73, 0, 0);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, 0, 59);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, 1, 13);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, 0, 4);
    PAN_FEDOCUMENTAL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, 1, 4);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_GROUP, GRP_FEDOCUMENTAL_CANCELLATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FEDOCUMENTAL.SetSize(MyGlb.OBJ_FIELD, 52);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, "EE0801EA-599A-4101-8419-0BFA08856703");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, "    ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, "8CEFE02A-3513-4949-9580-1964E83B3649");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, "Fornitore");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, "A3B00F1C-AF53-4A83-AF59-ABF10D664FC7");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, "Codice Fiscale/Partita IVA");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, "C1A151AE-E71E-4F9B-ACE6-2C6617C6F027");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, "Documento");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, "7131C05D-32A9-4E16-976E-5A994B45FB7D");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, "316F2D63-23BB-47B0-A711-0DCF63078257");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, "7CD0F10D-932C-4207-BB77-9FE9BC8819F8");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, "Importo");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, "43EAEE3C-BA05-423D-A6CD-84BD84520E27");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, "Controlli sui dati della fattura");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, "D3B0B9DD-780B-4265-BCE2-0A7004A3A34F");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, "Ente");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, "EB0F69D6-C534-4710-B86B-54DFA0833919");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, "Protocollo");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, "31DF5DFA-452C-4A98-ABA4-B3B1F93385BC");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, "6626432D-148F-468F-8B51-7EF3D26B80D0");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, "Data Arrivo");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, "603846D4-2A77-4A87-93E0-47F83A405D4B");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, "Scadenza");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, "BC954BC2-8379-41BF-B2E2-7E2DB34CE743");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, "Scadenza calcolata");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, "737BEC30-35F2-47C8-B8C1-17E32FBDD52D");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, "Com. PCC");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.VIS_CHECKSTYLE);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, "A4AF960A-A390-41D9-ABCE-89317D01F037");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, "Codice Fiscale");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, "95D7D0A3-E968-45B7-84D7-61BD544E28CD");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, "Partita Iva");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, "617A5EE2-4941-4EEA-8D33-D62B7A0DC146");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, "ID DOCUMENTO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, "2FCB0004-CC81-4492-95A7-D3FA0526DD2C");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, "MODELLO DATI");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.VIS_NONNULLAFIEL);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, "8A2FA8BB-2DEB-4506-8EF2-70B9EF77D301");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, "CODICE BENEFICIARIO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, "2308B496-B810-41F8-BBA5-01D221BF630B");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, "ID GDM");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, "38520DFF-F44E-41D6-9E53-0FA2DE5278C8");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, "NOME FILE XML");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, "7549F2D1-D616-4805-ABEF-3AAF8166C2F9");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, "Info Documento");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, "B92EEB9F-B239-407D-BBDF-425F5355CBC6");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, "PROGRESSIVO NUMERO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, "B06EBDCD-3FB0-42B5-80A9-D6AFDEDBA21B");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, "PROGRESSIVO ANNO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, "94A32F1F-76A8-4BA3-B99E-42E61601AB87");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, "GG Giacenza");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, "3695D212-9801-4D0A-8C2A-6FB8737E4A2A");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, "Apri Fattura");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, "9AD41533-AAB1-4795-A73D-665D8DC6267E");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, "Stato");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, "85AD55B5-E905-4759-8E30-65143804D1E3");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, "Unità Organizzativa");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, "F10AD405-0279-4FE6-82B7-389FB78B8E0C");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, "AD77F576-5727-4485-A71F-9FFF45C2A98E");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, " ");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, "7336DAA7-B410-4511-9E13-9BB07CCEEDE7");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, "Validata");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.VIS_CHECKSTYLE);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, "E82F80EF-4991-46A9-BB40-13113B39CB54");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, "Rifiutata");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.VIS_CHECKSTYLE);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, "9728E739-1669-40DA-ABA5-6734373197FB");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, "Avviso Fornitore");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, "AVVISO_FORNITORE");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.VIS_CHECKSTYLE);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, "8C659C7A-0709-48D6-B07B-0E05563AB7E0");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, "Multiservizi");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.VIS_CHECKSTYLE);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, "31F2C2AF-C41B-4D94-9E67-F221DA7FB5B4");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, "Allegati");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, "3B3436BC-5D2D-4581-BF8F-065A10C7EE7F");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, "Data");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, "B54B2174-2755-4BFB-B449-0DD1FCFA0B31");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, "Utente");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, "5697E3E7-9C03-4B1B-9251-08247B659561");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, "Data");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, "Descrivi il contenuto del campo");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, "4EBF34D1-F9B7-4FD7-AAF0-D537BDCC6234");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, "Utente");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, "45D53765-ABD6-4E33-9BDD-25688462C631");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, "Motivo");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, "2E037345-4E53-48F6-8C8A-927BFE411242");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, "Documento");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.VIS_LABEVISUSTYL);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, "416F210E-398B-4697-92E0-31426C7FF8C8");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, "Protocollo");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.VIS_LABEVISUSTYL);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, "7F8CF7EC-EDF1-4C28-A517-4BE723F022CC");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, "Controllo Ben");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, "6B21A991-9EA8-43F5-A549-B65A2C1013F2");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, "PROGR UO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, "3211C2F5-10D7-41A4-992E-6082C55874D0");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, "PARERE NEG NOTA");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, "F0A8D9A7-A445-4426-B338-3C0CA0142F7F");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, "TOOLTIP CONTROLLI");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, "A442DC23-EEE6-4FD1-81B3-761D5BE141C7");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, " Id SDI");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.VIS_NORFIEINTLUN);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, "3FE348D9-A13A-48D6-9616-1DCF8E3F13BF");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, "ULTIMO STATO");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, "689B04BD-C43F-44D9-B782-B4AC8308E7D0");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, "Utente");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, "1D15E342-EAB5-45C0-A07D-4F9F82E02C17");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, "Data");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, "Descrivi il contenuto del campo");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.VIS_NORMALFIELDS);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FEDOCUMENTAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, "3A8C6431-A5E3-4376-AA39-4802B2D36F51");
    PAN_FEDOCUMENTAL.set_Header(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, "Ordinamento");
    PAN_FEDOCUMENTAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, "");
    PAN_FEDOCUMENTAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_FEDOCUMENTAL.SetFlags(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FEDOCUMENTAL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_LIST, 16, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_LIST, 32);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_LIST, "    ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_FORM, 4, 340, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_FORM, 32);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_XML, MyGlb.PANEL_FORM, "    ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_XML, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_XML, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_XML, PPQRY_FEDOCUMENTA1, "CASE WHEN (A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI') THEN -1 ELSE 1 END", "XML", 1, 19, 0, -13989);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_XML, (new IDVariant()), " ", "", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_XML, (new IDVariant(1)), "Pieno", "", "at_grey1.png", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_XML, (new IDVariant(0)), "Warning", "Trascorsi 15 giorni dalla data di arrivo", "at_grey_alert1.png", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_XML, (new IDVariant(-1)), "Late", "Trascorsi più di 15 giorni dalla data di arrivo", "at_grey_alert1.png", -1);
    PAN_FEDOCUMENTAL.set_ImageResizeMode(PFL_FEDOCUMENTAL_XML, 2);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_LIST, 40, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_LIST, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Fornitore");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 76, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Fornitore");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_RAGIONSOCIAL, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_RAGIONSOCIAL, PPQRY_FEDOCUMENTA1, "A.RAGIONE_SOCIALE", "FEDOCURAGSOC", 5, 100, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_LIST, 216, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_LIST, 88);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_LIST, "Codice Fiscale Partita IVA");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_FORM, 4, 460, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_FORM, 88);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODFISPARTIV, MyGlb.PANEL_FORM, "Cod. Fsc. Prt. I.");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CODFISPARTIV, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_CODFISPARTIV, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CODFISPARTIV, PPQRY_FEDOCUMENTA1, "NVL(A.CODICE_FISCALE, A.PARTITA_IVA)", "CODFISPARTIV", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_LIST, 324, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_LIST, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_LIST, "Documento");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_FORM, 4, 52, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NUMERODOCUME, MyGlb.PANEL_FORM, "Documento");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_NUMERODOCUME, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_NUMERODOCUME, PPQRY_FEDOCUMENTA1, "A.NUMERO_DOCUMENTO", "FEDOCUNUMDOC", 5, 20, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_LIST, 464, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_LIST, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_FORM, 4, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATADOCUMENT, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_DATADOCUMENT, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_DATADOCUMENT, PPQRY_FEDOCUMENTA1, "A.DATA_DOCUMENTO", "FEDOCUDATDOC", 6, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_LIST, 528, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_LIST, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_FORM, 4, 220, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TIPODOCUMENT, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_TIPODOCUMENT, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_TIPODOCUMENT, PPQRY_FEDOCUMENTA1, "A.TIPO_DOCUMENTO", "FEDOCUTIPDOC", 5, 60, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_LIST, 608, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_FORM, 4, 244, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_IMPORTO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_IMPORTO, PPQRY_FEDOCUMENTA1, "A.IMPORTO", "FEDOCUMIMPOR", 3, 12, 2, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_LIST, 676, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_LIST, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_FORM, 4, 652, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_FORM, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TRATTAMENTIM, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_TRATTAMENTIM, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_TRATTAMENTIM, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_TRATTAMENTIM, PPQRY_FEDOCUMENTA1, "CASE WHEN A.TRATTAMENTI_MISTI = 'S' THEN 'A' ELSE NULL END", "FEDOCUMTRATT", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_TRATTAMENTIM, (new IDVariant("A")), "Alert", "Type the value and explain what it means.", "warning.png", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_LIST, 528, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_LIST, 36);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_LIST, "Ente");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_FORM, 172, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_FORM, 48);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ENTE, MyGlb.PANEL_FORM, "Ente");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ENTE, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ENTE, PPQRY_FEDOCUMENTA1, "A.ENTE", "FEDOCUMEENTE", 5, 4, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_LIST, 696, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_LIST, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_LIST, "Protocollo");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_FORM, 300, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_FORM, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROTGENNUMER, MyGlb.PANEL_FORM, "Protocollo");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PROTGENNUMER, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_PROTGENNUMER, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PROTGENNUMER, PPQRY_FEDOCUMENTA1, "CASE WHEN ~~TBL_FILTRIFETBL.NOMOGGTIPPRO~~ = 'G' THEN A.PROT_GEN_NUMERO ELSE NVL(A.NUMERO_PROT, B.NUMERO_PROT) END", "FEDOCPROGENU", 1, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_LIST, 768, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_LIST, 144);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_FORM, 4, 316, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_FORM, 160);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGENDATARR, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PROGENDATARR, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_PROGENDATARR, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PROGENDATARR, PPQRY_FEDOCUMENTA1, "CASE WHEN ~~TBL_FILTRIFETBL.NOMOGGTIPPRO~~ = 'G' THEN A.PROT_GEN_DATA_ARRIVO ELSE NVL(A.D_DATA_PROT, B.D_DATA_PROT) END", "FEDOPRGEDAAR", 6, 0, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_LIST, 832, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_LIST, 88);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_LIST, "Data Arrivo");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_FORM, 172, 244, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_FORM, 104);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATAARRIVO, MyGlb.PANEL_FORM, "Data Arrivo");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_DATAARRIVO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_DATAARRIVO, PPQRY_FEDOCUMENTA1, "A.DATA_ARRIVO", "FEDOCUDATARR", 6, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_LIST, 896, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_LIST, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_LIST, "Scadenza");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_FORM, 4, 748, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_FORM, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADEXML, MyGlb.PANEL_FORM, "Scadenza");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_DATASCADEXML, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_DATASCADEXML, PPQRY_FEDOCUMENTA1, "A.DATA_SCADENZA_XML", "FEDOCDATSCXM", 6, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_LIST, 984, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_LIST, 168);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_LIST, "Scadenza calcolata");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_FORM, 4, 772, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_FORM, 168);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DATASCADCALC, MyGlb.PANEL_FORM, "Scadenza calcolata");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_DATASCADCALC, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_DATASCADCALC, PPQRY_FEDOCUMENTA1, "A.DATA_SCADENZA_CALCOLATA", "FEDOCDATSCCA", 6, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_LIST, 1068, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_LIST, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_LIST, "Com. PCC");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_FORM, 4, 796, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_FORM, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_COMUNICATPCC, MyGlb.PANEL_FORM, "Com. PCC");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_COMUNICATPCC, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_COMUNICATPCC, PPQRY_FEDOCUMENTA1, "A.COMUNICATO_PCC", "FEDOCUCOMPCC", 5, 2, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_COMUNICATPCC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_COMUNICATPCC, (new IDVariant()), "Null", "", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_LIST, 696, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 100, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CODICEFISCAL, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CODICEFISCAL, PPQRY_FEDOCUMENTA1, "A.CODICE_FISCALE", "FEDOCUCODFIS", 5, 35, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_LIST, 696, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_LIST, 84);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_LIST, "Partita Iva");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_FORM, 4, 124, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARTITAIVA, MyGlb.PANEL_FORM, "Partita Iva");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PARTITAIVA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PARTITAIVA, PPQRY_FEDOCUMENTA1, "A.PARTITA_IVA", "FEDOCUPARIVA", 5, 35, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_LIST, 96);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_LIST, "ID DOC.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDDOCUMENTO, MyGlb.PANEL_FORM, "ID DOCUMENTO");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_IDDOCUMENTO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_IDDOCUMENTO, PPQRY_FEDOCUMENTA1, "A.ID_DOCUMENTO", "FEDOCUIDDOCU", 3, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_LIST, 256, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_LIST, 92);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_LIST, "MODELLO DATI");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_FORM, 276, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_FORM, 104);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MODELLODATI, MyGlb.PANEL_FORM, "MODELLO DATI");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_MODELLODATI, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_MODELLODATI, PPQRY_FEDOCUMENTA1, "A.MODELLO_DATI", "FEDOCUMODDAT", 5, 12, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_LIST, 800, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_LIST, 132);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_LIST, "COD. BEN.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_FORM, 4, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CODICEBENEFI, MyGlb.PANEL_FORM, "COD. BENEFIC.");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CODICEBENEFI, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CODICEBENEFI, PPQRY_FEDOCUMENTA1, "A.CODICE_BENEFICIARIO", "FEDOCUCODBEN", 2, 15, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_LIST, 840, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_LIST, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_LIST, "ID GDM");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDGDM, MyGlb.PANEL_FORM, "ID GDM");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_IDGDM, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_IDGDM, PPQRY_FEDOCUMENTA1, "A.ID_GDM", "FEDOCUMIDGDM", 3, 16, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_LIST, 880, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_LIST, 92);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_LIST, "NOME FILE XML");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_FORM, 4, 268, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOMEFILEXML, MyGlb.PANEL_FORM, "NOME FILE XML");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_NOMEFILEXML, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_NOMEFILEXML, PPQRY_FEDOCUMENTA1, "A.NOME_FILE_XML", "FEDOCNOMFIXM", 5, 40, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_LIST, 4, 372, 912, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_LIST, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_LIST, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_LIST, "Info Documento");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_FORM, 4, 292, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_FORM, 120);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_FORM, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_INFODOCUMENT, MyGlb.PANEL_FORM, "Info Documento");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_INFODOCUMENT, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_INFODOCUMENT, PPQRY_FEDOCUMENTA1, "A.INFO_DOCUMENTO", "FEDOCUINFDOC", 5, 4000, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_LIST, 1232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_LIST, 140);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_LIST, "PROG. NUM.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_FORM, 172, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_FORM, 152);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRENUMERO, MyGlb.PANEL_FORM, "PROGRESSIVO NUMERO");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PROGRENUMERO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PROGRENUMERO, PPQRY_FEDOCUMENTA1, "A.PROGRESSIVO_NUMERO", "FEDOCUPRONUM", 3, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_LIST, 1272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_LIST, 120);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_LIST, "PROG. ANN.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_FORM, 380, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_FORM, 136);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRESSANNO, MyGlb.PANEL_FORM, "PROGRESSIVO ANNO");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PROGRESSANNO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PROGRESSANNO, PPQRY_FEDOCUMENTA1, "A.PROGRESSIVO_ANNO", "FEDOCUPROANN", 3, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_LIST, 1104, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_LIST, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_LIST, "GG Giacenza");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_FORM, 4, 532, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_FORM, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_GGGIACENZA1, MyGlb.PANEL_FORM, "GG Giacenza");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_GGGIACENZA1, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_GGGIACENZA1, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_GGGIACENZA1, PPQRY_FEDOCUMENTA1, "CASE WHEN (A.STATO_DOCUMENTO = 'IN_LAVORAZIONE' OR A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI' OR A.STATO_DOCUMENTO = 'DA_VERIFICARE_SU_SDI') THEN TRUNC( SYSDATE ) - A.DATA_ARRIVO ELSE to_number(NULL) END", "GGGIACENZA1", 2, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_LIST, 1164, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_LIST, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_LIST, "A. Ft.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_FORM, 4, 604, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_FORM, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_APRIFATTURA, MyGlb.PANEL_FORM, "Apri Fattura");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_APRIFATTURA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_APRIFATTURA, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_APRIFATTURA, PPQRY_FEDOCUMENTA1, "DECODE(A.PROGRESSIVO_NUMERO, to_number(NULL), NULL, 'A')", "FEDOCUAPRFAT", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_APRIFATTURA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_APRIFATTURA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_APRIFATTURA, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_LIST, 1188, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_LIST, 120);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_LIST, "Stato");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_FORM, 172, 148, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_FORM, 136);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_STATODOCUMEN, MyGlb.PANEL_FORM, "Stato");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_STATODOCUMEN, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_STATODOCUMEN, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_STATODOCUMEN, PPQRY_FEDOCUMENTA1, "DECODE(NVL(" + IDL.CSql(MainFrm.SOSPFATTURE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N'), 'S', DECODE(A.PROGRESSIVO_ANNO, to_number(NULL), A.STATO_DOCUMENTO, DECODE(B.STATO_VALIDAZIONE, 'VALIDATA', 'VALIDATA', DECODE(B.STATO_VALIDAZIONE, 'RIFIUTATA', DECODE(A.STATO_DOCUMENTO, 'ACCETTATA', 'RIFIUTATA IN DECORRENZA', 'RIFIUTATA'), 'REGISTRATA'))), A.STATO_DOCUMENTO)", "FEDOCUSTADOC", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_LIST, 1308, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_LIST, 72);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 628, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_FORM, 72);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_DESCRIZIONE, MyGlb.PANEL_FORM, "Un. Organiz.");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_DESCRIZIONE, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_DESCRIZIONE, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_DESCRIZIONE, PPQRY_FEDOCUMENTA1, "CASE WHEN NOT ((A.PROGR_UO IS NULL)) THEN SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UO,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UO,TRUNC( SYSDATE )) ELSE '' END", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_LIST, 1740, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_LIST, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_FORM, 4, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_FORM, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERE, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PARERE, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PARERE, PPQRY_FEDOCUMENTA1, "A.PARERE", "FEDOCUMPARER", 5, 8, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_PARERE, (new IDVariant("POSITIVO")), "POSITIVO", "", "smileverde.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_PARERE, (new IDVariant("NEGATIVO")), "NEGATIVO", "Trascorsi 15 giorni dalla data di arrivo", "smilerosso.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_PARERE, (new IDVariant()), " ", "", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_LIST, 1764, 36, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_LIST, 124);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_LIST, " ");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_FORM, 4, 628, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_FORM, 124);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_NOTAPARENEGA, MyGlb.PANEL_FORM, " ");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_NOTAPARENEGA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_NOTAPARENEGA, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_NOTAPARENEGA, PPQRY_FEDOCUMENTA1, "DECODE(A.PARERE_NEG_NOTA, NULL, NULL, 'P')", "NOTAPARENEGA", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_NOTAPARENEGA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_LIST, 1792, 36, 60, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_LIST, 56);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_LIST, "Validata");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_FORM, 4, 868, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_FORM, 56);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_VALIDATA, MyGlb.PANEL_FORM, "Validata");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_VALIDATA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_VALIDATA, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_VALIDATA, PPQRY_FEDOCUMENTA1, "CASE WHEN B.STATO_VALIDAZIONE = 'VALIDATA' THEN 'SI' ELSE 'NO' END", "VALIDATA", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_VALIDATA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_VALIDATA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_LIST, 1852, 36, 60, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_LIST, 60);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_LIST, "Rifiutata");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_FORM, 4, 844, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_FORM, 60);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RIFIUTATA, MyGlb.PANEL_FORM, "Rifiutata");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_RIFIUTATA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_RIFIUTATA, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_RIFIUTATA, PPQRY_FEDOCUMENTA1, "CASE WHEN B.STATO_VALIDAZIONE = 'RIFIUTATA' AND (A.STATO_DOCUMENTO = 'ACCETTATA' OR A.STATO_DOCUMENTO = 'IN_LAVORAZIONE') THEN 'SI' ELSE 'NO' END", "RIFIUTATA", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_RIFIUTATA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_RIFIUTATA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_LIST, 1912, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_LIST, 116);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_LIST, "Avviso Fornitore");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_FORM, 4, 820, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_FORM, 116);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_AVVISOFORNIT, MyGlb.PANEL_FORM, "Avviso Fornitore");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_AVVISOFORNIT, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_AVVISOFORNIT, PPQRY_FEDOCUMENTA1, "B.AVVISO_FORNITORE", "FEDOCFATAVFO", 5, 2, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_AVVISOFORNIT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_AVVISOFORNIT, (new IDVariant()), "Null", "", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_LIST, 1972, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_LIST, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_LIST, "Multis.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_FORM, 4, 484, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_FORM, 76);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MULTISERVIZI, MyGlb.PANEL_FORM, "Multiservizi");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_MULTISERVIZI, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_MULTISERVIZI, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_MULTISERVIZI, PPQRY_FEDOCUMENTA1, "NVL(A.MULTISERVIZI, 'NO')", "MULTISERVIZI", 5, 99, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_MULTISERVIZI, (new IDVariant("SI")), "SI", "Scrivi il valore e spiega cosa significa", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_MULTISERVIZI, (new IDVariant()), "NO", "Scrivi il valore e spiega cosa significa", "", -1);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_LIST, 2020, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_LIST, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_LIST, "All.");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_FORM, 4, 436, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_FORM, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ESISTEALLEGATO, MyGlb.PANEL_FORM, "Allegati");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ESISTEALLEGATO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ESISTEALLEGATO, PPQRY_FEDOCUMENTA1, "A.ESISTE_ALLEGATO", "FEDOCUESIALL", 5, 2, 0, -13997);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_ESISTEALLEGATO, (new IDVariant()), " ", "", "", -1);
    PAN_FEDOCUMENTAL.SetValueListItem(PFL_FEDOCUMENTAL_ESISTEALLEGATO, (new IDVariant("SI")), "Pieno", "", "clip_sm.gif", -1);
    PAN_FEDOCUMENTAL.set_ImageResizeMode(PFL_FEDOCUMENTAL_ESISTEALLEGATO, 2);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_LIST, 288, 452, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_LIST, 40);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_LIST, "Data");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_FORM, 4, 340, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_FORM, 128);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTAZDATA, MyGlb.PANEL_FORM, "Data");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ACCETTAZDATA, -1, GRP_FEDOCUMENTAL_ACCETTATA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ACCETTAZDATA, PPQRY_FEDOCUMENTA1, "A.ACCETTAZIONE_DATA", "FEDOCUACCDAT", 6, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_LIST, 120, 452, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_LIST, 60);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_FORM, 4, 364, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_FORM, 136);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ACCETTUTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ACCETTUTENTE, -1, GRP_FEDOCUMENTAL_ACCETTATA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ACCETTUTENTE, PPQRY_FEDOCUMENTA1, "A.ACCETTAZIONE_UTENTE", "FEDOCUACCUTE", 5, 8, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_LIST, 608, 452, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_LIST, 44);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_LIST, "Data");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_FORM, 100);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINTADATA, MyGlb.PANEL_FORM, "Data");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_RESPINTADATA, -1, GRP_FEDOCUMENTAL_RESPINTA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_RESPINTADATA, PPQRY_FEDOCUMENTA1, "A.RESPINTA_DATA", "FEDOCURESDAT", 6, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_LIST, 448, 452, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_LIST, 56);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_FORM, 4, 412, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_FORM, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_RESPINUTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_RESPINUTENTE, -1, GRP_FEDOCUMENTAL_RESPINTA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_RESPINUTENTE, PPQRY_FEDOCUMENTA1, "A.RESPINTA_UTENTE", "FEDOCURESUTE", 5, 8, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_LIST, 736, 452, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_LIST, 64);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_LIST, "Motivo");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_FORM, 4, 556, 568, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_FORM, 136);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_FORM, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_MOTIVARIFIUT, MyGlb.PANEL_FORM, "Motivo");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_MOTIVARIFIUT, -1, GRP_FEDOCUMENTAL_RESPINTA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_MOTIVARIFIUT, PPQRY_FEDOCUMENTA1, "A.MOTIVAZIONE_RIFIUTO", "FEDOCUMOTRIF", 5, 255, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_LIST, 324, 0, 284, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_LIST, 0);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_LIST, 2);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_FORM, 136, 520, 208, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_FORM, 0);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEDOCU, MyGlb.PANEL_FORM, 3);
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ETICLABEDOCU, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ETICLABEDOCU, -1, "", "ETICLABEDOCU", 0, 0, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_LIST, 696, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_LIST, 0);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_LIST, 2);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_FORM, 144, 528, 208, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_FORM, 0);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ETICLABEPROT, MyGlb.PANEL_FORM, 3);
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ETICLABEPROT, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ETICLABEPROT, -1, "", "ETICLABEPROT", 0, 0, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_LIST, 84);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_LIST, "Controllo Ben");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_FORM, 4, 532, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_FORM, 84);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CONTROLLOBEN, MyGlb.PANEL_FORM, "Controllo Ben");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CONTROLLOBEN, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_CONTROLLOBEN, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CONTROLLOBEN, PPQRY_FEDOCUMENTA1, "NVL(A.CONTROLLO_BEN, 0)", "FEDOCUCONBEN", 2, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_LIST, "PROGR UO");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_FORM, 4, 628, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_FORM, 68);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PROGRUO, MyGlb.PANEL_FORM, "PROGR UO");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PROGRUO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PROGRUO, PPQRY_FEDOCUMENTA1, "A.PROGR_UO", "FEDOCUPROGUO", 3, 19, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_LIST, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_LIST, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_LIST, "PARERE NEG NOTA");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_FORM, 4, 628, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_FORM, 108);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_FORM, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_PARERNEGNOTA, MyGlb.PANEL_FORM, "PARERE NEG NOTA");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_PARERNEGNOTA, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_PARERNEGNOTA, PPQRY_FEDOCUMENTA1, "A.PARERE_NEG_NOTA", "FEDOCPARNENO", 5, 4000, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_LIST, 124);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_LIST, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_LIST, "TOOLTIP CONTROLLI");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_FORM, 4, 676, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_FORM, 124);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_FORM, 2);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_TOOLTICONTRO, MyGlb.PANEL_FORM, "TOOLTIP CONTROLLI");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_TOOLTICONTRO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_TOOLTICONTRO, PPQRY_FEDOCUMENTA1, "A.TOOLTIP_CONTROLLI", "FEDOCUTOOCON", 5, 4000, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_LIST, 2044, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_LIST, 44);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_LIST, " Id SDI");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_FORM, 428, 244, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_FORM, 56);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_IDSDI, MyGlb.PANEL_FORM, " Id SDI");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_IDSDI, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_IDSDI, PPQRY_FEDOCUMENTA1, "A.ID_SDI", "FEDOCUMIDSDI", 3, 16, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_LIST, 1592, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_LIST, 92);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_LIST, "ULTIMO STATO");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_FORM, 4, 676, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_FORM, 92);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ULTIMOSTATO, MyGlb.PANEL_FORM, "ULTIMO STATO");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ULTIMOSTATO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ULTIMOSTATO, PPQRY_FEDOCUMENTA1, "A.ULTIMO_STATO", "FEDOCUULTSTA", 5, 50, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_LIST, 1236, 452, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_LIST, 52);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_FORM, 4, 724, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_FORM, 124);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELUTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CANCELUTENTE, -1, GRP_FEDOCUMENTAL_CANCELLATA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CANCELUTENTE, PPQRY_FEDOCUMENTA1, "A.CANCELLATA_UTENTE", "FEDOCUCANUTE", 5, 8, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_LIST, 1384, 452, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_LIST, 48);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_LIST, "Data");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_FORM, 4, 700, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_FORM, 112);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_CANCELLADATA, MyGlb.PANEL_FORM, "Data");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_CANCELLADATA, -1, GRP_FEDOCUMENTAL_CANCELLATA);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_CANCELLADATA, PPQRY_FEDOCUMENTA1, "A.CANCELLATA_DATA", "FEDOCUCANDAT", 6, 10, 0, -13997);
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_FEDOCUMENTAL.SetRect(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 892, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FEDOCUMENTAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_FEDOCUMENTAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FEDOCUMENTAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FEDOCUMENTAL_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_FEDOCUMENTAL.SetFieldPage(PFL_FEDOCUMENTAL_ORDINAMENTO, -1, -1);
    PAN_FEDOCUMENTAL.SetFieldUnbound(PFL_FEDOCUMENTAL_ORDINAMENTO, true);
    PAN_FEDOCUMENTAL.SetFieldPanel(PFL_FEDOCUMENTAL_ORDINAMENTO, PPQRY_FEDOCUMENTA1, "DECODE(~~PQRY_FILTRIFETBL1.NOMEOGGEACCE~~, 'SI', DECODE(B.STATO_VALIDAZIONE, NULL, -1, 1), 1)", "ORDINAMENTO", 1, 19, 0, -13997);
  }

  private void PAN_FEDOCUMENTAL_InitQueries()
  {
    StringBuffer SQL;

    PAN_FEDOCUMENTAL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FEDOCUMENTAL.SetIMDB(IMDB, "PQRY_FEDOCUMENTA1", true);
    PAN_FEDOCUMENTAL.set_SetString(MyGlb.MASTER_ROWNAME, "FE DOCUMENTALE");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ID_DOCUMENTO as FEDOCUIDDOCU, ");
    SQL.append("  DECODE(~~PQRY_FILTRIFETBL1.NOMEOGGEACCE~~, 'SI', DECODE(B.STATO_VALIDAZIONE, NULL, -1, 1), 1) as ORDINAMENTO, ");
    SQL.append("  A.ENTE as FEDOCUMEENTE, ");
    SQL.append("  A.MODELLO_DATI as FEDOCUMODDAT, ");
    SQL.append("  A.DATA_DOCUMENTO as FEDOCUDATDOC, ");
    SQL.append("  A.NUMERO_DOCUMENTO as FEDOCUNUMDOC, ");
    SQL.append("  A.RAGIONE_SOCIALE as FEDOCURAGSOC, ");
    SQL.append("  A.CODICE_FISCALE as FEDOCUCODFIS, ");
    SQL.append("  A.PARTITA_IVA as FEDOCUPARIVA, ");
    SQL.append("  A.CODICE_BENEFICIARIO as FEDOCUCODBEN, ");
    SQL.append("  A.ID_GDM as FEDOCUMIDGDM, ");
    SQL.append("  A.TIPO_DOCUMENTO as FEDOCUTIPDOC, ");
    SQL.append("  A.IMPORTO as FEDOCUMIMPOR, ");
    SQL.append("  A.NOME_FILE_XML as FEDOCNOMFIXM, ");
    SQL.append("  A.INFO_DOCUMENTO as FEDOCUINFDOC, ");
    SQL.append("  A.DATA_ARRIVO as FEDOCUDATARR, ");
    SQL.append("  A.ID_SDI as FEDOCUMIDSDI, ");
    SQL.append("  A.PROGRESSIVO_NUMERO as FEDOCUPRONUM, ");
    SQL.append("  A.PROGRESSIVO_ANNO as FEDOCUPROANN, ");
    SQL.append("  DECODE(NVL(" + IDL.CSql(MainFrm.SOSPFATTURE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N'), 'S', DECODE(A.PROGRESSIVO_ANNO, to_number(NULL), A.STATO_DOCUMENTO, DECODE(B.STATO_VALIDAZIONE, 'VALIDATA', 'VALIDATA', DECODE(B.STATO_VALIDAZIONE, 'RIFIUTATA', DECODE(A.STATO_DOCUMENTO, 'ACCETTATA', 'RIFIUTATA IN DECORRENZA', 'RIFIUTATA'), 'REGISTRATA'))), A.STATO_DOCUMENTO) as FEDOCUSTADOC, ");
    SQL.append("  A.PROGR_UO as FEDOCUPROGUO, ");
    SQL.append("  CASE WHEN ~~TBL_FILTRIFETBL.NOMOGGTIPPRO~~ = 'G' THEN A.PROT_GEN_NUMERO ELSE NVL(A.NUMERO_PROT, B.NUMERO_PROT) END as FEDOCPROGENU, ");
    SQL.append("  CASE WHEN ~~TBL_FILTRIFETBL.NOMOGGTIPPRO~~ = 'G' THEN A.PROT_GEN_DATA_ARRIVO ELSE NVL(A.D_DATA_PROT, B.D_DATA_PROT) END as FEDOPRGEDAAR, ");
    SQL.append("  A.ACCETTAZIONE_DATA as FEDOCUACCDAT, ");
    SQL.append("  A.ACCETTAZIONE_UTENTE as FEDOCUACCUTE, ");
    SQL.append("  A.RESPINTA_DATA as FEDOCURESDAT, ");
    SQL.append("  A.RESPINTA_UTENTE as FEDOCURESUTE, ");
    SQL.append("  CASE WHEN (A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI') THEN -1 ELSE 1 END as XML, ");
    SQL.append("  A.ESISTE_ALLEGATO as FEDOCUESIALL, ");
    SQL.append("  NVL(A.CODICE_FISCALE, A.PARTITA_IVA) as CODFISPARTIV, ");
    SQL.append("  NVL(A.MULTISERVIZI, 'NO') as MULTISERVIZI, ");
    SQL.append("  A.PARERE as FEDOCUMPARER, ");
    SQL.append("  NVL(A.CONTROLLO_BEN, 0) as FEDOCUCONBEN, ");
    SQL.append("  CASE WHEN (A.STATO_DOCUMENTO = 'IN_LAVORAZIONE' OR A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI' OR A.STATO_DOCUMENTO = 'DA_VERIFICARE_SU_SDI') THEN TRUNC( SYSDATE ) - A.DATA_ARRIVO ELSE to_number(NULL) END as GGGIACENZA1, ");
    SQL.append("  A.MOTIVAZIONE_RIFIUTO as FEDOCUMOTRIF, ");
    SQL.append("  DECODE(A.PROGRESSIVO_NUMERO, to_number(NULL), NULL, 'A') as FEDOCUAPRFAT, ");
    SQL.append("  CASE WHEN NOT ((A.PROGR_UO IS NULL)) THEN SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UO,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UO,TRUNC( SYSDATE )) ELSE '' END as DESCRIZIONE, ");
    SQL.append("  A.PARERE_NEG_NOTA as FEDOCPARNENO, ");
    SQL.append("  DECODE(A.PARERE_NEG_NOTA, NULL, NULL, 'P') as NOTAPARENEGA, ");
    SQL.append("  A.TOOLTIP_CONTROLLI as FEDOCUTOOCON, ");
    SQL.append("  CASE WHEN A.TRATTAMENTI_MISTI = 'S' THEN 'A' ELSE NULL END as FEDOCUMTRATT, ");
    SQL.append("  A.ULTIMO_STATO as FEDOCUULTSTA, ");
    SQL.append("  A.CANCELLATA_DATA as FEDOCUCANDAT, ");
    SQL.append("  A.CANCELLATA_UTENTE as FEDOCUCANUTE, ");
    SQL.append("  A.DATA_SCADENZA_XML as FEDOCDATSCXM, ");
    SQL.append("  A.DATA_SCADENZA_CALCOLATA as FEDOCDATSCCA, ");
    SQL.append("  A.COMUNICATO_PCC as FEDOCUCOMPCC, ");
    SQL.append("  B.AVVISO_FORNITORE as FEDOCFATAVFO, ");
    SQL.append("  CASE WHEN B.STATO_VALIDAZIONE = 'RIFIUTATA' AND (A.STATO_DOCUMENTO = 'ACCETTATA' OR A.STATO_DOCUMENTO = 'IN_LAVORAZIONE') THEN 'SI' ELSE 'NO' END as RIFIUTATA, ");
    SQL.append("  CASE WHEN B.STATO_VALIDAZIONE = 'VALIDATA' THEN 'SI' ELSE 'NO' END as VALIDATA ");
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FE_DOCUMENTALE A, ");
    SQL.append("  FAT B ");
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (('SI' = ~~TBL_FILTRIFETBL.NOMEOGGDAESA~~ AND (A.PROGRESSIVO_ANNO IS NULL) AND (A.STATO_DOCUMENTO = 'IN_LAVORAZIONE' OR A.STATO_DOCUMENTO = 'DA_VERIFICARE_SU_SDI' OR A.STATO_DOCUMENTO = 'DECORRENZA_TERMINI')) OR ('SI' = ~~TBL_FILTRIFETBL.NOMEOGGEACCE~~ AND A.STATO_DOCUMENTO = 'ACCETTATA' AND (NVL(" + IDL.CSql(MainFrm.SOSPFATTURE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N') = 'N' OR NVL(B.STATO_VALIDAZIONE, 'DA_VALIDARE') <> 'RIFIUTATA')) OR ('SI' = ~~TBL_FILTRIFETBL.NOMEOGGERIFI~~ AND (A.STATO_DOCUMENTO = 'RIFIUTATA' OR A.STATO_DOCUMENTO = 'RIFIUTO_INVIATO' OR A.STATO_DOCUMENTO = 'RIFIUTO_DA_INVIARE' OR A.STATO_DOCUMENTO = 'RIFIUTO_SCARTATO' OR (NVL(" + IDL.CSql(MainFrm.SOSPFATTURE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N') = 'S' AND NVL(B.STATO_VALIDAZIONE, 'DA_VALIDARE') = 'RIFIUTATA'))) OR (~~TBL_FILTRIFETBL.NOMEOGGECANC~~ = 'SI' AND A.STATO_DOCUMENTO = 'CANCELLATA')) ");
    SQL.append("and   (A.PROGRESSIVO_ANNO = B.ANNO_PROG(+)) ");
    SQL.append("and   (A.PROGRESSIVO_NUMERO = B.NUMERO_PROG(+)) ");
    SQL.append("and   (A.DATA_ARRIVO >= DECODE(~~PQRY_FILTRIFETBL1.NOMOGGDAARDA~~, to_date(NULL), A.DATA_ARRIVO, ~~PQRY_FILTRIFETBL1.NOMOGGDAARDA~~)) ");
    SQL.append("and   (A.DATA_ARRIVO <= DECODE(~~PQRY_FILTRIFETBL1.NOMOGGDAARAL~~, to_date(NULL), A.DATA_ARRIVO, ~~PQRY_FILTRIFETBL1.NOMOGGDAARAL~~)) ");
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 1 desc ");
    PAN_FEDOCUMENTAL.SetQuery(PPQRY_FEDOCUMENTA1, 5, SQL, -1, "");
    PAN_FEDOCUMENTAL.SetQueryDB(PPQRY_FEDOCUMENTA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FEDOCUMENTAL.SetMasterTable(0, "FE_DOCUMENTALE");
    PAN_FEDOCUMENTAL.AddToSortList(PFL_FEDOCUMENTAL_ORDINAMENTO, true);
    PAN_FEDOCUMENTAL.AddToSortList(PFL_FEDOCUMENTAL_IDDOCUMENTO, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FEDOCUMENTAL.Status() == 2)
    {
      int oldListQBE = PAN_FEDOCUMENTAL.iUseListQBE;
      PAN_FEDOCUMENTAL.iUseListQBE = 0;
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_SEARCH);
      PAN_FEDOCUMENTAL.PanelCommand(Glb.PCM_FIND);
      PAN_FEDOCUMENTAL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRI_Init()
  {

    PAN_FILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, "369EA4EE-7619-4602-80CF-10A2644AAA64");
    PAN_FILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, "Data Arrivo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, MyGlb.PANEL_LIST, 0, -9999, 96, 10, 0, 0);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, MyGlb.PANEL_FORM, 548, 10, 132, 62, 0, 0);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, 0, 65);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, 1, 13);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, 0, 2);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, 1, 2);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAARRIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, "C9CFF56A-43A1-488E-B684-657383064B9C");
    PAN_FILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, "Tipo Protocollo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 708, 10, 104, 62, 0, 0);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, 0, 84);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, 1, 13);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, 0, 2);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, 1, 2);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRI_TIPOPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, "D35EFFEC-E3B8-4C8D-A16C-8FB22447D461");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, "Da Esaminare");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, "0EC844D3-4D9D-4F3C-8EA4-04812F27510F");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, "Accettate");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, "8FD78525-0E57-475A-A952-4AD89E0B16C5");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, "Rifiutate");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, "94063C77-9242-4A52-8035-016A640EC9B1");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, "Cancellate");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, "67BA9814-C5CF-4C6D-ABDA-D8B5A4528B9A");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, "Dal");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, "CE61FC09-62E0-4BA8-83E9-F9866AC26F08");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, "Al");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, "2ECAC662-6221-4A70-BDBC-DE6BB8E874F7");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, "Tipo Protocollo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_LIST, 88);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_LIST, "Da Esam.");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_FORM, 0, 12, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_FORM, 104);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DAESAMINARE, MyGlb.PANEL_FORM, "Da Esaminare");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_DAESAMINARE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_DAESAMINARE, PPQRY_FILTRIFETBL1, "A.NOMEOGGDAESA", "NOMEOGGDAESA", 5, 50, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_DAESAMINARE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_DAESAMINARE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_LIST, 60);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_LIST, "Accettate");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_FORM, 152, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_FORM, 76);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ACCETTATE, MyGlb.PANEL_FORM, "Accettate");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ACCETTATE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ACCETTATE, PPQRY_FILTRIFETBL1, "A.NOMEOGGEACCE", "NOMEOGGEACCE", 5, 50, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ACCETTATE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ACCETTATE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_LIST, 56);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_LIST, "Rifiutate");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_FORM, 280, 12, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_FORM, 64);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_RIFIUTATE, MyGlb.PANEL_FORM, "Rifiutate");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_RIFIUTATE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_RIFIUTATE, PPQRY_FILTRIFETBL1, "A.NOMEOGGERIFI", "NOMEOGGERIFI", 5, 50, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_RIFIUTATE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_RIFIUTATE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_LIST, 68);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_LIST, "Cancellate");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_FORM, 400, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_FORM, 68);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CANCELLATE, MyGlb.PANEL_FORM, "Cancellate");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CANCELLATE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CANCELLATE, PPQRY_FILTRIFETBL1, "A.NOMEOGGECANC", "NOMEOGGECANC", 5, 50, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_CANCELLATE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_CANCELLATE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_LIST, 96);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_LIST, "Dal");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_FORM, 552, 24, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_FORM, 40);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVDAL, MyGlb.PANEL_FORM, "Dal");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_DATAARRIVDAL, -1, GRP_FILTRI_DATAARRIVO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_DATAARRIVDAL, PPQRY_FILTRIFETBL1, "A.NOMOGGDAARDA", "NOMOGGDAARDA", 6, 10, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_LIST, 88);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_LIST, "Al");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_FORM, 564, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_FORM, 28);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DATAARRIVOAL, MyGlb.PANEL_FORM, "Al");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_DATAARRIVOAL, -1, GRP_FILTRI_DATAARRIVO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_DATAARRIVOAL, PPQRY_FILTRIFETBL1, "A.NOMOGGDAARAL", "NOMOGGDAARAL", 6, 10, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 92);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, "Tipo Protocollo");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 712, 24, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 92);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 3);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, "Tipo Protocollo");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_TIPOPROTOCOL, -1, GRP_FILTRI_TIPOPROTOCOL);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_TIPOPROTOCOL, PPQRY_FILTRIFETBL1, "A.NOMOGGTIPPRO", "NOMOGGTIPPRO", 5, 50, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_TIPOPROTOCOL, (new IDVariant("I")), "Interno", "Interno", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_TIPOPROTOCOL, (new IDVariant("G")), "Generale", "Generale", "", -1);
  }

  private void PAN_FILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRI.SetIMDB(IMDB, "PQRY_FILTRIFETBL1", true);
    PAN_FILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_FILTRI.SetQueryIMDB(PPQRY_FILTRIFETBL1, IMDBDef10.PQRY_FILTRIFETBL1_RS, IMDBDef2.TBL_FILTRIFETBL);
    JustLoaded = true;
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_DAESAMINARE, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGDAESA);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_ACCETTATE, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGEACCE);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_RIFIUTATE, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGERIFI);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CANCELLATE, IMDBDef2.FLD_FILTRIFETBL_NOMEOGGECANC);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_DATAARRIVDAL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARDA);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_DATAARRIVOAL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGDAARAL);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_TIPOPROTOCOL, IMDBDef2.FLD_FILTRIFETBL_NOMOGGTIPPRO);
    PAN_FILTRI.SetMasterTable(0, "FILTRIFETBL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRI.Status() == 2)
    {
      int oldListQBE = PAN_FILTRI.iUseListQBE;
      PAN_FILTRI.iUseListQBE = 0;
      PAN_FILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_DynamicProperties();
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_OnChangeRow();
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_OnChangeSelection(NewVal, Final, Cancel);
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
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_AfterUpdate();
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
    if (SrcObj == PAN_FEDOCUMENTAL) PAN_FEDOCUMENTAL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
