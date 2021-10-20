// **********************************************
// Dati Beneficiario
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DatiBeneficiario extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DATIBENEFICI_PROGRESSIVO1 = 0;
  private static int PFL_DATIBENEFICI_RAGIOSOCIBEN = 1;
  private static int PFL_DATIBENEFICI_NUMERODOCUME = 2;
  private static int PFL_DATIBENEFICI_DATADOCUMENT = 3;
  private static int PFL_DATIBENEFICI_IMPORTO = 4;
  private static int PFL_DATIBENEFICI_UFFICIO = 5;
  private static int PFL_DATIBENEFICI_RESPONSABILE = 6;
  private static int PFL_DATIBENEFICI_NORMA = 7;
  private static int PFL_DATIBENEFICI_DAPUBBLICARE = 8;
  private static int PFL_DATIBENEFICI_PUBBLICATO = 9;
  private static int PFL_DATIBENEFICI_MODALITA = 10;
  private static int PFL_DATIBENEFICI_NOTE1 = 11;
  private static int PFL_DATIBENEFICI_ANNO = 12;
  private static int PFL_DATIBENEFICI_NUMERO = 13;
  private static int PFL_DATIBENEFICI_TIPO = 14;
  private static int PFL_DATIBENEFICI_CODBENEFICIA = 15;
  private static int PFL_DATIBENEFICI_PROGRPKDOC = 16;
  private static int PFL_DATIBENEFICI_ANNOPKDOC = 17;
  private static int PFL_DATIBENEFICI_UTENTEINSERI = 18;
  private static int PFL_DATIBENEFICI_DATAINSERIME = 19;
  private static int PFL_DATIBENEFICI_UTENTULTIAGG = 20;
  private static int PFL_DATIBENEFICI_DATAULTIMAGG = 21;
  private static int PFL_DATIBENEFICI_INSERIMANUAL = 22;
  private static int PFL_DATIBENEFICI_ETICBARRDOCU = 23;
  private static int PFL_DATIBENEFICI_ETICHEDOCUME = 24;

  private static int PPQRY_DETTALIQART1 = 0;


  IDPanel PAN_DATIBENEFICI;
  private static int PFL_ALLEGATI_PROGRESSIVO = 0;
  private static int PFL_ALLEGATI_PROGRDETTAGL = 1;
  private static int PFL_ALLEGATI_CODTIPOALLEG = 2;
  private static int PFL_ALLEGATI_NOTE = 3;
  private static int PFL_ALLEGATI_FILEDATI = 4;
  private static int PFL_ALLEGATI_DESCTIPOALLE = 5;
  private static int PFL_ALLEGATI_NOMEFILE = 6;

  private static int PPQRY_ALLEGLIQART1 = 0;

  private static int PPQRY_TIPIALLEART1 = 1;


  IDPanel PAN_ALLEGATI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI421(IMDB);
    //
    //
    Init_PQRY_DETTALIQART1(IMDB);
    Init_PQRY_ALLEGLIQART1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI421(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI421, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI421, "TBL_PARAMETRI421");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMANNO, "PARAMANNO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, "PARAMNUMERO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI421,IMDBDef7.FLD_PARAMETRI421_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI421, 0);
  }

  private static void Init_PQRY_DETTALIQART1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DETTALIQART1, 23);
    IMDB.set_TblCode(IMDBDef17.PQRY_DETTALIQART1, "PQRY_DETTALIQART1");
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NUMERO,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_TIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_COD_BENEFICIARIO, "COD_BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_COD_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_RAGIONE_SOCIALE_BEN, "RAGIONE_SOCIALE_BEN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_RAGIONE_SOCIALE_BEN,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PROGR_PK_DOC, "PROGR_PK_DOC");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PROGR_PK_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_ANNO_PK_DOC, "ANNO_PK_DOC");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_ANNO_PK_DOC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NUMERO_DOCUMENTO, "NUMERO_DOCUMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NUMERO_DOCUMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_DOCUMENTO, "DATA_DOCUMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_DOCUMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UFFICIO,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_RESPONSABILE,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NORMA, "NORMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NORMA,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, "DA_PUBBLICARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_INSERIMENTO_MANUALE, "INSERIMENTO_MANUALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_INSERIMENTO_MANUALE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PUBBLICATO, "PUBBLICATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_PUBBLICATO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_MODALITA, "MODALITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_MODALITA,5,2000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DETTALIQART1,IMDBDef17.PQSL_DETTALIQART1_NOTE,5,2000,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_DETTALIQART1, 0);
  }

  private static void Init_PQRY_ALLEGLIQART1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_ALLEGLIQART1, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_ALLEGLIQART1, "PQRY_ALLEGLIQART1");
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_PROGR_DETTAGLIO, "PROGR_DETTAGLIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_PROGR_DETTAGLIO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_COD_TIPO_ALLEGATO, "COD_TIPO_ALLEGATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_COD_TIPO_ALLEGATO,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_DESCR_TIPO_ALLEGATO, "DESCR_TIPO_ALLEGATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_DESCR_TIPO_ALLEGATO,5,30,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_NOTE,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_FILE_DATI,10,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_NOME_FILE, "NOME_FILE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ALLEGLIQART1,IMDBDef17.PQSL_ALLEGLIQART1_NOME_FILE,5,100,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_ALLEGLIQART1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DatiBeneficiario(MyWebEntryPoint w, IMDBObj imdb)
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
  public DatiBeneficiario()
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
    FormIdx = MyGlb.FRM_DATIBENEFICI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "46FF9F64-6BA9-4F27-96F9-8C20E0EB917A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 534;
    set_Caption(new IDVariant("Dati Beneficiario"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 508;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.637795;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 676;
    Frames[2].Height = 324;
    Frames[2].Caption = "Dati Beneficiari";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 324;
    PAN_DATIBENEFICI = new IDPanel(w, this, 2, "PAN_DATIBENEFICI");
    Frames[2].Content = PAN_DATIBENEFICI;
    PAN_DATIBENEFICI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATIBENEFICI.VS = MainFrm.VisualStyleList;
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CDACE39E-90B4-4D02-902F-F38BFC84BE99");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1192, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATIBENEFICI.InitStatus = 1;
    PAN_DATIBENEFICI_Init();
    PAN_DATIBENEFICI_InitFields();
    PAN_DATIBENEFICI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 676;
    Frames[3].Height = 184;
    Frames[3].Caption = "Allegati";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 184;
    PAN_ALLEGATI = new IDPanel(w, this, 3, "PAN_ALLEGATI");
    Frames[3].Content = PAN_ALLEGATI;
    PAN_ALLEGATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ALLEGATI.VS = MainFrm.VisualStyleList;
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "80C3FBCB-46DF-4D89-989A-10F1AF3F8823");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 592, 104, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 40);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ALLEGATI.InitStatus = 2;
    PAN_ALLEGATI_Init();
    PAN_ALLEGATI_InitFields();
    PAN_ALLEGATI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA2+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG101+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERADETTAG+BaseCmdLinIdx)
      {
        GeneraDettagli();
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
      PAN_DATIBENEFICI.UpdatePanel(MainFrm);
      PAN_ALLEGATI.UpdatePanel(MainFrm);
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
    return (obj instanceof DatiBeneficiario);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DatiBeneficiario.class.getName() : (Glb.ClassWithPackage(DatiBeneficiario.class) ? DatiBeneficiario.class.getName().substring(DatiBeneficiario.class.getPackage().getName().length() + 1) : DatiBeneficiario.class.getName()));
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  DETTAGLI_LIQ_ART18 A ");
      SQL.append("where (A.TIPO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0).equals((new IDVariant("LIW")), true))
        {
          if (DatiBenAssociatiInDistinta())
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati Beneficiario già associati in distinta. Continuare?"));
            if (!(MainFrm.MessageConfirm(v_AVVISO)))
            {
              MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
              return;
            }
          }
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.GENERADETTAGLIART18(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
      }
      PAN_DATIBENEFICI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_DATIBENEFICI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ALLEGATI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_ALLEGATI.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ALLEGATI.SetFieldBlobSize(PFL_ALLEGATI_FILEDATI, (new IDVariant(1)).intValue(), (new IDVariant(0)).intValue(), (new IDVariant(-1)).booleanValue()); 
      if (MainFrm.PUBBAUTOART1.equals((new IDVariant("SI")), true))
      {
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0).equals((new IDVariant("IMW")), true) && MainFrm.SOLOIMPESECU.equals((new IDVariant("SI")), true))
      {
        AbilitazioneDaPubblicare();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "Load", _e);
    }
  }

  // **********************************************************************
  // Dati Beneficiari On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DATIBENEFICI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Beneficiari On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_ANNO, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_ANNO, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0));
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_NUMERO, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0));
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_TIPO, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0));
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_INSERIMENTO_MANUALE, 0, (new IDVariant("SI")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_UTENTE_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_UTENTE_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_DATIBENEFICI_DAPUBBLICARE)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, 0).equals((new IDVariant("SI")), true))
        {
          if (new IDVariant(PAN_ALLEGATI.Status()).equals((new IDVariant(3)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Confermare o annullare le modifiche in sospeso sugli allegati"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBeneficiariOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Dati Beneficiari Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DATIBENEFICI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Beneficiari Before Insert Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_COD_BENEFICIARIO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_COD_BENEFICIARIO, 0, (new IDVariant(-1, IDVariant.FLOAT)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBeneficiariBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Dati Beneficiari On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_DATIBENEFICI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DATIBENEFICI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dati Beneficiari On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBeneficiariOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Dati Beneficiari On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_DATIBENEFICI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Beneficiari On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DATIBENEFICI.Status()).equals((new IDVariant(2)), true) && new IDVariant(PAN_ALLEGATI.Status()).compareTo((new IDVariant(3)), true)!=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBeneficiariOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Dati Beneficiari On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATIBENEFICI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DATIBENEFICI);
      // 
      // Dati Beneficiari On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ALLEGATI.set_Locked((new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_PROGRESSIVO, 0)))
        {
          PAN_ALLEGATI.set_Locked((new IDVariant(-1)).booleanValue());
        }
        else
        {
          PAN_ALLEGATI.set_Locked((new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBeneficiariOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Allegati On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ALLEGATI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_PROGR_DETTAGLIO, 0, IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_PROGRESSIVO, 0));
      }
      if (Column.equals((new IDVariant(PFL_ALLEGATI_CODTIPOALLEG)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as TIPALLARTDES ");
        SQL.append("from ");
        SQL.append("  TIPI_ALLEGATO_ART18 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_COD_TIPO_ALLEGATO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("TIPALLARTDES", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_DESCR_TIPO_ALLEGATO, 0, new IDVariant(v_DESCRIZIONE));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AllegatiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Allegati On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ALLEGATI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DATIBENEFICI.Status()).equals((new IDVariant(2)), true) && new IDVariant(PAN_ALLEGATI.Status()).compareTo((new IDVariant(3)), true)!=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG103+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AllegatiOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Allegati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ALLEGATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ALLEGATI);
      // 
      // Allegati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ALLEGATI.set_ToolTip(Glb.OBJ_FIELD,PFL_ALLEGATI_NOTE,(new IDVariant(PAN_ALLEGATI.FieldText(PFL_ALLEGATI_NOTE))).stringValue()); 
      if (PAN_ALLEGATI.IsNewRow())
      {
        PAN_ALLEGATI.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ALLEGATI.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AllegatiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Allegati Before BLOB Update
  // Evento notificato dal pannello prima di effettuare
  // la registrazione nel database di un blob appena caricato
  // dall'utente.
  // Cancel - Input/Output
  // Column - Input
  // Size - Input
  // Extension - Input
  // FilePath - Input
  // **********************************************************************
  private void PAN_ALLEGATI_BeforeBlobUpdate (IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati Before BLOB Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_NOME_FILE, 0, new IDVariant(FilePath));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AllegatiBeforeBLOBUpdate", _e);
    }
  }

  // **********************************************************************
  // Allegati After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_ALLEGATI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_ALLEGATI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AllegatiAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Genera Dettagli
  // **********************************************************************
  public int GeneraDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Genera Dettagli Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Dettaglio da pubblicare. Nuova generazione non ammessa."));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if ((new IDVariant(PAN_DATIBENEFICI.GetNumRows())).compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Attenzione: il dettaglio liq. è già presente. Eseguendo la Generazione, il dettaglio presenti verra eliminato. Continuare?"));
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          return 0;
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0).equals((new IDVariant("LIW")), true))
        {
          if (DatiBenAssociatiInDistinta())
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati Beneficiario già associati in distinta. Continuare?"));
            if (!(MainFrm.MessageConfirm(v_AVVISO)))
            {
              return 0;
            }
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERADETTAGLIART18(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMTIPO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      PAN_DATIBENEFICI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "GeneraDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Corpo Procedura
      // 
      IDVariant v_UFFICIO = new IDVariant(0,IDVariant.STRING);
      v_UFFICIO = (new IDVariant("Ufficio"));
      IDVariant v_RESPONSABILE = new IDVariant(0,IDVariant.STRING);
      v_RESPONSABILE = (new IDVariant("Responsabile"));
      IDVariant v_NORMA = new IDVariant(0,IDVariant.STRING);
      v_NORMA = (new IDVariant("Norma"));
      IDVariant v_MODALITA = new IDVariant(0,IDVariant.STRING);
      v_MODALITA = (new IDVariant("Modalità"));
      IDVariant v_ATTENZIONE = new IDVariant(0,IDVariant.STRING);
      v_ATTENZIONE = (new IDVariant("Attenzione! Nel dettaglio "));
      IDVariant v_NONSONOINDIC = new IDVariant(0,IDVariant.STRING);
      v_NONSONOINDIC = (new IDVariant(" non sono indicati"));
      IDVariant v_SEGUENTCAMPI = new IDVariant(0,IDVariant.STRING);
      v_SEGUENTCAMPI = (new IDVariant("i seguenti campi:"));
      IDVariant v_SEGUENALLEGA = new IDVariant(0,IDVariant.STRING);
      v_SEGUENALLEGA = (new IDVariant("i seguenti allegati:"));
      IDVariant v_CAMPIMANCANT = null;
      v_CAMPIMANCANT = (new IDVariant());
      IDVariant v_ALLEGAMANCAN = null;
      v_ALLEGAMANCAN = (new IDVariant());
      IDVariant v_AVVISNONBLOC = null;
      v_AVVISNONBLOC = (new IDVariant());
      if (MainFrm.SEGDATMANART.equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_DA_PUBBLICARE, 0).equals((new IDVariant("SI")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_UFFICIO, 0)))
          {
            v_CAMPIMANCANT = IDL.Add(IDL.Add(v_CAMPIMANCANT, v_UFFICIO), (new IDVariant("<BR/>")));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_RESPONSABILE, 0)))
          {
            v_CAMPIMANCANT = IDL.Add(IDL.Add(v_CAMPIMANCANT, v_RESPONSABILE), (new IDVariant("<BR/>")));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_NORMA, 0)))
          {
            v_CAMPIMANCANT = IDL.Add(IDL.Add(v_CAMPIMANCANT, v_NORMA), (new IDVariant("<BR/>")));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_MODALITA, 0)))
          {
            v_CAMPIMANCANT = IDL.Add(IDL.Add(v_CAMPIMANCANT, v_MODALITA), (new IDVariant("<BR/>")));
          }
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.CODICE as TIPALLARTCOD, ");
          SQL.append("  A.DESCRIZIONE as TIPALLARTDES ");
          SQL.append("from ");
          SQL.append("  TIPI_ALLEGATO_ART18 A ");
          SQL.append("where (A.CODICE NOT IN ");
          SQL.append("( ");
          SQL.append("select ");
          SQL.append("  B.COD_TIPO_ALLEGATO ");
          SQL.append("from ");
          SQL.append("  ALLEGATI_LIQ_ART18 B ");
          SQL.append("where (B.PROGR_DETTAGLIO = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_DETTALIQART1, IMDBDef17.PQSL_DETTALIQART1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append(")) ");
          C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C8.EOF()) C8.MoveNext();
          while (!C8.EOF())
          {
            v_ALLEGAMANCAN = IDL.Add(IDL.Add(v_ALLEGAMANCAN, C8.Get("TIPALLARTDES")), (new IDVariant("<BR/>")));
            C8.MoveNext();
          }
          C8.Close();
          if (!(IDL.IsNull(v_CAMPIMANCANT)) || !(IDL.IsNull(v_ALLEGAMANCAN)))
          {
            v_AVVISNONBLOC = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ATTENZIONE, (new IDVariant(PAN_DATIBENEFICI.FieldText(PFL_DATIBENEFICI_PROGRESSIVO1)))), v_NONSONOINDIC), (new IDVariant("<BR/>"))), ((v_CAMPIMANCANT.equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.Add(v_SEGUENTCAMPI, (new IDVariant("<BR/>"))), v_CAMPIMANCANT))), ((v_ALLEGAMANCAN.equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.Add(v_SEGUENALLEGA, (new IDVariant("<BR/>"))), v_ALLEGAMANCAN)));
            if (!(MainFrm.MessageConfirm(v_AVVISNONBLOC)))
            {
              return 0;
            }
          }
        }
      }
      if (new IDVariant(PAN_DATIBENEFICI.Status()).equals((new IDVariant(3)), true) && !(PAN_DATIBENEFICI.IsPanelInError()))
      {
        PAN_DATIBENEFICI.PanelCommand(Glb.PCM_UPDATE);
        if (new IDVariant(PAN_DATIBENEFICI.Status()).equals((new IDVariant(3)), true))
        {
          return 0;
        }
      }
      if (new IDVariant(PAN_ALLEGATI.Status()).equals((new IDVariant(3)), true) && !(PAN_ALLEGATI.IsPanelInError()))
      {
        PAN_ALLEGATI.PanelCommand(Glb.PCM_UPDATE);
        if (new IDVariant(PAN_ALLEGATI.Status()).equals((new IDVariant(3)), true))
        {
          return 0;
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Da Pubblicare
  // **********************************************************************
  public int AbilitazioneDaPubblicare ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TIPOESEC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPOBB = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNODEL1 = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Da Pubblicare Body
      // Procedure Body
      // 
      v_IMPOBB = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPEGNO_OBBLIG as IMPIMPEGOBBL, ");
      SQL.append("  A.ANNO_DEL as SUBIMANNODEL ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPOBB = QV.Get("IMPIMPEGOBBL", IDVariant.STRING) ;
        v_ANNODEL1 = QV.Get("SUBIMANNODEL", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.IsNull(v_ANNODEL1))
      {
        if (IDL.IsNull(v_IMPOBB))
        {
          PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        v_TIPOESEC = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.P_D_E as T10PDE ");
        SQL.append("from ");
        SQL.append("  T10 A, ");
        SQL.append("  DEL B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.NUMERO_DEL = C.NUMERO_DEL) ");
        SQL.append("and   (B.ANNO_DEL = C.ANNO_DEL) ");
        SQL.append("and   (B.SEDE_DEL = C.SEDE_DEL) ");
        SQL.append("and   (B.TIPO_ESEC = A.CODICE) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_TIPOESEC = QV.Get("T10PDE", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_TIPOESEC.compareTo((new IDVariant("E")), true)!=0)
        {
          PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_DATIBENEFICI.SetFlags (Glb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "AbilitazioneDaPubblicare", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dati Ben Associati In Distinta
  // **********************************************************************
  public boolean DatiBenAssociatiInDistinta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Ben Associati In Distinta Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  DETTAGLI_LIQ_ART18 B ");
      SQL.append("where (B.TIPO IN ('DO', 'DL', 'DD', 'DOW', 'DLW', 'DDW')) ");
      SQL.append("and   (B.ANNO = A.ANNO_DISTINTA) ");
      SQL.append("and   (B.NUMERO = A.NUMERO_DISTINTA) ");
      SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI421, IMDBDef7.FLD_PARAMETRI421_PARAMNUMERO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
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
      MainFrm.ErrObj.ProcError ("DatiBeneficiario", "DatiBenAssociatiInDistinta", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATIBENEFICI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATIBENEFICI, Cancel);
    // Stub
  }

  private void PAN_DATIBENEFICI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DATIBENEFICI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DATIBENEFICI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DATIBENEFICI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATIBENEFICI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ALLEGATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ALLEGATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ALLEGATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ALLEGATI, Cancel);
    // Stub
  }

  private void PAN_ALLEGATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ALLEGATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ALLEGATI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ALLEGATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_ALLEGLIQART1, IMDBDef17.PQSL_ALLEGLIQART1_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_ALLEGATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATIBENEFICI_Init()
  {

    PAN_DATIBENEFICI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATIBENEFICI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATIBENEFICI.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, "4CE5CC4D-0B39-401D-B0DF-21D93526A0F7");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, "Progressivo");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.VIS_INTE10NORFIE);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, "F1E56A12-909D-4D97-8D35-04324465DE5B");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, "Beneficiario");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, "FB91204D-EFBD-4C7E-A35E-E36F0CA66FBF");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, "NUMERO DOCUMENTO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, "95A53E62-4EC2-42F0-80E6-6A10555D695F");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, "DATA DOCUMENTO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, "35A41940-D9EA-4221-AB07-685307DA99B3");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, "Importo");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, "9F02B87E-1BD0-45B0-99DC-D45EFA3B0362");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, "Ufficio");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, "F4659DF0-167B-483B-AD8B-8FD66280B455");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, "Responsabile");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, "938A0689-A611-4251-81B3-35DE699F1E1E");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, "Norma");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, "2E1EF35B-8B87-4363-AC45-93ACC315883D");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, "Da Pubblicare");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.VIS_CHECKSTYLE);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, "4CD438DF-FDF8-42A7-AF4C-4A625D6B7042");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, "Pubblicato");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.VIS_CHECKSTYLE);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, "D8E82678-4261-4FA6-8FAE-93141F08AA58");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, "Modalità Identif. Ben.");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, "AF071002-BC15-41F1-A18B-D207CE3B159A");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, "Note");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, "215204C4-A15E-4461-A886-FE12489D247F");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, "ANNO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, 0, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, "74E575E4-B567-4E12-B2A4-8F51A935FE4C");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, "NUMERO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, 0, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, "13353AEF-AB84-45AD-923E-9C15B142E5FC");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, "TIPO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, "81E92B6B-6380-4C44-82A7-1B57864569B0");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, "COD BENEFICIARIO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.VIS_NONNULLAFIEL);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, 0, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, "1B7531B0-A0DC-43F7-8999-4A022C64969B");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, "PROGR PK DOC");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, "79734343-3496-4809-AB5B-C38AE4CFE434");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, "ANNO PK DOC");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, "6DF89FB3-5DCF-4095-A8D9-C0D81C4A810A");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, "4B8BDD8F-B647-4A52-B734-CEC6D2B1BB26");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, "556FA051-05D1-4324-80C2-99419258214E");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, "91494677-A1D1-4AA2-AF0F-E6E2431EB7DA");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, "7DE9F51A-4BF7-4703-BF52-146594964007");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, "INSERIMENTO MANUALE");
    PAN_DATIBENEFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, "");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, "FEB791F7-BC13-437B-A7CF-B30423842BA5");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, "/");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATIBENEFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, "66F2C7BC-8C6D-4650-915F-EB9DD50276E4");
    PAN_DATIBENEFICI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, "Documento");
    PAN_DATIBENEFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.VIS_VUOTONORMALE);
    PAN_DATIBENEFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_DATIBENEFICI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_LIST, "Progr.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_FORM, 8, 4, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRESSIVO1, MyGlb.PANEL_FORM, "Progressivo");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_PROGRESSIVO1, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_PROGRESSIVO1, PPQRY_DETTALIQART1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_LIST, 4, 204, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_FORM, 60, 28, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_FORM, 76);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RAGIOSOCIBEN, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_RAGIOSOCIBEN, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_RAGIOSOCIBEN, PPQRY_DETTALIQART1, "A.RAGIONE_SOCIALE_BEN", "RAGIONE_SOCIALE_BEN", 5, 100, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_LIST, "NUMERO DOCUMENTO");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_FORM, 140, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERODOCUME, MyGlb.PANEL_FORM, "NUMERO DOCUMENTO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_NUMERODOCUME, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_NUMERODOCUME, PPQRY_DETTALIQART1, "A.NUMERO_DOCUMENTO", "NUMERO_DOCUMENTO", 5, 20, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_LIST, 112);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_LIST, "DATA DOCUMENTO");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_FORM, 308, 52, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATADOCUMENT, MyGlb.PANEL_FORM, "DATA DOCUMENTO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_DATADOCUMENT, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_DATADOCUMENT, PPQRY_DETTALIQART1, "A.DATA_DOCUMENTO", "DATA_DOCUMENTO", 6, 10, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_FORM, 80, 76, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_IMPORTO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_IMPORTO, PPQRY_DETTALIQART1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_LIST, 4, 228, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_LIST, 2);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_FORM, 80, 100, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_UFFICIO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_UFFICIO, PPQRY_DETTALIQART1, "A.UFFICIO", "UFFICIO", 5, 200, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_LIST, 4, 252, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_LIST, 2);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_FORM, 52, 124, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_FORM, 84);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_RESPONSABILE, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_RESPONSABILE, PPQRY_DETTALIQART1, "A.RESPONSABILE", "RESPONSABILE", 5, 200, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_LIST, 4, 276, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_LIST, 2);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_LIST, "Norma");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_FORM, 88, 148, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_FORM, 48);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NORMA, MyGlb.PANEL_FORM, "Norma");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_NORMA, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_NORMA, PPQRY_DETTALIQART1, "A.NORMA", "NORMA", 5, 200, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_LIST, 96);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_LIST, "Da Pubbl.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_FORM, 48, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_FORM, 88);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DAPUBBLICARE, MyGlb.PANEL_FORM, "Da Pubblicare");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_DAPUBBLICARE, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_DAPUBBLICARE, PPQRY_DETTALIQART1, "A.DA_PUBBLICARE", "DA_PUBBLICARE", 5, 2, 0, -13997);
    PAN_DATIBENEFICI.SetValueListItem(PFL_DATIBENEFICI_DAPUBBLICARE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DATIBENEFICI.SetValueListItem(PFL_DATIBENEFICI_DAPUBBLICARE, (new IDVariant()), "Null", "", "", -1);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_LIST, 80);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_LIST, "Pubbl.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_FORM, 444, 172, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_FORM, 68);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PUBBLICATO, MyGlb.PANEL_FORM, "Pubblicato");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_PUBBLICATO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_PUBBLICATO, PPQRY_DETTALIQART1, "A.PUBBLICATO", "PUBBLICATO", 5, 2, 0, -13997);
    PAN_DATIBENEFICI.SetValueListItem(PFL_DATIBENEFICI_PUBBLICATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DATIBENEFICI.SetValueListItem(PFL_DATIBENEFICI_PUBBLICATO, (new IDVariant()), "Null", "", "", -1);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_LIST, 68);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_LIST, 2);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_LIST, "Modalità Identif. Ben.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_FORM, 8, 196, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_MODALITA, MyGlb.PANEL_FORM, "Modalità Identif. Ben.");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_MODALITA, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_MODALITA, PPQRY_DETTALIQART1, "A.MODALITA", "MODALITA", 5, 2000, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_LIST, 36);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_FORM, 100, 220, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_FORM, 36);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_NOTE1, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_NOTE1, PPQRY_DETTALIQART1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_LIST, "ANNO");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_FORM, 188, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_FORM, 56);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNO, MyGlb.PANEL_FORM, "ANNO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_ANNO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_ANNO, PPQRY_DETTALIQART1, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_LIST, 56);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_LIST, "NUM.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_FORM, 300, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_FORM, 72);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_NUMERO, MyGlb.PANEL_FORM, "NUMERO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_NUMERO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_NUMERO, PPQRY_DETTALIQART1, "A.NUMERO", "NUMERO", 1, 6, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_FORM, 428, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_TIPO, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_TIPO, PPQRY_DETTALIQART1, "A.TIPO", "TIPO", 5, 5, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_LIST, 112);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_LIST, "COD BEN.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_CODBENEFICIA, MyGlb.PANEL_FORM, "COD BENEFICIARIO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_CODBENEFICIA, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_CODBENEFICIA, PPQRY_DETTALIQART1, "A.COD_BENEFICIARIO", "COD_BENEFICIARIO", 2, 15, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_LIST, 92);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_LIST, "PR. P. DOC");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_PROGRPKDOC, MyGlb.PANEL_FORM, "PROGR PK DOC");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_PROGRPKDOC, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_PROGRPKDOC, PPQRY_DETTALIQART1, "A.PROGR_PK_DOC", "PROGR_PK_DOC", 1, 4, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_LIST, 84);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_LIST, "ANN. P. DC.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_FORM, 188, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_FORM, 96);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ANNOPKDOC, MyGlb.PANEL_FORM, "ANNO PK DOC");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_ANNOPKDOC, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_ANNOPKDOC, PPQRY_DETTALIQART1, "A.ANNO_PK_DOC", "ANNO_PK_DOC", 1, 5, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 196, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 144);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_UTENTEINSERI, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_UTENTEINSERI, PPQRY_DETTALIQART1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_DATAINSERIME, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_DATAINSERIME, PPQRY_DETTALIQART1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 236, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_UTENTULTIAGG, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_UTENTULTIAGG, PPQRY_DETTALIQART1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_DATAULTIMAGG, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_DATAULTIMAGG, PPQRY_DETTALIQART1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_LIST, 140);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_LIST, "INS. MAN.");
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_FORM, 228, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_FORM, 152);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_INSERIMANUAL, MyGlb.PANEL_FORM, "INSERIMENTO MANUALE");
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_INSERIMANUAL, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_INSERIMANUAL, PPQRY_DETTALIQART1, "A.INSERIMENTO_MANUALE", "INSERIMENTO_MANUALE", 5, 2, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_LIST, 304, 88, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_LIST, 0);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_FORM, 288, 52, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_FORM, 0);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICBARRDOCU, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_ETICBARRDOCU, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_ETICBARRDOCU, -1, "", "ETICBARRDOCU", 0, 0, 0, -13997);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_LIST, 312, 96, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_LIST, 1);
    PAN_DATIBENEFICI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_FORM, 52, 52, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIBENEFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_DATIBENEFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIBENEFICI_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_DATIBENEFICI.SetFieldPage(PFL_DATIBENEFICI_ETICHEDOCUME, -1, -1);
    PAN_DATIBENEFICI.SetFieldPanel(PFL_DATIBENEFICI_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
  }

  private void PAN_DATIBENEFICI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATIBENEFICI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATIBENEFICI.SetIMDB(IMDB, "PQRY_DETTALIQART1", true);
    PAN_DATIBENEFICI.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI LIQ ART18");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.COD_BENEFICIARIO as COD_BENEFICIARIO, ");
    SQL.append("  A.RAGIONE_SOCIALE_BEN as RAGIONE_SOCIALE_BEN, ");
    SQL.append("  A.PROGR_PK_DOC as PROGR_PK_DOC, ");
    SQL.append("  A.ANNO_PK_DOC as ANNO_PK_DOC, ");
    SQL.append("  A.NUMERO_DOCUMENTO as NUMERO_DOCUMENTO, ");
    SQL.append("  A.DATA_DOCUMENTO as DATA_DOCUMENTO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.RESPONSABILE as RESPONSABILE, ");
    SQL.append("  A.NORMA as NORMA, ");
    SQL.append("  A.DA_PUBBLICARE as DA_PUBBLICARE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.INSERIMENTO_MANUALE as INSERIMENTO_MANUALE, ");
    SQL.append("  A.PUBBLICATO as PUBBLICATO, ");
    SQL.append("  A.MODALITA as MODALITA, ");
    SQL.append("  A.NOTE as NOTE ");
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DETTAGLI_LIQ_ART18 A ");
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO = ~~TBL_PARAMETRI421.PARAMANNO~~) ");
    SQL.append("and   (A.NUMERO = ~~TBL_PARAMETRI421.PARAMNUMERO~~) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI421.PARAMTIPO~~) ");
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIBENEFICI.SetQuery(PPQRY_DETTALIQART1, 5, SQL, -1, "");
    PAN_DATIBENEFICI.SetQueryDB(PPQRY_DETTALIQART1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATIBENEFICI.SetMasterTable(0, "DETTAGLI_LIQ_ART18");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATIBENEFICI.Status() == 2)
    {
      int oldListQBE = PAN_DATIBENEFICI.iUseListQBE;
      PAN_DATIBENEFICI.iUseListQBE = 0;
      PAN_DATIBENEFICI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATIBENEFICI.PanelCommand(Glb.PCM_FIND);
      PAN_DATIBENEFICI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ALLEGATI_Init()
  {

    PAN_ALLEGATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ALLEGATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ALLEGATI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, "19845231-F542-4979-AAF5-1039785EB252");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, "PROGRESSIVO");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, "A41DEA0B-CF8E-4C63-8840-764A70891983");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, "PROGR DETTAGLIO");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.VIS_NONNULLAFIEL);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, 0, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, "EA3BC36E-94A7-4B33-8BFC-98D24AD82278");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, "Descrizione");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, "17AC408C-7581-4ACD-853E-17E43456242D");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, "Note");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, "9CA5140E-181B-4E4F-ABDF-5DFE6457C7B1");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, "Allegato");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, "12BE5278-4DF7-4CEC-812A-E24DE8762E7A");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, "DESCR TIPO ALLEGATO");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.VIS_NONNULLAFIEL);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, 0, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, "436EA45D-C71D-4E1B-A202-431B3D8CB95A");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, "NOME FILE");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ALLEGATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 44, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_PROGRESSIVO, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_PROGRESSIVO, PPQRY_ALLEGLIQART1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_LIST, 0, 44, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_LIST, 116);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_LIST, "PR. DETT.");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_PROGRDETTAGL, MyGlb.PANEL_FORM, "PROGR DETTAGLIO");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_PROGRDETTAGL, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_PROGRDETTAGL, PPQRY_ALLEGLIQART1, "A.PROGR_DETTAGLIO", "PROGR_DETTAGLIO", 3, 10, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_LIST, 0, 44, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_LIST, 124);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODTIPOALLEG, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_CODTIPOALLEG, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_CODTIPOALLEG, PPQRY_ALLEGLIQART1, "A.COD_TIPO_ALLEGATO", "COD_TIPO_ALLEGATO", 1, 5, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_LIST, 88, 44, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_FORM, 4, 100, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_NOTE, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_NOTE, PPQRY_ALLEGLIQART1, "A.NOTE", "NOTE", 5, 200, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_LIST, 352, 44, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_LIST, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_LIST, "Allegato");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_FORM, 4, 124, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_FORM, 2);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_FILEDATI, MyGlb.PANEL_FORM, "Allegato");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_FILEDATI, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_FILEDATI, PPQRY_ALLEGLIQART1, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_LIST, 128, 44, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_LIST, 136);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_LIST, "DESCR TIPO ALLEGATO");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_FORM, 4, 76, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCTIPOALLE, MyGlb.PANEL_FORM, "DES. TIPO ALLEGATO");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_DESCTIPOALLE, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_DESCTIPOALLE, PPQRY_ALLEGLIQART1, "A.DESCR_TIPO_ALLEGATO", "DESCR_TIPO_ALLEGATO", 5, 30, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_LIST, 0, 44, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_LIST, 68);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_LIST, "NOME FILE");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_FORM, 4, 172, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_FORM, 68);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_NOMEFILE, MyGlb.PANEL_FORM, "NOME FILE");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_NOMEFILE, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_NOMEFILE, PPQRY_ALLEGLIQART1, "A.NOME_FILE", "NOME_FILE", 5, 100, 0, -13997);
  }

  private void PAN_ALLEGATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ALLEGATI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPALLARTCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPALLARTDES ");
    SQL.append("from ");
    SQL.append("  TIPI_ALLEGATO_ART18 A ");
    SQL.append("where (A.CODICE = ~~COD_TIPO_ALLEGATO~~) ");
    PAN_ALLEGATI.SetQuery(PPQRY_TIPIALLEART1, 0, SQL, PFL_ALLEGATI_CODTIPOALLEG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPALLARTCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPALLARTDES ");
    SQL.append("from ");
    SQL.append("  TIPI_ALLEGATO_ART18 A ");
    PAN_ALLEGATI.SetQuery(PPQRY_TIPIALLEART1, 1, SQL, PFL_ALLEGATI_CODTIPOALLEG, "");
    PAN_ALLEGATI.SetQueryDB(PPQRY_TIPIALLEART1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ALLEGATI.SetIMDB(IMDB, "PQRY_ALLEGLIQART1", true);
    PAN_ALLEGATI.set_SetString(MyGlb.MASTER_ROWNAME, "ALLEGATI LIQ ART18");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.PROGR_DETTAGLIO as PROGR_DETTAGLIO, ");
    SQL.append("  A.COD_TIPO_ALLEGATO as COD_TIPO_ALLEGATO, ");
    SQL.append("  A.DESCR_TIPO_ALLEGATO as DESCR_TIPO_ALLEGATO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI, ");
    SQL.append("  A.NOME_FILE as NOME_FILE ");
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ALLEGATI_LIQ_ART18 A ");
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_DETTAGLIO = ~~PQRY_DETTALIQART1.PROGRESSIVO~~) ");
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_ALLEGLIQART1, 5, SQL, -1, "");
    PAN_ALLEGATI.SetQueryDB(PPQRY_ALLEGLIQART1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ALLEGATI.SetMasterTable(0, "ALLEGATI_LIQ_ART18");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ALLEGATI.Status() == 2)
    {
      int oldListQBE = PAN_ALLEGATI.iUseListQBE;
      PAN_ALLEGATI.iUseListQBE = 0;
      PAN_ALLEGATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ALLEGATI.PanelCommand(Glb.PCM_FIND);
      PAN_ALLEGATI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_ValidateRow(Cancel);
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_DynamicProperties();
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_OnChangeStatus(OldStatus);
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_BeforeBlobUpdate(Cancel, Column, Size, Extension, FilePath);
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
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DATIBENEFICI) PAN_DATIBENEFICI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
