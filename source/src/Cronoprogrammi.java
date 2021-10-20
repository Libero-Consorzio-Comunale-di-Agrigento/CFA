// **********************************************
// Cronoprogrammi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Cronoprogrammi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PATS_ESERCDIISCRI = 0;
  private static int PFL_PATS_TIPO = 1;
  private static int PFL_PATS_APERTICHIUSI = 2;
  private static int PFL_PATS_ORDINAMCRONO = 3;
  private static int PFL_PATS_CAPITOLO = 4;
  private static int PFL_PATS_ARTICOLO = 5;
  private static int PFL_PATS_FINANZIAMENT = 6;
  private static int PFL_PATS_ETICHSCELCAP = 7;
  private static int PFL_PATS_INFOCAP = 8;
  private static int PFL_PATS_DESCRIFINANZ = 9;

  private static int PPQRY_PATS4 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_PATS;
  private static int GRP_CRONOPROGRAM_INSERIMENTO = 0;
  private static int GRP_CRONOPROGRAM_AGGIORNAMENT = 1;

  private static int PFL_CRONOPROGRAM_ESERCIISCRIZ = 0;
  private static int PFL_CRONOPROGRAM_ESERCIENTRAT = 1;
  private static int PFL_CRONOPROGRAM_OPERA = 2;
  private static int PFL_CRONOPROGRAM_CRONOPROGRID = 3;
  private static int PFL_CRONOPROGRAM_DESCRIPROGET = 4;
  private static int PFL_CRONOPROGRAM_CRONIDNONDEF = 5;
  private static int PFL_CRONOPROGRAM_IMPORTINIZIA = 6;
  private static int PFL_CRONOPROGRAM_IMPORTATTUAL = 7;
  private static int PFL_CRONOPROGRAM_DEFINITO = 8;
  private static int PFL_CRONOPROGRAM_CONFERMATRAG = 9;
  private static int PFL_CRONOPROGRAM_DETERMINATO = 10;
  private static int PFL_CRONOPROGRAM_OPERPROGORIG = 11;
  private static int PFL_CRONOPROGRAM_UTENTEINSERI = 12;
  private static int PFL_CRONOPROGRAM_DATAINSERIME = 13;
  private static int PFL_CRONOPROGRAM_UTENTULTIAGG = 14;
  private static int PFL_CRONOPROGRAM_DATAULTIMAGG = 15;
  private static int PFL_CRONOPROGRAM_ORDINAMENTO = 16;

  private static int PPQRY_TESTATCRONO4 = 0;

  private static int PPQRY_PROGETCRONOP = 1;
  private static int PPQRY_PROGETORIGIN = 2;

  private static int PPQRY_DUAL1 = 3;
  private static int PPQRY_DUAL = 4;


  IDPanel PAN_CRONOPROGRAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PATS3(IMDB);
    //
    //
    Init_PQRY_PATS4(IMDB);
    Init_PQRY_PATS4_RS(IMDB);
    Init_PQRY_TESTATCRONO4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PATS3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PATS3, 8);
    IMDB.set_TblCode(IMDBDef3.TBL_PATS3, "TBL_PATS3");
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGORDCRO, "NOMOGGORDCRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGORDCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEMODP, "NOMEOGGEMODP");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEMODP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGAPECHI, "NOMOGGAPECHI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS3,IMDBDef3.FLD_PATS3_NOMOGGAPECHI,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PATS3, 0);
  }

  private static void Init_PQRY_PATS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS4, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS4, "PQRY_PATS4");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGORDCRO, "NOMOGGORDCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGORDCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGAPECHI, "NOMOGGAPECHI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4,IMDBDef11.PQSL_PATS4_NOMOGGAPECHI,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PATS4, 0);
  }

  private static void Init_PQRY_PATS4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS4_RS, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS4_RS, "PQRY_PATS4_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGORDCRO, "NOMOGGORDCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGORDCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGAPECHI, "NOMOGGAPECHI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS4_RS,IMDBDef11.PQSL_PATS4_NOMOGGAPECHI,5,2,0);
  }

  private static void Init_PQRY_TESTATCRONO4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_TESTATCRONO4, 15);
    IMDB.set_TblCode(IMDBDef11.PQRY_TESTATCRONO4, "PQRY_TESTATCRONO4");
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID_NON_DEF, "CRONOPROGRAMMA_ID_NON_DEF");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID_NON_DEF,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_IMPORTO_INIZIALE, "IMPORTO_INIZIALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_IMPORTO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_IMPORTO_ATTUALE, "IMPORTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_IMPORTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DEFINITO, "DEFINITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DEFINITO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CONFERMATO_RAG, "CONFERMATO_RAG");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_CONFERMATO_RAG,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DETERMINATO, "DETERMINATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DETERMINATO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ESERCIZIO_ISCRIZIONE, "ESERCIZIO_ISCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ESERCIZIO_ISCRIZIONE,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ESERCIZIO_ENTRATA, "ESERCIZIO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ESERCIZIO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ORDINAMENTO, "ORDINAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO4,IMDBDef11.PQSL_TESTATCRONO4_ORDINAMENTO,1,19,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_TESTATCRONO4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Cronoprogrammi(MyWebEntryPoint w, IMDBObj imdb)
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
  public Cronoprogrammi()
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
    FormIdx = MyGlb.FRM_CRONOPROGRAM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C266DD48-1881-491B-B740-F32350BF88A3";
    ResModeW = 2;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1084;
    DesignHeight = 470;
    set_Caption(new IDVariant("Cronoprogrammi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1084;
    Frames[1].Height = 444;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.135135;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1084;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pats";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1084;
    Frames[2].FixedHeight = 60;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PATS = new IDPanel(w, this, 2, "PAN_PATS");
    Frames[2].Content = PAN_PATS;
    PAN_PATS.Lockable = false;
    PAN_PATS.iLocked = false;
    PAN_PATS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PATS.VS = MainFrm.VisualStyleList;
    PAN_PATS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2B489C8B-FB6D-4A5A-8EE0-1315962F9505");
    PAN_PATS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1080, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PATS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PATS.InitStatus = 2;
    PAN_PATS_Init();
    PAN_PATS_InitFields();
    PAN_PATS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1084;
    Frames[3].Height = 384;
    Frames[3].Caption = "Cronoprogrammi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 384;
    PAN_CRONOPROGRAM = new IDPanel(w, this, 3, "PAN_CRONOPROGRAM");
    Frames[3].Content = PAN_CRONOPROGRAM;
    PAN_CRONOPROGRAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CRONOPROGRAM.VS = MainFrm.VisualStyleList;
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DED90AA3-DACE-4582-8EA6-BDEE3DFED417");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1024, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CRONOPROGRAM.InitStatus = 1;
    PAN_CRONOPROGRAM_Init();
    PAN_CRONOPROGRAM_InitFields();
    PAN_CRONOPROGRAM_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_INSERISCI2+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MODIFICA4+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGG21+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FAGG1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG21+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DEFINICRONO1+BaseCmdLinIdx)
      {
        DefinizioneCronoprogramma();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONFERVARIA1+BaseCmdLinIdx)
      {
        ConfermaVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAANOENTSP2+BaseCmdLinIdx)
      {
        StampaAnomalieEntrataSpesa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STPIIMATDIZE+BaseCmdLinIdx)
      {
        StampaPianiImportoAttualeDiversoZero();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FINANDACRONO+BaseCmdLinIdx)
      {
        FinanziamentidaCronoprogramma();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENEIMPDAPIA+BaseCmdLinIdx)
      {
        GenerazioneImpegnidaPiano();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CALDETCOMPIA+BaseCmdLinIdx)
      {
        CalcoloDettagliComposizionePiano();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PATS3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CRONOPROGRAM_PATS4();
      }
      PAN_PATS.UpdatePanel(MainFrm);
      PAN_CRONOPROGRAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_ELENCOFINANZ && flRis && IdxPanelActived == PAN_PATS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PATS_FINANZIAMENT) {
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
    return (obj instanceof Cronoprogrammi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Cronoprogrammi.class.getName() : (Glb.ClassWithPackage(Cronoprogrammi.class) ? Cronoprogrammi.class.getName().substring(Cronoprogrammi.class.getPackage().getName().length() + 1) : Cronoprogrammi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pats On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PATS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pats On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PATS_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  FINANZIAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Finanziamento inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PATS_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_PATS_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Capitolo inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "PatsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Finanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENCOFINANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Finanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Capitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitolo Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGPROUO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGETTES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCCADACAECUJ, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Capitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_CRONOPROGRAM.Freezed = (new IDVariant(0)).booleanValue();
        PAN_CRONOPROGRAM_InitQueries();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_CRONOPROGRAM.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "CronoprogrammiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CRONOPROGRAM);
      // 
      // Cronoprogrammi On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_DESCRIPROGET,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_DESCRIPROGET))).stringValue()); 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_OPERPROGORIG,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_OPERPROGORIG))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "CronoprogrammiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CRONOPROGRAM_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "CronoprogrammiBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).equals((new IDVariant(3)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS4+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS4+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "CronoprogrammiOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Inserisci
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Inserisci ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_NOMEOGGETTIU, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INSAGGCRONOP, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Inserisci", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_NOMEOGGETTIU, 0, ((IMDB.Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0).equals((new IDVariant("NO")), true))?(new IDVariant("INFO")):(new IDVariant("U"))));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_CRONOPROGRAMMA_ID, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_NOMEOGGEDEFI, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_DEFINITO, 0));
      MainFrm.Show(MyGlb.FRM_INSAGGCRONOP, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Modifica", _e);
      return -1;
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
      LOAD_PATSDELETE();
      IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGESDIIS, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGETIPO, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGORDCRO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGAPECHI, 0, (new IDVariant("T")));
      PAN_CRONOPROGRAM.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_CRONOPROGRAM.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INSERISCI2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DEFINICRONO1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONFERVARIA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANDACRONO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENEIMPDAPIA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CALDETCOMPIA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_CRONOPROGRAM.SetFlags (Glb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CRONOPROGRAM.SetFlags (Glb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CRONOPROGRAM.SetFlags (Glb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(3)), true)<0)
        {
          if ((IDL.Today().compareTo(IDL.NullValue(MainFrm.INIZGESTCRON,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)>=0 && IDL.Today().compareTo(IDL.NullValue(MainFrm.FINEGESTCRON,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)<=0))
          {
            IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, (new IDVariant("NO")));
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INSERISCI2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, (new IDVariant("SI")));
        }
      }
      else
      {
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANDACRONO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANDACRONO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DEFINICRONO1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONFERVARIA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENEIMPDAPIA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CALDETCOMPIA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, (new IDVariant("SI")));
      }
      PAN_CRONOPROGRAM.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Load", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGESDIIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGORDCRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGAPECHI, 0, new IDVariant());
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
      UNLOAD_PATSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGESDIIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGORDCRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEMODP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGAPECHI, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELENCOFINANZ)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEFINA, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME24, IMDBDef7.PQSL_FINANZIAME24_FINANZCODICE, 0));
      }
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCCADACAECUJ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS4, IMDBDef11.PQSL_PATS4_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Definizione Cronoprogramma
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DefinizioneCronoprogramma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Cronoprogramma Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Show(MyGlb.FRM_DEFINICRONOP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "DefinizioneCronoprogramma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conferma Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ConfermaVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Variazioni Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARS74, IMDBDef3.FLD_PARS74_NOMEOGGECRON, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, 0));
      MainFrm.Show(MyGlb.FRM_ELENVARDACON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "ConfermaVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Anomalie Entrata Spesa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaAnomalieEntrataSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Anomalie Entrata Spesa Body
      // Corpo Procedura
      // 
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("P_ESERCIZIO"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Verifica_Coerenza_Crono"));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, 0))))
      {
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "StampaAnomalieEntrataSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Piani Importo Attuale Diverso Zero
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaPianiImportoAttualeDiversoZero ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Piani Importo Attuale Diverso Zero Body
      // Corpo Procedura
      // 
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("P_ESERCIZIO"));
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Crono_Piani_Imp_Attuale_Diverso_Zero"));
      MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONO4, IMDBDef11.PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID, 0))))
      {
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "StampaPianiImportoAttualeDiversoZero", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamenti da Cronoprogramma
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int FinanziamentidaCronoprogramma ()
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
      // Finanziamenti da Cronoprogramma Body
      // Corpo Procedura
      // 
      IDVariant J = null;
      J = (new IDVariant(1));
      IDVariant v_VTOTSELEZION = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_FIN_DA_CRONO ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " OR DATA_INSERIMENTO < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      C2 = PAN_CRONOPROGRAM.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CRONOPROGRAM.GotoFirst();
      while (!PAN_CRONOPROGRAM.RSEOF())
      {
        if (PAN_CRONOPROGRAM.IsRowSelected(J.intValue()) && !(IDL.IsNull(C2.Get("CONFERMATO_RAG"))))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_FIN_DA_CRONO ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  PROGRESSIVO_CRONO, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C2.Get("CRONOPROGRAMMA_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            v_VTOTSELEZION = IDL.Add(v_VTOTSELEZION, (new IDVariant(1)));
          }
          catch (Exception e5)
          {
          }
        }
        J = IDL.Add(J, (new IDVariant(1)));
        PAN_CRONOPROGRAM.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_VTOTSELEZION.compareTo((new IDVariant(0)), true)>0)
      {
        // 
        // Richiamo videata con scelta parametri
        // 
        if ((MainFrm.GetForm(MyGlb.FRM_FINDACROFAS1, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_FINDACROFAS1,(new IDVariant(0)).booleanValue()); 
        }
        MainFrm.Show(MyGlb.FRM_FINDACROFAS1, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Nessun Cronoprogramma Selezionato"));
        MainFrm.set_AlertMessage(v_VMSG); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "FinanziamentidaCronoprogramma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamenti Da Cronoprogramma Old
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int FinanziamentiDaCronoprogrammaOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C6;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti Da Cronoprogramma Old Body
      // Corpo Procedura
      // 
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_AVVISOINIZIA = new IDVariant(0,IDVariant.STRING);
      v_AVVISOINIZIA = (new IDVariant("Generare i finanziamenti per i Cronoprogrammi selezionati?"));
      IDVariant J = null;
      J = (new IDVariant(1));
      if ((new IDVariant(PAN_CRONOPROGRAM.ShowMultipleSel())).equals((new IDVariant(0)), true))
      {
        PAN_CRONOPROGRAM.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      }
      else
      {
        if (!(MainFrm.MessageConfirm(v_AVVISOINIZIA)))
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      C6 = PAN_CRONOPROGRAM.MasterRS();
      if (C6.size()>0) CurPos = C6.getRow(); else CurPos = 0;
      if (!C6.Bof()) PAN_CRONOPROGRAM.GotoFirst();
      while (!PAN_CRONOPROGRAM.RSEOF())
      {
        if (PAN_CRONOPROGRAM.IsRowSelected(J.intValue()) && !(IDL.IsNull(C6.Get("CONFERMATO_RAG"))))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          SQL = new StringBuffer();
          SQL.append("select distinct ");
          SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIPLUR ");
          SQL.append("from ");
          SQL.append("  PIANI_CRONOPROGRAMMI A ");
          SQL.append("where (A.CRONOPROGRAMMA_ID = " + IDL.CSql(C6.Get("CRONOPROGRAMMA_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO_PLUR >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("order by ");
          SQL.append("  A.ESERCIZIO_PLUR ");
          C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C8.EOF()) C8.MoveNext();
          while (!C8.EOF())
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.FINGENERAZIONEDACRONO(C8.Get("ESERCIZIPLUR"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C6.Get("CRONOPROGRAMMA_ID"), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
            C8.MoveNext();
          }
          C8.Close();
        }
        J = IDL.Add(J, (new IDVariant(1)));
        PAN_CRONOPROGRAM.GotoNext();
      }
      if (CurPos>0) C6.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      if (v_SELEZIONATO.booleanValue())
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione eseguita"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stato selezionato nessun Cronoprogramma Confermato"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "FinanziamentiDaCronoprogrammaOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Generazione Impegni da Piano
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneImpegnidaPiano ()
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
      // Generazione Impegni da Piano Body
      // Corpo Procedura
      // 
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant I = null;
      I = (new IDVariant(1));
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_CRONO ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      C2 = PAN_CRONOPROGRAM.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CRONOPROGRAM.GotoFirst();
      while (!PAN_CRONOPROGRAM.RSEOF())
      {
        if (PAN_CRONOPROGRAM.IsRowSelected(I.intValue()) && C2.Get("DEFINITO").equals((new IDVariant("SI")), true))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          SQL = new StringBuffer();
          SQL.append("insert into WRK_GEN_VAR_CRONO ");
          SQL.append("( ");
          SQL.append("  PROGR_SESSIONE, ");
          SQL.append("  CRONOPROGRAMMA_ID ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(C2.Get("CRONOPROGRAMMA_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_CRONOPROGRAM.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stato selezionato nessun Cronoprogramma con flag Definito attivo"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        if ((new IDVariant(PAN_CRONOPROGRAM.ShowMultipleSel())).equals((new IDVariant(0)), true))
        {
          PAN_CRONOPROGRAM.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
        }
      }
      else
      {
        MainFrm.Show(MyGlb.FRM_GENEIMPDAPIA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "GenerazioneImpegnidaPiano", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcolo Dettagli Composizione Piano
  // **********************************************************************
  public int CalcoloDettagliComposizionePiano ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcolo Dettagli Composizione Piano Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERACRONOPIANOCOMPTUTTI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Errore nella generazione del dettaglio composizione Cronoprogramma."));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_AVVISO, (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione Eseguita."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cronoprogrammi", "CalcoloDettagliComposizionePiano", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pats
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CRONOPROGRAM_PATS4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PATS4_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PATS3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PATS3, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PATS4_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PATS4_RS, 0, IMDBDef3.TBL_PATS3, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 0, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGESDIIS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 1, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGETIPO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 2, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGORDCRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 3, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 4, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 5, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMEOGGEFINA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS4_RS, 6, 0, IMDBDef3.TBL_PATS3, IMDBDef3.FLD_PATS3_NOMOGGAPECHI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PATS3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PATS3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PATS3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PATS4_RS, 0);
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
  private void PAN_PATS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PATS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PATS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PATS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PATS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PATS);
    // Stub
  }

  private void PAN_PATS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PATS_CAPITOLO)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Capitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PATS_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Finanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PATS_ETICHSCELCAP)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Capitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PATS_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PATS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PATS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PATS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PATS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CRONOPROGRAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CRONOPROGRAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CRONOPROGRAM, Cancel);
    // Stub
  }

  private void PAN_CRONOPROGRAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CRONOPROGRAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CRONOPROGRAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CRONOPROGRAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PATS_Init()
  {

    PAN_PATS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PATS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PATS.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "784CA3CE-C8C6-4884-A1FC-466197E11AB3");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "Esercizio di iscrizione");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, "AD85CC19-F408-4544-9D4E-30D11117E37C");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, "Tipo");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, "7895D6A3-49AC-4793-8C8A-46542345EB17");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, "Aperti/Chiusi");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, "I Cronoprogrammi Aperti sono quelli che hanno almeno un Piano con Anno Plur maggiore o uguale all'Esercizio del contesto");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.VIS_OPTIONBUTTON);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, "A7DD2C16-6295-44CB-AAF6-0B59957368B3");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, "Ordinamento");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, "E151047D-4AA9-4989-B9EB-323E93AA7CAC");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, "Capitolo/Art.");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, "EB84C2BC-A93F-49C1-9998-FE71B4ECBB18");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, "/");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, "47564BD9-8B18-4030-BB39-0CAE22CBE0C3");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, "Finanziamento");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, "07A8FFDE-52AC-400C-B447-B7AC6DA595CA");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PATS.SetImage(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, 0, "wsearch1.gif", false);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, "2B8EC5CB-1320-4E4F-BB94-D32ABC36AC66");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PATS.SetImage(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, 0, "info.gif", false);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, "AB57E49B-D6B2-4AEE-B823-ED9ADB3274E4");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_PATS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 132);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, "Esr. di iscr.");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 144);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, "Esercizio di iscrizione");
    PAN_PATS.SetFieldPage(PFL_PATS_ESERCDIISCRI, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ESERCDIISCRI, PPQRY_PATS4, "A.NOMOGGESDIIS", "NOMOGGESDIIS", 1, 4, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_FORM, 200, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PATS.SetFieldPage(PFL_PATS_TIPO, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_TIPO, PPQRY_PATS4, "A.NOMEOGGETIPO", "NOMEOGGETIPO", 12, 1, 0, -13997);
    PAN_PATS.SetValueListItem(PFL_PATS_TIPO, (new IDVariant("D")), "Definiti", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_TIPO, (new IDVariant("N")), "Non Definiti", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_TIPO, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_LIST, 80);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_LIST, "Aperti/Chiusi");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_FORM, 432, 4, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_FORM, 84);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_APERTICHIUSI, MyGlb.PANEL_FORM, "Aperti/Chiusi");
    PAN_PATS.SetFieldPage(PFL_PATS_APERTICHIUSI, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_APERTICHIUSI, PPQRY_PATS4, "A.NOMOGGAPECHI", "NOMOGGAPECHI", 5, 2, 0, -13997);
    PAN_PATS.SetValueListItem(PFL_PATS_APERTICHIUSI, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_APERTICHIUSI, (new IDVariant("A")), "Aperti", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_APERTICHIUSI, (new IDVariant("C")), "Chiusi", "", "", -1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_LIST, 120);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_FORM, 692, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_FORM, 84);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ORDINAMCRONO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PATS.SetFieldPage(PFL_PATS_ORDINAMCRONO, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ORDINAMCRONO, PPQRY_PATS4, "A.NOMOGGORDCRO", "NOMOGGORDCRO", 1, 1, 0, -13997);
    PAN_PATS.SetValueListItem(PFL_PATS_ORDINAMCRONO, (new IDVariant(1)), "per Esercizio", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_ORDINAMCRONO, (new IDVariant(2)), "per Opera/Progetto", "", "", -1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_FORM, 64, 28, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PATS.SetFieldPage(PFL_PATS_CAPITOLO, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_CAPITOLO, PPQRY_PATS4, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_LIST, 52);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_FORM, 300, 28, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_PATS.SetFieldPage(PFL_PATS_ARTICOLO, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ARTICOLO, PPQRY_PATS4, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_FORM, 432, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PATS.SetFieldPage(PFL_PATS_FINANZIAMENT, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_FINANZIAMENT, PPQRY_PATS4, "A.NOMEOGGEFINA", "NOMEOGGEFINA", 1, 5, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 340, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 348, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetFieldPage(PFL_PATS_ETICHSCELCAP, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ETICHSCELCAP, -1, "", "ETICHSCELCAP", 0, 0, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 348, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 368, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetFieldPage(PFL_PATS_INFOCAP, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_INFOCAP, -1, "", "INFOCAP", 0, 0, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_LIST, 176);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_FORM, 584, 28, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_FORM, 176);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_PATS.SetFieldPage(PFL_PATS_DESCRIFINANZ, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_DESCRIFINANZ, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
  }

  private void PAN_PATS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PATS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEFINA~~) ");
    PAN_PATS.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_PATS.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PATS.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_PATS.SetIMDB(IMDB, "PQRY_PATS4", true);
    PAN_PATS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PATS.SetQueryIMDB(PPQRY_PATS4, IMDBDef11.PQRY_PATS4_RS, IMDBDef3.TBL_PATS3);
    JustLoaded = true;
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_ESERCDIISCRI, IMDBDef3.FLD_PATS3_NOMOGGESDIIS);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_TIPO, IMDBDef3.FLD_PATS3_NOMEOGGETIPO);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_APERTICHIUSI, IMDBDef3.FLD_PATS3_NOMOGGAPECHI);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_ORDINAMCRONO, IMDBDef3.FLD_PATS3_NOMOGGORDCRO);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_CAPITOLO, IMDBDef3.FLD_PATS3_NOMEOGGECAPI);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_ARTICOLO, IMDBDef3.FLD_PATS3_NOMEOGGEARTI);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_FINANZIAMENT, IMDBDef3.FLD_PATS3_NOMEOGGEFINA);
    PAN_PATS.SetMasterTable(0, "PATS3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PATS.Status() == 2)
    {
      int oldListQBE = PAN_PATS.iUseListQBE;
      PAN_PATS.iUseListQBE = 0;
      PAN_PATS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PATS.PanelCommand(Glb.PCM_FIND);
      PAN_PATS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CRONOPROGRAM_Init()
  {

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, "94764661-A4C2-4F4D-B66E-121C521661A5");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, "Inserimento");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, MyGlb.PANEL_LIST, 104, 259, 344, 49, 0, 0);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, MyGlb.PANEL_FORM, 0, 195, 236, 73, 0, 0);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, 0, 70);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, 1, 13);
    PAN_CRONOPROGRAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, 0, 4);
    PAN_CRONOPROGRAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, 1, 4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, "84CE37B1-0C65-4229-ABE2-F519A6F77BF7");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, "Aggiornamento");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, MyGlb.PANEL_LIST, 484, 259, 344, 49, 0, 0);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 243, 232, 73, 0, 0);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, 0, 88);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, 1, 13);
    PAN_CRONOPROGRAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, 0, 4);
    PAN_CRONOPROGRAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, 1, 4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_GROUP, GRP_CRONOPROGRAM_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "D7DEB139-4812-42A8-B5B7-3A6E139783A0");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "7FA794A4-E91E-49F0-BC02-C98ACD80B257");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "Esercizio Entrata");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "8D1CD3AB-533A-4522-A708-CB117F06B8C3");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "Opera Progetto");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "0B57CB77-A501-43CF-A526-37FFCDC1952E");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "5F29B049-4C49-4D71-B16C-EE322D5E5425");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "Descrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.VIS_VISULOOUPCF4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "D1093690-FFF7-42E6-8E08-588017C2BACC");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.VIS_NORMFIELPADR);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "EDD87E58-CE5B-4594-8E43-DF2821A82D7A");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "Importo Iniziale");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "519F5F1E-FE82-460C-A6E4-C6DFC31F1304");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "Importo Attuale");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "06E2818A-6E52-45D3-BDA4-2914B20A1C7E");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "Definito");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "Sono bloccate le modifiche sul Cronoprogramma, tranne quelle sulle Variazioni al Piano");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.VIS_CHECKSTYLE);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, "0B80CB45-A258-4DE2-8F0E-43886B4CF1BD");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, "Confermato");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, " Il Cronoprogramma viene considerato in tutte le Elaborazioni. Sono bloccate le modifiche sul Cronoprogramma dal Decentrato, tranne quelle sulle Variazioni al Piano");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.VIS_CHECKSTYLE);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, "F918C8BA-D9DB-4577-BF6C-8CDE5C8E04E8");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, "Determinato");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, "Permette la gestione delle Variazioni al Piano del Cronoprogramma, per la Ragioneria");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.VIS_CHECKSTYLE);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, "81184685-0CDC-4004-AE80-5F013EEC8695");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, "Opera/Progetto Origine");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.VIS_VISULOOUPCF4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, "3D8C488C-7F97-4ED0-ADB4-D2AAA4628537");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, "Utente");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "335D45E7-CD34-43E4-8021-06B04A8FE5EB");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "Data");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, "7B1FCF0E-1EC9-45A8-9814-2AADBE1E1E9D");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, "Utente");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, "136201F6-856E-469E-9961-1FE2BCCA4BB7");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, "Data");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, "168D34E0-705F-4EC7-89EC-E45FBA5BB3BD");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, "Ordinamento");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CRONOPROGRAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 136);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 4, 316, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 136);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ESERCIISCRIZ, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ESERCIISCRIZ, PPQRY_TESTATCRONO4, "A.ESERCIZIO_ISCRIZIONE", "ESERCIZIO_ISCRIZIONE", 1, 4, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 64, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 124);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, "Esercizio Entrata");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 4, 340, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 124);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, "Esercizio Entrata");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ESERCIENTRAT, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ESERCIENTRAT, PPQRY_TESTATCRONO4, "A.ESERCIZIO_ENTRATA", "ESERCIZIO_ENTRATA", 1, 4, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 124, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, "Opera Progetto");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, "Op. Prog.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_OPERA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_OPERA, PPQRY_TESTATCRONO4, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CRONOPROGRID, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CRONOPROGRID, PPQRY_TESTATCRONO4, "A.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 184, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 224);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 4, 4, 660, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 224);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DESCRIPROGET, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DESCRIPROGET, PPQRY_PROGETCRONOP, "A.DESCRIZIONE", "PROCROOPEDES", 5, 200, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 312, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 188);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 4, 52, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 188);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CRONIDNONDEF, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CRONIDNONDEF, PPQRY_TESTATCRONO4, "A.CRONOPROGRAMMA_ID_NON_DEF", "CRONOPROGRAMMA_ID_NON_DEF", 3, 10, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 400, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, "Importo Iniziale");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, "Importo Iniziale");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTINIZIA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTINIZIA, PPQRY_TESTATCRONO4, "A.IMPORTO_INIZIALE", "IMPORTO_INIZIALE", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 528, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, "Importo Attuale");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, "Importo Attuale");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTATTUAL, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTATTUAL, PPQRY_TESTATCRONO4, "A.IMPORTO_ATTUALE", "IMPORTO_ATTUALE", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 656, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 60);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, "Definito");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 60);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, "Definito");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DEFINITO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DEFINITO, PPQRY_TESTATCRONO4, "A.DEFINITO", "DEFINITO", 5, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DEFINITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DEFINITO, (new IDVariant()), "Null", "", "", -1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_LIST, 708, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_LIST, 112);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_LIST, "Confermato");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_FORM, 4, 172, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_FORM, 112);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CONFERMATRAG, MyGlb.PANEL_FORM, "Confermato");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CONFERMATRAG, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CONFERMATRAG, PPQRY_TESTATCRONO4, "A.CONFERMATO_RAG", "CONFERMATO_RAG", 5, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_CONFERMATRAG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_CONFERMATRAG, (new IDVariant()), "Null", "", "", -1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_LIST, 784, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_LIST, 88);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_LIST, "Determinato");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_FORM, 4, 196, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_FORM, 88);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DETERMINATO, MyGlb.PANEL_FORM, "Determinato");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DETERMINATO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DETERMINATO, PPQRY_TESTATCRONO4, "A.DETERMINATO", "DETERMINATO", 5, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DETERMINATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DETERMINATO, (new IDVariant()), "Null", "", "", -1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_LIST, 864, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_LIST, 260);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_LIST, "Opera/Progetto Origine");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_FORM, 4, 52, 696, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_FORM, 260);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERPROGORIG, MyGlb.PANEL_FORM, "Opera/Progetto Origine");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_OPERPROGORIG, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_OPERPROGORIG, PPQRY_PROGETORIGIN, "TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE", "PROGCRONDESC", 5, 302, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_LIST, 108, 284, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_LIST, 56);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_UTENTEINSERI, -1, GRP_CRONOPROGRAM_INSERIMENTO);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_UTENTEINSERI, PPQRY_TESTATCRONO4, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 332, 284, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 40);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DATAINSERIME, -1, GRP_CRONOPROGRAM_INSERIMENTO);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DATAINSERIME, PPQRY_TESTATCRONO4, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_LIST, 488, 284, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_LIST, 56);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_FORM, 124);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_UTENTULTIAGG, -1, GRP_CRONOPROGRAM_AGGIORNAMENT);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_UTENTULTIAGG, PPQRY_TESTATCRONO4, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_LIST, 712, 284, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_LIST, 40);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 292, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DATAULTIMAGG, -1, GRP_CRONOPROGRAM_AGGIORNAMENT);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DATAULTIMAGG, PPQRY_TESTATCRONO4, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 364, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ORDINAMENTO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldUnbound(PFL_CRONOPROGRAM_ORDINAMENTO, true);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ORDINAMENTO, PPQRY_TESTATCRONO4, "DECODE(~~PQRY_PATS4.NOMOGGORDCRO~~, 1, A.ESERCIZIO_ISCRIZIONE, A.OPERA)", "ORDINAMENTO", 1, 19, 0, -13997);
  }

  private void PAN_CRONOPROGRAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROCROOPEDES ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_PROGETCRONOP, 0, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_PROGETCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(PPQRY_PROGETCRONOP, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE as PROGCRONDESC ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (A.CRONOPROGRAMMA_ID = ~~CRONOPROGRAMMA_ID_NON_DEF~~) ");
    SQL.append("and   (B.CODICE = A.OPERA) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_PROGETORIGIN, 0, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_PROGETORIGIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(PPQRY_PROGETORIGIN, "TESTATE_CRONOPROGRAMMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_CRONOPROGRAM_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_CRONOPROGRAM_UTENTEINSERI, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_DUAL, 0, SQL, PFL_CRONOPROGRAM_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_DUAL, 1, SQL, PFL_CRONOPROGRAM_UTENTULTIAGG, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetIMDB(IMDB, "PQRY_TESTATCRONO4", true);
    PAN_CRONOPROGRAM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRAMMA_ID, ");
    SQL.append("  A.CRONOPROGRAMMA_ID_NON_DEF as CRONOPROGRAMMA_ID_NON_DEF, ");
    SQL.append("  A.IMPORTO_INIZIALE as IMPORTO_INIZIALE, ");
    SQL.append("  A.IMPORTO_ATTUALE as IMPORTO_ATTUALE, ");
    SQL.append("  A.DEFINITO as DEFINITO, ");
    SQL.append("  A.CONFERMATO_RAG as CONFERMATO_RAG, ");
    SQL.append("  A.DETERMINATO as DETERMINATO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO_ISCRIZIONE as ESERCIZIO_ISCRIZIONE, ");
    SQL.append("  A.ESERCIZIO_ENTRATA as ESERCIZIO_ENTRATA, ");
    SQL.append("  DECODE(~~PQRY_PATS4.NOMOGGORDCRO~~, 1, A.ESERCIZIO_ISCRIZIONE, A.OPERA) as ORDINAMENTO ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO_ISCRIZIONE = NVL(~~PQRY_PATS4.NOMOGGESDIIS~~, A.ESERCIZIO_ISCRIZIONE)) ");
    SQL.append("and   (NVL(A.DEFINITO, '-1') = CASE WHEN ~~PQRY_PATS4.NOMEOGGETIPO~~ = 'D' THEN 'SI' ELSE CASE WHEN ~~PQRY_PATS4.NOMEOGGETIPO~~ = 'N' THEN '-1' ELSE NVL(A.DEFINITO, '-1') END END) ");
    SQL.append("and   ((~~PQRY_PATS4.NOMEOGGEFINA~~ IS NULL) OR (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PIANI_CRONOPROGRAMMI B ");
    SQL.append("where (B.FINANZIAMENTO = ~~PQRY_PATS4.NOMEOGGEFINA~~) ");
    SQL.append("and   (B.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append(")))) ");
    SQL.append("and   (((~~PQRY_PATS4.NOMEOGGECAPI~~ IS NULL) OR (~~PQRY_PATS4.NOMEOGGEARTI~~ IS NULL)) OR (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI C ");
    SQL.append("where (C.CAPITOLO = ~~PQRY_PATS4.NOMEOGGECAPI~~) ");
    SQL.append("and   (C.ARTICOLO = ~~PQRY_PATS4.NOMEOGGEARTI~~) ");
    SQL.append("and   (C.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append(")))) ");
    SQL.append("and   (NVL(~~PQRY_PATS4.NOMOGGAPECHI~~, 'T') <> 'A' OR (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PIANI_CRONOPROGRAMMI D ");
    SQL.append("where (D.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (D.ESERCIZIO_PLUR >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append(")))) ");
    SQL.append("and   (NVL(~~PQRY_PATS4.NOMOGGAPECHI~~, 'T') <> 'C' OR (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PIANI_CRONOPROGRAMMI E ");
    SQL.append("where (E.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (E.ESERCIZIO_PLUR >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("))))) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 15, 10 ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO4, 5, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_TESTATCRONO4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(0, "TESTATE_CRONOPROGRAMMI");
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_ORDINAMENTO, true);
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_DATAINSERIME, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CRONOPROGRAM.Status() == 2)
    {
      int oldListQBE = PAN_CRONOPROGRAM.iUseListQBE;
      PAN_CRONOPROGRAM.iUseListQBE = 0;
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_FIND);
      PAN_CRONOPROGRAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_ValidateRow(Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_DynamicProperties();
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_PATS) PAN_PATS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
