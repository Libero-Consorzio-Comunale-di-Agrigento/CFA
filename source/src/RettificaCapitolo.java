// **********************************************
// Rettifica Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUOVOCAPITOL = 0;
  private static int GRP_PARAMETRI_ACCEESERPREC = 1;

  private static int PFL_PARAMETRI_CAP = 0;
  private static int PFL_PARAMETRI_ART = 1;
  private static int PFL_PARAMETRI_TRATTINLABEL = 2;
  private static int PFL_PARAMETRI_APRSELCAPBUT = 3;
  private static int PFL_PARAMETRI_APRINFCAPBUT = 4;
  private static int PFL_PARAMETRI_NEWPANELABE3 = 5;
  private static int PFL_PARAMETRI_CAPDESCRIZI1 = 6;
  private static int PFL_PARAMETRI_ELABORBUTTON = 7;
  private static int PFL_PARAMETRI_ACCERTAMENTO = 8;
  private static int PFL_PARAMETRI_CAPDESCRIZIO = 9;
  private static int PFL_PARAMETRI_TRATTILABEL1 = 10;
  private static int PFL_PARAMETRI_ACCOPEDESCRI = 11;
  private static int PFL_PARAMETRI_ETICHETTINFO = 12;
  private static int PFL_PARAMETRI_CGE = 13;
  private static int PFL_PARAMETRI_CODIGESTDESC = 14;
  private static int PFL_PARAMETRI_IVLIVELLO = 15;
  private static int PFL_PARAMETRI_VIRICADECOST = 16;
  private static int PFL_PARAMETRI_VISSTRRICDES = 17;
  private static int PFL_PARAMETRI_FINANZIAMENT = 18;
  private static int PFL_PARAMETRI_OPERA = 19;
  private static int PFL_PARAMETRI_FINOPE = 20;
  private static int PFL_PARAMETRI_CGE1 = 21;
  private static int PFL_PARAMETRI_CODIGESTDES1 = 22;
  private static int PFL_PARAMETRI_VLIVELLO = 23;
  private static int PFL_PARAMETRI_VISSTRRICDE1 = 24;
  private static int PFL_PARAMETRI_CAPACC = 25;
  private static int PFL_PARAMETRI_ARTACC = 26;
  private static int PFL_PARAMETRI_VISSTRRICCOD = 27;
  private static int PFL_PARAMETRI_ETICSCELACCE = 28;
  private static int PFL_PARAMETRI_OBIETTOPERAT = 29;
  private static int PFL_PARAMETRI_NUMERACCPREC = 30;
  private static int PFL_PARAMETRI_ANNOACCPREC = 31;
  private static int PFL_PARAMETRI_ETICHETTA = 32;
  private static int PFL_PARAMETRI_ETICHELBLGR3 = 33;
  private static int PFL_PARAMETRI_APRSELACCPRE = 34;
  private static int PFL_PARAMETRI_APRINFACCPRE = 35;

  private static int PPQRY_PARAMETRI211 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_ACCOPE = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_VISTARICLCAP = 4;
  private static int PPQRY_VISTSTRURICL = 5;
  private static int PPQRY_BILFIN = 6;
  private static int PPQRY_CODICIGESTIO = 7;
  private static int PPQRY_VISTSTRURIC1 = 8;
  private static int PPQRY_CAP1 = 9;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant MODIFILIVEL5 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI208(IMDB);
    //
    //
    Init_PQRY_PARAMETRI211(IMDB);
    Init_PQRY_PARAMETRI211_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI208(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI208, 16);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI208, "TBL_PARAMETRI208");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, "ROWNAMLIV4CA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, "ROWNAMVLIVAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, "ROWNAMCGEACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, "ROWNAMCAPACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, "ROWNAMARTACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, "ROWNAMOBOPAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR, "ROWNAMANACPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR, "ROWNAMNUACPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI208,IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI208, 0);
  }

  private static void Init_PQRY_PARAMETRI211(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI211, 12);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI211, "PQRY_PARAMETRI211");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC, "ROWNAMCAPACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC, "ROWNAMARTACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, "ROWNAMANACPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, "ROWNAMNUACPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211,IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI211, 0);
  }

  private static void Init_PQRY_PARAMETRI211_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI211_RS, 12);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI211_RS, "PQRY_PARAMETRI211_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, "ROWNAMEACCER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC, "ROWNAMCAPACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC, "ROWNAMARTACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, "ROWNAMANACPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, "ROWNAMNUACPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI211_RS,IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaCapitolo()
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
    FormIdx = MyGlb.FRM_RETTIFCAPITO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ECABFCD6-0E29-4DBE-B76E-8F851B1A6FDC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 470;
    set_Caption(new IDVariant("Rettifica Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 444;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 444;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 444-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5BC8B257-AAF3-4690-853B-46A12BE02855");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5080, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI208, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIFCAPITO_PARAMETRI211();
      }
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRSELCAPBUT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECODGECOFI && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_CGE1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_VLIVELLO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELACCEANNO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_ETICSCELACCE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEACCESEPRE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRSELACCPRE) {
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
    return (obj instanceof RettificaCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaCapitolo.class.getName() : (Glb.ClassWithPackage(RettificaCapitolo.class) ? RettificaCapitolo.class.getName().substring(RettificaCapitolo.class.getPackage().getName().length() + 1) : RettificaCapitolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Accertamento Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_ACCERTAMENTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Accertamento Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0))))
      {
        IDVariant v_CAPITOLO = null;
        v_CAPITOLO = (new IDVariant());
        IDVariant v_ARTICOLO = null;
        v_ARTICOLO = (new IDVariant());
        IDVariant v_CODICEGESTIO = null;
        v_CODICEGESTIO = (new IDVariant());
        IDVariant v_PROGETTO = null;
        v_PROGETTO = (new IDVariant());
        IDVariant v_CODLIV5 = null;
        v_CODLIV5 = (new IDVariant());
        IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
        SQL.append("  A.ARTICOLO as ACCARTICOLO, ");
        SQL.append("  A.CODICE_GESTIONALE as ACCCODICGEST, ");
        SQL.append("  A.COD_LIVELLO_5 as ACCCODLIVEL5, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ACC A ");
        SQL.append("where (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO, ");
        SQL.append("  A.CODICE_GESTIONALE, ");
        SQL.append("  A.COD_LIVELLO_5 ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CAPITOLO = QV.Get("ACCCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("ACCARTICOLO", IDVariant.INTEGER) ;
          v_CODICEGESTIO = QV.Get("ACCCODICGEST", IDVariant.INTEGER) ;
          v_CODLIV5 = QV.Get("ACCCODLIVEL5", IDVariant.INTEGER) ;
          v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTA.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, (new IDVariant()));
          MainFrm.set_AlertMessage((new IDVariant("Accertamento non presente"))); 
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0, (new IDVariant()));
        }
        else
        {
          if ((v_CAPITOLO.equals(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), true)) && (v_ARTICOLO.equals(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), true)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Il nuovo capitolo coincide con l'attuale"))); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, new IDVariant(new IDVariant(v_CODLIV5),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, new IDVariant(v_CODICEGESTIO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, new IDVariant(v_ARTICOLO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, new IDVariant(v_PROGETTO));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC, 0, new IDVariant(v_ARTICOLO));
          IDVariant v_CONTAOPE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ACC_OPE A ");
          SQL.append("where (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTAOPE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTAOPE.compareTo((new IDVariant(1)), true)>0)
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMCAPACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMARTACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ParametriAccertamentoValidate", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Rettifica Capitolo", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARAMEDELETE();
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR, 0, new IDVariant());
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
      if ((new IDVariant(LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true))).equals((new IDVariant(-1)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCECODGECOFI)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE, 0, IMDB.Value(IMDBDef7.PQRY_RICLASSIGEST, IMDBDef7.PQSL_RICLASSIGEST_CODICE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      // if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPROGIND1)), true)) && Result.booleanValue())
      // {
        // IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMOBIOPE, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI4, IMDBDef7.PQSL_PROGETTI4_PROGETTO_ID, 0));
      // }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELACCEANNO)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0, IMDB.Value(IMDBDef8.PQRY_ESEACC, IMDBDef8.PQSL_ESEACC_NUMERO_ACC, 0));
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEACCESEPRE)), true) && Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0, IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACANNOACC, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0, IMDB.Value(IMDBDef7.PQRY_ACC6, IMDBDef7.PQSL_ACC6_ESEACNUMEACC, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
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
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MODIFILIVEL5.booleanValue())
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_CAP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ART)), true)) && FieldModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0, (new IDVariant()));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
        {
          IDVariant v_NRIGHE = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NRIGHE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NRIGHE.compareTo((new IDVariant(0)), true)<=0 || (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Codifica non presente nel Piano dei Conti !", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0, (new IDVariant()));
            return;
          }
          if ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0).equals(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0), true)) && (IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0).equals(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0), true)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Il nuovo capitolo coincide con l'attuale"))); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0, (new IDVariant()));
            return;
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0)));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0, new IDVariant(MainFrm.GetLiv5DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0)),IDVariant.DECIMAL));
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0)))
          {
            MODIFILIVEL5 = (new IDVariant(-1));
          }
          else
          {
            MODIFILIVEL5 = (new IDVariant(0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0))))
          {
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  VISTA_STRUTTURA_RICL A ");
            SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
            SQL.append("and   (A.E_S = 'E') ");
            SQL.append("and   (A.LIVELLO = 2) ");
            SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND A.ESERCIZIO_SCADENZA)) ");
            SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0 OR A.CODICE_PADRE = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0));
            }
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0, (new IDVariant()));
        }
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        if (FieldWasModified.booleanValue() && (Column.equals((new IDVariant(PFL_PARAMETRI_ANNOACCPREC)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERACCPREC)), true)))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0))))
          {
            if (!(MainFrm.ChkAccPrec(new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0, (new IDVariant()));
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta CGE
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCGE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta CGE Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
      {
        IDVariant v_VOCEECON = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VOCE_ECON as CAPVOCEECON ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VOCEECON = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAVOCEECON, 0, new IDVariant(v_VOCEECON));
        MainFrm.UnloadForm(MyGlb.FRM_SCECODGECOFI,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_SCECODGECOFI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "SceltaCGE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Livello 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaLivello5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Livello 5 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0),IDVariant.DECIMAL));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ApriSceltaLivello5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Accertamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Accertamento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI681, IMDBDef1.FLD_PARAMETRI681_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI681, IMDBDef1.FLD_PARAMETRI681_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELACCEANNO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "EtichettaSceltaAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDVariant ControlliCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Capitolo Body
      // Corpo Procedura
      // 
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant());
      IDVariant v_CODSTRCAPACC = null;
      v_CODSTRCAPACC = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODSTRCAPACC = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
      }
      QV.Close();
      // 
      // 
      // 
      // 
      IDVariant v_CODSTRNUOCAP = null;
      v_CODSTRNUOCAP = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODSTRNUOCAP = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_CODSTRCAPACC.compareTo(v_CODSTRNUOCAP, true)!=0)
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice struttura "))), v_CODSTRNUOCAP), (new IDVariant(" diverso dal codice struttura "))), v_CODSTRCAPACC), (new IDVariant(" dell'attuale capitolo"))), IDL.CHR((new IDVariant(10)))), IDL.CHR((new IDVariant(13))));
      }
      IDVariant v_CODLIVNUOCAP = null;
      v_CODLIVNUOCAP = MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0).compareTo(v_CODLIVNUOCAP, true)!=0)
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice riclassificazione IV "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0))), (new IDVariant(" diverso dal codice riclassificazione IV "))), IDL.ToString(v_CODLIVNUOCAP)), (new IDVariant(" dell'attuale capitolo"))), IDL.CHR((new IDVariant(10)))), IDL.CHR((new IDVariant(13))));
      }
      IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  PRE A ");
      SQL.append("where (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((v_CONTA.compareTo((new IDVariant(0)), true)>0) && (IMDB.Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0).compareTo(v_CODLIVNUOCAP, true)!=0))
      {
        v_MESSAGGIO = IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice riclassificazione IV diverso da quello dell'attuale capitolo e sull'accertamento sono presenti preordini")));
      }
      return v_MESSAGGIO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ControlliCapitolo", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERROR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0)))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Indicare l'Accertamento", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare il nuovo capitolo"))); 
        return 0;
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0))))
        {
          if (!(MainFrm.ChkAccPrec(new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
          {
            return 0;
          }
        }
      }
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant());
      v_MESSAGGIO = ControlliCapitolo();
      if (!(IDL.IsNull(v_MESSAGGIO)))
      {
        IDVariant v_CONFERMA = null;
        v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(v_MESSAGGIO)));
        if (!(v_CONFERMA.booleanValue()))
        {
          return 0;
        }
        else
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.RETTIFICAPEGACC(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA, 0), (new IDVariant()), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0), v_ERROR);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          ELABORA_PARAMEDELET1();
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.RETTIFICAPEGACC(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEFINAN, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEOPERA, 0), (new IDVariant()), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECGE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEVLIVE, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0), v_ERROR);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        ELABORA_PARAMEDELETE();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ELABORA_PARAMEDELET1() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ELABORA_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMVLIVAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCGEACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBOPAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Info
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAM122, IMDBDef4.FLD_PARAM122_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEACCER, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM122, IMDBDef4.FLD_PARAM122_PARAMANNOACC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_OPERE1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "EtichettaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "SelezioneCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Accertamento Anno Precedente
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SelezionaAccertamentoAnnoPrecedente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Accertamento Anno Precedente Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0)))
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Indicare Capitolo e Articolo"));
        MainFrm.set_AlertMessage(v_VMSG); 
        return 0;
      }
      if ((MainFrm.GetForm(MyGlb.FRM_SCEACCESEPRE, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCEACCESEPRE,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRSAAP, IMDBDef1.FLD_PARAMETRSAAP_ROWNAMECAPIT, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMECAP, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRSAAP, IMDBDef1.FLD_PARAMETRSAAP_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMEART, 0));
      MainFrm.Show(MyGlb.FRM_SCEACCESEPRE, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "SelezionaAccertamentoAnnoPrecedente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento Anno Precedente
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertamentoAnnoPrecedente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Anno Precedente Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMNUACPR, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI211, IMDBDef14.PQSL_PARAMETRI211_ROWNAMANACPR, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitolo", "InfoAccertamentoAnnoPrecedente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIFCAPITO_PARAMETRI211() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI211_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI208, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI208, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI211_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI211_RS, 0, IMDBDef4.TBL_PARAMETRI208, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 0, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 1, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEART, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 2, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 3, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 4, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 5, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 6, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 7, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 8, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 9, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 10, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI211_RS, 11, 0, IMDBDef4.TBL_PARAMETRI208, IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI208, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI208, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI208, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI211_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_APRSELCAPBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFCAPBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHETTINFO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_CGE1)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCGE();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_VLIVELLO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaLivello5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICSCELACCE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRSELACCPRE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaAccertamentoAnnoPrecedente();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFACCPRE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamentoAnnoPrecedente();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_ACCERTAMENTO)
      {
        PFL_PARAMETRI_ACCERTAMENTO_ValidateCell(Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "6169F7DD-1786-4515-987A-C5FB3A9AE574");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "Nuovo Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.PANEL_FORM, 64, 168, 676, 38, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0, 84);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, "EFDC956D-D55F-40E7-A816-0E8FA65EE99F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, "Accertamento Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, MyGlb.PANEL_FORM, 68, 302, 632, 38, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, 0, 201);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ACCEESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 36);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "D69FF775-2898-463C-8769-E328245AFD07");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "Capitolo/Art.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "98B7A979-794A-4686-8DCD-FB816DAF9562");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "Art");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "A7C3B61B-5625-4CAD-AD6F-92D88B46986A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, "F37E4783-295E-4669-8F41-AE3D1A973DED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, "E87A4973-BC61-434A-8470-DD85ECAE51E7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "55EB1851-39FB-4A59-9993-6F8DD6971AE9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "43071684-8D2B-45D8-8250-3F4AB8BCA411");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "CAP DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "E310DB8C-F9CB-4C72-826F-610DA0B71ACB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, "BA091BC4-19AF-4EE8-A6CE-2D150E8479E2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, "Accertamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "BD946483-E46D-4EF1-A5F2-32078A0C8FA1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "2143F1D5-71BE-42FD-9625-CEFA76F1E32C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "7CADE4CA-FFFB-4BFA-A1A9-AAD8E97F9BCD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "Finanziamento - Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, "523DAAD3-0B15-4F96-90A8-A4A33668EAE6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, "9C72B0D5-65FD-43EE-A3B5-0F915ECEA827");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, "CGE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "4257FCB9-A2F2-43CD-B0F5-220B477EA07C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "7815135C-04B1-43FF-B846-AB2DC59A3B19");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "IV Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "33821FDE-0C59-4B69-9A3B-B4DAC8337DE0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "225AF3E5-E548-4AB8-83DF-B0A36729C1C7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "EC02E403-5CBC-4AA9-999F-5E7D27A9B5D8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "1F0B2E7D-D9B2-4B88-A8F7-F33359801332");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "891DC9D4-8470-4C69-A023-3B69DC4E6C33");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "Finanziamento - Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, "F6939BA8-5053-4E5F-A8E3-3F187809F721");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, "CGE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "1DE68A31-3399-45A8-B937-0701AF554431");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "CODICI GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "72E41683-7854-4078-BEAF-52268A226DED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "V Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "ECCB3E61-F759-431E-B17B-26F11B9C1216");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "VISTA STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, "4614E928-BFAC-46EE-A25D-3ECF903CE83A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, "Capitolo/Art.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, "7F68AA6B-ED6F-4F8F-858C-7AE84E092D8F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, "Art Acc");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "2174863A-FFD1-4EC0-8F62-83740F352ECB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "V Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, "5C511CC6-7B05-49B0-8C88-6A5A6A33954B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, 0, "wsearch.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "2C1B6656-EF61-41C6-836A-71EC7C1CC324");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "Obiettivo Operativo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, "A1132319-B693-43CC-B0F0-311705BCB18A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, "Numero Acc Prec");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, "86C49FD6-CB5F-4B11-9E50-D6C9829301F2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, "666476D9-0C38-42C0-86A5-421D59494647");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, "lblgrp");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, "F755EDF8-EFC6-4F4E-BB7A-D017F4511EA5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, "lblgrp");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, "26A1915C-8CD2-4D65-A557-7899AA7144D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, "Seleziona Accertamento Anno Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, "882041C1-152B-4706-AA3D-4382DA0E8C29");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, "Info Accertamento Anno Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 64, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, "Cap. Art");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 68, 182, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAP, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAP, PPQRY_PARAMETRI211, "A.ROWNAMECAP", "ROWNAMECAP", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, "Art");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 316, 182, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, "Art");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ART, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ART, PPQRY_PARAMETRI211, "A.ROWNAMEART", "ROWNAMEART", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 48, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 296, 182, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 120, 80, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 704, 186, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRSELCAPBUT, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRSELCAPBUT, -1, "", "APRSELCAPBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 720, 186, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFCAPBUT, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFCAPBUT, -1, "", "APRINFCAPBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 96, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 136, 182, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE3, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, "CAP DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 340, 182, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, "CAP DESCR. 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPDESCRIZI1, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPDESCRIZI1, PPQRY_CAP1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 216, 152, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 660, 372, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_FORM, 60, 12, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accertamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ACCERTAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ACCERTAMENTO, PPQRY_PARAMETRI211, "A.ROWNAMEACCER", "ROWNAMEACCER", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 344, 36, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPDESCRIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 56, 52, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 296, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTILABEL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTILABEL1, -1, "", "TRATTILABEL1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, "Finanziamento - Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 16, 60, 684, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, "Finanziamento - Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ACCOPEDESCRI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ACCOPEDESCRI, PPQRY_ACCOPE, "LPAD(TO_CHAR ( D.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( E.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || D.DESCRIZIONE || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 545, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 668, 64, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 704, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTINFO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTINFO, -1, "", "ETICHETTINFO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_LIST, "CGE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_FORM, 52, 84, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE, MyGlb.PANEL_FORM, "CGE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CGE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CGE, PPQRY_ACC, "A.CODICE", "ACCCODGESCOD", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 200, 84, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODIGESTDESC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODIGESTDESC, PPQRY_ACC, "A.DESCRIZIONE", "ACCCODGESDES", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 0, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 228);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, "IV Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 40, 108, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, "IV Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IVLIVELLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IVLIVELLO, PPQRY_VISTARICLCAP, "A.CODICE", "VISRICCAPCOD", 3, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 320);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 228, 108, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 320);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VIRICADECOST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VIRICADECOST, PPQRY_VISTARICLCAP, "A.DES_CODICE_STRUTTURA", "VIRICADECOST", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 228, 132, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICDES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICDES, PPQRY_VISTSTRURICL, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINANZIAMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINANZIAMENT, PPQRY_PARAMETRI211, "A.ROWNAMEFINAN", "ROWNAMEFINAN", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 4, 376, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OPERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OPERA, PPQRY_PARAMETRI211, "A.ROWNAMEOPERA", "ROWNAMEOPERA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, "Finanziamento - Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 12, 212, 688, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, "Finanziamento - Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINOPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINOPE, PPQRY_BILFIN, "LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE", "DESCRIZIONE", 5, 605, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_LIST, "CGE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_FORM, 104, 236, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGE1, MyGlb.PANEL_FORM, "CGE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CGE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CGE1, PPQRY_PARAMETRI211, "A.ROWNAMECGE", "ROWNAMECGE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 224, 236, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODIGESTDES1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODIGESTDES1, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, "V Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 96, 260, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, "V Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VLIVELLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VLIVELLO, PPQRY_PARAMETRI211, "A.ROWNAMEVLIVE", "ROWNAMEVLIVE", 3, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 248, 260, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, "VIS. STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICDE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICDE1, PPQRY_VISTSTRURIC1, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_FORM, 68, 36, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPACC, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPACC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPACC, PPQRY_PARAMETRI211, "A.ROWNAMCAPACC", "ROWNAMCAPACC", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_LIST, "Art Acc");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_FORM, 316, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTACC, MyGlb.PANEL_FORM, "Art Acc");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTACC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTACC, PPQRY_PARAMETRI211, "A.ROWNAMARTACC", "ROWNAMARTACC", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, "V Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 24, 132, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, "V Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICCOD, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICCOD, PPQRY_VISTSTRURICL, "A.CODICE", "VISSTRRICCOD", 1, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 676, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 200, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSCELACCE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSCELACCE, -1, "", "ETICSCELACCE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_ETICSCELACCE, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 4, 392, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OBIETTOPERAT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OBIETTOPERAT, PPQRY_PARAMETRI211, "A.ROWNAMOBIOPE", "ROWNAMOBIOPE", 5, 9, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_LIST, "Numero Acc Prec");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_FORM, 156, 316, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERACCPREC, MyGlb.PANEL_FORM, "Numero Acc Prec");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERACCPREC, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERACCPREC, PPQRY_PARAMETRI211, "A.ROWNAMNUACPR", "ROWNAMNUACPR", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_FORM, 204, 316, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOACCPREC, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOACCPREC, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOACCPREC, PPQRY_PARAMETRI211, "A.ROWNAMANACPR", "ROWNAMANACPR", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_LIST, 408, 376, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_FORM, 680, 316, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTA, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_LIST, 416, 384, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_FORM, 72, 320, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR3, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHELBLGR3, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHELBLGR3, -1, "", "ETICHELBLGR3", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_FORM, 268, 320, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELACCPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRSELACCPRE, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRSELACCPRE, -1, "", "APRSELACCPRE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_LIST, 136, 96, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_FORM, 288, 320, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFACCPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFACCPRE, -1, GRP_PARAMETRI_ACCEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFACCPRE, -1, "", "APRINFACCPRE", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI208.ROWNAMCAPACC~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI208.ROWNAMARTACC~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( D.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( E.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || D.DESCRIZIONE || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  ACC_OPE B, ");
    SQL.append("  FINANZIAMENTI D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~ROWNAMEACCER~~) ");
    SQL.append("and   (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (D.CODICE = B.FINANZIAMENTO) ");
    SQL.append("and   (E.CODICE = B.OPERA) ");
    SQL.append("and   (");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C ");
    SQL.append("where (C.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (C.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append(") = 1) ");
    PAN_PARAMETRI.SetQuery(PPQRY_ACCOPE, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ACCOPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_ACCOPE, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ACCCODGESCOD, ");
    SQL.append("  A.DESCRIZIONE as ACCCODGESDES ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~TBL_PARAMETRI208.ROWNAMCGEACC~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_PARAMETRI.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_ACC, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISRICCAPCOD, ");
    SQL.append("  A.DES_CODICE_STRUTTURA as VIRICADECOST ");
    SQL.append("from ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI208.ROWNAMCAPACC~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI208.ROWNAMARTACC~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTARICLCAP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTARICLCAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTARICLCAP, "VISTA_RICLASSIFICAZIONI_CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES, ");
    SQL.append("  A.CODICE as VISSTRRICCOD ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~TBL_PARAMETRI208.ROWNAMVLIVAC~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTSTRURICL, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.CODICE as BILFINFINCOD, ");
    SQL.append("  C.CODICE as BILFINOPECOD, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.OPERA = ~~ROWNAMEOPERA~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~ROWNAMEFINAN~~) ");
    SQL.append("and   (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_BILFIN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BILFIN, "BIL_FIN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BILFIN, PFL_PARAMETRI_FINANZIAMENT, "BILFINFINCOD");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BILFIN, PFL_PARAMETRI_OPERA, "BILFINOPECOD");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.CODICE as BILFINFINCOD, ");
    SQL.append("  C.CODICE as BILFINOPECOD, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_BILFIN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BILFIN, "DESCRIZIONE", "Descrizione");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECGE~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~ROWNAMEVLIVE~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((NVL(~~TBL_PARAMETRI208.ROWNAMLIV4CA~~, 0) = 0 OR A.CODICE_PADRE = ~~TBL_PARAMETRI208.ROWNAMLIV4CA~~)) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTSTRURIC1, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTSTRURIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTSTRURIC1, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CAP1, "CAP");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI211", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI211, IMDBDef14.PQRY_PARAMETRI211_RS, IMDBDef4.TBL_PARAMETRI208);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAP, IMDBDef4.FLD_PARAMETRI208_ROWNAMECAP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ART, IMDBDef4.FLD_PARAMETRI208_ROWNAMEART);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ACCERTAMENTO, IMDBDef4.FLD_PARAMETRI208_ROWNAMEACCER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FINANZIAMENT, IMDBDef4.FLD_PARAMETRI208_ROWNAMEFINAN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_OPERA, IMDBDef4.FLD_PARAMETRI208_ROWNAMEOPERA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CGE1, IMDBDef4.FLD_PARAMETRI208_ROWNAMECGE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VLIVELLO, IMDBDef4.FLD_PARAMETRI208_ROWNAMEVLIVE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPACC, IMDBDef4.FLD_PARAMETRI208_ROWNAMCAPACC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTACC, IMDBDef4.FLD_PARAMETRI208_ROWNAMARTACC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_OBIETTOPERAT, IMDBDef4.FLD_PARAMETRI208_ROWNAMOBIOPE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERACCPREC, IMDBDef4.FLD_PARAMETRI208_ROWNAMNUACPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOACCPREC, IMDBDef4.FLD_PARAMETRI208_ROWNAMANACPR);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI208");
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
