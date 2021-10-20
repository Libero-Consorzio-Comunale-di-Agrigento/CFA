// **********************************************
// Elenco Liquidazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoLiquidazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 0;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 1;
  private static int PFL_LIQUIDAZIONI_INFO = 2;
  private static int PFL_LIQUIDAZIONI_NUMEROMAND = 3;
  private static int PFL_LIQUIDAZIONI_DDATAMAND = 4;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 5;
  private static int PFL_LIQUIDAZIONI_LIQUIDAZIONI = 6;
  private static int PFL_LIQUIDAZIONI_MANDATO = 7;
  private static int PFL_LIQUIDAZIONI_SEDEDEL = 8;
  private static int PFL_LIQUIDAZIONI_NUMERODEL = 9;
  private static int PFL_LIQUIDAZIONI_ANNODEL = 10;
  private static int PFL_LIQUIDAZIONI_DELIBERA = 11;
  private static int PFL_LIQUIDAZIONI_DESCRIZIONE = 12;
  private static int PFL_LIQUIDAZIONI_BOLLO = 13;
  private static int PFL_LIQUIDAZIONI_CAPITOLO = 14;
  private static int PFL_LIQUIDAZIONI_ARTICOLO = 15;
  private static int PFL_LIQUIDAZIONI_CAPITOLOART = 16;
  private static int PFL_LIQUIDAZIONI_NUMEROIMP = 17;
  private static int PFL_LIQUIDAZIONI_ANNOIMP = 18;
  private static int PFL_LIQUIDAZIONI_SEDEDEL1 = 19;
  private static int PFL_LIQUIDAZIONI_NUMERODEL1 = 20;
  private static int PFL_LIQUIDAZIONI_ANNODEL1 = 21;
  private static int PFL_LIQUIDAZIONI_NUMEROSUBIMP = 22;
  private static int PFL_LIQUIDAZIONI_ANNOSUBIMP = 23;
  private static int PFL_LIQUIDAZIONI_SEDEDEL2 = 24;
  private static int PFL_LIQUIDAZIONI_NUMERODEL2 = 25;
  private static int PFL_LIQUIDAZIONI_ANNODEL2 = 26;
  private static int PFL_LIQUIDAZIONI_IMPEGNO = 27;
  private static int PFL_LIQUIDAZIONI_SUBIMPEGNO = 28;
  private static int PFL_LIQUIDAZIONI_NUMERODISTIN = 29;
  private static int PFL_LIQUIDAZIONI_ANNODISTINTA = 30;
  private static int PFL_LIQUIDAZIONI_DISTINTA = 31;
  private static int PFL_LIQUIDAZIONI_TOTLIQ = 32;
  private static int PFL_LIQUIDAZIONI_TOTLIQ1 = 33;
  private static int PFL_LIQUIDAZIONI_TOTLIQ2 = 34;
  private static int PFL_LIQUIDAZIONI_TOTLIQ3 = 35;
  private static int PFL_LIQUIDAZIONI_IMPEGNO1 = 36;
  private static int PFL_LIQUIDAZIONI_IMPEGNO2 = 37;
  private static int PFL_LIQUIDAZIONI_NEWPANELLABE = 38;

  private static int PPQRY_LIQ53 = 0;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM48(IMDB);
    //
    //
    Init_PQRY_LIQ53(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM48(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM48, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM48, "TBL_PARAM48");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM48,IMDBDef2.FLD_PARAM48_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM48,IMDBDef2.FLD_PARAM48_ROWNAMANNPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM48,IMDBDef2.FLD_PARAM48_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM48,IMDBDef2.FLD_PARAM48_ROWNAMNUMPRO,1,8,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM48, 0);
  }

  private static void Init_PQRY_LIQ53(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_LIQ53, 26);
    IMDB.set_TblCode(IMDBDef10.PQRY_LIQ53, "PQRY_LIQ53");
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQBOLLO, "LIQBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQBOLLO,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQSEDEDEL1, "LIQSEDEDEL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQSEDEDEL1,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQNUMERDEL1, "LIQNUMERDEL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQNUMERDEL1,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQANNODEL1, "LIQANNODEL1");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQANNODEL1,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQSEDEDEL2, "LIQSEDEDEL2");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQSEDEDEL2,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQNUMERDEL2, "LIQNUMERDEL2");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQNUMERDEL2,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQANNODEL2, "LIQANNODEL2");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQANNODEL2,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQINFO, "LIQINFO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ53,IMDBDef10.PQSL_LIQ53_LIQINFO,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_LIQ53, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoLiquidazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoLiquidazioni()
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
    FormIdx = MyGlb.FRM_ELENCOLIQUID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "395A101B-182E-485F-ACFE-041C874F2EBD";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 458;
    set_Caption(new IDVariant("Elenco Liquidazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 432;
    Frames[1].Caption = "Liquidazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 432;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 1, "PAN_LIQUIDAZIONI");
    Frames[1].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 432-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "27FF097A-4652-4117-828B-1AD363B032B7");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1652, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 2;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
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
      PAN_LIQUIDAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoLiquidazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoLiquidazioni.class.getName() : (Glb.ClassWithPackage(ElencoLiquidazioni.class) ? ElencoLiquidazioni.class.getName().substring(ElencoLiquidazioni.class.getPackage().getName().length() + 1) : ElencoLiquidazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGATO = new IDVariant(0,IDVariant.DECIMAL);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni After Find Event Body
      // Procedure Body
      // 
      C2 = PAN_LIQUIDAZIONI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUIDAZIONI.GotoFirst();
      while (!PAN_LIQUIDAZIONI.RSEOF())
      {
        v_IMPORTO = IDL.Add(v_IMPORTO, C2.Get("IMPORTO"));
        if (!(IDL.IsNull(C2.Get("NUMERO_MAND"))))
        {
          v_PAGATO = IDL.Add(v_PAGATO, C2.Get("IMPORTO"));
        }
        PAN_LIQUIDAZIONI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_TOTLIQ2, IDL.ToString(IDL.NullValue(v_IMPORTO,(new IDVariant(0)))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_TOTLIQ3, IDL.ToString(IDL.NullValue(v_PAGATO,(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioni", "LiquidazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Change Status Event Body
      // Procedure Body
      // 
      AllineamentoCampiRicerca();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioni", "LiquidazioniOnChangeStatusEvent", _e);
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
    IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_LIQUIDAZIONI = (new IDVariant("Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_LIQUIDAZIONI, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Allineamento Campi Ricerca
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AllineamentoCampiRicerca ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allineamento Campi Ricerca Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUIDAZIONI.Status()).equals((new IDVariant(1)), true))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_LIQUIDAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUIDAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioni", "AllineamentoCampiRicerca", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef10.PQRY_LIQ53, IMDBDef10.PQSL_LIQ53_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef10.PQRY_LIQ53, IMDBDef10.PQSL_LIQ53_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioni", "Info", _e);
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
  private void PAN_LIQUIDAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFO)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ53, IMDBDef10.PQSL_LIQ53_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_LIQ53, IMDBDef10.PQSL_LIQ53_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 39);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "B9A2BA87-B5D4-4F34-B85F-A2EED08AA818");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "38FFDC1D-18C0-4C7A-B290-A347E96FC167");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, "D6D7A8EC-FA9F-46A7-B794-626DA292D109");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, "Info");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, "691AEAA6-620F-4716-AEF8-3F80D9DB4316");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, "NUMERO MAND");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, "E7B2F72D-6292-48E1-9F7A-B5ECD574C0A4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, "D DATA MAND");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "99431758-3103-4398-96C5-5DC25B929023");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, "CB2336E7-0BA0-49E5-B087-8128E4799E28");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, "ACFD4F7E-EADA-4266-976B-D369951F25AA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, "Mandato");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "B6E6DB42-4B83-4ADE-90A3-CC021D2674FE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "SEDE DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "A1DE4EA3-5F1F-403E-AC6E-746A3D1475FF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "NUMERO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "383BA3BE-CD81-4B23-9AB4-B471CED9D351");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "ANNO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, "F24A7016-3BA7-4CC4-A24A-742A063952CA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, "Delibera");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "3AE3C3BD-5FBF-49C3-8A20-E01AC6A27036");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, "F0BCD08C-494D-460D-A223-0E2745865013");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, "Bollo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "6DACE27B-9992-45F3-90EB-7CBE0F422DE2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "CAPITOLO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "7A4F6AA8-2C21-4559-B4F5-63D3E8FA9C0E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "ARTICOLO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, "FA0CABF6-75FD-4B9F-A23F-66D8A91D8043");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, "Capitolo/Art.");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "15FAA79A-FBA9-47D1-8498-CFE895EB0889");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "NUMERO IMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "707CAF02-B05C-47C3-B5AF-E55436105563");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "ANNO IMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, "8EA7396A-30FB-4D1F-9195-B3EF8251E56A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, "SEDE DEL 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, "FD3C9480-00AA-4132-B29C-5D16651F02E6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, "NUMERO DEL 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, "3D85C3E4-CA94-4EDC-940D-D464B4C311FC");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, "ANNO DEL 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "3E77B68F-FB32-4FAA-A2FA-38D039A0AF8F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "F029B40A-F0B2-4050-B00D-0A66C408EF80");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, "49AA3C5F-E6C6-47BD-9E1B-F5FFD91FF8A6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, "SEDE DEL 2");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, "D1A89B71-A375-468A-A831-CD38F82BE3C6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, "NUMERO DEL 2");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, "66758B07-F4FE-48D8-A61C-DB905F9681B3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, "ANNO DEL 2");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, "BFCF76FC-B985-4A59-89A4-78258AEACB75");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, "Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, "CB3CB6DC-529A-4106-AE3A-0769F18B888C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, "Sub-Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "E907DC0C-3668-46CD-A8AF-369A1C800AB0");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "NUMERO DISTINTA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "E6FB1B70-9393-4440-BBF8-D94FA54EF356");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "ANNO DISTINTA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, "C5A9764F-5272-4303-ADFF-4F850B51C8FB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, "Distinta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, "A7C8E490-7AD2-46B3-851A-8B53B5ABC2CE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, "Totale Liquidazioni:");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.VIS_VUOGRAALILEF);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, "F8E4FDCE-7066-412E-8333-319A9AC8C0B4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, "Totale Mandati:");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.VIS_VUOGRAALILEF);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, "B788386B-DD66-492C-BF15-3312F803D13B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, "FB0CF1E0-9F10-418B-9DE9-5EFEBC77EC92");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, "8F8D6E52-D9AB-4DE0-B502-A308BF75D098");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, "Delibera Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, "3700E826-172D-4381-B3A3-D869ECACA80F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, "Delibera Sub Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, "F16C3BD4-B777-4A53-A1D6-B1A9330F8C54");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQ53, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 48, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQ53, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_LIST, 88, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_LIST, 28);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_FORM, 4, 832, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_FORM, 28);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFO, MyGlb.PANEL_FORM, "Inf.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFO, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFO, PPQRY_LIQ53, "CASE WHEN NOT ((A.NUMERO_LIQ IS NULL)) THEN 'I' ELSE '' END", "LIQINFO", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 112, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 292, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MN.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROMAND, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROMAND, PPQRY_LIQ53, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_LIST, 160, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_LIST, "D DATA MAND");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_FORM, 4, 292, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAMAND, MyGlb.PANEL_FORM, "D DT. MAND");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATAMAND, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATAMAND, PPQRY_LIQ53, "B.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 228, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQ53, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 0, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQUIDAZIONI, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQUIDAZIONI, -1, "", "LIQUIDAZIONI", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 112, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 8, 8, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_MANDATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_MANDATO, -1, "", "MANDATO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 312, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 4, 340, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL, PPQRY_LIQ53, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 360, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 364, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL, PPQRY_LIQ53, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL, PPQRY_LIQ53, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_LIST, 312, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_FORM, 16, 16, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DELIBERA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 448, 36, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 412, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DESCRIZIONE, PPQRY_LIQ53, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_LIST, 756, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_FORM, 4, 448, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BOLLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_BOLLO, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BOLLO, PPQRY_LIQ53, "C.DESCRIZIONE", "LIQBOLLO", 5, 40, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 964, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 496, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLO, PPQRY_LIQ53, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1068, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 520, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ARTICOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ARTICOLO, PPQRY_LIQ53, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 964, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 24, 24, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLOART, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1108, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 544, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROIMP, PPQRY_LIQ53, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 616, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOIMP, PPQRY_LIQ53, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_LIST, 1200, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_LIST, "SEDE DEL 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_FORM, 4, 688, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL1, MyGlb.PANEL_FORM, "SD. DL. 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_SEDEDEL1, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL1, PPQRY_LIQ53, "D.SEDE_DEL", "LIQSEDEDEL1", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_LIST, 1248, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_LIST, "NUM. DEL 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_FORM, 4, 712, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL1, MyGlb.PANEL_FORM, "NUM. DEL 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_NUMERODEL1, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL1, PPQRY_LIQ53, "D.NUMERO_DEL", "LIQNUMERDEL1", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_LIST, 1296, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_LIST, "ANNO DEL 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_FORM, 4, 736, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL1, MyGlb.PANEL_FORM, "AN. DL. 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_ANNODEL1, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL1, PPQRY_LIQ53, "D.ANNO_DEL", "LIQANNODEL1", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1336, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUBIMP");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 592, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROSUBIMP, PPQRY_LIQ53, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1388, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 568, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOSUBIMP, PPQRY_LIQ53, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_LIST, 1428, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_LIST, "SEDE DEL 2");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_FORM, 4, 760, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL2, MyGlb.PANEL_FORM, "SD. DL. 2");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_SEDEDEL2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL2, PPQRY_LIQ53, "E.SEDE_DEL", "LIQSEDEDEL2", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 1476, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, "NUM. DEL 2");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 4, 784, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, "NUM. DEL 2");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_NUMERODEL2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL2, PPQRY_LIQ53, "E.NUMERO_DEL", "LIQNUMERDEL2", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 1524, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_LIST, "ANNO DEL 2");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 4, 808, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL2, MyGlb.PANEL_FORM, "AN. DL. 2");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_ANNODEL2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL2, PPQRY_LIQ53, "E.ANNO_DEL", "LIQANNODEL2", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1108, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 32, 32, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1336, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 40, 40, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SUBIMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1564, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 640, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, "NUM. DISTINTA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODISTIN, PPQRY_LIQ53, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1612, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 664, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, "ANN. DISTINTA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODISTINTA, PPQRY_LIQ53, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 1564, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 8, 8, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTA, -1, "", "DISTINTA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_LIST, 112, 252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_FORM, 100, 260, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TOTLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TOTLIQ, -1, "", "TOTLIQ", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_LIST, 132, 276, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_FORM, 108, 268, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TOTLIQ1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TOTLIQ1, -1, "", "TOTLIQ1", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_LIST, 228, 252, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_FORM, 108, 268, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TOTLIQ2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TOTLIQ2, -1, "", "TOTLIQ2", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_LIST, 228, 276, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_FORM, 116, 276, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTLIQ3, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TOTLIQ3, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TOTLIQ3, -1, "", "TOTLIQ3", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 1200, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 40, 40, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO1, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNO1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNO1, -1, "", "IMPEGNO1", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_LIST, 1428, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_FORM, 48, 48, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO2, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNO2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNO2, -1, "", "IMPEGNO2", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 88, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 88, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NEWPANELLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NEWPANELLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQ53", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  B.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  C.DESCRIZIONE as LIQBOLLO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  D.SEDE_DEL as LIQSEDEDEL1, ");
    SQL.append("  D.NUMERO_DEL as LIQNUMERDEL1, ");
    SQL.append("  D.ANNO_DEL as LIQANNODEL1, ");
    SQL.append("  E.SEDE_DEL as LIQSEDEDEL2, ");
    SQL.append("  E.NUMERO_DEL as LIQNUMERDEL2, ");
    SQL.append("  E.ANNO_DEL as LIQANNODEL2, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_LIQ IS NULL)) THEN 'I' ELSE '' END as LIQINFO ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  MAN B, ");
    SQL.append("  T60 C, ");
    SQL.append("  IMP D, ");
    SQL.append("  SUBIMP E ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FAT_ANNO_PROG = ~~TBL_PARAM48.ROWNAMANNPRO~~) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = ~~TBL_PARAM48.ROWNAMNUMPRO~~) ");
    SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND(+)) ");
    SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND(+)) ");
    SQL.append("and   (A.BOLLO = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_IMP = D.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = D.NUMERO_IMP) ");
    SQL.append("and   (A.NUMERO_SUBIMP = E.NUMERO_SUBIMP(+)) ");
    SQL.append("and   (A.ANNO_SUBIMP = E.ANNO_SUBIMP(+)) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ53, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQ53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ");
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIONI.iUseListQBE;
      PAN_LIQUIDAZIONI.iUseListQBE = 0;
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
