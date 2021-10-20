// **********************************************
// Scelta Mandati Provvisori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaMandatiProvvisori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TESTATA_ETICHELBLPRO = 0;
  private static int PFL_TESTATA_NUOVAESPRESS = 1;

  private static int PPQRY_DUAL29 = 0;


  IDPanel PAN_TESTATA;
  private static int PFL_MANDATPROVVI_I = 0;
  private static int PFL_MANDATPROVVI_IMPORTO = 1;
  private static int PFL_MANDATPROVVI_DATA = 2;
  private static int PFL_MANDATPROVVI_NUMERO = 3;
  private static int PFL_MANDATPROVVI_BENEFICIARIO = 4;
  private static int PFL_MANDATPROVVI_DESCRIZIONE = 5;
  private static int PFL_MANDATPROVVI_IMPORDETTNEW = 6;
  private static int PFL_MANDATPROVVI_IDFLUSSOBT = 7;
  private static int PFL_MANDATPROVVI_UNITAORGANIZ = 8;
  private static int PFL_MANDATPROVVI_ESERCIZIO = 9;
  private static int PFL_MANDATPROVVI_PROGRESSIVO = 10;
  private static int PFL_MANDATPROVVI_PROGREDETTAG = 11;
  private static int PFL_MANDATPROVVI_IMPORDETTORI = 12;

  private static int PPQRY_MANPROVVISOR = 0;

  private static int PPQRY_CAPUO = 1;


  IDPanel PAN_MANDATPROVVI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBMANDPROV(IMDB);
    Init_TBL_IMDESCMANPRO(IMDB);
    //
    //
    Init_QRY_IMDESCMANPR1(IMDB);
    Init_PQRY_DUAL29(IMDB);
    Init_PQRY_MANPROVVISOR(IMDB);
    Init_PQRY_MANPROVVISOR_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBMANDPROV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_IMDBMANDPROV, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_IMDBMANDPROV, "TBL_IMDBMANDPROV");
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGETTOI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMPMAN, "NOMOGGIMPMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMPMAN,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIDFLBT,5,500,0);
  }

  private static void Init_TBL_IMDESCMANPRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_IMDESCMANPRO, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_IMDESCMANPRO, "TBL_IMDESCMANPRO");
    IMDB.set_FldCode(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef5.TBL_IMDESCMANPRO,IMDBDef5.FLD_IMDESCMANPRO_NOMOGGPRODET,1,4,0);
  }

  private static void Init_QRY_IMDESCMANPR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_IMDESCMANPR1, 3);
    IMDB.set_TblCode(IMDBDef15.QRY_IMDESCMANPR1, "QRY_IMDESCMANPR1");
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VESERCIZIO, "VESERCIZIO");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIV1, "VPROGRESSIV1");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIV1,1,8,0);
    IMDB.set_FldCode(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIVO, "VPROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.QRY_IMDESCMANPR1,IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIVO,1,4,0);
  }

  private static void Init_PQRY_DUAL29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_DUAL29, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_DUAL29, "PQRY_DUAL29");
    IMDB.set_FldCode(IMDBDef15.PQRY_DUAL29,IMDBDef15.PQSL_DUAL29_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef15.PQRY_DUAL29,IMDBDef15.PQSL_DUAL29_NUOVAESPRESS,1,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_DUAL29, 0);
  }

  private static void Init_PQRY_MANPROVVISOR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANPROVVISOR, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANPROVVISOR, "PQRY_MANPROVVISOR");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGETTOI,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMPMAN, "NOMOGGIMPMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMPMAN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIDFLBT,5,500,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_MANPROVVISOR, 0);
  }

  private static void Init_PQRY_MANPROVVISOR_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANPROVVISOR_RS, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANPROVVISOR_RS, "PQRY_MANPROVVISOR_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGETTOI, "NOMEOGGETTOI");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGETTOI,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMPMAN, "NOMOGGIMPMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMPMAN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGENUME,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGDESBEN, "NOMOGGDESBEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGDESBEN,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, "NOMOGGIMDEOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, "NOMOGGIMDENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRODET, "NOMOGGPRODET");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRODET,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRUNOR, "NOMOGGPRUNOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIDFLBT, "NOMOGGIDFLBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVVISOR_RS,IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIDFLBT,5,500,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaMandatiProvvisori(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaMandatiProvvisori()
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
    FormIdx = MyGlb.FRM_SCELMANDPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "90D6C58B-AA4C-43EC-BB7D-3D39ADE3CA45";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1028;
    DesignHeight = 586;
    set_Caption(new IDVariant("Scelta Mandati Provvisori"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1028;
    Frames[1].Height = 560;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1028;
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
    PAN_TESTATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1028-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EBF24C45-382E-4CC6-9DA0-EC7ED6535C73");
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
    Frames[3].Width = 1028;
    Frames[3].Height = 504;
    Frames[3].Caption = "Provvisori da Regolarizzare";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 504;
    PAN_MANDATPROVVI = new IDPanel(w, this, 3, "PAN_MANDATPROVVI");
    Frames[3].Content = PAN_MANDATPROVVI;
    PAN_MANDATPROVVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATPROVVI.VS = MainFrm.VisualStyleList;
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1028-MyGlb.PAN_OFFS_X, 504-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4469F8CF-F9FD-4BE4-B2DB-2B9A838AE429");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 964, 412, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATPROVVI.InitStatus = 2;
    PAN_MANDATPROVVI_Init();
    PAN_MANDATPROVVI_InitFields();
    PAN_MANDATPROVVI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_IMDBMANDPROV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELMANDPROV_MANPROVVISOR();
      }
      PAN_TESTATA.UpdatePanel(MainFrm);
      PAN_MANDATPROVVI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaMandatiProvvisori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaMandatiProvvisori.class.getName() : (Glb.ClassWithPackage(SceltaMandatiProvvisori.class) ? SceltaMandatiProvvisori.class.getName().substring(SceltaMandatiProvvisori.class.getPackage().getName().length() + 1) : SceltaMandatiProvvisori.class.getName()));
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
      PAN_MANDATPROVVI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      RiempiImdbMandatiProvvisori();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMandatiProvvisori", "Load", _e);
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
        if (IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0), true)>0)
        {
          IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
          v_VMSG = (new IDVariant("L'importo del dettaglio non può essere superiore al valore originale ("));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_VMSG, IDL.Format(IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0), (new IDVariant("#,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))), (new IDVariant(")")))); 
          IMDB.set_Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, 0, IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0));
          Cancel.set((new IDVariant(-1)));
        }
      }
      if (Confirm.equals((new IDVariant(0)), true))
      {
        UNLOAD_IMDMANPRODEL();
        UNLOAD_IMDESCMAPRDE();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMandatiProvvisori", "Unload", _e);
    }
  }

  // **********************************************************************
  // Imdb Mandati Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDMANPRODEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDBMANDPROV);
  }

  // **********************************************************************
  // Imdb Escludi Mandati Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDESCMAPRDE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDESCMANPRO);
  }

  // **********************************************************************
  // Mandati Provvisori On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_MANDATPROVVI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati Provvisori On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true))
      {
        RiempiImdbMandatiProvvisori();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMandatiProvvisori", "MandatiProvvisoriOnCommand", _e);
    }
  }

  // **********************************************************************
  // Mandati Provvisori On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_MANDATPROVVI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati Provvisori On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_MANDATPROVVI_IMPORDETTNEW)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0), true)>0)
        {
          IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
          v_VMSG = (new IDVariant("L'importo del dettaglio non può essere superiore al valore originale ("));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_VMSG, IDL.Format(IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0), (new IDVariant("#,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))), (new IDVariant(")")))); 
          IMDB.set_Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDENE, 0, IMDB.Value(IMDBDef15.PQRY_MANPROVVISOR, IMDBDef15.PQSL_MANPROVVISOR_NOMOGGIMDEOR, 0));
        }
        PAN_MANDATPROVVI.SetInput(-1,PFL_MANDATPROVVI_IMPORDETTNEW,2,true); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMandatiProvvisori", "MandatiProvvisoriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Riempi Imdb Mandati Provvisori
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiImdbMandatiProvvisori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Imdb Mandati Provvisori Body
      // Corpo Procedura
      // 
      RIEIMDMANPRO_IMDMANPRODE1();
      RIEIMDMANPRO_IMMAPRININSE();
      RIEIMDMANPRO_IMDESCMANPR1();
      while (!IMDB.Eof(IMDBDef15.QRY_IMDESCMANPR1, 0))
      {
        RIEIMDMANPRO_IMDMANPRODEL();
        IMDB.TblMoveNext(IMDBDef15.QRY_IMDESCMANPR1, 0);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaMandatiProvvisori", "RiempiImdbMandatiProvvisori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imdb Mandati Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEIMDMANPRO_IMDMANPRODE1() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_IMDBMANDPROV);
  }

  // **********************************************************************
  // Imdb Mandati Provvisori: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEIMDMANPRO_IMMAPRININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(CONTA_RIF_NULL(A.ESERCIZIO,A.PROGRESSIVO,'M'), NULL, NULL, 'SI') as I, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.DES_BEN as DES_BEN, ");
    SQL.append("  A.DESCRIZIONE as MANPROVVDESC, ");
    SQL.append("  B.IMPORTO as IMPORTO1, ");
    SQL.append("  B.IMPORTO as IMPODETTMODI, ");
    SQL.append("  B.ESERCIZIO as MANPRODETESE, ");
    SQL.append("  B.PROGR_MAN_PROV as MAPRDEPRMAPR, ");
    SQL.append("  B.PROGRESSIVO as PROGREDETTAG, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.ID_FLUSSO_BT as ID_FLUSSO_BT ");
    SQL.append("from ");
    SQL.append("  MAN_PROVVISORI A, ");
    SQL.append("  MAN_PROV_DETTAGLI B ");
    SQL.append("where (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append("and   (A.PROGRESSIVO = B.PROGR_MAN_PROV) ");
    SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((B.ANNO_LIQ IS NULL)) ");
    SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'CFA' OR A.PROGR_UNITA_ORGANIZZATIVA IN ");
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
      IMDB.TblAddNew(IMDBDef5.TBL_IMDBMANDPROV, 0);
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGETTOI,0,RS.Get(1));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMPMAN,0,RS.Get(2));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDATA,0,RS.Get(3));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGENUME,0,RS.Get(4));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGDESBEN,0,RS.Get(5));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDESC,0,RS.Get(6));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDEOR,0,RS.Get(7));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDENE,0,RS.Get(8));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER,0,RS.Get(9));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG,0,RS.Get(10));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET,0,RS.Get(11));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRUNOR,0,RS.Get(12));
      IMDB.set_Value(IMDBDef5.TBL_IMDBMANDPROV,IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIDFLBT,0,RS.Get(13));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Imdb Escludi Mandati Provvisori
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void RIEIMDMANPRO_IMDESCMANPR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_IMDESCMANPR1);
    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDESCMANPRO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_IMDESCMANPRO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.QRY_IMDESCMANPR1, 0);
      IMDB.TblLinkRow(IMDBDef15.QRY_IMDESCMANPR1, 0, IMDBDef5.TBL_IMDESCMANPRO, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR1, 0, 0, IMDBDef5.TBL_IMDESCMANPRO, IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR1, 1, 0, IMDBDef5.TBL_IMDESCMANPRO, IMDBDef5.FLD_IMDESCMANPRO_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef15.QRY_IMDESCMANPR1, 2, 0, IMDBDef5.TBL_IMDESCMANPRO, IMDBDef5.FLD_IMDESCMANPRO_NOMOGGPRODET, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_IMDESCMANPRO, 0);
      if (IMDB.Eof(IMDBDef5.TBL_IMDESCMANPRO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_IMDESCMANPRO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_IMDESCMANPR1, 0);
  }

  // **********************************************************************
  // Imdb Mandati Provvisori: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEIMDMANPRO_IMDMANPRODEL() throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBMANDPROV, 0);
    while (!IMDB.Eof(IMDBDef5.TBL_IMDBMANDPROV, 0))
    {
      bDeleted = false;
      if (IMDB.Value(IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR1, IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIVO, 0), true))
      {
      if (IMDB.Value(IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR1, IMDBDef15.QSL_IMDESCMANPR1_VPROGRESSIV1, 0), true))
      {
      if (IMDB.Value(IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER, 0).equals(IMDB.Value(IMDBDef15.QRY_IMDESCMANPR1, IMDBDef15.QSL_IMDESCMANPR1_VESERCIZIO, 0), true))
      {
        IMDB.TblDelete(IMDBDef5.TBL_IMDBMANDPROV, 0);
        bDeleted = true;
      }
      }
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef5.TBL_IMDBMANDPROV, 0);
    }
  }

  // **********************************************************************
  // MAN PROVVISORI
  // Primary record source for panel data
  // **********************************************************************
  private void SCELMANDPROV_MANPROVVISOR() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_MANPROVVISOR_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBMANDPROV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_IMDBMANDPROV, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_MANPROVVISOR_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_MANPROVVISOR_RS, 0, IMDBDef5.TBL_IMDBMANDPROV, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 0, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGETTOI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 1, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMPMAN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 2, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 3, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGENUME, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 4, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGDESBEN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 5, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDESC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 6, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDEOR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 7, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDENE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 8, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 9, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 10, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 11, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRUNOR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_MANPROVVISOR_RS, 12, 0, IMDBDef5.TBL_IMDBMANDPROV, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIDFLBT, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_IMDBMANDPROV, 0);
      if (IMDB.Eof(IMDBDef5.TBL_IMDBMANDPROV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_IMDBMANDPROV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef15.PQRY_MANPROVVISOR_RS);
    IMDB.TblSortBy(IMDBDef15.PQRY_MANPROVVISOR_RS,2,true);
    IMDB.TblSortBy(IMDBDef15.PQRY_MANPROVVISOR_RS,3,true);
    IMDB.TblSortBy(IMDBDef15.PQRY_MANPROVVISOR_RS,9,true);
    IMDB.TblSortBy(IMDBDef15.PQRY_MANPROVVISOR_RS,10,true);
    IMDB.TblStartSort(IMDBDef15.PQRY_MANPROVVISOR_RS);
    IMDB.TblMoveFirst(IMDBDef15.PQRY_MANPROVVISOR_RS, 0);
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
  private void PAN_MANDATPROVVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDATPROVVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATPROVVI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATPROVVI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATPROVVI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANDATPROVVI);
    // Stub
  }

  private void PAN_MANDATPROVVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MANDATPROVVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_MANDATPROVVI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATPROVVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MANDATPROVVI_IntValidateRow(Cancel);
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
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "16C32DA8-3002-4EEC-8A42-6903BEECEF0D");
    PAN_TESTATA.set_Header(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "Provvisori da regolarizzare. Il provvisorio associato al dettaglio mandato verrà chiuso.");
    PAN_TESTATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, "LblProvvisori");
    PAN_TESTATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.VIS_ETICHEGRASSE);
    PAN_TESTATA.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TESTATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTATA_NUOVAESPRESS, "CDAB614D-23D2-4B2B-B9AE-89545ED43AC9");
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
    PAN_TESTATA.SetRect(MyGlb.OBJ_FIELD, PFL_TESTATA_ETICHELBLPRO, MyGlb.PANEL_FORM, 16, 12, 988, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_TESTATA.SetFieldPanel(PFL_TESTATA_NUOVAESPRESS, PPQRY_DUAL29, "1", "NUOVAESPRESS", 1, 19, 0, -13997);
  }

  private void PAN_TESTATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TESTATA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TESTATA.SetIMDB(IMDB, "PQRY_DUAL29", true);
    PAN_TESTATA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as NUOVAESPRESS ");
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTATA.SetQuery(PPQRY_DUAL29, 5, SQL, -1, "");
    PAN_TESTATA.SetQueryDB(PPQRY_DUAL29, MainFrm.Cf4armDBObject.DB, 4);
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

  private void PAN_MANDATPROVVI_Init()
  {

    PAN_MANDATPROVVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATPROVVI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANDATPROVVI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, "AD2413ED-2CDD-493A-AE63-0EE959A40A1D");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, "I");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.VIS_CHECKSTYLE);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, "C0B67F19-A534-4FE5-9E5E-B72B0268102B");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, "Importo Tot. Provvisorio");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, "4208E485-3502-4BA3-A6AD-16AA016278F5");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, "Data");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, "4AFF91CA-1DDB-4784-A7BC-54BEA18035BF");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, "Numero");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, "D71E7FB4-9DAE-4E95-9613-2F3ADAE7567E");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, "Beneficiario");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, "DC1FC3FB-0A8C-4BE9-8434-B276494A4E43");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, "Descrizione");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, "6C46CC72-CE2A-42B1-BEC7-8B3D0BEF619D");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, "Importo Dett. Provvisorio");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.VIS_NONNULLAFIEL);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, "F6D4FD21-6FA8-49B6-AFD7-518D21B51AAA");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, "Id Flusso BT");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, "621BD058-87F1-4353-B35C-D57BA828BA3A");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, 0 | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, "2446C842-3B70-4932-9BF2-10952D0A717D");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, "ESERCIZIO");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, "E02A10AF-5742-4975-8DBD-8495DDA5A9EB");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, "PROGRESSIVO");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, "3ED9F8EB-8530-4E1F-BACF-903D09D2E67C");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, "PROGRESSIVO DETTAGLI");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATPROVVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, "E60A20A1-330D-40E0-A233-268B3702CDD3");
    PAN_MANDATPROVVI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, "Importo Dett Ori");
    PAN_MANDATPROVVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, "");
    PAN_MANDATPROVVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.VIS_NONNULLAFIEL);
    PAN_MANDATPROVVI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, 0, -1);
  }

  private void PAN_MANDATPROVVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_LIST, 0, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_LIST, 16);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_LIST, "I");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_FORM, 4, 208, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_FORM, 16);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_I, MyGlb.PANEL_FORM, "I");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_I, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_I, PPQRY_MANPROVVISOR, "A.NOMEOGGETTOI", "NOMEOGGETTOI", 5, 2, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_LIST, 20, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_LIST, "Importo Tot. Provvisorio");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORTO, MyGlb.PANEL_FORM, "Imp. Tot Provvisorio");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_IMPORTO, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_IMPORTO, PPQRY_MANPROVVISOR, "A.NOMOGGIMPMAN", "NOMOGGIMPMAN", 3, 14, 2, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_LIST, 124, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_FORM, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_DATA, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_DATA, PPQRY_MANPROVVISOR, "A.NOMEOGGEDATA", "NOMEOGGEDATA", 6, 19, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_LIST, 200, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_FORM, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_NUMERO, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_NUMERO, PPQRY_MANPROVVISOR, "A.NOMEOGGENUME", "NOMEOGGENUME", 5, 10, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_LIST, 272, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 100, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_FORM, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_BENEFICIARIO, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_BENEFICIARIO, PPQRY_MANPROVVISOR, "A.NOMOGGDESBEN", "NOMOGGDESBEN", 5, 50, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_LIST, 460, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_DESCRIZIONE, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_DESCRIZIONE, PPQRY_MANPROVVISOR, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_LIST, 716, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_LIST, 156);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_LIST, "Importo Dett. Provvisorio");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_FORM, 4, 280, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_FORM, 156);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTNEW, MyGlb.PANEL_FORM, "Importo Dett. Provvisorio");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_IMPORDETTNEW, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_IMPORDETTNEW, PPQRY_MANPROVVISOR, "A.NOMOGGIMDENE", "NOMOGGIMDENE", 3, 14, 2, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_LIST, 816, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_LIST, 84);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 232, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_FORM, 84);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_IDFLUSSOBT, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_IDFLUSSOBT, PPQRY_MANPROVVISOR, "A.NOMOGGIDFLBT", "NOMOGGIDFLBT", 5, 500, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_LIST, 964, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_LIST, 164);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_FORM, 340, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_FORM, 160);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_UNITAORGANIZ, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_UNITAORGANIZ, PPQRY_MANPROVVISOR, "A.NOMOGGPRUNOR", "NOMOGGPRUNOR", 1, 8, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_ESERCIZIO, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_ESERCIZIO, PPQRY_MANPROVVISOR, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 256, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_PROGRESSIVO, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_PROGRESSIVO, PPQRY_MANPROVVISOR, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 1, 8, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_LIST, 1084, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_LIST, 88);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_LIST, "PROGRESSIVO DETTAGLI");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_FORM, 4, 256, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_FORM, 88);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_PROGREDETTAG, MyGlb.PANEL_FORM, "PROGR. DETT.");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_PROGREDETTAG, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_PROGREDETTAG, PPQRY_MANPROVVISOR, "A.NOMOGGPRODET", "NOMOGGPRODET", 1, 4, 0, -13997);
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_LIST, 1084, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_LIST, 64);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_LIST, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_LIST, "Importo Dett Ori");
    PAN_MANDATPROVVI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_FORM, 4, 256, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATPROVVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_FORM, 64);
    PAN_MANDATPROVVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_FORM, 1);
    PAN_MANDATPROVVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATPROVVI_IMPORDETTORI, MyGlb.PANEL_FORM, "Imp. D. O.");
    PAN_MANDATPROVVI.SetFieldPage(PFL_MANDATPROVVI_IMPORDETTORI, -1, -1);
    PAN_MANDATPROVVI.SetFieldPanel(PFL_MANDATPROVVI_IMPORDETTORI, PPQRY_MANPROVVISOR, "A.NOMOGGIMDEOR", "NOMOGGIMDEOR", 3, 14, 2, -13997);
  }

  private void PAN_MANDATPROVVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATPROVVI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGPRUNOR~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI318.PARAENTRSPES~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_MANDATPROVVI.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_MANDATPROVVI_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI318.PARAENTRSPES~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_MANDATPROVVI.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_MANDATPROVVI_UNITAORGANIZ, "");
    PAN_MANDATPROVVI.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATPROVVI.SetIMDB(IMDB, "PQRY_MANPROVVISOR", true);
    PAN_MANDATPROVVI.set_SetString(MyGlb.MASTER_ROWNAME, "MAN PROVVISORI");
    PAN_MANDATPROVVI.SetQueryIMDB(PPQRY_MANPROVVISOR, IMDBDef15.PQRY_MANPROVVISOR_RS, IMDBDef5.TBL_IMDBMANDPROV);
    JustLoaded = true;
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_I, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGETTOI);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_IMPORTO, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMPMAN);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_DATA, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDATA);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_NUMERO, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGENUME);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_BENEFICIARIO, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGDESBEN);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_DESCRIZIONE, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEDESC);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_IMPORDETTNEW, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDENE);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_IDFLUSSOBT, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIDFLBT);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_UNITAORGANIZ, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRUNOR);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_ESERCIZIO, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEESER);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_PROGRESSIVO, IMDBDef5.FLD_IMDBMANDPROV_NOMEOGGEPROG);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_PROGREDETTAG, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGPRODET);
    PAN_MANDATPROVVI.SetFieldPrimaryIndex(PFL_MANDATPROVVI_IMPORDETTORI, IMDBDef5.FLD_IMDBMANDPROV_NOMOGGIMDEOR);
    PAN_MANDATPROVVI.SetMasterTable(0, "IMDBMANDPROV");
    PAN_MANDATPROVVI.AddToSortList(PFL_MANDATPROVVI_DATA, true);
    PAN_MANDATPROVVI.AddToSortList(PFL_MANDATPROVVI_NUMERO, true);
    PAN_MANDATPROVVI.AddToSortList(PFL_MANDATPROVVI_PROGRESSIVO, true);
    PAN_MANDATPROVVI.AddToSortList(PFL_MANDATPROVVI_PROGREDETTAG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDATPROVVI.Status() == 2)
    {
      int oldListQBE = PAN_MANDATPROVVI.iUseListQBE;
      PAN_MANDATPROVVI.iUseListQBE = 0;
      PAN_MANDATPROVVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATPROVVI.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATPROVVI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_ValidateRow(Cancel);
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_DynamicProperties();
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTATA) PAN_TESTATA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_MANDATPROVVI) PAN_MANDATPROVVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
