// **********************************************
// Variazioni Bilancio P E G
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniBilancioPEG extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_OPZIONI_ANCHVARIGENE = 0;

  private static int PPQRY_PANNELLO8 = 0;


  IDPanel PAN_OPZIONI;
  private static int GRP_VARIABILAPEG_INSERIMENTO = 0;
  private static int GRP_VARIABILAPEG_AGGIORNAMENT = 1;

  private static int PFL_VARIABILAPEG_DESCRIZIONE = 0;
  private static int PFL_VARIABILAPEG_TIPO = 1;
  private static int PFL_VARIABILAPEG_PROPOSTA1 = 2;
  private static int PFL_VARIABILAPEG_NUMEROPROPOS = 3;
  private static int PFL_VARIABILAPEG_ANNOPRO = 4;
  private static int PFL_VARIABILAPEG_INFOPROP = 5;
  private static int PFL_VARIABILAPEG_DELIBERA1 = 6;
  private static int PFL_VARIABILAPEG_NUMERODEL = 7;
  private static int PFL_VARIABILAPEG_ANNODEL = 8;
  private static int PFL_VARIABILAPEG_INFODEL = 9;
  private static int PFL_VARIABILAPEG_PROPOSTA = 10;
  private static int PFL_VARIABILAPEG_DELIBERA = 11;
  private static int PFL_VARIABILAPEG_TRATTINO = 12;
  private static int PFL_VARIABILAPEG_TRATTINO1 = 13;
  private static int PFL_VARIABILAPEG_TRATTINO2 = 14;
  private static int PFL_VARIABILAPEG_TRATTINO3 = 15;
  private static int PFL_VARIABILAPEG_INFOPROPOSTA = 16;
  private static int PFL_VARIABILAPEG_INFODELIBERA = 17;
  private static int PFL_VARIABILAPEG_UTENTE1 = 18;
  private static int PFL_VARIABILAPEG_DATA1 = 19;
  private static int PFL_VARIABILAPEG_UTENTE = 20;
  private static int PFL_VARIABILAPEG_DATA = 21;
  private static int PFL_VARIABILAPEG_ESERCIZIO = 22;
  private static int PFL_VARIABILAPEG_DESCRPEGOBIE = 23;
  private static int PFL_VARIABILAPEG_VARIAZIONEID = 24;

  private static int PPQRY_POLVARBILPE1 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_VARIABILAPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PANNELLO11(IMDB);
    //
    //
    Init_PQRY_PANNELLO8(IMDB);
    Init_PQRY_PANNELLO8_RS(IMDB);
    Init_PQRY_POLVARBILPE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PANNELLO11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PANNELLO11, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PANNELLO11, "TBL_PANNELLO11");
    IMDB.set_FldCode(IMDBDef4.TBL_PANNELLO11,IMDBDef4.FLD_PANNELLO11_ROWNAMANVAGE, "ROWNAMANVAGE");
    IMDB.SetFldParams(IMDBDef4.TBL_PANNELLO11,IMDBDef4.FLD_PANNELLO11_ROWNAMANVAGE,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PANNELLO11, 0);
  }

  private static void Init_PQRY_PANNELLO8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO8, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO8, "PQRY_PANNELLO8");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO8,IMDBDef12.PQSL_PANNELLO8_ROWNAMANVAGE, "ROWNAMANVAGE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO8,IMDBDef12.PQSL_PANNELLO8_ROWNAMANVAGE,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO8, 0);
  }

  private static void Init_PQRY_PANNELLO8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO8_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO8_RS, "PQRY_PANNELLO8_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO8_RS,IMDBDef12.PQSL_PANNELLO8_ROWNAMANVAGE, "ROWNAMANVAGE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO8_RS,IMDBDef12.PQSL_PANNELLO8_ROWNAMANVAGE,5,2,0);
  }

  private static void Init_PQRY_POLVARBILPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLVARBILPE1, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLVARBILPE1, "PQRY_POLVARBILPE1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_BIL_PEG, "BIL_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_BIL_PEG,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, "VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DESCRIZIONE_PEG_OB, "DESCRIZIONE_PEG_OB");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_DESCRIZIONE_PEG_OB,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_RECORINFODEL, "RECORINFODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_RECORINFODEL,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_RECOINFOPROP, "RECOINFOPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLVARBILPE1,IMDBDef12.PQSL_POLVARBILPE1_RECOINFOPROP,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLVARBILPE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniBilancioPEG(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniBilancioPEG()
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
    FormIdx = MyGlb.FRM_VARIABILAPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3CB02258-521C-485C-A288-F732A390CB07";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 704;
    DesignHeight = 426;
    set_Caption(new IDVariant("Variazioni Bilancio P E G"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 704;
    Frames[1].Height = 400;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.14;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 704;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Opzioni";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_OPZIONI = new IDPanel(w, this, 2, "PAN_OPZIONI");
    Frames[2].Content = PAN_OPZIONI;
    PAN_OPZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPZIONI.VS = MainFrm.VisualStyleList;
    PAN_OPZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 704-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2A5D6E8E-DBC5-4FE7-8096-5C2A83A125B9");
    PAN_OPZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPZIONI.InitStatus = 2;
    PAN_OPZIONI_Init();
    PAN_OPZIONI_InitFields();
    PAN_OPZIONI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 704;
    Frames[3].Height = 344;
    Frames[3].Caption = "Variazioni Bilancio Peg";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 344;
    PAN_VARIABILAPEG = new IDPanel(w, this, 3, "PAN_VARIABILAPEG");
    Frames[3].Content = PAN_VARIABILAPEG;
    PAN_VARIABILAPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIABILAPEG.VS = MainFrm.VisualStyleList;
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 704-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B2CEFA17-1039-465E-B702-99AB89165372");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 624, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIABILAPEG.InitStatus = 2;
    PAN_VARIABILAPEG_Init();
    PAN_VARIABILAPEG_InitFields();
    PAN_VARIABILAPEG_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FA13+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI63+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA13+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DETTAGVARIAZ+BaseCmdLinIdx)
      {
        ApriDettVar();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ALLEGAVARIAZ+BaseCmdLinIdx)
      {
        ApriAllegatoVariazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENEVARIPROV+BaseCmdLinIdx)
      {
        ApriGenerazioneVariazioniProvvisorie();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENVARIGENE+BaseCmdLinIdx)
      {
        ApriElencoVariazioniGenerate();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMVARIPROV+BaseCmdLinIdx)
      {
        ApriEliminazioneVariazioniProvvisorie();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PANNELLO11, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIABILAPEG_PANNELLO8();
      }
      PAN_OPZIONI.UpdatePanel(MainFrm);
      PAN_VARIABILAPEG.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniBilancioPEG);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniBilancioPEG.class.getName() : (Glb.ClassWithPackage(VariazioniBilancioPEG.class) ? VariazioniBilancioPEG.class.getName().substring(VariazioniBilancioPEG.class.getPackage().getName().length() + 1) : VariazioniBilancioPEG.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Abilita
  // **********************************************************************
  public int Abilita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Body
      // Procedure Body
      // 
      PAN_VARIABILAPEG.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "Abilita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita
  // **********************************************************************
  public int Disabilita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Body
      // Procedure Body
      // 
      PAN_VARIABILAPEG.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "Disabilita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriDelibera", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dett Var
  // **********************************************************************
  public int ApriDettVar ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dett Var Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN9, IMDBDef4.FLD_IN9_ROWNAMEVARID, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0));
      MainFrm.Show(MyGlb.FRM_DEVADAVABIPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriDettVar", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Allegato Variazione
  // **********************************************************************
  public int ApriAllegatoVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Allegato Variazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN10, IMDBDef4.FLD_IN10_ROWNAMEVARID, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0));
      MainFrm.Show(MyGlb.FRM_PARAALLEVARI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriAllegatoVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Generazione Variazioni Provvisorie
  // **********************************************************************
  public int ApriGenerazioneVariazioniProvvisorie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Generazione Variazioni Provvisorie Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMEVARID, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0));
      MainFrm.Show(MyGlb.FRM_GENEVARIPROV, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriGenerazioneVariazioniProvvisorie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Generate
  // **********************************************************************
  public int ApriElencoVariazioniGenerate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Generate Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN11, IMDBDef4.FLD_IN11_ROWNAMEVARID, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0));
      MainFrm.Show(MyGlb.FRM_ELENVARIGENE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriElencoVariazioniGenerate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Eliminazione Variazioni Provvisorie
  // **********************************************************************
  public int ApriEliminazioneVariazioniProvvisorie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Eliminazione Variazioni Provvisorie Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN12, IMDBDef4.FLD_IN12_ROWNAMEVARID, 0, IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0));
      MainFrm.Show(MyGlb.FRM_ELIMVARIPROV, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "ApriEliminazioneVariazioniProvvisorie", _e);
      return -1;
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RETVALGET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant("Variazioni Bilancio / P.e.g.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPT));
      IMDB.set_Value(IMDBDef4.TBL_PANNELLO11, IMDBDef4.FLD_PANNELLO11_ROWNAMANVAGE, 0, (new IDVariant("NO")));
      Frames[PAN_VARIABILAPEG.FrIndex].set_Caption(new IDVariant(v_CAPT).stringValue());
      PAN_VARIABILAPEG.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_SE_OBIETTIVI_POL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGESEOBPOSEE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RETVALGET = QV.Get("AGESEOBPOSEE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_RETVALGET.equals((new IDVariant(0)), true))
      {
        PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "LoadEvent", _e);
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
      if (Result.equals((new IDVariant(-1)), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIABILAPEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIABILAPEG);
      // 
      // Variazioni Bilancio Peg On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIABILAPEG.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIABILAPEG_DESCRIZIONE,(new IDVariant(PAN_VARIABILAPEG.FieldText(PFL_VARIABILAPEG_DESCRIZIONE))).stringValue()); 
      if ((new IDVariant(PAN_VARIABILAPEG.Layout())).equals((new IDVariant(0)), true))
      {
        Disabilita();
        PAN_VARIABILAPEG.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIABILAPEG_TIPO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_VARIABILAPEG.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      if ((new IDVariant(PAN_VARIABILAPEG.Layout())).equals((new IDVariant(1)), true))
      {
        PAN_VARIABILAPEG.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        // 
        // MODIFICA
        // 
        if (!(PAN_VARIABILAPEG.IsNewRow()))
        {
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0))))
          {
            PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0))))
          {
            PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if ((!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0)))) && new IDVariant(PAN_VARIABILAPEG.Status()).equals((new IDVariant(2)), true))
          {
            Disabilita();
          }
          else
          {
            Abilita();
          }
        }
        else
        {
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          Abilita();
        }
        PAN_VARIABILAPEG.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIABILAPEG_TIPO,new IDVariant(MyGlb.VIS_OPTIONBUTTON).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIABILAPEG_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        PAN_VARIABILAPEG.set_Layout((new IDVariant(1)).intValue());
      }
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          Cancel.set((new IDVariant(-1)));
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          new IDVariant(PAN_VARIABILAPEG.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIABILAPEG.SetFlags (Glb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_VARIABILAPEG_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_VARIABILAPEG_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_VARIABILAPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VARIABILAPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Variazioni Bilancio Peg On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIABILAPEG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg On Updating Row Event Body
      // Procedure Body
      // 
      // if ((Column.equals((new IDVariant(PFL_VARIABILAPEG_PROPOSTA1)), true) || Column.equals((new IDVariant(PFL_VARIABILAPEG_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_VARIABILAPEG_ANNOPRO)), true)) && FieldModified.booleanValue())
      // {
        // if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0))))
        // {
          // if ((new IDVariant(MainFrm.ControllaProposta(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0)))).equals((new IDVariant(0)), true))
          // {
            // MainFrm.set_AlertMessage(v_ERR); 
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_UNITA_PROPONENTE, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_PROPOSTA, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0, (new IDVariant()));
          // }
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_VARIABILAPEG_DELIBERA1)), true) || Column.equals((new IDVariant(PFL_VARIABILAPEG_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_VARIABILAPEG_ANNODEL)), true)) && FieldModified.booleanValue())
      // {
        // if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0))))
        // {
          // if (MainFrm.ControlloEsistenzaDelibere(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0), IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0), IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0)).equals((new IDVariant(0)), true))
          // {
            // MainFrm.set_AlertMessage(v_ERR); 
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_SEDE_DEL, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_NUMERO_DEL, 0, (new IDVariant()));
            // IMDB.set_Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0, (new IDVariant()));
          // }
        // }
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_VARIABILAPEG_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg After Commit Event Body
      // Procedure Body
      // 
      PAN_VARIABILAPEG.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Bilancio Peg On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIABILAPEG_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Bilancio Peg On Change Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_VARIAZIONE_ID, 0)))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS31+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS31+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_PROPOSTA, 0)))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENEVARIPROV+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMVARIPROV+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLVARBILPE1, IMDBDef12.PQSL_POLVARBILPE1_ANNO_DEL, 0)))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMVARIPROV+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMVARIPROV+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENEVARIPROV+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniBilancioPEG", "VariazioniBilancioPegOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void VARIABILAPEG_PANNELLO8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANNELLO8_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PANNELLO11, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PANNELLO11, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO8_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANNELLO8_RS, 0, IMDBDef4.TBL_PANNELLO11, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO8_RS, 0, 0, IMDBDef4.TBL_PANNELLO11, IMDBDef4.FLD_PANNELLO11_ROWNAMANVAGE, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PANNELLO11, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PANNELLO11, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PANNELLO11, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANNELLO8_RS, 0);
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
  private void PAN_OPZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OPZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPZIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_OPZIONI);
    // Stub
  }

  private void PAN_OPZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OPZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OPZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OPZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIABILAPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIABILAPEG, Cancel);
    // Stub
  }

  private void PAN_VARIABILAPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIABILAPEG_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_VARIABILAPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIABILAPEG_INFODEL)
    {
      this.IdxPanelActived = this.PAN_VARIABILAPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIABILAPEG_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_VARIABILAPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIABILAPEG_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_VARIABILAPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIABILAPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIABILAPEG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIABILAPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIABILAPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_OPZIONI_Init()
  {

    PAN_OPZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPZIONI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, "671E0D8E-CB11-4F6E-BF43-4E770FC50F17");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, "Anche variazioni generate");
    PAN_OPZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, "");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.VIS_CHECKSTYLE);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_OPZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_LIST, 136);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_LIST, 1);
    PAN_OPZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_LIST, "A. vr. gn.");
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_FORM, 4, 12, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_FORM, 160);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_FORM, 1);
    PAN_OPZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANCHVARIGENE, MyGlb.PANEL_FORM, "Anche variazioni generate");
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_ANCHVARIGENE, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_ANCHVARIGENE, PPQRY_PANNELLO8, "A.ROWNAMANVAGE", "ROWNAMANVAGE", 5, 2, 0, -13997);
    PAN_OPZIONI.SetValueListItem(PFL_OPZIONI_ANCHVARIGENE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_OPZIONI.SetValueListItem(PFL_OPZIONI_ANCHVARIGENE, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_OPZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OPZIONI.SetIMDB(IMDB, "PQRY_PANNELLO8", true);
    PAN_OPZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_OPZIONI.SetQueryIMDB(PPQRY_PANNELLO8, IMDBDef12.PQRY_PANNELLO8_RS, IMDBDef4.TBL_PANNELLO11);
    JustLoaded = true;
    PAN_OPZIONI.SetFieldPrimaryIndex(PFL_OPZIONI_ANCHVARIGENE, IMDBDef4.FLD_PANNELLO11_ROWNAMANVAGE);
    PAN_OPZIONI.SetMasterTable(0, "PANNELLO11");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OPZIONI.Status() == 2)
    {
      int oldListQBE = PAN_OPZIONI.iUseListQBE;
      PAN_OPZIONI.iUseListQBE = 0;
      PAN_OPZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_OPZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIABILAPEG_Init()
  {

    PAN_VARIABILAPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIABILAPEG.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, "5212D4B2-3A5B-4275-96AB-7F2FFF7C9A2F");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, "Inserimento");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, MyGlb.PANEL_FORM, 8, 195, 300, 49, 0, 0);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, 0, 70);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, 1, 13);
    PAN_VARIABILAPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, 0, 4);
    PAN_VARIABILAPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, 1, 4);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, "F596191F-C29E-4E77-A442-D6E3CEABE1CE");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, "Aggiornamento");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, MyGlb.PANEL_FORM, 376, 195, 300, 49, 0, 0);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, 0, 88);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, 1, 13);
    PAN_VARIABILAPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, 0, 4);
    PAN_VARIABILAPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, 1, 4);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIABILAPEG_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIABILAPEG.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, "782014F9-A25E-4767-9942-0143025D9D45");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, "Descrizione");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, "16398F2B-D2FC-4DF9-BA08-162DF958AF3A");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, "Tipo");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, "A907B8A3-F931-4783-9243-2885B8183636");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, "Proposta ");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, "84D786C0-13DE-42EC-963C-A59FBAB5117F");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, "50234EC4-8E7A-44F1-AEBC-44A050D81FE5");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, "anno pro");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, "036DDBF9-AB70-4BF8-96BD-4EBC1904EE66");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, "Info Prop");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, "483C56E9-EAB5-4259-B9AC-0DE2F74A9F91");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, "Delibera  ");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, "D566FDB9-A8C4-4845-9B90-D5391601ABDA");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, "NUMERO DEL");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, "B7D7720E-4C30-45D1-AB3D-3285A52FFC99");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, "anno del");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, "F6EF7A28-E0E7-4BE4-AE76-AC370F6A5CA1");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, "Info Del");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, "207B529C-070B-4508-AF4E-8E3AFBCF92DE");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, "Proposta");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, "C5180034-9E4F-41A2-A122-D39960F9740E");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, "Delibera");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, "7247E3B4-1E82-4C79-8FBA-9F0B9EC89A8A");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, "-");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, "CF6D4630-65B6-44EC-9B1D-1C392AADC5C5");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, "-");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, "BBCFDDFF-355C-4178-8A30-1BF5FA1F537C");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, "/");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, "A7EB915F-4FB5-4662-80BF-8F40633E6A7F");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, "/");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, "A75B7EFD-D497-4427-844A-706CC5E6C6EB");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIABILAPEG.SetImage(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, 0, "info.gif", false);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, "5BE17DC8-674C-425E-A01B-1C2EC925BAD7");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIABILAPEG.SetImage(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, 0, "info.gif", false);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, "A840A07B-38D1-40E4-9FAB-8F61D8DCC3C0");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, "Utente");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, "F3C38B42-5B8A-4793-A650-D36614879D89");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, "Data");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, "A418FC97-9140-4266-8A25-A0E2C2DB5504");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, "Utente  ");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, "EF2D342F-51A2-4642-A233-02A10F5FA1A3");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, "Data ");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, "C644B063-C332-4965-A3C3-2EF83DA4AE04");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, "ESERCIZIO");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, 0, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, "831B4CD0-3988-4F58-B57C-5800116189CD");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, "Descrizione P.e.g. Obiettivi");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIABILAPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, "6EA71B5D-3BD7-40B1-92C2-2D0D8712BAFB");
    PAN_VARIABILAPEG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, "VARIAZIONE ID");
    PAN_VARIABILAPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, "");
    PAN_VARIABILAPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIABILAPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VARIABILAPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 76, 28, 408, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DESCRIZIONE, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DESCRIZIONE, PPQRY_POLVARBILPE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_LIST, 232, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_LIST, 48);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_FORM, 112, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_FORM, 40);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_TIPO, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_TIPO, PPQRY_POLVARBILPE1, "A.BIL_PEG", "BIL_PEG", 5, 1, 0, -13997);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_TIPO, (new IDVariant("B")), "di Bilancio", "", "", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_TIPO, (new IDVariant("P")), "di P.e.g.", "", "", -1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_LIST, 296, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_LIST, 112);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_LIST, "Proposta ");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_FORM, 92, 124, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_FORM, 60);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA1, MyGlb.PANEL_FORM, "Proposta ");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_PROPOSTA1, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_PROPOSTA1, PPQRY_POLVARBILPE1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_LIST, 404, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_LIST, "NM. PRP.");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_FORM, 212, 124, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_NUMEROPROPOS, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_NUMEROPROPOS, PPQRY_POLVARBILPE1, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_LIST, 436, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_LIST, 96);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_LIST, "anno pro");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_FORM, 276, 124, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_FORM, 52);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNOPRO, MyGlb.PANEL_FORM, "ann. pro");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_ANNOPRO, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_ANNOPRO, PPQRY_POLVARBILPE1, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_LIST, 472, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_LIST, 56);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_LIST, "I. P.");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_FORM, 4, 292, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_FORM, 56);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROP, MyGlb.PANEL_FORM, "Info Prop");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_INFOPROP, -1, -1);
    PAN_VARIABILAPEG.SetFieldUnbound(PFL_VARIABILAPEG_INFOPROP, true);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_INFOPROP, PPQRY_POLVARBILPE1, "CASE WHEN NOT ((A.ANNO_PROPOSTA IS NULL)) AND NOT ((A.NUMERO_PROPOSTA IS NULL)) AND NOT ((A.UNITA_PROPONENTE IS NULL)) THEN 'I' ELSE NULL END", "RECOINFOPROP", 5, 99, 0, -13997);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFOPROP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_LIST, 492, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_LIST, 56);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_LIST, "Del.");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_FORM, 96, 148, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_FORM, 56);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA1, MyGlb.PANEL_FORM, "Delibera  ");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DELIBERA1, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DELIBERA1, PPQRY_POLVARBILPE1, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_LIST, 524, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_FORM, 212, 148, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_NUMERODEL, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_NUMERODEL, PPQRY_POLVARBILPE1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_LIST, 568, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_LIST, "anno del");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_FORM, 276, 148, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_FORM, 48);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ANNODEL, MyGlb.PANEL_FORM, "ann. dl.");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_ANNODEL, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_ANNODEL, PPQRY_POLVARBILPE1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_LIST, 604, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_LIST, 48);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_LIST, "I. D.");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_FORM, 4, 244, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_FORM, 48);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODEL, MyGlb.PANEL_FORM, "Info Del");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_INFODEL, -1, -1);
    PAN_VARIABILAPEG.SetFieldUnbound(PFL_VARIABILAPEG_INFODEL, true);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_INFODEL, PPQRY_POLVARBILPE1, "CASE WHEN NOT ((A.ANNO_DEL IS NULL)) AND NOT ((A.NUMERO_DEL IS NULL)) AND NOT ((A.SEDE_DEL IS NULL)) THEN 'I' ELSE NULL END", "RECORINFODEL", 5, 99, 0, -13997);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VARIABILAPEG.SetValueListItem(PFL_VARIABILAPEG_INFODEL, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_LIST, 296, 0, 196, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_FORM, 368, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_PROPOSTA, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_LIST, 492, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_FORM, 376, 8, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DELIBERA, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_LIST, 96, 96, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_FORM, 196, 124, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_TRATTINO, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_LIST, 104, 104, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_FORM, 196, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_TRATTINO1, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_LIST, 104, 104, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_FORM, 260, 124, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_TRATTINO2, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_LIST, 112, 112, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_FORM, 260, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_TRATTINO3, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_TRATTINO3, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_TRATTINO3, -1, "", "TRATTINO3", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_LIST, 232, 132, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_FORM, 312, 128, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_INFOPROPOSTA, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_LIST, 240, 140, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_FORM, 312, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_INFODELIBERA, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_LIST, 476, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_FORM, 12, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_FORM, 52);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_UTENTE1, -1, GRP_VARIABILAPEG_INSERIMENTO);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_UTENTE1, PPQRY_POLVARBILPE1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_LIST, 476, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_FORM, 192, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_FORM, 40);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DATA1, -1, GRP_VARIABILAPEG_INSERIMENTO);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DATA1, PPQRY_POLVARBILPE1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_LIST, 476, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_LIST, "Utente  ");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_FORM, 380, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_FORM, 52);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_UTENTE, MyGlb.PANEL_FORM, "Utente  ");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_UTENTE, -1, GRP_VARIABILAPEG_AGGIORNAMENT);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_UTENTE, PPQRY_POLVARBILPE1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_LIST, 476, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_LIST, 100);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_FORM, 560, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_FORM, 40);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DATA, -1, GRP_VARIABILAPEG_AGGIORNAMENT);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DATA, PPQRY_POLVARBILPE1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_ESERCIZIO, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_ESERCIZIO, PPQRY_POLVARBILPE1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_LIST, 116);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_LIST, 2);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_LIST, "Descrizione P.e.g. Obiettivi");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_FORM, 0, 76, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_FORM, 152);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_FORM, 2);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_DESCRPEGOBIE, MyGlb.PANEL_FORM, "Descrizione P.e.g. Obiettivi");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_DESCRPEGOBIE, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_DESCRPEGOBIE, PPQRY_POLVARBILPE1, "A.DESCRIZIONE_PEG_OB", "DESCRIZIONE_PEG_OB", 5, 200, 0, -13997);
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_LIST, 84);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_LIST, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_LIST, "VARIAZIONE ID");
    PAN_VARIABILAPEG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIABILAPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_FORM, 84);
    PAN_VARIABILAPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_FORM, 1);
    PAN_VARIABILAPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIABILAPEG_VARIAZIONEID, MyGlb.PANEL_FORM, "VARIAZ. ID");
    PAN_VARIABILAPEG.SetFieldPage(PFL_VARIABILAPEG_VARIAZIONEID, -1, -1);
    PAN_VARIABILAPEG.SetFieldPanel(PFL_VARIABILAPEG_VARIAZIONEID, PPQRY_POLVARBILPE1, "A.VARIAZIONE_ID", "VARIAZIONE_ID", 1, 8, 0, -13997);
  }

  private void PAN_VARIABILAPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIABILAPEG.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTVBPEGVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTVBPEGVBP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_VARIABILAPEG_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTVBPEGVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTVBPEGVBP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_VARIABILAPEG_UTENTE1, "");
    PAN_VARIABILAPEG.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REU1VBPEGVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REU1VBPEGVBP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_DUAL, 0, SQL, PFL_VARIABILAPEG_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REU1VBPEGVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REU1VBPEGVBP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_DUAL, 1, SQL, PFL_VARIABILAPEG_UTENTE, "");
    PAN_VARIABILAPEG.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIABILAPEG.SetIMDB(IMDB, "PQRY_POLVARBILPE1", true);
    PAN_VARIABILAPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BIL_PEG as BIL_PEG, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.VARIAZIONE_ID as VARIAZIONE_ID, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.DESCRIZIONE_PEG_OB as DESCRIZIONE_PEG_OB, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_DEL IS NULL)) AND NOT ((A.NUMERO_DEL IS NULL)) AND NOT ((A.SEDE_DEL IS NULL)) THEN 'I' ELSE NULL END as RECORINFODEL, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_PROPOSTA IS NULL)) AND NOT ((A.NUMERO_PROPOSTA IS NULL)) AND NOT ((A.UNITA_PROPONENTE IS NULL)) THEN 'I' ELSE NULL END as RECOINFOPROP ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (((~~PQRY_PANNELLO8.ROWNAMANVAGE~~ = 'NO' AND (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    SQL.append("where (B.VARIAZIONE_ID = A.VARIAZIONE_ID) ");
    SQL.append("))) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT C ");
    SQL.append("where (C.VARIAZIONE_ID = A.VARIAZIONE_ID) ");
    SQL.append("and   ((C.PROGR_VARCOMPRO_1 IS NULL) AND (C.PROGR_VARCOMPRO_2 IS NULL) AND (C.PROGR_VARCOMPRO_3 IS NULL) AND (C.PROGR_VARCOM_1 IS NULL) AND (C.PROGR_VARCOM_2 IS NULL) AND (C.PROGR_VARCOM_3 IS NULL)) ");
    SQL.append("))))) OR (~~PQRY_PANNELLO8.ROWNAMANVAGE~~ = 'SI')) ");
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIABILAPEG.SetQuery(PPQRY_POLVARBILPE1, 5, SQL, -1, "");
    PAN_VARIABILAPEG.SetQueryDB(PPQRY_POLVARBILPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIABILAPEG.SetMasterTable(0, "POL_VARIAZIONI_BIL_PEG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIABILAPEG.Status() == 2)
    {
      int oldListQBE = PAN_VARIABILAPEG.iUseListQBE;
      PAN_VARIABILAPEG.iUseListQBE = 0;
      PAN_VARIABILAPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIABILAPEG.PanelCommand(Glb.PCM_FIND);
      PAN_VARIABILAPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_DynamicProperties();
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_OnChangeRow();
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
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIABILAPEG) PAN_VARIABILAPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
