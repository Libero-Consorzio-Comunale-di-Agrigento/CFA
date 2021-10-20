// **********************************************
// Risultato Elaborazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RisultatoElaborazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_DOCUMEELABOR_ANNOPROG1 = 0;
  private static int PFL_DOCUMEELABOR_NUMEROPROG1 = 1;
  private static int PFL_DOCUMEELABOR_ANNODOC1 = 2;
  private static int PFL_DOCUMEELABOR_NOTE1 = 3;
  private static int PFL_DOCUMEELABOR_FORNITORE1 = 4;
  private static int PFL_DOCUMEELABOR_NUMERODOC1 = 5;
  private static int PFL_DOCUMEELABOR_DATADOC1 = 6;
  private static int PFL_DOCUMEELABOR_CODICE1 = 7;
  private static int PFL_DOCUMEELABOR_DESCRIZIONE1 = 8;
  private static int PFL_DOCUMEELABOR_INFO1 = 9;
  private static int PFL_DOCUMEELABOR_DOCUMENLABE1 = 10;
  private static int PFL_DOCUMEELABOR_IMPORTO1 = 11;
  private static int PFL_DOCUMEELABOR_SALDO1 = 12;
  private static int PFL_DOCUMEELABOR_NUMEROPROT1 = 13;
  private static int PFL_DOCUMEELABOR_DDATAPROT1 = 14;
  private static int PFL_DOCUMEELABOR_NUMPROTGEN1 = 15;
  private static int PFL_DOCUMEELABOR_DATAARRIVO1 = 16;
  private static int PFL_DOCUMEELABOR_ETICPROTGEN1 = 17;
  private static int PFL_DOCUMEELABOR_ETICHEINTER1 = 18;

  private static int PPQRY_WRKDOCSAMAS1 = 0;

  private static int PPQRY_BEN1 = 1;


  IDPanel PAN_DOCUMEELABOR;
  private static int PFL_DOCUMNONELAB_ANNOPROG2 = 0;
  private static int PFL_DOCUMNONELAB_NUMEROPROG2 = 1;
  private static int PFL_DOCUMNONELAB_ANNODOC2 = 2;
  private static int PFL_DOCUMNONELAB_FORNITORE2 = 3;
  private static int PFL_DOCUMNONELAB_NUMERODOC2 = 4;
  private static int PFL_DOCUMNONELAB_DATADOC2 = 5;
  private static int PFL_DOCUMNONELAB_CODICE2 = 6;
  private static int PFL_DOCUMNONELAB_DESCRIZIONE2 = 7;
  private static int PFL_DOCUMNONELAB_INFO2 = 8;
  private static int PFL_DOCUMNONELAB_DOCUMENLABE2 = 9;
  private static int PFL_DOCUMNONELAB_IMPORTO2 = 10;
  private static int PFL_DOCUMNONELAB_SALDO2 = 11;
  private static int PFL_DOCUMNONELAB_NUMEROPROT2 = 12;
  private static int PFL_DOCUMNONELAB_DDATAPROT2 = 13;
  private static int PFL_DOCUMNONELAB_NUMPROTGEN2 = 14;
  private static int PFL_DOCUMNONELAB_DATAARRIVO2 = 15;
  private static int PFL_DOCUMNONELAB_ETICPROTGEN2 = 16;
  private static int PFL_DOCUMNONELAB_NOTE2 = 17;
  private static int PFL_DOCUMNONELAB_ETICHEINTER2 = 18;

  private static int PPQRY_WRKDOCSAMAS2 = 0;

  private static int PPQRY_BEN2 = 1;


  IDPanel PAN_DOCUMNONELAB;
  private static int GRP_DISTINGENERA_DISTINTA = 0;

  private static int PFL_DISTINGENERA_NUMERODISTIN = 0;
  private static int PFL_DISTINGENERA_ANNODISTINTA = 1;
  private static int PFL_DISTINGENERA_DATADISTINTA = 2;
  private static int PFL_DISTINGENERA_IMPORTO3 = 3;
  private static int PFL_DISTINGENERA_STATO = 4;
  private static int PFL_DISTINGENERA_PROGUNITORGA = 5;

  private static int PPQRY_WRKDISTSAMAS = 0;

  private static int PPQRY_LIQDISTINTA = 1;

  private static int PPQRY_DUAL = 2;


  IDPanel PAN_DISTINGENERA;
  private static int PFL_DISTINONGENE_ANNOPROG = 0;
  private static int PFL_DISTINONGENE_NUMEROPROG = 1;
  private static int PFL_DISTINONGENE_ANNODOC = 2;
  private static int PFL_DISTINONGENE_FORNITORE = 3;
  private static int PFL_DISTINONGENE_NUMERODOC = 4;
  private static int PFL_DISTINONGENE_DATADOC = 5;
  private static int PFL_DISTINONGENE_CODICE = 6;
  private static int PFL_DISTINONGENE_DESCRIZIONE = 7;
  private static int PFL_DISTINONGENE_INFO = 8;
  private static int PFL_DISTINONGENE_DOCUMENLABEL = 9;
  private static int PFL_DISTINONGENE_IMPORTO = 10;
  private static int PFL_DISTINONGENE_SALDO = 11;
  private static int PFL_DISTINONGENE_NUMEROPROT = 12;
  private static int PFL_DISTINONGENE_DDATAPROT = 13;
  private static int PFL_DISTINONGENE_NUMPROTGEN = 14;
  private static int PFL_DISTINONGENE_DATAARRIVO = 15;
  private static int PFL_DISTINONGENE_ETICPROTGENE = 16;
  private static int PFL_DISTINONGENE_NOTE = 17;
  private static int PFL_DISTINONGENE_ETICHEINTERN = 18;

  private static int PPQRY_WRKDOCSAMASH = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_DISTINONGENE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_WRKDOCSAMAS1(IMDB);
    Init_PQRY_WRKDOCSAMAS2(IMDB);
    Init_PQRY_WRKDISTSAMAS(IMDB);
    Init_PQRY_WRKDOCSAMASH(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_WRKDOCSAMAS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKDOCSAMAS1, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKDOCSAMAS1, "PQRY_WRKDOCSAMAS1");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANPR, "WRKDOCSAANPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSANUPR, "WRKDOCSANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSANUPR,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANDO, "WRKDOCSAANDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANDO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSANUDO, "WRKDOCSANUDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSANUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSADADO, "WRKDOCSADADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSADADO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMNOT, "WRKDOCSAMNOT");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMNOT,5,1024,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAFACO, "WRKDOCSAFACO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAFACO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAT0DE, "WRKDOCSAT0DE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAT0DE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAFAIM, "WRKDOCSAFAIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAFAIM,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMSAL, "WRKDOCSAMSAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMSAL,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFANUPR, "WRDOSAFANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFANUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFADDDP, "WRDOSAFADDDP");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFADDDP,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFANUPG, "WRDOSAFANUPG");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFANUPG,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFADAAR, "WRDOSAFADAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRDOSAFADAAR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMINF, "WRKDOCSAMINF");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS1,IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAMINF,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKDOCSAMAS1, 0);
  }

  private static void Init_PQRY_WRKDOCSAMAS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKDOCSAMAS2, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKDOCSAMAS2, "PQRY_WRKDOCSAMAS2");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANPR, "WRKDOCSAANPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSANUPR, "WRKDOCSANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSANUPR,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANDO, "WRKDOCSAANDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANDO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSANUDO, "WRKDOCSANUDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSANUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSADADO, "WRKDOCSADADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSADADO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMNOT, "WRKDOCSAMNOT");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMNOT,5,1024,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAFACO, "WRKDOCSAFACO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAFACO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAT0DE, "WRKDOCSAT0DE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAT0DE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAFAIM, "WRKDOCSAFAIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAFAIM,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMSAL, "WRKDOCSAMSAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMSAL,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFANUPR, "WRDOSAFANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFANUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFADDDP, "WRDOSAFADDDP");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFADDDP,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFANUPG, "WRDOSAFANUPG");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFANUPG,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFADAAR, "WRDOSAFADAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRDOSAFADAAR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMINF, "WRKDOCSAMINF");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMAS2,IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAMINF,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKDOCSAMAS2, 0);
  }

  private static void Init_PQRY_WRKDISTSAMAS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKDISTSAMAS, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKDISTSAMAS, "PQRY_WRKDISTSAMAS");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECONUMEDIST, "RECONUMEDIST");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECONUMEDIST,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECOANNODIST, "RECOANNODIST");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECOANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECDISLIDADI, "RECDISLIDADI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECDISLIDADI,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECORDSTATO, "RECORDSTATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_RECORDSTATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_REDILIPRUNOR, "REDILIPRUNOR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDISTSAMAS,IMDBDef10.PQSL_WRKDISTSAMAS_REDILIPRUNOR,1,8,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKDISTSAMAS, 0);
  }

  private static void Init_PQRY_WRKDOCSAMASH(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKDOCSAMASH, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKDOCSAMASH, "PQRY_WRKDOCSAMASH");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAANPR, "WRKDOCSAANPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSANUPR, "WRKDOCSANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSANUPR,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAANDO, "WRKDOCSAANDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAANDO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSANUDO, "WRKDOCSANUDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSANUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSADADO, "WRKDOCSADADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSADADO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMNOT, "WRKDOCSAMNOT");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMNOT,5,1024,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAFACO, "WRKDOCSAFACO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAFACO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAT0DE, "WRKDOCSAT0DE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAT0DE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAFAIM, "WRKDOCSAFAIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAFAIM,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMSAL, "WRKDOCSAMSAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMSAL,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFANUPR, "WRDOSAFANUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFANUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFADDDP, "WRDOSAFADDDP");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFADDDP,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFANUPG, "WRDOSAFANUPG");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFANUPG,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFADAAR, "WRDOSAFADAAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRDOSAFADAAR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMINF, "WRKDOCSAMINF");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKDOCSAMASH,IMDBDef10.PQSL_WRKDOCSAMASH_WRKDOCSAMINF,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKDOCSAMASH, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RisultatoElaborazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public RisultatoElaborazione()
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
    FormIdx = MyGlb.FRM_RISULTELABOR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "17D5B08A-6E19-45F6-8D4C-DCAFD6821600";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1112;
    DesignHeight = 410;
    set_Caption(new IDVariant("Risultato Elaborazione"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1112;
    Frames[1].Height = 384;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "F4BC31E9-BABD-40DB-89BC-28E59307BF6D";
    TAB_TAB.SetItemCount(4);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Documenti Elaborati";
    Frames[2].Parent = this;
    PAN_DOCUMEELABOR = new IDPanel(w, this, 2, "PAN_DOCUMEELABOR");
    Frames[2].Content = PAN_DOCUMEELABOR;
    PAN_DOCUMEELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMEELABOR.VS = MainFrm.VisualStyleList;
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1112-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DEEF4892-FD6B-4EC5-8A4E-1A52FC60340A");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1312, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMEELABOR.InitStatus = 2;
    PAN_DOCUMEELABOR_Init();
    PAN_DOCUMEELABOR_InitFields();
    PAN_DOCUMEELABOR_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Documenti Elaborati", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Documenti Non Elaborati";
    Frames[3].Parent = this;
    PAN_DOCUMNONELAB = new IDPanel(w, this, 3, "PAN_DOCUMNONELAB");
    Frames[3].Content = PAN_DOCUMNONELAB;
    PAN_DOCUMNONELAB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMNONELAB.VS = MainFrm.VisualStyleList;
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1112-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A7D99616-3E14-42E9-9D6A-9C44BC6E2BBB");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1708, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMNONELAB.InitStatus = 2;
    PAN_DOCUMNONELAB_Init();
    PAN_DOCUMNONELAB_InitFields();
    PAN_DOCUMNONELAB_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Documenti Non Elaborati", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Distinte Generate";
    Frames[4].Parent = this;
    PAN_DISTINGENERA = new IDPanel(w, this, 4, "PAN_DISTINGENERA");
    Frames[4].Content = PAN_DISTINGENERA;
    PAN_DISTINGENERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINGENERA.VS = MainFrm.VisualStyleList;
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1112-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "57451AC8-BD75-4F79-BD57-6A59D12DF537");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 992, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINGENERA.InitStatus = 2;
    PAN_DISTINGENERA_Init();
    PAN_DISTINGENERA_InitFields();
    PAN_DISTINGENERA_InitQueries();
    TAB_TAB.SetItem(3, Frames[4], 0, "", "Distinte Generate", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Distinte Non Generate";
    Frames[5].Parent = this;
    PAN_DISTINONGENE = new IDPanel(w, this, 5, "PAN_DISTINONGENE");
    Frames[5].Content = PAN_DISTINONGENE;
    PAN_DISTINONGENE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINONGENE.VS = MainFrm.VisualStyleList;
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1112-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3F41184-D07C-4266-94A8-7D38683FBFA0");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1708, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINONGENE.InitStatus = 2;
    PAN_DISTINONGENE_Init();
    PAN_DISTINONGENE_InitFields();
    PAN_DISTINONGENE_InitQueries();
    TAB_TAB.SetItem(4, Frames[5], 0, "", "Distinte Non Generate", "");
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
      PAN_DOCUMEELABOR.UpdatePanel(MainFrm);
      PAN_DOCUMNONELAB.UpdatePanel(MainFrm);
      PAN_DISTINGENERA.UpdatePanel(MainFrm);
      PAN_DISTINONGENE.UpdatePanel(MainFrm);
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
    return (obj instanceof RisultatoElaborazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RisultatoElaborazione.class.getName() : (Glb.ClassWithPackage(RisultatoElaborazione.class) ? RisultatoElaborazione.class.getName().substring(RisultatoElaborazione.class.getPackage().getName().length() + 1) : RisultatoElaborazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "Load", _e);
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
      SQL = new StringBuffer();
      SQL.append("delete from WRK_DOC_SAMASH ");
      SQL.append("where (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("delete from WRK_DIST_SAMASH ");
      SQL.append("where (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "Unload", _e);
    }
  }

  // **********************************************************************
  // Info
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_INFOFATTURA, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOFATTURA,(new IDVariant(0)).booleanValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS1, IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANPR, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS1, IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSAANPR, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS1, IMDBDef10.PQSL_WRKDOCSAMAS1_WRKDOCSANUPR, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "Info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti Elaborati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMEELABOR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMEELABOR);
      // 
      // Documenti Elaborati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DOCUMEELABOR.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMEELABOR_FORNITORE1,(new IDVariant(PAN_DOCUMEELABOR.FieldText(PFL_DOCUMEELABOR_FORNITORE1))).stringValue()); 
      PAN_DOCUMEELABOR.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMEELABOR_NUMERODOC1,(new IDVariant(PAN_DOCUMEELABOR.FieldText(PFL_DOCUMEELABOR_NUMERODOC1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "DocumentiElaboratiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Documenti Non Elaborati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMNONELAB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMNONELAB);
      // 
      // Documenti Non Elaborati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DOCUMNONELAB.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMNONELAB_FORNITORE2,(new IDVariant(PAN_DOCUMNONELAB.FieldText(PFL_DOCUMNONELAB_FORNITORE2))).stringValue()); 
      PAN_DOCUMNONELAB.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMNONELAB_NUMERODOC2,(new IDVariant(PAN_DOCUMNONELAB.FieldText(PFL_DOCUMNONELAB_NUMERODOC2))).stringValue()); 
      PAN_DOCUMNONELAB.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMNONELAB_NOTE2,(new IDVariant(PAN_DOCUMNONELAB.FieldText(PFL_DOCUMNONELAB_NOTE2))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "DocumentiNonElaboratiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Info1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info 1 Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_INFOFATTURA, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOFATTURA,(new IDVariant(0)).booleanValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS2, IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANPR, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS2, IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSAANPR, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_WRKDOCSAMAS2, IMDBDef10.PQSL_WRKDOCSAMAS2_WRKDOCSANUPR, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "Info1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Distinte Non Generate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINONGENE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTINONGENE);
      // 
      // Distinte Non Generate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DISTINONGENE.set_ToolTip(Glb.OBJ_FIELD,PFL_DISTINONGENE_NOTE,(new IDVariant(PAN_DISTINONGENE.FieldText(PFL_DISTINONGENE_NOTE))).stringValue()); 
      PAN_DISTINONGENE.set_ToolTip(Glb.OBJ_FIELD,PFL_DISTINONGENE_FORNITORE,(new IDVariant(PAN_DISTINONGENE.FieldText(PFL_DISTINONGENE_FORNITORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoElaborazione", "DistinteNonGenerateOnDynamicProperties", _e);
    }
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMEELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMEELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMEELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMEELABOR, Cancel);
    // Stub
  }

  private void PAN_DOCUMEELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMEELABOR_INFO1)
    {
      this.IdxPanelActived = this.PAN_DOCUMEELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMEELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMEELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMEELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMNONELAB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMNONELAB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMNONELAB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMNONELAB, Cancel);
    // Stub
  }

  private void PAN_DOCUMNONELAB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMNONELAB_INFO2)
    {
      this.IdxPanelActived = this.PAN_DOCUMNONELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMNONELAB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMNONELAB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMNONELAB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISTINGENERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINGENERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINGENERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINGENERA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINGENERA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISTINGENERA);
    // Stub
  }

  private void PAN_DISTINGENERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTINGENERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINGENERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINGENERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISTINONGENE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINONGENE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINONGENE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINONGENE, Cancel);
    // Stub
  }

  private void PAN_DISTINONGENE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISTINONGENE_INFO)
    {
      this.IdxPanelActived = this.PAN_DISTINONGENE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISTINONGENE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINONGENE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINONGENE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DOCUMEELABOR_Init()
  {

    PAN_DOCUMEELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMEELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMEELABOR.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, "43F345B6-0D34-4930-B92D-444CCA63D482");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, "ANNO PROG");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, "3EEA09F8-A577-4454-AEB7-D0BD4743152B");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, "NUMERO PROG");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, "81B802B6-8C04-45A1-BF42-C4BD305CE96D");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, "ANNO DOC");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, "BBFD7EF5-C0C7-4250-B331-3358F57D6692");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, "NOTE");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, "06DB7B68-3FCD-4203-96E3-E7A8D76A3B3D");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, "Fornitore");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, "19D26D9E-C9D0-4693-B458-116A8BE162F4");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, "NUMERO DOC");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, "AAE6E181-53D8-4ABD-B062-F5855759F1F8");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, "DATA DOC");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, "BEDE2C7B-F4D7-4923-B05D-C4A285ACB8A8");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, "CODICE");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.VIS_NORFIEINTLUN);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, 0, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, "B65D9EA8-6024-4A1C-BAF7-0D211D3A3EC4");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, "DESCRIZIONE");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, "596C9729-7A42-4454-B981-CD76E87042C6");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, "Info");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, "77557036-C1FE-487F-A72A-127911A0EBC8");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, "Documento");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, "48E441B1-16D0-4A3B-9C3D-C9E34DA6CE89");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, "Importo");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, "Importo");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, "A67A3D08-820D-4B2C-A9EB-D5AB1E969171");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, "Saldo");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, "62BA28D7-781D-46FC-A80E-C5A536F39DB0");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, "NUMERO PROT");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, "5D4EEA05-1ED7-43D1-9F3C-485571988075");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, "D DATA PROT");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, "29A75FCE-F97B-4A18-96FA-7EEF2304A59E");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, "NUM PROT GEN");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, "0BCBE990-34E4-4EE8-9D34-8E88446D4B36");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, "DATA ARRIVO");
    PAN_DOCUMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, "");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, "7636125E-6319-4A1C-B2F0-6E73E59BADFF");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, "Protocollo Generale");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, "41008A91-5DD2-4644-A0AC-2897F3A52108");
    PAN_DOCUMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, "Protocollo Interno");
    PAN_DOCUMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DOCUMEELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNOPROG1, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_ANNOPROG1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_ANNOPROG1, PPQRY_WRKDOCSAMAS1, "A.ANNO_PROG", "WRKDOCSAANPR", 1, 4, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_LIST, "NUM. PROG");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROG1, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_NUMEROPROG1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_NUMEROPROG1, PPQRY_WRKDOCSAMAS1, "A.NUMERO_PROG", "WRKDOCSANUPR", 1, 5, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ANNODOC1, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_ANNODOC1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_ANNODOC1, PPQRY_WRKDOCSAMAS1, "A.ANNO_DOC", "WRKDOCSAANDO", 1, 4, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_LIST, 0, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_LIST, 48);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_LIST, "NOTE");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_FORM, 4, 196, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NOTE1, MyGlb.PANEL_FORM, "NOTE");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_NOTE1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_NOTE1, PPQRY_WRKDOCSAMAS1, "A.NOTE", "WRKDOCSAMNOT", 5, 1024, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_LIST, 176);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_LIST, "Fornitore");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_FORM, 4, 244, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_FORM, 176);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_FORNITORE1, MyGlb.PANEL_FORM, "Fornitore");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_FORNITORE1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_FORNITORE1, PPQRY_BEN1, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOCEST", 5, 60, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_LIST, 308, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_FORM, 4, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMERODOC1, MyGlb.PANEL_FORM, "NUMERO DOC");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_NUMERODOC1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_NUMERODOC1, PPQRY_WRKDOCSAMAS1, "A.NUMERO_DOC", "WRKDOCSANUDO", 5, 20, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_LIST, 484, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATADOC1, MyGlb.PANEL_FORM, "DATA DOC");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_DATADOC1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_DATADOC1, PPQRY_WRKDOCSAMAS1, "A.DATA_DOC", "WRKDOCSADADO", 6, 10, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_LIST, 192, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_LIST, "CODICE");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_FORM, 4, 244, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_CODICE1, MyGlb.PANEL_FORM, "CODICE");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_CODICE1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_CODICE1, PPQRY_WRKDOCSAMAS1, "B.CODICE", "WRKDOCSAFACO", 1, 6, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_LIST, 556, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 268, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DESCRIZIONE1, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_DESCRIZIONE1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_DESCRIZIONE1, PPQRY_WRKDOCSAMAS1, "C.DESCRIZIONE", "WRKDOCSAT0DE", 5, 40, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_LIST, 728, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_LIST, 32);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_LIST, "I.");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_FORM, 4, 436, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_FORM, 32);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_INFO1, MyGlb.PANEL_FORM, "Info");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_INFO1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldUnbound(PFL_DOCUMEELABOR_INFO1, true);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_INFO1, PPQRY_WRKDOCSAMAS1, "'I'", "WRKDOCSAMINF", 5, 1, 0, -13997);
    PAN_DOCUMEELABOR.SetValueListItem(PFL_DOCUMEELABOR_INFO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMEELABOR.SetValueListItem(PFL_DOCUMEELABOR_INFO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMEELABOR.SetValueListItem(PFL_DOCUMEELABOR_INFO1, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_LIST, 308, 0, 440, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_FORM, 304, 180, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DOCUMENLABE1, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_DOCUMENLABE1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_DOCUMENLABE1, -1, "", "DOCUMENLABE1", 0, 0, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_LIST, 748, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_FORM, 4, 316, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_IMPORTO1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_IMPORTO1, PPQRY_WRKDOCSAMAS1, "B.IMPORTO", "WRKDOCSAFAIM", 3, 14, 2, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_LIST, 880, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_LIST, 40);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_LIST, "Saldo");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_FORM, 4, 292, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_FORM, 40);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_SALDO1, MyGlb.PANEL_FORM, "Saldo");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_SALDO1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldUnbound(PFL_DOCUMEELABOR_SALDO1, true);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_SALDO1, PPQRY_WRKDOCSAMAS1, "B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0)", "WRKDOCSAMSAL", 3, 28, 6, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_LIST, 1012, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_LIST, "NUMERO PROT");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_FORM, 4, 340, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMEROPROT1, MyGlb.PANEL_FORM, "NUMERO PROT");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_NUMEROPROT1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_NUMEROPROT1, PPQRY_WRKDOCSAMAS1, "B.NUMERO_PROT", "WRDOSAFANUPR", 1, 7, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_LIST, 1084, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_LIST, "D DATA PROT");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_FORM, 4, 364, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DDATAPROT1, MyGlb.PANEL_FORM, "D DATA PROT");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_DDATAPROT1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_DDATAPROT1, PPQRY_WRKDOCSAMAS1, "B.D_DATA_PROT", "WRDOSAFADDDP", 6, 10, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_LIST, "NUM PROT GEN");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_FORM, 4, 388, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_FORM, 92);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_NUMPROTGEN1, MyGlb.PANEL_FORM, "NUM PROT GEN");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_NUMPROTGEN1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_NUMPROTGEN1, PPQRY_WRKDOCSAMAS1, "B.NUM_PROT_GEN", "WRDOSAFANUPG", 3, 10, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_LIST, 1232, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_LIST, "DATA ARRIVO");
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_FORM, 4, 412, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_DATAARRIVO1, MyGlb.PANEL_FORM, "DATA ARRIVO");
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_DATAARRIVO1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_DATAARRIVO1, PPQRY_WRKDOCSAMAS1, "B.DATA_ARRIVO", "WRDOSAFADAAR", 6, 10, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_LIST, 1160, 0, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_FORM, 1040, 244, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICPROTGEN1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_ETICPROTGEN1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_ETICPROTGEN1, -1, "", "ETICPROTGEN1", 0, 0, 0, -13997);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_LIST, 1012, 0, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_FORM, 1048, 252, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMEELABOR_ETICHEINTER1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMEELABOR.SetFieldPage(PFL_DOCUMEELABOR_ETICHEINTER1, -1, -1);
    PAN_DOCUMEELABOR.SetFieldPanel(PFL_DOCUMEELABOR_ETICHEINTER1, -1, "", "ETICHEINTER1", 0, 0, 0, -13997);
  }

  private void PAN_DOCUMEELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMEELABOR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~WRKDOCSAFACO~~) ");
    PAN_DOCUMEELABOR.SetQuery(PPQRY_BEN1, 0, SQL, -1, "");
    PAN_DOCUMEELABOR.SetQueryDB(PPQRY_BEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMEELABOR.SetMasterTable(PPQRY_BEN1, "BEN");
    PAN_DOCUMEELABOR.SetIMDB(IMDB, "PQRY_WRKDOCSAMAS1", true);
    PAN_DOCUMEELABOR.set_SetString(MyGlb.MASTER_ROWNAME, "WRK DOC SAMASH");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ANNO_PROG as WRKDOCSAANPR, ");
    SQL.append("  A.NUMERO_PROG as WRKDOCSANUPR, ");
    SQL.append("  A.ANNO_DOC as WRKDOCSAANDO, ");
    SQL.append("  A.NUMERO_DOC as WRKDOCSANUDO, ");
    SQL.append("  A.DATA_DOC as WRKDOCSADADO, ");
    SQL.append("  A.NOTE as WRKDOCSAMNOT, ");
    SQL.append("  B.CODICE as WRKDOCSAFACO, ");
    SQL.append("  C.DESCRIZIONE as WRKDOCSAT0DE, ");
    SQL.append("  B.IMPORTO as WRKDOCSAFAIM, ");
    SQL.append("  B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0) as WRKDOCSAMSAL, ");
    SQL.append("  B.NUMERO_PROT as WRDOSAFANUPR, ");
    SQL.append("  B.D_DATA_PROT as WRDOSAFADDDP, ");
    SQL.append("  B.NUM_PROT_GEN as WRDOSAFANUPG, ");
    SQL.append("  B.DATA_ARRIVO as WRDOSAFADAAR, ");
    SQL.append("  'I' as WRKDOCSAMINF ");
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_DOC_SAMASH A, ");
    SQL.append("  FAT B, ");
    SQL.append("  T03 C ");
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.STATO = 'EL') ");
    SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
    SQL.append("and   (C.CODICE = B.CODICE_DOC) ");
    SQL.append("and   (C.STORNO = NVL(B.STORNO, 0)) ");
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC, ");
    SQL.append("  A.DATA_DOC ");
    PAN_DOCUMEELABOR.SetQuery(PPQRY_WRKDOCSAMAS1, 5, SQL, -1, "");
    PAN_DOCUMEELABOR.SetQueryDB(PPQRY_WRKDOCSAMAS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMEELABOR.SetMasterTable(0, "WRK_DOC_SAMASH");
    PAN_DOCUMEELABOR.AddToSortList(PFL_DOCUMEELABOR_ANNODOC1, true);
    PAN_DOCUMEELABOR.AddToSortList(PFL_DOCUMEELABOR_NUMERODOC1, true);
    PAN_DOCUMEELABOR.AddToSortList(PFL_DOCUMEELABOR_DATADOC1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMEELABOR.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMEELABOR.iUseListQBE;
      PAN_DOCUMEELABOR.iUseListQBE = 0;
      PAN_DOCUMEELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMEELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMEELABOR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCUMNONELAB_Init()
  {

    PAN_DOCUMNONELAB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMNONELAB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMNONELAB.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, "D9E202D6-234E-4616-84F5-726EBEEFC630");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, "ANNO PROG");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, "5AD41154-4622-4F97-A032-202096DFD7FA");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, "NUMERO PROG");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, "6F010166-DBCA-414C-864D-F1649007194D");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, "ANNO DOC");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, 0, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, "56C2A242-8BFE-4439-A928-DFDFF226B347");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, "Fornitore");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, "AE725878-95E7-4FCC-99E2-BDA29CAC3DE3");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, "NUMERO DOC");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, "E17A5DD3-C336-41E0-9639-BA40A1211AC9");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, "DATA DOC");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, "36DFC587-7468-4179-B8F7-4CA2A5941A62");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, "CODICE");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.VIS_NORFIEINTLUN);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, 0, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, "65CE90CA-8DB4-4E59-9D04-2A21A2066E34");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, "DESCRIZIONE");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, "97F93ED4-7FEA-441A-9896-4D7E46D44FBE");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, "Info");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, "5E4F7028-E617-4D98-8CA3-C894C135DA30");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, "Documento");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, "67DB71B0-7E9B-4D1D-AC83-F9964896FE58");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, "Importo");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, "Importo");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, "335CAA60-9FBD-4E39-B7C4-E2F9E43E7DE0");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, "Saldo");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, "F7F534A5-54F8-4672-9495-B2778F1F8C52");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, "NUMERO PROT");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, "FAFEA1C6-480E-4073-A7D7-F57DF405EF09");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, "D DATA PROT");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, "DE76043B-FB02-487E-8A93-57D2F2A209AC");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, "NUM PROT GEN");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, "89EB94CA-419E-4BD5-9E17-FFB11D1DF0D6");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, "DATA ARRIVO");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, "5143A89F-1812-4FB2-9263-4E69FC7F9F95");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, "Protocollo Generale");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, "8D48EC98-4667-4EBD-87B6-93804263F2B4");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, "NOTE");
    PAN_DOCUMNONELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, "");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMNONELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, "C37A65B7-5D95-4CBB-8B98-CBE51F8CFB45");
    PAN_DOCUMNONELAB.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, "Protocollo Interno");
    PAN_DOCUMNONELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMNONELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DOCUMNONELAB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNOPROG2, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_ANNOPROG2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_ANNOPROG2, PPQRY_WRKDOCSAMAS2, "A.ANNO_PROG", "WRKDOCSAANPR", 1, 4, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_LIST, "NUM. PROG");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROG2, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_NUMEROPROG2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_NUMEROPROG2, PPQRY_WRKDOCSAMAS2, "A.NUMERO_PROG", "WRKDOCSANUPR", 1, 5, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ANNODOC2, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_ANNODOC2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_ANNODOC2, PPQRY_WRKDOCSAMAS2, "A.ANNO_DOC", "WRKDOCSAANDO", 1, 4, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_LIST, 176);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_LIST, "Fornitore");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_FORM, 4, 244, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_FORM, 176);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_FORNITORE2, MyGlb.PANEL_FORM, "Fornitore");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_FORNITORE2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_FORNITORE2, PPQRY_BEN2, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOCEST", 5, 60, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_LIST, 308, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_FORM, 28, 10, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMERODOC2, MyGlb.PANEL_FORM, "NUMERO DOC");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_NUMERODOC2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_NUMERODOC2, PPQRY_WRKDOCSAMAS2, "A.NUMERO_DOC", "WRKDOCSANUDO", 5, 20, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_LIST, 484, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_FORM, 260, 12, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATADOC2, MyGlb.PANEL_FORM, "DATA DOC");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_DATADOC2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_DATADOC2, PPQRY_WRKDOCSAMAS2, "A.DATA_DOC", "WRKDOCSADADO", 6, 10, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_LIST, 192, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_LIST, 52);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_LIST, "CODICE");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_FORM, 4, 244, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_FORM, 52);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_CODICE2, MyGlb.PANEL_FORM, "CODICE");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_CODICE2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_CODICE2, PPQRY_WRKDOCSAMAS2, "B.CODICE", "WRKDOCSAFACO", 1, 6, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_LIST, 556, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 268, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DESCRIZIONE2, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_DESCRIZIONE2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_DESCRIZIONE2, PPQRY_WRKDOCSAMAS2, "C.DESCRIZIONE", "WRKDOCSAT0DE", 5, 40, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_LIST, 728, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_LIST, 32);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_LIST, "I.");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_FORM, 4, 436, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_FORM, 32);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_INFO2, MyGlb.PANEL_FORM, "Info");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_INFO2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldUnbound(PFL_DOCUMNONELAB_INFO2, true);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_INFO2, PPQRY_WRKDOCSAMAS2, "'I'", "WRKDOCSAMINF", 5, 1, 0, -13997);
    PAN_DOCUMNONELAB.SetValueListItem(PFL_DOCUMNONELAB_INFO2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMNONELAB.SetValueListItem(PFL_DOCUMNONELAB_INFO2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMNONELAB.SetValueListItem(PFL_DOCUMNONELAB_INFO2, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_LIST, 308, 0, 440, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_FORM, 304, 180, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DOCUMENLABE2, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_DOCUMENLABE2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_DOCUMENLABE2, -1, "", "DOCUMENLABE2", 0, 0, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_LIST, 748, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_FORM, 540, 12, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_IMPORTO2, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_IMPORTO2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_IMPORTO2, PPQRY_WRKDOCSAMAS2, "B.IMPORTO", "WRKDOCSAFAIM", 3, 14, 2, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_LIST, 880, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_LIST, 40);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_LIST, "Saldo");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_FORM, 4, 292, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_FORM, 40);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_SALDO2, MyGlb.PANEL_FORM, "Saldo");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_SALDO2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldUnbound(PFL_DOCUMNONELAB_SALDO2, true);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_SALDO2, PPQRY_WRKDOCSAMAS2, "B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0)", "WRKDOCSAMSAL", 3, 28, 6, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_LIST, 1012, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_LIST, "NUMERO PROT");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_FORM, 4, 340, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMEROPROT2, MyGlb.PANEL_FORM, "NUMERO PROT");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_NUMEROPROT2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_NUMEROPROT2, PPQRY_WRKDOCSAMAS2, "B.NUMERO_PROT", "WRDOSAFANUPR", 1, 7, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_LIST, 1084, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_LIST, "D DATA PROT");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_FORM, 4, 364, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DDATAPROT2, MyGlb.PANEL_FORM, "D DATA PROT");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_DDATAPROT2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_DDATAPROT2, PPQRY_WRKDOCSAMAS2, "B.D_DATA_PROT", "WRDOSAFADDDP", 6, 10, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_LIST, "NUM PROT GEN");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_FORM, 4, 388, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_FORM, 92);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NUMPROTGEN2, MyGlb.PANEL_FORM, "NUM PROT GEN");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_NUMPROTGEN2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_NUMPROTGEN2, PPQRY_WRKDOCSAMAS2, "B.NUM_PROT_GEN", "WRDOSAFANUPG", 3, 10, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_LIST, 1232, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_LIST, "DATA ARRIVO");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_FORM, 4, 412, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_DATAARRIVO2, MyGlb.PANEL_FORM, "DATA ARRIVO");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_DATAARRIVO2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_DATAARRIVO2, PPQRY_WRKDOCSAMAS2, "B.DATA_ARRIVO", "WRDOSAFADAAR", 6, 10, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_LIST, 1158, 0, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_FORM, 1040, 244, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICPROTGEN2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_ETICPROTGEN2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_ETICPROTGEN2, -1, "", "ETICPROTGEN2", 0, 0, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_LIST, 1312, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_LIST, 48);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_LIST, "NOTE");
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_FORM, 28, 36, 716, 112, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_FORM, 8);
    PAN_DOCUMNONELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_NOTE2, MyGlb.PANEL_FORM, "NOTE");
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_NOTE2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_NOTE2, PPQRY_WRKDOCSAMAS2, "A.NOTE", "WRKDOCSAMNOT", 5, 1024, 0, -13997);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_LIST, 1012, 0, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMNONELAB.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_FORM, 1048, 252, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMNONELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMNONELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMNONELAB_ETICHEINTER2, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMNONELAB.SetFieldPage(PFL_DOCUMNONELAB_ETICHEINTER2, -1, -1);
    PAN_DOCUMNONELAB.SetFieldPanel(PFL_DOCUMNONELAB_ETICHEINTER2, -1, "", "ETICHEINTER2", 0, 0, 0, -13997);
  }

  private void PAN_DOCUMNONELAB_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMNONELAB.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~WRKDOCSAFACO~~) ");
    PAN_DOCUMNONELAB.SetQuery(PPQRY_BEN2, 0, SQL, -1, "");
    PAN_DOCUMNONELAB.SetQueryDB(PPQRY_BEN2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMNONELAB.SetMasterTable(PPQRY_BEN2, "BEN");
    PAN_DOCUMNONELAB.SetIMDB(IMDB, "PQRY_WRKDOCSAMAS2", true);
    PAN_DOCUMNONELAB.set_SetString(MyGlb.MASTER_ROWNAME, "WRK DOC SAMASH");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ANNO_PROG as WRKDOCSAANPR, ");
    SQL.append("  A.NUMERO_PROG as WRKDOCSANUPR, ");
    SQL.append("  A.ANNO_DOC as WRKDOCSAANDO, ");
    SQL.append("  A.NUMERO_DOC as WRKDOCSANUDO, ");
    SQL.append("  A.DATA_DOC as WRKDOCSADADO, ");
    SQL.append("  A.NOTE as WRKDOCSAMNOT, ");
    SQL.append("  B.CODICE as WRKDOCSAFACO, ");
    SQL.append("  C.DESCRIZIONE as WRKDOCSAT0DE, ");
    SQL.append("  B.IMPORTO as WRKDOCSAFAIM, ");
    SQL.append("  B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0) as WRKDOCSAMSAL, ");
    SQL.append("  B.NUMERO_PROT as WRDOSAFANUPR, ");
    SQL.append("  B.D_DATA_PROT as WRDOSAFADDDP, ");
    SQL.append("  B.NUM_PROT_GEN as WRDOSAFANUPG, ");
    SQL.append("  B.DATA_ARRIVO as WRDOSAFADAAR, ");
    SQL.append("  'I' as WRKDOCSAMINF ");
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_DOC_SAMASH A, ");
    SQL.append("  FAT B, ");
    SQL.append("  T03 C ");
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.STATO = 'NEL') ");
    SQL.append("and   (B.ANNO_PROG(+) = A.ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG(+) = A.NUMERO_PROG) ");
    SQL.append("and   (C.CODICE(+) = B.CODICE_DOC) ");
    SQL.append("and   (C.STORNO(+) = NVL(B.STORNO, 0)) ");
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC, ");
    SQL.append("  A.DATA_DOC ");
    PAN_DOCUMNONELAB.SetQuery(PPQRY_WRKDOCSAMAS2, 5, SQL, -1, "");
    PAN_DOCUMNONELAB.SetQueryDB(PPQRY_WRKDOCSAMAS2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMNONELAB.SetMasterTable(0, "WRK_DOC_SAMASH");
    PAN_DOCUMNONELAB.AddToSortList(PFL_DOCUMNONELAB_ANNODOC2, true);
    PAN_DOCUMNONELAB.AddToSortList(PFL_DOCUMNONELAB_NUMERODOC2, true);
    PAN_DOCUMNONELAB.AddToSortList(PFL_DOCUMNONELAB_DATADOC2, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMNONELAB.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMNONELAB.iUseListQBE;
      PAN_DOCUMNONELAB.iUseListQBE = 0;
      PAN_DOCUMNONELAB.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMNONELAB.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMNONELAB.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISTINGENERA_Init()
  {

    PAN_DISTINGENERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINGENERA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, "7EDA8024-7581-4407-8A83-0CE18DCF5581");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, "Distinta");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, MyGlb.PANEL_FORM, 0, -21, 164, 73, 0, 0);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, 0, 44);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, 1, 13);
    PAN_DISTINGENERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, 0, 4);
    PAN_DISTINGENERA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, 1, 4);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINGENERA_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINGENERA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, "D8383BBD-22A4-4774-B0BB-F08F35E66D38");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, "Numero Distinta");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, "0CDEBD43-9477-444B-8E71-2E79A37B0048");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, "Anno Distinta");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, "E49B1C38-6F4C-4985-B9AE-EE5FB859705E");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, "Data");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, "Data");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, "B237DCB1-57D4-496C-B488-283EF56BEF64");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, "Importo");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, "25FF7CCF-1E12-4760-B384-1AA7F2F13F0A");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, "Stato");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINGENERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, "7C9DA826-9CB5-459B-9AB5-62C58F991C15");
    PAN_DISTINGENERA.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, "Unità Organizzativa");
    PAN_DISTINGENERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, "");
    PAN_DISTINGENERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINGENERA.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTINGENERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_LIST, 112);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero Distinta");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_FORM, 112);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero Distinta");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_NUMERODISTIN, -1, GRP_DISTINGENERA_DISTINTA);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_NUMERODISTIN, PPQRY_WRKDISTSAMAS, "A.NUMERO_DISTINTA", "RECONUMEDIST", 1, 5, 0, -13997);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_LIST, 112, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno Distinta");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_FORM, 96);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_ANNODISTINTA, -1, GRP_DISTINGENERA_DISTINTA);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_ANNODISTINTA, PPQRY_WRKDISTSAMAS, "A.ANNO_DISTINTA", "RECOANNODIST", 1, 4, 0, -13997);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_LIST, 208, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_FORM, 4, 76, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_FORM, 96);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_DATADISTINTA, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_DATADISTINTA, -1, -1);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_DATADISTINTA, PPQRY_WRKDISTSAMAS, "B.DATA_DISTINTA", "RECDISLIDADI", 6, 19, 0, -13997);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_LIST, 276, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_LIST, 192);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_FORM, 4, 52, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_FORM, 192);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_IMPORTO3, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_IMPORTO3, -1, -1);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_IMPORTO3, PPQRY_LIQDISTINTA, "SUM(A.IMPORTO)", "NUOVAESPRESS", 3, 28, 6, -13997);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_LIST, 408, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_LIST, 48);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_FORM, 4, 100, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_FORM, 48);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_STATO, -1, -1);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_STATO, PPQRY_WRKDISTSAMAS, "B.STATO", "RECORDSTATO", 1, 2, 0, -13997);
    PAN_DISTINGENERA.SetValueListItem(PFL_DISTINGENERA_STATO, (new IDVariant(10)), "In preparazione", "", "", -1);
    PAN_DISTINGENERA.SetValueListItem(PFL_DISTINGENERA_STATO, (new IDVariant(20)), "Completa", "", "", -1);
    PAN_DISTINGENERA.SetValueListItem(PFL_DISTINGENERA_STATO, (new IDVariant(25)), "Inclusa in Atto", "", "", -1);
    PAN_DISTINGENERA.SetValueListItem(PFL_DISTINGENERA_STATO, (new IDVariant(27)), "Liquidabile", "", "", -1);
    PAN_DISTINGENERA.SetValueListItem(PFL_DISTINGENERA_STATO, (new IDVariant(30)), "Liquidata", "", "", -1);
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_LIST, 524, 36, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DISTINGENERA.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 124, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINGENERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_DISTINGENERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINGENERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINGENERA_PROGUNITORGA, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_DISTINGENERA.SetFieldPage(PFL_DISTINGENERA_PROGUNITORGA, -1, -1);
    PAN_DISTINGENERA.SetFieldPanel(PFL_DISTINGENERA_PROGUNITORGA, PPQRY_WRKDISTSAMAS, "B.PROGR_UNITA_ORGANIZZATIVA", "REDILIPRUNOR", 1, 8, 0, -13997);
  }

  private void PAN_DISTINGENERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINGENERA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(A.IMPORTO) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA A ");
    SQL.append("where (A.ANNO_DISTINTA = ~~RECOANNODIST~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA = ~~RECONUMEDIST~~) ");
    PAN_DISTINGENERA.SetQuery(PPQRY_LIQDISTINTA, 0, SQL, -1, "");
    PAN_DISTINGENERA.SetQueryDB(PPQRY_LIQDISTINTA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINGENERA.SetMasterTable(PPQRY_LIQDISTINTA, "LIQ_DISTINTA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DUSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DUSOANUNORCU ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~REDILIPRUNOR~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((~~REDILIPRUNOR~~ IS NULL))) ");
    PAN_DISTINGENERA.SetQuery(PPQRY_DUAL, 0, SQL, PFL_DISTINGENERA_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DUSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DUSOANUNORCU ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((~~REDILIPRUNOR~~ IS NULL))) ");
    PAN_DISTINGENERA.SetQuery(PPQRY_DUAL, 1, SQL, PFL_DISTINGENERA_PROGUNITORGA, "");
    PAN_DISTINGENERA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINGENERA.SetIMDB(IMDB, "PQRY_WRKDISTSAMAS", true);
    PAN_DISTINGENERA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_DISTINTA as RECONUMEDIST, ");
    SQL.append("  A.ANNO_DISTINTA as RECOANNODIST, ");
    SQL.append("  B.DATA_DISTINTA as RECDISLIDADI, ");
    SQL.append("  B.STATO as RECORDSTATO, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as REDILIPRUNOR ");
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_DIST_SAMASH A, ");
    SQL.append("  DISTINTE_LIQUIDAZIONE B ");
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.ANNO_DISTINTA = A.ANNO_DISTINTA) ");
    SQL.append("and   (B.NUMERO_DISTINTA = A.NUMERO_DISTINTA) ");
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NUMERO_DISTINTA, ");
    SQL.append("  A.ANNO_DISTINTA ");
    PAN_DISTINGENERA.SetQuery(PPQRY_WRKDISTSAMAS, 5, SQL, -1, "");
    PAN_DISTINGENERA.SetQueryDB(PPQRY_WRKDISTSAMAS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINGENERA.SetMasterTable(0, "WRK_DIST_SAMASH");
    PAN_DISTINGENERA.AddToSortList(PFL_DISTINGENERA_NUMERODISTIN, true);
    PAN_DISTINGENERA.AddToSortList(PFL_DISTINGENERA_ANNODISTINTA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINGENERA.Status() == 2)
    {
      int oldListQBE = PAN_DISTINGENERA.iUseListQBE;
      PAN_DISTINGENERA.iUseListQBE = 0;
      PAN_DISTINGENERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINGENERA.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINGENERA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISTINONGENE_Init()
  {

    PAN_DISTINONGENE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINONGENE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISTINONGENE.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, "E1F4C85F-8227-4CF2-B961-05803744B666");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, "ANNO PROG");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, "F3B414D9-E336-4138-A2AC-24321900AA20");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, "NUMERO PROG");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, "E89F71BD-EF8B-4201-A287-A09E359466E3");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, "ANNO DOC");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.VIS_NONNULLAFIEL);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, 0, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, "3C831476-41CE-499C-A9AB-AFF0FF7453BA");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, "Fornitore");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, "420AE78E-08D7-44E6-8C46-3F18273C2E19");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, "NUMERO DOC");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, "4E3E1B3A-3DC3-40AA-A850-8FBABCE59E84");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, "DATA DOC");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, "6C9D9C8E-0E52-4AB2-973E-21E0FAAC1271");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, "CODICE");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, 0, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, "CE91492D-CACD-484E-8EB3-329448A2DEE3");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, "DESCRIZIONE");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, "DC5ACD8B-0314-440D-8CDA-6F66F702149F");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, "Info");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, "B0F3A002-6AD7-474A-B56F-0F59A6A93746");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, "Documento");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, "6607F6FA-E512-49C4-93EC-30B99C73CD88");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, "Importo");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, "Importo");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, "F6C159AA-F591-4A57-BC11-0134796B4551");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, "Saldo");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, "F3A986B0-2A5D-4C37-B27F-477E4DEB6769");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, "NUMERO PROT");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, "B24A0ACC-98BF-41C0-B22B-1C369D605FEF");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, "D DATA PROT");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, "70BD698A-C59A-43C0-AFD2-07C6026E46C7");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, "NUM PROT GEN");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, "61C58FDB-4137-48B3-9BC1-19D5F3E4B569");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, "DATA ARRIVO");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, "37C6DC31-28B3-4E10-AA01-EFD2AE3911E3");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, "Protocollo Generale");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, "6246C51C-526A-47FA-BD2A-01BFB815E8B3");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, "NOTE");
    PAN_DISTINONGENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, "");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINONGENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, "5B3C5D47-EE0E-4BED-909B-5E643D332241");
    PAN_DISTINONGENE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, "Protocollo Interno");
    PAN_DISTINONGENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINONGENE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DISTINONGENE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_ANNOPROG, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_ANNOPROG, PPQRY_WRKDOCSAMASH, "A.ANNO_PROG", "WRKDOCSAANPR", 1, 4, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_LIST, "NUM. PROG");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_NUMEROPROG, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_NUMEROPROG, PPQRY_WRKDOCSAMASH, "A.NUMERO_PROG", "WRKDOCSANUPR", 1, 5, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_FORM, 4, 124, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_ANNODOC, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_ANNODOC, PPQRY_WRKDOCSAMASH, "A.ANNO_DOC", "WRKDOCSAANDO", 1, 4, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_LIST, 176);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_LIST, "Fornitore");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_FORM, 4, 244, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_FORM, 176);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_FORNITORE, MyGlb.PANEL_FORM, "Fornitore");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_FORNITORE, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_FORNITORE, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOCEST", 5, 60, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_LIST, 308, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_FORM, 12, 16, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMERODOC, MyGlb.PANEL_FORM, "NUMERO DOC");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_NUMERODOC, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_NUMERODOC, PPQRY_WRKDOCSAMASH, "A.NUMERO_DOC", "WRKDOCSANUDO", 5, 20, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_LIST, 484, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_LIST, 68);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_FORM, 256, 16, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATADOC, MyGlb.PANEL_FORM, "DATA DOC");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_DATADOC, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_DATADOC, PPQRY_WRKDOCSAMASH, "A.DATA_DOC", "WRKDOCSADADO", 6, 10, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_LIST, 192, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_FORM, 4, 244, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_CODICE, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_CODICE, PPQRY_WRKDOCSAMASH, "B.CODICE", "WRKDOCSAFACO", 1, 6, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_LIST, 556, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_FORM, 28, 40, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_DESCRIZIONE, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_DESCRIZIONE, PPQRY_WRKDOCSAMASH, "D.DESCRIZIONE", "WRKDOCSAT0DE", 5, 40, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_LIST, 728, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_LIST, 32);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_LIST, "I.");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_FORM, 4, 436, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_FORM, 32);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_INFO, -1, -1);
    PAN_DISTINONGENE.SetFieldUnbound(PFL_DISTINONGENE_INFO, true);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_INFO, PPQRY_WRKDOCSAMASH, "'I'", "WRKDOCSAMINF", 5, 1, 0, -13997);
    PAN_DISTINONGENE.SetValueListItem(PFL_DISTINONGENE_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISTINONGENE.SetValueListItem(PFL_DISTINONGENE_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISTINONGENE.SetValueListItem(PFL_DISTINONGENE_INFO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_LIST, 308, 0, 440, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_FORM, 304, 180, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_DOCUMENLABEL, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_LIST, 748, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_FORM, 472, 16, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_IMPORTO, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_IMPORTO, PPQRY_WRKDOCSAMASH, "B.IMPORTO", "WRKDOCSAFAIM", 3, 14, 2, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_LIST, 880, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_LIST, 40);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_LIST, "Saldo");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_FORM, 4, 292, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_FORM, 40);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_SALDO, MyGlb.PANEL_FORM, "Saldo");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_SALDO, -1, -1);
    PAN_DISTINONGENE.SetFieldUnbound(PFL_DISTINONGENE_SALDO, true);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_SALDO, PPQRY_WRKDOCSAMASH, "B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0)", "WRKDOCSAMSAL", 3, 28, 6, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_LIST, 1012, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_LIST, 88);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_LIST, "NUMERO PROT");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_FORM, 4, 340, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_FORM, 88);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMEROPROT, MyGlb.PANEL_FORM, "NUMERO PROT");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_NUMEROPROT, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_NUMEROPROT, PPQRY_WRKDOCSAMASH, "B.NUMERO_PROT", "WRDOSAFANUPR", 1, 7, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_LIST, 1084, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_LIST, 84);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_LIST, "D DATA PROT");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_FORM, 4, 364, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_FORM, 84);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DDATAPROT, MyGlb.PANEL_FORM, "D DATA PROT");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_DDATAPROT, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_DDATAPROT, PPQRY_WRKDOCSAMASH, "B.D_DATA_PROT", "WRDOSAFADDDP", 6, 10, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_LIST, 92);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_LIST, "NUM PROT GEN");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_FORM, 4, 388, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_FORM, 92);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NUMPROTGEN, MyGlb.PANEL_FORM, "NUM PROT GEN");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_NUMPROTGEN, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_NUMPROTGEN, PPQRY_WRKDOCSAMASH, "B.NUM_PROT_GEN", "WRDOSAFANUPG", 3, 10, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_LIST, 1232, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_LIST, 88);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_LIST, "DATA ARRIVO");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_FORM, 4, 412, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_FORM, 88);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_DATAARRIVO, MyGlb.PANEL_FORM, "DATA ARRIVO");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_DATAARRIVO, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_DATAARRIVO, PPQRY_WRKDOCSAMASH, "B.DATA_ARRIVO", "WRDOSAFADAAR", 6, 10, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_LIST, 1158, 0, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_LIST, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_LIST, 2);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_FORM, 1040, 244, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_FORM, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICPROTGENE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_ETICPROTGENE, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_ETICPROTGENE, -1, "", "ETICPROTGENE", 0, 0, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_LIST, 1312, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_LIST, 48);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_FORM, 12, 40, 656, 112, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_FORM, 104);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_FORM, 8);
    PAN_DISTINONGENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_NOTE, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_NOTE, PPQRY_WRKDOCSAMASH, "A.NOTE", "WRKDOCSAMNOT", 5, 1024, 0, -13997);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_LIST, 1012, 0, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_LIST, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_LIST, 2);
    PAN_DISTINONGENE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_FORM, 1048, 252, 176, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINONGENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_FORM, 0);
    PAN_DISTINONGENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINONGENE_ETICHEINTERN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINONGENE.SetFieldPage(PFL_DISTINONGENE_ETICHEINTERN, -1, -1);
    PAN_DISTINONGENE.SetFieldPanel(PFL_DISTINONGENE_ETICHEINTERN, -1, "", "ETICHEINTERN", 0, 0, 0, -13997);
  }

  private void PAN_DISTINONGENE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINONGENE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~WRKDOCSAFACO~~) ");
    PAN_DISTINONGENE.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_DISTINONGENE.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINONGENE.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_DISTINONGENE.SetIMDB(IMDB, "PQRY_WRKDOCSAMASH", true);
    PAN_DISTINONGENE.set_SetString(MyGlb.MASTER_ROWNAME, "WRK DOC SAMASH");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ANNO_PROG as WRKDOCSAANPR, ");
    SQL.append("  A.NUMERO_PROG as WRKDOCSANUPR, ");
    SQL.append("  A.ANNO_DOC as WRKDOCSAANDO, ");
    SQL.append("  A.NUMERO_DOC as WRKDOCSANUDO, ");
    SQL.append("  A.DATA_DOC as WRKDOCSADADO, ");
    SQL.append("  A.NOTE as WRKDOCSAMNOT, ");
    SQL.append("  B.CODICE as WRKDOCSAFACO, ");
    SQL.append("  D.DESCRIZIONE as WRKDOCSAT0DE, ");
    SQL.append("  B.IMPORTO as WRKDOCSAFAIM, ");
    SQL.append("  B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0) as WRKDOCSAMSAL, ");
    SQL.append("  B.NUMERO_PROT as WRDOSAFANUPR, ");
    SQL.append("  B.D_DATA_PROT as WRDOSAFADDDP, ");
    SQL.append("  B.NUM_PROT_GEN as WRDOSAFANUPG, ");
    SQL.append("  B.DATA_ARRIVO as WRDOSAFADAAR, ");
    SQL.append("  'I' as WRKDOCSAMINF ");
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_DOC_SAMASH A, ");
    SQL.append("  FAT B, ");
    SQL.append("  T03 D ");
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.STATO = 'DNG') ");
    SQL.append("and   (B.ANNO_PROG(+) = A.ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG(+) = A.NUMERO_PROG) ");
    SQL.append("and   (D.CODICE(+) = B.CODICE_DOC) ");
    SQL.append("and   (D.STORNO(+) = NVL(B.STORNO, 0)) ");
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC, ");
    SQL.append("  A.DATA_DOC ");
    PAN_DISTINONGENE.SetQuery(PPQRY_WRKDOCSAMASH, 5, SQL, -1, "");
    PAN_DISTINONGENE.SetQueryDB(PPQRY_WRKDOCSAMASH, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINONGENE.SetMasterTable(0, "WRK_DOC_SAMASH");
    PAN_DISTINONGENE.AddToSortList(PFL_DISTINONGENE_ANNODOC, true);
    PAN_DISTINONGENE.AddToSortList(PFL_DISTINONGENE_NUMERODOC, true);
    PAN_DISTINONGENE.AddToSortList(PFL_DISTINONGENE_DATADOC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINONGENE.Status() == 2)
    {
      int oldListQBE = PAN_DISTINONGENE.iUseListQBE;
      PAN_DISTINONGENE.iUseListQBE = 0;
      PAN_DISTINONGENE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINONGENE.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINONGENE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DOCUMEELABOR) PAN_DOCUMEELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMNONELAB) PAN_DOCUMNONELAB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISTINGENERA) PAN_DISTINGENERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISTINONGENE) PAN_DISTINONGENE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMEELABOR) PAN_DOCUMEELABOR_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMNONELAB) PAN_DOCUMNONELAB_ValidateRow(Cancel);
    if (SrcObj == PAN_DISTINGENERA) PAN_DISTINGENERA_ValidateRow(Cancel);
    if (SrcObj == PAN_DISTINONGENE) PAN_DISTINONGENE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DOCUMEELABOR) PAN_DOCUMEELABOR_DynamicProperties();
    if (SrcObj == PAN_DOCUMNONELAB) PAN_DOCUMNONELAB_DynamicProperties();
    if (SrcObj == PAN_DISTINGENERA) PAN_DISTINGENERA_DynamicProperties();
    if (SrcObj == PAN_DISTINONGENE) PAN_DISTINONGENE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMEELABOR) PAN_DOCUMEELABOR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMNONELAB) PAN_DOCUMNONELAB_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISTINGENERA) PAN_DISTINGENERA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISTINONGENE) PAN_DISTINONGENE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCUMEELABOR) PAN_DOCUMEELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCUMNONELAB) PAN_DOCUMNONELAB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISTINGENERA) PAN_DISTINGENERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISTINONGENE) PAN_DISTINONGENE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
