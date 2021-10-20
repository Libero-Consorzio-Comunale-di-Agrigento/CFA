// **********************************************
// Presa In Carico Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PresaInCaricoProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BOZZEDIVARIA_BOZZAVARIAID = 0;
  private static int PFL_BOZZEDIVARIA_DESCRIZIONE1 = 1;
  private static int PFL_BOZZEDIVARIA_URGENTE1 = 2;
  private static int PFL_BOZZEDIVARIA_DATALIMITE = 3;
  private static int PFL_BOZZEDIVARIA_ESERCIZIO = 4;
  private static int PFL_BOZZEDIVARIA_UTENTEINSERI = 5;
  private static int PFL_BOZZEDIVARIA_DATAINSERIME = 6;
  private static int PFL_BOZZEDIVARIA_UTENTULTIAGG = 7;
  private static int PFL_BOZZEDIVARIA_DATAULTIMAGG = 8;

  private static int PPQRY_POLBOZZEVAR1 = 0;


  IDPanel PAN_BOZZEDIVARIA;
  private static int PFL_PAR_DETTAGPROPOS = 0;
  private static int PFL_PAR_PANEL = 1;
  private static int PFL_PAR_PANEL2 = 2;

  private static int PPQRY_PAR97 = 0;


  IDPanel PAN_PAR;
  private static int PFL_PRONONASSABO_UNITAORG = 0;
  private static int PFL_PRONONASSABO_NUMERO = 1;
  private static int PFL_PRONONASSABO_DATA = 2;
  private static int PFL_PRONONASSABO_URGENTE = 3;
  private static int PFL_PRONONASSABO_DESCRIZIONE = 4;
  private static int PFL_PRONONASSABO_NEWEXPRESSIO = 5;
  private static int PFL_PRONONASSABO_PRENDINCARIC = 6;
  private static int PFL_PRONONASSABO_PROPOSTVARID = 7;

  private static int PPQRY_PAR59 = 0;


  IDPanel PAN_PRONONASSABO;
  private static int PFL_PROASSALLBOZ_PROGRUO = 0;
  private static int PFL_PROASSALLBOZ_UNITAORG1 = 1;
  private static int PFL_PROASSALLBOZ_NUMERO1 = 2;
  private static int PFL_PROASSALLBOZ_DATA1 = 3;
  private static int PFL_PROASSALLBOZ_URGENTE2 = 4;
  private static int PFL_PROASSALLBOZ_DESCRIZIONE2 = 5;
  private static int PFL_PROASSALLBOZ_TOGLI = 6;
  private static int PFL_PROASSALLBOZ_PROPOSTVARI1 = 7;

  private static int PPQRY_PAR98 = 0;


  IDPanel PAN_PROASSALLBOZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR57(IMDB);
    Init_TBL_PAR2(IMDB);
    //
    //
    Init_PQRY_POLBOZZEVAR1(IMDB);
    Init_PQRY_PAR97(IMDB);
    Init_PQRY_PAR97_RS(IMDB);
    Init_PQRY_PAR98(IMDB);
    Init_PQRY_PAR59(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR57, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR57, "TBL_PAR57");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR57,IMDBDef3.FLD_PAR57_ROWNAMDETPRO, "ROWNAMDETPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR57,IMDBDef3.FLD_PAR57_ROWNAMDETPRO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR57, 0);
  }

  private static void Init_TBL_PAR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR2, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR2, "TBL_PAR2");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR2,IMDBDef3.FLD_PAR2_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR2,IMDBDef3.FLD_PAR2_ROWNAMNUMPRO,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR2, 0);
  }

  private static void Init_PQRY_POLBOZZEVAR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLBOZZEVAR1, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLBOZZEVAR1, "PQRY_POLBOZZEVAR1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID, "BOZZA_VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_URGENTE, "URGENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_URGENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_LIMITE_PROPOSTE, "DATA_LIMITE_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_LIMITE_PROPOSTE,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR1,IMDBDef12.PQSL_POLBOZZEVAR1_DATA_ULTIMO_AGG,8,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLBOZZEVAR1, 0);
  }

  private static void Init_PQRY_PAR97(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR97, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR97, "PQRY_PAR97");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR97,IMDBDef12.PQSL_PAR97_ROWNAMDETPRO, "ROWNAMDETPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR97,IMDBDef12.PQSL_PAR97_ROWNAMDETPRO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR97, 0);
  }

  private static void Init_PQRY_PAR97_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR97_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR97_RS, "PQRY_PAR97_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR97_RS,IMDBDef12.PQSL_PAR97_ROWNAMDETPRO, "ROWNAMDETPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR97_RS,IMDBDef12.PQSL_PAR97_ROWNAMDETPRO,5,2,0);
  }

  private static void Init_PQRY_PAR98(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR98, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR98, "PQRY_PAR98");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_NUM_PROPOSTA, "NUM_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_NUM_PROPOSTA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_URGENTE, "URGENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_URGENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_ROWNAMEDESCR,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_PROPOSTA_VAR_ID, "PROPOSTA_VAR_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_PROPOSTA_VAR_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR98,IMDBDef12.PQSL_PAR98_ROWNAMUNIORG,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR98, 0);
  }

  private static void Init_PQRY_PAR59(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR59, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR59, "PQRY_PAR59");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_PROGR_UNITA_ORGANIZZATIVA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_NUM_PROPOSTA, "NUM_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_NUM_PROPOSTA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_URGENTE, "URGENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_URGENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_ROWNAMNEWEXP, "ROWNAMNEWEXP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_ROWNAMNEWEXP,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_PROPOSTA_VAR_ID, "PROPOSTA_VAR_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR59,IMDBDef12.PQSL_PAR59_PROPOSTA_VAR_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR59, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PresaInCaricoProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public PresaInCaricoProposte()
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
    FormIdx = MyGlb.FRM_PRESINCARPRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "79B17267-0170-4100-8795-0CC81509B355";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1240;
    DesignHeight = 530;
    set_Caption(new IDVariant("Presa In Carico Proposte"));
    //
    Frames = new AFrame[7];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1240;
    Frames[1].Height = 504;
    Frames[1].FormFactor = 0.529032;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 656;
    Frames[2].Height = 504;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.333333;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 656;
    Frames[3].Height = 168;
    Frames[3].Caption = "Bozze Di Variazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 168;
    PAN_BOZZEDIVARIA = new IDPanel(w, this, 3, "PAN_BOZZEDIVARIA");
    Frames[3].Content = PAN_BOZZEDIVARIA;
    PAN_BOZZEDIVARIA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOZZEDIVARIA.VS = MainFrm.VisualStyleList;
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2BC552E9-5B35-4440-9487-A7E1B9351871");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 368, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOZZEDIVARIA.InitStatus = 1;
    PAN_BOZZEDIVARIA_Init();
    PAN_BOZZEDIVARIA_InitFields();
    PAN_BOZZEDIVARIA_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 656;
    Frames[4].Height = 336;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Par";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 336;
    PAN_PAR = new IDPanel(w, this, 4, "PAN_PAR");
    Frames[4].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C3C572A7-8D1D-4D4C-8C97-CACE3750C91A");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 584;
    Frames[5].Height = 504;
    Frames[5].Caption = "Proposte Non Associate A Bozza";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 504;
    PAN_PRONONASSABO = new IDPanel(w, this, 5, "PAN_PRONONASSABO");
    Frames[5].Content = PAN_PRONONASSABO;
    PAN_PRONONASSABO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PRONONASSABO.VS = MainFrm.VisualStyleList;
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 504-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "361FF26F-DD91-4351-A49A-212C9CD54188");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 8, 348, 376, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PRONONASSABO.InitStatus = 2;
    PAN_PRONONASSABO_Init();
    PAN_PRONONASSABO_InitFields();
    PAN_PRONONASSABO_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    PAN_PAR.SetSubFrame(PFL_PAR_PANEL2,6);
    Frames[6].set_SubFrame(true);
    Frames[6].Caption = "Proposte Associate Alla Bozza";
    Frames[6].Parent = this;
    PAN_PROASSALLBOZ = new IDPanel(w, this, 6, "PAN_PROASSALLBOZ");
    Frames[6].Content = PAN_PROASSALLBOZ;
    PAN_PROASSALLBOZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROASSALLBOZ.VS = MainFrm.VisualStyleList;
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7BA4F1B4-36C9-4F31-8356-186886165732");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 380, 208, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 28);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROASSALLBOZ.InitStatus = 2;
    PAN_PROASSALLBOZ_Init();
    PAN_PROASSALLBOZ_InitFields();
    PAN_PROASSALLBOZ_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_CSFA+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI55+BaseCmdSetIdx, "M" + (MyGlb.CMD_CSFA+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGLBOZZA+BaseCmdLinIdx)
      {
        ApriDettagliBozza();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CSFA1+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI81+BaseCmdSetIdx, "M" + (MyGlb.CMD_CSFA1+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGPROPO1+BaseCmdLinIdx)
      {
        ApriDettagliDellaProposta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CS2+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI82+BaseCmdSetIdx, "M" + (MyGlb.CMD_CS2+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGPROPO2+BaseCmdLinIdx)
      {
        ApriDettagliDellaProposta1();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR57, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PRESINCARPRO_PAR97();
      }
      PAN_BOZZEDIVARIA.UpdatePanel(MainFrm);
      PAN_PAR.UpdatePanel(MainFrm);
      PAN_PROASSALLBOZ.UpdatePanel(MainFrm);
      PAN_PRONONASSABO.UpdatePanel(MainFrm);
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
    return (obj instanceof PresaInCaricoProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PresaInCaricoProposte.class.getName() : (Glb.ClassWithPackage(PresaInCaricoProposte.class) ? PresaInCaricoProposte.class.getName().substring(PresaInCaricoProposte.class.getPackage().getName().length() + 1) : PresaInCaricoProposte.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Presa In Carico
  // **********************************************************************
  public int PresaInCarico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARIDDAPASSA = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      v_ERR = (new IDVariant("Errore. Non è stata selezionata nessuna proposta", IDVariant.STRING));
      // 
      // Presa In Carico Body
      // Procedure Body
      // 
      v_VARIDDAPASSA = (new IDVariant(""));
      if (new IDVariant(PAN_BOZZEDIVARIA.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
        v_ERROR = (new IDVariant("Errore. Bozza non salvata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERROR); 
        return 0;
      }
      // 
      // -----------------------------MULTIPLE SELECTION---
      // --------------------------
      // 
      if ((new IDVariant(PAN_PRONONASSABO.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_COUNTSELECTE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ERRORI = new IDVariant(0,IDVariant.STRING);
        v_ERRORI = (new IDVariant(""));
        v_COUNTSELECTE = (new IDVariant(0));
        v_COUNT = (new IDVariant(1));
        C5 = PAN_PRONONASSABO.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_PRONONASSABO.GotoFirst();
        while (!PAN_PRONONASSABO.RSEOF())
        {
          if (PAN_PRONONASSABO.IsRowSelected(v_COUNT.intValue()))
          {
            v_COUNTSELECTE = IDL.Add(v_COUNTSELECTE, (new IDVariant(1)));
            v_VARIDDAPASSA = IDL.Add(IDL.Add(v_VARIDDAPASSA, IDL.ToString(C5.Get("PROPOSTA_VAR_ID"))), (new IDVariant("@")));
          }
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          PAN_PRONONASSABO.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
        if (v_COUNTSELECTE.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.POLASSOCIABOZZA(IMDB.Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID, 0), v_VARIDDAPASSA, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          PAN_PRONONASSABO.PanelCommand(Glb.PCM_REQUERY);
          PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      else
      {
        // 
        // -+-------------- NO MULTIPLE SELECTION------------
        // --
        // 
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
        // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR59, IMDBDef12.PQSL_PAR59_PROPOSTA_VAR_ID, 0)))
        // {
        // }
        // MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        // MainFrm.Cf4armDBObject.POLASSOCIABOZZA(GetProposteSelected(), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR59, IMDBDef12.PQSL_PAR59_PROPOSTA_VAR_ID, 0)), (new IDVariant("@"))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        // if (!(MainFrm.Controllaestampamessaggioerrore()))
        // {
          // PAN_PRONONASSABO.PanelCommand(Glb.PCM_REQUERY);
          // PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_REQUERY);
        // }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "PresaInCarico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Get Proposte Selected
  // **********************************************************************
  public IDVariant GetProposteSelected ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Proposte Selected Body
      // Procedure Body
      // 
      return new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID, 0),IDVariant.INTEGER);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "GetProposteSelected", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Togli Presa
  // **********************************************************************
  public int TogliPresa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARIDDAPASSA = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      v_ERR = (new IDVariant("Errore. Non è stata selezionata nessuna proposta", IDVariant.STRING));
      // 
      // Togli Presa Body
      // Procedure Body
      // 
      v_VARIDDAPASSA = (new IDVariant(""));
      if (new IDVariant(PAN_BOZZEDIVARIA.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
        v_ERROR = (new IDVariant("Errore. Bozza non salvata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERROR); 
        return 0;
      }
      // 
      // -----------------------------MULTIPLE SELECTION---
      // --------------------------
      // 
      if ((new IDVariant(PAN_PROASSALLBOZ.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_COUNTSELECTE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ERRORI = new IDVariant(0,IDVariant.STRING);
        v_ERRORI = (new IDVariant(""));
        v_COUNTSELECTE = (new IDVariant(0));
        v_COUNT = (new IDVariant(1));
        C5 = PAN_PROASSALLBOZ.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_PROASSALLBOZ.GotoFirst();
        while (!PAN_PROASSALLBOZ.RSEOF())
        {
          if (PAN_PROASSALLBOZ.IsRowSelected(v_COUNT.intValue()))
          {
            v_COUNTSELECTE = IDL.Add(v_COUNTSELECTE, (new IDVariant(1)));
            v_VARIDDAPASSA = IDL.Add(IDL.Add(v_VARIDDAPASSA, IDL.ToString(C5.Get("PROPOSTA_VAR_ID"))), (new IDVariant("@")));
          }
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          PAN_PROASSALLBOZ.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
        if (v_COUNTSELECTE.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.POLDISSOCIABOZZA(GetProposteSelected(), v_VARIDDAPASSA, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          PAN_PRONONASSABO.PanelCommand(Glb.PCM_REQUERY);
          PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      else
      {
        // 
        // -+-------------- NO MULTIPLE SELECTION------------
        // --
        // 
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
        // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR98, IMDBDef12.PQSL_PAR98_PROPOSTA_VAR_ID, 0)))
        // {
        // }
        // MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        // MainFrm.Cf4armDBObject.POLDISSOCIABOZZA(GetProposteSelected(), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR98, IMDBDef12.PQSL_PAR98_PROPOSTA_VAR_ID, 0)), (new IDVariant("@"))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        // if (!(MainFrm.Controllaestampamessaggioerrore()))
        // {
          // PAN_PRONONASSABO.PanelCommand(Glb.PCM_REQUERY);
          // PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_REQUERY);
        // }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "TogliPresa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dettagli Bozza
  // **********************************************************************
  public int ApriDettagliBozza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Bozza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_ROWNAMBOVAID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_DETTBOZZPROP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ApriDettagliBozza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dettagli Della Proposta
  // **********************************************************************
  public int ApriDettagliDellaProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Della Proposta Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_ROWNAMEVARID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_PAR98, IMDBDef12.PQSL_PAR98_PROPOSTA_VAR_ID, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DETTBOZZPROP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ApriDettagliDellaProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dettagli Della Proposta 1
  // **********************************************************************
  public int ApriDettagliDellaProposta1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dettagli Della Proposta 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_ROWNAMEVARID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_PAR59, IMDBDef12.PQSL_PAR59_PROPOSTA_VAR_ID, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_DETTBOZZPROP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ApriDettagliDellaProposta1", _e);
      return -1;
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
    IDVariant v_CAPTIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAP2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAP3 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTIO = (new IDVariant("Presa in carico Proposte", IDVariant.STRING));
      v_CAP2 = (new IDVariant("Proposte associate alla Bozza", IDVariant.STRING));
      v_CAP3 = (new IDVariant("Proposte non associate a Bozza", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR57, IMDBDef3.FLD_PAR57_ROWNAMDETPRO, 0, (new IDVariant("NO")));
      PAN_PROASSALLBOZ.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PROASSALLBOZ.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PROASSALLBOZ.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_BOZZEDIVARIA.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_PAR.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_PROASSALLBOZ.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_PRONONASSABO.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_BOZZEDIVARIA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      Frames[PAN_PROASSALLBOZ.FrIndex].set_Caption(new IDVariant(v_CAP2).stringValue());
      Frames[PAN_PRONONASSABO.FrIndex].set_Caption(new IDVariant(v_CAP3).stringValue());
      PAN_PRONONASSABO.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PRONONASSABO.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PRONONASSABO.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PRONONASSABO.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BOZZEDIVARIA.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PROASSALLBOZ.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      MainFrm.CmdObj.set_SuppressMenu((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Di Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOZZEDIVARIA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BOZZEDIVARIA);
      // 
      // Bozze Di Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_BOZZEDIVARIA.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEDIVARIA_DESCRIZIONE1,(new IDVariant(PAN_BOZZEDIVARIA.FieldText(PFL_BOZZEDIVARIA_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "BozzeDiVariazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Di Variazione Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEDIVARIA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Di Variazione Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_DATA_INSERIMENTO, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "BozzeDiVariazioneBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Di Variazione Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEDIVARIA_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Di Variazione Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR1, IMDBDef12.PQSL_POLBOZZEVAR1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "BozzeDiVariazioneBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Par On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAR);
      // 
      // Par On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR97, IMDBDef12.PQSL_PAR97_ROWNAMDETPRO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PANEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROASSALLBOZ.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PANEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PANEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROASSALLBOZ.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PANEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ParOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Proposte Non Associate A Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PRONONASSABO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PRONONASSABO);
      // 
      // Proposte Non Associate A Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PRONONASSABO.set_ToolTip(Glb.OBJ_FIELD,PFL_PRONONASSABO_DESCRIZIONE,(new IDVariant(PAN_PRONONASSABO.FieldText(PFL_PRONONASSABO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ProposteNonAssociateABozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Proposte Associate Alla Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROASSALLBOZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROASSALLBOZ);
      // 
      // Proposte Associate Alla Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROASSALLBOZ.set_ToolTip(Glb.OBJ_FIELD,PFL_PROASSALLBOZ_DESCRIZIONE2,(new IDVariant(PAN_PROASSALLBOZ.FieldText(PFL_PROASSALLBOZ_DESCRIZIONE2))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PresaInCaricoProposte", "ProposteAssociateAllaBozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PRESINCARPRO_PAR97() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR97_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR57, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR57, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR97_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR97_RS, 0, IMDBDef3.TBL_PAR57, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR97_RS, 0, 0, IMDBDef3.TBL_PAR57, IMDBDef3.FLD_PAR57_ROWNAMDETPRO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR57, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR57, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR57, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR97_RS, 0);
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
  private void PAN_BOZZEDIVARIA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BOZZEDIVARIA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOZZEDIVARIA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOZZEDIVARIA, Cancel);
    // Stub
  }

  private void PAN_BOZZEDIVARIA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BOZZEDIVARIA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOZZEDIVARIA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOZZEDIVARIA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PRONONASSABO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PRONONASSABO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PRONONASSABO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PRONONASSABO, Cancel);
    // Stub
  }

  private void PAN_PRONONASSABO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PRONONASSABO_PRENDINCARIC)
    {
      this.IdxPanelActived = this.PAN_PRONONASSABO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      PresaInCarico();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PRONONASSABO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PRONONASSABO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PRONONASSABO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PROASSALLBOZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROASSALLBOZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROASSALLBOZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROASSALLBOZ, Cancel);
    // Stub
  }

  private void PAN_PROASSALLBOZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PROASSALLBOZ_TOGLI)
    {
      this.IdxPanelActived = this.PAN_PROASSALLBOZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      TogliPresa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PROASSALLBOZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROASSALLBOZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROASSALLBOZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOZZEDIVARIA_Init()
  {

    PAN_BOZZEDIVARIA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOZZEDIVARIA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BOZZEDIVARIA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, "D8084696-2ABC-459D-AC51-50CB205D2C0C");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, "BOZZA VARIAZIONE ID");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, "5B0AF062-16BE-4773-B69B-1FB63BB9B2E5");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, "Descrizione");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, "D18FF266-983B-407A-9A4D-8E9DA0656E58");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, "Urgente");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, "6FA7BBA8-2EF9-476E-BEBB-1E532A356A8E");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, "Data Limite");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, "0E3F31F1-BD84-4D5D-A0E8-41F31E207F67");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, "ESERCIZIO");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, "AED06BB4-3D43-437B-B590-7753A83FC23A");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, "341B5747-A95C-4DF2-AB20-471CD1F68D9D");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, "67605D37-B967-4BCC-86F2-5D5BEE4224AD");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEDIVARIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, "F930B30E-D362-4C25-99AF-91F2812DD221");
    PAN_BOZZEDIVARIA.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_BOZZEDIVARIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, "");
    PAN_BOZZEDIVARIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEDIVARIA.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BOZZEDIVARIA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_LIST, "BOZZA VARIAZIONE ID");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_BOZZAVARIAID, MyGlb.PANEL_FORM, "BOZ. VARIAZIONE ID");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_BOZZAVARIAID, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_BOZZAVARIAID, PPQRY_POLBOZZEVAR1, "A.BOZZA_VARIAZIONE_ID", "BOZZA_VARIAZIONE_ID", 3, 10, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 4, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_DESCRIZIONE1, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_DESCRIZIONE1, PPQRY_POLBOZZEVAR1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_LIST, 236, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_LIST, "Urgente");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_FORM, 4, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_URGENTE1, MyGlb.PANEL_FORM, "Urgente");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_URGENTE1, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_URGENTE1, PPQRY_POLBOZZEVAR1, "A.URGENTE", "URGENTE", 5, 2, 0, -13997);
    PAN_BOZZEDIVARIA.SetValueListItem(PFL_BOZZEDIVARIA_URGENTE1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEDIVARIA.SetValueListItem(PFL_BOZZEDIVARIA_URGENTE1, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_LIST, 292, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_LIST, 128);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_LIST, "Data Limite");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_FORM, 4, 64, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_FORM, 128);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATALIMITE, MyGlb.PANEL_FORM, "Data Limite");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_DATALIMITE, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_DATALIMITE, PPQRY_POLBOZZEVAR1, "A.DATA_LIMITE_PROPOSTE", "DATA_LIMITE_PROPOSTE", 6, 19, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_LIST, 288, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 64, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_ESERCIZIO, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_ESERCIZIO, PPQRY_POLBOZZEVAR1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 88, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_UTENTEINSERI, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_UTENTEINSERI, PPQRY_POLBOZZEVAR1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 112, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_DATAINSERIME, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_DATAINSERIME, PPQRY_POLBOZZEVAR1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 136, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_UTENTULTIAGG, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_UTENTULTIAGG, PPQRY_POLBOZZEVAR1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_BOZZEDIVARIA.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 160, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEDIVARIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_BOZZEDIVARIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEDIVARIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEDIVARIA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_BOZZEDIVARIA.SetFieldPage(PFL_BOZZEDIVARIA_DATAULTIMAGG, -1, -1);
    PAN_BOZZEDIVARIA.SetFieldPanel(PFL_BOZZEDIVARIA_DATAULTIMAGG, PPQRY_POLBOZZEVAR1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
  }

  private void PAN_BOZZEDIVARIA_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOZZEDIVARIA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BOZZEDIVARIA.SetIMDB(IMDB, "PQRY_POLBOZZEVAR1", true);
    PAN_BOZZEDIVARIA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as BOZZA_VARIAZIONE_ID, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.URGENTE as URGENTE, ");
    SQL.append("  A.DATA_LIMITE_PROPOSTE as DATA_LIMITE_PROPOSTE, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_BOZZE_VARIAZIONE A ");
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    SQL.append("where (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append("and   ((B.VARIAZIONE_ID IS NULL)) ");
    SQL.append("and   (B.COD_REC = 2) ");
    SQL.append(")) OR NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT C ");
    SQL.append("where (C.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append("and   (C.COD_REC = 2) ");
    SQL.append(")))) ");
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID ");
    PAN_BOZZEDIVARIA.SetQuery(PPQRY_POLBOZZEVAR1, 5, SQL, -1, "");
    PAN_BOZZEDIVARIA.SetQueryDB(PPQRY_POLBOZZEVAR1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEDIVARIA.SetMasterTable(0, "POL_BOZZE_VARIAZIONE");
    PAN_BOZZEDIVARIA.AddToSortList(PFL_BOZZEDIVARIA_BOZZAVARIAID, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOZZEDIVARIA.Status() == 2)
    {
      int oldListQBE = PAN_BOZZEDIVARIA.iUseListQBE;
      PAN_BOZZEDIVARIA.iUseListQBE = 0;
      PAN_BOZZEDIVARIA.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOZZEDIVARIA.PanelCommand(Glb.PCM_FIND);
      PAN_BOZZEDIVARIA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, "E0853084-7396-46AB-B4BA-D5BC63697D16");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, "Dettaglio Proposte");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, "CCF9B4C9-37A2-42EF-8D6D-C5E482362E0A");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, "2098EA88-9437-4242-AFA1-FADAB7BAB80A");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_LIST, 100);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_LIST, "Dett. Prop.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_FORM, 100);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGPROPOS, MyGlb.PANEL_FORM, "Dett. Proposte");
    PAN_PAR.SetFieldPage(PFL_PAR_DETTAGPROPOS, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DETTAGPROPOS, PPQRY_PAR97, "A.ROWNAMDETPRO", "ROWNAMDETPRO", 5, 2, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGPROPOS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGPROPOS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_LIST, 8, 28, 412, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_LIST, 18);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_FORM, 0, 8, 524, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PANEL, MyGlb.PANEL_FORM, 24);
    PAN_PAR.SetFieldPage(PFL_PAR_PANEL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_PANEL, -1, "", "PANEL", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_LIST, 8, 28, 440, 272, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_LIST, 20);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_FORM, 0, 8, 528, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PANEL2, MyGlb.PANEL_FORM, 24);
    PAN_PAR.SetFieldPage(PFL_PAR_PANEL2, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_PANEL2, -1, "", "PANEL2", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR97", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR97, IMDBDef12.PQRY_PAR97_RS, IMDBDef3.TBL_PAR57);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DETTAGPROPOS, IMDBDef3.FLD_PAR57_ROWNAMDETPRO);
    PAN_PAR.SetMasterTable(0, "PAR57");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PROASSALLBOZ_Init()
  {

    PAN_PROASSALLBOZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROASSALLBOZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROASSALLBOZ.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, "A3413BB8-C63D-4EF2-A52A-CA7E7430F9ED");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, "Progr uo");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, 0, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, "6CD894D8-C446-4365-B559-4DC303F13A6B");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, "Unità Org");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, "6C774B3A-2514-41BB-BDB4-BB24A1C2AA33");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, "Numero");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, "8BA69587-B46D-4489-BDF2-BF966B07E22A");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, "Data");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, "BA7F3DE9-CCA3-4EA7-831D-619A43039C79");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, "Urgente");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.VIS_CHECKSTYLE);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, "50C182E5-96F0-4B5B-A2A1-D6149617EEDF");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, "Descrizione");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, "EDA885DB-779B-44F4-8C51-BEEAC8FA0BF5");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, "Togli Presa in Carico");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.VIS_STATICBUTTON);
    PAN_PROASSALLBOZ.SetImage(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, 0, "button_large.GIF", false);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROASSALLBOZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, "ADE922F6-43CE-4981-9B33-29D9A76A900C");
    PAN_PROASSALLBOZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, "PROPOSTA VAR ID");
    PAN_PROASSALLBOZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, "");
    PAN_PROASSALLBOZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROASSALLBOZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_PROASSALLBOZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_LIST, 0, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_LIST, 164);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_LIST, "Progr uo");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_FORM, 4, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_FORM, 164);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROGRUO, MyGlb.PANEL_FORM, "Progr uo");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_PROGRUO, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_PROGRUO, PPQRY_PAR98, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_LIST, 0, 32, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_LIST, 56);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_LIST, "Unità Org");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_FORM, 56);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_UNITAORG1, MyGlb.PANEL_FORM, "Un. Org");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_UNITAORG1, -1, -1);
    PAN_PROASSALLBOZ.SetFieldUnbound(PFL_PROASSALLBOZ_UNITAORG1, true);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_UNITAORG1, PPQRY_PAR98, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "ROWNAMUNIORG", 5, 99, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_LIST, 76, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_LIST, 88);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_LIST, "Numero");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_FORM, 4, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_FORM, 88);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_NUMERO1, MyGlb.PANEL_FORM, "Numero");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_NUMERO1, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_NUMERO1, PPQRY_PAR98, "A.NUM_PROPOSTA", "NUM_PROPOSTA", 1, 8, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_LIST, 132, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_LIST, 36);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_DATA1, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_DATA1, PPQRY_PAR98, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_LIST, 204, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_LIST, 56);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_LIST, "Urgente");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_FORM, 4, 76, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_FORM, 56);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_URGENTE2, MyGlb.PANEL_FORM, "Urgente");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_URGENTE2, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_URGENTE2, PPQRY_PAR98, "A.URGENTE", "URGENTE", 5, 2, 0, -13997);
    PAN_PROASSALLBOZ.SetValueListItem(PFL_PROASSALLBOZ_URGENTE2, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROASSALLBOZ.SetValueListItem(PFL_PROASSALLBOZ_URGENTE2, (new IDVariant()), "Null", "", "", -1);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_LIST, 260, 32, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_LIST, 64);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 100, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_FORM, 64);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descr.");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_DESCRIZIONE2, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_DESCRIZIONE2, PPQRY_PAR98, "A.DESCRIZIONE", "ROWNAMEDESCR", 5, 200, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_LIST, 0, 224, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_LIST, 0);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_FORM, 4, 220, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_FORM, 0);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_TOGLI, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_TOGLI, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_TOGLI, -1, "", "TOGLI", 0, 0, 0, -13997);
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_LIST, 376, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_LIST, 100);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_LIST, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_LIST, "PROP. VAR ID");
    PAN_PROASSALLBOZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROASSALLBOZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_FORM, 100);
    PAN_PROASSALLBOZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_FORM, 1);
    PAN_PROASSALLBOZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROASSALLBOZ_PROPOSTVARI1, MyGlb.PANEL_FORM, "PROP. VAR ID");
    PAN_PROASSALLBOZ.SetFieldPage(PFL_PROASSALLBOZ_PROPOSTVARI1, -1, -1);
    PAN_PROASSALLBOZ.SetFieldPanel(PFL_PROASSALLBOZ_PROPOSTVARI1, PPQRY_PAR98, "A.PROPOSTA_VAR_ID", "PROPOSTA_VAR_ID", 3, 10, 0, -13997);
  }

  private void PAN_PROASSALLBOZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROASSALLBOZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROASSALLBOZ.SetIMDB(IMDB, "PQRY_PAR98", true);
    PAN_PROASSALLBOZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.NUM_PROPOSTA as NUM_PROPOSTA, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.URGENTE as URGENTE, ");
    SQL.append("  A.DESCRIZIONE as ROWNAMEDESCR, ");
    SQL.append("  A.PROPOSTA_VAR_ID as PROPOSTA_VAR_ID, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as ROWNAMUNIORG ");
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR A, ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.PROPOSTA_VAR_ID = A.PROPOSTA_VAR_ID) ");
    SQL.append("and   (B.COD_REC = 2) ");
    SQL.append("and   (B.BOZZA_VARIAZIONE_ID = ~~PQRY_POLBOZZEVAR1.BOZZA_VARIAZIONE_ID~~) ");
    SQL.append("and   ((B.STATO IS NULL)) ");
    SQL.append("and   ((POL_GET_VAR_DETT_MODIF_2(B.PROPOSTA_VAR_DETT_ID) IS NULL)) ");
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROASSALLBOZ.SetQuery(PPQRY_PAR98, 5, SQL, -1, "");
    PAN_PROASSALLBOZ.SetQueryDB(PPQRY_PAR98, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROASSALLBOZ.SetMasterTable(0, "POL_PROPOSTE_VAR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROASSALLBOZ.Status() == 2)
    {
      int oldListQBE = PAN_PROASSALLBOZ.iUseListQBE;
      PAN_PROASSALLBOZ.iUseListQBE = 0;
      PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROASSALLBOZ.PanelCommand(Glb.PCM_FIND);
      PAN_PROASSALLBOZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PRONONASSABO_Init()
  {

    PAN_PRONONASSABO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PRONONASSABO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PRONONASSABO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, "320B316D-AC81-4414-85B6-32FC2DFE8663");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, "Unità Org.");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.VIS_NORMALFIELDS);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, "D389199A-8002-47BD-802E-3BB71417EED0");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, "Numero");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, "83D45739-2716-4393-B14E-391AE23066E2");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, "Data");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, "91C0EFFF-5E28-44AC-8E6A-221E2590AF70");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, "Urgente");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, "942682C1-A6FE-4083-A165-0098B81E468D");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, "Descrizione");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, "AC1C2676-5FBF-4077-BE80-8D40A85F9B58");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, "New Expression");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, "E0EE3E9A-D795-4E42-8EF1-A3D930091A49");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, "Prendi in Carico");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.VIS_STATICBUTTON);
    PAN_PRONONASSABO.SetImage(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, 0, "button_large.GIF", false);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PRONONASSABO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, "A844600A-E864-4EBA-B365-B6DC0CF3930B");
    PAN_PRONONASSABO.set_Header(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, "PROPOSTA VAR ID");
    PAN_PRONONASSABO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, "");
    PAN_PRONONASSABO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PRONONASSABO.SetFlags(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_PRONONASSABO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_LIST, 0, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_LIST, 164);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_LIST, "Unità Org.");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_FORM, 4, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_FORM, 164);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_UNITAORG, MyGlb.PANEL_FORM, "Unità Org.");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_UNITAORG, -1, -1);
    PAN_PRONONASSABO.SetFieldUnbound(PFL_PRONONASSABO_UNITAORG, true);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_UNITAORG, PPQRY_PAR59, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "PROGR_UNITA_ORGANIZZATIVA", 5, 99, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_LIST, 68, 44, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_LIST, 88);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_FORM, 4, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_FORM, 88);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_NUMERO, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_NUMERO, PPQRY_PAR59, "A.NUM_PROPOSTA", "NUM_PROPOSTA", 1, 8, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_LIST, 116, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_DATA, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_DATA, PPQRY_PAR59, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_LIST, 180, 44, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_LIST, 56);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_LIST, "Urgente");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_FORM, 4, 76, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_FORM, 56);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_URGENTE, MyGlb.PANEL_FORM, "Urgente");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_URGENTE, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_URGENTE, PPQRY_PAR59, "A.URGENTE", "URGENTE", 5, 2, 0, -13997);
    PAN_PRONONASSABO.SetValueListItem(PFL_PRONONASSABO_URGENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PRONONASSABO.SetValueListItem(PFL_PRONONASSABO_URGENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_LIST, 236, 44, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_DESCRIZIONE, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_DESCRIZIONE, PPQRY_PAR59, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_LIST, 2);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 136, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_FORM, 2);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expression");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_NEWEXPRESSIO, -1, -1);
    PAN_PRONONASSABO.SetFieldUnbound(PFL_PRONONASSABO_NEWEXPRESSIO, true);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_NEWEXPRESSIO, PPQRY_PAR59, "SUBSTR(A.DESCRIZIONE, 40, 8000)", "ROWNAMNEWEXP", 5, 99, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_LIST, 0, 396, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_LIST, 0);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_FORM, 12, 264, 108, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_FORM, 0);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PRENDINCARIC, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_PRENDINCARIC, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_PRENDINCARIC, -1, "", "PRENDINCARIC", 0, 0, 0, -13997);
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_LIST, 100);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_LIST, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_LIST, "PROPOSTA VAR ID");
    PAN_PRONONASSABO.SetRect(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_FORM, 4, 136, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRONONASSABO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_FORM, 100);
    PAN_PRONONASSABO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_FORM, 1);
    PAN_PRONONASSABO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRONONASSABO_PROPOSTVARID, MyGlb.PANEL_FORM, "PROP. VAR ID");
    PAN_PRONONASSABO.SetFieldPage(PFL_PRONONASSABO_PROPOSTVARID, -1, -1);
    PAN_PRONONASSABO.SetFieldPanel(PFL_PRONONASSABO_PROPOSTVARID, PPQRY_PAR59, "A.PROPOSTA_VAR_ID", "PROPOSTA_VAR_ID", 3, 10, 0, -13997);
  }

  private void PAN_PRONONASSABO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PRONONASSABO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PRONONASSABO.SetIMDB(IMDB, "PQRY_PAR59", true);
    PAN_PRONONASSABO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.NUM_PROPOSTA as NUM_PROPOSTA, ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.URGENTE as URGENTE, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 40, 8000) as ROWNAMNEWEXP, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PROPOSTA_VAR_ID as PROPOSTA_VAR_ID ");
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR A ");
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.STATO = 'C') ");
    SQL.append("and   (A.DATA <= NVL(~~PQRY_POLBOZZEVAR1.DATA_LIMITE_PROPOSTE~~, TO_DATE('2099-01-01 00:00:00','YYYY-MM-DD HH24:MI:SS'))) ");
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 2 ");
    PAN_PRONONASSABO.SetQuery(PPQRY_PAR59, 5, SQL, -1, "");
    PAN_PRONONASSABO.SetQueryDB(PPQRY_PAR59, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PRONONASSABO.SetMasterTable(0, "POL_PROPOSTE_VAR");
    PAN_PRONONASSABO.AddToSortList(PFL_PRONONASSABO_UNITAORG, true);
    PAN_PRONONASSABO.AddToSortList(PFL_PRONONASSABO_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PRONONASSABO.Status() == 2)
    {
      int oldListQBE = PAN_PRONONASSABO.iUseListQBE;
      PAN_PRONONASSABO.iUseListQBE = 0;
      PAN_PRONONASSABO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PRONONASSABO.PanelCommand(Glb.PCM_FIND);
      PAN_PRONONASSABO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROASSALLBOZ) PAN_PROASSALLBOZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PRONONASSABO) PAN_PRONONASSABO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_ValidateRow(Cancel);
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
    if (SrcObj == PAN_PROASSALLBOZ) PAN_PROASSALLBOZ_ValidateRow(Cancel);
    if (SrcObj == PAN_PRONONASSABO) PAN_PRONONASSABO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_DynamicProperties();
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
    if (SrcObj == PAN_PROASSALLBOZ) PAN_PROASSALLBOZ_DynamicProperties();
    if (SrcObj == PAN_PRONONASSABO) PAN_PRONONASSABO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROASSALLBOZ) PAN_PROASSALLBOZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PRONONASSABO) PAN_PRONONASSABO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_BOZZEDIVARIA) PAN_BOZZEDIVARIA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROASSALLBOZ) PAN_PROASSALLBOZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PRONONASSABO) PAN_PRONONASSABO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
