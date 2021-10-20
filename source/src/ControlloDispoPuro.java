// **********************************************
// Controllo Dispo Puro
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloDispoPuro extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DISPPUROGRUP_CAPART1 = 0;
  private static int GRP_DISPPUROGRUP_IMPSUBIMPACC = 1;

  private static int PFL_DISPPUROGRUP_CAPART1 = 0;
  private static int PFL_DISPPUROGRUP_INFOCAP1 = 1;
  private static int PFL_DISPPUROGRUP_CAPDESCRIZI1 = 2;
  private static int PFL_DISPPUROGRUP_IMP1 = 3;
  private static int PFL_DISPPUROGRUP_INFOIMPACC1 = 4;
  private static int PFL_DISPPUROGRUP_SUBIMP1 = 5;
  private static int PFL_DISPPUROGRUP_INFOSUB1 = 6;
  private static int PFL_DISPPUROGRUP_DESACCIMPSU1 = 7;
  private static int PFL_DISPPUROGRUP_CAPITOLO1 = 8;
  private static int PFL_DISPPUROGRUP_ARTICOLO1 = 9;
  private static int PFL_DISPPUROGRUP_DISPO1 = 10;
  private static int PFL_DISPPUROGRUP_DISPOEFFETT1 = 11;
  private static int PFL_DISPPUROGRUP_IMPORTO1 = 12;
  private static int PFL_DISPPUROGRUP_DISPORISULT1 = 13;
  private static int PFL_DISPPUROGRUP_DISPEFFERIS1 = 14;
  private static int PFL_DISPPUROGRUP_ANNOIMPEGNO1 = 15;
  private static int PFL_DISPPUROGRUP_IMPEGNO1 = 16;
  private static int PFL_DISPPUROGRUP_SUB1 = 17;
  private static int PFL_DISPPUROGRUP_ANNOSUB1 = 18;
  private static int PFL_DISPPUROGRUP_INFOCAP2 = 19;
  private static int PFL_DISPPUROGRUP_INFOACCIMP1 = 20;
  private static int PFL_DISPPUROGRUP_INFOSUBIMP1 = 21;

  private static int PPQRY_IMPUTACONTA3 = 0;

  private static int PPQRY_CAP1 = 1;
  private static int PPQRY_IMG1 = 2;


  IDPanel PAN_DISPPUROGRUP;
  private static int GRP_DISPOPURO_CAPART = 0;
  private static int GRP_DISPOPURO_IMPSUBACC = 1;

  private static int PFL_DISPOPURO_CAPART = 0;
  private static int PFL_DISPOPURO_INFOCAP3 = 1;
  private static int PFL_DISPOPURO_CAPDESCRIZIO = 2;
  private static int PFL_DISPOPURO_IMP = 3;
  private static int PFL_DISPOPURO_INFOIMPACC = 4;
  private static int PFL_DISPOPURO_SUBIMP = 5;
  private static int PFL_DISPOPURO_INFOSUB = 6;
  private static int PFL_DISPOPURO_DESACCIMPSUB = 7;
  private static int PFL_DISPOPURO_ESERCIZIO = 8;
  private static int PFL_DISPOPURO_ES = 9;
  private static int PFL_DISPOPURO_CAPITOLO = 10;
  private static int PFL_DISPOPURO_ARTICOLO = 11;
  private static int PFL_DISPOPURO_ANNOIMPEGNO = 12;
  private static int PFL_DISPOPURO_IMPEGNO = 13;
  private static int PFL_DISPOPURO_ANNOSUB = 14;
  private static int PFL_DISPOPURO_SUB = 15;
  private static int PFL_DISPOPURO_DISPO = 16;
  private static int PFL_DISPOPURO_DISPOEFFETTI = 17;
  private static int PFL_DISPOPURO_IMPORTO = 18;
  private static int PFL_DISPOPURO_DISPORISULTA = 19;
  private static int PFL_DISPOPURO_DISPEFFERISU = 20;
  private static int PFL_DISPOPURO_INFOCAP = 21;
  private static int PFL_DISPOPURO_INFOACCIMP = 22;
  private static int PFL_DISPOPURO_INFOSUBIMP = 23;

  private static int PPQRY_IMPCONSENGRU = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_IMG = 2;


  IDPanel PAN_DISPOPURO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMCDP(IMDB);
    //
    //
    Init_PQRY_IMPUTACONTA3(IMDB);
    Init_PQRY_IMPCONSENGRU(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMCDP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMCDP, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMCDP, "TBL_PARAMCDP");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMEDATA,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMSOSEIM, "ROWNAMSOSEIM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMSOSEIM,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMEES,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMDIVGRU, "ROWNAMDIVGRU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMCDP,IMDBDef5.FLD_PARAMCDP_ROWNAMDIVGRU,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMCDP, 0);
  }

  private static void Init_PQRY_IMPUTACONTA3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPUTACONTA3, 21);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPUTACONTA3, "PQRY_IMPUTACONTA3");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ARTICOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMPEGNO, "IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMPEGNO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_SUB, "SUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_SUB,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ANNO_SUB, "ANNO_SUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_ANNO_SUB,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMP1, "IMP1");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMP1,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_SUBIMP, "SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_SUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_CAPART, "CAPART");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_CAPART,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DESACCIMPSUB, "DESACCIMPSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DESACCIMPSUB,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPO, "DISPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPOEFFETTI, "DISPOEFFETTI");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPOEFFETTI,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPORISULTA, "DISPORISULTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPORISULTA,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPEFFERISU, "DISPEFFERISU");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_DISPEFFERISU,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOCAP, "INFOCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOACCIMP, "INFOACCIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOACCIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOSUBIMP, "INFOSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTACONTA3,IMDBDef14.PQSL_IMPUTACONTA3_INFOSUBIMP,5,99,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPUTACONTA3, 0);
  }

  private static void Init_PQRY_IMPCONSENGRU(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPCONSENGRU, 21);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPCONSENGRU, "PQRY_IMPCONSENGRU");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ARTICOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMPEGNO, "IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMPEGNO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_SUB, "SUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_SUB,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ANNO_SUB, "ANNO_SUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_ANNO_SUB,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMP1, "IMP1");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_IMP1,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_SUBIMP, "SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_SUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_CAPART, "CAPART");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_CAPART,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPO, "DISPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPOEFFETTI, "DISPOEFFETTI");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPOEFFETTI,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DESACCIMPSUB, "DESACCIMPSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DESACCIMPSUB,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPORISULTA, "DISPORISULTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPORISULTA,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPEFFERISU, "DISPEFFERISU");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_DISPEFFERISU,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOCAP, "INFOCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOACCIMP, "INFOACCIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOACCIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOSUBIMP, "INFOSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPCONSENGRU,IMDBDef14.PQSL_IMPCONSENGRU_INFOSUBIMP,5,99,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPCONSENGRU, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloDispoPuro(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloDispoPuro()
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
    FormIdx = MyGlb.FRM_CONTDISPPURO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D2BB9430-B82C-4815-AC52-620B8B9E814A";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1080;
    DesignHeight = 862;
    set_Caption(new IDVariant("Controllo Disponibilità Puro"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1080;
    Frames[1].Height = 836;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.454545;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1080;
    Frames[2].Height = 380;
    Frames[2].Caption = "Disponibilità Puro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 380;
    PAN_DISPPUROGRUP = new IDPanel(w, this, 2, "PAN_DISPPUROGRUP");
    Frames[2].Content = PAN_DISPPUROGRUP;
    PAN_DISPPUROGRUP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPPUROGRUP.VS = MainFrm.VisualStyleList;
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1080-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20419E3E-D3C4-4083-80A3-6E9BBDB1C937");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1412, 284, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 40);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPPUROGRUP.InitStatus = 1;
    PAN_DISPPUROGRUP_Init();
    PAN_DISPPUROGRUP_InitFields();
    PAN_DISPPUROGRUP_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1080;
    Frames[3].Height = 456;
    Frames[3].Caption = "Disponibilità Puro";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 456;
    PAN_DISPOPURO = new IDPanel(w, this, 3, "PAN_DISPOPURO");
    Frames[3].Content = PAN_DISPOPURO;
    PAN_DISPOPURO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPOPURO.VS = MainFrm.VisualStyleList;
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1080-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6CDCEE86-A16D-484C-A938-EAD1D294DE29");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1364, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 40);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPOPURO.InitStatus = 1;
    PAN_DISPOPURO_Init();
    PAN_DISPOPURO_InitFields();
    PAN_DISPOPURO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA19+BaseCmdLinIdx)
      {
        StampaControlloDisponibilitàPuro();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA20+BaseCmdLinIdx)
      {
        StampaControlloDisponibilitàPuro();
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
      PAN_DISPPUROGRUP.UpdatePanel(MainFrm);
      PAN_DISPOPURO.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloDispoPuro);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloDispoPuro.class.getName() : (Glb.ClassWithPackage(ControlloDispoPuro.class) ? ControlloDispoPuro.class.getName().substring(ControlloDispoPuro.class.getPackage().getName().length() + 1) : ControlloDispoPuro.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_PARAMCDPDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param CDP: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMCDPDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMSOSEIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMDIVGRU, 0, new IDVariant());
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
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0, (new IDVariant("S")));
      }
      switch (1) // Allows the use of BREAK inside ifs
      {
        default:
        if (IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0).equals((new IDVariant("S"))))	
        {
          // 
          // Dispo Puro Gruppo
          // 
          PAN_DISPPUROGRUP.set_Header(Glb.OBJ_GROUP,GRP_DISPPUROGRUP_IMPSUBIMPACC,(new IDVariant("Impegno/SubImpegno")).stringValue()); 
          PAN_DISPPUROGRUP.set_Header(Glb.OBJ_FIELD,PFL_DISPPUROGRUP_IMP1, (new IDVariant("Impegno")).stringValue());
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.set_Header(Glb.OBJ_GROUP,GRP_DISPOPURO_IMPSUBACC,(new IDVariant("Impegno/SubImpegno")).stringValue()); 
          PAN_DISPOPURO.set_Header(Glb.OBJ_FIELD,PFL_DISPOPURO_IMP, (new IDVariant("Impegno")).stringValue());
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0).equals((new IDVariant("E"))))	
        {
          // 
          // Dispo puro gruppo
          // 
          PAN_DISPPUROGRUP.set_Header(Glb.OBJ_GROUP,GRP_DISPPUROGRUP_IMPSUBIMPACC,(new IDVariant("Accertamento")).stringValue()); 
          PAN_DISPPUROGRUP.set_Header(Glb.OBJ_FIELD,PFL_DISPPUROGRUP_IMP1, (new IDVariant("Accertamento")).stringValue());
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPPUROGRUP.SetFlags (Glb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // 
          // Dispo Puro
          // 
          PAN_DISPOPURO.set_Header(Glb.OBJ_GROUP,GRP_DISPOPURO_IMPSUBACC,(new IDVariant("Accertamento")).stringValue()); 
          PAN_DISPOPURO.set_Header(Glb.OBJ_FIELD,PFL_DISPOPURO_IMP, (new IDVariant("Accertamento")).stringValue());
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DISPOPURO.SetFlags (Glb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        break;
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMDIVGRU, 0),(new IDVariant("N"))).equals((new IDVariant("N")), true))
      {
        PAN_DISPPUROGRUP.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DISPOPURO.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_DISPPUROGRUP.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DISPOPURO.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "Load", _e);
    }
  }

  // **********************************************************************
  // Dispo Puro Gruppo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISPPUROGRUP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISPPUROGRUP);
      // 
      // Dispo Puro Gruppo On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DISPPUROGRUP.set_ToolTip(Glb.OBJ_FIELD,PFL_DISPPUROGRUP_CAPDESCRIZI1,(new IDVariant(PAN_DISPPUROGRUP.FieldText(PFL_DISPPUROGRUP_CAPDESCRIZI1))).stringValue()); 
      PAN_DISPPUROGRUP.set_ToolTip(Glb.OBJ_FIELD,PFL_DISPPUROGRUP_DESACCIMPSU1,(new IDVariant(PAN_DISPPUROGRUP.FieldText(PFL_DISPPUROGRUP_DESACCIMPSU1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "DispoPuroGruppoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Dispo Puro On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISPOPURO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISPOPURO);
      // 
      // Dispo Puro On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DISPOPURO.set_ToolTip(Glb.OBJ_FIELD,PFL_DISPOPURO_CAPDESCRIZIO,(new IDVariant(PAN_DISPOPURO.FieldText(PFL_DISPOPURO_CAPDESCRIZIO))).stringValue()); 
      PAN_DISPOPURO.set_ToolTip(Glb.OBJ_FIELD,PFL_DISPOPURO_DESACCIMPSUB,(new IDVariant(PAN_DISPOPURO.FieldText(PFL_DISPOPURO_DESACCIMPSUB))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "DispoPuroOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Stampa Controllo Disponibilità Puro
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaControlloDisponibilitàPuro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Controllo Disponibilità Puro Body
      // Corpo Procedura
      // 
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Gps_Controllo_Dispo_Puro"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TITOLO")), IDL.Add((new IDVariant("Disponibilità Puro su Imputazioni Contabili di ")), ((IMDB.Value(IMDBDef5.TBL_PARAM63, IMDBDef5.FLD_PARAM63_ROWNAMEES, 0).equals((new IDVariant("S")), true))?(new IDVariant("Spesa")):(new IDVariant("Entrata")))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ES")), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAM63, IMDBDef5.FLD_PARAM63_ROWNAMEES, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CODICE_PERS")), IDL.ToString(MainFrm.CODICEPERS));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DIVISIONE_GRUPPI")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAM63, IMDBDef5.FLD_PARAM63_ROWNAMDIVGRU, 0),(new IDVariant("N")))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAM62, IMDBDef14.PQSL_PARAM62_ROWNAMEDATA, 0)));
      // 
      // Nella stampa vedo sempre tutti
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_SENZA_IMPEGNO")), IDL.ToString((new IDVariant("NO"))));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "StampaControlloDisponibilitàPuro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Capitolo - Input
  // p Articolo - Input
  // **********************************************************************
  public int ApriInfoCapitolo (IDVariant pCapitolo, IDVariant pArticolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Capitolo Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(pArticolo) || IDL.IsNull(pCapitolo))
      {
        return 0;
      }
      if ((MainFrm.GetForm(MyGlb.FRM_INFOSUVOCBIL, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, new IDVariant(new IDVariant(pCapitolo),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, new IDVariant(pArticolo));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Capitolo DP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoCapitoloDP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Capitolo DP Body
      // Corpo Procedura
      // 
      ApriInfoCapitolo(IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_ARTICOLO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoCapitoloDP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Capitolo DPG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoCapitoloDPG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Capitolo DPG Body
      // Corpo Procedura
      // 
      ApriInfoCapitolo(IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_ARTICOLO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoCapitoloDPG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Imp Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Anno Imp Acc - Input
  // p Numero Imp Acc - Input
  // **********************************************************************
  public int ApriInfoImpAcc (IDVariant pAnnoImpAcc, IDVariant pNumeroImpAcc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Imp Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(pAnnoImpAcc)) && !(IDL.IsNull(pNumeroImpAcc)))
      {
        if (IMDB.Value(IMDBDef5.TBL_PARAMCDP, IMDBDef5.FLD_PARAMCDP_ROWNAMEES, 0).equals((new IDVariant("E")), true))
        {
          if ((MainFrm.GetForm(MyGlb.FRM_INFOACCEFORM, 0, false)!=null))
          {
            MainFrm.UnloadForm(MyGlb.FRM_INFOACCEFORM,(new IDVariant(0)).booleanValue()); 
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, new IDVariant(pNumeroImpAcc));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, new IDVariant(pAnnoImpAcc));
          if (pAnnoImpAcc.equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFO")));
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFORES")));
          }
          MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          if ((MainFrm.GetForm(MyGlb.FRM_INFORMIMPEGN, 0, false)!=null))
          {
            MainFrm.UnloadForm(MyGlb.FRM_INFORMIMPEGN,(new IDVariant(0)).booleanValue()); 
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, new IDVariant(pAnnoImpAcc));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, new IDVariant(pNumeroImpAcc));
          if (pAnnoImpAcc.equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
          }
          MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
        }
      }
      else
      {
        return 0;
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoImpAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Imp Acc DP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoImpAccDP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Imp Acc DP Body
      // Corpo Procedura
      // 
      ApriInfoImpAcc(IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_ANNO_IMPEGNO, 0), IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_IMPEGNO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoImpAccDP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Imp Acc DPG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoImpAccDPG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Imp Acc DPG Body
      // Corpo Procedura
      // 
      ApriInfoImpAcc(IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_ANNO_IMPEGNO, 0), IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_IMPEGNO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoImpAccDPG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Subimp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Anno Sub - Input
  // p Numero Sub - Input
  // **********************************************************************
  public int ApriInfoSubimp (IDVariant pAnnoSub, IDVariant pNumeroSub)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Subimp Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(pAnnoSub) || IDL.IsNull(pNumeroSub))
      {
        return 0;
      }
      if ((MainFrm.GetForm(MyGlb.FRM_INFORSUBIMPE, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, new IDVariant(pAnnoSub));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, new IDVariant(pNumeroSub));
      if (pAnnoSub.equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Sub Imp DP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoSubImpDP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Sub Imp DP Body
      // Corpo Procedura
      // 
      ApriInfoSubimp(IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_ANNO_SUB, 0), IMDB.Value(IMDBDef14.PQRY_IMPCONSENGRU, IMDBDef14.PQSL_IMPCONSENGRU_SUB, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoSubImpDP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Sub Imp DPG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoSubImpDPG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Sub Imp DPG Body
      // Corpo Procedura
      // 
      ApriInfoSubimp(IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_ANNO_SUB, 0), IMDB.Value(IMDBDef14.PQRY_IMPUTACONTA3, IMDBDef14.PQSL_IMPUTACONTA3_SUB, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDispoPuro", "ApriInfoSubImpDPG", _e);
      return -1;
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISPPUROGRUP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISPPUROGRUP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISPPUROGRUP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISPPUROGRUP, Cancel);
    // Stub
  }

  private void PAN_DISPPUROGRUP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISPPUROGRUP_INFOCAP1)
    {
      this.IdxPanelActived = this.PAN_DISPPUROGRUP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoCapitoloDPG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISPPUROGRUP_INFOIMPACC1)
    {
      this.IdxPanelActived = this.PAN_DISPPUROGRUP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpAccDPG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISPPUROGRUP_INFOSUB1)
    {
      this.IdxPanelActived = this.PAN_DISPPUROGRUP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubImpDPG();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISPPUROGRUP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISPPUROGRUP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISPPUROGRUP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISPOPURO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISPOPURO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISPOPURO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISPOPURO, Cancel);
    // Stub
  }

  private void PAN_DISPOPURO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISPOPURO_INFOCAP3)
    {
      this.IdxPanelActived = this.PAN_DISPOPURO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoCapitoloDP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISPOPURO_INFOIMPACC)
    {
      this.IdxPanelActived = this.PAN_DISPOPURO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpAccDP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISPOPURO_INFOSUB)
    {
      this.IdxPanelActived = this.PAN_DISPOPURO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubImpDP();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISPOPURO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISPOPURO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISPOPURO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISPPUROGRUP_Init()
  {

    PAN_DISPPUROGRUP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPPUROGRUP.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, "5FD835F9-DC50-464E-978B-9477EA72D12D");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, "Capitolo/Articolo");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, MyGlb.PANEL_LIST, 0, -9999, 380, 20, 0, 0);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, MyGlb.PANEL_FORM, 0, 423, 604, 349, 0, 0);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, 0, 39);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, 1, 13);
    PAN_DISPPUROGRUP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, 0, 4);
    PAN_DISPPUROGRUP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, 1, 4);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_CAPART1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, "1BB75CCF-D4A7-4179-9287-D240DE6B0D72");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, "Impegno/SubImpegno/Accertamento");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, MyGlb.VIS_GROUPSTYLE);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, MyGlb.PANEL_LIST, 380, -9999, 444, 20, 0, 0);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, MyGlb.PANEL_FORM, 0, 507, 632, 313, 0, 0);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, 0, 93);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, 1, 13);
    PAN_DISPPUROGRUP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, 0, 4);
    PAN_DISPPUROGRUP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, 1, 4);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPPUROGRUP_IMPSUBIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPPUROGRUP.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, "9E947995-3C1C-4314-8A21-31274B4EA17B");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, "Capitolo/Articolo");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, "3B3393E3-306C-460E-9A93-7DCF6542780C");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, " ");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, "3D7FAF0B-F4C7-438B-B5DC-E86762E9C163");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, "Descrizione");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, "1F2C0D0B-2AEA-45DF-A038-86F656C0DE84");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, "Impegno");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, "3E31F9DA-EFE0-41EA-BDE3-18FAC87C847E");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, " ");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, "CD18ACD8-41BC-4476-875F-FD2FB89AB41C");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, "SubImpegno");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, "8D9F538B-0249-4597-978B-6535568AD3EA");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, " ");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, "C2C72D90-3405-41D8-9909-51589D873DFC");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, "Descrizione");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, "2562536C-471D-44D9-8C61-4860A9932556");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, "CAPITOLO");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, 0, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, "4EE6863F-23A6-496E-B543-56937764C005");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, "ARTICOLO");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, 0, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, "D3B0FE5C-C498-4290-9082-6A90042F4053");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, "Disponibilità");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, "89A155AC-43BA-4CB1-9784-4F01D895C102");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, "Disponibilità Effettiva");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, "E1C98C29-D257-4D3A-B3DD-EA060832904D");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, "Importo Imputazione");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, "833F5283-EE63-45B4-9FA2-92ED390ADD38");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, "Disponibilità Risultante");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, "B8C5D0FD-40DA-487C-B80A-2C642677D03D");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, "Disponibilità Effettiva Risultante");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, "241D4B37-2E27-4CA9-B30D-C0C07CED2286");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, "ANNO IMPEGNO");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, "FFE2E900-D966-49EF-9E24-B1701CE9072D");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, "IMPEGNO");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, "6EF1CED3-9870-43B6-8237-F214662A1B75");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, "SUB");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, "851160F5-C069-4B51-928E-049DE2482E52");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, "ANNO SUB");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, "D7D480EF-AE07-47A5-BDFA-9E6CFBFEA127");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, "Info Cap");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, "50490F36-9F05-4127-B477-246771E2E1AD");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, "Info Acc Imp");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPPUROGRUP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, "AE27153A-E009-4848-89C3-A121216EE610");
    PAN_DISPPUROGRUP.set_Header(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, "Info Sub Imp");
    PAN_DISPPUROGRUP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, "");
    PAN_DISPPUROGRUP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPPUROGRUP.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPPUROGRUP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_LIST, 0, 44, 124, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_LIST, 52);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_LIST, "Capitolo/Articolo");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_FORM, 4, 580, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_FORM, 52);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPART1, MyGlb.PANEL_FORM, "Cp. Art.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_CAPART1, -1, GRP_DISPPUROGRUP_CAPART1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_CAPART1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_CAPART1, PPQRY_IMPUTACONTA3, "CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END", "CAPART", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_LIST, 124, 44, 32, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_LIST, 88);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_LIST, " ");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_FORM, 4, 748, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_FORM, 88);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP1, MyGlb.PANEL_FORM, " ");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOCAP1, -1, GRP_DISPPUROGRUP_CAPART1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOCAP1, PPQRY_IMG1, "CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPPUROGRUP.set_ImageResizeMode(PFL_DISPPUROGRUP_INFOCAP1, 2);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_LIST, 156, 44, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_FORM, 4, 448, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_CAPDESCRIZI1, -1, GRP_DISPPUROGRUP_CAPART1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_CAPDESCRIZI1, PPQRY_CAP1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_LIST, 380, 44, 124, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_LIST, 32);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_LIST, "Impegno");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_FORM, 4, 532, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_FORM, 32);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMP1, MyGlb.PANEL_FORM, "Imp.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_IMP1, -1, GRP_DISPPUROGRUP_IMPSUBIMPACC);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_IMP1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_IMP1, PPQRY_IMPUTACONTA3, "CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END", "IMP1", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_LIST, 504, 44, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_LIST, 116);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_LIST, " ");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_FORM, 4, 772, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_FORM, 116);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOIMPACC1, MyGlb.PANEL_FORM, " ");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOIMPACC1, -1, GRP_DISPPUROGRUP_IMPSUBIMPACC);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOIMPACC1, PPQRY_IMG1, "CASE WHEN NOT ((~~IMPEGNO~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOIMPACC", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOIMPACC1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPPUROGRUP.set_ImageResizeMode(PFL_DISPPUROGRUP_INFOIMPACC1, 2);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_LIST, 528, 44, 116, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_LIST, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_LIST, "SubImpegno");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_FORM, 4, 556, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_FORM, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUBIMP1, MyGlb.PANEL_FORM, "SubImp.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_SUBIMP1, -1, GRP_DISPPUROGRUP_IMPSUBIMPACC);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_SUBIMP1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_SUBIMP1, PPQRY_IMPUTACONTA3, "CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END", "SUBIMP", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_LIST, 644, 44, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_LIST, 88);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_LIST, " ");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_FORM, 4, 796, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_FORM, 88);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUB1, MyGlb.PANEL_FORM, " ");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOSUB1, -1, GRP_DISPPUROGRUP_IMPSUBIMPACC);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOSUB1, PPQRY_IMG1, "CASE WHEN NOT ((~~SUB~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOSUB", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUB1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPPUROGRUP.set_ImageResizeMode(PFL_DISPPUROGRUP_INFOSUB1, 2);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_LIST, 672, 44, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_LIST, 116);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_FORM, 4, 652, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_FORM, 116);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DESACCIMPSU1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_DESACCIMPSU1, -1, GRP_DISPPUROGRUP_IMPSUBIMPACC);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_DESACCIMPSU1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_DESACCIMPSU1, PPQRY_IMPUTACONTA3, "GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB)", "DESACCIMPSUB", 1, 19, 0, -13997);
    PAN_DISPPUROGRUP.set_Alignment(PFL_DISPPUROGRUP_DESACCIMPSU1, 2);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_LIST, 632, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_FORM, 4, 484, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_CAPITOLO1, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_CAPITOLO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_CAPITOLO1, PPQRY_IMPUTACONTA3, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_LIST, 1136, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_LIST, "ARTICOLO");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_FORM, 4, 508, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ARTICOLO1, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_ARTICOLO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_ARTICOLO1, PPQRY_IMPUTACONTA3, "A.ARTICOLO", "ARTICOLO", 1, 6, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_LIST, 824, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_LIST, 40);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_FORM, 4, 604, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_FORM, 40);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPO1, MyGlb.PANEL_FORM, "Disp.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_DISPO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_DISPO1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_DISPO1, PPQRY_IMPUTACONTA3, "GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB)", "DISPO", 3, 28, 6, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_LIST, 932, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_LIST, 92);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_LIST, "Disponibilità Effettiva");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_FORM, 4, 628, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_FORM, 92);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPOEFFETT1, MyGlb.PANEL_FORM, "Dispon. Effet.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_DISPOEFFETT1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_DISPOEFFETT1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_DISPOEFFETT1, PPQRY_IMPUTACONTA3, "GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL))", "DISPOEFFETTI", 3, 28, 6, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_LIST, 1036, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_LIST, "Importo Imputazione");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_FORM, 4, 676, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPORTO1, MyGlb.PANEL_FORM, "Im. Imp.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_IMPORTO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_IMPORTO1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_IMPORTO1, PPQRY_IMPUTACONTA3, "SUM(NVL(A.IMPORTO, 0))", "IMPORTO", 3, 28, 6, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_LIST, 1140, 44, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_LIST, 100);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_LIST, "Disponibilità Risultante");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_FORM, 4, 700, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_FORM, 100);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPORISULT1, MyGlb.PANEL_FORM, "Dispon. Risult.");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_DISPORISULT1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_DISPORISULT1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_DISPORISULT1, PPQRY_IMPUTACONTA3, "(GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) - SUM(NVL(A.IMPORTO, 0)))", "DISPORISULTA", 3, 28, 6, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_LIST, 1260, 44, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_LIST, 152);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_LIST, "Disponibilità Effettiva Risultante");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_FORM, 4, 724, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_FORM, 152);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_DISPEFFERIS1, MyGlb.PANEL_FORM, "Dispon. Effet. Risultante");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_DISPEFFERIS1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_DISPEFFERIS1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_DISPEFFERIS1, PPQRY_IMPUTACONTA3, "(GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) - SUM(NVL(A.IMPORTO, 0)))", "DISPEFFERISU", 3, 28, 6, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_LIST, 1316, 44, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_LIST, 92);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_LIST, "ANNO IMPEGNO");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_FORM, 4, 820, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_FORM, 92);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOIMPEGNO1, MyGlb.PANEL_FORM, "ANNO IMPEGNO");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_ANNOIMPEGNO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_ANNOIMPEGNO1, PPQRY_IMPUTACONTA3, "A.ANNO_IMPEGNO", "ANNO_IMPEGNO", 1, 4, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_LIST, 1316, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_LIST, 60);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_LIST, "IMPEGNO");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_FORM, 4, 820, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_FORM, 60);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_IMPEGNO1, MyGlb.PANEL_FORM, "IMPEGNO");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_IMPEGNO1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_IMPEGNO1, PPQRY_IMPUTACONTA3, "A.IMPEGNO", "IMPEGNO", 1, 6, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_LIST, 1408, 44, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_LIST, 32);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_LIST, "SUB");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_FORM, 4, 844, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_FORM, 32);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_SUB1, MyGlb.PANEL_FORM, "SUB");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_SUB1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_SUB1, PPQRY_IMPUTACONTA3, "A.SUB", "SUB", 1, 6, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_LIST, 1448, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_LIST, 64);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_LIST, "ANNO SUB");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_FORM, 4, 868, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_FORM, 64);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_ANNOSUB1, MyGlb.PANEL_FORM, "ANNO SUB");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_ANNOSUB1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_ANNOSUB1, PPQRY_IMPUTACONTA3, "A.ANNO_SUB", "ANNO_SUB", 1, 4, 0, -13997);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_LIST, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_LIST, "Info Cap");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_FORM, 4, 820, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_FORM, 56);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOCAP2, MyGlb.PANEL_FORM, "Info Cap");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOCAP2, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_INFOCAP2, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOCAP2, PPQRY_IMPUTACONTA3, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOCAP2, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_LIST, 80);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_LIST, "Info Acc Imp");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_FORM, 4, 820, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_FORM, 80);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOACCIMP1, MyGlb.PANEL_FORM, "Info Acc Imp");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOACCIMP1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_INFOACCIMP1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOACCIMP1, PPQRY_IMPUTACONTA3, "CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END", "INFOACCIMP", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOACCIMP1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_LIST, 84);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_LIST, "Info Sub Imp");
    PAN_DISPPUROGRUP.SetRect(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_FORM, 4, 820, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPPUROGRUP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_FORM, 84);
    PAN_DISPPUROGRUP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISPPUROGRUP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPPUROGRUP_INFOSUBIMP1, MyGlb.PANEL_FORM, "Info Sub Imp");
    PAN_DISPPUROGRUP.SetFieldPage(PFL_DISPPUROGRUP_INFOSUBIMP1, -1, -1);
    PAN_DISPPUROGRUP.SetFieldUnbound(PFL_DISPPUROGRUP_INFOSUBIMP1, true);
    PAN_DISPPUROGRUP.SetFieldPanel(PFL_DISPPUROGRUP_INFOSUBIMP1, PPQRY_IMPUTACONTA3, "CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END", "INFOSUBIMP", 5, 99, 0, -13997);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPPUROGRUP.SetValueListItem(PFL_DISPPUROGRUP_INFOSUBIMP1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
  }

  private void PAN_DISPPUROGRUP_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPPUROGRUP.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    PAN_DISPPUROGRUP.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPPUROGRUP.SetMasterTable(PPQRY_CAP1, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) THEN 'I' ELSE NULL END as INFOCAP, ");
    SQL.append("  CASE WHEN NOT ((~~IMPEGNO~~ IS NULL)) THEN 'I' ELSE NULL END as INFOIMPACC, ");
    SQL.append("  CASE WHEN NOT ((~~SUB~~ IS NULL)) THEN 'I' ELSE NULL END as INFOSUB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMG1, 0, SQL, -1, "");
    PAN_DISPPUROGRUP.SetQueryDB(PPQRY_IMG1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPPUROGRUP.SetMasterTable(PPQRY_IMG1, "DUAL");
    PAN_DISPPUROGRUP.SetIMDB(IMDB, "PQRY_IMPUTACONTA3", true);
    PAN_DISPPUROGRUP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPEGNO as IMPEGNO, ");
    SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
    SQL.append("  A.SUB as SUB, ");
    SQL.append("  A.ANNO_SUB as ANNO_SUB, ");
    SQL.append("  CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END as IMP1, ");
    SQL.append("  CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END as SUBIMP, ");
    SQL.append("  CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END as CAPART, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) as DESACCIMPSUB, ");
    SQL.append("  SUM(NVL(A.IMPORTO, 0)) as IMPORTO, ");
    SQL.append("  GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) as DISPO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) as DISPOEFFETTI, ");
    SQL.append("  (GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) - SUM(NVL(A.IMPORTO, 0))) as DISPORISULTA, ");
    SQL.append("  (GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) - SUM(NVL(A.IMPORTO, 0))) as DISPEFFERISU, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END as INFOCAP, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END as INFOACCIMP, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END as INFOSUBIMP ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMPUTAZIONI_CONTABILI A, ");
    SQL.append("  T72 B ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SEZIONE LIKE B.SEZIONE) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMCDP.ROWNAMEES~~) ");
    SQL.append("and   (A.DATA = NVL(~~TBL_PARAMCDP.ROWNAMEDATA~~, A.DATA)) ");
    SQL.append("and   (NVL(~~TBL_PARAMCDP.ROWNAMDIVGRU~~, 'N') <> 'N') ");
    SQL.append("and   (NVL(A.DIVISIONE, '') = NVL(" + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.DIVISIONE, ''))) ");
    SQL.append("and   (NVL(~~TBL_PARAMCDP.ROWNAMSOSEIM~~, 'NO') = 'NO' OR (NVL(~~TBL_PARAMCDP.ROWNAMSOSEIM~~, 'NO') = 'SI' AND (A.IMPEGNO IS NULL))) ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.IMPEGNO, ");
    SQL.append("  A.ANNO_IMPEGNO, ");
    SQL.append("  A.SUB, ");
    SQL.append("  A.ANNO_SUB, ");
    SQL.append("  CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END, ");
    SQL.append("  CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END, ");
    SQL.append("  CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END, ");
    SQL.append("  A.DATA, ");
    SQL.append("  GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB), ");
    SQL.append("  GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB), ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)), ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END ");
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPPUROGRUP.SetQuery(PPQRY_IMPUTACONTA3, 5, SQL, -1, "");
    PAN_DISPPUROGRUP.SetQueryDB(PPQRY_IMPUTACONTA3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPPUROGRUP.SetMasterTable(0, "IMPUTAZIONI_CONTABILI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISPPUROGRUP.Status() == 2)
    {
      int oldListQBE = PAN_DISPPUROGRUP.iUseListQBE;
      PAN_DISPPUROGRUP.iUseListQBE = 0;
      PAN_DISPPUROGRUP.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISPPUROGRUP.PanelCommand(Glb.PCM_FIND);
      PAN_DISPPUROGRUP.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISPOPURO_Init()
  {

    PAN_DISPOPURO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPOPURO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, "163A070B-5696-4270-8377-72C4A153E2D8");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, "Capitolo/Articolo");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, MyGlb.PANEL_LIST, 0, -9999, 376, 20, 0, 0);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, MyGlb.PANEL_FORM, 0, -21, 604, 793, 0, 0);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, 0, 39);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, 1, 13);
    PAN_DISPOPURO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, 0, 4);
    PAN_DISPOPURO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, 1, 4);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPOPURO_CAPART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, "258A566D-2BD5-4361-9509-D33669777D01");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, "Impegno/SubImpegno/Accertamento");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, MyGlb.VIS_GROUPSTYLE);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, MyGlb.PANEL_LIST, 376, -9999, 448, 20, 0, 0);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, MyGlb.PANEL_FORM, 0, 3, 632, 817, 0, 0);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, 0, 70);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, 1, 13);
    PAN_DISPOPURO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, 0, 4);
    PAN_DISPOPURO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, 1, 4);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_GROUP, GRP_DISPOPURO_IMPSUBACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISPOPURO.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, "53979D10-A5E8-4E67-B967-3F72CB4715DB");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, "Capitolo/Articolo");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, "4FA852D0-CF4A-423E-A1D3-1EA45BB20FDB");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, " ");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, "F2CC7C89-8BD7-4D16-980C-8B25D6D0BCAF");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, "Descrizione");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, "5A4A96B3-B5FE-4798-BB69-9C1A9BA311BC");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, "Impegno");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, "2A3A19D5-0726-4813-A516-72E8F0C36E42");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, " ");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.VIS_HYPLINIMLOU1);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, "ED2E043E-8B93-48A9-9847-B9EF11ED0EE6");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, "SubImpegno");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, "83E0666C-6D52-4CB8-9586-82678D8B39C6");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, " ");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.VIS_HYPLINIMLOU1);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, "19C89446-2351-4497-A906-EDD904B50EBD");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, "Descrizione");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, "B2CAD9B1-1348-41A7-AD56-2506ED122608");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, "ESERCIZIO");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, 0, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, "4E237C30-D72F-43FD-9775-74FE55556EB4");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, "E S");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, 0, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, "B679C4C2-996C-4CA6-A196-0ECB6F01B58A");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, "CAPITOLO");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, 0, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, "8373B2DC-6A68-4B46-B20E-D3AD53EFD29C");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, "ARTICOLO");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, 0, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, "2349347A-9094-4A44-B819-10F47D3C6713");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, "ANNO IMPEGNO");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, "D8E19F28-3980-467C-AC3C-BB40D8BDEFD3");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, "IMPEGNO");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, "09041E95-39C6-45EF-8966-B5B5E7B71D0F");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, "ANNO SUB");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, "F64C9FC2-A940-4F77-A35D-561E872F45D3");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, "SUB");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, "FB290E54-6075-4549-B451-E7B846AD9239");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, "Disponibilità");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, "0C37EBB3-A6BB-4ED9-B4FF-1A74C03BC159");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, "Disponibilità Effettiva");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, "E8ED6EBD-746D-431A-B25D-5225A4BD05F4");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, "Importo Imputazione");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, "04EDF534-0D9D-40E9-B842-CDE1A80AA35D");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, "Disponibilità Risultante");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, "984B75B3-A21C-45C8-A6CF-877FE92F4139");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, "Disponibilità Effettiva Risultante");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.VIS_NORMALFIELDS);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, "D954658A-D8CA-4B1E-B944-D7268DFB9397");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, "Info Cap");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, "B64FE15A-DEEE-4EB1-AD24-C7A95CA03C04");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, "Info Acc Imp");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISPOPURO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, "2CFD1554-196A-4A58-BC5A-64AC590DF1B8");
    PAN_DISPOPURO.set_Header(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, "Info Sub Imp");
    PAN_DISPOPURO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, "");
    PAN_DISPOPURO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISPOPURO.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPOPURO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_LIST, 0, 44, 124, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_LIST, 52);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_LIST, "Capitolo/Articolo");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_FORM, 4, 4, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_FORM, 52);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPART, MyGlb.PANEL_FORM, "Cp. Art.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_CAPART, -1, GRP_DISPOPURO_CAPART);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_CAPART, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_CAPART, PPQRY_IMPCONSENGRU, "CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END", "CAPART", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_LIST, 124, 44, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_LIST, 88);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_LIST, " ");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_FORM, 4, 748, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_FORM, 88);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP3, MyGlb.PANEL_FORM, " ");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOCAP3, -1, GRP_DISPOPURO_CAPART);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOCAP3, PPQRY_IMG, "CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP3, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPOPURO.set_ImageResizeMode(PFL_DISPOPURO_INFOCAP3, 2);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 152, 44, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 448, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_CAPDESCRIZIO, -1, GRP_DISPOPURO_CAPART);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_LIST, 376, 44, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_LIST, 32);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_LIST, "Impegno");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_FORM, 4, 52, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_FORM, 32);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMP, MyGlb.PANEL_FORM, "Imp.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_IMP, -1, GRP_DISPOPURO_IMPSUBACC);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_IMP, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_IMP, PPQRY_IMPCONSENGRU, "CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END", "IMP1", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_LIST, 504, 44, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_LIST, 116);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_LIST, " ");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_FORM, 4, 772, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_FORM, 116);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOIMPACC, MyGlb.PANEL_FORM, " ");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOIMPACC, -1, GRP_DISPOPURO_IMPSUBACC);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOIMPACC, PPQRY_IMG, "CASE WHEN NOT ((~~ANNO_IMPEGNO~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOIMPACC", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOIMPACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPOPURO.set_ImageResizeMode(PFL_DISPOPURO_INFOIMPACC, 2);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_LIST, 532, 44, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_LIST, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_LIST, "SubImpegno");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_FORM, 4, 28, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_FORM, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUBIMP, MyGlb.PANEL_FORM, "SubImp.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_SUBIMP, -1, GRP_DISPOPURO_IMPSUBACC);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_SUBIMP, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_SUBIMP, PPQRY_IMPCONSENGRU, "CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END", "SUBIMP", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_LIST, 644, 44, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_LIST, 88);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_LIST, " ");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_FORM, 4, 796, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_FORM, 88);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUB, MyGlb.PANEL_FORM, " ");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOSUB, -1, GRP_DISPOPURO_IMPSUBACC);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOSUB, PPQRY_IMG, "CASE WHEN NOT ((~~ANNO_SUB~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOSUB", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUB, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPOPURO.set_ImageResizeMode(PFL_DISPOPURO_INFOSUB, 2);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_LIST, 672, 44, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_LIST, 116);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_FORM, 4, 604, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_FORM, 116);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DESACCIMPSUB, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_DESACCIMPSUB, -1, GRP_DISPOPURO_IMPSUBACC);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_DESACCIMPSUB, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_DESACCIMPSUB, PPQRY_IMPCONSENGRU, "GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB)", "DESACCIMPSUB", 1, 19, 0, -13997);
    PAN_DISPOPURO.set_Alignment(PFL_DISPOPURO_DESACCIMPSUB, 2);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_LIST, 1304, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_ESERCIZIO, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_ESERCIZIO, PPQRY_IMPCONSENGRU, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_LIST, 1264, 44, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_LIST, 24);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_FORM, 4, 220, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_FORM, 24);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_ES, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_ES, PPQRY_IMPCONSENGRU, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_LIST, 1200, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_CAPITOLO, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_CAPITOLO, PPQRY_IMPCONSENGRU, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_LIST, 1132, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_LIST, "ARTICOLO");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_ARTICOLO, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_ARTICOLO, PPQRY_IMPCONSENGRU, "A.ARTICOLO", "ARTICOLO", 1, 6, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 980, 44, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_LIST, "ANNO IMPEGNO");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 92);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOIMPEGNO, MyGlb.PANEL_FORM, "ANNO IMPEGNO");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_ANNOIMPEGNO, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_ANNOIMPEGNO, PPQRY_IMPCONSENGRU, "A.ANNO_IMPEGNO", "ANNO_IMPEGNO", 1, 4, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_LIST, 1072, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_LIST, 60);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_LIST, "IMPEGNO");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_FORM, 60);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPEGNO, MyGlb.PANEL_FORM, "IMPEGNO");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_IMPEGNO, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_IMPEGNO, PPQRY_IMPCONSENGRU, "A.IMPEGNO", "IMPEGNO", 1, 6, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_LIST, 940, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_LIST, 64);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_LIST, "ANNO SUB");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_FORM, 4, 76, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_FORM, 64);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_ANNOSUB, MyGlb.PANEL_FORM, "ANNO SUB");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_ANNOSUB, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_ANNOSUB, PPQRY_IMPCONSENGRU, "A.ANNO_SUB", "ANNO_SUB", 1, 4, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_LIST, 940, 44, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_LIST, 32);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_LIST, "SUB");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_FORM, 4, 100, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_FORM, 32);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_SUB, MyGlb.PANEL_FORM, "SUB");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_SUB, -1, -1);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_SUB, PPQRY_IMPCONSENGRU, "A.SUB", "SUB", 1, 6, 0, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_LIST, 824, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_LIST, 40);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_FORM, 4, 556, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_FORM, 40);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPO, MyGlb.PANEL_FORM, "Disp.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_DISPO, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_DISPO, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_DISPO, PPQRY_IMPCONSENGRU, "GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB)", "DISPO", 3, 28, 6, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_LIST, 932, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_LIST, 92);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_LIST, "Disponibilità Effettiva");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_FORM, 4, 580, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_FORM, 92);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPOEFFETTI, MyGlb.PANEL_FORM, "Dispon. Effet.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_DISPOEFFETTI, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_DISPOEFFETTI, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_DISPOEFFETTI, PPQRY_IMPCONSENGRU, "GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL))", "DISPOEFFETTI", 3, 28, 6, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_LIST, 1036, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_LIST, "Importo Imputazione");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_FORM, 4, 328, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_IMPORTO, MyGlb.PANEL_FORM, "Im. Imp.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_IMPORTO, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_IMPORTO, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_IMPORTO, PPQRY_IMPCONSENGRU, "SUM(A.IMPORTO)", "IMPORTO", 3, 28, 6, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_LIST, 1140, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_LIST, 100);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_LIST, "Disponibilità Risultante");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_FORM, 4, 628, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_FORM, 100);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPORISULTA, MyGlb.PANEL_FORM, "Dispon. Risult.");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_DISPORISULTA, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_DISPORISULTA, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_DISPORISULTA, PPQRY_IMPCONSENGRU, "(GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) - SUM(NVL(A.IMPORTO, 0)))", "DISPORISULTA", 3, 28, 6, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_LIST, 1244, 44, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_LIST, 152);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_LIST, "Disponibilità Effettiva Risultante");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_FORM, 4, 652, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_FORM, 152);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_DISPEFFERISU, MyGlb.PANEL_FORM, "Dispon. Effet. Risultante");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_DISPEFFERISU, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_DISPEFFERISU, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_DISPEFFERISU, PPQRY_IMPCONSENGRU, "(GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) - SUM(NVL(A.IMPORTO, 0)))", "DISPEFFERISU", 3, 28, 6, -13997);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_LIST, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_LIST, "Info Cap");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_FORM, 4, 820, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_FORM, 56);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOCAP, MyGlb.PANEL_FORM, "Info Cap");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOCAP, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_INFOCAP, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOCAP, PPQRY_IMPCONSENGRU, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOCAP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_LIST, 80);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_LIST, "Info Acc Imp");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_FORM, 4, 820, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_FORM, 80);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOACCIMP, MyGlb.PANEL_FORM, "Info Acc Imp");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOACCIMP, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_INFOACCIMP, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOACCIMP, PPQRY_IMPCONSENGRU, "CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END", "INFOACCIMP", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOACCIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_LIST, 84);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_LIST, "Info Sub Imp");
    PAN_DISPOPURO.SetRect(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_FORM, 4, 820, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPOPURO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_FORM, 84);
    PAN_DISPOPURO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISPOPURO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPOPURO_INFOSUBIMP, MyGlb.PANEL_FORM, "Info Sub Imp");
    PAN_DISPOPURO.SetFieldPage(PFL_DISPOPURO_INFOSUBIMP, -1, -1);
    PAN_DISPOPURO.SetFieldUnbound(PFL_DISPOPURO_INFOSUBIMP, true);
    PAN_DISPOPURO.SetFieldPanel(PFL_DISPOPURO_INFOSUBIMP, PPQRY_IMPCONSENGRU, "CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END", "INFOSUBIMP", 5, 99, 0, -13997);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISPOPURO.SetValueListItem(PFL_DISPOPURO_INFOSUBIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
  }

  private void PAN_DISPOPURO_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPOPURO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_DISPOPURO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_DISPOPURO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPOPURO.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((~~CAPITOLO~~ IS NULL)) THEN 'I' ELSE NULL END as INFOCAP, ");
    SQL.append("  CASE WHEN NOT ((~~ANNO_IMPEGNO~~ IS NULL)) THEN 'I' ELSE NULL END as INFOIMPACC, ");
    SQL.append("  CASE WHEN NOT ((~~ANNO_SUB~~ IS NULL)) THEN 'I' ELSE NULL END as INFOSUB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMG, 0, SQL, -1, "");
    PAN_DISPOPURO.SetQueryDB(PPQRY_IMG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPOPURO.SetMasterTable(PPQRY_IMG, "DUAL");
    PAN_DISPOPURO.SetIMDB(IMDB, "PQRY_IMPCONSENGRU", true);
    PAN_DISPOPURO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPEGNO as IMPEGNO, ");
    SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
    SQL.append("  A.SUB as SUB, ");
    SQL.append("  A.ANNO_SUB as ANNO_SUB, ");
    SQL.append("  SUM(A.IMPORTO) as IMPORTO, ");
    SQL.append("  CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END as IMP1, ");
    SQL.append("  CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END as SUBIMP, ");
    SQL.append("  CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END as CAPART, ");
    SQL.append("  GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) as DISPO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) as DISPOEFFETTI, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) as DESACCIMPSUB, ");
    SQL.append("  (GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB) - SUM(NVL(A.IMPORTO, 0))) as DISPORISULTA, ");
    SQL.append("  (GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)) - SUM(NVL(A.IMPORTO, 0))) as DISPEFFERISU, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END as INFOCAP, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END as INFOACCIMP, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END as INFOSUBIMP ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMPUTAZIONI_CONTABILI A ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~TBL_PARAMCDP.ROWNAMEES~~) ");
    SQL.append("and   (NVL(~~TBL_PARAMCDP.ROWNAMDIVGRU~~, 'N') = 'N') ");
    SQL.append("and   (NVL(A.DIVISIONE, '') = NVL(" + IDL.CSql(MainFrm.CODICEPERS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.DIVISIONE, ''))) ");
    SQL.append("and   (NVL(~~TBL_PARAMCDP.ROWNAMSOSEIM~~, 'NO') = 'NO' OR (NVL(~~TBL_PARAMCDP.ROWNAMSOSEIM~~, 'NO') = 'SI' AND (A.IMPEGNO IS NULL))) ");
    SQL.append("and   (A.DATA = NVL(~~TBL_PARAMCDP.ROWNAMEDATA~~, A.DATA)) ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.IMPEGNO, ");
    SQL.append("  A.ANNO_IMPEGNO, ");
    SQL.append("  A.SUB, ");
    SQL.append("  A.ANNO_SUB, ");
    SQL.append("  CASE WHEN (A.ANNO_IMPEGNO IS NULL) THEN NULL ELSE TO_CHAR ( A.IMPEGNO ) || '/' || TO_CHAR ( A.ANNO_IMPEGNO ) END, ");
    SQL.append("  CASE WHEN (A.ANNO_SUB IS NULL) THEN NULL ELSE TO_CHAR ( A.SUB ) || '/' || TO_CHAR ( A.ANNO_SUB ) END, ");
    SQL.append("  CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) END, ");
    SQL.append("  GPS.GET_DISPO(A.E_S,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB), ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(A.ESERCIZIO,CASE WHEN (A.ANNO_SUB IS NULL) THEN A.E_S ELSE 'SS' END,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NVL(A.ANNO_SUB, A.ANNO_IMPEGNO),NVL(A.SUB, A.IMPEGNO),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',to_number(NULL),to_number(NULL),to_number(NULL)), ");
    SQL.append("  A.DATA, ");
    SQL.append("  GPS.GET_DESCRI_IMP_ACC_SUB(A.E_S,A.ANNO_IMPEGNO,A.IMPEGNO,A.ANNO_SUB,A.SUB), ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'Info' ELSE NULL END, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_IMPEGNO IS NULL)) THEN 'Info' ELSE NULL END, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_SUB IS NULL)) THEN 'Info' ELSE NULL END ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMPEGNO, ");
    SQL.append("  A.IMPEGNO, ");
    SQL.append("  A.ANNO_SUB, ");
    SQL.append("  A.SUB ");
    PAN_DISPOPURO.SetQuery(PPQRY_IMPCONSENGRU, 5, SQL, -1, "");
    PAN_DISPOPURO.SetQueryDB(PPQRY_IMPCONSENGRU, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPOPURO.SetMasterTable(0, "IMPUTAZIONI_CONTABILI");
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_CAPITOLO, true);
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_ARTICOLO, true);
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_ANNOIMPEGNO, true);
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_IMPEGNO, true);
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_ANNOSUB, true);
    PAN_DISPOPURO.AddToSortList(PFL_DISPOPURO_SUB, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISPOPURO.Status() == 2)
    {
      int oldListQBE = PAN_DISPOPURO.iUseListQBE;
      PAN_DISPOPURO.iUseListQBE = 0;
      PAN_DISPOPURO.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISPOPURO.PanelCommand(Glb.PCM_FIND);
      PAN_DISPOPURO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISPPUROGRUP) PAN_DISPPUROGRUP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISPOPURO) PAN_DISPOPURO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPPUROGRUP) PAN_DISPPUROGRUP_ValidateRow(Cancel);
    if (SrcObj == PAN_DISPOPURO) PAN_DISPOPURO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISPPUROGRUP) PAN_DISPPUROGRUP_DynamicProperties();
    if (SrcObj == PAN_DISPOPURO) PAN_DISPOPURO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPPUROGRUP) PAN_DISPPUROGRUP_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISPOPURO) PAN_DISPOPURO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISPPUROGRUP) PAN_DISPPUROGRUP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISPOPURO) PAN_DISPOPURO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
