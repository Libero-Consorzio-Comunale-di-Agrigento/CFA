// **********************************************
// Form Rettifica Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FormRettificaImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RETTIFIMPEGN_LIQUIDAZIONI = 0;
  private static int GRP_RETTIFIMPEGN_CAPART = 1;

  private static int PFL_RETTIFIMPEGN_DAL = 0;
  private static int PFL_RETTIFIMPEGN_AL = 1;
  private static int PFL_RETTIFIMPEGN_LABEVUOTMAND = 2;
  private static int PFL_RETTIFIMPEGN_NUOVOIMPEGNO = 3;
  private static int PFL_RETTIFIMPEGN_ANNOIMPEGNO = 4;
  private static int PFL_RETTIFIMPEGN_SCELTAIMPEGN = 5;
  private static int PFL_RETTIFIMPEGN_INFOIMPEGNO = 6;
  private static int PFL_RETTIFIMPEGN_BARRA = 7;
  private static int PFL_RETTIFIMPEGN_NEWPANELLABE = 8;
  private static int PFL_RETTIFIMPEGN_TITOGRUPLABE = 9;
  private static int PFL_RETTIFIMPEGN_ELABORA = 10;

  private static int PPQRY_PARAMETRI222 = 0;


  IDPanel PAN_RETTIFIMPEGN;

  // Definition of Global Variables
  private IDVariant CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant ARTICOLO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI317(IMDB);
    //
    //
    Init_PQRY_PARAMETRI222(IMDB);
    Init_PQRY_PARAMETRI222_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI317(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI317, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI317, "TBL_PARAMETRI317");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI317,IMDBDef5.FLD_PARAMETRI317_PARAANNOIMPE,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI317, 0);
  }

  private static void Init_PQRY_PARAMETRI222(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI222, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI222, "PQRY_PARAMETRI222");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222,IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI222, 0);
  }

  private static void Init_PQRY_PARAMETRI222_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI222_RS, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI222_RS, "PQRY_PARAMETRI222_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI222_RS,IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FormRettificaImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public FormRettificaImpegno()
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
    FormIdx = MyGlb.FRM_FORMRETTIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3856E23A-BA17-4C44-BBA0-42DBD201C09E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 324;
    DesignHeight = 254;
    set_Caption(new IDVariant("Form Rettifica Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 324;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Rettifica Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_RETTIFIMPEGN = new IDPanel(w, this, 1, "PAN_RETTIFIMPEGN");
    Frames[1].Content = PAN_RETTIFIMPEGN;
    PAN_RETTIFIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIFIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D9A7CAA6-5BE7-4447-A4B4-A1D460753C24");
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIFIMPEGN.InitStatus = 2;
    PAN_RETTIFIMPEGN_Init();
    PAN_RETTIFIMPEGN_InitFields();
    PAN_RETTIFIMPEGN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI317, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FORMRETTIMPE_PARAMETRI222();
      }
      PAN_RETTIFIMPEGN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_RETTIFIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIFIMPEGN_SCELTAIMPEGN) {
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
    return (obj instanceof FormRettificaImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FormRettificaImpegno.class.getName() : (Glb.ClassWithPackage(FormRettificaImpegno.class) ? FormRettificaImpegno.class.getName().substring(FormRettificaImpegno.class.getPackage().getName().length() + 1) : FormRettificaImpegno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IDVariant v_SCAPART = null;
        v_SCAPART = (new IDVariant("Capitolo/Articolo :"));
        CAPITOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_CAPITOLO, 0);
        ARTICOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ARTICOLO, 0);
        v_SCAPART = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SCAPART, (new IDVariant(" "))), IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        PAN_RETTIFIMPEGN.set_Header(Glb.OBJ_GROUP,GRP_RETTIFIMPEGN_CAPART,v_SCAPART.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "EndModalEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Rettifica Impegno di Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARNUMLIQDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARANUMLIQAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARANUMEIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARAANNOIMPE, 0, new IDVariant());
  }

  // **********************************************************************
  // Rettifica Impegno On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETTIFIMPEGN_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_RETTIFIMPEGN, Cancel);
      // 
      // Rettifica Impegno On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0))))
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Capitolo/Articolo :", IDVariant.STRING));
        ImpParentLk(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0), CAPITOLO, ARTICOLO);
        PAN_RETTIFIMPEGN.set_FieldText(PFL_RETTIFIMPEGN_TITOGRUPLABE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (new IDVariant(" - "))), IDL.ToString(CAPITOLO)), (new IDVariant(" "))), (new IDVariant("/"))), (new IDVariant(" "))), IDL.ToString(ARTICOLO)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "RettificaImpegnoOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIFIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIFIMPEGN);
      // 
      // Rettifica Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0))))
      {
        PAN_RETTIFIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETTIFIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "RettificaImpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta Impegnol
  // **********************************************************************
  public int SceltaImpegnol ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Impegnol Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "SceltaImpegnol", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegnol
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegnol ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegnol Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0));
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "InfoImpegnol", _e);
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
    IDVariant v_NERRORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // segnalazioni bloccanti
      // 
      {
        // 
        // controllo campi valorizzati
        // 
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0)))
          {
            IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
            v_ERRORE = (new IDVariant("Estremi elaborazione incompleti!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORE); 
            return 0;
          }
        }
        // 
        // controllo se tra le liquidazioni comprese nell'intervallo esistono con l'indicazione del subimpegno
        // 
        {
          IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Tra le liquidazioni ce ne sono con sub-impegno: l'elaborazione non può essere eseguita", IDVariant.STRING));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A ");
          SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NOT ((A.ANNO_SUBIMP IS NULL))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_COUNT.compareTo((new IDVariant(0)), true)>0)
          {
            MainFrm.set_AlertMessage(v_MSG); 
            return 0;
          }
        }
      }
      // 
      // controlli non bloccanti
      // 
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Attenzione: sono presenti Liquidazioni senza imputazione economica e il nuovo impegno non ha rilevanza economica. Le imputazioni economiche dovrennao essere inserite manualemnte sulle Liquidazioni", IDVariant.STRING));
        IDVariant v_MYRILEVANECO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_MYRILEVANLIQ = new IDVariant(0,IDVariant.STRING);
        // 
        // controllo se il nuovo impegno non è rilevante economicamente
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYRILEVANECO = QV.Get("IMPRILEVAECO", IDVariant.STRING) ;
          }
          QV.Close();
          if (IDL.IsNull(v_MYRILEVANECO))
          {
            // 
            // controllo se uno dei vecchi impegni delle liquidazioni da rettificare è rilevante economicamente
            // 
            {
              SQL = new StringBuffer();
              SQL.append("select distinct ");
              SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO ");
              SQL.append("from ");
              SQL.append("  IMP A ");
              SQL.append("where (A.ANNO_IMP IN ");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  A.ANNO_IMP ");
              SQL.append("from ");
              SQL.append("  LIQ B ");
              SQL.append("where (B.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (B.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND B.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NOT ((A.RILEVANTE_ECO IS NULL))) ");
              SQL.append(") AND A.NUMERO_IMP IN ");
              SQL.append("( ");
              SQL.append("select ");
              SQL.append("  A.NUMERO_IMP ");
              SQL.append("from ");
              SQL.append("  LIQ C ");
              SQL.append("where (C.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (C.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND C.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NOT ((A.RILEVANTE_ECO IS NULL))) ");
              SQL.append(")) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_MYRILEVANLIQ = QV.Get("IMPRILEVAECO", IDVariant.STRING) ;
              }
              QV.Close();
            }
          }
          if (IDL.NullValue(v_MYRILEVANLIQ,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            MainFrm.set_AlertMessage(v_MSG); 
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.RETTIFICALIQ(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARNUMLIQDAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMLIQAL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), CAPITOLO, ARTICOLO, IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0), v_NERRORE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      // 
      // intercetto errori
      // 
      {
        IDVariant v_MSGERR = new IDVariant(0,IDVariant.STRING);
        v_MSGERR = (new IDVariant("Elaborazione terminata. Finanziamenti annullati sulle Liquidazioni in quanto non previsti sul nuovo Impegno ", IDVariant.STRING));
        IDVariant v_MSGOK = new IDVariant(0,IDVariant.STRING);
        v_MSGOK = (new IDVariant("Elaborazione terminata.", IDVariant.STRING));
        if (v_NERRORE.equals((new IDVariant(1)), true))
        {
          MainFrm.set_AlertMessage(v_MSGERR); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_MSGOK); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Parent Lk
  // numero:  - Input
  // anno:  - Input
  // Cap:  - Input/Output
  // Art:  - Input/Output
  // **********************************************************************
  public IDVariant ImpParentLk (IDVariant numero, IDVariant anno, IDVariant Cap, IDVariant Art)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imp Parent Lk Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARANUMEIMPE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI222, IMDBDef14.PQSL_PARAMETRI222_PARAANNOIMPE, 0))))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        Cap.set((new IDVariant()));
        Art.set((new IDVariant()));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
        SQL.append("  A.ARTICOLO as IMPARTICOLO, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(anno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(numero, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          Cap.set(QV.Get("IMPCAPITOLO", IDVariant.DECIMAL));
          Art.set(QV.Get("IMPARTICOLO", IDVariant.INTEGER));
          v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(v_COUNT.compareTo((new IDVariant(0)), true)>0))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Impegno di Spesa non previsto in Bilancio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return (new IDVariant(-1));
        }
        else
        {
          return (new IDVariant(1));
        }
      }
      return (new IDVariant(-2));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormRettificaImpegno", "ImpParentLk", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void FORMRETTIMPE_PARAMETRI222() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI222_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI317, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI317, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI222_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI222_RS, 0, IMDBDef5.TBL_PARAMETRI317, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI222_RS, 0, 0, IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARNUMLIQDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI222_RS, 1, 0, IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARANUMLIQAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI222_RS, 2, 0, IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARANUMEIMPE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI222_RS, 3, 0, IMDBDef5.TBL_PARAMETRI317, IMDBDef5.FLD_PARAMETRI317_PARAANNOIMPE, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI317, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI317, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI317, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI222_RS, 0);
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
  private void PAN_RETTIFIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIFIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_RETTIFIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETTIFIMPEGN_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_RETTIFIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImpegnol();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFIMPEGN_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_RETTIFIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnol();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFIMPEGN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RETTIFIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETTIFIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIFIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETTIFIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETTIFIMPEGN_Init()
  {

    PAN_RETTIFIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIFIMPEGN.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, "B7415EFE-283D-41B2-9A14-F03FA1EA77B7");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, "Liquidazioni");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, MyGlb.PANEL_FORM, 16, 15, 300, 57, 0, 0);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, 0, 66);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, 1, 13);
    PAN_RETTIFIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, 0, 4);
    PAN_RETTIFIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, 1, 4);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, "699661BF-BF4B-485E-80A4-03DDCA37E548");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, "Capitolo/ Articolo");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, MyGlb.PANEL_LIST, 0, -9999, 40, 0, 0, 0);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, MyGlb.PANEL_FORM, 16, 80, 300, 64, 0, 0);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, 0, 39);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, 1, 13);
    PAN_RETTIFIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, 0, 1);
    PAN_RETTIFIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, 1, 1);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIFIMPEGN_CAPART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIFIMPEGN.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, "D465B47D-62B7-4959-A7B6-FFC411E8D4B2");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, "Dal");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, "AE0D156D-A885-4C16-8D9B-C0AB866E46AA");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, "Al");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, "920BEB7E-4D5C-4019-9112-BCAE2627B148");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, "36990AB9-4778-423F-AAB0-DCF5D1186625");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, "Nuovo Impegno");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, "FA380121-E50C-494B-9FEA-660E217460CF");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, "Anno Impegno");
    PAN_RETTIFIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, "DAE03403-8456-42BA-8338-FDEB619367E0");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIFIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, "359611FA-88C6-40BE-A6C5-F0C125151008");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIFIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, 0, "info.gif", false);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, "AE546CCF-613F-4213-B93C-F687D46B3D9A");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, "/");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, "709919B3-8EB7-48C5-85E9-5E927E100389");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, "");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, "AE4D8801-E7FE-4057-9F93-3A793F4BE0DD");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, "Capitolo / Articolo");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.VIS_VUOGRAALILEF);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, "71255A26-081C-4E04-B4E3-57204097A5FC");
    PAN_RETTIFIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, "Elabora");
    PAN_RETTIFIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIFIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, 0, "button1.gif", false);
    PAN_RETTIFIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RETTIFIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_LIST, 108);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_FORM, 20, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_FORM, 84);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_DAL, -1, GRP_RETTIFIMPEGN_LIQUIDAZIONI);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_DAL, PPQRY_PARAMETRI222, "A.PARNUMLIQDAL", "PARNUMLIQDAL", 1, 6, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_LIST, 104);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_LIST, "Al");
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_FORM, 168, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_FORM, 20);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_AL, MyGlb.PANEL_FORM, "Al");
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_AL, -1, GRP_RETTIFIMPEGN_LIQUIDAZIONI);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_AL, PPQRY_PARAMETRI222, "A.PARANUMLIQAL", "PARANUMLIQAL", 1, 6, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_LIST, 244, 52, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_FORM, 300, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_LABEVUOTMAND, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_LABEVUOTMAND, -1, GRP_RETTIFIMPEGN_LIQUIDAZIONI);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_LABEVUOTMAND, -1, "", "LABEVUOTMAND", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, "Nuov. Imp.");
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 20, 112, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 100);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, "Nuovo Impegno");
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_NUOVOIMPEGNO, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_NUOVOIMPEGNO, PPQRY_PARAMETRI222, "A.PARANUMEIMPE", "PARANUMEIMPE", 1, 5, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Ann. Imp.");
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 192, 112, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Anno Impegno");
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_ANNOIMPEGNO, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_ANNOIMPEGNO, PPQRY_PARAMETRI222, "A.PARAANNOIMPE", "PARAANNOIMPE", 1, 5, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 244, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 240, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_SCELTAIMPEGN, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 264, 132, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 256, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_INFOIMPEGNO, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_LIST, 144, 128, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_FORM, 172, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_BARRA, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 264, 104, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 300, 84, 12, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 4);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_NEWPANELLABE, -1, GRP_RETTIFIMPEGN_CAPART);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_LIST, 72, 160, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_FORM, 24, 84, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_TITOGRUPLABE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_TITOGRUPLABE, -1, -1);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_TITOGRUPLABE, -1, "", "TITOGRUPLABE", 0, 0, 0, -13997);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_FORM, 196, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFIMPEGN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFIMPEGN.SetFieldPage(PFL_RETTIFIMPEGN_ELABORA, -1, -1);
    PAN_RETTIFIMPEGN.SetFieldPanel(PFL_RETTIFIMPEGN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_RETTIFIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIFIMPEGN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTIFIMPEGN.SetIMDB(IMDB, "PQRY_PARAMETRI222", true);
    PAN_RETTIFIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_RETTIFIMPEGN.SetQueryIMDB(PPQRY_PARAMETRI222, IMDBDef14.PQRY_PARAMETRI222_RS, IMDBDef5.TBL_PARAMETRI317);
    JustLoaded = true;
    PAN_RETTIFIMPEGN.SetFieldPrimaryIndex(PFL_RETTIFIMPEGN_DAL, IMDBDef5.FLD_PARAMETRI317_PARNUMLIQDAL);
    PAN_RETTIFIMPEGN.SetFieldPrimaryIndex(PFL_RETTIFIMPEGN_AL, IMDBDef5.FLD_PARAMETRI317_PARANUMLIQAL);
    PAN_RETTIFIMPEGN.SetFieldPrimaryIndex(PFL_RETTIFIMPEGN_NUOVOIMPEGNO, IMDBDef5.FLD_PARAMETRI317_PARANUMEIMPE);
    PAN_RETTIFIMPEGN.SetFieldPrimaryIndex(PFL_RETTIFIMPEGN_ANNOIMPEGNO, IMDBDef5.FLD_PARAMETRI317_PARAANNOIMPE);
    PAN_RETTIFIMPEGN.SetMasterTable(0, "PARAMETRI317");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIFIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_RETTIFIMPEGN.iUseListQBE;
      PAN_RETTIFIMPEGN.iUseListQBE = 0;
      PAN_RETTIFIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIFIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIFIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETTIFIMPEGN) PAN_RETTIFIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFIMPEGN) PAN_RETTIFIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTIFIMPEGN) PAN_RETTIFIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFIMPEGN) PAN_RETTIFIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RETTIFIMPEGN) PAN_RETTIFIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
