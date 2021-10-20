// **********************************************
// Incarichi Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class IncarichiImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FILTRI_DATAINCARICO = 0;
  private static int GRP_FILTRI_ORDINAMENTO = 1;

  private static int PFL_FILTRI_BENEFICIARI4 = 0;
  private static int PFL_FILTRI_CODIBENEFILT = 1;
  private static int PFL_FILTRI_SCEBENBUTLAB = 2;
  private static int PFL_FILTRI_INFOBENEBUTT = 3;
  private static int PFL_FILTRI_DAL = 4;
  private static int PFL_FILTRI_AL = 5;
  private static int PFL_FILTRI_NUOVCAMPSTAT = 6;
  private static int PFL_FILTRI_ORDINAMENTO = 7;

  private static int PPQRY_FILTRI3 = 0;


  IDPanel PAN_FILTRI;
  private static int GRP_INCARICHI_IMPEGNO = 0;
  private static int GRP_INCARICHI_SUBIMPEGNO = 1;
  private static int GRP_INCARICHI_INSERIMENTO = 2;
  private static int GRP_INCARICHI_AGGIORNAMENT = 3;
  private static int GRP_INCARICHI_CAPITOLO = 4;

  private static int PFL_INCARICHI_BENEFICIARI1 = 0;
  private static int PFL_INCARICHI_TIPO1 = 1;
  private static int PFL_INCARICHI_DESCRIZIONE = 2;
  private static int PFL_INCARICHI_DATAINIZIO = 3;
  private static int PFL_INCARICHI_DATAFINE = 4;
  private static int PFL_INCARICHI_PROGRESSIVO = 5;
  private static int PFL_INCARICHI_NEWPANELLAB2 = 6;
  private static int PFL_INCARICHI_NUMEROIMP = 7;
  private static int PFL_INCARICHI_BARRAIMPEGNO = 8;
  private static int PFL_INCARICHI_ANNOIMP = 9;
  private static int PFL_INCARICHI_IMPDESCRIZIO = 10;
  private static int PFL_INCARICHI_SCELTAIMPEGN = 11;
  private static int PFL_INCARICHI_INFOIMPEGNO = 12;
  private static int PFL_INCARICHI_NEWPANELLABE = 13;
  private static int PFL_INCARICHI_NUMEROSUBIMP = 14;
  private static int PFL_INCARICHI_BARRASUBIMPE = 15;
  private static int PFL_INCARICHI_ANNOSUBIMP = 16;
  private static int PFL_INCARICHI_SUBIMPDESCRI = 17;
  private static int PFL_INCARICHI_SCELTSUBIMPE = 18;
  private static int PFL_INCARICHI_INFOSUBIMPEG = 19;
  private static int PFL_INCARICHI_UTENTE1 = 20;
  private static int PFL_INCARICHI_DATA1 = 21;
  private static int PFL_INCARICHI_UTENTE = 22;
  private static int PFL_INCARICHI_DATA = 23;
  private static int PFL_INCARICHI_SUBIMPLABHE1 = 24;
  private static int PFL_INCARICHI_LABELCAPITOL = 25;
  private static int PFL_INCARICHI_DESCRICAPITO = 26;
  private static int PFL_INCARICHI_LABELARTICOL = 27;
  private static int PFL_INCARICHI_DESCRIARTICO = 28;
  private static int PFL_INCARICHI_LABELSX = 29;
  private static int PFL_INCARICHI_CAPITOLO = 30;
  private static int PFL_INCARICHI_BARRAVOCEPEG = 31;
  private static int PFL_INCARICHI_ARTICOLO = 32;
  private static int PFL_INCARICHI_INFOVOCEPEG = 33;
  private static int PFL_INCARICHI_TIPO = 34;
  private static int PFL_INCARICHI_BENEFICIARIO = 35;
  private static int PFL_INCARICHI_SCEBENBUTLA2 = 36;
  private static int PFL_INCARICHI_INFOBENEBUT2 = 37;
  private static int PFL_INCARICHI_LABELIMPEGNO = 38;
  private static int PFL_INCARICHI_ORDBENEFICIA = 39;
  private static int PFL_INCARICHI_ORDPERIODO = 40;
  private static int PFL_INCARICHI_ORDANNOIMPEG = 41;
  private static int PFL_INCARICHI_ORDNUMERIMPE = 42;

  private static int PPQRY_INCARICHI = 0;

  private static int PPQRY_BEN = 1;
  private static int PPQRY_TIPIINCARIC1 = 2;
  private static int PPQRY_SUBIMP = 3;
  private static int PPQRY_IMP1 = 4;
  private static int PPQRY_VOCEPEG = 5;
  private static int PPQRY_DATORDILAVOR = 6;

  private static int PPQRY_DUAL1 = 7;
  private static int PPQRY_DUAL = 8;
  private static int PPQRY_TIPIINCARICO = 9;


  IDPanel PAN_INCARICHI;

  // Definition of Global Variables
  private IDVariant BENEFDIFILTR = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRI29(IMDB);
    Init_TBL_PARAMETRIO19(IMDB);
    //
    //
    Init_PQRY_INCARICHI(IMDB);
    Init_PQRY_FILTRI3(IMDB);
    Init_PQRY_FILTRI3_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRI29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRI29, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRI29, "TBL_FILTRI29");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA, "ROWNAMDAINDA");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL, "ROWNAMDAINAL");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN,12,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMTIPINC, "ROWNAMTIPINC");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMTIPINC,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMCOBEFI, "ROWNAMCOBEFI");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMCOBEFI,2,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMBENFIL, "ROWNAMBENFIL");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMBENFIL,5,60,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, "ROWNAMBEFIOL");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI29,IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL,5,60,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRI29, 0);
  }

  private static void Init_TBL_PARAMETRIO19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRIO19, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRIO19, "TBL_PARAMETRIO19");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, "ANNOIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, "NUMEROIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, "ANNOSUBIMOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, "NUMERSUBIOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRIO19,IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRIO19, 0);
  }

  private static void Init_PQRY_INCARICHI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_INCARICHI, 18);
    IMDB.set_TblCode(IMDBDef13.PQRY_INCARICHI, "PQRY_INCARICHI");
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_INIZIO, "DATA_INIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_INIZIO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_FINE, "DATA_FINE");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_FINE,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_TIPO,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORORDBENE, "RECORORDBENE");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORORDBENE,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORORDPERI, "RECORORDPERI");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORORDPERI,6,0,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORDNUMIMP, "RECORDNUMIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORDNUMIMP,1,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORDANNIMP, "RECORDANNIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_INCARICHI,IMDBDef13.PQSL_INCARICHI_RECORDANNIMP,1,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_INCARICHI, 0);
  }

  private static void Init_PQRY_FILTRI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_FILTRI3, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_FILTRI3, "PQRY_FILTRI3");
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINDA, "ROWNAMDAINDA");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINDA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINAL, "ROWNAMDAINAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINAL,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMEORDIN,12,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, "ROWNAMBENFIL");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, "ROWNAMCOBEFI");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3,IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI,2,15,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_FILTRI3, 0);
  }

  private static void Init_PQRY_FILTRI3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_FILTRI3_RS, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_FILTRI3_RS, "PQRY_FILTRI3_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINDA, "ROWNAMDAINDA");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINDA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINAL, "ROWNAMDAINAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMDAINAL,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMEORDIN,12,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, "ROWNAMBENFIL");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, "ROWNAMCOBEFI");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI3_RS,IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public IncarichiImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public IncarichiImpegni()
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
    FormIdx = MyGlb.FRM_INCARIIMPEGN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C954EACF-8B11-40F2-BF24-0E0BFFAE6A08";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 634;
    set_Caption(new IDVariant("Incarichi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 608;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.144737;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 888;
    Frames[2].Height = 88;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 88;
    PAN_FILTRI = new IDPanel(w, this, 2, "PAN_FILTRI");
    Frames[2].Content = PAN_FILTRI;
    PAN_FILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRI.VS = MainFrm.VisualStyleList;
    PAN_FILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CA4DF221-6B08-4C48-8FCC-59A560B446C0");
    PAN_FILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 840, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRI.InitStatus = 2;
    PAN_FILTRI_Init();
    PAN_FILTRI_InitFields();
    PAN_FILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 888;
    Frames[3].Height = 520;
    Frames[3].Caption = "Incarichi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 520;
    PAN_INCARICHI = new IDPanel(w, this, 3, "PAN_INCARICHI");
    Frames[3].Content = PAN_INCARICHI;
    PAN_INCARICHI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INCARICHI.VS = MainFrm.VisualStyleList;
    PAN_INCARICHI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 520-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CF697E76-4C91-48F0-B43C-D92C9F54C654");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 240, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 36);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INCARICHI.InitStatus = 1;
    PAN_INCARICHI_Init();
    PAN_INCARICHI_InitFields();
    PAN_INCARICHI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA52+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA1+BaseCmdLinIdx)
      {
        Stampa();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRI29, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INCARIIMPEGN_FILTRI3();
      }
      PAN_INCARICHI.UpdatePanel(MainFrm);
      PAN_FILTRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_INCARICHI.FrIndex)
    {
      if (IdxFieldActived ==PFL_INCARICHI_SCELTAIMPEGN) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_INCARICHI.FrIndex)
    {
      if (IdxFieldActived ==PFL_INCARICHI_SCELTSUBIMPE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_INCARICHI.FrIndex)
    {
      if (IdxFieldActived ==PFL_INCARICHI_SCEBENBUTLA2) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_FILTRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_FILTRI_SCEBENBUTLAB) {
      }
    }
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
    return (obj instanceof IncarichiImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? IncarichiImpegni.class.getName() : (Glb.ClassWithPackage(IncarichiImpegni.class) ? IncarichiImpegni.class.getName().substring(IncarichiImpegni.class.getPackage().getName().length() + 1) : IncarichiImpegni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Filtri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri On Updating Row Event Body
      // Procedure Body
      // 
      SelettoreBeneficiario v_SELETTBENEFI = new SelettoreBeneficiario(MainFrm,IMDB);
      if (Column.equals((new IDVariant(PFL_FILTRI_BENEFICIARI4)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0).compareTo(IMDB.Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0))))
          {
            BENEFDIFILTR = (new IDVariant(-1));
            IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0)));
            v_SELETTBENEFI.AzzeraValori();
            v_SELETTBENEFI.SetParam(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0), (new IDVariant("IMP")), (new IDVariant(0)), (new IDVariant()));
            if (!(IDL.IsNull(v_SELETTBENEFI.GetTrovato())))
            {
              if (v_SELETTBENEFI.GetTrovato().equals((new IDVariant("SI")), true))
              {
                IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0, v_SELETTBENEFI.GetBeneficiario());
                IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0, v_SELETTBENEFI.GetRagioneSociale());
              }
              else
              {
                IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0, (new IDVariant()));
              }
            }
            else
            {
              return;
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, 0, IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "FiltriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRI);
      // 
      // Filtri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0)))
      {
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "FiltriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto Filtro
  // **********************************************************************
  public int ApriScegliSoggettoFiltro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Filtro Body
      // Procedure Body
      // 
      BENEFDIFILTR = (new IDVariant(-1));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "ApriScegliSoggettoFiltro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Beneficiario
  // **********************************************************************
  public int InfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Beneficiario Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "InfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        if (BENEFDIFILTR.booleanValue())
        {
          IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
          IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
          IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
          IMDB.set_Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMBENFIL, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
          IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
        }
      }
      // 
      // 
      // 
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "EndModalEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Settavaloridefaultfiltri();
      PAN_INCARICHI.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_INCARICHI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_INCARICHI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "LoadEvent", _e);
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
      UNLOADEVENT_FILTRIDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_FILTRIDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMTIPINC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMCOBEFI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBENFIL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBEFIOL, 0, new IDVariant());
  }

  // **********************************************************************
  // Incarichi On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_INCARICHI_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        SetFieldVisibilityInList();
        SettaCampiEnableList();
      }
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        SetFieldVisibilityInList();
        SettaCampiEnableForm();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_INCARICHI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_INCARICHI.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_INCARICHI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        if (new IDVariant(PAN_INCARICHI.Status()).equals((new IDVariant(1)), true))
        {
          PAN_INCARICHI.PanelCommand(Glb.PCM_FIND);
        }
        PAN_INCARICHI.set_Layout((new IDVariant(1)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_INCARICHI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_INCARICHI.Layout())).equals((new IDVariant(0)), true))
      {
        SettaCampiEnableList();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_INCARICHI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_INCARICHI, Cancel);
      // 
      // Incarichi On Validate Row Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INCARICHI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_INCARICHI);
      // 
      // Incarichi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_INCARICHI.Layout())).equals((new IDVariant(0)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA52+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA52+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0))))
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0))))
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_CAPITOLO))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && IDL.NullValue((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_ARTICOLO))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // 
      // 
      // 
      if (IDL.NullValue((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_CAPITOLO))),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_ARTICOLO))),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_INCARICHI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0));
      }
      if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0));
      }
      if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0));
      }
      if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_INCARICHI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_INCARICHI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Incarichi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_INCARICHI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        IDVariant v_PROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
        v_PROGRESSIVO = IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_PROGRESSIVO, 0);
        PAN_INCARICHI.PanelCommand(Glb.PCM_REQUERY);
        RiproporreIncarico(v_PROGRESSIVO);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_INCARICHI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROGR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Incarichi Before Insert Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO) + 1 as MAXINCAPROG1 ");
      SQL.append("from ");
      SQL.append("  INCARICHI A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROGR = QV.Get("MAXINCAPROG1", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_PROGRESSIVO, 0, new IDVariant(v_PROGR));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_INCARICHI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0 || IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_INCARICHI_ANNOIMP)), true) || Column.equals((new IDVariant(PFL_INCARICHI_NUMEROIMP)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0), true)!=0 || IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_INCARICHI_ANNOSUBIMP)), true) || Column.equals((new IDVariant(PFL_INCARICHI_NUMEROSUBIMP)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, 0), true)!=0 || IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, 0), true)!=0)
        {
          SettaIntCapArtSubimpegno();
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOSUBIMOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMERSUBIOLD, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Incarichi On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_INCARICHI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incarichi On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_INCARICHI_BENEFICIARI1)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_STRINDACERCA = null;
          v_STRINDACERCA = IDL.Add(IDL.Add((new IDVariant("%")), (new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_BENEFICIARI1)))), (new IDVariant("%")));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BEN A ");
          SQL.append("where ((LOWER(TO_CHAR ( A.CODICE )) || '-' || A.RAGIONE_SOCIALE_ESTESA LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR (LOWER(TO_CHAR ( A.CODICE_FISCALE )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR LOWER(TO_CHAR ( A.PARTITA_IVA )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Soggetto non trovato!", IDVariant.STRING));
            IDVariant v_INSSOGG = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CF4WEB_ABILITA_INS_BEN(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",'LIQ'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL) as CDCAIBSMLSUN ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_INSSOGG = QV.Get("CDCAIBSMLSUN", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_INSSOGG.equals((new IDVariant("SI")), true))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Il Soggetto indicato non è stato trovato, si desidera inserire una nuova registrazione?", IDVariant.STRING));
              if (MainFrm.MessageConfirm(v_SMS))
              {
                IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_BENEFICIARI1))));
                MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
              }
            }
            else
            {
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "IncarichiOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Controlli Bloccanti
  // **********************************************************************
  public boolean ControlliBloccanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti Body
      // Procedure Body
      // 
      // 
      // controlli bloccanti
      // ritorna vero se bisogna bloccare
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_DESCRIZIONE, 0)) && IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_TIPO, 0).equals((new IDVariant(999)), true))
        {
          IDVariant v_ERRMSG1 = new IDVariant(0,IDVariant.STRING);
          v_ERRMSG1 = (new IDVariant("Descrizione obbligatoria per Tipo Incarico 999", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERRMSG1); 
          return (new IDVariant(0)).booleanValue();
        }
        else
        {
          return (new IDVariant(-1)).booleanValue();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "ControlliBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Settavaloridefaultfiltri
  // **********************************************************************
  public int Settavaloridefaultfiltri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settavaloridefaultfiltri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN, 0, (new IDVariant("B")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "Settavaloridefaultfiltri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Set Field Visibility In List
  // **********************************************************************
  public int SetFieldVisibilityInList ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Set Field Visibility In List Body
      // Procedure Body
      // 
      // 
      // campi non visibili
      // 
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // campi visibili
      // 
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SetFieldVisibilityInList", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Set Field Visibility In Form
  // **********************************************************************
  public int SetFieldVisibilityInForm ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Set Field Visibility In Form Body
      // Procedure Body
      // 
      // 
      // campi visibili
      // 
      {
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SetFieldVisibilityInForm", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      if (ControlliBloccanti())
      {
        if (ControlliNnBloccanti())
        {
          PAN_INCARICHI.PanelCommand(Glb.PCM_UPDATE);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Nn Bloccanti
  // **********************************************************************
  public boolean ControlliNnBloccanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SHOWMESSAGE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Nn Bloccanti Body
      // Procedure Body
      // 
      // 
      // controlli non bloccanti
      // 
      {
        // 
        // controllo se la ragione sociale del beneficiario contiene 2 spazi di separazione tra nome e cognome
        // 
        {
          if (IDL.Find((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_BENEFICIARI1))), IDL.Replicate(new IDVariant(), (new IDVariant(2))), (new IDVariant(0))).equals((new IDVariant(0)), true))
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Cognome e Nome non seprati da due spazi", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_MSG1), (new IDVariant("<BR/>")));
            v_SHOWMESSAGE = (new IDVariant(-1));
          }
        }
        // 
        // controllo se esiste record su Incarichi con uguale impegno
        // 
        {
          IDVariant v_NCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  INCARICHI A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.BENEFICIARIO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NCOUNT.compareTo((new IDVariant(1)), true)>=0)
          {
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("Incarico già presente per lo stesso beneficiario sullo stesso impegno", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_MSG2);
            v_SHOWMESSAGE = (new IDVariant(-1));
          }
        }
      }
      if (v_SHOWMESSAGE.booleanValue())
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), (new IDVariant("Continuare?"))))))
        {
          v_SALVATO = (new IDVariant(0));
          return v_SALVATO.booleanValue();
        }
      }
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "ControlliNnBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Setta Campi Enable List
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaCampiEnableList ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Campi Enable List Body
      // Procedure Body
      // 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_DAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SettaCampiEnableList", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Campi Enable Form
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaCampiEnableForm ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Campi Enable Form Body
      // Procedure Body
      // 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_INCARICHI.SetFlags (Glb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SettaCampiEnableForm", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, new IDVariant(IDL.ToInteger((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_CAPITOLO)))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IDL.ToInteger((new IDVariant(PAN_INCARICHI.FieldText(PFL_INCARICHI_ARTICOLO)))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Impegno Inc
  // **********************************************************************
  public int SceltaImpegnoInc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Impegno Inc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SceltaImpegnoInc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno Inc
  // **********************************************************************
  public int InfoImpegnoInc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Inc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "InfoImpegnoInc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Sub Impegno Inc
  // **********************************************************************
  public int SceltaSubImpegnoInc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Sub Impegno Inc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SceltaSubImpegnoInc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno Inc
  // **********************************************************************
  public int InfoSubImpegnoInc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Inc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0));
      if (IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "InfoSubImpegnoInc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Int Cap Art Subimpegno
  // **********************************************************************
  public int SettaIntCapArtSubimpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Int Cap Art Subimpegno Body
      // Procedure Body
      // 
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0)))))
      {
        IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
        SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ANNOIMP = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
          v_NUMEROIMP = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0, new IDVariant(v_NUMEROIMP));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0, new IDVariant(v_ANNOIMP));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_NUMEROIMPOLD, 0, new IDVariant(v_NUMEROIMP));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO19, IMDBDef4.FLD_PARAMETRIO19_ANNOIMPOLD, 0, new IDVariant(v_ANNOIMP));
      }
      else
      {
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_NUMERO_IMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_ANNO_IMP, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "SettaIntCapArtSubimpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riproporre Incarico
  // Explain which processing is carried out by this procedure
  // Progressivo:  - Input
  // **********************************************************************
  public int RiproporreIncarico (IDVariant Progressivo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_POSITION = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_POSITION = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Riproporre Incarico Body
      // Procedure Body
      // 
      C2 = PAN_INCARICHI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_INCARICHI.GotoFirst();
      while (!PAN_INCARICHI.RSEOF())
      {
        if (C2.Get("PROGRESSIVO").equals(Progressivo, true))
        {
          break;
        }
        v_POSITION = IDL.Add(v_POSITION, (new IDVariant(1)));
        PAN_INCARICHI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_INCARICHI.set_ActualPosition(true, new IDVariant(v_POSITION).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "RiproporreIncarico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ORD")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMEORDIN, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DAL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMDAINDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("AL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMDAINAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_INC")), IDL.ToString((new IDVariant(-1))));
      MainFrm.SetParametroStampaJasper((new IDVariant("BEN")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_FILTRI3, IMDBDef13.PQSL_FILTRI3_ROWNAMCOBEFI, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_IMP")), (new IDVariant("-1")));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUM_IMP")), (new IDVariant("-1")));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_SUBIMP")), (new IDVariant("-1")));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUM_SUBIMP")), (new IDVariant("-1")));
      MainFrm.LanciaStampaJasper((new IDVariant("Incarichi")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto Incarichi
  // **********************************************************************
  public int ApriScegliSoggettoIncarichi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Incarichi Body
      // Procedure Body
      // 
      BENEFDIFILTR = (new IDVariant(0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "ApriScegliSoggettoIncarichi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Beneficiario Incarichi
  // **********************************************************************
  public int InfoBeneficiarioIncarichi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Beneficiario Incarichi Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef13.PQRY_INCARICHI, IMDBDef13.PQSL_INCARICHI_BENEFICIARIO, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncarichiImpegni", "InfoBeneficiarioIncarichi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri
  // Primary record source for panel data
  // **********************************************************************
  private void INCARIIMPEGN_FILTRI3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_FILTRI3_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRI29, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRI29, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_FILTRI3_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_FILTRI3_RS, 0, IMDBDef4.TBL_FILTRI29, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI3_RS, 0, 0, IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI3_RS, 1, 0, IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI3_RS, 2, 0, IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI3_RS, 3, 0, IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMBENFIL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI3_RS, 4, 0, IMDBDef4.TBL_FILTRI29, IMDBDef4.FLD_FILTRI29_ROWNAMCOBEFI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRI29, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRI29, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRI29, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_FILTRI3_RS, 0);
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
  private void PAN_FILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRI, Cancel);
    // Stub
  }

  private void PAN_FILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FILTRI_SCEBENBUTLAB)
    {
      this.IdxPanelActived = this.PAN_FILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggettoFiltro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FILTRI_INFOBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_FILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FILTRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void PAN_INCARICHI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_INCARICHI_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImpegnoInc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoInc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_SCELTSUBIMPE)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubImpegnoInc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegnoInc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_SCEBENBUTLA2)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggettoIncarichi();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INCARICHI_INFOBENEBUT2)
    {
      this.IdxPanelActived = this.PAN_INCARICHI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBeneficiarioIncarichi();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_INCARICHI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_INCARICHI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_INCARICHI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INCARICHI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INCARICHI_Init()
  {

    PAN_INCARICHI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INCARICHI.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, "496D631D-5735-4E5E-B39E-73EDCDDF15E1");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, "Impegno");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, MyGlb.PANEL_LIST, 692, -9999, 72, 18, 0, 0);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, MyGlb.PANEL_FORM, 24, 111, 560, 53, 0, 0);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, 0, 51);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, 1, 13);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, 0, 4);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, 1, 4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCARICHI_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, "09171E3D-784E-403C-B8FD-02D04A5FA557");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, "Sub-Impegno");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, MyGlb.PANEL_LIST, 764, -9999, 88, 18, 0, 0);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, MyGlb.PANEL_FORM, 24, 167, 560, 53, 0, 0);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, 0, 77);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, 1, 13);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, 0, 4);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, 1, 4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCARICHI_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, "B071E23C-2317-45F2-A8CD-CCA25D2CA129");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, "Inserimento");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, MyGlb.PANEL_FORM, 24, 343, 280, 49, 0, 0);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, 0, 70);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, 1, 13);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, 0, 4);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, 1, 4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCARICHI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, "DFB63632-0C83-4FC6-9EC4-954C89DAFC32");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, "Aggiornamento");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, MyGlb.PANEL_FORM, 308, 343, 280, 49, 0, 0);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, 0, 88);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, 1, 13);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, 0, 4);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, 1, 4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCARICHI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, "C602DCDD-2147-45D6-8EAB-D481A64F23FD");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, "Capitolo");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, MyGlb.PANEL_FORM, 64, 223, 520, 77, 0, 0);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, 0, 46);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, 1, 13);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, 0, 4);
    PAN_INCARICHI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, 1, 4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCARICHI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCARICHI.SetSize(MyGlb.OBJ_FIELD, 43);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, "D6BE0688-3EA5-4846-94EF-FD6D2F6BD3FB");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, "Beneficiario");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, "C21EE1CD-C403-4769-A0CC-0DBFB5E03880");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, "Tipo ");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, "A98A7EEE-7DE2-4655-B4AB-F153BE7DF632");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, "Descrizione");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, "12F1A24B-153B-4C86-92D5-596DF3DC59DE");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, "Data Inizio");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, "0FE96C58-5BE8-4BA4-A782-639BC3EBAF80");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, "Data Fine");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, "F63B842F-A32B-469A-8098-96BAB1E40720");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, "PROGRESSIVO");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, "Progressivo");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, "C3B72982-E92D-49E9-85D9-78204C97FC01");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, "602109D3-B030-4EBB-812B-BE2F588485BB");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, "NUMERO IMP");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, "Numero dell'Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, "FF0EDB77-F280-4501-86A5-ADB3C0291C4C");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, "/");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.VIS_VUOTONORMALE);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, "EFE504C6-1D08-43E0-8AA4-8D334A8521A2");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, "ANNO IMP");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, "Anno dell'Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, "6172D289-89AA-4A98-8750-765CF124F84A");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, "IMP DESCRIZIONE");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, "E147D2DE-803D-4F0F-B167-D546B0294A11");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, "D7BEE405-FFC1-4F83-B253-F0BE74361F7D");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, 0, "info.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, "28CB14F2-7458-4026-86C3-2E1BC04A8CEE");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, "6F68749C-EEBC-41AB-87B0-9FBF92FA409C");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, "Numero del Sub-Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, "B6A4C3CF-4A42-4F8D-A61B-C06C2D364F66");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, "/");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.VIS_VUOTONORMALE);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, "4B8CB999-439F-4EAE-A67B-EF0383D9235A");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, "Anno del Sub-Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, "800590AE-1340-416F-A24F-CE5916A094F8");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, "SUBIMP DESCRIZIONE");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, "445C85CC-D5C2-4493-A137-AB789C6FF877");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, 0, "wsearch1.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, "3312E54E-5748-4AC7-B452-F24FBABF0884");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, 0, "info.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, "C9A31DEA-0E85-4F71-A074-3B842B5C04E5");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, "Utente");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, "C81D384D-A131-4BA4-956F-0B9717B0622A");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, "Data");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, "595727CD-1256-4BD9-9FFE-92AAE51F8297");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, "Utente");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, "B06223C0-C6E1-4C96-AE12-A2722B5C4326");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, "Data");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, "EEA4F093-9DA2-4E05-B663-A40B27D97A6D");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, "Sub-Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.VIS_LABEVISUSTYL);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, "CEA8BFF9-DB47-4AEF-A17F-CDECA4147089");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, "Capitolo");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.VIS_VUOTONORMALE);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, "88632997-839E-4C8D-ABA5-6485C2924D37");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, "Descrizione Capitolo");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, "6B696AD2-B5FF-4AA7-B52A-D0713067AB44");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, "Articolo");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.VIS_VUOTONORMALE);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, "A142EC78-67A3-470B-9D39-1A9FAC62E606");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, "Descrizione Articolo");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, "CCE8A758-32C6-4A93-A271-70919F284D66");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, "BFA73C7A-D38B-4FD3-A6B8-905BF5F60DA2");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, "CAPITOLO");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, "0D697F21-7DCE-4FE0-BE16-5F9DAFDED6F9");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, "/");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.VIS_VUOTONORMALE);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, "B25D3B88-6348-4B61-8D04-EC9B678B83E6");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, "ARTICOLO");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, "665036BD-5EB2-426B-83DA-08129E12AC6D");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, 0, "info.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, "254EC5FF-A4DE-4BF5-B2D4-B638AC512C78");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, "Tipo");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, "BE222279-ACB8-46F0-8D1C-F0491AEDEC36");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, "BENEFICIARIO");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, 0 | MyGlb.FLD_NOHDRFORM, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, "130D94EC-2C1D-4555-B4CC-2B4F125FC837");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, 0, "wsearch1.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, "FC2F573B-F777-468B-ACA2-F1DDB951D5F8");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, "");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INCARICHI.SetImage(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, 0, "info.gif", false);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, "AAF6578B-4C13-4833-9C91-5B646A2158A3");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, "Impegno");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, "54D0A6A5-D211-4AA1-9143-714197A35E38");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, "Ord Beneficiario");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, "If Equal (Record Ordinamento [Incarichi 1 - Filtri], Beneficiario, Ragione Sociale, ZeroStringa)");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.VIS_NORMFIELPADR);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, "75D6CD3E-8002-486A-84BF-1388BEE8774B");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, "Ord Periodo");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, "If Equal (Record Ordinamento [Incarichi Impegni - Filtri], Periodo, INCARICHI DATA INIZIO, Today ())");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.VIS_NORMFIELPADR);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, "7D978DF8-7804-4BC1-BB40-7F72BDE492EB");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, "Ord Anno Impegno");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, "If Equal (Record Ordinamento [Incarichi Impegni - Filtri], Impegno, INCARICHI ANNO IMP, Uno)");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCARICHI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, "CD7C82CE-9F63-4B6A-B37D-84069E16C0C6");
    PAN_INCARICHI.set_Header(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, "Ord Numero Impegno");
    PAN_INCARICHI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, "If Equal (Record Ordinamento [Incarichi Impegni - Filtri], Impegno, INCARICHI NUMERO IMP, Uno)");
    PAN_INCARICHI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.VIS_NORMFIELPADR);
    PAN_INCARICHI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_INCARICHI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 40, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_LIST, 124);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_FORM, 16, 12, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_FORM, 76);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_BENEFICIARI1, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_BENEFICIARI1, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 162, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_LIST, 208, 40, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_LIST, 156);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_LIST, "Tipo ");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_FORM, 4, 292, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_FORM, 156);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO1, MyGlb.PANEL_FORM, "Tipo ");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_TIPO1, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_TIPO1, PPQRY_TIPIINCARIC1, "A.DESCRIZIONE", "TIPIINCADESC", 5, 60, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_LIST, 396, 40, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_LIST, 136);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_FORM, 16, 60, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DESCRIZIONE, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DESCRIZIONE, PPQRY_INCARICHI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_LIST, 532, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_LIST, 72);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_LIST, "Data Inizio");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_FORM, 20, 84, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_FORM, 72);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAINIZIO, MyGlb.PANEL_FORM, "Data Inizio");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DATAINIZIO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DATAINIZIO, PPQRY_INCARICHI, "A.DATA_INIZIO", "DATA_INIZIO", 6, 19, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_LIST, 612, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_LIST, 64);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_LIST, "Data Fine");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_FORM, 184, 84, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_FORM, 68);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATAFINE, MyGlb.PANEL_FORM, "Data Fine");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DATAFINE, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DATAFINE, PPQRY_INCARICHI, "A.DATA_FINE", "DATA_FINE", 6, 19, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_LIST, 1156, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 304, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_PROGRESSIVO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_PROGRESSIVO, PPQRY_INCARICHI, "A.PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_LIST, 316, 120, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_FORM, 28, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_NEWPANELLAB2, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_LIST, 692, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_LIST, "NM. I.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_FORM, 88, 136, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_NUMEROIMP, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_NUMEROIMP, PPQRY_INCARICHI, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 128, 24, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 132, 136, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_BARRAIMPEGNO, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_BARRAIMPEGNO, -1, "", "BARRAIMPEGNO", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_LIST, 732, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_LIST, "A. I.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_FORM, 148, 136, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ANNOIMP, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ANNOIMP, PPQRY_INCARICHI, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1812, 40, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_LIST, "IMP DESCRIZIONE");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 192, 136, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 96);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_IMPDESCRIZIO, MyGlb.PANEL_FORM, "IMP DESCR.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_IMPDESCRIZIO, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_IMPDESCRIZIO, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 548, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_SCELTAIMPEGN, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_LIST, 596, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_FORM, 564, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_INFOIMPEGNO, -1, GRP_INCARICHI_IMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_LIST, 420, 228, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_FORM, 28, 204, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_NEWPANELLABE, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 764, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "N. SB.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 88, 192, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_NUMEROSUBIMP, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_NUMEROSUBIMP, PPQRY_INCARICHI, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_LIST, 136, 32, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_FORM, 132, 192, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRASUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_BARRASUBIMPE, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_BARRASUBIMPE, -1, "", "BARRASUBIMPE", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_LIST, 804, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_LIST, "A. SUB.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_FORM, 148, 192, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ANNOSUBIMP, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ANNOSUBIMP, PPQRY_INCARICHI, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 1288, 40, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_LIST, "SUBIMP DESCRIZIONE");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 192, 192, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPDESCRI, MyGlb.PANEL_FORM, "SUB. DESCRIZIONE");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_SUBIMPDESCRI, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_SUBIMPDESCRI, PPQRY_SUBIMP, "A.DESCRIZIONE", "SUBIMPDESCRI", 5, 140, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 548, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_SCELTSUBIMPE, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_SCELTSUBIMPE, -1, "", "SCELTSUBIMPE", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 564, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_INFOSUBIMPEG, -1, GRP_INCARICHI_SUBIMPEGNO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_INFOSUBIMPEG, -1, "", "INFOSUBIMPEG", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_LIST, 1236, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_FORM, 28, 368, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_UTENTE1, -1, GRP_INCARICHI_INSERIMENTO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_UTENTE1, PPQRY_INCARICHI, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_LIST, 1356, 40, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_FORM, 192, 368, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_FORM, 40);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DATA1, -1, GRP_INCARICHI_INSERIMENTO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DATA1, PPQRY_INCARICHI, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_LIST, 1464, 40, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_FORM, 312, 368, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_UTENTE, -1, GRP_INCARICHI_AGGIORNAMENT);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_UTENTE, PPQRY_INCARICHI, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_LIST, 1576, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_LIST, 100);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_FORM, 480, 368, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_FORM, 36);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DATA, -1, GRP_INCARICHI_AGGIORNAMENT);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DATA, PPQRY_INCARICHI, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_LIST, 764, 0, 88, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_LIST, 2);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_FORM, 800, 40, 60, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SUBIMPLABHE1, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_SUBIMPLABHE1, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_SUBIMPLABHE1, -1, "", "SUBIMPLABHE1", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_LIST, 76, 312, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_FORM, 68, 252, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_LABELCAPITOL, -1, GRP_INCARICHI_CAPITOLO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_LIST, 804, 40, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_LIST, 128);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_LIST, 2);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_FORM, 128, 252, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_FORM, 128);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRICAPITO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DESCRICAPITO, -1, GRP_INCARICHI_CAPITOLO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DESCRICAPITO, PPQRY_VOCEPEG, "A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,0)", "CAPDESCRCAPI", 5, 99, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_LIST, 84, 320, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_FORM, 68, 276, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELARTICOL, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_LABELARTICOL, -1, GRP_INCARICHI_CAPITOLO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_LABELARTICOL, -1, "", "LABELARTICOL", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_LIST, 804, 40, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_LIST, 124);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_LIST, 2);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_LIST, "Descrizione Articolo");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_FORM, 128, 276, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_FORM, 124);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_DESCRIARTICO, MyGlb.PANEL_FORM, "Descrizione Articolo");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_DESCRIARTICO, -1, GRP_INCARICHI_CAPITOLO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_DESCRIARTICO, PPQRY_VOCEPEG, "A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO)", "CAPDESCRARTI", 5, 99, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_LIST, 212, 320, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_FORM, 568, 248, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELSX, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_LABELSX, -1, GRP_INCARICHI_CAPITOLO);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_LABELSX, -1, "", "LABELSX", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_LIST, 804, 40, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_LIST, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_FORM, 128, 228, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_CAPITOLO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_CAPITOLO, PPQRY_VOCEPEG, "A.CAPITOLO", "CAPCAPITOLO", 3, 16, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 156, 328, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 256, 228, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BARRAVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_BARRAVOCEPEG, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_BARRAVOCEPEG, -1, "", "BARRAVOCEPEG", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_LIST, 804, 40, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_LIST, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_LIST, "ARTICOLO");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_FORM, 272, 228, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_FORM, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ARTICOLO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ARTICOLO, PPQRY_VOCEPEG, "A.ARTICOLO", "CAPARTICOLO", 1, 2, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_FORM, 304, 232, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_INFOVOCEPEG, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_LIST, 0, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_FORM, 48, 36, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_FORM, 44);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_TIPO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_TIPO, PPQRY_INCARICHI, "A.TIPO", "TIPO", 1, 3, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_FORM, 340, 12, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_BENEFICIARIO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_BENEFICIARIO, PPQRY_INCARICHI, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_FORM, 404, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_SCEBENBUTLA2, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_SCEBENBUTLA2, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_SCEBENBUTLA2, -1, "", "SCEBENBUTLA2", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_LIST, 324, 4, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_FORM, 420, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_INFOBENEBUT2, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_INFOBENEBUT2, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_INFOBENEBUT2, -1, "", "INFOBENEBUT2", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_LIST, 692, 0, 72, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_FORM, 660, 0, 72, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_LABELIMPEGNO, -1, -1);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_LIST, 0, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_LIST, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_LIST, "Ord Beneficiario");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_FORM, 4, 408, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_FORM, 84);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDBENEFICIA, MyGlb.PANEL_FORM, "Ord Benefic.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ORDBENEFICIA, -1, -1);
    SQL = new StringBuffer();
    SQL.append("DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'B', ( ");
  SQL.append("select ");
  SQL.append("  B.RAGIONE_SOCIALE_ESTESA ");
  SQL.append("from ");
  SQL.append("  BEN B ");
  SQL.append("where (B.CODICE = A.BENEFICIARIO) ");
  SQL.append("), '0')");
    PAN_INCARICHI.SetFieldUnbound(PFL_INCARICHI_ORDBENEFICIA, true);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ORDBENEFICIA, PPQRY_INCARICHI, SQL.toString(), "RECORORDBENE", 5, 99, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_LIST, 0, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_LIST, 68);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_LIST, "Ord Periodo");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_FORM, 4, 408, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_FORM, 68);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDPERIODO, MyGlb.PANEL_FORM, "Ord Per.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ORDPERIODO, -1, -1);
    PAN_INCARICHI.SetFieldUnbound(PFL_INCARICHI_ORDPERIODO, true);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ORDPERIODO, PPQRY_INCARICHI, "DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'P', A.DATA_INIZIO, TRUNC( SYSDATE ))", "RECORORDPERI", 6, 0, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_LIST, 0, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_LIST, 100);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_LIST, "Ord Anno Impegno");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_FORM, 4, 408, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_FORM, 100);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDANNOIMPEG, MyGlb.PANEL_FORM, "Ord Ann. Imp.");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ORDANNOIMPEG, -1, -1);
    PAN_INCARICHI.SetFieldUnbound(PFL_INCARICHI_ORDANNOIMPEG, true);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ORDANNOIMPEG, PPQRY_INCARICHI, "DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'I', A.ANNO_IMP, 1)", "RECORDANNIMP", 1, 19, 0, -13997);
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_LIST, 0, 40, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_LIST, 112);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_LIST, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_LIST, "Ord Numero Impegno");
    PAN_INCARICHI.SetRect(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_FORM, 4, 408, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCARICHI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_FORM, 112);
    PAN_INCARICHI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_FORM, 1);
    PAN_INCARICHI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCARICHI_ORDNUMERIMPE, MyGlb.PANEL_FORM, "Ord Num. Impegno");
    PAN_INCARICHI.SetFieldPage(PFL_INCARICHI_ORDNUMERIMPE, -1, -1);
    PAN_INCARICHI.SetFieldUnbound(PFL_INCARICHI_ORDNUMERIMPE, true);
    PAN_INCARICHI.SetFieldPanel(PFL_INCARICHI_ORDNUMERIMPE, PPQRY_INCARICHI, "DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'I', A.NUMERO_IMP, 1)", "RECORDNUMIMP", 1, 19, 0, -13997);
  }

  private void PAN_INCARICHI_InitQueries()
  {
    StringBuffer SQL;

    PAN_INCARICHI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~BENEFICIARIO~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE desc ");
    PAN_INCARICHI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_INCARICHI.SetQueryLKE(PPQRY_BEN, PFL_INCARICHI_BENEFICIARIO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE desc ");
    PAN_INCARICHI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_INCARICHI.SetQueryHeaderColumn(PPQRY_BEN, "BENRAGSOESES", "BEN RAGIONE SOCIALE ESTESA ESTESA");
    PAN_INCARICHI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_INCARICHI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as TIPIINCADESC ");
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    SQL.append("where (A.CODICE = ~~TIPO~~) ");
    PAN_INCARICHI.SetQuery(PPQRY_TIPIINCARIC1, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_TIPIINCARIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_TIPIINCARIC1, "TIPI_INCARICO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as SUBIMPDESCRI ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    PAN_INCARICHI.SetQuery(PPQRY_SUBIMP, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_SUBIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_SUBIMP, "SUBIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_INCARICHI.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_IMP1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPCAPITOLO, ");
    SQL.append("  A.ARTICOLO as CAPARTICOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,0) as CAPDESCRCAPI, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CAPDESCRARTI ");
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  IMP B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (B.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (B.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("and   ((~~ANNO_SUBIMP~~ IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,0), ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO) ");
    SQL.append("from ");
    SQL.append("  CAP C, ");
    SQL.append("  SUBIMP D ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = 'S') ");
    SQL.append("and   (C.CAPITOLO = D.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = D.ARTICOLO) ");
    SQL.append("and   (D.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (D.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    SQL.append("and   (NOT ((~~ANNO_SUBIMP~~ IS NULL))) ");
    PAN_INCARICHI.SetQuery(PPQRY_VOCEPEG, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_VOCEPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_VOCEPEG, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENRAGIOSOCI, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PQRY_BEN1.ENTE_DATORE_LAV~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_INCARICHI.SetQuery(PPQRY_DATORDILAVOR, 0, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_DATORDILAVOR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(PPQRY_DATORDILAVOR, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as RECUTININ1I1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as RECUTININ1IN ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_INCARICHI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_INCARICHI_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as RECUTININ1I1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as RECUTININ1IN ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_INCARICHI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_INCARICHI_UTENTE1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as RECUTAGIN1I1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as RECUTAGIN1IN ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_INCARICHI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_INCARICHI_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as RECUTAGIN1I1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as RECUTAGIN1IN ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_INCARICHI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_INCARICHI_UTENTE, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIINCACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIINCADESC ");
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    SQL.append("where (A.CODICE = ~~TIPO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_INCARICHI.SetQuery(PPQRY_TIPIINCARICO, 0, SQL, PFL_INCARICHI_TIPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIINCACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIINCADESC ");
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_INCARICHI.SetQuery(PPQRY_TIPIINCARICO, 1, SQL, PFL_INCARICHI_TIPO, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_TIPIINCARICO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetIMDB(IMDB, "PQRY_INCARICHI", true);
    PAN_INCARICHI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DATA_INIZIO as DATA_INIZIO, ");
    SQL.append("  A.DATA_FINE as DATA_FINE, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'B', ( ");
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA ");
    SQL.append("from ");
    SQL.append("  BEN B ");
    SQL.append("where (B.CODICE = A.BENEFICIARIO) ");
    SQL.append("), '0') as RECORORDBENE, ");
    SQL.append("  DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'P', A.DATA_INIZIO, TRUNC( SYSDATE )) as RECORORDPERI, ");
    SQL.append("  DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'I', A.NUMERO_IMP, 1) as RECORDNUMIMP, ");
    SQL.append("  DECODE(~~PQRY_FILTRI3.ROWNAMEORDIN~~, 'I', A.ANNO_IMP, 1) as RECORDANNIMP ");
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  INCARICHI A ");
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.DATA_INIZIO >= ~~PQRY_FILTRI3.ROWNAMDAINDA~~ AND A.DATA_INIZIO <= ~~PQRY_FILTRI3.ROWNAMDAINAL~~) ");
    SQL.append("and   (NVL(A.BENEFICIARIO, -1) = NVL(~~PQRY_FILTRI3.ROWNAMCOBEFI~~, NVL(A.BENEFICIARIO, -1))) ");
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 15, 16, 17, 18 ");
    PAN_INCARICHI.SetQuery(PPQRY_INCARICHI, 5, SQL, -1, "");
    PAN_INCARICHI.SetQueryDB(PPQRY_INCARICHI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCARICHI.SetMasterTable(0, "INCARICHI");
    PAN_INCARICHI.AddToSortList(PFL_INCARICHI_ORDBENEFICIA, true);
    PAN_INCARICHI.AddToSortList(PFL_INCARICHI_ORDPERIODO, true);
    PAN_INCARICHI.AddToSortList(PFL_INCARICHI_ORDNUMERIMPE, true);
    PAN_INCARICHI.AddToSortList(PFL_INCARICHI_ORDANNOIMPEG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INCARICHI.Status() == 2)
    {
      int oldListQBE = PAN_INCARICHI.iUseListQBE;
      PAN_INCARICHI.iUseListQBE = 0;
      PAN_INCARICHI.PanelCommand(Glb.PCM_SEARCH);
      PAN_INCARICHI.PanelCommand(Glb.PCM_FIND);
      PAN_INCARICHI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRI_Init()
  {

    PAN_FILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, "EF52F936-2339-4501-931C-3F620987608B");
    PAN_FILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, "Data Incarico");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, MyGlb.PANEL_LIST, 0, -9999, 92, 16, 0, 0);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, MyGlb.PANEL_FORM, 376, 7, 232, 53, 0, 0);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, 0, 76);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, 1, 13);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, 0, 4);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, 1, 4);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRI_DATAINCARICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, "10A367FE-6FF0-44C3-95B4-C43E948E7B68");
    PAN_FILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, "Ordinamento");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_FILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, MyGlb.PANEL_FORM, 612, 7, 212, 53, 0, 0);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, 0, 74);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, 1, 13);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, 0, 4);
    PAN_FILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, 1, 4);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, "594F9BDF-3A41-42E7-AC22-A3FB51C9A546");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, "Beneficiario");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, "845943F2-2470-492B-ADFE-A4A55CC33C5C");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, "Codice Beneficiario Filtro");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, "7366D8E9-450A-4ABC-8B3A-865B3D9F443E");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.VIS_IMAGEBUTTONS);
    PAN_FILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, 0, "wsearch1.gif", false);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, "CF1D93AB-E49D-4A5A-A094-DC542F467AE6");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_FILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, 0, "info.gif", false);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, "10A7A4AA-71B5-41F1-AC65-045DABF17CDF");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, "Dal");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, "0CB5D0C9-F09E-48A8-8BC0-EA800D7A159E");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, " Al");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, "A6D932F9-44EB-41FC-B47A-6FFBEE92BC15");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, "D22C12B3-CAEE-43F2-99F4-E1DBAF7AB2A5");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, "Ordinamento");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_LIST, 84);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_FORM, 4, 32, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_FORM, 76);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_BENEFICIARI4, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_BENEFICIARI4, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_BENEFICIARI4, PPQRY_FILTRI3, "A.ROWNAMBENFIL", "ROWNAMBENFIL", 5, 60, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_LIST, 100);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_LIST, "Cod. Beneficiario Filtro");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_FORM, 276, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_FORM, 100);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODIBENEFILT, MyGlb.PANEL_FORM, "Cod. Benefic. Filt.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODIBENEFILT, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODIBENEFILT, PPQRY_FILTRI3, "A.ROWNAMCOBEFI", "ROWNAMCOBEFI", 2, 15, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 336, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_SCEBENBUTLAB, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_SCEBENBUTLAB, -1, "", "SCEBENBUTLAB", 0, 0, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 324, 4, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 352, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_INFOBENEBUTT, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_INFOBENEBUTT, -1, "", "INFOBENEBUTT", 0, 0, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_LIST, 92);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_FORM, 380, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_DAL, -1, GRP_FILTRI_DATAINCARICO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_DAL, PPQRY_FILTRI3, "A.ROWNAMDAINDA", "ROWNAMDAINDA", 6, 14, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_LIST, 84);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_LIST, " Al");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_FORM, 500, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_AL, MyGlb.PANEL_FORM, " Al");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_AL, -1, GRP_FILTRI_DATAINCARICO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_AL, PPQRY_FILTRI3, "A.ROWNAMDAINAL", "ROWNAMDAINAL", 6, 14, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 452, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 452, 48, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_NUOVCAMPSTAT, -1, GRP_FILTRI_DATAINCARICO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_FORM, 616, 32, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ORDINAMENTO, -1, GRP_FILTRI_ORDINAMENTO);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ORDINAMENTO, PPQRY_FILTRI3, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 12, 49, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ORDINAMENTO, (new IDVariant("B                                                ")), "Beneficiario", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ORDINAMENTO, (new IDVariant("P                                                ")), "Periodo", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ORDINAMENTO, (new IDVariant("I                                                ")), "Impegno", "", "", -1);
  }

  private void PAN_FILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRI.SetIMDB(IMDB, "PQRY_FILTRI3", true);
    PAN_FILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRI.SetQueryIMDB(PPQRY_FILTRI3, IMDBDef13.PQRY_FILTRI3_RS, IMDBDef4.TBL_FILTRI29);
    JustLoaded = true;
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_BENEFICIARI4, IMDBDef4.FLD_FILTRI29_ROWNAMBENFIL);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODIBENEFILT, IMDBDef4.FLD_FILTRI29_ROWNAMCOBEFI);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_DAL, IMDBDef4.FLD_FILTRI29_ROWNAMDAINDA);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_AL, IMDBDef4.FLD_FILTRI29_ROWNAMDAINAL);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_ORDINAMENTO, IMDBDef4.FLD_FILTRI29_ROWNAMEORDIN);
    PAN_FILTRI.SetMasterTable(0, "FILTRI29");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRI.Status() == 2)
    {
      int oldListQBE = PAN_FILTRI.iUseListQBE;
      PAN_FILTRI.iUseListQBE = 0;
      PAN_FILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_DynamicProperties();
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_OnChangeRow();
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
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_INCARICHI) PAN_INCARICHI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
