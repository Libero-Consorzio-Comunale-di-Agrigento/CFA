// **********************************************
// Albero Estrazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AlberoEstrazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RICERCESTRAZ_RICERCDESCRI = 0;
  private static int PFL_RICERCESTRAZ_HASH = 1;

  private static int PPQRY_PARAMETRI677 = 0;


  IDPanel PAN_RICERCESTRAZ;
  ATree TRE_ESTRAZIONI;
  ASubForm SUF_ESPORTAZDATI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIALB(IMDB);
    Init_TBL_PARAMETRI94(IMDB);
    //
    //
    Init_PQRY_CFESTRASELE1(IMDB);
    Init_PQRY_CFESTRASELEC(IMDB);
    Init_PQRY_PARAMETRI677(IMDB);
    Init_PQRY_PARAMETRI677_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIALB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRIALB, 1);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRIALB, "TBL_PARAMETRIALB");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRIALB,IMDBDef7.FLD_PARAMETRIALB_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRIALB,IMDBDef7.FLD_PARAMETRIALB_NOMEOGGETIPO,5,50,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRIALB, 0);
  }

  private static void Init_TBL_PARAMETRI94(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI94, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI94, "TBL_PARAMETRI94");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI94,IMDBDef7.FLD_PARAMETRI94_NOMOGGRICDES, "NOMOGGRICDES");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI94,IMDBDef7.FLD_PARAMETRI94_NOMOGGRICDES,9,1000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI94,IMDBDef7.FLD_PARAMETRI94_NOMEOGGEHASH, "NOMEOGGEHASH");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI94,IMDBDef7.FLD_PARAMETRI94_NOMEOGGEHASH,5,50,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI94, 0);
  }

  private static void Init_PQRY_CFESTRASELE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASELE1, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASELE1, "PQRY_CFESTRASELE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE1,IMDBDef17.PQSL_CFESTRASELE1_RECCFESTSECA, "RECCFESTSECA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE1,IMDBDef17.PQSL_CFESTRASELE1_RECCFESTSECA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE1,IMDBDef17.PQSL_CFESTRASELE1_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE1,IMDBDef17.PQSL_CFESTRASELE1_HASH,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASELE1, 0);
  }

  private static void Init_PQRY_CFESTRASELEC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASELEC, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASELEC, "PQRY_CFESTRASELEC");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECORDTITOLO, "RECORDTITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECORDTITOLO,5,222,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, "RECCFESTSEID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEDE, "RECCFESTSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEDE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEST, "RECCFESTSEST");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELEC,IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEST,5,20,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASELEC, 0);
  }

  private static void Init_PQRY_PARAMETRI677(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI677, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI677, "PQRY_PARAMETRI677");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI677,IMDBDef17.PQSL_PARAMETRI677_NOMOGGRICDES, "NOMOGGRICDES");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI677,IMDBDef17.PQSL_PARAMETRI677_NOMOGGRICDES,9,1000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI677,IMDBDef17.PQSL_PARAMETRI677_NOMEOGGEHASH, "NOMEOGGEHASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI677,IMDBDef17.PQSL_PARAMETRI677_NOMEOGGEHASH,5,50,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI677, 0);
  }

  private static void Init_PQRY_PARAMETRI677_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI677_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI677_RS, "PQRY_PARAMETRI677_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI677_RS,IMDBDef17.PQSL_PARAMETRI677_NOMOGGRICDES, "NOMOGGRICDES");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI677_RS,IMDBDef17.PQSL_PARAMETRI677_NOMOGGRICDES,9,1000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI677_RS,IMDBDef17.PQSL_PARAMETRI677_NOMEOGGEHASH, "NOMEOGGEHASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI677_RS,IMDBDef17.PQSL_PARAMETRI677_NOMEOGGEHASH,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AlberoEstrazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public AlberoEstrazioni()
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
    FormIdx = MyGlb.FRM_ALBEROESTRAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EE69EEF2-F878-4D9D-9F6D-2B677B2B6837";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1256;
    DesignHeight = 818;
    set_Caption(new IDVariant("Estrazioni Attive"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1256;
    Frames[1].Height = 792;
    Frames[1].FormFactor = 0.269904;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 339;
    Frames[2].Height = 792;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.0707071;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 339;
    Frames[3].Height = 56;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Ricerca Estrazioni";
    Frames[3].Parent = this;
    Frames[3].FixedWidth = 339;
    Frames[3].FixedHeight = 56;
    Frames[3].MinWidth = Frames[3].Width;
    Frames[3].MaxWidth = Frames[3].Width;
    PAN_RICERCESTRAZ = new IDPanel(w, this, 3, "PAN_RICERCESTRAZ");
    Frames[3].Content = PAN_RICERCESTRAZ;
    PAN_RICERCESTRAZ.ShowRowSelector = false;
    PAN_RICERCESTRAZ.ShowToolbar = false;
    PAN_RICERCESTRAZ.ShowStatusbar = false;
    PAN_RICERCESTRAZ.Lockable = false;
    PAN_RICERCESTRAZ.iLocked = false;
    PAN_RICERCESTRAZ.VS = MainFrm.VisualStyleList;
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 339-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RICERCESTRAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD36FB3B-81AB-435A-A4B8-F5B9CD988843");
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 260, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RICERCESTRAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RICERCESTRAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RICERCESTRAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RICERCESTRAZ.InitStatus = 2;
    PAN_RICERCESTRAZ_Init();
    PAN_RICERCESTRAZ_InitFields();
    PAN_RICERCESTRAZ_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 339;
    Frames[4].Height = 736;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Estrazioni";
    Frames[4].Parent = this;
    Frames[4].FixedWidth = 339;
    Frames[4].FixedHeight = 736;
    Frames[4].MinWidth = Frames[4].Width;
    Frames[4].MaxWidth = Frames[4].Width;
    TRE_ESTRAZIONI = new ATree(this);
    Frames[4].Content = TRE_ESTRAZIONI;
    TRE_ESTRAZIONI.Width = 339;
    TRE_ESTRAZIONI.Height = 736;
    TRE_ESTRAZIONI.FrIndex = 4;
    TRE_ESTRAZIONI.Code = "TRE_ESTRAZIONI";
    TRE_ESTRAZIONI.CtxMenuIdx = BaseCmdSetIdx + MyGlb.CMDS_POPUPESTRAZ1;
    TRE_ESTRAZIONI.iGuid = "4D1CE6AF-9E4D-4C71-9051-625193F0D04B";
    TRE_ESTRAZIONI.SetItemCount(2);
    Item = new ATreeItem();
    TRE_ESTRAZIONI.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Categorie";
    Item.iGuid = "62F9456D-CC2B-4B32-9D99-6C69B4D1A570";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CATEGORIA as RECCFESTSECA, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) as HASH ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_SELECT A ");
    SQL.append("where (DECODE(A.DATA_INIZIO_VALIDITA, to_date(NULL), TRUNC( SYSDATE ) - 1, A.DATA_INIZIO_VALIDITA) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (DECODE(A.DATA_FINE_VALIDITA, to_date(NULL), TRUNC( SYSDATE ) + 1, A.DATA_FINE_VALIDITA) >= TRUNC( SYSDATE )) ");
    SQL.append("and   (UPPER(A.TITOLO) LIKE '%' || UPPER(~~PQRY_PARAMETRI677.NOMOGGRICDES~~) || '%' OR UPPER(A.CODICE) LIKE '%' || UPPER(~~PQRY_PARAMETRI677.NOMOGGRICDES~~) || '%') ");
    SQL.append("and   (A.IN_USO = 'SI') ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_CFESTRASELE1);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ESTRAZIONI.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Query";
    Item.iGuid = "11766BC1-5D64-4E05-98C7-EF220D66A766";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.STATO, 'S', '[STD] - ', '[PERS] - ') || A.CODICE || ' - ' || A.TITOLO as RECORDTITOLO, ");
    SQL.append("  A.ID as RECCFESTSEID, ");
    SQL.append("  A.DESCRIZIONE as RECCFESTSEDE, ");
    SQL.append("  A.STATO as RECCFESTSEST ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_SELECT A ");
    SQL.append("where (DECODE(A.CATEGORIA, NULL, '-1', A.CATEGORIA) = DECODE(~~PQRY_CFESTRASELE1.RECCFESTSECA~~, NULL, '-1', ~~PQRY_CFESTRASELE1.RECCFESTSECA~~)) ");
    SQL.append("and   (DECODE(A.DATA_INIZIO_VALIDITA, to_date(NULL), TRUNC( SYSDATE ) - 1, A.DATA_INIZIO_VALIDITA) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (DECODE(A.DATA_FINE_VALIDITA, to_date(NULL), TRUNC( SYSDATE ) + 1, A.DATA_FINE_VALIDITA) >= TRUNC( SYSDATE )) ");
    SQL.append("and   (UPPER(A.TITOLO) LIKE '%' || UPPER(~~PQRY_PARAMETRI677.NOMOGGRICDES~~) || '%' OR UPPER(A.CODICE) LIKE '%' || UPPER(~~PQRY_PARAMETRI677.NOMOGGRICDES~~) || '%') ");
    SQL.append("and   (A.IN_USO = 'SI') ");
    SQL.append("order by ");
    SQL.append("  A.STATO desc, ");
    SQL.append("  A.DESCRIZIONE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_CFESTRASELEC);
    Item.AddPK("RECCFESTSEID");
    Item = TRE_ESTRAZIONI.GetItem(1);
    Item.SetItem(1, TRE_ESTRAZIONI.GetItem(2));
    Item = TRE_ESTRAZIONI.GetItem(2);
    Item.Parent = TRE_ESTRAZIONI.GetItem(1);
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 917;
    Frames[5].Height = 792;
    SUF_ESPORTAZDATI = new ASubForm(this);
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Esportazione Dati";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 792;
    Frames[5].Content = SUF_ESPORTAZDATI;
    SUF_ESPORTAZDATI.FrIndex = 5;
    SUF_ESPORTAZDATI.Code = "ALBEROESTRAZ_ESPORTAZDATI";
    SUF_ESPORTAZDATI.set_Flags(196929);
    SUF_ESPORTAZDATI.Height = 792;
    SUF_ESPORTAZDATI.Width = 917;
    SUF_ESPORTAZDATI.Init(new EsportazioneDati(), MainFrm.MainFrm);
    SUF_ESPORTAZDATI.iGuid = "8B52E2B7-62B4-4188-8D2E-2B0667C0B4B9";
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
      if (CmdIdx==MyGlb.CMD_NUOVAESTRAZ1+BaseCmdLinIdx)
      {
        NuovaEstrazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLICESTRA1+BaseCmdLinIdx)
      {
        DuplicaEstrazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx)
      {
        CancellaEstrazioneSelect();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI94, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ALBEROESTRAZ_PARAMETRI677();
      }
      PAN_RICERCESTRAZ.UpdatePanel(MainFrm);
      TRE_ESTRAZIONI.UpdateTree(MainFrm);
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
    return (obj instanceof AlberoEstrazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AlberoEstrazioni.class.getName() : (Glb.ClassWithPackage(AlberoEstrazioni.class) ? AlberoEstrazioni.class.getName().substring(AlberoEstrazioni.class.getPackage().getName().length() + 1) : AlberoEstrazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Attiva Nodo Query
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AttivaNodoQuery ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attiva Nodo Query Body
      // Corpo Procedura
      // 
      SUF_ESPORTAZDATI.SendMessage((new IDVariant("Refresh")), this, null, IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, 0)); 
      ApriPer(new IDVariant(IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIALB, IMDBDef7.FLD_PARAMETRIALB_NOMEOGGETIPO, 0, (new IDVariant("Query")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "AttivaNodoQuery", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Per
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // id Select - Input
  // **********************************************************************
  public int ApriPer (IDVariant idSelect)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Per Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEST, 0).equals((new IDVariant("P")), true) && !(IDL.IsNull(idSelect)))
      {
        if (MainFrm.GetAbilitazioni((new IDVariant("CANCELLA"))).equals((new IDVariant(-1)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (IDL.IsNull(idSelect))
      {
        SUF_ESPORTAZDATI.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        SUF_ESPORTAZDATI.set_Visible((new IDVariant(-1)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "ApriPer", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuova Estrazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int NuovaEstrazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuova Estrazione Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_VISUMODIESTR, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_VISUMODIESTR,(new IDVariant(0)).booleanValue()); 
      }
      NUOVAESTRAZI_PARAMEDELETE();
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGCATALB, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRASELE1, IMDBDef17.PQSL_CFESTRASELE1_RECCFESTSECA, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_VISUMODIESTR, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "NuovaEstrazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void NUOVAESTRAZI_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGEDUPL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGCATALB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGECANC, 0, new IDVariant());
  }

  // **********************************************************************
  // Documenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Documenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENCODOCUME, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "Documenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Duplica Estrazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DuplicaEstrazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Estrazione Body
      // Corpo Procedura
      // 
      IDVariant v_ID = new IDVariant(0,IDVariant.INTEGER);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, 0))))
      {
        MainFrm.Cf4armDBObject.CFESTRAIDUPLICASELECT(IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_ID);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant("Errore in fase di duplicazione Select"))); 
        }
      }
      TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      if (v_ID.compareTo((new IDVariant(0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0, new IDVariant(new IDVariant(v_ID),IDVariant.DECIMAL));
        if ((MainFrm.GetForm(MyGlb.FRM_VISUMODIESTR, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_VISUMODIESTR,(new IDVariant(0)).booleanValue()); 
        }
        MainFrm.Show(MyGlb.FRM_VISUMODIESTR, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "DuplicaEstrazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Attiva Nodo Categorie
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AttivaNodoCategorie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attiva Nodo Categorie Body
      // Corpo Procedura
      // 
      SUF_ESPORTAZDATI.SendMessage((new IDVariant("NotVisible")), this, null, (new IDVariant())); 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRIALB, IMDBDef7.FLD_PARAMETRIALB_NOMEOGGETIPO, 0, (new IDVariant("Categorie")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "AttivaNodoCategorie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cancella Estrazione Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CancellaEstrazioneSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Estrazione Select Body
      // Corpo Procedura
      // 
      if (MainFrm.MessageConfirm((new IDVariant("Si desidera cancellare la query selezionata?"))))
      {
        SQL = new StringBuffer();
        SQL.append("update CF_ESTRAI_SELECT set ");
        SQL.append("  IN_USO = 'NO' ");
        SQL.append("where (ID = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRASELEC, IMDBDef17.PQSL_CFESTRASELEC_RECCFESTSEID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SUF_ESPORTAZDATI.set_Visible((new IDVariant(0)).booleanValue());
        TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "CancellaEstrazioneSelect", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ricerca Estrazioni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_RICERCESTRAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricerca Estrazioni On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_RICERCESTRAZ_RICERCDESCRI)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI677, IMDBDef17.PQSL_PARAMETRI677_NOMOGGRICDES, 0))))
        {
          TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
          TRE_ESTRAZIONI.ExpandNode(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "RicercaEstrazioniOnUpdatingRow", _e);
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
      MainFrm.Importafile();
      MainFrm.set_AutoCollapseMenu((new IDVariant(-1)).intValue());
      SUF_ESPORTAZDATI.set_Visible((new IDVariant(0)).booleanValue());
      if (MainFrm.GetAbilitazioni((new IDVariant("NUOVO"))).equals((new IDVariant(-1)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVAESTRAZ1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DUPLICESTRA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVAESTRAZ1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DUPLICESTRA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (MainFrm.GetAbilitazioni((new IDVariant("CANCELLA"))).equals((new IDVariant(-1)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELESTRA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Popup ESTRAZIONI On Open Popup
  // Evento notificato dal CommandSet quando viene aperto
  // come popup.
  // Direction - Input/Output
  // Cancel - Input/Output
  // **********************************************************************
  public void CMDS_POPUPESTRAZ1_OnOpenPopup(IDVariant Direction, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Popup ESTRAZIONI On Open Popup Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRIALB, IMDBDef7.FLD_PARAMETRIALB_NOMEOGGETIPO, 0).equals((new IDVariant("Categorie")), true))
      {
        Cancel.set((new IDVariant(-1)));
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AlberoEstrazioni", "PopupESTRAZIONIOnOpenPopup", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ALBEROESTRAZ_PARAMETRI677() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI677_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI94, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI94, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI677_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI677_RS, 0, IMDBDef7.TBL_PARAMETRI94, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI677_RS, 0, 0, IMDBDef7.TBL_PARAMETRI94, IMDBDef7.FLD_PARAMETRI94_NOMOGGRICDES, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI677_RS, 1, 0, IMDBDef7.TBL_PARAMETRI94, IMDBDef7.FLD_PARAMETRI94_NOMEOGGEHASH, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI94, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI94, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI94, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI677_RS, 0);
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
  private void PAN_RICERCESTRAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RICERCESTRAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RICERCESTRAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RICERCESTRAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RICERCESTRAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RICERCESTRAZ);
    // Stub
  }

  private void PAN_RICERCESTRAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RICERCESTRAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RICERCESTRAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RICERCESTRAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RICERCESTRAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TRE_ESTRAZIONI_NodeClick(ATreeNode Node)
  {
    if (TRE_ESTRAZIONI.NodeClick(MainFrm, Node))
    {
      if (Node.Key.substring(0,6).equals("N00001"))
      {
      AttivaNodoCategorie();
      }
      if (Node.Key.substring(0,6).equals("N00002"))
      {
      AttivaNodoQuery();
      }
    }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RICERCESTRAZ_Init()
  {

    PAN_RICERCESTRAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RICERCESTRAZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RICERCESTRAZ.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_RICERCESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, "42D57E51-39B3-4170-9BF5-D1A24B645E83");
    PAN_RICERCESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, " ");
    PAN_RICERCESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, "");
    PAN_RICERCESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_RICERCESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RICERCESTRAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, "E9F88390-DF76-480A-B435-A386DB3380D5");
    PAN_RICERCESTRAZ.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, "Hash");
    PAN_RICERCESTRAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, "");
    PAN_RICERCESTRAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.VIS_NORMFIELPADR);
    PAN_RICERCESTRAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RICERCESTRAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RICERCESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_LIST, 120);
    PAN_RICERCESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_RICERCESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_LIST, " ");
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_FORM, 12, 20, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_FORM, 8);
    PAN_RICERCESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_RICERCESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_RICERCDESCRI, MyGlb.PANEL_FORM, "");
    PAN_RICERCESTRAZ.SetFieldPage(PFL_RICERCESTRAZ_RICERCDESCRI, -1, -1);
    PAN_RICERCESTRAZ.SetFieldPanel(PFL_RICERCESTRAZ_RICERCDESCRI, PPQRY_PARAMETRI677, "A.NOMOGGRICDES", "NOMOGGRICDES", 9, 1000, 0, -13997);
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RICERCESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_LIST, 36);
    PAN_RICERCESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_LIST, 1);
    PAN_RICERCESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_LIST, "Hash");
    PAN_RICERCESTRAZ.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_FORM, 4, 52, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCESTRAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_FORM, 36);
    PAN_RICERCESTRAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_FORM, 1);
    PAN_RICERCESTRAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCESTRAZ_HASH, MyGlb.PANEL_FORM, "Hash");
    PAN_RICERCESTRAZ.SetFieldPage(PFL_RICERCESTRAZ_HASH, -1, -1);
    PAN_RICERCESTRAZ.SetFieldPanel(PFL_RICERCESTRAZ_HASH, PPQRY_PARAMETRI677, "A.NOMEOGGEHASH", "NOMEOGGEHASH", 5, 50, 0, -13997);
  }

  private void PAN_RICERCESTRAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_RICERCESTRAZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RICERCESTRAZ.SetIMDB(IMDB, "PQRY_PARAMETRI677", true);
    PAN_RICERCESTRAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_RICERCESTRAZ.SetQueryIMDB(PPQRY_PARAMETRI677, IMDBDef17.PQRY_PARAMETRI677_RS, IMDBDef7.TBL_PARAMETRI94);
    JustLoaded = true;
    PAN_RICERCESTRAZ.SetFieldPrimaryIndex(PFL_RICERCESTRAZ_RICERCDESCRI, IMDBDef7.FLD_PARAMETRI94_NOMOGGRICDES);
    PAN_RICERCESTRAZ.SetFieldPrimaryIndex(PFL_RICERCESTRAZ_HASH, IMDBDef7.FLD_PARAMETRI94_NOMEOGGEHASH);
    PAN_RICERCESTRAZ.SetMasterTable(0, "PARAMETRI94");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RICERCESTRAZ.Status() == 2)
    {
      int oldListQBE = PAN_RICERCESTRAZ.iUseListQBE;
      PAN_RICERCESTRAZ.iUseListQBE = 0;
      PAN_RICERCESTRAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_RICERCESTRAZ.PanelCommand(Glb.PCM_FIND);
      PAN_RICERCESTRAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RICERCESTRAZ) PAN_RICERCESTRAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RICERCESTRAZ) PAN_RICERCESTRAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RICERCESTRAZ) PAN_RICERCESTRAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RICERCESTRAZ) PAN_RICERCESTRAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RICERCESTRAZ) PAN_RICERCESTRAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_ESTRAZIONI) TRE_ESTRAZIONI_NodeClick(Node);
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
    if (SrcObj.Code.equals("POPUPESTRAZ1")) CMDS_POPUPESTRAZ1_OnOpenPopup(Direction, Cancel);
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
