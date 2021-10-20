// **********************************************
// Selettore Beneficiario
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.math.*;

public class SelettoreBeneficiario extends IDObject
{	
	private MyWebEntryPoint MainFrm;
	private IMDBObj IMDB;

	// Definition of Global Variables
  public IDVariant TROVATO = new IDVariant(0,IDVariant.STRING);
  private IDVariant PARAMETRO = new IDVariant(0,IDVariant.STRING);
  public IDVariant CODICE = new IDVariant(0,IDVariant.FLOAT);
  public IDVariant RAGIONSOCIAL = new IDVariant(0,IDVariant.STRING);
  public IDVariant DATAFILTRBEN = new IDVariant(0,IDVariant.DATETIME);
  public IDVariant NUMREC = new IDVariant(0,IDVariant.INTEGER);

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
  // Default constructor
  // **********************************************
  public SelettoreBeneficiario()
  {
  }
  
	// **********************************************
	// Initialize common framework object
	// **********************************************
	public SelettoreBeneficiario(Object w, Object imdb)
	{
		SetMainFrm(w, imdb);
	}

  public void SetMainFrm(Object mainfrm, Object imdb)
	{
    MainFrm = (MyWebEntryPoint)mainfrm;
    IMDB = (IMDBObj)imdb;
    //
    //
    //
    super.SetMainFrm(mainfrm, imdb);
	}
	
  // **********************************************************************
  // Set Param
  // Explain which processing is carried out by this procedure
  // Parametro:  - Input
  // Fase:  - Input
  // Inserire Beneficiario:  - Input
  // Data Filtro Ben:  - Input
  // **********************************************************************
  public int SetParam (IDVariant Parametro, IDVariant Fase, IDVariant InserireBeneficiario, IDVariant DataFiltroBen)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMRECORD = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Set Param Body
      // Procedure Body
      // 
      PARAMETRO = new IDVariant(Parametro);
      if (IDL.IsNull(PARAMETRO) || Parametro.equals((new IDVariant("")), true))
      {
        return 0;
      }
      // 
      // codice numerico: codice, partita IVA oppure codice
      // fiscale
      // 
      if (IDL.IsNumber(PARAMETRO))
      {
        // 
        // meno di 11 cifre: codice
        // 
        if (IDL.Length(PARAMETRO).compareTo((new IDVariant(11)), true)<0)
        {
          v_NUMRECORD = RicercaBeneficiario(new IDVariant(IDL.ToInteger(PARAMETRO),IDVariant.FLOAT), (new IDVariant()), (new IDVariant()), (new IDVariant()), DataFiltroBen);
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, new IDVariant(IDL.ToInteger(PARAMETRO),IDVariant.FLOAT));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, (new IDVariant()));
        }
        // 
        // esattamente 11 cifre: partita iva
        // 
        if (IDL.Length(PARAMETRO).equals((new IDVariant(11)), true))
        {
          v_NUMRECORD = RicercaBeneficiario((new IDVariant()), (new IDVariant()), (new IDVariant()), PARAMETRO, DataFiltroBen);
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, new IDVariant(PARAMETRO));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, (new IDVariant()));
          if (v_NUMRECORD.equals((new IDVariant(0)), true))
          {
            v_NUMRECORD = RicercaBeneficiario((new IDVariant()), (new IDVariant()), PARAMETRO, (new IDVariant()), DataFiltroBen);
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, new IDVariant(PARAMETRO));
          }
        }
        // 
        // piu' di 11 cifre: codice fiscale
        // 
        if (IDL.Length(PARAMETRO).compareTo((new IDVariant(11)), true)>0)
        {
          v_NUMRECORD = RicercaBeneficiario((new IDVariant()), (new IDVariant()), PARAMETRO, (new IDVariant()), DataFiltroBen);
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, new IDVariant(PARAMETRO));
        }
      }
      else
      {
        v_NUMRECORD = RicercaBeneficiario((new IDVariant()), (new IDVariant()), PARAMETRO, (new IDVariant()), DataFiltroBen);
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, new IDVariant(PARAMETRO));
        if (v_NUMRECORD.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMECODIC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMRAGSOC, 0, IDL.Add(PARAMETRO, (new IDVariant("%"))));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMPARIVA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_ROWNAMCODFIS, 0, (new IDVariant()));
          v_NUMRECORD = RicercaBeneficiario((new IDVariant()), IDL.Add(PARAMETRO, (new IDVariant("%"))), (new IDVariant()), (new IDVariant()), DataFiltroBen);
        }
      }
      if (v_NUMRECORD.equals((new IDVariant(0)), true))
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Soggetto non trovato!", IDVariant.STRING));
        IDVariant v_INSSOGG = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  CF4WEB_ABILITA_INS_BEN(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Fase, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL) as CDCAIBSMFSUN ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_INSSOGG = QV.Get("CDCAIBSMFSUN", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_INSSOGG.equals((new IDVariant("SI")), true) && InserireBeneficiario.booleanValue())
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Il Soggetto indicato non è stato trovato, si desidera inserire una nuova registrazione?", IDVariant.STRING));
          if (MainFrm.MessageConfirm(v_SMS))
          {
            IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, new IDVariant(Parametro));
            MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
          }
        }
        else
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          TROVATO = (new IDVariant("NO"));
        }
      }
      if (v_NUMRECORD.equals((new IDVariant(1)), true))
      {
        TROVATO = (new IDVariant("SI"));
      }
      if (v_NUMRECORD.compareTo((new IDVariant(1)), true)>0)
      {
        CODICE = (new IDVariant());
        RAGIONSOCIAL = (new IDVariant());
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI9, IMDBDef1.FLD_PARAMETRI9_RONADAFIDAAL, 0, new IDVariant(DataFiltroBen));
        MainFrm.Show(MyGlb.FRM_SCELSOGGOMON, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "SetParam", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ricerca Beneficiario
  // Ricerca Beneficiario restituisce la count
  // Codice:  - Input
  // Ragione Sociale:  - Input
  // Codice Fiscale:  - Input
  // Partita IVA:  - Input
  // Data Filtro Ben:  - Input
  // **********************************************************************
  public IDVariant RicercaBeneficiario (IDVariant Codice, IDVariant RagioneSociale, IDVariant CodiceFiscale, IDVariant PartitaIVA, IDVariant DataFiltroBen)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CODICEBEN = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_RAGSOC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ricerca Beneficiario Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINBENCODICE, ");
      SQL.append("  MIN(A.RAGIONE_SOCIALE_ESTESA) as MINBENRASOES, ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BEN A ");
      SQL.append("where (NVL(A.CODICE, -1) = NVL(NVL(" + IDL.CSql(Codice, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.CODICE), -1)) ");
      SQL.append("and   (UPPER(NVL(A.RAGIONE_SOCIALE_ESTESA, '-')) LIKE UPPER(NVL(NVL(" + IDL.CSql(RagioneSociale, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A.RAGIONE_SOCIALE_ESTESA), '-'))) ");
      SQL.append("and   (NVL(A.CODICE_FISCALE, '-') LIKE NVL(NVL(" + IDL.CSql(CodiceFiscale, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A.CODICE_FISCALE), '-')) ");
      SQL.append("and   (NVL(A.PARTITA_IVA, '-') LIKE NVL(NVL(" + IDL.CSql(PartitaIVA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A.PARTITA_IVA), '-')) ");
      SQL.append("and   ((NVL(" + IDL.CSql(DataFiltroBen, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE )) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
      SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= NVL(" + IDL.CSql(DataFiltroBen, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE ))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICEBEN = QV.Get("MINBENCODICE", IDVariant.FLOAT) ;
        v_RAGSOC = QV.Get("MINBENRASOES", IDVariant.STRING) ;
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      CODICE = new IDVariant(v_CODICEBEN);
      RAGIONSOCIAL = new IDVariant(v_RAGSOC);
      return v_NUMREC;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "RicercaBeneficiario", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Beneficiario
  // Ritorna il codice del Beneficiario
  // **********************************************************************
  public IDVariant GetBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Beneficiario Body
      // Procedure Body
      // 
      return CODICE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "GetBeneficiario", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Ragione Sociale
  // Ritorna la ragione sociale del soggetto
  // **********************************************************************
  public IDVariant GetRagioneSociale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Ragione Sociale Body
      // Procedure Body
      // 
      return RAGIONSOCIAL;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "GetRagioneSociale", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Trovato
  // Ritorna il valore della variabile trovato
  // **********************************************************************
  public IDVariant GetTrovato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Trovato Body
      // Procedure Body
      // 
      return TROVATO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "GetTrovato", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Azzera Valori
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AzzeraValori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Azzera Valori Body
      // Procedure Body
      // 
      PARAMETRO = (new IDVariant());
      CODICE = (new IDVariant());
      RAGIONSOCIAL = (new IDVariant());
      NUMREC = (new IDVariant());
      TROVATO = (new IDVariant());
      DATAFILTRBEN = (new IDVariant());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelettoreBeneficiario", "AzzeraValori", _e);
      return -1;
    }
  }

}
