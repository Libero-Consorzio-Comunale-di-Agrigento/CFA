// **********************************************
// Movimenti Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiDelibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_TOTALI = 0;

  private static int PFL_PARAMETRI_SEDEDEL = 0;
  private static int PFL_PARAMETRI_NUMERODEL = 1;
  private static int PFL_PARAMETRI_ANNODEL = 2;
  private static int PFL_PARAMETRI_DELIBERLABEL = 3;
  private static int PFL_PARAMETRI_TRATTINLABEL = 4;
  private static int PFL_PARAMETRI_BARRALABEL = 5;
  private static int PFL_PARAMETRI_SELEZIDELIBE = 6;
  private static int PFL_PARAMETRI_INFODELIBERA = 7;
  private static int PFL_PARAMETRI_IMPEGNI = 8;
  private static int PFL_PARAMETRI_SUBIMPEGNI = 9;
  private static int PFL_PARAMETRI_ACCERTAMENTI = 10;
  private static int PFL_PARAMETRI_VARIMPEGNI = 11;
  private static int PFL_PARAMETRI_VARSUBIMPEGN = 12;
  private static int PFL_PARAMETRI_VARACCERTAME = 13;
  private static int PFL_PARAMETRI_LIQUIDAZIONI = 14;
  private static int PFL_PARAMETRI_MANDATI = 15;

  private static int PPQRY_PARAMETRI244 = 0;

  private static int PPQRY_IMP = 1;
  private static int PPQRY_SUBIMP = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_VARIMP = 4;
  private static int PPQRY_VARSUB = 5;
  private static int PPQRY_VARACC = 6;
  private static int PPQRY_VARCOM = 7;
  private static int PPQRY_VARCOMPRO = 8;
  private static int PPQRY_LIQMAN = 9;


  IDPanel PAN_PARAMETRI;
  private static int PFL_MOVIMEDELIBE_ES = 0;
  private static int PFL_MOVIMEDELIBE_CAPITOLO = 1;
  private static int PFL_MOVIMEDELIBE_ARTICOLO = 2;
  private static int PFL_MOVIMEDELIBE_NUMEROIMPACC = 3;
  private static int PFL_MOVIMEDELIBE_ANNOIMPACC = 4;
  private static int PFL_MOVIMEDELIBE_NUMEROSUBIMP = 5;
  private static int PFL_MOVIMEDELIBE_ANNOSUBIMP = 6;
  private static int PFL_MOVIMEDELIBE_NUMEROLIQ = 7;
  private static int PFL_MOVIMEDELIBE_ANNOLIQ = 8;
  private static int PFL_MOVIMEDELIBE_MANDATO = 9;
  private static int PFL_MOVIMEDELIBE_ANNOMAND = 10;
  private static int PFL_MOVIMEDELIBE_TIPO = 11;
  private static int PFL_MOVIMEDELIBE_IMPORTO = 12;
  private static int PFL_MOVIMEDELIBE_DESCRIZIONE = 13;
  private static int PFL_MOVIMEDELIBE_SOGGETTO = 14;
  private static int PFL_MOVIMEDELIBE_IMPACCLABEL = 15;
  private static int PFL_MOVIMEDELIBE_SUBIMPEGLABE = 16;
  private static int PFL_MOVIMEDELIBE_LIQUIDALABEL = 17;

  private static int PPQRY_MOVIMENTIDEL = 0;


  IDPanel PAN_MOVIMEDELIBE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI245(IMDB);
    //
    //
    Init_PQRY_PARAMETRI244(IMDB);
    Init_PQRY_PARAMETRI244_RS(IMDB);
    Init_PQRY_MOVIMENTIDEL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI245(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI245, 3);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI245, "TBL_PARAMETRI245");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI245,IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI245, 0);
  }

  private static void Init_PQRY_PARAMETRI244(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI244, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI244, "PQRY_PARAMETRI244");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244,IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI244, 0);
  }

  private static void Init_PQRY_PARAMETRI244_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI244_RS, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI244_RS, "PQRY_PARAMETRI244_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI244_RS,IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL,1,4,0);
  }

  private static void Init_PQRY_MOVIMENTIDEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_MOVIMENTIDEL, 22);
    IMDB.set_TblCode(IMDBDef9.PQRY_MOVIMENTIDEL, "PQRY_MOVIMENTIDEL");
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_DEL,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_TIPO_MOVI, "TIPO_MOVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_TIPO_MOVI,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_TIPO, "DESCR_TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_TIPO,5,23,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_MOVI, "DESCR_MOVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_MOVI,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_IMP_ACC, "NUMERO_IMP_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_IMP_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_IMP_ACC, "ANNO_IMP_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_IMP_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_BEN, "DESCR_BEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_DESCR_BEN,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTIDEL,IMDBDef9.PQSL_MOVIMENTIDEL_SEQUENZA,2,15,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_MOVIMENTIDEL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiDelibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiDelibera()
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
    FormIdx = MyGlb.FRM_MOVIMEDELIBE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F71EF377-3925-4653-B287-BD33B2F4E675";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 610;
    set_Caption(new IDVariant("Movimenti Delibera"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 584;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.19863;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 116;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 116;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.ShowToolbar = false;
    PAN_PARAMETRI.ShowStatusbar = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C69A2B17-D125-406C-9F1F-E6B64B641E7A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1204, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 468;
    Frames[3].Caption = "Movimenti Delibera";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 468;
    PAN_MOVIMEDELIBE = new IDPanel(w, this, 3, "PAN_MOVIMEDELIBE");
    Frames[3].Content = PAN_MOVIMEDELIBE;
    PAN_MOVIMEDELIBE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMEDELIBE.VS = MainFrm.VisualStyleList;
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 468-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8ED5F0E9-FE33-485A-9BAB-35FBE25F0ACF");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 988, 416, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMEDELIBE.InitStatus = 2;
    PAN_MOVIMEDELIBE_Init();
    PAN_MOVIMEDELIBE_InitFields();
    PAN_MOVIMEDELIBE_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA9+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI245, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOVIMEDELIBE_PARAMETRI244();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_MOVIMEDELIBE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SELEZIDELIBE) {
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
    return (obj instanceof MovimentiDelibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiDelibera.class.getName() : (Glb.ClassWithPackage(MovimentiDelibera.class) ? MovimentiDelibera.class.getName().substring(MovimentiDelibera.class.getPackage().getName().length() + 1) : MovimentiDelibera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Movimenti Delibera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMEDELIBE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MOVIMEDELIBE);
      // 
      // Movimenti Delibera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_MOVIMEDELIBE.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEDELIBE_DESCRIZIONE,(new IDVariant(PAN_MOVIMEDELIBE.FieldText(PFL_MOVIMEDELIBE_DESCRIZIONE))).stringValue()); 
      PAN_MOVIMEDELIBE.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEDELIBE_SOGGETTO,(new IDVariant(PAN_MOVIMEDELIBE.FieldText(PFL_MOVIMEDELIBE_SOGGETTO))).stringValue()); 
      PAN_MOVIMEDELIBE.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEDELIBE_TIPO,(new IDVariant(PAN_MOVIMEDELIBE.FieldText(PFL_MOVIMEDELIBE_TIPO))).stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "MovimentiDeliberaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti Delibera On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_MOVIMEDELIBE_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti Delibera On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_MOVIMEDELIBE.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET7+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET7+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "MovimentiDeliberaOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Seleziona Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezionaDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "SelezionaDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "InfoDelibera", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "UnloadEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Stampa
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
      // Procedure Body
      // 
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("SEDE_DEL"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("NUMERO_DEL"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("ANNO_DEL"));
      IDVariant v_MOVIMEDELIBE = new IDVariant(0,IDVariant.STRING);
      v_MOVIMEDELIBE = (new IDVariant("Movimenti_Delibera"));
      IDVariant v_MOVIMDELIBTV = new IDVariant(0,IDVariant.STRING);
      v_MOVIMDELIBTV = (new IDVariant("Movimenti_Delibera_Tv"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0)));
      v_NOMESTAMPA = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_MOVIMEDELIBE);
      if (v_NOMESTAMPA.equals(v_MOVIMDELIBTV, true))
      {
        IDVariant v_NOMEFILE = null;
        v_NOMEFILE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("/")), IDL.FillLR(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0), (new IDVariant(4)), (new IDVariant("0")), true)), (new IDVariant("_"))), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMNUMEDEL, 0)), (new IDVariant(6)), (new IDVariant("0")), true)), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMANNODEL, 0))), (new IDVariant(".pdf")));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("SI")), IDL.Replace(IDL.Replace(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE), (new IDVariant("\\")), (new IDVariant("/"))), (new IDVariant(" ")), (new IDVariant("%20"))), (new IDVariant("")));
      }
      else
      {
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Sede Del Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_SEDEDEL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Sede Del Validate Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PARAMETRI244, IMDBDef9.PQSL_PARAMETRI244_PARAMSEDEDEL, 0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiDelibera", "ParametriSedeDelValidate", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void MOVIMEDELIBE_PARAMETRI244() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI244_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI245, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI245, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI244_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI244_RS, 0, IMDBDef2.TBL_PARAMETRI245, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI244_RS, 0, 0, IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI244_RS, 1, 0, IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI244_RS, 2, 0, IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI245, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI245, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI245, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI244_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_SELEZIDELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_SEDEDEL)
      {
        PFL_PARAMETRI_SEDEDEL_ValidateCell(Cancel);
      }
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
  private void PAN_MOVIMEDELIBE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MOVIMEDELIBE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMEDELIBE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMEDELIBE, Cancel);
    // Stub
  }

  private void PAN_MOVIMEDELIBE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MOVIMEDELIBE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMEDELIBE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOVIMEDELIBE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "AC167F4B-4130-4117-B299-FC23E9835EA9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "Totali");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.PANEL_LIST, 0, -9999, 196, 10, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.PANEL_FORM, 36, 42, 628, 62, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0, 32);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0, 2);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "255BA236-FF89-43D2-8F72-D98C12F6E2F8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Sede Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "BBAF5743-EC8E-45E8-B629-DBD1B39D7659");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "Numero Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "C05A0CF3-2B07-4E63-8F6A-EE059974371E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "Anno Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "C3EB8342-529C-4088-B3CE-08D795B30404");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "7698ECEF-6742-4177-8FC4-13CB1EDEB5B7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "8A65EA21-F6BE-45E7-8A81-62E19E40E5F2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, "3BFB1C12-141F-41B5-B2FB-3278B18D60DC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "2285C1DD-0E3F-48A6-B2AE-4B23EA568476");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "D5E14B02-6F15-45BA-B5EB-E40CEEEED570");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "76FEC591-F25B-4B21-8A4E-06470371DEA2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Sub-Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "5EC7E32A-D75D-4D84-B69F-6FF82D15D76E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "Accertamenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "0E5E524E-6DD7-4F75-8B9E-10A0857F0FD2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "Var. Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "15C69CAA-2022-4F20-9B0D-241C243DC606");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "Var. Sub-Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "B3430D8C-398A-4C76-9D9E-E609FE603C09");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "Var. Accertamenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "3FA3DF31-7003-444C-A1FD-966772A95114");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "Liquidazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "DFA0C88A-BD48-44EE-A6DD-329D1A76B50F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Sede Del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 76, 8, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAMETRI244, "A.PARAMSEDEDEL", "PARAMSEDEDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 144, 8, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI244, "A.PARAMNUMEDEL", "PARAMNUMEDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 112, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "Anno Del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 212, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI244, "A.PARAMANNODEL", "PARAMANNODEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 12, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 12, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 128, 8, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 124, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 136, 16, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 192, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRALABEL, -1, "", "BARRALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_LIST, 244, 8, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_FORM, 260, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SELEZIDELIBE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 252, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 280, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, "Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 64, 56, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, "Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPEGNI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPEGNI, PPQRY_IMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALEIMPEGN", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub-Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 252, 56, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub-Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNI, PPQRY_SUBIMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALESUBIMP", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, "Accertamenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 468, 56, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, "Accertamenti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ACCERTAMENTI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ACCERTAMENTI, PPQRY_ACC, "NVL(SUM(A.IMPORTO), 0)", "TOTALEACCERT", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, "Var. Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 40, 80, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, "Var. Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIMPEGNI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIMPEGNI, PPQRY_VARIMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALVARIMPE", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, "Var. Sub-Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 228, 80, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, "Var. Sub-Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARSUBIMPEGN, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARSUBIMPEGN, PPQRY_VARSUB, "NVL(SUM(A.IMPORTO), 0)", "TOTVARSUBIMP", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, "Var. Accertamenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 444, 80, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, "Var. Accertamenti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARACCERTAME, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARACCERTAME, PPQRY_VARACC, "NVL(SUM(A.IMPORTO), 0)", "TOTALVARACCE", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquidazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 668, 56, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LIQUIDAZIONI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LIQUIDAZIONI, PPQRY_LIQMAN, "NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), A.IMPORTO, 0)), 0)", "TOTALELIQUID", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 688, 80, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_MANDATI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_MANDATI, PPQRY_LIQMAN, "NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), 0, A.IMPORTO)), 0)", "TOTALEMANDAT", 3, 28, 6, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALEIMPEGN ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_IMP <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_IMP, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALESUBIMP ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_IMP <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_SUBIMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SUBIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_SUBIMP, "SUBIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALEACCERT ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_ACC <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALVARIMPE ");
    SQL.append("from ");
    SQL.append("  VARIMP A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_IMP <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARIMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARIMP, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTVARSUBIMP ");
    SQL.append("from ");
    SQL.append("  VARSUB A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_IMP <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARSUB, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARSUB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARSUB, "VARSUB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALVARACCE ");
    SQL.append("from ");
    SQL.append("  VARACC A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_ACC <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARACC, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARACC, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTVARDEFCOM, ");
    SQL.append("  NVL(SUM(A.IMPORTO_CASSA), 0) as TOTVARDEFCAS ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARCOM, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARCOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARCOM, "VARCOM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTVARPROCOM, ");
    SQL.append("  NVL(SUM(A.IMPORTO_CASSA), 0) as TOTVARPROCAS ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARCOMPRO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARCOMPRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARCOMPRO, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), A.IMPORTO, 0)), 0) as TOTALELIQUID, ");
    SQL.append("  NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), 0, A.IMPORTO)), 0) as TOTALEMANDAT ");
    SQL.append("from ");
    SQL.append("  LIQ A ");
    SQL.append("where (A.SEDE_DEL = ~~PARAMSEDEDEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PARAMNUMEDEL~~) ");
    SQL.append("and   (A.ANNO_DEL = ~~PARAMANNODEL~~) ");
    SQL.append("and   (A.ANNO_IMP <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_LIQMAN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_LIQMAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_LIQMAN, "LIQ");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI244", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI244, IMDBDef9.PQRY_PARAMETRI244_RS, IMDBDef2.TBL_PARAMETRI245);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI245");
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

  private void PAN_MOVIMEDELIBE_Init()
  {

    PAN_MOVIMEDELIBE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMEDELIBE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOVIMEDELIBE.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, "D3A00557-AAC1-4717-8232-68946F3EAF18");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, "E-S");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, "EAB9DE93-3DDD-4399-9623-C1463AB1560D");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, "Capitolo");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, "C4F705C3-03D8-457B-8999-29EBD04C7855");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, "Articolo");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, "A93AA94B-EAC6-4268-B6A9-EFF2338BC966");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, "Numero Imp Acc");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, "D9252EE0-38BE-44AF-B7EB-1C506ACF5660");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, "Anno Imp Acc");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, "5570FE44-2F40-486E-BE10-6CC0D5053AAA");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, "Numero Subimp");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, "AEB4F774-FA7B-4C91-A36E-61BE736393A6");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, "Anno Subimp");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, "3ED4B965-B77D-4843-BE92-B8EBCD696AAE");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, "Numero Liq");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, "D640B80A-508A-4E81-BA66-B72F47520C30");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, "Anno Liq");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, "B3A64583-F964-4A9C-80CD-60859C27184A");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, "Mandato");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, "C930DA34-CBF3-4EB2-BF20-F515FFE97933");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, " ");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.VIS_NOFINOBOVEHE);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, "4EE01D0C-1147-4160-AAAB-81C49630C53A");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, " ");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, "9550CFFF-F01B-4962-91D0-556815199A4F");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, "Importo");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, "44D6D164-79B6-4477-892F-1ED25E072DF7");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, "Descrizione");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, "65673845-D23A-4426-B591-A6AD4E9C637F");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, "Soggetto");
    PAN_MOVIMEDELIBE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, "");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, "E07E4643-E811-49A1-955F-12C275E27767");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, "Imp./Acc.");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, "FF1BCB5A-A0D5-4FB0-9978-98DCD697877F");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, "Sub-Impegno");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEDELIBE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, "2CBAA61B-1C26-474F-A5C9-CF766AC1CBDE");
    PAN_MOVIMEDELIBE.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, "Liquidazione");
    PAN_MOVIMEDELIBE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEDELIBE.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_MOVIMEDELIBE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_LIST, 0, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_LIST, 24);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_LIST, "E-S");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ES, MyGlb.PANEL_FORM, "E-S");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ES, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ES, PPQRY_MOVIMENTIDEL, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_LIST, 28, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_FORM, 324, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_CAPITOLO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_CAPITOLO, PPQRY_MOVIMENTIDEL, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ARTICOLO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ARTICOLO, PPQRY_MOVIMENTIDEL, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_LIST, 172, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_LIST, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_LIST, "Num. I. Ac.");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_FORM, 324, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero Imp Acc");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_NUMEROIMPACC, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_NUMEROIMPACC, PPQRY_MOVIMENTIDEL, "A.NUMERO_IMP_ACC", "NUMERO_IMP_ACC", 1, 5, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_LIST, 212, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_LIST, 84);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_LIST, "An. I. Ac.");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 124, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno Imp Acc");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ANNOIMPACC, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ANNOIMPACC, PPQRY_MOVIMENTIDEL, "A.ANNO_IMP_ACC", "ANNO_IMP_ACC", 1, 4, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 248, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 172, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero Subimp");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_NUMEROSUBIMP, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_NUMEROSUBIMP, PPQRY_MOVIMENTIDEL, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_LIST, 292, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_FORM, 324, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno Subimp");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ANNOSUBIMP, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ANNOSUBIMP, PPQRY_MOVIMENTIDEL, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_LIST, 332, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero Liq");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_NUMEROLIQ, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_NUMEROLIQ, PPQRY_MOVIMENTIDEL, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_LIST, 376, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ANNOLIQ, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ANNOLIQ, PPQRY_MOVIMENTIDEL, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_LIST, 412, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_LIST, 84);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_MANDATO, MyGlb.PANEL_FORM, "Mandato");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_MANDATO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_MANDATO, PPQRY_MOVIMENTIDEL, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_LIST, 472, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_LIST, " ");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_ANNOMAND, MyGlb.PANEL_FORM, " ");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_ANNOMAND, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_ANNOMAND, PPQRY_MOVIMENTIDEL, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_LIST, 508, 36, 104, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_LIST, 68);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_LIST, " ");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_FORM, 4, 76, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_TIPO, MyGlb.PANEL_FORM, " ");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_TIPO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_TIPO, PPQRY_MOVIMENTIDEL, "A.DESCR_TIPO", "DESCR_TIPO", 5, 23, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_LIST, 612, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_FORM, 308, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_IMPORTO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_IMPORTO, PPQRY_MOVIMENTIDEL, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 696, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_DESCRIZIONE, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_DESCRIZIONE, PPQRY_MOVIMENTIDEL, "A.DESCR_MOVI", "DESCR_MOVI", 5, 140, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_LIST, 824, 36, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_LIST, 64);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_LIST, "Soggetto");
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_FORM, 4, 244, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEDELIBE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SOGGETTO, MyGlb.PANEL_FORM, "Soggetto");
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_SOGGETTO, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_SOGGETTO, PPQRY_MOVIMENTIDEL, "A.DESCR_BEN", "DESCR_BEN", 5, 40, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_LIST, 172, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_FORM, 172, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_IMPACCLABEL, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_IMPACCLABEL, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_IMPACCLABEL, -1, "", "IMPACCLABEL", 0, 0, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_LIST, 248, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_FORM, 180, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_SUBIMPEGLABE, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_LIST, 332, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEDELIBE.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_FORM, 188, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEDELIBE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEDELIBE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEDELIBE_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEDELIBE.SetFieldPage(PFL_MOVIMEDELIBE_LIQUIDALABEL, -1, -1);
    PAN_MOVIMEDELIBE.SetFieldPanel(PFL_MOVIMEDELIBE_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
  }

  private void PAN_MOVIMEDELIBE_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMEDELIBE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMEDELIBE.SetIMDB(IMDB, "PQRY_MOVIMENTIDEL", true);
    PAN_MOVIMEDELIBE.set_SetString(MyGlb.MASTER_ROWNAME, "MOVIMENTI DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.TIPO_MOVI as TIPO_MOVI, ");
    SQL.append("  A.DESCR_TIPO as DESCR_TIPO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCR_MOVI as DESCR_MOVI, ");
    SQL.append("  A.NUMERO_IMP_ACC as NUMERO_IMP_ACC, ");
    SQL.append("  A.ANNO_IMP_ACC as ANNO_IMP_ACC, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.DESCR_BEN as DESCR_BEN, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.SEQUENZA as SEQUENZA ");
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MOVIMENTI_DEL A ");
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DEL = ~~TBL_PARAMETRI245.PARAMANNODEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~TBL_PARAMETRI245.PARAMNUMEDEL~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~TBL_PARAMETRI245.PARAMSEDEDEL~~) ");
    SQL.append("and   (A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_VAR <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_MOVIMEDELIBE.SetQuery(PPQRY_MOVIMENTIDEL, 5, SQL, -1, "");
    PAN_MOVIMEDELIBE.SetQueryDB(PPQRY_MOVIMENTIDEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMEDELIBE.SetMasterTable(0, "MOVIMENTI_DEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMEDELIBE.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMEDELIBE.iUseListQBE;
      PAN_MOVIMEDELIBE.iUseListQBE = 0;
      PAN_MOVIMEDELIBE.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMEDELIBE.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMEDELIBE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_MOVIMEDELIBE) PAN_MOVIMEDELIBE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
