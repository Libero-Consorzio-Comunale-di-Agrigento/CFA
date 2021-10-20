// **********************************************
// In Memory Database Initialization
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;

import java.io.*;
import java.util.*;
import java.lang.reflect.Field;

// **********************************************
// In Memory Database Initialization
// **********************************************
public final class MyImdbInit extends ImdbInit implements Serializable
{
  public static int IMDB_OFFSET = 0;

  // **********************************************
  // Costruttore
  // **********************************************
  public MyImdbInit(WebEntryPoint p)
  {
    super(p);
    //
    IMDB.set_DBSize(4084 + MyImdbInit.IMDB_OFFSET);
    //
    Init_TBL_VARIBILI2();
    Init_TBL_DETTAGLBUONI();
    Init_TBL_ERRORETMASUO();
    Init_TBL_FATTBUONIMDB();
    Init_TBL_PARAMESTAM31();
    Init_TBL_ANOMALIASSOC();
    Init_TBL_FILTREFFETVG();
    Init_TBL_FILTRSIMULVG();
    Init_TBL_PARAVARIIMPE();
    Init_TBL_PARAMETRI79();
    Init_TBL_PAREMETRITMP();
    Init_TBL_PARALIQUMULT();
    Init_TBL_VALCOMORDLIQ();
    Init_TBL_VALORCOMUMOV();
    Init_TBL_FILTRI6();
    Init_TBL_PARANUOVPAGA();
    Init_TBL_PARATIPOELI1();
    Init_TBL_PARASTAMSI4P();
    Init_TBL_DATISTAMSI4P();
    Init_TBL_DATISESSIONE();
    Init_TBL_VALONODOCORR();
    Init_TBL_T64();
    Init_TBL_LIQ_DISTINTA();
    Init_TBL_MENU();
    Init_TBL_PARAMETIRIDE();
    Init_TBL_CHARTOBEFIXE();
    Init_TBL_FIELTOBEFIXE();
    Init_TBL_AGGIOSUATTIV();
    Init_TBL_ANTEPRIMDATI();
    Init_TBL_CFESTAPPPASE();
    Init_TBL_PARASTAMJASP();
    Init_TBL_DATISTAMJASP();
    //
    //
    Init_QRY_CHARTOBEFIX1();
    Init_QRY_FIELTOBEFIX1();
    Init_QRY_CFASELINTV65();
    Init_QRY_PARASTAMSI41();
    Init_QRY_CFDBCFDBSE11();
    Init_QRY_PARASTAMJAS1();
    Init_QRY_CFDBCFDBSEIV();
    DigitaTesto.ImdbInit(IMDB);
    SceltaAccertamentiEsercizioPrecedente.ImdbInit(IMDB);
    SceltaSoggetti.ImdbInit(IMDB);
    SceltaSoggettiOmonimi.ImdbInit(IMDB);
    SelezioneCategorieFiscali.ImdbInit(IMDB);
    Classificazioni.ImdbInit(IMDB);
    ElencoProduttori.ImdbInit(IMDB);
    Modelli.ImdbInit(IMDB);
    SelezionaCausale.ImdbInit(IMDB);
    SceltaDellaDislocazione.ImdbInit(IMDB);
    SceltaFattori.ImdbInit(IMDB);
    SceltaCentri.ImdbInit(IMDB);
    SceltaFattoriContropartita.ImdbInit(IMDB);
    SelezioneComuni.ImdbInit(IMDB);
    SceltaImpegno.ImdbInit(IMDB);
    SceltaImpegnoProvenienza.ImdbInit(IMDB);
    SceltaImpegnoAnno.ImdbInit(IMDB);
    SceltaImpegnoAnnoPrecedente.ImdbInit(IMDB);
    SceltaImpegnoPersonalizzato.ImdbInit(IMDB);
    SceltaImpegnoOrdine.ImdbInit(IMDB);
    SceltaImpegnoUT.ImdbInit(IMDB);
    SceltaSubImpegnoUT.ImdbInit(IMDB);
    SceltaSubImpegnoUO.ImdbInit(IMDB);
    SceltaObiettiviPers.ImdbInit(IMDB);
    SceltaVociEconomiche.ImdbInit(IMDB);
    SceltaVociEconomicheConFiltri.ImdbInit(IMDB);
    CodiciPTC.ImdbInit(IMDB);
    SceltaCodiciGestionali.ImdbInit(IMDB);
    SceltaCodiciGestionaliConFiltri.ImdbInit(IMDB);
    TipoBollato.ImdbInit(IMDB);
    SceltaVincolo.ImdbInit(IMDB);
    SelezioneBanca.ImdbInit(IMDB);
    SceltaDocumenti.ImdbInit(IMDB);
    SceltaDelibere.ImdbInit(IMDB);
    SceltaProposte.ImdbInit(IMDB);
    SceltaAccertamenti.ImdbInit(IMDB);
    SceltaCapitoloArtSenzaUO.ImdbInit(IMDB);
    SceltaCapitoloArtConUO.ImdbInit(IMDB);
    ElencoVociPegConStanziamentoEffettivo.ImdbInit(IMDB);
    ElencoVociPegConStanziamentoSimulato.ImdbInit(IMDB);
    FinanziamentiSubImpFin.ImdbInit(IMDB);
    FinanziamentiImpFin.ImdbInit(IMDB);
    SceltaFinanziamentoOpera.ImdbInit(IMDB);
    SceltaCategorie.ImdbInit(IMDB);
    SceltaCodiciIntervento.ImdbInit(IMDB);
    SceltaQuietanzeDelSoggetto.ImdbInit(IMDB);
    SceltaOpere.ImdbInit(IMDB);
    SceltaFinanziamentiImpAcc.ImdbInit(IMDB);
    SceltaFinanziamentiSubimp.ImdbInit(IMDB);
    SceltaObiettivi.ImdbInit(IMDB);
    SceltaProgettoIndice1.ImdbInit(IMDB);
    SceltaProgettoIndice2.ImdbInit(IMDB);
    SceltaProgettoCfpegAttivo.ImdbInit(IMDB);
    SceltaProgettoCfpegAttivoVariazioni.ImdbInit(IMDB);
    SceltaObiettiviVariazioni.ImdbInit(IMDB);
    SceltaObiettiviVariazioniFunzBilancio.ImdbInit(IMDB);
    SceltaProgetti.ImdbInit(IMDB);
    SceltaVocePEGPersonalizzataConObiettivi.ImdbInit(IMDB);
    SceltaVocePEGPersonalizzataSenzaObiettivi.ImdbInit(IMDB);
    SceltaVocePEGPersonalizzataNUOVAConObiettivi.ImdbInit(IMDB);
    SceltaVocePEGPersonalizzataNUOVASenzaObiettivi.ImdbInit(IMDB);
    SceltaProgettoCfpegVariazioniNuovaVocePEG.ImdbInit(IMDB);
    SceltaObiettiviVariazioniNuovaVocePeg.ImdbInit(IMDB);
    SceltaVocePEGDaBil.ImdbInit(IMDB);
    SceltaVocePEGNoBil.ImdbInit(IMDB);
    SceltaTestiMail.ImdbInit(IMDB);
    SelezioneTitoli.ImdbInit(IMDB);
    SceltaTitoliTipologie.ImdbInit(IMDB);
    SceltaMissioniProgrammi.ImdbInit(IMDB);
    CapitoliTerzi.ImdbInit(IMDB);
    Funzioni.ImdbInit(IMDB);
    Servizi.ImdbInit(IMDB);
    Programmi.ImdbInit(IMDB);
    SelezioneFlessibilita.ImdbInit(IMDB);
    Preventivo.ImdbInit(IMDB);
    Consuntivo.ImdbInit(IMDB);
    UnitaOrganizzative.ImdbInit(IMDB);
    SceltaVocePEGSoloCollegateAUoCodrec1.ImdbInit(IMDB);
    SceltaProposteBozza.ImdbInit(IMDB);
    SceltaDataLimite.ImdbInit(IMDB);
    SceltaVariazione.ImdbInit(IMDB);
    SceltaPolProgetti.ImdbInit(IMDB);
    ElencoFinanziamenti.ImdbInit(IMDB);
    SceltaDistinteDiLiquidazione.ImdbInit(IMDB);
    CodiciUtenze.ImdbInit(IMDB);
    SceltaAccertamentiUT.ImdbInit(IMDB);
    CodiciMonitoraggio.ImdbInit(IMDB);
    SceltaUnitaOrganizzative.ImdbInit(IMDB);
    SceltaCapitoloConUODiCompetenza.ImdbInit(IMDB);
    SceltaAssestamenti.ImdbInit(IMDB);
    SceltaDaVistaStrutturaRicl.ImdbInit(IMDB);
    SceltaRiclassificazioni.ImdbInit(IMDB);
    SceltaCapitoliFS.ImdbInit(IMDB);
    SceltaVocePegDL77.ImdbInit(IMDB);
    SceltaCapitoloArtArm.ImdbInit(IMDB);
    SceltaTipoVariazione.ImdbInit(IMDB);
    SchedeObiettiviGestionali.ImdbInit(IMDB);
    SceltaCOFOG.ImdbInit(IMDB);
    SceltaCOFOGTrasco.ImdbInit(IMDB);
    SceltaMacroLiv4.ImdbInit(IMDB);
    SceltaVariazionePerEsigibilita.ImdbInit(IMDB);
    SceltaCapitoliDaCAPECAPUOJOIN.ImdbInit(IMDB);
    Mutui.ImdbInit(IMDB);
    SceltaCronoprogrammiNonDef.ImdbInit(IMDB);
    SceltaAccProvenienza.ImdbInit(IMDB);
    SceltaSubimpegnoProvenienza.ImdbInit(IMDB);
    SceltaOpereCrono.ImdbInit(IMDB);
    SceltaCapitoloArtArmRes.ImdbInit(IMDB);
    SceltaFattoriContropartitaRicl.ImdbInit(IMDB);
    SceltaFattoriContropartitaPassAtt.ImdbInit(IMDB);
    SceltaFinanziamentiPianoCronoprogramma.ImdbInit(IMDB);
    SceltaVoceTecnicaOpera.ImdbInit(IMDB);
    SceltaAccertamentiAnno.ImdbInit(IMDB);
    SceltaFinanziamentoBILFIN.ImdbInit(IMDB);
    SceltaOpereBifin.ImdbInit(IMDB);
    SceltaObiettiviDiGestioneDUP.ImdbInit(IMDB);
    SceltaFattoriOContropartitaUtenze.ImdbInit(IMDB);
    SceltaUODaCAPUO.ImdbInit(IMDB);
    SceltaUODaCAPBILUO.ImdbInit(IMDB);
    ElencoOpere.ImdbInit(IMDB);
    SceltaPeriodoRiaccertamento.ImdbInit(IMDB);
    SceltaMacroLiv4SenzaMissProg.ImdbInit(IMDB);
    SceltaMacro4E5.ImdbInit(IMDB);
    SceltaCofogConMissProg.ImdbInit(IMDB);
    SchedeInventario.ImdbInit(IMDB);
    SceltaStrutturaConti.ImdbInit(IMDB);
    InformazioniSullOpera.ImdbInit(IMDB);
    InformazioniFinanziamento.ImdbInit(IMDB);
    InformazioniProposta.ImdbInit(IMDB);
    InformazioneSuVoceBilancio.ImdbInit(IMDB);
    InfoPDConti.ImdbInit(IMDB);
    InfoProgettiVocePeg.ImdbInit(IMDB);
    InfoObiettiviVocePeg.ImdbInit(IMDB);
    FinanziamentiVociBilancio.ImdbInit(IMDB);
    PrevisioniInizialiOpera.ImdbInit(IMDB);
    VariazioniOpera.ImdbInit(IMDB);
    AccertamentiDiCompetenzaOpera.ImdbInit(IMDB);
    ImpegniDiCompetenza.ImdbInit(IMDB);
    VariazioniProvvisorieOpera.ImdbInit(IMDB);
    AccertamentiAResiduoOpera.ImdbInit(IMDB);
    ImpegniAResiduo.ImdbInit(IMDB);
    SubImpegniOpera.ImdbInit(IMDB);
    LiquidazioniOpera.ImdbInit(IMDB);
    OrdinativiDiCompetenzaOpera.ImdbInit(IMDB);
    OrdinativiAResiduoOpera.ImdbInit(IMDB);
    MandatiDiCompetenzaOpera.ImdbInit(IMDB);
    MandatiAResiduoOpera.ImdbInit(IMDB);
    PrevisioniInizialiFinanziamento.ImdbInit(IMDB);
    VariazioniFinanziamento.ImdbInit(IMDB);
    AccertamentiDiCompetenzaFinanziamento.ImdbInit(IMDB);
    VariazioniProvvisorieFinanziamento.ImdbInit(IMDB);
    AccertamentiAResiduoFinanziamento.ImdbInit(IMDB);
    SubImpegniFinanziamento.ImdbInit(IMDB);
    LiquidazioniFinanziamento.ImdbInit(IMDB);
    OrdinativiDiCompetenzaFinanziamento.ImdbInit(IMDB);
    OrdinativiAResiduoFinanziamento.ImdbInit(IMDB);
    MandatiDiCompetenzaFinanziamento.ImdbInit(IMDB);
    MandatiAResiduoFinanziamento.ImdbInit(IMDB);
    MandatiEmessi.ImdbInit(IMDB);
    MandatiEmessiEserciziPrecedentiFin.ImdbInit(IMDB);
    Pagamenti.ImdbInit(IMDB);
    PagamentiEserciziPrecedentiFinanziamento.ImdbInit(IMDB);
    OrdinativiEmessi.ImdbInit(IMDB);
    Riscossioni.ImdbInit(IMDB);
    OrdinativiEmessiEserciziPrecedentiFinanziamento.ImdbInit(IMDB);
    RiscossioniEserciziPrecedentiFinanziamento.ImdbInit(IMDB);
    Variazioni.ImdbInit(IMDB);
    StanziamentiProgettoCfpeg.ImdbInit(IMDB);
    StanziamentiSullObiettivo.ImdbInit(IMDB);
    InfoQuietanza.ImdbInit(IMDB);
    InfoDisposizioni.ImdbInit(IMDB);
    InfoDistinteLiquidazione.ImdbInit(IMDB);
    InformazioniDelibera.ImdbInit(IMDB);
    InfoDelibera.ImdbInit(IMDB);
    InfoOrdinativo.ImdbInit(IMDB);
    InformazioneSuVoceBilancio77.ImdbInit(IMDB);
    PianoDeiConti77.ImdbInit(IMDB);
    SceltaEsercizio.ImdbInit(IMDB);
    SceltaUfficio.ImdbInit(IMDB);
    SchemaStruttura.ImdbInit(IMDB);
    Struttura.ImdbInit(IMDB);
    NuovoSuStrutturaBilancio.ImdbInit(IMDB);
    TipiRiclassificazione.ImdbInit(IMDB);
    SchemiRiclassificazione.ImdbInit(IMDB);
    StrutturaRiclassificazione.ImdbInit(IMDB);
    NuovoSuStrutturaRiclassificazione.ImdbInit(IMDB);
    ProgrammiCofog.ImdbInit(IMDB);
    CodiciLiberi.ImdbInit(IMDB);
    CgeCgu.ImdbInit(IMDB);
    TipiMotivazioniVariazioni.ImdbInit(IMDB);
    TipiVariazione1.ImdbInit(IMDB);
    Finanziamenti.ImdbInit(IMDB);
    Opere.ImdbInit(IMDB);
    FinanziamentiPerContributo.ImdbInit(IMDB);
    Titoli.ImdbInit(IMDB);
    CapitoliContoTerzi.ImdbInit(IMDB);
    FunzioniServizi.ImdbInit(IMDB);
    Vincoli.ImdbInit(IMDB);
    Allegati.ImdbInit(IMDB);
    CodiciCertificati.ImdbInit(IMDB);
    Flessibilita.ImdbInit(IMDB);
    ProgrammiProgetti.ImdbInit(IMDB);
    CentriDiCosto.ImdbInit(IMDB);
    TipiMotivazione.ImdbInit(IMDB);
    TipiVariazione.ImdbInit(IMDB);
    TipiVariazioneCronoprogrammi.ImdbInit(IMDB);
    TipiAvanzo.ImdbInit(IMDB);
    Causali.ImdbInit(IMDB);
    TipiBollo.ImdbInit(IMDB);
    Firme.ImdbInit(IMDB);
    ContributiStraordinari.ImdbInit(IMDB);
    TipiIncarico.ImdbInit(IMDB);
    VociTecnicheOpere.ImdbInit(IMDB);
    CodiciFiscali.ImdbInit(IMDB);
    CausaliFiscali.ImdbInit(IMDB);
    CausaliIRAP.ImdbInit(IMDB);
    CausaliPrevidenziali.ImdbInit(IMDB);
    CausaliINAIL.ImdbInit(IMDB);
    CategorieSoggetti.ImdbInit(IMDB);
    TipiScadenza.ImdbInit(IMDB);
    TipiQuietanza.ImdbInit(IMDB);
    CategorieDocumenti.ImdbInit(IMDB);
    Uffici.ImdbInit(IMDB);
    CausaliSospensione.ImdbInit(IMDB);
    TipiRegistro.ImdbInit(IMDB);
    Esenzioni.ImdbInit(IMDB);
    Attivita.ImdbInit(IMDB);
    CodiciStatistici.ImdbInit(IMDB);
    Registri.ImdbInit(IMDB);
    TipiEsecutivita.ImdbInit(IMDB);
    Fattori.ImdbInit(IMDB);
    Centri.ImdbInit(IMDB);
    ClassiContabili.ImdbInit(IMDB);
    FattoriOld.ImdbInit(IMDB);
    Preferenze.ImdbInit(IMDB);
    PreferenzeWeb.ImdbInit(IMDB);
    ParametriTrasparenzaAttiConcessione.ImdbInit(IMDB);
    AssociazioneTipiCostoEPCF.ImdbInit(IMDB);
    Ente.ImdbInit(IMDB);
    EnteInformazioni.ImdbInit(IMDB);
    Tesoriere.ImdbInit(IMDB);
    TesoriereInformazioni.ImdbInit(IMDB);
    Numerazioni.ImdbInit(IMDB);
    NumerazioniInformazioni.ImdbInit(IMDB);
    TestiStampe.ImdbInit(IMDB);
    VociEcon.ImdbInit(IMDB);
    Competenze.ImdbInit(IMDB);
    Assessorati.ImdbInit(IMDB);
    Delibere.ImdbInit(IMDB);
    Delibera.ImdbInit(IMDB);
    MovimentiDelibera.ImdbInit(IMDB);
    EsecutivitaProposte.ImdbInit(IMDB);
    EsecutivitaProposteDaGs4.ImdbInit(IMDB);
    MovimentiProposte.ImdbInit(IMDB);
    StampaProposte.ImdbInit(IMDB);
    ServiziDiretti.ImdbInit(IMDB);
    AttribuzioneAlServizio.ImdbInit(IMDB);
    ElencoCapitoliServiziDiretti.ImdbInit(IMDB);
    ServiziDirettiFinanziatiDalCapitolo.ImdbInit(IMDB);
    Soggetti.ImdbInit(IMDB);
    Soggetto.ImdbInit(IMDB);
    GenerazioneSoggettiPerEconomato.ImdbInit(IMDB);
    CorrispondenzaRegioni.ImdbInit(IMDB);
    ControlloSoggetti.ImdbInit(IMDB);
    EstrattoContoSoggetto.ImdbInit(IMDB);
    DettagliMandato.ImdbInit(IMDB);
    DettagliOrdinativo.ImdbInit(IMDB);
    TotaleEntrata.ImdbInit(IMDB);
    TotaleSpesa.ImdbInit(IMDB);
    DettagliFattureSpesa.ImdbInit(IMDB);
    DettagliFattureEntrata.ImdbInit(IMDB);
    DocumentiDebitoriCodificati.ImdbInit(IMDB);
    ContabilizzazioneDocumenti.ImdbInit(IMDB);
    DocumentiDebitoriNonCodificati.ImdbInit(IMDB);
    ContabilizzazioneIVA.ImdbInit(IMDB);
    ContabilizzazioneFinanziariaEconomica.ImdbInit(IMDB);
    EmissioneAccertamenti.ImdbInit(IMDB);
    EmissAcc.ImdbInit(IMDB);
    CausaliEPeriodi.ImdbInit(IMDB);
    DocumentiPerImputazioneContabile.ImdbInit(IMDB);
    DocumentiPerImputazioneEconomica.ImdbInit(IMDB);
    DocumentiPerQuietanza.ImdbInit(IMDB);
    Scadenziario.ImdbInit(IMDB);
    Corrispettivi.ImdbInit(IMDB);
    EstrattoConto.ImdbInit(IMDB);
    DocumentiAperti.ImdbInit(IMDB);
    Protocollo.ImdbInit(IMDB);
    RendicontoMandati.ImdbInit(IMDB);
    RendicontoMandatiRivoli.ImdbInit(IMDB);
    RendicontoFatture.ImdbInit(IMDB);
    RendicontoFatturePersonalizzazioneRivoli.ImdbInit(IMDB);
    ProvvedimentoLiquidazione.ImdbInit(IMDB);
    SituazioneLiquidazioniPerCodiceUtenza.ImdbInit(IMDB);
    SituazioneLiquidazioniPerImpegno.ImdbInit(IMDB);
    GenerazioneImputazioneEconomica2.ImdbInit(IMDB);
    ElencoIncassi.ImdbInit(IMDB);
    ElencoIncassiAggiornaIncassi.ImdbInit(IMDB);
    EmissioneCorrispettiviIncassi.ImdbInit(IMDB);
    EmissioneOrdinativiIncassi.ImdbInit(IMDB);
    CaricamentoIncassi.ImdbInit(IMDB);
    Fatture.ImdbInit(IMDB);
    Fattura.ImdbInit(IMDB);
    TipiDocumento.ImdbInit(IMDB);
    Imputazioni.ImdbInit(IMDB);
    Liquidazioni.ImdbInit(IMDB);
    Ordinativi.ImdbInit(IMDB);
    ElencoLiquidazioni.ImdbInit(IMDB);
    ElencoOrdinativi.ImdbInit(IMDB);
    Rettifiche.ImdbInit(IMDB);
    Documenti.ImdbInit(IMDB);
    AcquisizioneImmagineFattura.ImdbInit(IMDB);
    Scansione.ImdbInit(IMDB);
    AcquisizioneImmagineIride.ImdbInit(IMDB);
    InfoFattura.ImdbInit(IMDB);
    OrdiniCollegatiAFattura.ImdbInit(IMDB);
    ElencoFileInviati.ImdbInit(IMDB);
    ElencoFattureDaInviare.ImdbInit(IMDB);
    CreaFileXMLComunicazioneFatture.ImdbInit(IMDB);
    VisualizzaDescrizione.ImdbInit(IMDB);
    DettaglioFattureInviate.ImdbInit(IMDB);
    ElencoFileZIPInviati.ImdbInit(IMDB);
    ImportFileEsito.ImdbInit(IMDB);
    VisualizzaEsito.ImdbInit(IMDB);
    ElencoFattureComunicazioneFatture.ImdbInit(IMDB);
    DistinteLiquidazioneTecniche.ImdbInit(IMDB);
    RettificaMassivaUOSuFatture.ImdbInit(IMDB);
    SegnalazioniRettifaMassivaUO.ImdbInit(IMDB);
    ImportaDaFileCSV.ImdbInit(IMDB);
    RisultatoElaborazione.ImdbInit(IMDB);
    EliminaCollegamentoBolla.ImdbInit(IMDB);
    InserimentoDaOrdine.ImdbInit(IMDB);
    ControlloFatture.ImdbInit(IMDB);
    DettagliImpegni.ImdbInit(IMDB);
    InserimentoDaBolla.ImdbInit(IMDB);
    InfoOrdini.ImdbInit(IMDB);
    Buono.ImdbInit(IMDB);
    CategoriaProdotto.ImdbInit(IMDB);
    VociEconomiche.ImdbInit(IMDB);
    RettificaImpegno.ImdbInit(IMDB);
    ElencoFattureOrdine.ImdbInit(IMDB);
    ElencoBolle.ImdbInit(IMDB);
    SituazioneDettaglio.ImdbInit(IMDB);
    CaricamentoFile.ImdbInit(IMDB);
    SmistamentoFatture.ImdbInit(IMDB);
    ConfigurazioneUtenze.ImdbInit(IMDB);
    Notifiche.ImdbInit(IMDB);
    FattureElettroniche.ImdbInit(IMDB);
    ModificaAssegnaUnitaPerAccettazione.ImdbInit(IMDB);
    InserimentoNuovoSoggetto.ImdbInit(IMDB);
    SelezioneSoggetto.ImdbInit(IMDB);
    ModificaAssegnaUnitaMULTISEL.ImdbInit(IMDB);
    MotivazioneRifiuto.ImdbInit(IMDB);
    Segnalazioni.ImdbInit(IMDB);
    RiepilogoIVA.ImdbInit(IMDB);
    AccettaNotaDiCredito.ImdbInit(IMDB);
    DocumentiDaCollegareARettificaFEVEN.ImdbInit(IMDB);
    IVA.ImdbInit(IMDB);
    AggiornamentoEsigibilita.ImdbInit(IMDB);
    NumerazioneIVA.ImdbInit(IMDB);
    ConfermaIVA.ImdbInit(IMDB);
    VentilazioneIVA.ImdbInit(IMDB);
    CalcoloIVAVentilata.ImdbInit(IMDB);
    PercentualiDiIncidenza.ImdbInit(IMDB);
    RegistroAcquistiVendite.ImdbInit(IMDB);
    RegistroCorrispettivi.ImdbInit(IMDB);
    RegistroRiepilogativoAcquistiVendite.ImdbInit(IMDB);
    RegistroRiepilogativoAcquistiVenditeSospesi.ImdbInit(IMDB);
    RegistroRiepilogativoCorrispettivi.ImdbInit(IMDB);
    VerificaIVA.ImdbInit(IMDB);
    VerificaIVASospesi.ImdbInit(IMDB);
    ControlloIVAInAttesaDiEsigibilita.ImdbInit(IMDB);
    LiquidazioneIVA.ImdbInit(IMDB);
    LiquidazioneIVAPersLivorno.ImdbInit(IMDB);
    ComunicazioneLiquidazioniPeriodicheIVA.ImdbInit(IMDB);
    DatiComunicazioneLiqIVA.ImdbInit(IMDB);
    EstrazioneIVAExcel.ImdbInit(IMDB);
    EstrazioneDatiPerControlloIVA.ImdbInit(IMDB);
    CollegamentoCapitoli.ImdbInit(IMDB);
    EsigibilitaIVAFattureLiquidateParzialmente.ImdbInit(IMDB);
    Utenze.ImdbInit(IMDB);
    DistintaDiLiquidazione.ImdbInit(IMDB);
    EmissioneLiquidazioniDaDistinta.ImdbInit(IMDB);
    ElencoDistinteDiLiquidazione.ImdbInit(IMDB);
    ElencoAnomalieLiquidazioniUtenze.ImdbInit(IMDB);
    CaricamentoFatture.ImdbInit(IMDB);
    CaricamentoConsumi.ImdbInit(IMDB);
    DocumentiCorrispettivi.ImdbInit(IMDB);
    InfoCorrispettivi.ImdbInit(IMDB);
    RettificaBollato.ImdbInit(IMDB);
    IntegrazionePCC.ImdbInit(IMDB);
    InserisciDocumentiDaCfa.ImdbInit(IMDB);
    EsitoComunicazioneAPCC.ImdbInit(IMDB);
    ReinviaComunicaRicezionePCC.ImdbInit(IMDB);
    ComunicaContabilizzazionePCC.ImdbInit(IMDB);
    ComunicaScadutoPCC.ImdbInit(IMDB);
    FileComunicazioniPCC.ImdbInit(IMDB);
    AnnullaFileCorrente.ImdbInit(IMDB);
    DettaglioDocumenti.ImdbInit(IMDB);
    CambiaAzioneAnnulla.ImdbInit(IMDB);
    RendiModificabileDocumento.ImdbInit(IMDB);
    ImportaEsitoRicezionePCC.ImdbInit(IMDB);
    AccettazioneManualePCC.ImdbInit(IMDB);
    InfoStepFattura.ImdbInit(IMDB);
    PianoDeiContiList.ImdbInit(IMDB);
    InserimentoAggiornamentoPDConti.ImdbInit(IMDB);
    InserimentoSuEserciziSuccessivi.ImdbInit(IMDB);
    AggiornamentoAutomaticoImputazioniEconomicheOLD.ImdbInit(IMDB);
    ElencoUO.ImdbInit(IMDB);
    FinanziamentiSuCap.ImdbInit(IMDB);
    ElencoFinanziamentiPiano.ImdbInit(IMDB);
    CorrispondenzeCapitoli.ImdbInit(IMDB);
    InserimentoCapitoloSuCF4.ImdbInit(IMDB);
    AggiornaMovimentazione.ImdbInit(IMDB);
    RettificaUOSuCapitolo.ImdbInit(IMDB);
    ControlliUOPianoDeiConti.ImdbInit(IMDB);
    CapitoliSenzaImputazioniEconomiche.ImdbInit(IMDB);
    AssociaCentroAiCapitoli.ImdbInit(IMDB);
    AnomalieAssociazioneCentroACapitoli.ImdbInit(IMDB);
    ElencoImputazioniEconomichePianoDeiConti.ImdbInit(IMDB);
    RecuperoEconomicaSuMovimentiAUTOMATICO.ImdbInit(IMDB);
    MovimentiSenzaImputazioneEconomica.ImdbInit(IMDB);
    DocumentiSenzaImputazioneEconomica.ImdbInit(IMDB);
    RecuperoRettificaEconomicaSuMovimenti.ImdbInit(IMDB);
    AssociaImputazioniEconomiche.ImdbInit(IMDB);
    LogCancellazioniUnitaOrganizzative.ImdbInit(IMDB);
    RettificaMassivaUO.ImdbInit(IMDB);
    AggiungiUnitaAiCapitoli.ImdbInit(IMDB);
    SegnalazioniRettificaMassivaUO.ImdbInit(IMDB);
    RettificaUnita.ImdbInit(IMDB);
    DifferenzeSuEserciziSuccessivi.ImdbInit(IMDB);
    RettificaUOPerCambioOttica.ImdbInit(IMDB);
    AssegnazioneUOCapitoli.ImdbInit(IMDB);
    AggiornaValoriComuniUO.ImdbInit(IMDB);
    ErroriRettificaUOCambioOttica.ImdbInit(IMDB);
    LogRettificaUOCambioOttica.ImdbInit(IMDB);
    RettificaDefinitivaUO.ImdbInit(IMDB);
    AggiornaTipoAvanzoSuCapitoliAutomatico.ImdbInit(IMDB);
    AggiornaTipoAvanzoSuCapitoliManuale.ImdbInit(IMDB);
    EserciziFinanziari.ImdbInit(IMDB);
    StanziamentiBilancioEffettivo.ImdbInit(IMDB);
    StanziamentiBilancioSimulato.ImdbInit(IMDB);
    StanziamentiUO.ImdbInit(IMDB);
    CapitoliFuoriStruttura.ImdbInit(IMDB);
    StanziamentiPluriennaliEffettivo.ImdbInit(IMDB);
    BIL.ImdbInit(IMDB);
    StanziamentiPluriennaliSimulato.ImdbInit(IMDB);
    BPR.ImdbInit(IMDB);
    StanziamentiBilancioEffettivoVg.ImdbInit(IMDB);
    StanziamentiUOVg.ImdbInit(IMDB);
    StanziamentiBilancioSimulatoVg.ImdbInit(IMDB);
    StanziamentiUOVg1.ImdbInit(IMDB);
    Cronoprogramma.ImdbInit(IMDB);
    ImputazioniCrono.ImdbInit(IMDB);
    Piani.ImdbInit(IMDB);
    EntrateCronoprogrammi.ImdbInit(IMDB);
    Varpiani.ImdbInit(IMDB);
    Cronoprogrammi.ImdbInit(IMDB);
    InsagginfoCronoprogramma.ImdbInit(IMDB);
    DefinizioneCronoprogramma.ImdbInit(IMDB);
    ElencoVariazioniDaConfermare.ImdbInit(IMDB);
    DettaglioComposizioneImporti.ImdbInit(IMDB);
    StampaElencoVariazioniFunAgg.ImdbInit(IMDB);
    StampaCronoprogramma.ImdbInit(IMDB);
    QuadroEconomicoFinanziario.ImdbInit(IMDB);
    ElencoCronoprogrammi.ImdbInit(IMDB);
    GenerazioneImpegniDaPiano.ImdbInit(IMDB);
    FinanziamentiDaCronoFase1.ImdbInit(IMDB);
    FinanziamentiDaCronoFase2.ImdbInit(IMDB);
    ParametriFSC.ImdbInit(IMDB);
    DefinizioneTipoCalcolo.ImdbInit(IMDB);
    AggiornaTipoCalcolo.ImdbInit(IMDB);
    FCDDEBilPrevisione.ImdbInit(IMDB);
    FCDDEARendiconto.ImdbInit(IMDB);
    CalcoloFCDDEInGestione.ImdbInit(IMDB);
    FCDDEInfoAccertato.ImdbInit(IMDB);
    FCDDEInfoIncassato.ImdbInit(IMDB);
    FCDDEInfoIncassatoRend.ImdbInit(IMDB);
    AggiornaValoriComuniFCDDERend.ImdbInit(IMDB);
    TipiCalcoloCassa.ImdbInit(IMDB);
    PercentualiCalcoloStanziamenti.ImdbInit(IMDB);
    DuplicaSuAltroEsercizio.ImdbInit(IMDB);
    GenerazioneBilancio.ImdbInit(IMDB);
    CalcoliImportiBilancioSimulato.ImdbInit(IMDB);
    CalcoliImportiBilancioEffettivo.ImdbInit(IMDB);
    PassaggioSuBilancioEffettivo.ImdbInit(IMDB);
    GenerazioneNuovoBilancio.ImdbInit(IMDB);
    GenerazioneNuoviFinanziamenti.ImdbInit(IMDB);
    AggiornamentoAutomaticoBilancio.ImdbInit(IMDB);
    VociDelBilancioSimulatoConStanziamentoInferioreAgliImpegni.ImdbInit(IMDB);
    RiemissioneImpAccPluriennali.ImdbInit(IMDB);
    SchedeComposizioneStanziamenti.ImdbInit(IMDB);
    EliminazioneBilancioSimulato.ImdbInit(IMDB);
    AperturaNuovoBilancio.ImdbInit(IMDB);
    ParametriBilancioPrev.ImdbInit(IMDB);
    StampeBilancioPrev.ImdbInit(IMDB);
    StampeBilancioAggiornato.ImdbInit(IMDB);
    BilancioEntratePrev.ImdbInit(IMDB);
    RisultatoAmmNePresunto.ImdbInit(IMDB);
    RisultatoAmmPresunto2014.ImdbInit(IMDB);
    LimitiIndebitamento.ImdbInit(IMDB);
    FCDDEPrev.ImdbInit(IMDB);
    ElencoResiduiEsercizio.ImdbInit(IMDB);
    QuadroGeneraleRiassuntivoPrev.ImdbInit(IMDB);
    QuadroGeneraleRiassuntivoAgg.ImdbInit(IMDB);
    EquilibriDiBilancioPrev.ImdbInit(IMDB);
    EquilibriBilancioAgg.ImdbInit(IMDB);
    VerificaVincoli.ImdbInit(IMDB);
    ComposizioneFPVAgg.ImdbInit(IMDB);
    ParametriObiettivoPrev.ImdbInit(IMDB);
    AllegatiBilancioA1Prev.ImdbInit(IMDB);
    AllegatiBilancioA2Prev.ImdbInit(IMDB);
    AllegatiBilancioA3Prev.ImdbInit(IMDB);
    BilancioPerCapitoli.ImdbInit(IMDB);
    PegAggiornatoEntrataSpesa.ImdbInit(IMDB);
    BilancioPerCapitoliAggiornato.ImdbInit(IMDB);
    BilancioPrevisione.ImdbInit(IMDB);
    RiepilogoGeneraleSpesePreventivo.ImdbInit(IMDB);
    FunzioniDelegate.ImdbInit(IMDB);
    ContributiComunitariInternazionali.ImdbInit(IMDB);
    QuadroGeneraleRiassuntivoPreventivo.ImdbInit(IMDB);
    BilancioPluriennale.ImdbInit(IMDB);
    BilancioAggiornato.ImdbInit(IMDB);
    PegPreventivo.ImdbInit(IMDB);
    PrevisioniPerServizio.ImdbInit(IMDB);
    PrevisioniPerSettoreOperativo.ImdbInit(IMDB);
    PrevisioniPerCentroDiCosto.ImdbInit(IMDB);
    PrevisioniPerUnitaDiGestione.ImdbInit(IMDB);
    PrevisioniPerUnitaDiUtilizzo.ImdbInit(IMDB);
    PrevisioniPerTipologiaDiSpesa.ImdbInit(IMDB);
    PrevisioniPerProgramma.ImdbInit(IMDB);
    PrevisioniPerVincolo.ImdbInit(IMDB);
    PrevisioniPerFlessibilita.ImdbInit(IMDB);
    PrevisioniFinanziamenti.ImdbInit(IMDB);
    PrevisioniServiziInEconomia.ImdbInit(IMDB);
    AmministrazioneTrasparente.ImdbInit(IMDB);
    PegPluriennale.ImdbInit(IMDB);
    PegAggiornato.ImdbInit(IMDB);
    ElencoResidui.ImdbInit(IMDB);
    EstrazioneDatiRPP.ImdbInit(IMDB);
    VerificaAnomalie.ImdbInit(IMDB);
    ParametriBilancioCons.ImdbInit(IMDB);
    StampeBilancioCons.ImdbInit(IMDB);
    BilancioEntrateCons.ImdbInit(IMDB);
    CertificazioneParametriObiettivi.ImdbInit(IMDB);
    EquilibriDiBilancioCons.ImdbInit(IMDB);
    QuadroGeneraleRiassuntivoCons.ImdbInit(IMDB);
    RisultatoDiAmministrazione.ImdbInit(IMDB);
    FCDDECons.ImdbInit(IMDB);
    QuadroRiassuntivoGestioneCassa.ImdbInit(IMDB);
    ResiduiDaRiportareCons.ImdbInit(IMDB);
    ParametriObiettiviCons.ImdbInit(IMDB);
    AllegatiBilancioA1Cons.ImdbInit(IMDB);
    AllegatiBilancioA2Cons.ImdbInit(IMDB);
    AllegatiBilancioA3Cons.ImdbInit(IMDB);
    ContoConsuntivoOld.ImdbInit(IMDB);
    EstrazioneDatiCertificatoConsuntivo.ImdbInit(IMDB);
    ContoDelTesoriere.ImdbInit(IMDB);
    PEGConsuntivoOld.ImdbInit(IMDB);
    QuadroGeneraleRiassuntivo.ImdbInit(IMDB);
    ServiziInEconomia.ImdbInit(IMDB);
    VariazioniAiResidui.ImdbInit(IMDB);
    ServiziInEconomiaPegConsuntivo.ImdbInit(IMDB);
    VariazioniAiResiduiPegConsuntivo.ImdbInit(IMDB);
    BilancioPerCapitoliConsuntivo.ImdbInit(IMDB);
    VariazioniDaBudgetCe4.ImdbInit(IMDB);
    EsecutivitaVariazioni.ImdbInit(IMDB);
    EsecutivitaVariazioniDaGs4.ImdbInit(IMDB);
    VariazioniATesoreria.ImdbInit(IMDB);
    SituazioneVariazioniTrattate.ImdbInit(IMDB);
    InformazioniVariazioni.ImdbInit(IMDB);
    VarDef.ImdbInit(IMDB);
    VarProvv.ImdbInit(IMDB);
    PvbSchedeObiettiviProv.ImdbInit(IMDB);
    VariazioniDefinitive.ImdbInit(IMDB);
    EstremiVariazioni.ImdbInit(IMDB);
    VariazioniProvvisorie.ImdbInit(IMDB);
    CapitoliConVarProvAnomalie.ImdbInit(IMDB);
    GenerazioneVariazioniDaCronoprogramma.ImdbInit(IMDB);
    LanciaGeneraVarCrono.ImdbInit(IMDB);
    Fase1EstremiProvvedimento.ImdbInit(IMDB);
    Fase2VariazioniImpegnabile.ImdbInit(IMDB);
    PresaInCaricoProposte.ImdbInit(IMDB);
    DettagliBozzaProposta.ImdbInit(IMDB);
    BozzeVariazione.ImdbInit(IMDB);
    InserimentoAggiornamentoBozzeVariazione.ImdbInit(IMDB);
    ParametriControlloDisponibilitaRep1.ImdbInit(IMDB);
    TotaliBozza.ImdbInit(IMDB);
    ReportControlloDisponibilita1.ImdbInit(IMDB);
    ControlloQuadratura.ImdbInit(IMDB);
    ElencoVariazioniBozza.ImdbInit(IMDB);
    ParametriElencoProposteSospeseAnnullate.ImdbInit(IMDB);
    ElencoProposteSospeseAnnullate.ImdbInit(IMDB);
    AggiornamentoTipoVariazione.ImdbInit(IMDB);
    AggiornamentoBilancioPEG.ImdbInit(IMDB);
    SpostamentoSuDiversaBozza.ImdbInit(IMDB);
    AssociazioneBozzaAVariazione.ImdbInit(IMDB);
    DissociazioneBozzaDaVariazione.ImdbInit(IMDB);
    SituazioneProposte.ImdbInit(IMDB);
    DettagliProposta.ImdbInit(IMDB);
    SollecitoChiusuraProposta.ImdbInit(IMDB);
    VariazioniBilancioPEG.ImdbInit(IMDB);
    DettagliVariazioneDaVariazioniBilancioPeg.ImdbInit(IMDB);
    GenerazioneVariazioniProvvisorie.ImdbInit(IMDB);
    ParametriAllegatoVariazione.ImdbInit(IMDB);
    ReportAllegatoVariazione.ImdbInit(IMDB);
    ElencoVariazioniGenerate.ImdbInit(IMDB);
    EliminazioneVariazioniProvvisorie.ImdbInit(IMDB);
    InfoSuVoceBilancioPerVariazioni.ImdbInit(IMDB);
    SituazioneProgettoVariazioni.ImdbInit(IMDB);
    SituazioneObiettivoVariazioni.ImdbInit(IMDB);
    InformazioniFinanziamentoPerVariazioni.ImdbInit(IMDB);
    InformazioniSullOperaPerVariazioni.ImdbInit(IMDB);
    StoricoScheda.ImdbInit(IMDB);
    StoricoFase.ImdbInit(IMDB);
    StampaVariazioniPEGPerObiettivi.ImdbInit(IMDB);
    SpecialDigitaTesto.ImdbInit(IMDB);
    Assestamenti.ImdbInit(IMDB);
    AllegatoVariazioni.ImdbInit(IMDB);
    ComposizioneVariazioni.ImdbInit(IMDB);
    ComposizioneVariazioniFPV.ImdbInit(IMDB);
    ControlloQuadraturaPluriennali.ImdbInit(IMDB);
    ControlloVarProvvisorie.ImdbInit(IMDB);
    ElencoVariazioni.ImdbInit(IMDB);
    ElencoVariazioniCapitolo.ImdbInit(IMDB);
    ReiscrizioniDaImpegno.ImdbInit(IMDB);
    VariazioniEquilibriDiBilancio.ImdbInit(IMDB);
    VariazioniPerFinanziamento.ImdbInit(IMDB);
    VariazioniPerProgetto.ImdbInit(IMDB);
    VariazioniPerEsigibilita.ImdbInit(IMDB);
    ControlloQuadraturaPluri.ImdbInit(IMDB);
    VariazioniEsigConsCorrAntic.ImdbInit(IMDB);
    GenerazioneVariazioniPerEsigConsuntivo.ImdbInit(IMDB);
    EliminazioneVarEsig.ImdbInit(IMDB);
    VariazioniEsigDiEntrata.ImdbInit(IMDB);
    GenerazioneVariazioniEsigEntrata.ImdbInit(IMDB);
    AggiornamentoTipoAvanzo.ImdbInit(IMDB);
    VariazioniPerTipoAvanzo.ImdbInit(IMDB);
    AggiornaTipoAvanzo.ImdbInit(IMDB);
    AggiornaTipoAvanzoSuMovimentazione.ImdbInit(IMDB);
    GestioneAvanzo.ImdbInit(IMDB);
    StampaGestioneAvanzo.ImdbInit(IMDB);
    SaldiTipiAvanzo.ImdbInit(IMDB);
    ParametriAvanzoEsercizio.ImdbInit(IMDB);
    AvanzoEsercizio.ImdbInit(IMDB);
    DettagliAvanzo.ImdbInit(IMDB);
    SituazioneGenerale.ImdbInit(IMDB);
    SituazioneDodicesimi.ImdbInit(IMDB);
    SituazionePercentualePrimoSemestre.ImdbInit(IMDB);
    SituazionePerClassificazioni.ImdbInit(IMDB);
    SituazioneGeneralePerUnitaOrganizzativa.ImdbInit(IMDB);
    SituazioneTipologiaDiSpesa.ImdbInit(IMDB);
    SitCapitoliPerCategorieFinanziamento.ImdbInit(IMDB);
    SitCapitoliPerFontiFinanziamentoUO.ImdbInit(IMDB);
    SituazioniPerClassificazioniMissioni.ImdbInit(IMDB);
    SituazioniPerClassificazioniMissioniEMacro.ImdbInit(IMDB);
    SituazioniPerClassificazioniTitoloTipologia.ImdbInit(IMDB);
    SituazioniPerClassificazioniMacroaggregato.ImdbInit(IMDB);
    SituazioniPerAltreClassificazioni.ImdbInit(IMDB);
    Cassa.ImdbInit(IMDB);
    ElencoImpegniCassa.ImdbInit(IMDB);
    ElencoAccertamentiCassa.ImdbInit(IMDB);
    DatiCertificato.ImdbInit(IMDB);
    Certificato.ImdbInit(IMDB);
    ElencoCodiciMancanti.ImdbInit(IMDB);
    EstrazioniBDAP.ImdbInit(IMDB);
    GestioneBDAP.ImdbInit(IMDB);
    DatiContabiliAnaliticiRendiconto.ImdbInit(IMDB);
    DatiContabiliAnaliticiPrevisione.ImdbInit(IMDB);
    SchemiDiBilancio.ImdbInit(IMDB);
    Impegno.ImdbInit(IMDB);
    FormVariazioni.ImdbInit(IMDB);
    MovimentiVincoloImp.ImdbInit(IMDB);
    MovimentiVincoloAcc.ImdbInit(IMDB);
    SituazioneVincolo.ImdbInit(IMDB);
    SceltaImpegnoOResiduo.ImdbInit(IMDB);
    SubImpegno.ImdbInit(IMDB);
    FormVariazioniSubimp.ImdbInit(IMDB);
    FinanziamentiSubimp.ImdbInit(IMDB);
    InformazioniImpegno.ImdbInit(IMDB);
    InfoVariazioniImpegno.ImdbInit(IMDB);
    InformazioneFinanziamenti.ImdbInit(IMDB);
    InformazioniPluriennali.ImdbInit(IMDB);
    DDisponibilitaMono.ImdbInit(IMDB);
    CF4WEBIMPSUBDISPONIBILITA.ImdbInit(IMDB);
    OrdiniDisposizioni.ImdbInit(IMDB);
    InformazioniSubImpegno.ImdbInit(IMDB);
    InformazioniFinanziamentiSubImpegno.ImdbInit(IMDB);
    GenerazioneImpegniPerEconomato.ImdbInit(IMDB);
    GenerazioneImpegniDaEsigibilita.ImdbInit(IMDB);
    ParametriGenerazioneImpegniDaEsigibilita.ImdbInit(IMDB);
    ElencoAnomalieImpegniReiscritti.ImdbInit(IMDB);
    GenerazioneImpegniDaCronoprogramma.ImdbInit(IMDB);
    ParametriGenerazioneImpegniDaCronoprogramma.ImdbInit(IMDB);
    GenerazioneVariazioniImpegniDaCronoDaVarBil.ImdbInit(IMDB);
    LanciaGeneraVarimpCrono.ImdbInit(IMDB);
    ElencoImpegniReiscritti.ImdbInit(IMDB);
    RettificaOpera.ImdbInit(IMDB);
    RettificaCapitoloImp.ImdbInit(IMDB);
    GiornaleImpegni.ImdbInit(IMDB);
    SchedaIncarichi.ImdbInit(IMDB);
    VariazioniImpegni.ImdbInit(IMDB);
    IncarichiImpegni.ImdbInit(IMDB);
    ImpegnoAutomaticoDisponibilita.ImdbInit(IMDB);
    EmissioneImpegni.ImdbInit(IMDB);
    StoriaImpegno.ImdbInit(IMDB);
    StampaStoriaImpegno.ImdbInit(IMDB);
    StoriaSubimpegno.ImdbInit(IMDB);
    Finanziamenti1.ImdbInit(IMDB);
    VariazioniSubimpegni.ImdbInit(IMDB);
    SceltaVoceEcon.ImdbInit(IMDB);
    Accertamenti.ImdbInit(IMDB);
    VariazioniAcc.ImdbInit(IMDB);
    InfoAccertamentiForm.ImdbInit(IMDB);
    InfoPluriennali.ImdbInit(IMDB);
    InfoOpere.ImdbInit(IMDB);
    SceltaAccertamentiPerFunzioniAccertamenti.ImdbInit(IMDB);
    RettificaFinanziamento.ImdbInit(IMDB);
    RettificaCapitolo.ImdbInit(IMDB);
    GiornaleAccertamenti.ImdbInit(IMDB);
    VariazioniAccertamenti.ImdbInit(IMDB);
    Opere1.ImdbInit(IMDB);
    GenerazioneAccertamentiDaEsigibilita.ImdbInit(IMDB);
    ParametriGenerazioneAccertamentiDaEsigibilita.ImdbInit(IMDB);
    ElencoAnomalieAccertamentiReiscritti.ImdbInit(IMDB);
    PeriodiRiaccertamento.ImdbInit(IMDB);
    ProposteVariazioniImpegniSubimpegni.ImdbInit(IMDB);
    AggiornaValoriComuni.ImdbInit(IMDB);
    ElencoProposteModificate.ImdbInit(IMDB);
    AggiornaImportoRagDaSubimpegni.ImdbInit(IMDB);
    GenerazioneVariazioniProposteVar.ImdbInit(IMDB);
    EliminazioneVariazioni.ImdbInit(IMDB);
    ProposteDaSubimpegni.ImdbInit(IMDB);
    StampaAllegatoProposta.ImdbInit(IMDB);
    ChiusuraOrdini.ImdbInit(IMDB);
    ChiusuraMassivaOrdini.ImdbInit(IMDB);
    SituazioneProposteVariazioniRiacc.ImdbInit(IMDB);
    EstrazioneProposte.ImdbInit(IMDB);
    ParametriDifferenzeImpegniSubimpegni.ImdbInit(IMDB);
    DifferenzeImpegniSubimpegni.ImdbInit(IMDB);
    SceltaLiquidazioni.ImdbInit(IMDB);
    Liquidazione.ImdbInit(IMDB);
    AggiornamentoValoriComuniLiq.ImdbInit(IMDB);
    InfoLiquidazione.ImdbInit(IMDB);
    EliminaLiquidazioniInDistinta.ImdbInit(IMDB);
    DettagliGruppoLiquidazioni.ImdbInit(IMDB);
    EmissioneLiquidazioniLiq.ImdbInit(IMDB);
    ControlloDisponibilitaLiq.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaGRL.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaDALAL.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaCG4.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaImputazioni.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaLiqInEmissione.ImdbInit(IMDB);
    CapitoliConDisponibilitaNegativaDistOrdini.ImdbInit(IMDB);
    ControlloImputazioni.ImdbInit(IMDB);
    ControlloDispoPuro.ImdbInit(IMDB);
    AggiornamentoAutomaticoImpegni.ImdbInit(IMDB);
    EstrazioneImputazioniLiq.ImdbInit(IMDB);
    LiquidazioneVersamentoRitenute.ImdbInit(IMDB);
    FormRettificaImpegno.ImdbInit(IMDB);
    RettificaSubimpegno.ImdbInit(IMDB);
    GiornaleLiquidazioni.ImdbInit(IMDB);
    LiquidazioniPerPropostaDelibera.ImdbInit(IMDB);
    LiquidazioniDaDistintaEconomato.ImdbInit(IMDB);
    ControlloDisponibilitaFuli.ImdbInit(IMDB);
    DistinteDiLiquidazione.ImdbInit(IMDB);
    EmissioneLiquidazioniDistEco.ImdbInit(IMDB);
    ControlloContabileDistinta.ImdbInit(IMDB);
    EmissioneLiquidazioni.ImdbInit(IMDB);
    AggiornamentoValoriComuni.ImdbInit(IMDB);
    LiquidazioneParzialeDistinta.ImdbInit(IMDB);
    LiquidazioneDistintaCassaEconomale.ImdbInit(IMDB);
    SceltaDistinteDiRimborsoCassaEconomale.ImdbInit(IMDB);
    EmissioneLiquidazioniCassaEco.ImdbInit(IMDB);
    Fase1EstremiLiquidazione.ImdbInit(IMDB);
    Fase2AltriDatiLiquidazione.ImdbInit(IMDB);
    Fase3FattureDaLiquidare.ImdbInit(IMDB);
    ControlloSoggettiLiq.ImdbInit(IMDB);
    CaricamentoSoggettiLiq.ImdbInit(IMDB);
    EmissioneLiqIVAPerReverseCharge.ImdbInit(IMDB);
    EmissioneLiquidazioniRC.ImdbInit(IMDB);
    StampaDistinte.ImdbInit(IMDB);
    LiquidazioniOrdinativiAGruppi.ImdbInit(IMDB);
    DisponibilitaPuroOrd.ImdbInit(IMDB);
    DuplicaGruppo.ImdbInit(IMDB);
    AggiornamentoValoriComuniOrdLiq.ImdbInit(IMDB);
    MovimentiAGruppi.ImdbInit(IMDB);
    DettagliGruppoMovimenti.ImdbInit(IMDB);
    EmissioneMovimenti.ImdbInit(IMDB);
    AggiornamentoValoriComuniMov.ImdbInit(IMDB);
    ImportDaFileSuGruppo.ImdbInit(IMDB);
    Mandati.ImdbInit(IMDB);
    PagamentiMandati.ImdbInit(IMDB);
    PagamentiMandatiPerFlusso.ImdbInit(IMDB);
    NuoviPagamenti.ImdbInit(IMDB);
    InformazioneMandato.ImdbInit(IMDB);
    InfoPagamentiMandati.ImdbInit(IMDB);
    EmissioneAutomaticaMandati.ImdbInit(IMDB);
    ControlloAnticipazioni.ImdbInit(IMDB);
    ControlloCodiciGestionali.ImdbInit(IMDB);
    ControlloEquitalia.ImdbInit(IMDB);
    ControlloCodiciTransazioneElementare.ImdbInit(IMDB);
    ControlloQuietanzeScadute.ImdbInit(IMDB);
    EmissioneManualeDistinta.ImdbInit(IMDB);
    ElencoMandatiInDistinta.ImdbInit(IMDB);
    LiquidazioniDaEmettereInMandato.ImdbInit(IMDB);
    AvvisiDiPagamento.ImdbInit(IMDB);
    ConfermaAvvisiDiPagamento.ImdbInit(IMDB);
    ConfermaAvvisiDiPagamentoAncona.ImdbInit(IMDB);
    AnnullaPagamenti.ImdbInit(IMDB);
    PagamentoCompleto.ImdbInit(IMDB);
    RettificaImpegnoDiMandato.ImdbInit(IMDB);
    RettificaSubImpegnoDiMandato.ImdbInit(IMDB);
    RiemissioneNonPagati.ImdbInit(IMDB);
    DistinteDiTrasmissioneMandati.ImdbInit(IMDB);
    GiornaleMandati.ImdbInit(IMDB);
    GiornalePagamenti.ImdbInit(IMDB);
    MandatiEmessiSuCapRilIva.ImdbInit(IMDB);
    Incarichi.ImdbInit(IMDB);
    MandatiNonPagati.ImdbInit(IMDB);
    StampaMandati.ImdbInit(IMDB);
    VariazioniAiMandati.ImdbInit(IMDB);
    TrasmissioneMandatiATesoreria.ImdbInit(IMDB);
    EmissioneManualeMandato.ImdbInit(IMDB);
    RitenuteFiscali.ImdbInit(IMDB);
    RitenutePerAddizionale.ImdbInit(IMDB);
    DistintaRitenuteFiscali.ImdbInit(IMDB);
    DistintaRitenutePerAddizionale.ImdbInit(IMDB);
    CertificatiSostitutiDiImposta.ImdbInit(IMDB);
    ControlloQuadri.ImdbInit(IMDB);
    ContribuentiMinimi.ImdbInit(IMDB);
    ErroriBloccantiControllo770.ImdbInit(IMDB);
    Estrazione770.ImdbInit(IMDB);
    EstrazioneCU.ImdbInit(IMDB);
    RitenuteIrap.ImdbInit(IMDB);
    RitenutePrevidenziali.ImdbInit(IMDB);
    RitenuteInail.ImdbInit(IMDB);
    ConfermaInvioSostitutiImposta.ImdbInit(IMDB);
    MandatiPerVersIVAIstituzionale.ImdbInit(IMDB);
    ElencoEmissMandatiCassaEconomale.ImdbInit(IMDB);
    EmissMandatiCassaEconomale.ImdbInit(IMDB);
    ElencoLiquidazioniConImportoIvaIstDaValorizzare.ImdbInit(IMDB);
    AggiornamentoProvvisoriMandati.ImdbInit(IMDB);
    ControlloDisponibilitaProvMan.ImdbInit(IMDB);
    EmissioneMandatiDaProvvisori.ImdbInit(IMDB);
    AggiornamentoAutomaticoMandatiProvv.ImdbInit(IMDB);
    SceltaMandatiProvvisori.ImdbInit(IMDB);
    OrdinativiCollegati.ImdbInit(IMDB);
    FormOrdinativi.ImdbInit(IMDB);
    Ordinativo.ImdbInit(IMDB);
    Incassi.ImdbInit(IMDB);
    IncassiPerFlusso.ImdbInit(IMDB);
    NuoviIncassi.ImdbInit(IMDB);
    NuovoOrdinativoConAccAutomatico.ImdbInit(IMDB);
    DettagliGruppoOrdinativo.ImdbInit(IMDB);
    EmissioneOrdinativiOrd.ImdbInit(IMDB);
    ControlloDisponibilitaOrd.ImdbInit(IMDB);
    AggiornamentoProvvisoriOrdinativi.ImdbInit(IMDB);
    EmissioneOrdinativiDaProvvisori.ImdbInit(IMDB);
    ControlloDisponibilitaProvOrd.ImdbInit(IMDB);
    AggiornamentoAutomatico.ImdbInit(IMDB);
    ProvvisoriDaRegolarizzare.ImdbInit(IMDB);
    AggiornamentoAutomaticoAccertamenti.ImdbInit(IMDB);
    StampaOrdinativi.ImdbInit(IMDB);
    AvvisiDiRiscossione.ImdbInit(IMDB);
    DistintaDiTrasmissioneOrdinativi.ImdbInit(IMDB);
    ControlloCodiciGestionali1.ImdbInit(IMDB);
    ControlloCodiciTransElementare.ImdbInit(IMDB);
    IncassoCompleto.ImdbInit(IMDB);
    AnnullaIncassi.ImdbInit(IMDB);
    RiemissioneOrdinativiNonIncassati.ImdbInit(IMDB);
    RettificaAccertamento.ImdbInit(IMDB);
    OrdinativiDaRitenute.ImdbInit(IMDB);
    OrdinativiPerSplitPayment.ImdbInit(IMDB);
    VerificaOrdinativi.ImdbInit(IMDB);
    OrdinativiDaCorrispettivi.ImdbInit(IMDB);
    OrdinativiDaImputazioni.ImdbInit(IMDB);
    EmissioneOrdinativi.ImdbInit(IMDB);
    OrdinativiDaDistintaCassaEconomale.ImdbInit(IMDB);
    SceltaDistinteVersamentoCassaEconomale.ImdbInit(IMDB);
    EmissioneOrdinativiDaDistinta.ImdbInit(IMDB);
    GiornaleOrdinativi.ImdbInit(IMDB);
    GiornaleIncassi.ImdbInit(IMDB);
    OrdinativiNonIncassati.ImdbInit(IMDB);
    SollecitiDiRiscossione.ImdbInit(IMDB);
    VariazioniOrdinativi.ImdbInit(IMDB);
    TrasmissioneOrdinativiATesoreria.ImdbInit(IMDB);
    EstrazioneImputazioniOrd.ImdbInit(IMDB);
    EstrattoCCP.ImdbInit(IMDB);
    MandatiCollegatiPerCompensazione.ImdbInit(IMDB);
    FlussiMandatiReversali.ImdbInit(IMDB);
    GiornaleDiCassa.ImdbInit(IMDB);
    AnnulliMandati.ImdbInit(IMDB);
    VariazioniMandati.ImdbInit(IMDB);
    SostituzioniMandati.ImdbInit(IMDB);
    CambiDiStatoNonInviati.ImdbInit(IMDB);
    Cerca.ImdbInit(IMDB);
    AnnulliOrd.ImdbInit(IMDB);
    VariazioniOrd.ImdbInit(IMDB);
    SostituzioniOrd.ImdbInit(IMDB);
    CambiDiStatoNonInviati1.ImdbInit(IMDB);
    Cerca1.ImdbInit(IMDB);
    InvioMandatoEOrdinativoInformatico.ImdbInit(IMDB);
    AnomalieInvio.ImdbInit(IMDB);
    Eliminazione.ImdbInit(IMDB);
    SceltaTipoEliminazione.ImdbInit(IMDB);
    RicezionePagamentiIncassiDaTesoreria.ImdbInit(IMDB);
    ReportErrori.ImdbInit(IMDB);
    ElencoErroriAuto.ImdbInit(IMDB);
    CaricamentoProvvisori.ImdbInit(IMDB);
    CaricamentoImputazioni.ImdbInit(IMDB);
    BilancioDiEntrata.ImdbInit(IMDB);
    BilancioDiSpesa.ImdbInit(IMDB);
    ProgettiEntrata.ImdbInit(IMDB);
    ProgettiSpesa.ImdbInit(IMDB);
    VariazioniEntrata.ImdbInit(IMDB);
    VariazioniSpesa.ImdbInit(IMDB);
    BilancioSorboloMezzaniUnione.ImdbInit(IMDB);
    ImpegniAccertamenti.ImdbInit(IMDB);
    MandatiOrdinativi.ImdbInit(IMDB);
    AccertamentiPerClassificazioni.ImdbInit(IMDB);
    AccertamentiPerDebitore.ImdbInit(IMDB);
    AccertamentiPerImputazioneEconomica.ImdbInit(IMDB);
    AccertamentiPerCapitolo.ImdbInit(IMDB);
    ImpegniPerClassificazioni.ImdbInit(IMDB);
    ImpegniPerBeneficiario.ImdbInit(IMDB);
    ImpegniPerImputazioneEconomica.ImdbInit(IMDB);
    ImpegniPerCapitolo.ImdbInit(IMDB);
    SubimpegniPerClassificazioni.ImdbInit(IMDB);
    SubimpegniPerBeneficiario.ImdbInit(IMDB);
    SubimpegniPerImputazioneEconomica.ImdbInit(IMDB);
    SubimpegniPerCapitolo.ImdbInit(IMDB);
    LiquidazioniPerClassificazioni.ImdbInit(IMDB);
    LiquidazioniPerBeneficiario.ImdbInit(IMDB);
    LiquidazionePerContabileDiTesoreria.ImdbInit(IMDB);
    LiquidazioniPerImpegno.ImdbInit(IMDB);
    LiquidazioniPerSubimpegno.ImdbInit(IMDB);
    LiquidazioniPerImputazioneEconomica.ImdbInit(IMDB);
    OrdinativiPerClassificazioni.ImdbInit(IMDB);
    OrdinativiPerDebitore.ImdbInit(IMDB);
    OrdinativiPerContabileDiTesoreria.ImdbInit(IMDB);
    OrdinativiPerAccertamento.ImdbInit(IMDB);
    OrdinativiPerImputazioneEconomica.ImdbInit(IMDB);
    SituazioneCassa.ImdbInit(IMDB);
    SituazioneCassaPerVincolo.ImdbInit(IMDB);
    SaldiVincoli.ImdbInit(IMDB);
    ProspettoTrimestraleDiCassa.ImdbInit(IMDB);
    GiornaleVincoli.ImdbInit(IMDB);
    SintesiDiCassa.ImdbInit(IMDB);
    SituazioneCompetenza.ImdbInit(IMDB);
    MastroMandati.ImdbInit(IMDB);
    MastroOrdinativi.ImdbInit(IMDB);
    MastroImpegni.ImdbInit(IMDB);
    MastroAccertamenti.ImdbInit(IMDB);
    MastroGenerale.ImdbInit(IMDB);
    VociPatto.ImdbInit(IMDB);
    MonitoraggioDati.ImdbInit(IMDB);
    ReportMonitoraggioDati.ImdbInit(IMDB);
    MonitoraggioPreventivo.ImdbInit(IMDB);
    ReportMonitoraggioPreventivo.ImdbInit(IMDB);
    ComunicazioneVariazioniDiBilancio.ImdbInit(IMDB);
    ComunicazioneVariazioniDelFPV.ImdbInit(IMDB);
    ComunicazioneEsercizioOGestioneProvv.ImdbInit(IMDB);
    StanziamentiConResidui.ImdbInit(IMDB);
    ComunicazioneAlTesoriereResidui.ImdbInit(IMDB);
    EsploratorePerCapitolo.ImdbInit(IMDB);
    EsploratorePerBilancio.ImdbInit(IMDB);
    EsploratorePerPianoDeiContiIntegrato.ImdbInit(IMDB);
    EsploratorePerVLivello.ImdbInit(IMDB);
    EsploratorePerResponsabile.ImdbInit(IMDB);
    EsploratorePerResponsabileAdUnaData.ImdbInit(IMDB);
    EsploratorePerCentroDiCosto.ImdbInit(IMDB);
    EsploratorePerBenDeb.ImdbInit(IMDB);
    EsploratorePerDelibera.ImdbInit(IMDB);
    EsploratorePerMacroaggregati.ImdbInit(IMDB);
    EsploratorePerUnitaGestioneCapitolo.ImdbInit(IMDB);
    EsploratorePerUnitaGestioneMacroaggregati.ImdbInit(IMDB);
    EsploratorePerResponsabileMacroaggregati.ImdbInit(IMDB);
    EsploratorePerFinanziamentoOpera.ImdbInit(IMDB);
    EsploratorePerCapitoloFinOpe.ImdbInit(IMDB);
    EsploratorePerFinopeOpefin.ImdbInit(IMDB);
    StanziamentoBilancioEffettivo.ImdbInit(IMDB);
    StanziamentoBilancioSimulato.ImdbInit(IMDB);
    FinanziamentoAvanzoDiAmministrazioneEffettivo.ImdbInit(IMDB);
    FinanziamentoAltreVociPegEffettivo.ImdbInit(IMDB);
    FinanziamentoAvanzoDiAmministrazioneSimulato.ImdbInit(IMDB);
    FinanziamentoAltreVociPegSimulato.ImdbInit(IMDB);
    VariazioniBilancio.ImdbInit(IMDB);
    ElencoAccertamenti.ImdbInit(IMDB);
    ElencoAccertamentiFin.ImdbInit(IMDB);
    ElencoAccertamentiFinOpe.ImdbInit(IMDB);
    ElencoImpegni.ImdbInit(IMDB);
    ElencoImpegniOpe.ImdbInit(IMDB);
    ElencoImpegniFinOpe.ImdbInit(IMDB);
    SituazioneResiduiEntrata.ImdbInit(IMDB);
    SituazioneResiduiSpesa.ImdbInit(IMDB);
    ChiusuraAutomaticaPrenotazioni.ImdbInit(IMDB);
    ElencoLiquidazioniEsploratore.ImdbInit(IMDB);
    ParametriPrevisioniPEG.ImdbInit(IMDB);
    VisualizzazionePrevisioniPEG.ImdbInit(IMDB);
    ParametriSituazionePEG.ImdbInit(IMDB);
    VisualizzazioneSituazionePEG.ImdbInit(IMDB);
    ParametriSituazioneImpegni.ImdbInit(IMDB);
    VisualizzazioneSituazioneImpegni.ImdbInit(IMDB);
    ParametriSituazioneSubImpegni.ImdbInit(IMDB);
    VisualizzazioneSituazioneSubImpegni.ImdbInit(IMDB);
    ParametriSituazioneAccertamenti.ImdbInit(IMDB);
    VisualizzazioneSituazioneAccertamenti.ImdbInit(IMDB);
    SchedaInformativaBil.ImdbInit(IMDB);
    SchedaInformativaMov.ImdbInit(IMDB);
    SchedaInformativaLiq.ImdbInit(IMDB);
    SchedaComposizioneFPV.ImdbInit(IMDB);
    SchedaComposizioneFPVEntrata.ImdbInit(IMDB);
    InfoVariazioneCrono.ImdbInit(IMDB);
    FinanziamentiCronoprogramma.ImdbInit(IMDB);
    InfoDispProvv.ImdbInit(IMDB);
    SchedaInformazioniVariazioni.ImdbInit(IMDB);
    DettaglioDelPuro.ImdbInit(IMDB);
    ProposteDaUffici.ImdbInit(IMDB);
    TotaliProposta.ImdbInit(IMDB);
    ControlloDisponibilita.ImdbInit(IMDB);
    ControlloQuadratura1.ImdbInit(IMDB);
    AggiornamentoVariazioniBilancio.ImdbInit(IMDB);
    GenerazioneVariazioni.ImdbInit(IMDB);
    EliminazioneVariazioniGenerate.ImdbInit(IMDB);
    DatiBeneficiario.ImdbInit(IMDB);
    ContoConsuntivo.ImdbInit(IMDB);
    ElencoAnomalieCodiciDL77.ImdbInit(IMDB);
    QuadroRiassuntivoDellaGestione.ImdbInit(IMDB);
    AvanzoDiAmministrazione.ImdbInit(IMDB);
    PEGConsuntivo.ImdbInit(IMDB);
    EstrazioneDatiPerCorteDeiConti.ImdbInit(IMDB);
    StampeDirigenziali.ImdbInit(IMDB);
    MenuStampe.ImdbInit(IMDB);
    RiclassificazioniCapitoli.ImdbInit(IMDB);
    Movimentazione.ImdbInit(IMDB);
    BonificaLivello5CodEuropeo.ImdbInit(IMDB);
    AggiornamentoLivello5.ImdbInit(IMDB);
    AggiornamentoCodEuropeo.ImdbInit(IMDB);
    CapitoliConClasifDiverse.ImdbInit(IMDB);
    CapitoliConAnomalie.ImdbInit(IMDB);
    InformazioniGeneraliApplicazioni.ImdbInit(IMDB);
    VerificaBaseDati.ImdbInit(IMDB);
    Personalizzazioni.ImdbInit(IMDB);
    Registro.ImdbInit(IMDB);
    ApplicativiIntegrati.ImdbInit(IMDB);
    ValidazioneFile.ImdbInit(IMDB);
    ConsolleErrori.ImdbInit(IMDB);
    StampaConParametri.ImdbInit(IMDB);
    AlberoEstrazioni.ImdbInit(IMDB);
    VisualizzaModificaEstrazione.ImdbInit(IMDB);
    EsportazioneDati.ImdbInit(IMDB);
    AnteprimaDati.ImdbInit(IMDB);
    ElencoDocumenti.ImdbInit(IMDB);
    VisualizzatoreEstrazioni.ImdbInit(IMDB);
    Categorie.ImdbInit(IMDB);
    ImportaEstrazioni.ImdbInit(IMDB);
    VisualizzaSelect.ImdbInit(IMDB);
    VisualizzaDescrizioneImport.ImdbInit(IMDB);
    Statistiche.ImdbInit(IMDB);
    VisualizzaSelectLog.ImdbInit(IMDB);
    VisualizzaInfoQuery.ImdbInit(IMDB);
    SelettoreBeneficiario.ImdbInit(IMDB);
    StampePrevisionePerCapitolo.ImdbInit(IMDB);
    Afc.ImdbInit(IMDB);
    //
    IMDB.set_TblNumField(IMDBDef1.TMP_RECORDSET, 144);
    IMDB.set_Version(1785530256);
    //
    // Set all tables in a modified state
    //
    IMDB.ResetAllModified(-1);
  }
  
  // ********************************************************
  // Appende tutte le mie tabelle nell'IMDB di ownobj
  // ********************************************************
  public void AppendTo(Object Dst)
  {
    IMDBObj dstIMDB = null;
    if (Dst instanceof com.progamma.is.ImdbInit)
      dstIMDB = ((com.progamma.is.ImdbInit)Dst).IMDB;
    if (Dst instanceof com.progamma.svc.ImdbInit)
      dstIMDB = ((com.progamma.svc.ImdbInit)Dst).IMDB;
    if (Dst instanceof com.progamma.ws.ImdbInit)
      dstIMDB = ((com.progamma.ws.ImdbInit)Dst).IMDB;
    //
    // Se vengono caricati componenti dinamicamente devo tenere conto del fatto che c'è una "zona" dell'array
    // che è riservata a componenti che ho già caricato ma che non sono presenti nell'array di questa sessione. 
    // Es: sessione 1 carica Comp1, sessione 2 carica Comp2 in questo caso la sessione 2 non ha mai caricato 
    // Comp1 ma se dovesse farlo deve esserci spazio per le sue tabelle IMDB nello stesso posto in cui erano prima!)
    // Pertanto se lo stato di riempimento è inferiore o uguale alla lunghezza dell'array, appendo in fondo
    //
    int ownSize = Math.max(dstIMDB.DBSize(), com.progamma.IMDBObj.FilledTo);
    //
    // Per cominciare appendo tutte le tabelle contenute in iobj dentro alle mie tabelle
    dstIMDB.AppendTables(IMDB, MyImdbInit.IMDB_OFFSET);
    //
    // Se non l'ho ancora fatto shifto tutte le costanti contenute in IMDBDefXX
    if (MyImdbInit.IMDB_OFFSET == 0)
    {
      MyImdbInit.IMDB_OFFSET = ownSize;
      ShiftStaticConst(MainFrm);
    }
    //
    // Ora uso quello
    IMDB = dstIMDB;
  }
  
  public static void ShiftStaticConst(WebEntryPoint MainFrm)
  {
    if (MyImdbInit.IMDB_OFFSET != 0)
    {
      String tn = (Glb.ClassWithPackage(MainFrm.getClass()) ? MainFrm.getClass().getPackage().getName() + "." : "");
      for (int i=1; i<1000; i++)
      {
        try
        {
          Field[] props = Class.forName(tn + "IMDBDef" + i).getFields();
          for (int j = 0; j < props.length; j++)
          {
            Field p = props[j];
            if (p.getName().startsWith("PQRY_") || p.getName().startsWith("QRY_") || p.getName().startsWith("TBL_") || p.getName().equals("TMP_RECORDSET"))
              p.setInt(null, p.getInt(null) + MyImdbInit.IMDB_OFFSET);
          }
        }
        catch (ClassNotFoundException e)
        {
          break;
        }
        catch (Exception e)
        {
          e.printStackTrace(System.err);
        }
      }
    }
  }
    
  // **************************************
  // Caricamento sessione da file (Serializable)
  // **************************************
  private void readObject(ObjectInputStream in) throws Exception
  {
    // Chiamo il serializzatore di "default"
    in.defaultReadObject();
    //
    // Leggo proprietà statiche
    // Se l'offset era già impostato devo prima de-offsettare tutte le define statiche prima di poter caricare il nuovo contesto statico
    if (MyImdbInit.IMDB_OFFSET != 0)
    {
      MyImdbInit.IMDB_OFFSET = -MyImdbInit.IMDB_OFFSET;
      ShiftStaticConst(MainFrm);
    }
    //
    MyImdbInit.IMDB_OFFSET = in.readInt();
    IMDBObj.FilledTo = in.readInt();
    ShiftStaticConst(MainFrm);
  }
  private void writeObject(ObjectOutputStream out) throws Exception
  {
    // Chiamo il serializzatore di "default"
    out.defaultWriteObject();
    //
    // Scrivo proprietà statiche
    out.writeInt(MyImdbInit.IMDB_OFFSET);
    out.writeInt(IMDBObj.FilledTo);
  }

  // IMDB DDL Procedures
  private void Init_TBL_VARIBILI2()
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_VARIBILI2, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_VARIBILI2, "TBL_VARIBILI2");
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEES,12,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMELI, "ROWNAMELI");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMELI,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMSOLIMP, "ROWNAMSOLIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMSOLIMP,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI2,IMDBDef2.FLD_VARIBILI2_ROWNAMECATEG,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_VARIBILI2, 0);
  }

  private void Init_TBL_DETTAGLBUONI()
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_DETTAGLBUONI, 34);
    IMDB.set_TblCode(IMDBDef2.TBL_DETTAGLBUONI, "TBL_DETTAGLBUONI");
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DESCRIZIONE,5,2000,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_FATTURATO, "FATTURATO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_FATTURATO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_NOTE,5,500,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CHIUSO, "CHIUSO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_IMPORTO_ORIGINALE, "IMPORTO_ORIGINALE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_IMPORTO_ORIGINALE,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DESTINAZIONE, "DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DESTINAZIONE,5,500,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_OFFERTA, "OFFERTA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_OFFERTA,5,500,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_TIPO_SCADENZA, "TIPO_SCADENZA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_TIPO_SCADENZA,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_RILEVANTE_ECO, "RILEVANTE_ECO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_RILEVANTE_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CATEGORIA_PRODOTTO, "CATEGORIA_PRODOTTO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_CATEGORIA_PRODOTTO,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_QUANTITA, "QUANTITA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_QUANTITA,3,10,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UNITA_MISURA, "UNITA_MISURA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UNITA_MISURA,5,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_PREZZO, "PREZZO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_PREZZO,3,12,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_QUANTITA_ARRIVATA, "QUANTITA_ARRIVATA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_QUANTITA_ARRIVATA,3,10,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_GRUPPO, "GRUPPO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBUONI,IMDBDef2.FLD_DETTAGLBUONI_GRUPPO,5,10,0);
  }

  private void Init_TBL_ERRORETMASUO()
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_ERRORETMASUO, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_ERRORETMASUO, "TBL_ERRORETMASUO");
    IMDB.set_FldCode(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO, "ERROREOKKO");
    IMDB.SetFldParams(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_DESCRIERRORE, "DESCRIERRORE");
    IMDB.SetFldParams(IMDBDef2.TBL_ERRORETMASUO,IMDBDef2.FLD_ERRORETMASUO_DESCRIERRORE,9,512,0);
  }

  private void Init_TBL_FATTBUONIMDB()
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FATTBUONIMDB, 24);
    IMDB.set_TblCode(IMDBDef2.TBL_FATTBUONIMDB, "TBL_FATTBUONIMDB");
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_NUMERO_BUONO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO, "IMPUTATO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_DATA_REGISTRAZIONE,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_IMP, "PROGRESSIVO_IMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDSTA, "FATBUOIMDSTA");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDSTA,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDLIQ, "FATBUOIMDLIQ");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDLIQ,3,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDCHI, "FATBUOIMDCHI");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDCHI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDDES, "FATBUOIMDDES");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDDES,5,100,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMQUAR, "FATBUOIMQUAR");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMQUAR,3,10,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDIMP, "FATBUOIMDIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMPRBO, "FATBUOIMPRBO");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMPRBO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDFAT, "FATBUOIMDFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDFAT,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDCEN, "FATBUOIMDCEN");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDCEN,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCODA, "FATBUOIMCODA");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCODA,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCOAL, "FATBUOIMCOAL");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTBUONIMDB,IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMCOAL,6,15,0);
  }

  private void Init_TBL_PARAMESTAM31()
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMESTAM31, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMESTAM31, "TBL_PARAMESTAM31");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM31,IMDBDef2.FLD_PARAMESTAM31_PARSTAANNDIS, "PARSTAANNDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM31,IMDBDef2.FLD_PARAMESTAM31_PARSTAANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM31,IMDBDef2.FLD_PARAMESTAM31_PARSTANUMDIS, "PARSTANUMDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM31,IMDBDef2.FLD_PARAMESTAM31_PARSTANUMDIS,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMESTAM31, 0);
  }

  private void Init_TBL_ANOMALIASSOC()
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_ANOMALIASSOC, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_ANOMALIASSOC, "TBL_ANOMALIASSOC");
    IMDB.set_FldCode(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT,5,40,0);
    IMDB.set_FldCode(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef3.TBL_ANOMALIASSOC,IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM,9,500,0);
  }

  private void Init_TBL_FILTREFFETVG()
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FILTREFFETVG, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_FILTREFFETVG, "TBL_FILTREFFETVG");
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTREFFETVG,IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FILTREFFETVG, 0);
  }

  private void Init_TBL_FILTRSIMULVG()
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FILTRSIMULVG, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_FILTRSIMULVG, "TBL_FILTRSIMULVG");
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRSIMULVG,IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FILTRSIMULVG, 0);
  }

  private void Init_TBL_PARAVARIIMPE()
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAVARIIMPE, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAVARIIMPE, "TBL_PARAVARIIMPE");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, "PARAINFODELI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAVARIIMPE,IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAVARIIMPE, 0);
  }

  private void Init_TBL_PARAMETRI79()
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI79, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI79, "TBL_PARAMETRI79");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI79,IMDBDef4.FLD_PARAMETRI79_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI79, 0);
  }

  private void Init_TBL_PAREMETRITMP()
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAREMETRITMP, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PAREMETRITMP, "TBL_PAREMETRITMP");
    IMDB.set_FldCode(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMNUMDEL,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMANNDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMSEDDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMUNIPRO,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PAREMETRITMP,IMDBDef4.FLD_PAREMETRITMP_ROWNAMANNACC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAREMETRITMP, 0);
  }

  private void Init_TBL_PARALIQUMULT()
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARALIQUMULT, 47);
    IMDB.set_TblCode(IMDBDef5.TBL_PARALIQUMULT, "TBL_PARALIQUMULT");
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR, "PARAMCATEGOR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE, "PARAMCODINTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO, "PARAMRILECO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, "PARAMFATTORE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAMFINANZI,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DIVERSO_BEN, "DIVERSO_BEN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DIVERSO_BEN,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN, "NUM_QUIETANZA_DIV_BEN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAPRODAESP, "PARAPRODAESP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_PARAPRODAESP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef5.TBL_PARALIQUMULT,IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5,3,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARALIQUMULT, 0);
  }

  private void Init_TBL_VALCOMORDLIQ()
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VALCOMORDLIQ, 45);
    IMDB.set_TblCode(IMDBDef5.TBL_VALCOMORDLIQ, "TBL_VALCOMORDLIQ");
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, "VALCOMORDLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ,5,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKMAIN, "VALCOMCKMAIN");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKMAIN,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SCADENZA,8,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, "CAPITOLO_OLD");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, "ARTICOLO_OLD");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKIMAC, "VALCOMCKIMAC");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKIMAC,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANIMAC, "VALCOMANIMAC");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANIMAC,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL, "VACOANIMACOL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUIMAC, "VALCOMNUIMAC");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL, "VACONUIMACOL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKSUB, "VALOCOMCKSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKSUB,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANNSUB, "VALCOMANNSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUMSUB, "VALCOMNUMSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SE_SUBIMPEGNO, "SE_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_SE_SUBIMPEGNO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCOMORDLIQ,IMDBDef5.FLD_VALCOMORDLIQ_NUM_QUIETANZA,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_VALCOMORDLIQ, 0);
  }

  private void Init_TBL_VALORCOMUMOV()
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VALORCOMUMOV, 29);
    IMDB.set_TblCode(IMDBDef5.TBL_VALORCOMUMOV, "TBL_VALORCOMUMOV");
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, "VALCOMTIPMOV");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMIMPECO, "VALCOMIMPECO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALCOMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO_OLD, "CAPITOLO_OLD");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO_OLD,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO_OLD, "ARTICOLO_OLD");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO_OLD,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALORCOMUMOV,IMDBDef5.FLD_VALORCOMUMOV_NUM_QUIETANZA,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_VALORCOMUMOV, 0);
  }

  private void Init_TBL_FILTRI6()
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_FILTRI6, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_FILTRI6, "TBL_FILTRI6");
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMNUMLIQ, "ROWNAMNUMLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMNUMLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMANNLIQ, "ROWNAMANNLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMANNLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, "ROWNAMAPDAES");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_RONANOININFL, "RONANOININFL");
    IMDB.SetFldParams(IMDBDef5.TBL_FILTRI6,IMDBDef5.FLD_FILTRI6_RONANOININFL,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_FILTRI6, 0);
  }

  private void Init_TBL_PARANUOVPAGA()
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARANUOVPAGA, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARANUOVPAGA, "TBL_PARANUOVPAGA");
    IMDB.set_FldCode(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARANUOVPAGA,IMDBDef5.FLD_PARANUOVPAGA_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef5.TBL_PARANUOVPAGA, 0);
  }

  private void Init_TBL_PARATIPOELI1()
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARATIPOELI1, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_PARATIPOELI1, "TBL_PARATIPOELI1");
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PARATIPOELI1,IMDBDef6.FLD_PARATIPOELI1_ROWNAMDATDIS,6,12,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARATIPOELI1, 0);
  }

  private void Init_TBL_PARASTAMSI4P()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARASTAMSI4P, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARASTAMSI4P, "TBL_PARASTAMSI4P");
    IMDB.set_FldCode(IMDBDef7.TBL_PARASTAMSI4P,IMDBDef7.FLD_PARASTAMSI4P_PARAMETRO, "PARAMETRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARASTAMSI4P,IMDBDef7.FLD_PARASTAMSI4P_PARAMETRO,5,255,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARASTAMSI4P,IMDBDef7.FLD_PARASTAMSI4P_PARAMEPROGRE, "PARAMEPROGRE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARASTAMSI4P,IMDBDef7.FLD_PARASTAMSI4P_PARAMEPROGRE,1,6,0);
  }

  private void Init_TBL_DATISTAMSI4P()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_DATISTAMSI4P, 7);
    IMDB.set_TblCode(IMDBDef7.TBL_DATISTAMSI4P, "TBL_DATISTAMSI4P");
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARPERDELSER, "PARPERDELSER");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARPERDELSER,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARANOMEESEG, "PARANOMEESEG");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARANOMEESEG,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARASERVNAME, "PARASERVNAME");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARASERVNAME,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARCODISTAD4, "PARCODISTAD4");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARCODISTAD4,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PASTDAEORAFP, "PASTDAEORAFP");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PASTDAEORAFP,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, "PARAPERCAPPL");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL,5,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARDATURLMAI, "PARDATURLMAI");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMSI4P,IMDBDef7.FLD_DATISTAMSI4P_PARDATURLMAI,9,2000,0);
    IMDB.TblAddNew(IMDBDef7.TBL_DATISTAMSI4P, 0);
  }

  private void Init_TBL_DATISESSIONE()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_DATISESSIONE, 15);
    IMDB.set_TblCode(IMDBDef7.TBL_DATISESSIONE, "TBL_DATISESSIONE");
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, "SESSUSERNAME");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, "SESSIONOMINA");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA,5,40,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, "SESSIOISTANZ");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ,5,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, "SESSIOESERCI");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONEENTE, "SESSIONEENTE");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONEENTE,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, "SESSIOMODULO");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, "SESSIONRUOLO");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, "SESSIPROGRU1");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIDESCRUO, "SESSIDESCRUO");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIDESCRUO,5,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSCFPEATTI, "SESSCFPEATTI");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSCFPEATTI,1,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSPERCIMMA, "SESSPERCIMMA");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSPERCIMMA,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOPROGET, "SESSIOPROGET");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOPROGET,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSVERSPROD, "SESSVERSPROD");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSVERSPROD,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, "SESSIOUFFICI");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIRPPATTI, "SESSIRPPATTI");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISESSIONE,IMDBDef7.FLD_DATISESSIONE_SESSIRPPATTI,1,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_DATISESSIONE, 0);
  }

  private void Init_TBL_VALONODOCORR()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_VALONODOCORR, 44);
    IMDB.set_TblCode(IMDBDef7.TBL_VALONODOCORR, "TBL_VALONODOCORR");
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, "NODOCORTIPUO");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, "NODCORTIPRAM");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM,5,20,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, "NODCORDESRAM");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM,9,300,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, "NODOCORRENES");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRENES,5,9,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCOBEDE, "NODCORCOBEDE");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCOBEDE,2,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, "NODCORSEDDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, "NODCORNUMDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, "NODCORANNDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRTITO, "NODOCORRTITO");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRTITO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCATINT, "NODCORCATINT");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCATINT,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODTER, "NODCORCODTER");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODTER,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORRISINT, "NODCORRISINT");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORRISINT,1,7,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, "NODOCORRCAPI");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, "NODOCORRARTI");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, "NODCORANIMAC");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, "NODCORNUIMAC");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, "NODCORANSUIM");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, "NODCORNUSUIM");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, "NODCORANMAOR");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, "NODCORNUMAOR");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO, "NODOCORRIMPO");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG, "NODCORINCPAG");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, "NODCORANNLIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, "NODCORNUMLIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, "NODOCORUOGES");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, "NODOCORUOUTI");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODPR1, "NODCORCODPR1");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODPR1,5,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODPRO, "NODCORCODPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODPRO,5,9,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI, "NODOCORRORDI");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI,9,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, "NODCORPROVAR");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR,1,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, "NODOCORRHASH");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH,5,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, "NODCORMISTIT");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, "NODCORCODSTR");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR,5,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, "NODCORCODLI1");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1,3,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, "NODCORCODLI2");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2,3,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, "NODCORCODLI3");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3,3,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, "NODCORCODLI4");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4,3,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, "NODCORCODLI5");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5,3,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, "NODOCORRRESP");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP,9,300,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, "NODCORCEDICO");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORPROSES, "NODCORPROSES");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODCORPROSES,3,12,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, "NODOCORRFINA");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, "NODOCORROPER");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORROPER,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, "NODOCORRESPL");
    IMDB.SetFldParams(IMDBDef7.TBL_VALONODOCORR,IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL,9,300,0);
    IMDB.TblAddNew(IMDBDef7.TBL_VALONODOCORR, 0);
  }

  private void Init_TBL_T64()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_T64, 14);
    IMDB.set_TblCode(IMDBDef7.TBL_T64, "TBL_T64");
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_INDIRIZZO,5,30,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_COMUNE,5,30,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_COD_FISCALE, "COD_FISCALE");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_COD_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_PARTITA_IVA,3,11,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATIENTEATTI, "DATIENTEATTI");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATIENTEATTI,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTTIPESA, "DATENTTIPESA");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTTIPESA,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATIENTEESAT, "DATIENTEESAT");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATIENTEESAT,5,37,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTSEDINP, "DATENTSEDINP");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTSEDINP,5,30,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_TIPO_MO, "TIPO_MO");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_TIPO_MO,5,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTCODBDA, "DATENTCODBDA");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTCODBDA,5,18,0);
    IMDB.set_FldCode(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTTIPPRO, "DATENTTIPPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_T64,IMDBDef7.FLD_T64_DATENTTIPPRO,5,50,0);
    IMDB.TblAddNew(IMDBDef7.TBL_T64, 0);
  }

  private void Init_TBL_LIQ_DISTINTA()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_LIQ_DISTINTA, 39);
    IMDB.set_TblCode(IMDBDef7.TBL_LIQ_DISTINTA, "TBL_LIQ_DISTINTA");
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT, "ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_PROG_FAT, "NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_VOCE_ECONOMICA, "VOCE_ECONOMICA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_VOCE_ECONOMICA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISTISTAT, "LIQDISTISTAT");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISTISTAT,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA, "LIQDISINDAFA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISIMPORI, "LIQDISIMPORI");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISIMPORI,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_1, "CAMPO_LIBERO_1");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_1,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_2, "CAMPO_LIBERO_2");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_2,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_SEDE_DEL,5,255,0);
  }

  private void Init_TBL_MENU()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_MENU, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_MENU, "TBL_MENU");
    IMDB.set_FldCode(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMANDCAPTIO, "COMANDCAPTIO");
    IMDB.SetFldParams(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMANDCAPTIO,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMACOMMCODE, "COMACOMMCODE");
    IMDB.SetFldParams(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMACOMMCODE,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMANDINDICE, "COMANDINDICE");
    IMDB.SetFldParams(IMDBDef7.TBL_MENU,IMDBDef7.FLD_MENU_COMANDINDICE,1,3,0);
  }

  private void Init_TBL_PARAMETIRIDE()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETIRIDE, 23);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETIRIDE, "TBL_PARAMETIRIDE");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_DOCUMENIRIDE, "DOCUMENIRIDE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_DOCUMENIRIDE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCODAMMWS, "IRIDCODAMMWS");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCODAMMWS,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDETRATTWS, "IRIDETRATTWS");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDETRATTWS,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCLAWSFAT, "IRIDCLAWSFAT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCLAWSFAT,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCLAWSLIQ, "IRIDCLAWSLIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDCLAWSLIQ,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTEWSFAT, "IRIDUTEWSFAT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTEWSFAT,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTEWSLIQ, "IRIDUTEWSLIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTEWSLIQ,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOWSFAT, "IRIDRUOWSFAT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOWSFAT,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDPUBWSLIQ, "IRIDPUBWSLIQ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDPUBWSLIQ,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEURLASP, "IRIDEURLASP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEURLASP,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEENTEASP, "IRIDEENTEASP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEENTEASP,9,2000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP121, "IRIDUTENP121");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP121,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP121, "IRIDEPWDP121");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP121,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP121, "IRIDRUOLP121");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP121,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP121, "IRIDAGGIP121");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP121,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP135, "IRIDUTENP135");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP135,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP135, "IRIDEPWDP135");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP135,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP135, "IRIDRUOLP135");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP135,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP135, "IRIDAGGIP135");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP135,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP140, "IRIDUTENP140");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDUTENP140,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP140, "IRIDEPWDP140");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDEPWDP140,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP140, "IRIDRUOLP140");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOLP140,9,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP140, "IRIDAGGIP140");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETIRIDE,IMDBDef7.FLD_PARAMETIRIDE_IRIDAGGIP140,5,1,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETIRIDE, 0);
  }

  private void Init_TBL_CHARTOBEFIXE()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_CHARTOBEFIXE, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_CHARTOBEFIXE, "TBL_CHARTOBEFIXE");
    IMDB.set_FldCode(IMDBDef7.TBL_CHARTOBEFIXE,IMDBDef7.FLD_CHARTOBEFIXE_BADCHATOBEFI, "BADCHATOBEFI");
    IMDB.SetFldParams(IMDBDef7.TBL_CHARTOBEFIXE,IMDBDef7.FLD_CHARTOBEFIXE_BADCHATOBEFI,1,1024,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CHARTOBEFIXE,IMDBDef7.FLD_CHARTOBEFIXE_GOOCHATOBEFI, "GOOCHATOBEFI");
    IMDB.SetFldParams(IMDBDef7.TBL_CHARTOBEFIXE,IMDBDef7.FLD_CHARTOBEFIXE_GOOCHATOBEFI,5,1,0);
  }

  private void Init_TBL_FIELTOBEFIXE()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_FIELTOBEFIXE, 1);
    IMDB.set_TblCode(IMDBDef7.TBL_FIELTOBEFIXE, "TBL_FIELTOBEFIXE");
    IMDB.set_FldCode(IMDBDef7.TBL_FIELTOBEFIXE,IMDBDef7.FLD_FIELTOBEFIXE_CODFIETOBEFI, "CODFIETOBEFI");
    IMDB.SetFldParams(IMDBDef7.TBL_FIELTOBEFIXE,IMDBDef7.FLD_FIELTOBEFIXE_CODFIETOBEFI,5,50,0);
  }

  private void Init_TBL_AGGIOSUATTIV()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_AGGIOSUATTIV, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_AGGIOSUATTIV, "TBL_AGGIOSUATTIV");
    IMDB.set_FldCode(IMDBDef7.TBL_AGGIOSUATTIV,IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOPANE, "AGGAGGIOPANE");
    IMDB.SetFldParams(IMDBDef7.TBL_AGGIOSUATTIV,IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOPANE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_AGGIOSUATTIV,IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOTOTA, "AGGAGGIOTOTA");
    IMDB.SetFldParams(IMDBDef7.TBL_AGGIOSUATTIV,IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOTOTA,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_AGGIOSUATTIV, 0);
  }

  private void Init_TBL_ANTEPRIMDATI()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_ANTEPRIMDATI, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_ANTEPRIMDATI, "TBL_ANTEPRIMDATI");
    IMDB.set_FldCode(IMDBDef7.TBL_ANTEPRIMDATI,IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGANTCSV, "NOMOGGANTCSV");
    IMDB.SetFldParams(IMDBDef7.TBL_ANTEPRIMDATI,IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGANTCSV,9,50000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_ANTEPRIMDATI,IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGAGGPAN, "NOMOGGAGGPAN");
    IMDB.SetFldParams(IMDBDef7.TBL_ANTEPRIMDATI,IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGAGGPAN,5,1,0);
    IMDB.TblAddNew(IMDBDef7.TBL_ANTEPRIMDATI, 0);
  }

  private void Init_TBL_CFESTAPPPASE()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_CFESTAPPPASE, 14);
    IMDB.set_TblCode(IMDBDef7.TBL_CFESTAPPPASE, "TBL_CFESTAPPPASE");
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID, "ID");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT,3,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_NOME, "NOME");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_NOME,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_SEQUENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT, "VALORE_DEFAULT");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_NOMOGGIMVADA, "NOMOGGIMVADA");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_NOMOGGIMVADA,6,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DATA_ULTIMO_AGG,8,19,0);
  }

  private void Init_TBL_PARASTAMJASP()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARASTAMJASP, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARASTAMJASP, "TBL_PARASTAMJASP");
    IMDB.set_FldCode(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_NOMEPARAMETR, "NOMEPARAMETR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_NOMEPARAMETR,5,255,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_VALOREPARAME, "VALOREPARAME");
    IMDB.SetFldParams(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_VALOREPARAME,5,255,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_PARAMEPROGRE, "PARAMEPROGRE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARASTAMJASP,IMDBDef7.FLD_PARASTAMJASP_PARAMEPROGRE,1,6,0);
  }

  private void Init_TBL_DATISTAMJASP()
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_DATISTAMJASP, 4);
    IMDB.set_TblCode(IMDBDef7.TBL_DATISTAMJASP, "TBL_DATISTAMJASP");
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMETROURL, "PARAMETROURL");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMETROURL,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMETRCONN, "PARAMETRCONN");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMETRCONN,5,49,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMEPROJEC, "PARAMEPROJEC");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMEPROJEC,5,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMURLEXPO, "PARAMURLEXPO");
    IMDB.SetFldParams(IMDBDef7.TBL_DATISTAMJASP,IMDBDef7.FLD_DATISTAMJASP_PARAMURLEXPO,5,49,0);
    IMDB.TblAddNew(IMDBDef7.TBL_DATISTAMJASP, 0);
  }

  private void Init_QRY_CHARTOBEFIX1()
  {
    IMDB.set_TblNumField(IMDBDef7.QRY_CHARTOBEFIX1, 2);
    IMDB.set_TblCode(IMDBDef7.QRY_CHARTOBEFIX1, "QRY_CHARTOBEFIX1");
    IMDB.set_FldCode(IMDBDef7.QRY_CHARTOBEFIX1,IMDBDef7.QSL_CHARTOBEFIX1_BADCHATOBEFI, "BADCHATOBEFI");
    IMDB.SetFldParams(IMDBDef7.QRY_CHARTOBEFIX1,IMDBDef7.QSL_CHARTOBEFIX1_BADCHATOBEFI,1,1024,0);
    IMDB.set_FldCode(IMDBDef7.QRY_CHARTOBEFIX1,IMDBDef7.QSL_CHARTOBEFIX1_GOOCHATOBEFI, "GOOCHATOBEFI");
    IMDB.SetFldParams(IMDBDef7.QRY_CHARTOBEFIX1,IMDBDef7.QSL_CHARTOBEFIX1_GOOCHATOBEFI,5,1,0);
  }

  private void Init_QRY_FIELTOBEFIX1()
  {
    IMDB.set_TblNumField(IMDBDef7.QRY_FIELTOBEFIX1, 1);
    IMDB.set_TblCode(IMDBDef7.QRY_FIELTOBEFIX1, "QRY_FIELTOBEFIX1");
    IMDB.set_FldCode(IMDBDef7.QRY_FIELTOBEFIX1,IMDBDef7.QSL_FIELTOBEFIX1_CODFIETOBEFI, "CODFIETOBEFI");
    IMDB.SetFldParams(IMDBDef7.QRY_FIELTOBEFIX1,IMDBDef7.QSL_FIELTOBEFIX1_CODFIETOBEFI,5,50,0);
  }

  private void Init_QRY_CFASELINTV65()
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_CFASELINTV65, 2);
    IMDB.set_TblCode(IMDBDef17.QRY_CFASELINTV65, "QRY_CFASELINTV65");
    IMDB.set_FldCode(IMDBDef17.QRY_CFASELINTV65,IMDBDef17.QSL_CFASELINTV65_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef17.QRY_CFASELINTV65,IMDBDef17.QSL_CFASELINTV65_COUNT,1,19,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFASELINTV65,IMDBDef17.QSL_CFASELINTV65_MAXCOMANCAPT, "MAXCOMANCAPT");
    IMDB.SetFldParams(IMDBDef17.QRY_CFASELINTV65,IMDBDef17.QSL_CFASELINTV65_MAXCOMANCAPT,5,99,0);
  }

  private void Init_QRY_PARASTAMSI41()
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_PARASTAMSI41, 2);
    IMDB.set_TblCode(IMDBDef17.QRY_PARASTAMSI41, "QRY_PARASTAMSI41");
    IMDB.set_FldCode(IMDBDef17.QRY_PARASTAMSI41,IMDBDef17.QSL_PARASTAMSI41_PARAMEPROGRE, "PARAMEPROGRE");
    IMDB.SetFldParams(IMDBDef17.QRY_PARASTAMSI41,IMDBDef17.QSL_PARASTAMSI41_PARAMEPROGRE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.QRY_PARASTAMSI41,IMDBDef17.QSL_PARASTAMSI41_PARAMETRO, "PARAMETRO");
    IMDB.SetFldParams(IMDBDef17.QRY_PARASTAMSI41,IMDBDef17.QSL_PARASTAMSI41_PARAMETRO,5,255,0);
  }

  private void Init_QRY_CFDBCFDBSE11()
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_CFDBCFDBSE11, 1);
    IMDB.set_TblCode(IMDBDef17.QRY_CFDBCFDBSE11, "QRY_CFDBCFDBSE11");
    IMDB.set_FldCode(IMDBDef17.QRY_CFDBCFDBSE11,IMDBDef17.QSL_CFDBCFDBSE11_MAXNUVAPAPR0, "MAXNUVAPAPR0");
    IMDB.SetFldParams(IMDBDef17.QRY_CFDBCFDBSE11,IMDBDef17.QSL_CFDBCFDBSE11_MAXNUVAPAPR0,1,19,0);
  }

  private void Init_QRY_PARASTAMJAS1()
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_PARASTAMJAS1, 3);
    IMDB.set_TblCode(IMDBDef17.QRY_PARASTAMJAS1, "QRY_PARASTAMJAS1");
    IMDB.set_FldCode(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_PARAMEPROGRE, "PARAMEPROGRE");
    IMDB.SetFldParams(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_PARAMEPROGRE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_NOMEPARAMETR, "NOMEPARAMETR");
    IMDB.SetFldParams(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_NOMEPARAMETR,5,255,0);
    IMDB.set_FldCode(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_VALOREPARAME, "VALOREPARAME");
    IMDB.SetFldParams(IMDBDef17.QRY_PARASTAMJAS1,IMDBDef17.QSL_PARASTAMJAS1_VALOREPARAME,5,255,0);
  }

  private void Init_QRY_CFDBCFDBSEIV()
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_CFDBCFDBSEIV, 1);
    IMDB.set_TblCode(IMDBDef17.QRY_CFDBCFDBSEIV, "QRY_CFDBCFDBSEIV");
    IMDB.set_FldCode(IMDBDef17.QRY_CFDBCFDBSEIV,IMDBDef17.QSL_CFDBCFDBSEIV_MAXNUVAPAPR0, "MAXNUVAPAPR0");
    IMDB.SetFldParams(IMDBDef17.QRY_CFDBCFDBSEIV,IMDBDef17.QSL_CFDBCFDBSEIV_MAXNUVAPAPR0,1,19,0);
  }


}
