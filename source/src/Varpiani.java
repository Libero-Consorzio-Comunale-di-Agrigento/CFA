// **********************************************
// Varpiani
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

public class Varpiani extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int VARPIANI_PROGRESSIVAR = 1;
  public static int VARPIANI_CRONOPROGRID = 2;
  public static int VARPIANI_PROGREIMPUTA = 3;
  public static int VARPIANI_ESERCIZIPLUR = 4;
  public static int VARPIANI_ANNOVAR = 5;
  public static int VARPIANI_IMPORTO = 6;
  public static int VARPIANI_DESCRIZIONE = 7;
  public static int VARPIANI_DATAREGISTRA = 8;
  public static int VARPIANI_VARIAZGENERA = 9;
  public static int VARPIANI_UTENTEINSERI = 10;
  public static int VARPIANI_DATAINSERIME = 11;
  public static int VARPIANI_UTENTULTIAGG = 12;
  public static int VARPIANI_DATAULTIMAGG = 13;
  public static int VARPIANI_NUOVARIGA = 14;
  public static int VARPIANI_TIPOVAR = 15;
  public static int VARPIANI_CONFERMATRAG = 16;
  public static int VARPIANI_ANNOIMP = 17;
  public static int VARPIANI_NUMEROIMP = 18;
  public static int VARPIANI_FINANZIAMENT = 19;
  public static int VARPIANI_ESERCIENTRAT = 20;
  public static int VARPIANI_LOG = 21;
  public static int VARPIANI_VARIMPGENERA = 22;
  public static int VARPIANI_PROGVARIPROV = 23;
  public static int MAX_VARS = 23;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public IDVariant getPROGRESSIVAR() { return GetPropDirect(VARPIANI_PROGRESSIVAR); }
  public void setPROGRESSIVAR(IDVariant NewValue) { ChangePropDirect(VARPIANI_PROGRESSIVAR,NewValue,false); }
  public IDVariant getCRONOPROGRID() { return GetPropDirect(VARPIANI_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(VARPIANI_CRONOPROGRID,NewValue,false); }
  public IDVariant getPROGREIMPUTA() { return GetPropDirect(VARPIANI_PROGREIMPUTA); }
  public void setPROGREIMPUTA(IDVariant NewValue) { ChangePropDirect(VARPIANI_PROGREIMPUTA,NewValue,false); }
  public IDVariant getESERCIZIPLUR() { return GetPropDirect(VARPIANI_ESERCIZIPLUR); }
  public void setESERCIZIPLUR(IDVariant NewValue) { ChangePropDirect(VARPIANI_ESERCIZIPLUR,NewValue,false); }
  public IDVariant getANNOVAR() { return GetPropDirect(VARPIANI_ANNOVAR); }
  public void setANNOVAR(IDVariant NewValue) { ChangePropDirect(VARPIANI_ANNOVAR,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(VARPIANI_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(VARPIANI_IMPORTO,NewValue,false); }
  public IDVariant getDESCRIZIONE() { return GetPropDirect(VARPIANI_DESCRIZIONE); }
  public void setDESCRIZIONE(IDVariant NewValue) { ChangePropDirect(VARPIANI_DESCRIZIONE,NewValue,false); }
  public IDVariant getDATAREGISTRA() { return GetPropDirect(VARPIANI_DATAREGISTRA); }
  public void setDATAREGISTRA(IDVariant NewValue) { ChangePropDirect(VARPIANI_DATAREGISTRA,NewValue,false); }
  public IDVariant getVARIAZGENERA() { return GetPropDirect(VARPIANI_VARIAZGENERA); }
  public void setVARIAZGENERA(IDVariant NewValue) { ChangePropDirect(VARPIANI_VARIAZGENERA,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(VARPIANI_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(VARPIANI_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(VARPIANI_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(VARPIANI_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(VARPIANI_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(VARPIANI_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(VARPIANI_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(VARPIANI_DATAULTIMAGG,NewValue,false); }
  public IDVariant getNUOVARIGA() { return GetPropDirect(VARPIANI_NUOVARIGA); }
  public void setNUOVARIGA(IDVariant NewValue) { ChangePropDirect(VARPIANI_NUOVARIGA,NewValue,false); }
  public IDVariant getTIPOVAR() { return GetPropDirect(VARPIANI_TIPOVAR); }
  public void setTIPOVAR(IDVariant NewValue) { ChangePropDirect(VARPIANI_TIPOVAR,NewValue,false); }
  public IDVariant getCONFERMATRAG() { return GetPropDirect(VARPIANI_CONFERMATRAG); }
  public void setCONFERMATRAG(IDVariant NewValue) { ChangePropDirect(VARPIANI_CONFERMATRAG,NewValue,false); }
  public IDVariant getANNOIMP() { return GetPropDirect(VARPIANI_ANNOIMP); }
  public void setANNOIMP(IDVariant NewValue) { ChangePropDirect(VARPIANI_ANNOIMP,NewValue,false); }
  public IDVariant getNUMEROIMP() { return GetPropDirect(VARPIANI_NUMEROIMP); }
  public void setNUMEROIMP(IDVariant NewValue) { ChangePropDirect(VARPIANI_NUMEROIMP,NewValue,false); }
  public IDVariant getFINANZIAMENT() { return GetPropDirect(VARPIANI_FINANZIAMENT); }
  public void setFINANZIAMENT(IDVariant NewValue) { ChangePropDirect(VARPIANI_FINANZIAMENT,NewValue,false); }
  public IDVariant getESERCIENTRAT() { return GetPropDirect(VARPIANI_ESERCIENTRAT); }
  public void setESERCIENTRAT(IDVariant NewValue) { ChangePropDirect(VARPIANI_ESERCIENTRAT,NewValue,false); }
  public IDVariant getLOG() { return GetPropDirect(VARPIANI_LOG); }
  public void setLOG(IDVariant NewValue) { ChangePropDirect(VARPIANI_LOG,NewValue,false); }
  public IDVariant getVARIMPGENERA() { return GetPropDirect(VARPIANI_VARIMPGENERA); }
  public void setVARIMPGENERA(IDVariant NewValue) { ChangePropDirect(VARPIANI_VARIMPGENERA,NewValue,false); }
  public IDVariant getPROGVARIPROV() { return GetPropDirect(VARPIANI_PROGVARIPROV); }
  public void setPROGVARIPROV(IDVariant NewValue) { ChangePropDirect(VARPIANI_PROGVARIPROV,NewValue,false); }
    
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
  public Varpiani()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Varpiani(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOVarpiani;
  public synchronized static DOMDObj GetDOMD_Varpiani()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOVarpiani != null)
      return MDOVarpiani;
    else
      MDOVarpiani = new DOMDObj();
    MDOVarpiani.ObjTag = "Varpiani";
    MDOVarpiani.ObjGUID = "ADE4A454-03A4-4581-8166-C51BC4320F54";
    MDOVarpiani.UIName = "Varpiani";
    MDOVarpiani.Services = 0;
    MDOVarpiani.BaseProps = 0;
    MDOVarpiani.BaseColls = 0;
    MDOVarpiani.DBCode = "VAR_PIANI_CRONOPROGRAMMI";
    MDOVarpiani.DBSchema = ".";
    MDOVarpiani.SequenceCode = "VAR_PIANI_CRONOPROGRAMMI_$F";
    MDOVarpiani.DBType = 4;
    MDOVarpiani.AddQuery("B2A732CC-A94C-4430-B4BF-0A37EF40B514", "VARPIANICRONOPROGRAMMI_PK", "select 1 from VAR_PIANI_CRONOPROGRAMMI where PROGRESSIVO_VAR=~~PROGRESSIVOVAR~~", "~~!PROGRESSIVOVAR~~=~~PROGRESSIVOVAR~~", 1);
    MDOVarpiani.AddQuery("5A86CEBB-AF8E-4A81-8A24-6848948CA49E", "VARPIANICRONOPROGRAMMI_PIANICRONOPROGRAMMI", "select 1 from PIANI_CRONOPROGRAMMI where PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~ and CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and ESERCIZIO_PLUR=~~ESERCIZIOPLUR~~ and FINANZIAMENTO=~~FINANZIAMENTO~~", "PIANI CRONOPROGRAMMI§~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~, ~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!ESERCIZIOPLUR~~=~~ESERCIZIOPLUR~~, ~~!FINANZIAMENTO~~=~~FINANZIAMENTO~~", 3);
    MDOVarpiani.SetNumProp(23);
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "PROGRESSIVAR";
    MDP.Name = "PROGRESSIVOVAR";
    MDP.UIName = "PROGRESSIVO VAR";
    MDP.GUID = "62A15B64-F110-46FF-9F9D-01E7502C77E9";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VAR";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "CBA4329A-F953-4383-901F-180AAA46E052";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Cronoprogramma", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("TESTATECRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Cronoprogramma.CRONOPROGRA1_CRONOPROGRID, Varpiani.VARPIANI_CRONOPROGRID);
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "PROGREIMPUTA";
    MDP.Name = "PROGRESSIVOIMPUTAZIONE";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE";
    MDP.GUID = "1A910569-6948-49CD-9492-586ED6454E5A";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("ImputazioniCrono", 2);
    MDP.LinkedDoc = DOC;
    DOC.SetName("IMPUTAZIONICRONOPROGRAMMI");
    DOC.SetLinkedProp(0, ImputazioniCrono.IMPUTAZCRONO_CRONOPROGRID, Varpiani.VARPIANI_CRONOPROGRID);
    DOC.SetLinkedProp(1, ImputazioniCrono.IMPUTAZCRONO_PROGREIMPUTA, Varpiani.VARPIANI_PROGREIMPUTA);
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE";
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "ESERCIZIPLUR";
    MDP.Name = "ESERCIZIOPLUR";
    MDP.UIName = "ESERCIZIO PLUR";
    MDP.GUID = "DFF0A450-8D18-4BCB-BC07-71CF47DBC9A6";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Piani", 4);
    MDP.LinkedDoc = DOC;
    DOC.SetName("PIANICRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Piani.PIANI_PROGREIMPUTA, Varpiani.VARPIANI_PROGREIMPUTA);
    DOC.SetLinkedProp(1, Piani.PIANI_CRONOPROGRID, Varpiani.VARPIANI_CRONOPROGRID);
    DOC.SetLinkedProp(2, Piani.PIANI_ESERCIZIPLUR, Varpiani.VARPIANI_ESERCIZIPLUR);
    DOC.SetLinkedProp(3, Piani.PIANI_FINANZIAMENT, Varpiani.VARPIANI_FINANZIAMENT);
    MDP.DBCode = "ESERCIZIO_PLUR";
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "ANNOVAR";
    MDP.Name = "ANNOVAR";
    MDP.UIName = "ANNO VAR";
    MDP.GUID = "F72A9CA8-153C-4E04-B357-FFBB1730B975";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_VAR";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "F3858256-C3D0-4695-BC3A-8B2A64B863E1";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "DESCRIZIONE";
    MDP.Name = "DESCRIZIONE";
    MDP.UIName = "DESCRIZIONE";
    MDP.GUID = "A6B0A995-A99A-4E3F-9407-66A969432D91";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 140;
    MDP.vScale = 0;
    MDP.DBCode = "DESCRIZIONE";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "DATAREGISTRA";
    MDP.Name = "DATAREGISTRAZIONE";
    MDP.UIName = "DATA REGISTRAZIONE";
    MDP.GUID = "7A16D137-5E43-4425-B134-E55FCA98F88C";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_REGISTRAZIONE";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "VARIAZGENERA";
    MDP.Name = "VARIAZIONEGENERATA";
    MDP.UIName = "VARIAZIONE GENERATA";
    MDP.GUID = "A0852DF3-9717-48BB-9AAA-F0D8BB8A0CCC";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "VARIAZIONE_GENERATA";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "15CBC7DC-61E1-4C19-B6F9-342130FDFC35";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "5D3705EC-80A0-4DAC-9763-46A4FE9D6758";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "EB681F14-66CF-42E2-A267-2E530A7E1895";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "F6EECD8C-9AC9-4D93-B146-687751AD014A";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "NUOVARIGA";
    MDP.Name = "NuovaRiga";
    MDP.UIName = "Nuova Riga";
    MDP.GUID = "32470B1C-65EC-4165-AA95-8F8DDABA44CC";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "TIPOVAR";
    MDP.Name = "TIPOVAR";
    MDP.UIName = "TIPO VAR";
    MDP.GUID = "A1EDDDAA-776B-44A9-8B3B-DDBA7E051192";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "TIPO_VAR";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "CONFERMATRAG";
    MDP.Name = "CONFERMATORAG";
    MDP.UIName = "CONFERMATO RAG";
    MDP.GUID = "98072D27-E73B-4D58-BAF3-B7B0756DA901";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "CONFERMATO_RAG";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "ANNOIMP";
    MDP.Name = "ANNOIMP";
    MDP.UIName = "ANNO IMP";
    MDP.GUID = "DEDCFEA1-E720-4DB2-AAB3-58675FEC3C4E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_IMP";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "NUMEROIMP";
    MDP.Name = "NUMEROIMP";
    MDP.UIName = "NUMERO IMP";
    MDP.GUID = "E00595DD-21B5-44A2-BC85-09FA210E44A4";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_IMP";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "FINANZIAMENT";
    MDP.Name = "FINANZIAMENTO";
    MDP.UIName = "FINANZIAMENTO";
    MDP.GUID = "6900E926-BDB0-4E3C-A4CC-37C89EFE6B4A";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Piani", 4);
    MDP.LinkedDoc = DOC;
    DOC.SetName("PIANICRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Piani.PIANI_PROGREIMPUTA, Varpiani.VARPIANI_PROGREIMPUTA);
    DOC.SetLinkedProp(1, Piani.PIANI_CRONOPROGRID, Varpiani.VARPIANI_CRONOPROGRID);
    DOC.SetLinkedProp(2, Piani.PIANI_ESERCIZIPLUR, Varpiani.VARPIANI_ESERCIZIPLUR);
    DOC.SetLinkedProp(3, Piani.PIANI_FINANZIAMENT, Varpiani.VARPIANI_FINANZIAMENT);
    MDP.DBCode = "FINANZIAMENTO";
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "ESERCIENTRAT";
    MDP.Name = "ESERCIZIOENTRATA";
    MDP.UIName = "ESERCIZIO ENTRATA";
    MDP.GUID = "0A6E9EE4-044B-48EB-94E4-9C00775A9AAB";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_ENTRATA";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "LOG";
    MDP.Name = "LOG";
    MDP.UIName = "LOG";
    MDP.GUID = "B2074486-4366-4A70-9938-A26AA2EF8C76";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 2000;
    MDP.vScale = 0;
    MDP.DBCode = "LOG";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "VARIMPGENERA";
    MDP.Name = "VARIMPGENERATA";
    MDP.UIName = "VARIMP GENERATA";
    MDP.GUID = "9C75C5BD-7E19-4AF7-8F3F-02CBFC986A87";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "VARIMP_GENERATA";
    MDP = new DOMDProp();
    MDOVarpiani.SetProp(23,MDP);
    MDP.Index = 23;
    MDP.ObjTag = "PROGVARIPROV";
    MDP.Name = "PROGRVARIMPPROVENIENZA";
    MDP.UIName = "PROGR VARIMP PROVENIENZA";
    MDP.GUID = "6602A1EF-7BF1-40D4-AA0F-9292FFC938CD";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_VARIMP_PROVENIENZA";
    MDOVarpiani.SetNumColl(0);
    return MDOVarpiani;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_Varpiani();
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
      if (Idx==VARPIANI_PROGRESSIVAR) { setPROGRESSIVAR(NewValue); break fine; }
      if (Idx==VARPIANI_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==VARPIANI_PROGREIMPUTA) { setPROGREIMPUTA(NewValue); break fine; }
      if (Idx==VARPIANI_ESERCIZIPLUR) { setESERCIZIPLUR(NewValue); break fine; }
      if (Idx==VARPIANI_ANNOVAR) { setANNOVAR(NewValue); break fine; }
      if (Idx==VARPIANI_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==VARPIANI_DESCRIZIONE) { setDESCRIZIONE(NewValue); break fine; }
      if (Idx==VARPIANI_DATAREGISTRA) { setDATAREGISTRA(NewValue); break fine; }
      if (Idx==VARPIANI_VARIAZGENERA) { setVARIAZGENERA(NewValue); break fine; }
      if (Idx==VARPIANI_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==VARPIANI_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==VARPIANI_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==VARPIANI_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==VARPIANI_NUOVARIGA) { setNUOVARIGA(NewValue); break fine; }
      if (Idx==VARPIANI_TIPOVAR) { setTIPOVAR(NewValue); break fine; }
      if (Idx==VARPIANI_CONFERMATRAG) { setCONFERMATRAG(NewValue); break fine; }
      if (Idx==VARPIANI_ANNOIMP) { setANNOIMP(NewValue); break fine; }
      if (Idx==VARPIANI_NUMEROIMP) { setNUMEROIMP(NewValue); break fine; }
      if (Idx==VARPIANI_FINANZIAMENT) { setFINANZIAMENT(NewValue); break fine; }
      if (Idx==VARPIANI_ESERCIENTRAT) { setESERCIENTRAT(NewValue); break fine; }
      if (Idx==VARPIANI_LOG) { setLOG(NewValue); break fine; }
      if (Idx==VARPIANI_VARIMPGENERA) { setVARIMPGENERA(NewValue); break fine; }
      if (Idx==VARPIANI_PROGVARIPROV) { setPROGVARIPROV(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    return super.GetCollByIndex(Idx);
  }
  
  
  // **********************************************
  // Get Master Query used to load a document
  // **********************************************
  public void GetMasterQuery(String SqlText[], IDVariant MasterTableAlias, LinkedList ColAssignment)
  {
    StringBuffer SQL;
    
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_VAR as REVAPICRPRVA, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as REVAPICRCRID, ");
    SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as REVAPICRPRIM, ");
    SQL.append("  A.ESERCIZIO_PLUR as REVAPICRESPL, ");
    SQL.append("  A.ANNO_VAR as REVAPICRANVA, ");
    SQL.append("  A.IMPORTO as RECVARPICRIM, ");
    SQL.append("  A.DESCRIZIONE as RECVARPICRDE, ");
    SQL.append("  A.DATA_REGISTRAZIONE as REVAPICRDARE, ");
    SQL.append("  A.VARIAZIONE_GENERATA as REVAPICRVAGE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as REVAPICRUTIN, ");
    SQL.append("  A.DATA_INSERIMENTO as REVAPICRDAIN, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as REVAPICRUTUA, ");
    SQL.append("  A.DATA_ULTIMO_AGG as REVAPICRDAUA, ");
    SQL.append("  A.TIPO_VAR as REVAPICRTIVA, ");
    SQL.append("  A.CONFERMATO_RAG as REVAPICRCORA, ");
    SQL.append("  A.FINANZIAMENTO as RECORVARFINA, ");
    SQL.append("  A.ESERCIZIO_ENTRATA as REVAPICRESE1, ");
    SQL.append("  A.LOG as RECVARPICRLO, ");
    SQL.append("  A.ANNO_IMP as REVAPICRANIM, ");
    SQL.append("  A.NUMERO_IMP as REVAPICRNUIM, ");
    SQL.append("  A.VARIMP_GENERATA as REVAPICRVAG1, ");
    SQL.append("  A.PROGR_VARIMP_PROVENIENZA as REVAPICRPRVP ");
    SqlText[0] = SQL.toString();
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VAR_PIANI_CRONOPROGRAMMI A ");
    SqlText[1] = SQL.toString();
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_VAR = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SqlText[2] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[3] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[4] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[5] = SQL.toString();
    MasterTableAlias.set(new IDVariant("A"));
    ColAssignment.add(new Integer(VARPIANI_PROGRESSIVAR));
    ColAssignment.add(new Integer(VARPIANI_CRONOPROGRID));
    ColAssignment.add(new Integer(VARPIANI_PROGREIMPUTA));
    ColAssignment.add(new Integer(VARPIANI_ESERCIZIPLUR));
    ColAssignment.add(new Integer(VARPIANI_ANNOVAR));
    ColAssignment.add(new Integer(VARPIANI_IMPORTO));
    ColAssignment.add(new Integer(VARPIANI_DESCRIZIONE));
    ColAssignment.add(new Integer(VARPIANI_DATAREGISTRA));
    ColAssignment.add(new Integer(VARPIANI_VARIAZGENERA));
    ColAssignment.add(new Integer(VARPIANI_UTENTEINSERI));
    ColAssignment.add(new Integer(VARPIANI_DATAINSERIME));
    ColAssignment.add(new Integer(VARPIANI_UTENTULTIAGG));
    ColAssignment.add(new Integer(VARPIANI_DATAULTIMAGG));
    ColAssignment.add(new Integer(VARPIANI_TIPOVAR));
    ColAssignment.add(new Integer(VARPIANI_CONFERMATRAG));
    ColAssignment.add(new Integer(VARPIANI_FINANZIAMENT));
    ColAssignment.add(new Integer(VARPIANI_ESERCIENTRAT));
    ColAssignment.add(new Integer(VARPIANI_LOG));
    ColAssignment.add(new Integer(VARPIANI_ANNOIMP));
    ColAssignment.add(new Integer(VARPIANI_NUMEROIMP));
    ColAssignment.add(new Integer(VARPIANI_VARIMPGENERA));
    ColAssignment.add(new Integer(VARPIANI_PROGVARIPROV));
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
    
      if (PropIdx==VARPIANI_PROGRESSIVAR)
      {
        return "A.PROGRESSIVO_VAR";
      }
      if (PropIdx==VARPIANI_CRONOPROGRID)
      {
        return "A.CRONOPROGRAMMA_ID";
      }
      if (PropIdx==VARPIANI_PROGREIMPUTA)
      {
        return "A.PROGRESSIVO_IMPUTAZIONE";
      }
      if (PropIdx==VARPIANI_ESERCIZIPLUR)
      {
        return "A.ESERCIZIO_PLUR";
      }
      if (PropIdx==VARPIANI_ANNOVAR)
      {
        return "A.ANNO_VAR";
      }
      if (PropIdx==VARPIANI_IMPORTO)
      {
        return "A.IMPORTO";
      }
      if (PropIdx==VARPIANI_DESCRIZIONE)
      {
        return "A.DESCRIZIONE";
      }
      if (PropIdx==VARPIANI_DATAREGISTRA)
      {
        return "A.DATA_REGISTRAZIONE";
      }
      if (PropIdx==VARPIANI_VARIAZGENERA)
      {
        return "A.VARIAZIONE_GENERATA";
      }
      if (PropIdx==VARPIANI_UTENTEINSERI)
      {
        return "A.UTENTE_INSERIMENTO";
      }
      if (PropIdx==VARPIANI_DATAINSERIME)
      {
        return "A.DATA_INSERIMENTO";
      }
      if (PropIdx==VARPIANI_UTENTULTIAGG)
      {
        return "A.UTENTE_ULTIMO_AGG";
      }
      if (PropIdx==VARPIANI_DATAULTIMAGG)
      {
        return "A.DATA_ULTIMO_AGG";
      }
      if (PropIdx==VARPIANI_TIPOVAR)
      {
        return "A.TIPO_VAR";
      }
      if (PropIdx==VARPIANI_CONFERMATRAG)
      {
        return "A.CONFERMATO_RAG";
      }
      if (PropIdx==VARPIANI_ANNOIMP)
      {
        return "A.ANNO_IMP";
      }
      if (PropIdx==VARPIANI_NUMEROIMP)
      {
        return "A.NUMERO_IMP";
      }
      if (PropIdx==VARPIANI_FINANZIAMENT)
      {
        return "A.FINANZIAMENTO";
      }
      if (PropIdx==VARPIANI_ESERCIENTRAT)
      {
        return "A.ESERCIZIO_ENTRATA";
      }
      if (PropIdx==VARPIANI_LOG)
      {
        return "A.LOG";
      }
      if (PropIdx==VARPIANI_VARIMPGENERA)
      {
        return "A.VARIMP_GENERATA";
      }
      if (PropIdx==VARPIANI_PROGVARIPROV)
      {
        return "A.PROGR_VARIMP_PROVENIENZA";
      }
    return "";
  } 


  // **********************************************
  // Class factory
  // **********************************************
  public static Varpiani CreateVarpiani()
  {
    return CreateVarpiani(null, null);
  }
  
  public static Varpiani CreateVarpiani(Object mainfrm, Object imdb) { return CreateVarpiani(mainfrm, imdb, null); } 
  public static Varpiani CreateVarpiani(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    Varpiani newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new Varpiani((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (Varpiani)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (Varpiani)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateVarpiani", 
                  "Can't find component " + CompNameSpace + " while handling Varpiani class factory");
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
    DOMDObj MD = GetDOMD_Varpiani();
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
    return (obj instanceof Varpiani);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Varpiani.class.getName() : (Glb.ClassWithPackage(Varpiani.class) ? Varpiani.class.getName().substring(Varpiani.class.getPackage().getName().length() + 1) : Varpiani.class.getName()));
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
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Varpiani", "AfterLoad", _e);
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
  // On Init
  // Notificato quando il documento è in fase di inizializzazione
  // **********************************************************************
  public void OnInit()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Init Body
      // Corpo Procedura
      // 
      setPROGRESSIVAR((new IDVariant(0, IDVariant.DECIMAL)));
      setDATAREGISTRA(IDL.Today());
      setUTENTEINSERI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      setDATAINSERIME(IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Varpiani", "OnInit", _e);
    }
  }

  // **********************************************************************
  // On Inserting
  // Evento notificato al documento quando varia la proprietà
  // Inserted
  // **********************************************************************
  public void OnInserting()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Inserting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(getANNOVAR()))
      {
        setANNOVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Varpiani", "OnInserting", _e);
    }
  }

  // **********************************************************************
  // Before Save
  // Evento notificato al documento durante le fasi iniziali
  // della procedura di salvataggio dei documenti
  // Skip - Input/Output
  // Cancel - Input/Output
  // Phase - Input
  // **********************************************************************
  public void BeforeSave(IDVariant Skip, IDVariant Cancel, IDVariant Phase)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Before Save Body
      // Corpo Procedura
      // 
      if (!(this.Deleted()) && (this.IsModified() || this.Inserted()))
      {
        if (IDL.NullValue(getESERCIENTRAT(),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Esercizio Entrata Obbligatorio per Variazione da Cronoprogramma"));
          AddDocError(v_AVVISO.stringValue()); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        // 
        // Blocco l'inserimento per le Variazioni per Incremento
        // (2) se l'anno plur è diverso dall'esercizio entrata
        // 
        if (getTIPOVAR().equals((new IDVariant(2)), true))
        {
          if (getESERCIZIPLUR().compareTo(IDL.NullValue(getESERCIENTRAT(),(new IDVariant(-1))), true)!=0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Esercizio Entrata diverso da Anno Plur. per Variazione per Incremento."));
            AddDocError(v_AVVISO.stringValue()); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
          if (getIMPORTO().compareTo((new IDVariant(0)), true)<=0)
          {
            IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
            v_S2 = (new IDVariant("Importo non Positivo per Variazione per Incremento."));
            AddDocError(v_S2.stringValue()); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        if (getTIPOVAR().equals((new IDVariant(4)), true))
        {
          if (getIMPORTO().compareTo((new IDVariant(0)), true)>=0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Importo non Negativo per Variazione di Economia"));
            AddDocError(v_AVVISO.stringValue()); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
      if (this.Updated() && !(this.Inserted()))
      {
        setUTENTULTIAGG(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        setDATAULTIMAGG(IDL.Today());
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("BeforeSave - "+_e.getMessage(),_e);
    }
  }

  // **********************************************************************
  // On End Transaction
  // Evento notificato al documento quando la transazione
  // viene chiusa
  // **********************************************************************
  public void OnEndTrans()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On End Transaction Body
      // Corpo Procedura
      // 
      // 
      // Dovrebbe stare nell'on init ma stranamente messo lì
      // non funziona
      // 
      if (this.Inserted())
      {
        setPROGRESSIVAR((new IDVariant(0, IDVariant.DECIMAL)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Varpiani", "OnEndTransaction", _e);
    }
  }

  
}  
