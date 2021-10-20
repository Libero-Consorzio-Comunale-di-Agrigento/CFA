// **********************************************
// Scelta Acc Provenienza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaAccProvenienza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTAACCERT_ACCERTAMENTO = 0;
  private static int GRP_SCELTAACCERT_PROPOSTA = 1;
  private static int GRP_SCELTAACCERT_DELIBERA = 2;

  private static int PFL_SCELTAACCERT_NUMEROACC = 0;
  private static int PFL_SCELTAACCERT_ANNOACC = 1;
  private static int PFL_SCELTAACCERT_CAPITOLO = 2;
  private static int PFL_SCELTAACCERT_ARTICOLO = 3;
  private static int PFL_SCELTAACCERT_DDATAREG = 4;
  private static int PFL_SCELTAACCERT_DESCRIZIONE = 5;
  private static int PFL_SCELTAACCERT_TIPOVAR = 6;
  private static int PFL_SCELTAACCERT_UNITAPROPONE = 7;
  private static int PFL_SCELTAACCERT_NUMEROPROPOS = 8;
  private static int PFL_SCELTAACCERT_ANNOPROPOSTA = 9;
  private static int PFL_SCELTAACCERT_SEDEDEL = 10;
  private static int PFL_SCELTAACCERT_NUMERODEL = 11;
  private static int PFL_SCELTAACCERT_ANNODEL = 12;
  private static int PFL_SCELTAACCERT_IMPORTO = 13;
  private static int PFL_SCELTAACCERT_VOCEECON = 14;
  private static int PFL_SCELTAACCERT_CODICEGESTIO = 15;
  private static int PFL_SCELTAACCERT_CODICEEUROPE = 16;
  private static int PFL_SCELTAACCERT_CODLIVELLO5 = 17;
  private static int PFL_SCELTAACCERT_CAUSALE = 18;
  private static int PFL_SCELTAACCERT_ESERCISCADEN = 19;
  private static int PFL_SCELTAACCERT_TIPOVINCOLO = 20;
  private static int PFL_SCELTAACCERT_ANNOPLUR = 21;
  private static int PFL_SCELTAACCERT_NUMEROPLUR = 22;
  private static int PFL_SCELTAACCERT_CENTRO = 23;
  private static int PFL_SCELTAACCERT_FATTORE = 24;
  private static int PFL_SCELTAACCERT_COMPETENZDAL = 25;
  private static int PFL_SCELTAACCERT_COMPETENZAAL = 26;
  private static int PFL_SCELTAACCERT_NOTE = 27;
  private static int PFL_SCELTAACCERT_RILEVANTEECO = 28;
  private static int PFL_SCELTAACCERT_CODIMPECO = 29;
  private static int PFL_SCELTAACCERT_PROGETTOID = 30;
  private static int PFL_SCELTAACCERT_OBIETTIVO = 31;
  private static int PFL_SCELTAACCERT_PROGUNITORGA = 32;
  private static int PFL_SCELTAACCERT_SCHEDOBIETID = 33;
  private static int PFL_SCELTAACCERT_CODMONITORAG = 34;
  private static int PFL_SCELTAACCERT_OPERA = 35;
  private static int PFL_SCELTAACCERT_PROGRESSIVO = 36;
  private static int PFL_SCELTAACCERT_DEBITORE = 37;
  private static int PFL_SCELTAACCERT_FINANZIAMENT = 38;
  private static int PFL_SCELTAACCERT_TIPOAVANZO = 39;

  private static int PPQRY_VARACC1 = 0;

  private static int PPQRY_T56 = 1;


  IDPanel PAN_SCELTAACCERT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM136(IMDB);
    //
    //
    Init_PQRY_VARACC1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM136(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM136, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM136, "TBL_PARAM136");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM136,IMDBDef1.FLD_PARAM136_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM136,IMDBDef1.FLD_PARAM136_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM136, 0);
  }

  private static void Init_PQRY_VARACC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VARACC1, 40);
    IMDB.set_TblCode(IMDBDef7.PQRY_VARACC1, "PQRY_VARACC1");
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACNUMEACC, "VARACNUMEACC");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACANNOACC, "VARACANNOACC");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCAPI, "VARACACCCAPI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCARTI, "VARACACCARTI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARADDATAREG, "VARADDATAREG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARADDATAREG,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCDESCRI, "VARACCDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACTIPOVAR, "VARACTIPOVAR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACTIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAUNITPROP, "VARAUNITPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARANUMEPROP, "VARANUMEPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARANUMEPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAANNOPROP, "VARAANNOPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACSEDEDEL, "VARACSEDEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACNUMEDEL, "VARACNUMEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACANNODEL, "VARACANNODEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCIMPORT, "VARACCIMPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCVOCECO, "VARACCVOCECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCVOCECO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODGES, "VARACCCODGES");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODGES,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODEUR, "VARACCCODEUR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODLI5, "VARACCCODLI5");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCAUS, "VARACACCCAUS");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCAUS,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCESESCA, "VARACCESESCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCESESCA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCTIPVIN, "VARACCTIPVIN");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCANNPLU, "VARACCANNPLU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCANNPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCNUMPLU, "VARACCNUMPLU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCNUMPLU,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCENT, "VARACACCCENT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCCENT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCFATT, "VARACACCFATT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCOMDAL, "VARACCCOMDAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCOMDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAACCCOMAL, "VARAACCCOMAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAACCCOMAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCNOTE, "VARACACCNOTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCNOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCRILECO, "VARACCRILECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARCODACCECO, "VARCODACCECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARCODACCECO,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAACCPROID, "VARAACCPROID");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARAACCPROID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCOBIE, "VARACACCOBIE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCOBIE,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCPRUNOR, "VARACCPRUNOR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCSCOBID, "VARACCSCOBID");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCSCOBID,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODMON, "VARACCCODMON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCCODMON,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARVARACCOPE, "VARVARACCOPE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARVARACCOPE,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCPROGRE, "VARACCPROGRE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCDEBI, "VARACACCDEBI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCFINA, "VARACACCFINA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACACCFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCTIPAVA, "VARACCTIPAVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARACC1,IMDBDef7.PQSL_VARACC1_VARACCTIPAVA,3,10,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VARACC1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaAccProvenienza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaAccProvenienza()
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
    FormIdx = MyGlb.FRM_SCELTACCPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CAC0B5D1-BD60-4606-B01C-427C9CFD1996";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1016;
    DesignHeight = 358;
    set_Caption(new IDVariant("Scelta Accertamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1016;
    Frames[1].Height = 332;
    Frames[1].Caption = "Scelta Accertamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_SCELTAACCERT = new IDPanel(w, this, 1, "PAN_SCELTAACCERT");
    Frames[1].Content = PAN_SCELTAACCERT;
    PAN_SCELTAACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAACCERT.VS = MainFrm.VisualStyleList;
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1016-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D6CD247D-8901-4F0F-983D-1FA04769C573");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 940, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAACCERT.InitStatus = 1;
    PAN_SCELTAACCERT_Init();
    PAN_SCELTAACCERT_InitFields();
    PAN_SCELTAACCERT_InitQueries();
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
      PAN_SCELTAACCERT.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaAccProvenienza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaAccProvenienza.class.getName() : (Glb.ClassWithPackage(SceltaAccProvenienza.class) ? SceltaAccProvenienza.class.getName().substring(SceltaAccProvenienza.class.getPackage().getName().length() + 1) : SceltaAccProvenienza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Accertamento On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_SCELTAACCERT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Accertamento On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_SCELTAACCERT.Status()).equals((new IDVariant(1)), true))
      {
        PAN_SCELTAACCERT.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_SCELTAACCERT.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccProvenienza", "SceltaAccertamentoOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Scelta Accertamento On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAACCERT);
      // 
      // Scelta Accertamento On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTAACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAACCERT_DESCRIZIONE,(new IDVariant(PAN_SCELTAACCERT.FieldText(PFL_SCELTAACCERT_DESCRIZIONE))).stringValue()); 
      PAN_SCELTAACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAACCERT_TIPOVAR,(new IDVariant(PAN_SCELTAACCERT.FieldText(PFL_SCELTAACCERT_TIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccProvenienza", "SceltaAccertamentoOnDynamicProperties", _e);
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
      PAN_SCELTAACCERT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaAccProvenienza", "Load", _e);
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
  private void PAN_SCELTAACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAACCERT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAACCERT, Cancel);
    // Stub
  }

  private void PAN_SCELTAACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAACCERT_Init()
  {

    PAN_SCELTAACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAACCERT.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, "D4B2A408-FFF2-4CFB-9124-DC6725910DDC");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, "Accertamento");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 39, 132, 73, 0, 0);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, 0, 81);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, 1, 13);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, 0, 4);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, 1, 4);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, "DE1B709B-D4B0-4B74-A8DC-B5E69E94CBC7");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, "Proposta");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, MyGlb.PANEL_LIST, 604, -9999, 200, 16, 0, 0);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, MyGlb.PANEL_FORM, 0, 159, 172, 97, 0, 0);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, 0, 51);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, 1, 13);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, 0, 4);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, 1, 4);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, "D797A6BA-0883-45F6-9BDF-487243A3DD57");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, "Delibera");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, MyGlb.PANEL_LIST, 804, -9999, 136, 16, 0, 0);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, MyGlb.PANEL_FORM, 0, 231, 132, 97, 0, 0);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, 0, 47);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, 1, 13);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, 0, 4);
    PAN_SCELTAACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, 1, 4);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAACCERT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAACCERT.SetSize(MyGlb.OBJ_FIELD, 40);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, "6FD9B35F-CEF4-4F43-B438-C090815B74FC");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, "Numero");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, "657F68D1-CABB-415A-A8A0-EE34541DD66F");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, "Anno");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, "D70DDDCB-989B-4E7A-9019-B553C49D0503");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, "Capitolo");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, "60BE54C7-2AFE-47AD-B740-F018E6EC0F17");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, "Art.");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, "1E1E1D46-FAB8-48A5-B39A-F5EFDF274C2D");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, "Data Reg.");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, "5408A5FD-D622-4F51-8E92-2C0C63E5F5F4");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, "Descrizione");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, "7DB574BD-63AE-41F7-BB4F-B83715C68A74");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, "Tipo Variazione");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, "C2E1523B-54DE-4139-A382-90AD1C5384C8");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, "Unità Prop.");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, "487792D1-99FE-470A-8135-4A1A31D52C59");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, "Numero");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, "A475B826-7138-4DC3-8770-432375C91802");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, "Anno");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, "7237D1C2-2A2E-48C1-B8B1-BA3D82DBED86");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, "Sede");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, "64FB2DFB-A3E4-46C9-B182-90C6F8D41627");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, "Numero");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, "FE0A57AC-FFF4-45E7-B611-5E2DF7118510");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, "Anno");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, "349EE90F-B124-4247-8F12-36107CF5CF4B");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, "IMPORTO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, 0, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, "13BB6521-6866-4E1E-9613-70009C7152DC");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, "VOCE ECON");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, "9C423982-AD69-4934-A577-5105BAD1203F");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, "899F3B46-0F58-40EE-861E-29B7A1F3523D");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, "Cod. Europeo");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, "Brief description of field content.");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, "8129710D-AD07-4373-9F28-612418B9B7CC");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, "Cod. V livello");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, "3E628DC0-80A5-4621-9EE8-4F6E5EC84C9D");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, "CAUSALE");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, "5A5651DC-0380-4ECF-9CDD-C1AA93C08FB4");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, "ESERCIZIO SCADENZA");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, "1902559F-F3C2-4D20-87D3-FBD84A1D61BB");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, "944EE8A0-85C8-4405-8C67-ED9C9C1687D0");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, "ANNO PLUR");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, "DE045ED8-7F09-43A1-B730-A40F9C4685E7");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, "NUMERO PLUR");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, "7206BA35-41AB-4FBE-9BE2-3F81BE6BA902");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, "CENTRO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, "48D09818-6DEF-414E-A14C-93A0C41F706A");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, "FATTORE");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, "C50C7002-E068-4438-B26B-80758C3B4E01");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, "COMPETENZA DAL");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, "4210D408-6FA4-4827-B738-D3AD5822E027");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, "COMPETENZA AL");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, "56EAD6CE-D661-458D-BE41-4430C6097B13");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, "NOTE");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, "94891005-1721-4C49-8A1A-7F5707C7D9FF");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, "RILEVANTE ECO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, "2DD046DA-EBF5-4F4B-B22A-637B31542153");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, "COD IMP ECO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, "3F743451-2268-4002-ACD3-D049287EE268");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, "PROGETTO ID");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, "B4625134-4495-4D15-80E8-3F2DE8552AE7");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, "OBIETTIVO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, "8BBB5F54-0AD2-4705-A3A0-A15DEE872F8B");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, "87C719E2-EE34-4D32-A2BD-85C8CB977EFB");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, "97F25991-BCAA-47DC-BAA6-15E2D5D3C136");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, "COD MONITORAGGIO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, "06F8E45B-D676-421E-B3B5-D5A03C940FBE");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, "OPERA");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, "768BD9D0-18EA-4712-9FC5-B0EF79192205");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, "PROGRESSIVO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, "54AB3931-A7FA-4EAC-8302-ECBB6C562793");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, "DEBITORE");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, "5F1BDDF5-5C38-45C8-A984-4B9F2D8C1DD1");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, "FINANZIAMENTO");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, "33B2201C-3225-42F6-9F23-BBFDF6DCF715");
    PAN_SCELTAACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, "Tipo Avanzo");
    PAN_SCELTAACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, "");
    PAN_SCELTAACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTAACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 64, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_NUMEROACC, -1, GRP_SCELTAACCERT_ACCERTAMENTO);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_NUMEROACC, PPQRY_VARACC1, "B.NUMERO_ACC", "VARACNUMEACC", 1, 5, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_LIST, 60, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_FORM, 4, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ANNOACC, -1, GRP_SCELTAACCERT_ACCERTAMENTO);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ANNOACC, PPQRY_VARACC1, "B.ANNO_ACC", "VARACANNOACC", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_LIST, 100, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CAPITOLO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CAPITOLO, PPQRY_VARACC1, "B.CAPITOLO", "VARACACCCAPI", 3, 16, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_LIST, 212, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 136, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ARTICOLO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ARTICOLO, PPQRY_VARACC1, "B.ARTICOLO", "VARACACCARTI", 1, 2, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_FORM, 4, 160, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DDATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_DDATAREG, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_DDATAREG, PPQRY_VARACC1, "A.D_DATA_REG", "VARADDATAREG", 6, 10, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 312, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_DESCRIZIONE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_DESCRIZIONE, PPQRY_VARACC1, "A.DESCRIZIONE", "VARACCDESCRI", 5, 140, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_LIST, 488, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_FORM, 12, 336, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVAR, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_TIPOVAR, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_TIPOVAR, PPQRY_VARACC1, "A.TIPO_VAR", "VARACTIPOVAR", 1, 2, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 604, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Prop.");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 184, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità Prop.");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_UNITAPROPONE, -1, GRP_SCELTAACCERT_PROPOSTA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_UNITAPROPONE, PPQRY_VARACC1, "A.UNITA_PROPONENTE", "VARAUNITPROP", 5, 8, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 712, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 208, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_NUMEROPROPOS, -1, GRP_SCELTAACCERT_PROPOSTA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_NUMEROPROPOS, PPQRY_VARACC1, "A.NUMERO_PROPOSTA", "VARANUMEPROP", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 764, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 232, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ANNOPROPOSTA, -1, GRP_SCELTAACCERT_PROPOSTA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ANNOPROPOSTA, PPQRY_VARACC1, "A.ANNO_PROPOSTA", "VARAANNOPROP", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_LIST, 804, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_FORM, 4, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_SEDEDEL, -1, GRP_SCELTAACCERT_DELIBERA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_SEDEDEL, PPQRY_VARACC1, "A.SEDE_DEL", "VARACSEDEDEL", 5, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_LIST, 844, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_NUMERODEL, -1, GRP_SCELTAACCERT_DELIBERA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_NUMERODEL, PPQRY_VARACC1, "A.NUMERO_DEL", "VARACNUMEDEL", 1, 6, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_LIST, 900, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ANNODEL, -1, GRP_SCELTAACCERT_DELIBERA);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ANNODEL, PPQRY_VARACC1, "A.ANNO_DEL", "VARACANNODEL", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_LIST, 812, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_LIST, "IMPORTO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_FORM, 4, 328, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_IMPORTO, MyGlb.PANEL_FORM, "IMPORTO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_IMPORTO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_IMPORTO, PPQRY_VARACC1, "A.IMPORTO", "VARACCIMPORT", 3, 14, 2, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_LIST, 812, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_FORM, 4, 352, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_VOCEECON, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_VOCEECON, PPQRY_VARACC1, "B.VOCE_ECON", "VARACCVOCECO", 1, 2, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 376, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEGESTIO, MyGlb.PANEL_FORM, "CODICE GESTIONALE");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CODICEGESTIO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CODICEGESTIO, PPQRY_VARACC1, "B.CODICE_GESTIONALE", "VARACCCODGES", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 812, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 424, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CODICEEUROPE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CODICEEUROPE, PPQRY_VARACC1, "B.CODICE_EUROPEO", "VARACCCODEUR", 1, 1, 0, -13997);
    PAN_SCELTAACCERT.SetValueListItem(PFL_SCELTAACCERT_CODICEEUROPE, (new IDVariant(1)), "1 - entrate destinate al finanziamento dei progetti comunitari", "", "", -1);
    PAN_SCELTAACCERT.SetValueListItem(PFL_SCELTAACCERT_CODICEEUROPE, (new IDVariant(2)), "2 - altre entrate", "", "", -1);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 448, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CODLIVELLO5, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CODLIVELLO5, PPQRY_VARACC1, "B.COD_LIVELLO_5", "VARACCCODLI5", 3, 10, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_LIST, 900, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CAUSALE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CAUSALE, PPQRY_VARACC1, "B.CAUSALE", "VARACACCCAUS", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_LIST, 1064, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_LIST, 128);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_LIST, "ESERCIZIO SCADENZA");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_FORM, 4, 400, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_FORM, 128);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ESERCISCADEN, MyGlb.PANEL_FORM, "ESERCIZIO SCADENZA");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ESERCISCADEN, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ESERCISCADEN, PPQRY_VARACC1, "B.ESERCIZIO_SCADENZA", "VARACCESESCA", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1192, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 424, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, "TIPO VINCOLO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_TIPOVINCOLO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_TIPOVINCOLO, PPQRY_VARACC1, "B.TIPO_VINCOLO", "VARACCTIPVIN", 1, 6, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_LIST, 1848, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_LIST, "ANNO PLUR");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_FORM, 4, 544, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_ANNOPLUR, MyGlb.PANEL_FORM, "ANNO PLUR");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_ANNOPLUR, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_ANNOPLUR, PPQRY_VARACC1, "B.ANNO_PLUR", "VARACCANNPLU", 1, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_LIST, 1920, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_LIST, "NUMERO PLUR");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_FORM, 4, 568, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NUMEROPLUR, MyGlb.PANEL_FORM, "NUMERO PLUR");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_NUMEROPLUR, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_NUMEROPLUR, PPQRY_VARACC1, "B.NUMERO_PLUR", "VARACCNUMPLU", 1, 5, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_LIST, 2008, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_FORM, 4, 592, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CENTRO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CENTRO, PPQRY_VARACC1, "B.CENTRO", "VARACACCCENT", 5, 16, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_LIST, 2060, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_FORM, 4, 616, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_FATTORE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_FATTORE, PPQRY_VARACC1, "B.FATTORE", "VARACACCFATT", 5, 16, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_LIST, 2120, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_LIST, 108);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 640, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_FORM, 108);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPETENZA DAL");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_COMPETENZDAL, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_COMPETENZDAL, PPQRY_VARACC1, "B.COMPETENZA_DAL", "VARACCCOMDAL", 6, 19, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_LIST, 2228, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_LIST, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 664, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_FORM, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPETENZA AL");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_COMPETENZAAL, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_COMPETENZAAL, PPQRY_VARACC1, "B.COMPETENZA_AL", "VARAACCCOMAL", 6, 19, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_LIST, 2332, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_FORM, 4, 688, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_NOTE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_NOTE, PPQRY_VARACC1, "B.NOTE", "VARACACCNOTE", 5, 2000, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_LIST, 2764, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_LIST, "RILEVANTE ECO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEVANTE ECO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_RILEVANTEECO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_RILEVANTEECO, PPQRY_VARACC1, "B.RILEVANTE_ECO", "VARACCRILECO", 5, 2, 0, -13997);
    PAN_SCELTAACCERT.SetValueListItem(PFL_SCELTAACCERT_RILEVANTEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTAACCERT.SetValueListItem(PFL_SCELTAACCERT_RILEVANTEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_LIST, 2856, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_LIST, "COD IMP ECO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_FORM, 4, 760, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODIMPECO, MyGlb.PANEL_FORM, "COD IMP ECO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CODIMPECO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CODIMPECO, PPQRY_VARACC1, "B.COD_IMP_ECO", "VARCODACCECO", 5, 16, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_LIST, 2936, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_FORM, 4, 784, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_PROGETTOID, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_PROGETTOID, PPQRY_VARACC1, "B.PROGETTO_ID", "VARAACCPROID", 5, 9, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_LIST, 3260, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_LIST, "OBIETTIVO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_FORM, 4, 880, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OBIETTIVO, MyGlb.PANEL_FORM, "OBIETTIVO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_OBIETTIVO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_OBIETTIVO, PPQRY_VARACC1, "B.OBIETTIVO", "VARACACCOBIE", 5, 9, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_LIST, 3412, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 928, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_PROGUNITORGA, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_PROGUNITORGA, PPQRY_VARACC1, "B.PROGR_UNITA_ORGANIZZATIVA", "VARACCPRUNOR", 1, 8, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_LIST, 3596, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_LIST, 132);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 952, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_FORM, 132);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_SCHEDOBIETID, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_SCHEDOBIETID, PPQRY_VARACC1, "B.SCHEDA_OBIETTIVO_ID", "VARACCSCOBID", 3, 10, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_LIST, 3812, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_LIST, 124);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_LIST, "COD MONITORAGGIO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_FORM, 4, 1000, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_FORM, 124);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_CODMONITORAG, MyGlb.PANEL_FORM, "COD MONITORAGGIO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_CODMONITORAG, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_CODMONITORAG, PPQRY_VARACC1, "B.COD_MONITORAGGIO", "VARACCCODMON", 5, 4, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_LIST, 812, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_LIST, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_FORM, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_OPERA, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_OPERA, PPQRY_VARACC1, "A.OPERA", "VARVARACCOPE", 1, 5, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 328, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_PROGRESSIVO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_PROGRESSIVO, PPQRY_VARACC1, "A.PROGRESSIVO", "VARACCPROGRE", 3, 10, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_LIST, "DEBITORE");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_FORM, 4, 328, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_DEBITORE, MyGlb.PANEL_FORM, "DEBITORE");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_DEBITORE, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_DEBITORE, PPQRY_VARACC1, "B.DEBITORE", "VARACACCDEBI", 2, 15, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_FINANZIAMENT, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_FINANZIAMENT, PPQRY_VARACC1, "B.FINANZIAMENTO", "VARACACCFINA", 1, 5, 0, -13997);
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_SCELTAACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 360, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_SCELTAACCERT.SetFieldPage(PFL_SCELTAACCERT_TIPOAVANZO, -1, -1);
    PAN_SCELTAACCERT.SetFieldPanel(PFL_SCELTAACCERT_TIPOAVANZO, PPQRY_VARACC1, "B.TIPO_AVANZO", "VARACCTIPAVA", 3, 10, 0, -13997);
  }

  private void PAN_SCELTAACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAACCERT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~VARACTIPOVAR~~) ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_T56, 0, SQL, PFL_SCELTAACCERT_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_T56, 1, SQL, PFL_SCELTAACCERT_TIPOVAR, "");
    PAN_SCELTAACCERT.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAACCERT.SetIMDB(IMDB, "PQRY_VARACC1", true);
    PAN_SCELTAACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.NUMERO_ACC as VARACNUMEACC, ");
    SQL.append("  B.ANNO_ACC as VARACANNOACC, ");
    SQL.append("  B.CAPITOLO as VARACACCCAPI, ");
    SQL.append("  B.ARTICOLO as VARACACCARTI, ");
    SQL.append("  A.D_DATA_REG as VARADDATAREG, ");
    SQL.append("  A.DESCRIZIONE as VARACCDESCRI, ");
    SQL.append("  A.TIPO_VAR as VARACTIPOVAR, ");
    SQL.append("  A.UNITA_PROPONENTE as VARAUNITPROP, ");
    SQL.append("  A.NUMERO_PROPOSTA as VARANUMEPROP, ");
    SQL.append("  A.ANNO_PROPOSTA as VARAANNOPROP, ");
    SQL.append("  A.SEDE_DEL as VARACSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as VARACNUMEDEL, ");
    SQL.append("  A.ANNO_DEL as VARACANNODEL, ");
    SQL.append("  A.IMPORTO as VARACCIMPORT, ");
    SQL.append("  B.VOCE_ECON as VARACCVOCECO, ");
    SQL.append("  B.CODICE_GESTIONALE as VARACCCODGES, ");
    SQL.append("  B.CODICE_EUROPEO as VARACCCODEUR, ");
    SQL.append("  B.COD_LIVELLO_5 as VARACCCODLI5, ");
    SQL.append("  B.CAUSALE as VARACACCCAUS, ");
    SQL.append("  B.ESERCIZIO_SCADENZA as VARACCESESCA, ");
    SQL.append("  B.TIPO_VINCOLO as VARACCTIPVIN, ");
    SQL.append("  B.ANNO_PLUR as VARACCANNPLU, ");
    SQL.append("  B.NUMERO_PLUR as VARACCNUMPLU, ");
    SQL.append("  B.CENTRO as VARACACCCENT, ");
    SQL.append("  B.FATTORE as VARACACCFATT, ");
    SQL.append("  B.COMPETENZA_DAL as VARACCCOMDAL, ");
    SQL.append("  B.COMPETENZA_AL as VARAACCCOMAL, ");
    SQL.append("  B.NOTE as VARACACCNOTE, ");
    SQL.append("  B.RILEVANTE_ECO as VARACCRILECO, ");
    SQL.append("  B.COD_IMP_ECO as VARCODACCECO, ");
    SQL.append("  B.PROGETTO_ID as VARAACCPROID, ");
    SQL.append("  B.OBIETTIVO as VARACACCOBIE, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as VARACCPRUNOR, ");
    SQL.append("  B.SCHEDA_OBIETTIVO_ID as VARACCSCOBID, ");
    SQL.append("  B.COD_MONITORAGGIO as VARACCCODMON, ");
    SQL.append("  A.OPERA as VARVARACCOPE, ");
    SQL.append("  A.PROGRESSIVO as VARACCPROGRE, ");
    SQL.append("  B.DEBITORE as VARACACCDEBI, ");
    SQL.append("  B.FINANZIAMENTO as VARACACCFINA, ");
    SQL.append("  B.TIPO_AVANZO as VARACCTIPAVA ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARACC A, ");
    SQL.append("  ACC B ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   ((A.ACC_GENERATO IS NULL)) ");
    SQL.append("and   (A.ANNO_ESIGIBILITA = ~~TBL_PARAM136.PARAMESERCIZ~~) ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ACC, ");
    SQL.append("  B.NUMERO_ACC ");
    PAN_SCELTAACCERT.SetQuery(PPQRY_VARACC1, 5, SQL, -1, "");
    PAN_SCELTAACCERT.SetQueryDB(PPQRY_VARACC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAACCERT.SetMasterTable(0, "VARACC");
    PAN_SCELTAACCERT.AddToSortList(PFL_SCELTAACCERT_ANNOACC, true);
    PAN_SCELTAACCERT.AddToSortList(PFL_SCELTAACCERT_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAACCERT.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAACCERT.iUseListQBE;
      PAN_SCELTAACCERT.iUseListQBE = 0;
      PAN_SCELTAACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAACCERT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_SCELTAACCERT) PAN_SCELTAACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
