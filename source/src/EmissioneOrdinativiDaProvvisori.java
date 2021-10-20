// **********************************************
// Emissione Ordinativi Da Provvisori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneOrdinativiDaProvvisori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISORDDAPRO_ORDINATIVI = 0;
  private static int GRP_EMISORDDAPRO_ACCERTAMENTI = 1;

  private static int PFL_EMISORDDAPRO_DESCRDAACCER = 0;
  private static int PFL_EMISORDDAPRO_DESCRIACCERT = 1;
  private static int PFL_EMISORDDAPRO_CAUSALE = 2;
  private static int PFL_EMISORDDAPRO_DATAEMISSION = 3;
  private static int PFL_EMISORDDAPRO_UFFICIO = 4;
  private static int PFL_EMISORDDAPRO_EMAVPMDSASDC = 5;
  private static int PFL_EMISORDDAPRO_DEBITSUACCER = 6;
  private static int PFL_EMISORDDAPRO_IMPUTAECONOM = 7;
  private static int PFL_EMISORDDAPRO_CODICEDEBITO = 8;
  private static int PFL_EMISORDDAPRO_BENDEBITORE = 9;
  private static int PFL_EMISORDDAPRO_SCEGBENFBUTT = 10;
  private static int PFL_EMISORDDAPRO_INFOBENFBUTT = 11;
  private static int PFL_EMISORDDAPRO_CONTROPAPATR = 12;
  private static int PFL_EMISORDDAPRO_FATTORDESCRI = 13;
  private static int PFL_EMISORDDAPRO_NEWPANELLABE = 14;
  private static int PFL_EMISORDDAPRO_ELABORA = 15;

  private static int PPQRY_EMISORDDAPR1 = 0;

  private static int PPQRY_FATT = 1;
  private static int PPQRY_BEN = 2;

  private static int PPQRY_T58 = 3;
  private static int PPQRY_T53 = 4;


  IDPanel PAN_EMISORDDAPRO;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO14 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_EMISORDDAPRO(IMDB);
    //
    //
    Init_PQRY_EMISORDDAPR1(IMDB);
    Init_PQRY_EMISORDDAPR1_RS(IMDB);
    Init_PQRY_NOTEFUNZIO14(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_EMISORDDAPRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_EMISORDDAPRO, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_EMISORDDAPRO, "TBL_EMISORDDAPRO");
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC, "ROWNAMDESACC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISORDDAPRO,IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef5.TBL_EMISORDDAPRO, 0);
  }

  private static void Init_PQRY_EMISORDDAPR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_EMISORDDAPR1, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_EMISORDDAPR1, "PQRY_EMISORDDAPR1");
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDEDAAC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC, "ROWNAMDESACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_RNEAVPMDSASC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_EMISORDDAPR1, 0);
  }

  private static void Init_PQRY_EMISORDDAPR1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_EMISORDDAPR1_RS, "PQRY_EMISORDDAPR1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDEDAAC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC, "ROWNAMDESACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_RNEAVPMDSASC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_EMISORDDAPR1_RS,IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB,2,15,0);
  }

  private static void Init_PQRY_NOTEFUNZIO14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NOTEFUNZIO14, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NOTEFUNZIO14, "PQRY_NOTEFUNZIO14");
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO14,IMDBDef15.PQSL_NOTEFUNZIO14_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NOTEFUNZIO14, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneOrdinativiDaProvvisori(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneOrdinativiDaProvvisori()
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
    FormIdx = MyGlb.FRM_EMISORDDAPRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9AEA46EE-1251-4A9E-8520-E03582181DFB";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 912;
    DesignHeight = 418;
    set_Caption(new IDVariant("Emissione Ordinativi Da Provvisori"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 912;
    Frames[1].Height = 392;
    Frames[1].FormFactor = 0.666667;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 608;
    Frames[2].Height = 392;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Emissione Ordinativi Da Provvisori";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 608;
    Frames[2].FixedHeight = 392;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_EMISORDDAPRO = new IDPanel(w, this, 2, "PAN_EMISORDDAPRO");
    Frames[2].Content = PAN_EMISORDDAPRO;
    PAN_EMISORDDAPRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISORDDAPRO.VS = MainFrm.VisualStyleList;
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F20B03E4-A458-4AB3-8774-2577D86315A7");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1444, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISORDDAPRO.InitStatus = 2;
    PAN_EMISORDDAPRO_Init();
    PAN_EMISORDDAPRO_InitFields();
    PAN_EMISORDDAPRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 304;
    Frames[3].Height = 392;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 392;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 304-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7F0944B1-0D89-4DFB-8B0B-23C0CD8F602D");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_EMISORDDAPRO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISORDDAPRO_EMISORDDAPR1();
      }
      PAN_EMISORDDAPRO.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_EMISORDDAPRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISORDDAPRO_SCEGBENFBUTT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_EMISORDDAPRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISORDDAPRO_CONTROPAPATR) {
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
    return (obj instanceof EmissioneOrdinativiDaProvvisori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneOrdinativiDaProvvisori.class.getName() : (Glb.ClassWithPackage(EmissioneOrdinativiDaProvvisori.class) ? EmissioneOrdinativiDaProvvisori.class.getName().substring(EmissioneOrdinativiDaProvvisori.class.getPackage().getName().length() + 1) : EmissioneOrdinativiDaProvvisori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti
  // **********************************************************************
  public int SelezionaSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "SelezionaSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetti
  // **********************************************************************
  public int InfoSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "InfoSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIONON = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_MESSAGGIONON = (new IDVariant());
      // 
      // Controlli Bloccanti
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Data emissione non indicata o non appartenente all'esercizio del contesto.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      // 
      // Controlli non Bloccanti
      // 
      {
        if (ControlloOrdProvvDettagli().compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_AVVISODETTSE = new IDVariant(0,IDVariant.STRING);
          v_AVVISODETTSE = (new IDVariant("Sono presenti Dettagli senza indicazione del Capitolo/Art. o Debitore", IDVariant.STRING));
          v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_AVVISODETTSE), (new IDVariant("<BR/>")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC, 0)))
        {
          IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ORD_PROVVISORI A, ");
          SQL.append("  ORD_PROV_DETTAGLI B ");
          SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
          SQL.append("and   (B.PROGR_ORD_PROV = A.PROGRESSIVO) ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NOT ((B.CAPITOLO IS NULL))) ");
          SQL.append("and   ((B.ANNO_ACC IS NULL)) ");
          SQL.append("and   ((B.ANNO_PRE IS NULL)) ");
          SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(B.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NVL(A.RITORNO_CC, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.RITORCCPROVV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.RITORNO_CC, 'NO'))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Descrizione accertamento non valorizzato", IDVariant.STRING));
            v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_MSG), (new IDVariant("<BR/>")));
          }
        }
        // 
        // cdc
        // 
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ORD_PROVVISORI A, ");
          SQL.append("  ORD_PROV_DETTAGLI B, ");
          SQL.append("  FATTORI C ");
          SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
          SQL.append("and   (B.PROGR_ORD_PROV = A.PROGRESSIVO) ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NOT ((B.CAPITOLO IS NULL))) ");
          SQL.append("and   ((B.ANNO_PRE IS NULL)) ");
          SQL.append("and   (NOT ((B.FATTORE IS NULL))) ");
          SQL.append("and   ((B.CENTRO IS NULL)) ");
          SQL.append("and   (C.FATTORE = B.FATTORE) ");
          SQL.append("and   (C.TIPO = 'E') ");
          SQL.append("and   (" + IDL.CSql(MainFrm.GESTIOECONOM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 2) ");
          SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(B.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NVL(A.RITORNO_CC, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.RITORCCPROVV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.RITORNO_CC, 'NO'))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Esistono record senza indicazione del centro e, per questi, verrà usato il CdC di default"));
            v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, S), (new IDVariant("<BR/>")));
          }
        }
        if (ControlloProvvEserciziPrec().compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_AVVISOESEPRE = new IDVariant(0,IDVariant.STRING);
          v_AVVISOESEPRE = (new IDVariant("Esistono provvisori di esercizi precedenti non ancora regolarizzati.", IDVariant.STRING));
          v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_AVVISOESEPRE), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_MESSAGGIONON)))
        {
          if (!(MainFrm.MessageConfirm(IDL.Add(v_MESSAGGIONON, (new IDVariant("Continuare?"))))))
          {
            return 0;
          }
        }
      }
      ChiamaProc();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Ord Provv Dettagli
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant ControlloOrdProvvDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Ord Provv Dettagli Body
      // Procedure Body
      // 
      v_CONTATORE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD_PROVVISORI A, ");
      SQL.append("  ORD_PROV_DETTAGLI B ");
      SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.PROGR_ORD_PROV = A.PROGRESSIVO) ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.ANNO_PRE IS NULL)) ");
      SQL.append("and   ((B.CAPITOLO IS NULL) OR (B.DEBITORE IS NULL)) ");
      SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(B.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (NVL(A.RITORNO_CC, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.RITORCCPROVV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.RITORNO_CC, 'NO'))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_CONTATORE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "ControlloOrdProvvDettagli", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Controllo Provv Esercizi Prec
  // **********************************************************************
  public IDVariant ControlloProvvEserciziPrec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Provv Esercizi Prec Body
      // Procedure Body
      // 
      v_CONTATORE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD_PROV_DETTAGLI A ");
      SQL.append("where (A.ESERCIZIO < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.ANNO_PRE IS NULL)) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_CONTATORE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "ControlloProvvEserciziPrec", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Chiama Proc
  // **********************************************************************
  public int ChiamaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NACCDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NACCA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Chiama Proc Body
      // Procedure Body
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ORDEMISSPROVVISORI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDATEMI, 0), ((IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMECAUSA, 0)), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEUFFIC, 0),(new IDVariant(-1))), IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESACC, 0), IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDEDAAC, 0), IDL.Add(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_RNEAVPMDSASC, 0), ((MainFrm.TIPO_EMISS_ACC_PROVV.equals((new IDVariant(2))))?(new IDVariant("NO")):IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMDESUAC, 0),(new IDVariant("NO"))))), v_NORDDA, v_NORDA, v_NACCDA, v_NACCA, v_SVARACC, IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO, 0), IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0), ((IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))?IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO, 0):(new IDVariant())), v_NSTATOSIOPE, v_NSUPDISPPURO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_MESS = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SORD = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SACC = new IDVariant(0,IDVariant.STRING);
        IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
        v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
        v_MESS = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
        if (v_NSTATOSIOPE.equals((new IDVariant(1)), true))
        {
          IDVariant v_MSCGE = new IDVariant(0,IDVariant.STRING);
          v_MSCGE = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale.", IDVariant.STRING));
          IDVariant v_MSLIV5 = new IDVariant(0,IDVariant.STRING);
          v_MSLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5."));
          if (MainFrm.SIOPEATTIARM.booleanValue())
          {
            v_SSTATOSIOPE = IDL.Add(v_MSLIV5, (new IDVariant("<BR/>")));
          }
          else
          {
            v_SSTATOSIOPE = IDL.Add(v_MSCGE, (new IDVariant("<BR/>")));
          }
        }
        else
        {
          v_SSTATOSIOPE = (new IDVariant(""));
        }
        if (v_NORDDA.compareTo(v_NORDA, true)>0 || v_NORDDA.equals((new IDVariant(0)), true))
        {
          v_SORD = (new IDVariant("Nessuno"));
        }
        else
        {
          v_SORD = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal")), (new IDVariant(" "))), IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_NORDA));
        }
        if (v_NACCDA.compareTo(v_NACCA, true)>0 || v_NACCDA.equals((new IDVariant(0)), true))
        {
          v_SACC = (new IDVariant("Nessuno"));
        }
        else
        {
          v_SACC = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal")), (new IDVariant(" "))), (new IDVariant("numero"))), (new IDVariant(" "))), IDL.ToString(v_NACCDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_NACCA));
        }
        if (v_SVARACC.equals((new IDVariant("")), true))
        {
          IDVariant v_ORD = new IDVariant(0,IDVariant.STRING);
          v_ORD = (new IDVariant("Ordinativi emessi: ", IDVariant.STRING));
          IDVariant v_ORD1 = new IDVariant(0,IDVariant.STRING);
          v_ORD1 = (new IDVariant("Accertamenti emessi: ", IDVariant.STRING));
          IDVariant C = new IDVariant(0,IDVariant.STRING);
          C = (new IDVariant("Variazioni su Accertamenti: Nessuna ", IDVariant.STRING));
          v_MESS = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESS, v_ORD), v_SORD), (new IDVariant("<BR/>"))), v_ORD1), v_SACC), (new IDVariant("<BR/>"))), C), v_SSTATOSIOPE);
        }
        else
        {
          IDVariant v_ORD = new IDVariant(0,IDVariant.STRING);
          v_ORD = (new IDVariant("Ordinativi emessi: ", IDVariant.STRING));
          IDVariant v_ORD1 = new IDVariant(0,IDVariant.STRING);
          v_ORD1 = (new IDVariant("Accertamenti emessi: ", IDVariant.STRING));
          IDVariant C = new IDVariant(0,IDVariant.STRING);
          C = (new IDVariant("Variazioni su Accertamenti: ", IDVariant.STRING));
          v_MESS = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESS, v_ORD), v_SORD), (new IDVariant("<BR/>"))), v_ORD1), v_SACC), (new IDVariant("<BR/>"))), C), v_SVARACC), (new IDVariant(" "))), v_SSTATOSIOPE);
        }
        if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
        {
          v_MESS = IDL.Add(IDL.Add(v_MESS, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
        }
        MainFrm.set_AlertMessage(v_MESS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "ChiamaProc", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      LOADEVENT_EMORDAPRDERO();
      IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      }
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(-1)), true))
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, 0, (new IDVariant("SI")));
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, 0, (new IDVariant()));
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (MainFrm.TIPO_EMISS_ACC_PROVV.equals((new IDVariant(2)), true))
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi Da Provvisori: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_EMORDAPRDERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "EndModalEvent", _e);
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
      PAN_EMISORDDAPRO.PanelCommand(Glb.PCM_UPDATE);
      UNLOAD_EMORDAPRDERO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "Unload", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi Da Provvisori: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_EMORDAPRDERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // Emissione Ordinativi Da Provvisori On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISORDDAPRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISORDDAPRO);
      // 
      // Emissione Ordinativi Da Provvisori On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMIMPECO, 0).equals((new IDVariant()), true))
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_EMISORDDAPR1, IMDBDef15.PQSL_EMISORDDAPR1_ROWNAMCODDEB, 0))))
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISORDDAPRO.SetFlags (Glb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "EmissioneOrdinativiDaProvvisoriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi Da Provvisori On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_EMISORDDAPRO_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Ordinativi Da Provvisori On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_EMISORDDAPRO_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_EMISORDDAPRO.FieldText(PFL_EMISORDDAPRO_BENDEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiDaProvvisori", "EmissioneOrdinativiDaProvvisoriOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi Da Provvisori
  // Primary record source for panel data
  // **********************************************************************
  private void EMISORDDAPRO_EMISORDDAPR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_EMISORDDAPR1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_EMISORDDAPRO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_EMISORDDAPRO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_EMISORDDAPR1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_EMISORDDAPR1_RS, 0, IMDBDef5.TBL_EMISORDDAPRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 0, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 1, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 2, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 3, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 4, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 5, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 6, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 7, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 8, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_EMISORDDAPR1_RS, 9, 0, IMDBDef5.TBL_EMISORDDAPRO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_EMISORDDAPRO, 0);
      if (IMDB.Eof(IMDBDef5.TBL_EMISORDDAPRO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_EMISORDDAPRO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_EMISORDDAPR1_RS, 0);
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
  private void PAN_EMISORDDAPRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISORDDAPRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISORDDAPRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISORDDAPRO, Cancel);
    // Stub
  }

  private void PAN_EMISORDDAPRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISORDDAPRO_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_EMISORDDAPRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISORDDAPRO_INFOBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_EMISORDDAPRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISORDDAPRO_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_EMISORDDAPRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISORDDAPRO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_EMISORDDAPRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISORDDAPRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISORDDAPRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISORDDAPRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISORDDAPRO_Init()
  {

    PAN_EMISORDDAPRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISORDDAPRO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, "FCC8D956-CC16-49F3-B1AB-937CCAD3EAF4");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, "Ordinativi");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 408, 16, 0, 0);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, MyGlb.PANEL_FORM, 4, 7, 560, 137, 0, 0);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, 0, 55);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, 1, 13);
    PAN_EMISORDDAPRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, 0, 4);
    PAN_EMISORDDAPRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, 1, 4);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, "E8CC51D0-6755-4EC3-8C59-F41C8BBE7049");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, "Accertamenti");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 600, 16, 0, 0);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, MyGlb.PANEL_FORM, 4, 175, 560, 145, 0, 0);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, 0, 77);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, 1, 13);
    PAN_EMISORDDAPRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, 0, 4);
    PAN_EMISORDDAPRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, 1, 4);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISORDDAPRO_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISORDDAPRO.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, "A2964569-34E8-4F99-A080-B2035EC9B9AF");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, "Descrizione Da Accertamento");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, "9C3086FD-BE3D-4B23-968E-E89420CE643C");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, "Descrizione Accertamento");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, "10A98D91-D007-4F6C-9A2A-12DB523F418F");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, "Causale");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, "5B672288-595A-4357-A211-D0BCAA6C5914");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, "Data Emissione");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, "8B0B31D0-DEF3-47FF-9778-183648DE46F7");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, "Solo Provvisori di Ufficio");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, "D2AE7508-C364-4D71-8AC3-2F6332EED96F");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, "Emissione Automatica Variazione Per Mancanza Disponibilità su Accertamento (solo di Competenza)");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, "7927B1F5-FCBF-4B20-B431-B686741F7881");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, "Debitore Su Accertamenti");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, "9B9A7A17-765B-4DEB-826F-37FD9ED5B309");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, "Imputazione Economica");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, "CB03E006-331A-495F-B69A-48DEE9645B1D");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, "Codice Debitore");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, "549F263B-0547-4AFE-A211-4507BCCF54FB");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, "Debitore");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, "Debitore");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, "286368FC-727D-48F7-9F30-7F6A58711397");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISORDDAPRO.SetImage(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, "0D36A752-694A-4F33-85BF-79A4B545BA45");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISORDDAPRO.SetImage(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, 0, "info.gif", false);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, "2EE5FC69-63A5-491A-9176-6AA235E70AB0");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, "Contropartita Patr.");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, "D9A52F96-756A-428A-8996-2C95A62A1F35");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_EMISORDDAPRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, "F9704AD1-8276-4EDD-8BE8-5A4705846863");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, "");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISORDDAPRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, "BEC07547-49BA-488C-AB80-A7A6CFE82851");
    PAN_EMISORDDAPRO.set_Header(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, "Elabora");
    PAN_EMISORDDAPRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_EMISORDDAPRO.SetImage(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, 0, "button1.gif", false);
    PAN_EMISORDDAPRO.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_EMISORDDAPRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_LIST, 148);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_LIST, "D. D. A.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_FORM, 8, 32, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_FORM, 176);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRDAACCER, MyGlb.PANEL_FORM, "Descrizione Da Accertamento");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_DESCRDAACCER, -1, GRP_EMISORDDAPRO_ORDINATIVI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_DESCRDAACCER, PPQRY_EMISORDDAPR1, "A.ROWNAMDEDAAC", "ROWNAMDEDAAC", 5, 2, 0, -13997);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_DESCRDAACCER, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_DESCRDAACCER, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_LIST, 48, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_LIST, 132);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_LIST, "Descrizione Accertamento");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_FORM, 52, 56, 508, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_FORM, 132);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_FORM, 2);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DESCRIACCERT, MyGlb.PANEL_FORM, "Descrizione Accertamento");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_DESCRIACCERT, -1, GRP_EMISORDDAPRO_ORDINATIVI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_DESCRIACCERT, PPQRY_EMISORDDAPR1, "A.ROWNAMDESACC", "ROWNAMDESACC", 5, 140, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_LIST, 232, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_FORM, 120, 96, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_FORM, 64);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_CAUSALE, -1, GRP_EMISORDDAPRO_ORDINATIVI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_CAUSALE, PPQRY_EMISORDDAPR1, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_LIST, 288, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_LIST, 80);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_FORM, 88, 120, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_FORM, 96);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_DATAEMISSION, -1, GRP_EMISORDDAPRO_ORDINATIVI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_DATAEMISSION, PPQRY_EMISORDDAPR1, "A.ROWNAMDATEMI", "ROWNAMDATEMI", 6, 14, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_LIST, 408, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_LIST, "Sl. Prv. di Uff.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_FORM, 36, 152, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_FORM, 148);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_UFFICIO, MyGlb.PANEL_FORM, "Solo Provvisori di Ufficio");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_UFFICIO, -1, -1);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_UFFICIO, PPQRY_EMISORDDAPR1, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_LIST, 456, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_LIST, 452);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_LIST, "E. A. V. P. M. D. s. A. s. d. C.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_FORM, 240, 200, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_FORM, 296);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_FORM, 2);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_EMAVPMDSASDC, MyGlb.PANEL_FORM, "Emissione Automatica Variazione Per Mancanza Disponibilità su Accertamento solo di Competenza");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_EMAVPMDSASDC, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_EMAVPMDSASDC, PPQRY_EMISORDDAPR1, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 5, 2, 0, -13997);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_EMAVPMDSASDC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_EMAVPMDSASDC, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_LIST, 132);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_LIST, "Debit. Su Accert.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_FORM, 24, 244, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_FORM, 164);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_DEBITSUACCER, MyGlb.PANEL_FORM, "Debitore Su Accertamenti");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_DEBITSUACCER, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_DEBITSUACCER, PPQRY_EMISORDDAPR1, "A.ROWNAMDESUAC", "ROWNAMDESUAC", 5, 2, 0, -13997);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_DEBITSUACCER, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_DEBITSUACCER, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_LIST, 504, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_LIST, "Im. Ec.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_FORM, 224, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_FORM, 152);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imputazione Economica");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_IMPUTAECONOM, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_IMPUTAECONOM, PPQRY_EMISORDDAPR1, "A.ROWNAMIMPECO", "ROWNAMIMPECO", 5, 2, 0, -13997);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISORDDAPRO.SetValueListItem(PFL_EMISORDDAPRO_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_FORM, 460, 272, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_CODICEDEBITO, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_CODICEDEBITO, PPQRY_EMISORDDAPR1, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_FORM, 108, 272, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_FORM, 80);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_BENDEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_BENDEBITORE, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 528, 276, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_SCEGBENFBUTT, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_FORM, 544, 276, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_INFOBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_INFOBENFBUTT, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_INFOBENFBUTT, -1, "", "INFOBENFBUTT", 0, 0, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_LIST, 552, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_LIST, 44);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_LIST, "Cnt. Pt.");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_FORM, 60, 296, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_FORM, 128);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_CONTROPAPATR, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_CONTROPAPATR, PPQRY_EMISORDDAPR1, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 8, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_FORM, 284, 296, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_FATTORDESCRI, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_FATTORDESCRI, PPQRY_FATT, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_LIST, 68, 200, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 212, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_NEWPANELLABE, -1, GRP_EMISORDDAPRO_ACCERTAMENTI);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_LIST, 404, 288, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_EMISORDDAPRO.SetRect(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_FORM, 480, 336, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISORDDAPRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_EMISORDDAPRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISORDDAPRO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_EMISORDDAPRO.SetFieldPage(PFL_EMISORDDAPRO_ELABORA, -1, -1);
    PAN_EMISORDDAPRO.SetFieldPanel(PFL_EMISORDDAPRO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_EMISORDDAPRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISORDDAPRO.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_FATT, 0, SQL, -1, "");
    PAN_EMISORDDAPRO.SetQueryDB(PPQRY_FATT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISORDDAPRO.SetMasterTable(PPQRY_FATT, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_EMISORDDAPRO.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISORDDAPRO.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_EMISORDDAPRO.SetQueryLKE(PPQRY_BEN, PFL_EMISORDDAPRO_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_EMISORDDAPRO.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_EMISORDDAPRO.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_EMISORDDAPRO.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58NEWEXPRES ");
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
    PAN_EMISORDDAPRO.SetQuery(PPQRY_T58, 0, SQL, PFL_EMISORDDAPRO_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_T58, 1, SQL, PFL_EMISORDDAPRO_CAUSALE, "");
    PAN_EMISORDDAPRO.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_T53, 0, SQL, PFL_EMISORDDAPRO_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISORDDAPRO.SetQuery(PPQRY_T53, 1, SQL, PFL_EMISORDDAPRO_UFFICIO, "");
    PAN_EMISORDDAPRO.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISORDDAPRO.SetIMDB(IMDB, "PQRY_EMISORDDAPR1", true);
    PAN_EMISORDDAPRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_EMISORDDAPRO.SetQueryIMDB(PPQRY_EMISORDDAPR1, IMDBDef15.PQRY_EMISORDDAPR1_RS, IMDBDef5.TBL_EMISORDDAPRO);
    JustLoaded = true;
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_DESCRDAACCER, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDEDAAC);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_DESCRIACCERT, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESACC);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_CAUSALE, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMECAUSA);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_DATAEMISSION, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDATEMI);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_UFFICIO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEUFFIC);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_EMAVPMDSASDC, IMDBDef5.FLD_EMISORDDAPRO_RNEAVPMDSASC);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_DEBITSUACCER, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMDESUAC);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_IMPUTAECONOM, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMIMPECO);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_CODICEDEBITO, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMCODDEB);
    PAN_EMISORDDAPRO.SetFieldPrimaryIndex(PFL_EMISORDDAPRO_CONTROPAPATR, IMDBDef5.FLD_EMISORDDAPRO_ROWNAMEFATTO);
    PAN_EMISORDDAPRO.SetMasterTable(0, "EMISORDDAPRO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISORDDAPRO.Status() == 2)
    {
      int oldListQBE = PAN_EMISORDDAPRO.iUseListQBE;
      PAN_EMISORDDAPRO.iUseListQBE = 0;
      PAN_EMISORDDAPRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISORDDAPRO.PanelCommand(Glb.PCM_FIND);
      PAN_EMISORDDAPRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "86D0C89C-9C9E-4C42-A7A9-97D84380C536");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "D8E68A0D-D459-4D4D-8C64-75EEBB229296");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "D5419896-5505-450A-A97C-58FF09E8E7FC");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "2F1FD708-B1E2-4599-A342-569B23347EE2");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO14, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO14, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO14, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 276, 364, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 28);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO14, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO14", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_EMISORDDAPRO,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO14, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO14, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_EMISORDDAPRO) PAN_EMISORDDAPRO_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
