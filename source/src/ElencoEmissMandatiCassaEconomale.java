// **********************************************
// Elenco Emiss Mandati Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoEmissMandatiCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENFATDALIQ_NUMERODOC = 0;
  private static int PFL_ELENFATDALIQ_DATADOCUMENT = 1;
  private static int PFL_ELENFATDALIQ_CODICE = 2;
  private static int PFL_ELENFATDALIQ_RAGISOCIESTE = 3;
  private static int PFL_ELENFATDALIQ_NUMEROIMPEGN = 4;
  private static int PFL_ELENFATDALIQ_ANNOIMPEGNO = 5;
  private static int PFL_ELENFATDALIQ_INFOIMP = 6;
  private static int PFL_ELENFATDALIQ_NUMEROSUBIMP = 7;
  private static int PFL_ELENFATDALIQ_ANNOSUBIMPEG = 8;
  private static int PFL_ELENFATDALIQ_INFOSUB = 9;
  private static int PFL_ELENFATDALIQ_ETICHEDOCUME = 10;
  private static int PFL_ELENFATDALIQ_ETICHEBENEFI = 11;
  private static int PFL_ELENFATDALIQ_ETICHEIMPEGN = 12;
  private static int PFL_ELENFATDALIQ_ETICHESUBIMP = 13;
  private static int PFL_ELENFATDALIQ_CODICEGESTIO = 14;
  private static int PFL_ELENFATDALIQ_IMPORTOIVA = 15;

  private static int PPQRY_DETTAFATTGC4 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_ELENFATDALIQ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DETTAFATTGC4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DETTAFATTGC4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_DETTAFATTGC4, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_DETTAFATTGC4, "PQRY_DETTAFATTGC4");
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECFATNUMDOC, "RECFATNUMDOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECFATNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECODATADOCU, "RECODATADOCU");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECODATADOCU,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECORBENCODI,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECBENRASOES, "RECBENRASOES");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECBENRASOES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUIM, "REDEFAGCNUIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECOANNOIMPE, "RECOANNOIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_RECOANNOIMPE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUSU, "REDEFAGCNUSU");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUSU,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCANSU, "REDEFAGCANSU");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCANSU,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCCOGE, "REDEFAGCCOGE");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCCOGE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCIMII, "REDEFAGCIMII");
    IMDB.SetFldParams(IMDBDef15.PQRY_DETTAFATTGC4,IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCIMII,3,14,2);
    IMDB.TblAddNew(IMDBDef15.PQRY_DETTAFATTGC4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoEmissMandatiCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoEmissMandatiCassaEconomale()
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
    FormIdx = MyGlb.FRM_ELEEMIMACAEC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F92C2225-083F-490D-82D1-FD552F3C48A7";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 968;
    DesignHeight = 466;
    set_Caption(new IDVariant("Emiss. Mandati Cassa Economale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 968;
    Frames[1].Height = 440;
    Frames[1].Caption = "Elenco fatture da Liquidare";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_ELENFATDALIQ = new IDPanel(w, this, 1, "PAN_ELENFATDALIQ");
    Frames[1].Content = PAN_ELENFATDALIQ;
    PAN_ELENFATDALIQ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENFATDALIQ.VS = MainFrm.VisualStyleList;
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 968-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B40DBA88-7E8F-4DB8-B368-66DBDAB0B477");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 928, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENFATDALIQ.InitStatus = 2;
    PAN_ELENFATDALIQ_Init();
    PAN_ELENFATDALIQ_InitFields();
    PAN_ELENFATDALIQ_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG5+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUPFUNZAG1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG5+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMIMANCASECO+BaseCmdLinIdx)
      {
        EmissMandatiCassaEconomale();
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
      PAN_ELENFATDALIQ.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoEmissMandatiCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoEmissMandatiCassaEconomale.class.getName() : (Glb.ClassWithPackage(ElencoEmissMandatiCassaEconomale.class) ? ElencoEmissMandatiCassaEconomale.class.getName().substring(ElencoEmissMandatiCassaEconomale.class.getPackage().getName().length() + 1) : ElencoEmissMandatiCassaEconomale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco fatture da Liquidare On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENFATDALIQ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENFATDALIQ);
      // 
      // Elenco fatture da Liquidare On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ELENFATDALIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENFATDALIQ_NUMERODOC,(new IDVariant(PAN_ELENFATDALIQ.FieldText(PFL_ELENFATDALIQ_NUMERODOC))).stringValue()); 
      PAN_ELENFATDALIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENFATDALIQ_RAGISOCIESTE,(new IDVariant(PAN_ELENFATDALIQ.FieldText(PFL_ELENFATDALIQ_RAGISOCIESTE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoEmissMandatiCassaEconomale", "ElencofatturedaLiquidareOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_RECOANNOIMPE, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_RECOANNOIMPE, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUIM, 0));
      if (IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_RECOANNOIMPE, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoEmissMandatiCassaEconomale", "InfoImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCANSU, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCANSU, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef15.PQRY_DETTAFATTGC4, IMDBDef15.PQSL_DETTAFATTGC4_REDEFAGCNUSU, 0));
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoEmissMandatiCassaEconomale", "InfoSub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Emiss Mandati Cassa Economale
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EmissMandatiCassaEconomale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emiss Mandati Cassa Economale Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_EMIMANCASECO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoEmissMandatiCassaEconomale", "EmissMandatiCassaEconomale", _e);
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
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_ELENFATDALIQ.SetFlags (Glb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENFATDALIQ.SetFlags (Glb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoEmissMandatiCassaEconomale", "Load", _e);
    }
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
  private void PAN_ELENFATDALIQ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENFATDALIQ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENFATDALIQ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENFATDALIQ, Cancel);
    // Stub
  }

  private void PAN_ELENFATDALIQ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENFATDALIQ_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_ELENFATDALIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENFATDALIQ_INFOSUB)
    {
      this.IdxPanelActived = this.PAN_ELENFATDALIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSub();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENFATDALIQ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENFATDALIQ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENFATDALIQ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENFATDALIQ_Init()
  {

    PAN_ELENFATDALIQ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENFATDALIQ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENFATDALIQ.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, "F760B44F-C4CE-49D5-A7BB-37A36BC16F7D");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, "Numero Documento");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, "39F2714A-8F67-49A2-B81F-DB01F4C88C10");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, "Data Documento");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, "60983A21-7D44-4C5E-836B-7DB02FE4C580");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, "Codice");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, "Codice del beneficiario");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, "81BDA932-D011-4A2D-977F-D17004961792");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, "Ragione Sociale");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, "3F44C53B-9139-4232-A6BD-E905900D6912");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, "Numero Impegno");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, "3AC7A055-17C6-4423-BFC6-2C7E5D78EF25");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, "Anno Impegno");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, "751625DE-754C-4399-9181-4B50AAD3DCAB");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, "Info Imp");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, "0244663D-52E8-4073-B989-88345D7653FA");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, "Numero SubImpegno");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, "146E32BE-D306-4178-B601-3182D7CE39B3");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, "Anno SubImpegno");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, "FB606A8C-B127-4D8C-A5B4-05AF17EF3FA6");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, "Info Sub");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, "1AE48A4A-065C-4016-9557-4EA93FD4D434");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, "Documento");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, "56CA12BE-BB64-4029-8199-1067EBD66ABD");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, "Beneficiario");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, "FBC1AD9B-478E-4DF8-AF26-CA01179B9B84");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, "Impegno");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, "F11A4AE6-99D8-47C3-8E48-BAAE05AB6AEA");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, "SubImpegno");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, "8BFAC8C4-0E45-4709-91E3-F1169B07F45B");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, "Codice Gest.");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFATDALIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, "4CEFC0DB-E515-40D7-AC8E-93D296698A53");
    PAN_ELENFATDALIQ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, "Importo da Liq.");
    PAN_ELENFATDALIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, "");
    PAN_ELENFATDALIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENFATDALIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENFATDALIQ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_FORM, 4, 4, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMERODOC, MyGlb.PANEL_FORM, "Num. Docum.");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_NUMERODOC, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_NUMERODOC, PPQRY_DETTAFATTGC4, "B.NUMERO_DOC", "RECFATNUMDOC", 5, 20, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_LIST, 128, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_LIST, 76);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_LIST, "Data Documento");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_FORM, 4, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_FORM, 76);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_DATADOCUMENT, MyGlb.PANEL_FORM, "Dt. Docum.");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_DATADOCUMENT, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_DATADOCUMENT, PPQRY_DETTAFATTGC4, "B.D_DATA_DOC", "RECODATADOCU", 6, 10, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_LIST, 204, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_FORM, 4, 76, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_CODICE, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_CODICE, PPQRY_DETTAFATTGC4, "D.CODICE", "RECORBENCODI", 2, 15, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_LIST, 256, 36, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_LIST, 152);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_FORM, 4, 100, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_FORM, 152);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_RAGISOCIESTE, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_RAGISOCIESTE, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_RAGISOCIESTE, PPQRY_DETTAFATTGC4, "D.RAGIONE_SOCIALE_ESTESA", "RECBENRASOES", 5, 60, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_LIST, 564, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_LIST, 112);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Num. Imp.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_FORM, 112);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Numero Impegno");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_NUMEROIMPEGN, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_NUMEROIMPEGN, PPQRY_DETTAFATTGC4, "A.NUMERO_IMPEGNO", "REDEFAGCNUIM", 1, 5, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_LIST, 604, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Ann. Imp.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_FORM, 92);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Anno Impegno");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ANNOIMPEGNO, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ANNOIMPEGNO, PPQRY_DETTAFATTGC4, "A.ANNO_IMPEGNO", "RECOANNOIMPE", 1, 4, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_LIST, 640, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_LIST, 120);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_LIST, "I. I.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_FORM, 4, 148, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_FORM, 120);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOIMP, MyGlb.PANEL_FORM, "Info Imp");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_INFOIMP, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_INFOIMP, PPQRY_DUAL, "CASE WHEN (~~REDEFAGCNUIM~~ IS NULL) THEN NULL ELSE 'I' END", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 660, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 132);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 132);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero SubImpegno");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_NUMEROSUBIMP, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_NUMEROSUBIMP, PPQRY_DETTAFATTGC4, "A.NUMERO_SUBIMPEGNO", "REDEFAGCNUSU", 1, 5, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 700, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 116);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 4, 124, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 116);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "Anno SubImpegno");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ANNOSUBIMPEG, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ANNOSUBIMPEG, PPQRY_DETTAFATTGC4, "A.ANNO_SUBIMPEGNO", "REDEFAGCANSU", 1, 4, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_LIST, 736, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_LIST, 144);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_LIST, "I. S.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_FORM, 4, 172, 652, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_FORM, 144);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_INFOSUB, MyGlb.PANEL_FORM, "Info Sub");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_INFOSUB, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_INFOSUB, PPQRY_DUAL, "CASE WHEN (~~REDEFAGCNUSU~~ IS NULL) THEN NULL ELSE 'I' END", "INFOSUBIMPEG", 5, 99, 0, -13997);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOSUB, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOSUB, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENFATDALIQ.SetValueListItem(PFL_ELENFATDALIQ_INFOSUB, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_LIST, 0, 0, 204, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_LIST, 2);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_FORM, 0, 344, 204, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ETICHEDOCUME, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_LIST, 204, 0, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_LIST, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_LIST, 2);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_FORM, 204, 340, 360, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_FORM, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ETICHEBENEFI, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ETICHEBENEFI, -1, "", "ETICHEBENEFI", 0, 0, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_LIST, 564, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_FORM, 564, 344, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ETICHEIMPEGN, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ETICHEIMPEGN, -1, "", "ETICHEIMPEGN", 0, 0, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_LIST, 660, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_FORM, 660, 340, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_ETICHESUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_ETICHESUBIMP, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 756, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_LIST, "Codice Gest.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_CODICEGESTIO, MyGlb.PANEL_FORM, "Codice Gest.");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_CODICEGESTIO, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_CODICEGESTIO, PPQRY_DETTAFATTGC4, "A.CODICE_GESTIONALE", "REDEFAGCCOGE", 1, 4, 0, -13997);
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_LIST, 808, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo da Liq.");
    PAN_ELENFATDALIQ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFATDALIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_ELENFATDALIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_ELENFATDALIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFATDALIQ_IMPORTOIVA, MyGlb.PANEL_FORM, "Imp. da Liq");
    PAN_ELENFATDALIQ.SetFieldPage(PFL_ELENFATDALIQ_IMPORTOIVA, -1, -1);
    PAN_ELENFATDALIQ.SetFieldPanel(PFL_ELENFATDALIQ_IMPORTOIVA, PPQRY_DETTAFATTGC4, "A.IMPORTO_IVA", "REDEFAGCIMII", 3, 14, 2, -13997);
  }

  private void PAN_ELENFATDALIQ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENFATDALIQ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN (~~REDEFAGCNUIM~~ IS NULL) THEN NULL ELSE 'I' END as INFOIMPEGNO, ");
    SQL.append("  CASE WHEN (~~REDEFAGCNUSU~~ IS NULL) THEN NULL ELSE 'I' END as INFOSUBIMPEG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECFATNUMDOC~~ IS NULL))) ");
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ELENFATDALIQ.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENFATDALIQ.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_ELENFATDALIQ.SetIMDB(IMDB, "PQRY_DETTAFATTGC4", true);
    PAN_ELENFATDALIQ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.NUMERO_DOC as RECFATNUMDOC, ");
    SQL.append("  B.D_DATA_DOC as RECODATADOCU, ");
    SQL.append("  D.CODICE as RECORBENCODI, ");
    SQL.append("  D.RAGIONE_SOCIALE_ESTESA as RECBENRASOES, ");
    SQL.append("  A.NUMERO_IMPEGNO as REDEFAGCNUIM, ");
    SQL.append("  A.ANNO_IMPEGNO as RECOANNOIMPE, ");
    SQL.append("  A.NUMERO_SUBIMPEGNO as REDEFAGCNUSU, ");
    SQL.append("  A.ANNO_SUBIMPEGNO as REDEFAGCANSU, ");
    SQL.append("  A.CODICE_GESTIONALE as REDEFAGCCOGE, ");
    SQL.append("  A.IMPORTO_IVA as REDEFAGCIMII ");
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DETTAGLI_FATTURE_GC4 A, ");
    SQL.append("  FAT B, ");
    SQL.append("  BEN D ");
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_PROG = A.ANNO_FATTURA) ");
    SQL.append("and   (B.NUMERO_PROG = A.PROGR_FATTURA) ");
    SQL.append("and   (B.TRATTAMENTO_IVA = 'SP') ");
    SQL.append("and   (B.IMPORTO + NVL(B.VARIAZIONI, 0) - NVL(B.IMPUTATO, 0) > 0) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  RETFAT C ");
    SQL.append("where (C.FAT_ANNO_PROG_FAT = B.ANNO_PROG) ");
    SQL.append("and   (C.FAT_NUMERO_PROG_FAT = B.NUMERO_PROG) ");
    SQL.append("and   (C.PROVENIENZA = 'CASSAECON') ");
    SQL.append("))) ");
    SQL.append("and   (D.CODICE = B.CODICE) ");
    SQL.append("and   (NVL(A.IMPORTO_IVA, 0) > 0) ");
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.D_DATA_DOC, ");
    SQL.append("  B.NUMERO_DOC, ");
    SQL.append("  D.CODICE, ");
    SQL.append("  D.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  A.ANNO_IMPEGNO, ");
    SQL.append("  A.NUMERO_IMPEGNO, ");
    SQL.append("  A.ANNO_SUBIMPEGNO, ");
    SQL.append("  A.NUMERO_SUBIMPEGNO ");
    PAN_ELENFATDALIQ.SetQuery(PPQRY_DETTAFATTGC4, 5, SQL, -1, "");
    PAN_ELENFATDALIQ.SetQueryDB(PPQRY_DETTAFATTGC4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENFATDALIQ.SetMasterTable(0, "DETTAGLI_FATTURE_GC4");
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_DATADOCUMENT, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_NUMERODOC, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_CODICE, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_RAGISOCIESTE, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_ANNOIMPEGNO, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_NUMEROIMPEGN, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_ANNOSUBIMPEG, true);
    PAN_ELENFATDALIQ.AddToSortList(PFL_ELENFATDALIQ_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENFATDALIQ.Status() == 2)
    {
      int oldListQBE = PAN_ELENFATDALIQ.iUseListQBE;
      PAN_ELENFATDALIQ.iUseListQBE = 0;
      PAN_ELENFATDALIQ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENFATDALIQ.PanelCommand(Glb.PCM_FIND);
      PAN_ELENFATDALIQ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENFATDALIQ) PAN_ELENFATDALIQ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENFATDALIQ) PAN_ELENFATDALIQ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENFATDALIQ) PAN_ELENFATDALIQ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENFATDALIQ) PAN_ELENFATDALIQ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENFATDALIQ) PAN_ELENFATDALIQ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
