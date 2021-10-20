// **********************************************
// Estremi Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstremiVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_MODALITA = 0;
  private static int GRP_PARAM_PROVVEDIMENT = 1;

  private static int PFL_PARAM_TIPOVARIAZI1 = 0;
  private static int PFL_PARAM_TIPOIMPORTO = 1;
  private static int PFL_PARAM_PARTELABEL = 2;
  private static int PFL_PARAM_QUADRATURA = 3;
  private static int PFL_PARAM_TIPOVARDESC = 4;
  private static int PFL_PARAM_TIPOVARIAZIO = 5;
  private static int PFL_PARAM_AAA2 = 6;
  private static int PFL_PARAM_AAA1 = 7;
  private static int PFL_PARAM_PARTE = 8;
  private static int PFL_PARAM_LABEL = 9;
  private static int PFL_PARAM_DELIBERA = 10;
  private static int PFL_PARAM_NUMERODEL = 11;
  private static int PFL_PARAM_LABEL1 = 12;
  private static int PFL_PARAM_ANNODEL = 13;
  private static int PFL_PARAM_LABEL2 = 14;
  private static int PFL_PARAM_PROPOSTA = 15;
  private static int PFL_PARAM_LABEL3 = 16;
  private static int PFL_PARAM_NUMEROPROP = 17;
  private static int PFL_PARAM_LABEL4 = 18;
  private static int PFL_PARAM_ANNOPROP = 19;
  private static int PFL_PARAM_SELEZIDELIBE = 20;
  private static int PFL_PARAM_SELEZIPROPOS = 21;
  private static int PFL_PARAM_INFODELIBERE = 22;
  private static int PFL_PARAM_INFOPROPOSTA = 23;
  private static int PFL_PARAM_AAA = 24;
  private static int PFL_PARAM_NUOVCAMPSTAT = 25;
  private static int PFL_PARAM_SF = 26;
  private static int PFL_PARAM_ETICHETTAS = 27;
  private static int PFL_PARAM_ETICHETRASPA = 28;
  private static int PFL_PARAM_LABELAVANTI = 29;
  private static int PFL_PARAM_ANCHESUPLURI = 30;
  private static int PFL_PARAM_NONCANCELLA1 = 31;
  private static int PFL_PARAM_NONCANCELLA2 = 32;
  private static int PFL_PARAM_NONCANCELLA3 = 33;
  private static int PFL_PARAM_NONCANCELLA4 = 34;
  private static int PFL_PARAM_NONCANCELLA5 = 35;
  private static int PFL_PARAM_NONCANCELLA6 = 36;
  private static int PFL_PARAM_NONCANCELLA7 = 37;
  private static int PFL_PARAM_ANCHEPLURIEN = 38;
  private static int PFL_PARAM_ETICHETTAASD = 39;
  private static int PFL_PARAM_TIPIVARIDIVE = 40;
  private static int PFL_PARAM_TIPIMPVBIDES = 41;

  private static int PPQRY_PARAM117 = 0;

  private static int PPQRY_T54 = 1;
  private static int PPQRY_TIPIIMPOVBIL = 2;

  private static int PPQRY_T55 = 3;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM10(IMDB);
    //
    //
    Init_PQRY_PARAM117(IMDB);
    Init_PQRY_PARAM117_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM10, 19);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM10, "TBL_PARAM10");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, "ESTRTIPOIMPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREMIPARTE, "ESTREMIPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREMIPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANCSUPLU, "ESTRANCSUPLU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANCSUPLU,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRESEDEDEL, "ESTRESEDEDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRESEDEDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRENUMEDEL, "ESTRENUMEDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRENUMEDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREANNODEL, "ESTREANNODEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRUNITPROP, "ESTRUNITPROP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRNUMEPROP, "ESTRNUMEPROP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRNUMEPROP,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANNOPROP, "ESTRANNOPROP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, "ESTRTIPOVARI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOVARI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, "ESTRDEFIOPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANCHPLUR, "ESTRANCHPLUR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRANCHPLUR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRPLURVISI, "ESTRPLURVISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRPLURVISI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRSESTECOD, "ESTRSESTECOD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRSESTECOD,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRSESTEFIN, "ESTRSESTEFIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRSESTEFIN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTTIPVARDIV, "ESTTIPVARDIV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTTIPVARDIV,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTMULTIPVAR, "ESTMULTIPVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTMULTIPVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREMTIPOLO, "ESTREMTIPOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTREMTIPOLO,5,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, "ESTRTIPOREIS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM10,IMDBDef3.FLD_PARAM10_ESTRTIPOREIS,5,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM10, 0);
  }

  private static void Init_PQRY_PARAM117(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM117, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM117, "PQRY_PARAM117");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, "ESTRTIPOIMPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTREMIPARTE, "ESTREMIPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTREMIPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANCSUPLU, "ESTRANCSUPLU");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANCSUPLU,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, "ESTRESEDEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, "ESTRENUMEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTREANNODEL, "ESTREANNODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTREANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, "ESTRUNITPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, "ESTRNUMEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, "ESTRANNOPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, "ESTRTIPOVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANCHPLUR, "ESTRANCHPLUR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTRANCHPLUR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTTIPVARDIV, "ESTTIPVARDIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117,IMDBDef12.PQSL_PARAM117_ESTTIPVARDIV,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAM117, 0);
  }

  private static void Init_PQRY_PARAM117_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM117_RS, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM117_RS, "PQRY_PARAM117_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, "ESTRTIPOIMPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTREMIPARTE, "ESTREMIPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTREMIPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANCSUPLU, "ESTRANCSUPLU");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANCSUPLU,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, "ESTRESEDEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, "ESTRENUMEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTREANNODEL, "ESTREANNODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTREANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, "ESTRUNITPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, "ESTRNUMEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, "ESTRANNOPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, "ESTRTIPOVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANCHPLUR, "ESTRANCHPLUR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTRANCHPLUR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTTIPVARDIV, "ESTTIPVARDIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM117_RS,IMDBDef12.PQSL_PARAM117_ESTTIPVARDIV,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstremiVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstremiVariazioni()
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
    FormIdx = MyGlb.FRM_ESTREMVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DFFF32E8-B60F-4C7E-988A-5E0CE8B2369B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 366;
    set_Caption(new IDVariant("Estremi Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 340;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AA584F24-650E-44F8-B7D7-FD8185447EFF");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1000, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM10, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTREMVARIAZ_PARAM117();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTIPOVARI && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_TIPOVARIAZI1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTIPOVARI && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_TIPOVARIAZIO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZIDELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZIPROPOS) {
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
    return (obj instanceof EstremiVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstremiVariazioni.class.getName() : (Glb.ClassWithPackage(EstremiVariazioni.class) ? EstremiVariazioni.class.getName().substring(EstremiVariazioni.class.getPackage().getName().length() + 1) : EstremiVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties Event
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
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("S")), true))
      {
        // PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        // PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0))))
      {
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_DELIBERA,(new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DELIBERA))).stringValue()); 
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_PROPOSTA,(new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROPOSTA))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "ParamOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAM_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARAM_ANNODEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0));
        v_ANNODEL = IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0, new IDVariant(v_ANNODEL));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0, new IDVariant(v_NUMERODEL));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0))))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "ParamOnUpdatingRowEvent", _e);
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
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_FASE = (new IDVariant("Fase 1 - ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Estremi Variazione "));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      set_Caption(IDL.Add(IDL.Add(IDL.Add(v_FASE, v_CAPTION), ((IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("D")), true))?(new IDVariant("Definitive")):(new IDVariant("Provvisorie")))), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANCSUPLU, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRESEDEDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRENUMEDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREANNODEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRUNITPROP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRNUMEPROP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANNOPROP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANCHPLUR, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTTIPVARDIV, 0, (new IDVariant()));
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where ((A.ESERCIZIO BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1 AND " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 6)) ");
      SQL.append("and   (A.FASE_BILANCIO >= 3) ");
      SQL.append("and   (A.TIPO = 'P') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRPLURVISI, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRPLURVISI, 0, (new IDVariant("NO")));
      }
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("P")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_LABEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_LABEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_FORM, (new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, IDPanel.RT_LEFT, Glb.PANEL_FORM))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_LABEL3, IDPanel.RT_LEFT, Glb.PANEL_FORM, (new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, IDPanel.RT_LEFT, Glb.PANEL_FORM))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, IDPanel.RT_LEFT, Glb.PANEL_FORM, (new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, IDPanel.RT_LEFT, Glb.PANEL_FORM))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_LABEL4, IDPanel.RT_LEFT, Glb.PANEL_FORM, IDL.Add((new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, IDPanel.RT_LEFT, Glb.PANEL_FORM))), (new IDVariant(14))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_ANNOPROP, IDPanel.RT_LEFT, Glb.PANEL_FORM, IDL.Add((new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, IDPanel.RT_LEFT, Glb.PANEL_FORM))), (new IDVariant(14))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, IDPanel.RT_LEFT, Glb.PANEL_FORM, (new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, IDPanel.RT_LEFT, Glb.PANEL_FORM))).intValue());
        PAN_PARAM.set_ObjRect(Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_FORM, (new IDVariant(PAN_PARAM.ObjRect(Glb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, IDPanel.RT_LEFT, Glb.PANEL_FORM))).intValue());
      }
      IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/' || " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = 'Tipi Variazione Bilancio diversi') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT1.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTMULTIPVAR, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTMULTIPVAR, 0, (new IDVariant("NO")));
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTIPOVARI)), true) && Result.booleanValue())
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO_REISCRIZIONE as TIPIMPVBTIRE ");
        SQL.append("from ");
        SQL.append("  TIPI_IMPORTO_VBIL A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, 0, QV.Get("TIPIMPVBTIRE", IDVariant.STRING));
        }
        QV.Close();
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as TIPIMPVBIDES ");
        SQL.append("from ");
        SQL.append("  TIPI_IMPORTO_VBIL A, ");
        SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
        SQL.append("where (B.TIPO_IMPORTO = A.CODICE) ");
        SQL.append("and   (B.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORT54TIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("TIPIMPVBIDES", IDVariant.STRING) ;
        }
        QV.Close();
        IDVariant v_PES = new IDVariant(0,IDVariant.STRING);
        v_PES = (new IDVariant("Parte Entrata e Spesa"));
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDCODICE, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMTIPOLO, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORT54TIPO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDCODICE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDPARTE, 0));
        PAN_PARAM.set_FieldText(PFL_PARAM_PARTELABEL, ((IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDPARTE, 0).equals((new IDVariant("E")), true))?IDL.Add(IDL.Add((new IDVariant("Parte")), (new IDVariant(" "))), (new IDVariant("Entrata"))):((IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDPARTE, 0).equals((new IDVariant("S")), true))?IDL.Add(IDL.Add((new IDVariant("Parte")), (new IDVariant(" "))), (new IDVariant("Spesa"))):v_PES)).stringValue());
        PAN_PARAM.set_FieldText(PFL_PARAM_QUADRATURA, ((IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDTIPO, 0).equals((new IDVariant("ES")), true))?IDL.Add((new IDVariant("Quadratura ")), (new IDVariant("Entrate/Spese"))):((IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECORDTIPO, 0).equals((new IDVariant("PM")), true))?IDL.Add((new IDVariant("Quadratura ")), (new IDVariant("+/-"))):(new IDVariant("")))).stringValue());
        IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0, IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0));
        if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0).compareTo((new IDVariant("CA")), true)!=0 && IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0).compareTo((new IDVariant("RE")), true)!=0)
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRPLURVISI, 0).equals((new IDVariant("SI")), true))
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANCHPLUR, 0, (new IDVariant("NO")));
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANCSUPLU, 0, (new IDVariant("NO")));
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        IDVariant v_REISC = new IDVariant(0,IDVariant.STRING);
        v_REISC = (new IDVariant("Variazione per "));
        IDVariant v_REISC1 = new IDVariant(0,IDVariant.STRING);
        v_REISC1 = (new IDVariant("Variazione di Competenza e Cassa"));
        IDVariant v_VAR = new IDVariant(0,IDVariant.STRING);
        v_VAR = (new IDVariant("Variazione di "));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("CA")), true) || IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("CO")), true))
        {
          PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, IDL.Add(v_VAR, (IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("CO")))? new IDVariant("Competenza") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("CA")))? new IDVariant("Cassa") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("RE")))? new IDVariant("Reiscrizione") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("T")))? new IDVariant("Competenza e Cassa") :  new IDVariant())).stringValue());
        }
        if (IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("RE")), true))
        {
          PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, IDL.Add(v_REISC, (IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("CO")))? new IDVariant("Competenza") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("CA")))? new IDVariant("Cassa") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("RE")))? new IDVariant("Reiscrizione") : IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOIMPO, 0).equals((new IDVariant("T")))? new IDVariant("Competenza e Cassa") :  new IDVariant())).stringValue());
        }
        if (IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("T")), true))
        {
          PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, new IDVariant(v_REISC1).stringValue());
        }
        if (IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("EC")), true))
        {
          PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, (new IDVariant("Variazioni per Economie da Residui")).stringValue());
        }
        if (IMDB.Value(IMDBDef7.PQRY_T81, IMDBDef7.PQSL_T81_RECOTIPOIMPO, 0).equals((new IDVariant("EP")), true))
        {
          PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, (new IDVariant("Variazione per Economie da Perenti")).stringValue());
        }
        PAN_PARAM.set_FieldText(PFL_PARAM_ETICHETTAASD, IDL.Add((new IDVariant("Variazione ")), v_DESCRIZIONE).stringValue());
        PAN_PARAM.RefreshLookup();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Tipo Variazione
  // **********************************************************************
  public int SelezionaTipoVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Tipo Variazione Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTIPOVARI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "SelezionaTipoVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Label Avanti 1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int LabelAvanti1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Label Avanti 1 Body
      // Procedure Body
      // 
      PAN_PARAM.PanelCommand(Glb.PCM_UPDATE);
      // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0)))
      // {
        // IDVariant v_VVARCTIPOVAR = null;
        // v_VVARCTIPOVAR = (new IDVariant());
        // IDCachedRowSet v_RW = new IDCachedRowSet();
        // IDCachedRowSet v_RWD = new IDCachedRowSet();
        // if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("D")), true))
        // {
          // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)))
          // {
            // IDVariant S = new IDVariant(0,IDVariant.STRING);
            // S = (new IDVariant("E' obbligatorio indicare la Delibera o la Proposta"));
            // MainFrm.set_AlertMessage(S); 
            // return 0;
          // }
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  A.TIPO_VAR as TIPOVAR, ");
          // SQL.append("  SUM(1) as SUM1 ");
          // SQL.append("from ");
          // SQL.append("  VARCOM A ");
          // SQL.append("where (NVL(A.SEDE_DEL, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.SEDE_DEL, '-1'))) ");
          // SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_DEL, -1))) ");
          // SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.ANNO_DEL, -1))) ");
          // SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.UNITA_PROPONENTE, '-1'))) ");
          // SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("group by ");
          // SQL.append("  A.TIPO_VAR ");
          // v_RWD = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!v_RWD.EOF()) v_RWD.MoveNext();
        // }
        // else
        // {
          // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)))
          // {
            // IDVariant v_ERRO = new IDVariant(0,IDVariant.STRING);
            // v_ERRO = (new IDVariant("La Proposta è obbligatoria per una Variazione Provvisoria"));
            // MainFrm.set_AlertMessage(v_ERRO); 
            // return 0;
          // }
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  A.TIPO_VAR as TIPOVAR, ");
          // SQL.append("  SUM(1) as SUM1 ");
          // SQL.append("from ");
          // SQL.append("  VARCOMPRO A ");
          // SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("group by ");
          // SQL.append("  A.TIPO_VAR ");
          // v_RW = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!v_RW.EOF()) v_RW.MoveNext();
        // }
        // 
        // Settaggio auto tipo var
        // 
        // {
          // IDVariant I = new IDVariant(0,IDVariant.INTEGER);
          // if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("D")), true))
          // {
            // I = new IDVariant(v_RWD.RecordCount());
            // v_RWD.MoveFirst();
            // if (I.equals((new IDVariant(1)), true))
            // {
              // v_VVARCTIPOVAR = IDL.ToInteger(v_RWD.Get((new IDVariant("TIPOVAR")).stringValue()));
            // }
            // v_RWD.Close();
          // }
          // else
          // {
            // I = new IDVariant(v_RW.RecordCount());
            // v_RW.MoveFirst();
            // if (I.equals((new IDVariant(1)), true))
            // {
              // v_VVARCTIPOVAR = IDL.ToInteger(v_RW.Get((new IDVariant("TIPOVAR")).stringValue()));
            // }
            // v_RW.Close();
          // }
          // if (I.equals((new IDVariant(1)), true))
          // {
            // IDVariant v_VPARTE = null;
            // v_VPARTE = (new IDVariant());
            // IDVariant v_PES = new IDVariant(0,IDVariant.STRING);
            // v_PES = (new IDVariant("Parte Entrata e Spesa"));
            // IDVariant v_VTIPOQUADRAT = null;
            // v_VTIPOQUADRAT = (new IDVariant());
            // IDVariant v_VTIPOIMPORTO = null;
            // v_VTIPOIMPORTO = (new IDVariant());
            // IDVariant v_VSTESSOCODIC = null;
            // v_VSTESSOCODIC = (new IDVariant());
            // IDVariant v_VSTESSOFIN = null;
            // v_VSTESSOFIN = (new IDVariant());
            // SQL = new StringBuffer();
            // SQL.append("select ");
            // SQL.append("  B.PARTE as TIPMOTVBPAVB, ");
            // SQL.append("  B.TIPO_QUADRATURA as TIMOVBTIQUVB, ");
            // SQL.append("  B.TIPO_IMPORTO as TIMOVBTIIMVB, ");
            // SQL.append("  B.STESSO_CODICE as TIMOVBSTCOVB, ");
            // SQL.append("  B.STESSO_FINANZIAMENTO as TIMOVBSTFIVB ");
            // SQL.append("from ");
            // SQL.append("  T54 A, ");
            // SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
            // SQL.append("where (A.TIPOLOGIA = B.CODICE) ");
            // SQL.append("and   (NVL(A.VAR_UO, 'NO') <> 'SI') ");
            // SQL.append("and   (A.CODICE = " + IDL.CSql(v_VVARCTIPOVAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            // if (!QV.EOF()) QV.MoveNext();
            // if (!QV.EOF())
            // {
            //   v_VPARTE = QV.Get("TIPMOTVBPAVB", IDVariant.STRING) ;
            //   v_VTIPOQUADRAT = QV.Get("TIMOVBTIQUVB", IDVariant.STRING) ;
            //   v_VTIPOIMPORTO = QV.Get("TIMOVBTIIMVB", IDVariant.STRING) ;
            //   v_VSTESSOCODIC = QV.Get("TIMOVBSTCOVB", IDVariant.STRING) ;
            //   v_VSTESSOFIN = QV.Get("TIMOVBSTFIVB", IDVariant.STRING) ;
            // }
            // QV.Close();
            // IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0, new IDVariant(v_VVARCTIPOVAR));
            // IMDB.set_Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0, new IDVariant(v_VVARCTIPOVAR));
            // IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0, new IDVariant(v_VPARTE));
            // PAN_PARAM.set_FieldText(PFL_PARAM_PARTELABEL, ((v_VPARTE.equals((new IDVariant("E")), true))?IDL.Add(IDL.Add((new IDVariant("Parte")), (new IDVariant(" "))), (new IDVariant("Entrata"))):((v_VPARTE.equals((new IDVariant("S")), true))?IDL.Add(IDL.Add((new IDVariant("Parte")), (new IDVariant(" "))), (new IDVariant("Spesa"))):v_PES)).stringValue());
            // PAN_PARAM.set_FieldText(PFL_PARAM_QUADRATURA, ((v_VTIPOQUADRAT.equals((new IDVariant("ES")), true))?IDL.Add((new IDVariant("Quadratura ")), (new IDVariant("Entrate/Spese"))):((v_VTIPOQUADRAT.equals((new IDVariant("PM")), true))?IDL.Add((new IDVariant("Quadratura ")), (new IDVariant("+/-"))):(new IDVariant("")))).stringValue());
            // IDVariant v_REISC = new IDVariant(0,IDVariant.STRING);
            // v_REISC = (new IDVariant("Variazione per "));
            // IDVariant v_REISC1 = new IDVariant(0,IDVariant.STRING);
            // v_REISC1 = (new IDVariant("Variazione di Competenza e Cassa"));
            // IDVariant v_VAR = new IDVariant(0,IDVariant.STRING);
            // v_VAR = (new IDVariant("Variazione di "));
            // IDVariant S = new IDVariant(0,IDVariant.STRING);
            // if (v_VSTESSOCODIC.equals((new IDVariant("SI")), true) || v_VSTESSOFIN.equals((new IDVariant("SI")), true))
            // {
              // S = ((v_VSTESSOCODIC.equals((new IDVariant("SI")), true))?IDL.Add((new IDVariant(" - stesso ")), (new IDVariant("Codice"))):(new IDVariant("")));
              // S = IDL.Add(S, ((v_VSTESSOFIN.equals((new IDVariant("SI")), true))?IDL.Add((new IDVariant(" - stesso ")), (new IDVariant("Finanziamento"))):(new IDVariant(""))));
            // }
            // else
            // {
              // S = (new IDVariant());
            // }
            // if (v_VTIPOIMPORTO.equals((new IDVariant("CA")), true) || v_VTIPOIMPORTO.equals((new IDVariant("CO")), true))
            // {
              // PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, IDL.Add(v_VAR, (v_VTIPOIMPORTO.equals((new IDVariant("CO")))? new IDVariant("Competenza") : v_VTIPOIMPORTO.equals((new IDVariant("CA")))? new IDVariant("Cassa") : v_VTIPOIMPORTO.equals((new IDVariant("RE")))? new IDVariant("Reiscrizione") : v_VTIPOIMPORTO.equals((new IDVariant("T")))? new IDVariant("Competenza e Cassa") :  new IDVariant())).stringValue());
            // }
            // if (v_VTIPOIMPORTO.equals((new IDVariant("RE")), true))
            // {
              // PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, IDL.Add(v_REISC, (v_VTIPOIMPORTO.equals((new IDVariant("CO")))? new IDVariant("Competenza") : v_VTIPOIMPORTO.equals((new IDVariant("CA")))? new IDVariant("Cassa") : v_VTIPOIMPORTO.equals((new IDVariant("RE")))? new IDVariant("Reiscrizione") : v_VTIPOIMPORTO.equals((new IDVariant("T")))? new IDVariant("Competenza e Cassa") :  new IDVariant())).stringValue());
            // }
            // if (v_VTIPOIMPORTO.equals((new IDVariant("T")), true))
            // {
              // PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, new IDVariant(v_REISC1).stringValue());
            // }
            // if (v_VTIPOIMPORTO.equals((new IDVariant("EC")), true))
            // {
              // PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, (new IDVariant("Variazioni per Economie da Residui")).stringValue());
            // }
            // if (v_VTIPOIMPORTO.equals((new IDVariant("EP")), true))
            // {
              // PAN_PARAM.set_FieldText(PFL_PARAM_TIPOVARDESC, (new IDVariant("Variazione per Economie da Perenti")).stringValue());
            // }
            // IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRSESTECOD, 0, new IDVariant(v_VSTESSOCODIC));
            // IMDB.set_Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRSESTEFIN, 0, new IDVariant(v_VSTESSOFIN));
            // PAN_PARAM.set_FieldText(PFL_PARAM_ETICHETTAASD, new IDVariant(S).stringValue());
          // }
        // }
      // }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Tipo Variazione obbligatoria"));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      // 
      // controllo diversi tipi var
      // 
      // {
        // IDVariant v_VVARCOMTIPOV = new IDVariant(0,IDVariant.INTEGER);
        // if ( true))
        // {
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  MAX(A.TIPO_VAR) as MAXVARTIVAPR ");
          // SQL.append("from ");
          // SQL.append("  VARCOMPRO A ");
          // SQL.append("where (NVL(A.UNITA_PROPONENTE, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.UNITA_PROPONENTE, '-1'))) ");
          // SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_VVARCOMTIPOV = QV.Get("MAXVARTIVAPR", IDVariant.INTEGER) ;
          // }
          // QV.Close();
        // }
        // else
        // {
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  MAX(A.TIPO_VAR) as MAXVARTIVAPR ");
          // SQL.append("from ");
          // SQL.append("  VARCOMPRO A ");
          // SQL.append("where (NVL(A.UNITA_PROPONENTE, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.UNITA_PROPONENTE, '-1'))) ");
          // SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.NUMERO_PROPOSTA, -1))) ");
          // SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_VVARCOMTIPOV = QV.Get("MAXVARTIVAPR", IDVariant.INTEGER) ;
          // }
          // QV.Close();
        // }
        // if (IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0).compareTo(v_VVARCOMTIPOV, true)!=0 && !(IDL.IsNull(v_VVARCOMTIPOV)))
        // {
          // if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTTIPVARDIV, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0 && IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTMULTIPVAR, 0).equals((new IDVariant("SI")), true))
          // {
            // IDVariant S = new IDVariant(0,IDVariant.STRING);
            // S = (new IDVariant("Tipo Variazione diverso non ammesso"));
            // MainFrm.set_AlertMessage(S); 
            // return 0;
          // }
        // }
      // }
      if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("P")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)))
        {
          IDVariant v_ERRO = new IDVariant(0,IDVariant.STRING);
          v_ERRO = (new IDVariant("La Proposta è obbligatoria per una Variazione Provvisoria"));
          MainFrm.set_AlertMessage(v_ERRO); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0)))
        {
          IDVariant v_ERRO = null;
          v_ERRO = (new IDVariant("E' obbligatorio indicare la Delibera o la Proposta"));
          MainFrm.set_AlertMessage(v_ERRO); 
          return 0;
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0))))
      {
        IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DEL A ");
        SQL.append("where (A.SEDE_DEL = UPPER(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTA.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Delibera/Decreto inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0))))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Dati Delibera/Decreto incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0))))
        {
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE A ");
          SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTA.equals((new IDVariant(0)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Proposta inesistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0))))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Dati proposta incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRDEFIOPRO, 0).equals((new IDVariant("P")), true))
      {
        OpenVariazioniProvvisorie();
      }
      else
      {
        OpenVariazioniDefinitive();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "LabelAvanti1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Open Variazioni Provvisorie
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OpenVariazioniProvvisorie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Open Variazioni Provvisorie Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0))))
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T54 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("T54DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMDETIVA, 0, new IDVariant(v_DESCRIZIONE));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMTIPVAR, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMETIPOL, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMTIPOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMPARVAR, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMTIPIMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMEES, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0));
      MainFrm.Show(MyGlb.FRM_VARIAZPROVVI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "OpenVariazioniProvvisorie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Open Variazioni Definitive
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OpenVariazioniDefinitive ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Open Variazioni Definitive Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0))))
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
        SQL.append("from ");
        SQL.append("  T54 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRTIPOVARI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("T54DESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDETIVA, 0, new IDVariant(v_DESCRIZIONE));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRNUMEPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRANNOPROP, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMTIPOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPROINS, 0, ((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRUNITPROP, 0)))?(new IDVariant()):(new IDVariant("SI"))));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRENUMEDEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTREANNODEL, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDELINS, 0, ((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAM117, IMDBDef12.PQSL_PARAM117_ESTRESEDEDEL, 0)))?(new IDVariant()):(new IDVariant("SI"))));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPARVAR, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEES, 0, IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0));
      MainFrm.Show(MyGlb.FRM_VARIAZDEFINI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstremiVariazioni", "OpenVariazioniDefinitive", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ESTREMVARIAZ_PARAM117() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAM117_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM10, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM10, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAM117_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAM117_RS, 0, IMDBDef3.TBL_PARAM10, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 0, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 1, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREMIPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 2, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANCSUPLU, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 3, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRESEDEDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 4, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRENUMEDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 5, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTREANNODEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 6, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRUNITPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 7, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRNUMEPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 8, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANNOPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 9, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 10, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRANCHPLUR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM117_RS, 11, 0, IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTTIPVARDIV, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM10, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM10, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM10, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAM117_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAM_TIPOVARIAZI1)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaTipoVariazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_TIPOVARIAZIO)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaTipoVariazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZIDELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZIPROPOS)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFODELIBERE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_LABELAVANTI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      LabelAvanti1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, "05D908C1-1439-4687-A318-80D4C1F907A2");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, "Modalità");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, MyGlb.PANEL_LIST, 0, -9999, 428, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, MyGlb.PANEL_FORM, 8, 39, 744, 137, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, 0, 49);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_MODALITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, "8B987CD7-FA96-4A84-B699-D5873A43D455");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, "Provvedimento");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 183, 744, 57, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, 0, 87);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 42);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, "2EF97420-5996-4970-85A2-A9A5E4E44F0D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, "Tipo Variazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, "4443A0EC-2D75-48E5-AB82-C91B9CEFFA83");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, "Tipo Importo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, "DB12C204-AE9C-4289-A0B6-9FBC1F14E2A1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.VIS_VUONORALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, "6541C791-37CD-442F-B481-739CFEC96014");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.VIS_VUONORALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, "F4BF3094-8FEB-41E1-8F93-4D661AFB8BAC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, "763F9836-14FA-4720-A4C3-D2EC9553F424");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, "Tipo Variazione ");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, "60FA43B4-5A66-44D8-84B9-F1647C77ED08");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, "139CC79A-BC90-4FC9-B706-B14678CC89F6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "01EAE951-C742-461A-BDB9-81DEEE417391");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "55032FDB-2528-4634-B008-3CF64F5BEA96");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "Estremi Variazioni");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "9F8CA82F-EA8F-4E77-A865-CB3DA2AE0D3A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "Delibera/Decreto");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "5175CF0B-3327-453A-AECF-D91C8209DBA5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "Numero Del");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, "E18C858C-8D99-4823-AB7C-E5C961BBA1BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "646FD326-645C-4B25-A9C2-E1BF3A40FB95");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "Anno Del");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, "AB56F806-5333-4FBC-8265-E728751FAE15");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "E22B2B48-E125-45D9-AC55-A07A1BDAF4D5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, "BD5AB122-7531-4FF7-9E49-B6B9C762EB5D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, "96F7E23B-5696-4158-B7F6-E5C34DD056C2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, "Numero Prop");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, "D2CE156C-B32E-4A88-8FB5-2749E7A96353");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, "6376F987-023D-4330-B8C1-0E411CFF7270");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, "Anno Prop");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, "199FA887-778E-4583-89F9-C35F8B0A6B2B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, "ADB262E0-AF4B-47E4-B93C-F6FC85457867");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, "7AC762C0-C325-4CEC-8716-E76A815132AD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, "14D59F9E-1C45-452C-BDD4-BAC1591D50D7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, "74A183FC-D0DB-4939-8947-21AFD272682A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "4F840F8E-E142-48CF-B9C6-AF0AD94579CE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SF, "441844E3-C9F2-405A-A373-F3C822073713");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SF, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, "1A82D19A-6FE5-455E-8011-2A1DAE75502D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, "7498CB40-C1C9-4068-8CA1-6E5810C7BEE9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, "986A4170-C842-4ED8-82F7-F4DB3C455BFC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, "Avanti");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, "32625209-AD8A-4670-9800-946941B66ECA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, "Anche su Pluriennali");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, "9BDC732C-2E2F-4735-AC52-91E28911D2ED");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, "Segnaposto");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, "82108136-7092-4D4E-A10C-DD856AE306A7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, "212C4192-37AB-4932-9963-916A3FE939FD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, "1AD0EDB8-CE68-4EEB-AB62-A5AE99453C47");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, "27E4DC8E-5B08-4A87-8DCD-633E9AA9252D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, "B82B9859-8D70-4E0E-9004-C99B14F9776F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, 0 | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, "C9949FD5-A754-438A-A883-877D413E6FA7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, "Testo da mostrare qui");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, 0 | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, "02A749E3-470F-40F1-8747-B8F27392C776");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, "Anche Pluriennali");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, "53671350-297F-4441-B6CD-C497273853EF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, "124A45CB-7EFA-48C2-A2EA-04E26A599FCE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, "Tipi Variazione diversi");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, "B5DE4E55-A2D6-4D1F-A151-3241F57A1595");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, "TIPI IMPORTO VBIL DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_LIST, "Tp. Variaz.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_FORM, 92, 72, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZI1, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOVARIAZI1, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOVARIAZI1, PPQRY_PARAM117, "A.ESTRTIPOVARI", "ESTRTIPOVARI", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_FORM, 24, 104, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_FORM, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOIMPORTO, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOIMPORTO, PPQRY_PARAM117, "A.ESTRTIPOIMPO", "ESTRTIPOIMPO", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOIMPORTO, (new IDVariant("CO")), "Competenza", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOIMPORTO, (new IDVariant("CA")), "Cassa", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOIMPORTO, (new IDVariant("RE")), "Reiscrizione", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOIMPORTO, (new IDVariant("T")), "Competenza e Cassa", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_LIST, 24, 132, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_FORM, 220, 108, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTELABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTELABEL, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTELABEL, -1, "", "PARTELABEL", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_LIST, 32, 140, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_FORM, 220, 128, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_QUADRATURA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_QUADRATURA, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_QUADRATURA, -1, "", "QUADRATURA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_LIST, 24, 96, 164, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_FORM, 12, 104, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOVARDESC, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOVARDESC, -1, "", "TIPOVARDESC", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione ");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_FORM, 116, 64, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione ");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOVARIAZIO, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOVARIAZIO, PPQRY_T54, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "T54DESCRIZIO", 5, 142, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_LIST, 568, 200, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_FORM, 716, 164, 32, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_AAA2, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AAA2, -1, "", "AAA2", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_LIST, 576, 208, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_FORM, 12, 164, 32, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_AAA1, -1, GRP_PARAM_MODALITA);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AAA1, -1, "", "AAA1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 160, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 452, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM117, "A.ESTREMIPARTE", "ESTREMIPARTE", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrate", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spese", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("ES")), "Entrate e Spese", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 8, 4, 156, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 8, 4, 744, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, "Del. Dcr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 12, 216, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, "Delibera/Decreto");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DELIBERA, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DELIBERA, PPQRY_PARAM117, "A.ESTRESEDEDEL", "ESTRESEDEDEL", 5, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 252, 216, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, "Num. Del");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERODEL, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERODEL, PPQRY_PARAM117, "A.ESTRENUMEDEL", "ESTRENUMEDEL", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 136, 156, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 236, 216, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL1, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, "Ann. Del");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 320, 216, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNODEL, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNODEL, PPQRY_PARAM117, "A.ESTREANNODEL", "ESTREANNODEL", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_LIST, 144, 164, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_FORM, 304, 216, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL2, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL2, -1, "", "LABEL2", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 404, 216, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROPOSTA, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROPOSTA, PPQRY_PARAM117, "A.ESTRUNITPROP", "ESTRUNITPROP", 5, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_LIST, 144, 164, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_FORM, 580, 216, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL3, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL3, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL3, -1, "", "LABEL3", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_LIST, "Num. Prop");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_FORM, 596, 216, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_FORM, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROP, MyGlb.PANEL_FORM, "Num. Prop");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMEROPROP, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMEROPROP, PPQRY_PARAM117, "A.ESTRNUMEPROP", "ESTRNUMEPROP", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_LIST, 152, 172, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_FORM, 656, 216, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL4, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL4, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL4, -1, "", "LABEL4", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_LIST, "Ann. Prop");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_FORM, 672, 216, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROP, MyGlb.PANEL_FORM, "Ann. Prop");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOPROP, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOPROP, PPQRY_PARAM117, "A.ESTRANNOPROP", "ESTRANNOPROP", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 152, 172, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 364, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZIDELIBE, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 160, 180, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 716, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZIPROPOS, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZIPROPOS, -1, "", "SELEZIPROPOS", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 160, 180, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 380, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFODELIBERE, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFODELIBERE, -1, "", "INFODELIBERE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_LIST, 168, 188, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_FORM, 732, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOPROPOSTA, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_LIST, 560, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_FORM, 572, 208, 32, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AAA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_AAA, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AAA, -1, "", "AAA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 12, 208, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 12, 208, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTAT, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_LIST, 720, 196, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_FORM, 720, 208, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SF, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SF, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SF, -1, "", "SF", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_LIST, 744, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_FORM, 732, 208, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETTAS, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETTAS, -1, "", "ETICHETTAS", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_LIST, 732, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_FORM, 732, 208, 16, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETRASPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETRASPA, -1, GRP_PARAM_PROVVEDIMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETRASPA, -1, "", "ETICHETRASPA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_LIST, 388, 236, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_FORM, 672, 276, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELAVANTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABELAVANTI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABELAVANTI, -1, "", "LABELAVANTI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_LIST, "Anc. su Plr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_FORM, 584, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHESUPLURI, MyGlb.PANEL_FORM, "Anche su Pluriennali");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANCHESUPLURI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANCHESUPLURI, PPQRY_PARAM117, "A.ESTRANCSUPLU", "ESTRANCSUPLU", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHESUPLURI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHESUPLURI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_LIST, 164, 248, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_FORM, 32, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA1, -1, "", "NONCANCELLA1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_LIST, 184, 248, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_FORM, 208, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA2, -1, "", "NONCANCELLA2", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_LIST, 192, 256, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_FORM, 232, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA3, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA3, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA3, -1, "", "NONCANCELLA3", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_LIST, 200, 264, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_FORM, 276, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA4, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA4, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA4, -1, "", "NONCANCELLA4", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_LIST, 208, 272, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_FORM, 300, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA5, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA5, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA5, -1, "", "NONCANCELLA5", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_LIST, 216, 280, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_FORM, 364, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA6, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA6, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA6, -1, "", "NONCANCELLA6", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_LIST, 224, 288, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_FORM, 384, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NONCANCELLA7, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NONCANCELLA7, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NONCANCELLA7, -1, "", "NONCANCELLA7", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_LIST, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_LIST, "Anche Pluriennali");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_FORM, 12, 244, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEPLURIEN, MyGlb.PANEL_FORM, "Anche Pluriennali");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANCHEPLURIEN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANCHEPLURIEN, PPQRY_PARAM117, "A.ESTRANCHPLUR", "ESTRANCHPLUR", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHEPLURIEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHEPLURIEN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_LIST, 232, 104, 172, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_FORM, 220, 88, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTAASD, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETTAASD, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETTAASD, -1, "", "ETICHETTAASD", 0, 0, 0, -13997);
    PAN_PARAM.set_Alignment(PFL_PARAM_ETICHETTAASD, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_LIST, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_LIST, "Tipi Variazione diversi");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_FORM, 596, 244, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_FORM, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIVARIDIVE, MyGlb.PANEL_FORM, "Tipi Variazione diversi");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPIVARIDIVE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPIVARIDIVE, PPQRY_PARAM117, "A.ESTTIPVARDIV", "ESTTIPVARDIV", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPIVARIDIVE, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPIVARIDIVE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_LIST, 196);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_LIST, "TIPI IMPORTO VBIL DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_FORM, 16, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_FORM, 196);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPIMPVBIDES, MyGlb.PANEL_FORM, "TIPI IMPORTO VBIL DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPIMPVBIDES, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPIMPVBIDES, PPQRY_TIPIIMPOVBIL, "'Variazione ' || A.DESCRIZIONE", "TIPIMPVBIDES", 5, 111, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ESTRTIPOVARI~~) ");
    PAN_PARAM.SetQuery(PPQRY_T54, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_T54, "T54");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Variazione ' || A.DESCRIZIONE as TIPIMPVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_IMPORTO_VBIL A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (B.CODICE = ~~TBL_PARAM10.ESTREMTIPOLO~~) ");
    SQL.append("and   (B.TIPO_IMPORTO = A.CODICE) ");
    PAN_PARAM.SetQuery(PPQRY_TIPIIMPOVBIL, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPIIMPOVBIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_TIPIIMPOVBIL, "TIPI_IMPORTO_VBIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ESTRTIPOVARI~~) ");
    PAN_PARAM.SetQuery(PPQRY_T55, 0, SQL, PFL_PARAM_TIPOVARIAZI1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_PARAM.SetQuery(PPQRY_T55, 1, SQL, PFL_PARAM_TIPOVARIAZI1, "");
    PAN_PARAM.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM117", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Estremi");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM117, IMDBDef12.PQRY_PARAM117_RS, IMDBDef3.TBL_PARAM10);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOVARIAZI1, IMDBDef3.FLD_PARAM10_ESTRTIPOVARI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOIMPORTO, IMDBDef3.FLD_PARAM10_ESTRTIPOIMPO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef3.FLD_PARAM10_ESTREMIPARTE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DELIBERA, IMDBDef3.FLD_PARAM10_ESTRESEDEDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERODEL, IMDBDef3.FLD_PARAM10_ESTRENUMEDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNODEL, IMDBDef3.FLD_PARAM10_ESTREANNODEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROPOSTA, IMDBDef3.FLD_PARAM10_ESTRUNITPROP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMEROPROP, IMDBDef3.FLD_PARAM10_ESTRNUMEPROP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOPROP, IMDBDef3.FLD_PARAM10_ESTRANNOPROP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANCHESUPLURI, IMDBDef3.FLD_PARAM10_ESTRANCSUPLU);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANCHEPLURIEN, IMDBDef3.FLD_PARAM10_ESTRANCHPLUR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPIVARIDIVE, IMDBDef3.FLD_PARAM10_ESTTIPVARDIV);
    PAN_PARAM.SetMasterTable(0, "PARAM10");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
