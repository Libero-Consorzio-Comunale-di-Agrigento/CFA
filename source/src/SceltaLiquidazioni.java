// **********************************************
// Scelta Liquidazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaLiquidazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUMERO = 0;
  private static int GRP_PARAMETRI_DATA = 1;
  private static int GRP_PARAMETRI_ORDINAMENTO = 2;

  private static int PFL_PARAMETRI_LABEVUONUMSX = 0;
  private static int PFL_PARAMETRI_LABEVUONUMDX = 1;
  private static int PFL_PARAMETRI_LABEVUODATSX = 2;
  private static int PFL_PARAMETRI_LABEVUODATDX = 3;
  private static int PFL_PARAMETRI_LABEVUOORDDX = 4;
  private static int PFL_PARAMETRI_LABEVUOORDSX = 5;
  private static int PFL_PARAMETRI_DAL1 = 6;
  private static int PFL_PARAMETRI_AL1 = 7;
  private static int PFL_PARAMETRI_DAL = 8;
  private static int PFL_PARAMETRI_AL = 9;
  private static int PFL_PARAMETRI_ORDINAMENTO = 10;

  private static int PPQRY_PARAMETRI564 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 0;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 1;
  private static int PFL_LIQUIDAZIONI_DATA = 2;
  private static int PFL_LIQUIDAZIONI_CAPITOLO = 3;
  private static int PFL_LIQUIDAZIONI_ARTICOLO = 4;
  private static int PFL_LIQUIDAZIONI_NUMEROIMP = 5;
  private static int PFL_LIQUIDAZIONI_ANNOIMP = 6;
  private static int PFL_LIQUIDAZIONI_NUMEROSUBIMP = 7;
  private static int PFL_LIQUIDAZIONI_ANNOSUBIMP = 8;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 9;
  private static int PFL_LIQUIDAZIONI_INEMIS = 10;
  private static int PFL_LIQUIDAZIONI_BENEFICIARIO = 11;
  private static int PFL_LIQUIDAZIONI_NUMERODOC = 12;
  private static int PFL_LIQUIDAZIONI_ANNODOC = 13;
  private static int PFL_LIQUIDAZIONI_INFODOC = 14;
  private static int PFL_LIQUIDAZIONI_UFFICIO = 15;
  private static int PFL_LIQUIDAZIONI_SEDEDEL = 16;
  private static int PFL_LIQUIDAZIONI_NUMERODEL = 17;
  private static int PFL_LIQUIDAZIONI_ANNODEL = 18;
  private static int PFL_LIQUIDAZIONI_UNITAPROPONE = 19;
  private static int PFL_LIQUIDAZIONI_NUMEROPROPOS = 20;
  private static int PFL_LIQUIDAZIONI_ANNOPROPOSTA = 21;
  private static int PFL_LIQUIDAZIONI_NUMERODISTIN = 22;
  private static int PFL_LIQUIDAZIONI_ANNODISTINTA = 23;
  private static int PFL_LIQUIDAZIONI_FINANZIAMENT = 24;
  private static int PFL_LIQUIDAZIONI_LIQUIDALABEL = 25;
  private static int PFL_LIQUIDAZIONI_CAPITOLLABEL = 26;
  private static int PFL_LIQUIDAZIONI_IMPEGNOLABEL = 27;
  private static int PFL_LIQUIDAZIONI_SUBIMPEGLABE = 28;
  private static int PFL_LIQUIDAZIONI_DOCUMENLABEL = 29;
  private static int PFL_LIQUIDAZIONI_DELIBERLABEL = 30;
  private static int PFL_LIQUIDAZIONI_PROPOSTLABEL = 31;
  private static int PFL_LIQUIDAZIONI_DISTINTLABEL = 32;
  private static int PFL_LIQUIDAZIONI_TIPODISTINTA = 33;
  private static int PFL_LIQUIDAZIONI_FATANNOPROG = 34;
  private static int PFL_LIQUIDAZIONI_FATNUMERPROG = 35;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQRC = 36;
  private static int PFL_LIQUIDAZIONI_ANNOLIQRC = 37;
  private static int PFL_LIQUIDAZIONI_ETICLIQPRORC = 38;

  private static int PPQRY_LIQ58 = 0;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI316(IMDB);
    //
    //
    Init_PQRY_LIQ58(IMDB);
    Init_PQRY_PARAMETRI564(IMDB);
    Init_PQRY_PARAMETRI564_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI316(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI316, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI316, "TBL_PARAMETRI316");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI316,IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI316, 0);
  }

  private static void Init_PQRY_LIQ58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ58, 32);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ58, "PQRY_LIQ58");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQINEMIS, "LIQINEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQINEMIS,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQFINANZIAM, "LIQFINANZIAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQFINANZIAM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, "TIPO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQINFODOC, "LIQINFODOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_LIQINFODOC,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMEROLIQRC, "NUMEROLIQRC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_NUMEROLIQRC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNOLIQRC, "ANNOLIQRC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ58,IMDBDef14.PQSL_LIQ58_ANNOLIQRC,1,4,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ58, 0);
  }

  private static void Init_PQRY_PARAMETRI564(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI564, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI564, "PQRY_PARAMETRI564");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564,IMDBDef14.PQSL_PARAMETRI564_PARAMORDINAM,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI564, 0);
  }

  private static void Init_PQRY_PARAMETRI564_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI564_RS, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI564_RS, "PQRY_PARAMETRI564_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI564_RS,IMDBDef14.PQSL_PARAMETRI564_PARAMORDINAM,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaLiquidazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaLiquidazioni()
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
    FormIdx = MyGlb.FRM_SCELTALIQUID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EFD67CE5-9AFC-4D1E-A268-E61E640CFF5A";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 466;
    set_Caption(new IDVariant("Scelta Liquidazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 440;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.145455;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 812;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 812;
    Frames[2].FixedHeight = 64;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A99531A0-CAA5-4CA5-9FC0-A253CC799A43");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 416, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 812;
    Frames[3].Height = 376;
    Frames[3].Caption = "Liquidazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 376;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 3, "PAN_LIQUIDAZIONI");
    Frames[3].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4F676050-11B1-4C92-8BBD-570180EAE8C3");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 1564, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 1;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MODIFILIQUID+BaseCmdLinIdx)
      {
        ModificaLiquidazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVALIQUID1+BaseCmdLinIdx)
      {
        NuovaLiquidazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINLIQUID+BaseCmdLinIdx)
      {
        EliminaLiquidazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG198+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI35+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG198+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SCLIQCOLLA+BaseCmdLinIdx)
      {
        Collassailpannellodeiparametri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOM8+BaseCmdLinIdx)
      {
        AggiornamValoriComuni();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI316, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTALIQUID_PARAMETRI564();
      }
      PAN_LIQUIDAZIONI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaLiquidazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaLiquidazioni.class.getName() : (Glb.ClassWithPackage(SceltaLiquidazioni.class) ? SceltaLiquidazioni.class.getName().substring(SceltaLiquidazioni.class.getPackage().getName().length() + 1) : SceltaLiquidazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ordinamento
  // **********************************************************************
  public int Ordinamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinamento Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.ResetSortList();
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI564, IMDBDef14.PQSL_PARAMETRI564_PARAMORDINAM, 0).equals((new IDVariant("V")), true))
      {
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_CAPITOLO, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ARTICOLO, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOSUBIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROSUBIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
      }
      PAN_LIQUIDAZIONI.EnableSorting();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "Ordinamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica Liquidazione
  // **********************************************************************
  public int ModificaLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Liquidazione Body
      // Procedure Body
      // 
      if (IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).equals((new IDVariant(0)), true) || IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non Ammessa per l'Esercizio Finanziario!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "ModificaLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuova Liquidazione
  // **********************************************************************
  public int NuovaLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuova Liquidazione Body
      // Procedure Body
      // 
      if (IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).equals((new IDVariant(0)), true) || IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non Ammessa per l'Esercizio Finanziario!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, (new IDVariant()));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "NuovaLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elimina Liquidazione
  // **********************************************************************
  public int EliminaLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Liquidazione Body
      // Procedure Body
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Confermi la cancellazione della Liquidazione "));
      v_AVVISO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0))), (new IDVariant("?")));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("E")), true))
      {
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          return 0;
        }
        MainFrm.Cf4armDBObject.ELIMINALIQE00(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0));
      }
      if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("C")), true))
      {
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          return 0;
        }
        MainFrm.Cf4armDBObject.ELIMINALIQGC4(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0));
      }
      if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("B")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("D")), true))
      {
        if (IDL.NullValue(MainFrm.MODDISELILIQ,(new IDVariant("NO"))).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("B")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0));
          MainFrm.Show(MyGlb.FRM_ELIMLIQINDIS, (new IDVariant(1)).intValue(), this); 
          return 0;
        }
        else
        {
          if (!(MainFrm.MessageConfirm(v_AVVISO)))
          {
            return 0;
          }
          MainFrm.Cf4armDBObject.ELIMINALIQBUONIDISP(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0), (new IDVariant()), (new IDVariant()));
        }
      }
      if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("L")), true))
      {
        if (IDL.NullValue(MainFrm.MODDISELILIQ,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI528, IMDBDef5.FLD_PARAMETRI528_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0));
          MainFrm.Show(MyGlb.FRM_ELIMLIQINDIS, (new IDVariant(1)).intValue(), this); 
          return 0;
        }
        else
        {
          if (!(MainFrm.MessageConfirm(v_AVVISO)))
          {
            return 0;
          }
          MainFrm.Cf4armDBObject.ELIMINALIQDIST(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0), (new IDVariant()), (new IDVariant()));
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_MEX = new IDVariant(0,IDVariant.STRING);
        v_MEX = (new IDVariant("Eliminata Liquidazione ", IDVariant.STRING));
        IDVariant v_MEX1 = new IDVariant(0,IDVariant.STRING);
        v_MEX1 = (new IDVariant(" Distinta ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MEX, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0))), v_MEX1), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0)))); 
        PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "EliminaLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Collassa il pannello dei parametri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Collassailpannellodeiparametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collassa il pannello dei parametri Body
      // Corpo Procedura
      // 
      MainFrm.Collapseexpandparampanel(new IDVariant(MainFrm.CmdObj.GetCmdCode(MyGlb.CMDS_COMMASETLIQ2+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_SCLIQCOLLA+BaseCmdLinIdx].GetIndex()).intValue())), PAN_PARAMETRI);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "Collassailpannellodeiparametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiornam Valori Comuni
  // **********************************************************************
  public int AggiornamValoriComuni ()
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
      // Aggiornam Valori Comuni Body
      // Procedure Body
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_LIQUIDAZIONI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUIDAZIONI.GotoFirst();
      while (!PAN_LIQUIDAZIONI.RSEOF())
      {
        if (PAN_LIQUIDAZIONI.IsRowSelected(I.intValue()))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          break;
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_LIQUIDAZIONI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga da aggiornare"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        if (!(PAN_LIQUIDAZIONI.ShowMultipleSel()))
        {
          PAN_LIQUIDAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
        }
        return 0;
      }
      AGGIVALOCOMU_VALCOMLIQDEL();
      MainFrm.Show(MyGlb.FRM_AGGVALCOMLIQ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "AggiornamValoriComuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Valori Comuni Liq: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void AGGIVALOCOMU_VALCOMLIQDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKDIBE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCODIBE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VACONUQTDIBE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMINEMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_NUMERO_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_DATA_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALOCOMCKCIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_CIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_VALCOMCKESCI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMULIQ, IMDBDef5.FLD_VALORCOMULIQ_ESCLUSIONE_CIG, 0, new IDVariant());
  }

  // **********************************************************************
  // Info Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Valori
  // **********************************************************************
  public boolean AggiornaValori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Aggiorna Valori Body
      // Procedure Body
      // 
      try
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_LIQUIDAZIONI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_LIQUIDAZIONI.GotoFirst();
        while (!PAN_LIQUIDAZIONI.RSEOF())
        {
          if (PAN_LIQUIDAZIONI.IsRowSelected(I.intValue()))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKDIBE, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  DIVERSO_BEN = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCODIBE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  NUM_QUIETANZA_DIV_BEN = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VACONUQTDIBE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMINEMI, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCON, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  NUMERO_CONTABILE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_NUMERO_CONTABILE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  DATA_CONTABILE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_DATA_CONTABILE, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALOCOMCKCIG, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  CIG = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_CIG, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_VALCOMCKESCI, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  MOTIVO_ESCLUSIONE_CIG = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI692, IMDBDef14.PQSL_PARAMETRI692_ESCLUSIONE_CIG, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_LIQ = " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_LIQUIDAZIONI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      catch (Exception e10)
      {
        MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return (new IDVariant(0)).booleanValue();
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "AggiornaValori", _e);
      return false;
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_LIQUIDAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM, 0, (new IDVariant("V")));
      PAN_LIQUIDAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMNUMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMNUMERAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "UnloadEvent", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELIMLIQINDIS)), true) && Result.booleanValue())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("B")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("D")), true))
        {
          MainFrm.Cf4armDBObject.ELIMINALIQBUONIDISP(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI527, IMDBDef14.PQSL_PARAMETRI527_PARELIDETDIS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI527, IMDBDef14.PQSL_PARAMETRI527_PARARIAPDIST, 0));
        }
        if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("L")), true))
        {
          MainFrm.Cf4armDBObject.ELIMINALIQDIST(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_ANNO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_FAT_NUMERO_PROG, 0), IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_IMPORTO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI527, IMDBDef14.PQSL_PARAMETRI527_PARELIDETDIS, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI527, IMDBDef14.PQSL_PARAMETRI527_PARARIAPDIST, 0));
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_MEX = new IDVariant(0,IDVariant.STRING);
          v_MEX = (new IDVariant("Eliminata Liquidazione ", IDVariant.STRING));
          IDVariant v_MEX1 = new IDVariant(0,IDVariant.STRING);
          v_MEX1 = (new IDVariant(" Distinta ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MEX, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_LIQ, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_LIQ, 0))), v_MEX1), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_NUMERO_DISTINTA, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_ANNO_DISTINTA, 0)))); 
          PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGVALCOMLIQ)), true) && Result.booleanValue())
      {
        if (AggiornaValori())
        {
          PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
      // 
      // Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_BENEFICIARIO,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_BENEFICIARIO))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_UFFICIO,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_UFFICIO))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FINANZIAMENT,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FINANZIAMENT))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_NUMERODOC,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_NUMERODOC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_LIQUIDAZIONI.Freezed = (new IDVariant(0)).booleanValue();
        Ordinamento();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_LIQUIDAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LiquidazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni After Find Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.EnableSorting();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LiquidazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("C")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("E")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("B")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("D")), true) || IMDB.Value(IMDBDef14.PQRY_LIQ58, IMDBDef14.PQSL_LIQ58_TIPO_DISTINTA, 0).equals((new IDVariant("L")), true))
      {
        if (IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).equals((new IDVariant(0)), true) || IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).equals((new IDVariant(8)), true) || IDL.NullValue(MainFrm.FASEBILANCIO,(new IDVariant(0))).equals((new IDVariant(9)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINLIQUID+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINLIQUID+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINLIQUID+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LiquidazioniOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUIDAZIONI.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIFILIQUID+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MODIFILIQUID+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "LiquidazioniOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ORDINAMENTO)), true))
      {
        Ordinamento();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaLiquidazioni", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTALIQUID_PARAMETRI564() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI564_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI316, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI316, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI564_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI564_RS, 0, IMDBDef5.TBL_PARAMETRI316, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI564_RS, 0, 0, IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMNUMEDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI564_RS, 1, 0, IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMNUMERAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI564_RS, 2, 0, IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI564_RS, 3, 0, IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI564_RS, 4, 0, IMDBDef5.TBL_PARAMETRI316, IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI316, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI316, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI316, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI564_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIONI, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFODOC)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 39);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "751347CE-9194-49DD-93B7-2370DC88F52D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "Numero liq");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "906C2002-1B8B-43E1-9964-67F483133E50");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "Anno Liq");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "A4D51A95-19F0-4873-ACB3-2F6ED1A2902C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "Data");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "18528089-AF93-432C-9420-13139CD1EE7C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "Capitolo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "1AF29362-6FAA-45D9-8F58-62292E74D69E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "Articolo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "70AE9C66-347F-4CCA-8371-B6016886373D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "Numero Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "1431C2CC-10A6-42D8-B4EE-C7E5E2183977");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "Anno Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "955058F7-CA20-4005-ABAD-EA39EB8036C3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "Numero Sub Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "1DDE6266-6F73-40E4-9DCF-91C134D06643");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "Anno Sub Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "AEA67E48-740C-435E-AA59-F8DF670481CD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "53BCB3AB-09E5-4D74-9AA6-52DCDF3E3CF7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "In Emis.");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "33E247E6-8D1C-4AF7-BBDE-59A37248C68D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "996FA565-5A91-455B-BDC9-22F1C5A09150");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "Numero Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "B86C84D6-9182-4B62-9C20-0345FE30230F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "Anno Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "A4AD3C30-4B26-4753-B538-A07D697871FF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "Info Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.VIS_HYPLINIMLOU1);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "58486389-86F3-4A77-A87B-48DD9C7FDC41");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "Ufficio");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "554EE168-4FFD-4A12-BBA6-613288B595C2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "Sede Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "8F23E0F3-B745-462C-8B1E-2D4D75F6FC34");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "Numero Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "5E823E7D-CFBD-48D6-8863-D8CB8DC4F74A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "Anno Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "DB61407A-344D-4FA6-9419-D9B8A11F6542");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "Unita Proponente");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "492E42A7-3B33-4791-9B26-E835EE267795");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "Numero Proposta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "E1B93785-ABFC-46A9-862F-E8478DF82F34");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "Anno Proposta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "F33658C0-C159-4E9A-A8F4-CB31BFCF52E1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "Numero Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "14F6C9C4-F20D-4A16-A467-4C92DDF5C7B7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "Anno Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "14EE33E7-9C73-4AE4-9C19-07E3EE32070B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, "B8E33F67-8C1E-4BD7-B9E8-F0CD41601703");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, "D72C3D8B-7EA3-4F1D-A992-A73A00CD6DAA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, "Capitolo/Art.");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, "4FAD845F-D7A0-4370-BDCE-8F396A931218");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, "Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, "1802FB4A-7392-4B8B-A779-C69576DDD2FB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, "Sub-Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, "14ABA324-5D71-423E-8DC3-32A049A969DA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, "Documento");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, "784C8EBC-7348-4A60-A9BF-24F603CACF27");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, "Delibera");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, "88A8245D-11E4-4108-80FD-5C24A17D51D3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, "Proposta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, "775F5599-D8C8-4DD0-8F78-CAB1BAF62BA6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, "Distinta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "559EDC3F-356D-4B0F-8A75-8685176AAB10");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "Tipo Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "238659B2-0E32-4449-B344-0E65C566CFE6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "7EAE5243-54F8-4FE4-BABC-60840B87ADFF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, "A196FB16-A1E3-4E2D-8FAA-BA46804874ED");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, "NUMERO LIQ RC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, "E68B9865-2151-4CFB-9DDA-8DAAE171326C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, "ANNO LIQ RC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, "D156B174-0504-47F4-AB5E-AFE68BC09545");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, "Liq. Provenienza RC");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. liq");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, "Num. liq");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQ58, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 44, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQ58, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 80, 40, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 4, 1360, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATA, PPQRY_LIQ58, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 156, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLO, PPQRY_LIQ58, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 248, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ARTICOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ARTICOLO, PPQRY_LIQ58, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 268, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "Num. Imp");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "Num. Imp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROIMP, PPQRY_LIQ58, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 312, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "Anno Imp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOIMP, PPQRY_LIQ58, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 348, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sb. Im.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Num. S. I.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROSUBIMP, PPQRY_LIQ58, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 396, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "An. S. Im.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "An. S. Im.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOSUBIMP, PPQRY_LIQ58, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 436, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 140, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQ58, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 516, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, "In Emis.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, "In Emis.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INEMIS, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INEMIS, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INEMIS, PPQRY_LIQ58, "DECODE(A.ANNO_MAND, to_number(NULL), 0, 1)", "LIQINEMIS", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INEMIS, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INEMIS, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 564, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BENEFICIARIO, PPQRY_LIQ58, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 704, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 124, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, "Num. Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC, PPQRY_LIQ58, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 792, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, "Ann. Doc");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 124, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, "Anno Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODOC, PPQRY_LIQ58, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 824, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, "I. D.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 4, 412, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, "Info Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFODOC, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFODOC, PPQRY_LIQ58, "CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END", "LIQINFODOC", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 844, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 4, 316, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO, PPQRY_LIQ58, "C.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 964, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "Sede Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 4, 268, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL, PPQRY_LIQ58, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1008, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "Num. Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL, PPQRY_LIQ58, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1052, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, "Ann. Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL, PPQRY_LIQ58, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1084, 40, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita Proponente");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 364, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, "Un. Prop.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UNITAPROPONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UNITAPROPONE, PPQRY_LIQ58, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1192, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 380, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Num. Prp.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROPROPOS, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROPROPOS, PPQRY_LIQ58, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1236, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prp.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 404, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Ann. Prop.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOPROPOSTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOPROPOSTA, PPQRY_LIQ58, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1268, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, "Num. Dist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 1504, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODISTIN, PPQRY_LIQ58, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1312, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 1480, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODISTINTA, PPQRY_LIQ58, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1344, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 340, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZIAMENT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_FINANZIAMENT, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZIAMENT, PPQRY_LIQ58, "DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || D.DESCRIZIONE)", "LIQFINANZIAM", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 0, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 0, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQUIDALABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 156, 4, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLLABEL, -1, "", "CAPITOLLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 268, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNOLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 348, 4, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 16, 20, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SUBIMPEGLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 704, 4, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DOCUMENLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 964, 4, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 16, 20, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DELIBERLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 1084, 4, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 24, 28, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PROPOSTLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 1268, 4, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 32, 36, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 1904, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, "Tipo Distinta");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 4, 412, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, "Tipo Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TIPODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TIPODISTINTA, PPQRY_LIQ58, "A.TIPO_DISTINTA", "TIPO_DISTINTA", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 1904, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 4, 412, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANN. PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATANNOPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATANNOPROG, PPQRY_LIQ58, "A.FAT_ANNO_PROG", "FAT_ANNO_PROG", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 1904, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 436, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUM. PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATNUMERPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATNUMERPROG, PPQRY_LIQ58, "A.FAT_NUMERO_PROG", "FAT_NUMERO_PROG", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_LIST, 1464, 40, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_LIST, "NUMERO LIQ RC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_FORM, 4, 412, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQRC, MyGlb.PANEL_FORM, "NUMERO LIQ RC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQRC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQRC, PPQRY_LIQ58, "A.NUMERO_LIQ_RC", "NUMEROLIQRC", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_LIST, 1524, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_LIST, "ANN. LQ. R.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_FORM, 4, 436, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQRC, MyGlb.PANEL_FORM, "ANNO LIQ RC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQRC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQRC, PPQRY_LIQ58, "A.ANNO_LIQ_RC", "ANNOLIQRC", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_LIST, 1464, 4, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_FORM, 1464, 248, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICLIQPRORC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ETICLIQPRORC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ETICLIQPRORC, -1, "", "ETICLIQPRORC", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQ58", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  DECODE(A.ANNO_MAND, to_number(NULL), 0, 1) as LIQINEMIS, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  C.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || D.DESCRIZIONE) as LIQFINANZIAM, ");
    SQL.append("  A.TIPO_DISTINTA as TIPO_DISTINTA, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END as LIQINFODOC, ");
    SQL.append("  A.NUMERO_LIQ_RC as NUMEROLIQRC, ");
    SQL.append("  A.ANNO_LIQ_RC as ANNOLIQRC ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  T53 C, ");
    SQL.append("  FINANZIAMENTI D ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   ((A.NUMERO_LIQ BETWEEN NVL(~~TBL_PARAMETRI316.PARAMNUMEDAL~~, 1) AND NVL(~~TBL_PARAMETRI316.PARAMNUMERAL~~, 99999))) ");
    SQL.append("and   ((A.D_DATA_REG BETWEEN NVL(~~TBL_PARAMETRI316.PARAMDATADAL~~, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(~~TBL_PARAMETRI316.PARAMDATAAL~~, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.CODICE(+) = A.UFFICIO) ");
    SQL.append("and   (D.CODICE(+) = A.FINANZIAMENTO) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ58, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQ58, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIONI.iUseListQBE;
      PAN_LIQUIDAZIONI.iUseListQBE = 0;
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "26E8DC14-B906-4BE5-87E7-EF3260A2E614");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 4, 11, 184, 41, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 44);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "A7F7A25F-280A-4A85-A750-583FE4BEE891");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_FORM, 192, 11, 240, 41, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 27);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "D6063D0E-216E-4910-83F7-6465C8C9125D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 436, 11, 176, 41, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 74);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, "DD15256F-5491-4E6C-A8F6-EEC2FD5A6108");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, "0AE7AC46-1DFD-4FD4-B56B-399BBDE68012");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, "DB9999F9-A64C-432D-B099-6B94EDB64304");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, "60BF6270-5677-49D2-B0BF-DB8AC6D5EB46");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, "FEE891FD-793B-41B3-BFD3-EB08540B4A1D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, "36F07A93-0DB9-42F2-9AE5-078FE98251D8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "A615C09D-3521-4B0F-97F2-5C97AA2175B9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "A02A29CE-70CA-4E2F-A7CF-210AA83F8947");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "6E002409-C8E8-4096-8507-65FC72CF96C1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "89577F3A-9424-4E95-A973-428249CC475D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "022FE989-4164-4951-BC19-426E6EC08F2C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 8, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 8, 40, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUONUMSX, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUONUMSX, -1, "", "LABEVUONUMSX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 16, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 176, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUONUMDX, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUONUMDX, -1, "", "LABEVUONUMDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 16, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 196, 40, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUODATSX, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUODATSX, -1, "", "LABEVUODATSX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 24, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 420, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUODATDX, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUODATDX, -1, "", "LABEVUODATDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_LIST, 24, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_FORM, 440, 40, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUOORDDX, -1, GRP_PARAMETRI_ORDINAMENTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUOORDDX, -1, "", "LABEVUOORDDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_LIST, 32, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_FORM, 600, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOORDSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUOORDSX, -1, GRP_PARAMETRI_ORDINAMENTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUOORDSX, -1, "", "LABEVUOORDSX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28, 28, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI564, "A.PARAMNUMEDAL", "PARAMNUMEDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 108, 28, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI564, "A.PARAMNUMERAL", "PARAMNUMERAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 80, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 204, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI564, "A.PARAMDATADAL", "PARAMDATADAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 200, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 324, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI564, "A.PARAMDATAAL", "PARAMDATAAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 320, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 456, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI564, "A.PARAMORDINAM", "PARAMORDINAM", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("V")), "Capitolo/Art.", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("N")), "Numero", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI564", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI564, IMDBDef14.PQRY_PARAMETRI564_RS, IMDBDef5.TBL_PARAMETRI316);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI316_PARAMNUMEDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef5.FLD_PARAMETRI316_PARAMNUMERAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI316_PARAMDATADAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI316_PARAMDATAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef5.FLD_PARAMETRI316_PARAMORDINAM);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI316");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnChangeRow();
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
