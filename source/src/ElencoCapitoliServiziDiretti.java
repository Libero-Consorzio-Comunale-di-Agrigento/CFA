// **********************************************
// Elenco Capitoli Servizi Diretti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoCapitoliServiziDiretti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  ATree TRE_ELENFUNZSERV;
  private static int PFL_ELENCVOCIPEG_CAPITOLO = 0;
  private static int PFL_ELENCVOCIPEG_ARTICOLO = 1;
  private static int PFL_ELENCVOCIPEG_DESCRIZIONE = 2;
  private static int PFL_ELENCVOCIPEG_STANZIAMENTO = 3;
  private static int PFL_ELENCVOCIPEG_VOCEPEGLABEL = 4;

  private static int PPQRY_BILBPR = 0;


  IDPanel PAN_ELENCVOCIPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI253(IMDB);
    Init_TBL_NODOCORRENTE(IMDB);
    //
    //
    Init_PQRY_DUAL37(IMDB);
    Init_PQRY_FUNZIONI(IMDB);
    Init_PQRY_SERVIZI(IMDB);
    Init_PQRY_BILBPR(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI253(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI253, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI253, "TBL_PARAMETRI253");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI253,IMDBDef2.FLD_PARAMETRI253_PARAMSERVIZI, "PARAMSERVIZI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI253,IMDBDef2.FLD_PARAMETRI253_PARAMSERVIZI,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI253,IMDBDef2.FLD_PARAMETRI253_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI253,IMDBDef2.FLD_PARAMETRI253_PARAMTIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI253, 0);
  }

  private static void Init_TBL_NODOCORRENTE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NODOCORRENTE, 3);
    IMDB.set_TblCode(IMDBDef2.TBL_NODOCORRENTE, "TBL_NODOCORRENTE");
    IMDB.set_FldCode(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE, "NODCORENTSPE");
    IMDB.SetFldParams(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ, "NODOCORRFUNZ");
    IMDB.SetFldParams(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV, "NODOCORRSERV");
    IMDB.SetFldParams(IMDBDef2.TBL_NODOCORRENTE,IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NODOCORRENTE, 0);
  }

  private static void Init_PQRY_DUAL37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DUAL37, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_DUAL37, "PQRY_DUAL37");
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDDESCRI,5,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDENTRAT, "RECORDENTRAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDENTRAT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDFUNZIO, "RECORDFUNZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDFUNZIO,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDSERVIZ, "RECORDSERVIZ");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDSERVIZ,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_ICON,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDTOOLTI, "RECORDTOOLTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_DUAL37,IMDBDef9.PQSL_DUAL37_RECORDTOOLTI,5,7,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_DUAL37, 0);
  }

  private static void Init_PQRY_FUNZIONI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FUNZIONI, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_FUNZIONI, "PQRY_FUNZIONI");
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDDESCRI,5,251,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECOENTRSPES, "RECOENTRSPES");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECOENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDSERVIZ, "RECORDSERVIZ");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDSERVIZ,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_ICON,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDTOOLTI, "RECORDTOOLTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FUNZIONI,IMDBDef9.PQSL_FUNZIONI_RECORDTOOLTI,5,242,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FUNZIONI, 0);
  }

  private static void Init_PQRY_SERVIZI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SERVIZI, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_SERVIZI, "PQRY_SERVIZI");
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDDESCRI,5,251,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_ENTRATASPESA, "ENTRATASPESA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_ENTRATASPESA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDFUNZIO, "RECORDFUNZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDFUNZIO,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_ICON,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDTOOLTI, "RECORDTOOLTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERVIZI,IMDBDef9.PQSL_SERVIZI_RECORDTOOLTI,5,251,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_SERVIZI, 0);
  }

  private static void Init_PQRY_BILBPR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_BILBPR, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_BILBPR, "PQRY_BILBPR");
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_TIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_ESERCIZIO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_BILBPRSTANZI, "BILBPRSTANZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_BILBPR,IMDBDef9.PQSL_BILBPR_BILBPRSTANZI,2,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_BILBPR, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoCapitoliServiziDiretti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoCapitoliServiziDiretti()
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
    FormIdx = MyGlb.FRM_ELECAPSERDIR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BE25D253-F8FA-4A67-8032-BB25D8358A6A";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 808;
    DesignHeight = 462;
    set_Caption(new IDVariant("Elenco Capitoli"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 808;
    Frames[1].Height = 436;
    Frames[1].FormFactor = 0.356436;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 288;
    Frames[2].Height = 436;
    Frames[2].Caption = "Elenco Funzioni Servizi";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 436;
    TRE_ELENFUNZSERV = new ATree(this);
    Frames[2].Content = TRE_ELENFUNZSERV;
    TRE_ELENFUNZSERV.Width = 288;
    TRE_ELENFUNZSERV.Height = 406;
    TRE_ELENFUNZSERV.FrIndex = 2;
    TRE_ELENFUNZSERV.Code = "TRE_ELENFUNZSERV";
    TRE_ELENFUNZSERV.iGuid = "F7D4B0B9-67F7-4020-BA6F-7DD97CE16EAD";
    TRE_ELENFUNZSERV.SetItemCount(3);
    Item = new ATreeItem();
    TRE_ELENFUNZSERV.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Entrata Spesa";
    Item.HasTooltip = true;
    Item.iGuid = "EEA9FDC1-D4C3-4374-8175-453AC1FFE33E";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Entrata' as RECORDDESCRI, ");
    SQL.append("  'E' as RECORDENTRAT, ");
    SQL.append("  to_number(NULL) as RECORDFUNZIO, ");
    SQL.append("  to_number(NULL) as RECORDSERVIZ, ");
    SQL.append("  'DirClose.gif' as ICON, ");
    SQL.append("  'Entrata' as RECORDTOOLTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'Spesa', ");
    SQL.append("  'S', ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'DirOpen.gif', ");
    SQL.append("  'Spesa' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef9.PQRY_DUAL37);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ELENFUNZSERV.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Funzioni";
    Item.HasTooltip = true;
    Item.iGuid = "310BC61A-D934-44AE-B098-261864C84F3C";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Funzione' || ' ' || TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  ~~PQRY_DUAL37.RECORDENTRAT~~ as RECOENTRSPES, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  to_number(NULL) as RECORDSERVIZ, ");
    SQL.append("  'Funzione.gif' as ICON, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as RECORDTOOLTI ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef9.PQRY_FUNZIONI);
    Item.AddPK("FUNZIONE");
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ELENFUNZSERV.SetItem(3,Item);
    Item.ItemIndex = "N00003";
    Item.Tooltip = "";
    Item.Name = "Servizi";
    Item.HasTooltip = true;
    Item.iGuid = "3E7F5B9D-AD30-4E0B-A90F-0279FBAA8C24";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Servizio' || ' ' || TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  ~~PQRY_DUAL37.RECORDENTRAT~~ as ENTRATASPESA, ");
    SQL.append("  ~~PQRY_FUNZIONI.FUNZIONE~~ as RECORDFUNZIO, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  'Servizio.gif' as ICON, ");
    SQL.append("  'Servizio' || ' ' || TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as RECORDTOOLTI ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.FUNZIONE = ~~PQRY_FUNZIONI.FUNZIONE~~) ");
    SQL.append("order by ");
    SQL.append("  A.SERVIZIO ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef9.PQRY_SERVIZI);
    Item.AddPK("RECORDFUNZIO");
    Item.AddPK("SERVIZIO");
    Item = TRE_ELENFUNZSERV.GetItem(1);
    Item.SetItem(1, TRE_ELENFUNZSERV.GetItem(2));
    Item = TRE_ELENFUNZSERV.GetItem(2);
    Item.Parent = TRE_ELENFUNZSERV.GetItem(1);
    Item.SetItem(1, TRE_ELENFUNZSERV.GetItem(3));
    Item = TRE_ELENFUNZSERV.GetItem(3);
    Item.Parent = TRE_ELENFUNZSERV.GetItem(2);
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 520;
    Frames[3].Height = 436;
    Frames[3].Caption = "Elenco Voci Peg";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 436;
    PAN_ELENCVOCIPEG = new IDPanel(w, this, 3, "PAN_ELENCVOCIPEG");
    Frames[3].Content = PAN_ELENCVOCIPEG;
    PAN_ELENCVOCIPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCVOCIPEG.VS = MainFrm.VisualStyleList;
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 520-MyGlb.PAN_OFFS_X, 436-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "96C67FAD-BB06-4A74-91E6-2013D03C3353");
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 472, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCVOCIPEG.InitStatus = 2;
    PAN_ELENCVOCIPEG_Init();
    PAN_ELENCVOCIPEG_InitFields();
    PAN_ELENCVOCIPEG_InitQueries();
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
      PAN_ELENCVOCIPEG.UpdatePanel(MainFrm);
      TRE_ELENFUNZSERV.UpdateTree(MainFrm);
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
    return (obj instanceof ElencoCapitoliServiziDiretti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoCapitoliServiziDiretti.class.getName() : (Glb.ClassWithPackage(ElencoCapitoliServiziDiretti.class) ? ElencoCapitoliServiziDiretti.class.getName().substring(ElencoCapitoliServiziDiretti.class.getPackage().getName().length() + 1) : ElencoCapitoliServiziDiretti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Elenco Capitoli", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      Frames[PAN_ELENCVOCIPEG.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      PAN_ELENCVOCIPEG.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCVOCIPEG.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCapitoliServiziDiretti", "LoadEvent", _e);
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
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      IDVariant J = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_ELENCVOCIPEG.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ELENCVOCIPEG.GotoFirst();
      while (!PAN_ELENCVOCIPEG.RSEOF())
      {
        if (PAN_ELENCVOCIPEG.IsRowSelected(I.intValue()))
        {
          try
          {
            UNLOADEVENT_IMDSERINSVAL(C2.Get("ESERCIZIO"), C2.Get("E_S"), C2.Get("CAPITOLO"), C2.Get("ARTICOLO"));
            J = IDL.Add(J, (new IDVariant(1)));
          }
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
            PAN_ELENCVOCIPEG.SetRowSelected((new IDVariant(0)).booleanValue(), I.intValue()); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENCVOCIPEG.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI253, IMDBDef2.FLD_PARAMETRI253_PARAMSERVIZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCapitoliServiziDiretti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // IMDB Sercos: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void UNLOADEVENT_IMDSERINSVAL(IDVariant C2_ESERCIZIO, IDVariant C2_E_S, IDVariant C2_CAPITOLO, IDVariant C2_ARTICOLO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_IMDBSERCOS, 0);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO, 0, C2_ESERCIZIO);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_SERVIZIO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI253, IMDBDef2.FLD_PARAMETRI253_PARAMSERVIZI, 0));
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_E_S, 0, C2_E_S);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_CAPITOLO, 0, C2_CAPITOLO);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD, 0, C2_CAPITOLO);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_ARTICOLO, 0, C2_ARTICOLO);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD, 0, C2_ARTICOLO);
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_TIPO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0));
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO, 0, IDL.Today());
    IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT, 0, (new IDVariant("I")));
  }

  // **********************************************************************
  // Setta Valori Entrata Spesa
  // **********************************************************************
  public int SettaValoriEntrataSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Entrata Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE, 0, IMDB.Value(IMDBDef9.PQRY_DUAL37, IMDBDef9.PQSL_DUAL37_RECORDENTRAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCapitoliServiziDiretti", "SettaValoriEntrataSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Funzione
  // **********************************************************************
  public int SettaValoriFunzione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Funzione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE, 0, IMDB.Value(IMDBDef9.PQRY_DUAL37, IMDBDef9.PQSL_DUAL37_RECORDENTRAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ, 0, IMDB.Value(IMDBDef9.PQRY_FUNZIONI, IMDBDef9.PQSL_FUNZIONI_FUNZIONE, 0));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCapitoliServiziDiretti", "SettaValoriFunzione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Servizio
  // **********************************************************************
  public int SettaValoriServizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Servizio Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODCORENTSPE, 0, IMDB.Value(IMDBDef9.PQRY_DUAL37, IMDBDef9.PQSL_DUAL37_RECORDENTRAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRFUNZ, 0, IMDB.Value(IMDBDef9.PQRY_SERVIZI, IMDBDef9.PQSL_SERVIZI_RECORDFUNZIO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NODOCORRENTE, IMDBDef2.FLD_NODOCORRENTE_NODOCORRSERV, 0, IMDB.Value(IMDBDef9.PQRY_SERVIZI, IMDBDef9.PQSL_SERVIZI_SERVIZIO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCapitoliServiziDiretti", "SettaValoriServizio", _e);
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
  private void TRE_ELENFUNZSERV_NodeClick(ATreeNode Node)
  {
    if (TRE_ELENFUNZSERV.NodeClick(MainFrm, Node))
    {
      if (Node.Key.substring(0,6).equals("N00001"))
      {
      SettaValoriEntrataSpesa();
      }
      if (Node.Key.substring(0,6).equals("N00002"))
      {
      SettaValoriFunzione();
      }
      if (Node.Key.substring(0,6).equals("N00003"))
      {
      SettaValoriServizio();
      }
    }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENCVOCIPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCVOCIPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCVOCIPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCVOCIPEG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCVOCIPEG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCVOCIPEG);
    // Stub
  }

  private void PAN_ELENCVOCIPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENCVOCIPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCVOCIPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCVOCIPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCVOCIPEG_Init()
  {

    PAN_ELENCVOCIPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCVOCIPEG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCVOCIPEG.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, "6007BF0F-F5C0-4B23-9F76-BCBF7ECCDA19");
    PAN_ELENCVOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, "CAPITOLO");
    PAN_ELENCVOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, "");
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, "6E7BA3E2-5B5E-47C5-98DB-DA27A10460D3");
    PAN_ELENCVOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, "ARTICOLO");
    PAN_ELENCVOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, "");
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, "E839E940-A5B2-4E5C-ACCF-C1B4A8750871");
    PAN_ELENCVOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, "Descrizione");
    PAN_ELENCVOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, "");
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, "6FCEC367-8646-4638-BF39-D8751155F430");
    PAN_ELENCVOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, "Stanziamento");
    PAN_ELENCVOCIPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, "");
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCVOCIPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, "C338D389-94F1-4F45-AC07-C46BDBBFE26F");
    PAN_ELENCVOCIPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, "Capitolo/Art.");
    PAN_ELENCVOCIPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCVOCIPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENCVOCIPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 212, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ELENCVOCIPEG.SetFieldPage(PFL_ELENCVOCIPEG_CAPITOLO, -1, -1);
    PAN_ELENCVOCIPEG.SetFieldPanel(PFL_ELENCVOCIPEG_CAPITOLO, PPQRY_BILBPR, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 124, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 356, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 72);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCVOCIPEG.SetFieldPage(PFL_ELENCVOCIPEG_ARTICOLO, -1, -1);
    PAN_ELENCVOCIPEG.SetFieldPanel(PFL_ELENCVOCIPEG_ARTICOLO, PPQRY_BILBPR, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 148, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ELENCVOCIPEG.SetFieldPage(PFL_ELENCVOCIPEG_DESCRIZIONE, -1, -1);
    PAN_ELENCVOCIPEG.SetFieldPanel(PFL_ELENCVOCIPEG_DESCRIZIONE, PPQRY_BILBPR, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_LIST, 384, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCVOCIPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziam.");
    PAN_ELENCVOCIPEG.SetFieldPage(PFL_ELENCVOCIPEG_STANZIAMENTO, -1, -1);
    PAN_ELENCVOCIPEG.SetFieldUnbound(PFL_ELENCVOCIPEG_STANZIAMENTO, true);
    PAN_ELENCVOCIPEG.SetFieldPanel(PFL_ELENCVOCIPEG_STANZIAMENTO, PPQRY_BILBPR, "A.STN_INI_CO + A.VARIAZIONI_CO", "BILBPRSTANZI", 2, 19, 0, -13997);
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0, 0, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ELENCVOCIPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCVOCIPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ELENCVOCIPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCVOCIPEG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCVOCIPEG.SetFieldPage(PFL_ELENCVOCIPEG_VOCEPEGLABEL, -1, -1);
    PAN_ELENCVOCIPEG.SetFieldPanel(PFL_ELENCVOCIPEG_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
  }

  private void PAN_ELENCVOCIPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCVOCIPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCVOCIPEG.SetIMDB(IMDB, "PQRY_BILBPR", true);
    PAN_ELENCVOCIPEG.set_SetString(MyGlb.MASTER_ROWNAME, "BILBPR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as BILBPRSTANZI ");
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BILBPR A, ");
    SQL.append("  CAP B ");
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_NODOCORRENTE.NODCORENTSPE~~) ");
    SQL.append("and   ((~~TBL_NODOCORRENTE.NODCORENTSPE~~ = 'S' AND B.TITOLO = 1) OR ~~TBL_NODOCORRENTE.NODCORENTSPE~~ = 'E') ");
    SQL.append("and   (B.FUNZIONE = NVL(~~TBL_NODOCORRENTE.NODOCORRFUNZ~~, B.FUNZIONE)) ");
    SQL.append("and   (B.SERVIZIO = NVL(~~TBL_NODOCORRENTE.NODOCORRSERV~~, B.SERVIZIO)) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (A.TIPO = NVL(" + IDL.CSql(MainFrm.CONTROSERCOS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E')) ");
    SQL.append("and   ((TO_CHAR ( A.CAPITOLO ) || TO_CHAR ( A.ARTICOLO )) NOT IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( C.CAPITOLO ) || TO_CHAR ( C.ARTICOLO ) ");
    SQL.append("from ");
    SQL.append("  SERCOS C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (C.SERVIZIO = ~~TBL_PARAMETRI253.PARAMSERVIZI~~) ");
    SQL.append("and   (C.TIPO = ~~TBL_PARAMETRI253.PARAMTIPO~~) ");
    SQL.append(")) ");
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_ELENCVOCIPEG.SetQuery(PPQRY_BILBPR, 5, SQL, -1, "");
    PAN_ELENCVOCIPEG.SetQueryDB(PPQRY_BILBPR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCVOCIPEG.SetMasterTable(0, "BILBPR");
    PAN_ELENCVOCIPEG.AddToSortList(PFL_ELENCVOCIPEG_CAPITOLO, true);
    PAN_ELENCVOCIPEG.AddToSortList(PFL_ELENCVOCIPEG_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCVOCIPEG.Status() == 2)
    {
      int oldListQBE = PAN_ELENCVOCIPEG.iUseListQBE;
      PAN_ELENCVOCIPEG.iUseListQBE = 0;
      PAN_ELENCVOCIPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCVOCIPEG.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCVOCIPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCVOCIPEG) PAN_ELENCVOCIPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCVOCIPEG) PAN_ELENCVOCIPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCVOCIPEG) PAN_ELENCVOCIPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCVOCIPEG) PAN_ELENCVOCIPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCVOCIPEG) PAN_ELENCVOCIPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_ELENFUNZSERV) TRE_ELENFUNZSERV_NodeClick(Node);
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
