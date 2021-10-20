// **********************************************
// Percentuali Calcolo Stanziamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PercentualiCalcoloStanziamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TABBEDVIEW;
  private static int GRP_ENTRATE_CAPITOLOART1 = 0;

  private static int PFL_ENTRATE_LIVELLO6 = 0;
  private static int PFL_ENTRATE_LIVELLO7 = 1;
  private static int PFL_ENTRATE_LIVELLO8 = 2;
  private static int PFL_ENTRATE_LIVELLO9 = 3;
  private static int PFL_ENTRATE_LIVELLO10 = 4;
  private static int PFL_ENTRATE_CAPITOLO1 = 5;
  private static int PFL_ENTRATE_ARTICOLO1 = 6;
  private static int PFL_ENTRATE_APRIVOCEPEG = 7;
  private static int PFL_ENTRATE_PERCENTUCOM1 = 8;
  private static int PFL_ENTRATE_PERCENTCASS1 = 9;
  private static int PFL_ENTRATE_DESCRICAPIT1 = 10;
  private static int PFL_ENTRATE_DESCRIARTIC1 = 11;
  private static int PFL_ENTRATE_PROGRESSIVO1 = 12;
  private static int PFL_ENTRATE_ESERCIZIO1 = 13;
  private static int PFL_ENTRATE_ES1 = 14;
  private static int PFL_ENTRATE_UTENTEINSER1 = 15;
  private static int PFL_ENTRATE_DATAINSERIM1 = 16;
  private static int PFL_ENTRATE_UTENTULTIAG1 = 17;
  private static int PFL_ENTRATE_DATAULTIMAG1 = 18;

  private static int PPQRY_BILPERCALST1 = 0;

  private static int PPQRY_APRICAPITOLO = 1;
  private static int PPQRY_DESCRICAPIT1 = 2;
  private static int PPQRY_DESCRIARTIC1 = 3;


  IDPanel PAN_ENTRATE;
  private static int GRP_SPESE_CAPITOLOART = 0;

  private static int PFL_SPESE_LIVELLO1 = 0;
  private static int PFL_SPESE_LIVELLO2 = 1;
  private static int PFL_SPESE_LIVELLO3 = 2;
  private static int PFL_SPESE_LIVELLO4 = 3;
  private static int PFL_SPESE_LIVELLO5 = 4;
  private static int PFL_SPESE_CAPITOLO = 5;
  private static int PFL_SPESE_ARTICOLO = 6;
  private static int PFL_SPESE_APRIVOCPEGIC = 7;
  private static int PFL_SPESE_PERCENTUCOMP = 8;
  private static int PFL_SPESE_PERCENTCASSA = 9;
  private static int PFL_SPESE_DESCRICAPITO = 10;
  private static int PFL_SPESE_DESCRIARTICO = 11;
  private static int PFL_SPESE_PROGRESSIVO = 12;
  private static int PFL_SPESE_ESERCIZIO = 13;
  private static int PFL_SPESE_ES = 14;
  private static int PFL_SPESE_UTENTEINSERI = 15;
  private static int PFL_SPESE_DATAINSERIME = 16;
  private static int PFL_SPESE_UTENTULTIAGG = 17;
  private static int PFL_SPESE_DATAULTIMAGG = 18;

  private static int PPQRY_BILPERCALSTN = 0;

  private static int PPQRY_APRIVOCEPEG2 = 1;
  private static int PPQRY_DESCRICAPITO = 2;
  private static int PPQRY_DESCRIARTICO = 3;


  IDPanel PAN_SPESE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_BILPERCALST1(IMDB);
    Init_PQRY_BILPERCALSTN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_BILPERCALST1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPERCALST1, 16);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPERCALST1, "PQRY_BILPERCALST1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_1, "LIVELLO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_1,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_2, "LIVELLO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_2,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_3, "LIVELLO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_3,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_4, "LIVELLO_4");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_4,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_5, "LIVELLO_5");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_LIVELLO_5,1,3,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PERCENTUALE_COMP, "PERCENTUALE_COMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PERCENTUALE_COMP,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PERCENTUALE_CASSA, "PERCENTUALE_CASSA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALST1,IMDBDef11.PQSL_BILPERCALST1_PERCENTUALE_CASSA,3,5,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPERCALST1, 0);
  }

  private static void Init_PQRY_BILPERCALSTN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPERCALSTN, 16);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPERCALSTN, "PQRY_BILPERCALSTN");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_1, "LIVELLO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_1,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_2, "LIVELLO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_2,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_3, "LIVELLO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_3,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_4, "LIVELLO_4");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_4,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_5, "LIVELLO_5");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_5,1,3,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PERCENTUALE_COMP, "PERCENTUALE_COMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PERCENTUALE_COMP,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PERCENTUALE_CASSA, "PERCENTUALE_CASSA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_PERCENTUALE_CASSA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPERCALSTN,IMDBDef11.PQSL_BILPERCALSTN_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPERCALSTN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PercentualiCalcoloStanziamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public PercentualiCalcoloStanziamenti()
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
    FormIdx = MyGlb.FRM_PERCCALCSTAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E7FDB91F-8C8C-43CF-90DB-E20A5C80CFB8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 624;
    DesignHeight = 490;
    set_Caption(new IDVariant("Percentuali Calcolo Stanziamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 624;
    Frames[1].Height = 464;
    Frames[1].Caption = "Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 464;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[1].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "B19BAEA5-42E1-4A9A-95F3-005DEE8D29FF";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Entrate";
    Frames[2].Parent = this;
    PAN_ENTRATE = new IDPanel(w, this, 2, "PAN_ENTRATE");
    Frames[2].Content = PAN_ENTRATE;
    PAN_ENTRATE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ENTRATE.VS = MainFrm.VisualStyleList;
    PAN_ENTRATE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6FA09459-C279-48AE-93CE-920EC39D76CA");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 524, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ENTRATE.InitStatus = 2;
    PAN_ENTRATE_Init();
    PAN_ENTRATE_InitFields();
    PAN_ENTRATE_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[2], 0, "", "Entrate", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Spese";
    Frames[3].Parent = this;
    PAN_SPESE = new IDPanel(w, this, 3, "PAN_SPESE");
    Frames[3].Content = PAN_SPESE;
    PAN_SPESE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SPESE.VS = MainFrm.VisualStyleList;
    PAN_SPESE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "02A82672-D0A2-43CD-83FC-ADA18A2D9C2D");
    PAN_SPESE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 524, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SPESE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SPESE.InitStatus = 2;
    PAN_SPESE_Init();
    PAN_SPESE_InitFields();
    PAN_SPESE_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[3], 0, "", "Spese", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZAGGIENTR+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGIENT1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGGIENTR+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPPERSUALE1+BaseCmdLinIdx)
      {
        DuplicaPercentualiSuAltroEsercizioEntrata();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGGISPES+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGISPE1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGGISPES+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPPERSUALES+BaseCmdLinIdx)
      {
        DuplicaPercentualiSuAltroEsercizioSpesa();
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
      PAN_ENTRATE.UpdatePanel(MainFrm);
      PAN_SPESE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_ENTRATE.FrIndex)
    {
      if (IdxFieldActived ==PFL_ENTRATE_APRIVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_SPESE.FrIndex)
    {
      if (IdxFieldActived ==PFL_SPESE_APRIVOCPEGIC) {
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
    return (obj instanceof PercentualiCalcoloStanziamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PercentualiCalcoloStanziamenti.class.getName() : (Glb.ClassWithPackage(PercentualiCalcoloStanziamenti.class) ? PercentualiCalcoloStanziamenti.class.getName().substring(PercentualiCalcoloStanziamenti.class.getPackage().getName().length() + 1) : PercentualiCalcoloStanziamenti.class.getName()));
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
    IDVariant v_PERCENRIVALU = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PERCENRIVALU = (new IDVariant("Percentuali di Rivalutazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_ENTRATE.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ENTRATE.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_SPESE.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SPESE.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_ENTRATE.FrIndex)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_SPESE.FrIndex)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Entrate On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_ENTRATE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ENTRATE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Entrate On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "EntrateOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Entrate On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ENTRATE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ENTRATE);
      // 
      // Entrate On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_ENTRATE.IsNewRow())
      {
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (ClassifConPerc(IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_E_S, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_ARTICOLO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_LIVELLO_1, 0), ((IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_LIVELLO_2, 0).equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_LIVELLO_1, 0)), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_LIVELLO_2, 0)), (new IDVariant(2)), (new IDVariant("0")), true)))))
      {
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ENTRATE.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "EntrateOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Entrate On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ENTRATE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrate On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_E_S, 0, (new IDVariant("E")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALST1, IMDBDef11.PQSL_BILPERCALST1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "EntrateOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Entrate After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_ENTRATE_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrate After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_ENTRATE.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "EntrateAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Spese On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SPESE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spese On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_E_S, 0, (new IDVariant("S")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "SpeseOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Spese On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_SPESE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SPESE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Spese On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "SpeseOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Spese On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SPESE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SPESE);
      // 
      // Spese On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_SPESE.IsNewRow())
      {
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (ClassifConPerc(IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_E_S, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_ARTICOLO, 0), IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_1, 0), ((IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_2, 0).equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_1, 0)), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_BILPERCALSTN, IMDBDef11.PQSL_BILPERCALSTN_LIVELLO_2, 0)), (new IDVariant(2)), (new IDVariant("0")), true)))))
      {
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SPESE.SetFlags (Glb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "SpeseOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Spese After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_SPESE_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spese After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_SPESE.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "SpeseAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Capitolo Entrata
  // **********************************************************************
  public int ApriCapitoloEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Capitolo Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "ApriCapitoloEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Capitolo Spesa
  // **********************************************************************
  public int ApriCapitoloSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Capitolo Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "ApriCapitoloSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Duplica Percentuali Su Altro Esercizio Entrata
  // **********************************************************************
  public int DuplicaPercentualiSuAltroEsercizioEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Percentuali Su Altro Esercizio Entrata Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM133, IMDBDef3.FLD_PARAM133_PARATIPODUPL, 0, (new IDVariant("PCS")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM133, IMDBDef3.FLD_PARAM133_PARAMPARTE, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_DUPLSUALTESE, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "DuplicaPercentualiSuAltroEsercizioEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Duplica Percentuali Su Altro Esercizio Spesa
  // **********************************************************************
  public int DuplicaPercentualiSuAltroEsercizioSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Percentuali Su Altro Esercizio Spesa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM133, IMDBDef3.FLD_PARAM133_PARATIPODUPL, 0, (new IDVariant("PCS")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM133, IMDBDef3.FLD_PARAM133_PARAMPARTE, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_DUPLSUALTESE, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "DuplicaPercentualiSuAltroEsercizioSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Classif Con Perc
  // Esercizio:  - Input
  // E S:  - Input
  // Capitolo:  - Input
  // Articolo:  - Input
  // Liv 1:  - Input
  // Liv 2:  - Input
  // **********************************************************************
  public boolean ClassifConPerc (IDVariant Esercizio, IDVariant ES, IDVariant Capitolo, IDVariant Articolo, IDVariant Liv1, IDVariant Liv2)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classif Con Perc Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BIL_TIPI_CALC_CASSA_CLASSIF A, ");
      SQL.append("  BIL_TIPI_CALC_CASSA B ");
      SQL.append("where (B.TIPO = A.TIPO_CALCOLO) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TITOLO = DECODE(" + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(Liv1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC(TO_NUMBER(A_GET_COD_RICL_CAP(" + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",1,'SI','MACRO'))))) ");
      SQL.append("and   (TO_CHAR ( A.TIPOLOGIA_MACROAGG ) = DECODE(" + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(Liv2, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A_GET_COD_RICL_CAP(" + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",2,'SI','MACRO'))) ");
      SQL.append("and   (B.SE_PERCENTUALE = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        if (!(IDL.IsNull(Capitolo)) || IDL.IsNull(Liv2))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BIL_TIPI_CALC_CASSA_CLASSIF A, ");
          SQL.append("  BIL_TIPI_CALC_CASSA B ");
          SQL.append("where (B.TIPO = A.TIPO_CALCOLO) ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TITOLO = DECODE(" + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(Liv1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC(TO_NUMBER(A_GET_COD_RICL_CAP(" + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",1,'SI','MACRO'))))) ");
          SQL.append("and   (B.SE_PERCENTUALE = 'SI') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
      }
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PercentualiCalcoloStanziamenti", "ClassifConPerc", _e);
      return false;
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
  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ENTRATE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ENTRATE, Cancel);
    // Stub
  }

  private void PAN_ENTRATE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ENTRATE_APRIVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_ENTRATE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCapitoloEntrata();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ENTRATE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ENTRATE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ENTRATE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ENTRATE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SPESE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SPESE, Cancel);
    // Stub
  }

  private void PAN_SPESE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SPESE_APRIVOCPEGIC)
    {
      this.IdxPanelActived = this.PAN_SPESE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCapitoloSpesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SPESE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SPESE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SPESE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SPESE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ENTRATE_Init()
  {

    PAN_ENTRATE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ENTRATE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, "29658AF8-D053-490D-9058-E06C1598389D");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, "Capitolo/Art.");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, MyGlb.VIS_GROUPSTYLE);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, MyGlb.PANEL_LIST, -4, 263, 528, 73, 0, 0);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, MyGlb.PANEL_FORM, 0, 615, 476, 97, 0, 0);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, 0, 73);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, 1, 13);
    PAN_ENTRATE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, 0, 4);
    PAN_ENTRATE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, 1, 4);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATE_CAPITOLOART1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATE.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, "E54FA134-DDE4-4843-B7C7-1BA2F9B89F02");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, "Liv. 1");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, "33BE17A2-7C30-4EBD-898C-4CAE7D8E7CD1");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, "Liv. 2");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, "8AA022D5-E863-4D24-8EA4-C48974042BD1");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, "Liv. 3");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, "3BBF9099-582C-480C-8BFA-D8E11D8FDDB0");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, "Liv. 4");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, "F857FF73-58B3-4EE0-A010-87EB9F33EE9F");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, "Liv. 5");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, "9A3E80FD-D571-4BC7-8123-26D67C37153D");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, "Capitolo");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, "2B4C0E47-AC5E-41F8-900B-AE0FA6D0DE7C");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, "Art.");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, "0E634BEC-A853-40B5-A91C-3928772115BE");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, " ");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, "380484D9-BEA9-4778-B46A-8A4710F7E499");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, "% Comp. Pura");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.VIS_PERPRNOFICF4);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, "213E4523-F514-411B-9D63-4BCBF33FC92C");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, "% Cassa");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.VIS_PERPRNOFICF4);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, "33FA3192-9FD6-43AA-BF5B-4AE9A2CA0BE5");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, "Capitolo");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, "901F19CD-A142-48EB-882C-2694EEFEB971");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, "Articolo");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, "9A0DF19C-2188-470E-AE18-BFD7237315D0");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, "PROGRESSIVO");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, "621EFCBA-F5B9-4B81-BD91-8106E35D3511");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, "ESERCIZIO");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, 0, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, "13F33B82-12D4-4432-9BB7-3314C356C700");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, "E S");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.VIS_NONNULLAFIEL);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, 0, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, "F54C3BB6-E479-4C83-AC76-9EC4B68EA696");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, "5725731C-6639-425B-B5FE-650744794E74");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, "36410D71-9678-471B-A376-55618D0E21A3");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, "731D28BD-C9B7-4193-95ED-8D92E3243585");
    PAN_ENTRATE.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_ENTRATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, "");
    PAN_ENTRATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATE.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ENTRATE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_LIST, "Liv. 1");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_FORM, 4, 472, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO6, MyGlb.PANEL_FORM, "Liv. 1");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_LIVELLO6, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_LIVELLO6, PPQRY_BILPERCALST1, "A.LIVELLO_1", "LIVELLO_1", 1, 2, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_LIST, 44, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_LIST, "Liv. 2");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_FORM, 4, 496, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO7, MyGlb.PANEL_FORM, "Liv. 2");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_LIVELLO7, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_LIVELLO7, PPQRY_BILPERCALST1, "A.LIVELLO_2", "LIVELLO_2", 1, 2, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_LIST, 88, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_LIST, "Liv. 3");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_FORM, 4, 520, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO8, MyGlb.PANEL_FORM, "Liv. 3");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_LIVELLO8, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_LIVELLO8, PPQRY_BILPERCALST1, "A.LIVELLO_3", "LIVELLO_3", 1, 2, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_LIST, 132, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_LIST, "Liv. 4");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_FORM, 4, 544, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO9, MyGlb.PANEL_FORM, "Liv. 4");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_LIVELLO9, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_LIVELLO9, PPQRY_BILPERCALST1, "A.LIVELLO_4", "LIVELLO_4", 1, 2, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_LIST, 176, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_LIST, "Liv. 5");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_FORM, 4, 568, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_LIVELLO10, MyGlb.PANEL_FORM, "Liv. 5");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_LIVELLO10, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_LIVELLO10, PPQRY_BILPERCALST1, "A.LIVELLO_5", "LIVELLO_5", 1, 3, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_LIST, 220, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_FORM, 4, 208, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_CAPITOLO1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_CAPITOLO1, PPQRY_BILPERCALST1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_LIST, 340, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_FORM, 4, 232, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_FORM, 60);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_ARTICOLO1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_ARTICOLO1, PPQRY_BILPERCALST1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_LIST, 372, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_LIST, 140);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_FORM, 4, 424, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_FORM, 140);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_APRIVOCEPEG, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_APRIVOCEPEG, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_APRIVOCEPEG, PPQRY_APRICAPITOLO, "'A'", "ROWNAMAPRCAP", 5, 1, 0, -13997);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_APRIVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_LIST, 396, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_LIST, 120);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_LIST, "% Comp. Pura");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_FORM, 4, 592, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_FORM, 120);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTUCOM1, MyGlb.PANEL_FORM, "% Comp. Pura");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_PERCENTUCOM1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_PERCENTUCOM1, PPQRY_BILPERCALST1, "A.PERCENTUALE_COMP", "PERCENTUALE_COMP", 3, 5, 2, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_LIST, 460, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_LIST, 124);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_LIST, "% Cassa");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_FORM, 4, 616, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_FORM, 124);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PERCENTCASS1, MyGlb.PANEL_FORM, "% Cassa");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_PERCENTCASS1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_PERCENTCASS1, PPQRY_BILPERCALST1, "A.PERCENTUALE_CASSA", "PERCENTUALE_CASSA", 3, 5, 2, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_LIST, 0, 288, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_LIST, 104);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_FORM, 4, 640, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRICAPIT1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_DESCRICAPIT1, -1, GRP_ENTRATE_CAPITOLOART1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_DESCRICAPIT1, PPQRY_DESCRICAPIT1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_LIST, 0, 312, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_LIST, 104);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_LIST, "Articolo");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_FORM, 4, 676, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DESCRIARTIC1, MyGlb.PANEL_FORM, "Articolo");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_DESCRIARTIC1, -1, GRP_ENTRATE_CAPITOLOART1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_DESCRIARTIC1, PPQRY_DESCRIARTIC1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_LIST, 456, 332, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_LIST, 20);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_LIST, "P.");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 280, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_FORM, 80);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGR.");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_PROGRESSIVO1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_PROGRESSIVO1, PPQRY_BILPERCALST1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_LIST, 470, 360, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_LIST, 20);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_LIST, "E.");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_ESERCIZIO1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_ESERCIZIO1, PPQRY_BILPERCALST1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_LIST, 160, 360, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_LIST, 24);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_FORM, 4, 400, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_FORM, 24);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_ES1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_ES1, PPQRY_BILPERCALST1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_ES1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ENTRATE.SetValueListItem(PFL_ENTRATE_ES1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_LIST, 16, 336, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_LIST, 132);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_UTENTEINSER1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_UTENTEINSER1, PPQRY_BILPERCALST1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_LIST, 270, 332, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_DATAINSERIM1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_DATAINSERIM1, PPQRY_BILPERCALST1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_LIST, 36, 360, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_UTENTULTIAG1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_UTENTULTIAG1, PPQRY_BILPERCALST1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_LIST, 274, 360, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_LIST, 104);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_ENTRATE.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_ENTRATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATE_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ENTRATE.SetFieldPage(PFL_ENTRATE_DATAULTIMAG1, -1, -1);
    PAN_ENTRATE.SetFieldPanel(PFL_ENTRATE_DATAULTIMAG1, PPQRY_BILPERCALST1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_ENTRATE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ENTRATE.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as ROWNAMAPRCAP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_ENTRATE.SetQuery(PPQRY_APRICAPITOLO, 0, SQL, -1, "");
    PAN_ENTRATE.SetQueryDB(PPQRY_APRICAPITOLO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATE.SetMasterTable(PPQRY_APRICAPITOLO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = 0) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_ENTRATE.SetQuery(PPQRY_DESCRICAPIT1, 0, SQL, -1, "");
    PAN_ENTRATE.SetQueryDB(PPQRY_DESCRICAPIT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATE.SetMasterTable(PPQRY_DESCRICAPIT1, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_ENTRATE.SetQuery(PPQRY_DESCRIARTIC1, 0, SQL, -1, "");
    PAN_ENTRATE.SetQueryDB(PPQRY_DESCRIARTIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATE.SetMasterTable(PPQRY_DESCRIARTIC1, "CAP");
    PAN_ENTRATE.SetIMDB(IMDB, "PQRY_BILPERCALST1", true);
    PAN_ENTRATE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO_1 as LIVELLO_1, ");
    SQL.append("  A.LIVELLO_2 as LIVELLO_2, ");
    SQL.append("  A.LIVELLO_3 as LIVELLO_3, ");
    SQL.append("  A.LIVELLO_4 as LIVELLO_4, ");
    SQL.append("  A.LIVELLO_5 as LIVELLO_5, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PERCENTUALE_COMP as PERCENTUALE_COMP, ");
    SQL.append("  A.PERCENTUALE_CASSA as PERCENTUALE_CASSA ");
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PERCENTUALI_CALC_STN A ");
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATE.SetQuery(PPQRY_BILPERCALST1, 5, SQL, -1, "");
    PAN_ENTRATE.SetQueryDB(PPQRY_BILPERCALST1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATE.SetMasterTable(0, "BIL_PERCENTUALI_CALC_STN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ENTRATE.Status() == 2)
    {
      int oldListQBE = PAN_ENTRATE.iUseListQBE;
      PAN_ENTRATE.iUseListQBE = 0;
      PAN_ENTRATE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ENTRATE.PanelCommand(Glb.PCM_FIND);
      PAN_ENTRATE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SPESE_Init()
  {

    PAN_SPESE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SPESE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, "3458C08E-D925-43B3-96C2-D63DA239F441");
    PAN_SPESE.set_Header(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, "Capitolo/Art.");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_SPESE.SetRect(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, MyGlb.PANEL_LIST, -4, 263, 528, 73, 0, 0);
    PAN_SPESE.SetRect(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, MyGlb.PANEL_FORM, 0, 591, 476, 97, 0, 0);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, 0, 73);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, 1, 13);
    PAN_SPESE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, 0, 4);
    PAN_SPESE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, 1, 4);
    PAN_SPESE.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESE_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESE.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, "C748611E-82BD-46EB-8BAC-A0AE08864466");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, "Liv. 1");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, "05059F8F-357F-4CAF-BE02-9EB30C6E269F");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, "Liv. 2");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, "7AA10533-8E50-4DD7-8810-60503E6A5126");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, "Liv. 3");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, "2F6B6AC5-F90B-48E3-BFCB-B16858428734");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, "Liv. 4");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, "60939B4B-13C5-40F9-8E20-DF23B7F0E6D1");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, "Liv. 5");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, "93E255FD-04AC-4A59-AF02-3CB7B6BC1112");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, "Capitolo");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, "675873D5-935E-4608-B3BF-F58EDA5D39E2");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, "Art.");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, "3FB8903F-5434-40AB-8EC0-A72ECE657724");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, " ");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.VIS_HYPELINKIMMA);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, "D17A2DFE-C186-465C-83DA-A29E79C22433");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, "% Comp. Pura");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.VIS_PERPRNOFICF4);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, "63A61FE4-C4C3-4260-873F-4FAF7135D4C7");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, "% Cassa");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.VIS_PERPRNOFICF4);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, "A87BAC30-02D7-43B5-80FC-E0E2EF7A7E64");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, "Capitolo");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, "AF5B818E-5AA9-40FF-A368-E9A0B2609A7E");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, "Articolo");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, "88AFE032-7C79-41D4-857D-652162F38663");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, "PROGRESSIVO");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, "E422FCBA-A5AE-4176-B840-549A585AC4BA");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, "ESERCIZIO");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, 0, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_ES, "812F9B31-65FF-467D-A059-BF36898D7C7D");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_ES, "E S");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_ES, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_ES, 0, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, "66AC1C0A-614C-4DCA-86D7-29DBF525BA83");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, "A777AADD-885A-44BC-83BA-BCDEA33B8999");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, "DATA INSERIMENTO");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, "F5146F39-F145-4725-BD82-23E0AF58AE78");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, "07BDBFFE-824C-4057-8011-BA5162D2A3C8");
    PAN_SPESE.set_Header(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_SPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, "");
    PAN_SPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SPESE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_LIST, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_LIST, "Liv. 1");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_FORM, 4, 448, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO1, MyGlb.PANEL_FORM, "Liv. 1");
    PAN_SPESE.SetFieldPage(PFL_SPESE_LIVELLO1, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_LIVELLO1, PPQRY_BILPERCALSTN, "A.LIVELLO_1", "LIVELLO_1", 1, 2, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_LIST, 44, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_LIST, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_LIST, "Liv. 2");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_FORM, 4, 472, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO2, MyGlb.PANEL_FORM, "Liv. 2");
    PAN_SPESE.SetFieldPage(PFL_SPESE_LIVELLO2, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_LIVELLO2, PPQRY_BILPERCALSTN, "A.LIVELLO_2", "LIVELLO_2", 1, 2, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_LIST, 88, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_LIST, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_LIST, "Liv. 3");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_FORM, 4, 496, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO3, MyGlb.PANEL_FORM, "Liv. 3");
    PAN_SPESE.SetFieldPage(PFL_SPESE_LIVELLO3, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_LIVELLO3, PPQRY_BILPERCALSTN, "A.LIVELLO_3", "LIVELLO_3", 1, 2, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_LIST, 132, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_LIST, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_LIST, "Liv. 4");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_FORM, 4, 520, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO4, MyGlb.PANEL_FORM, "Liv. 4");
    PAN_SPESE.SetFieldPage(PFL_SPESE_LIVELLO4, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_LIVELLO4, PPQRY_BILPERCALSTN, "A.LIVELLO_4", "LIVELLO_4", 1, 2, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_LIST, 176, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_LIST, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_LIST, "Liv. 5");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_FORM, 4, 544, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_LIVELLO5, MyGlb.PANEL_FORM, "Liv. 5");
    PAN_SPESE.SetFieldPage(PFL_SPESE_LIVELLO5, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_LIVELLO5, PPQRY_BILPERCALSTN, "A.LIVELLO_5", "LIVELLO_5", 1, 3, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_LIST, 220, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_FORM, 4, 208, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SPESE.SetFieldPage(PFL_SPESE_CAPITOLO, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_CAPITOLO, PPQRY_BILPERCALSTN, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_LIST, 340, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_FORM, 4, 232, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_SPESE.SetFieldPage(PFL_SPESE_ARTICOLO, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_ARTICOLO, PPQRY_BILPERCALSTN, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_LIST, 372, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_LIST, 140);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_LIST, " ");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_FORM, 4, 400, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_FORM, 140);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_FORM, 2);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_APRIVOCPEGIC, MyGlb.PANEL_FORM, " ");
    PAN_SPESE.SetFieldPage(PFL_SPESE_APRIVOCPEGIC, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_APRIVOCPEGIC, PPQRY_APRIVOCEPEG2, "'A'", "ROWNAMAPRCAP", 5, 1, 0, -13997);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_APRIVOCPEGIC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_LIST, 396, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_LIST, 120);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_LIST, "% Comp. Pura");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_FORM, 4, 568, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_FORM, 120);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTUCOMP, MyGlb.PANEL_FORM, "% Comp. Pura");
    PAN_SPESE.SetFieldPage(PFL_SPESE_PERCENTUCOMP, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_PERCENTUCOMP, PPQRY_BILPERCALSTN, "A.PERCENTUALE_COMP", "PERCENTUALE_COMP", 3, 5, 2, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_LIST, 460, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_LIST, 124);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_LIST, "% Cassa");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_FORM, 4, 592, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_FORM, 124);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PERCENTCASSA, MyGlb.PANEL_FORM, "% Cassa");
    PAN_SPESE.SetFieldPage(PFL_SPESE_PERCENTCASSA, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_PERCENTCASSA, PPQRY_BILPERCALSTN, "A.PERCENTUALE_CASSA", "PERCENTUALE_CASSA", 3, 5, 2, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_LIST, 0, 288, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_LIST, 104);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_FORM, 4, 616, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_FORM, 108);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_FORM, 2);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRICAPITO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SPESE.SetFieldPage(PFL_SPESE_DESCRICAPITO, -1, GRP_SPESE_CAPITOLOART);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_DESCRICAPITO, PPQRY_DESCRICAPITO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_LIST, 0, 312, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_LIST, 104);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_LIST, "Articolo");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_FORM, 4, 652, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_FORM, 108);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_FORM, 2);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DESCRIARTICO, MyGlb.PANEL_FORM, "Articolo");
    PAN_SPESE.SetFieldPage(PFL_SPESE_DESCRIARTICO, -1, GRP_SPESE_CAPITOLOART);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_DESCRIARTICO, PPQRY_DESCRIARTICO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 456, 332, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 20);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_LIST, "P.");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 280, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_SPESE.SetFieldPage(PFL_SPESE_PROGRESSIVO, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_PROGRESSIVO, PPQRY_BILPERCALSTN, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_LIST, 470, 360, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_LIST, 20);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_LIST, "E.");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_SPESE.SetFieldPage(PFL_SPESE_ESERCIZIO, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_ESERCIZIO, PPQRY_BILPERCALSTN, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_LIST, 160, 360, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_LIST, 24);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_LIST, "E S");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_FORM, 4, 400, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_FORM, 24);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_ES, MyGlb.PANEL_FORM, "E S");
    PAN_SPESE.SetFieldPage(PFL_SPESE_ES, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_ES, PPQRY_BILPERCALSTN, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_SPESE.SetValueListItem(PFL_SPESE_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_SPESE.SetValueListItem(PFL_SPESE_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_LIST, 16, 336, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_LIST, 132);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_SPESE.SetFieldPage(PFL_SPESE_UTENTEINSERI, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_UTENTEINSERI, PPQRY_BILPERCALSTN, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_LIST, 270, 332, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_SPESE.SetFieldPage(PFL_SPESE_DATAINSERIME, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_DATAINSERIME, PPQRY_BILPERCALSTN, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_LIST, 36, 360, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_SPESE.SetFieldPage(PFL_SPESE_UTENTULTIAGG, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_UTENTULTIAGG, PPQRY_BILPERCALSTN, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_LIST, 274, 360, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_LIST, 104);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_SPESE.SetRect(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_SPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_SPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESE_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_SPESE.SetFieldPage(PFL_SPESE_DATAULTIMAGG, -1, -1);
    PAN_SPESE.SetFieldPanel(PFL_SPESE_DATAULTIMAGG, PPQRY_BILPERCALSTN, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_SPESE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SPESE.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as ROWNAMAPRCAP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_SPESE.SetQuery(PPQRY_APRIVOCEPEG2, 0, SQL, -1, "");
    PAN_SPESE.SetQueryDB(PPQRY_APRIVOCEPEG2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESE.SetMasterTable(PPQRY_APRIVOCEPEG2, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = 0) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_SPESE.SetQuery(PPQRY_DESCRICAPITO, 0, SQL, -1, "");
    PAN_SPESE.SetQueryDB(PPQRY_DESCRICAPITO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESE.SetMasterTable(PPQRY_DESCRICAPITO, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_SPESE.SetQuery(PPQRY_DESCRIARTICO, 0, SQL, -1, "");
    PAN_SPESE.SetQueryDB(PPQRY_DESCRIARTICO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESE.SetMasterTable(PPQRY_DESCRIARTICO, "CAP");
    PAN_SPESE.SetIMDB(IMDB, "PQRY_BILPERCALSTN", true);
    PAN_SPESE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO_1 as LIVELLO_1, ");
    SQL.append("  A.LIVELLO_2 as LIVELLO_2, ");
    SQL.append("  A.LIVELLO_3 as LIVELLO_3, ");
    SQL.append("  A.LIVELLO_4 as LIVELLO_4, ");
    SQL.append("  A.LIVELLO_5 as LIVELLO_5, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.PERCENTUALE_COMP as PERCENTUALE_COMP, ");
    SQL.append("  A.PERCENTUALE_CASSA as PERCENTUALE_CASSA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PERCENTUALI_CALC_STN A ");
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESE.SetQuery(PPQRY_BILPERCALSTN, 5, SQL, -1, "");
    PAN_SPESE.SetQueryDB(PPQRY_BILPERCALSTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESE.SetMasterTable(0, "BIL_PERCENTUALI_CALC_STN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SPESE.Status() == 2)
    {
      int oldListQBE = PAN_SPESE.iUseListQBE;
      PAN_SPESE.iUseListQBE = 0;
      PAN_SPESE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SPESE.PanelCommand(Glb.PCM_FIND);
      PAN_SPESE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SPESE) PAN_SPESE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_ValidateRow(Cancel);
    if (SrcObj == PAN_SPESE) PAN_SPESE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_DynamicProperties();
    if (SrcObj == PAN_SPESE) PAN_SPESE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SPESE) PAN_SPESE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_SPESE) PAN_SPESE_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ENTRATE) PAN_ENTRATE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SPESE) PAN_SPESE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
