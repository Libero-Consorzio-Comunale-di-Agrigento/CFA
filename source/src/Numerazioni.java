// **********************************************
// Numerazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Numerazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NEWTABBEVIEW;
  private static int PFL_PROTOCOLLO_ULTIMONUMER1 = 0;
  private static int PFL_PROTOCOLLO_ANNO1 = 1;
  private static int PFL_PROTOCOLLO_UTENTEINSER1 = 2;
  private static int PFL_PROTOCOLLO_DATAINSERIM1 = 3;
  private static int PFL_PROTOCOLLO_UTENTULTIAG1 = 4;
  private static int PFL_PROTOCOLLO_DATAULTIMAG1 = 5;

  private static int PPQRY_N7 = 0;


  IDPanel PAN_PROTOCOLLO;
  private static int PFL_REGISTRAZIVA_TIPOREGISTRO = 0;
  private static int PFL_REGISTRAZIVA_TIPOBOLLATO = 1;
  private static int PFL_REGISTRAZIVA_UTENTEINSER2 = 2;
  private static int PFL_REGISTRAZIVA_DATAINSERIM2 = 3;
  private static int PFL_REGISTRAZIVA_UTENTULTIAG2 = 4;
  private static int PFL_REGISTRAZIVA_DATAULTIMAG2 = 5;
  private static int PFL_REGISTRAZIVA_ANNO = 6;
  private static int PFL_REGISTRAZIVA_DESCRIZIONE = 7;
  private static int PFL_REGISTRAZIVA_ULTIMONUMER2 = 8;
  private static int PFL_REGISTRAZIVA_ULTIMADATA = 9;
  private static int PFL_REGISTRAZIVA_LABEL = 10;

  private static int PPQRY_T15 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_REGISTRAZIVA;
  private static int PFL_MOVIMENTI_TIPO = 0;
  private static int PFL_MOVIMENTI_ULTIMONUMERO = 1;
  private static int PFL_MOVIMENTI_ESERCIZIO1 = 2;
  private static int PFL_MOVIMENTI_UTENTEINSERI = 3;
  private static int PFL_MOVIMENTI_DATAINSERIME = 4;
  private static int PFL_MOVIMENTI_UTENTULTIAGG = 5;
  private static int PFL_MOVIMENTI_DATAULTIMAGG = 6;

  private static int PPQRY_N4 = 0;


  IDPanel PAN_MOVIMENTI;
  private static int GRP_DISTINTE_MANDATI = 0;
  private static int GRP_DISTINTE_ORDINATIVI = 1;

  private static int PFL_DISTINTE_ESERCIZIO = 0;
  private static int PFL_DISTINTE_STAMPATI1 = 1;
  private static int PFL_DISTINTE_ULTIDISDITR1 = 2;
  private static int PFL_DISTINTE_ULTITRASATE1 = 3;
  private static int PFL_DISTINTE_STAMPATI = 4;
  private static int PFL_DISTINTE_ULTIDISDITRA = 5;
  private static int PFL_DISTINTE_ULTITRASATES = 6;

  private static int PPQRY_N5 = 0;


  IDPanel PAN_DISTINTE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_N7(IMDB);
    Init_PQRY_T15(IMDB);
    Init_PQRY_N4(IMDB);
    Init_PQRY_N5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_N7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_N7, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_N7, "PQRY_N7");
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_NUMERO,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_N7,IMDBDef9.PQSL_N7_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_N7, 0);
  }

  private static void Init_PQRY_T15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T15, 9);
    IMDB.set_TblCode(IMDBDef9.PQRY_T15, "PQRY_T15");
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_ULTIMO_NUMERO, "ULTIMO_NUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_ULTIMO_NUMERO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_D_ULTIMA_DATA, "D_ULTIMA_DATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T15,IMDBDef9.PQSL_T15_D_ULTIMA_DATA,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T15, 0);
  }

  private static void Init_PQRY_N4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_N4, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_N4, "PQRY_N4");
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_CODICE,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_NUMERO,1,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_N4,IMDBDef9.PQSL_N4_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_N4, 0);
  }

  private static void Init_PQRY_N5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_N5, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_N5, "PQRY_N5");
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_MANDATI_STAMPATI, "MANDATI_STAMPATI");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_MANDATI_STAMPATI,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ELENCO_MANDATI, "ELENCO_MANDATI");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ELENCO_MANDATI,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ULT_MAN_TESO, "ULT_MAN_TESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ULT_MAN_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ORDINATIVI_STAMPATI, "ORDINATIVI_STAMPATI");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ORDINATIVI_STAMPATI,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ELENCO_ORDINATIVI, "ELENCO_ORDINATIVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ELENCO_ORDINATIVI,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ULT_ORD_TESO, "ULT_ORD_TESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_N5,IMDBDef9.PQSL_N5_ULT_ORD_TESO,1,5,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_N5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Numerazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Numerazioni()
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
    FormIdx = MyGlb.FRM_NUMERAZIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7B8FE392-193F-4C88-A756-5F6C7F3E4D4C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 652;
    DesignHeight = 370;
    set_Caption(new IDVariant("Numerazioni"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 652;
    Frames[1].Height = 344;
    Frames[1].Caption = "New Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[1].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "74DCD59E-2053-4303-96F0-8772E40F2523";
    TAB_NEWTABBEVIEW.SetItemCount(4);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Protocollo";
    Frames[2].Parent = this;
    PAN_PROTOCOLLO = new IDPanel(w, this, 2, "PAN_PROTOCOLLO");
    Frames[2].Content = PAN_PROTOCOLLO;
    PAN_PROTOCOLLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROTOCOLLO.VS = MainFrm.VisualStyleList;
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6423ACF3-EE16-45A3-B7EC-D901E18C85E2");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 52, 350, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROTOCOLLO.InitStatus = 2;
    PAN_PROTOCOLLO_Init();
    PAN_PROTOCOLLO_InitFields();
    PAN_PROTOCOLLO_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[2], 0, "", "Protocollo", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Registrazione IVA";
    Frames[3].Parent = this;
    PAN_REGISTRAZIVA = new IDPanel(w, this, 3, "PAN_REGISTRAZIVA");
    Frames[3].Content = PAN_REGISTRAZIVA;
    PAN_REGISTRAZIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGISTRAZIVA.VS = MainFrm.VisualStyleList;
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AD5214B7-3BC7-4FDA-9E0A-C01B15778796");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGISTRAZIVA.InitStatus = 2;
    PAN_REGISTRAZIVA_Init();
    PAN_REGISTRAZIVA_InitFields();
    PAN_REGISTRAZIVA_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[3], 0, "", "Registrazione IVA", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Movimenti";
    Frames[4].Parent = this;
    PAN_MOVIMENTI = new IDPanel(w, this, 4, "PAN_MOVIMENTI");
    Frames[4].Content = PAN_MOVIMENTI;
    PAN_MOVIMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMENTI.VS = MainFrm.VisualStyleList;
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0CB318DC-402B-43A3-BC58-7B6433E4E18A");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMENTI.InitStatus = 2;
    PAN_MOVIMENTI_Init();
    PAN_MOVIMENTI_InitFields();
    PAN_MOVIMENTI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(3, Frames[4], 0, "", "Movimenti", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Distinte";
    Frames[5].Parent = this;
    PAN_DISTINTE = new IDPanel(w, this, 5, "PAN_DISTINTE");
    Frames[5].Content = PAN_DISTINTE;
    PAN_DISTINTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINTE.VS = MainFrm.VisualStyleList;
    PAN_DISTINTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6DD8B4C6-351F-438D-8531-4DFA25636C46");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 600, 286, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINTE.InitStatus = 2;
    PAN_DISTINTE_Init();
    PAN_DISTINTE_InitFields();
    PAN_DISTINTE_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(4, Frames[5], 0, "", "Distinte", "");
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
      PAN_PROTOCOLLO.UpdatePanel(MainFrm);
      PAN_REGISTRAZIVA.UpdatePanel(MainFrm);
      PAN_MOVIMENTI.UpdatePanel(MainFrm);
      PAN_DISTINTE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_TIPOBOLLATO && flRis && IdxPanelActived == PAN_REGISTRAZIVA.FrIndex)
    {
      if (IdxFieldActived ==PFL_REGISTRAZIVA_DESCRIZIONE) {
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
    return (obj instanceof Numerazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Numerazioni.class.getName() : (Glb.ClassWithPackage(Numerazioni.class) ? Numerazioni.class.getName().substring(Numerazioni.class.getPackage().getName().length() + 1) : Numerazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Protocollo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PROTOCOLLO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Protocollo After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_PROTOCOLLO.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_PROTOCOLLO.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "ProtocolloAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Protocollo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PROTOCOLLO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Protocollo On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_N7, IMDBDef9.PQSL_N7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_N7, IMDBDef9.PQSL_N7_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_N7, IMDBDef9.PQSL_N7_ANNO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_N7, IMDBDef9.PQSL_N7_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_N7, IMDBDef9.PQSL_N7_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "ProtocolloOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Protocollo On Database Error Event
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
  private void PAN_PROTOCOLLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PROTOCOLLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Protocollo On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "ProtocolloOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Registrazione IVA On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_REGISTRAZIVA_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registrazione IVA On Change Row Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "RegistrazioneIVAOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Registrazione IVA On Database Error Event
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
  private void PAN_REGISTRAZIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_REGISTRAZIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Registrazione IVA On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "RegistrazioneIVAOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Registrazione IVA On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_REGISTRAZIVA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registrazione IVA On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_ANNO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "RegistrazioneIVAOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Registrazione IVA On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGISTRAZIVA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_REGISTRAZIVA);
      // 
      // Registrazione IVA On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_REGISTRAZIVA.set_ToolTip(Glb.OBJ_FIELD,PFL_REGISTRAZIVA_DESCRIZIONE,(new IDVariant(PAN_REGISTRAZIVA.FieldText(PFL_REGISTRAZIVA_DESCRIZIONE))).stringValue()); 
      if (PAN_REGISTRAZIVA.IsNewRow())
      {
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_REGISTRAZIVA.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "RegistrazioneIVAOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti On Database Error Event
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
  private void PAN_MOVIMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_MOVIMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Movimenti On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "MovimentiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_MOVIMENTI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_N4, IMDBDef9.PQSL_N4_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_N4, IMDBDef9.PQSL_N4_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_N4, IMDBDef9.PQSL_N4_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_N4, IMDBDef9.PQSL_N4_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "MovimentiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Distinte On Database Error Event
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
  private void PAN_DISTINTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DISTINTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Distinte On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "DistinteOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Distinte After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DISTINTE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_DISTINTE.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_DISTINTE.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "DistinteAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Registrazione IVA Tipo Registro Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_REGISTRAZIVA_TIPOREGISTRO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registrazione IVA Tipo Registro Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Impossibile selezionare il valore: ", IDVariant.STRING));
        IDVariant v_TE = new IDVariant(0,IDVariant.STRING);
        v_TE = (new IDVariant("6 - Vendite Debitori non Codificati", IDVariant.STRING));
        v_ERRORMESSAGE = IDL.Add(IDL.Add(IDL.Add(v_ERRORMESSAGE, v_TE), (new IDVariant("<BR/>"))), (new IDVariant("Gestione Fatturazione non presente in T99")));
        if (!(MainFrm.GESTIOFATTUR.equals((new IDVariant("SI")), true)))
        {
          MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_TIPO_REGISTRO, 0, IDL.ToInteger(PAN_REGISTRAZIVA.GetOrgValue(PFL_REGISTRAZIVA_TIPOREGISTRO)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "RegistrazioneIVATipoRegistroValidateEvent", _e);
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
      PAN_PROTOCOLLO.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PROTOCOLLO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PROTOCOLLO.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PROTOCOLLO.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MOVIMENTI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MOVIMENTI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MOVIMENTI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PROTOCOLLO.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DISTINTE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DISTINTE.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DISTINTE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DISTINTE.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MOVIMENTI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_TIPOBOLLATO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef7.PQRY_T04, IMDBDef7.PQSL_T04_TIPO_BOLLATO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Apri T04
  // **********************************************************************
  public int ApriT04 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri T04 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_IMDB1, IMDBDef1.FLD_IMDB1_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef9.PQRY_T15, IMDBDef9.PQSL_T15_TIPO_REGISTRO, 0));
      MainFrm.Show(MyGlb.FRM_TIPOBOLLATO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Numerazioni", "ApriT04", _e);
      return -1;
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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
  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROTOCOLLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROTOCOLLO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROTOCOLLO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PROTOCOLLO);
    // Stub
  }

  private void PAN_PROTOCOLLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROTOCOLLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PROTOCOLLO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PROTOCOLLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROTOCOLLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_REGISTRAZIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGISTRAZIVA, Cancel);
    // Stub
  }

  private void PAN_REGISTRAZIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_REGISTRAZIVA_DESCRIZIONE)
    {
      this.IdxPanelActived = this.PAN_REGISTRAZIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriT04();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_REGISTRAZIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_REGISTRAZIVA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_REGISTRAZIVA_TIPOREGISTRO)
      {
        PFL_REGISTRAZIVA_TIPOREGISTRO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_REGISTRAZIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_REGISTRAZIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMENTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMENTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MOVIMENTI);
    // Stub
  }

  private void PAN_MOVIMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MOVIMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_MOVIMENTI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOVIMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINTE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINTE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINTE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISTINTE);
    // Stub
  }

  private void PAN_DISTINTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTINTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINTE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROTOCOLLO_Init()
  {

    PAN_PROTOCOLLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROTOCOLLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROTOCOLLO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, "466DD85B-7B27-4DC5-B640-6ABBDDAF314B");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, "Ultimo Numero");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, "C94133BF-3DAA-48EF-A2B0-FB8001C4B499");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, "ANNO");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, "C7813B43-CF59-42CB-B379-CE101720756B");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, "36B62C6E-BEE5-43B0-AAC9-A3D47C50F29F");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, "E3DF3123-E2B7-460F-AD5E-BC93ECF20898");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROTOCOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, "C88BD69B-E47F-40B9-836C-A88BACCED767");
    PAN_PROTOCOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_PROTOCOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, "");
    PAN_PROTOCOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROTOCOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROTOCOLLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_LIST, 52);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_LIST, "Ultimo Numero");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_FORM, 16, 20, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_FORM, 96);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ULTIMONUMER1, MyGlb.PANEL_FORM, "Ultimo Numero");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_ULTIMONUMER1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_ULTIMONUMER1, PPQRY_N7, "A.NUMERO", "NUMERO", 1, 7, 0, -13997);
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_LIST, 40);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_LIST, "ANNO");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_FORM, 32, 28, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_FORM, 40);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_ANNO1, MyGlb.PANEL_FORM, "ANNO");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_ANNO1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_ANNO1, PPQRY_N7, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 120, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_FORM, 116);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_UTENTEINSER1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_UTENTEINSER1, PPQRY_N7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 144, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_FORM, 116);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAINSERIM1, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_DATAINSERIM1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_DATAINSERIM1, PPQRY_N7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_FORM, 244, 120, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_FORM, 116);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_UTENTULTIAG1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_UTENTULTIAG1, PPQRY_N7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PROTOCOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_FORM, 244, 144, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROTOCOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_FORM, 116);
    PAN_PROTOCOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_PROTOCOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROTOCOLLO_DATAULTIMAG1, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_PROTOCOLLO.SetFieldPage(PFL_PROTOCOLLO_DATAULTIMAG1, -1, -1);
    PAN_PROTOCOLLO.SetFieldPanel(PFL_PROTOCOLLO_DATAULTIMAG1, PPQRY_N7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_PROTOCOLLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROTOCOLLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROTOCOLLO.SetIMDB(IMDB, "PQRY_N7", true);
    PAN_PROTOCOLLO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  N06 A ");
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROTOCOLLO.SetQuery(PPQRY_N7, 5, SQL, -1, "");
    PAN_PROTOCOLLO.SetQueryDB(PPQRY_N7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROTOCOLLO.SetMasterTable(0, "N06");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROTOCOLLO.Status() == 2)
    {
      int oldListQBE = PAN_PROTOCOLLO.iUseListQBE;
      PAN_PROTOCOLLO.iUseListQBE = 0;
      PAN_PROTOCOLLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROTOCOLLO.PanelCommand(Glb.PCM_FIND);
      PAN_PROTOCOLLO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_REGISTRAZIVA_Init()
  {

    PAN_REGISTRAZIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGISTRAZIVA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_REGISTRAZIVA.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, "11E1BB5A-685E-4012-8254-5A7DC8A5205B");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, "Tipo Registro");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, "DBA1B9DE-21A7-4B9C-B031-1629DAD22D27");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, "Tipo Bollato");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, "A7D3BB30-0850-44C4-AB00-1B6807DE791D");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, "UTENTE INSERIMENTO");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, "11F77502-A5ED-4A8E-9011-67E5B01CEAE9");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, "DATA INSERIMENTO");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, "8FE8976E-0343-4DDE-A173-E93AC23EFB4D");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, "UTENTE ULTIMO AGG");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, "F3B8B540-F838-4FD1-87BF-A2939176E934");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, "DATA ULTIMO AGG");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, "AAEF4588-C806-493D-BDC8-0B9C6038D46A");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, "ANNO");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, "0989B0D3-3083-4DB5-AE4D-F37A4FC5F7B6");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, "Descrizione");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, "78BA1E55-629C-454D-B95E-78A8D1B6E319");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, "Ultimo Numero");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, "8362F4C9-6FB3-4D33-990A-C79A41D41619");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, "Ultima Data");
    PAN_REGISTRAZIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, "");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRAZIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, "4483BE32-8607-4C8F-91ED-E88D8CD8CC78");
    PAN_REGISTRAZIVA.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, "Tipo Registro");
    PAN_REGISTRAZIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_REGISTRAZIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_REGISTRAZIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_TIPOREGISTRO, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_TIPOREGISTRO, PPQRY_T15, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_REGISTRAZIVA.SetValueListItem(PFL_REGISTRAZIVA_TIPOREGISTRO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 188, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Bll.");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_TIPOBOLLATO, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_TIPOBOLLATO, PPQRY_T15, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_LIST, 116, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_LIST, 120);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_FORM, 120);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTEINSER2, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_UTENTEINSER2, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_UTENTEINSER2, PPQRY_T15, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_LIST, 236, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_LIST, 108);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_FORM, 108);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAINSERIM2, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_DATAINSERIM2, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_DATAINSERIM2, PPQRY_T15, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_LIST, 344, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_LIST, 112);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_FORM, 112);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_UTENTULTIAG2, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_UTENTULTIAG2, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_UTENTULTIAG2, PPQRY_T15, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_LIST, 456, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_LIST, 100);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_FORM, 100);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DATAULTIMAG2, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_DATAULTIMAG2, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_DATAULTIMAG2, PPQRY_T15, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_LIST, 560, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_LIST, "ANNO");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_FORM, 4, 148, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ANNO, MyGlb.PANEL_FORM, "ANNO");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_ANNO, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_ANNO, PPQRY_T15, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_LIST, 216, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_LIST, 100);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_FORM, 100);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_DESCRIZIONE, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_DESCRIZIONE, PPQRY_T04, "A.DESCRIZIONE", "T04DESCRIZIO", 5, 40, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_LIST, 424, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_LIST, 92);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_LIST, "Ultimo Numero");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_FORM, 92);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMONUMER2, MyGlb.PANEL_FORM, "Ultimo Numero");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_ULTIMONUMER2, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_ULTIMONUMER2, PPQRY_T15, "A.ULTIMO_NUMERO", "ULTIMO_NUMERO", 1, 5, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_LIST, 504, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_LIST, 88);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_LIST, "Ultima Data");
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_FORM, 88);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_ULTIMADATA, MyGlb.PANEL_FORM, "Ultima Data");
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_ULTIMADATA, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_ULTIMADATA, PPQRY_T15, "A.D_ULTIMA_DATA", "D_ULTIMA_DATA", 6, 19, 0, -13997);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_LIST, 0, 0, 424, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_REGISTRAZIVA.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_FORM, -28, 0, 416, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRAZIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_REGISTRAZIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRAZIVA_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRAZIVA.SetFieldPage(PFL_REGISTRAZIVA_LABEL, -1, -1);
    PAN_REGISTRAZIVA.SetFieldPanel(PFL_REGISTRAZIVA_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
  }

  private void PAN_REGISTRAZIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGISTRAZIVA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_REGISTRAZIVA.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGISTRAZIVA.SetMasterTable(PPQRY_T04, "T04");
    PAN_REGISTRAZIVA.SetIMDB(IMDB, "PQRY_T15", true);
    PAN_REGISTRAZIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.ULTIMO_NUMERO as ULTIMO_NUMERO, ");
    SQL.append("  A.D_ULTIMA_DATA as D_ULTIMA_DATA ");
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T07 A ");
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_REGISTRAZIVA.SetQuery(PPQRY_T15, 5, SQL, -1, "");
    PAN_REGISTRAZIVA.SetQueryDB(PPQRY_T15, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGISTRAZIVA.SetMasterTable(0, "T07");
    PAN_REGISTRAZIVA.AddToSortList(PFL_REGISTRAZIVA_TIPOREGISTRO, true);
    PAN_REGISTRAZIVA.AddToSortList(PFL_REGISTRAZIVA_TIPOBOLLATO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGISTRAZIVA.Status() == 2)
    {
      int oldListQBE = PAN_REGISTRAZIVA.iUseListQBE;
      PAN_REGISTRAZIVA.iUseListQBE = 0;
      PAN_REGISTRAZIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGISTRAZIVA.PanelCommand(Glb.PCM_FIND);
      PAN_REGISTRAZIVA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_MOVIMENTI_Init()
  {

    PAN_MOVIMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOVIMENTI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, "405AFFE0-FDFC-4B8D-B297-7557A98AF288");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, "Tipo");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, "659686F1-F4B7-41A7-99DA-1BEA46DB66DF");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, "Ultimo Numero");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, "839E0829-5659-482E-8FEA-C7C94637515D");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, "ESERCIZIO");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, "BCA28EEB-A443-4153-8AAB-7BBFC95F9B4B");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, "454EA599-3FAF-4407-85DD-CF38425F9A03");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, "89CB8EEC-E4F6-4FEB-AB60-0054C0728DF1");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, "A743628C-A1F6-4799-8643-558E1DB13275");
    PAN_MOVIMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_MOVIMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, "");
    PAN_MOVIMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOVIMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_LIST, 48);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_FORM, 4, 4, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_TIPO, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_TIPO, PPQRY_N4, "A.CODICE", "CODICE", 5, 6, 0, -13997);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("acc")), "Accertamenti", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("imp")), "Impegni", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("subimp")), "SubImpegni", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("ord")), "Ordinativi", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("liq")), "Liquidazioni", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("man")), "Mandati", "", "", -1);
    PAN_MOVIMENTI.SetValueListItem(PFL_MOVIMENTI_TIPO, (new IDVariant("buo")), "Buoni", "", "", -1);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_LIST, 80, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_LIST, 52);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_LIST, "Ultimo Numero");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_FORM, 4, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_FORM, 52);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ULTIMONUMERO, MyGlb.PANEL_FORM, "Ul. Num.");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_ULTIMONUMERO, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_ULTIMONUMERO, PPQRY_N4, "A.NUMERO", "NUMERO", 1, 10, 0, -13997);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_LIST, 108, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERC.");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_ESERCIZIO1, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_ESERCIZIO1, PPQRY_N4, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_LIST, 160, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_UTENTEINSERI, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_UTENTEINSERI, PPQRY_N4, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_LIST, 280, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_DATAINSERIME, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_DATAINSERIME, PPQRY_N4, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 388, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_UTENTULTIAGG, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_UTENTULTIAGG, PPQRY_N4, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 500, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_MOVIMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_MOVIMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_MOVIMENTI.SetFieldPage(PFL_MOVIMENTI_DATAULTIMAGG, -1, -1);
    PAN_MOVIMENTI.SetFieldPanel(PFL_MOVIMENTI_DATAULTIMAGG, PPQRY_N4, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_MOVIMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMENTI.SetIMDB(IMDB, "PQRY_N4", true);
    PAN_MOVIMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  N03 A ");
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE <> 'pre') ");
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMENTI.SetQuery(PPQRY_N4, 5, SQL, -1, "");
    PAN_MOVIMENTI.SetQueryDB(PPQRY_N4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMENTI.SetMasterTable(0, "N03");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMENTI.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMENTI.iUseListQBE;
      PAN_MOVIMENTI.iUseListQBE = 0;
      PAN_MOVIMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMENTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISTINTE_Init()
  {

    PAN_DISTINTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, "FD22B1CF-C8A7-4BA4-8797-E0B3C202713E");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, "Mandati");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, MyGlb.PANEL_FORM, 12, 7, 252, 97, 0, 0);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, 0, 46);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, 1, 13);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, 0, 4);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, 1, 4);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINTE_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, "B3124EA2-3FB8-41BE-BDCC-71A0A84E7D98");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, "Ordinativi");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 124, 16, 0, 0);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, MyGlb.PANEL_FORM, 12, 123, 252, 97, 0, 0);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, 0, 55);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, 1, 13);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, 0, 4);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, 1, 4);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINTE_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, "AA5DC869-6A48-4105-A59E-ED65631D1E7C");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, "ESERCIZIO");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, "184E2A2A-6B06-47BC-914E-1E180D2383E9");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, "Stampati");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, "ABD93D04-1507-4188-AA55-EA6C29F68DFC");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, "Ultima Distinta di Trasmissione");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, "406FB046-9A53-4AAE-AAC0-54CA40D776A8");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, "Ultimo Trasmesso a Tesoriere");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, "BB64BBE8-F9F2-4C02-A561-D5665DE9870E");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, "Stampati");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, "A19AC74F-770A-4923-A7BD-513E6BD632C1");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, "Ultima Distinta di Trasmissione");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, "B0AE949D-634E-4232-A056-29A882273F9D");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, "Ultimo Trasmesso a Tesoriere");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTINTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ESERCIZIO, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ESERCIZIO, PPQRY_N5, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_LIST, 108);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_LIST, "Stampati");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_FORM, 16, 32, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_FORM, 184);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI1, MyGlb.PANEL_FORM, "Stampati");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_STAMPATI1, -1, GRP_DISTINTE_MANDATI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_STAMPATI1, PPQRY_N5, "A.MANDATI_STAMPATI", "MANDATI_STAMPATI", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_LIST, 96);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_LIST, "Ult. Dst. di Tras.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_FORM, 16, 56, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_FORM, 184);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITR1, MyGlb.PANEL_FORM, "Ultima Distinta di Trasmissione");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ULTIDISDITR1, -1, GRP_DISTINTE_MANDATI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ULTIDISDITR1, PPQRY_N5, "A.ELENCO_MANDATI", "ELENCO_MANDATI", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_LIST, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_LIST, "Ul. Trs. a Tes.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_FORM, 20, 80, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_FORM, 180);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATE1, MyGlb.PANEL_FORM, "Ultimo Trasmesso a Tesoriere");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ULTITRASATE1, -1, GRP_DISTINTE_MANDATI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ULTITRASATE1, PPQRY_N5, "A.ULT_MAN_TESO", "ULT_MAN_TESO", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_LIST, 124);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_LIST, "Stampati");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_FORM, 16, 148, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_FORM, 184);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STAMPATI, MyGlb.PANEL_FORM, "Stampati");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_STAMPATI, -1, GRP_DISTINTE_ORDINATIVI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_STAMPATI, PPQRY_N5, "A.ORDINATIVI_STAMPATI", "ORDINATIVI_STAMPATI", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_LIST, 112);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_LIST, "Ult. Dist. di Trasm.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_FORM, 16, 172, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_FORM, 184);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTIDISDITRA, MyGlb.PANEL_FORM, "Ultima Distinta di Trasmissione");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ULTIDISDITRA, -1, GRP_DISTINTE_ORDINATIVI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ULTIDISDITRA, PPQRY_N5, "A.ELENCO_ORDINATIVI", "ELENCO_ORDINATIVI", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_LIST, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_LIST, "Ul. Trs. a Tes.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_FORM, 20, 196, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_FORM, 180);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ULTITRASATES, MyGlb.PANEL_FORM, "Ultimo Trasmesso a Tesoriere");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ULTITRASATES, -1, GRP_DISTINTE_ORDINATIVI);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ULTITRASATES, PPQRY_N5, "A.ULT_ORD_TESO", "ULT_ORD_TESO", 1, 5, 0, -13997);
  }

  private void PAN_DISTINTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINTE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISTINTE.SetIMDB(IMDB, "PQRY_N5", true);
    PAN_DISTINTE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.MANDATI_STAMPATI as MANDATI_STAMPATI, ");
    SQL.append("  A.ELENCO_MANDATI as ELENCO_MANDATI, ");
    SQL.append("  A.ULT_MAN_TESO as ULT_MAN_TESO, ");
    SQL.append("  A.ORDINATIVI_STAMPATI as ORDINATIVI_STAMPATI, ");
    SQL.append("  A.ELENCO_ORDINATIVI as ELENCO_ORDINATIVI, ");
    SQL.append("  A.ULT_ORD_TESO as ULT_ORD_TESO ");
    PAN_DISTINTE.SetQuery(PPQRY_N5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  N04 A ");
    PAN_DISTINTE.SetQuery(PPQRY_N5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DISTINTE.SetQuery(PPQRY_N5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_N5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_N5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_N5, 5, SQL, -1, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_N5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINTE.SetMasterTable(0, "N04");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINTE.Status() == 2)
    {
      int oldListQBE = PAN_DISTINTE.iUseListQBE;
      PAN_DISTINTE.iUseListQBE = 0;
      PAN_DISTINTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINTE.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINTE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MOVIMENTI) PAN_MOVIMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_ValidateRow(Cancel);
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_ValidateRow(Cancel);
    if (SrcObj == PAN_MOVIMENTI) PAN_MOVIMENTI_ValidateRow(Cancel);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_DynamicProperties();
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_DynamicProperties();
    if (SrcObj == PAN_MOVIMENTI) PAN_MOVIMENTI_DynamicProperties();
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MOVIMENTI) PAN_MOVIMENTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_OnChangeRow();
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
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_AfterFind(CmdFind);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PROTOCOLLO) PAN_PROTOCOLLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_REGISTRAZIVA) PAN_REGISTRAZIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_MOVIMENTI) PAN_MOVIMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NEWTABBEVIEW) TAB_NEWTABBEVIEW_Click(PreviousPage, Cancel);
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
