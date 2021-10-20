// **********************************************
// Gestione BDAP
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GestioneBDAP extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELELABOR_PROGRESSBDAP = 0;
  private static int PFL_PANNELELABOR_TIPOELABORAZ = 1;
  private static int PFL_PANNELELABOR_ETICHEELABOR = 2;

  private static int PPQRY_PARAM178 = 0;

  private static int PPQRY_TIPIBDAP = 1;


  IDPanel PAN_PANNELELABOR;
  private static int PFL_SCHEMIBILANC_PROGRESSIVO = 0;
  private static int PFL_SCHEMIBILANC_DESCRIZIONE = 1;
  private static int PFL_SCHEMIBILANC_DATARICALCOL = 2;
  private static int PFL_SCHEMIBILANC_FONTE = 3;
  private static int PFL_SCHEMIBILANC_PROGRSESSION = 4;
  private static int PFL_SCHEMIBILANC_TIPOBDAP = 5;
  private static int PFL_SCHEMIBILANC_SCHEMABILANC = 6;
  private static int PFL_SCHEMIBILANC_PROCEDSTAMPA = 7;

  private static int PPQRY_BDAPSCHEMI = 0;

  private static int PPQRY_STAMPESALVAT = 1;


  IDPanel PAN_SCHEMIBILANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM164(IMDB);
    //
    //
    Init_PQRY_PARAM178(IMDB);
    Init_PQRY_PARAM178_RS(IMDB);
    Init_PQRY_BDAPSCHEMI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM164(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM164, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM164, "TBL_PARAM164");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARATIPOELAB,5,3,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARATIPOBDAP, "PARATIPOBDAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARATIPOBDAP,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARAPROGBDAP,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARAMCFACE, "PARAMCFACE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM164,IMDBDef4.FLD_PARAM164_PARAMCFACE,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM164, 0);
  }

  private static void Init_PQRY_PARAM178(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM178, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM178, "PQRY_PARAM178");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM178,IMDBDef13.PQSL_PARAM178_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM178,IMDBDef13.PQSL_PARAM178_PARATIPOELAB,5,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM178,IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM178,IMDBDef13.PQSL_PARAM178_PARAPROGBDAP,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM178, 0);
  }

  private static void Init_PQRY_PARAM178_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM178_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM178_RS, "PQRY_PARAM178_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM178_RS,IMDBDef13.PQSL_PARAM178_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM178_RS,IMDBDef13.PQSL_PARAM178_PARATIPOELAB,5,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM178_RS,IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM178_RS,IMDBDef13.PQSL_PARAM178_PARAPROGBDAP,3,10,0);
  }

  private static void Init_PQRY_BDAPSCHEMI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_BDAPSCHEMI, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_BDAPSCHEMI, "PQRY_BDAPSCHEMI");
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_ORDINAMENTO, "ORDINAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_ORDINAMENTO,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_DATA_RICALCOLO, "DATA_RICALCOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_DATA_RICALCOLO,8,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, "BDASCHTITIBD");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD,5,20,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_SCHEMA_BILANCIO, "SCHEMA_BILANCIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_SCHEMA_BILANCIO,5,100,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_FONTE, "FONTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_FONTE,5,20,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROGR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROCEDURA_STAMPA, "PROCEDURA_STAMPA");
    IMDB.SetFldParams(IMDBDef13.PQRY_BDAPSCHEMI,IMDBDef13.PQSL_BDAPSCHEMI_PROCEDURA_STAMPA,5,50,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_BDAPSCHEMI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GestioneBDAP(MyWebEntryPoint w, IMDBObj imdb)
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
  public GestioneBDAP()
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
    FormIdx = MyGlb.FRM_GESTIONEBDAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FF27C5D9-DE8B-4818-B370-86F453B5CEAF";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 964;
    DesignHeight = 378;
    set_Caption(new IDVariant("Gestione BDAP"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 964;
    Frames[1].Height = 352;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.147727;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 964;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pannello Elabora";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PANNELELABOR = new IDPanel(w, this, 2, "PAN_PANNELELABOR");
    Frames[2].Content = PAN_PANNELELABOR;
    PAN_PANNELELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELELABOR.VS = MainFrm.VisualStyleList;
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "39235D7B-CC73-4B88-B0AB-C52218865339");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 216, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELELABOR.InitStatus = 1;
    PAN_PANNELELABOR_Init();
    PAN_PANNELELABOR_InitFields();
    PAN_PANNELELABOR_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 964;
    Frames[3].Height = 300;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Schemi Bilancio";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 300;
    PAN_SCHEMIBILANC = new IDPanel(w, this, 3, "PAN_SCHEMIBILANC");
    Frames[3].Content = PAN_SCHEMIBILANC;
    PAN_SCHEMIBILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEMIBILANC.VS = MainFrm.VisualStyleList;
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 964-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0A6C0AF6-2418-45FD-8DE0-DD95B383BF0B");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 912, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEMIBILANC.InitStatus = 2;
    PAN_SCHEMIBILANC_Init();
    PAN_SCHEMIBILANC_InitFields();
    PAN_SCHEMIBILANC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM164, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GESTIONEBDAP_PARAM178();
      }
      PAN_PANNELELABOR.UpdatePanel(MainFrm);
      PAN_SCHEMIBILANC.UpdatePanel(MainFrm);
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
    return (obj instanceof GestioneBDAP);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GestioneBDAP.class.getName() : (Glb.ClassWithPackage(GestioneBDAP.class) ? GestioneBDAP.class.getName().substring(GestioneBDAP.class.getPackage().getName().length() + 1) : GestioneBDAP.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C9;
    IDCachedRowSet C16;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Selezionare un Tipo Bdap prima di continuare."));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      else
      {
        IDVariant v_VCOUNT = null;
        v_VCOUNT = (new IDVariant(0));
        IDVariant v_VTIPITIPOBDA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_VTIPIBDAPDES = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO_BDAP as TIPITIPOBDAP, ");
        SQL.append("  A.DESCRIZIONE as TIPIBDAPDESC ");
        SQL.append("from ");
        SQL.append("  TIPI_BDAP A ");
        SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VTIPITIPOBDA = QV.Get("TIPITIPOBDAP", IDVariant.STRING) ;
          v_VTIPIBDAPDES = QV.Get("TIPIBDAPDESC", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.Find(v_VTIPITIPOBDA, (new IDVariant("SDB"))).compareTo((new IDVariant(0)), true)>0)
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BDAP_RIGHE A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_BDAP = " + IDL.CSql(v_VTIPITIPOBDA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO1 = (new IDVariant("Non è presente la struttura BDAP "));
            IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO2 = (new IDVariant(" per l'esercizio "));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO1, v_VTIPIBDAPDES), v_AVVISO2), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MESSAGGIOINT = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIOINT = (new IDVariant("I seguenti Schemi non sono stati elaborati:"));
        IDVariant v_MESSAGGIO = null;
        v_MESSAGGIO = (new IDVariant());
        PAN_SCHEMIBILANC.PanelCommand(Glb.PCM_UPDATE);
        C9 = PAN_SCHEMIBILANC.MasterRS();
        if (C9.size()>0) CurPos = C9.getRow(); else CurPos = 0;
        if (!C9.Bof()) PAN_SCHEMIBILANC.GotoFirst();
        while (!PAN_SCHEMIBILANC.RSEOF())
        {
          if (PAN_SCHEMIBILANC.IsRowSelected(I.intValue()))
          {
            v_SELEZIONATO = (new IDVariant(-1));
            if (C9.Get("FONTE").equals((new IDVariant("Stampa Salvata")), true) && IDL.IsNull(C9.Get("PROGR_SESSIONE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Selezionare la stampa Salvata"));
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), C9.Get("DESCRIZIONE")), (new IDVariant("<BR/>"))), v_AVVISO);
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_SCHEMIBILANC.GotoNext();
        }
        if (CurPos>0) C9.absolute(CurPos);
        if (!(v_SELEZIONATO.booleanValue()))
        {
          IDVariant v_SAVVISO = new IDVariant(0,IDVariant.STRING);
          v_SAVVISO = (new IDVariant("Selezionare almeno uno Schema per procedere con l'elaborazione."));
          MainFrm.set_AlertMessage(v_SAVVISO); 
          return 0;
        }
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        I = (new IDVariant(1));
        v_MESSAGGIO = (new IDVariant());
        C16 = PAN_SCHEMIBILANC.MasterRS();
        if (C16.size()>0) CurPos = C16.getRow(); else CurPos = 0;
        if (!C16.Bof()) PAN_SCHEMIBILANC.GotoFirst();
        while (!PAN_SCHEMIBILANC.RSEOF())
        {
          if (PAN_SCHEMIBILANC.IsRowSelected(I.intValue()))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            if (IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, 0).equals((new IDVariant("RENDDCA")), true) || IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, 0).equals((new IDVariant("RENDSDB")), true))
            {
              MainFrm.Cf4armDBObject.BDAPRENDLANCIOPROCEDURASCHEMA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), C16.Get("BDASCHTITIBD"), C16.Get("SCHEMA_BILANCIO"), MainFrm.PROGRESESSIO, C16.Get("PROGR_SESSIONE"));
            }
            else
            {
              MainFrm.Cf4armDBObject.BDAPPREVLANCIOPROCEDURASCHEMA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), C16.Get("BDASCHTITIBD"), C16.Get("SCHEMA_BILANCIO"), MainFrm.PROGRESESSIO, C16.Get("PROGR_SESSIONE"));
            }
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), C16.Get("DESCRIZIONE")), (new IDVariant("<BR/>"))), MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))));
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_SCHEMIBILANC.GotoNext();
        }
        if (CurPos>0) C16.absolute(CurPos);
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MESSAGGIOINT, (new IDVariant("<BR/>"))), v_MESSAGGIO)); 
        }
        PAN_SCHEMIBILANC.PanelCommand(Glb.PCM_REQUERY);
      }
      if (IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, 0).equals((new IDVariant("RENDDCA")), true))
      {
        MainFrm.Show(MyGlb.FRM_DATCONANAREN, (new IDVariant(0)).intValue(), this); 
      }
      else if (IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, 0).equals((new IDVariant("PREVDCA")), true))
      {
        MainFrm.Show(MyGlb.FRM_DATCONANAPRE, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI582, IMDBDef4.FLD_PARAMETRI582_PARATIPOBDAP, 0, IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_BDASCHTITIBD, 0));
        MainFrm.Show(MyGlb.FRM_SCHEMDIBILAN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "EtichettaElabora", _e);
      return -1;
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
      IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARATIPOELAB, 0, (new IDVariant("G")));
      PAN_SCHEMIBILANC.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_SCHEMIBILANC.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_SCHEMIBILANC.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PANNELELABOR.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      // 
      // Controllo se mi trovo su Cfaceid
      // 
      if (IDL.Find((new IDVariant(MainFrm.RealPath)), (new IDVariant("Cfaceid"))).compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARAMCFACE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARAMCFACE, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "Load", _e);
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
      PAN_SCHEMIBILANC.PanelCommand(Glb.PCM_CANCEL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARATIPOELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARATIPOBDAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARAPROGBDAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARAMCFACE, 0, new IDVariant());
  }

  // **********************************************************************
  // Pannello Elabora On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELELABOR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PANNELELABOR);
      // 
      // Pannello Elabora On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
      {
        IDVariant v_ELABORA = new IDVariant(0,IDVariant.STRING);
        v_ELABORA = (new IDVariant("Elabora"));
        PAN_SCHEMIBILANC.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PANNELELABOR.set_FieldText(PFL_PANNELELABOR_ETICHEELABOR, new IDVariant(v_ELABORA).stringValue());
      }
      else
      {
        IDVariant v_VISUALIZZA = new IDVariant(0,IDVariant.STRING);
        v_VISUALIZZA = (new IDVariant("Visualizza"));
        PAN_SCHEMIBILANC.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PANNELELABOR.set_FieldText(PFL_PANNELELABOR_ETICHEELABOR, new IDVariant(v_VISUALIZZA).stringValue());
      }
      PAN_SCHEMIBILANC.set_ToolTip(Glb.OBJ_FIELD,PFL_SCHEMIBILANC_DESCRIZIONE,(new IDVariant(PAN_SCHEMIBILANC.FieldText(PFL_SCHEMIBILANC_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "PannelloElaboraOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Pannello Elabora On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PANNELELABOR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pannello Elabora On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PANNELELABOR_PROGRESSBDAP)), true) && RowWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARAPROGBDAP, 0).equals((new IDVariant(3)), true))
        {
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PANNELELABOR_TIPOELABORAZ)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM178, IMDBDef13.PQSL_PARAM178_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
        {
          IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
          v_TOOLTIP = (new IDVariant("Genera Dati per BDAP consente di ricalcolare i dati per il certificato per i quadri selezionati. Vengono sovrascritti i dati esistenti salvati precedentemente."));
          MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Tipo Elaborazione")).stringValue(),new IDVariant(PAN_PANNELELABOR.bFields(PFL_PANNELELABOR_TIPOELABORAZ).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
          v_TOOLTIP = (new IDVariant("Visualizza Dati Esistenti mostra i dati generati nelle elaborazioni precedenti ed eventualmente aggiornati manualmente."));
          MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Tipo Elaborazione")).stringValue(),new IDVariant(PAN_PANNELELABOR.bFields(PFL_PANNELELABOR_TIPOELABORAZ).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "PannelloElaboraOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Schemi Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SCHEMIBILANC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schemi Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_SCHEMIBILANC_FONTE)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_FONTE, 0),(new IDVariant("Base Dati"))).equals((new IDVariant("Base Dati")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_PROGR_SESSIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "SchemiBilancioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Schemi Bilancio On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEMIBILANC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCHEMIBILANC);
      // 
      // Schemi Bilancio On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_PROCEDURA_STAMPA, 0)))
      {
        PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_BDAPSCHEMI, IMDBDef13.PQSL_BDAPSCHEMI_FONTE, 0),(new IDVariant("Base Dati"))).equals((new IDVariant("Base Dati")), true))
        {
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_SCHEMIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "SchemiBilancioOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Controllo Errori Quadratura
  // **********************************************************************
  public IDVariant ControlloErroriQuadratura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STAMPACAPTIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STAMPACAPTIO = (new IDVariant("Controlli Quadratura BDAP Rendiconto", IDVariant.STRING));
      // 
      // Controllo Errori Quadratura Body
      // Procedure Body
      // 
      v_STAMPACAPTIO = new IDVariant(v_STAMPACAPTIO);
      // 
      // se trovo qualche record si è verificato un errore
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, (new IDVariant()));
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneBDAP", "ControlloErroriQuadratura", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GESTIONEBDAP_PARAM178() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM178_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM164, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM164, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM178_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM178_RS, 0, IMDBDef4.TBL_PARAM164, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM178_RS, 0, 0, IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARATIPOELAB, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM178_RS, 1, 0, IMDBDef4.TBL_PARAM164, IMDBDef4.FLD_PARAM164_PARAPROGBDAP, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM164, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM164, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM164, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM178_RS, 0);
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
  private void PAN_PANNELELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELELABOR, Cancel);
    // Stub
  }

  private void PAN_PANNELELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELELABOR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PANNELELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PANNELELABOR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCHEMIBILANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEMIBILANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEMIBILANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEMIBILANC, Cancel);
    // Stub
  }

  private void PAN_SCHEMIBILANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEMIBILANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SCHEMIBILANC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEMIBILANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEMIBILANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNELELABOR_Init()
  {

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, "C316A932-B334-43F3-A754-465F6F3BBC25");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, "Tipo");
    PAN_PANNELELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, "");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.VIS_NORMALFIELDS);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "3CAF11EC-9811-4D64-BE52-353B48A01C77");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "Tipo Elaborazione");
    PAN_PANNELELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.VIS_OPTIONBUTTON);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, "2311D09B-9154-4E91-BE81-C609FD6D0510");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, "Elabora");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANNELELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_LIST, 108);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_LIST, "Tipo");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_FORM, 20, 16, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_FORM, 32);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_PROGRESSBDAP, MyGlb.PANEL_FORM, "Tipo");
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_PROGRESSBDAP, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_PROGRESSBDAP, PPQRY_PARAM178, "A.PARAPROGBDAP", "PARAPROGBDAP", 3, 10, 0, -13997);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 108);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, "Tipo Elaborazione");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 268, 16, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 108);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, "Tipo Elaborazione");
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_TIPOELABORAZ, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_TIPOELABORAZ, PPQRY_PARAM178, "A.PARATIPOELAB", "PARATIPOELAB", 5, 3, 0, -13997);
    PAN_PANNELELABOR.SetValueListItem(PFL_PANNELELABOR_TIPOELABORAZ, (new IDVariant("G")), "Generazione Dati", "", "", -1);
    PAN_PANNELELABOR.SetValueListItem(PFL_PANNELELABOR_TIPOELABORAZ, (new IDVariant("V")), "Visualizza e Modifica Dati", "", "", -1);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 376, 172, 76, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 628, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_ETICHEELABOR, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PANNELELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPIBDAPPROG, ");
    SQL.append("  A.TIPO_BDAP as TIPTIPTIPBDA, ");
    SQL.append("  A.DESCRIZIONE as TIPIBDAPDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_BDAP A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGBDAP~~) ");
    SQL.append("and   (NVL(~~TBL_PARAM164.PARAMCFACE~~, 'NO') <> 'SI' OR SUBSTR(A.TIPO_BDAP, 1, 4) <> 'PREV') ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_PANNELELABOR.SetQuery(PPQRY_TIPIBDAP, 0, SQL, PFL_PANNELELABOR_PROGRESSBDAP, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPIBDAPPROG, ");
    SQL.append("  A.TIPO_BDAP as TIPTIPTIPBDA, ");
    SQL.append("  A.DESCRIZIONE as TIPIBDAPDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_BDAP A ");
    SQL.append("where (NVL(~~TBL_PARAM164.PARAMCFACE~~, 'NO') <> 'SI' OR SUBSTR(A.TIPO_BDAP, 1, 4) <> 'PREV') ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_PANNELELABOR.SetQuery(PPQRY_TIPIBDAP, 1, SQL, PFL_PANNELELABOR_PROGRESSBDAP, "");
    PAN_PANNELELABOR.SetQueryDB(PPQRY_TIPIBDAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANNELELABOR.SetIMDB(IMDB, "PQRY_PARAM178", true);
    PAN_PANNELELABOR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PANNELELABOR.SetQueryIMDB(PPQRY_PARAM178, IMDBDef13.PQRY_PARAM178_RS, IMDBDef4.TBL_PARAM164);
    JustLoaded = true;
    PAN_PANNELELABOR.SetFieldPrimaryIndex(PFL_PANNELELABOR_PROGRESSBDAP, IMDBDef4.FLD_PARAM164_PARAPROGBDAP);
    PAN_PANNELELABOR.SetFieldPrimaryIndex(PFL_PANNELELABOR_TIPOELABORAZ, IMDBDef4.FLD_PARAM164_PARATIPOELAB);
    PAN_PANNELELABOR.SetMasterTable(0, "PARAM164");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PANNELELABOR.iUseListQBE;
      PAN_PANNELELABOR.iUseListQBE = 0;
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELELABOR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SCHEMIBILANC_Init()
  {

    PAN_SCHEMIBILANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEMIBILANC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEMIBILANC.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, "786A71BF-60CE-41D6-AB67-4FC4ADCD5B0F");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, "PROGRESSIVO");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, "4A7653B3-24B7-426E-B460-5B1A742CA568");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, "Descrizione");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, "278D4D89-C762-446D-AB1D-F590484954A5");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, "Data Ultima Elaborazione");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, "181EF5DA-79B7-424A-BFCF-1A350AB981C5");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, "Fonte");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, "FDEF7526-530C-409B-9B27-30B5DADF8CD2");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, "Stampa Salvata");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, "93DEE742-6006-483C-BA1D-55998956342F");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, "TIPO BDAP");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, "2E50FC82-C22D-4DEE-9EC7-3BEA7EE6E2FF");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, "SCHEMA BILANCIO");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, 0, -1);
    PAN_SCHEMIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, "7C733046-C650-4BEF-B3A5-0C33C0D431B2");
    PAN_SCHEMIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, "PROCEDURA STAMPA");
    PAN_SCHEMIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, "");
    PAN_SCHEMIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCHEMIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEMIBILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_PROGRESSIVO, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_PROGRESSIVO, PPQRY_BDAPSCHEMI, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 500, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_DESCRIZIONE, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_DESCRIZIONE, PPQRY_BDAPSCHEMI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_LIST, 500, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_LIST, 108);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_LIST, "Data Ultima Elaborazione");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_FORM, 4, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_FORM, 128);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_DATARICALCOL, MyGlb.PANEL_FORM, "Dt. Ult. Elaborazione");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_DATARICALCOL, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_DATARICALCOL, PPQRY_BDAPSCHEMI, "A.DATA_RICALCOLO", "DATA_RICALCOLO", 8, 19, 0, -13997);
    PAN_SCHEMIBILANC.set_Mask(PFL_SCHEMIBILANC_DATARICALCOL, "dd/mm/yyyy hh:nn");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_LIST, 624, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_LIST, 44);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_LIST, "Fonte");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_FORM, 4, 172, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_FORM, 44);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_FONTE, MyGlb.PANEL_FORM, "Fonte");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_FONTE, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_FONTE, PPQRY_BDAPSCHEMI, "A.FONTE", "FONTE", 5, 20, 0, -13997);
    PAN_SCHEMIBILANC.SetValueListItem(PFL_SCHEMIBILANC_FONTE, (new IDVariant("Base Dati")), "Base Dati", "", "", -1);
    PAN_SCHEMIBILANC.SetValueListItem(PFL_SCHEMIBILANC_FONTE, (new IDVariant("Stampa Salvata")), "Stampa Salvata", "", "", -1);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_LIST, 732, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_LIST, 104);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_LIST, "Stampa Salvata");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_FORM, 4, 196, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_FORM, 104);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROGRSESSION, MyGlb.PANEL_FORM, "Stampa Salvata");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_PROGRSESSION, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_PROGRSESSION, PPQRY_BDAPSCHEMI, "A.PROGR_SESSIONE", "PROGR_SESSIONE", 3, 10, 0, -13997);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_LIST, 68);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_LIST, "TIPO BDAP");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_FORM, 4, 172, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_FORM, 68);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_TIPOBDAP, MyGlb.PANEL_FORM, "TIPO BDAP");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_TIPOBDAP, -1, -1);
    PAN_SCHEMIBILANC.SetFieldUnbound(PFL_SCHEMIBILANC_TIPOBDAP, true);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_TIPOBDAP, PPQRY_BDAPSCHEMI, "B.TIPO_BDAP", "BDASCHTITIBD", 5, 20, 0, -13997);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_LIST, 624, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_LIST, 112);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_LIST, "SCHEMA BILANCIO");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_FORM, 4, 172, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_FORM, 112);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_SCHEMABILANC, MyGlb.PANEL_FORM, "SCHEMA BILANCIO");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_SCHEMABILANC, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_SCHEMABILANC, PPQRY_BDAPSCHEMI, "A.SCHEMA_BILANCIO", "SCHEMA_BILANCIO", 5, 100, 0, -13997);
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_LIST, 952, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_LIST, 128);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_LIST, "PROCEDURA STAMPA");
    PAN_SCHEMIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_FORM, 4, 220, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEMIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_FORM, 128);
    PAN_SCHEMIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEMIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEMIBILANC_PROCEDSTAMPA, MyGlb.PANEL_FORM, "PROCEDURA STAMPA");
    PAN_SCHEMIBILANC.SetFieldPage(PFL_SCHEMIBILANC_PROCEDSTAMPA, -1, -1);
    PAN_SCHEMIBILANC.SetFieldPanel(PFL_SCHEMIBILANC_PROCEDSTAMPA, PPQRY_BDAPSCHEMI, "A.PROCEDURA_STAMPA", "PROCEDURA_STAMPA", 5, 50, 0, -13997);
  }

  private void PAN_SCHEMIBILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEMIBILANC.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A ");
    SQL.append("where (A.PROGR_SESSIONE = ~~PROGR_SESSIONE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = DECODE(~~PQRY_PARAM178.PARAPROGBDAP~~, 1, 'BIL_PREVENTIVO', 'BIL_CONSUNTIVO')) ");
    SQL.append("and   (A.PROCEDURA_STAMPA = ~~PROCEDURA_STAMPA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_STAMPESALVAT, 0, SQL, PFL_SCHEMIBILANC_PROGRSESSION, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = DECODE(~~PQRY_PARAM178.PARAPROGBDAP~~, 1, 'BIL_PREVENTIVO', 'BIL_CONSUNTIVO')) ");
    SQL.append("and   (A.PROCEDURA_STAMPA = ~~PROCEDURA_STAMPA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_STAMPESALVAT, 1, SQL, PFL_SCHEMIBILANC_PROGRSESSION, "");
    PAN_SCHEMIBILANC.SetQueryDB(PPQRY_STAMPESALVAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEMIBILANC.SetIMDB(IMDB, "PQRY_BDAPSCHEMI", true);
    PAN_SCHEMIBILANC.set_SetString(MyGlb.MASTER_ROWNAME, "BDAP SCHEMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ORDINAMENTO as ORDINAMENTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DATA_RICALCOLO as DATA_RICALCOLO, ");
    SQL.append("  B.TIPO_BDAP as BDASCHTITIBD, ");
    SQL.append("  A.SCHEMA_BILANCIO as SCHEMA_BILANCIO, ");
    SQL.append("  A.FONTE as FONTE, ");
    SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE, ");
    SQL.append("  A.PROCEDURA_STAMPA as PROCEDURA_STAMPA ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BDAP_SCHEMI A, ");
    SQL.append("  TIPI_BDAP B ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.PROGRESSIVO = ~~PQRY_PARAM178.PARAPROGBDAP~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_BDAP = B.TIPO_BDAP) ");
    SQL.append("and   ((NVL(" + IDL.CSql(MainFrm.ECOSTANDALON, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') <> 'SI' AND NVL(" + IDL.CSql(MainFrm.SIBEC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') <> 'SI' AND (A.TIPO_SCHEMA IS NULL)) OR (NVL(" + IDL.CSql(MainFrm.GESTCONTECON, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'SI' AND (A.TIPO_SCHEMA = 'E' OR ((TRUNC(TO_NUMBER(" + IDL.CSql(MainFrm.PRIESECONECO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND NOT ((A.TIPO_SCHEMA IS NULL)))))) ");
    SQL.append("and   (NOT ((A.PROCEDURA IS NULL))) ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_SCHEMIBILANC.SetQuery(PPQRY_BDAPSCHEMI, 5, SQL, -1, "");
    PAN_SCHEMIBILANC.SetQueryDB(PPQRY_BDAPSCHEMI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEMIBILANC.SetMasterTable(0, "BDAP_SCHEMI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEMIBILANC.Status() == 2)
    {
      int oldListQBE = PAN_SCHEMIBILANC.iUseListQBE;
      PAN_SCHEMIBILANC.iUseListQBE = 0;
      PAN_SCHEMIBILANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEMIBILANC.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEMIBILANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SCHEMIBILANC) PAN_SCHEMIBILANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateRow(Cancel);
    if (SrcObj == PAN_SCHEMIBILANC) PAN_SCHEMIBILANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_DynamicProperties();
    if (SrcObj == PAN_SCHEMIBILANC) PAN_SCHEMIBILANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SCHEMIBILANC) PAN_SCHEMIBILANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SCHEMIBILANC) PAN_SCHEMIBILANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
