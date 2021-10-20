// **********************************************
// Conferma I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConfermaIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_CONFERMAIVA_CONFEIVADOCU = 0;

  private static int PFL_CONFERMAIVA_ELABORA = 0;
  private static int PFL_CONFERMAIVA_REGISTRO = 1;
  private static int PFL_CONFERMAIVA_BOLLATO = 2;
  private static int PFL_CONFERMAIVA_ANNO = 3;
  private static int PFL_CONFERMAIVA_REGISTLIQUID = 4;
  private static int PFL_CONFERMAIVA_PERIODOLABEL = 5;
  private static int PFL_CONFERMAIVA_TIPOBOLLATO = 6;
  private static int PFL_CONFERMAIVA_PERIODO = 7;
  private static int PFL_CONFERMAIVA_ETICHETTA = 8;

  private static int PPQRY_NUMERAZIOIV2 = 0;

  private static int PPQRY_TIPOBOLLATO = 1;


  IDPanel PAN_CONFERMAIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NUMERAZIOIVA(IMDB);
    //
    //
    Init_PQRY_NUMERAZIOIV2(IMDB);
    Init_PQRY_NUMERAZIOIV2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NUMERAZIOIVA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NUMERAZIOIVA, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_NUMERAZIOIVA, "TBL_NUMERAZIOIVA");
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMREGLIQ, "ROWNAMREGLIQ");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMREGLIQ,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIVA,IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR,5,250,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NUMERAZIOIVA, 0);
  }

  private static void Init_PQRY_NUMERAZIOIV2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NUMERAZIOIV2, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_NUMERAZIOIV2, "PQRY_NUMERAZIOIV2");
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMREGLIQ, "ROWNAMREGLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMREGLIQ,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NUMERAZIOIV2, 0);
  }

  private static void Init_PQRY_NUMERAZIOIV2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_NUMERAZIOIV2_RS, "PQRY_NUMERAZIOIV2_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMREGLIQ, "ROWNAMREGLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV2_RS,IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMREGLIQ,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConfermaIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConfermaIVA()
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
    FormIdx = MyGlb.FRM_CONFERMAIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E5C82BDD-9136-433D-A2E5-A9B26269CB80";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 274;
    set_Caption(new IDVariant("Conferma I V A"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 248;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Conferma I V A";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 248;
    PAN_CONFERMAIVA = new IDPanel(w, this, 1, "PAN_CONFERMAIVA");
    Frames[1].Content = PAN_CONFERMAIVA;
    PAN_CONFERMAIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONFERMAIVA.VS = MainFrm.VisualStyleList;
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 248-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CE4E999F-597B-4ED7-AC29-C8670FFE064C");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONFERMAIVA.InitStatus = 2;
    PAN_CONFERMAIVA_Init();
    PAN_CONFERMAIVA_InitFields();
    PAN_CONFERMAIVA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NUMERAZIOIVA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONFERMAIVA_NUMERAZIOIV2();
      }
      PAN_CONFERMAIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof ConfermaIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConfermaIVA.class.getName() : (Glb.ClassWithPackage(ConfermaIVA.class) ? ConfermaIVA.class.getName().substring(ConfermaIVA.class.getPackage().getName().length() + 1) : ConfermaIVA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Conferma I V A On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONFERMAIVA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONFERMAIVA);
      // 
      // Conferma I V A On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CONFERMAIVA.set_ToolTip(Glb.OBJ_FIELD,PFL_CONFERMAIVA_REGISTRO,(new IDVariant(PAN_CONFERMAIVA.FieldText(PFL_CONFERMAIVA_REGISTRO))).stringValue()); 
      PAN_CONFERMAIVA.set_ToolTip(Glb.OBJ_FIELD,PFL_CONFERMAIVA_BOLLATO,(new IDVariant(PAN_CONFERMAIVA.FieldText(PFL_CONFERMAIVA_BOLLATO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaIVA", "ConfermaIVAOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PERIODO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Conferma I.V.A.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMREGLIQ, 0, (new IDVariant("R")));
      set_Caption(new IDVariant(v_CAP));
      if (IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG, 0).equals((new IDVariant(4)), true))
      {
        Frames[PAN_CONFERMAIVA.FrIndex].set_Caption(IDL.Add(IDL.Add(v_CAP, (new IDVariant(" "))), (new IDVariant("Corrispettivi"))).stringValue());
        PAN_CONFERMAIVA.set_Header(Glb.OBJ_GROUP,GRP_CONFERMAIVA_CONFEIVADOCU,IDL.Add(IDL.Add(v_CAP, (new IDVariant(" "))), (new IDVariant("Corrispettivi"))).stringValue()); 
      }
      else
      {
        Frames[PAN_CONFERMAIVA.FrIndex].set_Caption(IDL.Add(IDL.Add(v_CAP, (new IDVariant(" "))), (new IDVariant("Documenti"))).stringValue());
        PAN_CONFERMAIVA.set_Header(Glb.OBJ_GROUP,GRP_CONFERMAIVA_CONFEIVADOCU,IDL.Add(IDL.Add(v_CAP, (new IDVariant(" "))), (new IDVariant("Documenti"))).stringValue()); 
      }
      if (IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG, 0).equals((new IDVariant(5)), true))
      {
        PAN_CONFERMAIVA.SetFlags (Glb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CONFERMAIVA.SetFlags (Glb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA, 0)).compareTo(IDL.Month(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA, 0)), true)!=0)
      {
        v_PERIODO = IDL.Add(IDL.Add(MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA, 0))), (new IDVariant(" - "))), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA, 0))));
      }
      else
      {
        v_PERIODO = MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATDA, 0)));
      }
      PAN_CONFERMAIVA.set_FieldText(PFL_CONFERMAIVA_PERIODOLABEL, new IDVariant(v_PERIODO).stringValue());
      PAN_CONFERMAIVA.set_FieldText(PFL_CONFERMAIVA_ETICHETTA, IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDESCR, 0).stringValue());
      set_bVisualFlag(Glb.FORMVISPROP_CONFIRMBTN, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaIVA", "LoadEvent", _e);
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
    IDVariant v_INOUT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CONFERMAIVA(IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV2, IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV2, IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV2, IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMEESERC, 0), IMDB.Value(IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEDATAA, 0), IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV2, IMDBDef10.PQSL_NUMERAZIOIV2_ROWNAMREGLIQ, 0), v_INOUT);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_ELA = new IDVariant(0,IDVariant.STRING);
        v_ELA = (new IDVariant("registrazioni aggiornate", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>"))), IDL.ToString(v_INOUT)), (new IDVariant(" "))), v_ELA)); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaIVA", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Numerazione I V A
  // Primary record source for panel data
  // **********************************************************************
  private void CONFERMAIVA_NUMERAZIOIV2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NUMERAZIOIV2_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NUMERAZIOIVA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NUMERAZIOIVA, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 0, IMDBDef2.TBL_NUMERAZIOIVA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 0, 0, IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 1, 0, IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 2, 0, IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPBOL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 3, 0, IMDBDef2.TBL_NUMERAZIOIVA, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMREGLIQ, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NUMERAZIOIVA, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NUMERAZIOIVA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NUMERAZIOIVA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NUMERAZIOIV2_RS, 0);
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
  private void PAN_CONFERMAIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONFERMAIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONFERMAIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONFERMAIVA, Cancel);
    // Stub
  }

  private void PAN_CONFERMAIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONFERMAIVA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONFERMAIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONFERMAIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONFERMAIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONFERMAIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONFERMAIVA_Init()
  {

    PAN_CONFERMAIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONFERMAIVA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, "25E5B3EE-8DE4-4661-9639-5CFECB59B340");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, "Conferma I.V.A. Documenti");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, MyGlb.VIS_GROUPSTYLE);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, MyGlb.PANEL_FORM, 8, 7, 348, 149, 0, 0);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, 0, 151);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, 1, 13);
    PAN_CONFERMAIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, 0, 4);
    PAN_CONFERMAIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, 1, 4);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_CONFERMAIVA_CONFEIVADOCU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONFERMAIVA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, "CD69C546-8041-4437-B380-E3445CA7682A");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, "Elabora");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONFERMAIVA.SetImage(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, 0, "button1.gif", false);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, "86C7E0C3-5205-4575-8487-05E483720229");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, "Registro");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, "B7D56DD4-19BF-4E1F-8319-223CAD2EA01A");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, "Bollato");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.VIS_VISULOOUPCF4);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, "83ACED8D-1B9B-4FF6-8476-78735A0AC759");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, "Anno");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, "D6D41066-C0AF-4339-AA39-85F0DF382150");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, "Registrazione Liquidazione");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.VIS_OPTIONBUTTON);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, "EB2FC625-CDB3-45D7-9BCA-A0F01F65E1B3");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.VIS_VISULOOUPCF4);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, "5426CE50-5E68-4E19-893C-17F6A42E0422");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, "Tipo Bollato");
    PAN_CONFERMAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, "4CFA2144-C9CD-45B5-B8F9-2F3DD5DEF8A3");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, "Periodo");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.VIS_VUOTONORMALE);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONFERMAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, "7921714E-7237-458E-9DD5-E37DFB76F640");
    PAN_CONFERMAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, "");
    PAN_CONFERMAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.VIS_ETICHEGRASSE);
    PAN_CONFERMAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_CONFERMAIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_LIST, 212, 112, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_FORM, 276, 172, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_ELABORA, -1, -1);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_LIST, "Regis.");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_FORM, 60, 32, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_FORM, 48);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTRO, MyGlb.PANEL_FORM, "Regis.");
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_REGISTRO, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_REGISTRO, PPQRY_NUMERAZIOIV2, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 1, 0, -13997);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTRO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_LIST, 100);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_LIST, "Bollato");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_FORM, 12, 60, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_FORM, 56);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_BOLLATO, MyGlb.PANEL_FORM, "Bollato");
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_BOLLATO, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_BOLLATO, PPQRY_TIPOBOLLATO, "A.DESCRIZIONE", "ROWNAMT04DES", 5, 40, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_LIST, 52);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_FORM, 16, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_FORM, 52);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_ANNO, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_ANNO, PPQRY_NUMERAZIOIV2, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_LIST, 136);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_LIST, "Registrazione Liquidazione");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_FORM, 72, 132, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_FORM, 136);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_REGISTLIQUID, MyGlb.PANEL_FORM, "Registr. Liquidazione");
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_REGISTLIQUID, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_REGISTLIQUID, PPQRY_NUMERAZIOIV2, "A.ROWNAMREGLIQ", "ROWNAMREGLIQ", 5, 1, 0, -13997);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTLIQUID, (new IDVariant("R")), "Registrazione", "", "", -1);
    PAN_CONFERMAIVA.SetValueListItem(PFL_CONFERMAIVA_REGISTLIQUID, (new IDVariant("L")), "Liquidazione", "", "", -1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_LIST, 60, 96, 216, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_FORM, 72, 108, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_PERIODOLABEL, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_PERIODOLABEL, -1, "", "PERIODOLABEL", 0, 0, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 12, 52, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 64);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tp. Boll.");
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_TIPOBOLLATO, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_TIPOBOLLATO, PPQRY_NUMERAZIOIV2, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 2, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_LIST, 68, 104, 216, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_LIST, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_FORM, 16, 108, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_FORM, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_PERIODO, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_PERIODO, -1, "", "PERIODO", 0, 0, 0, -13997);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_LIST, 56, 32, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_CONFERMAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_FORM, 60, 32, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONFERMAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_CONFERMAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONFERMAIVA_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_CONFERMAIVA.SetFieldPage(PFL_CONFERMAIVA_ETICHETTA, -1, GRP_CONFERMAIVA_CONFEIVADOCU);
    PAN_CONFERMAIVA.SetFieldPanel(PFL_CONFERMAIVA_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
  }

  private void PAN_CONFERMAIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONFERMAIVA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMT04DES ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TBL_NUMERAZIOIVA.ROWNAMTIPREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_NUMERAZIOIVA.ROWNAMTIPBOL~~) ");
    PAN_CONFERMAIVA.SetQuery(PPQRY_TIPOBOLLATO, 0, SQL, -1, "");
    PAN_CONFERMAIVA.SetQueryDB(PPQRY_TIPOBOLLATO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONFERMAIVA.SetMasterTable(PPQRY_TIPOBOLLATO, "T04");
    PAN_CONFERMAIVA.SetIMDB(IMDB, "PQRY_NUMERAZIOIV2", true);
    PAN_CONFERMAIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONFERMAIVA.SetQueryIMDB(PPQRY_NUMERAZIOIV2, IMDBDef10.PQRY_NUMERAZIOIV2_RS, IMDBDef2.TBL_NUMERAZIOIVA);
    JustLoaded = true;
    PAN_CONFERMAIVA.SetFieldPrimaryIndex(PFL_CONFERMAIVA_REGISTRO, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPREG);
    PAN_CONFERMAIVA.SetFieldPrimaryIndex(PFL_CONFERMAIVA_ANNO, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMEESERC);
    PAN_CONFERMAIVA.SetFieldPrimaryIndex(PFL_CONFERMAIVA_REGISTLIQUID, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMREGLIQ);
    PAN_CONFERMAIVA.SetFieldPrimaryIndex(PFL_CONFERMAIVA_TIPOBOLLATO, IMDBDef2.FLD_NUMERAZIOIVA_ROWNAMTIPBOL);
    PAN_CONFERMAIVA.SetMasterTable(0, "NUMERAZIOIVA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONFERMAIVA.Status() == 2)
    {
      int oldListQBE = PAN_CONFERMAIVA.iUseListQBE;
      PAN_CONFERMAIVA.iUseListQBE = 0;
      PAN_CONFERMAIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONFERMAIVA.PanelCommand(Glb.PCM_FIND);
      PAN_CONFERMAIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONFERMAIVA) PAN_CONFERMAIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONFERMAIVA) PAN_CONFERMAIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONFERMAIVA) PAN_CONFERMAIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONFERMAIVA) PAN_CONFERMAIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONFERMAIVA) PAN_CONFERMAIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
