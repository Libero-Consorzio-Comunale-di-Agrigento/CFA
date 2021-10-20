// **********************************************
// Elenco Proposte Modificate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoProposteModificate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRIELE_IMPESUBIOACC = 0;
  private static int PFL_PARAMETRIELE_PERIODORIACC = 1;
  private static int PFL_PARAMETRIELE_ESERCIZIORIF = 2;
  private static int PFL_PARAMETRIELE_PERIODO = 3;

  private static int PPQRY_PARAMETRIEL2 = 0;

  private static int PPQRY_PERIODRIACCE = 1;


  IDPanel PAN_PARAMETRIELE;
  private static int PFL_ELENPROPMODI_NUMEROIMPACC = 0;
  private static int PFL_ELENPROPMODI_ANNOIMPACC = 1;
  private static int PFL_ELENPROPMODI_NUMEROSUBIMP = 2;
  private static int PFL_ELENPROPMODI_ANNOSUBIMP = 3;
  private static int PFL_ELENPROPMODI_ANNOESIGIBIL = 4;
  private static int PFL_ELENPROPMODI_ANNOENTRATA = 5;
  private static int PFL_ELENPROPMODI_IMPORTOUFF = 6;
  private static int PFL_ELENPROPMODI_NOTEUFF = 7;
  private static int PFL_ELENPROPMODI_IMPORTORAG = 8;
  private static int PFL_ELENPROPMODI_NOTERAG = 9;
  private static int PFL_ELENPROPMODI_ETICHIMPEACC = 10;
  private static int PFL_ELENPROPMODI_ETICHESUBIMP = 11;

  private static int PPQRY_PROPOSTRIACC = 0;


  IDPanel PAN_ELENPROPMODI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIEL3(IMDB);
    //
    //
    Init_PQRY_PARAMETRIEL2(IMDB);
    Init_PQRY_PARAMETRIEL2_RS(IMDB);
    Init_PQRY_PROPOSTRIACC(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIEL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIEL3, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIEL3, "TBL_PARAMETRIEL3");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_NOMOGIMSUOAC, "NOMOGIMSUOAC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_NOMOGIMSUOAC,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIEL3,IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF,1,9,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIEL3, 0);
  }

  private static void Init_PQRY_PARAMETRIEL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRIEL2, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRIEL2, "PQRY_PARAMETRIEL2");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC, "NOMOGIMSUOAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF,1,9,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRIEL2, 0);
  }

  private static void Init_PQRY_PARAMETRIEL2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRIEL2_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRIEL2_RS, "PQRY_PARAMETRIEL2_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC, "NOMOGIMSUOAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL2_RS,IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF,1,9,0);
  }

  private static void Init_PQRY_PROPOSTRIACC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PROPOSTRIACC, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_PROPOSTRIACC, "PQRY_PROPOSTRIACC");
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANIM, "RECPRORIANIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINUIM, "RECPRORINUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANSU, "RECPRORIANSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANSU,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINUSU, "RECPRORINUSU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINUSU,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANES, "RECPRORIANES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANES,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANEN, "RECPRORIANEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIANEN,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIIMUF, "RECPRORIIMUF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIIMUF,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINOUF, "RECPRORINOUF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINOUF,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIIMRA, "RECPRORIIMRA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORIIMRA,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINORA, "RECPRORINORA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIACC,IMDBDef14.PQSL_PROPOSTRIACC_RECPRORINORA,5,2000,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PROPOSTRIACC, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoProposteModificate(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoProposteModificate()
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
    FormIdx = MyGlb.FRM_ELENPROPMODI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "747CC0EC-2266-42D0-A51E-2AD3DD9CA5FE";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 848;
    DesignHeight = 678;
    set_Caption(new IDVariant("Proposte Modificate da Ragioneria"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 848;
    Frames[1].Height = 652;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0736196;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 848;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametrieleprm";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARAMETRIELE = new IDPanel(w, this, 2, "PAN_PARAMETRIELE");
    Frames[2].Content = PAN_PARAMETRIELE;
    PAN_PARAMETRIELE.Lockable = false;
    PAN_PARAMETRIELE.iLocked = false;
    PAN_PARAMETRIELE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRIELE.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4C9119F5-12BB-48C9-83A7-0AF3072719F8");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 628, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRIELE.InitStatus = 2;
    PAN_PARAMETRIELE_Init();
    PAN_PARAMETRIELE_InitFields();
    PAN_PARAMETRIELE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 848;
    Frames[3].Height = 604;
    Frames[3].Caption = "Elenco Proposte Modificate";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 604;
    PAN_ELENPROPMODI = new IDPanel(w, this, 3, "PAN_ELENPROPMODI");
    Frames[3].Content = PAN_ELENPROPMODI;
    PAN_ELENPROPMODI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENPROPMODI.VS = MainFrm.VisualStyleList;
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 604-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FE179C1F-8762-4340-98EE-35F8AEDB19D7");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1100, 496, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENPROPMODI.InitStatus = 2;
    PAN_ELENPROPMODI_Init();
    PAN_ELENPROPMODI_InitFields();
    PAN_ELENPROPMODI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRIEL3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENPROPMODI_PARAMETRIEL2();
      }
      PAN_PARAMETRIELE.UpdatePanel(MainFrm);
      PAN_ELENPROPMODI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRIELE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRIELE_PERIODO) {
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
    return (obj instanceof ElencoProposteModificate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoProposteModificate.class.getName() : (Glb.ClassWithPackage(ElencoProposteModificate.class) ? ElencoProposteModificate.class.getName().substring(ElencoProposteModificate.class.getPackage().getName().length() + 1) : ElencoProposteModificate.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametrieleprm On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRIELE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametrieleprm On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRIELE_IMPESUBIOACC)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC, 0).equals((new IDVariant("E")), true))
        {
          PAN_ELENPROPMODI.set_FieldText(PFL_ELENPROPMODI_ETICHIMPEACC, (new IDVariant("Accertamento")).stringValue());
        }
        else
        {
          PAN_ELENPROPMODI.set_FieldText(PFL_ELENPROPMODI_ETICHIMPEACC, (new IDVariant("Impegno")).stringValue());
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRIELE_PERIODORIACC)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_CODICE, 0))))
        {
          IDVariant v_VPERIRIACTIP = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as PERIRIACTIPO ");
          SQL.append("from ");
          SQL.append("  PERIODI_RIACCERTAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VPERIRIACTIP = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VPERIRIACTIP.equals((new IDVariant("CONS")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "ParametrieleprmOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Periodo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Periodo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Periodo Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "Periodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_CODICE, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "EndModal", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametrieleprm: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_NOMOGIMSUOAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_CODICE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF, 0, new IDVariant());
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCODICEPERIO = null;
      v_VCODICEPERIO = (new IDVariant());
      IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VANNO = null;
      v_VANNO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MAX(A.CODICE) as MAXPERRIACOD, ");
      SQL.append("  CASE WHEN A.TIPO = 'CONS' THEN TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) - 1 ELSE TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) END as IFPERTCYT1YT, ");
      SQL.append("  MAX(CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END) as MIINPRFDEIPR ");
      SQL.append("from ");
      SQL.append("  PERIODI_RIACCERTAMENTI A ");
      SQL.append("where ((TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
      SQL.append("group by ");
      SQL.append("  CASE WHEN A.TIPO = 'CONS' THEN TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) - 1 ELSE TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) END ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_VCODICEPERIO = QV.Get("MAXPERRIACOD", IDVariant.INTEGER) ;
        v_VANNO = QV.Get("IFPERTCYT1YT", IDVariant.INTEGER) ;
        v_VPERRIAFILDI = QV.Get("MIINPRFDEIPR", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_CODICE, 0, new IDVariant(v_VCODICEPERIO));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF, 0, new IDVariant(v_VANNO));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "Load", _e);
    }
  }

  // **********************************************************************
  // Elenco Proposte Modificate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENPROPMODI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENPROPMODI);
      // 
      // Elenco Proposte Modificate On Dynamic Properties Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "ElencoProposteModificateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Elenco Proposte Modificate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_ELENPROPMODI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Proposte Modificate After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL2, IMDBDef14.PQSL_PARAMETRIEL2_NOMOGIMSUOAC, 0).equals((new IDVariant("E")), true))
      {
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENPROPMODI.SetFlags (Glb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteModificate", "ElencoProposteModificateAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametrieleprm
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENPROPMODI_PARAMETRIEL2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRIEL2_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRIEL3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRIEL3, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRIEL2_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRIEL2_RS, 0, IMDBDef5.TBL_PARAMETRIEL3, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL2_RS, 0, 0, IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_NOMOGIMSUOAC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL2_RS, 1, 0, IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_CODICE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL2_RS, 2, 0, IMDBDef5.TBL_PARAMETRIEL3, IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRIEL3, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRIEL3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRIEL3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRIEL2_RS, 0);
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
  private void PAN_PARAMETRIELE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRIELE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRIELE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRIELE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRIELE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRIELE);
    // Stub
  }

  private void PAN_PARAMETRIELE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRIELE_PERIODO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRIELE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Periodo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRIELE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRIELE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRIELE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRIELE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENPROPMODI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENPROPMODI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENPROPMODI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENPROPMODI, Cancel);
    // Stub
  }

  private void PAN_ELENPROPMODI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENPROPMODI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENPROPMODI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENPROPMODI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRIELE_Init()
  {

    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, "7E0C5547-733B-4996-BE39-A5180A8CB21F");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, "Tipo Proposte");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "7A7B67EF-492F-4E50-9BDE-724F499BBAAB");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "Periodo Riacc.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "8500B642-15FE-4FF8-AAA4-4BDBFF71B2AF");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "Esercizio Rif.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "1719CB10-C482-4D14-B8A4-C6F4B33CD7F8");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "Periodo Riacc.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRIELE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_LIST, 216);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_LIST, "Tipo Proposte");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_FORM, 12, 12, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPESUBIOACC, MyGlb.PANEL_FORM, "Tipo Proposte");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_IMPESUBIOACC, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_IMPESUBIOACC, PPQRY_PARAMETRIEL2, "A.NOMOGIMSUOAC", "NOMOGIMSUOAC", 5, 1, 0, -13997);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_IMPESUBIOACC, (new IDVariant("E")), "Accertamenti", "", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_IMPESUBIOACC, (new IDVariant("S")), "Impegni/SubImpegni", "", "", -1);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, "Per. Riacc");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_PERIODORIACC, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_PERIODORIACC, PPQRY_PARAMETRIEL2, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 700, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_ESERCIZIORIF, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_ESERCIZIORIF, PPQRY_PARAMETRIEL2, "A.NOMOGGESERIF", "NOMOGGESERIF", 1, 9, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 236);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 336, 12, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_PERIODO, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_PERIODO, PPQRY_PERIODRIACCE, "A.DESCRIZIONE", "PERIRIACDESC", 5, 100, 0, -13997);
  }

  private void PAN_PARAMETRIELE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PERIRIACDESC ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~CODICE~~) ");
    PAN_PARAMETRIELE.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    PAN_PARAMETRIELE.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRIELE.SetMasterTable(PPQRY_PERIODRIACCE, "PERIODI_RIACCERTAMENTI");
    PAN_PARAMETRIELE.SetIMDB(IMDB, "PQRY_PARAMETRIEL2", true);
    PAN_PARAMETRIELE.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRIELE.SetQueryIMDB(PPQRY_PARAMETRIEL2, IMDBDef14.PQRY_PARAMETRIEL2_RS, IMDBDef5.TBL_PARAMETRIEL3);
    JustLoaded = true;
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_IMPESUBIOACC, IMDBDef5.FLD_PARAMETRIEL3_NOMOGIMSUOAC);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_PERIODORIACC, IMDBDef5.FLD_PARAMETRIEL3_CODICE);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_ESERCIZIORIF, IMDBDef5.FLD_PARAMETRIEL3_NOMOGGESERIF);
    PAN_PARAMETRIELE.SetMasterTable(0, "PARAMETRIEL3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRIELE.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRIELE.iUseListQBE;
      PAN_PARAMETRIELE.iUseListQBE = 0;
      PAN_PARAMETRIELE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRIELE.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRIELE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ELENPROPMODI_Init()
  {

    PAN_ELENPROPMODI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENPROPMODI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENPROPMODI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, "A5E586F1-7364-4305-98E0-4AF433F22673");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, "NUMERO IMPACC");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, "8633BCB4-C645-435E-9D39-1E9E5E85613B");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, "ANNO IMPACC");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, "1F917384-4CA1-4D36-9524-B22351792DEA");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, "EF1B3D73-B1A0-45B0-A657-ADCACF9EF0C4");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, "66223EB6-FC89-43FE-99AA-F272154691B7");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, "9887A737-FD14-4C1F-B287-B65CA9E690AF");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, "Anno Entrata");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, "4876B4A4-BDA8-4AB4-860E-BCA5EF5E309E");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, "Importo Ufficio");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, "B6BE442F-2D7D-47F4-82E6-24AFA9726606");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, "Note Ufficio");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, "89050FCC-6930-49EF-9426-27721B606BD3");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, "Importo Ragioneria");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, "AA7B6055-BCC2-4808-933D-10D17D625DBE");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, "Note Ragioneria");
    PAN_ELENPROPMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, "");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, "065AC97B-8224-4C54-8183-9032609A228D");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, "Impegno");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENPROPMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, "D2C0E7BF-CB6F-46D7-B8DE-A911B9530D06");
    PAN_ELENPROPMODI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, "SubImpegno");
    PAN_ELENPROPMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENPROPMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENPROPMODI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_LIST, "NUM. IMP.");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_FORM, 104);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROIMPACC, MyGlb.PANEL_FORM, "NUMERO IMPACC");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_NUMEROIMPACC, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_NUMEROIMPACC, PPQRY_PROPOSTRIACC, "A.NUMERO_IMPACC", "RECPRORINUIM", 1, 5, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_LIST, 40, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_LIST, "ANN. IMP.");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_FORM, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOIMPACC, MyGlb.PANEL_FORM, "ANNO IMPACC");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ANNOIMPACC, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ANNOIMPACC, PPQRY_PROPOSTRIACC, "A.ANNO_IMPACC", "RECPRORIANIM", 1, 4, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 76, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 76, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMP");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_NUMEROSUBIMP, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_NUMEROSUBIMP, PPQRY_PROPOSTRIACC, "A.NUMERO_SUBIMP", "RECPRORINUSU", 1, 5, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_LIST, 116, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_FORM, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANNO SUBIMP");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ANNOSUBIMP, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ANNOSUBIMP, PPQRY_PROPOSTRIACC, "A.ANNO_SUBIMP", "RECPRORIANSU", 1, 4, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 152, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 100, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ANNOESIGIBIL, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ANNOESIGIBIL, PPQRY_PROPOSTRIACC, "A.ANNO_ESIGIBILITA", "RECPRORIANES", 1, 4, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_LIST, 216, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ANNOENTRATA, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ANNOENTRATA, PPQRY_PROPOSTRIACC, "A.ANNO_ENTRATA", "RECPRORIANEN", 1, 4, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_LIST, 284, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_LIST, 84);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_LIST, "Importo Ufficio");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_FORM, 84);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTOUFF, MyGlb.PANEL_FORM, "Imp. Ufficio");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_IMPORTOUFF, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_IMPORTOUFF, PPQRY_PROPOSTRIACC, "A.IMPORTO_UFF", "RECPRORIIMUF", 3, 14, 2, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_LIST, 416, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_LIST, 60);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_LIST, "Note Ufficio");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_FORM, 4, 172, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_FORM, 60);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_FORM, 2);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTEUFF, MyGlb.PANEL_FORM, "Note Ufficio");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_NOTEUFF, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_NOTEUFF, PPQRY_PROPOSTRIACC, "A.NOTE_UFF", "RECPRORINOUF", 5, 2000, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_LIST, 692, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_LIST, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_LIST, "Importo Ragioneria");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_FORM, 88);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_IMPORTORAG, MyGlb.PANEL_FORM, "Imp. Ragion.");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_IMPORTORAG, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_IMPORTORAG, PPQRY_PROPOSTRIACC, "A.IMPORTO_RAG", "RECPRORIIMRA", 3, 14, 2, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_LIST, 824, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_LIST, 64);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_LIST, 1);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_LIST, "Note Ragioneria");
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_FORM, 4, 244, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_FORM, 64);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_FORM, 2);
    PAN_ELENPROPMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_NOTERAG, MyGlb.PANEL_FORM, "Nt. Ragion.");
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_NOTERAG, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_NOTERAG, PPQRY_PROPOSTRIACC, "A.NOTE_RAG", "RECPRORINORA", 5, 2000, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_LIST, 0, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_LIST, 0);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_LIST, 2);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_FORM, 84, 508, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_FORM, 0);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHIMPEACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ETICHIMPEACC, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ETICHIMPEACC, -1, "", "ETICHIMPEACC", 0, 0, 0, -13997);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_LIST, 76, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_ELENPROPMODI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_FORM, 76, 500, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENPROPMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_ELENPROPMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENPROPMODI_ETICHESUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENPROPMODI.SetFieldPage(PFL_ELENPROPMODI_ETICHESUBIMP, -1, -1);
    PAN_ELENPROPMODI.SetFieldPanel(PFL_ELENPROPMODI_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
  }

  private void PAN_ELENPROPMODI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENPROPMODI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENPROPMODI.SetIMDB(IMDB, "PQRY_PROPOSTRIACC", true);
    PAN_ELENPROPMODI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_IMPACC as RECPRORIANIM, ");
    SQL.append("  A.NUMERO_IMPACC as RECPRORINUIM, ");
    SQL.append("  A.ANNO_SUBIMP as RECPRORIANSU, ");
    SQL.append("  A.NUMERO_SUBIMP as RECPRORINUSU, ");
    SQL.append("  A.ANNO_ESIGIBILITA as RECPRORIANES, ");
    SQL.append("  A.ANNO_ENTRATA as RECPRORIANEN, ");
    SQL.append("  A.IMPORTO_UFF as RECPRORIIMUF, ");
    SQL.append("  A.NOTE_UFF as RECPRORINOUF, ");
    SQL.append("  A.IMPORTO_RAG as RECPRORIIMRA, ");
    SQL.append("  A.NOTE_RAG as RECPRORINORA ");
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC A ");
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRIEL2.NOMOGGESERIF~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAMETRIEL2.NOMOGIMSUOAC~~) ");
    SQL.append("and   (A.PERIODO_RIACC = ~~PQRY_PARAMETRIEL2.CODICE~~) ");
    SQL.append("and   (NOT ((A.IMPORTO_RAG IS NULL))) ");
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP ");
    PAN_ELENPROPMODI.SetQuery(PPQRY_PROPOSTRIACC, 5, SQL, -1, "");
    PAN_ELENPROPMODI.SetQueryDB(PPQRY_PROPOSTRIACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENPROPMODI.SetMasterTable(0, "PROPOSTE_RIACC");
    PAN_ELENPROPMODI.AddToSortList(PFL_ELENPROPMODI_ANNOIMPACC, true);
    PAN_ELENPROPMODI.AddToSortList(PFL_ELENPROPMODI_NUMEROIMPACC, true);
    PAN_ELENPROPMODI.AddToSortList(PFL_ELENPROPMODI_ANNOSUBIMP, true);
    PAN_ELENPROPMODI.AddToSortList(PFL_ELENPROPMODI_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENPROPMODI.Status() == 2)
    {
      int oldListQBE = PAN_ELENPROPMODI.iUseListQBE;
      PAN_ELENPROPMODI.iUseListQBE = 0;
      PAN_ELENPROPMODI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENPROPMODI.PanelCommand(Glb.PCM_FIND);
      PAN_ELENPROPMODI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_DynamicProperties();
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELENPROPMODI) PAN_ELENPROPMODI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
