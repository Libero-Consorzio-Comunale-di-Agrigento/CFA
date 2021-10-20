// **********************************************
// Segnalazioni Rettifa Massiva UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SegnalazioniRettifaMassivaUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SEGNALAZIONI_NUMERODOC = 0;
  private static int PFL_SEGNALAZIONI_DDATADOC = 1;
  private static int PFL_SEGNALAZIONI_DESCRIERRORE = 2;
  private static int PFL_SEGNALAZIONI_OKKO = 3;
  private static int PFL_SEGNALAZIONI_ETICHEDOCUME = 4;
  private static int PFL_SEGNALAZIONI_ETICHETTAOK = 5;
  private static int PFL_SEGNALAZIONI_ETILABFATELA = 6;

  private static int PPQRY_ERRORETMASU1 = 0;


  IDPanel PAN_SEGNALAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_QRY_CFASELINTVA5(IMDB);
    Init_QRY_CFASELINTVA6(IMDB);
    Init_PQRY_ERRORETMASU1(IMDB);
    Init_PQRY_ERRORETMASU1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_QRY_CFASELINTVA5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTVA5, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTVA5, "QRY_CFASELINTVA5");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTVA5,IMDBDef10.QSL_CFASELINTVA5_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTVA5,IMDBDef10.QSL_CFASELINTVA5_COUNT,1,19,0);
  }

  private static void Init_QRY_CFASELINTVA6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTVA6, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTVA6, "QRY_CFASELINTVA6");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTVA6,IMDBDef10.QSL_CFASELINTVA6_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTVA6,IMDBDef10.QSL_CFASELINTVA6_COUNT,1,19,0);
  }

  private static void Init_PQRY_ERRORETMASU1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_ERRORETMASU1, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_ERRORETMASU1, "PQRY_ERRORETMASU1");
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERRORNUMEDOC, "ERRORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERRORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERRODDATADOC, "ERRODDATADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERRODDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERROREOKKO, "ERROREOKKO");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_ERROREOKKO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_DESCRIERRORE, "DESCRIERRORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1,IMDBDef10.PQSL_ERRORETMASU1_DESCRIERRORE,9,512,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_ERRORETMASU1, 0);
  }

  private static void Init_PQRY_ERRORETMASU1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_ERRORETMASU1_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_ERRORETMASU1_RS, "PQRY_ERRORETMASU1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERRORNUMEDOC, "ERRORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERRORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERRODDATADOC, "ERRODDATADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERRODDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERROREOKKO, "ERROREOKKO");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_ERROREOKKO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_DESCRIERRORE, "DESCRIERRORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_ERRORETMASU1_RS,IMDBDef10.PQSL_ERRORETMASU1_DESCRIERRORE,9,512,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SegnalazioniRettifaMassivaUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SegnalazioniRettifaMassivaUO()
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
    FormIdx = MyGlb.FRM_SEGNRETMASU1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D037033B-3723-418C-AF86-AAE3169E1455";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2113;
    DesignWidth = 664;
    DesignHeight = 398;
    set_Caption(new IDVariant("Segnalazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 664;
    Frames[1].Height = 372;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Segnalazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_SEGNALAZIONI = new IDPanel(w, this, 1, "PAN_SEGNALAZIONI");
    Frames[1].Content = PAN_SEGNALAZIONI;
    PAN_SEGNALAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SEGNALAZIONI.VS = MainFrm.VisualStyleList;
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 664-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "71E2B547-2EBC-40D9-8605-FA4D07338C84");
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 604, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SEGNALAZIONI.InitStatus = 2;
    PAN_SEGNALAZIONI_Init();
    PAN_SEGNALAZIONI_InitFields();
    PAN_SEGNALAZIONI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_ERRORETMASUO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SEGNRETMASU1_ERRORETMASU1();
      }
      PAN_SEGNALAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof SegnalazioniRettifaMassivaUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SegnalazioniRettifaMassivaUO.class.getName() : (Glb.ClassWithPackage(SegnalazioniRettifaMassivaUO.class) ? SegnalazioniRettifaMassivaUO.class.getName().substring(SegnalazioniRettifaMassivaUO.class.getPackage().getName().length() + 1) : SegnalazioniRettifaMassivaUO.class.getName()));
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      IDVariant v_VCOUNTELAB = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCOUNTNONELA = new IDVariant(0,IDVariant.INTEGER);
      LOAD_CFASELINTVA5();
      if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTVA5, 0))
      {
        v_VCOUNTELAB = IMDB.Value(IMDBDef10.QRY_CFASELINTVA5, IMDBDef10.QSL_CFASELINTVA5_COUNT, 0, IDVariant.INTEGER) ;
      }
      LOAD_CFASELINTVA6();
      if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTVA6, 0))
      {
        v_VCOUNTNONELA = IMDB.Value(IMDBDef10.QRY_CFASELINTVA6, IMDBDef10.QSL_CFASELINTVA6_COUNT, 0, IDVariant.INTEGER) ;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant(" FATTURE ELABORATE CON SUCCESSO, "));
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant(" FATTURE NON ELABORATE"));
      PAN_SEGNALAZIONI.set_FieldText(PFL_SEGNALAZIONI_ETILABFATELA, IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_VCOUNTELAB), S), IDL.ToString(v_VCOUNTNONELA)), v_S1).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SegnalazioniRettifaMassivaUO", "Load", _e);
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void LOAD_CFASELINTVA5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTVA5);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO, 0).equals((new IDVariant("OK")), true))
      {
        IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
        IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_ERRORETMASUO, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTVA5, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTVA5, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTVA5, 0);
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void LOAD_CFASELINTVA6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTVA6);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO, 0).compareTo((new IDVariant("OK")), true)!=0)
      {
        IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
        IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_ERRORETMASUO, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTVA6, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTVA6, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTVA6, 0);
  }

  // **********************************************************************
  // Segnalazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SEGNALAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SEGNALAZIONI);
      // 
      // Segnalazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_ERRORETMASU1, IMDBDef10.PQSL_ERRORETMASU1_ERRORNUMEDOC, 0))))
      {
        if (IMDB.Value(IMDBDef10.PQRY_ERRORETMASU1, IMDBDef10.PQSL_ERRORETMASU1_ERROREOKKO, 0).equals((new IDVariant("KO")), true))
        {
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_NUMERODOC,new IDVariant(MyGlb.VIS_NORFIESFOSER).intValue()); 
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DDATADOC,new IDVariant(MyGlb.VIS_NORFIESFOSER).intValue()); 
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DESCRIERRORE,new IDVariant(MyGlb.VIS_NORFIESFOSER).intValue()); 
        }
        else
        {
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_NUMERODOC,new IDVariant(MyGlb.VIS_NORFIESFSEVE).intValue()); 
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DDATADOC,new IDVariant(MyGlb.VIS_NORFIESFSEVE).intValue()); 
          PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DESCRIERRORE,new IDVariant(MyGlb.VIS_NORFIESFSEVE).intValue()); 
        }
      }
      else
      {
        PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_NUMERODOC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DDATADOC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SEGNALAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DESCRIERRORE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
      PAN_SEGNALAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_SEGNALAZIONI_DESCRIERRORE,(new IDVariant(PAN_SEGNALAZIONI.FieldText(PFL_SEGNALAZIONI_DESCRIERRORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SegnalazioniRettifaMassivaUO", "SegnalazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta OK
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaOK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta OK Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SegnalazioniRettifaMassivaUO", "EtichettaOK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // ERRORI RETT MASS UO
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SEGNRETMASU1_ERRORETMASU1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_ERRORETMASU1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_ERRORETMASU1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_ERRORETMASU1_RS, 0, IMDBDef2.TBL_ERRORETMASUO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_ERRORETMASU1_RS, 0, 0, IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_NUMERO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_ERRORETMASU1_RS, 1, 0, IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_D_DATA_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_ERRORETMASU1_RS, 2, 0, IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_ERRORETMASU1_RS, 3, 0, IMDBDef2.TBL_ERRORETMASUO, IMDBDef2.FLD_ERRORETMASUO_DESCRIERRORE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_ERRORETMASUO, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ERRORETMASUO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ERRORETMASUO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_ERRORETMASU1_RS, 0);
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
  private void PAN_SEGNALAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SEGNALAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SEGNALAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SEGNALAZIONI, Cancel);
    // Stub
  }

  private void PAN_SEGNALAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SEGNALAZIONI_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_SEGNALAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaOK();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SEGNALAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SEGNALAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SEGNALAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SEGNALAZIONI_Init()
  {

    PAN_SEGNALAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SEGNALAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SEGNALAZIONI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, "C529942C-DEA8-439D-9E3D-2EFD34C2F314");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, "Numero Documento");
    PAN_SEGNALAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, "");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.VIS_NORFIESFSEVE);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, "105853F5-E1C4-4211-9551-F425DC9AC3CF");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, "Data Documento");
    PAN_SEGNALAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, "");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.VIS_NORFIESFSEVE);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, "7FD1D6FA-1B70-4C7F-B603-530F90B54467");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, "Descrizione Errore");
    PAN_SEGNALAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, "");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.VIS_NORFIESFSEVE);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, "EEE8DD89-12C2-46E1-9A6A-22440791E358");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, "OK KO");
    PAN_SEGNALAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, "");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.VIS_NORMFIELPADR);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, "D6F47E5E-C9DE-47A5-86B4-A6180A344C5A");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, "Documento");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.VIS_LABEVISUSTYL);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, "D5DA892A-332D-4F36-B008-4D93B61E2BF6");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, "OK");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_SEGNALAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, 0, "button1.gif", false);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SEGNALAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, "BAD2A3E7-EABE-4EEE-A70F-A6B95A4F3AE4");
    PAN_SEGNALAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, "LABEL FATTURE ELAB NON ELAB");
    PAN_SEGNALAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SEGNALAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_SEGNALAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 0, 84, 120, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 3);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 4, 4, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 128);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_NUMERODOC, MyGlb.PANEL_FORM, "Numero Documento");
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_NUMERODOC, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_NUMERODOC, PPQRY_ERRORETMASU1, "A.NUMERO_DOC", "ERRORNUMEDOC", 5, 20, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_LIST, 120, 84, 88, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_LIST, 3);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_LIST, "Data Documento");
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_FORM, 4, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_FORM, 128);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DDATADOC, MyGlb.PANEL_FORM, "Data Documento");
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_DDATADOC, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_DDATADOC, PPQRY_ERRORETMASU1, "A.D_DATA_DOC", "ERRODDATADOC", 6, 10, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_LIST, 208, 84, 396, 48, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_LIST, 128);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_LIST, 3);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_LIST, "Descrizione Errore");
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_FORM, 4, 76, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_FORM, 128);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_FORM, 2);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_DESCRIERRORE, MyGlb.PANEL_FORM, "Descrizione Errore");
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_DESCRIERRORE, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_DESCRIERRORE, PPQRY_ERRORETMASU1, "A.DESCRIERRORE", "DESCRIERRORE", 9, 512, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_LIST, 604, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_LIST, 44);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_LIST, 1);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_LIST, "OK KO");
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_FORM, 128);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_OKKO, MyGlb.PANEL_FORM, "OK KO");
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_OKKO, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_OKKO, PPQRY_ERRORETMASU1, "A.ERROREOKKO", "ERROREOKKO", 5, 2, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_LIST, 0, 48, 208, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_LIST, 2);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_FORM, 0, 164, 212, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_ETICHEDOCUME, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_LIST, 524, 280, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_FORM, 528, 240, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_ETICHETTAOK, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_LIST, 0, 16, 608, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_LIST, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_LIST, 1);
    PAN_SEGNALAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_FORM, 0, 16, 608, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SEGNALAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_FORM, 0);
    PAN_SEGNALAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SEGNALAZIONI_ETILABFATELA, MyGlb.PANEL_FORM, 1);
    PAN_SEGNALAZIONI.SetFieldPage(PFL_SEGNALAZIONI_ETILABFATELA, -1, -1);
    PAN_SEGNALAZIONI.SetFieldPanel(PFL_SEGNALAZIONI_ETILABFATELA, -1, "", "ETILABFATELA", 0, 0, 0, -13997);
  }

  private void PAN_SEGNALAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SEGNALAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SEGNALAZIONI.SetIMDB(IMDB, "PQRY_ERRORETMASU1", true);
    PAN_SEGNALAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Errore");
    PAN_SEGNALAZIONI.SetQueryIMDB(PPQRY_ERRORETMASU1, IMDBDef10.PQRY_ERRORETMASU1_RS, IMDBDef2.TBL_ERRORETMASUO);
    JustLoaded = true;
    PAN_SEGNALAZIONI.SetFieldPrimaryIndex(PFL_SEGNALAZIONI_NUMERODOC, IMDBDef2.FLD_ERRORETMASUO_NUMERO_DOC);
    PAN_SEGNALAZIONI.SetFieldPrimaryIndex(PFL_SEGNALAZIONI_DDATADOC, IMDBDef2.FLD_ERRORETMASUO_D_DATA_DOC);
    PAN_SEGNALAZIONI.SetFieldPrimaryIndex(PFL_SEGNALAZIONI_DESCRIERRORE, IMDBDef2.FLD_ERRORETMASUO_DESCRIERRORE);
    PAN_SEGNALAZIONI.SetFieldPrimaryIndex(PFL_SEGNALAZIONI_OKKO, IMDBDef2.FLD_ERRORETMASUO_ERROREOKKO);
    PAN_SEGNALAZIONI.SetMasterTable(0, "ERRORETMASUO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SEGNALAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_SEGNALAZIONI.iUseListQBE;
      PAN_SEGNALAZIONI.iUseListQBE = 0;
      PAN_SEGNALAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SEGNALAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_SEGNALAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SEGNALAZIONI) PAN_SEGNALAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SEGNALAZIONI) PAN_SEGNALAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SEGNALAZIONI) PAN_SEGNALAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SEGNALAZIONI) PAN_SEGNALAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SEGNALAZIONI) PAN_SEGNALAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
