// **********************************************
// Piani
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;
import com.progamma.ws.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.math.*;

public class Piani extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int PIANI_CRONOPROGRID = 1;
  public static int PIANI_PROGREIMPUTA = 2;
  public static int PIANI_ESERCIZIPLUR = 3;
  public static int PIANI_FINANZIAMENT = 4;
  public static int PIANI_IMPORTO = 5;
  public static int PIANI_VARIAZIONI = 6;
  public static int PIANI_UTENTEINSERI = 7;
  public static int PIANI_DATAINSERIME = 8;
  public static int PIANI_UTENTULTIAGG = 9;
  public static int PIANI_DATAULTIMAGG = 10;
  public static int PIANI_ANNOIMPPURO = 11;
  public static int PIANI_NUMERIMPPURO = 12;
  public static int PIANI_ANNOIMPREISC = 13;
  public static int PIANI_NUMERIMPREIS = 14;
  public static int PIANI_NUOVARIGA = 15;
  public static int PIANI_IMPOINIZESER = 16;
  public static int PIANI_VARIINIZESER = 17;
  public static int PIANI_VARIANNINCOR = 18;
  public static int PIANI_IMPORTATTUAL = 19;
  public static int PIANI_IMPEGNATO = 20;
  public static int PIANI_PAGATO = 21;
  public static int PIANI_DISPONIBILIT = 22;
  public static int PIANI_VARPIANICRON = 1;
  public static int MAX_VARS = 22;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public com.progamma.doc.IDCollection VARPIANICRON = new com.progamma.doc.IDCollection();
  public ImputazioniCrono IMPUTAZPADRE = null;
  private Cronoprogramma CRONOPRPADRE = null;
  public IDVariant getCRONOPROGRID() { return GetPropDirect(PIANI_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(PIANI_CRONOPROGRID,NewValue,false); }
  public IDVariant getPROGREIMPUTA() { return GetPropDirect(PIANI_PROGREIMPUTA); }
  public void setPROGREIMPUTA(IDVariant NewValue) { ChangePropDirect(PIANI_PROGREIMPUTA,NewValue,false); }
  public IDVariant getESERCIZIPLUR() { return GetPropDirect(PIANI_ESERCIZIPLUR); }
  public void setESERCIZIPLUR(IDVariant NewValue) { ChangePropDirect(PIANI_ESERCIZIPLUR,NewValue,false); }
  public IDVariant getFINANZIAMENT() { return GetPropDirect(PIANI_FINANZIAMENT); }
  public void setFINANZIAMENT(IDVariant NewValue) { ChangePropDirect(PIANI_FINANZIAMENT,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(PIANI_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(PIANI_IMPORTO,NewValue,false); }
  public IDVariant getVARIAZIONI() { return GetPropDirect(PIANI_VARIAZIONI); }
  public void setVARIAZIONI(IDVariant NewValue) { ChangePropDirect(PIANI_VARIAZIONI,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(PIANI_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(PIANI_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(PIANI_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(PIANI_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(PIANI_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(PIANI_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(PIANI_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(PIANI_DATAULTIMAGG,NewValue,false); }
  public IDVariant getANNOIMPPURO() { return GetPropDirect(PIANI_ANNOIMPPURO); }
  public void setANNOIMPPURO(IDVariant NewValue) { ChangePropDirect(PIANI_ANNOIMPPURO,NewValue,false); }
  public IDVariant getNUMERIMPPURO() { return GetPropDirect(PIANI_NUMERIMPPURO); }
  public void setNUMERIMPPURO(IDVariant NewValue) { ChangePropDirect(PIANI_NUMERIMPPURO,NewValue,false); }
  public IDVariant getANNOIMPREISC() { return GetPropDirect(PIANI_ANNOIMPREISC); }
  public void setANNOIMPREISC(IDVariant NewValue) { ChangePropDirect(PIANI_ANNOIMPREISC,NewValue,false); }
  public IDVariant getNUMERIMPREIS() { return GetPropDirect(PIANI_NUMERIMPREIS); }
  public void setNUMERIMPREIS(IDVariant NewValue) { ChangePropDirect(PIANI_NUMERIMPREIS,NewValue,false); }
  public IDVariant getNUOVARIGA() { return GetPropDirect(PIANI_NUOVARIGA); }
  public void setNUOVARIGA(IDVariant NewValue) { ChangePropDirect(PIANI_NUOVARIGA,NewValue,false); }
  public IDVariant getIMPOINIZESER() { return GetPropDirect(PIANI_IMPOINIZESER); }
  public void setIMPOINIZESER(IDVariant NewValue) { ChangePropDirect(PIANI_IMPOINIZESER,NewValue,false); }
  public IDVariant getVARIINIZESER() { return GetPropDirect(PIANI_VARIINIZESER); }
  public void setVARIINIZESER(IDVariant NewValue) { ChangePropDirect(PIANI_VARIINIZESER,NewValue,false); }
  public IDVariant getVARIANNINCOR() { return GetPropDirect(PIANI_VARIANNINCOR); }
  public void setVARIANNINCOR(IDVariant NewValue) { ChangePropDirect(PIANI_VARIANNINCOR,NewValue,false); }
  public IDVariant getIMPORTATTUAL() { return GetPropDirect(PIANI_IMPORTATTUAL); }
  public void setIMPORTATTUAL(IDVariant NewValue) { ChangePropDirect(PIANI_IMPORTATTUAL,NewValue,false); }
  public IDVariant getIMPEGNATO() { return GetPropDirect(PIANI_IMPEGNATO); }
  public void setIMPEGNATO(IDVariant NewValue) { ChangePropDirect(PIANI_IMPEGNATO,NewValue,false); }
  public IDVariant getPAGATO() { return GetPropDirect(PIANI_PAGATO); }
  public void setPAGATO(IDVariant NewValue) { ChangePropDirect(PIANI_PAGATO,NewValue,false); }
  public IDVariant getDISPONIBILIT() { return GetPropDirect(PIANI_DISPONIBILIT); }
  public void setDISPONIBILIT(IDVariant NewValue) { ChangePropDirect(PIANI_DISPONIBILIT,NewValue,false); }
    
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
  }

  // IMDB DDL Procedures
    
    
  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Piani()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Piani(MyWebEntryPoint w, IMDBObj imdb)
  {
    if (w != null)
      SetMainFrm(w, imdb);
  }
  
  public void SetMainFrm(Object mainfrm, Object imdb)
  {
    boolean IMDBChanged = (imdb != null && (IMDB == null || ((IMDBObj)imdb).DBSize() > IMDB.DBSize()));
    //
    if (MainFrm == null || IMDBChanged)
    {
      if (MainFrm==null)
	      MainFrm=(MyWebEntryPoint)mainfrm;
      IMDB=(IMDBObj)imdb;
      //
      if (aVars==null)
      {
        aVars = new IDVariant[MAX_VARS+BASE_VARS];
        MyMDOInit.Initialize(this);
      }
      //
      IMPUTAZPADRE = new ImputazioniCrono(MainFrm,IMDB);
      //
      DOMDObj MD = GetMD();
      for (int i = 1; i <= MD.GetNumColl(); i++)
      {
        IDCollection c = GetCollByIndex(i);
        c.set_MainFrm(MainFrm);
        c.set_imdb(imdb);
      }
      //
      // Ridefinisco mainfrm e imdb prendendo quelli giusti per la classe base prima di passarglielo
      IMPUTAZPADRE.SetMainFrm(MainFrm,IMDB);
      //
      super.SetMainFrm(mainfrm,imdb);
    }
  }

  public Object GetMainFrm()
  {
    return MainFrm;
  }

  public IDDocHelper GetDocHelper()
  {
    if (MainFrm != null)
      return MainFrm.DocHelper;
    else
      return null;
  }

  public Object GetIMDB()
  {
    return IMDB;
  }

  public void RefreshUI()
  {
    if (MainFrm != null)
      MainFrm.set_RefreshUI(true);
  }
   
  public LinkedList GetLookupCache()
  {
    if (MainFrm != null)
      return MainFrm.LookupCache;
    else
      return null;
  }

  public LinkedList GetModifiedList()
  {
    if (MainFrm != null)
      return MainFrm.DOModifiedList;
    else
      return null;
  }
  
  public HashMap GetSchemaCache()
  {
    if (MainFrm != null)
      return MainFrm.SchemaCache;
    else
      return null;
  }
    
    
  // **********************************************
  // Get Database Connection (if not Meta Data Connected)
  // **********************************************
  public IDConnection GetDBObj(boolean Open)
  {
    try
    {
      return (Open ? MainFrm.Cf4armDBObject.DBO() : MainFrm.Cf4armDBObject.GetDB());
    }
    catch(Exception e)
    {
    }
    return super.GetDBObj(Open);
  }
  
  // **********************************************
  // Get Meta Data
  // **********************************************
  private static DOMDObj MDOPiani;
  public synchronized static DOMDObj GetDOMD_Piani()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOPiani != null)
      return MDOPiani;
    else
      MDOPiani = new DOMDObj();
    MDOPiani.ObjTag = "Piani";
    MDOPiani.ObjGUID = "3D97E33F-737F-40D0-9CB7-73871CEDB68F";
    MDOPiani.UIName = "Piani";
    MDOPiani.Services = 0;
    MDOPiani.BaseProps = 0;
    MDOPiani.BaseColls = 0;
    MDOPiani.DBCode = "PIANI_CRONOPROGRAMMI";
    MDOPiani.DBSchema = ".";
    MDOPiani.SequenceCode = "PIANI_CRONOPROGRAMMI_$F";
    MDOPiani.DBType = 4;
    MDOPiani.AddQuery("4A48A40C-4BB3-4CFC-8E78-832879C6FDAF", "PIANICRONOPROGRAMMI_PK", "select 1 from PIANI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~ and ESERCIZIO_PLUR=~~ESERCIZIOPLUR~~ and FINANZIAMENTO=~~FINANZIAMENTO~~", "~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~, ~~!ESERCIZIOPLUR~~=~~ESERCIZIOPLUR~~, ~~!FINANZIAMENTO~~=~~FINANZIAMENTO~~", 1);
    MDOPiani.AddQuery("792BC62D-EEA2-4C49-BC81-05016A79E8C3", "PIANICRONOPROGRAMMI_IMPUTAZIONICRONOPROGRAMMI", "select 1 from IMPUTAZIONI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~", "IMPUTAZIONI CRONOPROGRAMMI§~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~", 3);
    MDOPiani.AddQuery("5A86CEBB-AF8E-4A81-8A24-6848948CA49E", "VARPIANICRONOPROGRAMMI_PIANICRONOPROGRAMMI", "select 1 from VAR_PIANI_CRONOPROGRAMMI where PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~ and CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and ESERCIZIO_PLUR=~~ESERCIZIOPLUR~~ and FINANZIAMENTO=~~FINANZIAMENTO~~", "VAR PIANI CRONOPROGRAMMI§~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~, ~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!ESERCIZIOPLUR~~=~~ESERCIZIOPLUR~~, ~~!FINANZIAMENTO~~=~~FINANZIAMENTO~~", 4);
    MDOPiani.SetNumProp(22);
    MDP = new DOMDProp();
    MDOPiani.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "A71DAA34-3AEB-4094-8DDB-E7083181EA43";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Cronoprogramma", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("TESTATECRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Cronoprogramma.CRONOPROGRA1_CRONOPROGRID, Piani.PIANI_CRONOPROGRID);
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP.PK = true;
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPiani.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "PROGREIMPUTA";
    MDP.Name = "PROGRESSIVOIMPUTAZIONE";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE";
    MDP.GUID = "C1526FC9-7029-4F0A-91C2-0D179AAF7D98";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("ImputazioniCrono", 2);
    MDP.LinkedDoc = DOC;
    DOC.SetName("IMPUTAZIONICRONOPROGRAMMI");
    DOC.SetLinkedProp(0, ImputazioniCrono.IMPUTAZCRONO_CRONOPROGRID, Piani.PIANI_CRONOPROGRID);
    DOC.SetLinkedProp(1, ImputazioniCrono.IMPUTAZCRONO_PROGREIMPUTA, Piani.PIANI_PROGREIMPUTA);
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE";
    MDP.PK = true;
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPiani.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "ESERCIZIPLUR";
    MDP.Name = "ESERCIZIOPLUR";
    MDP.UIName = "ESERCIZIO PLUR";
    MDP.GUID = "FCB0220B-E6C1-43C7-B6BE-3CE7C08D9D2E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_PLUR";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPiani.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "FINANZIAMENT";
    MDP.Name = "FINANZIAMENTO";
    MDP.UIName = "FINANZIAMENTO";
    MDP.GUID = "190642ED-DF36-4C0E-B356-8F5595012655";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "FINANZIAMENTO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPiani.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "98B2CEB2-2194-444F-B097-561F5EFD2A09";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPiani.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "VARIAZIONI";
    MDP.Name = "VARIAZIONI";
    MDP.UIName = "VARIAZIONI";
    MDP.GUID = "BDC95D0D-9682-4CD3-8412-6082E01A9BE1";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI";
    MDP = new DOMDProp();
    MDOPiani.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "B894E04E-1E60-43A7-9FDD-4AD29BBE4942";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOPiani.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "69047F7E-EB47-4782-A800-C57E35577F10";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOPiani.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "A84AE942-F8FE-4F13-ACCD-1428041735E6";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOPiani.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "CA39D980-9050-42E4-81E4-6B1D94377AAF";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOPiani.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "ANNOIMPPURO";
    MDP.Name = "ANNOIMPPURO";
    MDP.UIName = "ANNO IMP PURO";
    MDP.GUID = "24541624-11BC-4A93-AAC8-AE0A1818C525";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_IMP_PURO";
    MDP = new DOMDProp();
    MDOPiani.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "NUMERIMPPURO";
    MDP.Name = "NUMEROIMPPURO";
    MDP.UIName = "NUMERO IMP PURO";
    MDP.GUID = "5878D160-3BA2-4573-82D6-695F4468613E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_IMP_PURO";
    MDP = new DOMDProp();
    MDOPiani.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "ANNOIMPREISC";
    MDP.Name = "ANNOIMPREISC";
    MDP.UIName = "ANNO IMP REISC";
    MDP.GUID = "9A5230FB-558F-472B-9A70-69001446CF63";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_IMP_REISC";
    MDP = new DOMDProp();
    MDOPiani.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "NUMERIMPREIS";
    MDP.Name = "NUMEROIMPREISC";
    MDP.UIName = "NUMERO IMP REISC";
    MDP.GUID = "ED78C3CA-FC9D-46D9-9030-4F1D623814D8";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_IMP_REISC";
    MDP = new DOMDProp();
    MDOPiani.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "NUOVARIGA";
    MDP.Name = "NuovaRiga";
    MDP.UIName = "Nuova Riga";
    MDP.GUID = "D3C6F123-515F-4E3F-9BC2-4499CD6DF762";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOPiani.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "IMPOINIZESER";
    MDP.Name = "ImportoInizioEsercizio";
    MDP.UIName = "Importo Inizio Esercizio";
    MDP.GUID = "B2C63D04-5018-4C55-8744-E088595CB2E1";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "VARIINIZESER";
    MDP.Name = "VariazioniInizioEsercizio";
    MDP.UIName = "Variazioni Inizio Esercizio";
    MDP.GUID = "60EA13A4-F86D-46B2-ACCF-B248B2B98CCA";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "VARIANNINCOR";
    MDP.Name = "VariazioniAnnoInCorso";
    MDP.UIName = "Variazioni Anno In Corso";
    MDP.GUID = "379E9C08-F865-4977-82F8-30C083680F86";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "IMPORTATTUAL";
    MDP.Name = "ImportoAttuale";
    MDP.UIName = "Importo Attuale";
    MDP.GUID = "39A16CCE-1FE3-44A8-B379-2E4DA790051B";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "IMPEGNATO";
    MDP.Name = "Impegnato";
    MDP.UIName = "Impegnato";
    MDP.GUID = "BDE5CC47-9352-47FD-A7BE-27663B9C50AF";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "PAGATO";
    MDP.Name = "Pagato";
    MDP.UIName = "Pagato";
    MDP.GUID = "D1DC2833-3B56-493B-87E8-F401F844E12A";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOPiani.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "DISPONIBILIT";
    MDP.Name = "Disponibilita";
    MDP.UIName = "Disponibilita";
    MDP.GUID = "61057228-DFD1-4A42-95B4-388D86AFBEF4";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDOPiani.SetNumColl(1);
    MDC = new DOMDColl();
    MDOPiani.SetColl(1,MDC);
    MDC.Index = 1;
    MDC.Name = "VARPIANICRONOPROGRAMMI";
    MDC.ChildrenName = "Varpiani";
    MDC.Visible = true;
    MDC.PKColl.add("PROGREIMPUTA");
    MDC.FKColl.add("PROGREIMPUTA");
    MDC.PKColl.add("CRONOPROGRID");
    MDC.FKColl.add("CRONOPROGRID");
    MDC.PKColl.add("ESERCIZIPLUR");
    MDC.FKColl.add("ESERCIZIPLUR");
    MDC.PKColl.add("FINANZIAMENT");
    MDC.FKColl.add("FINANZIAMENT");
    return MDOPiani;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_Piani();
    IOTConnector.InitMetadata(GetMainFrm(), md);
    return md;
  }
  
  // **********************************************
  // Get Meta Data By Name (tutte le classi...)
  // **********************************************
  public DOMDObj GetMD(String ClassName)
  {
    try
    {
      return MyMDOInit.GetMetaData(ClassName);
    }
    catch(Exception e)
    {
      System.err.println(e);
      return null;
    }
  }

  // **********************************************
  // Get Meta Data By Name (tutte le classi...)
  // **********************************************
  public IDDocument CreateDocument(String ClassName)
  {
    try
    {
      IDDocument d = MyMDOInit.CreateDocument(ClassName);
      if (d == null && MainFrm != null)
        d = MainFrm.CreateDocument(ClassName);
      d.SetMainFrm(MainFrm, IMDB);
      return d;
    }
    catch(Exception e)
    {
      System.err.println(e);
      return null;
    }
  }
  
  // **********************************************
  // Init Default Values
  // **********************************************
  public void InitDefaults()
  {
    super.InitDefaults();
  }
  public void Init() throws Exception
  {
    InitDefaults();
    MDOInit.Init(this);
  }
  
    
  // **********************************************
  // Set Property By Index
  // **********************************************
  public void SetPropByIndex(int Idx, IDVariant NewValue)
  {
    fine:
    {
      if (Idx==PIANI_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==PIANI_PROGREIMPUTA) { setPROGREIMPUTA(NewValue); break fine; }
      if (Idx==PIANI_ESERCIZIPLUR) { setESERCIZIPLUR(NewValue); break fine; }
      if (Idx==PIANI_FINANZIAMENT) { setFINANZIAMENT(NewValue); break fine; }
      if (Idx==PIANI_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==PIANI_VARIAZIONI) { setVARIAZIONI(NewValue); break fine; }
      if (Idx==PIANI_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==PIANI_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==PIANI_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==PIANI_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==PIANI_ANNOIMPPURO) { setANNOIMPPURO(NewValue); break fine; }
      if (Idx==PIANI_NUMERIMPPURO) { setNUMERIMPPURO(NewValue); break fine; }
      if (Idx==PIANI_ANNOIMPREISC) { setANNOIMPREISC(NewValue); break fine; }
      if (Idx==PIANI_NUMERIMPREIS) { setNUMERIMPREIS(NewValue); break fine; }
      if (Idx==PIANI_NUOVARIGA) { setNUOVARIGA(NewValue); break fine; }
      if (Idx==PIANI_IMPOINIZESER) { setIMPOINIZESER(NewValue); break fine; }
      if (Idx==PIANI_VARIINIZESER) { setVARIINIZESER(NewValue); break fine; }
      if (Idx==PIANI_VARIANNINCOR) { setVARIANNINCOR(NewValue); break fine; }
      if (Idx==PIANI_IMPORTATTUAL) { setIMPORTATTUAL(NewValue); break fine; }
      if (Idx==PIANI_IMPEGNATO) { setIMPEGNATO(NewValue); break fine; }
      if (Idx==PIANI_PAGATO) { setPAGATO(NewValue); break fine; }
      if (Idx==PIANI_DISPONIBILIT) { setDISPONIBILIT(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    if (Idx==1+BASE_COLLS) return VARPIANICRON;
    return super.GetCollByIndex(Idx);
  }
  
  
  // **********************************************
  // Get Master Query used to load a document
  // **********************************************
  public void GetMasterQuery(String SqlText[], IDVariant MasterTableAlias, LinkedList ColAssignment)
  {
    StringBuffer SQL;
    
  }


  // **********************************************
  // Get Value Source Query used to load a collection
  // **********************************************
  public void GetValueSource(IDVariant SQLStmt, LinkedList ColAssignment, IDCollection Coll, IDDocument DummyDoc)
  {
    StringBuffer SQL;
    String[] SqlText = new String[6];

    //
    if (SqlText[0]==null)
    {
      // Ask to base class
      super.GetValueSource(SQLStmt, ColAssignment, Coll, DummyDoc);
      return;
    }
    //
    SQL = new StringBuffer();
    for (int i=0;i<6;i++)
    {
      if (SqlText[i]==null)
        continue;
      //
      SQL.append(SqlText[i]);
      if (i == Glb.SQL_WHERE)
      {
        // Fire OnSQL Event...
        IDVariant AddWC = new IDVariant();
        DummyDoc.OnSQLQuery(new IDVariant(SQL.toString()), new IDVariant(MDOInit.QRY_LOADCOLLECTION), AddWC);
        if (AddWC.stringValue().length()>0)
        {
          if (SqlText[i].length() == 0)
            SQL.append(" where ");
          else
            SQL.append(" and ");
          SQL.append(AddWC);
        }
      }
    }
    SQLStmt.set(new IDVariant(SQL.toString()));
  }
  

  // **********************************************
  // Document validation
  // **********************************************
  public void InternalValidate(int Reason, IDVariant bError)
  {
    MDOInit.InternalValidate(this, Reason, bError);
  }

  
  // **********************************************
  // Get DB Expression used to load a property
  // **********************************************
  public String GetDBExpr(int PropIdx)
  {
    StringBuffer SQL;
    
    return "";
  } 


  // **********************************************
  // Class factory
  // **********************************************
  public static Piani CreatePiani()
  {
    return CreatePiani(null, null);
  }
  
  public static Piani CreatePiani(Object mainfrm, Object imdb) { return CreatePiani(mainfrm, imdb, null); } 
  public static Piani CreatePiani(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    Piani newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new Piani((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
    else
    {
      if (mainfrm == null)
        mainfrm = mainfrmCF;
      //
      if (mainfrm != null)
      {
        IWebEntryPoint app = ((IWebEntryPoint)mainfrm).GetApplication();
        if (ClassName.lastIndexOf('.') == -1)
        {
          // Classe senza namespace: faccio creare l'istanza alla applicazione
          // La CreateDocument già chiama la SetMainFrm
          newobj = (Piani)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (Piani)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreatePiani", 
                  "Can't find component " + CompNameSpace + " while handling Piani class factory");
            app.getDTTObj().AddParameter("", "", "ClassName", ClassName);
          }
        }
      }
    }
    //
    return newobj;
  }

  public static synchronized void SetClassName(String cn)
  {
    ClassName = cn;
  }

  // **********************************************
  // Definizione Concept di proprietà a run-time
  // **********************************************
  public static void SetPropertyConcept(IDVariant PropIdx, IDVariant Concept)
  {
    DOMDObj MD = GetDOMD_Piani();
    DOMDProp MPR = MD.GetProp(PropIdx.intValue());
    synchronized (MPR)
    {
      MPR.Concept = Concept.stringValue();
    }
  }

  //***************************************************************************
  // Mostra questo documento nell'interfaccia utente, ritorna la form aperta
  // Questa funzione deve essere qui altrimenti la NEWINSTANCE non
  // riesce a creare la form per nome
  //***************************************************************************
  public WebForm Show(int OpenAs)
  {
    DOMDObj MD = GetMD();
    IDVariant ClassName = new IDVariant(MD.FormName);
    OnShow(ClassName);
    //
    // Se ho un classname...
    if (ClassName.stringValue().length()>0)    
    {
      return WebForm.NewInstance((com.progamma.is.WebEntryPoint)GetMainFrm(), (IMDBObj)GetIMDB(), ClassName.stringValue(), OpenAs, this);
    }
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Piani);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Piani.class.getName() : (Glb.ClassWithPackage(Piani.class) ? Piani.class.getName().substring(Piani.class.getPackage().getName().length() + 1) : Piani.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
  // **********************************************************************
  // After Load
  // Evento notificato dal documento dopo il caricamento
  // dal database
  // Already Loaded - Input
  // Loaded Collections - Input
  // **********************************************************************
  public void AfterLoad(IDVariant AlreadyLoaded, IDArray LoadedCollections)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // After Load Body
      // Corpo Procedura
      // 
      setNUOVARIGA((new IDVariant(1)));
      CalcolaVariazioniload();
      CalcolaInfo();
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "AfterLoad", _e);
    }
  }

  // **********************************************************************
  // After Save
  // Evento notificato al documento al termine della procedura
  // di salvataggio
  // Cancel - Input/Output
  // **********************************************************************
  public void AfterSave(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // After Save Body
      // Corpo Procedura
      // 
      if (this.Inserted())
      {
        setNUOVARIGA((new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
    }
  }

  // **********************************************************************
  // Gettotvaranno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDVariant Gettotvaranno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gettotvaranno Body
      // Corpo Procedura
      // 
      IDVariant v_TOT = new IDVariant(0,IDVariant.DECIMAL);
      if (new IDVariant(VARPIANICRON.Count()).compareTo((new IDVariant(0)), true)>0)
      {
        ListIterator L3 = VARPIANICRON.GetLoopCollection().listIterator();
        while (L3.hasNext())
        {
          Varpiani C3_VARPIANICRON = (Varpiani) L3.next();
          v_TOT = IDL.Add(v_TOT, ((C3_VARPIANICRON.getANNOVAR().equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))?C3_VARPIANICRON.getIMPORTO():(new IDVariant(0))));
        }
      }
      else
      {
        v_TOT = (new IDVariant());
      }
      return v_TOT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "Gettotvaranno", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Calcola Variazioniload
  // **********************************************************************
  public int CalcolaVariazioniload ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Variazioniload Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  GET_IMPORTI_PIANO_CRONO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getCRONOPROGRID(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getPROGREIMPUTA(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",-1,-1,-1,'VAR_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GIPCSECIPIEP ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        setVARIINIZESER (QV.Get("GIPCSECIPIEP", IDVariant.DECIMAL));
      }
      QV.Close();
      setIMPOINIZESER(IDL.Add(getIMPORTO(), getVARIINIZESER()));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  GET_IMPORTI_PIANO_CRONO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getCRONOPROGRID(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getPROGREIMPUTA(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",-1,-1,-1,'VAR_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GIPCSECIPIEP ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        setVARIANNINCOR (QV.Get("GIPCSECIPIEP", IDVariant.DECIMAL));
      }
      QV.Close();
      setIMPORTATTUAL(IDL.Add(getIMPOINIZESER(), getVARIANNINCOR()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "CalcolaVariazioniload", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Variazionisave
  // **********************************************************************
  public int CalcolaVariazionisave ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Variazionisave Body
      // Corpo Procedura
      // 
      setIMPOINIZESER((new IDVariant(0, IDVariant.DECIMAL)));
      setVARIANNINCOR((new IDVariant(0, IDVariant.DECIMAL)));
      setVARIINIZESER((new IDVariant(0, IDVariant.DECIMAL)));
      ListIterator L2 = VARPIANICRON.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        Varpiani C2_VARPIANICRON = (Varpiani) L2.next();
        if (C2_VARPIANICRON.getANNOVAR().compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
        {
          setVARIINIZESER(IDL.Add(getVARIINIZESER(), C2_VARPIANICRON.getIMPORTO()));
        }
        if (C2_VARPIANICRON.getANNOVAR().equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          setVARIANNINCOR(IDL.Add(getVARIANNINCOR(), C2_VARPIANICRON.getIMPORTO()));
        }
      }
      setIMPOINIZESER(IDL.Add(getIMPORTO(), getVARIINIZESER()));
      setIMPORTATTUAL(IDL.Add(getIMPOINIZESER(), getVARIANNINCOR()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "CalcolaVariazionisave", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Info
  // **********************************************************************
  public int CalcolaInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Info Body
      // Corpo Procedura
      // 
      IMPUTAZPADRE = (ImputazioniCrono)Parent();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, A_GET_TOT_FIN_OPE_CAP(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'AIC'), GET_TOT_FIN_OPE_CAP_LIGHT(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'AIC')) as IECFTAGTFOC1, ");
      SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, A_GET_TOT_FIN_OPE_CAP(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'IPT'), GET_TOT_FIN_OPE_CAP_LIGHT(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'IPT')) as IECFTAGTFOC2, ");
      SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, A_GET_TOT_FIN_OPE_CAP(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'DIS'), " + IDL.CSql(getIMPORTATTUAL(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - GET_TOT_FIN_OPE_CAP_LIGHT(" + IDL.CSql(getESERCIZIPLUR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(getFINANZIAMENT(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getOPERACRONO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMPUTAZPADRE.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMPUTAZPADRE.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'AIC')) as IECFTAGTFOCE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        setIMPEGNATO (QV.Get("IECFTAGTFOC1", IDVariant.DECIMAL));
        setPAGATO (QV.Get("IECFTAGTFOC2", IDVariant.DECIMAL));
        setDISPONIBILIT (QV.Get("IECFTAGTFOCE", IDVariant.DECIMAL));
      }
      QV.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "CalcolaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ricarica Collection
  // Var Piani:  - Input
  // **********************************************************************
  public int RicaricaCollection (IDVariant VarPiani)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricarica Collection Body
      // Corpo Procedura
      // 
      VARPIANICRON.set_Loaded(!(VarPiani.booleanValue()));
      LoadFromDB((new IDVariant(1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Piani", "RicaricaCollection", _e);
      return -1;
    }
  }

  
}  
