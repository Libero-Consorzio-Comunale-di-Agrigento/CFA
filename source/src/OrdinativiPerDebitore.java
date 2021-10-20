// **********************************************
// Ordinativi Per Debitore
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiPerDebitore extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDINPERDEBI_CODICEDEBITO = 0;
  private static int PFL_ORDINPERDEBI_BENDEBITORE = 1;
  private static int PFL_ORDINPERDEBI_RESIDUI = 2;
  private static int PFL_ORDINPERDEBI_DATAELABORAZ = 3;
  private static int PFL_ORDINPERDEBI_ELABORA = 4;
  private static int PFL_ORDINPERDEBI_SCEGBENEBUTT = 5;
  private static int PFL_ORDINPERDEBI_EXPORINEXCEL = 6;

  private static int PPQRY_PAR35 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_ORDINPERDEBI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR36(IMDB);
    //
    //
    Init_PQRY_PAR35(IMDB);
    Init_PQRY_PAR35_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR36(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR36, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR36, "TBL_PAR36");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMEXINEX, "ROWNAMEXINEX");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR36,IMDBDef6.FLD_PAR36_ROWNAMEXINEX,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR36, 0);
  }

  private static void Init_PQRY_PAR35(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR35, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR35, "PQRY_PAR35");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMEXINEX, "ROWNAMEXINEX");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35,IMDBDef16.PQSL_PAR35_ROWNAMEXINEX,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR35, 0);
  }

  private static void Init_PQRY_PAR35_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR35_RS, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR35_RS, "PQRY_PAR35_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMEXINEX, "ROWNAMEXINEX");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR35_RS,IMDBDef16.PQSL_PAR35_ROWNAMEXINEX,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiPerDebitore(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiPerDebitore()
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
    FormIdx = MyGlb.FRM_ORDINPERDEBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3743D582-88D9-4235-B165-DE025A2B2D64";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 432;
    DesignHeight = 190;
    set_Caption(new IDVariant("Ordinativi Per Debitore"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 432;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Per Debitore";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_ORDINPERDEBI = new IDPanel(w, this, 1, "PAN_ORDINPERDEBI");
    Frames[1].Content = PAN_ORDINPERDEBI;
    PAN_ORDINPERDEBI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINPERDEBI.VS = MainFrm.VisualStyleList;
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 432-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D7474ADE-0C85-4489-A0D5-B302EDC45080");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 636, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINPERDEBI.InitStatus = 2;
    PAN_ORDINPERDEBI_Init();
    PAN_ORDINPERDEBI_InitFields();
    PAN_ORDINPERDEBI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR36, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINPERDEBI_PAR35();
      }
      PAN_ORDINPERDEBI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_ORDINPERDEBI.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINPERDEBI_SCEGBENEBUTT) {
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
    return (obj instanceof OrdinativiPerDebitore);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiPerDebitore.class.getName() : (Glb.ClassWithPackage(OrdinativiPerDebitore.class) ? OrdinativiPerDebitore.class.getName().substring(OrdinativiPerDebitore.class.getPackage().getName().length() + 1) : OrdinativiPerDebitore.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Ben
  // **********************************************************************
  public int ApriBen ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ben Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "ApriBen", _e);
      return -1;
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
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("DEBITORE"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("COMP_RES"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Ordinativi_per_Debitore"));
      if (IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISTAMJASP, IMDBDef7.FLD_DATISTAMJASP_PARAMURLEXPO, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IMDB.Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMEXINEX, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("URL per export in excel non configurato. Contattare l'assistenza"));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR35, IMDBDef16.PQSL_PAR35_ROWNAMCODDEB, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef16.PQRY_PAR35, IMDBDef16.PQSL_PAR35_ROWNAMERESID, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR35, IMDBDef16.PQSL_PAR35_ROWNAMDATELA, 0)));
      MainFrm.LanciaStampaJasper(IDL.Add(v_NOMESTAMPA, ((IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMEXINEX, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))?(new IDVariant("_xls")):(new IDVariant("")))), (new IDVariant("")), (new IDVariant("")), ((IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMEXINEX, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))?(new IDVariant("xls")):(new IDVariant())));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMERESID, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      UNLOADEVENT_PARDELETROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARDELETROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMERESID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMCODDEB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMEXINEX, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR35, IMDBDef16.PQSL_PAR35_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR35, IMDBDef16.PQSL_PAR35_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Per Debitore On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINPERDEBI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINPERDEBI);
      // 
      // Ordinativi Per Debitore On Dynamic Properties Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "OrdinativiPerDebitoreOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Per Debitore On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_ORDINPERDEBI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Per Debitore On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_ORDINPERDEBI_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_ORDINPERDEBI.FieldText(PFL_ORDINPERDEBI_BENDEBITORE))), IDL.Today(), (new IDVariant("SITORD")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerDebitore", "OrdinativiPerDebitoreOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINPERDEBI_PAR35() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR35_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR36, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR36, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR35_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR35_RS, 0, IMDBDef6.TBL_PAR36, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR35_RS, 0, 0, IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMERESID, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR35_RS, 1, 0, IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR35_RS, 2, 0, IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMCODDEB, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR35_RS, 3, 0, IMDBDef6.TBL_PAR36, IMDBDef6.FLD_PAR36_ROWNAMEXINEX, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR36, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR36, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR36, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR35_RS, 0);
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
  private void PAN_ORDINPERDEBI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINPERDEBI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINPERDEBI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINPERDEBI, Cancel);
    // Stub
  }

  private void PAN_ORDINPERDEBI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINPERDEBI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINPERDEBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINPERDEBI_SCEGBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_ORDINPERDEBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriBen();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINPERDEBI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINPERDEBI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINPERDEBI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINPERDEBI_Init()
  {

    PAN_ORDINPERDEBI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINPERDEBI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINPERDEBI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, "47C7F46D-1B2F-4D20-AE80-D90D127B5491");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, "Codice Debitore");
    PAN_ORDINPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, "840F1678-DEC2-474B-935E-14A7F58C4DD7");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, "Debitore");
    PAN_ORDINPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, "E6F93B31-7197-4E33-98C4-7CBD231192BB");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, "Residui");
    PAN_ORDINPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.VIS_OPTIONBUTTON);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, "6362C5F8-F573-4EF5-84B1-FDE2C3100663");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, "Data Elaborazione");
    PAN_ORDINPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, "05034EE1-196F-489D-B830-DE80EC33E043");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, "Elabora");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINPERDEBI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, 0, "button1.gif", false);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, "D86C7C96-AE8E-484E-8F0B-0E9889F3D266");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINPERDEBI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, 0, "wsearch1.gif", false);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, "B82369E2-FF4C-462E-BB34-B0EBED5D6B4A");
    PAN_ORDINPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, "Export In Excel");
    PAN_ORDINPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, "");
    PAN_ORDINPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINPERDEBI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, "Cod. Debit.");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 304, 16, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_CODICEDEBITO, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_CODICEDEBITO, PPQRY_PAR35, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_FORM, 16, 16, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_BENDEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_BENDEBITORE, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_LIST, 72, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_LIST, 44);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_FORM, 16, 48, 104, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_FORM, 112);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_FORM, 4);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_RESIDUI, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_RESIDUI, PPQRY_PAR35, "A.ROWNAMERESID", "ROWNAMERESID", 5, 1, 0, -13997);
    PAN_ORDINPERDEBI.SetValueListItem(PFL_ORDINPERDEBI_RESIDUI, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_ORDINPERDEBI.SetValueListItem(PFL_ORDINPERDEBI_RESIDUI, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ORDINPERDEBI.SetValueListItem(PFL_ORDINPERDEBI_RESIDUI, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 160, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 184, 44, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_DATAELABORAZ, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_DATAELABORAZ, PPQRY_PAR35, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_LIST, 128, 140, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_FORM, 284, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_ELABORA, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 324, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 364, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_SCEGBENEBUTT, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_SCEGBENEBUTT, -1, "", "SCEGBENEBUTT", 0, 0, 0, -13997);
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_LIST, 92);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_LIST, "Export In Excel");
    PAN_ORDINPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_FORM, 264, 80, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_FORM, 96);
    PAN_ORDINPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINPERDEBI_EXPORINEXCEL, MyGlb.PANEL_FORM, "Export In Excel");
    PAN_ORDINPERDEBI.SetFieldPage(PFL_ORDINPERDEBI_EXPORINEXCEL, -1, -1);
    PAN_ORDINPERDEBI.SetFieldPanel(PFL_ORDINPERDEBI_EXPORINEXCEL, PPQRY_PAR35, "A.ROWNAMEXINEX", "ROWNAMEXINEX", 5, 2, 0, -13997);
    PAN_ORDINPERDEBI.SetValueListItem(PFL_ORDINPERDEBI_EXPORINEXCEL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ORDINPERDEBI.SetValueListItem(PFL_ORDINPERDEBI_EXPORINEXCEL, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_ORDINPERDEBI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINPERDEBI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINPERDEBI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_ORDINPERDEBI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINPERDEBI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_ORDINPERDEBI.SetQueryLKE(PPQRY_BEN, PFL_ORDINPERDEBI_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINPERDEBI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_ORDINPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_ORDINPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_ORDINPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_ORDINPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_ORDINPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_ORDINPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    PAN_ORDINPERDEBI.SetIMDB(IMDB, "PQRY_PAR35", true);
    PAN_ORDINPERDEBI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINPERDEBI.SetQueryIMDB(PPQRY_PAR35, IMDBDef16.PQRY_PAR35_RS, IMDBDef6.TBL_PAR36);
    JustLoaded = true;
    PAN_ORDINPERDEBI.SetFieldPrimaryIndex(PFL_ORDINPERDEBI_CODICEDEBITO, IMDBDef6.FLD_PAR36_ROWNAMCODDEB);
    PAN_ORDINPERDEBI.SetFieldPrimaryIndex(PFL_ORDINPERDEBI_RESIDUI, IMDBDef6.FLD_PAR36_ROWNAMERESID);
    PAN_ORDINPERDEBI.SetFieldPrimaryIndex(PFL_ORDINPERDEBI_DATAELABORAZ, IMDBDef6.FLD_PAR36_ROWNAMDATELA);
    PAN_ORDINPERDEBI.SetFieldPrimaryIndex(PFL_ORDINPERDEBI_EXPORINEXCEL, IMDBDef6.FLD_PAR36_ROWNAMEXINEX);
    PAN_ORDINPERDEBI.SetMasterTable(0, "PAR36");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINPERDEBI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINPERDEBI.iUseListQBE;
      PAN_ORDINPERDEBI.iUseListQBE = 0;
      PAN_ORDINPERDEBI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINPERDEBI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINPERDEBI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_ORDINPERDEBI) PAN_ORDINPERDEBI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
