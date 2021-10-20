// **********************************************
// Bilancio Per Capitoli Aggiornato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioPerCapitoliAggiornato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_VARIAZIONI = 0;

  private static int PFL_PARAM_PROGRSTAMPA = 0;
  private static int PFL_PARAM_MISSIOTITOLO = 1;
  private static int PFL_PARAM_PROGRATIPOLO = 2;
  private static int PFL_PARAM_DAL = 3;
  private static int PFL_PARAM_AL = 4;
  private static int PFL_PARAM_ETICHLABELSX = 5;
  private static int PFL_PARAM_ESERCIZIO = 6;
  private static int PFL_PARAM_SUDDSUPUO = 7;
  private static int PFL_PARAM_ETICHEELABOR = 8;
  private static int PFL_PARAM_SIGLA = 9;
  private static int PFL_PARAM_NOMEREPORT = 10;
  private static int PFL_PARAM_RAGGRUPPAMEN = 11;
  private static int PFL_PARAM_UNITAORGANIZ = 12;
  private static int PFL_PARAM_NUMERDIPAGIN = 13;

  private static int PPQRY_PARAM169 = 0;

  private static int PPQRY_TIPISTAMCAPA = 1;

  private static int PPQRY_TIPISTAMCAP1 = 2;
  private static int PPQRY_VISTMISSPRO1 = 3;
  private static int PPQRY_VISTMISSPROG = 4;
  private static int PPQRY_CAPUO = 5;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM168(IMDB);
    //
    //
    Init_PQRY_PARAM169(IMDB);
    Init_PQRY_PARAM169_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM168(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM168, 12);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM168, "TBL_PARAM168");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMSIGLA, "PARAMSIGLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAMSIGLA,5,20,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM168,IMDBDef3.FLD_PARAM168_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM168, 0);
  }

  private static void Init_PQRY_PARAM169(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM169, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM169, "PQRY_PARAM169");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169,IMDBDef11.PQSL_PARAM169_PARSTANUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM169, 0);
  }

  private static void Init_PQRY_PARAM169_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM169_RS, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM169_RS, "PQRY_PARAM169_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMISSTITO, "PARAMISSTITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMISSTITO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, "PARAPROGTIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGTIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARASUDSUPUO, "PARASUDSUPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARASUDSUPUO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, "PARAPROGUNIT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARAPROGUNIT,3,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM169_RS,IMDBDef11.PQSL_PARAM169_PARSTANUDIPA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioPerCapitoliAggiornato(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioPerCapitoliAggiornato()
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
    FormIdx = MyGlb.FRM_BILPERCAPAGG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DAEBF171-6DA7-4FAA-8333-1C6500BB1122";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 484;
    DesignHeight = 322;
    set_Caption(new IDVariant("Bilancio per Capitoli Aggiornato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 484;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 484-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D7805364-5631-43AA-B34C-DBF63F785588");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1256, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM168, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BILPERCAPAGG_PARAM169();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioPerCapitoliAggiornato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioPerCapitoliAggiornato.class.getName() : (Glb.ClassWithPackage(BilancioPerCapitoliAggiornato.class) ? BilancioPerCapitoliAggiornato.class.getName().substring(BilancioPerCapitoliAggiornato.class.getPackage().getName().length() + 1) : BilancioPerCapitoliAggiornato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_PROGRSTAMPA)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))));
        IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMTIPO, 0, IDL.SubStr((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_RAGGRUPPAMEN))), (new IDVariant(1)), (new IDVariant(1))));
        if (IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMTIPO, 0).equals((new IDVariant("A")), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_PROGRSTAMPA)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.Find((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_RAGGRUPPAMEN))), (new IDVariant("Entrate"))).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
          v_TITOLO = (new IDVariant("Titolo"));
          IDVariant v_TIPOLOGIA = new IDVariant(0,IDVariant.STRING);
          v_TIPOLOGIA = (new IDVariant("Tipologia"));
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_MISSIOTITOLO, new IDVariant(v_TITOLO).stringValue());
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_PROGRATIPOLO, new IDVariant(v_TIPOLOGIA).stringValue());
          if (IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAENTRSPES, 0).compareTo((new IDVariant("E")), true)!=0)
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAENTRSPES, 0, (new IDVariant("E")));
            IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0, (new IDVariant("-1")));
            IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0, (new IDVariant("-1")));
          }
        }
        else if (IDL.Find((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_RAGGRUPPAMEN))), (new IDVariant("Spese"))).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_MISSIONE = new IDVariant(0,IDVariant.STRING);
          v_MISSIONE = (new IDVariant("Missione"));
          IDVariant v_PROGRAMMA = new IDVariant(0,IDVariant.STRING);
          v_PROGRAMMA = (new IDVariant("Programma"));
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_MISSIOTITOLO, new IDVariant(v_MISSIONE).stringValue());
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_PROGRATIPOLO, new IDVariant(v_PROGRAMMA).stringValue());
          if (IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAENTRSPES, 0).compareTo((new IDVariant("S")), true)!=0)
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAENTRSPES, 0, (new IDVariant("S")));
            IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0, (new IDVariant("-1")));
            IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0, (new IDVariant("-1")));
          }
        }
        IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_MISSIOTITOLO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0),(new IDVariant("-1"))).equals((new IDVariant("-1")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0, (new IDVariant("-1")));
        }
        IMDB.set_Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0, (new IDVariant("-1")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliAggiornato", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMTIPO, 0),(new IDVariant("A"))).equals((new IDVariant("A")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAAMPTMUOS")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPMPTMUOS")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAAMPTMUOSU")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPMPTMUOSU")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAATTCEUO")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPTTCEUO")), true)) && !(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAAMPTMUOS")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPMPTMUOS")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAAMPTMUOSU")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPMPTMUOSU")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAATTCEUO")), true) || IMDB.Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0).equals((new IDVariant("SAPTTCEUO")), true)))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliAggiornato", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  private int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPTTE")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPTTCE")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGPLURE(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPMPTS")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPMPTMS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGPLURS(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPMPTMUOS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGPLURSUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), (new IDVariant("G")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPMPTMUOSU")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGPLURSUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), (new IDVariant("U")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAATTE")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAATTCE")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGANNE(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMDAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAAMPTS")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAAMPTMS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGANNS(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMDAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAAMPTMUOS")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGANNSUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMDAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), (new IDVariant("G")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAAMPTMUOSU")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGANNSUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMDAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), (new IDVariant("U")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAATTCEUO")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGANNEUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMDAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_SIGLA))).equals((new IDVariant("SAPTTCEUO")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILPREVAGGPLUREUO(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMISSTITO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGTIPO, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMAL, 0), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAPROGUNIT, 0));
      }
      else
      {
        return 0;
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARAMESERCIZ, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPO")), (new IDVariant("AGG")));
        MainFrm.SetParametroStampaJasper((new IDVariant("SUP_UO")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARASUDSUPUO, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef11.PQRY_PARAM169, IMDBDef11.PQSL_PARAM169_PARSTANUDIPA, 0));
        MainFrm.LanciaStampaJasper((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliAggiornato", "EtichettaElabora", _e);
      return -1;
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliAggiornato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMISSTITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAENTRSPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARASUDSUPUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMSIGLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGUNIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARSTANUDIPA, 0, new IDVariant());
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
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMISSTITO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGTIPO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGUNIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARSTANUDIPA, 0, (new IDVariant("SI")));
      PAN_PARAM.ClearValueList(PFL_PARAM_ESERCIZIO);
      PAN_PARAM.SetValueListItem(PFL_PARAM_ESERCIZIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAM.SetValueListItem(PFL_PARAM_ESERCIZIO, IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAM.SetValueListItem(PFL_PARAM_ESERCIZIO, IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (!(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
      {
        IDVariant v_VDESCRSUP1 = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
        SQL.append("from ");
        SQL.append("  SO4_SUST_ENTI A ");
        SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDESCRSUP1 = QV.Get("SUSTENTIDESC", IDVariant.STRING) ;
        }
        QV.Close();
        PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_SUDDSUPUO, new IDVariant(v_VDESCRSUP1).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPerCapitoliAggiornato", "Load", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void BILPERCAPAGG_PARAM169() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM169_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM168, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM168, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM169_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM169_RS, 0, IMDBDef3.TBL_PARAM168, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 0, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGSTAM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 1, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMISSTITO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 2, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGTIPO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 3, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 4, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 5, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAMESERCIZ, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 6, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARASUDSUPUO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 7, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARAPROGUNIT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM169_RS, 8, 0, IMDBDef3.TBL_PARAM168, IMDBDef3.FLD_PARAM168_PARSTANUDIPA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM168, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM168, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM168, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM169_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "136DEDFD-7734-4AAE-A151-C1F2FB76B16F");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "Variazioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 60, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 64, 119, 400, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 55);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "1A923D61-EBC4-4470-A44A-05FAF52C2FF6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "2E470C2E-56C3-442C-B096-8082D9A0F69F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "Missione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "65756ACD-7612-41EE-B7AD-4614D5C7F0F4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "Programma");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "0CD82F17-3019-4CE9-8344-01B52372D1BC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "Dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "DB1CEC9C-D44C-4CBA-9D10-7666884D5590");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "Al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, "A5A6BFCB-F08E-4004-8238-395D5B7F8214");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "B02C7E89-B261-41C6-9810-A0D7498C4444");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "Esercizio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "07162F5A-38EE-4F40-A047-70B58D2BFB6E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "Suddivisione Sup.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "35F7C23E-240F-48B1-9EAE-D687AF880AD2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "69368DB4-79E2-492E-8DCE-0A8CBB7C3504");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "SIGLA");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "091EFAC0-6CEC-49F0-8479-23EACACAC393");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "NOME REPORT");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "B37E14A9-ECDE-4447-8365-67F566F3BA5F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "RAGGRUPPAMENTO");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "3431414A-49A2-4EEA-B0AB-D4136979AD29");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "4E03B1E9-2194-490E-9713-F9A1D7AD0F2C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "Numero di pagina");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 72, 24, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRSTAMPA, PPQRY_PARAM169, "A.PARAPROGSTAM", "PARAPROGSTAM", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_LIST, "Missione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 44, 48, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MISSIOTITOLO, MyGlb.PANEL_FORM, "Missione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_MISSIOTITOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_MISSIOTITOLO, PPQRY_PARAM169, "A.PARAMISSTITO", "PARAMISSTITO", 5, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_LIST, "Programma");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 4, 72, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRATIPOLO, MyGlb.PANEL_FORM, "Programma");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRATIPOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRATIPOLO, PPQRY_PARAM169, "A.PARAPROGTIPO", "PARAPROGTIPO", 5, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 84, 144, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DAL, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DAL, PPQRY_PARAM169, "A.PARAMDAL", "PARAMDAL", 6, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 352, 144, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL, PPQRY_PARAM169, "A.PARAMAL", "PARAMAL", 6, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 68, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 68, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHLABELSX, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHLABELSX, -1, "", "ETICHLABELSX", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 76, 176, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ESERCIZIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ESERCIZIO, PPQRY_PARAM169, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_LIST, "Suddivisione Sup.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 196, 176, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 244);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUDDSUPUO, MyGlb.PANEL_FORM, "Suddivisione Sup.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SUDDSUPUO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SUDDSUPUO, PPQRY_PARAM169, "A.PARASUDSUPUO", "PARASUDSUPUO", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUDDSUPUO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUDDSUPUO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 384, 228, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, "SIGLA");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 4, 92, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, "SIGLA");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SIGLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SIGLA, PPQRY_TIPISTAMCAPA, "A.SIGLA", "TIPSTACAPSIG", 5, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, "NOME REPORT");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 4, 116, 724, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, "NOME REPORT");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NOMEREPORT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NOMEREPORT, PPQRY_TIPISTAMCAPA, "A.NOME_REPORT", "TIPSTACANORE", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 240);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_LIST, "RAGGRUPPAMENTO");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 176, 752, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 240);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_RAGGRUPPAMEN, MyGlb.PANEL_FORM, "RAGGRUPPAMENTO");
    PAN_PARAM.SetFieldPage(PFL_PARAM_RAGGRUPPAMEN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_RAGGRUPPAMEN, PPQRY_TIPISTAMCAPA, "A.RAGGRUPPAMENTO", "TIPSTACAPRAG", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 12, 96, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UNITAORGANIZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UNITAORGANIZ, PPQRY_PARAM169, "A.PARAPROGUNIT", "PARAPROGUNIT", 3, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, "Numero di pagina");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 284, 200, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, "Numero di pagina");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERDIPAGIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERDIPAGIN, PPQRY_PARAM169, "A.PARSTANUDIPA", "PARSTANUDIPA", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA as TIPSTACAPSIG, ");
    SQL.append("  A.NOME_REPORT as TIPSTACANORE, ");
    SQL.append("  A.RAGGRUPPAMENTO as TIPSTACAPRAG ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAPA, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMCAPA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_TIPISTAMCAPA, "TIPI_STAMPE_CAPAGG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTACAPPRO, ");
    SQL.append("  A.ORDINE as TIPSTACAPORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTACAPDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = 2014) ");
    SQL.append("and   (A.TIPO = 'AGG') ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAP1, 0, SQL, PFL_PARAM_PROGRSTAMPA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTACAPPRO, ");
    SQL.append("  A.ORDINE as TIPSTACAPORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTACAPDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_CAPAGG A ");
    SQL.append("where (A.ESERCIZIO = 2014) ");
    SQL.append("and   (A.TIPO = 'AGG') ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMCAP1, 1, SQL, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMCAP1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  TO_CHAR ( B.TITOLO ), ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  CASE WHEN (~~TBL_PARAM168.PARAENTRSPES~~ IS NULL) OR ~~TBL_PARAM168.PARAENTRSPES~~ = 'S' THEN 'Tutte' ELSE 'Tutti' END ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where ('-1' = ~~PARAMISSTITO~~) ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PARAM_MISSIOTITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  TO_CHAR ( A.MISSIONE ) as ORDINAMENTO, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  TO_CHAR ( B.TITOLO ), ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  CASE WHEN (~~TBL_PARAM168.PARAENTRSPES~~ IS NULL) OR ~~TBL_PARAM168.PARAENTRSPES~~ = 'S' THEN 'Tutte' ELSE 'Tutti' END ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PARAM_MISSIOTITOLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as ORDINAMENTO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~PARAPROGTIPO~~) ");
    SQL.append("and   (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TIPOLOGIA, ");
    SQL.append("  TO_CHAR ( B.TIPOLOGIA ), ");
    SQL.append("  B.TIPOLOGIA || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TIPOLOGIA = ~~PARAPROGTIPO~~) ");
    SQL.append("and   (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  CASE WHEN (~~TBL_PARAM168.PARAENTRSPES~~ IS NULL) OR ~~TBL_PARAM168.PARAENTRSPES~~ = 'S' THEN 'Tutti' ELSE 'Tutte' END ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where ('-1' = ~~PARAPROGTIPO~~) ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PARAM_PROGRATIPOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  TO_CHAR ( A.PROGRAMMA ) as ORDINAMENTO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~PARAMISSTITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TIPOLOGIA, ");
    SQL.append("  TO_CHAR ( B.TIPOLOGIA ), ");
    SQL.append("  B.TIPOLOGIA || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = ~~PARAMISSTITO~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAM168.PARAENTRSPES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  ' ', ");
    SQL.append("  CASE WHEN (~~TBL_PARAM168.PARAENTRSPES~~ IS NULL) OR ~~TBL_PARAM168.PARAENTRSPES~~ = 'S' THEN 'Tutti' ELSE 'Tutte' END ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAM.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PARAM_PROGRATIPOLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAPROGUNIT~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.E_S = 'S') AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCMPTMUOS', 'SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR ((A.E_S = 'E') AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO')))) ");
    SQL.append("and   ((A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO', 'SBCMPTMUOS', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR (A.TIPO_UNITA_ORGANIZZATIVA = 'U' AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU')))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (-1 = ~~PARAPROGUNIT~~) ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARAM_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((A.E_S = 'S') AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCMPTMUOS', 'SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR ((A.E_S = 'E') AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO')))) ");
    SQL.append("and   ((A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCTTCUOE', 'SAATTCEUO', 'SAPTTCEUO', 'SBCMPTMUOS', 'SAPMPTMUOS', 'SAAMPTMUOS'))) OR (A.TIPO_UNITA_ORGANIZZATIVA = 'U' AND (~~TBL_PARAM168.PARAMSIGLA~~ IN ('SBCMPTMUOSU', 'SAAMPTMUOSU', 'SAPMPTMUOSU')))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARAM_UNITAORGANIZ, "");
    PAN_PARAM.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM169", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM169, IMDBDef11.PQRY_PARAM169_RS, IMDBDef3.TBL_PARAM168);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRSTAMPA, IMDBDef3.FLD_PARAM168_PARAPROGSTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_MISSIOTITOLO, IMDBDef3.FLD_PARAM168_PARAMISSTITO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRATIPOLO, IMDBDef3.FLD_PARAM168_PARAPROGTIPO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DAL, IMDBDef3.FLD_PARAM168_PARAMDAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL, IMDBDef3.FLD_PARAM168_PARAMAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ESERCIZIO, IMDBDef3.FLD_PARAM168_PARAMESERCIZ);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SUDDSUPUO, IMDBDef3.FLD_PARAM168_PARASUDSUPUO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UNITAORGANIZ, IMDBDef3.FLD_PARAM168_PARAPROGUNIT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERDIPAGIN, IMDBDef3.FLD_PARAM168_PARSTANUDIPA);
    PAN_PARAM.SetMasterTable(0, "PARAM168");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
