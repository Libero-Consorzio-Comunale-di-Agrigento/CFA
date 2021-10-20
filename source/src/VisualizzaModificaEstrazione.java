// **********************************************
// Visualizza Modifica Estrazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzaModificaEstrazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_PANNELESTRAZ;
  private static int PFL_VISUMODIESTR_CODICE = 0;
  private static int PFL_VISUMODIESTR_DATAINIZVALI = 1;
  private static int PFL_VISUMODIESTR_DATAFINEVALI = 2;
  private static int PFL_VISUMODIESTR_STATO = 3;
  private static int PFL_VISUMODIESTR_CATEGORIA = 4;
  private static int PFL_VISUMODIESTR_NOMEFILEEXPO = 5;
  private static int PFL_VISUMODIESTR_TITOLO = 6;
  private static int PFL_VISUMODIESTR_DESCRIZIONE1 = 7;
  private static int PFL_VISUMODIESTR_NOTE = 8;
  private static int PFL_VISUMODIESTR_SELECTSQL = 9;
  private static int PFL_VISUMODIESTR_BOTTGENEPARA = 10;
  private static int PFL_VISUMODIESTR_BOTTPROVSELE = 11;
  private static int PFL_VISUMODIESTR_UTENTEINSER1 = 12;
  private static int PFL_VISUMODIESTR_SELECTSOSTIT = 13;
  private static int PFL_VISUMODIESTR_ID1 = 14;
  private static int PFL_VISUMODIESTR_FILEASSOCIAT = 15;
  private static int PFL_VISUMODIESTR_IDHELP = 16;

  private static int PPQRY_CFESTRASELE2 = 0;

  private static int PPQRY_LOOCFESTSER0 = 1;

  private static int PPQRY_CFESTRCATSEL = 2;


  IDPanel PAN_VISUMODIESTR;
  private static int PFL_PARAMEESTRAZ_NOME = 0;
  private static int PFL_PARAMEESTRAZ_DESCRIZIONE = 1;
  private static int PFL_PARAMEESTRAZ_TIPO = 2;
  private static int PFL_PARAMEESTRAZ_VALORE = 3;
  private static int PFL_PARAMEESTRAZ_VALOREDEFAUL = 4;
  private static int PFL_PARAMEESTRAZ_ID = 5;
  private static int PFL_PARAMEESTRAZ_IDSELECT = 6;
  private static int PFL_PARAMEESTRAZ_UTENTEINSERI = 7;

  private static int PPQRY_CFESTRPARSEL = 0;

  private static int PPQRY_CFESTRAPARA1 = 1;


  IDPanel PAN_PARAMEESTRAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI64(IMDB);
    //
    //
    Init_PQRY_CFESTRASELE2(IMDB);
    Init_PQRY_CFESTRPARSEL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI64(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI64, 5);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI64, "TBL_PARAMETRI64");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, "NOMEOGGETPID");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID,3,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, "NOMEOGGEDUPL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL,1,9,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, "NOMOGGSOLVIS");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMOGGCATALB, "NOMOGGCATALB");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMOGGCATALB,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC, "NOMEOGGECANC");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI64,IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI64, 0);
  }

  private static void Init_PQRY_CFESTRASELE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASELE2, 15);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASELE2, "PQRY_CFESTRASELE2");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_TITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_CATEGORIA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, "SELECT_SQL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_NOTE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, "DATA_INIZIO_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DATA_FINE_VALIDITA, "DATA_FINE_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_DATA_FINE_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_NOME_FILE_EXPORT, "NOME_FILE_EXPORT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_NOME_FILE_EXPORT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_ID_HELP, "ID_HELP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_ID_HELP,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_CODICE,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_SELECTSOSTIT, "SELECTSOSTIT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_SELECTSOSTIT,9,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_FILE_ASSOCIATO, "FILE_ASSOCIATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE2,IMDBDef17.PQSL_CFESTRASELE2_FILE_ASSOCIATO,10,9999,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASELE2, 0);
  }

  private static void Init_PQRY_CFESTRPARSEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRPARSEL, 13);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRPARSEL, "PQRY_CFESTRPARSEL");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_ID_SELECT,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_NOME, "NOME");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_NOME,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_VALORE_DEFAULT, "VALORE_DEFAULT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_VALORE_DEFAULT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_VALORE,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSEL,IMDBDef17.PQSL_CFESTRPARSEL_SEQUENZA,2,15,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRPARSEL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzaModificaEstrazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzaModificaEstrazione()
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
    FormIdx = MyGlb.FRM_VISUMODIESTR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0DCBE71C-85C3-4258-8799-3F5E44F398CB";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1000;
    DesignHeight = 1074;
    set_Caption(new IDVariant("Visualizza Modifica Estrazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1000;
    Frames[1].Height = 1048;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pannello Estrazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 1048;
    TAB_PANNELESTRAZ = new OTabView(this);
    Frames[1].Content = TAB_PANNELESTRAZ;
    TAB_PANNELESTRAZ.iGuid = "29B2CE2C-4B9C-4BA3-8650-287DB8A1E93C";
    TAB_PANNELESTRAZ.SetItemCount(2);
    TAB_PANNELESTRAZ.Placement = 1;
    TAB_PANNELESTRAZ.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Visualizza Modifica Estrazione";
    Frames[2].Parent = this;
    PAN_VISUMODIESTR = new IDPanel(w, this, 2, "PAN_VISUMODIESTR");
    Frames[2].Content = PAN_VISUMODIESTR;
    PAN_VISUMODIESTR.set_GroupingEnabled(true);
    PAN_VISUMODIESTR.set_ShowGroups(true);
    PAN_VISUMODIESTR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISUMODIESTR.VS = MainFrm.VisualStyleList;
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 1048-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E7C1C67D-31EA-4467-9BFD-BB65D30D1295");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 384, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISUMODIESTR.InitStatus = 2;
    PAN_VISUMODIESTR_Init();
    PAN_VISUMODIESTR_InitFields();
    PAN_VISUMODIESTR_InitQueries();
    TAB_PANNELESTRAZ.SetItem(1, Frames[2], 0, "", "Visualizza Modifica Estrazione", "Visualizza Modifica Estrazione");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Parametri Estrazione";
    Frames[3].Parent = this;
    PAN_PARAMEESTRAZ = new IDPanel(w, this, 3, "PAN_PARAMEESTRAZ");
    Frames[3].Content = PAN_PARAMEESTRAZ;
    PAN_PARAMEESTRAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEESTRAZ.VS = MainFrm.VisualStyleList;
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 1048-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "887F35C3-A55E-4F11-8388-244A8C0F09E4");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 908, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEESTRAZ.InitStatus = 2;
    PAN_PARAMEESTRAZ_Init();
    PAN_PARAMEESTRAZ_InitFields();
    PAN_PARAMEESTRAZ_InitQueries();
    TAB_PANNELESTRAZ.SetItem(2, Frames[3], 0, "", "Parametri Estrazione", "");
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
      if (CmdIdx==MyGlb.CMD_CANCELLA2+BaseCmdLinIdx)
      {
        CancellaSelect();
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
      PAN_VISUMODIESTR.UpdatePanel(MainFrm);
      PAN_PARAMEESTRAZ.UpdatePanel(MainFrm);
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
    return (obj instanceof VisualizzaModificaEstrazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzaModificaEstrazione.class.getName() : (Glb.ClassWithPackage(VisualizzaModificaEstrazione.class) ? VisualizzaModificaEstrazione.class.getName().substring(VisualizzaModificaEstrazione.class.getPackage().getName().length() + 1) : VisualizzaModificaEstrazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Visualizza Modifica Estrazione After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_VISUMODIESTR_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione After Delete Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneAfterDelete", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VISUMODIESTR_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione Before Insert Body
      // Corpo Procedura
      // 
      if ((IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(6))).compareTo((new IDVariant("SELECT")), true)!=0 && IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(2))).compareTo((new IDVariant("--")), true)!=0) || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("DELETE"))).compareTo((new IDVariant(0)), true)>0 || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("INSERT"))).compareTo((new IDVariant(0)), true)>0 || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("UPDATE"))).compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Select Non Valida"))); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0, (new IDVariant()));
      IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF_ESTRAI.SELECT_NEXT_SEQ() as CFESTSELNESE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ID = QV.Get("CFESTSELNESE", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0, new IDVariant(v_ID));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VISUMODIESTR_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione Before Update Body
      // Corpo Procedura
      // 
      if ((IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(6))).compareTo((new IDVariant("SELECT")), true)!=0 && IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(2))).compareTo((new IDVariant("--")), true)!=0) || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("DELETE"))).compareTo((new IDVariant(0)), true)>0 || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("INSERT"))).compareTo((new IDVariant(0)), true)>0 || IDL.Find(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), (new IDVariant("UPDATE"))).compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Select Non Valida"))); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione After Update
  // Evento notificato dopo il salvataggio sul database
  // di una riga modificata.
  // **********************************************************************
  private void PAN_VISUMODIESTR_AfterUpdate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione After Update Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0).equals((new IDVariant(0)), true))
      {
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneAfterUpdate", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VISUMODIESTR_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        SQL = new StringBuffer();
        SQL.append("insert into CF_ESTRAI_LOG_MODIFICA ");
        SQL.append("( ");
        SQL.append("  TIPO, ");
        SQL.append("  VECCHIA_QUERY, ");
        SQL.append("  NUOVA_QUERY, ");
        SQL.append("  DATA_INSERIMENTO, ");
        SQL.append("  UTENTE_INSERIMENTO, ");
        SQL.append("  ID_SELECT ");
        SQL.append(") ");
        SQL.append("select ");
        SQL.append("  'ELIMINATO', ");
        SQL.append("  A.SELECT_SQL, ");
        SQL.append("  A.SELECT_SQL, ");
        SQL.append("  SYSDATE, ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  A.ID ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_SELECT A ");
        SQL.append("where (A.ID = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from CF_ESTRAI_PARAMETRI_SELECT ");
        SQL.append("where (ID_SELECT = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        set_Visible((new IDVariant(0)).booleanValue());
        MainFrm.GetForm(MyGlb.FRM_ESPORTAZDATI,0).set_Visible((new IDVariant(0)).booleanValue());
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
        ((EsportazioneDati)MainFrm.GetForm(MyGlb.FRM_ESPORTAZDATI,0)).PAN_CFESTRASELEC.PanelCommand(Glb.PCM_REQUERY);
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0, (new IDVariant(-1)));
      }
      else
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneOnCommand", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VISUMODIESTR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione On Updating Row Body
      // Corpo Procedura
      // 
      IDVariant v_VALORE = null;
      v_VALORE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'INSERIMENTO') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VALORE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (MainFrm.GetAbilitazioni((new IDVariant("NUOVO"))).equals((new IDVariant(-1)), true))
      {
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      if (MainFrm.GetAbilitazioni((new IDVariant("CANCELLA"))).equals((new IDVariant(-1)), true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CANCELLA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CANCELLA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      if (!(IDL.IsNull(v_VALORE)))
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0, (new IDVariant("P")));
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0, IDL.ToDate(IDL.Year(IDL.Today()), (new IDVariant(1)), (new IDVariant(1))));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_CATEGORIA, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_CATEGORIA, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGCATALB, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Visualizza Modifica Estrazione After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_VISUMODIESTR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Modifica Estrazione After Find Body
      // Corpo Procedura
      // 
      if (MainFrm.GetAbilitazioni((new IDVariant("CANCELLA"))).equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0).equals((new IDVariant("P")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "VisualizzaModificaEstrazioneAfterFind", _e);
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
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        C3 = PAN_PARAMEESTRAZ.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_PARAMEESTRAZ.GotoFirst();
        while (!PAN_PARAMEESTRAZ.RSEOF())
        {
          if (IDL.IsNull(C3.Get("TIPO")) && IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0).compareTo((new IDVariant("SI")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant("Definire il tipo Dato dei parametri della query"))); 
            TAB_PANNELESTRAZ.SelectFrameByIndex((new IDVariant(PAN_PARAMEESTRAZ.FrIndex)).intValue()); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
          PAN_PARAMEESTRAZ.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      IMDB.set_Value(IMDBDef7.TBL_ANTEPRIMDATI, IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGAGGPAN, 0, (new IDVariant("S")));
      MainFrm.UnloadForm(MyGlb.FRM_ESPORTAZDATI,(new IDVariant(0)).booleanValue()); 
      ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "Unload", _e);
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
      PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      if (IDL.IsNull(IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0)))
      {
        PAN_VISUMODIESTR.PanelCommand(Glb.PCM_INSERT);
      }
      IDVariant v_VALORE = null;
      v_VALORE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'INSERIMENTO') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VALORE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (MainFrm.GetAbilitazioni((new IDVariant("NUOVO"))).equals((new IDVariant(-1)), true))
      {
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VISUMODIESTR.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      if (!(IDL.IsNull(v_VALORE)))
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0, (new IDVariant("P")));
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0, IDL.ToDate(IDL.Year(IDL.Today()), (new IDVariant(1)), (new IDVariant(1))));
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        Frames[PAN_VISUMODIESTR.FrIndex].set_Caption((new IDVariant("Visualizza Estrazione")).stringValue());
        set_Caption((new IDVariant("Visualizza Estrazione")));
        TAB_PANNELESTRAZ.SetItemCaption((new IDVariant(PAN_VISUMODIESTR.FrIndex)).intValue(), (new IDVariant("Visualizza Estrazione")).stringValue()); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.set_ShowTool((new IDVariant(0)).booleanValue()); 
        PAN_VISUMODIESTR.set_ShowTool((new IDVariant(0)).booleanValue()); 
      }
      else
      {
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (!(IDL.IsNull(v_VALORE)))
        {
          PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0)))
          {
            IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0, (new IDVariant("P")));
          }
        }
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISUMODIESTR.SetFlags (Glb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        Frames[PAN_VISUMODIESTR.FrIndex].set_Caption((new IDVariant("Modifica  Estrazione")).stringValue());
        set_Caption((new IDVariant("Modifica  Estrazione")));
        TAB_PANNELESTRAZ.SetItemCaption((new IDVariant(PAN_VISUMODIESTR.FrIndex)).intValue(), (new IDVariant("Modifica  Estrazione")).stringValue()); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMEESTRAZ.set_ShowTool((new IDVariant(-1)).booleanValue()); 
        PAN_VISUMODIESTR.set_ShowTool((new IDVariant(-1)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "Load", _e);
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
      if ((new IDVariant(MyGlb.FRM_ELENCODOCUME)).equals(LookupForm, true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID_HELP, 0, ((IMDB.Value(IMDBDef17.PQRY_CFESTRHELSE1, IMDBDef17.PQSL_CFESTRHELSE1_ID, 0).equals((new IDVariant())))?IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID_HELP, 0):IMDB.Value(IMDBDef17.PQRY_CFESTRHELSE1, IMDBDef17.PQSL_CFESTRHELSE1_ID, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Parametri Estrazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEESTRAZ_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Estrazione Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0));
      IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "ParametriEstrazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Parametri Estrazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEESTRAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Estrazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMEESTRAZ_TIPO)), true) && FieldWasModified.booleanValue())
      {
        // IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE_DEFAULT, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARAMEESTRAZ_VALOREDEFAUL)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_VFNESTRAISQL = null;
        v_VFNESTRAISQL = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  FN_ESTRAI_SQL(" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE_DEFAULT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as FESRCEPSVDVM ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFNESTRAISQL = QV.Get("FESRCEPSVDVM", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE, 0, IDL.NullValue(v_VFNESTRAISQL,IMDB.Value(IMDBDef17.PQRY_CFESTRPARSEL, IMDBDef17.PQSL_CFESTRPARSEL_VALORE_DEFAULT, 0)));
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0).equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "ParametriEstrazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Cancella Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CancellaSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Select Body
      // Corpo Procedura
      // 
      if (MainFrm.MessageConfirm((new IDVariant("Si desidera cancellare la query selezionata?"))))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC, 0, (new IDVariant("SI")));
        SQL = new StringBuffer();
        SQL.append("update CF_ESTRAI_SELECT set ");
        SQL.append("  IN_USO = 'NO' ");
        SQL.append("where (ID = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC, 0, (new IDVariant()));
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).SUF_ESPORTAZDATI.SendMessage((new IDVariant("Refresh")), this, null, (new IDVariant())); 
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).SUF_ESPORTAZDATI.set_Visible((new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "CancellaSelect", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Inserimento File Help
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInserimentoFileHelp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Inserimento File Help Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_ELENCODOCUME, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_ELENCODOCUME,(new IDVariant(0)).booleanValue()); 
      }
      MainFrm.Show(MyGlb.FRM_ELENCODOCUME, (new IDVariant(1)).intValue(), this); 
      ((ElencoDocumenti)MainFrm.GetForm(MyGlb.FRM_ELENCODOCUME,0)).PAN_CFESTRHELSEL.set_Layout((new IDVariant(1)).intValue());
      ((ElencoDocumenti)MainFrm.GetForm(MyGlb.FRM_ELENCODOCUME,0)).PAN_CFESTRHELSEL.PanelCommand(Glb.PCM_INSERT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "ApriInserimentoFileHelp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrai Csv Test
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstraiCsvTest ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C18;

    try
    {
      TransCount = 0;
      // 
      // Estrai Csv Test Body
      // Corpo Procedura
      // 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      IDVariant v_VTIMESTSCORR = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VTIMESTAMPCO = new IDVariant(0,IDVariant.DATETIME);
      if (IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(6))).compareTo((new IDVariant("SELECT")), true)!=0 && IDL.Left(IDL.Trim(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0)), true, true), (new IDVariant(2))).compareTo((new IDVariant("--")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Query Non Valida"))); 
        return 0;
      }
      if (IDL.Right(IDL.Trim(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECT_SQL, 0), true, true), (new IDVariant(1))).equals((new IDVariant(";")), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("La query non può terminare con ';'"))); 
        return 0;
      }
      PAN_VISUMODIESTR.PanelCommand(Glb.PCM_UPDATE);
      if (new IDVariant(PAN_VISUMODIESTR.Status()).equals((new IDVariant(2)), true))
      {
        PAN_VISUMODIESTR.PanelCommand(Glb.PCM_REQUERY);
      }
      v_VTIMESTSCORR = IDL.Time();
      R = EseguiTestSelect();
      v_VTIMESTAMPCO = IDL.Time();
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true))
      {
        // return 0;
        // MainFrm.set_AlertMessage((new IDVariant("nessun risultato"))); 
      }
      else
      {
        R.MoveFirst();
        IDVariant v_FILEOUT = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        com.progamma.FileMangler v_FM = null;
        v_FM = (com.progamma.FileMangler)new com.progamma.FileMangler(MainFrm);
        v_FM.XLSEngine = (new IDVariant(0)).intValue();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_NOME_FILE_EXPORT, 0)))
        {
          v_NOMEFILE = IDL.Add((new IDVariant("ESTRAZIONE_")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0)));
        }
        else
        {
          v_NOMEFILE = IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_NOME_FILE_EXPORT, 0);
        }
        v_FILEOUT = v_FM.writeCSV(MainFrm, R, IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue());
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(v_FILEOUT, v_FD); 
        }
        catch (Exception e13)
        {
          IDVariant S = null;
          S = (new IDVariant("Errore in fase di anteprima dati"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        IDVariant v_NRIGA = null;
        v_NRIGA = (new IDVariant(1));
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CSV = new IDVariant(0,IDVariant.STRING);
        while (!(MainFrm.VBFile.EOF(v_FD)))
        {
          v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
          if (v_NRIGA.equals((new IDVariant(1)), true))
          {
            v_CSV = IDL.Add(IDL.Add(IDL.Add(v_CSV, (new IDVariant("<TR style=\"font-weight:bold\"><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">"))), v_CURRLINE), (new IDVariant("</TR>")));
          }
          else
          {
            v_CSV = IDL.Add(IDL.Add(IDL.Add(v_CSV, (new IDVariant("<TR><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">"))), v_CURRLINE), (new IDVariant("</TR>")));
          }
          v_NRIGA = IDL.Add(v_NRIGA, (new IDVariant(1)));
        }
        MainFrm.VBFile.Close(v_FD); 
        v_CSV = IDL.Replace(v_CSV, (new IDVariant("\"")), (new IDVariant("")));
        v_CSV = IDL.Replace(v_CSV, (new IDVariant(";")), (new IDVariant("</TD><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">")));
        v_CSV = IDL.Add(IDL.Add((new IDVariant("<TABLE style=\"BORDER-COLLAPSE: collapse\" bordercolor=\"#111111\" cellspacing=\"2\" cellpadding=\"5\" width=\"100%\" border=\"1\">")), v_CSV), (new IDVariant("</TABLE>")));
        IMDB.set_Value(IMDBDef7.TBL_ANTEPRIMDATI, IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGANTCSV, 0, new IDVariant(v_CSV));
        IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
        MainFrm.Cf4armDBObject.CFESTRAILOGESECUZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECTSOSTIT, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0), v_ID, IDL.Sub(v_VTIMESTAMPCO, v_VTIMESTSCORR));
        // 
        // salvo il risultato su tabella
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ID_ESECUZIONE as ID_ESECUZIONE, ");
        SQL.append("  A.DATI_ESTRATTI as DATI_ESTRATTI ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A ");
        SQL.append("where (A.ID_ESECUZIONE = " + IDL.CSql(v_ID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C18 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C18.EOF()) C18.MoveNext();
        while (!C18.EOF())
        {
          C18.Set("DATI_ESTRATTI", Glb.LoadBlob(MainFrm,v_FILEOUT));
          C18.updateRow();
          C18.MoveNext();
        }
        MainFrm.Cf4armDBObject.DBO().UpdateRS("CF_ESTRAI_ESECUZIONE_QUERY", C18);
        C18.Close();
        MainFrm.Show(MyGlb.FRM_ANTEPRIMDATI, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "EstraiCsvTest", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Genera Parametri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GeneraParametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Genera Parametri Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GETPARAMETRIFROMSELECT(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_ID, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Generazione parametri avvenuta con successo. Definire il tipo di parametro prima di procedere."))); 
      }
      PAN_PARAMEESTRAZ.PanelCommand(Glb.PCM_REQUERY);
      TAB_PANNELESTRAZ.SelectFrameByIndex((new IDVariant(PAN_PARAMEESTRAZ.FrIndex)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "GeneraParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Esegui Test Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDCachedRowSet EseguiTestSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esegui Test Select Body
      // Corpo Procedura
      // 
      IDPreparedStatement v_PS = null;
      v_PS = (IDPreparedStatement)new IDPreparedStatement();
      IDVariant v_ISERRORE = new IDVariant(0,IDVariant.INTEGER);
      v_PS.SetCommand(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_SELECTSOSTIT, 0).stringValue()); 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      try
      {
        R = MainFrm.Cf4armDBObject.DBO().ExecuteIDPS(v_PS, true);
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage(IDL.Add((new IDVariant("Errore Nella Query: ")), new IDVariant(e3.getMessage()))); 
        v_ISERRORE = (new IDVariant(-1));
      }
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true) && !(v_ISERRORE.booleanValue()))
      {
        MainFrm.set_AlertMessage((new IDVariant("Nessun dato Trovato"))); 
      }
      return R;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaModificaEstrazione", "EseguiTestSelect", _e);
      return null;
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
  private void TAB_PANNELESTRAZ_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISUMODIESTR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISUMODIESTR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISUMODIESTR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISUMODIESTR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISUMODIESTR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VISUMODIESTR);
    // Stub
  }

  private void PAN_VISUMODIESTR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VISUMODIESTR_BOTTGENEPARA)
    {
      this.IdxPanelActived = this.PAN_VISUMODIESTR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      GeneraParametri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VISUMODIESTR_BOTTPROVSELE)
    {
      this.IdxPanelActived = this.PAN_VISUMODIESTR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EstraiCsvTest();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VISUMODIESTR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VISUMODIESTR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VISUMODIESTR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_DATA_INIZIO_VALIDITA, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_STATO, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_FILE_ASSOCIATO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE2, IMDBDef17.PQSL_CFESTRASELE2_FILE_ASSOCIATO, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_VISUMODIESTR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEESTRAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEESTRAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEESTRAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEESTRAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEESTRAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEESTRAZ);
    // Stub
  }

  private void PAN_PARAMEESTRAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEESTRAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMEESTRAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEESTRAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEESTRAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VISUMODIESTR_Init()
  {

    PAN_VISUMODIESTR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISUMODIESTR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISUMODIESTR.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, "58EDA792-3010-4DB9-9837-E40125B1BB32");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, "Codice");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, "3FD0227F-F9FF-4DE0-B521-6093545F7571");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, "Data inizio validità");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, "CF70D3C3-4C4D-469F-9AFE-ACB407647F15");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, "Data fine validità");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, "4EB64FFC-2EC6-4504-A5B3-1F2FF9688F5E");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, "Tipo");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, "Tipo");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, "906780B1-09F5-4B9E-B747-02B4ACF7F56E");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, "Categoria");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.VIS_FOREIKEYFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, "B4536678-777D-46B9-980C-5A439D0DB4F9");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, "Nome File Export");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, "0A01A57D-B6B7-410D-BCB9-3FF4802093F0");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, "Titolo");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, "154D771B-1468-4171-9631-6065D504827E");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, "Descrizione");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.VIS_HTMLNORMFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, "3538667D-22B8-4A55-8FD2-356DB713A2D7");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, "Note");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, "0A13208D-07D2-41E6-8DA6-E3380583677E");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, "Sql");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, "222EE61F-A492-47FE-BAFA-05B54F52678C");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, "Genera Parametri");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.VIS_STATICBUTTON);
    PAN_VISUMODIESTR.SetImage(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, 0, "button1.gif", false);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, "EA249DF3-D512-4865-A76C-6928D8055D35");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, "Prova Select");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.VIS_STATICBUTTON);
    PAN_VISUMODIESTR.SetImage(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, 0, "button1.gif", false);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, "56ABF96C-6C05-4FBA-8C73-72B8203B2C46");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, 0, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, "9626F98A-B40F-4865-B73E-19611F12B0D3");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, "SELECT SOSTITUITA");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, "BFD91B22-B39F-41BE-8156-0C1671BBA168");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, "ID");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, "C48CC772-6280-4963-90F1-D39ACD964DEA");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, "File Associato");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUMODIESTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, "84D85102-1E3E-4773-9630-F6EA7CCC9663");
    PAN_VISUMODIESTR.set_Header(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, "ID HELP");
    PAN_VISUMODIESTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, "");
    PAN_VISUMODIESTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.VIS_FOREIKEYFIEL);
    PAN_VISUMODIESTR.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VISUMODIESTR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_FORM, 68, 8, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_CODICE, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_CODICE, PPQRY_CFESTRASELE2, "A.CODICE", "CODICE", 5, 20, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_LIST, 128, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_LIST, 136);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_LIST, "Data inizio validità");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_FORM, 372, 8, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_FORM, 116);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAINIZVALI, MyGlb.PANEL_FORM, "Data inizio validità");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_DATAINIZVALI, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_DATAINIZVALI, PPQRY_CFESTRASELE2, "A.DATA_INIZIO_VALIDITA", "DATA_INIZIO_VALIDITA", 6, 10, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_LIST, 288, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_LIST, 124);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_LIST, "Data fine validità");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_FORM, 596, 8, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_FORM, 108);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DATAFINEVALI, MyGlb.PANEL_FORM, "Data fine validità");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_DATAFINEVALI, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_DATAFINEVALI, PPQRY_CFESTRASELE2, "A.DATA_FINE_VALIDITA", "DATA_FINE_VALIDITA", 6, 10, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_LIST, 40, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_LIST, 48);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_LIST, "Tipo");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_FORM, 656, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_FORM, 32);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_STATO, MyGlb.PANEL_FORM, "Tipo");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_STATO, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_STATO, PPQRY_CFESTRASELE2, "A.STATO", "STATO", 5, 20, 0, -13997);
    PAN_VISUMODIESTR.SetValueListItem(PFL_VISUMODIESTR_STATO, (new IDVariant("S")), "Standard", "", "", -1);
    PAN_VISUMODIESTR.SetValueListItem(PFL_VISUMODIESTR_STATO, (new IDVariant("P")), "Personalizzata", "", "", -1);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_LIST, 4, 316, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_FORM, 56, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_CATEGORIA, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_CATEGORIA, PPQRY_CFESTRASELE2, "A.CATEGORIA", "CATEGORIA", 5, 50, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_LIST, 4, 484, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_LIST, "Nome File Export");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_FORM, -8, 724, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_FORM, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOMEFILEEXPO, MyGlb.PANEL_FORM, "Nome File Export");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_NOMEFILEEXPO, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_NOMEFILEEXPO, PPQRY_CFESTRASELE2, "A.NOME_FILE_EXPORT", "NOME_FILE_EXPORT", 5, 100, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_LIST, 4, 244, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_FORM, 80, 64, 712, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_FORM, 40);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_FORM, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_TITOLO, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_TITOLO, PPQRY_CFESTRASELE2, "A.TITOLO", "TITOLO", 5, 100, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_LIST, 4, 268, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_FORM, 44, 104, 748, 104, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_FORM, 7);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_DESCRIZIONE1, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_DESCRIZIONE1, PPQRY_CFESTRASELE2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_LIST, 4, 436, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_FORM, 84, 216, 708, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_NOTE, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_NOTE, PPQRY_CFESTRASELE2, "A.NOTE", "NOTE", 5, 4000, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_LIST, 4, 388, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_LIST, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_LIST, "Sql");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_FORM, 92, 268, 700, 448, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_FORM, 28);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_FORM, 34);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSQL, MyGlb.PANEL_FORM, "Sql");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_SELECTSQL, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_SELECTSQL, PPQRY_CFESTRASELE2, "A.SELECT_SQL", "SELECT_SQL", 9, 9999, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_LIST, 364, 768, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_LIST, 0);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_FORM, 528, 808, 120, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_FORM, 0);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTGENEPARA, MyGlb.PANEL_FORM, 2);
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_BOTTGENEPARA, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_BOTTGENEPARA, -1, "", "BOTTGENEPARA", 0, 0, 0, -13997);
    PAN_VISUMODIESTR.set_ImageResizeMode(PFL_VISUMODIESTR_BOTTGENEPARA, 3);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_LIST, 624, 920, 136, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_LIST, 0);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_LIST, 2);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_FORM, 672, 808, 120, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_FORM, 0);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_BOTTPROVSELE, MyGlb.PANEL_FORM, 2);
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_BOTTPROVSELE, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_BOTTPROVSELE, -1, "", "BOTTPROVSELE", 0, 0, 0, -13997);
    PAN_VISUMODIESTR.set_ImageResizeMode(PFL_VISUMODIESTR_BOTTPROVSELE, 3);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_LIST, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 960, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_FORM, 128);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_UTENTEINSER1, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_UTENTEINSER1, PPQRY_CFESTRASELE2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_LIST, 120);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_LIST, "SELECT SOSTITUITA");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_FORM, 4, 800, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_FORM, 120);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_SELECTSOSTIT, MyGlb.PANEL_FORM, "SELECT SOSTITUITA");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_SELECTSOSTIT, -1, -1);
    PAN_VISUMODIESTR.SetFieldUnbound(PFL_VISUMODIESTR_SELECTSOSTIT, true);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_SELECTSOSTIT, PPQRY_CFESTRASELE2, "CF_ESTRAI.SOSTITUISCI_PARAMETRI(A.ID)", "SELECTSOSTIT", 9, 99, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_LIST, 24);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_LIST, "ID");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_FORM, 4, 800, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_FORM, 24);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_ID1, MyGlb.PANEL_FORM, "ID");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_ID1, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_ID1, PPQRY_CFESTRASELE2, "A.ID", "ID", 3, 19, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_LIST, 100);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_LIST, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_LIST, "File Associato");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_FORM, 20, 752, 772, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_FORM, 100);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_FORM, 2);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_FILEASSOCIAT, MyGlb.PANEL_FORM, "File Associato");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_FILEASSOCIAT, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_FILEASSOCIAT, PPQRY_CFESTRASELE2, "A.FILE_ASSOCIATO", "FILE_ASSOCIATO", 10, 9999, 0, -13997);
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_LIST, 52);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_LIST, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_LIST, "ID HELP");
    PAN_VISUMODIESTR.SetRect(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_FORM, 4, 848, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUMODIESTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_FORM, 52);
    PAN_VISUMODIESTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_FORM, 1);
    PAN_VISUMODIESTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUMODIESTR_IDHELP, MyGlb.PANEL_FORM, "ID HELP");
    PAN_VISUMODIESTR.SetFieldPage(PFL_VISUMODIESTR_IDHELP, -1, -1);
    PAN_VISUMODIESTR.SetFieldPanel(PFL_VISUMODIESTR_IDHELP, PPQRY_CFESTRASELE2, "A.ID_HELP", "ID_HELP", 3, 19, 0, -13997);
  }

  private void PAN_VISUMODIESTR_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISUMODIESTR.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as NOOGCFESHESI ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_HELP_SELECT A ");
    SQL.append("where (A.ID = ~~ID_HELP~~) ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_LOOCFESTSER0, 0, SQL, -1, "");
    PAN_VISUMODIESTR.SetQueryDB(PPQRY_LOOCFESTSER0, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUMODIESTR.SetMasterTable(PPQRY_LOOCFESTSER0, "CF_ESTRAI_HELP_SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("where (A.CATEGORIA = ~~CATEGORIA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRCATSEL, 0, SQL, PFL_VISUMODIESTR_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRCATSEL, 1, SQL, PFL_VISUMODIESTR_CATEGORIA, "");
    PAN_VISUMODIESTR.SetQueryDB(PPQRY_CFESTRCATSEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUMODIESTR.SetIMDB(IMDB, "PQRY_CFESTRASELE2", true);
    PAN_VISUMODIESTR.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.SELECT_SQL as SELECT_SQL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.DATA_INIZIO_VALIDITA as DATA_INIZIO_VALIDITA, ");
    SQL.append("  A.DATA_FINE_VALIDITA as DATA_FINE_VALIDITA, ");
    SQL.append("  A.NOME_FILE_EXPORT as NOME_FILE_EXPORT, ");
    SQL.append("  A.ID_HELP as ID_HELP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  CF_ESTRAI.SOSTITUISCI_PARAMETRI(A.ID) as SELECTSOSTIT, ");
    SQL.append("  A.FILE_ASSOCIATO as FILE_ASSOCIATO ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_SELECT A ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID = ~~TBL_PARAMETRI64.NOMEOGGETPID~~) ");
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUMODIESTR.SetQuery(PPQRY_CFESTRASELE2, 5, SQL, -1, "");
    PAN_VISUMODIESTR.SetQueryDB(PPQRY_CFESTRASELE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUMODIESTR.SetMasterTable(0, "CF_ESTRAI_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISUMODIESTR.Status() == 2)
    {
      int oldListQBE = PAN_VISUMODIESTR.iUseListQBE;
      PAN_VISUMODIESTR.iUseListQBE = 0;
      PAN_VISUMODIESTR.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISUMODIESTR.PanelCommand(Glb.PCM_FIND);
      PAN_VISUMODIESTR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEESTRAZ_Init()
  {

    PAN_PARAMEESTRAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEESTRAZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEESTRAZ.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, "E352982C-F8B5-4FEF-80A3-F3718CF8E1FD");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, "Nome");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, "14258411-529F-44C0-B5AA-C3F271648CBD");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, "Descrizione");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, "7C003528-937C-429A-8BDF-E7C460A30ADA");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, "Tipo");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, "FDF439CF-2ABD-4C55-8591-DDBD81FD70B4");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, "Valore");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, "98ECA993-35CC-4EE0-A915-1529F6C605B2");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, "Valore di Default");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, "2266F131-194A-444E-8BB8-7236476AC18A");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, "ID");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, "79635616-F4A4-4952-A565-81A50ABBDACD");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, "ID SELECT");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.VIS_FOREIKEYFIEL);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, 0, -1);
    PAN_PARAMEESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, "97F00450-BE82-4EF0-9952-BD01C578F5CE");
    PAN_PARAMEESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_PARAMEESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, "");
    PAN_PARAMEESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.VIS_NONNULLAFIEL);
    PAN_PARAMEESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, 0, -1);
  }

  private void PAN_PARAMEESTRAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_LIST, 0, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_LIST, 28);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_LIST, "Nome");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_FORM, 4, 28, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_FORM, 40);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_NOME, MyGlb.PANEL_FORM, "Nome");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_NOME, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_NOME, PPQRY_CFESTRPARSEL, "A.NOME", "NOME", 5, 100, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 240, 36, 268, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_DESCRIZIONE, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_DESCRIZIONE, PPQRY_CFESTRPARSEL, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_LIST, 508, 36, 40, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_FORM, 4, 4, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_TIPO, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_TIPO, PPQRY_CFESTRPARSEL, "A.TIPO", "TIPO", 5, 50, 0, -13997);
    PAN_PARAMEESTRAZ.SetValueListItem(PFL_PARAMEESTRAZ_TIPO, (new IDVariant("S")), "Stringa", "", "", -1);
    PAN_PARAMEESTRAZ.SetValueListItem(PFL_PARAMEESTRAZ_TIPO, (new IDVariant("N")), "Numero", "", "", -1);
    PAN_PARAMEESTRAZ.SetValueListItem(PFL_PARAMEESTRAZ_TIPO, (new IDVariant("D")), "Data", "", "", -1);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_LIST, 548, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_LIST, 52);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_LIST, "Valore");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_FORM, 4, 4, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALORE, MyGlb.PANEL_FORM, "Valore");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_VALORE, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_VALORE, PPQRY_CFESTRPARSEL, "A.VALORE", "VALORE", 5, 100, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_LIST, 700, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_LIST, 104);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_LIST, "Valore di Default");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_FORM, 4, 4, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_FORM, 104);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_VALOREDEFAUL, MyGlb.PANEL_FORM, "Valore di Default");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_VALOREDEFAUL, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_VALOREDEFAUL, PPQRY_CFESTRPARSEL, "A.VALORE_DEFAULT", "VALORE_DEFAULT", 5, 100, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_LIST, 24);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_LIST, "ID");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_FORM, 4, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_FORM, 24);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_ID, MyGlb.PANEL_FORM, "ID");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_ID, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_ID, PPQRY_CFESTRPARSEL, "A.ID", "ID", 3, 19, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_LIST, 64);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_LIST, "ID SELECT");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_FORM, 4, 28, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_FORM, 64);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_IDSELECT, MyGlb.PANEL_FORM, "ID SELECT");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_IDSELECT, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_IDSELECT, PPQRY_CFESTRPARSEL, "A.ID_SELECT", "ID_SELECT", 3, 19, 0, -13997);
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_PARAMEESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEESTRAZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_PARAMEESTRAZ.SetFieldPage(PFL_PARAMEESTRAZ_UTENTEINSERI, -1, -1);
    PAN_PARAMEESTRAZ.SetFieldPanel(PFL_PARAMEESTRAZ_UTENTEINSERI, PPQRY_CFESTRPARSEL, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
  }

  private void PAN_PARAMEESTRAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEESTRAZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOME as CFESTRPARNOM, ");
    SQL.append("  A.DESCRIZIONE as CFESTRPARDES ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_PARAMETRI A ");
    SQL.append("where (A.TIPO = ~~TIPO~~) ");
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRAPARA1, 0, SQL, PFL_PARAMEESTRAZ_VALOREDEFAUL, "");
    PAN_PARAMEESTRAZ.SetQueryDB(PPQRY_CFESTRAPARA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEESTRAZ.SetIMDB(IMDB, "PQRY_CFESTRPARSEL", true);
    PAN_PARAMEESTRAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.ID_SELECT as ID_SELECT, ");
    SQL.append("  A.NOME as NOME, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.VALORE_DEFAULT as VALORE_DEFAULT, ");
    SQL.append("  A.VALORE as VALORE, ");
    SQL.append("  A.SEQUENZA as SEQUENZA ");
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_PARAMETRI_SELECT A ");
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_SELECT = ~~PQRY_CFESTRASELE2.ID~~) ");
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_PARAMEESTRAZ.SetQuery(PPQRY_CFESTRPARSEL, 5, SQL, -1, "");
    PAN_PARAMEESTRAZ.SetQueryDB(PPQRY_CFESTRPARSEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEESTRAZ.SetMasterTable(0, "CF_ESTRAI_PARAMETRI_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEESTRAZ.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEESTRAZ.iUseListQBE;
      PAN_PARAMEESTRAZ.iUseListQBE = 0;
      PAN_PARAMEESTRAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEESTRAZ.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEESTRAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_DynamicProperties();
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_BeforeInsert(Cancel);
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_AfterUpdate();
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VISUMODIESTR) PAN_VISUMODIESTR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEESTRAZ) PAN_PARAMEESTRAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_PANNELESTRAZ) TAB_PANNELESTRAZ_Click(PreviousPage, Cancel);
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
