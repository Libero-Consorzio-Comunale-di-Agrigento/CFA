// **********************************************
// Info Pluriennali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoPluriennali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PLURIENNALI_NUMERO = 0;
  private static int PFL_PLURIENNALI_ANNO = 1;
  private static int PFL_PLURIENNALI_DESCRIZIONE = 2;
  private static int PFL_PLURIENNALI_IMPORTO = 3;
  private static int PFL_PLURIENNALI_DATAREG = 4;
  private static int PFL_PLURIENNALI_ANNOPLUR = 5;
  private static int PFL_PLURIENNALI_CAPITOLO = 6;
  private static int PFL_PLURIENNALI_ARTICOLO4 = 7;
  private static int PFL_PLURIENNALI_DEBITORE = 8;
  private static int PFL_PLURIENNALI_ANNODEL = 9;
  private static int PFL_PLURIENNALI_NUMERODEL = 10;
  private static int PFL_PLURIENNALI_SEDEDEL = 11;
  private static int PFL_PLURIENNALI_CAUSALE = 12;
  private static int PFL_PLURIENNALI_ESERCISCADEN = 13;
  private static int PFL_PLURIENNALI_ANNOINTROD = 14;
  private static int PFL_PLURIENNALI_ANNOPROPOSTA = 15;
  private static int PFL_PLURIENNALI_UNITAPROPONE = 16;
  private static int PFL_PLURIENNALI_NUMEROPROPOS = 17;
  private static int PFL_PLURIENNALI_VOCEECON = 18;
  private static int PFL_PLURIENNALI_TIPOVINCOLO = 19;
  private static int PFL_PLURIENNALI_CENTRO = 20;
  private static int PFL_PLURIENNALI_FATTORE = 21;
  private static int PFL_PLURIENNALI_COMPETENZDAL = 22;
  private static int PFL_PLURIENNALI_COMPETENZAAL = 23;
  private static int PFL_PLURIENNALI_NOTE3 = 24;
  private static int PFL_PLURIENNALI_RILEVANTEECO = 25;
  private static int PFL_PLURIENNALI_CODIMPECO = 26;
  private static int PFL_PLURIENNALI_PROGETTOID = 27;
  private static int PFL_PLURIENNALI_OBIETTIVO = 28;
  private static int PFL_PLURIENNALI_CODICEGESTIO = 29;
  private static int PFL_PLURIENNALI_RESPONSABRES = 30;
  private static int PFL_PLURIENNALI_NUMEROPLUR = 31;
  private static int PFL_PLURIENNALI_E = 32;
  private static int PFL_PLURIENNALI_TIPOSERVIZIO = 33;

  private static int PPQRY_ACCERTAMENT1 = 0;


  IDPanel PAN_PLURIENNALI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI77(IMDB);
    //
    //
    Init_PQRY_ACCERTAMENT1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI77, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI77, "TBL_PARAMETRI77");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI77,IMDBDef4.FLD_PARAMETRI77_PARAMNUMEACC, "PARAMNUMEACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI77,IMDBDef4.FLD_PARAMETRI77_PARAMNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI77,IMDBDef4.FLD_PARAMETRI77_PARAMANNOACC, "PARAMANNOACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI77,IMDBDef4.FLD_PARAMETRI77_PARAMANNOACC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI77, 0);
  }

  private static void Init_PQRY_ACCERTAMENT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_ACCERTAMENT1, 35);
    IMDB.set_TblCode(IMDBDef14.PQRY_ACCERTAMENT1, "PQRY_ACCERTAMENT1");
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ESERCIZIO_SCADENZA, "ESERCIZIO_SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ESERCIZIO_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_INTROD, "ANNO_INTROD");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_INTROD,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_PLUR, "ANNO_PLUR");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_PLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_PLUR, "NUMERO_PLUR");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_PLUR,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_RILEVANTE_ECO, "RILEVANTE_ECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_RILEVANTE_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COD_IMP_ECO, "COD_IMP_ECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_COD_IMP_ECO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_OBIETTIVO,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_RESPONSABILE_RES, "RESPONSABILE_RES");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_RESPONSABILE_RES,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_E, "E");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_E,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_TIPO_SERVIZIO, "TIPO_SERVIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCERTAMENT1,IMDBDef14.PQSL_ACCERTAMENT1_TIPO_SERVIZIO,1,3,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_ACCERTAMENT1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoPluriennali(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoPluriennali()
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
    FormIdx = MyGlb.FRM_INFOPLURIENN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7DB563E3-0B8B-47CA-87E2-96CF3C9D3290";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 628;
    DesignHeight = 346;
    set_Caption(new IDVariant("Info Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 628;
    Frames[1].Height = 320;
    Frames[1].Caption = "Pluriennali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_PLURIENNALI = new IDPanel(w, this, 1, "PAN_PLURIENNALI");
    Frames[1].Content = PAN_PLURIENNALI;
    PAN_PLURIENNALI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PLURIENNALI.VS = MainFrm.VisualStyleList;
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 628-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2C584FA0-9F17-41AE-974A-400EC26A86E1");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PLURIENNALI.InitStatus = 2;
    PAN_PLURIENNALI_Init();
    PAN_PLURIENNALI_InitFields();
    PAN_PLURIENNALI_InitQueries();
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
      PAN_PLURIENNALI.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoPluriennali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoPluriennali.class.getName() : (Glb.ClassWithPackage(InfoPluriennali.class) ? InfoPluriennali.class.getName().substring(InfoPluriennali.class.getPackage().getName().length() + 1) : InfoPluriennali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pluriennali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PLURIENNALI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PLURIENNALI);
      // 
      // Pluriennali On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PLURIENNALI.set_ToolTip(Glb.OBJ_FIELD,PFL_PLURIENNALI_DESCRIZIONE,(new IDVariant(PAN_PLURIENNALI.FieldText(PFL_PLURIENNALI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPluriennali", "PluriennaliOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Pluriennali", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoPluriennali", "LoadEvent", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PLURIENNALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PLURIENNALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PLURIENNALI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PLURIENNALI, Cancel);
    // Stub
  }

  private void PAN_PLURIENNALI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PLURIENNALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PLURIENNALI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCERTAMENT1, IMDBDef14.PQSL_ACCERTAMENT1_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACCERTAMENT1, IMDBDef14.PQSL_ACCERTAMENT1_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCERTAMENT1, IMDBDef14.PQSL_ACCERTAMENT1_E, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_ACCERTAMENT1, IMDBDef14.PQSL_ACCERTAMENT1_E, 0, (new IDVariant("E")));
      }
      if (Cancel.isFalse())
      {
        PAN_PLURIENNALI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PLURIENNALI_Init()
  {

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_FIELD, 34);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, "74DC68A8-C64C-4D58-A6EB-7E6D5235F4DB");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, "Numero");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "4FF943D3-8C7F-438B-B50E-EC2D621761C3");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "Anno");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "379B31A0-04BD-40EF-8797-2456FC98AF02");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "Descrizione");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "BDA65BCE-642D-4168-BED6-E11E7532BF47");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "Importo");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "3946E2D0-E9F8-4C2A-999F-501BB0CDE6EF");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "Data Reg.");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "9AC9E474-E1C9-4D6F-8B4D-F923A7049F76");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "ANNO PLUR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, "4DE13E8E-5E39-4B4C-B382-B8CA1E352BF6");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, "CAPITOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "FA93A844-44AA-4F4F-9DE9-F4FEC6E11873");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "ARTICOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, "EA4B12A0-14D1-4E96-9C37-43908AEC6A4F");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, "DEBITORE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "F4CC4C5D-5F1A-4765-BB09-D81ADADBFF3A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "ANNO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "38460353-CD49-4D44-96D5-6EE36CC80651");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "NUMERO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "670B4B07-E6AA-42C1-BCB5-364A4BF94354");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "SEDE DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "DE98B576-1188-4D67-90A2-E2DC0C9B69C1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "CAUSALE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "3E4C674C-87A9-4D26-BA9F-1BE19718E285");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "ESERCIZIO SCADENZA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "CD69FFD9-B4BC-4CE1-A2E0-266D800E92B5");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "ANNO INTROD");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "E7DF50E7-8129-4699-87BB-3FB4C54D889C");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "4025F9AA-A33C-4D72-B74D-C801BB7D1BBC");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "3B6621AC-ADA7-4401-8CF2-F644087764D3");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "83D880F1-A482-483E-8054-A188AAF1F272");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "VOCE ECON");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "807E2E9C-3857-409F-AED0-58DAFDB75C04");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "71845ED2-155A-489C-878E-D02F07E93667");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "CENTRO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "1FF5DCE2-09EE-4374-9082-1B10EA2D8822");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "FATTORE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "B2F2FFAA-24AC-4C45-982D-36C3139E370F");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "COMPETENZA DAL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "740365C0-6EA5-4AA4-AEA5-3C9094CEAC9C");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "COMPETENZA AL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "5E8F30B1-6381-41C1-9EE3-9C78D3E08302");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "NOTE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "BC764674-0563-4D0F-B78C-9F9F8DF416F0");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "RILEVANTE ECO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "B5694162-5D59-46FD-8F12-814E51188F73");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "COD IMP ECO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "BE880A1C-9F5D-49ED-B2D6-B43E9B646430");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "PROGETTO ID");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "74212BE0-7406-4FDA-90B8-FD572D1F2B97");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "OBIETTIVO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "E4D78450-A102-4B97-888B-1D64E45F2CFE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "AE139639-9D30-4253-935D-B951474F2D7B");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "RESPONSABILE RES");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "D9AB24AA-6F80-4659-AF95-92EEA901F04A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "NUMERO PLUR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, "2881EC29-72AD-4880-BC69-16CD7DC82F52");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, "E");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, "85C4C0B4-ABFB-4221-9147-817F01C4BA0A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, "TIPO SERVIZIO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PLURIENNALI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_FORM, 284, 20, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_FORM, 48);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERO, MyGlb.PANEL_FORM, "Num.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMERO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMERO, PPQRY_ACCERTAMENT1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 60, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 60, 20, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 36);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNO, PPQRY_ACCERTAMENT1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 108, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 44, 344, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DESCRIZIONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DESCRIZIONE, PPQRY_ACCERTAMENT1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 384, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 32, 104, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_IMPORTO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_IMPORTO, PPQRY_ACCERTAMENT1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 480, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 208, 104, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DATAREG, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DATAREG, PPQRY_ACCERTAMENT1, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 656, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, "ANNO PLUR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 4, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, "ANNO PLUR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOPLUR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOPLUR, PPQRY_ACCERTAMENT1, "A.ANNO_PLUR", "ANNO_PLUR", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_FORM, 432, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CAPITOLO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CAPITOLO, PPQRY_ACCERTAMENT1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 432, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ARTICOLO4, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ARTICOLO4, PPQRY_ACCERTAMENT1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_LIST, 460, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_LIST, "DEBIT.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_FORM, 4, 152, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DEBITORE, MyGlb.PANEL_FORM, "DEBIT.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DEBITORE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DEBITORE, PPQRY_ACCERTAMENT1, "A.DEBITORE", "DEBITORE", 2, 15, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 656, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 4, 400, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNODEL, PPQRY_ACCERTAMENT1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 716, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 4, 424, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMERODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMERODEL, PPQRY_ACCERTAMENT1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 788, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 4, 448, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SEDEDEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SEDEDEL, PPQRY_ACCERTAMENT1, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 844, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 4, 472, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CAUSALE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CAUSALE, PPQRY_ACCERTAMENT1, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 996, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, "ESERCIZIO SCADENZA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 4, 520, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, "ESERC. SCADENZA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ESERCISCADEN, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ESERCISCADEN, PPQRY_ACCERTAMENT1, "A.ESERCIZIO_SCADENZA", "ESERCIZIO_SCADENZA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 1116, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, "ANNO INTROD");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 4, 544, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, "ANN. INTROD");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOINTROD, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOINTROD, PPQRY_ACCERTAMENT1, "A.ANNO_INTROD", "ANNO_INTROD", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1488, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANNO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 664, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOPROPOSTA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOPROPOSTA, PPQRY_ACCERTAMENT1, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 1584, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 688, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_UNITAPROPONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_UNITAPROPONE, PPQRY_ACCERTAMENT1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1696, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 712, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMEROPROPOS, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMEROPROPOS, PPQRY_ACCERTAMENT1, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 2004, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 4, 808, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_VOCEECON, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_VOCEECON, PPQRY_ACCERTAMENT1, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 2072, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 832, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINCOLO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPOVINCOLO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPOVINCOLO, PPQRY_ACCERTAMENT1, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 2740, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 4, 976, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CENTRO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CENTRO, PPQRY_ACCERTAMENT1, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 2792, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 4, 1000, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_FATTORE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_FATTORE, PPQRY_ACCERTAMENT1, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 2848, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 1024, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPET. DAL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_COMPETENZDAL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_COMPETENZDAL, PPQRY_ACCERTAMENT1, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 2952, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 92);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 1048, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 92);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPET. AL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_COMPETENZAAL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_COMPETENZAAL, PPQRY_ACCERTAMENT1, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 3056, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 36);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, "NOTE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 4, 1072, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 36);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, "NOTE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NOTE3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NOTE3, PPQRY_ACCERTAMENT1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 3488, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, "RILEVANTE ECO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 4, 1120, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEV. ECO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_RILEVANTEECO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_RILEVANTEECO, PPQRY_ACCERTAMENT1, "A.RILEVANTE_ECO", "RILEVANTE_ECO", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_RILEVANTEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_RILEVANTEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 3576, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, "COD IMP ECO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 4, 1144, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, "CD. IMP ECO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CODIMPECO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CODIMPECO, PPQRY_ACCERTAMENT1, "A.COD_IMP_ECO", "COD_IMP_ECO", 5, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 3652, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 4, 1168, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, "PROG. ID");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGETTOID, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGETTOID, PPQRY_ACCERTAMENT1, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 3952, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, "OBIET.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 4, 1264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, "OBIET.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_OBIETTIVO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_OBIETTIVO, PPQRY_ACCERTAMENT1, "A.OBIETTIVO", "OBIETTIVO", 5, 9, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 4016, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 1288, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, "COD. GESTIONALE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CODICEGESTIO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CODICEGESTIO, PPQRY_ACCERTAMENT1, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 4212, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, "RESPONSABILE RES");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 4, 1336, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, "RESPONS. RES");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_RESPONSABRES, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_RESPONSABRES, PPQRY_ACCERTAMENT1, "A.RESPONSABILE_RES", "RESPONSABILE_RES", 5, 40, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 4420, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, "NUMERO PLUR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 4, 1360, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, "NUM. PLUR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMEROPLUR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMEROPLUR, PPQRY_ACCERTAMENT1, "A.NUMERO_PLUR", "NUMERO_PLUR", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_LIST, 460, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_LIST, 16);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_LIST, "E");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_FORM, 4, 176, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_FORM, 16);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_E, MyGlb.PANEL_FORM, "E");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_E, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_E, PPQRY_ACCERTAMENT1, "A.E", "E", 5, 1, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_LIST, 460, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_LIST, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_LIST, "TIPO SERVIZIO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_FORM, 4, 200, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_FORM, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOSERVIZIO, MyGlb.PANEL_FORM, "TP. SERVIZIO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPOSERVIZIO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPOSERVIZIO, PPQRY_ACCERTAMENT1, "A.TIPO_SERVIZIO", "TIPO_SERVIZIO", 1, 3, 0, -13997);
  }

  private void PAN_PLURIENNALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PLURIENNALI.SetIMDB(IMDB, "PQRY_ACCERTAMENT1", true);
    PAN_PLURIENNALI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.ESERCIZIO_SCADENZA as ESERCIZIO_SCADENZA, ");
    SQL.append("  A.ANNO_INTROD as ANNO_INTROD, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.ANNO_PLUR as ANNO_PLUR, ");
    SQL.append("  A.NUMERO_PLUR as NUMERO_PLUR, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.RILEVANTE_ECO as RILEVANTE_ECO, ");
    SQL.append("  A.COD_IMP_ECO as COD_IMP_ECO, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.OBIETTIVO as OBIETTIVO, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.RESPONSABILE_RES as RESPONSABILE_RES, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.TIPO_SERVIZIO as TIPO_SERVIZIO ");
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC A ");
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ANNO_PLUR = ~~TBL_PARAMETRI77.PARAMANNOACC~~ AND A.NUMERO_PLUR = ~~TBL_PARAMETRI77.PARAMNUMEACC~~) OR (A.ANNO_ACC > ~~TBL_PARAMETRI77.PARAMANNOACC~~ AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  ACC B ");
    SQL.append("where (B.ANNO_PLUR = A.ANNO_PLUR) ");
    SQL.append("and   (B.NUMERO_PLUR = A.NUMERO_PLUR) ");
    SQL.append("and   (B.ANNO_ACC = ~~TBL_PARAMETRI77.PARAMANNOACC~~) ");
    SQL.append("and   (B.NUMERO_ACC = ~~TBL_PARAMETRI77.PARAMNUMEACC~~) ");
    SQL.append("and   (A.ANNO_ACC > B.ANNO_ACC) ");
    SQL.append(")))) ");
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_PLURIENNALI.SetQuery(PPQRY_ACCERTAMENT1, 5, SQL, -1, "");
    PAN_PLURIENNALI.SetQueryDB(PPQRY_ACCERTAMENT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PLURIENNALI.SetMasterTable(0, "ACC");
    PAN_PLURIENNALI.AddToSortList(PFL_PLURIENNALI_ANNO, true);
    PAN_PLURIENNALI.AddToSortList(PFL_PLURIENNALI_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PLURIENNALI.Status() == 2)
    {
      int oldListQBE = PAN_PLURIENNALI.iUseListQBE;
      PAN_PLURIENNALI.iUseListQBE = 0;
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_FIND);
      PAN_PLURIENNALI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
