// **********************************************
// Scelta Variazione Per Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaVariazionePerEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAZIONI_CODICE = 0;
  private static int PFL_VARIAZIONI_CODPIANOCONT = 1;
  private static int PFL_VARIAZIONI_CAPITOLO = 2;
  private static int PFL_VARIAZIONI_ART = 3;
  private static int PFL_VARIAZIONI_DUALINFOCAP = 4;
  private static int PFL_VARIAZIONI_IMPEGNO = 5;
  private static int PFL_VARIAZIONI_ANNOIMP = 6;
  private static int PFL_VARIAZIONI_DUALINFOIMPE = 7;
  private static int PFL_VARIAZIONI_DESCRIZIONE = 8;
  private static int PFL_VARIAZIONI_ETICHEIMPEGN = 9;
  private static int PFL_VARIAZIONI_IMPORTO = 10;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 11;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 12;
  private static int PFL_VARIAZIONI_PROGUNITORGA = 13;
  private static int PFL_VARIAZIONI_VARIVARIGENE = 14;
  private static int PFL_VARIAZIONI_DESCTIPOVAR = 15;

  private static int PPQRY_VARIMP8 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_DUAL1 = 2;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR117(IMDB);
    Init_TBL_VARIAZIMPEG3(IMDB);
    //
    //
    Init_PQRY_VARIMP8(IMDB);
    Init_PQRY_VARIMP8_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR117(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PAR117, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PAR117, "TBL_PAR117");
    IMDB.set_FldCode(IMDBDef1.TBL_PAR117,IMDBDef1.FLD_PAR117_NOMOGGCOANCO, "NOMOGGCOANCO");
    IMDB.SetFldParams(IMDBDef1.TBL_PAR117,IMDBDef1.FLD_PAR117_NOMOGGCOANCO,5,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PAR117,IMDBDef1.FLD_PAR117_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_PAR117,IMDBDef1.FLD_PAR117_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PAR117, 0);
  }

  private static void Init_TBL_VARIAZIMPEG3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_VARIAZIMPEG3, 14);
    IMDB.set_TblCode(IMDBDef1.TBL_VARIAZIMPEG3, "TBL_VARIAZIMPEG3");
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CODICE_STRUTTURA, "CODICE_STRUTTURA");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CODICE_STRUTTURA,5,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA, "VARIAZIONE_GENERATA");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGDETIVA, "NOMOGGDETIVA");
    IMDB.SetFldParams(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGDETIVA,9,400,0);
  }

  private static void Init_PQRY_VARIMP8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VARIMP8, 13);
    IMDB.set_TblCode(IMDBDef7.PQRY_VARIMP8, "PQRY_VARIMP8");
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGCACACS, "RENOOGCACACS");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGCACACS,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECCODPIACON, "RECCODPIACON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECCODPIACON,9,500,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDART, "RECORDART");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDART,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, "RECORANNOIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGIMIMDE, "RENOOGIMIMDE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGIMIMDE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECOANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO, "RECNOMOGGPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGIMPRUO, "RENOOGIMPRUO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGIMPRUO,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGVAVAGE, "RENOOGVAVAGE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGVAVAGE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGDETIVA, "RENOOGDETIVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8,IMDBDef7.PQSL_VARIMP8_RENOOGDETIVA,9,400,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VARIMP8, 0);
  }

  private static void Init_PQRY_VARIMP8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VARIMP8_RS, 13);
    IMDB.set_TblCode(IMDBDef7.PQRY_VARIMP8_RS, "PQRY_VARIMP8_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGCACACS, "RENOOGCACACS");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGCACACS,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECCODPIACON, "RECCODPIACON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECCODPIACON,9,500,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDART, "RECORDART");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDART,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, "RECORANNOIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGIMIMDE, "RENOOGIMIMDE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGIMIMDE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECOANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO, "RECNOMOGGPRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGIMPRUO, "RENOOGIMPRUO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGIMPRUO,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGVAVAGE, "RENOOGVAVAGE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGVAVAGE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGDETIVA, "RENOOGDETIVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP8_RS,IMDBDef7.PQSL_VARIMP8_RENOOGDETIVA,9,400,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaVariazionePerEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaVariazionePerEsigibilita()
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
    FormIdx = MyGlb.FRM_SCEVARPERESI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CBC0BE97-9441-4D29-BD27-E7B9EB07BDCE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1008;
    DesignHeight = 370;
    set_Caption(new IDVariant("Scelta Variazione per Esigibilità"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1008;
    Frames[1].Height = 344;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1008-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "45849240-6DB3-4A47-9F78-E1CEB9F0D916");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1160, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef1.TBL_VARIAZIMPEG3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCEVARPERESI_VARIMP8();
      }
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
    return (obj instanceof SceltaVariazionePerEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaVariazionePerEsigibilita.class.getName() : (Glb.ClassWithPackage(SceltaVariazionePerEsigibilita.class) ? SceltaVariazionePerEsigibilita.class.getName().substring(SceltaVariazionePerEsigibilita.class.getPackage().getName().length() + 1) : SceltaVariazionePerEsigibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni On Dynamic Properties
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
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCTIPOVAR,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCTIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true) && UserOperation.booleanValue())
      {
        RiempiIMDB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "VariazioniOnCommand", _e);
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
      RiempiIMDB();
      if (IMDB.Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ETICHEIMPEGN, (new IDVariant("Accertamento")).stringValue());
      }
      else
      {
        PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ETICHEIMPEGN, (new IDVariant("Impegno")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "Load", _e);
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
      UNLOAD_PARDELETE();
      UNLOAD_VARIIMPEDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "Unload", _e);
    }
  }

  // **********************************************************************
  // Par: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMOGGCOANCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMEOGGETTES, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni Impegni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_VARIIMPEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_VARIAZIMPEG3);
  }

  // **********************************************************************
  // DUAL Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORDCAPITO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORDART, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RENOOGIMPRUO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "DUALInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Info Impegno 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoImpegno1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Impegno 1 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN, 0));
      if (IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "DUALInfoImpegno1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      RIEMPIIMDB_VARIIMPEDELE();
      RIEMPIIMDB_VARIMPININS2();
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaVariazionePerEsigibilita", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni Impegni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARIIMPEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_VARIAZIMPEG3);
  }

  // **********************************************************************
  // Variazioni Impegni: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARIMPININS2() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  D.CODICE_STRUTTURA as CAPCODICSTRU, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  CASE WHEN A.MACRO_LIV_5_STR <> '0' THEN A.MACRO_LIV_5_STR ELSE A.MACRO_LIV_4_STR END ");
    SQL.append("from ");
    SQL.append("  VISTA_CODIFICHE_CAP A ");
    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append(") as CODPIANOCONT, ");
    SQL.append("  B.CAPITOLO as VARIMPCAPITO, ");
    SQL.append("  B.ARTICOLO as VARIMPARTICO, ");
    SQL.append("  B.NUMERO_IMP as VARIMNUMEIMP, ");
    SQL.append("  B.ANNO_IMP as VARIMANNOIMP, ");
    SQL.append("  C.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.IMPORTO as VARIMPIMPORT, ");
    SQL.append("  B.ANNO_ESIGIBILITA as VARIANNOESIG, ");
    SQL.append("  B.PROGRESSIVO as VARIMPPROGRE, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA as IMPPROUNIORG, ");
    SQL.append("  B.TIPO_VAR as VARIMTIPOVAR, ");
    SQL.append("  B.VARIAZIONE_GENERATA as VARIVARIGENE, ");
    SQL.append("  TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE as TOSTT5COT5DE ");
    SQL.append("from ");
    SQL.append("  VARIMP B, ");
    SQL.append("  IMP C, ");
    SQL.append("  CAP D, ");
    SQL.append("  T55 E ");
    SQL.append("where (C.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (D.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.E_S = 'S') ");
    SQL.append("and   (D.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (D.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (E.CODICE = B.TIPO_VAR) ");
    SQL.append("and   (E.MOTIVO IN ('EA', 'EC', 'EAN')) ");
    SQL.append("and   (NOT ((B.ANNO_ESIGIBILITA IS NULL))) ");
    SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  H.CODICE_STRUTTURA, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  CASE WHEN J.MACRO_LIV_5_STR <> '0' THEN J.MACRO_LIV_5_STR ELSE J.MACRO_LIV_4_STR END ");
    SQL.append("from ");
    SQL.append("  VISTA_CODIFICHE_CAP J ");
    SQL.append("where (J.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (J.E_S = 'E') ");
    SQL.append("and   (J.CAPITOLO = H.CAPITOLO) ");
    SQL.append("and   (J.ARTICOLO = H.ARTICOLO) ");
    SQL.append("), ");
    SQL.append("  F.CAPITOLO, ");
    SQL.append("  F.ARTICOLO, ");
    SQL.append("  F.NUMERO_ACC, ");
    SQL.append("  F.ANNO_ACC, ");
    SQL.append("  F.DESCRIZIONE, ");
    SQL.append("  F.IMPORTO, ");
    SQL.append("  F.ANNO_ESIGIBILITA, ");
    SQL.append("  F.PROGRESSIVO, ");
    SQL.append("  G.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  F.TIPO_VAR, ");
    SQL.append("  F.VARIAZIONE_GENERATA, ");
    SQL.append("  TO_CHAR ( I.CODICE ) || ' - ' || I.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VARACC F, ");
    SQL.append("  ACC G, ");
    SQL.append("  CAP H, ");
    SQL.append("  T56 I ");
    SQL.append("where (G.ANNO_ACC = F.ANNO_ACC) ");
    SQL.append("and   (G.NUMERO_ACC = F.NUMERO_ACC) ");
    SQL.append("and   (H.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (H.E_S = 'E') ");
    SQL.append("and   (H.CAPITOLO = F.CAPITOLO) ");
    SQL.append("and   (H.ARTICOLO = F.ARTICOLO) ");
    SQL.append("and   (I.CODICE = F.TIPO_VAR) ");
    SQL.append("and   (I.MOTIVO IN ('EA', 'EC', 'EAN')) ");
    SQL.append("and   (NOT ((F.ANNO_ESIGIBILITA IS NULL))) ");
    SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'E') ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef1.TBL_VARIAZIMPEG3, 0);
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CODICE_STRUTTURA,0,RS.Get(1));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGCOPICO,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_CAPITOLO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ARTICOLO,0,RS.Get(4));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NUMERO_IMP,0,RS.Get(5));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_IMP,0,RS.Get(6));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_DESCRIZIONE,0,RS.Get(7));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_IMPORTO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA,0,RS.Get(9));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGRESSIVO,0,RS.Get(10));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA,0,RS.Get(11));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_TIPO_VAR,0,RS.Get(12));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA,0,RS.Get(13));
      IMDB.set_Value(IMDBDef1.TBL_VARIAZIMPEG3,IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGDETIVA,0,new IDVariant(RS.Get(14),IDVariant.STRING));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // VARIMP
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCEVARPERESI_VARIMP8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_VARIMP8_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_VARIAZIMPEG3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_VARIAZIMPEG3, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_VARIMP8_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_VARIMP8_RS, 0, IMDBDef1.TBL_VARIAZIMPEG3, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 0, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_CODICE_STRUTTURA, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 1, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGCOPICO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 2, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 3, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 4, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_NUMERO_IMP, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 5, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 6, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 7, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 8, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 9, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 10, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 11, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_VARIMP8_RS, 12, 0, IMDBDef1.TBL_VARIAZIMPEG3, IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGDETIVA, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_VARIAZIMPEG3, 0);
      if (IMDB.Eof(IMDBDef1.TBL_VARIAZIMPEG3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_VARIAZIMPEG3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_VARIMP8_RS, 0);
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
    if (ColIndex.intValue() == PFL_VARIAZIONI_DUALINFOCAP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_DUALINFOIMPE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoImpegno1();
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
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "67A5F53C-403E-40DD-81FB-1B1E88FEA3E6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "Codice");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "F1A93627-5352-44D9-8F3E-F736ED5CEFAF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "Cod. Piano Conti");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "CB392535-F5B8-4B8A-A1D4-67912BC2FA73");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "6CBBC747-20B4-4CC6-BEBB-97F151D2E93E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, "555D0454-7FC8-4501-8197-F64065E6C845");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "59889439-FE92-4CC3-8E5B-538B2E298CAA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "Impegno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "CC934D33-97FC-4F4F-89E2-370F09C978C4");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "ANNO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, "E408B2A6-E1D0-4995-920F-78F697B5F397");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, "Info");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "DB473741-A35D-4653-84E9-7B5418F2F051");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, "D4113E92-6AC5-4BC4-99C9-08B28B09A0D7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, "Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "AA575484-523E-4768-9D05-58C4B828D15C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "ADF50B3F-8D87-4EA8-AB4E-FC9EE68A28BD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "1E86AAE0-B577-481A-A72B-326CFAF9F278");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "695FFEB6-4F95-4C2A-8673-D338AC47EA74");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, "A1CD2327-14F2-4E59-ACE1-A30086F19CDD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, "Var. Gen.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, "0C5BE268-C002-4755-A79F-BB2A65D844BF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, "Tipo Var.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODICE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODICE, PPQRY_VARIMP8, "A.CODICE_STRUTTURA", "RENOOGCACACS", 5, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 84, 36, 100, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 4, 256, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODPIANOCONT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODPIANOCONT, PPQRY_VARIMP8, "A.NOMOGGCOPICO", "RECCODPIACON", 9, 500, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 184, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARIMP8, "A.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 284, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ART, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ART, PPQRY_VARIMP8, "A.ARTICOLO", "RECORDART", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 316, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DUALINFOCAP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DUALINFOCAP, PPQRY_DUAL, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 336, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, "Imp.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 4, 148, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPEGNO, PPQRY_VARIMP8, "A.NUMERO_IMP", "RECORDIMPEGN", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 376, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP, PPQRY_VARIMP8, "A.ANNO_IMP", "RECORANNOIMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 412, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DUALINFOIMPE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DUALINFOIMPE, PPQRY_DUAL1, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 432, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 172, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARIMP8, "A.DESCRIZIONE", "RENOOGIMIMDE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_LIST, 332, 0, 340, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_FORM, 320, 240, 412, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ETICHEIMPEGN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ETICHEIMPEGN, -1, "", "ETICHEIMPEGN", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 672, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 208, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARIMP8, "A.IMPORTO", "RECORDIMPORT", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 796, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARIMP8, "A.ANNO_ESIGIBILITA", "RECOANNOESIG", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 800, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 256, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARIMP8, "A.PROGRESSIVO", "RECNOMOGGPRO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 256, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGUNITORGA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGUNITORGA, PPQRY_VARIMP8, "A.PROGR_UNITA_ORGANIZZATIVA", "RENOOGIMPRUO", 1, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_LIST, 860, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_LIST, 188);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_LIST, "Var. Gen.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_FORM, 4, 304, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_FORM, 188);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIVARIGENE, MyGlb.PANEL_FORM, "Var. Gen.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VARIVARIGENE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VARIVARIGENE, PPQRY_VARIMP8, "A.VARIAZIONE_GENERATA", "RENOOGVAVAGE", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIVARIGENE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIVARIGENE, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_LIST, 920, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_FORM, 4, 328, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCTIPOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCTIPOVAR, PPQRY_VARIMP8, "A.NOMOGGDETIVA", "RENOOGDETIVA", 9, 400, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORDCAPITO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORANNOIMP~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DUAL1, "DUAL");
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARIMP8", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_VARIAZIONI.SetQueryIMDB(PPQRY_VARIMP8, IMDBDef7.PQRY_VARIMP8_RS, IMDBDef1.TBL_VARIAZIMPEG3);
    JustLoaded = true;
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CODICE, IMDBDef1.FLD_VARIAZIMPEG3_CODICE_STRUTTURA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CODPIANOCONT, IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGCOPICO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CAPITOLO, IMDBDef1.FLD_VARIAZIMPEG3_CAPITOLO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ART, IMDBDef1.FLD_VARIAZIMPEG3_ARTICOLO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_IMPEGNO, IMDBDef1.FLD_VARIAZIMPEG3_NUMERO_IMP);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ANNOIMP, IMDBDef1.FLD_VARIAZIMPEG3_ANNO_IMP);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_DESCRIZIONE, IMDBDef1.FLD_VARIAZIMPEG3_DESCRIZIONE);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_IMPORTO, IMDBDef1.FLD_VARIAZIMPEG3_IMPORTO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ANNOESIGIBIL, IMDBDef1.FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROGRESSIVO, IMDBDef1.FLD_VARIAZIMPEG3_PROGRESSIVO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROGUNITORGA, IMDBDef1.FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_VARIVARIGENE, IMDBDef1.FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_DESCTIPOVAR, IMDBDef1.FLD_VARIAZIMPEG3_NOMOGGDETIVA);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIAZIMPEG3");
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
