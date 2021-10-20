// **********************************************
// Emissione Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSIIMPEGN_PROVVEDIMENT = 0;

  private static int PFL_EMISSIIMPEGN_DELIBERA = 0;
  private static int PFL_EMISSIIMPEGN_NUMERODEL = 1;
  private static int PFL_EMISSIIMPEGN_ANNODEL = 2;
  private static int PFL_EMISSIIMPEGN_PROPOSTA = 3;
  private static int PFL_EMISSIIMPEGN_NUMEROPROPOS = 4;
  private static int PFL_EMISSIIMPEGN_ANNOPROPOSTA = 5;
  private static int PFL_EMISSIIMPEGN_TRATTIDELIBE = 6;
  private static int PFL_EMISSIIMPEGN_BARRADELIBER = 7;
  private static int PFL_EMISSIIMPEGN_TRATTIPROPOS = 8;
  private static int PFL_EMISSIIMPEGN_BARRAPROPOST = 9;
  private static int PFL_EMISSIIMPEGN_SELEZIDELIBE = 10;
  private static int PFL_EMISSIIMPEGN_INFODELIBERE = 11;
  private static int PFL_EMISSIIMPEGN_SELEZIPROPOS = 12;
  private static int PFL_EMISSIIMPEGN_INFOPROPOSTE = 13;
  private static int PFL_EMISSIIMPEGN_DESCRIZIONE = 14;
  private static int PFL_EMISSIIMPEGN_OBBLIGATORIO = 15;
  private static int PFL_EMISSIIMPEGN_DATAREGISTRA = 16;
  private static int PFL_EMISSIIMPEGN_ELABORBUTTON = 17;

  private static int PPQRY_PARAMETRI348 = 0;


  IDPanel PAN_EMISSIIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI274(IMDB);
    //
    //
    Init_PQRY_PARAMETRI348(IMDB);
    Init_PQRY_PARAMETRI348_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI274(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI274, 12);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI274, "TBL_PARAMETRI274");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMEOBBLI, "ROWNAMEOBBLI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMEOBBLI,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMDATREG,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMCONPRO, "ROWNAMCONPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMCONPRO,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMINSDEL, "ROWNAMINSDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMINSDEL,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMINSPRO, "ROWNAMINSPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI274,IMDBDef4.FLD_PARAMETRI274_ROWNAMINSPRO,1,3,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI274, 0);
  }

  private static void Init_PQRY_PARAMETRI348(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI348, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI348, "PQRY_PARAMETRI348");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEOBBLI, "ROWNAMEOBBLI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEOBBLI,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR,5,49,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI348, 0);
  }

  private static void Init_PQRY_PARAMETRI348_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI348_RS, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI348_RS, "PQRY_PARAMETRI348_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEOBBLI, "ROWNAMEOBBLI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEOBBLI,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI348_RS,IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneImpegni()
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
    FormIdx = MyGlb.FRM_EMISSIIMPEGN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "122498A9-BC45-4FAC-A9D4-B1C52D418CA8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 740;
    DesignHeight = 210;
    set_Caption(new IDVariant("Emissione Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 740;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissioni Impegni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_EMISSIIMPEGN = new IDPanel(w, this, 1, "PAN_EMISSIIMPEGN");
    Frames[1].Content = PAN_EMISSIIMPEGN;
    PAN_EMISSIIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 740-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B7ACC5B8-3E46-4CF5-BC8D-D80DEA6CFB80");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1084, 248, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIIMPEGN.InitStatus = 1;
    PAN_EMISSIIMPEGN_Init();
    PAN_EMISSIIMPEGN_InitFields();
    PAN_EMISSIIMPEGN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI274, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSIIMPEGN_PARAMETRI348();
      }
      PAN_EMISSIIMPEGN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_EMISSIIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIIMPEGN_SELEZIDELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_EMISSIIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIIMPEGN_SELEZIPROPOS) {
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
    return (obj instanceof EmissioneImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneImpegni.class.getName() : (Glb.ClassWithPackage(EmissioneImpegni.class) ? EmissioneImpegni.class.getName().substring(EmissioneImpegni.class.getPackage().getName().length() + 1) : EmissioneImpegni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Emissioni Impegni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_EMISSIIMPEGN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissioni Impegni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_EMISSIIMPEGN_ANNODEL)), true) || Column.equals((new IDVariant(PFL_EMISSIIMPEGN_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_EMISSIIMPEGN_DELIBERA)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_EMISSIIMPEGN_ANNOPROPOSTA)), true) || Column.equals((new IDVariant(PFL_EMISSIIMPEGN_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_EMISSIIMPEGN_PROPOSTA)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "EmissioniImpegniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Emissioni Impegni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISSIIMPEGN);
      // 
      // Emissioni Impegni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0))))
      {
        PAN_EMISSIIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0)))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_EMISSIIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "EmissioniImpegniOnDynamicPropertiesEvent", _e);
    }
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
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "EndModalEvent", _e);
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
      v_NOMECAPTION = (new IDVariant("Emissione Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_NOMECAPTION = IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO);
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMCONPRO, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMCONPRO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMDATREG, 0, IDL.Today());
      PAN_EMISSIIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "InfoProposte", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "SelezioneProposte", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Integrazione GS4
  // **********************************************************************
  private boolean ControlloIntegrazioneGS4 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYPROCDEL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controllo Integrazione GS4 Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROC_DEL as T99PROCDEL ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MYPROCDEL = QV.Get("T99PROCDEL", IDVariant.STRING) ;
      }
      QV.Close();
      // 
      // se non c'è integrazione GS4
      // 
      if (IDL.IsNull(v_MYPROCDEL))
      {
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        return (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "ControlloIntegrazioneGS4", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllare Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant ControllareProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllare Proposta Body
      // Procedure Body
      // 
      if ((new IDVariant(ControlloIntegrazioneGS4())).equals((new IDVariant(-1)), true))
      {
        return (new IDVariant(1));
      }
      else
      {
        return (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "ControllareProposta", _e);
      return new IDVariant();
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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR, 0)))
      {
        IDVariant v_ERRMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRMESSAGE = (new IDVariant("Descrizione obbligatoria.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRMESSAGE); 
        return 0;
      }
      ((ImpegnoAutomaticoDisponibilita)MainFrm.GetForm(MyGlb.FRM_IMPEAUTODISP,0,true,this)).Elabora(IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_DEL, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_DEL, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_SEDE_DEL, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ROWNAMEOBBLI, 0));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Default
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaValoriDefault ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Default Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI348, IMDBDef13.PQSL_PARAMETRI348_ROWNAMDATREG, 0, IDL.Today());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneImpegni", "SettaValoriDefault", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSIIMPEGN_PARAMETRI348() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI348_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI274, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI274, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI348_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI348_RS, 0, IMDBDef4.TBL_PARAMETRI274, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 0, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 1, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 2, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 3, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 4, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 5, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 6, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMEOBBLI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 7, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMDATREG, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI348_RS, 8, 0, IMDBDef4.TBL_PARAMETRI274, IMDBDef4.FLD_PARAMETRI274_ROWNAMEDESCR, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI274, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI274, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI274, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI348_RS, 0);
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
  private void PAN_EMISSIIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIIMPEGN, Cancel);
    // Stub
  }

  private void PAN_EMISSIIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIIMPEGN_SELEZIDELIBE)
    {
      this.IdxPanelActived = this.PAN_EMISSIIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIIMPEGN_INFODELIBERE)
    {
      this.IdxPanelActived = this.PAN_EMISSIIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIIMPEGN_SELEZIPROPOS)
    {
      this.IdxPanelActived = this.PAN_EMISSIIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIIMPEGN_INFOPROPOSTE)
    {
      this.IdxPanelActived = this.PAN_EMISSIIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIIMPEGN_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_EMISSIIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_EMISSIIMPEGN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIIMPEGN_Init()
  {

    PAN_EMISSIIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIIMPEGN.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, "BDC1CBB4-D72C-4FC5-9827-20A5251B8823");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, "Provvedimento");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 188, 16, 0, 0);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, MyGlb.PANEL_FORM, 4, 7, 628, 49, 0, 0);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, 0, 87);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, 1, 13);
    PAN_EMISSIIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, 0, 4);
    PAN_EMISSIIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, 1, 4);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIIMPEGN_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIIMPEGN.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, "E45A77E0-5CB9-4C76-96DD-1A13E2192E49");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, "Delibera");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, "9F5A71A1-3728-4B75-8A76-DB46847DB9F4");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, "NUMERO DEL");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, "72ADBFBB-1E11-4740-A796-D93EDCB38961");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, "ANNO DEL");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, "5109783C-9B3B-4D63-B7C7-01C6C4EB1112");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, "Proposta");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, "1394CD25-56E4-4755-BFEB-FD73620F7955");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, "A25A8F09-31A3-4A83-B2B7-E91A6F19D418");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, "4DBFA756-CB9B-4DC5-8A89-65A03C27F87F");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, "-");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, "789CD612-163E-40CE-9447-AB3796CB863A");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, "/");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, "003BA47E-6844-4870-B343-4B174B4D56A9");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, "-");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, "8655AA78-D016-4015-984A-34BDEB625170");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, "/");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, "CA1E1750-5A09-46EF-8A19-9D13B6645E9B");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, "5E60520D-31DC-4616-B117-2520521CD50B");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, 0, "info.gif", false);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, "475563E5-F142-4327-B3E6-D6DBAD908E22");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, "74BA7FBB-1A05-454C-910D-81CDC40A8AE8");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, 0, "info.gif", false);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, "9227F65A-005A-47A9-BB89-B70E5A53EBC2");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, "C4A17BBB-CFB2-4A16-9091-A2EAC87A3986");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, "583038B1-3608-4009-8DFF-633D64D4A915");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, "Data Registrazione");
    PAN_EMISSIIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, "");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, "014B9527-EBD4-4856-BEAF-6A10ACF85C16");
    PAN_EMISSIIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, "Elabora");
    PAN_EMISSIIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, 0, "button1.gif", false);
    PAN_EMISSIIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_EMISSIIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 132, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 8, 32, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 68);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_DELIBERA, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_DELIBERA, PPQRY_PARAMETRI348, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 60, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 144, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_NUMERODEL, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_NUMERODEL, PPQRY_PARAMETRI348, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 208, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_ANNODEL, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_ANNODEL, PPQRY_PARAMETRI348, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 300, 32, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_PROPOSTA, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_PROPOSTA, PPQRY_PARAMETRI348, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROPOSTA");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 492, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_NUMEROPROPOS, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_NUMEROPROPOS, PPQRY_PARAMETRI348, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PROPOSTA");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 552, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_ANNOPROPOSTA, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_ANNOPROPOSTA, PPQRY_PARAMETRI348, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_LIST, 48, 96, 28, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_FORM, 128, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_TRATTIDELIBE, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_LIST, 56, 104, 28, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_FORM, 192, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_BARRADELIBER, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_LIST, 56, 104, 28, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_FORM, 476, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_TRATTIPROPOS, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_LIST, 64, 112, 28, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_FORM, 536, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_BARRAPROPOST, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_LIST, 244, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_FORM, 252, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_SELEZIDELIBE, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_LIST, 252, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_FORM, 272, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFODELIBERE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_INFODELIBERE, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_INFODELIBERE, -1, "", "INFODELIBERE", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_LIST, 252, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_FORM, 596, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_SELEZIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_SELEZIPROPOS, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_SELEZIPROPOS, -1, "", "SELEZIPROPOS", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_FORM, 612, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_INFOPROPOSTE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_INFOPROPOSTE, -1, GRP_EMISSIIMPEGN_PROVVEDIMENT);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_INFOPROPOSTE, -1, "", "INFOPROPOSTE", 0, 0, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 40, 68, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_DESCRIZIONE, -1, -1);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_DESCRIZIONE, PPQRY_PARAMETRI348, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 49, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 68);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, "Obblig.");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 36, 92, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 84);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, "Obbligatorio");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_OBBLIGATORIO, -1, -1);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_OBBLIGATORIO, PPQRY_PARAMETRI348, "A.ROWNAMEOBBLI", "ROWNAMEOBBLI", 5, 2, 0, -13997);
    PAN_EMISSIIMPEGN.SetValueListItem(PFL_EMISSIIMPEGN_OBBLIGATORIO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_EMISSIIMPEGN.SetValueListItem(PFL_EMISSIIMPEGN_OBBLIGATORIO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_LIST, 100);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_LIST, "Data Registrazione");
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_FORM, 4, 116, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_DATAREGISTRA, MyGlb.PANEL_FORM, "Data Registrazione");
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_DATAREGISTRA, -1, -1);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_DATAREGISTRA, PPQRY_PARAMETRI348, "A.ROWNAMDATREG", "ROWNAMDATREG", 6, 49, 0, -13997);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_LIST, 384, 108, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_FORM, 548, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIIMPEGN_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIIMPEGN.SetFieldPage(PFL_EMISSIIMPEGN_ELABORBUTTON, -1, -1);
    PAN_EMISSIIMPEGN.SetFieldPanel(PFL_EMISSIIMPEGN_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_EMISSIIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIIMPEGN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_EMISSIIMPEGN.SetIMDB(IMDB, "PQRY_PARAMETRI348", true);
    PAN_EMISSIIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_EMISSIIMPEGN.SetQueryIMDB(PPQRY_PARAMETRI348, IMDBDef13.PQRY_PARAMETRI348_RS, IMDBDef4.TBL_PARAMETRI274);
    JustLoaded = true;
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_DELIBERA, IMDBDef4.FLD_PARAMETRI274_SEDE_DEL);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_NUMERODEL, IMDBDef4.FLD_PARAMETRI274_NUMERO_DEL);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_ANNODEL, IMDBDef4.FLD_PARAMETRI274_ANNO_DEL);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_PROPOSTA, IMDBDef4.FLD_PARAMETRI274_UNITA_PROPONENTE);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI274_NUMERO_PROPOSTA);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI274_ANNO_PROPOSTA);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_DESCRIZIONE, IMDBDef4.FLD_PARAMETRI274_ROWNAMEDESCR);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_OBBLIGATORIO, IMDBDef4.FLD_PARAMETRI274_ROWNAMEOBBLI);
    PAN_EMISSIIMPEGN.SetFieldPrimaryIndex(PFL_EMISSIIMPEGN_DATAREGISTRA, IMDBDef4.FLD_PARAMETRI274_ROWNAMDATREG);
    PAN_EMISSIIMPEGN.SetMasterTable(0, "PARAMETRI274");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIIMPEGN.iUseListQBE;
      PAN_EMISSIIMPEGN.iUseListQBE = 0;
      PAN_EMISSIIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIIMPEGN) PAN_EMISSIIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIIMPEGN) PAN_EMISSIIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIIMPEGN) PAN_EMISSIIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIIMPEGN) PAN_EMISSIIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIIMPEGN) PAN_EMISSIIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
