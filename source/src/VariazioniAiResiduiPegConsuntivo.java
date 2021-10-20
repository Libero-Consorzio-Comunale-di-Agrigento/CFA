// **********************************************
// Variazioni Ai Residui Peg Consuntivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniAiResiduiPegConsuntivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARAIRESPECO_PARTE = 0;
  private static int PFL_VARAIRESPECO_MOTIVO = 1;
  private static int PFL_VARAIRESPECO_TOTALPERMOTI = 2;
  private static int PFL_VARAIRESPECO_ELABORA = 3;
  private static int PFL_VARAIRESPECO_DESCRIINTERV = 4;

  private static int PPQRY_PAR3 = 0;


  IDPanel PAN_VARAIRESPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR6(IMDB);
    //
    //
    Init_PQRY_PAR3(IMDB);
    Init_PQRY_PAR3_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR6, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR6, "TBL_PAR6");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMTOPEMO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR6,IMDBDef3.FLD_PAR6_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR6, 0);
  }

  private static void Init_PQRY_PAR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR3, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR3, "PQRY_PAR3");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMTOPEMO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3,IMDBDef12.PQSL_PAR3_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR3, 0);
  }

  private static void Init_PQRY_PAR3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR3_RS, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR3_RS, "PQRY_PAR3_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMTOPEMO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR3_RS,IMDBDef12.PQSL_PAR3_ROWNAMDESINT,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniAiResiduiPegConsuntivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniAiResiduiPegConsuntivo()
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
    FormIdx = MyGlb.FRM_VARAIRESPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E44AC9D2-29E1-4973-9499-A634B637B466";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 276;
    DesignHeight = 210;
    set_Caption(new IDVariant("Variazioni Ai Residui Peg Consuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 276;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Ai Residui Peg Consuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_VARAIRESPECO = new IDPanel(w, this, 1, "PAN_VARAIRESPECO");
    Frames[1].Content = PAN_VARAIRESPECO;
    PAN_VARAIRESPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARAIRESPECO.VS = MainFrm.VisualStyleList;
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 276-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CF0B3AB8-92CC-4404-B0BA-B802B578E8E3");
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 320, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARAIRESPECO.InitStatus = 2;
    PAN_VARAIRESPECO_Init();
    PAN_VARAIRESPECO_InitFields();
    PAN_VARAIRESPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARAIRESPECO_PAR3();
      }
      PAN_VARAIRESPECO.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniAiResiduiPegConsuntivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniAiResiduiPegConsuntivo.class.getName() : (Glb.ClassWithPackage(VariazioniAiResiduiPegConsuntivo.class) ? VariazioniAiResiduiPegConsuntivo.class.getName().substring(VariazioniAiResiduiPegConsuntivo.class.getPackage().getName().length() + 1) : VariazioniAiResiduiPegConsuntivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MOTIVODESC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ECONOMIA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INESIGIBILIT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INSUSSISTENZ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PRESCR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RIPIANO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_var_res_pegc_stampa", IDVariant.STRING));
      v_ECONOMIA = (new IDVariant("Economia", IDVariant.STRING));
      v_INESIGIBILIT = (new IDVariant("Inesigibilità", IDVariant.STRING));
      v_INSUSSISTENZ = (new IDVariant("Insussistenza", IDVariant.STRING));
      v_PRESCR = (new IDVariant("Prescrizione", IDVariant.STRING));
      v_RIPIANO = (new IDVariant("Ripiano", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant("ECO")), true))
      {
        v_MOTIVODESC = new IDVariant(v_ECONOMIA);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant("INE")), true))
      {
        v_MOTIVODESC = new IDVariant(v_INESIGIBILIT);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant("INS")), true))
      {
        v_MOTIVODESC = new IDVariant(v_INSUSSISTENZ);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant("PRE")), true))
      {
        v_MOTIVODESC = new IDVariant(v_PRESCR);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant("RIP")), true))
      {
        v_MOTIVODESC = new IDVariant(v_RIPIANO);
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant()), true))?(new IDVariant("%25")):IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0)));
      MainFrm.SetParametroStampa(v_MOTIVODESC);
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMTOPEMO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMDESINT, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResiduiPegConsuntivo", "Elabora", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Variazioni ai residui (Peg Consuntivo)", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAP, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMEMOTIV, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMTOPEMO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMDESINT, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResiduiPegConsuntivo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Ai Residui Peg Consuntivo On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARAIRESPECO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Ai Residui Peg Consuntivo On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).compareTo((new IDVariant()), true)!=0)
      {
        PAN_VARAIRESPECO.SetFlags (Glb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARAIRESPECO.SetFlags (Glb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
      {
        PAN_VARAIRESPECO.SetFlags (Glb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARAIRESPECO.SetFlags (Glb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResiduiPegConsuntivo", "VariazioniAiResiduiPegConsuntivoOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Ai Residui Peg Consuntivo On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARAIRESPECO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_VARAIRESPECO, Cancel);
      // 
      // Variazioni Ai Residui Peg Consuntivo On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0).equals((new IDVariant()), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR3, IMDBDef12.PQSL_PAR3_ROWNAMEMOTIV, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResiduiPegConsuntivo", "VariazioniAiResiduiPegConsuntivoOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void VARAIRESPECO_PAR3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR3_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR6, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR3_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR3_RS, 0, IMDBDef3.TBL_PAR6, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR3_RS, 0, 0, IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR3_RS, 1, 0, IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMEMOTIV, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR3_RS, 2, 0, IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMTOPEMO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR3_RS, 3, 0, IMDBDef3.TBL_PAR6, IMDBDef3.FLD_PAR6_ROWNAMDESINT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR6, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR3_RS, 0);
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
  private void PAN_VARAIRESPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARAIRESPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARAIRESPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VARAIRESPECO);
    // Stub
  }

  private void PAN_VARAIRESPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARAIRESPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARAIRESPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARAIRESPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARAIRESPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARAIRESPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARAIRESPECO_Init()
  {

    PAN_VARAIRESPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARAIRESPECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARAIRESPECO.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, "F9AD13D0-088C-42A8-94BC-005EDD7B18A8");
    PAN_VARAIRESPECO.set_Header(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, "Parte");
    PAN_VARAIRESPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, "");
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, "CEAE97E2-E169-4639-8F34-44EEE0DF4EEE");
    PAN_VARAIRESPECO.set_Header(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, "Motivo");
    PAN_VARAIRESPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, "");
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, "DAEEA3F1-16BE-4B56-9380-9DA24AF6A3D2");
    PAN_VARAIRESPECO.set_Header(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, "Totali Per Motivo");
    PAN_VARAIRESPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, "");
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.VIS_CHECKSTYLE);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, "74446D83-3662-4043-95C8-30F0D914ED42");
    PAN_VARAIRESPECO.set_Header(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, "Elabora");
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARAIRESPECO.SetImage(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, 0, "button1.gif", false);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARAIRESPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, "244BE164-8440-4EDB-97F8-E814F83B641E");
    PAN_VARAIRESPECO.set_Header(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, "Descrizione Intervento");
    PAN_VARAIRESPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, "");
    PAN_VARAIRESPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_VARAIRESPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARAIRESPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_FORM, 72, 8, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_FORM, 104);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_VARAIRESPECO.SetFieldPage(PFL_VARAIRESPECO_PARTE, -1, -1);
    PAN_VARAIRESPECO.SetFieldPanel(PFL_VARAIRESPECO_PARTE, PPQRY_PAR3, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_PARTE, (new IDVariant("E")), "Entrata          ", "Parte Entrata", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_LIST, 64, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_LIST, 40);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_LIST, "Motivo");
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_FORM, 104, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_FORM, 104);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_MOTIVO, MyGlb.PANEL_FORM, "Motivo");
    PAN_VARAIRESPECO.SetFieldPage(PFL_VARAIRESPECO_MOTIVO, -1, -1);
    PAN_VARAIRESPECO.SetFieldPanel(PFL_VARAIRESPECO_MOTIVO, PPQRY_PAR3, "A.ROWNAMEMOTIV", "ROWNAMEMOTIV", 12, 3, 0, -13997);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant("RIP")), "Ripiano", "", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant("INS")), "Insussistenza", "", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant("ECO")), "Economia", "", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant("PRE")), "Prescrizione", "", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant("INE")), "Inesigibilità", "", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_MOTIVO, (new IDVariant()), "(Tutti)", "", "", -1);
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_LIST, 88);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_LIST, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_LIST, "Tt. P. Mot.");
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_FORM, 60, 64, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_FORM, 140);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_FORM, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_TOTALPERMOTI, MyGlb.PANEL_FORM, "Totali Per Motivo");
    PAN_VARAIRESPECO.SetFieldPage(PFL_VARAIRESPECO_TOTALPERMOTI, -1, -1);
    PAN_VARAIRESPECO.SetFieldPanel(PFL_VARAIRESPECO_TOTALPERMOTI, PPQRY_PAR3, "A.ROWNAMTOPEMO", "ROWNAMTOPEMO", 5, 2, 0, -13997);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_TOTALPERMOTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_TOTALPERMOTI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_LIST, 56, 96, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_FORM, 144, 132, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARAIRESPECO.SetFieldPage(PFL_VARAIRESPECO_ELABORA, -1, -1);
    PAN_VARAIRESPECO.SetFieldPanel(PFL_VARAIRESPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_LIST, "Descrizione Intervento");
    PAN_VARAIRESPECO.SetRect(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_FORM, 60, 92, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARAIRESPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_VARAIRESPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_VARAIRESPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARAIRESPECO_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_VARAIRESPECO.SetFieldPage(PFL_VARAIRESPECO_DESCRIINTERV, -1, -1);
    PAN_VARAIRESPECO.SetFieldPanel(PFL_VARAIRESPECO_DESCRIINTERV, PPQRY_PAR3, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARAIRESPECO.SetValueListItem(PFL_VARAIRESPECO_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_VARAIRESPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARAIRESPECO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARAIRESPECO.SetIMDB(IMDB, "PQRY_PAR3", true);
    PAN_VARAIRESPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARAIRESPECO.SetQueryIMDB(PPQRY_PAR3, IMDBDef12.PQRY_PAR3_RS, IMDBDef3.TBL_PAR6);
    JustLoaded = true;
    PAN_VARAIRESPECO.SetFieldPrimaryIndex(PFL_VARAIRESPECO_PARTE, IMDBDef3.FLD_PAR6_ROWNAMEPARTE);
    PAN_VARAIRESPECO.SetFieldPrimaryIndex(PFL_VARAIRESPECO_MOTIVO, IMDBDef3.FLD_PAR6_ROWNAMEMOTIV);
    PAN_VARAIRESPECO.SetFieldPrimaryIndex(PFL_VARAIRESPECO_TOTALPERMOTI, IMDBDef3.FLD_PAR6_ROWNAMTOPEMO);
    PAN_VARAIRESPECO.SetFieldPrimaryIndex(PFL_VARAIRESPECO_DESCRIINTERV, IMDBDef3.FLD_PAR6_ROWNAMDESINT);
    PAN_VARAIRESPECO.SetMasterTable(0, "PAR6");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARAIRESPECO.Status() == 2)
    {
      int oldListQBE = PAN_VARAIRESPECO.iUseListQBE;
      PAN_VARAIRESPECO.iUseListQBE = 0;
      PAN_VARAIRESPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARAIRESPECO.PanelCommand(Glb.PCM_FIND);
      PAN_VARAIRESPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_OnChangeRow();
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
    if (SrcObj == PAN_VARAIRESPECO) PAN_VARAIRESPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
