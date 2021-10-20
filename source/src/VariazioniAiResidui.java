// **********************************************
// Variazioni Ai Residui
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniAiResidui extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAAIRESID_PARTE = 0;
  private static int PFL_VARIAAIRESID_MOTIVO = 1;
  private static int PFL_VARIAAIRESID_TOTALPERMOTI = 2;
  private static int PFL_VARIAAIRESID_ELABORA = 3;

  private static int PPQRY_PAR89 = 0;


  IDPanel PAN_VARIAAIRESID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR4(IMDB);
    //
    //
    Init_PQRY_PAR89(IMDB);
    Init_PQRY_PAR89_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR4, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR4, "TBL_PAR4");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR4,IMDBDef3.FLD_PAR4_ROWNAMTOPEMO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR4, 0);
  }

  private static void Init_PQRY_PAR89(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR89, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR89, "PQRY_PAR89");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89,IMDBDef12.PQSL_PAR89_ROWNAMTOPEMO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR89, 0);
  }

  private static void Init_PQRY_PAR89_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR89_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR89_RS, "PQRY_PAR89_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, "ROWNAMEMOTIV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV,12,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMTOPEMO, "ROWNAMTOPEMO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR89_RS,IMDBDef12.PQSL_PAR89_ROWNAMTOPEMO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniAiResidui(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniAiResidui()
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
    FormIdx = MyGlb.FRM_VARIAAIRESID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "63EE1ECA-410E-40D6-BD1A-EFC16C87F1D2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 248;
    DesignHeight = 194;
    set_Caption(new IDVariant("Variazioni Ai Residui"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 248;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Ai Residui";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_VARIAAIRESID = new IDPanel(w, this, 1, "PAN_VARIAAIRESID");
    Frames[1].Content = PAN_VARIAAIRESID;
    PAN_VARIAAIRESID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAAIRESID.VS = MainFrm.VisualStyleList;
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 248-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAAIRESID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8E9FEA8E-3F70-4038-89B5-5A95FE5A9D96");
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 200, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAAIRESID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAAIRESID.InitStatus = 2;
    PAN_VARIAAIRESID_Init();
    PAN_VARIAAIRESID_InitFields();
    PAN_VARIAAIRESID_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAAIRESID_PAR89();
      }
      PAN_VARIAAIRESID.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniAiResidui);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniAiResidui.class.getName() : (Glb.ClassWithPackage(VariazioniAiResidui.class) ? VariazioniAiResidui.class.getName().substring(VariazioniAiResidui.class.getPackage().getName().length() + 1) : VariazioniAiResidui.class.getName()));
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
      v_DW = (new IDVariant("d_var_res_stampa", IDVariant.STRING));
      v_ECONOMIA = (new IDVariant("Economia", IDVariant.STRING));
      v_INESIGIBILIT = (new IDVariant("Inesigibilità", IDVariant.STRING));
      v_INSUSSISTENZ = (new IDVariant("Insussistenza", IDVariant.STRING));
      v_PRESCR = (new IDVariant("Prescrizione", IDVariant.STRING));
      v_RIPIANO = (new IDVariant("Ripiano", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant("ECO")), true))
      {
        v_MOTIVODESC = new IDVariant(v_ECONOMIA);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant("INE")), true))
      {
        v_MOTIVODESC = new IDVariant(v_INESIGIBILIT);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant("INS")), true))
      {
        v_MOTIVODESC = new IDVariant(v_INSUSSISTENZ);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant("PRE")), true))
      {
        v_MOTIVODESC = new IDVariant(v_PRESCR);
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant("RIP")), true))
      {
        v_MOTIVODESC = new IDVariant(v_RIPIANO);
      }
      // if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant()), true))
      // {
        // v_MOTIVODESC = (new IDVariant(""));
      // }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant()), true))?(new IDVariant("%25")):IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0)));
      MainFrm.SetParametroStampa(v_MOTIVODESC);
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMTOPEMO, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResidui", "Elabora", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMEMOTIV, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMTOPEMO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResidui", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Ai Residui On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAAIRESID_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Ai Residui On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).compareTo((new IDVariant()), true)!=0)
      {
        PAN_VARIAAIRESID.SetFlags (Glb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAAIRESID.SetFlags (Glb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResidui", "VariazioniAiResiduiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Ai Residui On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAAIRESID_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_VARIAAIRESID, Cancel);
      // 
      // Variazioni Ai Residui On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0).equals((new IDVariant()), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR89, IMDBDef12.PQSL_PAR89_ROWNAMEMOTIV, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAiResidui", "VariazioniAiResiduiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAAIRESID_PAR89() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR89_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR4, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR89_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR89_RS, 0, IMDBDef3.TBL_PAR4, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR89_RS, 0, 0, IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR89_RS, 1, 0, IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMEMOTIV, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR89_RS, 2, 0, IMDBDef3.TBL_PAR4, IMDBDef3.FLD_PAR4_ROWNAMTOPEMO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR4, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR89_RS, 0);
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
  private void PAN_VARIAAIRESID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAAIRESID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAAIRESID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VARIAAIRESID);
    // Stub
  }

  private void PAN_VARIAAIRESID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAAIRESID_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARIAAIRESID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAAIRESID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAAIRESID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAAIRESID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAAIRESID_Init()
  {

    PAN_VARIAAIRESID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAAIRESID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAAIRESID.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VARIAAIRESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, "E58E8F0E-B7A5-493E-ABE3-EB296F956AE9");
    PAN_VARIAAIRESID.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, "Parte");
    PAN_VARIAAIRESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, "");
    PAN_VARIAAIRESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_VARIAAIRESID.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAAIRESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, "4CEC464B-8D4E-47C7-B874-540CF4CBA66A");
    PAN_VARIAAIRESID.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, "Motivo");
    PAN_VARIAAIRESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, "");
    PAN_VARIAAIRESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAAIRESID.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAAIRESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, "C5F4E5CE-AD51-483E-A131-C61A09CF9DC7");
    PAN_VARIAAIRESID.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, "Totali Per Motivo");
    PAN_VARIAAIRESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, "");
    PAN_VARIAAIRESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAAIRESID.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAAIRESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, "1CE0B7AF-E309-4BE2-AF32-86F7162E2E66");
    PAN_VARIAAIRESID.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, "Elabora");
    PAN_VARIAAIRESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAAIRESID.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, 0, "button1.gif", false);
    PAN_VARIAAIRESID.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VARIAAIRESID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_FORM, 52, 8, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_FORM, 104);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_VARIAAIRESID.SetFieldPage(PFL_VARIAAIRESID_PARTE, -1, -1);
    PAN_VARIAAIRESID.SetFieldPanel(PFL_VARIAAIRESID_PARTE, PPQRY_PAR89, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_LIST, 64, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_LIST, 40);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_LIST, "Motivo");
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_FORM, 52, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_FORM, 104);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_MOTIVO, MyGlb.PANEL_FORM, "Motivo");
    PAN_VARIAAIRESID.SetFieldPage(PFL_VARIAAIRESID_MOTIVO, -1, -1);
    PAN_VARIAAIRESID.SetFieldPanel(PFL_VARIAAIRESID_MOTIVO, PPQRY_PAR89, "A.ROWNAMEMOTIV", "ROWNAMEMOTIV", 12, 3, 0, -13997);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant("RIP")), "Ripiano", "", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant("INS")), "Insussistenza", "", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant("ECO")), "Economia", "", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant("PRE")), "Prescrizione", "", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant("INE")), "Inesigibilità", "", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_MOTIVO, (new IDVariant()), "(Tutti)", "", "", -1);
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_LIST, 88);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_LIST, "Tt. P. Mot.");
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_FORM, 52, 68, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_FORM, 108);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAAIRESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_TOTALPERMOTI, MyGlb.PANEL_FORM, "Totali Per Motivo");
    PAN_VARIAAIRESID.SetFieldPage(PFL_VARIAAIRESID_TOTALPERMOTI, -1, -1);
    PAN_VARIAAIRESID.SetFieldPanel(PFL_VARIAAIRESID_TOTALPERMOTI, PPQRY_PAR89, "A.ROWNAMTOPEMO", "ROWNAMTOPEMO", 5, 2, 0, -13997);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_TOTALPERMOTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAAIRESID.SetValueListItem(PFL_VARIAAIRESID_TOTALPERMOTI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_LIST, 56, 96, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAAIRESID.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_FORM, 104, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAAIRESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAAIRESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAAIRESID_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAAIRESID.SetFieldPage(PFL_VARIAAIRESID_ELABORA, -1, -1);
    PAN_VARIAAIRESID.SetFieldPanel(PFL_VARIAAIRESID_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_VARIAAIRESID_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAAIRESID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAAIRESID.SetIMDB(IMDB, "PQRY_PAR89", true);
    PAN_VARIAAIRESID.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIAAIRESID.SetQueryIMDB(PPQRY_PAR89, IMDBDef12.PQRY_PAR89_RS, IMDBDef3.TBL_PAR4);
    JustLoaded = true;
    PAN_VARIAAIRESID.SetFieldPrimaryIndex(PFL_VARIAAIRESID_PARTE, IMDBDef3.FLD_PAR4_ROWNAMEPARTE);
    PAN_VARIAAIRESID.SetFieldPrimaryIndex(PFL_VARIAAIRESID_MOTIVO, IMDBDef3.FLD_PAR4_ROWNAMEMOTIV);
    PAN_VARIAAIRESID.SetFieldPrimaryIndex(PFL_VARIAAIRESID_TOTALPERMOTI, IMDBDef3.FLD_PAR4_ROWNAMTOPEMO);
    PAN_VARIAAIRESID.SetMasterTable(0, "PAR4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAAIRESID.Status() == 2)
    {
      int oldListQBE = PAN_VARIAAIRESID.iUseListQBE;
      PAN_VARIAAIRESID.iUseListQBE = 0;
      PAN_VARIAAIRESID.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAAIRESID.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAAIRESID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_OnChangeRow();
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
    if (SrcObj == PAN_VARIAAIRESID) PAN_VARIAAIRESID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
