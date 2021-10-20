// **********************************************
// Mandati Collegati Per Compensazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiCollegatiPerCompensazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MANDATI_PROGRESSIVO = 0;
  private static int PFL_MANDATI_NUMEROMAND = 1;
  private static int PFL_MANDATI_INFO = 2;
  private static int PFL_MANDATI_MANDDATAMAND = 3;
  private static int PFL_MANDATI_BENRAGIOSOCI = 4;
  private static int PFL_MANDATI_IMPORTONETTO = 5;
  private static int PFL_MANDATI_ANNOMAND = 6;
  private static int PFL_MANDATI_ANNOORD = 7;
  private static int PFL_MANDATI_NUMEROORD = 8;
  private static int PFL_MANDATI_TOTALEMANDAT = 9;
  private static int PFL_MANDATI_TOTAMANDLABE = 10;
  private static int PFL_MANDATI_IMPORTORDINA = 11;
  private static int PFL_MANDATI_IMPOORDILABE = 12;
  private static int PFL_MANDATI_MANDATOLABEL = 13;
  private static int PFL_MANDATI_UTENTEINSERI = 14;
  private static int PFL_MANDATI_DATAINSERIME = 15;
  private static int PFL_MANDATI_UTENTULTIAGG = 16;
  private static int PFL_MANDATI_DATAULTIMAGG = 17;
  private static int PFL_MANDATI_STATO = 18;

  private static int PPQRY_MANORDCOMMUT = 0;

  private static int PPQRY_MAN = 1;
  private static int PPQRY_LIQ = 2;


  IDPanel PAN_MANDATI;

  // Definition of Global Variables
  private IDVariant IMPORTCALCOL = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant PANNELMODIFI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM181(IMDB);
    Init_TBL_MAN_ORD_COMMUTAZIONE(IMDB);
    //
    //
    Init_PQRY_MANORDCOMMUT(IMDB);
    Init_PQRY_MANORDCOMMUT_RS(IMDB);
    Init_QRY_CFASELINTVA4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM181(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAM181, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAM181, "TBL_PARAM181");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, "ANNO_MAND_CO_COMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, "NUMERO_MAND_CO_COMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_PIMPORTORDIN, "PIMPORTORDIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_PIMPORTORDIN,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_PSOLAINFO, "PSOLAINFO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM181,IMDBDef6.FLD_PARAM181_PSOLAINFO,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAM181, 0);
  }

  private static void Init_TBL_MAN_ORD_COMMUTAZIONE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 11);
    IMDB.set_TblCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, "TBL_MAN_ORD_COMMUTAZIONE");
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA, "MANORDCOMSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA,5,2,0);
  }

  private static void Init_PQRY_MANORDCOMMUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANORDCOMMUT, 11);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANORDCOMMUT, "PQRY_MANORDCOMMUT");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, "MANORDCOMSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT,IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_MANORDCOMMUT, 0);
  }

  private static void Init_PQRY_MANORDCOMMUT_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 11);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANORDCOMMUT_RS, "PQRY_MANORDCOMMUT_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, "MANORDCOMSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANORDCOMMUT_RS,IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA,5,2,0);
  }

  private static void Init_QRY_CFASELINTVA4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_CFASELINTVA4, 1);
    IMDB.set_TblCode(IMDBDef15.QRY_CFASELINTVA4, "QRY_CFASELINTVA4");
    IMDB.set_FldCode(IMDBDef15.QRY_CFASELINTVA4,IMDBDef15.QSL_CFASELINTVA4_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef15.QRY_CFASELINTVA4,IMDBDef15.QSL_CFASELINTVA4_COUNT,1,19,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiCollegatiPerCompensazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiCollegatiPerCompensazione()
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
    FormIdx = MyGlb.FRM_MANCOLPERCOM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3EAD4B49-63AF-42E2-8FA9-7D6138817E42";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 776;
    DesignHeight = 626;
    set_Caption(new IDVariant("Mandati Collegati Per Compensazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 776;
    Frames[1].Height = 600;
    Frames[1].Caption = "Mandati Collegati Per Compensazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 600;
    PAN_MANDATI = new IDPanel(w, this, 1, "PAN_MANDATI");
    Frames[1].Content = PAN_MANDATI;
    PAN_MANDATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATI.VS = MainFrm.VisualStyleList;
    PAN_MANDATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 776-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E40DCC53-32EF-4EA3-BB71-236BF6E5B51E");
    PAN_MANDATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 456, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATI.InitStatus = 2;
    PAN_MANDATI_Init();
    PAN_MANDATI_InitFields();
    PAN_MANDATI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ANNULLEMODIF+BaseCmdLinIdx)
      {
        Annullalemodifiche();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGISLEMODI6+BaseCmdLinIdx)
      {
        RegistraleModifiche();
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
      if (IMDB.TblModified(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef6.TBL_PARAM181, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MANCOLPERCOM_MANORDCOMMUT();
      }
      PAN_MANDATI.UpdatePanel(MainFrm);
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
    return (obj instanceof MandatiCollegatiPerCompensazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiCollegatiPerCompensazione.class.getName() : (Glb.ClassWithPackage(MandatiCollegatiPerCompensazione.class) ? MandatiCollegatiPerCompensazione.class.getName().substring(MandatiCollegatiPerCompensazione.class.getPackage().getName().length() + 1) : MandatiCollegatiPerCompensazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Mandati After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_MANDATI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Find Body
      // Corpo Procedura
      // 
      TotaleMandati();
      IDVariant v_IMPORTO = null;
      v_IMPORTO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO as ORDIMPORTO ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTO = QV.Get("ORDIMPORTO", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_MANDATI.set_FieldText(PFL_MANDATI_IMPORTORDINA, IDL.ToString(v_IMPORTO).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiAfterFind", _e);
    }
  }

  // **********************************************************************
  // Mandati On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_MANDATI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Updating Row Body
      // Corpo Procedura
      // 
      if (!(PANNELMODIFI.booleanValue()))
      {
        PANNELMODIFI = (new IDVariant(-1));
        ModificaCaptionStatoPannello((new IDVariant(-1)));
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0, (new IDVariant("I")));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0, (new IDVariant("U")));
        }
      }
      if (Column.equals((new IDVariant(PFL_MANDATI_NUMEROMAND)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, (new IDVariant()));
        }
        else
        {
          // IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  COUNT(*) as COUNT ");
          // SQL.append("from ");
          // SQL.append("  MAN A ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_VCOUNT = QV.Get("COUNT", IDVariant.INTEGER) ;
          // }
          // QV.Close();
          // if (v_VCOUNT.equals((new IDVariant(0)), true))
          // {
            // IDVariant v_SS = new IDVariant(0,IDVariant.STRING);
            // v_SS = (new IDVariant("Mandato non presente"));
            // MainFrm.set_AlertMessage(v_SS); 
            // IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0, (new IDVariant()));
            // return;
          // }
        }
        IDVariant v_CONTROLLI = null;
        v_CONTROLLI = (new IDVariant());
        v_CONTROLLI = ControlliMandatoCollegato(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0));
        if (v_CONTROLLI.compareTo((new IDVariant()), true)!=0)
        {
          MainFrm.set_AlertMessage(v_CONTROLLI); 
          // PAN_MANDATI.SetFieldErrorText(PFL_MANDATI_NUMEROMAND, v_CONTROLLI.stringValue()); 
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, 0, IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0));
          IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, 0, IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0));
          IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(B.IMPORTO - NVL(B.IMPORTO_IVA, 0) - NVL(B.RITENUTE, 0)) as SLINVLII0NVL ");
          SQL.append("from ");
          SQL.append("  MAN A, ");
          SQL.append("  LIQ B ");
          SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND) ");
          SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTO = QV.Get("SLINVLII0NVL", IDVariant.DECIMAL) ;
          }
          QV.Close();
          IDVariant v_VIMPCOLALTOR = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUMAOCI0 ");
          SQL.append("from ");
          SQL.append("  MAN_ORD_COMPENSAZIONE A ");
          SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TO_CHAR ( A.NUMERO_ORD ) || '/' || TO_CHAR ( A.ANNO_ORD ) <> TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ) || '/' || TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VIMPCOLALTOR = QV.Get("NUVASUMAOCI0", IDVariant.DECIMAL) ;
          }
          QV.Close();
          IDVariant v_VTOTANCOAPER = new IDVariant(0,IDVariant.DECIMAL);
          v_VTOTANCOAPER = IDL.Sub(IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_IMPORTORDINA)))), IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT)))));
          if (IDL.Sub(v_IMPORTO, v_VIMPCOLALTOR).compareTo(v_VTOTANCOAPER, true)<=0)
          {
            IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, IDL.Sub(v_IMPORTO, v_VIMPCOLALTOR));
            IMPORTCALCOL = IDL.Sub(v_IMPORTO, v_VIMPCOLALTOR);
          }
          else
          {
            IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, new IDVariant(v_VTOTANCOAPER));
            IMPORTCALCOL = new IDVariant(v_VTOTANCOAPER);
          }
          // IDVariant v_IMPORTOCOMM = new IDVariant(0,IDVariant.DECIMAL);
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  SUM(NVL(A.IMPORTO, 0)) as SUNUVAMAOCI0 ");
          // SQL.append("from ");
          // SQL.append("  MAN_ORD_COMPENSAZIONE A ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_IMPORTOCOMM = QV.Get("SUNUVAMAOCI0", IDVariant.DECIMAL) ;
          // }
          // QV.Close();
          // if (IDL.Sub(IDL.NullValue(v_IMPORTO,(new IDVariant(0))), IDL.NullValue(v_IMPORTOCOMM,(new IDVariant(0)))).equals((new IDVariant(0)), true))
          // {
            // IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            // v_ERR = (new IDVariant("Mandato interamente collegato"));
            // MainFrm.set_AlertMessage(v_ERR); 
            // IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, (new IDVariant()));
            // IMPORTCALCOL = (new IDVariant());
          // }
          // else
          // {
            // IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, IDL.Sub(v_IMPORTO, v_IMPORTOCOMM));
            // IMPORTCALCOL = IDL.Sub(v_IMPORTO, v_IMPORTOCOMM);
          // }
        }
        TotaleMandati();
      }
      // if (Column.equals((new IDVariant(PFL_MANDATI_IMPORTONETTO)), true) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        // {
          // IDVariant v_IMPORTOCOMM1 = new IDVariant(0,IDVariant.DECIMAL);
          // IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  A.IMPORTO as MANIMPORTO ");
          // SQL.append("from ");
          // SQL.append("  MAN A ");
          // SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_IMPORTO = QV.Get("MANIMPORTO", IDVariant.DECIMAL) ;
          // }
          // QV.Close();
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  SUM(NVL(A.IMPORTO, 0)) as SUNUVAMAOCI0 ");
          // SQL.append("from ");
          // SQL.append("  MAN_ORD_COMPENSAZIONE A ");
          // SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_IMPORTOCOMM1 = QV.Get("SUNUVAMAOCI0", IDVariant.DECIMAL) ;
          // }
          // QV.Close();
          // IDVariant v_OLDVALUE = null;
          // v_OLDVALUE = IDL.ToFloat(((IDL.NullValue(PAN_MANDATI.GetOrgValue(PFL_MANDATI_IMPORTONETTO),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant("0")):PAN_MANDATI.GetOrgValue(PFL_MANDATI_IMPORTONETTO)));
          // if (IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0).compareTo(IDL.Add((IDL.Sub(v_IMPORTO, v_IMPORTOCOMM1)), v_OLDVALUE), true)>0)
          // {
            // IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            // v_ERR = (new IDVariant("Importo in commutazione superiore all'importo del mandato"));
            // MainFrm.set_AlertMessage(v_ERR); 
            // IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0, new IDVariant(new IDVariant(v_OLDVALUE),IDVariant.DECIMAL));
          // }
        // }
        // TotaleMandati();
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Mandati On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_MANDATI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true) && UserOperation.booleanValue())
      {
        RiempiIMDB();
      }
      if (Command.equals((new IDVariant(16)), true) && UserOperation.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
        if (PANNELMODIFI.booleanValue())
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("I dati contenuti nel pannello non sono ancora stati salvati. Impossibile eliminare"));
          MainFrm.set_AlertMessage(S); 
          return;
        }
        if ((new IDVariant(PAN_MANDATI.GetNumRows())).compareTo((new IDVariant(1)), true)>0)
        {
          IDVariant v_IMPORTOORD = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          v_IMPORTO = IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT))));
          v_IMPORTOORD = IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_IMPORTORDINA))));
          if (IDL.Sub(v_IMPORTO, IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0)).compareTo(v_IMPORTOORD, true)!=0)
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Totale Importo Mandati diverso dall'importo dell'ordinativo. <br/> Continuare?"));
            if (!(MainFrm.MessageConfirm(v_ERR)))
            {
              return;
            }
          }
        }
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from MAN_ORD_COMPENSAZIONE ");
          SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e11)
        {
          MainFrm.set_AlertMessage(new IDVariant(e11.getMessage())); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        PAN_MANDATI.PanelCommand(Glb.PCM_DELETE);
        RiempiIMDB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Mandati Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_MANDATI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_DATA_INSERIMENTO, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Mandati Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_MANDATI_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Mandati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MANDATI);
      // 
      // Mandati On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0)))
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (PAN_MANDATI.IsNewRow())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0))))
        {
          PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Mandati After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_MANDATI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Commit Body
      // Corpo Procedura
      // 
      if (RowsUpdated.compareTo((new IDVariant(0)), true)>0 && RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_MANDATI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Mandati After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_MANDATI_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Delete Body
      // Corpo Procedura
      // 
      TotaleMandati();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "MandatiAfterDelete", _e);
    }
  }

  // **********************************************************************
  // Controlli Mandato Collegato
  // Esegue i Controlli sul Mandato indicato. Ritorna uneventuale
  // messaggio di errore.
  // Numero Mandato:  - Input
  // Anno Mandato:  - Input
  // **********************************************************************
  public IDVariant ControlliMandatoCollegato (IDVariant NumeroMandato, IDVariant AnnoMandato)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Mandato Collegato Body
      // Corpo Procedura
      // 
      IDVariant v_SMS = null;
      v_SMS = (new IDVariant());
      IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
      v_ERRORE = (new IDVariant("Mandato non presente"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  " + IDL.CSql(v_ERRORE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " as ERRORE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  MAN B ");
      SQL.append("where (B.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append(")))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SMS = QV.Get("ERRORE", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_SMS)))
      {
        return v_SMS;
      }
      else
      {
        // 
        // contrlli senza MIF
        // 
        if (IDL.IsNull(MainFrm.TIPO_SUB_MAN))
        {
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(DISTINCT NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) as DICONUVLDBLB ");
          SQL.append("from ");
          SQL.append("  LIQ A ");
          SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTA = QV.Get("DICONUVLDBLB", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTA.compareTo((new IDVariant(1)), true)>0)
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Sul mandato sono presenti beneficiari diversi"));
            return v_ERR;
          }
        }
        else
        {
          // 
          // controlli per MIF
          // 
          switch (1) // Allows the use of BREAK inside ifs
          {
            default:
            if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("B"))))	
            {
              IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
              v_ERR1 = (new IDVariant("Sul Mandato sono presenti liquidazioni su più beneficiari"));
              IDVariant v_CONTABENEFIC = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  NVL(B.DIVERSO_BEN, B.BENEFICIARIO) ");
              SQL.append("from ");
              SQL.append("  LIQ B ");
              SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
              SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  MIN(C.NUMERO_LIQ) ");
              SQL.append("from ");
              SQL.append("  LIQ C ");
              SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
              SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
              SQL.append(") = B.NUMERO_LIQ) ");
              SQL.append(") <> NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTABENEFIC = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONTABENEFIC.compareTo((new IDVariant(0)), true)>0)
              {
                return v_ERR1;
              }
            }
            else if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("L"))))	
            {
              IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
              v_ERR2 = (new IDVariant("Sul Mandato sono presenti più liquidazioni"));
              v_SMS = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  " + IDL.CSql(v_ERR2, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " as ERR2 ");
              SQL.append("from ");
              SQL.append("  DUAL B ");
              SQL.append("where (1 < ");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  COUNT(*) ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append(")) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_SMS = QV.Get("ERR2", IDVariant.STRING) ;
              }
              QV.Close();
              if (!(IDL.IsNull(v_SMS)))
              {
                return v_SMS;
              }
            }
            else if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("S"))))	
            {
              IDVariant v_CONTABENEFIC = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  NVL(B.DIVERSO_BEN, B.BENEFICIARIO) ");
              SQL.append("from ");
              SQL.append("  LIQ B ");
              SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
              SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  MIN(C.NUMERO_LIQ) ");
              SQL.append("from ");
              SQL.append("  LIQ C ");
              SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
              SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
              SQL.append(") = B.NUMERO_LIQ) ");
              SQL.append(") <> NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTABENEFIC = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONTABENEFIC.compareTo((new IDVariant(0)), true)>0)
              {
                IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
                v_ERR1 = (new IDVariant("Sul Mandato sono presenti liquidazioni su più beneficiari"));
                return v_ERR1;
              }
              else
              {
                IDVariant v_CONTASUBIMPE = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  LIQ A ");
                SQL.append("where (NOT ((A.ANNO_SUBIMP IS NULL))) ");
                SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_CONTASUBIMPE = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_CONTASUBIMPE.compareTo((new IDVariant(1)), true)>0)
                {
                  IDVariant v_ERR3 = new IDVariant(0,IDVariant.STRING);
                  v_ERR3 = (new IDVariant("Sul Mandato sono presenti più subimpegni"));
                  return v_ERR3;
                }
              }
            }
            else if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("C"))))	
            {
              IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
              v_ERR1 = (new IDVariant("Sul Mandato sono presenti liquidazioni su più beneficiari"));
              IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
              v_ERR2 = (new IDVariant("Sul Mandato sono presenti liquidazioni su più CIG"));
              IDVariant v_CONTABENEFIC = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  NVL(B.DIVERSO_BEN, B.BENEFICIARIO) ");
              SQL.append("from ");
              SQL.append("  LIQ B ");
              SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
              SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  MIN(C.NUMERO_LIQ) ");
              SQL.append("from ");
              SQL.append("  LIQ C ");
              SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
              SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
              SQL.append(") = B.NUMERO_LIQ) ");
              SQL.append(") <> NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTABENEFIC = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              IDVariant v_CONTACIG = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMandato, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NVL(");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  NVL(B.CIG, '-1') ");
              SQL.append("from ");
              SQL.append("  LIQ B ");
              SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
              SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
              SQL.append("and   (");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  MIN(C.NUMERO_LIQ) ");
              SQL.append("from ");
              SQL.append("  LIQ C ");
              SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
              SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
              SQL.append(") = B.NUMERO_LIQ) ");
              SQL.append("), '-1') <> NVL(A.CIG, '-1')) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTACIG = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONTABENEFIC.compareTo((new IDVariant(0)), true)>0)
              {
                return v_ERR1;
              }
              if (v_CONTACIG.compareTo((new IDVariant(0)), true)>0)
              {
                return v_ERR2;
              }
            }
            break;
          }
        }
      }
      return (new IDVariant());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "ControlliMandatoCollegato", _e);
      return new IDVariant();
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
      IMPORTCALCOL = (new IDVariant());
      PANNELMODIFI = (new IDVariant(0));
      RiempiIMDB();
      PAN_MANDATI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MANDATI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_MANDATI.SetCommandEnabled((new IDVariant(32)).intValue(), (new IDVariant(0)).booleanValue()); 
      MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMODIF+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_PSOLAINFO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_MANDATI.set_Locked((new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS9+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "Load", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0, (new IDVariant()));
      UNLOAD_MANORDCOMDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "Unload", _e);
    }
  }

  // **********************************************************************
  // MAN ORD COMPENSAZIONE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_MANORDCOMDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE);
  }

  // **********************************************************************
  // Info Mandato
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoMandato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Mandato Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "InfoMandato", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Quadratura
  // True Bloccante
  // MSG:  - Input/Output
  // **********************************************************************
  public boolean ControlliQuadratura (IDVariant MSG)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Quadratura Body
      // Corpo Procedura
      // 
      MSG.set((new IDVariant()));
      if (IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT)))).compareTo(IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_IMPORTORDINA)))), true)!=0 && IDL.NullValue((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT))),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)
      {
        if (IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT)))).compareTo(IDL.ToCurrency((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_IMPORTORDINA)))), true)<0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Totale mandati è diverso dall'importo dell'ordinativo."));
          MSG.set(new IDVariant(v_ERR));
          return (new IDVariant(0)).booleanValue();
        }
        else
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Totale mandati superiori all'importo dell'ordinativo."));
          MSG.set(new IDVariant(v_ERR));
          // 
          // NON BLOCCANTE SE MISTI
          // 
          if (MainFrm.GESTTRATMIST.equals((new IDVariant("SI")), true))
          {
            MSG.set(new IDVariant(MSG));
            return (new IDVariant(0)).booleanValue();
          }
          else
          {
            return (new IDVariant(-1)).booleanValue();
          }
        }
      }
      return (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "ControlliQuadratura", _e);
      return false;
    }
  }

  // **********************************************************************
  // Totale Mandati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int TotaleMandati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Totale Mandati Body
      // Corpo Procedura
      // 
      PAN_MANDATI.set_FieldText(PFL_MANDATI_TOTALEMANDAT, IDL.NullValue(IDL.ToString(PAN_MANDATI.GetFieldSum(PFL_MANDATI_IMPORTONETTO)),(new IDVariant("0"))).stringValue());
      if ((new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TOTALEMANDAT))).equals((new IDVariant()), true))
      {
        PAN_MANDATI.set_FieldText(PFL_MANDATI_TOTALEMANDAT, (new IDVariant("0")).stringValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "TotaleMandati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_MANORDCOMDEL();
      RIEMPIIMDB_MAORCOININSE();
      PANNELMODIFI = (new IDVariant(0));
      PAN_MANDATI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // MAN ORD COMPENSAZIONE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_MANORDCOMDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE);
  }

  // **********************************************************************
  // MAN ORD COMPENSAZIONE: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_MAORCOININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as MANORDCOMPRO, ");
    SQL.append("  A.ANNO_MAND as MANORDCOANMA, ");
    SQL.append("  A.NUMERO_MAND as MANORDCONUMA, ");
    SQL.append("  A.IMPORTO as MANORDCOMIMP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as MANORDCOUTIN, ");
    SQL.append("  A.DATA_INSERIMENTO as MANORDCODAIN, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as MAORCOUTULAG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as MAORCODAULAG, ");
    SQL.append("  A.ANNO_ORD as MANORDCOANOR, ");
    SQL.append("  A.NUMERO_ORD as MANORDCONUOR, ");
    SQL.append("  NULL as C ");
    SQL.append("from ");
    SQL.append("  MAN_ORD_COMPENSAZIONE A ");
    SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD,0,RS.Get(10));
      IMDB.set_Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE,IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA,0,RS.Get(11));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Registra le Modifiche
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RegistraleModifiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C11;

    try
    {
      TransCount = 0;
      // 
      // Registra le Modifiche Body
      // Corpo Procedura
      // 
      IDVariant v_MSG = null;
      v_MSG = (new IDVariant());
      if (PAN_MANDATI.IsPanelInError())
      {
        return 0;
      }
      IDVariant B = null;
      B = (new IDVariant(ControlliQuadratura(v_MSG)));
      if (B.booleanValue())
      {
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      PAN_MANDATI.PanelCommand(Glb.PCM_UPDATE);
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      REGISLEMODIF_CFASELINTVA4();
      if (!IMDB.Eof(IMDBDef15.QRY_CFASELINTVA4, 0))
      {
        v_VCOUNT = IMDB.Value(IMDBDef15.QRY_CFASELINTVA4, IMDBDef15.QSL_CFASELINTVA4_COUNT, 0, IDVariant.INTEGER) ;
      }
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Attenzione! L'associazione di più Mandati di pari Importo sullo stesso Ordinativo potrebbe causare problemi in fase di Invio Flusso Ordinativo Informatico!"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IDL.NullValue(v_MSG,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        v_MSG = IDL.Add(IDL.Add(v_MSG, (new IDVariant("</BR>"))), (new IDVariant("Continuare?")));
        if (!(MainFrm.MessageConfirm(v_MSG)))
        {
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      IMDB.TblMoveFirst (IMDBDef15.PQRY_MANORDCOMMUT_RS, 0);
      while (!IMDB.Eof(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0))
      {
        if (IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0).equals((new IDVariant("I")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into MAN_ORD_COMPENSAZIONE ");
            SQL.append("( ");
            SQL.append("  PROGRESSIVO, ");
            SQL.append("  ANNO_MAND, ");
            SQL.append("  NUMERO_MAND, ");
            SQL.append("  ANNO_ORD, ");
            SQL.append("  NUMERO_ORD, ");
            SQL.append("  IMPORTO, ");
            SQL.append("  UTENTE_INSERIMENTO, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_ORD, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e14)
          {
            MainFrm.set_AlertMessage(new IDVariant(e14.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_MANORDCOMSTA, 0).equals((new IDVariant("U")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update MAN_ORD_COMPENSAZIONE set ");
            SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMPORTO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ), ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef15.PQSL_MANORDCOMMUT_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e18)
          {
            MainFrm.set_AlertMessage(new IDVariant(e18.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        IMDB.TblMoveNext(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0);
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      PANNELMODIFI = (new IDVariant(0));
      ModificaCaptionStatoPannello((new IDVariant(0)));
      RiempiIMDB();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "RegistraleModifiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void REGISLEMODIF_CFASELINTVA4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_CFASELINTVA4);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
    IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 1);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0))
    {
      if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, 0).equals(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0), true))
      {
        if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, 0).equals(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0), true))
        {
          if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, 1).equals(IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, 0), true))
          {
            if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, 1).equals(IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, 0), true))
            {
              if ((IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND, 1).compareTo(IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND, 0), true)!=0 || IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND, 1).compareTo(IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND, 0), true)!=0))
              {
                if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO, 1).equals(IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO, 0), true))
                {
                  IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
                  IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
                }
              }
            }
          }
          IMDB.TblMoveNext(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 1);
          if (IMDB.Eof(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 1))
          {
            IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 1);
          }
          else
          {
            continue Loop1;
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
      if (IMDB.Eof(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef15.QRY_CFASELINTVA4, 0);
              IMDB.set_Value(IMDBDef15.QRY_CFASELINTVA4, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_CFASELINTVA4, 0);
  }

  // **********************************************************************
  // Annulla le modifiche
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annullalemodifiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla le modifiche Body
      // Corpo Procedura
      // 
      PANNELMODIFI = (new IDVariant(0));
      ModificaCaptionStatoPannello((new IDVariant(0)));
      RiempiIMDB();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "Annullalemodifiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica Caption Stato Pannello
  // Modifica:  - Input
  // **********************************************************************
  public int ModificaCaptionStatoPannello (IDVariant Modifica)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Caption Stato Pannello Body
      // Corpo Procedura
      // 
      if (Modifica.booleanValue())
      {
        IDVariant v_CAPTIOMODIF1 = new IDVariant(0,IDVariant.STRING);
        v_CAPTIOMODIF1 = (new IDVariant("Mandati: <FONT COLOR='#FF0000'> DATI MODIFICATI</FONT>"));
        Frames[PAN_MANDATI.FrIndex].set_Caption(new IDVariant(v_CAPTIOMODIF1).stringValue());
        PAN_MANDATI.set_ShowStatus((new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMODIF+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Mandati"));
        Frames[PAN_MANDATI.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
        PAN_MANDATI.set_ShowStatus((new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMODIF+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiCollegatiPerCompensazione", "ModificaCaptionStatoPannello", _e);
      return -1;
    }
  }

  // **********************************************************************
  // MAN ORD COMMUTAZIONE
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MANCOLPERCOM_MANORDCOMMUT() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_MANORDCOMMUT_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0))
    {
      if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, 0).equals(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_ANNO_MAND_CO_COMP, 0), true))
      {
        if (IMDB.Value(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, 0).equals(IMDB.Value(IMDBDef6.TBL_PARAM181, IMDBDef6.FLD_PARAM181_NUMERO_MAND_CO_COMP, 0), true))
        {
          IMDB.TblAddNew(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0);
          IMDB.TblLinkRow(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 1, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 2, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 3, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 4, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 5, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 6, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 7, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 8, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 9, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG, 0);
          IMDB.TblLinkField(IMDBDef15.PQRY_MANORDCOMMUT_RS, 10, 0, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA, 0);
        }
      }
      IMDB.TblMoveNext(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
      if (IMDB.Eof(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef15.PQRY_MANORDCOMMUT_RS);
    IMDB.TblSortBy(IMDBDef15.PQRY_MANORDCOMMUT_RS,2,true);
    IMDB.TblStartSort(IMDBDef15.PQRY_MANORDCOMMUT_RS);
    IMDB.TblMoveFirst(IMDBDef15.PQRY_MANORDCOMMUT_RS, 0);
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
  private void PAN_MANDATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATI, Cancel);
    // Stub
  }

  private void PAN_MANDATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MANDATI_INFO)
    {
      this.IdxPanelActived = this.PAN_MANDATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMandato();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MANDATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_MANDATI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MANDATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MANDATI_Init()
  {

    PAN_MANDATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANDATI.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, "9645DBC7-4DF9-4DCE-A4C2-F273B667B16A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, "PROGRESSIVO");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, "D9C7CE12-CFC8-4CC8-BDCF-6A17190A5062");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, "Mandato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, "6FAF7F16-51CF-49BA-9743-29E253EE2979");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, " ");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, "6EF8ECD5-9557-4C30-A345-E6EBC4C992AB");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, "Data");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, "5395323B-324B-4E28-A28F-D85C44F37087");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, "Beneficiario");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, "B5C846AE-21A0-443C-966B-00CCFCDF8970");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, "Importo Netto");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, "Importo al netto di ritenute e importo iva da SP");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "46C89BF5-EF3D-4DEF-BFBB-80C77616D0A3");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "ANNO MAND");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.VIS_CAMPODISABIL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, 0, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, "9BA6968C-0D33-47E2-BA90-D7BF44684075");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, "ANNO ORD");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.VIS_CAMPODISABIL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, 0, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, "CEE0745A-E8E7-4FC4-B832-61401007BD89");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, "NUMERO ORD");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.VIS_CAMPODISABIL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, "0B5430CE-0F53-40C5-9EA8-2222C1DA8151");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, " ");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.VIS_CAMPTOTADISA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, "36B9DFD3-533C-408C-B68E-009460497C26");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, "Tot. Importo Netto Mandati");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, "Totale Mandati");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, "C133DF77-379A-4A9D-8462-782B5946007A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, " ");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.VIS_CAMPTOTADISA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, "3D0063C1-A70B-461A-851F-58F749238401");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, "Importo Ordinativo");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, "AF87DF27-52BA-45F5-B53E-5E0798B78C00");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, "Mandato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, "Testo da mostrare qui");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, "CF1A6D90-6EE1-471E-8155-8B21222387CC");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, "D4805C89-CA61-4AC5-A0D3-A638552E5DE5");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, "7A8AB1CD-C092-4305-9F1A-36A010C1EAD3");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, "D55E4C31-2104-4FAC-BC21-5838292B2A43");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, "B6EC870D-7220-48AA-AA5D-5F54D6DD0A7A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, "STATO");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANDATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_FORM, 104);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_PROGRESSIVO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_PROGRESSIVO, PPQRY_MANORDCOMMUT, "A.PROGRESSIVO", "PROGRESSIVO", 1, 8, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_LIST, 92);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_LIST, "Mandato");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 52, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_FORM, 104);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROMAND, MyGlb.PANEL_FORM, "Mandato");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NUMEROMAND, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NUMEROMAND, PPQRY_MANORDCOMMUT, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_LIST, 68, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_LIST, " ");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_FORM, 4, 76, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_FORM, 2);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_INFO, MyGlb.PANEL_FORM, " ");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_INFO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_INFO, PPQRY_MAN, "'I'", "INFO", 5, 1, 0, -13997);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_LIST, 88, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_LIST, 116);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_LIST, "Data");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_FORM, 4, 76, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_FORM, 116);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDDATAMAND, MyGlb.PANEL_FORM, "Data");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_MANDDATAMAND, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_MANDDATAMAND, PPQRY_MAN, "A.D_DATA_MAND", "MANDDATAMAND", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 152, 36, 296, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 132);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 4, 76, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 132);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_BENRAGIOSOCI, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_BENRAGIOSOCI, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_BENRAGIOSOCI, PPQRY_LIQ, "MIN(B.RAGIONE_SOCIALE)", "LIQBENRAGSOC", 5, 99, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_LIST, 448, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_LIST, 92);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_LIST, "Importo Netto");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_FORM, 92);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTONETTO, MyGlb.PANEL_FORM, "Importo Netto");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_IMPORTONETTO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_IMPORTONETTO, PPQRY_MANORDCOMMUT, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 528, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 76);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 104);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ANNOMAND, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ANNOMAND, PPQRY_MANORDCOMMUT, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_LIST, 528, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_FORM, 104);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ANNOORD, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ANNOORD, PPQRY_MANORDCOMMUT, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_LIST, 528, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_LIST, 84);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_FORM, 104);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROORD, MyGlb.PANEL_FORM, "NUMERO ORD");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NUMEROORD, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NUMEROORD, PPQRY_MANORDCOMMUT, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_LIST, 448, 460, 104, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_FORM, 372, 172, 188, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTALEMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_TOTALEMANDAT, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_TOTALEMANDAT, -1, "", "TOTALEMANDAT", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_LIST, 240, 460, 204, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_FORM, 148, 232, 124, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TOTAMANDLABE, MyGlb.PANEL_FORM, 3);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_TOTAMANDLABE, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_TOTAMANDLABE, -1, "", "TOTAMANDLABE", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_LIST, 448, 480, 104, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_FORM, 380, 180, 188, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTORDINA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_IMPORTORDINA, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_IMPORTORDINA, -1, "", "IMPORTORDINA", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_LIST, 320, 480, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_FORM, 156, 240, 124, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPOORDILABE, MyGlb.PANEL_FORM, 3);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_IMPOORDILABE, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_IMPOORDILABE, -1, "", "IMPOORDILABE", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 0, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 68, 248, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_MANDATOLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_LIST, 508, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_UTENTEINSERI, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_UTENTEINSERI, PPQRY_MANORDCOMMUT, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_LIST, 636, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DATAINSERIME, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DATAINSERIME, PPQRY_MANORDCOMMUT, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 756, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 124);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_UTENTULTIAGG, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_UTENTULTIAGG, PPQRY_MANORDCOMMUT, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 880, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 116);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DATAULTIMAGG, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DATAULTIMAGG, PPQRY_MANORDCOMMUT, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_LIST, 48);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_LIST, "STATO");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_FORM, 4, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_FORM, 48);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_STATO, MyGlb.PANEL_FORM, "STATO");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_STATO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_STATO, PPQRY_MANORDCOMMUT, "A.MANORDCOMSTA", "MANORDCOMSTA", 5, 2, 0, -13997);
  }

  private void PAN_MANDATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.D_DATA_MAND as MANDDATAMAND, ");
    SQL.append("  'I' as INFO ");
    SQL.append("from ");
    SQL.append("  MAN A ");
    SQL.append("where (A.ANNO_MAND = ~~ANNO_MAND~~) ");
    SQL.append("and   (A.NUMERO_MAND = ~~NUMERO_MAND~~) ");
    PAN_MANDATI.SetQuery(PPQRY_MAN, 0, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_MAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(PPQRY_MAN, "MAN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  MIN(A.NUMERO_LIQ) as NUMEROLIQ, ");
    SQL.append("  MIN(B.RAGIONE_SOCIALE) as LIQBENRAGSOC ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    SQL.append("where (A.ANNO_MAND = ~~ANNO_MAND~~) ");
    SQL.append("and   (A.NUMERO_MAND = ~~NUMERO_MAND~~) ");
    SQL.append("and   (A.BENEFICIARIO = B.CODICE) ");
    PAN_MANDATI.SetQuery(PPQRY_LIQ, 0, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_LIQ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(PPQRY_LIQ, "LIQ");
    PAN_MANDATI.SetIMDB(IMDB, "PQRY_MANORDCOMMUT", true);
    PAN_MANDATI.set_SetString(MyGlb.MASTER_ROWNAME, "MAN ORD COMMUTAZIONE");
    PAN_MANDATI.SetQueryIMDB(PPQRY_MANORDCOMMUT, IMDBDef15.PQRY_MANORDCOMMUT_RS, IMDBDef6.TBL_MAN_ORD_COMMUTAZIONE);
    JustLoaded = true;
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_PROGRESSIVO, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_NUMEROMAND, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_IMPORTONETTO, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_IMPORTO);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_ANNOMAND, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_ANNOORD, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_NUMEROORD, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_UTENTEINSERI, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_DATAINSERIME, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_UTENTULTIAGG, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_DATAULTIMAGG, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG);
    PAN_MANDATI.SetFieldPrimaryIndex(PFL_MANDATI_STATO, IMDBDef6.FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA);
    PAN_MANDATI.SetMasterTable(0, "MAN_ORD_COMMUTAZIONE");
    PAN_MANDATI.AddToSortList(PFL_MANDATI_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDATI.Status() == 2)
    {
      int oldListQBE = PAN_MANDATI.iUseListQBE;
      PAN_MANDATI.iUseListQBE = 0;
      PAN_MANDATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATI.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
