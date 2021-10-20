// **********************************************
// Parametri Avanzo Esercizio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriAvanzoEsercizio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMEESERCI_ESTRAZIODATI = 0;

  private static int PFL_PARAMEESERCI_ESERCIZIO = 0;
  private static int PFL_PARAMEESERCI_ETICLABSXESE = 1;
  private static int PFL_PARAMEESERCI_ESTRAZIODATI = 2;

  private static int PPQRY_PARAMETRI471 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_PARAMEESERCI;
  private static int PFL_PARAVERSSALV_VERSIOSALVA1 = 0;

  private static int PPQRY_PARAMETRI479 = 0;

  private static int PPQRY_ENTITASALVA1 = 1;


  IDPanel PAN_PARAVERSSALV;
  private static int GRP_PARAAVANINIZ_AVANZOINIZIA = 0;

  private static int PFL_PARAAVANINIZ_AVANZOINIZIA = 0;
  private static int PFL_PARAAVANINIZ_VERSIOSALVAT = 1;

  private static int PPQRY_PARAMETRI495 = 0;

  private static int PPQRY_ENTITASALVAT = 1;


  IDPanel PAN_PARAAVANINIZ;
  private static int PFL_PARAMEELABOR_ELABORA = 0;

  private static int PPQRY_MASTERQUERY = 0;


  IDPanel PAN_PARAMEELABOR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI696(IMDB);
    //
    //
    Init_PQRY_PARAMETRI471(IMDB);
    Init_PQRY_PARAMETRI471_RS(IMDB);
    Init_PQRY_PARAMETRI479(IMDB);
    Init_PQRY_PARAMETRI479_RS(IMDB);
    Init_PQRY_PARAMETRI495(IMDB);
    Init_PQRY_PARAMETRI495_RS(IMDB);
    Init_PQRY_MASTERQUERY(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI696(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI696, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI696, "TBL_PARAMETRI696");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI, "PARAESTRDATI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ, "PARAAVANINIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN, "PARAVERSAVAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV, "PARAVERSSALV");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARATIPOAVAN, "PARATIPOAVAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARATIPOAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAFONDACCA, "PARAFONDACCA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI696,IMDBDef4.FLD_PARAMETRI696_PARAFONDACCA,5,50,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI696, 0);
  }

  private static void Init_PQRY_PARAMETRI471(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI471, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI471, "PQRY_PARAMETRI471");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI471,IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI471,IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI471,IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, "PARAESTRDATI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI471,IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI,5,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI471, 0);
  }

  private static void Init_PQRY_PARAMETRI471_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI471_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI471_RS, "PQRY_PARAMETRI471_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI471_RS,IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI471_RS,IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI471_RS,IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, "PARAESTRDATI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI471_RS,IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI,5,2,0);
  }

  private static void Init_PQRY_PARAMETRI479(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI479, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI479, "PQRY_PARAMETRI479");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI479,IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV, "PARAVERSSALV");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI479,IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI479, 0);
  }

  private static void Init_PQRY_PARAMETRI479_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI479_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI479_RS, "PQRY_PARAMETRI479_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI479_RS,IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV, "PARAVERSSALV");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI479_RS,IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV,3,10,0);
  }

  private static void Init_PQRY_PARAMETRI495(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI495, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI495, "PQRY_PARAMETRI495");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI495,IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ, "PARAAVANINIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI495,IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI495,IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN, "PARAVERSAVAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI495,IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI495, 0);
  }

  private static void Init_PQRY_PARAMETRI495_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI495_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI495_RS, "PQRY_PARAMETRI495_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI495_RS,IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ, "PARAAVANINIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI495_RS,IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI495_RS,IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN, "PARAVERSAVAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI495_RS,IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN,3,10,0);
  }

  private static void Init_PQRY_MASTERQUERY(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_MASTERQUERY, 0);
    IMDB.set_TblCode(IMDBDef13.PQRY_MASTERQUERY, "PQRY_MASTERQUERY");
    IMDB.TblAddNew(IMDBDef13.PQRY_MASTERQUERY, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriAvanzoEsercizio(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriAvanzoEsercizio()
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
    FormIdx = MyGlb.FRM_PARAAVANESER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3A17006D-4F94-4D4D-8A9B-3E0DA1118057";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 588;
    DesignHeight = 326;
    set_Caption(new IDVariant("Avanzo Esercizio"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 588;
    Frames[1].Height = 300;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.306667;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 588;
    Frames[2].Height = 92;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Esercizio";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 92;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMEESERCI = new IDPanel(w, this, 2, "PAN_PARAMEESERCI");
    Frames[2].Content = PAN_PARAMEESERCI;
    PAN_PARAMEESERCI.Lockable = false;
    PAN_PARAMEESERCI.iLocked = false;
    PAN_PARAMEESERCI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEESERCI.VS = MainFrm.VisualStyleList;
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEESERCI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D69AB976-BA61-471E-B594-01E633F241EF");
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 136, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEESERCI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEESERCI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEESERCI.InitStatus = 1;
    PAN_PARAMEESERCI_Init();
    PAN_PARAMEESERCI_InitFields();
    PAN_PARAMEESERCI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 588;
    Frames[3].Height = 208;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.153846;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 588;
    Frames[4].Height = 32;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Parametri Versione Salvata";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 32;
    Frames[4].MinHeight = Frames[4].Height;
    Frames[4].MaxHeight = Frames[4].Height;
    PAN_PARAVERSSALV = new IDPanel(w, this, 4, "PAN_PARAVERSSALV");
    Frames[4].Content = PAN_PARAVERSSALV;
    PAN_PARAVERSSALV.Lockable = false;
    PAN_PARAVERSSALV.iLocked = false;
    PAN_PARAVERSSALV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAVERSSALV.VS = MainFrm.VisualStyleList;
    PAN_PARAVERSSALV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAVERSSALV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EDDA2A48-57DD-4DE6-8276-A781C68697F5");
    PAN_PARAVERSSALV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAVERSSALV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAVERSSALV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAVERSSALV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAVERSSALV.InitStatus = 1;
    PAN_PARAVERSSALV_Init();
    PAN_PARAVERSSALV_InitFields();
    PAN_PARAVERSSALV_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 588;
    Frames[5].Height = 176;
    Frames[5].Vertical = true;
    Frames[5].FormFactor = 0.5;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 588;
    Frames[6].Height = 88;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Parametri Avanzo Iniziale";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 88;
    PAN_PARAAVANINIZ = new IDPanel(w, this, 6, "PAN_PARAAVANINIZ");
    Frames[6].Content = PAN_PARAAVANINIZ;
    PAN_PARAAVANINIZ.Lockable = false;
    PAN_PARAAVANINIZ.iLocked = false;
    PAN_PARAAVANINIZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAAVANINIZ.VS = MainFrm.VisualStyleList;
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAAVANINIZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6CE2912F-6438-452C-97BE-CD7CA121BB13");
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 144, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAAVANINIZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAAVANINIZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAAVANINIZ.InitStatus = 1;
    PAN_PARAAVANINIZ_Init();
    PAN_PARAAVANINIZ_InitFields();
    PAN_PARAAVANINIZ_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 588;
    Frames[7].Height = 88;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "Parametri Elabora";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 88;
    Frames[7].MinHeight = Frames[7].Height;
    Frames[7].MaxHeight = Frames[7].Height;
    PAN_PARAMEELABOR = new IDPanel(w, this, 7, "PAN_PARAMEELABOR");
    Frames[7].Content = PAN_PARAMEELABOR;
    PAN_PARAMEELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEELABOR.VS = MainFrm.VisualStyleList;
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "65248C79-B460-4C8F-B389-5D529F1E72AF");
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEELABOR.InitStatus = 1;
    PAN_PARAMEELABOR_Init();
    PAN_PARAMEELABOR_InitFields();
    PAN_PARAMEELABOR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI696, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARAAVANESER_PARAMETRI471();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI696, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARAAVANESER_PARAMETRI479();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI696, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARAAVANESER_PARAMETRI495();
      }
      PAN_PARAMEESERCI.UpdatePanel(MainFrm);
      PAN_PARAVERSSALV.UpdatePanel(MainFrm);
      PAN_PARAAVANINIZ.UpdatePanel(MainFrm);
      PAN_PARAMEELABOR.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriAvanzoEsercizio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriAvanzoEsercizio.class.getName() : (Glb.ClassWithPackage(ParametriAvanzoEsercizio.class) ? ParametriAvanzoEsercizio.class.getName().substring(ParametriAvanzoEsercizio.class.getPackage().getName().length() + 1) : ParametriAvanzoEsercizio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Esercizio On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEESERCI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMEESERCI);
      // 
      // Parametri Esercizio On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, 0).equals((new IDVariant("DS")), true))
      {
        PAN_PARAVERSSALV.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PARAAVANINIZ.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_PARAVERSSALV.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PARAAVANINIZ.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "ParametriEsercizioOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Esercizio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEESERCI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Esercizio On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMEESERCI_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        PAN_PARAAVANINIZ.ClearValueList(PFL_PARAAVANINIZ_AVANZOINIZIA);
        PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("SA")), ((new IDVariant("SA")).equals((new IDVariant("SA")))? new IDVariant("Da Saldi Avanzo") : (new IDVariant("SA")).equals((new IDVariant("FE")))? new IDVariant("Finale Esercizio") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("FE")), IDL.Add(IDL.Add(((new IDVariant("FE")).equals((new IDVariant("SA")))? new IDVariant("Da Saldi Avanzo") : (new IDVariant("FE")).equals((new IDVariant("FE")))? new IDVariant("Finale Esercizio") :  new IDVariant()), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ, 0), (new IDVariant(1))))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARAMEESERCI_ESTRAZIODATI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, 0).equals((new IDVariant("DS")), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "ParametriEsercizioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri Avanzo Iniziale On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAAVANINIZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAAVANINIZ);
      // 
      // Parametri Avanzo Iniziale On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ, 0).equals((new IDVariant("SA")), true))
      {
        PAN_PARAAVANINIZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAAVANINIZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "ParametriAvanzoInizialeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Avanzo Iniziale On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAAVANINIZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Avanzo Iniziale On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAAVANINIZ_AVANZOINIZIA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ, 0).equals((new IDVariant("SA")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "ParametriAvanzoInizialeOnUpdatingRow", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI, 0, (new IDVariant("RC")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ, 0, (new IDVariant("SA")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARATIPOAVAN, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAFONDACCA, 0, (new IDVariant("-1")));
      PAN_PARAAVANINIZ.ClearValueList(PFL_PARAAVANINIZ_AVANZOINIZIA);
      PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("SA")), ((new IDVariant("SA")).equals((new IDVariant("SA")))? new IDVariant("Da Saldi Avanzo") : (new IDVariant("SA")).equals((new IDVariant("FE")))? new IDVariant("Finale Esercizio") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("FE")), IDL.Add(IDL.Add(((new IDVariant("FE")).equals((new IDVariant("SA")))? new IDVariant("Da Saldi Avanzo") : (new IDVariant("FE")).equals((new IDVariant("FE")))? new IDVariant("Finale Esercizio") :  new IDVariant()), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAVERSSALV.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_PARAAVANINIZ.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARATIPOAVAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAFONDACCA, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Indicare la Versione Salvata."));
      if ((IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, 0).equals((new IDVariant("RC")), true) && IMDB.Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAAVANINIZ, 0).equals((new IDVariant("FE")), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN, 0))) || (IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAESTRDATI, 0).equals((new IDVariant("DS")), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI479, IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV, 0))))
      {
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CALCOLAAVANZOESERCIZIO(IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PARAMETRI495, IMDBDef13.PQSL_PARAMETRI495_PARAVERSAVAN, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.UnloadForm(MyGlb.FRM_AVANZOESERCI,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI471, IMDBDef13.PQSL_PARAMETRI471_PARAMESERCIZ, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI479, IMDBDef13.PQSL_PARAMETRI479_PARAVERSSALV, 0));
        MainFrm.Show(MyGlb.FRM_AVANZOESERCI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAvanzoEsercizio", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PARAAVANESER_PARAMETRI471() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI471_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI471_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI471_RS, 0, IMDBDef4.TBL_PARAMETRI696, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI471_RS, 0, 0, IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI471_RS, 1, 0, IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI696, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI471_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PARAAVANESER_PARAMETRI479() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI479_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI479_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI479_RS, 0, IMDBDef4.TBL_PARAMETRI696, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI479_RS, 0, 0, IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI696, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI479_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PARAAVANESER_PARAMETRI495() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI495_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI495_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI495_RS, 0, IMDBDef4.TBL_PARAMETRI696, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI495_RS, 0, 0, IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI495_RS, 1, 0, IMDBDef4.TBL_PARAMETRI696, IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI696, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI696, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI696, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI495_RS, 0);
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
  private void PAN_PARAMEESERCI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEESERCI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEESERCI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEESERCI, Cancel);
    // Stub
  }

  private void PAN_PARAMEESERCI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEESERCI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMEESERCI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEESERCI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEESERCI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAVERSSALV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAVERSSALV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAVERSSALV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAVERSSALV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAVERSSALV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAVERSSALV);
    // Stub
  }

  private void PAN_PARAVERSSALV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAVERSSALV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAVERSSALV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAVERSSALV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAAVANINIZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAAVANINIZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAAVANINIZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAAVANINIZ, Cancel);
    // Stub
  }

  private void PAN_PARAAVANINIZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAAVANINIZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAAVANINIZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAAVANINIZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAAVANINIZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEELABOR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEELABOR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEELABOR);
    // Stub
  }

  private void PAN_PARAMEELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMEELABOR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMEELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMEELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMEESERCI_Init()
  {

    PAN_PARAMEESERCI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEESERCI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMEESERCI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, "7531E9C9-3358-4AE4-979F-A97B2BD0476A");
    PAN_PARAMEESERCI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, "Estrazione Dati");
    PAN_PARAMEESERCI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, "");
    PAN_PARAMEESERCI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_LIST, 0, -9999, 88, 10, 0, 0);
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_FORM, 12, 46, 552, 38, 0, 0);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, 0, 85);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, 1, 13);
    PAN_PARAMEESERCI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, 0, 2);
    PAN_PARAMEESERCI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, 1, 2);
    PAN_PARAMEESERCI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEESERCI_ESTRAZIODATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEESERCI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMEESERCI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, "8595F25C-1A6C-4A68-9914-E1190DF0452E");
    PAN_PARAMEESERCI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, "Esercizio");
    PAN_PARAMEESERCI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, "");
    PAN_PARAMEESERCI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESERCI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEESERCI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, "4F68762D-97AC-4953-AAAE-0003F68ACEE1");
    PAN_PARAMEESERCI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, "");
    PAN_PARAMEESERCI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAMEESERCI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMEESERCI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, "3DE88EDE-955B-4AB4-86D8-6F2A1C8DF2C5");
    PAN_PARAMEESERCI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, "Estrazione Dati");
    PAN_PARAMEESERCI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, "");
    PAN_PARAMEESERCI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMEESERCI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMEESERCI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESERCI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_FORM, 100, 12, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESERCI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMEESERCI.SetFieldPage(PFL_PARAMEESERCI_ESERCIZIO, -1, -1);
    PAN_PARAMEESERCI.SetFieldPanel(PFL_PARAMEESERCI_ESERCIZIO, PPQRY_PARAMETRI471, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_LIST, 16, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_FORM, 16, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ETICLABSXESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESERCI.SetFieldPage(PFL_PARAMEESERCI_ETICLABSXESE, -1, GRP_PARAMEESERCI_ESTRAZIODATI);
    PAN_PARAMEESERCI.SetFieldPanel(PFL_PARAMEESERCI_ETICLABSXESE, -1, "", "ETICLABSXESE", 0, 0, 0, -13997);
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_LIST, 96);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESERCI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_LIST, "Estraz. Dati");
    PAN_PARAMEESERCI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_FORM, 164, 60, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESERCI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEESERCI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESERCI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESERCI_ESTRAZIODATI, MyGlb.PANEL_FORM, "Estrazione Dati");
    PAN_PARAMEESERCI.SetFieldPage(PFL_PARAMEESERCI_ESTRAZIODATI, -1, GRP_PARAMEESERCI_ESTRAZIODATI);
    PAN_PARAMEESERCI.SetFieldPanel(PFL_PARAMEESERCI_ESTRAZIODATI, PPQRY_PARAMETRI471, "A.PARAESTRDATI", "PARAESTRDATI", 5, 2, 0, -13997);
    PAN_PARAMEESERCI.SetValueListItem(PFL_PARAMEESERCI_ESTRAZIODATI, (new IDVariant("RC")), "Ricalcola", "", "", -1);
    PAN_PARAMEESERCI.SetValueListItem(PFL_PARAMEESERCI_ESTRAZIODATI, (new IDVariant("DS")), "Dati Salvati", "", "", -1);
  }

  private void PAN_PARAMEESERCI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEESERCI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~PARAMESERCIZ~~) ");
    SQL.append("and   (A.FASE_BILANCIO < 10) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMEESERCI.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_PARAMEESERCI_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.FASE_BILANCIO < 10) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMEESERCI.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_PARAMEESERCI_ESERCIZIO, "");
    PAN_PARAMEESERCI.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEESERCI.SetIMDB(IMDB, "PQRY_PARAMETRI471", true);
    PAN_PARAMEESERCI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMEESERCI.SetQueryIMDB(PPQRY_PARAMETRI471, IMDBDef13.PQRY_PARAMETRI471_RS, IMDBDef4.TBL_PARAMETRI696);
    JustLoaded = true;
    PAN_PARAMEESERCI.SetFieldPrimaryIndex(PFL_PARAMEESERCI_ESERCIZIO, IMDBDef4.FLD_PARAMETRI696_PARAMESERCIZ);
    PAN_PARAMEESERCI.SetFieldPrimaryIndex(PFL_PARAMEESERCI_ESTRAZIODATI, IMDBDef4.FLD_PARAMETRI696_PARAESTRDATI);
    PAN_PARAMEESERCI.SetMasterTable(0, "PARAMETRI696");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEESERCI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEESERCI.iUseListQBE;
      PAN_PARAMEESERCI.iUseListQBE = 0;
      PAN_PARAMEESERCI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEESERCI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEESERCI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAVERSSALV_Init()
  {

    PAN_PARAVERSSALV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAVERSSALV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAVERSSALV.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAVERSSALV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, "7F3CFC0A-B867-401D-8903-D6799EFE4F7A");
    PAN_PARAVERSSALV.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, "Versione Salvata");
    PAN_PARAVERSSALV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, "");
    PAN_PARAVERSSALV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVERSSALV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAVERSSALV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAVERSSALV.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVERSSALV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_LIST, 104);
    PAN_PARAVERSSALV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAVERSSALV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_LIST, "Vers. Salv.");
    PAN_PARAVERSSALV.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_FORM, 16, 4, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVERSSALV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_FORM, 144);
    PAN_PARAVERSSALV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAVERSSALV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVERSSALV_VERSIOSALVA1, MyGlb.PANEL_FORM, "Versione Salvata");
    PAN_PARAVERSSALV.SetFieldPage(PFL_PARAVERSSALV_VERSIOSALVA1, -1, -1);
    PAN_PARAVERSSALV.SetFieldPanel(PFL_PARAVERSSALV_VERSIOSALVA1, PPQRY_PARAMETRI479, "A.PARAVERSSALV", "PARAVERSSALV", 3, 10, 0, -13997);
  }

  private void PAN_PARAVERSSALV_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAVERSSALV.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SALVATAGGIO as ENTISALIDSAL, ");
    SQL.append("  A.DATA_SALVATAGGIO as ENTSALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as ENTSALNOTSAL ");
    SQL.append("from ");
    SQL.append("  ENTITA_SALVATE A ");
    SQL.append("where (A.ID_SALVATAGGIO = ~~PARAVERSSALV~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI471.PARAMESERCIZ~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAVERSSALV.SetQuery(PPQRY_ENTITASALVA1, 0, SQL, PFL_PARAVERSSALV_VERSIOSALVA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SALVATAGGIO as ENTISALIDSAL, ");
    SQL.append("  A.DATA_SALVATAGGIO as ENTSALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as ENTSALNOTSAL ");
    SQL.append("from ");
    SQL.append("  ENTITA_SALVATE A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI471.PARAMESERCIZ~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAVERSSALV.SetQuery(PPQRY_ENTITASALVA1, 1, SQL, PFL_PARAVERSSALV_VERSIOSALVA1, "");
    PAN_PARAVERSSALV.SetQueryDB(PPQRY_ENTITASALVA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAVERSSALV.SetIMDB(IMDB, "PQRY_PARAMETRI479", true);
    PAN_PARAVERSSALV.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAVERSSALV.SetQueryIMDB(PPQRY_PARAMETRI479, IMDBDef13.PQRY_PARAMETRI479_RS, IMDBDef4.TBL_PARAMETRI696);
    JustLoaded = true;
    PAN_PARAVERSSALV.SetFieldPrimaryIndex(PFL_PARAVERSSALV_VERSIOSALVA1, IMDBDef4.FLD_PARAMETRI696_PARAVERSSALV);
    PAN_PARAVERSSALV.SetMasterTable(0, "PARAMETRI696");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAVERSSALV.Status() == 2)
    {
      int oldListQBE = PAN_PARAVERSSALV.iUseListQBE;
      PAN_PARAVERSSALV.iUseListQBE = 0;
      PAN_PARAVERSSALV.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAVERSSALV.PanelCommand(Glb.PCM_FIND);
      PAN_PARAVERSSALV.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAAVANINIZ_Init()
  {

    PAN_PARAAVANINIZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAAVANINIZ.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAAVANINIZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, "3BF76187-0B78-4806-AF5E-8CB6DA415860");
    PAN_PARAAVANINIZ.set_Header(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, "Avanzo Iniziale");
    PAN_PARAAVANINIZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, "");
    PAN_PARAAVANINIZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_LIST, 0, -9999, 96, 10, 0, 0);
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_FORM, 12, 10, 552, 66, 0, 0);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, 0, 86);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, 1, 13);
    PAN_PARAAVANINIZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, 0, 2);
    PAN_PARAAVANINIZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, 1, 2);
    PAN_PARAAVANINIZ.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAAVANINIZ_AVANZOINIZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAAVANINIZ.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAAVANINIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, "6505C5F4-53D3-41F6-AC67-AAD502260764");
    PAN_PARAAVANINIZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, "Avanzo Iniziale");
    PAN_PARAAVANINIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, "");
    PAN_PARAAVANINIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAAVANINIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAAVANINIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, "E26F7C5F-0529-4F35-90BA-33112EFBF063");
    PAN_PARAAVANINIZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, "Versione Salvata");
    PAN_PARAAVANINIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, "");
    PAN_PARAAVANINIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAAVANINIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAAVANINIZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_PARAAVANINIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAAVANINIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_LIST, "Avanzo Iniziale");
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_FORM, 164, 24, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_FORM, 128);
    PAN_PARAAVANINIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAAVANINIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_AVANZOINIZIA, MyGlb.PANEL_FORM, "Avanzo Iniziale");
    PAN_PARAAVANINIZ.SetFieldPage(PFL_PARAAVANINIZ_AVANZOINIZIA, -1, GRP_PARAAVANINIZ_AVANZOINIZIA);
    PAN_PARAAVANINIZ.SetFieldPanel(PFL_PARAAVANINIZ_AVANZOINIZIA, PPQRY_PARAMETRI495, "A.PARAAVANINIZ", "PARAAVANINIZ", 5, 2, 0, -13997);
    PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("SA")), "Da Saldi Avanzo", "", "", -1);
    PAN_PARAAVANINIZ.SetValueListItem(PFL_PARAAVANINIZ_AVANZOINIZIA, (new IDVariant("FE")), "Finale Esercizio", "", "", -1);
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_LIST, 104);
    PAN_PARAAVANINIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAAVANINIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_LIST, "Vrs. Sl.");
    PAN_PARAAVANINIZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_FORM, 16, 52, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAAVANINIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_FORM, 144);
    PAN_PARAAVANINIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAAVANINIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAAVANINIZ_VERSIOSALVAT, MyGlb.PANEL_FORM, "Versione Salvata");
    PAN_PARAAVANINIZ.SetFieldPage(PFL_PARAAVANINIZ_VERSIOSALVAT, -1, GRP_PARAAVANINIZ_AVANZOINIZIA);
    PAN_PARAAVANINIZ.SetFieldPanel(PFL_PARAAVANINIZ_VERSIOSALVAT, PPQRY_PARAMETRI495, "A.PARAVERSAVAN", "PARAVERSAVAN", 3, 10, 0, -13997);
  }

  private void PAN_PARAAVANINIZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAAVANINIZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SALVATAGGIO as ENTISALIDSAL, ");
    SQL.append("  A.DATA_SALVATAGGIO as ENTSALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as ENTSALNOTSAL ");
    SQL.append("from ");
    SQL.append("  ENTITA_SALVATE A ");
    SQL.append("where (A.ID_SALVATAGGIO = ~~PARAVERSAVAN~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI471.PARAMESERCIZ~~ - 1) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAAVANINIZ.SetQuery(PPQRY_ENTITASALVAT, 0, SQL, PFL_PARAAVANINIZ_VERSIOSALVAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_SALVATAGGIO as ENTISALIDSAL, ");
    SQL.append("  A.DATA_SALVATAGGIO as ENTSALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as ENTSALNOTSAL ");
    SQL.append("from ");
    SQL.append("  ENTITA_SALVATE A ");
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI471.PARAMESERCIZ~~ - 1) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAAVANINIZ.SetQuery(PPQRY_ENTITASALVAT, 1, SQL, PFL_PARAAVANINIZ_VERSIOSALVAT, "");
    PAN_PARAAVANINIZ.SetQueryDB(PPQRY_ENTITASALVAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAAVANINIZ.SetIMDB(IMDB, "PQRY_PARAMETRI495", true);
    PAN_PARAAVANINIZ.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAAVANINIZ.SetQueryIMDB(PPQRY_PARAMETRI495, IMDBDef13.PQRY_PARAMETRI495_RS, IMDBDef4.TBL_PARAMETRI696);
    JustLoaded = true;
    PAN_PARAAVANINIZ.SetFieldPrimaryIndex(PFL_PARAAVANINIZ_AVANZOINIZIA, IMDBDef4.FLD_PARAMETRI696_PARAAVANINIZ);
    PAN_PARAAVANINIZ.SetFieldPrimaryIndex(PFL_PARAAVANINIZ_VERSIOSALVAT, IMDBDef4.FLD_PARAMETRI696_PARAVERSAVAN);
    PAN_PARAAVANINIZ.SetMasterTable(0, "PARAMETRI696");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAAVANINIZ.Status() == 2)
    {
      int oldListQBE = PAN_PARAAVANINIZ.iUseListQBE;
      PAN_PARAAVANINIZ.iUseListQBE = 0;
      PAN_PARAAVANINIZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAAVANINIZ.PanelCommand(Glb.PCM_FIND);
      PAN_PARAAVANINIZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEELABOR_Init()
  {

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, "77E26DB6-64BC-4C75-B21A-B23D7AAA9C8D");
    PAN_PARAMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, "Elabora");
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMEELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, 0, "button1.gif", false);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMEELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 588, 120, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 480, 16, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEELABOR.SetFieldPage(PFL_PARAMEELABOR_ELABORA, -1, -1);
    PAN_PARAMEELABOR.SetFieldPanel(PFL_PARAMEELABOR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMEELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEELABOR.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEELABOR.iUseListQBE;
      PAN_PARAMEELABOR.iUseListQBE = 0;
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEELABOR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMEESERCI) PAN_PARAMEESERCI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAVERSSALV) PAN_PARAVERSSALV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAAVANINIZ) PAN_PARAAVANINIZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEESERCI) PAN_PARAMEESERCI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAVERSSALV) PAN_PARAVERSSALV_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAAVANINIZ) PAN_PARAAVANINIZ_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMEESERCI) PAN_PARAMEESERCI_DynamicProperties();
    if (SrcObj == PAN_PARAVERSSALV) PAN_PARAVERSSALV_DynamicProperties();
    if (SrcObj == PAN_PARAAVANINIZ) PAN_PARAAVANINIZ_DynamicProperties();
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEESERCI) PAN_PARAMEESERCI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAVERSSALV) PAN_PARAVERSSALV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAAVANINIZ) PAN_PARAAVANINIZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMEESERCI) PAN_PARAMEESERCI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAVERSSALV) PAN_PARAVERSSALV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAAVANINIZ) PAN_PARAAVANINIZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
