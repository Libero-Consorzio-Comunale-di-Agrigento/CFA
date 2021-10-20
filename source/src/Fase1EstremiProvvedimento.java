// **********************************************
// Fase 1 Estremi Provvedimento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Fase1EstremiProvvedimento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAVARIIMPE_PROVVEDIMENT = 0;

  private static int PFL_PARAVARIIMPE_ESTRPROVLABE = 0;
  private static int PFL_PARAVARIIMPE_DELIBERLABEL = 1;
  private static int PFL_PARAVARIIMPE_SEDEDEL = 2;
  private static int PFL_PARAVARIIMPE_TRATDELILABE = 3;
  private static int PFL_PARAVARIIMPE_NUMERODEL = 4;
  private static int PFL_PARAVARIIMPE_BARRDELILABE = 5;
  private static int PFL_PARAVARIIMPE_ANNODEL = 6;
  private static int PFL_PARAVARIIMPE_SCELTADELIBE = 7;
  private static int PFL_PARAVARIIMPE_INFODELIBERA = 8;
  private static int PFL_PARAVARIIMPE_PROPOSTLABEL = 9;
  private static int PFL_PARAVARIIMPE_UNITAPROPONE = 10;
  private static int PFL_PARAVARIIMPE_TRATPROPLABE = 11;
  private static int PFL_PARAVARIIMPE_NUMEROPROPOS = 12;
  private static int PFL_PARAVARIIMPE_BARRPROPLABE = 13;
  private static int PFL_PARAVARIIMPE_ANNOPROPOSTA = 14;
  private static int PFL_PARAVARIIMPE_VUOTOLABELSX = 15;
  private static int PFL_PARAVARIIMPE_SCELTAPROPOS = 16;
  private static int PFL_PARAVARIIMPE_INFOPROPOSTA = 17;
  private static int PFL_PARAVARIIMPE_AVANTILABEL = 18;

  private static int PPQRY_PARAVARIIMP1 = 0;


  IDPanel PAN_PARAVARIIMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARAVARIIMP1(IMDB);
    Init_PQRY_PARAVARIIMP1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARAVARIIMP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAVARIIMP1, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAVARIIMP1, "PQRY_PARAVARIIMP1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAVARIIMP1, 0);
  }

  private static void Init_PQRY_PARAVARIIMP1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAVARIIMP1_RS, "PQRY_PARAVARIIMP1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAVARIIMP1_RS,IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Fase1EstremiProvvedimento(MyWebEntryPoint w, IMDBObj imdb)
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
  public Fase1EstremiProvvedimento()
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
    FormIdx = MyGlb.FRM_FASE1ESTRPRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D182C8E2-2A33-46C6-8CA4-E1C36BF28673";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 242;
    set_Caption(new IDVariant("Fase 1 Estremi Provvedimento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 216;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Variazioni Impegnabile";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 216;
    PAN_PARAVARIIMPE = new IDPanel(w, this, 1, "PAN_PARAVARIIMPE");
    Frames[1].Content = PAN_PARAVARIIMPE;
    PAN_PARAVARIIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAVARIIMPE.VS = MainFrm.VisualStyleList;
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 216-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A22F6345-E6C5-42EA-8259-03870440B8FC");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 304, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAVARIIMPE.InitStatus = 2;
    PAN_PARAVARIIMPE_Init();
    PAN_PARAVARIIMPE_InitFields();
    PAN_PARAVARIIMPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAVARIIMPE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FASE1ESTRPRO_PARAVARIIMP1();
      }
      PAN_PARAVARIIMPE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAVARIIMPE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAVARIIMPE_SCELTADELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAVARIIMPE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAVARIIMPE_SCELTAPROPOS) {
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
    return (obj instanceof Fase1EstremiProvvedimento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Fase1EstremiProvvedimento.class.getName() : (Glb.ClassWithPackage(Fase1EstremiProvvedimento.class) ? Fase1EstremiProvvedimento.class.getName().substring(Fase1EstremiProvvedimento.class.getPackage().getName().length() + 1) : Fase1EstremiProvvedimento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fase 1 - Estremi Provvedimento", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "LoadEvent", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()) && IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue() && IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Variazioni Impegnabile On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAVARIIMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAVARIIMPE);
      // 
      // Parametri Variazioni Impegnabile On Dynamic Properties Event Body
      // Procedure Body
      // 
      VisibilitàInfo();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "ParametriVariazioniImpegnabileOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento SEDE DEL Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAVARIIMPE_SEDEDEL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento SEDE DEL Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "ProvvedimentoSEDEDELValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento UNITA PROPONENTE Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAVARIIMPE_UNITAPROPONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento UNITA PROPONENTE Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "ProvvedimentoUNITAPROPONENTEValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Info
  // **********************************************************************
  public int VisibilitàInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0))))
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0))))
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAVARIIMPE.SetFlags (Glb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "VisibilitàInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Avanti
  // **********************************************************************
  public int Avanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avanti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0))))
        {
          IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
          v_DESCRIZIONE = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DESCRIZIONE as DELDESCRIZIO ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DESCRIZIONE = QV.Get("DELDESCRIZIO", IDVariant.STRING) ;
          }
          QV.Close();
          if (IDL.IsNull(v_DESCRIZIONE) || v_DESCRIZIONE.equals((new IDVariant("")), true))
          {
            if (MainFrm.GESTIODELIBE.booleanValue())
            {
              if (IDL.IsNull(v_DESCRIZIONE))
              {
                IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                v_MESSAGGIO = (new IDVariant("Delibera non Presente", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MESSAGGIO); 
                return 0;
              }
            }
            else
            {
              IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
              v_MESSAGGIO = (new IDVariant("Delibera non Esistente. Si desidera Inserirne una nuova ?", IDVariant.STRING));
              IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);
              v_CONFERMA = (new IDVariant(6, IDVariant.INTEGER));
              v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(v_MESSAGGIO)));
              if (v_CONFERMA.booleanValue())
              {
                IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0));
                IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0));
                IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0));
                IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant("Ins")));
                MainFrm.Show(MyGlb.FRM_DELIBERA, (new IDVariant(-1)).intValue(), this); 
              }
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati Delibera Incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0))))
        {
          IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
          v_DESCRIZIONE = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.OGGETTO as PROPOSOGGETT ");
          SQL.append("from ");
          SQL.append("  PROPOSTE A ");
          SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_UNITA_PROPONENTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_PROPOSTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_PROPOSTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DESCRIZIONE = QV.Get("PROPOSOGGETT", IDVariant.STRING) ;
          }
          QV.Close();
          if (MainFrm.GESTIODELIBE.booleanValue() && (IDL.IsNull(v_DESCRIZIONE) || v_DESCRIZIONE.equals((new IDVariant("")), true)))
          {
            if (IDL.IsNull(v_DESCRIZIONE))
            {
              IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
              v_MESSAGGIO = (new IDVariant("Proposta non Presente", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati Proposta Incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_FASE2VARIIMP, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "Avanti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAVARIIMP1, IMDBDef12.PQSL_PARAVARIIMP1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiProvvedimento", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Variazioni Impegnabile
  // Primary record source for panel data
  // **********************************************************************
  private void FASE1ESTRPRO_PARAVARIIMP1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAVARIIMP1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAVARIIMPE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAVARIIMPE, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAVARIIMP1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAVARIIMP1_RS, 0, IMDBDef3.TBL_PARAVARIIMPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 0, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 1, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 2, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 3, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 4, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAVARIIMP1_RS, 5, 0, IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAVARIIMPE, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAVARIIMPE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAVARIIMPE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAVARIIMP1_RS, 0);
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
  private void PAN_PARAVARIIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAVARIIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAVARIIMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAVARIIMPE, Cancel);
    // Stub
  }

  private void PAN_PARAVARIIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAVARIIMPE_SCELTADELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAVARIIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAVARIIMPE_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAVARIIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAVARIIMPE_SCELTAPROPOS)
    {
      this.IdxPanelActived = this.PAN_PARAVARIIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAVARIIMPE_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAVARIIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAVARIIMPE_AVANTILABEL)
    {
      this.IdxPanelActived = this.PAN_PARAVARIIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Avanti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAVARIIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAVARIIMPE_SEDEDEL)
      {
        PFL_PARAVARIIMPE_SEDEDEL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAVARIIMPE_UNITAPROPONE)
      {
        PFL_PARAVARIIMPE_UNITAPROPONE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAVARIIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAVARIIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAVARIIMPE_Init()
  {

    PAN_PARAVARIIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAVARIIMPE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, "BB1696A2-FDE3-4B18-98C4-7C2E896F28AF");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, "Provvedimento");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 47, 364, 97, 0, 0);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, 0, 87);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, 1, 13);
    PAN_PARAVARIIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, 0, 4);
    PAN_PARAVARIIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, 1, 4);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAVARIIMPE_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAVARIIMPE.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, "DFB84E8B-F1FE-45FD-90C2-8C611774A034");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, "Estremi del Provvedimento");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, "F85C9B45-A3AF-446B-99F3-C7B777325893");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, "Delibera");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, "5A475061-A88D-41B2-AB1F-E8B78C23577F");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, "SEDE DEL");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, "915DF729-7D51-4CED-969B-E47CD0247B81");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, "-");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, "D1BDB5B6-5617-4173-9657-F7B051D77544");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, "NUMERO DEL");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, "4544CC79-95F7-497F-A77F-1196D855F43C");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, "/");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, "655AF869-1747-4D13-A436-E547B8ECBC71");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, "ANNO DEL");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, "BAEEDE6A-74E5-4488-8AA3-241D6A98D39E");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAVARIIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, 0, "wsearch1.gif", false);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, "607F0E5F-7060-4269-AB60-2434AAB0EF04");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAVARIIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, "6D02E05D-BC8F-45FC-B4A2-9473796EF62C");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, "Proposta");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, "FDC27E3B-95C4-4DBA-A707-C758B575BB85");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, "3853F26E-22D5-4B3C-B419-54BE55239864");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, "-");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, "D194558E-7065-4920-A288-A3CE9AEE0749");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, "A766B22B-0050-4C32-975F-9BDB6FE3F786");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, "/");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, "16FB1C11-FE1B-44C0-8B43-8B460DF0D71C");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PARAVARIIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, "D4281545-FC6F-4A46-9E0A-502CF0AF013A");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, "95EB6B4C-6B63-4626-A312-BD80D490A36C");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_PARAVARIIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, 0, "wsearch1.gif", false);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, "C9F69412-86FD-40C0-819B-7236DC9217A3");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, "");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAVARIIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, 0, "info.gif", false);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAVARIIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, "BDC2DC13-C730-452F-93E7-20B3A1413889");
    PAN_PARAVARIIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, "Avanti");
    PAN_PARAVARIIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAVARIIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, 0, "button1.gif", false);
    PAN_PARAVARIIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAVARIIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_LIST, 24, 8, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_FORM, 8, 8, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ESTRPROVLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_ESTRPROVLABE, -1, -1);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_ESTRPROVLABE, -1, "", "ESTRPROVLABE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_LIST, 8, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_FORM, 16, 72, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_DELIBERLABEL, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_FORM, 96, 72, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_SEDEDEL, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_SEDEDEL, PPQRY_PARAVARIIMP1, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_LIST, 16, 40, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_FORM, 140, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_TRATDELILABE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_LIST, "NM. D.");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_FORM, 160, 72, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_NUMERODEL, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_NUMERODEL, PPQRY_PARAVARIIMP1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_LIST, 24, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_FORM, 208, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_BARRDELILABE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_FORM, 228, 72, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_ANNODEL, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_ANNODEL, PPQRY_PARAVARIIMP1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_FORM, 268, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTADELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_SCELTADELIBE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_SCELTADELIBE, -1, "", "SCELTADELIBE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_FORM, 288, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_INFODELIBERA, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_LIST, 16, 40, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_FORM, 12, 100, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_PROPOSTLABEL, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_LIST, "U. PR.");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 96, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_UNITAPROPONE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_UNITAPROPONE, PPQRY_PARAVARIIMP1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_LIST, 24, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_FORM, 204, 100, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_TRATPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_TRATPROPLABE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_TRATPROPLABE, -1, "", "TRATPROPLABE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. PR.");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 224, 100, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_NUMEROPROPOS, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_NUMEROPROPOS, PPQRY_PARAVARIIMP1, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_LIST, 32, 56, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_FORM, 272, 100, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_BARRPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_BARRPROPLABE, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_BARRPROPLABE, -1, "", "BARRPROPLABE", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. PR.");
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 292, 100, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_ANNOPROPOSTA, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_ANNOPROPOSTA, PPQRY_PARAVARIIMP1, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_LIST, 16, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_FORM, 304, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_VUOTOLABELSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_VUOTOLABELSX, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_VUOTOLABELSX, -1, "", "VUOTOLABELSX", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_LIST, 628, 48, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_FORM, 332, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_SCELTAPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_SCELTAPROPOS, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_SCELTAPROPOS, -1, "", "SCELTAPROPOS", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_FORM, 352, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_INFOPROPOSTA, -1, GRP_PARAVARIIMPE_PROVVEDIMENT);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_LIST, 596, 312, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAVARIIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_FORM, 292, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAVARIIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAVARIIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAVARIIMPE_AVANTILABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAVARIIMPE.SetFieldPage(PFL_PARAVARIIMPE_AVANTILABEL, -1, -1);
    PAN_PARAVARIIMPE.SetFieldPanel(PFL_PARAVARIIMPE_AVANTILABEL, -1, "", "AVANTILABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARAVARIIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAVARIIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAVARIIMPE.SetIMDB(IMDB, "PQRY_PARAVARIIMP1", true);
    PAN_PARAVARIIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAVARIIMPE.SetQueryIMDB(PPQRY_PARAVARIIMP1, IMDBDef12.PQRY_PARAVARIIMP1_RS, IMDBDef3.TBL_PARAVARIIMPE);
    JustLoaded = true;
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_SEDEDEL, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL);
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_NUMERODEL, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL);
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_ANNODEL, IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL);
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_UNITAPROPONE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE);
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_NUMEROPROPOS, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA);
    PAN_PARAVARIIMPE.SetFieldPrimaryIndex(PFL_PARAVARIIMPE_ANNOPROPOSTA, IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA);
    PAN_PARAVARIIMPE.SetMasterTable(0, "PARAVARIIMPE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAVARIIMPE.Status() == 2)
    {
      int oldListQBE = PAN_PARAVARIIMPE.iUseListQBE;
      PAN_PARAVARIIMPE.iUseListQBE = 0;
      PAN_PARAVARIIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAVARIIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_PARAVARIIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAVARIIMPE) PAN_PARAVARIIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAVARIIMPE) PAN_PARAVARIIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAVARIIMPE) PAN_PARAVARIIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAVARIIMPE) PAN_PARAVARIIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAVARIIMPE) PAN_PARAVARIIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
