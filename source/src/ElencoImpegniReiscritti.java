// **********************************************
// Elenco Impegni Reiscritti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoImpegniReiscritti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARS_PERIODREISCR = 0;

  private static int PFL_PARS_UO = 0;
  private static int PFL_PARS_DA = 1;
  private static int PFL_PARS_A = 2;
  private static int PFL_PARS_ETICHEELABOR = 3;

  private static int PPQRY_PARS97 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS38(IMDB);
    //
    //
    Init_PQRY_PARS97(IMDB);
    Init_PQRY_PARS97_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS38, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS38, "TBL_PARS38");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTDA, "NOMEOGGETTDA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTDA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTOA, "NOMEOGGETTOA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOMEOGGETTOA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, "NOOGIMOSUOAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS38,IMDBDef4.FLD_PARS38_NOOGIMOSUOAC,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS38, 0);
  }

  private static void Init_PQRY_PARS97(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS97, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS97, "PQRY_PARS97");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTDA, "NOMEOGGETTDA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTDA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTOA, "NOMEOGGETTOA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97,IMDBDef13.PQSL_PARS97_NOMEOGGETTOA,6,14,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARS97, 0);
  }

  private static void Init_PQRY_PARS97_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS97_RS, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS97_RS, "PQRY_PARS97_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTDA, "NOMEOGGETTDA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTDA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTOA, "NOMEOGGETTOA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS97_RS,IMDBDef13.PQSL_PARS97_NOMEOGGETTOA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImpegniReiscritti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoImpegniReiscritti()
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
    FormIdx = MyGlb.FRM_ELENIMPEREIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "730B3A69-8041-4E1D-81C6-DEEF7F832090";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 412;
    DesignHeight = 226;
    set_Caption(new IDVariant("Elenco Impegni Reiscritti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 412;
    Frames[1].Height = 200;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 200;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 412-MyGlb.PAN_OFFS_X, 200-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2CA72F56-E8D7-4901-8E29-AB02010F1E4C");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 248, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS38, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENIMPEREIS_PARS97();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoImpegniReiscritti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoImpegniReiscritti.class.getName() : (Glb.ClassWithPackage(ElencoImpegniReiscritti.class) ? ElencoImpegniReiscritti.class.getName().substring(ElencoImpegniReiscritti.class.getPackage().getName().length() + 1) : ElencoImpegniReiscritti.class.getName()));
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
      IDVariant v_CAPTIOIMPEGN = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPEGN = (new IDVariant("Elenco Impegni Reiscritti"));
      IDVariant v_CAPTISUBIMPE = new IDVariant(0,IDVariant.STRING);
      v_CAPTISUBIMPE = (new IDVariant("Elenco Sub-Impegni Reiscritti"));
      IDVariant v_CAPTIOACCERT = null;
      v_CAPTIOACCERT = (new IDVariant("Elenco Accertamenti Reiscritti"));
      switch (1) // Allows the use of BREAK inside ifs
      {
        default:
        if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("I"))))	
        {
          set_Caption(new IDVariant(v_CAPTIOIMPEGN));
        }
        else if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("S"))))	
        {
          set_Caption(new IDVariant(v_CAPTISUBIMPE));
        }
        else if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("A"))))	
        {
          set_Caption(new IDVariant(v_CAPTIOACCERT));
        }
        break;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTUO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTDA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTOA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniReiscritti", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniReiscritti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTOA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0, new IDVariant());
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARS_UO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTUO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTUO, 0, (new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniReiscritti", "ParsOnUpdatingRow", _e);
    }
  }

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

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_NOMESTAMIMPE = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMIMPE = (new IDVariant("Elenco_Impegni_Reiscritti"));
      IDVariant v_NOMSTASUBIMP = new IDVariant(0,IDVariant.STRING);
      v_NOMSTASUBIMP = (new IDVariant("Elenco_SubImpegni_Reiscritti"));
      IDVariant v_NOMESTAMACCE = null;
      v_NOMESTAMACCE = (new IDVariant("Elenco_Accertamenti_Reiscritti"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      switch (1) // Allows the use of BREAK inside ifs
      {
        default:
        if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("I"))))	
        {
          v_NOMESTAMPA = new IDVariant(v_NOMESTAMIMPE);
        }
        else if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("S"))))	
        {
          v_NOMESTAMPA = new IDVariant(v_NOMSTASUBIMP);
        }
        else if (IMDB.Value(IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOOGIMOSUOAC, 0).equals((new IDVariant("A"))))	
        {
          v_NOMESTAMPA = new IDVariant(v_NOMESTAMACCE);
        }
        break;
      }
      if (v_NOMESTAMPA.equals((new IDVariant("")), true))
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Nome report non definito"));
        MainFrm.set_AlertMessage(v_VMSG); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTDA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTOA, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Periodo Reiscrizioni obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTOA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTDA, 0), true)<0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data al minore di data dal"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_UO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTUO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DA")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_A")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARS97, IMDBDef13.PQSL_PARS97_NOMEOGGETTOA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniReiscritti", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENIMPEREIS_PARS97() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARS97_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS38, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS38, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARS97_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARS97_RS, 0, IMDBDef4.TBL_PARS38, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS97_RS, 0, 0, IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTUO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS97_RS, 1, 0, IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTDA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS97_RS, 2, 0, IMDBDef4.TBL_PARS38, IMDBDef4.FLD_PARS38_NOMEOGGETTOA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS38, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS38, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS38, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARS97_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, "F23A7E14-717F-4A8D-B1C4-0C11E66B5E58");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, "Periodo Reiscrizioni");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, MyGlb.PANEL_FORM, 136, 47, 248, 49, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, 0, 110);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_PERIODREISCR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UO, "145C9F7C-0B95-465D-A3FF-A17F6EEE49B5");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DA, "A04054A3-59E7-452E-AE2E-0EC99941CEEC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DA, "Da");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_A, "B53ABC73-5A35-4337-AFFC-69FB6171544D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_A, "a");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_A, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "191DCEB8-813E-4F1E-B1F6-5EB0EE979166");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 4, 20, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 128);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_UO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UO, PPQRY_PARS97, "A.NOMEOGGETTUO", "NOMEOGGETTUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_FORM, 140, 72, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_FORM, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARS.SetFieldPage(PFL_PARS_DA, -1, GRP_PARS_PERIODREISCR);
    PAN_PARS.SetFieldPanel(PFL_PARS_DA, PPQRY_PARS97, "A.NOMEOGGETTDA", "NOMEOGGETTDA", 6, 14, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_LIST, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_LIST, "a");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_FORM, 280, 72, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_A, MyGlb.PANEL_FORM, "a");
    PAN_PARS.SetFieldPage(PFL_PARS_A, -1, GRP_PARS_PERIODREISCR);
    PAN_PARS.SetFieldPanel(PFL_PARS_A, PPQRY_PARS97, "A.NOMEOGGETTOA", "NOMEOGGETTOA", 6, 14, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 288, 128, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 304, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  '1' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as ORDINAMENTO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGETTUO~~) ");
    SQL.append("and   (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TRUNC( SYSDATE )) AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '0', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~NOMEOGGETTUO~~ = -1) ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_PARS_UO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  '1' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as ORDINAMENTO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TRUNC( SYSDATE )) AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '0', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_PARS_UO, "");
    PAN_PARS.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS97", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS97, IMDBDef13.PQRY_PARS97_RS, IMDBDef4.TBL_PARS38);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UO, IMDBDef4.FLD_PARS38_NOMEOGGETTUO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DA, IMDBDef4.FLD_PARS38_NOMEOGGETTDA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_A, IMDBDef4.FLD_PARS38_NOMEOGGETTOA);
    PAN_PARS.SetMasterTable(0, "PARS38");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
