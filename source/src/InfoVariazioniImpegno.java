// **********************************************
// Info Variazioni Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoVariazioniImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIONI_PROVVEDIMENT = 0;
  private static int GRP_VARIAZIONI_VARIAZCRONOP = 1;
  private static int GRP_VARIAZIONI_INSERIMENTO = 2;
  private static int GRP_VARIAZIONI_AGGIORNAMENT = 3;

  private static int PFL_VARIAZIONI_ANNOVAR = 0;
  private static int PFL_VARIAZIONI_DESCRIZIONE = 1;
  private static int PFL_VARIAZIONI_IMPORTO = 2;
  private static int PFL_VARIAZIONI_DATA = 3;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 4;
  private static int PFL_VARIAZIONI_DELIBERA = 5;
  private static int PFL_VARIAZIONI_NUMERODEL = 6;
  private static int PFL_VARIAZIONI_ANNODEL = 7;
  private static int PFL_VARIAZIONI_INFODELIBER2 = 8;
  private static int PFL_VARIAZIONI_PROPOSTA = 9;
  private static int PFL_VARIAZIONI_NUMEROPROPOS = 10;
  private static int PFL_VARIAZIONI_ANNOPROPOSTA = 11;
  private static int PFL_VARIAZIONI_TRATTINO2 = 12;
  private static int PFL_VARIAZIONI_BARRA2 = 13;
  private static int PFL_VARIAZIONI_BARRA3 = 14;
  private static int PFL_VARIAZIONI_TRATTINO1 = 15;
  private static int PFL_VARIAZIONI_INFODELIBERA = 16;
  private static int PFL_VARIAZIONI_INFOPROPOST1 = 17;
  private static int PFL_VARIAZIONI_LABELVUOTA = 18;
  private static int PFL_VARIAZIONI_INFOPROPOSTA = 19;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 20;
  private static int PFL_VARIAZIONI_ANNOENTRATA = 21;
  private static int PFL_VARIAZIONI_FINANZIAMENT = 22;
  private static int PFL_VARIAZIONI_TIPOAVANZO = 23;
  private static int PFL_VARIAZIONI_CRONOPROGRAM = 24;
  private static int PFL_VARIAZIONI_ANNOESIGCRON = 25;
  private static int PFL_VARIAZIONI_ANNOENTRCRON = 26;
  private static int PFL_VARIAZIONI_FINANZDESTIN = 27;
  private static int PFL_VARIAZIONI_VARIBILAGENE = 28;
  private static int PFL_VARIAZIONI_IMPOTOTAVARI = 29;
  private static int PFL_VARIAZIONI_CODREC = 30;
  private static int PFL_VARIAZIONI_ANNOIMP = 31;
  private static int PFL_VARIAZIONI_NUMEROIMP = 32;
  private static int PFL_VARIAZIONI_CAPITOLO1 = 33;
  private static int PFL_VARIAZIONI_ARTICOLO = 34;
  private static int PFL_VARIAZIONI_LABELDELIBER = 35;
  private static int PFL_VARIAZIONI_LABELPROPOST = 36;
  private static int PFL_VARIAZIONI_ESTREMIMPEGN = 37;
  private static int PFL_VARIAZIONI_IMPEGNO = 38;
  private static int PFL_VARIAZIONI_BARRA = 39;
  private static int PFL_VARIAZIONI_CAPITOLO = 40;
  private static int PFL_VARIAZIONI_BARRA1 = 41;
  private static int PFL_VARIAZIONI_INFOPEG = 42;
  private static int PFL_VARIAZIONI_INFOIMPEGNO = 43;
  private static int PFL_VARIAZIONI_INFOFINANZIA = 44;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 45;
  private static int PFL_VARIAZIONI_VARIAZGENERA = 46;
  private static int PFL_VARIAZIONI_UTENTEINSERI = 47;
  private static int PFL_VARIAZIONI_DATAINSERIME = 48;
  private static int PFL_VARIAZIONI_UTENTULTIAGG = 49;
  private static int PFL_VARIAZIONI_DATAULTIMAGG = 50;

  private static int PPQRY_VARIMP11 = 0;

  private static int PPQRY_DEL = 1;
  private static int PPQRY_PROPOSTE = 2;
  private static int PPQRY_CRONOPROGRAM = 3;
  private static int PPQRY_VARPIANICRON = 4;

  private static int PPQRY_T56 = 5;
  private static int PPQRY_IMPFIN1 = 6;
  private static int PPQRY_TIPIAVANZO = 7;
  private static int PPQRY_FINANZIAMENT = 8;
  private static int PPQRY_DUAL1 = 9;
  private static int PPQRY_DUAL = 10;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARIAZIONI(IMDB);
    //
    //
    Init_PQRY_VARIMP11(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARIAZIONI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZIONI, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZIONI, "TBL_VARIAZIONI");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMEPROGR,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI,IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP,5,250,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VARIAZIONI, 0);
  }

  private static void Init_PQRY_VARIMP11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARIMP11, 31);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARIMP11, "PQRY_VARIMP11");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIINFODELI, "VARIINFODELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIINFODELI,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIINFOPROP, "VARIINFOPROP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIINFOPROP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIAZIONE_GENERATA, "VARIAZIONE_GENERATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIAZIONE_GENERATA,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_ENTRATA, "ANNO_ENTRATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_ANNO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARITIPOAVAN, "VARITIPOAVAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARITIPOAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARANNESICRO, "VARANNESICRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARANNESICRO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARANNENTCRO, "VARANNENTCRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARANNENTCRO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIFINADEST, "VARIFINADEST");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP11,IMDBDef13.PQSL_VARIMP11_VARIFINADEST,1,5,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARIMP11, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoVariazioniImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoVariazioniImpegno()
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
    FormIdx = MyGlb.FRM_INFOVARIIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7CAA349E-A277-4763-9247-D1909D819C47";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 840;
    DesignHeight = 586;
    set_Caption(new IDVariant("Info Variazioni Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 840;
    Frames[1].Height = 560;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 560;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 840-MyGlb.PAN_OFFS_X, 560-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6C1DF5DD-ABAB-4F7F-96D0-D600826542DC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 52, 2398, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoVariazioniImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoVariazioniImpegno.class.getName() : (Glb.ClassWithPackage(InfoVariazioniImpegno.class) ? InfoVariazioniImpegno.class.getName().substring(InfoVariazioniImpegno.class.getPackage().getName().length() + 1) : InfoVariazioniImpegno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Event Body
      // Procedure Body
      // 
      // 
      // Command = Form List
      // 
      if (Command.equals((new IDVariant(1)), true))
      {
        if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_PROGRESSIVO, 0)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "VariazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Find Event Body
      // Procedure Body
      // 
      CalcolaTotaleVariazione();
      GestioneCampoFinanziamento();
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP, 0)))
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNO = (new IDVariant("Impegno : "));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP, 0, new IDVariant(v_DESCRIZIONE));
        PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMIMPEGN, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_IMPEGNO, IDL.ToString(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_IMP, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_IMP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP, 0)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "VariazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAZIONI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Change Row Event Body
      // Procedure Body
      // 
      GestioneCampoFinanziamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "VariazioniOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_IMP, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_PROPOSTA, 0))))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOAVANZO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOAVANZO))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_DEL, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_FINANZIAMENTO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_VARIBILAGENE))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "VariazioniOnDynamicPropertiesEvent", _e);
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
    IDVariant v_TOOLTIP1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP5 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP6 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP7 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP1 = (new IDVariant("Scelta Impegno", IDVariant.STRING));
      v_TOOLTIP = (new IDVariant("Informazioni Impegno", IDVariant.STRING));
      v_TOOLTIP2 = (new IDVariant("Informazioni Voce di Bilancio", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Variazioni", IDVariant.STRING));
      v_IMPEGNO = (new IDVariant("Impegno : ", IDVariant.STRING));
      v_TOOLTIP3 = (new IDVariant("Selezione Delibera", IDVariant.STRING));
      v_TOOLTIP5 = (new IDVariant("Informazioni Delibera", IDVariant.STRING));
      v_TOOLTIP6 = (new IDVariant("Informazioni Proposta", IDVariant.STRING));
      v_TOOLTIP7 = (new IDVariant("Informazioni Finanziamento", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOIMPEGNO,v_TOOLTIP.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPEG,v_TOOLTIP2.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFODELIBERA,v_TOOLTIP5.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPROPOST1,v_TOOLTIP6.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOFINANZIA,v_TOOLTIP7.stringValue()); 
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMEPROGR, 0))))
      {
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      else
      {
        PAN_VARIAZIONI.set_Layout((new IDVariant(0)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "LoadEvent", _e);
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
      UNLOADEVENT_VARIAZDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_VARIAZDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMDESIMP, 0, new IDVariant());
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Gestione Campo Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int GestioneCampoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gestione Campo Finanziamento Body
      // Procedure Body
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (PAN_VARIAZIONI.IsNewRow())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "GestioneCampoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "InfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, ((IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_ANNO_IMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))?(new IDVariant("INFO")):(new IDVariant("INFORES"))));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totale Variazione
  // **********************************************************************
  public int CalcolaTotaleVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Calcola Totale Variazione Body
      // Procedure Body
      // 
      v_SOMMA = PAN_VARIAZIONI.GetFieldSum(PFL_VARIAZIONI_IMPORTO);
      if (v_SOMMA.compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMTOTDISROS).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMPTOTADISA).intValue()); 
      }
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_IMPOTOTAVARI, IDL.ToString(v_SOMMA).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioniImpegno", "CalcolaTotaleVariazione", _e);
      return -1;
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBER2)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPOST1)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_LABELVUOTA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP11, IMDBDef13.PQSL_VARIMP11_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "F4B8872F-A4FD-430B-A0A1-E793CC11BB2E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_LIST, 692, -9999, 340, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_FORM, 24, 155, 628, 57, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 87);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "A0FDC8A7-AC6D-4DA6-9915-A0BB1ACB6C80");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "Variazioni Cronoprogramma");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.PANEL_LIST, 1716, -9999, 682, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.PANEL_FORM, 24, 295, 556, 121, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0, 158);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "EE04F094-299C-44DB-9AFA-C270C1F1A689");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "Inserimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_FORM, 36, 431, 304, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 70);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "BB9D84C8-5244-44B7-AC52-DDCA4862DC68");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "Aggiornamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_FORM, 360, 431, 300, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 88);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 51);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "44DBBD85-1118-40D9-A3A3-7C6687115128");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "Anno Var.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 0, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 0, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "DF49B894-B105-410A-AF79-164B1C925825");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 1, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 1, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "11BBC53B-A203-4215-8926-A21AC03D4CEE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO, 2, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO, 2, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "F26B2544-8197-450A-986E-FF7D6F52E4E2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 3, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 3, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "4CB88935-0842-4F4A-905A-A74EE265BF12");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 4, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 4, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "61E5C6C4-12F1-4A7F-AAC7-C15511B0815C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Sede del");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 5, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 5, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "6DDA73BC-46D7-4A2C-BA54-1B67A8C74AF8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "NUMERO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL, 6, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL, 6, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "99E6B6B0-395E-48C2-99CD-6799036941ED");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "ANNO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL, 7, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL, 7, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, "579BC07A-C162-4178-A2E3-BABA62685401");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, "Info Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, "Informazioni Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER2, 8, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER2, 8, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "51F04138-CF39-488E-BB26-E2EF3A12B5F7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 9, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 9, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "2B247FC6-D07B-4F86-95AB-A123AFC8C1B6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPOS, 10, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPOS, 10, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "1D0CF9E9-2589-4033-AA3B-8C32F3CA4504");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOSTA, 11, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOSTA, 11, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "7974731B-0E61-48F2-BCA2-2E3DD6365F85");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 12, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 12, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "707CFA13-FAA0-4389-AA20-4C629CAD9372");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 13, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 13, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "2ABF80F6-CE87-4703-ABDA-0C8B12F1F471");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 14, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 14, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "CB7087FF-93CD-44C3-B142-F3F376908964");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 15, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 15, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "4AABC5DD-3E4D-4627-8EBA-A98E9B6FD723");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 16, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 16, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "DF1C32E1-BE6C-4591-8B84-B0CA55AB1005");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 17, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 17, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "7A81E338-F0EA-4EEB-8FCF-03FE86B33CCE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 18, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 18, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "D580E880-F376-4374-A6E7-8543F6FCCE98");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "Info Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "Informazioni Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 19, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 19, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "D8F0CD87-9126-4780-A0FB-4D187A308124");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 20, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 20, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "43EF7F4A-7C70-41B3-AB2C-1EFBFBE32681");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "Anno Entrata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 21, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 21, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "70C09C0F-CFD1-46F4-B90B-6DB05F53A79A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 22, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 22, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "5EEF8F03-ED9D-42B2-A223-537360EBD368");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "Tipo Avanzo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 23, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 23, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "4B530C54-C662-4BDC-B112-844A2E33A9DA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "Cronoprogramma");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CRONOPROGRAM, 24, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CRONOPROGRAM, 24, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "9B1A010E-8380-48F4-B336-5332128348FF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGCRON, 25, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGCRON, 25, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "E65DC8BE-AE86-4249-9FD2-976E3B991737");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "Anno Entrata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRCRON, 26, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRCRON, 26, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "56978D89-EFC8-4535-9E9D-CB6942E96C50");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZDESTIN, 27, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZDESTIN, 27, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "1746DE36-9F1D-479F-86AB-03B7DD232236");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIBILAGENE, 28, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIBILAGENE, 28, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "FBE17541-DFBC-42E1-907E-8EBBAB42B161");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "ddd");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 29, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 29, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "0201F238-8698-48DF-A015-8FABDDFF8820");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "COD REC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, 0, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 48, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 48, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "329A1E2B-68AA-40C1-ABE6-23D2EEEBA4FE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "ANNO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "Anno Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP, 30, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP, 30, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "F5E70B3A-D8C4-4C37-9AFE-3615643C3C10");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "NUMERO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "Numero Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 31, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 31, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "E30789AD-DB10-413A-8A62-C33D03F10550");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "CAPITOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO1, 32, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO1, 32, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "369E63F6-DF81-4012-B119-3EB2B08671D6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Articolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 33, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 33, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "73CAE06E-EBC8-4CF7-A51C-985BE1628FA5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 34, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 34, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "73902A2E-A246-47C0-8A82-0F0C745DD716");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 35, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 35, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "A09B5588-641B-41B8-B072-706BD5DBC190");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 36, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 36, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "27B34A8E-0AA2-40D0-8865-EA2C6218EF64");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPEGNO, 37, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPEGNO, 37, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "B3AA1A04-894D-400A-A179-F1A5D7682FA6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 38, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 38, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "C0416EB5-9D36-4BCF-AD2B-B92A68EA1CE0");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 39, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 39, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "39E0A34A-3AC7-451B-9B79-8EBF57B34FBB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 40, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 40, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "06F57BC0-FC0C-46B9-89D7-A8012742037E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 41, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 41, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, "AD03242A-48A3-4B28-9FCD-DEEB02A1F201");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOIMPEGNO, 42, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOIMPEGNO, 42, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "68C94E36-ECA4-482A-BF4E-AC53EDB8C682");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 43, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 43, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "D77EB32F-35F1-4A84-B11A-2A40DABCB837");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 49, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 49, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "ABC7B1AC-54BB-4E23-A865-2A2A9A2DCB5A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIAZGENERA, 50, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIAZGENERA, 50, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "9EACF541-D52A-48FC-A285-2F6498762109");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 44, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 44, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "0A39C11C-1AD2-4103-A56C-BBE394E8D07B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 45, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 45, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "5D5D0D86-C5DC-48B1-810D-1DFB0A78162E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 46, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 46, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "62D96763-2338-4669-ACC9-65F929FD3A74");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 47, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 47, MyGlb.PANEL_LIST);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 0, 88, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, "Anno Var.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 44, 8, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, "Anno Var.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOVAR, PPQRY_VARIMP11, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 44, 88, 336, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 88, 552, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARIMP11, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 380, 88, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 44, 64, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARIMP11, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 464, 88, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 436, 64, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATA, PPQRY_VARIMP11, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 560, 88, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 12, 124, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARIMP11, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 692, 88, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 52, 180, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA, PPQRY_VARIMP11, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 732, 88, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. D.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 176, 180, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERODEL, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERODEL, PPQRY_VARIMP11, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 780, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, "A. D.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 244, 180, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNODEL, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNODEL, PPQRY_VARIMP11, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 816, 88, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, "I. D.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 4, 224, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, "Info Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBER2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFODELIBER2, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBER2, PPQRY_VARIMP11, "DECODE(A.SEDE_DEL, NULL, NULL, 'E')", "VARIINFODELI", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELIBER2, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELIBER2, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 840, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 320, 180, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA, PPQRY_VARIMP11, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 948, 88, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NM. PR.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 512, 180, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROPROPOS, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROPROPOS, PPQRY_VARIMP11, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 996, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. P.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 576, 180, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOPROPOSTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOPROPOSTA, PPQRY_VARIMP11, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 116, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 492, 180, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 188, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 556, 180, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA2, -1, "", "BARRA2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 476, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 224, 180, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA3, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA3, -1, "", "BARRA3", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 412, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 156, 180, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 272, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 300, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBERA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 564, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 632, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOST1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOST1, -1, "", "INFOPROPOST1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 280, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 28, 192, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELVUOTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELVUOTA, -1, "", "LABELVUOTA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1032, 88, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, "I. Pr.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 4, 252, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, "Info Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOSTA, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOPROPOSTA, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOSTA, PPQRY_VARIMP11, "DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E')", "VARIINFOPROP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPOSTA, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPOSTA, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1056, 88, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 220, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARIMP11, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1124, 88, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 168, 220, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOENTRATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOENTRATA, PPQRY_VARIMP11, "A.ANNO_ENTRATA", "ANNO_ENTRATA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1216, 88, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 16, 244, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZIAMENT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZIAMENT, PPQRY_VARIMP11, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1480, 88, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 24, 268, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOAVANZO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOAVANZO, PPQRY_VARIMP11, "A.TIPO_AVANZO", "VARITIPOAVAN", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 1716, 88, 250, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 144);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, "Cronoprogramma");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 36, 320, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 172);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, "Cronoprogramma");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CRONOPROGRAM, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CRONOPROGRAM, PPQRY_CRONOPROGRAM, "GET_DESC_OPERA_CRONO_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)", "CRONOPROGRAM", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 1966, 88, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 56, 344, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGCRON, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGCRON, PPQRY_VARIMP11, "A.ANNO_ESIGIBILITA_CRONO", "VARANNESICRO", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 2062, 88, 86, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 396, 344, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOENTRCRON, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOENTRCRON, PPQRY_VARIMP11, "A.ANNO_ENTRATA_CRONO", "VARANNENTCRO", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 2148, 88, 250, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 28, 368, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 180);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZDESTIN, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZDESTIN, PPQRY_VARIMP11, "A.FINANZIAMENTO_DESTINAZIONE", "VARIFINADEST", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 2692, 88, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 344);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 212, 392, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 176);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VARIBILAGENE, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VARIBILAGENE, PPQRY_VARPIANICRON, "DECODE(COUNT(*), 0, '', 'Variazione Bilancio Generata')", "VARIBILAGENE", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 380, 292, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 372, 212, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPOTOTAVARI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPOTOTAVARI, -1, "", "IMPOTOTAVARI", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, "COD REC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 4, 204, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, "COD REC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODREC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODREC, PPQRY_VARIMP11, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 536, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 180, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP, PPQRY_VARIMP11, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 596, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 112, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROIMP, PPQRY_VARIMP11, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 740, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 424, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO1, PPQRY_VARIMP11, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 800, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 552, 32, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARIMP11, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 692, 52, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 724, 208, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELDELIBER, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 840, 52, 216, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 732, 216, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELPROPOST, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0, 4, 692, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0, 0, 516, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESTREMIMPEGN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESTREMIMPEGN, -1, "", "ESTREMIMPEGN", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 16, 8, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 44, 32, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 152, 8, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 160, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 24, 16, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 348, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, -1, "", "CAPITOLO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 160, 16, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 532, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA1, -1, "", "BARRA1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 588, 8, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 580, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPEG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 596, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 224, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOIMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 572, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 580, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOFINANZIA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOFINANZIA, -1, "", "INFOFINANZIA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 224, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARIMP11, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 4, 248, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VARIAZGENERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VARIAZGENERA, PPQRY_VARIMP11, "A.VARIAZIONE_GENERATA", "VARIAZIONE_GENERATA", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIAZGENERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIAZGENERA, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 40, 456, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTEINSERI, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTEINSERI, PPQRY_VARIMP11, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 212, 456, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAINSERIME, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAINSERIME, PPQRY_VARIMP11, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 364, 456, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTULTIAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTULTIAGG, PPQRY_VARIMP11, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 544, 456, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 36);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAULTIMAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAULTIMAGG, PPQRY_VARIMP11, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 11);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) as DELDELIBERA, ");
    SQL.append("  'E' as INFODEL ");
    SQL.append("from ");
    SQL.append("  DEL A ");
    SQL.append("where (A.ANNO_DEL = ~~ANNO_DEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~NUMERO_DEL~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~SEDE_DEL~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DEL, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DEL, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO ) || ' / ' || TO_CHAR ( A.ANNO ) as PROPOSPROPOS ");
    SQL.append("from ");
    SQL.append("  PROPOSTE A ");
    SQL.append("where (A.ANNO = ~~ANNO_PROPOSTA~~) ");
    SQL.append("and   (A.UNITA_PROPONENTE = ~~UNITA_PROPONENTE~~) ");
    SQL.append("and   (A.NUMERO = ~~NUMERO_PROPOSTA~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_PROPOSTE, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_PROPOSTE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_PROPOSTE, "PROPOSTE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESC_OPERA_CRONO_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~) as CRONOPROGRAM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~FINANZIAMENTO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_CRONOPROGRAM, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_CRONOPROGRAM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_CRONOPROGRAM, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(COUNT(*), 0, '', 'Variazione Bilancio Generata') as VARIBILAGENE ");
    SQL.append("from ");
    SQL.append("  VAR_PIANI_CRONOPROGRAMMI A ");
    SQL.append("where (A.PROGR_VARIMP_PROVENIENZA = ~~PROGRESSIVO~~) ");
    SQL.append("and   (A.VARIAZIONE_GENERATA = 'SI') ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARPIANICRON, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_VARPIANICRON, "VAR_PIANI_CRONOPROGRAMMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 0, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 1, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 0, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 1, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_IMPFIN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~VARITIPOAVAN~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_VARIAZIONI_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_VARIAZIONI_TIPOAVANZO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~VARIFINADEST~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_VARIAZIONI_FINANZDESTIN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_VARIAZIONI_FINANZDESTIN, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGFOVV, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGFOVV, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARIMP11", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  DECODE(A.SEDE_DEL, NULL, NULL, 'E') as VARIINFODELI, ");
    SQL.append("  DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E') as VARIINFOPROP, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  A.VARIAZIONE_GENERATA as VARIAZIONE_GENERATA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA, ");
    SQL.append("  A.TIPO_AVANZO as VARITIPOAVAN, ");
    SQL.append("  A.ANNO_ESIGIBILITA_CRONO as VARANNESICRO, ");
    SQL.append("  A.ANNO_ENTRATA_CRONO as VARANNENTCRO, ");
    SQL.append("  A.FINANZIAMENTO_DESTINAZIONE as VARIFINADEST ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.NUMERO_IMP = ~~TBL_VARIAZIONI.ROWNAMNUMIMP~~) ");
    SQL.append("and   (A.ANNO_IMP = ~~TBL_VARIAZIONI.ROWNAMANNIMP~~) ");
    SQL.append("and   (A.PROGRESSIVO = NVL(~~TBL_VARIAZIONI.ROWNAMEPROGR~~, A.PROGRESSIVO)) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP11, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARIMP11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIMP");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_DATA, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnChangeRow();
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
