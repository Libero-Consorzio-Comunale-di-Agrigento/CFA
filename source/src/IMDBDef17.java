// **********************************************
// Global functions and constants
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import java.sql.*;


// **********************************************
// **********************************************
public class IMDBDef17 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE4 = 3868;
  public static int PQSL_VISTAACCELE4_CAPITOLO = 0;
  public static int PQSL_VISTAACCELE4_ARTICOLO = 1;
  public static int PQSL_VISTAACCELE4_ANNO_ACC = 2;
  public static int PQSL_VISTAACCELE4_NUMERO_ACC = 3;
  public static int PQSL_VISTAACCELE4_ANNO_DEL = 4;
  public static int PQSL_VISTAACCELE4_NUMERO_DEL = 5;
  public static int PQSL_VISTAACCELE4_SEDE_DEL = 6;
  public static int PQSL_VISTAACCELE4_VISACELVOPEG = 7;
  public static int PQSL_VISTAACCELE4_VISACCELEACC = 8;
  public static int PQSL_VISTAACCELE4_DATA_REG = 9;
  public static int PQSL_VISTAACCELE4_DESCRIZIONE = 10;
  public static int PQSL_VISTAACCELE4_VISACCELEDEL = 11;
  public static int PQSL_VISTAACCELE4_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE4_ORDINATIVI = 13;
  public static int PQSL_VISTAACCELE4_DISPONIBILITA = 14;
  public static int PQSL_VISTAACCELE4_DEBITORE = 15;
  public static int PQSL_VISTAACCELE4_ANNO_PROPOSTA = 16;
  public static int PQSL_VISTAACCELE4_UNITA_PROPONENTE = 17;
  public static int PQSL_VISTAACCELE4_NUMERO_PROPOSTA = 18;
  public static int PQSL_VISTAACCELE4_VIACELBERASE = 19;

  // Table to contain panel selected row: ESEA OPE
  //
  public static int PQRY_ESEAOPE1 = 3869;
  public static int PQSL_ESEAOPE1_ESEOPEESFICA = 0;
  public static int PQSL_ESEAOPE1_ESEOPEESFIAR = 1;
  public static int PQSL_ESEAOPE1_ESOPESFIANAC = 2;
  public static int PQSL_ESEAOPE1_ESOPESFINUAC = 3;
  public static int PQSL_ESEAOPE1_ESEOPEINFACC = 4;
  public static int PQSL_ESEAOPE1_ESEOPEACANDE = 5;
  public static int PQSL_ESEAOPE1_ESEOPEACNUDE = 6;
  public static int PQSL_ESEAOPE1_ESEOPEACSEDE = 7;
  public static int PQSL_ESEAOPE1_ESEOPEACDARE = 8;
  public static int PQSL_ESEAOPE1_ESEOPEACCDES = 9;
  public static int PQSL_ESEAOPE1_ESEOPEACCDEB = 10;
  public static int PQSL_ESEAOPE1_ESOPBERASOEE = 11;
  public static int PQSL_ESEAOPE1_ESEAOPEIMPOR = 12;
  public static int PQSL_ESEAOPE1_ESEOPEACANPR = 13;
  public static int PQSL_ESEAOPE1_ESEOPEACUNPR = 14;
  public static int PQSL_ESEAOPE1_ESEOPEACNUPR = 15;
  public static int PQSL_ESEAOPE1_ESEOPEESFIOR = 16;
  public static int PQSL_ESEAOPE1_ESEOPEESFIDI = 17;
  public static int PQSL_ESEAOPE1_ESEOPEESFIES = 18;
  public static int PQSL_ESEAOPE1_ESEOPACCOLI5 = 19;
  public static int PQSL_ESEAOPE1_ESEOPEACCOEU = 20;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI466 = 3870;
  public static int PQRY_PARAMETRI466_RS = 3871;
  public static int PQSL_PARAMETRI466_PARASOLOCOMP = 0;
  public static int PQSL_PARAMETRI466_PARAMDAL = 1;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE5 = 3872;
  public static int PQSL_VISTAACCELE5_VIACELESOPCA = 0;
  public static int PQSL_VISTAACCELE5_VIACELESOPAR = 1;
  public static int PQSL_VISTAACCELE5_VIACELESOPAA = 2;
  public static int PQSL_VISTAACCELE5_VIACELESOPNA = 3;
  public static int PQSL_VISTAACCELE5_VIACELACANDE = 4;
  public static int PQSL_VISTAACCELE5_VIACELACNUDE = 5;
  public static int PQSL_VISTAACCELE5_VIACELACSEDE = 6;
  public static int PQSL_VISTAACCELE5_VISACELVOPEG = 7;
  public static int PQSL_VISTAACCELE5_VISACCELEACC = 8;
  public static int PQSL_VISTAACCELE5_VIACELACDDDR = 9;
  public static int PQSL_VISTAACCELE5_VISACCELACD1 = 10;
  public static int PQSL_VISTAACCELE5_VISACCELEDEL = 11;
  public static int PQSL_VISTAACCELE5_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE5_VIACELESOPOR = 13;
  public static int PQSL_VISTAACCELE5_VIACELESOPDI = 14;
  public static int PQSL_VISTAACCELE5_VISACCELACDE = 15;
  public static int PQSL_VISTAACCELE5_VIACELACANPR = 16;
  public static int PQSL_VISTAACCELE5_VIACELACUNPR = 17;
  public static int PQSL_VISTAACCELE5_VIACELACNUPR = 18;

  // Table to contain panel selected row: ESEA OPE
  //
  public static int PQRY_ESEAOPE = 3873;
  public static int PQSL_ESEAOPE_ESEAOPECAPIT = 0;
  public static int PQSL_ESEAOPE_ESEAOPEARTIC = 1;
  public static int PQSL_ESEAOPE_ESEOPEANNACC = 2;
  public static int PQSL_ESEAOPE_ESEOPENUMACC = 3;
  public static int PQSL_ESEAOPE_ESEOPEINFACC = 4;
  public static int PQSL_ESEAOPE_ESEOPEACANDE = 5;
  public static int PQSL_ESEAOPE_ESEOPEACNUDE = 6;
  public static int PQSL_ESEAOPE_ESEOPEACSEDE = 7;
  public static int PQSL_ESEAOPE_ESEOPEACDARE = 8;
  public static int PQSL_ESEAOPE_ESEOPEACCDES = 9;
  public static int PQSL_ESEAOPE_ESEOPEACCDEB = 10;
  public static int PQSL_ESEAOPE_ESOPBERASOEE = 11;
  public static int PQSL_ESEAOPE_ESEAOPEIMPOR = 12;
  public static int PQSL_ESEAOPE_ESEOPEACANPR = 13;
  public static int PQSL_ESEAOPE_ESEOPEACUNPR = 14;
  public static int PQSL_ESEAOPE_ESEOPEACNUPR = 15;
  public static int PQSL_ESEAOPE_ESEAOPEORDIN = 16;
  public static int PQSL_ESEAOPE_ESEAOPEDISPO = 17;
  public static int PQSL_ESEAOPE_ESEAOPEESERC = 18;
  public static int PQSL_ESEAOPE_ESEOPACCOLI5 = 19;
  public static int PQSL_ESEAOPE_ESEOPEACCOEU = 20;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI284 = 3874;
  public static int PQRY_PARAMETRI284_RS = 3875;
  public static int PQSL_PARAMETRI284_PARASOLOCOMP = 0;
  public static int PQSL_PARAMETRI284_PARAMDAL = 1;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE6 = 3876;
  public static int PQSL_VISTAACCELE6_VIACELESOPCA = 0;
  public static int PQSL_VISTAACCELE6_VIACELESOPAR = 1;
  public static int PQSL_VISTAACCELE6_VIACELESOPAA = 2;
  public static int PQSL_VISTAACCELE6_VIACELESOPNA = 3;
  public static int PQSL_VISTAACCELE6_VIACELACANDE = 4;
  public static int PQSL_VISTAACCELE6_VIACELACNUDE = 5;
  public static int PQSL_VISTAACCELE6_VIACELACSEDE = 6;
  public static int PQSL_VISTAACCELE6_VISACELVOPEG = 7;
  public static int PQSL_VISTAACCELE6_VISACCELEACC = 8;
  public static int PQSL_VISTAACCELE6_VIACELACDDDR = 9;
  public static int PQSL_VISTAACCELE6_VISACCELACD1 = 10;
  public static int PQSL_VISTAACCELE6_VISACCELEDEL = 11;
  public static int PQSL_VISTAACCELE6_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE6_VIACELESOPOR = 13;
  public static int PQSL_VISTAACCELE6_VIACELESOPDI = 14;
  public static int PQSL_VISTAACCELE6_VISACCELACDE = 15;
  public static int PQSL_VISTAACCELE6_VIACELACANPR = 16;
  public static int PQSL_VISTAACCELE6_VIACELACUNPR = 17;
  public static int PQSL_VISTAACCELE6_VIACELACNUPR = 18;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOU1 = 3877;
  public static int PQSL_VISIMPSUUOU1_CAPITOLO = 0;
  public static int PQSL_VISIMPSUUOU1_ARTICOLO = 1;
  public static int PQSL_VISIMPSUUOU1_ANNO_IMP = 2;
  public static int PQSL_VISIMPSUUOU1_NUMERO_IMP = 3;
  public static int PQSL_VISIMPSUUOU1_ANNO_DEL = 4;
  public static int PQSL_VISIMPSUUOU1_NUMERO_DEL = 5;
  public static int PQSL_VISIMPSUUOU1_SEDE_DEL = 6;
  public static int PQSL_VISIMPSUUOU1_DATA_REG = 7;
  public static int PQSL_VISIMPSUUOU1_DESCRIZIONE = 8;
  public static int PQSL_VISIMPSUUOU1_ANNO_PROPOSTA = 9;
  public static int PQSL_VISIMPSUUOU1_UNITA_PROPONENTE = 10;
  public static int PQSL_VISIMPSUUOU1_NUMERO_PROPOSTA = 11;
  public static int PQSL_VISIMPSUUOU1_DISP_FIN = 12;
  public static int PQSL_VISIMPSUUOU1_DISPONIBILITA = 13;
  public static int PQSL_VISIMPSUUOU1_IMPEGNO_OBBLIG = 14;
  public static int PQSL_VISIMPSUUOU1_BENEFICIARIO = 15;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUBRSEE = 16;
  public static int PQSL_VISIMPSUUOU1_ANNO_SUBIMP = 17;
  public static int PQSL_VISIMPSUUOU1_NUMERO_SUBIMP = 18;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTASIO = 19;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTNSIO = 20;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTIMIN = 21;
  public static int PQSL_VISIMPSUUOU1_VISIMPUOUTVA = 22;
  public static int PQSL_VISIMPSUUOU1_IMPORTO = 23;
  public static int PQSL_VISIMPSUUOU1_SUBIMPEGNATO = 24;
  public static int PQSL_VISIMPSUUOU1_IMPOATTUNETT = 25;
  public static int PQSL_VISIMPSUUOU1_MANDATI = 26;
  public static int PQSL_VISIMPSUUOU1_VISIMPUOUTLI = 27;
  public static int PQSL_VISIMPSUUOU1_PRENOTAZIONE = 28;
  public static int PQSL_VISIMPSUUOU1_ESERCIZIO = 29;
  public static int PQSL_VISIMPSUUOU1_VIIMVIISUUCC = 30;
  public static int PQSL_VISIMPSUUOU1_VIIMVISUUCL5 = 31;
  public static int PQSL_VISIMPSUUOU1_VIIMVIISUUCE = 32;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTANIP = 33;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTNUIP = 34;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTANSP = 35;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTNUSP = 36;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTDASC = 37;
  public static int PQSL_VISIMPSUUOU1_VIIMVIIMSUU1 = 38;
  public static int PQSL_VISIMPSUUOU1_VIIMVIIMSUUC = 39;
  public static int PQSL_VISIMPSUUOU1_VIIMVISUUAEP = 40;
  public static int PQSL_VISIMPSUUOU1_VIIMVISUUPUO = 41;
  public static int PQSL_VISIMPSUUOU1_CODICEUO = 42;
  public static int PQSL_VISIMPSUUOU1_DESCRUO = 43;
  public static int PQSL_VISIMPSUUOU1_VIIMUOUTIDRS = 44;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI555 = 3878;
  public static int PQRY_PARAMETRI555_RS = 3879;
  public static int PQSL_PARAMETRI555_ROWNAMSOLCOM = 0;
  public static int PQSL_PARAMETRI555_ROWNAMEDAL = 1;
  public static int PQSL_PARAMETRI555_ROWNAMSUBIMP = 2;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOU2 = 3880;
  public static int PQSL_VISIMPSUUOU2_CAPITOLO = 0;
  public static int PQSL_VISIMPSUUOU2_ARTICOLO = 1;
  public static int PQSL_VISIMPSUUOU2_ANNO_IMP = 2;
  public static int PQSL_VISIMPSUUOU2_NUMERO_IMP = 3;
  public static int PQSL_VISIMPSUUOU2_ANNO_DEL = 4;
  public static int PQSL_VISIMPSUUOU2_NUMERO_DEL = 5;
  public static int PQSL_VISIMPSUUOU2_SEDE_DEL = 6;
  public static int PQSL_VISIMPSUUOU2_DATA_REG = 7;
  public static int PQSL_VISIMPSUUOU2_DESCRIZIONE = 8;
  public static int PQSL_VISIMPSUUOU2_ANNO_PROPOSTA = 9;
  public static int PQSL_VISIMPSUUOU2_UNITA_PROPONENTE = 10;
  public static int PQSL_VISIMPSUUOU2_NUMERO_PROPOSTA = 11;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUOUTDF = 12;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUOUTDI = 13;
  public static int PQSL_VISIMPSUUOU2_IMPEGNO_OBBLIG = 14;
  public static int PQSL_VISIMPSUUOU2_BENEFICIARIO = 15;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUBRSEE = 16;
  public static int PQSL_VISIMPSUUOU2_ANNO_SUBIMP = 17;
  public static int PQSL_VISIMPSUUOU2_NUMERO_SUBIMP = 18;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUUVPEG = 19;
  public static int PQSL_VISIMPSUUOU2_IMPORTO = 20;
  public static int PQSL_VISIMPSUUOU2_SUBIMPEGNATO = 21;
  public static int PQSL_VISIMPSUUOU2_MANDATI = 22;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUOUTLI = 23;
  public static int PQSL_VISIMPSUUOU2_DISPONIBILITA = 24;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUOUTOI = 25;
  public static int PQSL_VISIMPSUUOU2_VIIMSUUOUOSI = 26;

  // Table to contain panel selected row: IMP SUB FIN OPE ELENCO
  //
  public static int PQRY_IMPSUBFIOPE2 = 3881;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEC = 0;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEA = 1;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEAI = 2;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOENI = 3;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEAD = 4;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEND = 5;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOESD = 6;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOEDDR = 7;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOE1 = 8;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEAP = 9;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEUP = 10;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOENP = 11;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOED = 12;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEIO = 13;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEB = 14;
  public static int PQSL_IMPSUBFIOPE2_IMSUFOEBRSEE = 15;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEAS = 16;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOENS = 17;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIOEASIO = 18;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIOENSIO = 19;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOEII = 20;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOETS = 21;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEM = 22;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIOPELLI = 23;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEP = 24;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIIMSOEE = 25;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOECC = 26;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOECL5 = 27;
  public static int PQSL_IMPSUBFIOPE2_IMSUFIISOECE = 28;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOEAIP = 29;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOENIP = 30;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOEASP = 31;
  public static int PQSL_IMPSUBFIOPE2_IMSUFISOENSP = 32;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI467 = 3882;
  public static int PQRY_PARAMETRI467_RS = 3883;
  public static int PQSL_PARAMETRI467_ROWNAMSOLCOM = 0;
  public static int PQSL_PARAMETRI467_ROWNAMEDAL = 1;
  public static int PQSL_PARAMETRI467_ROWNAMSUBIMP = 2;

  // Table to contain panel selected row: IMP SUB FIN OPE ELENCO
  //
  public static int PQRY_IMPSUBFIOPE3 = 3884;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELCA = 0;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELAR = 1;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELAI = 2;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELNI = 3;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELAD = 4;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELND = 5;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELSD = 6;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOEDDDR = 7;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELDE = 8;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELAP = 9;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELUP = 10;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELNP = 11;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELIO = 12;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELBE = 13;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELAS = 14;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELNS = 15;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOEVPEG = 16;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPEIII = 17;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPETTS = 18;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELLI = 19;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELMA = 20;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELDI = 21;
  public static int PQSL_IMPSUBFIOPE3_IMSUFOEBRSEE = 22;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPELOI = 23;
  public static int PQSL_IMPSUBFIOPE3_IMSUFIOPEOSI = 24;

  // Table to contain panel selected row: IMP SUB FIN OPE ELENCO
  //
  public static int PQRY_IMPSUBFIOPE1 = 3885;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELCA = 0;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELAR = 1;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELAI = 2;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELNI = 3;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELAD = 4;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELND = 5;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELSD = 6;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOEDDDR = 7;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELDE = 8;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELAP = 9;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELUP = 10;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELNP = 11;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELD1 = 12;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELIO = 13;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELBE = 14;
  public static int PQSL_IMPSUBFIOPE1_IMSUFOEBRSEE = 15;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELAS = 16;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELNS = 17;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOEASIO = 18;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOENSIO = 19;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPEIII = 20;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPETTS = 21;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELMA = 22;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELLI = 23;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELPR = 24;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELES = 25;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELCC = 26;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPECL5 = 27;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPELCE = 28;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPEAIP = 29;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPENIP = 30;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPEASP = 31;
  public static int PQSL_IMPSUBFIOPE1_IMSUFIOPENSP = 32;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI410 = 3886;
  public static int PQRY_PARAMETRI410_RS = 3887;
  public static int PQSL_PARAMETRI410_ROWNAMSOLCOM = 0;
  public static int PQSL_PARAMETRI410_ROWNAMEDAL = 1;
  public static int PQSL_PARAMETRI410_ROWNAMSUBIMP = 2;

  // Table to contain panel selected row: IMP SUB FIN OPE ELENCO
  //
  public static int PQRY_IMPSUBFIOPEL = 3888;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELCA = 0;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELAR = 1;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELAI = 2;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELNI = 3;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELAD = 4;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELND = 5;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELSD = 6;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOEDDDR = 7;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELDE = 8;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELAP = 9;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELUP = 10;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELNP = 11;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELIO = 12;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELBE = 13;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELAS = 14;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELNS = 15;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOEVPEG = 16;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPEIII = 17;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPETTS = 18;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELLI = 19;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELMA = 20;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELDI = 21;
  public static int PQSL_IMPSUBFIOPEL_IMSUFOEBRSEE = 22;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPELOI = 23;
  public static int PQSL_IMPSUBFIOPEL_IMSUFIOPEOSI = 24;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELEN = 3889;
  public static int PQSL_VISTAACCELEN_ANNO_ACC = 0;
  public static int PQSL_VISTAACCELEN_SALDO_INI = 1;
  public static int PQSL_VISTAACCELEN_VARIAZIONI = 2;
  public static int PQSL_VISTAACCELEN_RECORDACCERT = 3;
  public static int PQSL_VISTAACCELEN_RECORDORDINA = 4;
  public static int PQSL_VISTAACCELEN_RECORDINCASS = 5;
  public static int PQSL_VISTAACCELEN_DISPONIBILITA = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI105 = 3890;
  public static int PQRY_PARAMETRI105_RS = 3891;
  public static int PQSL_PARAMETRI105_PARAMECAPITO = 0;
  public static int PQSL_PARAMETRI105_PARAMEARTICO = 1;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOU5 = 3892;
  public static int PQSL_VISIMPSUUOU5_ANNO_IMP = 0;
  public static int PQSL_VISIMPSUUOU5_SALDO_INI = 1;
  public static int PQSL_VISIMPSUUOU5_VARIAZIONI = 2;
  public static int PQSL_VISIMPSUUOU5_RECORDIMPEGN = 3;
  public static int PQSL_VISIMPSUUOU5_MANDATI = 4;
  public static int PQSL_VISIMPSUUOU5_RECORDPAGAME = 5;
  public static int PQSL_VISIMPSUUOU5_DISPONFINANZ = 6;
  public static int PQSL_VISIMPSUUOU5_DISPONIBILITA = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI104 = 3893;
  public static int PQRY_PARAMETRI104_RS = 3894;
  public static int PQSL_PARAMETRI104_PARAMECAPITO = 0;
  public static int PQSL_PARAMETRI104_PARAMEARTICO = 1;
  public static int PQSL_PARAMETRI104_PARAMESUBIMP = 2;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAMP3 = 3895;
  public static int PQRY_PARAMESTAMP3_RS = 3896;
  public static int PQSL_PARAMESTAMP3_ROWNAMSEDDEL = 0;
  public static int PQSL_PARAMESTAMP3_ROWNAMNUMDEL = 1;
  public static int PQSL_PARAMESTAMP3_ROWNAMANNDEL = 2;
  public static int PQSL_PARAMESTAMP3_UNITA_PROPONENTE = 3;
  public static int PQSL_PARAMESTAMP3_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAMESTAMP3_ANNO_PROPOSTA = 5;
  public static int PQSL_PARAMESTAMP3_ROWNAMEDESCR = 6;
  public static int PQSL_PARAMESTAMP3_ROWNAMTIPVAR = 7;
  public static int PQSL_PARAMESTAMP3_ROWNAMDATREG = 8;

  // Recordset for query: Imp Acc Selezionati
  //
  public static int QRY_IMPACCSELEZ1 = 3897;
  public static int QSL_IMPACCSELEZ1_ANNOIMPACC = 0;
  public static int QSL_IMPACCSELEZ1_NUMEROIMPACC = 1;
  public static int QSL_IMPACCSELEZ1_IMPACCESERCI = 2;
  public static int QSL_IMPACCSELEZ1_IMPACCCAPITO = 3;
  public static int QSL_IMPACCSELEZ1_IMPACCARTICO = 4;
  public static int QSL_IMPACCSELEZ1_IMPACCDISPON = 5;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOUT = 3898;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTNULI = 0;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTANLI = 1;
  public static int PQSL_VISIMPSUUOUT_CAPITOLO = 2;
  public static int PQSL_VISIMPSUUOUT_ARTICOLO = 3;
  public static int PQSL_VISIMPSUUOUT_ANNO_IMP = 4;
  public static int PQSL_VISIMPSUUOUT_NUMERO_IMP = 5;
  public static int PQSL_VISIMPSUUOUT_ANNO_SUBIMP = 6;
  public static int PQSL_VISIMPSUUOUT_NUMERO_SUBIMP = 7;
  public static int PQSL_VISIMPSUUOUT_IMPORTO = 8;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUBRSEE = 9;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLIND = 10;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLIAD = 11;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLIUF = 12;
  public static int PQSL_VISIMPSUUOUT_ANNO_DEL = 13;
  public static int PQSL_VISIMPSUUOUT_NUMERO_DEL = 14;
  public static int PQSL_VISIMPSUUOUT_SEDE_DEL = 15;
  public static int PQSL_VISIMPSUUOUT_ANNO_PROPOSTA = 16;
  public static int PQSL_VISIMPSUUOUT_UNITA_PROPONENTE = 17;
  public static int PQSL_VISIMPSUUOUT_NUMERO_PROPOSTA = 18;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLIFI = 19;
  public static int PQSL_VISIMPSUUOUT_VISIMPUOUTUF = 20;
  public static int PQSL_VISIMPSUUOUT_VISIMPUOUTFI = 21;
  public static int PQSL_VISIMPSUUOUT_INEMISS = 22;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLFAP = 23;
  public static int PQSL_VISIMPSUUOUT_VIIMUOUTLFNP = 24;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI463 = 3899;
  public static int PQRY_PARAMETRI463_RS = 3900;
  public static int PQSL_PARAMETRI463_ROWNAMSOLCOM = 0;
  public static int PQSL_PARAMETRI463_ROWNAMEDAL = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI110 = 3901;
  public static int PQRY_PARAMETRI110_RS = 3902;
  public static int PQSL_PARAMETRI110_PARAANCUOSOT = 0;
  public static int PQSL_PARAMETRI110_PARAMPARTE = 1;
  public static int PQSL_PARAMETRI110_PARAMBILANCI = 2;
  public static int PQSL_PARAMETRI110_PARAMVARIAZI = 3;
  public static int PQSL_PARAMETRI110_PARPREANINCO = 4;
  public static int PQSL_PARAMETRI110_PARAMORDINAM = 5;

  // Table to contain panel selected row: CF4WEB WRK PREV PEG
  //
  public static int PQRY_CF4WRKPREPE3 = 3903;
  public static int PQSL_CF4WRKPREPE3_CFWRPRPEPRUO = 0;
  public static int PQSL_CF4WRKPREPE3_CFWRPRPEDEUO = 1;
  public static int PQSL_CF4WRKPREPE3_E_S = 2;
  public static int PQSL_CF4WRKPREPE3_CFWRPRPEDEES = 3;
  public static int PQSL_CF4WRKPREPE3_TITOLO = 4;
  public static int PQSL_CF4WRKPREPE3_DESCR_TITOLO = 5;
  public static int PQSL_CF4WRKPREPE3_VOCE_PEG = 6;
  public static int PQSL_CF4WRKPREPE3_CODICE_BILANCIO = 7;
  public static int PQSL_CF4WRKPREPE3_CAPITOLO = 8;
  public static int PQSL_CF4WRKPREPE3_ARTICOLO = 9;
  public static int PQSL_CF4WRKPREPE3_DESCR_VOCE_PEG = 10;
  public static int PQSL_CF4WRKPREPE3_DESCR_UO_GESTIONE = 11;
  public static int PQSL_CF4WRKPREPE3_DESCR_UO_UTILIZZO = 12;
  public static int PQSL_CF4WRKPREPE3_PREV_ANNO_CORSO = 13;
  public static int PQSL_CF4WRKPREPE3_STN_INIZIALE = 14;
  public static int PQSL_CF4WRKPREPE3_VARIAZIONI = 15;
  public static int PQSL_CF4WRKPREPE3_STN_DEFINITIVO = 16;

  // Table to contain panel selected row: CF4WEB WRK PREV PEG
  //
  public static int PQRY_CF4WRKPREPE5 = 3904;
  public static int PQSL_CF4WRKPREPE5_CFWRPRPEPRUO = 0;
  public static int PQSL_CF4WRKPREPE5_CFWRPRPEDEUO = 1;
  public static int PQSL_CF4WRKPREPE5_E_S = 2;
  public static int PQSL_CF4WRKPREPE5_CFWRPRPEDEES = 3;
  public static int PQSL_CF4WRKPREPE5_TITOLO = 4;
  public static int PQSL_CF4WRKPREPE5_DESCR_TITOLO = 5;
  public static int PQSL_CF4WRKPREPE5_VOCE_PEG = 6;
  public static int PQSL_CF4WRKPREPE5_CODICE_BILANCIO = 7;
  public static int PQSL_CF4WRKPREPE5_CAPITOLO = 8;
  public static int PQSL_CF4WRKPREPE5_ARTICOLO = 9;
  public static int PQSL_CF4WRKPREPE5_DESCR_VOCE_PEG = 10;
  public static int PQSL_CF4WRKPREPE5_DESCR_UO_GESTIONE = 11;
  public static int PQSL_CF4WRKPREPE5_DESCR_UO_UTILIZZO = 12;
  public static int PQSL_CF4WRKPREPE5_PREV_ANNO_CORSO = 13;
  public static int PQSL_CF4WRKPREPE5_STN_INIZIALE = 14;
  public static int PQSL_CF4WRKPREPE5_VARIAZIONI = 15;
  public static int PQSL_CF4WRKPREPE5_STN_DEFINITIVO = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI448 = 3905;
  public static int PQRY_PARAMETRI448_RS = 3906;
  public static int PQSL_PARAMETRI448_PARAANCUOSOT = 0;
  public static int PQSL_PARAMETRI448_PARAMPARTE = 1;
  public static int PQSL_PARAMETRI448_PARASOLOCOMP = 2;
  public static int PQSL_PARAMETRI448_PARAMUOUTILI = 3;
  public static int PQSL_PARAMETRI448_PARADATAELAB = 4;

  // Table to contain panel selected row: CF4WEB WRK SIT PEG
  //
  public static int PQRY_CF4WRKSITPE1 = 3907;
  public static int PQSL_CF4WRKSITPE1_CFWRSIPEPRUO = 0;
  public static int PQSL_CF4WRKSITPE1_CFWRSIPEDEUO = 1;
  public static int PQSL_CF4WRKSITPE1_E_S = 2;
  public static int PQSL_CF4WRKSITPE1_CFWRSIPEDEES = 3;
  public static int PQSL_CF4WRKSITPE1_TITOLO = 4;
  public static int PQSL_CF4WRKSITPE1_DESCR_TITOLO = 5;
  public static int PQSL_CF4WRKSITPE1_VOCE_PEG = 6;
  public static int PQSL_CF4WRKSITPE1_CODICE_BILANCIO = 7;
  public static int PQSL_CF4WRKSITPE1_CAPITOLO = 8;
  public static int PQSL_CF4WRKSITPE1_ARTICOLO = 9;
  public static int PQSL_CF4WRKSITPE1_DESCR_VOCE_PEG = 10;
  public static int PQSL_CF4WRKSITPE1_DESCR_UO_GESTIONE = 11;
  public static int PQSL_CF4WRKSITPE1_DESCR_UO_UTILIZZO = 12;
  public static int PQSL_CF4WRKSITPE1_STN_INIZIALE_COMP = 13;
  public static int PQSL_CF4WRKSITPE1_STN_INIZIALE_RES = 14;
  public static int PQSL_CF4WRKSITPE1_VARIAZIONI_COMP = 15;
  public static int PQSL_CF4WRKSITPE1_VARIAZIONI_RES = 16;
  public static int PQSL_CF4WRKSITPE1_STN_ATTUALE_COMP = 17;
  public static int PQSL_CF4WRKSITPE1_STN_ATTUALE_RES = 18;
  public static int PQSL_CF4WRKSITPE1_IMPEGNABILE = 19;
  public static int PQSL_CF4WRKSITPE1_IMP_ACC_COMP = 20;
  public static int PQSL_CF4WRKSITPE1_IMP_ACC_RES = 21;
  public static int PQSL_CF4WRKSITPE1_DISPONIBILITA = 22;
  public static int PQSL_CF4WRKSITPE1_MAN_ORD_COMP = 23;
  public static int PQSL_CF4WRKSITPE1_MAN_ORD_RES = 24;
  public static int PQSL_CF4WRKSITPE1_MAN_ORD_TOT = 25;
  public static int PQSL_CF4WRKSITPE1_LIQUIDATO_COMP = 26;
  public static int PQSL_CF4WRKSITPE1_LIQUIDATO_RES = 27;
  public static int PQSL_CF4WRKSITPE1_LIQUIDATO_TOT = 28;

  // Table to contain panel selected row: CF4WEB WRK SIT PEG
  //
  public static int PQRY_CF4WRKSITPE2 = 3908;
  public static int PQSL_CF4WRKSITPE2_CFWRSIPEPRUO = 0;
  public static int PQSL_CF4WRKSITPE2_CFWRSIPEDEUO = 1;
  public static int PQSL_CF4WRKSITPE2_E_S = 2;
  public static int PQSL_CF4WRKSITPE2_CFWRSIPEDEES = 3;
  public static int PQSL_CF4WRKSITPE2_TITOLO = 4;
  public static int PQSL_CF4WRKSITPE2_DESCR_TITOLO = 5;
  public static int PQSL_CF4WRKSITPE2_VOCE_PEG = 6;
  public static int PQSL_CF4WRKSITPE2_CODICE_BILANCIO = 7;
  public static int PQSL_CF4WRKSITPE2_CAPITOLO = 8;
  public static int PQSL_CF4WRKSITPE2_ARTICOLO = 9;
  public static int PQSL_CF4WRKSITPE2_DESCR_VOCE_PEG = 10;
  public static int PQSL_CF4WRKSITPE2_DESCR_UO_GESTIONE = 11;
  public static int PQSL_CF4WRKSITPE2_DESCR_UO_UTILIZZO = 12;
  public static int PQSL_CF4WRKSITPE2_STN_INIZIALE_COMP = 13;
  public static int PQSL_CF4WRKSITPE2_STN_INIZIALE_RES = 14;
  public static int PQSL_CF4WRKSITPE2_VARIAZIONI_COMP = 15;
  public static int PQSL_CF4WRKSITPE2_VARIAZIONI_RES = 16;
  public static int PQSL_CF4WRKSITPE2_STN_ATTUALE_COMP = 17;
  public static int PQSL_CF4WRKSITPE2_STN_ATTUALE_RES = 18;
  public static int PQSL_CF4WRKSITPE2_IMPEGNABILE = 19;
  public static int PQSL_CF4WRKSITPE2_IMP_ACC_COMP = 20;
  public static int PQSL_CF4WRKSITPE2_IMP_ACC_RES = 21;
  public static int PQSL_CF4WRKSITPE2_DISPONIBILITA = 22;
  public static int PQSL_CF4WRKSITPE2_LIQUIDATO_COMP = 23;
  public static int PQSL_CF4WRKSITPE2_LIQUIDATO_RES = 24;
  public static int PQSL_CF4WRKSITPE2_LIQUIDATO_TOT = 25;
  public static int PQSL_CF4WRKSITPE2_MAN_ORD_COMP = 26;
  public static int PQSL_CF4WRKSITPE2_MAN_ORD_RES = 27;
  public static int PQSL_CF4WRKSITPE2_MAN_ORD_TOT = 28;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI449 = 3909;
  public static int PQRY_PARAMETRI449_RS = 3910;
  public static int PQSL_PARAMETRI449_PARAANCUOSOT = 0;
  public static int PQSL_PARAMETRI449_PARRESCOMENT = 1;
  public static int PQSL_PARAMETRI449_PARAMUOUTILI = 2;
  public static int PQSL_PARAMETRI449_PARADATAELAB = 3;
  public static int PQSL_PARAMETRI449_PARASOLOPROV = 4;
  public static int PQSL_PARAMETRI449_PARASOLOPREN = 5;
  public static int PQSL_PARAMETRI449_PARASOLODISP = 6;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM2 = 3911;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM2_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM2_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM2_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM2_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM2_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM2_DESCR_UO_GESTIONE = 8;
  public static int PQSL_CF4WRKSITIM2_DESCR_UO_UTILIZZO = 9;
  public static int PQSL_CF4WRKSITIM2_ESTREMI_IMPACC = 10;
  public static int PQSL_CF4WRKSITIM2_DATA_IMPACC = 11;
  public static int PQSL_CF4WRKSITIM2_DETERMINA_PROPOSTA = 12;
  public static int PQSL_CF4WRKSITIM2_OBBLIGATORIO = 13;
  public static int PQSL_CF4WRKSITIM2_DESCR_IMPACC = 14;
  public static int PQSL_CF4WRKSITIM2_RAGIONE_SOCIALE = 15;
  public static int PQSL_CF4WRKSITIM2_IMPORTO_IMPACC = 16;
  public static int PQSL_CF4WRKSITIM2_SUBIMPEGNATO = 17;
  public static int PQSL_CF4WRKSITIM2_LIQUIDATO = 18;
  public static int PQSL_CF4WRKSITIM2_MAN_ORD = 19;
  public static int PQSL_CF4WRKSITIM2_DISPONIBILITA = 20;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMIMRE = 21;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMIMCO = 22;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMSUIR = 23;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMSUIC = 24;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMLIRE = 25;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMLICO = 26;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMMARE = 27;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMMACO = 28;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMDIRE = 29;
  public static int PQSL_CF4WRKSITIM2_CFWRSIIMDICO = 30;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM3 = 3912;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM3_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM3_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM3_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM3_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM3_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM3_DESCR_UO_GESTIONE = 8;
  public static int PQSL_CF4WRKSITIM3_DESCR_UO_UTILIZZO = 9;
  public static int PQSL_CF4WRKSITIM3_ESTREMI_IMPACC = 10;
  public static int PQSL_CF4WRKSITIM3_DATA_IMPACC = 11;
  public static int PQSL_CF4WRKSITIM3_DETERMINA_PROPOSTA = 12;
  public static int PQSL_CF4WRKSITIM3_OBBLIGATORIO = 13;
  public static int PQSL_CF4WRKSITIM3_DESCR_IMPACC = 14;
  public static int PQSL_CF4WRKSITIM3_RAGIONE_SOCIALE = 15;
  public static int PQSL_CF4WRKSITIM3_IMPORTO_IMPACC = 16;
  public static int PQSL_CF4WRKSITIM3_SUBIMPEGNATO = 17;
  public static int PQSL_CF4WRKSITIM3_LIQUIDATO = 18;
  public static int PQSL_CF4WRKSITIM3_MAN_ORD = 19;
  public static int PQSL_CF4WRKSITIM3_DISPONIBILITA = 20;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMIMRE = 21;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMIMCO = 22;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMSUIR = 23;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMSUIC = 24;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMLIRE = 25;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMLICO = 26;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMMARE = 27;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMMACO = 28;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMDIRE = 29;
  public static int PQSL_CF4WRKSITIM3_CFWRSIIMDICO = 30;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI450 = 3913;
  public static int PQRY_PARAMETRI450_RS = 3914;
  public static int PQSL_PARAMETRI450_PARAANCUOSOT = 0;
  public static int PQSL_PARAMETRI450_PARRESCOMENT = 1;
  public static int PQSL_PARAMETRI450_PARAMUOUTILI = 2;
  public static int PQSL_PARAMETRI450_PARADATAELAB = 3;
  public static int PQSL_PARAMETRI450_PARASOLOPROV = 4;
  public static int PQSL_PARAMETRI450_PARASOLODISP = 5;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM4 = 3915;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM4_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM4_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM4_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM4_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM4_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM4_ANNO_SUBIMP = 8;
  public static int PQSL_CF4WRKSITIM4_NUMERO_SUBIMP = 9;
  public static int PQSL_CF4WRKSITIM4_DESCR_UO_GESTIONE = 10;
  public static int PQSL_CF4WRKSITIM4_DESCR_UO_UTILIZZO = 11;
  public static int PQSL_CF4WRKSITIM4_ESTREMI_IMPACC = 12;
  public static int PQSL_CF4WRKSITIM4_ESTREMI_SUBIMP = 13;
  public static int PQSL_CF4WRKSITIM4_DATA_IMPACC = 14;
  public static int PQSL_CF4WRKSITIM4_DETERMINA_PROPOSTA = 15;
  public static int PQSL_CF4WRKSITIM4_OBBLIGATORIO = 16;
  public static int PQSL_CF4WRKSITIM4_DESCR_IMPACC = 17;
  public static int PQSL_CF4WRKSITIM4_RAGIONE_SOCIALE = 18;
  public static int PQSL_CF4WRKSITIM4_IMPORTO_IMPACC = 19;
  public static int PQSL_CF4WRKSITIM4_SUBIMPEGNATO = 20;
  public static int PQSL_CF4WRKSITIM4_LIQUIDATO = 21;
  public static int PQSL_CF4WRKSITIM4_MAN_ORD = 22;
  public static int PQSL_CF4WRKSITIM4_DISPONIBILITA = 23;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMIMRE = 24;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMIMCO = 25;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMSUIR = 26;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMSUIC = 27;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMLIRE = 28;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMLICO = 29;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMMARE = 30;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMMACO = 31;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMDIRE = 32;
  public static int PQSL_CF4WRKSITIM4_CFWRSIIMDICO = 33;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM5 = 3916;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM5_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM5_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM5_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM5_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM5_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM5_ANNO_SUBIMP = 8;
  public static int PQSL_CF4WRKSITIM5_NUMERO_SUBIMP = 9;
  public static int PQSL_CF4WRKSITIM5_DESCR_UO_GESTIONE = 10;
  public static int PQSL_CF4WRKSITIM5_DESCR_UO_UTILIZZO = 11;
  public static int PQSL_CF4WRKSITIM5_ESTREMI_IMPACC = 12;
  public static int PQSL_CF4WRKSITIM5_ESTREMI_SUBIMP = 13;
  public static int PQSL_CF4WRKSITIM5_DATA_IMPACC = 14;
  public static int PQSL_CF4WRKSITIM5_DETERMINA_PROPOSTA = 15;
  public static int PQSL_CF4WRKSITIM5_OBBLIGATORIO = 16;
  public static int PQSL_CF4WRKSITIM5_DESCR_IMPACC = 17;
  public static int PQSL_CF4WRKSITIM5_RAGIONE_SOCIALE = 18;
  public static int PQSL_CF4WRKSITIM5_IMPORTO_IMPACC = 19;
  public static int PQSL_CF4WRKSITIM5_SUBIMPEGNATO = 20;
  public static int PQSL_CF4WRKSITIM5_LIQUIDATO = 21;
  public static int PQSL_CF4WRKSITIM5_MAN_ORD = 22;
  public static int PQSL_CF4WRKSITIM5_DISPONIBILITA = 23;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMIMRE = 24;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMIMCO = 25;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMSUIR = 26;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMSUIC = 27;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMLIRE = 28;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMLICO = 29;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMMARE = 30;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMMACO = 31;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMDIRE = 32;
  public static int PQSL_CF4WRKSITIM5_CFWRSIIMDICO = 33;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI451 = 3917;
  public static int PQRY_PARAMETRI451_RS = 3918;
  public static int PQSL_PARAMETRI451_PARAANCUOSOT = 0;
  public static int PQSL_PARAMETRI451_PARRESCOMENT = 1;
  public static int PQSL_PARAMETRI451_PARAMUOUTILI = 2;
  public static int PQSL_PARAMETRI451_PARADATAELAB = 3;
  public static int PQSL_PARAMETRI451_PARASOLODISP = 4;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM1 = 3919;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM1_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM1_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM1_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM1_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM1_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM1_DESCR_UO_GESTIONE = 8;
  public static int PQSL_CF4WRKSITIM1_DESCR_UO_UTILIZZO = 9;
  public static int PQSL_CF4WRKSITIM1_ESTREMI_IMPACC = 10;
  public static int PQSL_CF4WRKSITIM1_DATA_IMPACC = 11;
  public static int PQSL_CF4WRKSITIM1_DETERMINA_PROPOSTA = 12;
  public static int PQSL_CF4WRKSITIM1_DESCR_IMPACC = 13;
  public static int PQSL_CF4WRKSITIM1_RAGIONE_SOCIALE = 14;
  public static int PQSL_CF4WRKSITIM1_IMPORTO_IMPACC = 15;
  public static int PQSL_CF4WRKSITIM1_SUBIMPEGNATO = 16;
  public static int PQSL_CF4WRKSITIM1_LIQUIDATO = 17;
  public static int PQSL_CF4WRKSITIM1_MAN_ORD = 18;
  public static int PQSL_CF4WRKSITIM1_DISPONIBILITA = 19;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMIMRE = 20;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMIMCO = 21;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMSUIR = 22;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMSUIC = 23;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMLIRE = 24;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMLICO = 25;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMMARE = 26;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMMACO = 27;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMDIRE = 28;
  public static int PQSL_CF4WRKSITIM1_CFWRSIIMDICO = 29;

  // Table to contain panel selected row: CF4WEB WRK SIT IMPACC
  //
  public static int PQRY_CF4WRKSITIM8 = 3920;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMPRUO = 0;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMDEUO = 1;
  public static int PQSL_CF4WRKSITIM8_VOCE_PEG = 2;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMRECO = 3;
  public static int PQSL_CF4WRKSITIM8_CAPITOLO = 4;
  public static int PQSL_CF4WRKSITIM8_ARTICOLO = 5;
  public static int PQSL_CF4WRKSITIM8_ANNO_IMPACC = 6;
  public static int PQSL_CF4WRKSITIM8_NUMERO_IMPACC = 7;
  public static int PQSL_CF4WRKSITIM8_DESCR_UO_GESTIONE = 8;
  public static int PQSL_CF4WRKSITIM8_DESCR_UO_UTILIZZO = 9;
  public static int PQSL_CF4WRKSITIM8_ESTREMI_IMPACC = 10;
  public static int PQSL_CF4WRKSITIM8_DATA_IMPACC = 11;
  public static int PQSL_CF4WRKSITIM8_DETERMINA_PROPOSTA = 12;
  public static int PQSL_CF4WRKSITIM8_DESCR_IMPACC = 13;
  public static int PQSL_CF4WRKSITIM8_RAGIONE_SOCIALE = 14;
  public static int PQSL_CF4WRKSITIM8_IMPORTO_IMPACC = 15;
  public static int PQSL_CF4WRKSITIM8_SUBIMPEGNATO = 16;
  public static int PQSL_CF4WRKSITIM8_LIQUIDATO = 17;
  public static int PQSL_CF4WRKSITIM8_MAN_ORD = 18;
  public static int PQSL_CF4WRKSITIM8_DISPONIBILITA = 19;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMIMRE = 20;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMIMCO = 21;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMSUIR = 22;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMSUIC = 23;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMLIRE = 24;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMLICO = 25;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMMARE = 26;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMMACO = 27;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMDIRE = 28;
  public static int PQSL_CF4WRKSITIM8_CFWRSIIMDICO = 29;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL1 = 3921;
  public static int PQSL_DUAL1_STANZINIPURO = 0;
  public static int PQSL_DUAL1_VARIAZPURO = 1;
  public static int PQSL_DUAL1_STANZATTPURO = 2;
  public static int PQSL_DUAL1_IMPEACCEPURO = 3;
  public static int PQSL_DUAL1_DISPONPURO = 4;
  public static int PQSL_DUAL1_RESIDUI = 5;
  public static int PQSL_DUAL1_STANZINICA = 6;
  public static int PQSL_DUAL1_VARIAZCA = 7;
  public static int PQSL_DUAL1_STANZATTCA = 8;
  public static int PQSL_DUAL1_MANDORDCO = 9;
  public static int PQSL_DUAL1_MANDORDRES = 10;
  public static int PQSL_DUAL1_MANDORDTOT = 11;
  public static int PQSL_DUAL1_DISPONCA3 = 12;
  public static int PQSL_DUAL1_DISPONCA1 = 13;
  public static int PQSL_DUAL1_DISPONCA2 = 14;
  public static int PQSL_DUAL1_STAINIREIESI = 15;
  public static int PQSL_DUAL1_VARIREISESIG = 16;
  public static int PQSL_DUAL1_STAATTREIESI = 17;
  public static int PQSL_DUAL1_DISPREISESIG = 18;
  public static int PQSL_DUAL1_IMPACCREIESI = 19;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL4 = 3922;
  public static int PQSL_DUAL4_STANZINICO = 0;
  public static int PQSL_DUAL4_VARIAZCO = 1;
  public static int PQSL_DUAL4_STANZATTCO = 2;
  public static int PQSL_DUAL4_IMPEGACCERT = 3;
  public static int PQSL_DUAL4_DISPONCO = 4;
  public static int PQSL_DUAL4_RESIDUI = 5;
  public static int PQSL_DUAL4_STANZINICA = 6;
  public static int PQSL_DUAL4_VARIAZCA = 7;
  public static int PQSL_DUAL4_STANZATTCA = 8;
  public static int PQSL_DUAL4_MANDORDCO = 9;
  public static int PQSL_DUAL4_MANDORDRES = 10;
  public static int PQSL_DUAL4_MANDORDTOT = 11;
  public static int PQSL_DUAL4_DISPONCA3 = 12;
  public static int PQSL_DUAL4_STANZINIFPV = 13;
  public static int PQSL_DUAL4_VARIAZFPV = 14;
  public static int PQSL_DUAL4_STANZATTFPV = 15;
  public static int PQSL_DUAL4_DISPONFPV = 16;
  public static int PQSL_DUAL4_IMPEGNATOFPV = 17;
  public static int PQSL_DUAL4_STANZINIIMP = 18;
  public static int PQSL_DUAL4_VARIMP = 19;
  public static int PQSL_DUAL4_STNATTIMP = 20;
  public static int PQSL_DUAL4_DISPIMP = 21;
  public static int PQSL_DUAL4_REISCRIMP = 22;
  public static int PQSL_DUAL4_STNINISTN = 23;
  public static int PQSL_DUAL4_VARSTN = 24;
  public static int PQSL_DUAL4_STNATTSTN = 25;
  public static int PQSL_DUAL4_DISPSTN = 26;
  public static int PQSL_DUAL4_IMPSTN = 27;
  public static int PQSL_DUAL4_FPV = 28;
  public static int PQSL_DUAL4_RECORIMPOFPV = 29;
  public static int PQSL_DUAL4_SUREISCRESI = 30;
  public static int PQSL_DUAL4_SUREISCSTANZ = 31;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL = 3923;
  public static int PQSL_DUAL_IMPINIZIALE = 0;
  public static int PQSL_DUAL_IMPVARIAZION = 1;
  public static int PQSL_DUAL_IMPATTUALE = 2;
  public static int PQSL_DUAL_ORDSUBIMP = 3;
  public static int PQSL_DUAL_DISPONIBILIT = 4;
  public static int PQSL_DUAL_DISPEFFETTIV = 5;
  public static int PQSL_DUAL_LIQUIDAZIONI = 6;
  public static int PQSL_DUAL_MANDATI = 7;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ11 = 3924;
  public static int PQSL_LIQ11_RECORLIQIMPO = 0;
  public static int PQSL_LIQ11_RECORLIQRITE = 1;
  public static int PQSL_LIQ11_DOCUMENTO = 2;
  public static int PQSL_LIQ11_UFFICIO = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI523 = 3925;
  public static int PQRY_PARAMETRI523_RS = 3926;
  public static int PQSL_PARAMETRI523_NOMOGGESEPLU = 0;
  public static int PQSL_PARAMETRI523_NOMOGGCAPPAR = 1;
  public static int PQSL_PARAMETRI523_NOMOGGARTPAR = 2;
  public static int PQSL_PARAMETRI523_NOOGTOPEANFE = 3;
  public static int PQSL_PARAMETRI523_NOOGTOPEANFC = 4;
  public static int PQSL_PARAMETRI523_NOOGTOPECAPC = 5;
  public static int PQSL_PARAMETRI523_NOMOGGTIPSTA = 6;
  public static int PQSL_PARAMETRI523_NOMEOGGEORDI = 7;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY6 = 3927;

  // Table to contain panel selected row: Capitoli FPV
  //
  public static int PQRY_CAPITOLIFPV1 = 3928;
  public static int PQRY_CAPITOLIFPV1_RS = 3929;
  public static int PQSL_CAPITOLIFPV1_ORDINAMENTO = 0;
  public static int PQSL_CAPITOLIFPV1_CAPCAPCAPFPV = 1;
  public static int PQSL_CAPITOLIFPV1_CAPCAPARTFPV = 2;
  public static int PQSL_CAPITOLIFPV1_CAPDESCAPFPV = 3;
  public static int PQSL_CAPITOLIFPV1_CAPCAPFPVMIS = 4;
  public static int PQSL_CAPITOLIFPV1_CAPCAPFPVPRO = 5;
  public static int PQSL_CAPITOLIFPV1_CAPCAPFPVTIT = 6;
  public static int PQSL_CAPITOLIFPV1_CAPIMPFPVESI = 7;
  public static int PQSL_CAPITOLIFPV1_CAPIMPFPVCRO = 8;
  public static int PQSL_CAPITOLIFPV1_CAPFPVANNENT = 9;

  // Table to contain panel selected row: Capitoli FPV
  //
  public static int PQRY_CAPITOLIFPV2 = 3930;
  public static int PQRY_CAPITOLIFPV2_RS = 3931;
  public static int PQSL_CAPITOLIFPV2_ORDINAMENTO = 0;
  public static int PQSL_CAPITOLIFPV2_CAPCAPCAPFPV = 1;
  public static int PQSL_CAPITOLIFPV2_CAPCAPARTFPV = 2;
  public static int PQSL_CAPITOLIFPV2_CAPDESCAPFPV = 3;
  public static int PQSL_CAPITOLIFPV2_CAPITFPVMISS = 4;
  public static int PQSL_CAPITOLIFPV2_CAPITFPVPROG = 5;
  public static int PQSL_CAPITOLIFPV2_CAPITFPVTITO = 6;
  public static int PQSL_CAPITOLIFPV2_CAPIMPFPVESI = 7;
  public static int PQSL_CAPITOLIFPV2_CAPIMPFPVCRO = 8;
  public static int PQSL_CAPITOLIFPV2_CAPFPVANNENT = 9;
  public static int PQSL_CAPITOLIFPV2_CAPITOLOFPV = 10;
  public static int PQSL_CAPITOLIFPV2_CAPFPVCAANDE = 11;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVAR = 3932;
  public static int QSL_CFASELINTVAR_COUNT = 0;

  // Table to contain panel selected row: VISTA RICLASSIFICAZIONI CAP
  //
  public static int PQRY_VISTARICLCAP = 3933;
  public static int PQSL_VISTARICLCAP_RECORDCAPITO = 0;
  public static int PQSL_VISTARICLCAP_RECORDARTICO = 1;
  public static int PQSL_VISTARICLCAP_RECORDCODICE = 2;
  public static int PQSL_VISTARICLCAP_RECORDESCCAP = 3;
  public static int PQSL_VISTARICLCAP_ORDINAMENTO = 4;
  public static int PQSL_VISTARICLCAP_RECOSTNINICO = 5;
  public static int PQSL_VISTARICLCAP_RECORVARIACO = 6;
  public static int PQSL_VISTARICLCAP_STANZATTUALE = 7;
  public static int PQSL_VISTARICLCAP_RECOMISSTITO = 8;
  public static int PQSL_VISTARICLCAP_DESCMISSIONE = 9;
  public static int PQSL_VISTARICLCAP_RECOPROGTIPO = 10;
  public static int PQSL_VISTARICLCAP_RECORDESPROG = 11;
  public static int PQSL_VISTARICLCAP_RECORDTITOLO = 12;
  public static int PQSL_VISTARICLCAP_DESCTITOLO = 13;

  // Table to contain panel selected row: FPV DA ESIG
  //
  public static int PQRY_FPVDAESIG2 = 3934;
  public static int PQSL_FPVDAESIG2_CAPITOLOFPV = 0;
  public static int PQSL_FPVDAESIG2_ARTICOLOFPV = 1;
  public static int PQSL_FPVDAESIG2_DESCRIZIOFPV = 2;
  public static int PQSL_FPVDAESIG2_CODICE = 3;
  public static int PQSL_FPVDAESIG2_REFPDAESNUIM = 4;
  public static int PQSL_FPVDAESIG2_REFPDAESANIM = 5;
  public static int PQSL_FPVDAESIG2_RECFPVDAESCA = 6;
  public static int PQSL_FPVDAESIG2_RECFPVDAESAR = 7;
  public static int PQSL_FPVDAESIG2_REFPDAESDECA = 8;
  public static int PQSL_FPVDAESIG2_REFPDAESANES = 9;
  public static int PQSL_FPVDAESIG2_RECFPVDAESIM = 10;
  public static int PQSL_FPVDAESIG2_REFPDAESDDAR = 11;
  public static int PQSL_FPVDAESIG2_REFPDAESNUIP = 12;
  public static int PQSL_FPVDAESIG2_REFPDAESANIP = 13;
  public static int PQSL_FPVDAESIG2_RECORDBILVAR = 14;
  public static int PQSL_FPVDAESIG2_REFPDAESPRVA = 15;
  public static int PQSL_FPVDAESIG2_ANNOIMPEPADR = 16;
  public static int PQSL_FPVDAESIG2_REFPDAESPRUO = 17;
  public static int PQSL_FPVDAESIG2_REFPDAESANEN = 18;
  public static int PQSL_FPVDAESIG2_REFPDAESANEP = 19;

  // Table to contain panel selected row: FPV DA ESIG
  //
  public static int PQRY_FPVDAESIG3 = 3935;
  public static int PQSL_FPVDAESIG3_IMPORTO = 0;
  public static int PQSL_FPVDAESIG3_ANNOIMPEPADR = 1;

  // Table to contain panel selected row: FPV DA CRONO
  //
  public static int PQRY_FPVDACRONO3 = 3936;
  public static int PQSL_FPVDACRONO3_CAPITOLOFPV = 0;
  public static int PQSL_FPVDACRONO3_ARTICOLOFPV = 1;
  public static int PQSL_FPVDACRONO3_DESCRIZIOFPV = 2;
  public static int PQSL_FPVDACRONO3_CODICE = 3;
  public static int PQSL_FPVDACRONO3_REFPDACRCRID = 4;
  public static int PQSL_FPVDACRONO3_RECFPVDACRCA = 5;
  public static int PQSL_FPVDACRONO3_RECFPVDACRAR = 6;
  public static int PQSL_FPVDACRONO3_REFPDACRDECC = 7;
  public static int PQSL_FPVDACRONO3_RECFPVDACROP = 8;
  public static int PQSL_FPVDACRONO3_RECOOPERDESC = 9;
  public static int PQSL_FPVDACRONO3_REFPDACRESPL = 10;
  public static int PQSL_FPVDACRONO3_RECFPVDACRIM = 11;
  public static int PQSL_FPVDACRONO3_REFPDACRDAVA = 12;
  public static int PQSL_FPVDACRONO3_RECORDBILVAR = 13;
  public static int PQSL_FPVDACRONO3_REFPDACRPRVA = 14;
  public static int PQSL_FPVDACRONO3_ANNOFINANZ = 15;
  public static int PQSL_FPVDACRONO3_RECFPVDACRFI = 16;
  public static int PQSL_FPVDACRONO3_RECPROUNIORG = 17;

  // Table to contain panel selected row: FPV DA CRONO
  //
  public static int PQRY_FPVDACRONO2 = 3937;
  public static int PQSL_FPVDACRONO2_IMPORTO = 0;
  public static int PQSL_FPVDACRONO2_REFPDACRANFI = 1;

  // Table to contain panel selected row: FPV DA CRONO
  //
  public static int PQRY_FPVDACRONO4 = 3938;
  public static int PQSL_FPVDACRONO4_RECFPVDACRCA = 0;
  public static int PQSL_FPVDACRONO4_RECFPVDACRAR = 1;
  public static int PQSL_FPVDACRONO4_REFPDACRDECA = 2;
  public static int PQSL_FPVDACRONO4_REFPDACRESPL = 3;
  public static int PQSL_FPVDACRONO4_IMPORTO = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI498 = 3939;
  public static int PQRY_PARAMETRI498_RS = 3940;
  public static int PQSL_PARAMETRI498_NOMOGGESEPLU = 0;
  public static int PQSL_PARAMETRI498_NOMOGGCAPPAR = 1;
  public static int PQSL_PARAMETRI498_NOMOGGARTPAR = 2;
  public static int PQSL_PARAMETRI498_NOOGTOPEAMPE = 3;
  public static int PQSL_PARAMETRI498_NOOGTOPEAMPC = 4;
  public static int PQSL_PARAMETRI498_NOMOGGTIPSTA = 5;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP1 = 3941;
  public static int PQSL_CAP1_RECORCAPCAPI = 0;
  public static int PQSL_CAP1_RECORCAPARTI = 1;
  public static int PQSL_CAP1_RECORCAPDESC = 2;
  public static int PQSL_CAP1_RECBILSTINCO = 3;
  public static int PQSL_CAP1_RECOBILVARCO = 4;
  public static int PQSL_CAP1_STANZATTUALE = 5;

  // Table to contain panel selected row: FPV DA ESIG
  //
  public static int PQRY_FPVDAESIG1 = 3942;
  public static int PQSL_FPVDAESIG1_CAPITOLOFPV = 0;
  public static int PQSL_FPVDAESIG1_ARTICOLOFPV = 1;
  public static int PQSL_FPVDAESIG1_DESCRIZIOFPV = 2;
  public static int PQSL_FPVDAESIG1_REFPDAESENUI = 3;
  public static int PQSL_FPVDAESIG1_REFPDAESEANI = 4;
  public static int PQSL_FPVDAESIG1_RECFPDAESECA = 5;
  public static int PQSL_FPVDAESIG1_RECFPDAESEAR = 6;
  public static int PQSL_FPVDAESIG1_REFPDAESEDEC = 7;
  public static int PQSL_FPVDAESIG1_REFPDAESEAN1 = 8;
  public static int PQSL_FPVDAESIG1_RECFPDAESEIM = 9;
  public static int PQSL_FPVDAESIG1_REFPDAESEDDR = 10;
  public static int PQSL_FPVDAESIG1_REFPDAESENIP = 11;
  public static int PQSL_FPVDAESIG1_REFPDAESEAIP = 12;
  public static int PQSL_FPVDAESIG1_RECORDBILVAR = 13;
  public static int PQSL_FPVDAESIG1_REFPDAESEPRV = 14;
  public static int PQSL_FPVDAESIG1_ANNOIMPEPADR = 15;
  public static int PQSL_FPVDAESIG1_RECORDMISSIO = 16;
  public static int PQSL_FPVDAESIG1_PROGRAMMA = 17;
  public static int PQSL_FPVDAESIG1_REFPDAESECOS = 18;
  public static int PQSL_FPVDAESIG1_REFPDAESEPUO = 19;
  public static int PQSL_FPVDAESIG1_REFPDAESEANE = 20;
  public static int PQSL_FPVDAESIG1_REFPDAESANEP = 21;

  // Table to contain panel selected row: FPV DA ESIG
  //
  public static int PQRY_FPVDAESIG = 3943;
  public static int PQSL_FPVDAESIG_IMPORTO = 0;
  public static int PQSL_FPVDAESIG_RECORDMISSIO = 1;
  public static int PQSL_FPVDAESIG_PROGRAMMA = 2;

  // Table to contain panel selected row: FPV DA CRONO
  //
  public static int PQRY_FPVDACRONO1 = 3944;
  public static int PQSL_FPVDACRONO1_CAPITOLOFPV = 0;
  public static int PQSL_FPVDACRONO1_ARTICOLOFPV = 1;
  public static int PQSL_FPVDACRONO1_DESCRIZIOFPV = 2;
  public static int PQSL_FPVDACRONO1_REFPDACRCRID = 3;
  public static int PQSL_FPVDACRONO1_RECFPVDACRCA = 4;
  public static int PQSL_FPVDACRONO1_RECFPVDACRAR = 5;
  public static int PQSL_FPVDACRONO1_REFPDACRDECC = 6;
  public static int PQSL_FPVDACRONO1_RECFPVDACROP = 7;
  public static int PQSL_FPVDACRONO1_RECOOPERDESC = 8;
  public static int PQSL_FPVDACRONO1_REFPDACRESPL = 9;
  public static int PQSL_FPVDACRONO1_RECFPVDACRIM = 10;
  public static int PQSL_FPVDACRONO1_REFPDACRDAVA = 11;
  public static int PQSL_FPVDACRONO1_RECORDBILVAR = 12;
  public static int PQSL_FPVDACRONO1_REFPDACRPRVA = 13;
  public static int PQSL_FPVDACRONO1_RECFPVDACRFI = 14;
  public static int PQSL_FPVDACRONO1_REFPDACRANFI = 15;
  public static int PQSL_FPVDACRONO1_RECORDMISSIO = 16;
  public static int PQSL_FPVDACRONO1_RECORDPROGRA = 17;
  public static int PQSL_FPVDACRONO1_RECPROUNIORG = 18;

  // Table to contain panel selected row: FPV DA CRONO
  //
  public static int PQRY_FPVDACRONO = 3945;
  public static int PQSL_FPVDACRONO_IMPORTO = 0;
  public static int PQSL_FPVDACRONO_RECORDMISSIO = 1;
  public static int PQSL_FPVDACRONO_RECORDPROGRA = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI330 = 3946;
  public static int PQRY_PARAMETRI330_RS = 3947;
  public static int PQSL_PARAMETRI330_UNITA_PROPONENTE = 0;
  public static int PQSL_PARAMETRI330_NUMERO_PROPOSTA = 1;
  public static int PQSL_PARAMETRI330_ANNO_PROPOSTA = 2;
  public static int PQSL_PARAMETRI330_SEDE_DEL = 3;
  public static int PQSL_PARAMETRI330_NUMERO_DEL = 4;
  public static int PQSL_PARAMETRI330_ANNO_DEL = 5;
  public static int PQSL_PARAMETRI330_D_DATA_REG = 6;
  public static int PQSL_PARAMETRI330_TIPO_VAR = 7;
  public static int PQSL_PARAMETRI330_DESCRIZIONE = 8;

  // Table to contain panel selected row: CRONO ESIG BPR DEP
  //
  public static int PQRY_CROESIBPRDE6 = 3948;
  public static int PQRY_CROESIBPRDE6_RS = 3949;
  public static int PQSL_CROESIBPRDE6_RECOFINAFINA = 0;
  public static int PQSL_CROESIBPRDE6_RECFINDESFIN = 1;
  public static int PQSL_CROESIBPRDE6_RECOFINAIMPO = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI505 = 3950;
  public static int PQRY_PARAMETRI505_RS = 3951;
  public static int PQSL_PARAMETRI505_RECVARPROTOT = 0;
  public static int PQSL_PARAMETRI505_RECVARPROPUR = 1;
  public static int PQSL_PARAMETRI505_RECVARPROESI = 2;
  public static int PQSL_PARAMETRI505_RECVARPROSTN = 3;
  public static int PQSL_PARAMETRI505_RECVARPROCAS = 4;
  public static int PQSL_PARAMETRI505_RECSTAATTOPR = 5;
  public static int PQSL_PARAMETRI505_RECSTAATPUPR = 6;
  public static int PQSL_PARAMETRI505_RECSTAATESPR = 7;
  public static int PQSL_PARAMETRI505_RECSTAATSTPR = 8;
  public static int PQSL_PARAMETRI505_RECSTAATCAPR = 9;
  public static int PQSL_PARAMETRI505_RECDISTOTPRO = 10;
  public static int PQSL_PARAMETRI505_RECDISPURPRO = 11;
  public static int PQSL_PARAMETRI505_RECDISESIPRO = 12;
  public static int PQSL_PARAMETRI505_RECDISSTNPRO = 13;
  public static int PQSL_PARAMETRI505_RECDISCASPRO = 14;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS34 = 3952;
  public static int PQRY_PARS34_RS = 3953;
  public static int PQSL_PARS34_NOMEOGGETTES = 0;
  public static int PQSL_PARS34_NOMOGGVAPUPO = 1;
  public static int PQSL_PARS34_NOMOGGVAPUNE = 2;
  public static int PQSL_PARS34_NOMOGGVAIMPO = 3;
  public static int PQSL_PARS34_NOMOGGVAIMNE = 4;
  public static int PQSL_PARS34_NOMOGGVASTPO = 5;
  public static int PQSL_PARS34_NOMOGGVASTNE = 6;
  public static int PQSL_PARS34_NOMOGGVACAPO = 7;
  public static int PQSL_PARS34_NOMOGGVACANE = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI522 = 3954;
  public static int PQRY_PARAMETRI522_RS = 3955;
  public static int PQSL_PARAMETRI522_NOMOGGESEPLU = 0;
  public static int PQSL_PARAMETRI522_NOOGTOPEANFE = 1;
  public static int PQSL_PARAMETRI522_NOOGTOPEANFC = 2;
  public static int PQSL_PARAMETRI522_NOOGTOPECAPC = 3;

  // Table to contain panel selected row: FPV ESIG BPR DEP
  //
  public static int PQRY_FPVESIBPRDE2 = 3956;
  public static int PQSL_FPVESIBPRDE2_REFPDAESNUIM = 0;
  public static int PQSL_FPVESIBPRDE2_REFPDAESANIM = 1;
  public static int PQSL_FPVESIBPRDE2_RECFPVDAESCA = 2;
  public static int PQSL_FPVESIBPRDE2_RECFPVDAESAR = 3;
  public static int PQSL_FPVESIBPRDE2_REFPDAESDECA = 4;
  public static int PQSL_FPVESIBPRDE2_REFPDAESANES = 5;
  public static int PQSL_FPVESIBPRDE2_RECFPVDAESIM = 6;
  public static int PQSL_FPVESIBPRDE2_REFPDAESDDAR = 7;
  public static int PQSL_FPVESIBPRDE2_REFPDAESNUIP = 8;
  public static int PQSL_FPVESIBPRDE2_REFPDAESANIP = 9;
  public static int PQSL_FPVESIBPRDE2_RECORDBILVAR = 10;
  public static int PQSL_FPVESIBPRDE2_REFPDAESPRVA = 11;
  public static int PQSL_FPVESIBPRDE2_ANNOIMPEPADR = 12;
  public static int PQSL_FPVESIBPRDE2_REFPDAESPRUO = 13;

  // Table to contain panel selected row: FPV ESIG BPR DEP
  //
  public static int PQRY_FPVESIBPRDEP = 3957;
  public static int PQSL_FPVESIBPRDEP_IMPORTO = 0;
  public static int PQSL_FPVESIBPRDEP_ANNOIMPEPADR = 1;

  // Table to contain panel selected row: CRONO ESIG BPR DEP
  //
  public static int PQRY_CROESIBPRDE2 = 3958;
  public static int PQSL_CROESIBPRDE2_REFPDACRCRID = 0;
  public static int PQSL_CROESIBPRDE2_RECFPVDACRCA = 1;
  public static int PQSL_CROESIBPRDE2_RECFPVDACRAR = 2;
  public static int PQSL_CROESIBPRDE2_REFPDACRDECC = 3;
  public static int PQSL_CROESIBPRDE2_RECFPVDACROP = 4;
  public static int PQSL_CROESIBPRDE2_RECOOPERDESC = 5;
  public static int PQSL_CROESIBPRDE2_REFPDACRESPL = 6;
  public static int PQSL_CROESIBPRDE2_RECFPVDACRIM = 7;
  public static int PQSL_CROESIBPRDE2_REFPDACRDAVA = 8;
  public static int PQSL_CROESIBPRDE2_RECORDBILVAR = 9;
  public static int PQSL_CROESIBPRDE2_REFPDACRPRVA = 10;
  public static int PQSL_CROESIBPRDE2_REFPDACRANFI = 11;
  public static int PQSL_CROESIBPRDE2_RECFPVDACRFI = 12;
  public static int PQSL_CROESIBPRDE2_RECPROUNIORG = 13;

  // Table to contain panel selected row: CRONO ESIG BPR DEP
  //
  public static int PQRY_CROESIBPRDE1 = 3959;
  public static int PQSL_CROESIBPRDE1_IMPORTO = 0;
  public static int PQSL_CROESIBPRDE1_REFPDACRANFI = 1;

  // Table to contain panel selected row: CRONO ESIG BPR DEP
  //
  public static int PQRY_CROESIBPRDEP = 3960;
  public static int PQSL_CROESIBPRDEP_RECFPVDACRCA = 0;
  public static int PQSL_CROESIBPRDEP_RECFPVDACRAR = 1;
  public static int PQSL_CROESIBPRDEP_REFPDACRDECC = 2;
  public static int PQSL_CROESIBPRDEP_REFPDACRESPL = 3;
  public static int PQSL_CROESIBPRDEP_IMPORTO = 4;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM156 = 3961;
  public static int PQRY_PARAM156_RS = 3962;
  public static int PQSL_PARAM156_NOMEOGGECODI = 0;

  // Table to contain panel selected row: PROPOSTE VB
  //
  public static int PQRY_PROPOSTEVB2 = 3963;
  public static int PQSL_PROPOSTEVB2_PROGRESSIVO = 0;
  public static int PQSL_PROPOSTEVB2_TIPO = 1;
  public static int PQSL_PROPOSTEVB2_ASSESTAMENTO = 2;
  public static int PQSL_PROPOSTEVB2_ESERCIZIO = 3;
  public static int PQSL_PROPOSTEVB2_E_S = 4;
  public static int PQSL_PROPOSTEVB2_CAPITOLO = 5;
  public static int PQSL_PROPOSTEVB2_ARTICOLO = 6;
  public static int PQSL_PROPOSTEVB2_IMPORTO_1 = 7;
  public static int PQSL_PROPOSTEVB2_IMPORTO_2 = 8;
  public static int PQSL_PROPOSTEVB2_IMPORTO_3 = 9;
  public static int PQSL_PROPOSTEVB2_DESCRIZIONE = 10;
  public static int PQSL_PROPOSTEVB2_TIPO_VAR = 11;
  public static int PQSL_PROPOSTEVB2_VAR_BIL_1 = 12;
  public static int PQSL_PROPOSTEVB2_CONS_SVILUPPO = 13;
  public static int PQSL_PROPOSTEVB2_ISTITUZIONE_NC = 14;
  public static int PQSL_PROPOSTEVB2_PROGETTO_ID = 15;
  public static int PQSL_PROPOSTEVB2_FINANZIAMENTO = 16;
  public static int PQSL_PROPOSTEVB2_OPERA = 17;
  public static int PQSL_PROPOSTEVB2_STATO = 18;
  public static int PQSL_PROPOSTEVB2_UTENTE_INSERIMENTO = 19;
  public static int PQSL_PROPOSTEVB2_DATA_INSERIMENTO = 20;
  public static int PQSL_PROPOSTEVB2_UTENTE_AGGIORNAMENTO = 21;
  public static int PQSL_PROPOSTEVB2_DATA_ULT_AGG = 22;
  public static int PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO = 23;
  public static int PQSL_PROPOSTEVB2_PROGR_STANZIAMENTO_FC = 24;
  public static int PQSL_PROPOSTEVB2_PROGR_VARCOM_1 = 25;
  public static int PQSL_PROPOSTEVB2_PROGR_VARCOMPRO_1 = 26;
  public static int PQSL_PROPOSTEVB2_FATTORE = 27;
  public static int PQSL_PROPOSTEVB2_CENTRO = 28;
  public static int PQSL_PROPOSTEVB2_PROGR_UNITA_ORGANIZZATIVA = 29;
  public static int PQSL_PROPOSTEVB2_NOTE1 = 30;
  public static int PQSL_PROPOSTEVB2_NOTE = 31;
  public static int PQSL_PROPOSTEVB2_VAR_BIL_2 = 32;
  public static int PQSL_PROPOSTEVB2_VAR_BIL_3 = 33;

  // Table to contain panel selected row: Finanziamento
  //
  public static int PQRY_FINANZIAMEN2 = 3964;
  public static int PQRY_FINANZIAMEN2_RS = 3965;
  public static int PQSL_FINANZIAMEN2_NOMEOGGEFINO = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM108 = 3966;
  public static int PQRY_PARAM108_RS = 3967;
  public static int PQSL_PARAM108_NOMEOGGECODI = 0;
  public static int PQSL_PARAM108_NOMEOGGEDESC = 1;

  // Table to contain panel selected row: PROPOSTE VB
  //
  public static int PQRY_PROPOSTEVB1 = 3968;
  public static int PQSL_PROPOSTEVB1_ENTRATE1 = 0;
  public static int PQSL_PROPOSTEVB1_IMP2E = 1;
  public static int PQSL_PROPOSTEVB1_IMP3E = 2;
  public static int PQSL_PROPOSTEVB1_ENTRATE = 3;
  public static int PQSL_PROPOSTEVB1_IMP2EN = 4;
  public static int PQSL_PROPOSTEVB1_IMP3EN = 5;
  public static int PQSL_PROPOSTEVB1_TOTALE = 6;
  public static int PQSL_PROPOSTEVB1_TOT2 = 7;
  public static int PQSL_PROPOSTEVB1_TOT3 = 8;
  public static int PQSL_PROPOSTEVB1_PROGRESSIVO = 9;
  public static int PQSL_PROPOSTEVB1_TIPO = 10;

  // Table to contain panel selected row: PROPOSTE VB
  //
  public static int PQRY_PROPOSTEVB3 = 3969;
  public static int PQSL_PROPOSTEVB3_SPESE1 = 0;
  public static int PQSL_PROPOSTEVB3_IMP2E = 1;
  public static int PQSL_PROPOSTEVB3_IMP3E = 2;
  public static int PQSL_PROPOSTEVB3_SPESE = 3;
  public static int PQSL_PROPOSTEVB3_IMP2EN = 4;
  public static int PQSL_PROPOSTEVB3_IMP3EN = 5;
  public static int PQSL_PROPOSTEVB3_TOTALE = 6;
  public static int PQSL_PROPOSTEVB3_TOT2 = 7;
  public static int PQSL_PROPOSTEVB3_TOT3 = 8;
  public static int PQSL_PROPOSTEVB3_PROGRESSIVO = 9;
  public static int PQSL_PROPOSTEVB3_TIPO = 10;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM109 = 3970;
  public static int PQRY_PARAM109_RS = 3971;
  public static int PQSL_PARAM109_NOMEOGGETIPO = 0;
  public static int PQSL_PARAM109_NOMEOGGEESER = 1;
  public static int PQSL_PARAM109_NOMOGGSOPRAP = 2;
  public static int PQSL_PARAM109_NOMOGGSOSEDI = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM110 = 3972;
  public static int PQRY_PARAM110_RS = 3973;
  public static int PQSL_PARAM110_NOMOGGSOPRAP = 0;
  public static int PQSL_PARAM110_NOMOGGTIPVAR = 1;

  // Table to contain panel selected row: PROPOSTE VB
  //
  public static int PQRY_PROPOSTEVB = 3974;
  public static int PQRY_PROPOSTEVB_RS = 3975;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP4 = 0;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP5 = 1;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP6 = 2;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP1 = 3;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP2 = 4;
  public static int PQSL_PROPOSTEVB_NOMEOGGEIMP3 = 5;
  public static int PQSL_PROPOSTEVB_QUADRATURA = 6;
  public static int PQSL_PROPOSTEVB_Q2 = 7;
  public static int PQSL_PROPOSTEVB_Q3 = 8;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM111 = 3976;
  public static int PQRY_PARAM111_RS = 3977;
  public static int PQSL_PARAM111_NOMEOGGEASSE = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM112 = 3978;
  public static int PQRY_PARAM112_RS = 3979;
  public static int PQSL_PARAM112_NOMEOGGEVARI = 0;
  public static int PQSL_PARAM112_NOMOGGDATVAR = 1;
  public static int PQSL_PARAM112_NOMEOGGEPROP = 2;
  public static int PQSL_PARAM112_NOMOGGNUMPRO = 3;
  public static int PQSL_PARAM112_NOMOGGANNPRO = 4;
  public static int PQSL_PARAM112_NOMEOGGEDELI = 5;
  public static int PQSL_PARAM112_NOMOGGNUMDEL = 6;
  public static int PQSL_PARAM112_NOMOGGANNDEL = 7;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM113 = 3980;
  public static int PQRY_PARAM113_RS = 3981;
  public static int PQSL_PARAM113_NOMEOGGEASSE = 0;

  // Table to contain panel selected row: DETTAGLI LIQ ART18
  //
  public static int PQRY_DETTALIQART1 = 3982;
  public static int PQSL_DETTALIQART1_PROGRESSIVO = 0;
  public static int PQSL_DETTALIQART1_ANNO = 1;
  public static int PQSL_DETTALIQART1_NUMERO = 2;
  public static int PQSL_DETTALIQART1_TIPO = 3;
  public static int PQSL_DETTALIQART1_COD_BENEFICIARIO = 4;
  public static int PQSL_DETTALIQART1_RAGIONE_SOCIALE_BEN = 5;
  public static int PQSL_DETTALIQART1_PROGR_PK_DOC = 6;
  public static int PQSL_DETTALIQART1_ANNO_PK_DOC = 7;
  public static int PQSL_DETTALIQART1_NUMERO_DOCUMENTO = 8;
  public static int PQSL_DETTALIQART1_DATA_DOCUMENTO = 9;
  public static int PQSL_DETTALIQART1_IMPORTO = 10;
  public static int PQSL_DETTALIQART1_UFFICIO = 11;
  public static int PQSL_DETTALIQART1_RESPONSABILE = 12;
  public static int PQSL_DETTALIQART1_NORMA = 13;
  public static int PQSL_DETTALIQART1_DA_PUBBLICARE = 14;
  public static int PQSL_DETTALIQART1_UTENTE_INSERIMENTO = 15;
  public static int PQSL_DETTALIQART1_DATA_INSERIMENTO = 16;
  public static int PQSL_DETTALIQART1_UTENTE_ULTIMO_AGG = 17;
  public static int PQSL_DETTALIQART1_DATA_ULTIMO_AGG = 18;
  public static int PQSL_DETTALIQART1_INSERIMENTO_MANUALE = 19;
  public static int PQSL_DETTALIQART1_PUBBLICATO = 20;
  public static int PQSL_DETTALIQART1_MODALITA = 21;
  public static int PQSL_DETTALIQART1_NOTE = 22;

  // Table to contain panel selected row: ALLEGATI LIQ ART18
  //
  public static int PQRY_ALLEGLIQART1 = 3983;
  public static int PQSL_ALLEGLIQART1_PROGRESSIVO = 0;
  public static int PQSL_ALLEGLIQART1_PROGR_DETTAGLIO = 1;
  public static int PQSL_ALLEGLIQART1_COD_TIPO_ALLEGATO = 2;
  public static int PQSL_ALLEGLIQART1_DESCR_TIPO_ALLEGATO = 3;
  public static int PQSL_ALLEGLIQART1_NOTE = 4;
  public static int PQSL_ALLEGLIQART1_FILE_DATI = 5;
  public static int PQSL_ALLEGLIQART1_NOME_FILE = 6;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM140 = 3984;
  public static int PQRY_PARAM140_RS = 3985;
  public static int PQSL_PARAM140_NOMEOGGEPART = 0;
  public static int PQSL_PARAM140_NOMOGGMAGMIN = 1;
  public static int PQSL_PARAM140_NOMOGGDATELA = 2;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM139 = 3986;
  public static int PQRY_PARAM139_RS = 3987;
  public static int PQSL_PARAM139_NOMEOGGETTES = 0;

  // Table to contain panel selected row: WRK QGRS
  //
  public static int PQRY_WRKQGRS = 3988;
  public static int PQSL_WRKQGRS_ESERCIZIO = 0;
  public static int PQSL_WRKQGRS_PAGAMENTI = 1;
  public static int PQSL_WRKQGRS_VINCOLATI_GES = 2;
  public static int PQSL_WRKQGRS_CAPITALE_GES = 3;
  public static int PQSL_WRKQGRS_AMMORTAMENTO_GES = 4;
  public static int PQSL_WRKQGRS_NON_VINCOLATI_GES = 5;
  public static int PQSL_WRKQGRS_VINCOLATI_AMM = 6;
  public static int PQSL_WRKQGRS_CAPITALE_AMM = 7;
  public static int PQSL_WRKQGRS_AMMORTAMENTO_AMM = 8;
  public static int PQSL_WRKQGRS_NON_VINCOLATI_AMM = 9;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP = 3989;
  public static int PQSL_CAP_RECORCAPDESC = 0;
  public static int PQSL_CAP_RECOSTANDEFI = 1;

  // Table to contain panel selected row: WORK CONTO CONS DL77
  //
  public static int PQRY_WORCONCONDL8 = 3990;
  public static int PQSL_WORCONCONDL8_PROGRESSIVO = 0;
  public static int PQSL_WORCONCONDL8_ESERCIZIO = 1;
  public static int PQSL_WORCONCONDL8_TIPO = 2;
  public static int PQSL_WORCONCONDL8_DESCRIZIONE = 3;
  public static int PQSL_WORCONCONDL8_IMPORTO = 4;

  // Table to contain panel selected row: WORK CONTO CONS DL77
  //
  public static int PQRY_WORCONCONDL7 = 3991;
  public static int PQSL_WORCONCONDL7_PROGRESSIVO = 0;
  public static int PQSL_WORCONCONDL7_ESERCIZIO = 1;
  public static int PQSL_WORCONCONDL7_TIPO = 2;
  public static int PQSL_WORCONCONDL7_DESCRIZIONE = 3;
  public static int PQSL_WORCONCONDL7_DASPESA = 4;
  public static int PQSL_WORCONCONDL7_DAESIGIBILIT = 5;
  public static int PQSL_WORCONCONDL7_DIFFERENZA = 6;
  public static int PQSL_WORCONCONDL7_IMPORTO = 7;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM138 = 3992;
  public static int PQRY_PARAM138_RS = 3993;
  public static int PQSL_PARAM138_NOMEOGGEPART = 0;
  public static int PQSL_PARAM138_NOMOGGMAGMIN = 1;
  public static int PQSL_PARAM138_NOMOGGDATELA = 2;
  public static int PQSL_PARAM138_NOMEOGGEDETT = 3;

  // Table to contain panel selected row: Parametri IN
  //
  public static int PQRY_PARAMETRIIN1 = 3994;
  public static int PQRY_PARAMETRIIN1_RS = 3995;
  public static int PQSL_PARAMETRIIN1_ROWNAMGEDEEN = 0;
  public static int PQSL_PARAMETRIIN1_RONAMAOMIECS = 1;
  public static int PQSL_PARAMETRIIN1_ROWNAMELDERI = 2;
  public static int PQSL_PARAMETRIIN1_RONAMAOMECS1 = 3;
  public static int PQSL_PARAMETRIIN1_ROWNAMGEDESP = 4;
  public static int PQSL_PARAMETRIIN1_RONAMAOMECS2 = 5;
  public static int PQSL_PARAMETRIIN1_RONAFUDEDERE = 6;
  public static int PQSL_PARAMETRIIN1_RONAMAOMECS3 = 7;
  public static int PQSL_PARAMETRIIN1_RONACOCOEDIN = 8;
  public static int PQSL_PARAMETRIIN1_RONAMAOMECS4 = 9;
  public static int PQSL_PARAMETRIIN1_RONAQUGERIDE = 10;
  public static int PQSL_PARAMETRIIN1_RONAQUGERIDS = 11;
  public static int PQSL_PARAMETRIIN1_ROWNAMQURIDI = 12;
  public static int PQSL_PARAMETRIIN1_RONAQURIGECO = 13;
  public static int PQSL_PARAMETRIIN1_RONAQURIGEFI = 14;
  public static int PQSL_PARAMETRIIN1_ROWNAMPARDEF = 15;
  public static int PQSL_PARAMETRIIN1_ROWNAMPRDICO = 16;
  public static int PQSL_PARAMETRIIN1_ROWNAMCONECO = 17;
  public static int PQSL_PARAMETRIIN1_ROWNAMCODEPA = 18;
  public static int PQSL_PARAMETRIIN1_RONAMOPADIST = 19;
  public static int PQSL_PARAMETRIIN1_ROWNAMINCONA = 20;
  public static int PQSL_PARAMETRIIN1_ROWNAMESERIF = 21;
  public static int PQSL_PARAMETRIIN1_ROWNAMETRIME = 22;
  public static int PQSL_PARAMETRIIN1_ROWNAMETRIM1 = 23;
  public static int PQSL_PARAMETRIIN1_ROWNAMEPERIO = 24;
  public static int PQSL_PARAMETRIIN1_ROWNAMEPERI1 = 25;

  // Table to contain panel selected row: Sql
  //
  public static int PQRY_SQL = 3996;
  public static int PQRY_SQL_RS = 3997;
  public static int PQSL_SQL_PPARAMETLINK = 0;
  public static int PQSL_SQL_PDATAELABORA = 1;
  public static int PQSL_SQL_PTIPOESTRSTA = 2;
  public static int PQSL_SQL_PENTRATSPESA = 3;

  // Table to contain panel selected row: Parametri 2
  //
  public static int PQRY_PARAMETRI585 = 3998;
  public static int PQRY_PARAMETRI585_RS = 3999;
  public static int PQSL_PARAMETRI585_P6FONTE = 0;
  public static int PQSL_PARAMETRI585_P6IMPORTO1 = 1;
  public static int PQSL_PARAMETRI585_P6IMPORVARI1 = 2;
  public static int PQSL_PARAMETRI585_P6IMPORTO2 = 3;
  public static int PQSL_PARAMETRI585_P6IMPORVARI2 = 4;
  public static int PQSL_PARAMETRI585_P6IMPORTO3 = 5;
  public static int PQSL_PARAMETRI585_P6IMPORVARI3 = 6;
  public static int PQSL_PARAMETRI585_P6IMPORTO4 = 7;
  public static int PQSL_PARAMETRI585_P6IMPORVARI4 = 8;
  public static int PQSL_PARAMETRI585_P6IMPORTO5 = 9;
  public static int PQSL_PARAMETRI585_P6IMPORVARI5 = 10;
  public static int PQSL_PARAMETRI585_P6IMPORTO6 = 11;
  public static int PQSL_PARAMETRI585_P6IMPORVARI6 = 12;
  public static int PQSL_PARAMETRI585_P6IMPORTO7 = 13;
  public static int PQSL_PARAMETRI585_P6IMPORVARI7 = 14;
  public static int PQSL_PARAMETRI585_P6IMPORTO8 = 15;
  public static int PQSL_PARAMETRI585_P6IMPORVARI8 = 16;
  public static int PQSL_PARAMETRI585_P6IMPORTO9 = 17;
  public static int PQSL_PARAMETRI585_P6IMPORVARIA = 18;
  public static int PQSL_PARAMETRI585_P6IMPORTO10 = 19;
  public static int PQSL_PARAMETRI585_P6IMPOVARI10 = 20;
  public static int PQSL_PARAMETRI585_P6IMPORTO11 = 21;
  public static int PQSL_PARAMETRI585_P6IMPOVARI11 = 22;
  public static int PQSL_PARAMETRI585_P6VARIAZIONI = 23;
  public static int PQSL_PARAMETRI585_P6SEDEDELIBE = 24;
  public static int PQSL_PARAMETRI585_P6NUMERDELIB = 25;
  public static int PQSL_PARAMETRI585_P6ANNODELIBE = 26;
  public static int PQSL_PARAMETRI585_P6UNITAPROPO = 27;
  public static int PQSL_PARAMETRI585_P6NUMERPROPO = 28;
  public static int PQSL_PARAMETRI585_P6ANNOPROPOS = 29;

  // Table to contain panel selected row: Parametri Nr8b
  //
  public static int PQRY_PARAMETRNR81 = 4000;
  public static int PQRY_PARAMETRNR81_RS = 4001;
  public static int PQSL_PARAMETRNR81_PIMPORTO11 = 0;
  public static int PQSL_PARAMETRNR81_PIMPORTO12 = 1;
  public static int PQSL_PARAMETRNR81_PIMPORTO13 = 2;
  public static int PQSL_PARAMETRNR81_PIMPORTO14 = 3;
  public static int PQSL_PARAMETRNR81_PIMPORTO15 = 4;
  public static int PQSL_PARAMETRNR81_PIMPORTO16 = 5;
  public static int PQSL_PARAMETRNR81_PIMPORTO21 = 6;
  public static int PQSL_PARAMETRNR81_PIMPORTO22 = 7;
  public static int PQSL_PARAMETRNR81_PIMPORTO23 = 8;
  public static int PQSL_PARAMETRNR81_PIMPORTO24 = 9;
  public static int PQSL_PARAMETRNR81_PIMPORTO25 = 10;
  public static int PQSL_PARAMETRNR81_PIMPORTO26 = 11;
  public static int PQSL_PARAMETRNR81_PIMPORTO31 = 12;
  public static int PQSL_PARAMETRNR81_PIMPORTO32 = 13;
  public static int PQSL_PARAMETRNR81_PIMPORTO33 = 14;
  public static int PQSL_PARAMETRNR81_PIMPORTO34 = 15;
  public static int PQSL_PARAMETRNR81_PIMPORTO35 = 16;
  public static int PQSL_PARAMETRNR81_PIMPORTO36 = 17;
  public static int PQSL_PARAMETRNR81_PIMPORTO41 = 18;
  public static int PQSL_PARAMETRNR81_PIMPORTO42 = 19;
  public static int PQSL_PARAMETRNR81_PIMPORTO43 = 20;
  public static int PQSL_PARAMETRNR81_PIMPORTO44 = 21;
  public static int PQSL_PARAMETRNR81_PIMPORTO45 = 22;
  public static int PQSL_PARAMETRNR81_PIMPORTO46 = 23;

  // Table to contain panel selected row: MENU STAMPE
  //
  public static int PQRY_MENUSTAMPE1 = 4002;
  public static int PQSL_MENUSTAMPE1_RECMESTVDERA = 0;
  public static int PQSL_MENUSTAMPE1_RECMENSTAVCO = 1;
  public static int PQSL_MENUSTAMPE1_TOOLTIP = 2;
  public static int PQSL_MENUSTAMPE1_RECMESTVTIRA = 3;
  public static int PQSL_MENUSTAMPE1_RECMENSTAVL1 = 4;
  public static int PQSL_MENUSTAMPE1_RECMENSTAVPA = 5;
  public static int PQSL_MENUSTAMPE1_RECMENSTAVOR = 6;
  public static int PQSL_MENUSTAMPE1_RECMESTVLIST = 7;
  public static int PQSL_MENUSTAMPE1_RECMESTVPALI = 8;
  public static int PQSL_MENUSTAMPE1_ICON = 9;
  public static int PQSL_MENUSTAMPE1_HASH = 10;
  public static int PQSL_MENUSTAMPE1_RECMENSTAVST = 11;

  // Table to contain panel selected row: MENU STAMPE
  //
  public static int PQRY_MENUSTAMPE = 4003;
  public static int PQSL_MENUSTAMPE_RECMESTVDERA = 0;
  public static int PQSL_MENUSTAMPE_RECMENSTAVCO = 1;
  public static int PQSL_MENUSTAMPE_TOOLTIP = 2;
  public static int PQSL_MENUSTAMPE_RECMESTVTIRA = 3;
  public static int PQSL_MENUSTAMPE_RECMENSTAVL1 = 4;
  public static int PQSL_MENUSTAMPE_RECMENSTAVPA = 5;
  public static int PQSL_MENUSTAMPE_RECMENSTAVOR = 6;
  public static int PQSL_MENUSTAMPE_RECMESTVLIST = 7;
  public static int PQSL_MENUSTAMPE_RECMESTVPALI = 8;
  public static int PQSL_MENUSTAMPE_ICON = 9;
  public static int PQSL_MENUSTAMPE_HASH = 10;
  public static int PQSL_MENUSTAMPE_RECMENSTAVST = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI583 = 4004;
  public static int PQRY_PARAMETRI583_RS = 4005;
  public static int PQSL_PARAMETRI583_PARAMEDESCRI = 0;
  public static int PQSL_PARAMETRI583_PARAMETRHASH = 1;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIONA = 4006;
  public static int PQSL_NOTEFUNZIONA_MODULO = 0;
  public static int PQSL_NOTEFUNZIONA_PAGINA = 1;
  public static int PQSL_NOTEFUNZIONA_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIONA_DESCRIZIONE = 3;

  // Table to contain panel selected row: MENU STAMPE PREFERITI
  //
  public static int PQRY_MENUSTAMPREF = 4007;
  public static int PQSL_MENUSTAMPREF_RECMENSTDERA = 0;
  public static int PQSL_MENUSTAMPREF_RECMENSTTORA = 1;
  public static int PQSL_MENUSTAMPREF_RECMENSTLIST = 2;
  public static int PQSL_MENUSTAMPREF_RECMENSTPALI = 3;
  public static int PQSL_MENUSTAMPREF_RECMENSTACOD = 4;
  public static int PQSL_MENUSTAMPREF_RECMENSTASTO = 5;

  // Table to contain panel selected row: MENU STAMPE STAT
  //
  public static int PQRY_MENUSTAMSTAT = 4008;
  public static int PQSL_MENUSTAMSTAT_DESCRIZIONE_RAMO = 0;
  public static int PQSL_MENUSTAMSTAT_CONTATORE = 1;
  public static int PQSL_MENUSTAMSTAT_DATA_ULTIMO_AGG = 2;
  public static int PQSL_MENUSTAMSTAT_LINK_STAMPA = 3;
  public static int PQSL_MENUSTAMSTAT_REMESTSTPALI = 4;
  public static int PQSL_MENUSTAMSTAT_RECMENSTSTST = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI494 = 4009;
  public static int PQRY_PARAMETRI494_RS = 4010;
  public static int PQSL_PARAMETRI494_PARAMPARTE = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI488 = 4011;
  public static int PQRY_PARAMETRI488_RS = 4012;
  public static int PQSL_PARAMETRI488_PARAMPARTE = 0;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP = 4013;
  public static int PQSL_IMP_RECORANNOIMP = 0;
  public static int PQSL_IMP_RECORNUMEIMP = 1;
  public static int PQSL_IMP_RECORIMPCAPI = 2;
  public static int PQSL_IMP_RECORIMPARTI = 3;
  public static int PQSL_IMP_CODLIV4 = 4;
  public static int PQSL_IMP_RECORIMPDESC = 5;
  public static int PQSL_IMP_RECIMPCODLI5 = 6;
  public static int PQSL_IMP_DESLIVELLO5 = 7;
  public static int PQSL_IMP_TIPOMOV = 8;
  public static int PQSL_IMP_RECIMPCODEUR = 9;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP = 4014;
  public static int PQSL_SUBIMP_RECOANNOSUBI = 0;
  public static int PQSL_SUBIMP_RECONUMESUBI = 1;
  public static int PQSL_SUBIMP_RECORANNOIMP = 2;
  public static int PQSL_SUBIMP_RECORNUMEIMP = 3;
  public static int PQSL_SUBIMP_RECOSUBICAPI = 4;
  public static int PQSL_SUBIMP_RECOSUBIARTI = 5;
  public static int PQSL_SUBIMP_CODLIV4 = 6;
  public static int PQSL_SUBIMP_RECOSUBIDESC = 7;
  public static int PQSL_SUBIMP_RECSUBCODLI5 = 8;
  public static int PQSL_SUBIMP_DESLIVELLO5 = 9;
  public static int PQSL_SUBIMP_TIPOMOV = 10;
  public static int PQSL_SUBIMP_RECSUBCOEUSU = 11;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ1 = 4015;
  public static int PQSL_LIQ1_RECOANNOSUBI = 0;
  public static int PQSL_LIQ1_RECONUMESUBI = 1;
  public static int PQSL_LIQ1_RECORANNOIMP = 2;
  public static int PQSL_LIQ1_RECORNUMEIMP = 3;
  public static int PQSL_LIQ1_RECORLIQCAPI = 4;
  public static int PQSL_LIQ1_RECORLIQARTI = 5;
  public static int PQSL_LIQ1_RECORANNOLIQ = 6;
  public static int PQSL_LIQ1_RECORNUMELIQ = 7;
  public static int PQSL_LIQ1_RECLIQANNMAN = 8;
  public static int PQSL_LIQ1_RECLIQNUMMAN = 9;
  public static int PQSL_LIQ1_CODLIV4 = 10;
  public static int PQSL_LIQ1_RECORLIQDESC = 11;
  public static int PQSL_LIQ1_RECLIQCODLI5 = 12;
  public static int PQSL_LIQ1_DESLIVELLO5 = 13;
  public static int PQSL_LIQ1_TIPOMOV = 14;
  public static int PQSL_LIQ1_RECLIQCODEUR = 15;

  // Table to contain panel selected row: Acc
  //
  public static int PQRY_ACC = 4016;
  public static int PQSL_ACC_RECORANNOACC = 0;
  public static int PQSL_ACC_RECORNUMEACC = 1;
  public static int PQSL_ACC_RECORACCCAPI = 2;
  public static int PQSL_ACC_RECORACCARTI = 3;
  public static int PQSL_ACC_CODLIV4 = 4;
  public static int PQSL_ACC_RECORACCDESC = 5;
  public static int PQSL_ACC_RECACCCODLI5 = 6;
  public static int PQSL_ACC_DESLIVELLO5 = 7;
  public static int PQSL_ACC_TIPOMOV = 8;
  public static int PQSL_ACC_RECACCCODEUR = 9;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE8 = 4017;
  public static int PQSL_PRE8_RECORANNOACC = 0;
  public static int PQSL_PRE8_RECORNUMEACC = 1;
  public static int PQSL_PRE8_RECORPRECAPI = 2;
  public static int PQSL_PRE8_RECORPREARTI = 3;
  public static int PQSL_PRE8_RECPREANNORD = 4;
  public static int PQSL_PRE8_RECPRENUMORD = 5;
  public static int PQSL_PRE8_CODLIV4 = 6;
  public static int PQSL_PRE8_RECORPREDESC = 7;
  public static int PQSL_PRE8_RECPRECODLI5 = 8;
  public static int PQSL_PRE8_DESLIVELLO5 = 9;
  public static int PQSL_PRE8_TIPOMOV = 10;
  public static int PQSL_PRE8_RECPRECODEUR = 11;
  public static int PQSL_PRE8_RECORANNOPRE = 12;
  public static int PQSL_PRE8_RECORNUMEPRE = 13;

  // Table to contain panel selected row: DETTAGLI IMPEGNI BUONI
  //
  public static int PQRY_DETTIMPEBUON = 4018;
  public static int PQSL_DETTIMPEBUON_RECOANNOSUBI = 0;
  public static int PQSL_DETTIMPEBUON_RECONUMESUBI = 1;
  public static int PQSL_DETTIMPEBUON_RECORANNOIMP = 2;
  public static int PQSL_DETTIMPEBUON_RECORNUMEIMP = 3;
  public static int PQSL_DETTIMPEBUON_RECORDCAPITO = 4;
  public static int PQSL_DETTIMPEBUON_RECORDARTICO = 5;
  public static int PQSL_DETTIMPEBUON_REDEIMBUANBU = 6;
  public static int PQSL_DETTIMPEBUON_REDEIMBUNUBU = 7;
  public static int PQSL_DETTIMPEBUON_REDEIMBUPRBU = 8;
  public static int PQSL_DETTIMPEBUON_REDEIMBUPRIM = 9;
  public static int PQSL_DETTIMPEBUON_CODLIV4 = 10;
  public static int PQSL_DETTIMPEBUON_RECORDDESCRI = 11;
  public static int PQSL_DETTIMPEBUON_REDEIMBUCOL5 = 12;
  public static int PQSL_DETTIMPEBUON_DESLIVELLO5 = 13;
  public static int PQSL_DETTIMPEBUON_TIPOMOV = 14;
  public static int PQSL_DETTIMPEBUON_REDEIMBUCOEU = 15;

  // Table to contain panel selected row: DISPOSIZIONI
  //
  public static int PQRY_DISPOSIZIONI = 4019;
  public static int PQSL_DISPOSIZIONI_RECOANNOSUBI = 0;
  public static int PQSL_DISPOSIZIONI_RECONUMESUBI = 1;
  public static int PQSL_DISPOSIZIONI_RECDISANNIMP = 2;
  public static int PQSL_DISPOSIZIONI_RECDISNUMIMP = 3;
  public static int PQSL_DISPOSIZIONI_RECORDCAPITO = 4;
  public static int PQSL_DISPOSIZIONI_RECORDARTICO = 5;
  public static int PQSL_DISPOSIZIONI_RECDISANNDIS = 6;
  public static int PQSL_DISPOSIZIONI_RECDISPRODIS = 7;
  public static int PQSL_DISPOSIZIONI_CODLIV4 = 8;
  public static int PQSL_DISPOSIZIONI_RECORDDESCRI = 9;
  public static int PQSL_DISPOSIZIONI_RECDISCODLI5 = 10;
  public static int PQSL_DISPOSIZIONI_DESLIVELLO5 = 11;
  public static int PQSL_DISPOSIZIONI_TIPOMOV = 12;
  public static int PQSL_DISPOSIZIONI_RECDISCODEUR = 13;

  // Table to contain panel selected row: LIQ DISTINTA
  //
  public static int PQRY_LIQDISTINTA = 4020;
  public static int PQSL_LIQDISTINTA_RECOANNOSUBI = 0;
  public static int PQSL_LIQDISTINTA_RECONUMESUBI = 1;
  public static int PQSL_LIQDISTINTA_RECLIQDIANIM = 2;
  public static int PQSL_LIQDISTINTA_RECLIQDINUIM = 3;
  public static int PQSL_LIQDISTINTA_RECORDCAPITO = 4;
  public static int PQSL_LIQDISTINTA_RECORDARTICO = 5;
  public static int PQSL_LIQDISTINTA_RECLIQANNDIS = 6;
  public static int PQSL_LIQDISTINTA_RECLIQNUMDIS = 7;
  public static int PQSL_LIQDISTINTA_CODLIV4 = 8;
  public static int PQSL_LIQDISTINTA_RECORDDESCRI = 9;
  public static int PQSL_LIQDISTINTA_RECLIDICOLI5 = 10;
  public static int PQSL_LIQDISTINTA_DESLIVELLO5 = 11;
  public static int PQSL_LIQDISTINTA_TIPOMOV = 12;
  public static int PQSL_LIQDISTINTA_RECLIQDISPRO = 13;
  public static int PQSL_LIQDISTINTA_RECLIQDICOEU = 14;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI512 = 4021;
  public static int PQRY_PARAMETRI512_RS = 4022;
  public static int PQSL_PARAMETRI512_PARAMLIVELL5 = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI492 = 4023;
  public static int PQRY_PARAMETRI492_RS = 4024;
  public static int PQSL_PARAMETRI492_PARAMCODEURO = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI499 = 4025;
  public static int PQRY_PARAMETRI499_RS = 4026;
  public static int PQSL_PARAMETRI499_PARAMESERCIZ = 0;
  public static int PQSL_PARAMETRI499_PARAMPARTE = 1;
  public static int PQSL_PARAMETRI499_PARATIPOCONT = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI490 = 4027;
  public static int PQRY_PARAMETRI490_RS = 4028;
  public static int PQSL_PARAMETRI490_PARAMESERCIZ = 0;
  public static int PQSL_PARAMETRI490_PARAMPARTE = 1;
  public static int PQSL_PARAMETRI490_PARATIPOCONT = 2;

  // Table to contain panel selected row: Dati Sessione
  //
  public static int PQRY_DATISESSION2 = 4029;
  public static int PQSL_DATISESSION2_SESSBASEDATI = 0;
  public static int PQSL_DATISESSION2_SESSIOPRODOT = 1;
  public static int PQSL_DATISESSION2_SESSIOMODULO = 2;
  public static int PQSL_DATISESSION2_SESSIOPROGET = 3;
  public static int PQSL_DATISESSION2_SESSIOISTANZ = 4;
  public static int PQSL_DATISESSION2_SESSISTADESC = 5;
  public static int PQSL_DATISESSION2_SESSIONEENTE = 6;
  public static int PQSL_DATISESSION2_SESSIOUTENTE = 7;
  public static int PQSL_DATISESSION2_SESSIONRUOLO = 8;
  public static int PQSL_DATISESSION2_SESISTUSEORA = 9;
  public static int PQSL_DATISESSION2_SESSIONE = 10;

  // Table to contain panel selected row: DBA OBJECTS
  //
  public static int PQRY_DBAOBJECTS = 4030;
  public static int PQSL_DBAOBJECTS_DBAOBJOBJNAM = 0;
  public static int PQSL_DBAOBJECTS_DBAOBJOBJTYP = 1;
  public static int PQSL_DBAOBJECTS_DBAOBJECSTAT = 2;
  public static int PQSL_DBAOBJECTS_DBOBUSTRTAOW = 3;
  public static int PQSL_DBAOBJECTS_DBAOBJSTATRI = 4;
  public static int PQSL_DBAOBJECTS_INVALIDO = 5;
  public static int PQSL_DBAOBJECTS_DISABILITATO = 6;

  // Table to contain panel selected row: PERSONALIZZAZIONI
  //
  public static int PQRY_PERSONALIZZ6 = 4031;
  public static int PQSL_PERSONALIZZ6_AD4PERSOMODU = 0;
  public static int PQSL_PERSONALIZZ6_AD4PERSOENTE = 1;
  public static int PQSL_PERSONALIZZ6_AD4PERSOWIND = 2;
  public static int PQSL_PERSONALIZZ6_AD4PERSOPERS = 3;

  // Table to contain panel selected row: REGISTRO
  //
  public static int PQRY_REGISTRO1 = 4032;
  public static int PQSL_REGISTRO1_RECORDDESCRI = 0;
  public static int PQSL_REGISTRO1_RECORDCHIAVE = 1;
  public static int PQSL_REGISTRO1_NODO = 2;
  public static int PQSL_REGISTRO1_LIVELLO = 3;
  public static int PQSL_REGISTRO1_TOOLTIP = 4;

  // Table to contain panel selected row: REGISTRO
  //
  public static int PQRY_REGISTRO2 = 4033;
  public static int PQSL_REGISTRO2_RECORDDESCRI = 0;
  public static int PQSL_REGISTRO2_RECORDCHIAVE = 1;
  public static int PQSL_REGISTRO2_NODO = 2;
  public static int PQSL_REGISTRO2_LIVELLO = 3;
  public static int PQSL_REGISTRO2_TOOLTIP = 4;

  // Table to contain panel selected row: REGISTRO
  //
  public static int PQRY_REGISTRO = 4034;
  public static int PQSL_REGISTRO_STRINGA = 0;
  public static int PQSL_REGISTRO_VALORE = 1;
  public static int PQSL_REGISTRO_COMMENTO = 2;
  public static int PQSL_REGISTRO_CHIAVE = 3;

  // Table to contain panel selected row: USER OBJECTS
  //
  public static int PQRY_USEROBJECTS = 4035;
  public static int PQSL_USEROBJECTS_RECOISTAPROG = 0;
  public static int PQSL_USEROBJECTS_RECOPROGDESC = 1;
  public static int PQSL_USEROBJECTS_RECOISTAISTA = 2;
  public static int PQSL_USEROBJECTS_RECOISTADESC = 3;
  public static int PQSL_USEROBJECTS_RECOISTAVERS = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI613 = 4036;
  public static int PQRY_PARAMETRI613_RS = 4037;
  public static int PQSL_PARAMETRI613_PARAMXML = 0;
  public static int PQSL_PARAMETRI613_PARAMIDXDS = 1;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO16 = 4038;
  public static int PQRY_FILTRO16_RS = 4039;
  public static int PQSL_FILTRO16_NOMEOGGETIPO = 0;
  public static int PQSL_FILTRO16_NOMEOGGDATDA = 1;
  public static int PQSL_FILTRO16_NOOGINSORERE = 2;
  public static int PQSL_FILTRO16_NOMEOGGEARGO = 3;
  public static int PQSL_FILTRO16_NOMOGGTIPERR = 4;
  public static int PQSL_FILTRO16_NOMOGGTIPWAR = 5;
  public static int PQSL_FILTRO16_NOMOGGTIPLOG = 6;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG = 4040;
  public static int PQSL_WRKLOG_RECWRKLONOIS = 0;
  public static int PQSL_WRKLOG_RECWRKLOGTIP = 1;
  public static int PQSL_WRKLOG_RECWRKLOGPAR = 2;
  public static int PQSL_WRKLOG_RECWRKLOTEER = 3;
  public static int PQSL_WRKLOG_RECWRKLOSTTR = 4;
  public static int PQSL_WRKLOG_RECWRKLOGDAT = 5;
  public static int PQSL_WRKLOG_RECOWRKLOGID = 6;
  public static int PQSL_WRKLOG_RECWRKLODOEL = 7;

  // Recordset for query: PARAMETRI STAMPE
  //
  public static int QRY_PARAMESTAMPE = 4041;
  public static int QSL_PARAMESTAMPE_RECCODSTAMPA = 0;
  public static int QSL_PARAMESTAMPE_RECCODPARAM = 1;
  public static int QSL_PARAMESTAMPE_RECIMPORTO1 = 2;
  public static int QSL_PARAMESTAMPE_RECIMPORTO2 = 3;
  public static int QSL_PARAMESTAMPE_RECIMPORTO3 = 4;

  // Table to contain panel selected row: PARAMETRI
  //
  public static int PQRY_PARAMETRI574 = 4042;
  public static int PQRY_PARAMETRI574_RS = 4043;
  public static int PQSL_PARAMETRI574_COD_STAMPA = 0;
  public static int PQSL_PARAMETRI574_NOMOGGDAFITR = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI578 = 4044;
  public static int PQRY_PARAMETRI578_RS = 4045;
  public static int PQSL_PARAMETRI578_NOMEOGGEVARI = 0;
  public static int PQSL_PARAMETRI578_NOMOGGSEDDEL = 1;
  public static int PQSL_PARAMETRI578_NOMOGGNUMDEL = 2;
  public static int PQSL_PARAMETRI578_NOMOGGANNDEL = 3;
  public static int PQSL_PARAMETRI578_NOMOGGUNIPRO = 4;
  public static int PQSL_PARAMETRI578_NOMOGGNUMPRO = 5;
  public static int PQSL_PARAMETRI578_NOMOGGANNPRO = 6;

  // Table to contain panel selected row: STRUTTURA PARAMETRI STAMPE
  //
  public static int PQRY_STRUPARASTAM = 4046;
  public static int PQRY_STRUPARASTAM_RS = 4047;
  public static int PQSL_STRUPARASTAM_LABEL_RIGA = 0;
  public static int PQSL_STRUPARASTAM_ORDINE = 1;
  public static int PQSL_STRUPARASTAM_NUM_MAX_IMPORTI = 2;
  public static int PQSL_STRUPARASTAM_IMPORTO_1 = 3;
  public static int PQSL_STRUPARASTAM_IMPORTO_2 = 4;
  public static int PQSL_STRUPARASTAM_IMPORTO_3 = 5;
  public static int PQSL_STRUPARASTAM_COD_PARAM = 6;

  // Table to contain panel selected row: PARAMETRI
  //
  public static int PQRY_PARAMETRI577 = 4048;
  public static int PQRY_PARAMETRI577_RS = 4049;
  public static int PQSL_PARAMETRI577_COD_STAMPA = 0;
  public static int PQSL_PARAMETRI577_NOMOGGDATELA = 1;

  // Table to contain panel selected row: CF ESTRAI SELECT
  //
  public static int PQRY_CFESTRASELE1 = 4050;
  public static int PQSL_CFESTRASELE1_RECCFESTSECA = 0;
  public static int PQSL_CFESTRASELE1_HASH = 1;

  // Table to contain panel selected row: CF ESTRAI SELECT
  //
  public static int PQRY_CFESTRASELEC = 4051;
  public static int PQSL_CFESTRASELEC_RECORDTITOLO = 0;
  public static int PQSL_CFESTRASELEC_RECCFESTSEID = 1;
  public static int PQSL_CFESTRASELEC_RECCFESTSEDE = 2;
  public static int PQSL_CFESTRASELEC_RECCFESTSEST = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI677 = 4052;
  public static int PQRY_PARAMETRI677_RS = 4053;
  public static int PQSL_PARAMETRI677_NOMOGGRICDES = 0;
  public static int PQSL_PARAMETRI677_NOMEOGGEHASH = 1;

  // Table to contain panel selected row: CF ESTRAI SELECT
  //
  public static int PQRY_CFESTRASELE2 = 4054;
  public static int PQSL_CFESTRASELE2_ID = 0;
  public static int PQSL_CFESTRASELE2_TITOLO = 1;
  public static int PQSL_CFESTRASELE2_DESCRIZIONE = 2;
  public static int PQSL_CFESTRASELE2_CATEGORIA = 3;
  public static int PQSL_CFESTRASELE2_STATO = 4;
  public static int PQSL_CFESTRASELE2_SELECT_SQL = 5;
  public static int PQSL_CFESTRASELE2_NOTE = 6;
  public static int PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA = 7;
  public static int PQSL_CFESTRASELE2_DATA_FINE_VALIDITA = 8;
  public static int PQSL_CFESTRASELE2_NOME_FILE_EXPORT = 9;
  public static int PQSL_CFESTRASELE2_ID_HELP = 10;
  public static int PQSL_CFESTRASELE2_UTENTE_INSERIMENTO = 11;
  public static int PQSL_CFESTRASELE2_CODICE = 12;
  public static int PQSL_CFESTRASELE2_SELECTSOSTIT = 13;
  public static int PQSL_CFESTRASELE2_FILE_ASSOCIATO = 14;

  // Table to contain panel selected row: CF ESTRAI PARAMETRI SELECT
  //
  public static int PQRY_CFESTRPARSEL = 4055;
  public static int PQSL_CFESTRPARSEL_ID = 0;
  public static int PQSL_CFESTRPARSEL_ID_SELECT = 1;
  public static int PQSL_CFESTRPARSEL_NOME = 2;
  public static int PQSL_CFESTRPARSEL_UTENTE_INSERIMENTO = 3;
  public static int PQSL_CFESTRPARSEL_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_CFESTRPARSEL_DATA_INSERIMENTO = 5;
  public static int PQSL_CFESTRPARSEL_STATO = 6;
  public static int PQSL_CFESTRPARSEL_DATA_ULTIMO_AGG = 7;
  public static int PQSL_CFESTRPARSEL_DESCRIZIONE = 8;
  public static int PQSL_CFESTRPARSEL_TIPO = 9;
  public static int PQSL_CFESTRPARSEL_VALORE_DEFAULT = 10;
  public static int PQSL_CFESTRPARSEL_VALORE = 11;
  public static int PQSL_CFESTRPARSEL_SEQUENZA = 12;

  // Table to contain panel selected row: CF ESTRAI SELECT
  //
  public static int PQRY_CFESTRASELE6 = 4056;
  public static int PQSL_CFESTRASELE6_ID = 0;
  public static int PQSL_CFESTRASELE6_TITOLO = 1;
  public static int PQSL_CFESTRASELE6_DESCRIZIONE = 2;
  public static int PQSL_CFESTRASELE6_CATEGORIA = 3;
  public static int PQSL_CFESTRASELE6_STATO = 4;
  public static int PQSL_CFESTRASELE6_SELECT_SQL = 5;
  public static int PQSL_CFESTRASELE6_NOTE = 6;
  public static int PQSL_CFESTRASELE6_DATA_INIZIO_VALIDITA = 7;
  public static int PQSL_CFESTRASELE6_DATA_FINE_VALIDITA = 8;
  public static int PQSL_CFESTRASELE6_UTENTE_INSERIMENTO = 9;
  public static int PQSL_CFESTRASELE6_DATA_INSERIMENTO = 10;
  public static int PQSL_CFESTRASELE6_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_CFESTRASELE6_DATA_ULTIMO_AGG = 12;
  public static int PQSL_CFESTRASELE6_NOME_FILE_EXPORT = 13;
  public static int PQSL_CFESTRASELE6_CFESTRSELCOD = 14;
  public static int PQSL_CFESTRASELE6_CFESTSELIDHE = 15;
  public static int PQSL_CFESTRASELE6_HELP = 16;
  public static int PQSL_CFESTRASELE6_SELECTSQLSOS = 17;
  public static int PQSL_CFESTRASELE6_INFO = 18;
  public static int PQSL_CFESTRASELE6_ULTIMAESTRAZ = 19;
  public static int PQSL_CFESTRASELE6_CFESTSELFIAS = 20;

  // Table to contain panel selected row: CF ESTRAI PARAMETRI SELECT
  //
  public static int PQRY_CFESTRPARSE3 = 4057;
  public static int PQRY_CFESTRPARSE3_RS = 4058;
  public static int PQSL_CFESTRPARSE3_ID = 0;
  public static int PQSL_CFESTRPARSE3_ID_SELECT = 1;
  public static int PQSL_CFESTRPARSE3_NOME = 2;
  public static int PQSL_CFESTRPARSE3_DESCRIZIONE = 3;
  public static int PQSL_CFESTRPARSE3_SEQUENZA = 4;
  public static int PQSL_CFESTRPARSE3_TIPO = 5;
  public static int PQSL_CFESTRPARSE3_VALORE = 6;
  public static int PQSL_CFESTRPARSE3_VALORE_DEFAULT = 7;
  public static int PQSL_CFESTRPARSE3_STATO = 8;
  public static int PQSL_CFESTRPARSE3_UTENTE_INSERIMENTO = 9;
  public static int PQSL_CFESTRPARSE3_DATA_INSERIMENTO = 10;
  public static int PQSL_CFESTRPARSE3_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG = 12;
  public static int PQSL_CFESTRPARSE3_NOMOGGIMVADA = 13;

  // Recordset for query: CF ESTRAI APPOGGIO PARAMETRI SELECT
  //
  public static int QRY_CFESTAPPPAS1 = 4059;
  public static int QSL_CFESTAPPPAS1_NOMEOGGIMDID = 0;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMIDSE = 1;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMDNOM = 2;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMDDES = 3;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMDSEQ = 4;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMDTIP = 5;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMVADE = 6;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMDVAL = 7;
  public static int QSL_CFESTAPPPAS1_NOMOGGIMVADA = 8;

  // Table to contain panel selected row: Anteprima Dati
  //
  public static int PQRY_ANTEPRIMDAT1 = 4060;
  public static int PQRY_ANTEPRIMDAT1_RS = 4061;
  public static int PQSL_ANTEPRIMDAT1_NOMOGGANTCSV = 0;

  // Table to contain panel selected row: CF ESTRAI HELP SELECT
  //
  public static int PQRY_CFESTRHELSE1 = 4062;
  public static int PQSL_CFESTRHELSE1_ID = 0;
  public static int PQSL_CFESTRHELSE1_TITOLO = 1;
  public static int PQSL_CFESTRHELSE1_DESCRIZIONE = 2;
  public static int PQSL_CFESTRHELSE1_FILE_HELP = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR124 = 4063;
  public static int PQRY_PAR124_RS = 4064;
  public static int PQSL_PAR124_NOMEOGGVALAL = 0;

  // Table to contain panel selected row: CF ESTRAI SELECT
  //
  public static int PQRY_CFESTRASELE3 = 4065;
  public static int PQSL_CFESTRASELE3_ID = 0;
  public static int PQSL_CFESTRASELE3_TITOLO = 1;
  public static int PQSL_CFESTRASELE3_DESCRIZIONE = 2;
  public static int PQSL_CFESTRASELE3_CATEGORIA = 3;
  public static int PQSL_CFESTRASELE3_STATO = 4;
  public static int PQSL_CFESTRASELE3_SELECT_SQL = 5;
  public static int PQSL_CFESTRASELE3_NOTE = 6;
  public static int PQSL_CFESTRASELE3_DATA_INIZIO_VALIDITA = 7;
  public static int PQSL_CFESTRASELE3_DATA_FINE_VALIDITA = 8;
  public static int PQSL_CFESTRASELE3_NOME_FILE_EXPORT = 9;
  public static int PQSL_CFESTRASELE3_ID_HELP = 10;
  public static int PQSL_CFESTRASELE3_UTENTE_INSERIMENTO = 11;
  public static int PQSL_CFESTRASELE3_CODICE = 12;

  // Table to contain panel selected row: Categorie Select
  //
  public static int PQRY_CATEGOSELECT = 4066;
  public static int PQSL_CATEGOSELECT_CATEGORIA = 0;
  public static int PQSL_CATEGOSELECT_DESCRIZIONE = 1;

  // Table to contain panel selected row: CF ESTRAI IMP SELECT
  //
  public static int PQRY_CFESTRIMPSE1 = 4067;
  public static int PQSL_CFESTRIMPSE1_ID = 0;
  public static int PQSL_CFESTRIMPSE1_TITOLO = 1;
  public static int PQSL_CFESTRIMPSE1_DESCRIZIONE = 2;
  public static int PQSL_CFESTRIMPSE1_CATEGORIA = 3;
  public static int PQSL_CFESTRIMPSE1_SELECT_SQL = 4;
  public static int PQSL_CFESTRIMPSE1_NOTE = 5;
  public static int PQSL_CFESTRIMPSE1_NOME_FILE_EXPORT = 6;
  public static int PQSL_CFESTRIMPSE1_INFO = 7;
  public static int PQSL_CFESTRIMPSE1_INFO1 = 8;

  // Table to contain panel selected row: CF ESTRAI IMP SELECT
  //
  public static int PQRY_CFESTRIMPSE2 = 4068;
  public static int PQSL_CFESTRIMPSE2_ID = 0;
  public static int PQSL_CFESTRIMPSE2_SELECT_SQL = 1;

  // Table to contain panel selected row: CF ESTRAI IMP SELECT
  //
  public static int PQRY_CFESTRIMPSEL = 4069;
  public static int PQSL_CFESTRIMPSEL_ID = 0;
  public static int PQSL_CFESTRIMPSEL_RECFESIMSEDE = 1;

  // Table to contain panel selected row: CF ESTRAI STATISTICHE
  //
  public static int PQRY_CFESTRASTAT1 = 4070;
  public static int PQSL_CFESTRASTAT1_CODICE = 0;
  public static int PQSL_CFESTRASTAT1_DESCRIZIONE = 1;
  public static int PQSL_CFESTRASTAT1_ESECUZIONI = 2;
  public static int PQSL_CFESTRASTAT1_TEMPO_ESECUZIONE = 3;
  public static int PQSL_CFESTRASTAT1_ID_SELECT = 4;
  public static int PQSL_CFESTRASTAT1_DATA_INIZIO_VALIDITA = 5;
  public static int PQSL_CFESTRASTAT1_DATA_FINE_VALIDITA = 6;
  public static int PQSL_CFESTRASTAT1_IN_USO = 7;
  public static int PQSL_CFESTRASTAT1_TITOLO = 8;

  // Table to contain panel selected row: Log Esecuzione Query
  //
  public static int PQRY_LOGESECUQUER = 4071;
  public static int PQSL_LOGESECUQUER_RECFESESQUIE = 0;
  public static int PQSL_LOGESECUQUER_RECFESESQUD1 = 1;
  public static int PQSL_LOGESECUQUER_RECFESESQUUE = 2;
  public static int PQSL_LOGESECUQUER_RECCFESTESQU = 3;
  public static int PQSL_LOGESECUQUER_RECFESESQUIS = 4;
  public static int PQSL_LOGESECUQUER_RECFESESQUDE = 5;
  public static int PQSL_LOGESECUQUER_RECFESESQUTE = 6;
  public static int PQSL_LOGESECUQUER_RECCFESTSECO = 7;
  public static int PQSL_LOGESECUQUER_RECCFESTSETI = 8;
  public static int PQSL_LOGESECUQUER_RECCFESTSEDE = 9;
  public static int PQSL_LOGESECUQUER_INFO = 10;

  // Table to contain panel selected row: Log Creazione Modifica Query
  //
  public static int PQRY_LOGCREMODQUE = 4072;
  public static int PQSL_LOGCREMODQUE_TIPO = 0;
  public static int PQSL_LOGCREMODQUE_VECCHIA_QUERY = 1;
  public static int PQSL_LOGCREMODQUE_NUOVA_QUERY = 2;
  public static int PQSL_LOGCREMODQUE_DATA_INSERIMENTO = 3;
  public static int PQSL_LOGCREMODQUE_UTENTE_INSERIMENTO = 4;
  public static int PQSL_LOGCREMODQUE_ID_SELECT = 5;
  public static int PQSL_LOGCREMODQUE_INFOVECCQUER = 6;
  public static int PQSL_LOGCREMODQUE_INFONUOVQUER = 7;
  public static int PQSL_LOGCREMODQUE_ID_LOG_MODIFICA = 8;
  public static int PQSL_LOGCREMODQUE_RECCFESTSECO = 9;
  public static int PQSL_LOGCREMODQUE_RECCFESTSETI = 10;
  public static int PQSL_LOGCREMODQUE_RECCFESTSEDE = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI678 = 4073;
  public static int PQRY_PARAMETRI678_RS = 4074;
  public static int PQSL_PARAMETRI678_NOMOGGANCELI = 0;
  public static int PQSL_PARAMETRI678_NOMOGGCODSEL = 1;
  public static int PQSL_PARAMETRI678_NOMEOGGVALAL = 2;

  // Table to contain panel selected row: CF ESTRAI ESECUZIONE QUERY
  //
  public static int PQRY_CFESTRESEQU1 = 4075;
  public static int PQSL_CFESTRESEQU1_RECFESESQUIE = 0;
  public static int PQSL_CFESTRESEQU1_RECFESESQUD1 = 1;
  public static int PQSL_CFESTRESEQU1_RECFESESQUUE = 2;
  public static int PQSL_CFESTRESEQU1_RECCFESTESQU = 3;
  public static int PQSL_CFESTRESEQU1_RECFESESQUIS = 4;
  public static int PQSL_CFESTRESEQU1_RECFESESQUDE = 5;
  public static int PQSL_CFESTRESEQU1_RECFESESQUTE = 6;

  // Table to contain panel selected row: CF ESTRAI ESECUZIONE QUERY
  //
  public static int PQRY_CFESTRESEQUE = 4076;
  public static int PQSL_CFESTRESEQUE_TIPO = 0;
  public static int PQSL_CFESTRESEQUE_VECCHIA_QUERY = 1;
  public static int PQSL_CFESTRESEQUE_NUOVA_QUERY = 2;
  public static int PQSL_CFESTRESEQUE_DATA_INSERIMENTO = 3;
  public static int PQSL_CFESTRESEQUE_UTENTE_INSERIMENTO = 4;
  public static int PQSL_CFESTRESEQUE_ID_SELECT = 5;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM187 = 4077;
  public static int PQRY_PARAM187_RS = 4078;
  public static int PQSL_PARAM187_NOOGSTNUDIPA = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV65 = 4079;
  public static int QSL_CFASELINTV65_COUNT = 0;
  public static int QSL_CFASELINTV65_MAXCOMANCAPT = 1;

  // Recordset for query: Parametri Stampa Si4print
  //
  public static int QRY_PARASTAMSI41 = 4080;
  public static int QSL_PARASTAMSI41_PARAMEPROGRE = 0;
  public static int QSL_PARASTAMSI41_PARAMETRO = 1;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSE11 = 4081;
  public static int QSL_CFDBCFDBSE11_MAXNUVAPAPR0 = 0;

  // Recordset for query: Parametri Stampa Jasper
  //
  public static int QRY_PARASTAMJAS1 = 4082;
  public static int QSL_PARASTAMJAS1_PARAMEPROGRE = 0;
  public static int QSL_PARASTAMJAS1_NOMEPARAMETR = 1;
  public static int QSL_PARASTAMJAS1_VALOREPARAME = 2;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEIV = 4083;
  public static int QSL_CFDBCFDBSEIV_MAXNUVAPAPR0 = 0;

}
