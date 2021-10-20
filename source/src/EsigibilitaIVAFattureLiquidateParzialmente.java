// **********************************************
// Esigibilita IVA Fatture Liquidate Parzialmente
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsigibilitaIVAFattureLiquidateParzialmente extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FATTLIQUPARZ_FATTURA = 0;
  private static int GRP_FATTLIQUPARZ_IVA = 1;
  private static int GRP_FATTLIQUPARZ_LIQUIDAZIONE = 2;

  private static int PFL_FATTLIQUPARZ_FATRAGSOCEST = 0;
  private static int PFL_FATTLIQUPARZ_FATNUMERODOC = 1;
  private static int PFL_FATTLIQUPARZ_FATDDATADOC = 2;
  private static int PFL_FATTLIQUPARZ_FATIMPORTO = 3;
  private static int PFL_FATTLIQUPARZ_IVAIMPONIBIL = 4;
  private static int PFL_FATTLIQUPARZ_IVAALIQUOTA = 5;
  private static int PFL_FATTLIQUPARZ_IVAIVA = 6;
  private static int PFL_FATTLIQUPARZ_LIQNUMEROLIQ = 7;
  private static int PFL_FATTLIQUPARZ_LIQANNOLIQ = 8;
  private static int PFL_FATTLIQUPARZ_LIQDDATAREG = 9;
  private static int PFL_FATTLIQUPARZ_LIQIMPORTO = 10;
  private static int PFL_FATTLIQUPARZ_LIQIMPORTIVA = 11;
  private static int PFL_FATTLIQUPARZ_INFOLIQ = 12;
  private static int PFL_FATTLIQUPARZ_RIGASELEZION = 13;
  private static int PFL_FATTLIQUPARZ_IMPORTOIVA = 14;
  private static int PFL_FATTLIQUPARZ_SESSIONE = 15;
  private static int PFL_FATTLIQUPARZ_IMPIVNONMODI = 16;
  private static int PFL_FATTLIQUPARZ_PROGRESSIVO = 17;
  private static int PFL_FATTLIQUPARZ_SELNONMODIFI = 18;

  private static int PPQRY_WRKESIIVAPAR = 0;


  IDPanel PAN_FATTLIQUPARZ;
  private static int PFL_PARAMEELABOR_ANNULLA = 0;
  private static int PFL_PARAMEELABOR_ELABORA = 1;
  private static int PFL_PARAMEELABOR_UNO = 2;

  private static int PPQRY_DUAL34 = 0;


  IDPanel PAN_PARAMEELABOR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI691(IMDB);
    //
    //
    Init_PQRY_WRKESIIVAPAR(IMDB);
    Init_PQRY_DUAL34(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI691(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI691, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI691, "TBL_PARAMETRI691");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMEOGGDATDA, "NOMEOGGDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMEOGGDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMEOGGEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPREG, "NOMOGGTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL, "NOMOGGTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI691,IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI691, 0);
  }

  private static void Init_PQRY_WRKESIIVAPAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKESIIVAPAR, 19);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKESIIVAPAR, "PQRY_WRKESIIVAPAR");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_RAGIONE_SOCIALE_ESTESA, "FAT_RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_RAGIONE_SOCIALE_ESTESA,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_NUMERO_DOC, "FAT_NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_D_DATA_DOC, "FAT_D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_D_DATA_DOC,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_IMPORTO, "FAT_IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_FAT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IMPONIBILE, "IVA_IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_ALIQUOTA, "IVA_ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_ALIQUOTA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA, "IVA_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_NUMERO_LIQ, "LIQ_NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_ANNO_LIQ, "LIQ_ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_D_DATA_REG, "LIQ_D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_INFOLIQ, "INFOLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_INFOLIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO, "LIQ_IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO_IVA, "LIQ_IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IMPIVA_NON_MODIFICABILE, "IMPIVA_NON_MODIFICABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IMPIVA_NON_MODIFICABILE,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_RIGA_SELEZIONATA, "RIGA_SELEZIONATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_RIGA_SELEZIONATA,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_SEL_NON_MODIFICABILE, "SEL_NON_MODIFICABILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_SEL_NON_MODIFICABILE,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKESIIVAPAR,IMDBDef10.PQSL_WRKESIIVAPAR_PROGRESSIVO,1,6,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKESIIVAPAR, 0);
  }

  private static void Init_PQRY_DUAL34(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DUAL34, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_DUAL34, "PQRY_DUAL34");
    IMDB.set_FldCode(IMDBDef10.PQRY_DUAL34,IMDBDef10.PQSL_DUAL34_UNO, "UNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DUAL34,IMDBDef10.PQSL_DUAL34_UNO,1,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DUAL34, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsigibilitaIVAFattureLiquidateParzialmente(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsigibilitaIVAFattureLiquidateParzialmente()
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
    FormIdx = MyGlb.FRM_ESIIVAFALIPA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E6671B1A-6375-42E5-B245-CD906C0A290A";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2145;
    DesignWidth = 1236;
    DesignHeight = 582;
    set_Caption(new IDVariant("Esigibilita IVA Fatture Liquidate Parzialmente"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1236;
    Frames[1].Height = 556;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.856115;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1236;
    Frames[2].Height = 476;
    Frames[2].Caption = "Esisibilità IVA Fatture Liquidate Parzialmente";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 476;
    PAN_FATTLIQUPARZ = new IDPanel(w, this, 2, "PAN_FATTLIQUPARZ");
    Frames[2].Content = PAN_FATTLIQUPARZ;
    PAN_FATTLIQUPARZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTLIQUPARZ.VS = MainFrm.VisualStyleList;
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1236-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D10E05C6-4DF9-48D7-BA9B-A9BB7041F05A");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1184, 396, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTLIQUPARZ.InitStatus = 2;
    PAN_FATTLIQUPARZ_Init();
    PAN_FATTLIQUPARZ_InitFields();
    PAN_FATTLIQUPARZ_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1236;
    Frames[3].Height = 80;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri Elaborazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 80;
    PAN_PARAMEELABOR = new IDPanel(w, this, 3, "PAN_PARAMEELABOR");
    Frames[3].Content = PAN_PARAMEELABOR;
    PAN_PARAMEELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEELABOR.VS = MainFrm.VisualStyleList;
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1236-MyGlb.PAN_OFFS_X, 80-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "54486762-4536-4113-AFEE-641FF96FC3A2");
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEELABOR.InitStatus = 1;
    PAN_PARAMEELABOR_Init();
    PAN_PARAMEELABOR_InitFields();
    PAN_PARAMEELABOR_InitQueries();
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
      PAN_FATTLIQUPARZ.UpdatePanel(MainFrm);
      PAN_PARAMEELABOR.UpdatePanel(MainFrm);
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
    return (obj instanceof EsigibilitaIVAFattureLiquidateParzialmente);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsigibilitaIVAFattureLiquidateParzialmente.class.getName() : (Glb.ClassWithPackage(EsigibilitaIVAFattureLiquidateParzialmente.class) ? EsigibilitaIVAFattureLiquidateParzialmente.class.getName().substring(EsigibilitaIVAFattureLiquidateParzialmente.class.getPackage().getName().length() + 1) : EsigibilitaIVAFattureLiquidateParzialmente.class.getName()));
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
      RiempiTabellaWrk();
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      // 
      // Se non ci sono dati mando un messaggio ed esco
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ESIG_IVA_PARZIALE A ");
      SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Aggiornamento Esigibilità terminato correttamente. </br>Non risultano liquidazioni a mandato con pagamenti parziali da gestire"));
        MainFrm.set_AlertMessage(v_VMSG); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      if (MainFrm.DATAESIGIVA.equals((new IDVariant("P")), true))
      {
        PAN_FATTLIQUPARZ.set_Header(Glb.OBJ_FIELD,PFL_FATTLIQUPARZ_LIQIMPORTO, (new IDVariant("Importo Pagato")).stringValue());
      }
      else
      {
        PAN_FATTLIQUPARZ.set_Header(Glb.OBJ_FIELD,PFL_FATTLIQUPARZ_LIQIMPORTO, (new IDVariant("Importo")).stringValue());
      }
      // 
      // Inserisco nel titolo il bollato a cui si fa riferimento
      // 
      IDVariant v_VDESCRIBOLLA = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
      SQL.append("from ");
      SQL.append("  T04 A ");
      SQL.append("where (A.TIPO_REGISTRO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPREG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDESCRIBOLLA = QV.Get("T04DESCRIZIO", IDVariant.STRING) ;
      }
      QV.Close();
      v_VDESCRIBOLLA = IDL.Add((new IDVariant(" - Registro Acquisti in Attesa di Esigibilità - ")), v_VDESCRIBOLLA);
      set_Caption(IDL.Add((new IDVariant("Esigibilita IVA Fatture Liquidate Parzialmente")), v_VDESCRIBOLLA));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "Load", _e);
    }
  }

  // **********************************************************************
  // Fatture Liquidate Parzialmente On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTLIQUPARZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FATTLIQUPARZ);
      // 
      // Fatture Liquidate Parzialmente On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FATTLIQUPARZ.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTLIQUPARZ_FATRAGSOCEST,(new IDVariant(PAN_FATTLIQUPARZ.FieldText(PFL_FATTLIQUPARZ_FATRAGSOCEST))).stringValue()); 
      AbilitaDisabilitaCampiLista();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "FattureLiquidateParzialmenteOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Fatture Liquidate Parzialmente On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FATTLIQUPARZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fatture Liquidate Parzialmente On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true))
      {
        RiempiTabellaWrk();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "FattureLiquidateParzialmenteOnCommand", _e);
    }
  }

  // **********************************************************************
  // Fatture Liquidate Parzialmente On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FATTLIQUPARZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fatture Liquidate Parzialmente On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_FATTLIQUPARZ_RIGASELEZION)), true) && FieldWasModified.booleanValue())
      {
        // 
        // Quando si seleziona la riga e l'importo iva è modificabile
        // 
        // si calcola IMPORTO_IVA = LIQ_IMPORTOxIVA_ALIQUOTA/100
        // e se il risultato del calcolo supera il campo IVA_IVA
        // si  setta IMPORTO_IVA= IVA_IVA
        // 
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPIVA_NON_MODIFICABILE, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_RIGA_SELEZIONATA, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0)))
          {
            IDVariant v_VIMPIVA = new IDVariant(0,IDVariant.DECIMAL);
            v_VIMPIVA = IDL.Round(IDL.Div(IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IVA_ALIQUOTA, 0),(new IDVariant(0)))), (new IDVariant(100))), (new IDVariant(2)));
            if (v_VIMPIVA.compareTo(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA, 0),(new IDVariant(0))), true)>0)
            {
              v_VIMPIVA = IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA, 0);
            }
            IMDB.set_Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0, new IDVariant(v_VIMPIVA));
          }
          else
          {
            // IMDB.set_Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_FATTLIQUPARZ_IMPORTOIVA)), true) && FieldWasModified.booleanValue())
      {
        // 
        // Se inserisco un importo iva superiore a quello della
        // liquidazione importo l'importo iva uguale all'importo
        // iva della liquidazione
        // 
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          if (IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0).compareTo((new IDVariant(0)), true)<0)
          {
            IDVariant v_VMSG1 = new IDVariant(0,IDVariant.STRING);
            v_VMSG1 = (new IDVariant("L'importo non può essere negativo"));
            MainFrm.set_AlertMessage(v_VMSG1); 
          }
          if (IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPORTO_IVA, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA, 0), true)>0)
          {
            IDVariant v_VMSG2 = new IDVariant(0,IDVariant.STRING);
            v_VMSG2 = (new IDVariant("L'importo non può essere superiore a "));
            MainFrm.set_AlertMessage(IDL.Add(v_VMSG2, IDL.Format(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IVA_IVA, 0), (new IDVariant("###,###,###,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant("."))))); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "FattureLiquidateParzialmenteOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Abilita Disabilita Campi Lista
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AbilitaDisabilitaCampiLista ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Disabilita Campi Lista Body
      // Corpo Procedura
      // 
      // 
      // Se riga non selezionabile si disabilita il campo
      // 
      // 
      if (IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_SEL_NON_MODIFICABILE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_FATTLIQUPARZ.SetFlags (Glb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FATTLIQUPARZ.SetFlags (Glb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Se data per esigibilità iva è in Emissione e il campo
      // liq_importo_iva non è nullo il campo importo_iva non
      // è modificabile
      // 
      // 
      if (MainFrm.DATAESIGIVA.equals((new IDVariant("E")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_IMPORTO_IVA, 0))))
      {
        PAN_FATTLIQUPARZ.SetFlags (Glb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FATTLIQUPARZ.SetFlags (Glb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, (((IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_IMPIVA_NON_MODIFICABILE, 0).equals((new IDVariant("SI"))))?(new IDVariant(0)).booleanValue():(new IDVariant(-1)).booleanValue()))? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "AbilitaDisabilitaCampiLista", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Liquidazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Liquidazione Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_INFOLIQUIDAZ, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOLIQUIDAZ,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef10.PQRY_WRKESIIVAPAR, IMDBDef10.PQSL_WRKESIIVAPAR_LIQ_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "ApriInfoLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Msg Errore - Input/Output
  // **********************************************************************
  public boolean Controlli (IDVariant pMsgErrore)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Body
      // Corpo Procedura
      // 
      IDVariant v_VRET = null;
      v_VRET = (new IDVariant(-1));
      IDVariant v_VCONTROLLIOK = null;
      v_VCONTROLLIOK = (new IDVariant("NO"));
      IDVariant v_VMSGERRORE = new IDVariant(0,IDVariant.STRING);
      pMsgErrore.set((new IDVariant("")));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ESIGIVAPARZIALECONTROLLAWRK(MainFrm.PROGRESESSIO, v_VCONTROLLIOK, v_VMSGERRORE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        v_VRET = (new IDVariant(0));
        pMsgErrore.set((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())));
      }
      else
      {
        if (v_VCONTROLLIOK.compareTo((new IDVariant("SI")), true)!=0)
        {
          pMsgErrore.set(new IDVariant(v_VMSGERRORE));
          v_VRET = (new IDVariant(0));
        }
      }
      return v_VRET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "Controlli", _e);
      return false;
    }
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_VRISULTATO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VCONTROLLIOK = null;
      v_VCONTROLLIOK = (new IDVariant(-1));
      IDVariant v_VMSGERRCONTR = new IDVariant(0,IDVariant.STRING);
      // 
      // Controlli dati immessi
      // 
      PAN_FATTLIQUPARZ.PanelCommand(Glb.PCM_UPDATE);
      if (new IDVariant(PAN_FATTLIQUPARZ.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        return 0;
      }
      v_VCONTROLLIOK = (new IDVariant(Controlli(v_VMSGERRCONTR)));
      if (!(v_VCONTROLLIOK.booleanValue()))
      {
        IDVariant v_VMSGE = new IDVariant(0,IDVariant.STRING);
        v_VMSGE = (new IDVariant("Dati non compilati correttamente !"));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_VMSGE, (new IDVariant("</br>"))), v_VMSGERRCONTR)); 
        return 0;
      }
      // 
      // Elaborazione
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ESIGIVAPARZIALEESIGIBILITA(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGDATREG, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_VRISULTATO);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else if (IDL.NullValue(v_VRISULTATO,(new IDVariant("Elaborazione Eseguita."))).compareTo((new IDVariant("Elaborazione Eseguita.")), true)!=0)
      {
        RiempiTabellaWrk();
        PAN_FATTLIQUPARZ.PanelCommand(Glb.PCM_REQUERY);
        MainFrm.set_AlertMessage(v_VRISULTATO); 
        return 0;
      }
      else
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Elaborazione terminata"));
        MainFrm.set_AlertMessage(v_VMSG); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi Tabella Wrk
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiTabellaWrk ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Tabella Wrk Body
      // Corpo Procedura
      // 
      IDVariant v_VANOMALIA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ESIGIVAPARZIALECARICAWRK(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMEOGGDATDA, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMEOGGEDATA, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGDATREG, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPREG, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_VANOMALIA);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_ANOMALIA = new IDVariant(0,IDVariant.STRING);
        if (IDL.IsNull(v_VANOMALIA))
        {
          // MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_ANOMALIA); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsigibilitaIVAFattureLiquidateParzialmente", "RiempiTabellaWrk", _e);
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
  private void PAN_FATTLIQUPARZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTLIQUPARZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTLIQUPARZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTLIQUPARZ, Cancel);
    // Stub
  }

  private void PAN_FATTLIQUPARZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FATTLIQUPARZ_INFOLIQ)
    {
      this.IdxPanelActived = this.PAN_FATTLIQUPARZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoLiquidazione();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FATTLIQUPARZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FATTLIQUPARZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FATTLIQUPARZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTLIQUPARZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEELABOR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEELABOR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEELABOR);
    // Stub
  }

  private void PAN_PARAMEELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMEELABOR_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMEELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMEELABOR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMEELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMEELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FATTLIQUPARZ_Init()
  {

    PAN_FATTLIQUPARZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTLIQUPARZ.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, "E5216395-074E-43DA-AF92-5EAF48F7B7AA");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, "Fattura");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, MyGlb.PANEL_LIST, 0, -9999, 476, 16, 0, 0);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, MyGlb.PANEL_FORM, 0, -21, 696, 121, 0, 0);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, 0, 42);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, 1, 13);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, 0, 4);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, 1, 4);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_FATTURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, "1BD70246-8DFB-4C71-A64A-B29EE172127E");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, "IVA");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, MyGlb.PANEL_LIST, 476, -9999, 220, 16, 0, 0);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, MyGlb.PANEL_FORM, 0, 75, 168, 321, 0, 0);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, 0, 20);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, 1, 13);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, 0, 4);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, 1, 4);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_IVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, "A36B6541-3FD2-4B22-A142-33CCA300A500");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, "Liquidazione");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, MyGlb.PANEL_LIST, 696, -9999, 348, 16, 0, 0);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, 123, 568, 169, 0, 0);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, 0, 70);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, 1, 13);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, 0, 4);
    PAN_FATTLIQUPARZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, 1, 4);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_GROUP, GRP_FATTLIQUPARZ_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FATTLIQUPARZ.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, "90B6DB6D-BD27-4AA7-A84B-21A7A691A859");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, "Fornitore");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, "8A16816C-BBDD-45A0-A66A-5C71E1F56915");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, "Documento");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, "180AF108-2BBE-40F9-9AC9-1DFDCC151BAE");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, "Data");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, "1EDEA7AA-CAC3-4AFE-AE0D-DB0B1ECFF5BC");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, "Importo");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, "95E5B1C5-5BF1-4878-B69D-8D994501B7F0");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, "Imponibile");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, "7579CD2F-99BF-447D-AA5C-FA926AADF7EA");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, "Aliquota");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, "54E74D31-9695-49DB-ABFF-A6A16A948D8E");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, "IVA");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, "2B0878C0-2A04-4DFA-9C68-A6AC1CDEBE85");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, "Numero");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, "757DC972-0DFA-43C0-AA4C-1B2FCF62FB7A");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, "Anno");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, "E7C4E52E-CCAD-4C93-B9A9-C928DC4BEEE9");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, "Data");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, "9B95D093-99E7-453C-9ED8-95B76DA5D12D");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, "Importo");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, "389B2BED-1CF2-43D9-BEDA-A4A0E634A6E5");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, "Importo Iva");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, "6F607546-375E-40A1-A3EB-7C62C3D87B7D");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, " ");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, "9F186F70-9E26-4D7B-BCC5-1CF7B5343AB8");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, "Sel.");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.VIS_CHECKSTYLE);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, "FF8D83B3-9719-4B85-A5E9-7108392DE388");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, "Importo IVA");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, "3739DA75-C30D-46C9-9AA2-A993F52A954C");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, "SESSIONE");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, "D5A6D9BF-7176-4CC2-94BD-F388F068EB1C");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, "IMPIVA NON MODIFICABILE");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, "3A4E23E7-4B86-48AA-B444-17853F380582");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, "PROGRESSIVO");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FATTLIQUPARZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, "CE7850AE-0801-4BB6-BEE0-CB2593D14A86");
    PAN_FATTLIQUPARZ.set_Header(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, "SEL NON MODIFICABILE");
    PAN_FATTLIQUPARZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, "");
    PAN_FATTLIQUPARZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTLIQUPARZ.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTLIQUPARZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_LIST, 0, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_LIST, 176);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_LIST, "Fornitore");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_FORM, 4, 4, 688, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_FORM, 176);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATRAGSOCEST, MyGlb.PANEL_FORM, "Fornitore");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_FATRAGSOCEST, -1, GRP_FATTLIQUPARZ_FATTURA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_FATRAGSOCEST, PPQRY_WRKESIIVAPAR, "A.FAT_RAGIONE_SOCIALE_ESTESA", "FAT_RAGIONE_SOCIALE_ESTESA", 5, 100, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_LIST, 212, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_LIST, 108);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_LIST, "Documento");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 28, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_FORM, 108);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATNUMERODOC, MyGlb.PANEL_FORM, "Documento");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_FATNUMERODOC, -1, GRP_FATTLIQUPARZ_FATTURA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_FATNUMERODOC, PPQRY_WRKESIIVAPAR, "A.FAT_NUMERO_DOC", "FAT_NUMERO_DOC", 5, 20, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_LIST, 324, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_LIST, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_FORM, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATDDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_FATDDATADOC, -1, GRP_FATTLIQUPARZ_FATTURA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_FATDDATADOC, PPQRY_WRKESIIVAPAR, "A.FAT_D_DATA_DOC", "FAT_D_DATA_DOC", 6, 19, 0, -13997);
    PAN_FATTLIQUPARZ.set_Alignment(PFL_FATTLIQUPARZ_FATDDATADOC, 3);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_LIST, 396, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_LIST, 88);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_FORM, 4, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_FORM, 88);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_FATIMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_FATIMPORTO, -1, GRP_FATTLIQUPARZ_FATTURA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_FATIMPORTO, PPQRY_WRKESIIVAPAR, "A.FAT_IMPORTO", "FAT_IMPORTO", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_LIST, 476, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_LIST, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_LIST, "Imponibile");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_FORM, 4, 100, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_FORM, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIMPONIBIL, MyGlb.PANEL_FORM, "Imponibile");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_IVAIMPONIBIL, -1, GRP_FATTLIQUPARZ_IVA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_IVAIMPONIBIL, PPQRY_WRKESIIVAPAR, "A.IVA_IMPONIBILE", "IVA_IMPONIBILE", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_LIST, 556, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_LIST, 92);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_LIST, "Aliquota");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_FORM, 92);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_IVAALIQUOTA, -1, GRP_FATTLIQUPARZ_IVA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_IVAALIQUOTA, PPQRY_WRKESIIVAPAR, "A.IVA_ALIQUOTA", "IVA_ALIQUOTA", 1, 2, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_LIST, 616, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_LIST, 52);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_LIST, "IVA");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_FORM, 12, 372, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_FORM, 52);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IVAIVA, MyGlb.PANEL_FORM, "IVA");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_IVAIVA, -1, GRP_FATTLIQUPARZ_IVA);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_IVAIVA, PPQRY_WRKESIIVAPAR, "A.IVA_IVA", "IVA_IVA", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_LIST, 696, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_LIST, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_LIST, "Numero");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_FORM, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQNUMEROLIQ, MyGlb.PANEL_FORM, "Numero");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_LIQNUMEROLIQ, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_LIQNUMEROLIQ, PPQRY_WRKESIIVAPAR, "A.LIQ_NUMERO_LIQ", "LIQ_NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_LIST, 748, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_LIST, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_LIST, "Anno");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_FORM, 4, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_FORM, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQANNOLIQ, MyGlb.PANEL_FORM, "Anno");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_LIQANNOLIQ, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_LIQANNOLIQ, PPQRY_WRKESIIVAPAR, "A.LIQ_ANNO_LIQ", "LIQ_ANNO_LIQ", 1, 4, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_LIST, 792, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_LIST, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_LIST, "Data");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_FORM, 100);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQDDATAREG, MyGlb.PANEL_FORM, "Data");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_LIQDDATAREG, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_LIQDDATAREG, PPQRY_WRKESIIVAPAR, "A.LIQ_D_DATA_REG", "LIQ_D_DATA_REG", 6, 19, 0, -13997);
    PAN_FATTLIQUPARZ.set_Alignment(PFL_FATTLIQUPARZ_LIQDDATAREG, 3);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_LIST, 860, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_LIST, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_FORM, 4, 244, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_FORM, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_LIQIMPORTO, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_LIQIMPORTO, PPQRY_WRKESIIVAPAR, "A.LIQ_IMPORTO", "LIQ_IMPORTO", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_LIST, 940, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_LIST, 108);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_LIST, "Importo Iva");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_FORM, 4, 268, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_FORM, 108);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_LIQIMPORTIVA, MyGlb.PANEL_FORM, "Importo Iva");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_LIQIMPORTIVA, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_LIQIMPORTIVA, PPQRY_WRKESIIVAPAR, "A.LIQ_IMPORTO_IVA", "LIQ_IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_LIST, 1020, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_LIST, 52);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_LIST, " ");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_FORM, 4, 220, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_FORM, 52);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_INFOLIQ, MyGlb.PANEL_FORM, " ");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_INFOLIQ, -1, GRP_FATTLIQUPARZ_LIQUIDAZIONE);
    PAN_FATTLIQUPARZ.SetFieldUnbound(PFL_FATTLIQUPARZ_INFOLIQ, true);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_INFOLIQ, PPQRY_WRKESIIVAPAR, "CASE WHEN (A.LIQ_ANNO_LIQ IS NULL) THEN NULL ELSE 'I' END", "INFOLIQ", 5, 99, 0, -13997);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_INFOLIQ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FATTLIQUPARZ.set_ImageResizeMode(PFL_FATTLIQUPARZ_INFOLIQ, 2);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_LIST, 1044, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_LIST, 116);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_LIST, "Sel.");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_FORM, 4, 316, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_FORM, 116);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_RIGASELEZION, MyGlb.PANEL_FORM, "Sel.");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_RIGASELEZION, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_RIGASELEZION, PPQRY_WRKESIIVAPAR, "A.RIGA_SELEZIONATA", "RIGA_SELEZIONATA", 5, 2, 0, -13997);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_RIGASELEZION, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FATTLIQUPARZ.SetValueListItem(PFL_FATTLIQUPARZ_RIGASELEZION, (new IDVariant()), "Null", "", "", -1);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_LIST, 1072, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 340, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_IMPORTOIVA, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_IMPORTOIVA, PPQRY_WRKESIIVAPAR, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_LIST, 64);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_FORM, 4, 396, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_FORM, 64);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_SESSIONE, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_SESSIONE, PPQRY_WRKESIIVAPAR, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_LIST, 1244, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_LIST, 64);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_LIST, "IMP. NON MODIFIC.");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_FORM, 4, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_FORM, 64);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_IMPIVNONMODI, MyGlb.PANEL_FORM, "I. N. MOD.");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_IMPIVNONMODI, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_IMPIVNONMODI, PPQRY_WRKESIIVAPAR, "A.IMPIVA_NON_MODIFICABILE", "IMPIVA_NON_MODIFICABILE", 5, 2, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 396, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_PROGRESSIVO, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_PROGRESSIVO, PPQRY_WRKESIIVAPAR, "A.PROGRESSIVO", "PROGRESSIVO", 1, 6, 0, -13997);
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_LIST, 136);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_LIST, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_LIST, "SEL NON MODIFICABILE");
    PAN_FATTLIQUPARZ.SetRect(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_FORM, 4, 396, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTLIQUPARZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_FORM, 136);
    PAN_FATTLIQUPARZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_FORM, 1);
    PAN_FATTLIQUPARZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTLIQUPARZ_SELNONMODIFI, MyGlb.PANEL_FORM, "SEL NON MODIFICABILE");
    PAN_FATTLIQUPARZ.SetFieldPage(PFL_FATTLIQUPARZ_SELNONMODIFI, -1, -1);
    PAN_FATTLIQUPARZ.SetFieldPanel(PFL_FATTLIQUPARZ_SELNONMODIFI, PPQRY_WRKESIIVAPAR, "A.SEL_NON_MODIFICABILE", "SEL_NON_MODIFICABILE", 5, 2, 0, -13997);
  }

  private void PAN_FATTLIQUPARZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTLIQUPARZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTLIQUPARZ.SetIMDB(IMDB, "PQRY_WRKESIIVAPAR", true);
    PAN_FATTLIQUPARZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FAT_RAGIONE_SOCIALE_ESTESA as FAT_RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.FAT_NUMERO_DOC as FAT_NUMERO_DOC, ");
    SQL.append("  A.FAT_D_DATA_DOC as FAT_D_DATA_DOC, ");
    SQL.append("  A.FAT_IMPORTO as FAT_IMPORTO, ");
    SQL.append("  A.IVA_IMPONIBILE as IVA_IMPONIBILE, ");
    SQL.append("  A.IVA_ALIQUOTA as IVA_ALIQUOTA, ");
    SQL.append("  A.IVA_IVA as IVA_IVA, ");
    SQL.append("  A.LIQ_NUMERO_LIQ as LIQ_NUMERO_LIQ, ");
    SQL.append("  A.LIQ_ANNO_LIQ as LIQ_ANNO_LIQ, ");
    SQL.append("  A.LIQ_D_DATA_REG as LIQ_D_DATA_REG, ");
    SQL.append("  CASE WHEN (A.LIQ_ANNO_LIQ IS NULL) THEN NULL ELSE 'I' END as INFOLIQ, ");
    SQL.append("  A.LIQ_IMPORTO as LIQ_IMPORTO, ");
    SQL.append("  A.LIQ_IMPORTO_IVA as LIQ_IMPORTO_IVA, ");
    SQL.append("  A.IMPIVA_NON_MODIFICABILE as IMPIVA_NON_MODIFICABILE, ");
    SQL.append("  A.RIGA_SELEZIONATA as RIGA_SELEZIONATA, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  A.SEL_NON_MODIFICABILE as SEL_NON_MODIFICABILE, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_ESIG_IVA_PARZIALE A ");
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTLIQUPARZ.SetQuery(PPQRY_WRKESIIVAPAR, 5, SQL, -1, "");
    PAN_FATTLIQUPARZ.SetQueryDB(PPQRY_WRKESIIVAPAR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTLIQUPARZ.SetMasterTable(0, "WRK_ESIG_IVA_PARZIALE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTLIQUPARZ.Status() == 2)
    {
      int oldListQBE = PAN_FATTLIQUPARZ.iUseListQBE;
      PAN_FATTLIQUPARZ.iUseListQBE = 0;
      PAN_FATTLIQUPARZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTLIQUPARZ.PanelCommand(Glb.PCM_FIND);
      PAN_FATTLIQUPARZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEELABOR_Init()
  {

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, "DA8EDEA9-AA1A-4868-9408-B66F2F737FCA");
    PAN_PARAMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, "Annulla");
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMEELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, "B79BC2C2-DDB2-4CCC-8A1B-8B4313AA6CFA");
    PAN_PARAMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, "Elabora");
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMEELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, 0, "button1.gif", false);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, "44DA798F-2C6E-4642-87BA-B439021A5A08");
    PAN_PARAMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, "Uno");
    PAN_PARAMEELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, "");
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMEELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_LIST, 112, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_FORM, 916, 24, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEELABOR.SetFieldPage(PFL_PARAMEELABOR_ANNULLA, -1, -1);
    PAN_PARAMEELABOR.SetFieldPanel(PFL_PARAMEELABOR_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAMEELABOR.set_ImageResizeMode(PFL_PARAMEELABOR_ANNULLA, 3);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 104, 28, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 1064, 24, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEELABOR.SetFieldPage(PFL_PARAMEELABOR_ELABORA, -1, -1);
    PAN_PARAMEELABOR.SetFieldPanel(PFL_PARAMEELABOR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMEELABOR.set_ImageResizeMode(PFL_PARAMEELABOR_ELABORA, 3);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_LIST, "Uno");
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_FORM, 4, 60, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_FORM, 32);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_UNO, MyGlb.PANEL_FORM, "Uno");
    PAN_PARAMEELABOR.SetFieldPage(PFL_PARAMEELABOR_UNO, -1, -1);
    PAN_PARAMEELABOR.SetFieldUnbound(PFL_PARAMEELABOR_UNO, true);
    PAN_PARAMEELABOR.SetFieldPanel(PFL_PARAMEELABOR_UNO, PPQRY_DUAL34, "1", "UNO", 1, 19, 0, -13997);
  }

  private void PAN_PARAMEELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEELABOR.SetIMDB(IMDB, "PQRY_DUAL34", true);
    PAN_PARAMEELABOR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as UNO ");
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetQuery(PPQRY_DUAL34, 5, SQL, -1, "");
    PAN_PARAMEELABOR.SetQueryDB(PPQRY_DUAL34, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEELABOR.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEELABOR.iUseListQBE;
      PAN_PARAMEELABOR.iUseListQBE = 0;
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEELABOR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_DynamicProperties();
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_FATTLIQUPARZ) PAN_FATTLIQUPARZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
