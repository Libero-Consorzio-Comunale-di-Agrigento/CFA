// **********************************************
// Cronoprogramma
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

public class Cronoprogramma extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int CRONOPROGRA1_CRONOPROGRID = 1;
  public static int CRONOPROGRA1_ESERCIISCRIZ = 2;
  public static int CRONOPROGRA1_OPERA = 3;
  public static int CRONOPROGRA1_IMPORTINIZIA = 4;
  public static int CRONOPROGRA1_IMPORTATTUAL = 5;
  public static int CRONOPROGRA1_DEFINITO = 6;
  public static int CRONOPROGRA1_CONFERMATRAG = 7;
  public static int CRONOPROGRA1_DETERMINATO = 8;
  public static int CRONOPROGRA1_CRONIDNONDEF = 9;
  public static int CRONOPROGRA1_UTENTEINSERI = 10;
  public static int CRONOPROGRA1_DATAINSERIME = 11;
  public static int CRONOPROGRA1_UTENTULTIAGG = 12;
  public static int CRONOPROGRA1_DATAULTIMAGG = 13;
  public static int CRONOPROGRA1_NUOVARIGA = 14;
  public static int CRONOPROGRA1_ESERCIENTRAT = 15;
  public static int CRONOPROGRA1_ENTRESIGDIFF = 16;
  public static int CRONOPROGRA1_ANNODEL = 17;
  public static int CRONOPROGRA1_NUMERODEL = 18;
  public static int CRONOPROGRA1_SEDEDEL = 19;
  public static int CRONOPROGRA1_DATAREGISTRA = 20;
  public static int CRONOPROGRA1_IMPUTACRONOP = 1;
  public static int MAX_VARS = 20;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public com.progamma.doc.IDCollection IMPUTACRONOP = new com.progamma.doc.IDCollection();
  public IDVariant getCRONOPROGRID() { return GetPropDirect(CRONOPROGRA1_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_CRONOPROGRID,NewValue,false); }
  public IDVariant getESERCIISCRIZ() { return GetPropDirect(CRONOPROGRA1_ESERCIISCRIZ); }
  public void setESERCIISCRIZ(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_ESERCIISCRIZ,NewValue,false); }
  public IDVariant getOPERA() { return GetPropDirect(CRONOPROGRA1_OPERA); }
  public void setOPERA(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_OPERA,NewValue,false); }
  public IDVariant getIMPORTINIZIA() { return GetPropDirect(CRONOPROGRA1_IMPORTINIZIA); }
  public void setIMPORTINIZIA(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_IMPORTINIZIA,NewValue,false); }
  public IDVariant getIMPORTATTUAL() { return GetPropDirect(CRONOPROGRA1_IMPORTATTUAL); }
  public void setIMPORTATTUAL(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_IMPORTATTUAL,NewValue,false); }
  public IDVariant getDEFINITO() { return GetPropDirect(CRONOPROGRA1_DEFINITO); }
  public void setDEFINITO(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_DEFINITO,NewValue,false); }
  public IDVariant getCONFERMATRAG() { return GetPropDirect(CRONOPROGRA1_CONFERMATRAG); }
  public void setCONFERMATRAG(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_CONFERMATRAG,NewValue,false); }
  public IDVariant getDETERMINATO() { return GetPropDirect(CRONOPROGRA1_DETERMINATO); }
  public void setDETERMINATO(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_DETERMINATO,NewValue,false); }
  public IDVariant getCRONIDNONDEF() { return GetPropDirect(CRONOPROGRA1_CRONIDNONDEF); }
  public void setCRONIDNONDEF(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_CRONIDNONDEF,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(CRONOPROGRA1_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(CRONOPROGRA1_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(CRONOPROGRA1_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(CRONOPROGRA1_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_DATAULTIMAGG,NewValue,false); }
  public IDVariant getNUOVARIGA() { return GetPropDirect(CRONOPROGRA1_NUOVARIGA); }
  public void setNUOVARIGA(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_NUOVARIGA,NewValue,false); }
  public IDVariant getESERCIENTRAT() { return GetPropDirect(CRONOPROGRA1_ESERCIENTRAT); }
  public void setESERCIENTRAT(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_ESERCIENTRAT,NewValue,false); }
  public IDVariant getENTRESIGDIFF() { return GetPropDirect(CRONOPROGRA1_ENTRESIGDIFF); }
  public void setENTRESIGDIFF(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_ENTRESIGDIFF,NewValue,false); }
  public IDVariant getANNODEL() { return GetPropDirect(CRONOPROGRA1_ANNODEL); }
  public void setANNODEL(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_ANNODEL,NewValue,false); }
  public IDVariant getNUMERODEL() { return GetPropDirect(CRONOPROGRA1_NUMERODEL); }
  public void setNUMERODEL(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_NUMERODEL,NewValue,false); }
  public IDVariant getSEDEDEL() { return GetPropDirect(CRONOPROGRA1_SEDEDEL); }
  public void setSEDEDEL(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_SEDEDEL,NewValue,false); }
  public IDVariant getDATAREGISTRA() { return GetPropDirect(CRONOPROGRA1_DATAREGISTRA); }
  public void setDATAREGISTRA(IDVariant NewValue) { ChangePropDirect(CRONOPROGRA1_DATAREGISTRA,NewValue,false); }
    
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
  public Cronoprogramma()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Cronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOCronoprogramma;
  public synchronized static DOMDObj GetDOMD_Cronoprogramma()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOCronoprogramma != null)
      return MDOCronoprogramma;
    else
      MDOCronoprogramma = new DOMDObj();
    MDOCronoprogramma.ObjTag = "Cronoprogramma";
    MDOCronoprogramma.ObjGUID = "4A92D889-1DE9-49D5-AAF7-B535785F042C";
    MDOCronoprogramma.UIName = "Cronoprogramma";
    MDOCronoprogramma.Services = 0;
    MDOCronoprogramma.BaseProps = 0;
    MDOCronoprogramma.BaseColls = 0;
    MDOCronoprogramma.DBCode = "TESTATE_CRONOPROGRAMMI";
    MDOCronoprogramma.DBSchema = ".";
    MDOCronoprogramma.SequenceCode = "TESTATE_CRONOPROGRAMMI_$F";
    MDOCronoprogramma.DBType = 4;
    MDOCronoprogramma.AddQuery("F0451DD9-A553-43AF-91FD-A4D5282D7036", "TESTATECRONOPROGRAMMI_PK", "select 1 from TESTATE_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~", "~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~", 1);
    MDOCronoprogramma.AddQuery("EA97B98B-941B-4C0D-BFD9-D73F491B39FD", "IMPUTAZIONICRONOPROGRAMMI_TESTATECRONOPROGRAMMI", "select 1 from IMPUTAZIONI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~", "IMPUTAZIONI CRONOPROGRAMMI§~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~", 4);
    MDOCronoprogramma.SetNumProp(20);
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "4C213C85-CA89-48D3-852B-FEB1581F00D0";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ESERCIISCRIZ";
    MDP.Name = "ESERCIZIOISCRIZIONE";
    MDP.UIName = "ESERCIZIO ISCRIZIONE";
    MDP.GUID = "0336358F-8ED5-49C2-800D-C1091316947C";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_ISCRIZIONE";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "OPERA";
    MDP.Name = "OPERA";
    MDP.UIName = "OPERA";
    MDP.GUID = "012E3A89-6AE3-42C4-A858-BE46F62395DC";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "OPERA";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "IMPORTINIZIA";
    MDP.Name = "IMPORTOINIZIALE";
    MDP.UIName = "IMPORTO INIZIALE";
    MDP.GUID = "F932ECCF-5254-4FA1-8C14-967C9859CBBA";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO_INIZIALE";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "IMPORTATTUAL";
    MDP.Name = "IMPORTOATTUALE";
    MDP.UIName = "IMPORTO ATTUALE";
    MDP.GUID = "2D9E0E5C-9F00-4DDD-A087-E3F6B9ECE5BB";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO_ATTUALE";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "DEFINITO";
    MDP.Name = "DEFINITO";
    MDP.UIName = "DEFINITO";
    MDP.GUID = "A3DD0FB9-3DA5-42C6-9DC9-BFB71A6DE8CA";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "DEFINITO";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "CONFERMATRAG";
    MDP.Name = "CONFERMATORAG";
    MDP.UIName = "CONFERMATO RAG";
    MDP.GUID = "B4A6858F-123C-4624-8C56-28082D1DE02C";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "CONFERMATO_RAG";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "DETERMINATO";
    MDP.Name = "DETERMINATO";
    MDP.UIName = "DETERMINATO";
    MDP.GUID = "33573A69-53BA-46D2-99FC-4C208927D843";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "DETERMINATO";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "CRONIDNONDEF";
    MDP.Name = "CRONOPROGRAMMAIDNONDEF";
    MDP.UIName = "CRONOPROGRAMMA ID NON DEF";
    MDP.GUID = "51019819-B094-4400-99AC-7E03773A1905";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "CRONOPROGRAMMA_ID_NON_DEF";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "F67313A6-4CF9-4ED7-976A-6492B374D6D1";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "E0B7E620-4B7E-42C1-BA28-A9E3305BA7EB";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "E29AA9D0-C18C-4104-817C-F7CAB9E81029";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "294B3F34-4913-492B-9551-2EC2CDF6BABB";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "NUOVARIGA";
    MDP.Name = "NuovaRiga";
    MDP.UIName = "Nuova Riga";
    MDP.GUID = "6F32FF71-5605-46E8-A1C9-B85F7DF661EF";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "ESERCIENTRAT";
    MDP.Name = "ESERCIZIOENTRATA";
    MDP.UIName = "ESERCIZIO ENTRATA";
    MDP.GUID = "D4ECC98B-D550-405C-9D3D-2145E216DE53";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_ENTRATA";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "ENTRESIGDIFF";
    MDP.Name = "ENTRATAESIGDIFF";
    MDP.UIName = "ENTRATA ESIG DIFF";
    MDP.GUID = "93DD59FD-0C02-4419-998E-F28F3C9D805D";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ENTRATA_ESIG_DIFF";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "ANNODEL";
    MDP.Name = "ANNODEL";
    MDP.UIName = "ANNO DEL";
    MDP.GUID = "EEFFFF4B-FC29-4369-ACA8-63C0088DB8B9";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_DEL";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "NUMERODEL";
    MDP.Name = "NUMERODEL";
    MDP.UIName = "NUMERO DEL";
    MDP.GUID = "FC66EC57-C2EA-4D5C-BAC3-A94EBEC45C38";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 6;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_DEL";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "SEDEDEL";
    MDP.Name = "SEDEDEL";
    MDP.UIName = "SEDE DEL";
    MDP.GUID = "54F72112-D569-4834-8E17-028818B7A04D";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 255;
    MDP.vScale = 0;
    MDP.DBCode = "SEDE_DEL";
    MDP = new DOMDProp();
    MDOCronoprogramma.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "DATAREGISTRA";
    MDP.Name = "DATAREGISTRAZIONE";
    MDP.UIName = "DATA REGISTRAZIONE";
    MDP.GUID = "B9E0DB4D-65DD-47E5-B305-01A31A3DA64A";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_REGISTRAZIONE";
    MDOCronoprogramma.SetNumColl(1);
    MDC = new DOMDColl();
    MDOCronoprogramma.SetColl(1,MDC);
    MDC.Index = 1;
    MDC.Name = "IMPUTAZIONICRONOPROGRAMMI";
    MDC.ChildrenName = "ImputazioniCrono";
    MDC.Visible = true;
    MDC.PKColl.add("CRONOPROGRID");
    MDC.FKColl.add("CRONOPROGRID");
    return MDOCronoprogramma;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_Cronoprogramma();
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
      if (Idx==CRONOPROGRA1_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_ESERCIISCRIZ) { setESERCIISCRIZ(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_OPERA) { setOPERA(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_IMPORTINIZIA) { setIMPORTINIZIA(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_IMPORTATTUAL) { setIMPORTATTUAL(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_DEFINITO) { setDEFINITO(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_CONFERMATRAG) { setCONFERMATRAG(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_DETERMINATO) { setDETERMINATO(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_CRONIDNONDEF) { setCRONIDNONDEF(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_NUOVARIGA) { setNUOVARIGA(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_ESERCIENTRAT) { setESERCIENTRAT(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_ENTRESIGDIFF) { setENTRESIGDIFF(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_ANNODEL) { setANNODEL(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_NUMERODEL) { setNUMERODEL(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_SEDEDEL) { setSEDEDEL(NewValue); break fine; }
      if (Idx==CRONOPROGRA1_DATAREGISTRA) { setDATAREGISTRA(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    if (Idx==1+BASE_COLLS) return IMPUTACRONOP;
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
  public static Cronoprogramma CreateCronoprogramma()
  {
    return CreateCronoprogramma(null, null);
  }
  
  public static Cronoprogramma CreateCronoprogramma(Object mainfrm, Object imdb) { return CreateCronoprogramma(mainfrm, imdb, null); } 
  public static Cronoprogramma CreateCronoprogramma(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    Cronoprogramma newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new Cronoprogramma((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (Cronoprogramma)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (Cronoprogramma)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateCronoprogramma", 
                  "Can't find component " + CompNameSpace + " while handling Cronoprogramma class factory");
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
    DOMDObj MD = GetDOMD_Cronoprogramma();
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
    return (obj instanceof Cronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Cronoprogramma.class.getName() : (Glb.ClassWithPackage(Cronoprogramma.class) ? Cronoprogramma.class.getName().substring(Cronoprogramma.class.getPackage().getName().length() + 1) : Cronoprogramma.class.getName()));
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
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "AfterLoad", _e);
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
      MainFrm.MAXIDCRONO = (new IDVariant());
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
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
      if (Phase.compareTo((new IDVariant(0)), true)!=0)
      {
        Settotimputazioni();
      }
      if (IDL.NullValue(getSEDEDEL(),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(getNUMERODEL()) || IDL.IsNull(getANNODEL()))
      {
        if (IDL.NullValue(getSEDEDEL(),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(getNUMERODEL())) || !(IDL.IsNull(getANNODEL())))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera incompleta"));
          // if (ErrorCollection != null) ErrorCollection.add(v_AVVISO); 
          AddDocError(v_AVVISO.stringValue()); 
          // MainFrm.set_AlertMessage(v_AVVISO); 
          Cancel.set((new IDVariant(-1)));
        }
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
      Settid();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "OnEndTransaction", _e);
    }
  }

  // **********************************************************************
  // Getmaxprogressivo
  // **********************************************************************
  public IDVariant Getmaxprogressivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Getmaxprogressivo Body
      // Corpo Procedura
      // 
      IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
      ListIterator L2 = IMPUTACRONOP.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        ImputazioniCrono C2_IMPUTACRONOP = (ImputazioniCrono) L2.next();
        if (C2_IMPUTACRONOP.getPROGREIMPUTA().compareTo(v_MAX, true)>0)
        {
          v_MAX = C2_IMPUTACRONOP.getPROGREIMPUTA();
        }
      }
      return IDL.Add(v_MAX, (new IDVariant(1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "Getmaxprogressivo", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Tot Imputazioni
  // **********************************************************************
  public IDVariant GetTotImputazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Tot Imputazioni Body
      // Corpo Procedura
      // 
      IDVariant v_TOT = new IDVariant(0,IDVariant.DECIMAL);
      ListIterator L2 = IMPUTACRONOP.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        ImputazioniCrono C2_IMPUTACRONOP = (ImputazioniCrono) L2.next();
        v_TOT = IDL.Add(v_TOT, C2_IMPUTACRONOP.getIMPORTO());
      }
      return v_TOT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "GetTotImputazioni", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Settid
  // **********************************************************************
  private int Settid ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settid Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(getCRONOPROGRID()))
      {
        if (IDL.NullValue(MainFrm.MAXIDCRONO,(new IDVariant(0))).equals((new IDVariant(0)), true))
        {
          IDVariant v_VMAX = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(MAX(A.CRONOPROGRAMMA_ID), 0) as NUVAMATECCI0 ");
          SQL.append("from ");
          SQL.append("  TESTATE_CRONOPROGRAMMI A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMAX = QV.Get("NUVAMATECCI0", IDVariant.INTEGER) ;
          }
          QV.Close();
          MainFrm.MAXIDCRONO = new IDVariant(v_VMAX);
        }
        MainFrm.MAXIDCRONO = IDL.Add(MainFrm.MAXIDCRONO, (new IDVariant(1)));
        setCRONOPROGRID(new IDVariant(MainFrm.MAXIDCRONO));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "Settid", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settotimputazioni
  // **********************************************************************
  public int Settotimputazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settotimputazioni Body
      // Corpo Procedura
      // 
      if (new IDVariant(IMPUTACRONOP.Count()).compareTo((new IDVariant(0)), true)>0)
      {
        setIMPORTATTUAL(GetTotImputazioni());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogramma", "Settotimputazioni", _e);
      return -1;
    }
  }

  
}  
