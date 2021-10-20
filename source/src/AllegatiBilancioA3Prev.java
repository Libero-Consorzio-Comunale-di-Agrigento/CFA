// **********************************************
// Allegati Bilancio A3 Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatiBilancioA3Prev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_A3RISAMMQUDE_ENTRATA = 0;
  private static int GRP_A3RISAMMQUDE_SPESA = 1;

  private static int PFL_A3RISAMMQUDE_PROGRESSIVO1 = 0;
  private static int PFL_A3RISAMMQUDE_TIPOSTAMPA1 = 1;
  private static int PFL_A3RISAMMQUDE_ESERCIZIO1 = 2;
  private static int PFL_A3RISAMMQUDE_RAGGRUPPAME1 = 3;
  private static int PFL_A3RISAMMQUDE_S = 4;
  private static int PFL_A3RISAMMQUDE_CAPITOENTRAT = 5;
  private static int PFL_A3RISAMMQUDE_ARTICOENTRAT = 6;
  private static int PFL_A3RISAMMQUDE_SCELCAPIENTR = 7;
  private static int PFL_A3RISAMMQUDE_DESCCAPIENTR = 8;
  private static int PFL_A3RISAMMQUDE_CAPITOLSPESA = 9;
  private static int PFL_A3RISAMMQUDE_ARTICOLSPESA = 10;
  private static int PFL_A3RISAMMQUDE_SCELCAPISPES = 11;
  private static int PFL_A3RISAMMQUDE_DESCCAPISPES = 12;
  private static int PFL_A3RISAMMQUDE_E = 13;
  private static int PFL_A3RISAMMQUDE_IMPORTO7 = 14;
  private static int PFL_A3RISAMMQUDE_IMPORTO2 = 15;
  private static int PFL_A3RISAMMQUDE_IMPORTO3 = 16;
  private static int PFL_A3RISAMMQUDE_IMPORTO4 = 17;
  private static int PFL_A3RISAMMQUDE_IMPORTO5 = 18;
  private static int PFL_A3RISAMMQUDE_IMPORTOTOT = 19;
  private static int PFL_A3RISAMMQUDE_IMPORTO6 = 20;
  private static int PFL_A3RISAMMQUDE_ETICHETOTALE = 21;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR1 = 22;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR2 = 23;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR3 = 24;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR4 = 25;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR5 = 26;
  private static int PFL_A3RISAMMQUDE_TOTALIMPOTOT = 27;
  private static int PFL_A3RISAMMQUDE_TOTALEIMPOR6 = 28;

  private static int PPQRY_PARBILALRI10 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_A3RISAMMQUDE;
  private static int PFL_TOTAQUOTACCA_PROGRESSIVO = 0;
  private static int PFL_TOTAQUOTACCA_ESERCIZIO = 1;
  private static int PFL_TOTAQUOTACCA_TIPOSTAMPA = 2;
  private static int PFL_TOTAQUOTACCA_RAGGRUPPAMEN = 3;
  private static int PFL_TOTAQUOTACCA_IMPORTO1 = 4;

  private static int PPQRY_PARBILALRIA9 = 0;


  IDPanel PAN_TOTAQUOTACCA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI676(IMDB);
    //
    //
    Init_PQRY_PARBILALRI10(IMDB);
    Init_PQRY_PARBILALRIA9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI676(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI676, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI676, "TBL_PARAMETRI676");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARANOMEFILE,9,500,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAMLOOKUP, "PARAMLOOKUP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI676,IMDBDef3.FLD_PARAMETRI676_PARAMLOOKUP,5,50,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI676, 0);
  }

  private static void Init_PQRY_PARBILALRI10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARBILALRI10, 18);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARBILALRI10, "PQRY_PARBILALRI10");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_S, "S");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, "CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, "ARTICOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_SPESA, "DESCR_CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_SPESA,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_E, "E");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_E,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, "CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, "ARTICOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_ENTRATA, "DESCR_CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_ENTRATA,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4, "IMPORTO_4");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5, "IMPORTO_5");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6, "IMPORTO_6");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRI10,IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARBILALRI10, 0);
  }

  private static void Init_PQRY_PARBILALRIA9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARBILALRIA9, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARBILALRIA9, "PQRY_PARBILALRIA9");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA9,IMDBDef11.PQSL_PARBILALRIA9_IMPORTO_1,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARBILALRIA9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatiBilancioA3Prev(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatiBilancioA3Prev()
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
    FormIdx = MyGlb.FRM_ALLEBILA3PRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7140B8D2-A611-4192-97F0-F776F9F7CF5D";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 442;
    set_Caption(new IDVariant("A3 Ris. Amministrazione - Quote Destinate"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 416;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.836538;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 796;
    Frames[2].Height = 348;
    Frames[2].Caption = "A3 Ris. Amministrazione - Quote Destinate";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 348;
    PAN_A3RISAMMQUDE = new IDPanel(w, this, 2, "PAN_A3RISAMMQUDE");
    Frames[2].Content = PAN_A3RISAMMQUDE;
    PAN_A3RISAMMQUDE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_A3RISAMMQUDE.VS = MainFrm.VisualStyleList;
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C177885F-3923-4C3F-AE21-C0F3CE97D3C5");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1760, 232, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_A3RISAMMQUDE.InitStatus = 2;
    PAN_A3RISAMMQUDE_Init();
    PAN_A3RISAMMQUDE_InitFields();
    PAN_A3RISAMMQUDE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 796;
    Frames[3].Height = 68;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Totale Quote Accantonate";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 68;
    PAN_TOTAQUOTACCA = new IDPanel(w, this, 3, "PAN_TOTAQUOTACCA");
    Frames[3].Content = PAN_TOTAQUOTACCA;
    PAN_TOTAQUOTACCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTAQUOTACCA.VS = MainFrm.VisualStyleList;
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FC5E2695-FF1A-4959-8D13-88708603585E");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 672, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTAQUOTACCA.InitStatus = 2;
    PAN_TOTAQUOTACCA_Init();
    PAN_TOTAQUOTACCA_InitFields();
    PAN_TOTAQUOTACCA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA27+BaseCmdLinIdx)
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
      PAN_A3RISAMMQUDE.UpdatePanel(MainFrm);
      PAN_TOTAQUOTACCA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A3RISAMMQUDE.FrIndex)
    {
      if (IdxFieldActived ==PFL_A3RISAMMQUDE_SCELCAPIENTR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A3RISAMMQUDE.FrIndex)
    {
      if (IdxFieldActived ==PFL_A3RISAMMQUDE_SCELCAPISPES) {
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
    return (obj instanceof AllegatiBilancioA3Prev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatiBilancioA3Prev.class.getName() : (Glb.ClassWithPackage(AllegatiBilancioA3Prev.class) ? AllegatiBilancioA3Prev.class.getName().substring(AllegatiBilancioA3Prev.class.getPackage().getName().length() + 1) : AllegatiBilancioA3Prev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IDVariant v_TOOLTISTAMPA = new IDVariant(0,IDVariant.STRING);
      v_TOOLTISTAMPA = (new IDVariant("A3 Ris. Amministrazione - Quote Destinate"));
      SettaCaptionA3();
      PAN_TOTAQUOTACCA.ClearValueList(PFL_TOTAQUOTACCA_RAGGRUPPAMEN);
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A3RISAMMPREVTOT1")), ((new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A3RISAMMPREVTOT1")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_STAMPA27+BaseCmdLinIdx, new IDVariant(v_TOOLTISTAMPA).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "Load", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMLOOKUP, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "EndModal", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Quote Destinate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_A3RISAMMQUDE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_A3RISAMMQUDE);
      // 
      // A3 Ris. Amministrazione - Quote Destinate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_RAGGRUPPAME1,(new IDVariant(PAN_A3RISAMMQUDE.FieldText(PFL_A3RISAMMQUDE_RAGGRUPPAME1))).stringValue()); 
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_DESCCAPIENTR,(new IDVariant(PAN_A3RISAMMQUDE.FieldText(PFL_A3RISAMMQUDE_DESCCAPIENTR))).stringValue()); 
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_DESCCAPISPES,(new IDVariant(PAN_A3RISAMMQUDE.FieldText(PFL_A3RISAMMQUDE_DESCCAPISPES))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "A3Ris.Amministrazione-QuoteDestinateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Quote Destinate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_A3RISAMMQUDE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Quote Destinate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_PROGRESSIVO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_TIPO_STAMPA, 0, (new IDVariant("A3RISAMMPREV")));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMQUDE_CAPITOENTRAT)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_ARTICOENTRAT)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("E")), IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, 0), IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_ENTRATA, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VCAPDESCRIZI = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'E') ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_ENTRATA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMQUDE_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_ARTICOLSPESA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, 0), IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_SPESA, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VCAPDESCRIZI = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_CAPITOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_ARTICOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_DESCR_CAPITOLO_SPESA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO7)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO2)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO3)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO4)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO5)), true) || Column.equals((new IDVariant(PFL_A3RISAMMQUDE_IMPORTO6)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "A3Ris.Amministrazione-QuoteDestinateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Quote Destinate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_A3RISAMMQUDE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Quote Destinate After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "A3Ris.Amministrazione-QuoteDestinateAfterFind", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Quote Destinate After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_A3RISAMMQUDE_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Quote Destinate After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_A3RISAMMQUDE.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "A3Ris.Amministrazione-QuoteDestinateAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Totale Quote Accantonate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Totale Quote Accantonate After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_TOTAQUOTACCA.GetNumRows())).equals((new IDVariant(0)), true))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("insert into PARAM_BIL_ALL_RIS_AMM ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  TIPO_STAMPA, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  RAGGRUPPAMENTO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  to_number(NULL), ");
          SQL.append("  'A3RISAMMPREVTOT', ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  'A3RISAMMPREVTOT1' ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e4)
        {
          MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
          return;
        }
        PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "TotaleQuoteAccantonateAfterFind", _e);
    }
  }

  // **********************************************************************
  // Setta Caption A3
  // **********************************************************************
  public int SettaCaptionA3 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption A3 Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTIOIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR1 = (new IDVariant("Risorse destinate al 1/1/"));
      IDVariant v_TOOLTIIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR1 = (new IDVariant("Risorse destinate agli investim. al 1/1/"));
      IDVariant v_CAPTIOIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR2 = (new IDVariant("Entrate destinate accertate nel "));
      IDVariant v_TOOLTIIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR2 = (new IDVariant("Entrate destinate agli investimenti accertate nel  "));
      IDVariant v_TOOLT2IMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR2 = (new IDVariant(" (dato presunto) (b)"));
      IDVariant v_CAPTIOIMP1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP1 = (new IDVariant(" finanziati da ent. accert."));
      IDVariant v_TOOLTIIMP1 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP1 = (new IDVariant(" finanziati da entrate destinate accertate nell'esercizio o da quote destinate del risultato di amministrazione (dati presunti) (c)"));
      IDVariant v_CAPTIOIMP2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP2 = (new IDVariant("Fondo plur. vinc. al 31/12/"));
      IDVariant v_TOOLTIIMP2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP2 = (new IDVariant(" finanziato da entrate destinate accertate nell'esercizio o da quote destinate del risultato di amministrazione (d)"));
      IDVariant v_TOOLTIIMPORT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPORT = (new IDVariant("Cancellazione di residui attivi costituiti da risorse destinate agli investimenti  o eliminazione della destinazione  su quote del risultato di amministrazione (+) e cancellazione di residui passivi finanziati da risorse destinate agli investimenti (-) (gestione dei residui) (e)"));
      IDVariant v_CAPTIIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIIMPOTOT = (new IDVariant("Risorse destinate al 31/12/"));
      IDVariant v_TOOLTIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIMPOTOT = (new IDVariant("Risorse destinate agli investimenti del risultato di amministrazione presunto al 31/12/"));
      IDVariant v_TOOL2IMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOL2IMPOTOT = (new IDVariant("(f)=(a)+(b)-(c)-(d)-(e)"));
      IDVariant v_CAPTIOIMP3 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP3 = (new IDVariant("Ris. dest. inv. al 31/12/"));
      IDVariant v_CAPTIOIMPORT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPORT = (new IDVariant(" applic. al primo esercizio prev."));
      IDVariant v_TOOLTIIMPOR6 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR6 = (new IDVariant("Risorse destinate agli investimenti nel risultato presunte al 31/12/"));
      IDVariant v_TOOLT2IMPOR6 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR6 = (new IDVariant(" applicate al primo esercizio del bilancio di previsione (g)"));
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO7, IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO7,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), (new IDVariant("(a)"))).stringValue()); 
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO2, IDL.Add(v_CAPTIOIMPOR2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO2,IDL.Add(IDL.Add(v_TOOLTIIMPOR2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLT2IMPOR2).stringValue()); 
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO3, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Impegni")), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTIOIMP1).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO3,IDL.Add(IDL.Add(IDL.Add((new IDVariant("Impegni")), (new IDVariant(" "))), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP1).stringValue()); 
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO4, IDL.Add(v_CAPTIOIMP2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO4,IDL.Add(IDL.Add(v_CAPTIOIMP2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP2).stringValue()); 
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO5,v_TOOLTIIMPORT.stringValue()); 
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTOTOT, IDL.Add(v_CAPTIIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTOTOT,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), v_TOOL2IMPOTOT).stringValue()); 
      PAN_A3RISAMMQUDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO6, IDL.Add(IDL.Add(v_CAPTIOIMP3, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTIOIMPORT).stringValue());
      PAN_A3RISAMMQUDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMQUDE_IMPORTO6,IDL.Add(IDL.Add(v_TOOLTIIMPOR6, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLT2IMPOR6).stringValue()); 
      PAN_TOTAQUOTACCA.set_Header(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1, IDL.Add(v_CAPTIIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_TOTAQUOTACCA.set_ToolTip(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), v_TOOL2IMPOTOT).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "SettaCaptionA3", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo Entrata
  // **********************************************************************
  public int SceltaCapitoloEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMLOOKUP, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "SceltaCapitoloEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo Spesa
  // **********************************************************************
  public int SceltaCapitoloSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMLOOKUP, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "SceltaCapitoloSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totali
  // **********************************************************************
  public int CalcolaTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Totali Body
      // Corpo Procedura
      // 
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR1, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO7), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR2, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO2), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR3, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO3), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR4, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO4), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR5, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO5), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALIMPOTOT, IDL.Format(IDL.Sub(IDL.Sub(IDL.Sub(IDL.Add(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO7), PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO2)), PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO3)), PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO4)), PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO5)), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMQUDE.set_FieldText(PFL_A3RISAMMQUDE_TOTALEIMPOR6, IDL.Format(PAN_A3RISAMMQUDE.GetFieldSum(PFL_A3RISAMMQUDE_IMPORTO6), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "CalcolaTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_A3RISAMMQUDE.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Prev", "Stampa", _e);
      return -1;
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
  private void PAN_A3RISAMMQUDE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_A3RISAMMQUDE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_A3RISAMMQUDE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_A3RISAMMQUDE, Cancel);
    // Stub
  }

  private void PAN_A3RISAMMQUDE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_A3RISAMMQUDE_SCELCAPIENTR)
    {
      this.IdxPanelActived = this.PAN_A3RISAMMQUDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_A3RISAMMQUDE_SCELCAPISPES)
    {
      this.IdxPanelActived = this.PAN_A3RISAMMQUDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloSpesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_A3RISAMMQUDE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_A3RISAMMQUDE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_A3RISAMMQUDE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_S, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_E, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_2, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_3, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_4, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_5, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRI10, IMDBDef11.PQSL_PARBILALRI10_IMPORTO_6, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_A3RISAMMQUDE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTAQUOTACCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTAQUOTACCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTAQUOTACCA);
    // Stub
  }

  private void PAN_TOTAQUOTACCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTAQUOTACCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTAQUOTACCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA9, IMDBDef11.PQSL_PARBILALRIA9_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA9, IMDBDef11.PQSL_PARBILALRIA9_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_TOTAQUOTACCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_A3RISAMMQUDE_Init()
  {

    PAN_A3RISAMMQUDE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_A3RISAMMQUDE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, "71DA3ED8-3653-49F2-9915-9F3890B803F1");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, "Entrata");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, MyGlb.VIS_GROUPSTYLE);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, MyGlb.PANEL_LIST, 0, -9999, 432, 21, 0, 0);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, MyGlb.PANEL_FORM, 0, 75, 604, 361, 0, 0);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, 0, 42);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, 1, 13);
    PAN_A3RISAMMQUDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, 0, 4);
    PAN_A3RISAMMQUDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, 1, 4);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_ENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, "0DF3FE65-72D3-4816-B9E2-683F58537C5B");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, "Spesa");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, MyGlb.VIS_GROUPSTYLE);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, MyGlb.PANEL_LIST, 432, -9999, 432, 21, 0, 0);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, MyGlb.PANEL_FORM, 0, 27, 588, 457, 0, 0);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, 0, 34);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, 1, 13);
    PAN_A3RISAMMQUDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, 0, 4);
    PAN_A3RISAMMQUDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, 1, 4);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_GROUP, GRP_A3RISAMMQUDE_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A3RISAMMQUDE.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, "0C52D388-707A-4719-AA34-EB51EAA0E737");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, "PROGRESSIVO");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, "99520670-F7A7-40EF-9518-EB3F49F2C570");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, "TIPO STAMPA");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, 0, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, "1221903F-034C-4BC2-BA4C-0E69476A8737");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, "ESERCIZIO");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, 0, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, "A4AEC2C5-CE95-4194-8BAB-24AF0F61F4AE");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, "Fondo Accantonamento");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, "68569BF3-E082-4DD9-96A2-D2E93B2760ED");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, "S");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, "5B82D72B-20BC-41EA-BD2A-B49BAC25B449");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, "Capitolo");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.VIS_NORFIEINTLUN);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, "6864D7ED-4B2A-454E-ABA4-F24D017A01C9");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, "Art.");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, "D37A3252-59C9-4DA1-9C09-61C6D02ACEBC");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, " ");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.VIS_HYPELINKIMMA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, "BBFBCF50-642A-4652-8261-CFC11B28E184");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, "Descrizione");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, "87B97F2C-0B8F-4830-9F6B-DAF9C32CE880");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, "Capitolo");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, "DC9E12BA-D7F5-4B95-AEDA-DEDB15C071C8");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, "Art.");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, "37824FA0-DA84-455F-A788-5597BA352A9B");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, " ");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.VIS_HYPELINKIMMA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, "C0504E9C-96CE-4287-9242-3F60D114517F");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, "Descrizione");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, "DE8A3D02-415F-4132-9DA6-DB4BD2AFC02B");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, "E");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, "47B705B0-9888-48D5-A6C8-8106D8DE3249");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, "IMPORTO 1");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, "BF1F6CEA-89A2-4396-9C49-2F4D35333E10");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, "IMPORTO 2");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, "DF86F5DD-208F-442D-940B-C6A17CAFCC6B");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, "IMPORTO 3");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, "DEAB4BF2-57B5-4B8B-AEF3-69357B4C3E40");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, "IMPORTO 4");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, "Variazione accantonamenti effettuata in sede di rendiconto (con segno +/-) (d)");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, "0DD1B5E1-B08F-467D-A4F5-36817B81DD3C");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, "Cancellazione di residui attivi ");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, "7C9B1DB6-545B-49D6-8C26-9E40CB877C70");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, "IMPORTO TOT");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, "E7AC14C4-BD43-49B4-BBE3-2DEF862BC725");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, "IMPORTO 6");
    PAN_A3RISAMMQUDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, "0C95E03F-35AC-48CF-B870-8EB2AFD187A7");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, "Totale");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, "F7E58156-A32D-489A-B37A-01C3F56DCAF8");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, "0ED9D561-C71A-4A8C-8414-428A59075EEE");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, "70E29132-BE7C-412D-B52D-8B3B56FCCD38");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, "C663DC0D-508D-41C3-B63E-467673C53C66");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, "A80B3B80-3C09-4367-861F-2EF6B6F27A5F");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, "3DB2C4F5-09E2-452F-9103-6C0B4A3A00BF");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMQUDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, "8EC876C4-271B-49C7-B25B-5C48448DBD46");
    PAN_A3RISAMMQUDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, "");
    PAN_A3RISAMMQUDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMQUDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_A3RISAMMQUDE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROG.");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_PROGRESSIVO1, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_PROGRESSIVO1, PPQRY_PARBILALRI10, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 0, 52, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 88);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 104);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TIPOSTAMPA1, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TIPOSTAMPA1, PPQRY_PARBILALRI10, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_LIST, "ESER.");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_ESERCIZIO1, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_ESERCIZIO1, PPQRY_PARBILALRI10, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 0, 52, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 116);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 228, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 120);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_RAGGRUPPAME1, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_RAGGRUPPAME1, PPQRY_PARBILALRI10, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_LIST, 96, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_LIST, 16);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_LIST, "S");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_FORM, 492, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_FORM, 32);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_S, MyGlb.PANEL_FORM, "S");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_S, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_S, PPQRY_PARBILALRI10, "A.S", "S", 5, 1, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 0, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOENTRAT, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_CAPITOENTRAT, -1, GRP_A3RISAMMQUDE_ENTRATA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_CAPITOENTRAT, PPQRY_PARBILALRI10, "A.CAPITOLO_ENTRATA", "CAPITOLO_ENTRATA", 3, 16, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 112, 52, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_LIST, "Art.");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 380, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOENTRAT, MyGlb.PANEL_FORM, "Art.");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_ARTICOENTRAT, -1, GRP_A3RISAMMQUDE_ENTRATA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_ARTICOENTRAT, PPQRY_PARBILALRI10, "A.ARTICOLO_ENTRATA", "ARTICOLO_ENTRATA", 1, 2, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 144, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 172);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_LIST, " ");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 4, 364, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 172);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPIENTR, MyGlb.PANEL_FORM, " ");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_SCELCAPIENTR, -1, GRP_A3RISAMMQUDE_ENTRATA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_SCELCAPIENTR, PPQRY_DUAL, "'A'", "SCELCAPIENTR", 5, 1, 0, -13997);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPIENTR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 168, 52, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 160);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 4, 388, 596, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 160);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 2);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPIENTR, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_DESCCAPIENTR, -1, GRP_A3RISAMMQUDE_ENTRATA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_DESCCAPIENTR, PPQRY_PARBILALRI10, "A.DESCR_CAPITOLO_ENTRATA", "DESCR_CAPITOLO_ENTRATA", 5, 500, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 432, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_CAPITOLSPESA, -1, GRP_A3RISAMMQUDE_SPESA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_CAPITOLSPESA, PPQRY_PARBILALRI10, "A.CAPITOLO_SPESA", "CAPITOLO_SPESA", 3, 16, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 544, 52, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 228, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 120);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_ARTICOLSPESA, -1, GRP_A3RISAMMQUDE_SPESA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_ARTICOLSPESA, PPQRY_PARBILALRI10, "A.ARTICOLO_SPESA", "ARTICOLO_SPESA", 1, 2, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_LIST, 576, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_LIST, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_LIST, " ");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_FORM, 4, 304, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_SCELCAPISPES, MyGlb.PANEL_FORM, " ");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_SCELCAPISPES, -1, GRP_A3RISAMMQUDE_SPESA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_SCELCAPISPES, PPQRY_DUAL, "'A'", "SCELCAPISPES", 5, 1, 0, -13997);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A3RISAMMQUDE.SetValueListItem(PFL_A3RISAMMQUDE_SCELCAPISPES, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_LIST, 600, 52, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_LIST, 144);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_FORM, 4, 436, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_FORM, 144);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_FORM, 2);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_DESCCAPISPES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_DESCCAPISPES, -1, GRP_A3RISAMMQUDE_SPESA);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_DESCCAPISPES, PPQRY_PARBILALRI10, "A.DESCR_CAPITOLO_SPESA", "DESCR_CAPITOLO_SPESA", 5, 500, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_LIST, 176, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_LIST, 16);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_LIST, "E");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_E, MyGlb.PANEL_FORM, "E");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_E, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_E, PPQRY_PARBILALRI10, "A.E", "E", 5, 1, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_LIST, 864, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO7, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO7, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO7, PPQRY_PARBILALRI10, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_LIST, 992, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO2, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO2, PPQRY_PARBILALRI10, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_LIST, 1120, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO3, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO3, PPQRY_PARBILALRI10, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_LIST, 1248, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_LIST, "IMPORTO 4");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO4, MyGlb.PANEL_FORM, "IMPORTO 4");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO4, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO4, PPQRY_PARBILALRI10, "A.IMPORTO_4", "IMPORTO_4", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_LIST, 1376, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_LIST, "Cancellazione di residui attivi ");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO5, MyGlb.PANEL_FORM, "Cancell. di res. attivi");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO5, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO5, PPQRY_PARBILALRI10, "A.IMPORTO_5", "IMPORTO_5", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_LIST, 1504, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_LIST, 80);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_LIST, "IMPORTO TOT");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_FORM, 80);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTOTOT, MyGlb.PANEL_FORM, "IMP. TOT");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTOTOT, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTOTOT, PPQRY_DUAL, "~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~", "IMPORTO6", 3, 28, 6, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_LIST, 1632, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_LIST, "IMPORTO 6");
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_FORM, 4, 484, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_FORM, 72);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_IMPORTO6, MyGlb.PANEL_FORM, "IMPORTO 6");
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_IMPORTO6, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_IMPORTO6, PPQRY_PARBILALRI10, "A.IMPORTO_6", "IMPORTO_6", 3, 14, 2, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_LIST, 784, 236, 76, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_FORM, 568, 252, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_ETICHETOTALE, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 864, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 656, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR1, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR1, -1, "", "TOTALEIMPOR1", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 992, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 664, 256, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR2, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR2, -1, "", "TOTALEIMPOR2", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1120, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 672, 264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR3, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR3, -1, "", "TOTALEIMPOR3", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1248, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 680, 272, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR4, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR4, -1, "", "TOTALEIMPOR4", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1376, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR5, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR5, -1, "", "TOTALEIMPOR5", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1504, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALIMPOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALIMPOTOT, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALIMPOTOT, -1, "", "TOTALIMPOTOT", 0, 0, 0, -13997);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1632, 236, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMQUDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 696, 288, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMQUDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMQUDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMQUDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMQUDE.SetFieldPage(PFL_A3RISAMMQUDE_TOTALEIMPOR6, -1, -1);
    PAN_A3RISAMMQUDE.SetFieldPanel(PFL_A3RISAMMQUDE_TOTALEIMPOR6, -1, "", "TOTALEIMPOR6", 0, 0, 0, -13997);
  }

  private void PAN_A3RISAMMQUDE_InitQueries()
  {
    StringBuffer SQL;

    PAN_A3RISAMMQUDE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~ as IMPORTO6, ");
    SQL.append("  'A' as SCELCAPIENTR, ");
    SQL.append("  'A' as SCELCAPISPES ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_A3RISAMMQUDE.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A3RISAMMQUDE.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_A3RISAMMQUDE.SetIMDB(IMDB, "PQRY_PARBILALRI10", true);
    PAN_A3RISAMMQUDE.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.CAPITOLO_SPESA as CAPITOLO_SPESA, ");
    SQL.append("  A.ARTICOLO_SPESA as ARTICOLO_SPESA, ");
    SQL.append("  A.DESCR_CAPITOLO_SPESA as DESCR_CAPITOLO_SPESA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.CAPITOLO_ENTRATA as CAPITOLO_ENTRATA, ");
    SQL.append("  A.ARTICOLO_ENTRATA as ARTICOLO_ENTRATA, ");
    SQL.append("  A.DESCR_CAPITOLO_ENTRATA as DESCR_CAPITOLO_ENTRATA, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.IMPORTO_4 as IMPORTO_4, ");
    SQL.append("  A.IMPORTO_5 as IMPORTO_5, ");
    SQL.append("  A.IMPORTO_6 as IMPORTO_6 ");
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A ");
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A3RISAMMPREV') ");
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO_ENTRATA, ");
    SQL.append("  A.ARTICOLO_ENTRATA, ");
    SQL.append("  A.DESCR_CAPITOLO_ENTRATA, ");
    SQL.append("  A.CAPITOLO_SPESA, ");
    SQL.append("  A.ARTICOLO_SPESA, ");
    SQL.append("  A.DESCR_CAPITOLO_SPESA ");
    PAN_A3RISAMMQUDE.SetQuery(PPQRY_PARBILALRI10, 5, SQL, -1, "");
    PAN_A3RISAMMQUDE.SetQueryDB(PPQRY_PARBILALRI10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A3RISAMMQUDE.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_CAPITOENTRAT, true);
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_ARTICOENTRAT, true);
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_DESCCAPIENTR, true);
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_CAPITOLSPESA, true);
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_ARTICOLSPESA, true);
    PAN_A3RISAMMQUDE.AddToSortList(PFL_A3RISAMMQUDE_DESCCAPISPES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_A3RISAMMQUDE.Status() == 2)
    {
      int oldListQBE = PAN_A3RISAMMQUDE.iUseListQBE;
      PAN_A3RISAMMQUDE.iUseListQBE = 0;
      PAN_A3RISAMMQUDE.PanelCommand(Glb.PCM_SEARCH);
      PAN_A3RISAMMQUDE.PanelCommand(Glb.PCM_FIND);
      PAN_A3RISAMMQUDE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TOTAQUOTACCA_Init()
  {

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "64BC4D98-A516-4735-ACB1-D01533B3C3A6");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "PROGRESSIVO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "A2445FF1-361A-4515-AE43-52483A419A71");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "ESERCIZIO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "1832102E-ADC6-4724-ABE6-0FEB852AD875");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "21A5C3B1-677C-459A-9890-0FF48E997B11");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "A78DFC29-923A-4541-83CC-A35E5AA6F477");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "IMPORTO 1");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TOTAQUOTACCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_PROGRESSIVO, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_PROGRESSIVO, PPQRY_PARBILALRIA9, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_ESERCIZIO, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_ESERCIZIO, PPQRY_PARBILALRIA9, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_TIPOSTAMPA, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_TIPOSTAMPA, PPQRY_PARBILALRIA9, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 172, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, PPQRY_PARBILALRIA9, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 544, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_IMPORTO1, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_IMPORTO1, PPQRY_PARBILALRIA9, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
  }

  private void PAN_TOTAQUOTACCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTAQUOTACCA.SetIMDB(IMDB, "PQRY_PARBILALRIA9", true);
    PAN_TOTAQUOTACCA.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1 ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A3RISAMMPREVTOT') ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGGRUPPAMENTO ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA9, 5, SQL, -1, "");
    PAN_TOTAQUOTACCA.SetQueryDB(PPQRY_PARBILALRIA9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TOTAQUOTACCA.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_TOTAQUOTACCA.AddToSortList(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTAQUOTACCA.Status() == 2)
    {
      int oldListQBE = PAN_TOTAQUOTACCA.iUseListQBE;
      PAN_TOTAQUOTACCA.iUseListQBE = 0;
      PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_FIND);
      PAN_TOTAQUOTACCA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_DynamicProperties();
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_AfterFind(CmdFind);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_A3RISAMMQUDE) PAN_A3RISAMMQUDE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
