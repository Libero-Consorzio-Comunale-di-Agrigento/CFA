// **********************************************
// Limiti Indebitamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LimitiIndebitamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BILPRELIMIND_COMPETENZA = 0;
  private static int GRP_BILPRELIMIND_SPANPERAMUOB = 1;
  private static int GRP_BILPRELIMIND_TOTADEBICONT = 2;
  private static int GRP_BILPRELIMIND_DEBITOPOTENZ = 3;

  private static int PFL_BILPRELIMIND_ESERCIZIO = 0;
  private static int PFL_BILPRELIMIND_CALCOCOMPEP1 = 1;
  private static int PFL_BILPRELIMIND_LIVMAXSPEANN = 2;
  private static int PFL_BILPRELIMIND_LIVMAXSPANP1 = 3;
  private static int PFL_BILPRELIMIND_LIVMAXSPANP2 = 4;
  private static int PFL_BILPRELIMIND_ETICHEINTER1 = 5;
  private static int PFL_BILPRELIMIND_INTERESSI1 = 6;
  private static int PFL_BILPRELIMIND_INTERESSI1P1 = 7;
  private static int PFL_BILPRELIMIND_INTERESSI1P2 = 8;
  private static int PFL_BILPRELIMIND_ETICHEINTER2 = 9;
  private static int PFL_BILPRELIMIND_INTERESSI2 = 10;
  private static int PFL_BILPRELIMIND_INTERESSI2P1 = 11;
  private static int PFL_BILPRELIMIND_INTERESSI2P2 = 12;
  private static int PFL_BILPRELIMIND_CONTRIBUTI = 13;
  private static int PFL_BILPRELIMIND_CONTRIBUTIP1 = 14;
  private static int PFL_BILPRELIMIND_CONTRIBUTIP2 = 15;
  private static int PFL_BILPRELIMIND_INTEREESCLUS = 16;
  private static int PFL_BILPRELIMIND_INTERESCLUP1 = 17;
  private static int PFL_BILPRELIMIND_INTERESCLUP2 = 18;
  private static int PFL_BILPRELIMIND_DEBITOCONTRA = 19;
  private static int PFL_BILPRELIMIND_DEBITCONTRP1 = 20;
  private static int PFL_BILPRELIMIND_DEBITCONTRP2 = 21;
  private static int PFL_BILPRELIMIND_DEBITOAUTORI = 22;
  private static int PFL_BILPRELIMIND_DEBITAUTORP1 = 23;
  private static int PFL_BILPRELIMIND_DEBITAUTORP2 = 24;
  private static int PFL_BILPRELIMIND_ETICHEGARANZ = 25;
  private static int PFL_BILPRELIMIND_GARANZIE = 26;
  private static int PFL_BILPRELIMIND_GARANZIEP1 = 27;
  private static int PFL_BILPRELIMIND_GARANZIEP2 = 28;
  private static int PFL_BILPRELIMIND_GARANZACCANT = 29;
  private static int PFL_BILPRELIMIND_GARANACCANP1 = 30;
  private static int PFL_BILPRELIMIND_GARANACCANP2 = 31;
  private static int PFL_BILPRELIMIND_GARALIMIINDE = 32;
  private static int PFL_BILPRELIMIND_GARALIMINDP1 = 33;
  private static int PFL_BILPRELIMIND_GARALIMINDP2 = 34;
  private static int PFL_BILPRELIMIND_ETICHEELABOR = 35;

  private static int PPQRY_BILPRERIAMPR = 0;


  IDPanel PAN_BILPRELIMIND;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI667(IMDB);
    //
    //
    Init_PQRY_BILPRERIAMPR(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI667(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI667, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI667, "TBL_PARAMETRI667");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI667,IMDBDef3.FLD_PARAMETRI667_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI667, 0);
  }

  private static void Init_PQRY_BILPRERIAMPR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPRERIAMPR, 32);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPRERIAMPR, "PQRY_BILPRERIAMPR");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN, "LIV_MAX_SPESE_ANN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1, "INTERESSI_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2, "INTERESSI_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI, "CONTRIBUTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI, "INTERESSI_ESCLUSI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO, "DEBITO_CONTRATTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO, "DEBITO_AUTORIZZATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE, "GARANZIE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT, "GARANZIE_ACCANT");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB, "GARANZIE_LIMITE_INDEB");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P1, "LIV_MAX_SPESE_ANN_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1_P1, "INTERESSI_1_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2_P1, "INTERESSI_2_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI_P1, "CONTRIBUTI_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P1, "INTERESSI_ESCLUSI_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P1, "DEBITO_CONTRATTO_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P1, "DEBITO_AUTORIZZATO_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_P1, "GARANZIE_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P1, "GARANZIE_ACCANT_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P1, "GARANZIE_LIMITE_INDEB_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P2, "LIV_MAX_SPESE_ANN_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1_P2, "INTERESSI_1_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2_P2, "INTERESSI_2_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI_P2, "CONTRIBUTI_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P2, "INTERESSI_ESCLUSI_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P2, "DEBITO_CONTRATTO_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P2, "DEBITO_AUTORIZZATO_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_P2, "GARANZIE_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P2, "GARANZIE_ACCANT_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P2, "GARANZIE_LIMITE_INDEB_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CALCOLO_COMP_E_P1, "CALCOLO_COMP_E_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPRERIAMPR,IMDBDef11.PQSL_BILPRERIAMPR_CALCOLO_COMP_E_P1,5,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPRERIAMPR, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LimitiIndebitamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public LimitiIndebitamento()
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
    FormIdx = MyGlb.FRM_LIMITIINDEBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BCC24245-9A10-4FA6-9AC5-7BBB1696242B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 984;
    DesignHeight = 550;
    set_Caption(new IDVariant("Limiti Indebitamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 984;
    Frames[1].Height = 524;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Risultato Am.ne Presunto";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 524;
    PAN_BILPRELIMIND = new IDPanel(w, this, 1, "PAN_BILPRELIMIND");
    Frames[1].Content = PAN_BILPRELIMIND;
    PAN_BILPRELIMIND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILPRELIMIND.VS = MainFrm.VisualStyleList;
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 984-MyGlb.PAN_OFFS_X, 524-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A2053BCD-13FF-4949-AFD5-35CF7768C1A5");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3192, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILPRELIMIND.InitStatus = 2;
    PAN_BILPRELIMIND_Init();
    PAN_BILPRELIMIND_InitFields();
    PAN_BILPRELIMIND_InitQueries();
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
      PAN_BILPRELIMIND.UpdatePanel(MainFrm);
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
    return (obj instanceof LimitiIndebitamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LimitiIndebitamento.class.getName() : (Glb.ClassWithPackage(LimitiIndebitamento.class) ? LimitiIndebitamento.class.getName().substring(LimitiIndebitamento.class.getPackage().getName().length() + 1) : LimitiIndebitamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // BIL PREV LIM INDEB On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BILPRELIMIND_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL PREV LIM INDEB On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_CALCOLO_COMP_E_P1, 0, (new IDVariant("ACC")));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_CONTRIBUTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_CONTRATTO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_ACCANT, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPRERIAMPR, IMDBDef11.PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LimitiIndebitamento", "BILPREVLIMINDEBOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // BIL PREV LIM INDEB After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BILPRELIMIND_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL PREV LIM INDEB After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_BILPRELIMIND.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_BILPRELIMIND.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LimitiIndebitamento", "BILPREVLIMINDEBAfterFind", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_BILPRELIMIND.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILPRELIMIND.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_BILPRELIMIND.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LimitiIndebitamento", "EtichettaElabora", _e);
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
      IDVariant v_COMPETENZA = new IDVariant(0,IDVariant.STRING);
      v_COMPETENZA = (new IDVariant("Competenza "));
      IDVariant v_TITOLI = new IDVariant(0,IDVariant.STRING);
      v_TITOLI = (new IDVariant(" per i primi Tre Titoli dell'Entrata"));
      PAN_BILPRELIMIND.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_BILPRELIMIND.set_Header(Glb.OBJ_FIELD,PFL_BILPRELIMIND_INTERESSI1, IDL.Add((new IDVariant(PAN_BILPRELIMIND.Header(Glb.OBJ_FIELD,PFL_BILPRELIMIND_INTERESSI1))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRELIMIND.set_Header(Glb.OBJ_FIELD,PFL_BILPRELIMIND_DEBITOCONTRA, IDL.Add((new IDVariant(PAN_BILPRELIMIND.Header(Glb.OBJ_FIELD,PFL_BILPRELIMIND_DEBITOCONTRA))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPRELIMIND.ClearValueList(PFL_BILPRELIMIND_CALCOCOMPEP1);
      PAN_BILPRELIMIND.SetValueListItem(PFL_BILPRELIMIND_CALCOCOMPEP1, (new IDVariant("ACC")), IDL.Add(IDL.Add(((new IDVariant("ACC")).equals((new IDVariant("ACC")))? new IDVariant("da Accertato ") : (new IDVariant("ACC")).equals((new IDVariant("STDEF")))? new IDVariant("da Stanziamento Def.") :  new IDVariant()), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_BILPRELIMIND.SetValueListItem(PFL_BILPRELIMIND_CALCOCOMPEP1, (new IDVariant("STDEF")), IDL.Add(IDL.Add(((new IDVariant("STDEF")).equals((new IDVariant("ACC")))? new IDVariant("da Accertato ") : (new IDVariant("STDEF")).equals((new IDVariant("STDEF")))? new IDVariant("da Stanziamento Def.") :  new IDVariant()), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_BILPRELIMIND.set_Header(Glb.OBJ_FIELD,PFL_BILPRELIMIND_CALCOCOMPEP1, IDL.Add(IDL.Add(v_COMPETENZA, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TITOLI).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LimitiIndebitamento", "Load", _e);
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
      if (new IDVariant(PAN_BILPRELIMIND.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILPRELIMIND.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LimitiIndebitamento", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_BILPRELIMIND_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILPRELIMIND, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILPRELIMIND_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILPRELIMIND, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILPRELIMIND_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILPRELIMIND);
    // Stub
  }

  private void PAN_BILPRELIMIND_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILPRELIMIND_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_BILPRELIMIND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILPRELIMIND_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BILPRELIMIND_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BILPRELIMIND_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILPRELIMIND_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILPRELIMIND_Init()
  {

    PAN_BILPRELIMIND.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILPRELIMIND.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, "33FBB157-478C-4A91-96DC-4478DBF60AD2");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, "Competenza");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, MyGlb.PANEL_LIST, 0, -9999, 120, 0, 0, 0);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, MyGlb.PANEL_FORM, 20, 20, 900, 28, 0, 0);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, 0, 71);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, 1, 13);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, 0, 1);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, 1, 1);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, "31383D15-804F-4F3A-BD63-46DD5A77E471");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, "Spesa annuale per rate mutui/obbligazioni");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, MyGlb.PANEL_LIST, 0, -9999, 132, 16, 0, 0);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, MyGlb.PANEL_FORM, 20, 55, 900, 209, 0, 0);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, 0, 240);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, 1, 13);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, 0, 4);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, 1, 4);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_SPANPERAMUOB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, "8144D436-DA58-427F-BD96-E28E36FDA8A8");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, "Totale debito contratto");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, MyGlb.PANEL_LIST, 0, -9999, 152, 16, 0, 0);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, MyGlb.PANEL_FORM, 20, 267, 900, 73, 0, 0);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, 0, 132);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, 1, 13);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, 0, 4);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, 1, 4);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_TOTADEBICONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, "5C7220B1-3BEA-41D4-89D7-5AFAB23B6E3D");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, "Debito potenziale");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, MyGlb.VIS_GROUPSTYLE);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, MyGlb.PANEL_FORM, 20, 343, 900, 113, 0, 0);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, 0, 99);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, 1, 13);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, 0, 4);
    PAN_BILPRELIMIND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, 1, 4);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_GROUP, GRP_BILPRELIMIND_DEBITOPOTENZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILPRELIMIND.SetSize(MyGlb.OBJ_FIELD, 36);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, "5DAE23F5-7DBE-430D-AE74-69183F75257D");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, "ESERCIZIO");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, "1CB8B4E6-5D1B-454C-9781-B70B4150E2EF");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, "Compentenza esercizio +1 per i primi tre titoli dell'entrata");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.VIS_OPTBUTSEBOSX);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, "B7632CCA-0C8C-4F02-8D83-E83860E1503F");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, "Livello  massimo di spesa annuale");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, "3DBC5FC7-0990-4A05-901E-12FE380B86B1");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, "LIV MAX SPESE ANN P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, "5B59CB5D-B052-4922-B333-44E3C168FC27");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, "LIV MAX SPESE ANN P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, "0BDEB0DB-50D3-4497-9282-47CE832B38BF");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, "Ammontare interessi per mutui, prestiti obbligazionari, aperture di credito e garanzie");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.VIS_VUONORALILEF);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, "FAED37BA-D32E-43DD-B846-F4439A93EB15");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, "di cui all'articolo 207 del TUEL autorizzati fino al 31/12/");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, "8FC4D6CF-2786-4EB3-BE1D-9DBA70953BF2");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, "INTERESSI 1 P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, "9034F552-AB12-4CF9-AC0B-EFE4622A5824");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, "INTERESSI 1 P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, "DC2B3856-2BDA-4AE2-AB8D-AD20F76D773B");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, "Ammontare interessi per mutui, prestiti obbligazionari, aperture di credito e garanzie");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.VIS_VUONORALILEF);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, "9D83A94C-E9DB-4E79-8F58-10D48F4B7FA5");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, "di cui all'articolo 207 del TUEL autorizzati nell'esercizio in corso");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, "10A863B6-A621-4473-BA1D-0A5EDA336728");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, "INTERESSI 2 P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, "1EA33921-9751-4909-AA52-B7DBC098300E");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, "INTERESSI 2 P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, "B5A3F0F0-1CD5-40AA-BBB1-1E035A398217");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, "Contributi erariali in c/interessi su mutui");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, "504C149B-5EE8-4A10-B158-535F197D754D");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, "CONTRIBUTI P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, "3334948E-6CD4-43AE-AFB1-9037E4C2044A");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, "CONTRIBUTI P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, "E9427797-27D4-4502-A86F-AF36485B0DAC");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, "Ammontare interessi riguardanti debiti espressamente esclusi dai limiti di indebitamento");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, "3AC1F4D3-A709-4671-956B-E2B275C78E27");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, "INTERESSI ESCLUSI P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, "9FE537C5-CC2B-45C1-BD13-37313F4102BE");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, "INTERESSI ESCLUSI P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, "AF3E379C-4195-42F2-8540-EE0F694B8C13");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, "Debito contratto al 31/12/");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, "9D50FF49-5B74-46F5-B4BD-E9DBD62524BB");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, "DEBITO CONTRATTO P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, "D713A72D-DB97-4C3C-8CBF-A3FE0C9368B6");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, "DEBITO CONTRATTO P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, "DD5EBFD7-05CE-4220-B08C-D4660E789ABD");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, "Debito autorizzato nell'esercizio in corso");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, "6328DC52-D328-417C-B6CE-6DA307FFC122");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, "DEBITO AUTORIZZATO P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, "9FEBA97D-5E1F-448E-8859-CFB787ECACA2");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, "DEBITO AUTORIZZATO P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, "0ECBB859-BD5F-46D5-9857-0CFEAE3B4443");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, "Garanzie principali o sussidiarie prestate dall'Ente a favore di altre Amministrazioni ");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.VIS_VUONORALILEF);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, "B26F618C-CC5C-492A-B736-D60842051A96");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, "pubbliche e di altri soggetti");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, "5A81D5AB-65CF-406B-B3A9-8279DAFE4F46");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, "GARANZIE P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, "90C10C0B-AA31-41FB-ADC5-D690E2D7E77A");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, "GARANZIE P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, "BC80672E-70C6-42C3-B4AC-D587C1796D15");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, "di cui , garanzie per le quali è stato costituito accantonamento");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, "39DBFC6F-6150-4537-A525-C4EA828825AD");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, "GARANZIE ACCANT P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, "8F4DB5FB-425F-43D2-88C5-E91185555DA8");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, "GARANZIE ACCANT P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, "0D4A7984-0C9F-4655-B5A7-DCF49B7CBC4E");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, "Garanzie che concorrono al limite di indebitamento");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, "5544E9E1-3FC9-48EE-9483-93D524A37FFA");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, "GARANZIE LIMITE INDEB P1");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, "1A861F48-4059-4B31-BF3A-BAE70D6AC70A");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, "GARANZIE LIMITE INDEB P2");
    PAN_BILPRELIMIND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, "");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPRELIMIND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, "574AA326-6FF4-4EDC-861F-1D26C975F272");
    PAN_BILPRELIMIND.set_Header(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, "Elabora");
    PAN_BILPRELIMIND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_BILPRELIMIND.SetImage(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, 0, "button1.gif", false);
    PAN_BILPRELIMIND.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILPRELIMIND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_ESERCIZIO, -1, -1);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_ESERCIZIO, PPQRY_BILPRERIAMPR, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_LIST, 120);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_LIST, "Compen. eser. 1 per i pr. tre tit. dll. ent.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_FORM, 24, 24, 892, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CALCOCOMPEP1, MyGlb.PANEL_FORM, "Compentenza esercizio +1 per i primi tre titoli dell'entrata");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_CALCOCOMPEP1, -1, GRP_BILPRELIMIND_COMPETENZA);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_CALCOCOMPEP1, PPQRY_BILPRERIAMPR, "A.CALCOLO_COMP_E_P1", "CALCOLO_COMP_E_P1", 5, 10, 0, -13997);
    PAN_BILPRELIMIND.SetValueListItem(PFL_BILPRELIMIND_CALCOCOMPEP1, (new IDVariant("ACC")), "da Accertato ", "", "", -1);
    PAN_BILPRELIMIND.SetValueListItem(PFL_BILPRELIMIND_CALCOCOMPEP1, (new IDVariant("STDEF")), "da Stanziamento Def.", "", "", -1);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_LIST, 116);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_LIST, "L. m. d. s. a.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_FORM, 24, 80, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPEANN, MyGlb.PANEL_FORM, "Livello  massimo di spesa annuale");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_LIVMAXSPEANN, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_LIVMAXSPEANN, PPQRY_BILPRERIAMPR, "A.LIV_MAX_SPESE_ANN", "LIV_MAX_SPESE_ANN", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_LIST, "LIV MAX SPESE ANN P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_FORM, 668, 80, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP1, MyGlb.PANEL_FORM, "LIV MAX SPESE ANN P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_LIVMAXSPANP1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_LIVMAXSPANP1, PPQRY_BILPRERIAMPR, "A.LIV_MAX_SPESE_ANN_P1", "LIV_MAX_SPESE_ANN_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_LIST, "LIV MAX SPESE ANN P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_FORM, 796, 80, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_LIVMAXSPANP2, MyGlb.PANEL_FORM, "LIV MAX SPESE ANN P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_LIVMAXSPANP2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_LIVMAXSPANP2, PPQRY_BILPRERIAMPR, "A.LIV_MAX_SPESE_ANN_P2", "LIV_MAX_SPESE_ANN_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_LIST, 20, 40, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_LIST, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_FORM, 24, 108, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_FORM, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_ETICHEINTER1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_ETICHEINTER1, -1, "", "ETICHEINTER1", 0, 0, 0, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_LIST, 100);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_LIST, "d. c. a. a. 2. d. T. a. f. a. 3. 1.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_FORM, 24, 124, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1, MyGlb.PANEL_FORM, "di cui all'articolo 207 del TUEL autorizzati fino al 31/12/");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI1, PPQRY_BILPRERIAMPR, "A.INTERESSI_1", "INTERESSI_1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_LIST, "INTERESSI 1 P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_FORM, 668, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P1, MyGlb.PANEL_FORM, "INTERESSI 1 P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI1P1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI1P1, PPQRY_BILPRERIAMPR, "A.INTERESSI_1_P1", "INTERESSI_1_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_LIST, "INTERESSI 1 P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_FORM, 796, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI1P2, MyGlb.PANEL_FORM, "INTERESSI 1 P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI1P2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI1P2, PPQRY_BILPRERIAMPR, "A.INTERESSI_1_P2", "INTERESSI_1_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_LIST, 28, 48, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_LIST, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_FORM, 24, 152, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_FORM, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEINTER2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_ETICHEINTER2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_ETICHEINTER2, -1, "", "ETICHEINTER2", 0, 0, 0, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_LIST, 156);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_LIST, "d. c. a. a. 2. d. T. a. n. e. i. c.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_FORM, 24, 168, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2, MyGlb.PANEL_FORM, "di cui all'articolo 207 del TUEL autorizzati nell'esercizio in corso");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI2, PPQRY_BILPRERIAMPR, "A.INTERESSI_2", "INTERESSI_2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_LIST, "INTERESSI 2 P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_FORM, 668, 168, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P1, MyGlb.PANEL_FORM, "INTERESSI 2 P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI2P1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI2P1, PPQRY_BILPRERIAMPR, "A.INTERESSI_2_P1", "INTERESSI_2_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_LIST, "INTERESSI 2 P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_FORM, 796, 168, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESSI2P2, MyGlb.PANEL_FORM, "INTERESSI 2 P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESSI2P2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESSI2P2, PPQRY_BILPRERIAMPR, "A.INTERESSI_2_P2", "INTERESSI_2_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_LIST, 164);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_LIST, "C. e. i. c i. s. m.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_FORM, 24, 204, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTI, MyGlb.PANEL_FORM, "Contributi erariali in c/interessi su mutui");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_CONTRIBUTI, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_CONTRIBUTI, PPQRY_BILPRERIAMPR, "A.CONTRIBUTI", "CONTRIBUTI", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_LIST, "CONTRIBUTI P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_FORM, 668, 204, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP1, MyGlb.PANEL_FORM, "CONTRIBUTI P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_CONTRIBUTIP1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_CONTRIBUTIP1, PPQRY_BILPRERIAMPR, "A.CONTRIBUTI_P1", "CONTRIBUTI_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_LIST, "CONTRIBUTI P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_FORM, 796, 204, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_FORM, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_CONTRIBUTIP2, MyGlb.PANEL_FORM, "CONTRIBUTI P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_CONTRIBUTIP2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_CONTRIBUTIP2, PPQRY_BILPRERIAMPR, "A.CONTRIBUTI_P2", "CONTRIBUTI_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_LIST, 28);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_LIST, "A. i. r. d. e. e. d. l. d. i.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_FORM, 24, 240, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTEREESCLUS, MyGlb.PANEL_FORM, "Ammontare interessi riguardanti debiti espressamente esclusi dai limiti di indebitamento");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTEREESCLUS, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTEREESCLUS, PPQRY_BILPRERIAMPR, "A.INTERESSI_ESCLUSI", "INTERESSI_ESCLUSI", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_LIST, "INTERESSI ESCLUSI P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_FORM, 668, 240, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP1, MyGlb.PANEL_FORM, "INTERESSI ESCLUSI P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESCLUP1, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESCLUP1, PPQRY_BILPRERIAMPR, "A.INTERESSI_ESCLUSI_P1", "INTERESSI_ESCLUSI_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_LIST, "INTERESSI ESCLUSI P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_FORM, 796, 240, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_INTERESCLUP2, MyGlb.PANEL_FORM, "INTERESSI ESCLUSI P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_INTERESCLUP2, -1, GRP_BILPRELIMIND_SPANPERAMUOB);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_INTERESCLUP2, PPQRY_BILPRERIAMPR, "A.INTERESSI_ESCLUSI_P2", "INTERESSI_ESCLUSI_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_LIST, "D. c. a. 3. 1.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_FORM, 24, 292, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOCONTRA, MyGlb.PANEL_FORM, "Debito contratto al 31/12/");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITOCONTRA, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITOCONTRA, PPQRY_BILPRERIAMPR, "A.DEBITO_CONTRATTO", "DEBITO_CONTRATTO", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_LIST, 136);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_LIST, "DEBITO CONTRATTO P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_FORM, 668, 292, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_FORM, 136);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP1, MyGlb.PANEL_FORM, "DEBITO CONTRATTO P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITCONTRP1, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITCONTRP1, PPQRY_BILPRERIAMPR, "A.DEBITO_CONTRATTO_P1", "DEBITO_CONTRATTO_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_LIST, 136);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_LIST, "DEBITO CONTRATTO P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_FORM, 796, 292, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_FORM, 136);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITCONTRP2, MyGlb.PANEL_FORM, "DEBITO CONTRATTO P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITCONTRP2, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITCONTRP2, PPQRY_BILPRERIAMPR, "A.DEBITO_CONTRATTO_P2", "DEBITO_CONTRATTO_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_LIST, 96);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_LIST, "D. a. n. e. i. c.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_FORM, 24, 316, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITOAUTORI, MyGlb.PANEL_FORM, "Debito autorizzato nell'esercizio in corso");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITOAUTORI, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITOAUTORI, PPQRY_BILPRERIAMPR, "A.DEBITO_AUTORIZZATO", "DEBITO_AUTORIZZATO", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_LIST, 152);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_LIST, "DEBITO AUTORIZZATO P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_FORM, 668, 316, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_FORM, 152);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP1, MyGlb.PANEL_FORM, "DEBITO AUTORIZZATO P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITAUTORP1, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITAUTORP1, PPQRY_BILPRERIAMPR, "A.DEBITO_AUTORIZZATO_P1", "DEBITO_AUTORIZZATO_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_LIST, 152);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_LIST, "DEBITO AUTORIZZATO P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_FORM, 796, 316, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_FORM, 152);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_DEBITAUTORP2, MyGlb.PANEL_FORM, "DEBITO AUTORIZZATO P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_DEBITAUTORP2, -1, GRP_BILPRELIMIND_TOTADEBICONT);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_DEBITAUTORP2, PPQRY_BILPRERIAMPR, "A.DEBITO_AUTORIZZATO_P2", "DEBITO_AUTORIZZATO_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_LIST, 28, 48, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_LIST, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_FORM, 24, 368, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_FORM, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEGARANZ, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_ETICHEGARANZ, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_ETICHEGARANZ, -1, "", "ETICHEGARANZ", 0, 0, 0, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_LIST, "p. e d. a. s.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_FORM, 24, 384, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIE, MyGlb.PANEL_FORM, "pubbliche e di altri soggetti");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANZIE, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANZIE, PPQRY_BILPRERIAMPR, "A.GARANZIE", "GARANZIE", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_LIST, 84);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_LIST, "GARANZIE P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_FORM, 668, 384, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_FORM, 84);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP1, MyGlb.PANEL_FORM, "GARANZIE P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANZIEP1, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANZIEP1, PPQRY_BILPRERIAMPR, "A.GARANZIE_P1", "GARANZIE_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_LIST, 84);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_LIST, "GARANZIE P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_FORM, 796, 384, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_FORM, 84);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZIEP2, MyGlb.PANEL_FORM, "GARANZIE P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANZIEP2, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANZIEP2, PPQRY_BILPRERIAMPR, "A.GARANZIE_P2", "GARANZIE_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_LIST, 120);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_LIST, "d. c. g. p. l. q. è s. c. a.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_FORM, 24, 408, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANZACCANT, MyGlb.PANEL_FORM, "di cui , garanzie per le quali è stato costituito accantonamento");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANZACCANT, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANZACCANT, PPQRY_BILPRERIAMPR, "A.GARANZIE_ACCANT", "GARANZIE_ACCANT", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_LIST, "GARANZIE ACCANT P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_FORM, 668, 408, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP1, MyGlb.PANEL_FORM, "GARANZIE ACCANT P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANACCANP1, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANACCANP1, PPQRY_BILPRERIAMPR, "A.GARANZIE_ACCANT_P1", "GARANZIE_ACCANT_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_LIST, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_LIST, "GARANZIE ACCANT P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_FORM, 796, 408, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_FORM, 132);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARANACCANP2, MyGlb.PANEL_FORM, "GARANZIE ACCANT P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARANACCANP2, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARANACCANP2, PPQRY_BILPRERIAMPR, "A.GARANZIE_ACCANT_P2", "GARANZIE_ACCANT_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_LIST, 104);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_LIST, "G. c. c. a. l. d. i.");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_FORM, 24, 432, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_FORM, 512);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMIINDE, MyGlb.PANEL_FORM, "Garanzie che concorrono al limite di indebitamento");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARALIMIINDE, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARALIMIINDE, PPQRY_BILPRERIAMPR, "A.GARANZIE_LIMITE_INDEB", "GARANZIE_LIMITE_INDEB", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_LIST, 160);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_LIST, "GARANZIE LIMITE INDEB P1");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_FORM, 668, 432, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_FORM, 160);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP1, MyGlb.PANEL_FORM, "GARANZIE LIMITE INDEB P1");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARALIMINDP1, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARALIMINDP1, PPQRY_BILPRERIAMPR, "A.GARANZIE_LIMITE_INDEB_P1", "GARANZIE_LIMITE_INDEB_P1", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_LIST, 160);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_LIST, "GARANZIE LIMITE INDEB P2");
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_FORM, 796, 432, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_FORM, 160);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_GARALIMINDP2, MyGlb.PANEL_FORM, "GARANZIE LIMITE INDEB P2");
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_GARALIMINDP2, -1, GRP_BILPRELIMIND_DEBITOPOTENZ);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_GARALIMINDP2, PPQRY_BILPRERIAMPR, "A.GARANZIE_LIMITE_INDEB_P2", "GARANZIE_LIMITE_INDEB_P2", 3, 14, 2, -13997);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_BILPRELIMIND.SetRect(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_FORM, 836, 480, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPRELIMIND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_BILPRELIMIND.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPRELIMIND_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_BILPRELIMIND.SetFieldPage(PFL_BILPRELIMIND_ETICHEELABOR, -1, -1);
    PAN_BILPRELIMIND.SetFieldPanel(PFL_BILPRELIMIND_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_BILPRELIMIND_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILPRELIMIND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILPRELIMIND.SetIMDB(IMDB, "PQRY_BILPRERIAMPR", true);
    PAN_BILPRELIMIND.set_SetString(MyGlb.MASTER_ROWNAME, "BIL PREV RIS AMM PRES");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.LIV_MAX_SPESE_ANN as LIV_MAX_SPESE_ANN, ");
    SQL.append("  A.INTERESSI_1 as INTERESSI_1, ");
    SQL.append("  A.INTERESSI_2 as INTERESSI_2, ");
    SQL.append("  A.CONTRIBUTI as CONTRIBUTI, ");
    SQL.append("  A.INTERESSI_ESCLUSI as INTERESSI_ESCLUSI, ");
    SQL.append("  A.DEBITO_CONTRATTO as DEBITO_CONTRATTO, ");
    SQL.append("  A.DEBITO_AUTORIZZATO as DEBITO_AUTORIZZATO, ");
    SQL.append("  A.GARANZIE as GARANZIE, ");
    SQL.append("  A.GARANZIE_ACCANT as GARANZIE_ACCANT, ");
    SQL.append("  A.GARANZIE_LIMITE_INDEB as GARANZIE_LIMITE_INDEB, ");
    SQL.append("  A.LIV_MAX_SPESE_ANN_P1 as LIV_MAX_SPESE_ANN_P1, ");
    SQL.append("  A.INTERESSI_1_P1 as INTERESSI_1_P1, ");
    SQL.append("  A.INTERESSI_2_P1 as INTERESSI_2_P1, ");
    SQL.append("  A.CONTRIBUTI_P1 as CONTRIBUTI_P1, ");
    SQL.append("  A.INTERESSI_ESCLUSI_P1 as INTERESSI_ESCLUSI_P1, ");
    SQL.append("  A.DEBITO_CONTRATTO_P1 as DEBITO_CONTRATTO_P1, ");
    SQL.append("  A.DEBITO_AUTORIZZATO_P1 as DEBITO_AUTORIZZATO_P1, ");
    SQL.append("  A.GARANZIE_P1 as GARANZIE_P1, ");
    SQL.append("  A.GARANZIE_ACCANT_P1 as GARANZIE_ACCANT_P1, ");
    SQL.append("  A.GARANZIE_LIMITE_INDEB_P1 as GARANZIE_LIMITE_INDEB_P1, ");
    SQL.append("  A.LIV_MAX_SPESE_ANN_P2 as LIV_MAX_SPESE_ANN_P2, ");
    SQL.append("  A.INTERESSI_1_P2 as INTERESSI_1_P2, ");
    SQL.append("  A.INTERESSI_2_P2 as INTERESSI_2_P2, ");
    SQL.append("  A.CONTRIBUTI_P2 as CONTRIBUTI_P2, ");
    SQL.append("  A.INTERESSI_ESCLUSI_P2 as INTERESSI_ESCLUSI_P2, ");
    SQL.append("  A.DEBITO_CONTRATTO_P2 as DEBITO_CONTRATTO_P2, ");
    SQL.append("  A.DEBITO_AUTORIZZATO_P2 as DEBITO_AUTORIZZATO_P2, ");
    SQL.append("  A.GARANZIE_P2 as GARANZIE_P2, ");
    SQL.append("  A.GARANZIE_ACCANT_P2 as GARANZIE_ACCANT_P2, ");
    SQL.append("  A.GARANZIE_LIMITE_INDEB_P2 as GARANZIE_LIMITE_INDEB_P2, ");
    SQL.append("  A.CALCOLO_COMP_E_P1 as CALCOLO_COMP_E_P1 ");
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_LIM_INDEB A ");
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPRELIMIND.SetQuery(PPQRY_BILPRERIAMPR, 5, SQL, -1, "");
    PAN_BILPRELIMIND.SetQueryDB(PPQRY_BILPRERIAMPR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILPRELIMIND.SetMasterTable(0, "BIL_PREV_LIM_INDEB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILPRELIMIND.Status() == 2)
    {
      int oldListQBE = PAN_BILPRELIMIND.iUseListQBE;
      PAN_BILPRELIMIND.iUseListQBE = 0;
      PAN_BILPRELIMIND.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILPRELIMIND.PanelCommand(Glb.PCM_FIND);
      PAN_BILPRELIMIND.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BILPRELIMIND) PAN_BILPRELIMIND_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
