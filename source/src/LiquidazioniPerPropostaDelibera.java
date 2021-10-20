// **********************************************
// Liquidazioni Per Proposta Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniPerPropostaDelibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_GRUPPO = 0;

  private static int PFL_PARAMETRI_ESERCIZIO = 0;
  private static int PFL_PARAMETRI_PROPOSTA = 1;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 2;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 3;
  private static int PFL_PARAMETRI_DELIBERA = 4;
  private static int PFL_PARAMETRI_NUMERODELIBE = 5;
  private static int PFL_PARAMETRI_ANNODELIBERA = 6;
  private static int PFL_PARAMETRI_TRATTINO1 = 7;
  private static int PFL_PARAMETRI_SLASH1 = 8;
  private static int PFL_PARAMETRI_APRBUTSCEPRO = 9;
  private static int PFL_PARAMETRI_TRATTINO = 10;
  private static int PFL_PARAMETRI_SLASH = 11;
  private static int PFL_PARAMETRI_APRIBUTTON = 12;
  private static int PFL_PARAMETRI_INFOBUTTON = 13;
  private static int PFL_PARAMETRI_INFOBUTTPROP = 14;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 15;
  private static int PFL_PARAMETRI_ELABORBUTTON = 16;
  private static int PFL_PARAMETRI_SAPAACAIMSUI = 17;
  private static int PFL_PARAMETRI_DATAELABORAZ = 18;

  private static int PPQRY_PARAMESTAM17 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI261(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM17(IMDB);
    Init_PQRY_PARAMESTAM17_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI261(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI261, 9);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI261, "TBL_PARAMETRI261");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO, "RONASOIMDICO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI261,IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA,6,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI261, 0);
  }

  private static void Init_PQRY_PARAMESTAM17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM17, 9);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM17, "PQRY_PARAMESTAM17");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_RONASOIMDICO, "RONASOIMDICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_RONASOIMDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMDATELA,6,49,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM17, 0);
  }

  private static void Init_PQRY_PARAMESTAM17_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM17_RS, 9);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM17_RS, "PQRY_PARAMESTAM17_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_RONASOIMDICO, "RONASOIMDICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_RONASOIMDICO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM17_RS,IMDBDef14.PQSL_PARAMESTAM17_ROWNAMDATELA,6,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniPerPropostaDelibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniPerPropostaDelibera()
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
    FormIdx = MyGlb.FRM_LIQPERPRODEL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AA9E4751-E2DA-4087-8F5B-9C954C3B6D3E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 416;
    DesignHeight = 218;
    set_Caption(new IDVariant("Liquidazioni Per Proposta Delibera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 416;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 416-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D7D6B9DE-5DE2-41A5-820E-C76FB23EB53B");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1136, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI261, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQPERPRODEL_PARAMESTAM17();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRBUTSCEPRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIBUTTON) {
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
    return (obj instanceof LiquidazioniPerPropostaDelibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniPerPropostaDelibera.class.getName() : (Glb.ClassWithPackage(LiquidazioniPerPropostaDelibera.class) ? LiquidazioniPerPropostaDelibera.class.getName().substring(LiquidazioniPerPropostaDelibera.class.getPackage().getName().length() + 1) : LiquidazioniPerPropostaDelibera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
      // 
      // controllo della delibera
      // 
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
        }
      }
      // 
      // controllo della proposta
      // 
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0);
          MainFrm.ControlloProposte(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0, new IDVariant(v_ANNODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMERODEL));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0)))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "ParametriOnUpdatingRowEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Ricerca Liquidazioni per Proposta/Delibera", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      LOADEVENT_PARADELEROWS();
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA, 0, IDL.Today());
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
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
      // Procedure Body
      // 
      // 
      // validazione dei campi
      // 
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0)))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Dati Delibera incompleti", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0))))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0)))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Dati Proposta incompleti", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG); 
                return 0;
              }
            }
          }
          else
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
            {
              if ((IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0))) && (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Dati Proposta e/o Delibera incompleti", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG); 
                return 0;
              }
            }
          }
        }
      }
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("NUMERO_PROP"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("ANNO_PROP"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("UNITA_PROP"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("NUMERO_DEL"));
      IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR6 = (new IDVariant("ANNO_DEL"));
      IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR7 = (new IDVariant("SEDE_DEL"));
      IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR8 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR9 = (new IDVariant("SALTO_PAG"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Liquidazioni_Prop_Del"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0),(new IDVariant("N"))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0),(new IDVariant("N"))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_RONASOIMDICO, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMEDELIB, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Proposta
  // **********************************************************************
  public int ScegliProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "ScegliProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM17, IMDBDef14.PQSL_PARAMESTAM17_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerPropostaDelibera", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void LIQPERPRODEL_PARAMESTAM17() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMESTAM17_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI261, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI261, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM17_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMESTAM17_RS, 0, IMDBDef5.TBL_PARAMETRI261, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 0, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 1, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 2, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 3, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 4, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 5, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 6, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 7, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM17_RS, 8, 0, IMDBDef5.TBL_PARAMETRI261, IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI261, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI261, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI261, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMESTAM17_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRBUTSCEPRO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOBUTTPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, "FEDEDD7F-CC51-4C92-858E-603354295C95");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, "Gruppo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, MyGlb.PANEL_LIST, 0, -9999, 112, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, MyGlb.PANEL_FORM, 12, 4, 360, 68, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, 0, 41);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, 0, 1);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "8C2C454F-DE35-4778-A2CE-8665CE28CD17");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "1D5219FB-5EA3-4DEA-93ED-63A719C6E815");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "24D886BD-F179-46C7-86EF-673E86C6ED46");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "3682824A-EFB0-46BC-9590-3B285C124320");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "DCD3D4ED-94D8-41CC-AFC7-2E3F0DA53AAE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "C1A57ACB-75AE-4717-9831-5F36F79B1C5D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "0FC827C0-1F46-4C9D-A9B5-2F0F202D0E0C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, "D4F99EB2-54C7-4FBE-90AA-B1B08EA12BED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, "3EE51008-78FD-41C4-BFBE-E2554FF58C28");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, "1C460E8B-CA24-447B-A200-5EAF35167B41");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, "3C96ED32-8B7B-42FC-9C59-BADE62EAB102");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "5E1714B7-822F-4530-911A-F125BAFCC2AD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, "13B56380-4915-4DC0-B9D0-9AA882D2E208");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, "0BE3D7E2-22B3-4F30-A32A-78A94CDFF535");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, "505E55B5-9E08-4A8C-85A0-CA34E458F8E9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "79EC3E71-C01D-4326-A90B-0590514E73D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "1A8DAEC6-BAC7-439A-9F4A-2CE3F59A3DBF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, "6326656F-EB1E-4BA6-879D-847259E1FF1F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, "Salto Pagina a cambio Impegno/Sub-Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "46BCD16A-5AD8-40D5-901F-7B61D1D25884");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMESTAM17, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 20, 20, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMESTAM17, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUMERO PROPOSTA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 216, 20, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMESTAM17, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANNO PROPOSTA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 284, 20, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMESTAM17, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 16, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMESTAM17, "A.ROWNAMEDELIB", "ROWNAMEDELIB", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "Numero Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 148, 44, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMESTAM17, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "Anno Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 216, 44, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMESTAM17, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_FORM, 196, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINO1, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_LIST, 124, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_FORM, 264, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASH1, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_LIST, 240, 32, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_FORM, 320, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRBUTSCEPRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRBUTSCEPRO, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRBUTSCEPRO, -1, "", "APRBUTSCEPRO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 108, 28, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 128, 44, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINO, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 196, 44, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASH, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_FORM, 252, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIBUTTON, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIBUTTON, -1, "", "APRIBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_FORM, 272, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOBUTTON, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOBUTTON, -1, "", "INFOBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_FORM, 340, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBUTTPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOBUTTPROP, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOBUTTPROP, -1, "", "INFOBUTTPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 264, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 356, 8, 12, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 4);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_GRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 288, 140, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_LIST, "Salto Pagina a cambio Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_FORM, 8, 84, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_FORM, 272);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SAPAACAIMSUI, MyGlb.PANEL_FORM, "Salto Pagina a cambio Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SAPAACAIMSUI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SAPAACAIMSUI, PPQRY_PARAMESTAM17, "A.RONASOIMDICO", "RONASOIMDICO", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SAPAACAIMSUI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SAPAACAIMSUI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 8, 112, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMESTAM17, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMESTAM17", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMESTAM17, IMDBDef14.PQRY_PARAMESTAM17_RS, IMDBDef5.TBL_PARAMETRI261);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef5.FLD_PARAMETRI261_ROWNAMEESERC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef5.FLD_PARAMETRI261_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef5.FLD_PARAMETRI261_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef5.FLD_PARAMETRI261_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef5.FLD_PARAMETRI261_ROWNAMEDELIB);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef5.FLD_PARAMETRI261_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef5.FLD_PARAMETRI261_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SAPAACAIMSUI, IMDBDef5.FLD_PARAMETRI261_RONASOIMDICO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI261_ROWNAMDATELA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI261");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
