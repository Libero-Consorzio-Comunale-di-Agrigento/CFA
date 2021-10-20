// **********************************************
// Provvisori Da Regolarizzare
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProvvisoriDaRegolarizzare extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TESTATA_ETICHELBLPRO = 0;
  private static int PFL_TESTATA_NUOVAESPRESS = 1;

  private static int PPQRY_DUAL28 = 0;


  IDPanel PAN_TESTATA;
  private static int PFL_PROVVISORI_I = 0;
  private static int PFL_PROVVISORI_IMPORTO = 1;
  private static int PFL_PROVVISORI_DATA = 2;
  private static int PFL_PROVVISORI_NUMERO = 3;
  private static int PFL_PROVVISORI_DEBITORE = 4;
  private static int PFL_PROVVISORI_DESCRIZIONE1 = 5;
  private static int PFL_PROVVISORI_IMPORDETTNEW = 6;
  private static int PFL_PROVVISORI_IDFLUSSOBT = 7;
  private static int PFL_PROVVISORI_UNITAORGANIZ = 8;
  private static int PFL_PROVVISORI_PROGRESSIVO1 = 9;
  private static int PFL_PROVVISORI_ESERCIZIO1 = 10;
  private static int PFL_PROVVISORI_PROGRESSDETT = 11;
  private static int PFL_PROVVISORI_IMPORDETTORI = 12;

  private static int PPQRY_ORDPROVVISOR = 0;

  private static int PPQRY_CAPUO = 1;


  IDPanel PAN_PROVVISORI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBORDPROVV(IMDB);
    Init_TBL_IMDPROORDAES(IMDB);
    //
    //
    Init_QRY_IMDESCMANPR2(IMDB);
    Init_PQRY_DUAL28(IMDB);
    Init_PQRY_ORDPROVVISOR(IMDB);
    Init_PQRY_ORDPROVVISOR_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBORDPROVV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_IMDBORDPROVV, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_IMDBORDPROVV, "TBL_IMDBORDPROVV");
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMPORD, "NOMOGGIMPORD");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMPORD,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIDFLBT,5,500,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGETTOI,5,2,0);
  }

  private static void Init_TBL_IMDPROORDAES(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_IMDPROORDAES, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_IMDPROORDAES, "TBL_IMDPROORDAES");
    IMDB.set_FldCode(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDPROORDAES,IMDBDef5.FLD_IMDPROORDAES_NOMOGGPRODET,1,4,0);
  }

  private static void Init_QRY_IMDESCMANPR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_IMDESCMANPR2, 3);
    IMDB.set_TblCode(IMDBDef15.QRY_IMDESCMANPR2, "QRY_IMDESCMANPR2");
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VESERCIZIO, "VESERCIZIO");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIV1, "VPROGRESSIV1");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIV1,1,8,0);
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIVO, "VPROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR2,IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIVO,1,4,0);
  }

  private static void Init_PQRY_DUAL28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_DUAL28, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_DUAL28, "PQRY_DUAL28");
    IMDB.set_FldCode(IMDBDef15.PQRY_DUAL28,IMDBDef15.PQSL_DUAL28_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef15.PQRY_DUAL28,IMDBDef15.PQSL_DUAL28_NUOVAESPRESS,1,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_DUAL28, 0);
  }

  private static void Init_PQRY_ORDPROVVISOR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDPROVVISOR, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDPROVVISOR, "PQRY_ORDPROVVISOR");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGETTOI,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMPORD, "NOMOGGIMPORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMPORD,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIDFLBT,5,500,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDPROVVISOR, 0);
  }

  private static void Init_PQRY_ORDPROVVISOR_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDPROVVISOR_RS, "PQRY_ORDPROVVISOR_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGETTOI,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMPORD, "NOMOGGIMPORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMPORD,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVVISOR_RS,IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIDFLBT,5,500,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProvvisoriDaRegolarizzare(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProvvisoriDaRegolarizzare()
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
    FormIdx = MyGlb.FRM_PROVVDAREGOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7FA35A4A-8AE4-4295-AE22-8E7208A7C3DA";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 980;
    DesignHeight = 550;
    set_Caption(new IDVariant("Provvisori Da Regolarizzare"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 980;
    Frames[1].Height = 524;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.10687;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 980;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Testata";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_TESTATA = new IDPanel(w, this, 2, "PAN_TESTATA");
    Frames[2].Content = PAN_TESTATA;
    PAN_TESTATA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TESTATA.VS = MainFrm.VisualStyleList;
    PAN_TESTATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 980-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "63A34E4A-2DF2-4820-AC1D-5528256E8ADB");
    PAN_TESTATA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TESTATA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TESTATA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TESTATA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TESTATA.InitStatus = 1;
    PAN_TESTATA_Init();
    PAN_TESTATA_InitFields();
    PAN_TESTATA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 980;
    Frames[3].Height = 468;
    Frames[3].Caption = "Provvisori da Regolarizzare";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 468;
    PAN_PROVVISORI = new IDPanel(w, this, 3, "PAN_PROVVISORI");
    Frames[3].Content = PAN_PROVVISORI;
    PAN_PROVVISORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROVVISORI.VS = MainFrm.VisualStyleList;
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 980-MyGlb.PAN_OFFS_X, 468-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6D9B77D5-BD65-49DC-BEC5-AD87163B6B02");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 920, 360, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROVVISORI.InitStatus = 2;
    PAN_PROVVISORI_Init();
    PAN_PROVVISORI_InitFields();
    PAN_PROVVISORI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_IMDBORDPROVV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROVVDAREGOL_ORDPROVVISOR();
      }
      PAN_TESTATA.UpdatePanel(MainFrm);
      PAN_PROVVISORI.UpdatePanel(MainFrm);
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
    return (obj instanceof ProvvisoriDaRegolarizzare);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProvvisoriDaRegolarizzare.class.getName() : (Glb.ClassWithPackage(ProvvisoriDaRegolarizzare.class) ? ProvvisoriDaRegolarizzare.class.getName().substring(ProvvisoriDaRegolarizzare.class.getPackage().getName().length() + 1) : ProvvisoriDaRegolarizzare.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Riempi Imdb Ord Provvisori
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiImdbOrdProvvisori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Imdb Ord Provvisori Body
      // Corpo Procedura
      // 
      RIEIMDORDPRO_IMDORDPRODE1();
      RIEIMDORDPRO_IMORPRININSE();
      RIEIMDORDPRO_IMDESCMANPR2();
      while (!IMDB.Eof(IMDBDef15.QRY_IMDESCMANPR2, 0))
      {
        RIEIMDORDPRO_IMDORDPRODEL();
        IMDB.TblMoveNext(IMDBDef15.QRY_IMDESCMANPR2, 0);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvisoriDaRegolarizzare", "RiempiImdbOrdProvvisori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imdb Ord Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEIMDORDPRO_IMDORDPRODE1() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDBORDPROVV);
  }

  // **********************************************************************
  // Imdb Ord Provvisori: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEIMDORDPRO_IMORPRININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(CONTA_RIF_NULL(B.ESERCIZIO,A.PROGR_ORD_PROV,'O'), NULL, NULL, 'SI') as IECRNOPEOPDP, ");
    SQL.append("  A.ESERCIZIO as ORDPRODETESE, ");
    SQL.append("  A.PROGR_ORD_PROV as ORPRDEPRORPR, ");
    SQL.append("  A.PROGRESSIVO as ORDPRODETPRO, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as ORDPROPRUNOR, ");
    SQL.append("  B.DATA as ORDPROVVDATA, ");
    SQL.append("  B.NUMERO as ORDPROVVNUME, ");
    SQL.append("  B.IMPORTO as ORDPROVVIMPO, ");
    SQL.append("  A.IMPORTO as ORDPRODETIM1, ");
    SQL.append("  A.IMPORTO as ORDPRODETIMP, ");
    SQL.append("  A.DES_BEN as ORDPRODEDEBE, ");
    SQL.append("  NVL(A.DESCRIZIONE, B.DESCRIZIONE) as NUVAORPDDOPD, ");
    SQL.append("  B.ID_FLUSSO_BT as ORDPROIDFLBT ");
    SQL.append("from ");
    SQL.append("  ORD_PROV_DETTAGLI A, ");
    SQL.append("  ORD_PROVVISORI B ");
    SQL.append("where (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append("and   (A.PROGR_ORD_PROV = B.PROGRESSIVO) ");
    SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((B.ID_FLUSSO_DEPAG IS NULL)) ");
    SQL.append("and   ((A.ANNO_PRE IS NULL)) ");
    SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'CFA' OR B.PROGR_UNITA_ORGANIZZATIVA IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA C ");
    SQL.append("where (C.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (C.TIPO_STRUTTURA = 'LG') ");
    SQL.append(")) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef5.TBL_IMDBORDPROVV, 0);
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGETTOI,0,RS.Get(1));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER,0,RS.Get(2));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG,0,RS.Get(3));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET,0,RS.Get(4));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRUNOR,0,RS.Get(5));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDATA,0,RS.Get(6));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGENUME,0,RS.Get(7));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMPORD,0,RS.Get(8));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDEOR,0,RS.Get(9));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDENE,0,RS.Get(10));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGDESBEN,0,RS.Get(11));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDESC,0,RS.Get(12));
      IMDB.set_Value(IMDBDef5.TBL_IMDBORDPROVV,IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIDFLBT,0,RS.Get(13));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Imdb Escludi Mandati Provvisori
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void RIEIMDORDPRO_IMDESCMANPR2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_IMDESCMANPR2);
    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDPROORDAES, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_IMDPROORDAES, 0))
    {
      IMDB.TblAddNew(IMDBDef15.QRY_IMDESCMANPR2, 0);
      IMDB.TblLinkRow(IMDBDef15.QRY_IMDESCMANPR2, 0, IMDBDef5.TBL_IMDPROORDAES, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR2, 0, 0, IMDBDef5.TBL_IMDPROORDAES, IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR2, 1, 0, IMDBDef5.TBL_IMDPROORDAES, IMDBDef5.FLD_IMDPROORDAES_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR2, 2, 0, IMDBDef5.TBL_IMDPROORDAES, IMDBDef5.FLD_IMDPROORDAES_NOMOGGPRODET, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_IMDPROORDAES, 0);
      if (IMDB.Eof(IMDBDef5.TBL_IMDPROORDAES, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_IMDPROORDAES, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_IMDESCMANPR2, 0);
  }

  // **********************************************************************
  // Imdb Ord Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEIMDORDPRO_IMDORDPRODEL() throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBORDPROVV, 0);
    while (!IMDB.Eof(IMDBDef5.TBL_IMDBORDPROVV, 0))
    {
      bDeleted = false;
      if (IMDB.Value(IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR2, IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIV1, 0), true))
      {
      if (IMDB.Value(IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR2, IMDBDef15.QSL_IMDESCMANPR2_VPROGRESSIVO, 0), true))
      {
      if (IMDB.Value(IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR2, IMDBDef15.QSL_IMDESCMANPR2_VESERCIZIO, 0), true))
      {
        IMDB.TblDelete(IMDBDef5.TBL_IMDBORDPROVV, 0);
        bDeleted = true;
      }
      }
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef5.TBL_IMDBORDPROVV, 0);
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
      PAN_PROVVISORI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      RiempiImdbOrdProvvisori();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvisoriDaRegolarizzare", "Load", _e);
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
      if (Confirm.booleanValue())
      {
        if (IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0), true)>0)
        {
          IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
          v_VMSG = (new IDVariant("L'importo del dettaglio non può essere superiore al valore originale ("));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_VMSG, IDL.Format(IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0), (new IDVariant("#,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))), (new IDVariant(")")))); 
          IMDB.set_Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, 0, IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0));
          Cancel.set((new IDVariant(-1)));
        }
      }
      if (Cancel.equals((new IDVariant(0)), true))
      {
        UNLOAD_IMDORDPRODEL();
        UNLOAD_IMPRORDAESDE();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvisoriDaRegolarizzare", "Unload", _e);
    }
  }

  // **********************************************************************
  // Imdb Ord Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDORDPRODEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDBORDPROVV);
  }

  // **********************************************************************
  // Imdb Provvisori Ord Da Escludere: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMPRORDAESDE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDPROORDAES);
  }

  // **********************************************************************
  // Provvisori On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROVVISORI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvisori On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PROVVISORI_IMPORDETTNEW)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0), true)>0)
        {
          IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
          v_VMSG = (new IDVariant("L'importo del dettaglio non può essere superiore al valore originale ("));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_VMSG, IDL.Format(IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0), (new IDVariant("#,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))), (new IDVariant(")")))); 
          IMDB.set_Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDENE, 0, IMDB.Value(IMDBDef15.PQRY_ORDPROVVISOR, IMDBDef15.PQSL_ORDPROVVISOR_NOMOGGIMDEOR, 0));
        }
        PAN_PROVVISORI.SetInput(-1,PFL_PROVVISORI_IMPORDETTNEW,2,true); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvisoriDaRegolarizzare", "ProvvisoriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Provvisori On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PROVVISORI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvisori On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true))
      {
        RiempiImdbOrdProvvisori();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvisoriDaRegolarizzare", "ProvvisoriOnCommand", _e);
    }
  }

  // **********************************************************************
  // ORD PROVVISORI
  // Primary record source for panel data
  // **********************************************************************
  private void PROVVDAREGOL_ORDPROVVISOR() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDPROVVISOR_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBORDPROVV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_IMDBORDPROVV, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDPROVVISOR_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDPROVVISOR_RS, 0, IMDBDef5.TBL_IMDBORDPROVV, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 0, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGETTOI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 1, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRUNOR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 2, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMPORD, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 3, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 4, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGENUME, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 5, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGDESBEN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 6, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDESC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 7, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDENE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 8, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDEOR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 9, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 10, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 11, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDPROVVISOR_RS, 12, 0, IMDBDef5.TBL_IMDBORDPROVV, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIDFLBT, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_IMDBORDPROVV, 0);
      if (IMDB.Eof(IMDBDef5.TBL_IMDBORDPROVV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBORDPROVV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef15.PQRY_ORDPROVVISOR_RS);
    IMDB.TblSortBy(IMDBDef15.PQRY_ORDPROVVISOR_RS,3,true);
    IMDB.TblSortBy(IMDBDef15.PQRY_ORDPROVVISOR_RS,4,true);
    IMDB.TblSortBy(IMDBDef15.PQRY_ORDPROVVISOR_RS,10,false);
    IMDB.TblSortBy(IMDBDef15.PQRY_ORDPROVVISOR_RS,11,true);
    IMDB.TblStartSort(IMDBDef15.PQRY_ORDPROVVISOR_RS);
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDPROVVISOR_RS, 0);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TESTATA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TESTATA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TESTATA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TESTATA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TESTATA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TESTATA);
    // Stub
  }

  private void PAN_TESTATA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TESTATA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TESTATA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TESTATA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PROVVISORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROVVISORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROVVISORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROVVISORI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROVVISORI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PROVVISORI);
    // Stub
  }

  private void PAN_PROVVISORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROVVISORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PROVVISORI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PROVVISORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROVVISORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TESTATA_Init()
  {

    PAN_TESTATA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TESTATA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TESTATA.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "BBA4EA12-6DCF-4197-8B92-71C09E2B8A20");
    PAN_TESTATA.set_Header(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "Provvisori da regolarizzare. Il provvisorio associato al dettaglio ordinativo verrà chiuso.");
    PAN_TESTATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "LblProvvisori");
    PAN_TESTATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.VIS_ETICHEGRASSE);
    PAN_TESTATA.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, "C5312D89-EEF2-4CF6-BD97-4E8D4BF80CA4");
    PAN_TESTATA.set_Header(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, "Nuova Espressione");
    PAN_TESTATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, "");
    PAN_TESTATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_TESTATA.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TESTATA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TESTATA.SetRect(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_LIST, 176, 16, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_LIST, 0);
    PAN_TESTATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_LIST, 2);
    PAN_TESTATA.SetRect(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_FORM, 16, 12, 948, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_FORM, 0);
    PAN_TESTATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_FORM, 2);
    PAN_TESTATA.SetFieldPage(PFL_TESTATA_ETICHELBLPRO, -1, -1);
    PAN_TESTATA.SetFieldPanel(PFL_TESTATA_ETICHELBLPRO, -1, "", "ETICHELBLPRO", 0, 0, 0, -13997);
    PAN_TESTATA.SetRect(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_LIST, 116);
    PAN_TESTATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_LIST, 1);
    PAN_TESTATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_LIST, "Nuova Espressione");
    PAN_TESTATA.SetRect(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_FORM, 4, 48, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_FORM, 116);
    PAN_TESTATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_FORM, 1);
    PAN_TESTATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, MyGlb.PANEL_FORM, "Nuova Espressione");
    PAN_TESTATA.SetFieldPage(PFL_TESTATA_NUOVAESPRESS, -1, -1);
    PAN_TESTATA.SetFieldUnbound(PFL_TESTATA_NUOVAESPRESS, true);
    PAN_TESTATA.SetFieldPanel(PFL_TESTATA_NUOVAESPRESS, PPQRY_DUAL28, "1", "NUOVAESPRESS", 1, 19, 0, -13997);
  }

  private void PAN_TESTATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TESTATA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TESTATA.SetIMDB(IMDB, "PQRY_DUAL28", true);
    PAN_TESTATA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as NUOVAESPRESS ");
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL28, 5, SQL, -1, "");
    PAN_TESTATA.SetQueryDB(PPQRY_DUAL28, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TESTATA.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TESTATA.Status() == 2)
    {
      int oldListQBE = PAN_TESTATA.iUseListQBE;
      PAN_TESTATA.iUseListQBE = 0;
      PAN_TESTATA.PanelCommand(Glb.PCM_SEARCH);
      PAN_TESTATA.PanelCommand(Glb.PCM_FIND);
      PAN_TESTATA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PROVVISORI_Init()
  {

    PAN_PROVVISORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROVVISORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROVVISORI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, "0200BE09-92F5-4B35-9306-87B34733CC87");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, "I");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, "Dati Contabili Incompleti");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.VIS_CHECKSTYLE);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, "C8CF3FA7-0397-45F6-BF7B-AA31A7CFF0ED");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, "Importo Tot. Provvisorio");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, "823D9BA3-5629-4AA2-A66F-380E76993493");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, "Data");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, "1849B32E-AEBC-41BE-9750-23542A39C399");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, "Numero");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, "EBC0BB91-4164-4050-9E20-74E3920A7133");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, "Debitore");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, "194BD8C8-C67E-45C6-ADCA-3FEE0936630D");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, "Descrizione");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, "DEF009CB-2A0A-4CC7-BAED-9EB392040CBA");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, "Importo Dett. Provvisiorio");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, "C65F323D-6827-430B-862C-CFF48837DD43");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, "Id Flusso BT");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, "4CFA47D6-CB45-470B-AFE8-D4B84E74E139");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, 0 | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, "8CD68ACE-1240-4B5B-A7CF-6A4E1278B940");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, "PROGRESSIVO");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, "3F0EFAFA-E810-4537-8610-050D77EF4DCA");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, "ESERCIZIO");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, "9D0DDF9D-3F5F-4155-8D76-4631455F4B42");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, "PROGRESSIVO DETT");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROVVISORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, "38B9E2FD-07C2-46E1-B6F4-2D8E0823EC3B");
    PAN_PROVVISORI.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, "Importo Dett Ori");
    PAN_PROVVISORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, "");
    PAN_PROVVISORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROVVISORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, 0, -1);
  }

  private void PAN_PROVVISORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_LIST, 0, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_LIST, 12);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_LIST, "I");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_FORM, 4, 280, 444, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_FORM, 12);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_FORM, 2);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_I, MyGlb.PANEL_FORM, "I");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_I, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_I, PPQRY_ORDPROVVISOR, "A.NOMEOGGETTOI", "NOMEOGGETTOI", 5, 2, 0, -13997);
    PAN_PROVVISORI.SetValueListItem(PFL_PROVVISORI_I, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROVVISORI.SetValueListItem(PFL_PROVVISORI_I, (new IDVariant()), "Null", "", "", -1);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_LIST, 20, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_LIST, 52);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_LIST, "Importo Tot. Provvisorio");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORTO, MyGlb.PANEL_FORM, "Imp. Tot Provvisorio");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_IMPORTO, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_IMPORTO, PPQRY_ORDPROVVISOR, "A.NOMOGGIMPORD", "NOMOGGIMPORD", 3, 14, 2, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_LIST, 120, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_FORM, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_DATA, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_DATA, PPQRY_ORDPROVVISOR, "A.NOMEOGGEDATA", "NOMEOGGEDATA", 6, 19, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_LIST, 196, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_FORM, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_NUMERO, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_NUMERO, PPQRY_ORDPROVVISOR, "A.NOMEOGGENUME", "NOMEOGGENUME", 5, 10, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_LIST, 272, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_LIST, 52);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_FORM, 4, 100, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_FORM, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_DEBITORE, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_DEBITORE, PPQRY_ORDPROVVISOR, "A.NOMOGGDESBEN", "NOMOGGDESBEN", 5, 50, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_LIST, 464, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_FORM, 128);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_DESCRIZIONE1, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_DESCRIZIONE1, PPQRY_ORDPROVVISOR, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_LIST, 680, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_LIST, 156);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_LIST, "Importo Dett. Provvisiorio");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_FORM, 4, 448, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_FORM, 156);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTNEW, MyGlb.PANEL_FORM, "Importo Dett. Provvisiorio");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_IMPORDETTNEW, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_IMPORDETTNEW, PPQRY_ORDPROVVISOR, "A.NOMOGGIMDENE", "NOMOGGIMDENE", 3, 14, 2, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_LIST, 776, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_LIST, 84);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 328, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_FORM, 84);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_IDFLUSSOBT, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_IDFLUSSOBT, PPQRY_ORDPROVVISOR, "A.NOMOGGIDFLBT", "NOMOGGIDFLBT", 5, 500, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_LIST, 844, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_LIST, 164);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_FORM, 340, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_FORM, 160);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_UNITAORGANIZ, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_UNITAORGANIZ, PPQRY_ORDPROVVISOR, "A.NOMOGGPRUNOR", "NOMOGGPRUNOR", 1, 8, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_LIST, 80);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 256, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_FORM, 80);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGR.");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_PROGRESSIVO1, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_PROGRESSIVO1, PPQRY_ORDPROVVISOR, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 1, 8, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERC.");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_ESERCIZIO1, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_ESERCIZIO1, PPQRY_ORDPROVVISOR, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_LIST, 920, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_LIST, 120);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_LIST, "PROGRESSIVO DETT");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_FORM, 4, 472, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_FORM, 120);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_PROGRESSDETT, MyGlb.PANEL_FORM, "PROGRESSIVO DETT");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_PROGRESSDETT, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_PROGRESSDETT, PPQRY_ORDPROVVISOR, "A.NOMOGGPRODET", "NOMOGGPRODET", 1, 4, 0, -13997);
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_LIST, 116);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_LIST, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_LIST, "Importo Dett Ori");
    PAN_PROVVISORI.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_FORM, 4, 472, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVISORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_FORM, 116);
    PAN_PROVVISORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_FORM, 1);
    PAN_PROVVISORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVISORI_IMPORDETTORI, MyGlb.PANEL_FORM, "Importo Dett Ori");
    PAN_PROVVISORI.SetFieldPage(PFL_PROVVISORI_IMPORDETTORI, -1, -1);
    PAN_PROVVISORI.SetFieldPanel(PFL_PROVVISORI_IMPORDETTORI, PPQRY_ORDPROVVISOR, "A.NOMOGGIMDEOR", "NOMOGGIMDEOR", 3, 14, 2, -13997);
  }

  private void PAN_PROVVISORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROVVISORI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGPRUNOR~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI393.PARAENTRSPES~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_PROVVISORI.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PROVVISORI_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI393.PARAENTRSPES~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_PROVVISORI.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PROVVISORI_UNITAORGANIZ, "");
    PAN_PROVVISORI.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROVVISORI.SetIMDB(IMDB, "PQRY_ORDPROVVISOR", true);
    PAN_PROVVISORI.set_SetString(MyGlb.MASTER_ROWNAME, "ORD PROVVISORI");
    PAN_PROVVISORI.SetQueryIMDB(PPQRY_ORDPROVVISOR, IMDBDef15.PQRY_ORDPROVVISOR_RS, IMDBDef5.TBL_IMDBORDPROVV);
    JustLoaded = true;
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_I, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGETTOI);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_IMPORTO, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMPORD);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_DATA, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDATA);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_NUMERO, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGENUME);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_DEBITORE, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGDESBEN);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_DESCRIZIONE1, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEDESC);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_IMPORDETTNEW, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDENE);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_IDFLUSSOBT, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIDFLBT);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_UNITAORGANIZ, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRUNOR);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_PROGRESSIVO1, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEPROG);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_ESERCIZIO1, IMDBDef5.FLD_IMDBORDPROVV_NOMEOGGEESER);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_PROGRESSDETT, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGPRODET);
    PAN_PROVVISORI.SetFieldPrimaryIndex(PFL_PROVVISORI_IMPORDETTORI, IMDBDef5.FLD_IMDBORDPROVV_NOMOGGIMDEOR);
    PAN_PROVVISORI.SetMasterTable(0, "IMDBORDPROVV");
    PAN_PROVVISORI.AddToSortList(PFL_PROVVISORI_DATA, true);
    PAN_PROVVISORI.AddToSortList(PFL_PROVVISORI_NUMERO, true);
    PAN_PROVVISORI.AddToSortList(PFL_PROVVISORI_PROGRESSIVO1, false);
    PAN_PROVVISORI.AddToSortList(PFL_PROVVISORI_PROGRESSDETT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROVVISORI.Status() == 2)
    {
      int oldListQBE = PAN_PROVVISORI.iUseListQBE;
      PAN_PROVVISORI.iUseListQBE = 0;
      PAN_PROVVISORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROVVISORI.PanelCommand(Glb.PCM_FIND);
      PAN_PROVVISORI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_ValidateRow(Cancel);
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_DynamicProperties();
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROVVISORI) PAN_PROVVISORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
