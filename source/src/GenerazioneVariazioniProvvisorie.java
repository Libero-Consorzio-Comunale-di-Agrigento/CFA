// **********************************************
// Generazione Variazioni Provvisorie
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneVariazioniProvvisorie extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_GENEVARIPROV_PROPOSTA = 0;
  private static int PFL_GENEVARIPROV_NUMEROPROPOS = 1;
  private static int PFL_GENEVARIPROV_ANNOPROPOSTA = 2;
  private static int PFL_GENEVARIPROV_DATAVARIAZIO = 3;
  private static int PFL_GENEVARIPROV_TRATT = 4;
  private static int PFL_GENEVARIPROV_TRATT1 = 5;
  private static int PFL_GENEVARIPROV_APRI = 6;
  private static int PFL_GENEVARIPROV_INFO = 7;
  private static int PFL_GENEVARIPROV_ELABORA = 8;

  private static int PPQRY_PAR73 = 0;


  IDPanel PAN_GENEVARIPROV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR74(IMDB);
    //
    //
    Init_PQRY_PAR73(IMDB);
    Init_PQRY_PAR73_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR74(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR74, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR74, "TBL_PAR74");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMDATVAR,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR74,IMDBDef4.FLD_PAR74_ROWNAMEVARID,1,8,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR74, 0);
  }

  private static void Init_PQRY_PAR73(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR73, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR73, "PQRY_PAR73");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73,IMDBDef12.PQSL_PAR73_ROWNAMDATVAR,6,14,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR73, 0);
  }

  private static void Init_PQRY_PAR73_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR73_RS, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR73_RS, "PQRY_PAR73_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR73_RS,IMDBDef12.PQSL_PAR73_ROWNAMDATVAR,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneVariazioniProvvisorie(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneVariazioniProvvisorie()
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
    FormIdx = MyGlb.FRM_GENEVARIPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C35F8AE2-99A2-4477-BC0E-05A1DCB573E9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 170;
    set_Caption(new IDVariant("Generazione Variazioni Provvisorie"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Variazioni Provvisorie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_GENEVARIPROV = new IDPanel(w, this, 1, "PAN_GENEVARIPROV");
    Frames[1].Content = PAN_GENEVARIPROV;
    PAN_GENEVARIPROV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENEVARIPROV.VS = MainFrm.VisualStyleList;
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4FEDD310-D712-4D0F-BEF1-7EBF049086F0");
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 184, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENEVARIPROV.InitStatus = 2;
    PAN_GENEVARIPROV_Init();
    PAN_GENEVARIPROV_InitFields();
    PAN_GENEVARIPROV_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PAR74, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEVARIPROV_PAR73();
      }
      PAN_GENEVARIPROV.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_GENEVARIPROV.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENEVARIPROV_APRI) {
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
    return (obj instanceof GenerazioneVariazioniProvvisorie);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneVariazioniProvvisorie.class.getName() : (Glb.ClassWithPackage(GenerazioneVariazioniProvvisorie.class) ? GenerazioneVariazioniProvvisorie.class.getName().substring(GenerazioneVariazioniProvvisorie.class.getPackage().getName().length() + 1) : GenerazioneVariazioniProvvisorie.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMEROVAR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Per la generazione di Variazioni Provvisorie è obbligatorio indicare la Proposta", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLGENERAVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMEVARID, 0), IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMDATVAR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NUMEROVAR);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Generazione eseguita. Inserite ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NUMEROVAR)), (new IDVariant(" "))), IDL.Lower((new IDVariant("Variazioni"))))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMDATVAR, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni Provvisorie On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENEVARIPROV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_GENEVARIPROV);
      // 
      // Generazione Variazioni Provvisorie On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR73, IMDBDef12.PQSL_PAR73_ROWNAMANNPRO, 0))))
      {
        PAN_GENEVARIPROV.SetFlags (Glb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_GENEVARIPROV.SetFlags (Glb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProvvisorie", "GenerazioneVariazioniProvvisorieOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void GENEVARIPROV_PAR73() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR73_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAR74, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAR74, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR73_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR73_RS, 0, IMDBDef4.TBL_PAR74, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR73_RS, 0, 0, IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR73_RS, 1, 0, IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR73_RS, 2, 0, IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR73_RS, 3, 0, IMDBDef4.TBL_PAR74, IMDBDef4.FLD_PAR74_ROWNAMDATVAR, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PAR74, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAR74, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAR74, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR73_RS, 0);
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
  private void PAN_GENEVARIPROV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENEVARIPROV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENEVARIPROV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENEVARIPROV, Cancel);
    // Stub
  }

  private void PAN_GENEVARIPROV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENEVARIPROV_APRI)
    {
      this.IdxPanelActived = this.PAN_GENEVARIPROV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENEVARIPROV_INFO)
    {
      this.IdxPanelActived = this.PAN_GENEVARIPROV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENEVARIPROV_ELABORA)
    {
      this.IdxPanelActived = this.PAN_GENEVARIPROV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENEVARIPROV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_GENEVARIPROV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENEVARIPROV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENEVARIPROV_Init()
  {

    PAN_GENEVARIPROV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENEVARIPROV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENEVARIPROV.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, "18DE7363-78F6-457D-8FD7-A1768290C23D");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, "Proposta");
    PAN_GENEVARIPROV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, "0CD15A26-BC32-43A2-B48C-A44B0D20B6D8");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, "Numero Proposta");
    PAN_GENEVARIPROV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, "A99CE920-6D28-47A3-9444-BF3EB210E7A5");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, "Anno Proposta");
    PAN_GENEVARIPROV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, "61B89951-57A5-4341-B06E-04ADEB5E98AB");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, "Data Variazioni");
    PAN_GENEVARIPROV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, "901DB0EE-BA3A-4EDB-B791-C2B19CB07583");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, "-");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.VIS_VUOTONORMALE);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, "B1B59D29-5C05-4CD8-819B-C5631A606181");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, "/");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.VIS_VUOTONORMALE);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, "FBA9A53D-F89E-4FEC-94C0-41FBD3E2EF8C");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIPROV.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, 0, "wsearch.gif", false);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, "BCCC13E0-3C53-4517-8FD6-1FF1E671546D");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, "");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIPROV.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, 0, "info.gif", false);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENEVARIPROV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, "B4219185-A51A-4494-B5B2-36D03E7CE650");
    PAN_GENEVARIPROV.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, "Elabora");
    PAN_GENEVARIPROV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_GENEVARIPROV.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, 0, "button1.gif", false);
    PAN_GENEVARIPROV.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENEVARIPROV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_LIST, "Prop.");
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_FORM, 20, 4, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_PROPOSTA, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_PROPOSTA, PPQRY_PAR73, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_FORM, 256, 4, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_FORM, 104);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_NUMEROPROPOS, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_NUMEROPROPOS, PPQRY_PAR73, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_FORM, 312, 4, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_ANNOPROPOSTA, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_ANNOPROPOSTA, PPQRY_PAR73, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_LIST, "Data Variazioni");
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_FORM, 28, 28, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_DATAVARIAZIO, MyGlb.PANEL_FORM, "Data Variazioni");
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_DATAVARIAZIO, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_DATAVARIAZIO, PPQRY_PAR73, "A.ROWNAMDATVAR", "ROWNAMDATVAR", 6, 14, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_LIST, 144, 4, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_FORM, 236, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_TRATT, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_TRATT, -1, "", "TRATT", 0, 0, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_LIST, 152, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_FORM, 292, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_TRATT1, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_TRATT1, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_TRATT1, -1, "", "TRATT1", 0, 0, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_LIST, 244, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_FORM, 348, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_APRI, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_APRI, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_LIST, 252, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_FORM, 364, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_INFO, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_INFO, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_LIST, 204, 68, 60, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROV.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_FORM, 264, 72, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROV.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROV_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROV.SetFieldPage(PFL_GENEVARIPROV_ELABORA, -1, -1);
    PAN_GENEVARIPROV.SetFieldPanel(PFL_GENEVARIPROV_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_GENEVARIPROV_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENEVARIPROV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENEVARIPROV.SetIMDB(IMDB, "PQRY_PAR73", true);
    PAN_GENEVARIPROV.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_GENEVARIPROV.SetQueryIMDB(PPQRY_PAR73, IMDBDef12.PQRY_PAR73_RS, IMDBDef4.TBL_PAR74);
    JustLoaded = true;
    PAN_GENEVARIPROV.SetFieldPrimaryIndex(PFL_GENEVARIPROV_PROPOSTA, IMDBDef4.FLD_PAR74_ROWNAMUNIPRO);
    PAN_GENEVARIPROV.SetFieldPrimaryIndex(PFL_GENEVARIPROV_NUMEROPROPOS, IMDBDef4.FLD_PAR74_ROWNAMNUMPRO);
    PAN_GENEVARIPROV.SetFieldPrimaryIndex(PFL_GENEVARIPROV_ANNOPROPOSTA, IMDBDef4.FLD_PAR74_ROWNAMANNPRO);
    PAN_GENEVARIPROV.SetFieldPrimaryIndex(PFL_GENEVARIPROV_DATAVARIAZIO, IMDBDef4.FLD_PAR74_ROWNAMDATVAR);
    PAN_GENEVARIPROV.SetMasterTable(0, "PAR74");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENEVARIPROV.Status() == 2)
    {
      int oldListQBE = PAN_GENEVARIPROV.iUseListQBE;
      PAN_GENEVARIPROV.iUseListQBE = 0;
      PAN_GENEVARIPROV.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENEVARIPROV.PanelCommand(Glb.PCM_FIND);
      PAN_GENEVARIPROV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENEVARIPROV) PAN_GENEVARIPROV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENEVARIPROV) PAN_GENEVARIPROV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENEVARIPROV) PAN_GENEVARIPROV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENEVARIPROV) PAN_GENEVARIPROV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENEVARIPROV) PAN_GENEVARIPROV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
