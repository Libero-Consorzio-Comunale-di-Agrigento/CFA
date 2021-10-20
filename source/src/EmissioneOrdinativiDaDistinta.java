// **********************************************
// Emissione Ordinativi Da Distinta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneOrdinativiDaDistinta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDINDACORRI_ORDINATIVI = 0;
  private static int GRP_ORDINDACORRI_ACCERTAMENTI = 1;

  private static int PFL_ORDINDACORRI_DATA = 0;
  private static int PFL_ORDINDACORRI_CAUSALE = 1;
  private static int PFL_ORDINDACORRI_BOLLO = 2;
  private static int PFL_ORDINDACORRI_UFFICIO = 3;
  private static int PFL_ORDINDACORRI_SPESE = 4;
  private static int PFL_ORDINDACORRI_COMMISSIONI = 5;
  private static int PFL_ORDINDACORRI_ALLEGATI = 6;
  private static int PFL_ORDINDACORRI_INFOTESORIER = 7;
  private static int PFL_ORDINDACORRI_NOTE2 = 8;
  private static int PFL_ORDINDACORRI_NOTE1 = 9;
  private static int PFL_ORDINDACORRI_EMAUVPMDSASC = 10;
  private static int PFL_ORDINDACORRI_IMPUTAECONOM = 11;
  private static int PFL_ORDINDACORRI_CONTROPAPATR = 12;
  private static int PFL_ORDINDACORRI_FATTORDESCRI = 13;
  private static int PFL_ORDINDACORRI_ELABORA = 14;
  private static int PFL_ORDINDACORRI_BOLLATO = 15;

  private static int PPQRY_ORDINDACORR4 = 0;

  private static int PPQRY_FATTORI = 1;

  private static int PPQRY_T58 = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_T53 = 4;
  private static int PPQRY_TIPISPESMINF = 5;


  IDPanel PAN_ORDINDACORRI;

  // Definition of Global Variables
  private IDVariant END1 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ORDINDACORRI(IMDB);
    Init_TBL_PAR107(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR4(IMDB);
    Init_PQRY_ORDINDACORR4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ORDINDACORRI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_ORDINDACORRI, 14);
    IMDB.set_TblCode(IMDBDef6.TBL_ORDINDACORRI, "TBL_ORDINDACORRI");
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORRI,IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO,5,8,0);
    IMDB.TblAddNew(IMDBDef6.TBL_ORDINDACORRI, 0);
  }

  private static void Init_TBL_PAR107(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR107, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR107, "TBL_PAR107");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR107,IMDBDef6.FLD_PAR107_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR107,IMDBDef6.FLD_PAR107_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR107,IMDBDef6.FLD_PAR107_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR107,IMDBDef6.FLD_PAR107_ROWNAMNUMDIS,1,5,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR107, 0);
  }

  private static void Init_PQRY_ORDINDACORR4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR4, 12);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR4, "PQRY_ORDINDACORR4");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO,5,8,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR4, 0);
  }

  private static void Init_PQRY_ORDINDACORR4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR4_RS, 12);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR4_RS, "PQRY_ORDINDACORR4_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR4_RS,IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO,5,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneOrdinativiDaDistinta(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneOrdinativiDaDistinta()
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
    FormIdx = MyGlb.FRM_EMISORDDADIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A636863F-8A18-47D5-8E67-44F20ECBD98E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 548;
    DesignHeight = 446;
    set_Caption(new IDVariant("Emissione Ordinativi Da Distinta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 548;
    Frames[1].Height = 420;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Da Corrispettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 420;
    PAN_ORDINDACORRI = new IDPanel(w, this, 1, "PAN_ORDINDACORRI");
    Frames[1].Content = PAN_ORDINDACORRI;
    PAN_ORDINDACORRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINDACORRI.VS = MainFrm.VisualStyleList;
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 548-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3F0B005-6C9F-4104-8504-AAF76513E6A1");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1124, 292, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINDACORRI.InitStatus = 2;
    PAN_ORDINDACORRI_Init();
    PAN_ORDINDACORRI_InitFields();
    PAN_ORDINDACORRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_ORDINDACORRI, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISORDDADIS_ORDINDACORR4();
      }
      PAN_ORDINDACORRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_ORDINDACORRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINDACORRI_CONTROPAPATR) {
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
    return (obj instanceof EmissioneOrdinativiDaDistinta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneOrdinativiDaDistinta.class.getName() : (Glb.ClassWithPackage(EmissioneOrdinativiDaDistinta.class) ? EmissioneOrdinativiDaDistinta.class.getName().substring(EmissioneOrdinativiDaDistinta.class.getPackage().getName().length() + 1) : EmissioneOrdinativiDaDistinta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data degli ordinativi non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NACCDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NACCA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.ORDEMISSCASSAECONGC4(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEDATA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef6.TBL_PAR107, IMDBDef6.FLD_PAR107_ROWNAMANNDIS, 0), IMDB.Value(IMDBDef6.TBL_PAR107, IMDBDef6.FLD_PAR107_ROWNAMNUMDIS, 0), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEBOLLO, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEUFFIC, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECAUSA, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_RNEAVPMDSASC, 0), v_NORDDA, v_NORDA, v_NACCDA, v_NACCA, v_SVARACC, ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO, 0).equals((new IDVariant(1))))?(new IDVariant("SI")):(new IDVariant("NO"))), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO, 0).equals((new IDVariant(1)), true))?IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, 0):(new IDVariant())), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMECOMMI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMESPESE, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG, 0), v_NSTATOSIOPE);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_SIOPE = new IDVariant(0,IDVariant.STRING);
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Elaborazione Eseguita", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>")));
          if (v_NSTATOSIOPE.equals((new IDVariant(1)), true))
          {
            IDVariant v_STRCGE = new IDVariant(0,IDVariant.STRING);
            v_STRCGE = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale", IDVariant.STRING));
            IDVariant v_STRLIV5 = new IDVariant(0,IDVariant.STRING);
            v_STRLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5"));
            if (MainFrm.SIOPEATTIARM.booleanValue())
            {
              v_SIOPE = new IDVariant(v_STRLIV5);
            }
            else
            {
              v_SIOPE = new IDVariant(v_STRCGE);
            }
          }
          else
          {
            v_SIOPE = (new IDVariant(""));
          }
          if (v_NORDDA.compareTo(v_NORDA, true)<=0)
          {
            IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
            v_ST = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NORDA)), (new IDVariant("<BR/>")));
          }
          else
          {
            IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
            v_ST = (new IDVariant("Non sono stati emessi Ordinativi ", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), (new IDVariant("<BR/>")));
          }
          if (v_NACCDA.compareTo(v_NACCA, true)<=0)
          {
            IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
            v_ST = (new IDVariant("Emessi accertamenti da ", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.ToString(v_NACCDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NACCA)), (new IDVariant("<BR/>")));
          }
          else
          {
            IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
            v_ST = (new IDVariant("Non sono stati emessi accertamenti", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), (new IDVariant("<BR/>")));
          }
          if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
            v_ST = (new IDVariant("Emesse Variazioni agli Accertamenti ", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.SubStr(v_SVARACC, (new IDVariant(0)), (new IDVariant(2)))), (new IDVariant("<BR/>")));
          }
          v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_SIOPE);
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Visibilità
  // **********************************************************************
  public int ControllaVisibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_GESTECO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MODE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlla Visibilità Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.GESTIONE_ECONOMICA as T99GESTIECON, ");
      SQL.append("  A.MODALITA_IMPUTAZIONE_E as T99MODAIMPUE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_GESTECO = QV.Get("T99GESTIECON", IDVariant.INTEGER) ;
        v_MODE = QV.Get("T99MODAIMPUE", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_GESTECO.equals((new IDVariant()), true))
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_MODE.equals((new IDVariant("AC")), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO, 0, (new IDVariant(1)));
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO, 0, (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "ControllaVisibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      END1 = (new IDVariant(0));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEALLEG, 0), (new IDVariant("Allegati")), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note 1
  // **********************************************************************
  public int ApriNote1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note 1 Body
      // Procedure Body
      // 
      END1 = (new IDVariant(1));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMINFTES, 0), (new IDVariant(PAN_ORDINDACORRI.Header(Glb.OBJ_FIELD,PFL_ORDINDACORRI_INFOTESORIER))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "ApriNote1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Licenza
  // **********************************************************************
  public int ControlloLicenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Licenza Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))))).equals((new IDVariant(-1)), true))
      {
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOALLEGA.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "ControlloLicenza", _e);
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
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Emissione Ordinativi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAP, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_RNEAVPMDSASC, 0, (new IDVariant(0)));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPSPEMINCOD ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_E = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SPESE = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMESPESE, 0, new IDVariant(v_SPESE));
      ControllaVisibilità();
      ControlloLicenza();
      PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END1.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END1.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINDACORRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINDACORRI);
      // 
      // Ordinativi Da Corrispettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMIMPECO, 0).equals((new IDVariant(1)), true))
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_FATTORDESCRI,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_FATTORDESCRI))).stringValue()); 
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_ALLEGATI,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_ALLEGATI))).stringValue()); 
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_INFOTESORIER,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_INFOTESORIER))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "OrdinativiDaCorrispettiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Contropartita Patr Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ORDINDACORRI_CONTROPAPATR_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Contropartita Patr Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FATTORI A ");
        SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
        SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Fattore non presente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_STR); 
          IMDB.set_Value(IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR4, IMDBDef15.PQSL_ORDINDACORR4_ROWNAMEFATTO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaDistinta", "AccertamentiContropartitaPatrValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void EMISORDDADIS_ORDINDACORR4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDINDACORR4_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDACORRI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_ORDINDACORRI, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR4_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDINDACORR4_RS, 0, IMDBDef6.TBL_ORDINDACORRI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 0, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 1, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 2, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 3, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 4, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 5, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 6, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 7, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 8, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 9, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 10, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR4_RS, 11, 0, IMDBDef6.TBL_ORDINDACORRI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_ORDINDACORRI, 0);
      if (IMDB.Eof(IMDBDef6.TBL_ORDINDACORRI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDACORRI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDINDACORR4_RS, 0);
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
  private void PAN_ORDINDACORRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINDACORRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINDACORRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINDACORRI, Cancel);
    // Stub
  }

  private void PAN_ORDINDACORRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINDACORRI_NOTE2)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_NOTE1)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINDACORRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ORDINDACORRI_CONTROPAPATR)
      {
        PFL_ORDINDACORRI_CONTROPAPATR_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINDACORRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINDACORRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINDACORRI_Init()
  {

    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "F3DFBDCD-1307-4D63-B30A-EC528F319C81");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "Ordinativi");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.PANEL_LIST, 248, -9999, 696, 16, 0, 0);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.PANEL_FORM, 24, 7, 496, 217, 0, 0);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0, 55);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 1, 13);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0, 4);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 1, 4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "FA5A67F2-C964-4B25-A5EF-F803DE3D8C8C");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "Accertamenti");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 1064, 16, 0, 0);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 24, 231, 496, 121, 0, 0);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0, 77);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 1, 13);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0, 4);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 1, 4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "2E879CC6-E51A-4D3C-AD54-F6FA86924B12");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "Data");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "A2AE3AC5-E7AB-4F07-9D01-BC6379B58EAF");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "Causale");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "54EBAAF2-74D4-4B8F-802D-5C8F9B4B4CD6");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "Bollo");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "D0309D05-B8EE-4B51-9960-33686990B0A0");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "Ufficio");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "5E127B0D-537C-41C7-B55C-B0A921850879");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "Spese");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "770A63A1-24A8-4309-83EF-7065F71894D7");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "Commissioni");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "F10FDE15-322A-4828-929B-81BB78E9647A");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "Allegati");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "0D39268D-D525-4372-B9BE-41768CBDDFA7");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "Info Tesoriere");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, "2BCFA556-359B-4D3E-B0A1-302507253290");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, 0, "testo1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, "9FCFF66E-2365-4464-8A2F-517BC7C0226D");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, 0, "testo1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "BA52856F-7917-41C0-B405-E9830BC92B6B");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "8F41379D-AD2D-4E9D-AC4C-811EA21121DA");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "Imputazione Economica");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "8FF4950E-D52A-4A4D-8A81-19F5BB29CDD8");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "Contropartita Patr.");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "05F7C0D9-6D5B-4084-B36E-30BBE891ED55");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, "665DE199-0D7C-4E47-B1EF-88194692F4A0");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, "Elabora");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, 0, "button1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "4805DEB1-C4C9-491D-B9C1-DBAF22D3A203");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "Bollato");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINDACORRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 80, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 36);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_DATA, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_DATA, PPQRY_ORDINDACORR4, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 60, 56, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_CAUSALE, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_CAUSALE, PPQRY_ORDINDACORR4, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 76, 80, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_BOLLO, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_BOLLO, PPQRY_ORDINDACORR4, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 68, 104, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_UFFICIO, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_UFFICIO, PPQRY_ORDINDACORR4, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 472, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 68, 128, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_SPESE, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_SPESE, PPQRY_ORDINDACORR4, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 512, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 36, 152, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_COMMISSIONI, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_COMMISSIONI, PPQRY_ORDINDACORR4, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 616, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 64, 176, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_ALLEGATI, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_ALLEGATI, PPQRY_ORDINDACORR4, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 49, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 824, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 28, 200, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_INFOTESORIER, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_INFOTESORIER, PPQRY_ORDINDACORR4, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 49, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 476, 308, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 500, 176, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NOTE2, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NOTE2, -1, "", "NOTE2", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 484, 316, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 500, 200, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NOTE1, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 944, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 452);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, "E. A. V. P. M. D. S. A. S. C.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 196, 256, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 296);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_EMAUVPMDSASC, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_EMAUVPMDSASC, PPQRY_ORDINDACORR4, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 984, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, "Im. E.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 348, 296, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 144);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imputazione Economica");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_IMPUTAECONOM, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_IMPUTAECONOM, PPQRY_ORDINDACORR4, "A.ROWNAMIMPECO", "ROWNAMIMPECO", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_IMPUTAECONOM, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_IMPUTAECONOM, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 1024, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 44);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, "Cn. P.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 28, 328, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 112);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_CONTROPAPATR, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_CONTROPAPATR, PPQRY_ORDINDACORR4, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 8, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 224, 328, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_FATTORDESCRI, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 440, 364, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_ELABORA, -1, -1);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, "Boll.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 4, 388, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, "Boll.");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_BOLLATO, -1, -1);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_BOLLATO, PPQRY_ORDINDACORR4, "A.ROWNAMEBOLLA", "ROWNAMEBOLLA", 1, 2, 0, -13997);
  }

  private void PAN_ORDINDACORRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDACORRI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECAUSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T58, 0, SQL, PFL_ORDINDACORRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T58, 1, SQL, PFL_ORDINDACORRI_CAUSALE, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T60, 0, SQL, PFL_ORDINDACORRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T60, 1, SQL, PFL_ORDINDACORRI_BOLLO, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T53, 0, SQL, PFL_ORDINDACORRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T53, 1, SQL, PFL_ORDINDACORRI_UFFICIO, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_ORDINDACORRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_ORDINDACORRI_SPESE, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDACORRI.SetIMDB(IMDB, "PQRY_ORDINDACORR4", true);
    PAN_ORDINDACORRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINDACORRI.SetQueryIMDB(PPQRY_ORDINDACORR4, IMDBDef15.PQRY_ORDINDACORR4_RS, IMDBDef6.TBL_ORDINDACORRI);
    JustLoaded = true;
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_DATA, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEDATA);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_CAUSALE, IMDBDef6.FLD_ORDINDACORRI_ROWNAMECAUSA);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_BOLLO, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLO);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_UFFICIO, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEUFFIC);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_SPESE, IMDBDef6.FLD_ORDINDACORRI_ROWNAMESPESE);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_COMMISSIONI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMECOMMI);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_ALLEGATI, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEALLEG);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_INFOTESORIER, IMDBDef6.FLD_ORDINDACORRI_ROWNAMINFTES);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_EMAUVPMDSASC, IMDBDef6.FLD_ORDINDACORRI_RNEAVPMDSASC);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_IMPUTAECONOM, IMDBDef6.FLD_ORDINDACORRI_ROWNAMIMPECO);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_CONTROPAPATR, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEFATTO);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_BOLLATO, IMDBDef6.FLD_ORDINDACORRI_ROWNAMEBOLLA);
    PAN_ORDINDACORRI.SetMasterTable(0, "ORDINDACORRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINDACORRI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINDACORRI.iUseListQBE;
      PAN_ORDINDACORRI.iUseListQBE = 0;
      PAN_ORDINDACORRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINDACORRI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINDACORRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
