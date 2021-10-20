// **********************************************
// Allegati Bilancio A2 Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatiBilancioA2Prev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_A2RISAMMQUVI_ENTRATA = 0;
  private static int GRP_A2RISAMMQUVI_SPESA = 1;

  private static int PFL_A2RISAMMQUVI_PROGRESSIVO1 = 0;
  private static int PFL_A2RISAMMQUVI_TIPOSTAMPA1 = 1;
  private static int PFL_A2RISAMMQUVI_ESERCIZIO1 = 2;
  private static int PFL_A2RISAMMQUVI_RAGGRUPPAME1 = 3;
  private static int PFL_A2RISAMMQUVI_S = 4;
  private static int PFL_A2RISAMMQUVI_CAPITOENTRAT = 5;
  private static int PFL_A2RISAMMQUVI_ARTICOENTRAT = 6;
  private static int PFL_A2RISAMMQUVI_SCELCAPIENTR = 7;
  private static int PFL_A2RISAMMQUVI_DESCCAPIENTR = 8;
  private static int PFL_A2RISAMMQUVI_CAPITOLSPESA = 9;
  private static int PFL_A2RISAMMQUVI_ARTICOLSPESA = 10;
  private static int PFL_A2RISAMMQUVI_SCELCAPISPES = 11;
  private static int PFL_A2RISAMMQUVI_DESCCAPISPES = 12;
  private static int PFL_A2RISAMMQUVI_E = 13;
  private static int PFL_A2RISAMMQUVI_IMPORTO8 = 14;
  private static int PFL_A2RISAMMQUVI_IMPORTO2 = 15;
  private static int PFL_A2RISAMMQUVI_IMPORTO3 = 16;
  private static int PFL_A2RISAMMQUVI_IMPORTO4 = 17;
  private static int PFL_A2RISAMMQUVI_IMPORTO5 = 18;
  private static int PFL_A2RISAMMQUVI_IMPORTO6 = 19;
  private static int PFL_A2RISAMMQUVI_IMPORTOTOT = 20;
  private static int PFL_A2RISAMMQUVI_IMPORTO7 = 21;
  private static int PFL_A2RISAMMQUVI_ORDINAMENTO = 22;
  private static int PFL_A2RISAMMQUVI_ETICHETOTALE = 23;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR1 = 24;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR2 = 25;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR3 = 26;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR4 = 27;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR5 = 28;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR6 = 29;
  private static int PFL_A2RISAMMQUVI_TOTALIMPOTOT = 30;
  private static int PFL_A2RISAMMQUVI_TOTALEIMPOR7 = 31;

  private static int PPQRY_PARBILALRIA6 = 0;

  private static int PPQRY_DUAL = 1;

  private static int PPQRY_ATTRIBUTICFA = 2;


  IDPanel PAN_A2RISAMMQUVI;
  private static int PFL_TOTAQUOTACCA_PROGRESSIVO = 0;
  private static int PFL_TOTAQUOTACCA_ESERCIZIO = 1;
  private static int PFL_TOTAQUOTACCA_RAGGRUPPAMEN = 2;
  private static int PFL_TOTAQUOTACCA_TIPOSTAMPA = 3;
  private static int PFL_TOTAQUOTACCA_IMPORTO1 = 4;

  private static int PPQRY_PARBILALRIA7 = 0;


  IDPanel PAN_TOTAQUOTACCA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI675(IMDB);
    //
    //
    Init_PQRY_PARBILALRIA6(IMDB);
    Init_PQRY_PARBILALRIA7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI675(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI675, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI675, "TBL_PARAMETRI675");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARANOMEFILE,9,500,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAMLOOKUP, "PARAMLOOKUP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI675,IMDBDef3.FLD_PARAMETRI675_PARAMLOOKUP,5,50,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI675, 0);
  }

  private static void Init_PQRY_PARBILALRIA6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARBILALRIA6, 20);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARBILALRIA6, "PQRY_PARBILALRIA6");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_S, "S");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, "CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, "ARTICOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_SPESA, "DESCR_CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_SPESA,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_E, "E");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_E,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, "CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, "ARTICOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_ENTRATA, "DESCR_CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_ENTRATA,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4, "IMPORTO_4");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5, "IMPORTO_5");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6, "IMPORTO_6");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7, "IMPORTO_7");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_PABIALRIAMOR, "PABIALRIAMOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA6,IMDBDef11.PQSL_PARBILALRIA6_PABIALRIAMOR,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARBILALRIA6, 0);
  }

  private static void Init_PQRY_PARBILALRIA7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARBILALRIA7, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARBILALRIA7, "PQRY_PARBILALRIA7");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARBILALRIA7,IMDBDef11.PQSL_PARBILALRIA7_IMPORTO_1,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARBILALRIA7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatiBilancioA2Prev(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatiBilancioA2Prev()
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
    FormIdx = MyGlb.FRM_ALLEBILA2PRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AAC79DAB-6BDB-4C0A-8920-609488772B68";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 522;
    set_Caption(new IDVariant("A2 Ris. Amministrazione - Quote Vincolate"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 496;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.701613;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 796;
    Frames[2].Height = 348;
    Frames[2].Caption = "A2 Ris. Amministrazione - Quote Vincolate";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 348;
    PAN_A2RISAMMQUVI = new IDPanel(w, this, 2, "PAN_A2RISAMMQUVI");
    Frames[2].Content = PAN_A2RISAMMQUVI;
    PAN_A2RISAMMQUVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_A2RISAMMQUVI.VS = MainFrm.VisualStyleList;
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6C98E565-2020-4F2D-B128-B226026EF957");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2120, 232, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_A2RISAMMQUVI.InitStatus = 2;
    PAN_A2RISAMMQUVI_Init();
    PAN_A2RISAMMQUVI_InitFields();
    PAN_A2RISAMMQUVI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 796;
    Frames[3].Height = 148;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Totale Quote Accantonate";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 148;
    PAN_TOTAQUOTACCA = new IDPanel(w, this, 3, "PAN_TOTAQUOTACCA");
    Frames[3].Content = PAN_TOTAQUOTACCA;
    PAN_TOTAQUOTACCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTAQUOTACCA.VS = MainFrm.VisualStyleList;
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 148-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "778D1F46-8051-4595-813B-A959C336B86C");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 136, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_STAMPA26+BaseCmdLinIdx)
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
      PAN_A2RISAMMQUVI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A2RISAMMQUVI.FrIndex)
    {
      if (IdxFieldActived ==PFL_A2RISAMMQUVI_SCELCAPIENTR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A2RISAMMQUVI.FrIndex)
    {
      if (IdxFieldActived ==PFL_A2RISAMMQUVI_SCELCAPISPES) {
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
    return (obj instanceof AllegatiBilancioA2Prev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatiBilancioA2Prev.class.getName() : (Glb.ClassWithPackage(AllegatiBilancioA2Prev.class) ? AllegatiBilancioA2Prev.class.getName().substring(AllegatiBilancioA2Prev.class.getPackage().getName().length() + 1) : AllegatiBilancioA2Prev.class.getName()));
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
      v_TOOLTISTAMPA = (new IDVariant("A2 Ris. Amministrazione - Quote Vincolate"));
      SettaCaptionA2();
      PAN_TOTAQUOTACCA.ClearValueList(PFL_TOTAQUOTACCA_RAGGRUPPAMEN);
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A2RISAMMPREVI1")), ((new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A2RISAMMPREVI1")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A2RISAMMPREVI2")), ((new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A2RISAMMPREVI2")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A2RISAMMPREVI3")), ((new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A2RISAMMPREVI3")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A2RISAMMPREVI4")), ((new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A2RISAMMPREVI4")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A2RISAMMPREVI5")), ((new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A2RISAMMPREVI1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (i/1)") : (new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A2RISAMMPREVI2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (i/2) ") : (new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A2RISAMMPREVI3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (i/3)") : (new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A2RISAMMPREVI4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (i/4)") : (new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A2RISAMMPREVI5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (i/5)") : (new IDVariant("A2RISAMMPREVI5")).equals((new IDVariant("A3RISAMMPREVTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione presunto riguardanti le risorse destinate agli investimenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_A2RISAMMQUVI.SetFlags (Glb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      MainFrm.CmdObj.set_CmdToolTip(MyGlb.CMD_STAMPA26+BaseCmdLinIdx, new IDVariant(v_TOOLTISTAMPA).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "Load", _e);
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
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMLOOKUP, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "EndModal", _e);
    }
  }

  // **********************************************************************
  // A2 Ris. Amministrazione - Quote Vincolate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_A2RISAMMQUVI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_A2RISAMMQUVI);
      // 
      // A2 Ris. Amministrazione - Quote Vincolate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_RAGGRUPPAME1,(new IDVariant(PAN_A2RISAMMQUVI.FieldText(PFL_A2RISAMMQUVI_RAGGRUPPAME1))).stringValue()); 
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_DESCCAPIENTR,(new IDVariant(PAN_A2RISAMMQUVI.FieldText(PFL_A2RISAMMQUVI_DESCCAPIENTR))).stringValue()); 
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_DESCCAPISPES,(new IDVariant(PAN_A2RISAMMQUVI.FieldText(PFL_A2RISAMMQUVI_DESCCAPISPES))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "A2Ris.Amministrazione-QuoteVincolateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // A2 Ris. Amministrazione - Quote Vincolate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_A2RISAMMQUVI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A2 Ris. Amministrazione - Quote Vincolate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_PROGRESSIVO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_TIPO_STAMPA, 0, (new IDVariant("A2RISAMMPREV")));
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if ((Column.equals((new IDVariant(PFL_A2RISAMMQUVI_CAPITOENTRAT)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_ARTICOENTRAT)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("E")), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, 0), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_ENTRATA, 0, (new IDVariant()));
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
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_ENTRATA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A2RISAMMQUVI_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_ARTICOLSPESA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, 0), IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_SPESA, 0, (new IDVariant()));
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
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_CAPITOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_ARTICOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_DESCR_CAPITOLO_SPESA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO8)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO2)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO3)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO4)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO5)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO6)), true) || Column.equals((new IDVariant(PFL_A2RISAMMQUVI_IMPORTO7)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "A2Ris.Amministrazione-QuoteVincolateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // A2 Ris. Amministrazione - Quote Vincolate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_A2RISAMMQUVI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A2 Ris. Amministrazione - Quote Vincolate After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "A2Ris.Amministrazione-QuoteVincolateAfterFind", _e);
    }
  }

  // **********************************************************************
  // A2 Ris. Amministrazione - Quote Vincolate After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_A2RISAMMQUVI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A2 Ris. Amministrazione - Quote Vincolate After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_A2RISAMMQUVI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "A2Ris.Amministrazione-QuoteVincolateAfterCommit", _e);
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
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Totale Quote Accantonate After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_TOTAQUOTACCA.GetNumRows())).equals((new IDVariant(0)), true))
      {
        IDVariant v_INSERITO = new IDVariant(0,IDVariant.INTEGER);
        try
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as ATTRICFATIPO, ");
          SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
          SQL.append("  A.CODICE as ATTRICFACODI ");
          SQL.append("from ");
          SQL.append("  ATTRIBUTI_CFA A ");
          SQL.append("where (A.TIPO = 'QPACCAPREV2') ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
          SQL.append("order by ");
          SQL.append("  A.SEQUENZA ");
          C4 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C4.EOF()) C4.MoveNext();
          while (!C4.EOF())
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
            SQL.append("  'A2RISAMMPREVI', ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C4.Get("ATTRICFACODI"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            v_INSERITO = (new IDVariant(-1));
            C4.MoveNext();
          }
          C4.Close();
        }
        catch (Exception e5)
        {
          MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
          return;
        }
        // 
        // Evito il loop se non riesce a inserire righe
        // 
        if (v_INSERITO.booleanValue())
        {
          PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "TotaleQuoteAccantonateAfterFind", _e);
    }
  }

  // **********************************************************************
  // Setta Caption A2
  // **********************************************************************
  public int SettaCaptionA2 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption A2 Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTIOIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR1 = (new IDVariant("Risorse vincolate al 1/1/"));
      IDVariant v_CAPTIOIMP1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP1 = (new IDVariant("Entrate vincolate accertate "));
      IDVariant v_CAPTI2IMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTI2IMPOR2 = (new IDVariant(" (dati presunti) (b)"));
      IDVariant v_CAPTIOIMP2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP2 = (new IDVariant("Impegni presunti "));
      IDVariant v_CAPTIOIMP3 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP3 = (new IDVariant(" finanziati da ent. vinc."));
      IDVariant v_TOOLTIIMP1 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP1 = (new IDVariant(" finanziati da entrate vincolate accertate nell'esercizio o da quote vincolate del risultato di amministrazione (dati presunti) (c)"));
      IDVariant v_CAPTIOIMP4 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP4 = (new IDVariant("Fondo plur. vinc. al 31/12/"));
      IDVariant v_TOOLTIIMP2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP2 = (new IDVariant(" finanziato da entrate vincolate accertate nell'esercizio o da quote vincolate del risultato di amministrazione (dati presunti) (d)"));
      IDVariant v_CAPTIOIMP5 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP5 = (new IDVariant("Cancellazione nell'esercizio "));
      IDVariant v_CAPTI2IMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_CAPTI2IMPOR5 = (new IDVariant(" di residui attivi vincolati"));
      IDVariant v_TOOLTIIMP3 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP3 = (new IDVariant(" di residui attivi vincolati o eliminazione del vincolo su quote del risultato di amministrazione (+) e cancellazione nell'esercizio "));
      IDVariant v_TOOLT2IMPOR5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR5 = (new IDVariant(" di residui passivi finanziati da risorse vincolate (-) (gestione dei residui): (dati presunti) (e)"));
      IDVariant v_CAPTIOIMP6 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP6 = (new IDVariant("Cancellazione nell'esercizio "));
      IDVariant v_CAPTIOIMPORT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPORT = (new IDVariant(" di imp. da FPV"));
      IDVariant v_TOOLTIIMP4 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP4 = (new IDVariant(" di impegni finanziati dal fondo pluriennale vincolato dopo l'approvazione del rendiconto "));
      IDVariant v_TOOLTIIMP5 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP5 = (new IDVariant(" se non reimpegnati nell'esercizio "));
      IDVariant v_CAPTIIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIIMPOTOT = (new IDVariant("Ris. vinc. nel ris. amm. pres. al 31/12/"));
      IDVariant v_TOOLTIMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIMPOTOT = (new IDVariant("Risorse vincolate nel risultato di amministrazione presunto al 31/12/"));
      IDVariant v_TOOL2IMPOTOT = new IDVariant(0,IDVariant.STRING);
      v_TOOL2IMPOTOT = (new IDVariant("(g)=(a)+(b)-(c)-(d)-(e)+(f)"));
      IDVariant v_CAPTIOIMPOR7 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR7 = (new IDVariant("Ris. vinc. pres. al 31/12/"));
      IDVariant v_CAPTI2IMPOR7 = new IDVariant(0,IDVariant.STRING);
      v_CAPTI2IMPOR7 = (new IDVariant(" applic. al primo esercizio prev."));
      IDVariant v_TOOLTIIMPORT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPORT = (new IDVariant("Risorse vincolate presunte al 31/12/"));
      IDVariant v_TOOLT2IMPOR7 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR7 = (new IDVariant(" applicate al primo esercizio del bilancio di previsione (i)"));
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO8, IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO8,IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" "))), (new IDVariant("(a)"))).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO2, IDL.Add(v_CAPTIOIMP1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO2,IDL.Add(IDL.Add(v_CAPTIOIMP1, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTI2IMPOR2).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO3, IDL.Add(IDL.Add(v_CAPTIOIMP2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTIOIMP3).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO3,IDL.Add(IDL.Add(v_CAPTIOIMP2, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP1).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO4, IDL.Add(v_CAPTIOIMP4, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO4,IDL.Add(IDL.Add(v_CAPTIOIMP4, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP2).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO5, IDL.Add(IDL.Add(v_CAPTIOIMP5, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTI2IMPOR5).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO5,IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMP5, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP3), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLT2IMPOR5).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO6, IDL.Add(IDL.Add(v_CAPTIOIMP6, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTIOIMPORT).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO6,IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMP6, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLTIIMP4), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))), v_TOOLTIIMP5), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTOTOT, IDL.Add(v_CAPTIIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTOTOT,IDL.Add(IDL.Add(v_TOOLTIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOL2IMPOTOT).stringValue()); 
      PAN_A2RISAMMQUVI.set_Header(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO7, IDL.Add(IDL.Add(v_CAPTIOIMPOR7, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_CAPTI2IMPOR7).stringValue());
      PAN_A2RISAMMQUVI.set_ToolTip(Glb.OBJ_FIELD,PFL_A2RISAMMQUVI_IMPORTO7,IDL.Add(IDL.Add(v_TOOLTIIMPORT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOLT2IMPOR7).stringValue()); 
      PAN_TOTAQUOTACCA.set_Header(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1, IDL.Add(v_CAPTIIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_TOTAQUOTACCA.set_ToolTip(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1,IDL.Add(IDL.Add(v_TOOLTIMPOTOT, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), v_TOOL2IMPOTOT).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "SettaCaptionA2", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMLOOKUP, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "SceltaCapitoloEntrata", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMLOOKUP, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "SceltaCapitoloSpesa", _e);
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
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR7, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTOTOT), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR1, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO8), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR2, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO2), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR3, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO3), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR4, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO4), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR5, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO5), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR6, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO6), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALIMPOTOT, IDL.Format(IDL.Add(IDL.Sub(IDL.Sub(IDL.Sub(IDL.Add(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO8), PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO2)), PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO3)), PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO4)), PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO5)), PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO6)), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A2RISAMMQUVI.set_FieldText(PFL_A2RISAMMQUVI_TOTALEIMPOR7, IDL.Format(PAN_A2RISAMMQUVI.GetFieldSum(PFL_A2RISAMMQUVI_IMPORTO7), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "CalcolaTotali", _e);
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
      if (new IDVariant(PAN_A2RISAMMQUVI.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOTESTAM, 0), (new IDVariant()));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA2Prev", "Stampa", _e);
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
  private void PAN_A2RISAMMQUVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_A2RISAMMQUVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_A2RISAMMQUVI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_A2RISAMMQUVI, Cancel);
    // Stub
  }

  private void PAN_A2RISAMMQUVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_A2RISAMMQUVI_SCELCAPIENTR)
    {
      this.IdxPanelActived = this.PAN_A2RISAMMQUVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_A2RISAMMQUVI_SCELCAPISPES)
    {
      this.IdxPanelActived = this.PAN_A2RISAMMQUVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloSpesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_A2RISAMMQUVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_A2RISAMMQUVI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_A2RISAMMQUVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_S, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_E, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_2, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_3, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_4, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_5, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_6, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA6, IMDBDef11.PQSL_PARBILALRIA6_IMPORTO_7, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_A2RISAMMQUVI_IntValidateRow(Cancel);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARBILALRIA7, IMDBDef11.PQSL_PARBILALRIA7_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARBILALRIA7, IMDBDef11.PQSL_PARBILALRIA7_IMPORTO_1, 0, (new IDVariant(0)));
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
  private void PAN_A2RISAMMQUVI_Init()
  {

    PAN_A2RISAMMQUVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_A2RISAMMQUVI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, "A70A5B6D-99CC-4876-8CB2-EC9C68F0015A");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, "Entrata");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, MyGlb.VIS_GROUPSTYLE);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, MyGlb.PANEL_LIST, 232, -9999, 432, 21, 0, 0);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, MyGlb.PANEL_FORM, 0, 75, 604, 385, 0, 0);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, 0, 42);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, 1, 13);
    PAN_A2RISAMMQUVI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, 0, 4);
    PAN_A2RISAMMQUVI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, 1, 4);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_ENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, "DC00EE16-357B-4675-B160-73C5F335750C");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, "Spesa");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, MyGlb.VIS_GROUPSTYLE);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, MyGlb.PANEL_LIST, 664, -9999, 432, 21, 0, 0);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, MyGlb.PANEL_FORM, 0, 27, 588, 481, 0, 0);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, 0, 34);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, 1, 13);
    PAN_A2RISAMMQUVI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, 0, 4);
    PAN_A2RISAMMQUVI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, 1, 4);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_GROUP, GRP_A2RISAMMQUVI_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A2RISAMMQUVI.SetSize(MyGlb.OBJ_FIELD, 32);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, "A6F88023-0480-47C9-BAB8-44FD4D0B7E07");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, "PROGRESSIVO");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, "85530AFD-194A-4D5A-88AD-B66D426E221D");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, "TIPO STAMPA");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, 0, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, "7B406246-66EC-4BDC-BBDD-45BDA96A1847");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, "ESERCIZIO");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, 0, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, "05AA8716-AB54-4E3F-9451-1E6D49ACA4AE");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, "Fondo Accantonamento");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.VIS_NORMFIELPADR);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, "400B5045-E67C-4AB0-BB55-60A813B17B76");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, "S");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.VIS_NORMFIELPADR);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, "0B226D3E-045C-46E5-835E-B3F70D685FC5");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, "Capitolo");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.VIS_NORFIEINTLUN);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, "523E18BA-7478-446D-B372-CD696E0F9522");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, "Art.");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, "2F2022FF-812E-4854-B3CF-4F56C1620BD9");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, " ");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.VIS_HYPELINKIMMA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, "060527FB-D015-4523-8C84-C0DCFE7F5B2D");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, "Descrizione");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.VIS_NORMALFIELDS);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, "8C7CE463-52E6-44FF-AE3A-B3C6DCF93861");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, "Capitolo");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, "64E6C850-A401-4DF4-A9C9-D3FF6FE0D2EE");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, "Art.");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, "44EC9515-415D-4619-BD6F-E8406C73AC62");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, " ");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.VIS_HYPELINKIMMA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, "983E9B51-2549-4792-AAB8-17DF1C3BFE23");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, "Descrizione");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, "D2C944CD-0127-405D-BE1E-4872774B5160");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, "E");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.VIS_NORMFIELPADR);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, "551656D4-8D37-4327-80BD-B999FFC25764");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, "IMPORTO 1");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, "3BCDC6A6-E29C-4D36-84FD-CB887CDEC3A0");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, "IMPORTO 2");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, "8A8F0B7C-3DEA-492D-8846-018F52D052C6");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, "IMPORTO 3");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, "785E50BF-AD18-4269-A27F-6D63C19408A3");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, "IMPORTO 4");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, "5AA6896D-3F7E-4F99-A032-A3B877F752FF");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, "IMPORTO 5");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, "BF326FE5-AD18-4801-9EAA-E5FBFB711819");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, "IMPORTO 6");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, "1F13403C-6421-4383-B94A-8755B3C1BBC4");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, "IMPORTO TOT");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, "5B119D78-E0DD-4D76-8A37-44361223BA2F");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, "IMPORTO 7");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.VIS_NORFIECF4IMP);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, "4EF404EF-7975-4CBC-9AC1-C5DA1DECE196");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, "Ordinamento");
    PAN_A2RISAMMQUVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, "564D8DFE-BC29-41C6-9C8B-D01800E7AED8");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, "Totale");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, "1C05262A-70CA-4D17-8C1B-AC5CB4299D8F");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, "97ED4D74-0415-46FF-8480-4EB517FDAC28");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, "135F98FD-FBD3-421B-8193-8249B5BADC77");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, "B76DF79D-080F-4BA2-8F15-BD3174A35FAD");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, "46CDEEFD-020E-405B-9427-AE5296BD8017");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, "C7B916C4-69BB-4945-BF90-90ADA95077C0");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, "B417DBF4-4CC7-4E2D-9967-1E1D1CD50357");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A2RISAMMQUVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, "CF4B61CD-8535-48B1-A747-0B20A907F025");
    PAN_A2RISAMMQUVI.set_Header(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, "");
    PAN_A2RISAMMQUVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.VIS_CAMPTOTADISA);
    PAN_A2RISAMMQUVI.SetFlags(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_A2RISAMMQUVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROG.");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_PROGRESSIVO1, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_PROGRESSIVO1, PPQRY_PARBILALRIA6, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 0, 52, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 88);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 104);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TIPOSTAMPA1, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TIPOSTAMPA1, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TIPOSTAMPA1, PPQRY_PARBILALRIA6, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_LIST, "ESER.");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_ESERCIZIO1, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_ESERCIZIO1, PPQRY_PARBILALRIA6, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_LIST, 0, 52, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_LIST, 116);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_FORM, 228, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_FORM, 120);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_RAGGRUPPAME1, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_RAGGRUPPAME1, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_RAGGRUPPAME1, PPQRY_PARBILALRIA6, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_LIST, 96, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_LIST, 16);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_LIST, "S");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_FORM, 492, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_FORM, 32);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_S, MyGlb.PANEL_FORM, "S");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_S, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_S, PPQRY_PARBILALRIA6, "A.S", "S", 5, 1, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_LIST, 232, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOENTRAT, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_CAPITOENTRAT, -1, GRP_A2RISAMMQUVI_ENTRATA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_CAPITOENTRAT, PPQRY_PARBILALRIA6, "A.CAPITOLO_ENTRATA", "CAPITOLO_ENTRATA", 3, 16, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_LIST, 344, 52, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_LIST, "Art.");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_FORM, 380, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOENTRAT, MyGlb.PANEL_FORM, "Art.");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_ARTICOENTRAT, -1, GRP_A2RISAMMQUVI_ENTRATA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_ARTICOENTRAT, PPQRY_PARBILALRIA6, "A.ARTICOLO_ENTRATA", "ARTICOLO_ENTRATA", 1, 2, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_LIST, 376, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_LIST, 172);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_LIST, " ");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_FORM, 4, 364, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_FORM, 172);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPIENTR, MyGlb.PANEL_FORM, " ");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_SCELCAPIENTR, -1, GRP_A2RISAMMQUVI_ENTRATA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_SCELCAPIENTR, PPQRY_DUAL, "'A'", "SCELCAPIENTR", 5, 1, 0, -13997);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPIENTR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_LIST, 400, 52, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_LIST, 160);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_FORM, 4, 412, 596, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_FORM, 160);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_FORM, 2);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPIENTR, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_DESCCAPIENTR, -1, GRP_A2RISAMMQUVI_ENTRATA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_DESCCAPIENTR, PPQRY_PARBILALRIA6, "A.DESCR_CAPITOLO_ENTRATA", "DESCR_CAPITOLO_ENTRATA", 5, 500, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_LIST, 664, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_CAPITOLSPESA, -1, GRP_A2RISAMMQUVI_SPESA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_CAPITOLSPESA, PPQRY_PARBILALRIA6, "A.CAPITOLO_SPESA", "CAPITOLO_SPESA", 3, 16, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_LIST, 776, 52, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_FORM, 228, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_FORM, 120);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_ARTICOLSPESA, -1, GRP_A2RISAMMQUVI_SPESA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_ARTICOLSPESA, PPQRY_PARBILALRIA6, "A.ARTICOLO_SPESA", "ARTICOLO_SPESA", 1, 2, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_LIST, 808, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_LIST, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_LIST, " ");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_FORM, 4, 304, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_SCELCAPISPES, MyGlb.PANEL_FORM, " ");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_SCELCAPISPES, -1, GRP_A2RISAMMQUVI_SPESA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_SCELCAPISPES, PPQRY_DUAL, "'A'", "SCELCAPISPES", 5, 1, 0, -13997);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A2RISAMMQUVI.SetValueListItem(PFL_A2RISAMMQUVI_SCELCAPISPES, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_LIST, 832, 52, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_LIST, 144);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_FORM, 4, 460, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_FORM, 144);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_FORM, 2);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_DESCCAPISPES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_DESCCAPISPES, -1, GRP_A2RISAMMQUVI_SPESA);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_DESCCAPISPES, PPQRY_PARBILALRIA6, "A.DESCR_CAPITOLO_SPESA", "DESCR_CAPITOLO_SPESA", 5, 500, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_LIST, 176, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_LIST, 16);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_LIST, "E");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_E, MyGlb.PANEL_FORM, "E");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_E, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_E, PPQRY_PARBILALRIA6, "A.E", "E", 5, 1, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_LIST, 1096, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO8, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO8, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO8, PPQRY_PARBILALRIA6, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_LIST, 1224, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO2, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO2, PPQRY_PARBILALRIA6, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_LIST, 1352, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO3, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO3, PPQRY_PARBILALRIA6, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_LIST, 1480, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_LIST, "IMPORTO 4");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO4, MyGlb.PANEL_FORM, "IMPORTO 4");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO4, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO4, PPQRY_PARBILALRIA6, "A.IMPORTO_4", "IMPORTO_4", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_LIST, 1608, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_LIST, "IMPORTO 5");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO5, MyGlb.PANEL_FORM, "IMPORTO 5");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO5, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO5, PPQRY_PARBILALRIA6, "A.IMPORTO_5", "IMPORTO_5", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_LIST, 1736, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_LIST, "IMPORTO 6");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_FORM, 128);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO6, MyGlb.PANEL_FORM, "IMPORTO 6");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO6, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO6, PPQRY_PARBILALRIA6, "A.IMPORTO_6", "IMPORTO_6", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_LIST, 1864, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_LIST, 80);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_LIST, "IMPORTO TOT");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_FORM, 80);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTOTOT, MyGlb.PANEL_FORM, "IMP. TOT");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTOTOT, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTOTOT, PPQRY_DUAL, "~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~ + ~~IMPORTO_6~~", "IMPORTOTOT", 3, 28, 6, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_LIST, 1992, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_LIST, 72);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_LIST, "IMPORTO 7");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_FORM, 396, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_FORM, 88);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_IMPORTO7, MyGlb.PANEL_FORM, "IMPORTO 7");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_IMPORTO7, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_IMPORTO7, PPQRY_PARBILALRIA6, "A.IMPORTO_7", "IMPORTO_7", 3, 14, 2, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 52, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_FORM, 4, 304, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_ORDINAMENTO, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldUnbound(PFL_A2RISAMMQUVI_ORDINAMENTO, true);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_ORDINAMENTO, PPQRY_PARBILALRIA6, "B.SEQUENZA", "PABIALRIAMOR", 3, 28, 6, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_LIST, 1016, 240, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_FORM, 568, 252, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_ETICHETOTALE, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1096, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_FORM, 656, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR1, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR1, -1, "", "TOTALEIMPOR1", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1224, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_FORM, 664, 256, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR2, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR2, -1, "", "TOTALEIMPOR2", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1352, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_FORM, 672, 264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR3, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR3, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR3, -1, "", "TOTALEIMPOR3", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1480, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_FORM, 680, 272, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR4, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR4, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR4, -1, "", "TOTALEIMPOR4", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1608, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR5, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR5, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR5, -1, "", "TOTALEIMPOR5", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1736, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_FORM, 696, 288, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR6, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR6, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR6, -1, "", "TOTALEIMPOR6", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1864, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_FORM, 704, 296, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALIMPOTOT, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALIMPOTOT, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALIMPOTOT, -1, "", "TOTALIMPOTOT", 0, 0, 0, -13997);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_LIST, 1992, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_LIST, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_LIST, 1);
    PAN_A2RISAMMQUVI.SetRect(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A2RISAMMQUVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_FORM, 0);
    PAN_A2RISAMMQUVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_A2RISAMMQUVI_TOTALEIMPOR7, MyGlb.PANEL_FORM, 1);
    PAN_A2RISAMMQUVI.SetFieldPage(PFL_A2RISAMMQUVI_TOTALEIMPOR7, -1, -1);
    PAN_A2RISAMMQUVI.SetFieldPanel(PFL_A2RISAMMQUVI_TOTALEIMPOR7, -1, "", "TOTALEIMPOR7", 0, 0, 0, -13997);
  }

  private void PAN_A2RISAMMQUVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_A2RISAMMQUVI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~ + ~~IMPORTO_6~~ as IMPORTOTOT, ");
    SQL.append("  'A' as SCELCAPIENTR, ");
    SQL.append("  'A' as SCELCAPISPES ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_A2RISAMMQUVI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A2RISAMMQUVI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.CODICE = ~~RAGGRUPPAMENTO~~) ");
    SQL.append("and   (A.TIPO = 'VINCAPREV2') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_ATTRIBUTICFA, 0, SQL, PFL_A2RISAMMQUVI_RAGGRUPPAME1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.TIPO = 'VINCAPREV2') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_ATTRIBUTICFA, 1, SQL, PFL_A2RISAMMQUVI_RAGGRUPPAME1, "");
    PAN_A2RISAMMQUVI.SetQueryDB(PPQRY_ATTRIBUTICFA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A2RISAMMQUVI.SetIMDB(IMDB, "PQRY_PARBILALRIA6", true);
    PAN_A2RISAMMQUVI.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
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
    SQL.append("  A.IMPORTO_6 as IMPORTO_6, ");
    SQL.append("  A.IMPORTO_7 as IMPORTO_7, ");
    SQL.append("  B.SEQUENZA as PABIALRIAMOR ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A, ");
    SQL.append("  ATTRIBUTI_CFA B ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE = A.RAGGRUPPAMENTO) ");
    SQL.append("and   (B.TIPO = 'VINCAPREV2') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_DA, 1900) AND NVL(B.ESERCIZIO_A, 2999))) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A2RISAMMPREV') ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 20, 10, 11, 12, 6, 7, 8 ");
    PAN_A2RISAMMQUVI.SetQuery(PPQRY_PARBILALRIA6, 5, SQL, -1, "");
    PAN_A2RISAMMQUVI.SetQueryDB(PPQRY_PARBILALRIA6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A2RISAMMQUVI.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_ORDINAMENTO, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_CAPITOENTRAT, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_ARTICOENTRAT, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_DESCCAPIENTR, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_CAPITOLSPESA, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_ARTICOLSPESA, true);
    PAN_A2RISAMMQUVI.AddToSortList(PFL_A2RISAMMQUVI_DESCCAPISPES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_A2RISAMMQUVI.Status() == 2)
    {
      int oldListQBE = PAN_A2RISAMMQUVI.iUseListQBE;
      PAN_A2RISAMMQUVI.iUseListQBE = 0;
      PAN_A2RISAMMQUVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_A2RISAMMQUVI.PanelCommand(Glb.PCM_FIND);
      PAN_A2RISAMMQUVI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TOTAQUOTACCA_Init()
  {

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "CB14B312-5E98-45FC-B8E4-1F1DB0A141F0");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "PROGRESSIVO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "B127FE2D-C061-48E5-8B1E-54C1697B5559");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "ESERCIZIO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "0F1CC473-F8D4-4FB2-BEA1-F49AA2ED0804");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "9C6655CC-7641-43BB-BFA4-970FB6BDE84A");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "B1CEA6C7-6D97-492E-8ECD-7B7F2067E13B");
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
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_PROGRESSIVO, PPQRY_PARBILALRIA7, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_ESERCIZIO, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_ESERCIZIO, PPQRY_PARBILALRIA7, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 196, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, PPQRY_PARBILALRIA7, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 400, 36, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_TIPOSTAMPA, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_TIPOSTAMPA, PPQRY_PARBILALRIA7, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 400, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_IMPORTO1, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_IMPORTO1, PPQRY_PARBILALRIA7, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
  }

  private void PAN_TOTAQUOTACCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTAQUOTACCA.SetIMDB(IMDB, "PQRY_PARBILALRIA7", true);
    PAN_TOTAQUOTACCA.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1 ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A2RISAMMPREVI') ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGGRUPPAMENTO ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIA7, 5, SQL, -1, "");
    PAN_TOTAQUOTACCA.SetQueryDB(PPQRY_PARBILALRIA7, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_DynamicProperties();
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_AfterFind(CmdFind);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_A2RISAMMQUVI) PAN_A2RISAMMQUVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
