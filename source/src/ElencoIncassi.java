// **********************************************
// Elenco Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_PERIODIINCAS = 0;
  private static int GRP_PARAM_ANCINCGIAREG = 1;

  private static int PFL_PARAM_TIPOREGISTR1 = 0;
  private static int PFL_PARAM_TIPOBOLLATO1 = 1;
  private static int PFL_PARAM_DAL1 = 2;
  private static int PFL_PARAM_AL1 = 3;
  private static int PFL_PARAM_DAL = 4;
  private static int PFL_PARAM_AL = 5;
  private static int PFL_PARAM_TIPOREGIBOLL = 6;
  private static int PFL_PARAM_CORRISPETTIV = 7;

  private static int PPQRY_PARAM155 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_PARAM;
  private static int GRP_REGISTBOLLAT_INCASSO = 0;
  private static int GRP_REGISTBOLLAT_DOCUMENTO = 1;

  private static int PFL_REGISTBOLLAT_REGISTBOLLAT = 0;
  private static int PFL_REGISTBOLLAT_NUMERO1 = 1;
  private static int PFL_REGISTBOLLAT_DATA1 = 2;
  private static int PFL_REGISTBOLLAT_IMPORTO1 = 3;
  private static int PFL_REGISTBOLLAT_TIPO = 4;
  private static int PFL_REGISTBOLLAT_NUMERODOC = 5;
  private static int PFL_REGISTBOLLAT_INFO = 6;
  private static int PFL_REGISTBOLLAT_DATADOC = 7;
  private static int PFL_REGISTBOLLAT_IMPORTO = 8;
  private static int PFL_REGISTBOLLAT_DEBITORE = 9;
  private static int PFL_REGISTBOLLAT_DATAORDINATI = 10;
  private static int PFL_REGISTBOLLAT_ANNOPROG = 11;
  private static int PFL_REGISTBOLLAT_NUMEROPROG = 12;
  private static int PFL_REGISTBOLLAT_ANNODOC = 13;
  private static int PFL_REGISTBOLLAT_TIPOREGISTRO = 14;
  private static int PFL_REGISTBOLLAT_TIPOBOLLATO = 15;

  private static int PPQRY_ELENCINCAFS4 = 0;


  IDPanel PAN_REGISTBOLLAT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM107(IMDB);
    //
    //
    Init_PQRY_PARAM155(IMDB);
    Init_PQRY_PARAM155_RS(IMDB);
    Init_PQRY_ELENCINCAFS4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM107(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM107, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM107, "TBL_PARAM107");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARPERINCDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAPERINCAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAMREGODAL, "PARAMREGODAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAMREGODAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAMREGOLAL, "PARAMREGOLAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAMREGOLAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAELENMODI, "PARAELENMODI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM107,IMDBDef2.FLD_PARAM107_PARAELENMODI,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM107, 0);
  }

  private static void Init_PQRY_PARAM155(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM155, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM155, "PQRY_PARAM155");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARPERINCDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAPERINCAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAMREGODAL, "PARAMREGODAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAMREGODAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAMREGOLAL, "PARAMREGOLAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_PARAMREGOLAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155,IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM155, 0);
  }

  private static void Init_PQRY_PARAM155_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM155_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM155_RS, "PQRY_PARAM155_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARPERINCDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAPERINCAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAMREGODAL, "PARAMREGODAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAMREGODAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAMREGOLAL, "PARAMREGOLAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_PARAMREGOLAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM155_RS,IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO,1,2,0);
  }

  private static void Init_PQRY_ELENCINCAFS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ELENCINCAFS4, 19);
    IMDB.set_TblCode(IMDBDef9.PQRY_ELENCINCAFS4, "PQRY_ELENCINCAFS4");
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOREGIBOLL, "RECOREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOREGIBOLL,5,244,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOREGI, "RECOTIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOREGI,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOBOLL, "RECOTIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORNUMEDOC, "RECORNUMEDOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORANNODOC, "RECORANNODOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORANNODOC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDDATA, "RECORDDATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDNUMERO, "RECORDNUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDNUMERO,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORNUMEORD, "RECORNUMEORD");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORNUMEORD,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECODATAORDI, "RECODATAORDI");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECODATAORDI,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORT04DESC, "RECORT04DESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORT04DESC,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDATADOC, "RECORDATADOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATANNPRO, "RECFATANNPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATNUMPRO, "RECFATNUMPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATNUMPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATCODDOC, "RECFATCODDOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECFATCODDOC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDIMPOR1, "RECORDIMPOR1");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDIMPOR1,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDDEBITO, "RECORDDEBITO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDDEBITO,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_TIPO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDINFO, "RECORDINFO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ELENCINCAFS4,IMDBDef9.PQSL_ELENCINCAFS4_RECORDINFO,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_ELENCINCAFS4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoIncassi()
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
    FormIdx = MyGlb.FRM_ELENCOINCASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C98495FC-0C2A-46C5-9D74-245DB61259AA";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 466;
    set_Caption(new IDVariant("Elenco Incassi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 440;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.209091;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 92;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 92;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "61F91967-5E54-48CD-8F78-40FF8C34E2A5");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 912, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 348;
    Frames[3].Caption = "Registro Bollato";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 348;
    PAN_REGISTBOLLAT = new IDPanel(w, this, 3, "PAN_REGISTBOLLAT");
    Frames[3].Content = PAN_REGISTBOLLAT;
    PAN_REGISTBOLLAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGISTBOLLAT.VS = MainFrm.VisualStyleList;
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A1DF882B-DE91-42E6-9AED-49DD27A030E2");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1224, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGISTBOLLAT.InitStatus = 2;
    PAN_REGISTBOLLAT_Init();
    PAN_REGISTBOLLAT_InitFields();
    PAN_REGISTBOLLAT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG154+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGG8+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG154+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA30+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIORDIN3+BaseCmdLinIdx)
      {
        ProcEmissioneOrdinativi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSICORRIS+BaseCmdLinIdx)
      {
        ProcEmissioneCorrispettivi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CARICAINCASS+BaseCmdLinIdx)
      {
        CaricamentoIncassi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIORINCASS+BaseCmdLinIdx)
      {
        ApriElencoIncassiAggiornaIncassi();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM107, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCOINCASS_PARAM155();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_REGISTBOLLAT.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoIncassi.class.getName() : (Glb.ClassWithPackage(ElencoIncassi.class) ? ElencoIncassi.class.getName().substring(ElencoIncassi.class.getPackage().getName().length() + 1) : ElencoIncassi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_CORRISPETTIV))).equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_EMISSICORRIS+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_EMISSICORRIS+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "ParamOnDynamicProperties", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARPERINCDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAPERINCAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      PAN_REGISTBOLLAT.set_Header(Glb.OBJ_FIELD,PFL_REGISTBOLLAT_INFO, (new IDVariant("")).stringValue());
      // 
      // Parametro per poter rendere la maschera eventualmente modificabile
      // 
      {
        IDVariant v_SCHIAVE = null;
        v_SCHIAVE = (new IDVariant("PRODUCTS/CF"));
        IDVariant v_SSTRINGA = null;
        v_SSTRINGA = (new IDVariant("documenti_elenco_incassi_modificabile"));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(LOWER(A.VALORE), NULL) as NUVALOREVANU ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (LOWER(A.STRINGA) = LOWER(" + IDL.CSql(v_SSTRINGA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (A.CHIAVE = " + IDL.CSql(v_SCHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAELENMODI, 0, QV.Get("NUVALOREVANU", IDVariant.STRING));
        }
        QV.Close();
        if (IDL.Upper(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAELENMODI, 0),(new IDVariant("NO")))).equals((new IDVariant("SI")), true))
        {
          PAN_REGISTBOLLAT.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_CANUPDATE : 0, Glb.PAN_CANUPDATE); 
          PAN_REGISTBOLLAT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA30+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          PAN_REGISTBOLLAT.SetFlags (Glb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_REGISTBOLLAT.SetFlags (Glb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          // 
          // Abilito Multiselezione
          // 
          PAN_REGISTBOLLAT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "Load", _e);
    }
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
      // 
      // Se è stata aperta la maschera di aggiornamento massivo
      // incassi
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELEINCAGGINC)), true) && Result.booleanValue())
      {
        // 
        // Aggiorno e refresh
        // 
        if (AggiornaIncassi())
        {
          PAN_REGISTBOLLAT.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Salva
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      IDVariant v_IROW = null;
      v_IROW = (new IDVariant(1));
      IDVariant v_SNUMEROINCAS = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DDATAINCASSO = new IDVariant(0,IDVariant.DATETIME);
      for (v_IROW = (new IDVariant(1)); v_IROW.compareTo((new IDVariant(PAN_REGISTBOLLAT.NumRows)), true)<0; v_IROW = IDL.Add(v_IROW, (new IDVariant(1))))
      {
        v_SNUMEROINCAS = PAN_REGISTBOLLAT.GetValueAt(PFL_REGISTBOLLAT_NUMERO1,v_IROW.intValue());
        v_DDATAINCASSO = IDL.ToDateTime(PAN_REGISTBOLLAT.GetValueAt(PFL_REGISTBOLLAT_DATA1,v_IROW.intValue()));
        if (v_SNUMEROINCAS.compareTo(PAN_REGISTBOLLAT.GetOrgValue(PFL_REGISTBOLLAT_NUMERO1), true)!=0 || v_DDATAINCASSO.compareTo(IDL.ToDateTime(PAN_REGISTBOLLAT.GetOrgValue(PFL_REGISTBOLLAT_DATA1)), true)!=0)
        {
          IDVariant v_IANNODOC = null;
          v_IANNODOC = IDL.ToInteger(PAN_REGISTBOLLAT.GetValueAt(PFL_REGISTBOLLAT_ANNODOC,v_IROW.intValue()));
          IDVariant v_SNUMERODOC = null;
          v_SNUMERODOC = PAN_REGISTBOLLAT.GetValueAt(PFL_REGISTBOLLAT_NUMERODOC,v_IROW.intValue());
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            SQL = new StringBuffer();
            SQL.append("update INCASSI_FS4 set ");
            SQL.append("  NUMERO_INCASSO = " + IDL.CSql(v_SNUMEROINCAS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_INCASSO = " + IDL.CSql(v_DDATAINCASSO, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOREGI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECOTIPOBOLL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ANNO_DOC = " + IDL.CSql(v_IANNODOC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUMERO_DOC = " + IDL.CSql(v_SNUMERODOC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
          }
          MainFrm.Cf4armDBObject.CommitTrans();
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Incassi Aggiorna Incassi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriElencoIncassiAggiornaIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Incassi Aggiorna Incassi Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_REGISTBOLLAT.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_SMS = null;
        v_SMS = (new IDVariant("Ci sono modifiche in sospeso. Confermare o Annullare tali modifiche."));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      APRELEINAGIN_CAMPDAAGGDEL();
      MainFrm.Show(MyGlb.FRM_ELEINCAGGINC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "ApriElencoIncassiAggiornaIncassi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Campi Da Aggiornare: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void APRELEINAGIN_CAMPDAAGGDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_CAMPIDAAGGIO, IMDBDef2.FLD_CAMPIDAAGGIO_DATA_INCASSO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_CAMPIDAAGGIO, IMDBDef2.FLD_CAMPIDAAGGIO_NUMERO_INCASSO, 0, new IDVariant());
  }

  // **********************************************************************
  // Aggiorna Incassi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean AggiornaIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Incassi Body
      // Corpo Procedura
      // 
      IDVariant v_IROW = null;
      v_IROW = (new IDVariant(1));
      try
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_REGISTBOLLAT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_REGISTBOLLAT.GotoFirst();
        while (!PAN_REGISTBOLLAT.RSEOF())
        {
          if (PAN_REGISTBOLLAT.IsRowSelected(v_IROW.intValue()))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("update INCASSI_FS4 set ");
              SQL.append("  NUMERO_INCASSO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI557, IMDBDef9.PQSL_PARAMETRI557_NUMERO_INCASSO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  DATA_INCASSO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI557, IMDBDef9.PQSL_PARAMETRI557_DATA_INCASSO, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (TIPO_REGISTRO = " + IDL.CSql(C3.Get("RECOTIPOREGI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (TIPO_BOLLATO = " + IDL.CSql(C3.Get("RECOTIPOBOLL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (ANNO_DOC = " + IDL.CSql(C3.Get("RECORANNODOC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_DOC = " + IDL.CSql(C3.Get("RECORNUMEDOC"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e) {}
            v_IROW = IDL.Add(v_IROW, (new IDVariant(1)));
          }
          PAN_REGISTBOLLAT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      catch (Exception e6)
      {
        MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return (new IDVariant(0)).booleanValue();
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "AggiornaIncassi", _e);
      return false;
    }
  }

  // **********************************************************************
  // Proc Emissione Corrispettivi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ProcEmissioneCorrispettivi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proc Emissione Corrispettivi Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_PARPERINCDAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_PARAPERINCAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO, 0));
      MainFrm.Show(MyGlb.FRM_EMISCORRINCA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "ProcEmissioneCorrispettivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Caricamento Incassi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CaricamentoIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Caricamento Incassi Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO, 0));
      MainFrm.Show(MyGlb.FRM_CARICAINCASS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "CaricamentoIncassi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proc Emissione Ordinativi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ProcEmissioneOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proc Emissione Ordinativi Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_PARPERINCDAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_PARAPERINCAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_REGISTRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO, 0, IMDB.Value(IMDBDef9.PQRY_PARAM155, IMDBDef9.PQSL_PARAM155_TIPO_BOLLATO, 0));
      MainFrm.Show(MyGlb.FRM_EMISORDIINCA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "ProcEmissioneOrdinativi", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECFATANNPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECFATNUMPRO, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoIncassi", "ApriInfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENCOINCASS_PARAM155() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM155_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM107, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM107, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM155_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM155_RS, 0, IMDBDef2.TBL_PARAM107, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 0, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARPERINCDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 1, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAPERINCAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 2, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAMREGODAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 3, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_PARAMREGOLAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 4, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_TIPO_REGISTRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM155_RS, 5, 0, IMDBDef2.TBL_PARAM107, IMDBDef2.FLD_PARAM107_TIPO_BOLLATO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM107, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM107, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM107, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM155_RS, 0);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_REGISTBOLLAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_REGISTBOLLAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_REGISTBOLLAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGISTBOLLAT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGISTBOLLAT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_REGISTBOLLAT);
    // Stub
  }

  private void PAN_REGISTBOLLAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_REGISTBOLLAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_REGISTBOLLAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECODATAORDI, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_ELENCINCAFS4, IMDBDef9.PQSL_ELENCINCAFS4_RECODATAORDI, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_REGISTBOLLAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, "CAA8201D-AD0A-4B24-BE59-4139C3D44C41");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, "Periodo di Incasso");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, MyGlb.PANEL_FORM, 12, 18, 240, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, 0, 103);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_PERIODIINCAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, "B55551F8-2F93-4FA8-A069-5D35E20A90FD");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, "Anche Incassi già Regolarizzati");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, MyGlb.PANEL_FORM, 260, 18, 236, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, 0, 175);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_ANCINCGIAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, "2D36D7C2-CC21-4284-8285-533B637622A7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, "Tipo Registro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, "902DC963-5BA1-4E24-B4EF-51B6B66B3388");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, "Tipo Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, "918DD62B-5BE3-41B8-9205-8AD5DC75E448");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, "Dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, "1899FA8D-1E82-4264-A93E-9C1819EB755E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, "al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "21CFACBC-3AEC-4FBC-BB00-063292FE2173");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "0B8BD600-1BF1-4C63-B0F2-B9BF1C869893");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "F8E4813F-2C73-44A4-B557-0C7ED1D9F6C0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.VIS_NORFIECFHELE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, "7D75050A-11EA-4CCB-B28D-1979C6C81E70");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, "Corrispettivi");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_FORM, 372, 228, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_FORM, 136);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTR1, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGISTR1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGISTR1, PPQRY_PARAM155, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_FORM, 372, 252, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_FORM, 136);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOBOLLATO1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOBOLLATO1, PPQRY_PARAM155, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_FORM, 16, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_FORM, 32);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DAL1, -1, GRP_PARAM_PERIODIINCAS);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DAL1, PPQRY_PARAM155, "A.PARPERINCDAL", "PARPERINCDAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_LIST, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_LIST, "al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_FORM, 140, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL1, MyGlb.PANEL_FORM, "al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL1, -1, GRP_PARAM_PERIODIINCAS);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL1, PPQRY_PARAM155, "A.PARAPERINCAL", "PARAPERINCAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, "dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 264, 32, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, "dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DAL, -1, GRP_PARAM_ANCINCGIAREG);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DAL, PPQRY_PARAM155, "A.PARAMREGODAL", "PARAMREGODAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, "al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 384, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, "al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL, -1, GRP_PARAM_ANCINCGIAREG);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL, PPQRY_PARAM155, "A.PARAMREGOLAL", "PARAMREGOLAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 0, 36, 408, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 504, 12, 312, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGIBOLL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGIBOLL, PPQRY_T04, "TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 244, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_LIST, "Corrispettivi");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_FORM, 4, 60, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_FORM, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CORRISPETTIV, MyGlb.PANEL_FORM, "Corrispettivi");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CORRISPETTIV, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CORRISPETTIV, PPQRY_T04, "A.CORRISPETTIVI", "T04CORRISPET", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CORRISPETTIV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CORRISPETTIV, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.CORRISPETTIVI as T04CORRISPET, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    SQL.append("and   ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_PARAM.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_T04, "T04");
    PAN_PARAM.SetQueryLKE(PPQRY_T04, PFL_PARAM_TIPOREGISTR1, "T04TIPOREGIS");
    PAN_PARAM.SetQueryLKE(PPQRY_T04, PFL_PARAM_TIPOBOLLATO1, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.CORRISPETTIVI as T04CORRISPET, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_PARAM.SetQuery(PPQRY_T04, 1, SQL, -1, "");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_T04, "CODICE", "Codice");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_T04, "T04CORRISPET", "T04 CORRISPETTIVI");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_T04, "DESCRIZIONE", "Descrizione");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_T04, "DESCRIZIONE");
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM155", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM155, IMDBDef9.PQRY_PARAM155_RS, IMDBDef2.TBL_PARAM107);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGISTR1, IMDBDef2.FLD_PARAM107_TIPO_REGISTRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOBOLLATO1, IMDBDef2.FLD_PARAM107_TIPO_BOLLATO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DAL1, IMDBDef2.FLD_PARAM107_PARPERINCDAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL1, IMDBDef2.FLD_PARAM107_PARAPERINCAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DAL, IMDBDef2.FLD_PARAM107_PARAMREGODAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL, IMDBDef2.FLD_PARAM107_PARAMREGOLAL);
    PAN_PARAM.SetMasterTable(0, "PARAM107");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_REGISTBOLLAT_Init()
  {

    PAN_REGISTBOLLAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGISTBOLLAT.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, "2A738C3F-9349-4271-91F7-6D2196D72143");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, "Incasso");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, MyGlb.PANEL_LIST, 236, -9999, 280, 16, 0, 0);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, MyGlb.PANEL_FORM, 0, 27, 208, 97, 0, 0);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, 0, 44);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, 1, 13);
    PAN_REGISTBOLLAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, 0, 4);
    PAN_REGISTBOLLAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, 1, 4);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_INCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, "4DEAFF0B-FFE3-4F41-B886-68958D31283D");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, "Documento");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, MyGlb.PANEL_LIST, 516, -9999, 604, 16, 0, 0);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, MyGlb.PANEL_FORM, 0, 99, 572, 193, 0, 0);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, 0, 65);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, 1, 13);
    PAN_REGISTBOLLAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, 0, 4);
    PAN_REGISTBOLLAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, 1, 4);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_GROUP, GRP_REGISTBOLLAT_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_REGISTBOLLAT.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, "BE00ABD9-E2D5-41F9-9F58-C45B2BB5C566");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, "Registro/Bollato");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, "A85F9706-EBA0-4ACA-A4CB-2F70358FD98C");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, "Numero");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, "84399B37-83C9-4E0F-9482-68B08BF859A6");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, "Data");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, "E95C566B-FB9F-45BC-AF79-6159EF40BF6D");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, "Importo");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, "62569988-7EBC-401A-B2E1-2A82BF99C3FB");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, "Tipo");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, "B8B4F191-A3BB-4E28-9C74-433C1257B4E7");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, "Numero");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, "F4C39C41-BA3D-4284-B571-4F81D75AC752");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, "Info");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, "ECFE4080-EB8F-4531-9D6D-B4AF734CC2D8");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, "Data");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, "50435B07-8BD0-40BC-9894-00A5AECFEEE8");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, "Importo");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, "ACEF98E6-992A-4B8C-8251-63823A583AFE");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, "Debitore");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, "65FD1079-FC36-47C3-9914-85CB60F969F8");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, "Data Ordinativo");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, "F770AB8C-04B4-413C-95D2-C86F4A476F2D");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, "ANNO PROG");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, "20037E3F-D21B-42F3-BA7E-55BB254EBF93");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, "NUMERO PROG");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, "248B0BD4-60C4-4F86-958C-6E4B2C20612E");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, "ANNO DOC");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, "BA3B3859-B7CE-418C-89A3-202FD7E1CC6B");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTBOLLAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, "11CED1AD-F5B0-4CC4-9933-D960268507AD");
    PAN_REGISTBOLLAT.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_REGISTBOLLAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, "");
    PAN_REGISTBOLLAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTBOLLAT.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_REGISTBOLLAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_LIST, 0, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_LIST, 100);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_LIST, "Registro/Bollato");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_FORM, 4, 4, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_FORM, 100);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_FORM, 2);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_REGISTBOLLAT, MyGlb.PANEL_FORM, "Registro/Bollato");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_REGISTBOLLAT, -1, -1);
    PAN_REGISTBOLLAT.SetFieldUnbound(PFL_REGISTBOLLAT_REGISTBOLLAT, true);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_REGISTBOLLAT, PPQRY_ELENCINCAFS4, "TO_CHAR ( C.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( C.TIPO_BOLLATO ) || ' - ' || D.DESCRIZIONE", "RECOREGIBOLL", 5, 244, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_LIST, 236, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_LIST, 108);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_LIST, "Numero");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_FORM, 108);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERO1, MyGlb.PANEL_FORM, "Numero");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_NUMERO1, -1, GRP_REGISTBOLLAT_INCASSO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_NUMERO1, PPQRY_ELENCINCAFS4, "C.NUMERO_INCASSO", "RECORDNUMERO", 5, 10, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_LIST, 344, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_LIST, 92);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_FORM, 4, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_FORM, 92);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_DATA1, -1, GRP_REGISTBOLLAT_INCASSO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_DATA1, PPQRY_ELENCINCAFS4, "C.DATA_INCASSO", "RECORDDATA", 6, 19, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_LIST, 412, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_FORM, 4, 100, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_IMPORTO1, -1, GRP_REGISTBOLLAT_INCASSO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_IMPORTO1, PPQRY_ELENCINCAFS4, "C.IMPORTO", "RECORDIMPORT", 3, 14, 2, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_LIST, 516, 36, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_LIST, 56);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_FORM, 4, 124, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_FORM, 56);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_TIPO, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldUnbound(PFL_REGISTBOLLAT_TIPO, true);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_TIPO, PPQRY_ELENCINCAFS4, "DECODE(E.CODICE, 3, 'Fattura', DECODE(E.CODICE, 6, 'Nota Cont.', DECODE(E.CODICE, 8, 'Nota Add.', E.DESCRIZIONE)))", "TIPO", 5, 99, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_LIST, 628, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_FORM, 4, 148, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_NUMERODOC, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_NUMERODOC, PPQRY_ELENCINCAFS4, "C.NUMERO_DOC", "RECORNUMEDOC", 5, 20, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_LIST, 712, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_LIST, 32);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_FORM, 4, 268, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_FORM, 32);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_INFO, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldUnbound(PFL_REGISTBOLLAT_INFO, true);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_INFO, PPQRY_ELENCINCAFS4, "'I'", "RECORDINFO", 5, 1, 0, -13997);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_REGISTBOLLAT.SetValueListItem(PFL_REGISTBOLLAT_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_LIST, 736, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_LIST, 76);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_FORM, 76);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_DATADOC, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_DATADOC, PPQRY_ELENCINCAFS4, "B.D_DATA_DOC", "RECORDATADOC", 6, 10, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_LIST, 820, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_IMPORTO, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_IMPORTO, PPQRY_ELENCINCAFS4, "B.IMPORTO", "RECORDIMPOR1", 3, 14, 2, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_LIST, 912, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_LIST, 108);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_FORM, 4, 220, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_FORM, 108);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_DEBITORE, -1, GRP_REGISTBOLLAT_DOCUMENTO);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_DEBITORE, PPQRY_ELENCINCAFS4, "A.RAGIONE_SOCIALE", "RECORDDEBITO", 5, 40, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_LIST, 1120, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_LIST, 80);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_LIST, "Data Ordinativo");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_FORM, 4, 244, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_FORM, 80);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_DATAORDINATI, MyGlb.PANEL_FORM, "Dt. Ordin.");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_DATAORDINATI, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_DATAORDINATI, PPQRY_ELENCINCAFS4, "G.D_DATA_ORD", "RECODATAORDI", 6, 19, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_FORM, 4, 292, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_FORM, 72);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_ANNOPROG, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_ANNOPROG, PPQRY_ELENCINCAFS4, "B.ANNO_PROG", "RECFATANNPRO", 1, 4, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_FORM, 4, 292, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_FORM, 92);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_NUMEROPROG, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_NUMEROPROG, PPQRY_ELENCINCAFS4, "B.NUMERO_PROG", "RECFATNUMPRO", 1, 5, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_LIST, 1224, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_FORM, 4, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_ANNODOC, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_ANNODOC, PPQRY_ELENCINCAFS4, "C.ANNO_DOC", "RECORANNODOC", 1, 4, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_LIST, 96);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 292, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOREGISTRO, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_TIPOREGISTRO, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_TIPOREGISTRO, PPQRY_ELENCINCAFS4, "C.TIPO_REGISTRO", "RECOTIPOREGI", 1, 2, 0, -13997);
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_LIST, 88);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_REGISTBOLLAT.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTBOLLAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_FORM, 88);
    PAN_REGISTBOLLAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTBOLLAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTBOLLAT_TIPOBOLLATO, MyGlb.PANEL_FORM, "TIPO BOLLATO");
    PAN_REGISTBOLLAT.SetFieldPage(PFL_REGISTBOLLAT_TIPOBOLLATO, -1, -1);
    PAN_REGISTBOLLAT.SetFieldPanel(PFL_REGISTBOLLAT_TIPOBOLLATO, PPQRY_ELENCINCAFS4, "C.TIPO_BOLLATO", "RECOTIPOBOLL", 1, 2, 0, -13997);
  }

  private void PAN_REGISTBOLLAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGISTBOLLAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_REGISTBOLLAT.SetIMDB(IMDB, "PQRY_ELENCINCAFS4", true);
    PAN_REGISTBOLLAT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( C.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( C.TIPO_BOLLATO ) || ' - ' || D.DESCRIZIONE as RECOREGIBOLL, ");
    SQL.append("  C.TIPO_REGISTRO as RECOTIPOREGI, ");
    SQL.append("  C.TIPO_BOLLATO as RECOTIPOBOLL, ");
    SQL.append("  C.NUMERO_DOC as RECORNUMEDOC, ");
    SQL.append("  C.ANNO_DOC as RECORANNODOC, ");
    SQL.append("  C.DATA_INCASSO as RECORDDATA, ");
    SQL.append("  C.NUMERO_INCASSO as RECORDNUMERO, ");
    SQL.append("  C.IMPORTO as RECORDIMPORT, ");
    SQL.append("  G.NUMERO_ORD as RECORNUMEORD, ");
    SQL.append("  G.D_DATA_ORD as RECODATAORDI, ");
    SQL.append("  D.DESCRIZIONE as RECORT04DESC, ");
    SQL.append("  B.D_DATA_DOC as RECORDATADOC, ");
    SQL.append("  B.ANNO_PROG as RECFATANNPRO, ");
    SQL.append("  B.NUMERO_PROG as RECFATNUMPRO, ");
    SQL.append("  B.CODICE_DOC as RECFATCODDOC, ");
    SQL.append("  B.IMPORTO as RECORDIMPOR1, ");
    SQL.append("  A.RAGIONE_SOCIALE as RECORDDEBITO, ");
    SQL.append("  DECODE(E.CODICE, 3, 'Fattura', DECODE(E.CODICE, 6, 'Nota Cont.', DECODE(E.CODICE, 8, 'Nota Add.', E.DESCRIZIONE))) as TIPO, ");
    SQL.append("  'I' as RECORDINFO ");
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BEN A, ");
    SQL.append("  FAT B, ");
    SQL.append("  INCASSI_FS4 C, ");
    SQL.append("  T04 D, ");
    SQL.append("  T03 E, ");
    SQL.append("  PRE F, ");
    SQL.append("  ORD G ");
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE(+) = B.CODICE) ");
    SQL.append("and   (B.ANNO_DOC = C.ANNO_DOC) ");
    SQL.append("and   (C.TIPO_REGISTRO = D.TIPO_REGISTRO) ");
    SQL.append("and   (C.TIPO_BOLLATO = D.TIPO_BOLLATO) ");
    SQL.append("and   (C.NUMERO_DOC = B.NUMERO_DOC) ");
    SQL.append("and   (C.TIPO_REGISTRO = ~~TBL_PARAM107.TIPO_REGISTRO~~) ");
    SQL.append("and   (C.TIPO_BOLLATO = ~~TBL_PARAM107.TIPO_BOLLATO~~) ");
    SQL.append("and   (E.STORNO = 0) ");
    SQL.append("and   (B.CODICE_DOC = E.CODICE) ");
    SQL.append("and   (F.ANNO_ORD = G.ANNO_ORD(+)) ");
    SQL.append("and   (F.NUMERO_ORD = G.NUMERO_ORD(+)) ");
    SQL.append("and   (((C.ANNO_PRE IS NULL) AND (~~PQRY_PARAM155.PARAMREGODAL~~ IS NULL) AND (~~PQRY_PARAM155.PARAMREGOLAL~~ IS NULL)) OR (NOT ((C.ANNO_PRE IS NULL)) AND (C.ANNO_PRE = ~~TBL_DATISESSIONE.SESSIOESERCI~~) AND (F.D_DATA_REG BETWEEN ~~PQRY_PARAM155.PARAMREGODAL~~ AND ~~PQRY_PARAM155.PARAMREGOLAL~~))) ");
    SQL.append("and   (F.ANNO_PRE(+) = C.ANNO_PRE) ");
    SQL.append("and   (F.NUMERO_PRE(+) = C.NUMERO_PRE) ");
    SQL.append("and   ((C.DATA_INCASSO BETWEEN ~~PQRY_PARAM155.PARPERINCDAL~~ AND ~~PQRY_PARAM155.PARAPERINCAL~~)) ");
    SQL.append("and   (C.TIPO_BOLLATO = NVL(~~PQRY_PARAM155.TIPO_BOLLATO~~, C.TIPO_BOLLATO)) ");
    SQL.append("and   (C.TIPO_REGISTRO = NVL(~~PQRY_PARAM155.TIPO_REGISTRO~~, C.TIPO_REGISTRO)) ");
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTBOLLAT.SetQuery(PPQRY_ELENCINCAFS4, 5, SQL, -1, "");
    PAN_REGISTBOLLAT.SetQueryDB(PPQRY_ELENCINCAFS4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGISTBOLLAT.SetMasterTable(0, "FAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGISTBOLLAT.Status() == 2)
    {
      int oldListQBE = PAN_REGISTBOLLAT.iUseListQBE;
      PAN_REGISTBOLLAT.iUseListQBE = 0;
      PAN_REGISTBOLLAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGISTBOLLAT.PanelCommand(Glb.PCM_FIND);
      PAN_REGISTBOLLAT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_REGISTBOLLAT) PAN_REGISTBOLLAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_REGISTBOLLAT) PAN_REGISTBOLLAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_REGISTBOLLAT) PAN_REGISTBOLLAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_REGISTBOLLAT) PAN_REGISTBOLLAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_REGISTBOLLAT) PAN_REGISTBOLLAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
