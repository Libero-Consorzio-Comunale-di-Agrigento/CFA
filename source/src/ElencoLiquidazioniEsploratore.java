// **********************************************
// Elenco Liquidazioni Esploratore
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoLiquidazioniEsploratore extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;

  private static int PPQRY_PARAMETRI463 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_ELENCOLIQUID_LIQUIDAZIONE = 0;
  private static int GRP_ELENCOLIQUID_IMPEGNO = 1;
  private static int GRP_ELENCOLIQUID_SUBIMPEGNO = 2;
  private static int GRP_ELENCOLIQUID_DOCUMENTO = 3;

  private static int PFL_ELENCOLIQUID_NUMEROLIQ = 0;
  private static int PFL_ELENCOLIQUID_ANNOLIQ = 1;
  private static int PFL_ELENCOLIQUID_DUALINFOLIQU = 2;
  private static int PFL_ELENCOLIQUID_CAPITOLO = 3;
  private static int PFL_ELENCOLIQUID_ARTICOLO = 4;
  private static int PFL_ELENCOLIQUID_INFO = 5;
  private static int PFL_ELENCOLIQUID_NUMEROIMP = 6;
  private static int PFL_ELENCOLIQUID_ANNOIMP = 7;
  private static int PFL_ELENCOLIQUID_INFOIMPEGNI = 8;
  private static int PFL_ELENCOLIQUID_NUMEROSUBIMP = 9;
  private static int PFL_ELENCOLIQUID_ANNOSUBIMP = 10;
  private static int PFL_ELENCOLIQUID_INFOSUBIMPEG = 11;
  private static int PFL_ELENCOLIQUID_IMPORTO = 12;
  private static int PFL_ELENCOLIQUID_INEMISS = 13;
  private static int PFL_ELENCOLIQUID_RAGIONSOCIAL = 14;
  private static int PFL_ELENCOLIQUID_NUMERODOC = 15;
  private static int PFL_ELENCOLIQUID_ANNODOC = 16;
  private static int PFL_ELENCOLIQUID_INFOFAT = 17;
  private static int PFL_ELENCOLIQUID_RIEPILOGOIVA = 18;
  private static int PFL_ELENCOLIQUID_UFFICIO = 19;
  private static int PFL_ELENCOLIQUID_SEDEDEL = 20;
  private static int PFL_ELENCOLIQUID_NUMERODEL = 21;
  private static int PFL_ELENCOLIQUID_ANNODEL = 22;
  private static int PFL_ELENCOLIQUID_UNITAPROPONE = 23;
  private static int PFL_ELENCOLIQUID_NUMEROPROPOS = 24;
  private static int PFL_ELENCOLIQUID_ANNOPROPOSTA = 25;
  private static int PFL_ELENCOLIQUID_DELIBERA = 26;
  private static int PFL_ELENCOLIQUID_PROPOSTA = 27;
  private static int PFL_ELENCOLIQUID_FINANZIAMENT = 28;
  private static int PFL_ELENCOLIQUID_FATANNOPROG = 29;
  private static int PFL_ELENCOLIQUID_FATNUMERPROG = 30;

  private static int PPQRY_VISIMPSUUOUT = 0;

  private static int PPQRY_INFO = 1;


  IDPanel PAN_ELENCOLIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI556(IMDB);
    //
    //
    Init_PQRY_VISIMPSUUOUT(IMDB);
    Init_PQRY_PARAMETRI463(IMDB);
    Init_PQRY_PARAMETRI463_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI556(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI556, 12);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI556, "TBL_PARAMETRI556");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMERUOLO, "ROWNAMERUOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMERUOLO,5,255,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMPROUNI,1,9,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEOPERA,1,9,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI556,IMDBDef6.FLD_PARAMETRI556_ROWNAMEFINAN,1,9,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI556, 0);
  }

  private static void Init_PQRY_VISIMPSUUOUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISIMPSUUOUT, 25);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISIMPSUUOUT, "PQRY_VISIMPSUUOUT");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTNULI, "VIIMUOUTNULI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTNULI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI, "VIIMUOUTANLI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUBRSEE, "VIIMUOUBRSEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIND, "VIIMUOUTLIND");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIND,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIAD, "VIIMUOUTLIAD");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIAD,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIUF, "VIIMUOUTLIUF");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIUF,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIFI, "VIIMUOUTLIFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLIFI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTUF, "VISIMPUOUTUF");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTUF,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTFI, "VISIMPUOUTFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTFI,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_INEMISS, "INEMISS");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_INEMISS,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP, "VIIMUOUTLFAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFNP, "VIIMUOUTLFNP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOUT,IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFNP,1,5,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISIMPSUUOUT, 0);
  }

  private static void Init_PQRY_PARAMETRI463(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI463, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI463, "PQRY_PARAMETRI463");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI463,IMDBDef17.PQSL_PARAMETRI463_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI463,IMDBDef17.PQSL_PARAMETRI463_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI463,IMDBDef17.PQSL_PARAMETRI463_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI463,IMDBDef17.PQSL_PARAMETRI463_ROWNAMEDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI463, 0);
  }

  private static void Init_PQRY_PARAMETRI463_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI463_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI463_RS, "PQRY_PARAMETRI463_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI463_RS,IMDBDef17.PQSL_PARAMETRI463_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI463_RS,IMDBDef17.PQSL_PARAMETRI463_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI463_RS,IMDBDef17.PQSL_PARAMETRI463_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI463_RS,IMDBDef17.PQSL_PARAMETRI463_ROWNAMEDAL,6,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoLiquidazioniEsploratore(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoLiquidazioniEsploratore()
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
    FormIdx = MyGlb.FRM_ELENLIQUESPL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EC03CED1-3387-43C6-BDED-D13C2A51813C";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 458;
    set_Caption(new IDVariant("Elenco Liquidazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 432;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12037;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ED5C8528-CA0D-40B4-92B6-43D66D297B38");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 816;
    Frames[3].Height = 380;
    Frames[3].Caption = "Elenco Liquidazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_ELENCOLIQUID = new IDPanel(w, this, 3, "PAN_ELENCOLIQUID");
    Frames[3].Content = PAN_ELENCOLIQUID;
    PAN_ELENCOLIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOLIQUID.VS = MainFrm.VisualStyleList;
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A9524C5A-6E17-44DE-800F-4A0399E4D14F");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1984, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOLIQUID.InitStatus = 1;
    PAN_ELENCOLIQUID_Init();
    PAN_ELENCOLIQUID_InitFields();
    PAN_ELENCOLIQUID_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MODIFICA+BaseCmdLinIdx)
      {
        Modifica();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI556, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENLIQUESPL_PARAMETRI463();
      }
      PAN_ELENCOLIQUID.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoLiquidazioniEsploratore);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoLiquidazioniEsploratore.class.getName() : (Glb.ClassWithPackage(ElencoLiquidazioniEsploratore.class) ? ElencoLiquidazioniEsploratore.class.getName().substring(ElencoLiquidazioniEsploratore.class.getPackage().getName().length() + 1) : ElencoLiquidazioniEsploratore.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOLIQUID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOLIQUID);
      // 
      // Elenco Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELENCOLIQUID.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOLIQUID.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_ELENCOLIQUID.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOLIQUID.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_UFFICIO,IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTUF, 0).stringValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_RAGIONSOCIAL,IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUBRSEE, 0).stringValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_FINANZIAMENT,IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTFI, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ElencoLiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Liquidazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOLIQUID_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Liquidazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ELENCOLIQUID.Freezed = (new IDVariant(0)).booleanValue();
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOLIQUID.Freezed = (new IDVariant(-1)).booleanValue();
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ELENCOLIQUID.set_Header(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_INFO, (new IDVariant("")).stringValue());
      PAN_ELENCOLIQUID.set_Header(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("")).stringValue());
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_FINANZIAMENT,IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VISIMPUOUTFI, 0).stringValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_RAGIONSOCIAL,IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUBRSEE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ElencoLiquidazioniOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOLIQUID.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCOLIQUID.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "LoadEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMERUOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMPROUNI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEFINAN, 0, new IDVariant());
  }

  // **********************************************************************
  // Apri Info Impegno
  // **********************************************************************
  public int ApriInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Sub Impegno
  // **********************************************************************
  public int ApriInfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Sub Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_NUMERO_SUBIMP, 0));
        if (IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ApriInfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
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
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTNULI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI, 0))) && IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTNULI, 0));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "Modifica", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ARTICOLO, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_ARTICOLO, 0)));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Fattura
  // **********************************************************************
  public int ApriInfoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Fattura Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFNP, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ApriInfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Liquidazione
  // **********************************************************************
  public int ApriInfoLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Liquidazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTANLI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTNULI, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "ApriInfoLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riepilogo IVA
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiepilogoIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riepilogo IVA Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFAP, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef17.PQRY_VISIMPSUUOUT, IMDBDef17.PQSL_VISIMPSUUOUT_VIIMUOUTLFNP, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniEsploratore", "RiepilogoIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENLIQUESPL_PARAMETRI463() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI463_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI556, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI556, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI463_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI463_RS, 0, IMDBDef6.TBL_PARAMETRI556, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI463_RS, 0, 0, IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI463_RS, 1, 0, IMDBDef6.TBL_PARAMETRI556, IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI556, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI556, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI556, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI463_RS, 0);
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
  private void PAN_ELENCOLIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOLIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOLIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOLIQUID, Cancel);
    // Stub
  }

  private void PAN_ELENCOLIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_DUALINFOLIQU)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoLiquidazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFO)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFOIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFOFAT)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_RIEPILOGOIVA)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RiepilogoIVA();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOLIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOLIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOLIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOLIQUID_Init()
  {

    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, "AA506D77-0D30-4EEC-94DF-6A9DFE3795F6");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, "Liquidazione");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, 771, 644, 97, 0, 0);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, 0, 70);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, 1, 13);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, 0, 4);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, 1, 4);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, "A03FA2B4-0756-4144-9610-9E27973131E3");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, "Impegno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, MyGlb.PANEL_LIST, 292, -9999, 120, 16, 0, 0);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, MyGlb.PANEL_FORM, 0, 51, 536, 649, 0, 0);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, 0, 51);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, 1, 13);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, 0, 4);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, 1, 4);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, "E0C94891-4B50-45DF-B0B7-96A55F035FCC");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, "Sub-Impegno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, MyGlb.PANEL_LIST, 412, -9999, 120, 16, 0, 0);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, MyGlb.PANEL_FORM, 0, 363, 556, 385, 0, 0);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, 0, 77);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, 1, 13);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, 0, 4);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, 1, 4);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, "FB1588A0-B1C5-4D19-BB41-59B89DD5483D");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, "Documento");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, MyGlb.PANEL_LIST, 880, -9999, 216, 16, 0, 0);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, MyGlb.PANEL_FORM, 0, 843, 608, 229, 0, 0);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, 0, 65);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, 1, 13);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, 0, 4);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, 1, 4);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_FIELD, 31);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "FB82BEF2-4CD4-42E1-99C9-9CB293BEB35F");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "Numero");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "7D98F75B-05C9-48BA-B80D-4F3DC2A6D8A8");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "Anno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, "7D40783F-0091-40E1-B386-D7D9BBF77427");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, "6E8EF34E-7A89-4451-90FE-B0F8E7D417A3");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, "Capitolo");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, "36FB4C04-564A-4E89-8D3D-17A64A841744");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, " Art.");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, "BFC4D252-A3AF-4360-A633-535722885563");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, "Info");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, "5EE431A4-7C7B-4EFD-AF22-FBF1CA271EB5");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, "Numero");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, "824D34A1-037C-494C-ABFF-B62F29233574");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, "Anno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, "42059832-E7DE-4F98-9C14-589CE7F4E650");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, "A8C615A8-8D29-404B-A1AF-E8E8D7D60E41");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, "Numero");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, "44925934-B0FD-4BAD-9DDA-101CFECBA176");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, "Anno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, "E14AA553-7567-4D90-B325-FF142F4FE266");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "E0512C56-BABF-4678-8B50-C4C4A81A6873");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "Importo");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "Importo");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, "015EBE8E-57A1-40FF-8F2B-F495FAACF9A1");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, "In emiss.");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, "7A88C24F-FA92-4593-881F-000C14BD687D");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, " Beneficiario");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "F27A237A-FC7D-45E0-9744-D0F8AB794E52");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "Numero");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, "57081264-17A8-4592-817C-7A13310BB0D4");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, "Anno");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, "3112F9D3-5207-475A-B2A5-BD4EAEB1112F");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, "Informazioni Fattura");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, "60132014-52B9-4408-84BF-8C9E92CD74DF");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, "Riepilogo IVA");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, "635BF575-9D07-4D44-A2A3-9B36EE2F878C");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, "Ufficio");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, "7D29F941-209B-4CC7-A4F5-559B0CE80DF3");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, "SEDE DEL");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, "FE8EE8CE-DFCE-487D-B4DE-13A295C3081C");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, "D834E7E1-3FFA-4695-ABE1-DDFF8A296EF0");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, "ANNO DEL");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, "8A4A65FC-CF6A-4245-BCEA-FF5E09D0EAD5");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, "704792E6-AA90-407F-9A88-B69F524481BF");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, "296B0AFC-212D-4575-8782-C7ABFBDFBCCF");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, "C51E087A-3A55-49D7-97D0-7A0244F8E5CC");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, "Delibera");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, "F7F23218-CD45-455D-9A19-680FB1F449F4");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, "Proposta");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, "7725EF95-5C19-4B49-BC0E-7D945C29F3BE");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, "Finanziamento");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, "AD49EA98-649C-4206-A6D2-7E0BB6573224");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, "FAT ANNO PROG");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, "828C4E89-59B6-42A4-BCBB-1BCEB7AB8840");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOLIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 796, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROLIQ, -1, GRP_ELENCOLIQUID_LIQUIDAZIONE);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROLIQ, PPQRY_VISIMPSUUOUT, "A.NUMERO_LIQ", "VIIMUOUTNULI", 1, 5, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 56, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 4, 820, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOLIQ, -1, GRP_ELENCOLIQUID_LIQUIDAZIONE);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOLIQ, PPQRY_VISIMPSUUOUT, "A.ANNO_LIQ", "VIIMUOUTANLI", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_LIST, 100, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_LIST, 128);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_FORM, 4, 844, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFOLIQU, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_DUALINFOLIQU, -1, GRP_ELENCOLIQUID_LIQUIDAZIONE);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_DUALINFOLIQU, PPQRY_INFO, "DECODE(~~VIIMUOUTNULI~~, to_number(NULL), NULL, 'I')", "DUALINFOLIQU", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFOLIQU, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_LIST, 120, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_CAPITOLO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_CAPITOLO, PPQRY_VISIMPSUUOUT, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_LIST, 236, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_LIST, " Art.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ARTICOLO, MyGlb.PANEL_FORM, " Art.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ARTICOLO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ARTICOLO, PPQRY_VISIMPSUUOUT, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_LIST, 268, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_FORM, 4, 1000, 592, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFO, PPQRY_INFO, "DECODE(~~CAPITOLO~~, to_number(NULL), NULL, 'I')", "DUALINFOCAP", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 292, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROIMP, -1, GRP_ELENCOLIQUID_IMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROIMP, PPQRY_VISIMPSUUOUT, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 348, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOIMP, -1, GRP_ELENCOLIQUID_IMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOIMP, PPQRY_VISIMPSUUOUT, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_LIST, 392, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_FORM, 4, 652, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOIMPEGNI, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFOIMPEGNI, -1, GRP_ELENCOLIQUID_IMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFOIMPEGNI, PPQRY_INFO, "DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')", "DUALINFOIMPE", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOIMPEGNI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 412, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 412, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROSUBIMP, -1, GRP_ELENCOLIQUID_SUBIMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROSUBIMP, PPQRY_VISIMPSUUOUT, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 468, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 388, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOSUBIMP, -1, GRP_ELENCOLIQUID_SUBIMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOSUBIMP, PPQRY_VISIMPSUUOUT, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_LIST, 512, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 700, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOSUBIMPEG, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFOSUBIMPEG, -1, GRP_ELENCOLIQUID_SUBIMPEGNO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFOSUBIMPEG, PPQRY_INFO, "DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I')", "DUAINFSUBIMP", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 532, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 4, 436, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_IMPORTO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_IMPORTO, PPQRY_VISIMPSUUOUT, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_LIST, 620, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_LIST, "In emiss.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_FORM, 4, 976, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INEMISS, MyGlb.PANEL_FORM, "In emiss.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INEMISS, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_INEMISS, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INEMISS, PPQRY_VISIMPSUUOUT, "CASE WHEN (A.ANNO_MAND IS NULL) THEN 'NO' ELSE 'SI' END", "INEMISS", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INEMISS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INEMISS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 680, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, " Beneficiario");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 748, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Benefic.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_RAGIONSOCIAL, PPQRY_VISIMPSUUOUT, "B.RAGIONE_SOCIALE_ESTESA", "VIIMUOUBRSEE", 5, 60, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 880, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 4, 868, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMERODOC, -1, GRP_ELENCOLIQUID_DOCUMENTO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMERODOC, PPQRY_VISIMPSUUOUT, "A.NUMERO_DOC", "VIIMUOUTLIND", 5, 20, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_LIST, 988, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_FORM, 4, 892, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODOC, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNODOC, -1, GRP_ELENCOLIQUID_DOCUMENTO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNODOC, PPQRY_VISIMPSUUOUT, "A.ANNO_DOC", "VIIMUOUTLIAD", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_LIST, 1052, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_FORM, 4, 1024, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFOFAT, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFOFAT, -1, GRP_ELENCOLIQUID_DOCUMENTO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFOFAT, PPQRY_INFO, "DECODE(~~VIIMUOUTLFAP~~, to_number(NULL), NULL, 'I')", "DUALINFOFAT", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFOFAT, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_LIST, 1076, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_FORM, 4, 1048, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RIEPILOGOIVA, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_RIEPILOGOIVA, -1, GRP_ELENCOLIQUID_DOCUMENTO);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_RIEPILOGOIVA, PPQRY_INFO, "DECODE(~~VIIMUOUTLFAP~~, to_number(NULL), NULL, 'F')", "DUALINFOFAT1", 5, 99, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_RIEPILOGOIVA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_LIST, 1096, 36, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_FORM, 4, 916, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_UFFICIO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_UFFICIO, PPQRY_VISIMPSUUOUT, "D.DESCRIZIONE", "VISIMPUOUTUF", 5, 60, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 1404, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_SEDEDEL, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_SEDEDEL, PPQRY_VISIMPSUUOUT, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 1444, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMERODEL, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMERODEL, PPQRY_VISIMPSUUOUT, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_LIST, 1488, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNODEL, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNODEL, PPQRY_VISIMPSUUOUT, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 1524, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_UNITAPROPONE, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_UNITAPROPONE, PPQRY_VISIMPSUUOUT, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 1632, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROPROPOS, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROPROPOS, PPQRY_VISIMPSUUOUT, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1672, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOPROPOSTA, PPQRY_VISIMPSUUOUT, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_LIST, 1404, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_DELIBERA, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_LIST, 1524, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_FORM, 60, 92, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_PROPOSTA, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_LIST, 1708, 36, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 940, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_FINANZIAMENT, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_FINANZIAMENT, PPQRY_VISIMPSUUOUT, "C.DESCRIZIONE", "VISIMPUOUTFI", 5, 200, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_FORM, 4, 1024, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANNO PROG");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_FATANNOPROG, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_FATANNOPROG, PPQRY_VISIMPSUUOUT, "A.FAT_ANNO_PROG", "VIIMUOUTLFAP", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 1048, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUMERO PROG");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_FATNUMERPROG, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_FATNUMERPROG, PPQRY_VISIMPSUUOUT, "A.FAT_NUMERO_PROG", "VIIMUOUTLFNP", 1, 5, 0, -13997);
  }

  private void PAN_ELENCOLIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I') as DUALINFOIMPE, ");
    SQL.append("  DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I') as DUAINFSUBIMP, ");
    SQL.append("  DECODE(~~VIIMUOUTNULI~~, to_number(NULL), NULL, 'I') as DUALINFOLIQU, ");
    SQL.append("  DECODE(~~CAPITOLO~~, to_number(NULL), NULL, 'I') as DUALINFOCAP, ");
    SQL.append("  DECODE(~~VIIMUOUTLFAP~~, to_number(NULL), NULL, 'I') as DUALINFOFAT, ");
    SQL.append("  DECODE(~~VIIMUOUTLFAP~~, to_number(NULL), NULL, 'F') as DUALINFOFAT1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_ELENCOLIQUID.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOLIQUID.SetMasterTable(PPQRY_INFO, "DUAL");
    PAN_ELENCOLIQUID.SetIMDB(IMDB, "PQRY_VISIMPSUUOUT", true);
    PAN_ELENCOLIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA IMP UO UT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as VIIMUOUTNULI, ");
    SQL.append("  A.ANNO_LIQ as VIIMUOUTANLI, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as VIIMUOUBRSEE, ");
    SQL.append("  A.NUMERO_DOC as VIIMUOUTLIND, ");
    SQL.append("  A.ANNO_DOC as VIIMUOUTLIAD, ");
    SQL.append("  A.UFFICIO as VIIMUOUTLIUF, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.FINANZIAMENTO as VIIMUOUTLIFI, ");
    SQL.append("  D.DESCRIZIONE as VISIMPUOUTUF, ");
    SQL.append("  C.DESCRIZIONE as VISIMPUOUTFI, ");
    SQL.append("  CASE WHEN (A.ANNO_MAND IS NULL) THEN 'NO' ELSE 'SI' END as INEMISS, ");
    SQL.append("  A.FAT_ANNO_PROG as VIIMUOUTLFAP, ");
    SQL.append("  A.FAT_NUMERO_PROG as VIIMUOUTLFNP ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  FINANZIAMENTI C, ");
    SQL.append("  T53 D, ");
    SQL.append("  IMP E ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (E.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (E.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.CODICE(+) = A.FINANZIAMENTO) ");
    SQL.append("and   (A.UFFICIO = D.CODICE(+)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMECAPIT~~ = -1 OR (A.CAPITOLO = ~~TBL_PARAMETRI556.ROWNAMECAPIT~~)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMEARTIC~~ = -1 OR (A.ARTICOLO = ~~TBL_PARAMETRI556.ROWNAMEARTIC~~)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMANNIMP~~ = -1 OR (A.ANNO_IMP = ~~TBL_PARAMETRI556.ROWNAMANNIMP~~)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMNUMIMP~~ = -1 OR (A.NUMERO_IMP = ~~TBL_PARAMETRI556.ROWNAMNUMIMP~~)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMANNSUB~~ = -1 OR (A.ANNO_SUBIMP = ~~TBL_PARAMETRI556.ROWNAMANNSUB~~)) ");
    SQL.append("and   (~~TBL_PARAMETRI556.ROWNAMNUMSUB~~ = -1 OR (A.NUMERO_SUBIMP = ~~TBL_PARAMETRI556.ROWNAMNUMSUB~~)) ");
    SQL.append("and   (((A.ANNO_LIQ = ~~TBL_DATISESSIONE.SESSIOESERCI~~) AND (~~PQRY_PARAMETRI463.ROWNAMSOLCOM~~ = 'SI')) OR ((A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) AND (~~PQRY_PARAMETRI463.ROWNAMSOLCOM~~ <> 'SI'))) ");
    SQL.append("and   (A.D_DATA_REG >= ~~PQRY_PARAMETRI463.ROWNAMEDAL~~) ");
    SQL.append("and   (((GET_RESP_UNICO_RUOLO_UO(E.PROGR_UNITA_ORGANIZZATIVA) = ~~TBL_PARAMETRI556.ROWNAMERUOLO~~) AND NOT ((~~TBL_PARAMETRI556.ROWNAMERUOLO~~ IS NULL))) OR (~~TBL_PARAMETRI556.ROWNAMERUOLO~~ IS NULL)) ");
    SQL.append("and   (NVL(E.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI556.ROWNAMPROUNI~~, NVL(E.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   ((~~TBL_PARAMETRI556.ROWNAMEOPERA~~ IS NULL) OR ~~TBL_PARAMETRI556.ROWNAMEOPERA~~ = -1 OR E.OPERA = ~~TBL_PARAMETRI556.ROWNAMEOPERA~~) ");
    SQL.append("and   ((~~TBL_PARAMETRI556.ROWNAMEFINAN~~ IS NULL) OR ~~TBL_PARAMETRI556.ROWNAMEFINAN~~ = -1 OR A.FINANZIAMENTO = ~~TBL_PARAMETRI556.ROWNAMEFINAN~~) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_VISIMPSUUOUT, 5, SQL, -1, "");
    PAN_ELENCOLIQUID.SetQueryDB(PPQRY_VISIMPSUUOUT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOLIQUID.SetMasterTable(0, "LIQ");
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_CAPITOLO, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_ARTICOLO, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_ANNOIMP, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_NUMEROIMP, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_ANNOSUBIMP, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_NUMEROSUBIMP, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_ANNOLIQ, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOLIQUID.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOLIQUID.iUseListQBE;
      PAN_ELENCOLIQUID.iUseListQBE = 0;
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOLIQUID.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "391EE4AE-A08F-4542-B130-58A2F6055C77");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "BFB04912-3FE6-461A-91D4-5113867687AB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Solo Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI463, "A.ROWNAMSOLCOM", "ROWNAMSOLCOM", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 152, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI463, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI463", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI463, IMDBDef17.PQRY_PARAMETRI463_RS, IMDBDef6.TBL_PARAMETRI556);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI556_ROWNAMSOLCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI556_ROWNAMEDAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI556");
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
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
