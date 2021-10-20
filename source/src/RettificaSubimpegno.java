// **********************************************
// Rettifica Subimpegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaSubimpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RETTISUBIMPE_LIQUIDAZIONI = 0;
  private static int GRP_RETTISUBIMPE_RIFEALBILCAP = 1;

  private static int PFL_RETTISUBIMPE_DAL = 0;
  private static int PFL_RETTISUBIMPE_AL = 1;
  private static int PFL_RETTISUBIMPE_LABEVUOTMAND = 2;
  private static int PFL_RETTISUBIMPE_NUOVOSUBIMPE = 3;
  private static int PFL_RETTISUBIMPE_ANNOSUBIMPEG = 4;
  private static int PFL_RETTISUBIMPE_SCELTAIMPEGN = 5;
  private static int PFL_RETTISUBIMPE_INFOIMPEGNO = 6;
  private static int PFL_RETTISUBIMPE_BARRA = 7;
  private static int PFL_RETTISUBIMPE_NEWPANELLAB1 = 8;
  private static int PFL_RETTISUBIMPE_ELABORA = 9;
  private static int PFL_RETTISUBIMPE_NEWPANELLABE = 10;

  private static int PPQRY_PARAMETRI232 = 0;


  IDPanel PAN_RETTISUBIMPE;

  // Definition of Global Variables
  private IDVariant CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ANNOIMPEGNO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant NUMEROIMPEGN = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI166(IMDB);
    //
    //
    Init_PQRY_PARAMETRI232(IMDB);
    Init_PQRY_PARAMETRI232_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI166(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI166, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI166, "TBL_PARAMETRI166");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI166,IMDBDef5.FLD_PARAMETRI166_PARAANNOSUBI,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI166, 0);
  }

  private static void Init_PQRY_PARAMETRI232(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI232, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI232, "PQRY_PARAMETRI232");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232,IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI232, 0);
  }

  private static void Init_PQRY_PARAMETRI232_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI232_RS, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI232_RS, "PQRY_PARAMETRI232_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, "PARNUMLIQDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, "PARANUMLIQAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI232_RS,IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaSubimpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaSubimpegno()
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
    FormIdx = MyGlb.FRM_RETTIFSUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E511A35B-3540-485B-AC17-4D7117095D83";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 368;
    DesignHeight = 254;
    set_Caption(new IDVariant("Rettifica Subimpegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 368;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Rettifica Sub Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_RETTISUBIMPE = new IDPanel(w, this, 1, "PAN_RETTISUBIMPE");
    Frames[1].Content = PAN_RETTISUBIMPE;
    PAN_RETTISUBIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTISUBIMPE.VS = MainFrm.VisualStyleList;
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 368-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AFAD8DA6-8519-4F31-95D5-E2D25547FA34");
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTISUBIMPE.InitStatus = 2;
    PAN_RETTISUBIMPE_Init();
    PAN_RETTISUBIMPE_InitFields();
    PAN_RETTISUBIMPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI166, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIFSUBIMP_PARAMETRI232();
      }
      PAN_RETTISUBIMPE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUT && flRis && IdxPanelActived == PAN_RETTISUBIMPE.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTISUBIMPE_SCELTAIMPEGN) {
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
    return (obj instanceof RettificaSubimpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaSubimpegno.class.getName() : (Glb.ClassWithPackage(RettificaSubimpegno.class) ? RettificaSubimpegno.class.getName().substring(RettificaSubimpegno.class.getPackage().getName().length() + 1) : RettificaSubimpegno.class.getName()));
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUT)), true) && Result.booleanValue())
      {
        IDVariant v_SCAPART22 = new IDVariant(0,IDVariant.STRING);
        v_SCAPART22 = (new IDVariant("Capitolo/Artico", IDVariant.STRING));
        IDVariant v_SCAPART = null;
        v_SCAPART = (new IDVariant("Capitolo/Articolo :"));
        CAPITOLO = IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_CAPITOLO, 0);
        ARTICOLO = IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ARTICOLO, 0);
        v_SCAPART = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SCAPART, (new IDVariant(" "))), IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, 0));
        PAN_RETTISUBIMPE.set_Header(Glb.OBJ_GROUP,GRP_RETTISUBIMPE_RIFEALBILCAP,v_SCAPART.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "EndModalEvent", _e);
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
      v_NOMECAPTION = (new IDVariant("Rettifica Sub-Impegno di Liquidazioni", IDVariant.STRING));
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
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARNUMLIQDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARANUMLIQAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARANUMESUBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARAANNOSUBI, 0, new IDVariant());
  }

  // **********************************************************************
  // Rettifica Sub Impegno On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETTISUBIMPE_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_RETTISUBIMPE, Cancel);
      // 
      // Rettifica Sub Impegno On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0))))
      {
        IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
        v_NOMECAPTION = (new IDVariant("Capitolo/Articolo :", IDVariant.STRING));
        ImpParentLk(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0), CAPITOLO, ARTICOLO, NUMEROIMPEGN, ANNOIMPEGNO);
        PAN_RETTISUBIMPE.set_FieldText(PFL_RETTISUBIMPE_NEWPANELLABE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_NOMECAPTION, (new IDVariant(" "))), IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "RettificaSubImpegnoOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Sub Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTISUBIMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTISUBIMPE);
      // 
      // Rettifica Sub Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0))))
      {
        PAN_RETTISUBIMPE.SetFlags (Glb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETTISUBIMPE.SetFlags (Glb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "RettificaSubImpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta Subimpegnol
  // **********************************************************************
  public int SceltaSubimpegnol ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Subimpegnol Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "SceltaSubimpegnol", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Subimpegnol
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoSubimpegnol ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Subimpegnol Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0));
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "InfoSubimpegnol", _e);
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
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0)))
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
          IDVariant v_MYCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Sono presenti liquidazioni su impegni diversi a quello del Sub-Impegno: la rettifica non può essere eseguita", IDVariant.STRING));
          IDVariant v_MYANNOIMP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MYNUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
          SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP ");
          SQL.append("from ");
          SQL.append("  SUBIMP A ");
          SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_SUBIMP >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_SUBIMP <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(CAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(ARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYANNOIMP = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
            v_MYNUMEROIMP = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A ");
          SQL.append("where (A.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_MYCOUNT.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant v_DA = new IDVariant(0,IDVariant.INTEGER);
            IDVariant A = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_TANNOIMP = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_TNUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_TCOUNT = new IDVariant(0,IDVariant.INTEGER);
            v_DA = IDL.Sub(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), (new IDVariant(1)));
            A = IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0);
            while (v_DA.equals(A, true))
            {
              v_DA = IDL.Add(v_DA, (new IDVariant(1)));
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1, ");
              SQL.append("  A.ANNO_IMP as LIQANNOIMP, ");
              SQL.append("  A.NUMERO_IMP as LIQNUMEROIMP ");
              SQL.append("from ");
              SQL.append("  LIQ A ");
              SQL.append("where (A.NUMERO_LIQ = " + IDL.CSql(v_DA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
              SQL.append("group by ");
              SQL.append("  A.ANNO_IMP, ");
              SQL.append("  A.NUMERO_IMP ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_TCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                v_TANNOIMP = QV.Get("LIQANNOIMP", IDVariant.INTEGER) ;
                v_TNUMEROIMP = QV.Get("LIQNUMEROIMP", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_TCOUNT.compareTo((new IDVariant(0)), true)>0)
              {
                if (v_TANNOIMP.equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
                {
                  if (v_TNUMEROIMP.compareTo(NUMEROIMPEGN, true)!=0)
                  {
                    MainFrm.set_AlertMessage(v_MSG); 
                    return 0;
                  }
                }
                else
                {
                  MainFrm.set_AlertMessage(v_MSG); 
                  return 0;
                }
              }
            }
          }
        }
      }
      // 
      // controlli non bloccanti
      // 
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Attenzione: sono presenti liquidazioni senza imputazione economica e il nuovo sub-Impegno non ha rilevanza economica. Le imputazionie conomiche dovranno essere inserite manualmente sulle liquidazioni", IDVariant.STRING));
        IDVariant v_MYRILEVANIMP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_MYRILEVANLIQ = new IDVariant(0,IDVariant.STRING);
        // 
        // controllo se impegno non è rilevante economicamente
        // 
        {
          if (IDL.IsNull(v_MYRILEVANIMP))
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
            SQL.append("and   (B.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND B.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NOT ((A.RILEVANTE_ECO IS NULL))) ");
            SQL.append(") AND A.NUMERO_IMP IN ");
            SQL.append("( ");
            SQL.append("select ");
            SQL.append("  A.NUMERO_IMP ");
            SQL.append("from ");
            SQL.append("  LIQ C ");
            SQL.append("where (C.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (C.NUMERO_LIQ >= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND C.NUMERO_LIQ <= " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
          if (IDL.NullValue(v_MYRILEVANLIQ,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            MainFrm.set_AlertMessage(v_MSG); 
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.RETTIFICALIQSUB(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARNUMLIQDAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMLIQAL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), CAPITOLO, ARTICOLO, IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0), v_NERRORE);
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
        v_MSGERR = (new IDVariant("Elaborazione terminata. Finanziamenti annullati sulle Liquidazioni in quanto non previsti sul nuovo Sub- Impegno ", IDVariant.STRING));
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
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Parent Lk
  // Numero Subimpegno:  - Input
  // Anno Subimpegno:  - Input
  // Cap:  - Input/Output
  // Art:  - Input/Output
  // Numeroimpegno:  - Input/Output
  // Annoimpegno:  - Input/Output
  // **********************************************************************
  public IDVariant ImpParentLk (IDVariant NumeroSubimpegno, IDVariant AnnoSubimpegno, IDVariant Cap, IDVariant Art, IDVariant Numeroimpegno, IDVariant Annoimpegno)
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0))))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        Cap.set((new IDVariant()));
        Art.set((new IDVariant()));
        Numeroimpegno.set((new IDVariant()));
        Annoimpegno.set((new IDVariant()));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as SUBIMPCAPITO, ");
        SQL.append("  A.ARTICOLO as SUBIMPARTICO, ");
        SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP, ");
        SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubimpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubimpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO, ");
        SQL.append("  A.NUMERO_IMP, ");
        SQL.append("  A.ANNO_IMP ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          Cap.set(QV.Get("SUBIMPCAPITO", IDVariant.DECIMAL));
          Art.set(QV.Get("SUBIMPARTICO", IDVariant.INTEGER));
          Numeroimpegno.set(QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER));
          Annoimpegno.set(QV.Get("SUBIMANNOIMP", IDVariant.INTEGER));
          v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(v_COUNT.compareTo((new IDVariant(0)), true)!=0))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Sub-Impegno di Spesa non previsto in Bilancio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return (new IDVariant(-1));
        }
        else
        {
          return (new IDVariant(0));
        }
      }
      return (new IDVariant(-2));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "ImpParentLk", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Riferimento al Bilancio P E G Nuovo Sub-Impegno Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_RETTISUBIMPE_NUOVOSUBIMPE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riferimento al Bilancio P E G Nuovo Sub-Impegno Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0))))
      {
        ImpParentLk(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0), CAPITOLO, ARTICOLO, NUMEROIMPEGN, ANNOIMPEGNO);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "RiferimentoalBilancioPEGNuovoSub-ImpegnoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Riferimento al Bilancio P E G Anno Subimpegno Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_RETTISUBIMPE_ANNOSUBIMPEG_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riferimento al Bilancio P E G Anno Subimpegno Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0))))
      {
        ImpParentLk(IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARANUMESUBI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI232, IMDBDef14.PQSL_PARAMETRI232_PARAANNOSUBI, 0), CAPITOLO, ARTICOLO, NUMEROIMPEGN, ANNOIMPEGNO);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubimpegno", "RiferimentoalBilancioPEGAnnoSubimpegnoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIFSUBIMP_PARAMETRI232() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI232_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI166, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI166, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI232_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI232_RS, 0, IMDBDef5.TBL_PARAMETRI166, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI232_RS, 0, 0, IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARNUMLIQDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI232_RS, 1, 0, IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARANUMLIQAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI232_RS, 2, 0, IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARANUMESUBI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI232_RS, 3, 0, IMDBDef5.TBL_PARAMETRI166, IMDBDef5.FLD_PARAMETRI166_PARAANNOSUBI, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI166, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI166, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI166, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI232_RS, 0);
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
  private void PAN_RETTISUBIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTISUBIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_RETTISUBIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETTISUBIMPE_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_RETTISUBIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubimpegnol();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTISUBIMPE_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_RETTISUBIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubimpegnol();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTISUBIMPE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RETTISUBIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETTISUBIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_RETTISUBIMPE_NUOVOSUBIMPE)
      {
        PFL_RETTISUBIMPE_NUOVOSUBIMPE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_RETTISUBIMPE_ANNOSUBIMPEG)
      {
        PFL_RETTISUBIMPE_ANNOSUBIMPEG_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_RETTISUBIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETTISUBIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETTISUBIMPE_Init()
  {

    PAN_RETTISUBIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTISUBIMPE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, "A228D7C7-90F7-4A0B-A293-D16E2E211E56");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, "Liquidazioni");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, MyGlb.PANEL_FORM, 16, 15, 320, 57, 0, 0);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, 0, 66);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, 1, 13);
    PAN_RETTISUBIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, 0, 4);
    PAN_RETTISUBIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, 1, 4);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, "34E5787C-ACB2-4950-B912-6ECCA0A39735");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, "Riferimento al Bilancio CapArt");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, MyGlb.PANEL_LIST, 0, -9999, 40, 0, 0, 0);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, MyGlb.PANEL_FORM, 16, 80, 320, 60, 0, 0);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, 0, 168);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, 1, 13);
    PAN_RETTISUBIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, 0, 1);
    PAN_RETTISUBIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, 1, 1);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTISUBIMPE_RIFEALBILCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTISUBIMPE.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, "DB27A5A7-93A8-4325-8B51-BE6A7F21C880");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, "Dal");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, "E0E30932-2BFA-4EBB-88E5-F9F8A909074D");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, "Al");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, "C1B1FCEA-C24D-400C-8365-99A18058D84C");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.VIS_VUOTONORMALE);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, "7E203BEA-356E-484C-9E92-5E12EB0D7BFC");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, "Nuovo Sub-Impegno");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, "34C75173-8C89-4DE4-9800-F2F372AE5536");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, "Anno Subimpegno");
    PAN_RETTISUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, "A5EED63C-D5E5-4622-A473-E4898CB126D2");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_RETTISUBIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, "737712FF-2DB4-4EAF-8040-D1145BCF10E9");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_RETTISUBIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, 0, "info.gif", false);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, "FB58CF82-0D61-4FFF-897C-F86B887972AB");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, "/");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, "051FB045-D8C6-4787-9B21-53958E0ECE5D");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, "");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, "E5E0972F-8665-4381-AB19-147C7115475D");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, "Elabora");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RETTISUBIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, 0, "button1.gif", false);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTISUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, "341DD0DD-2519-4604-84AF-BDA773884990");
    PAN_RETTISUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, "Capitolo/Articolo");
    PAN_RETTISUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.VIS_VUOGRAALILEF);
    PAN_RETTISUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_RETTISUBIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_LIST, 108);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_FORM, 20, 40, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_FORM, 116);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_DAL, -1, GRP_RETTISUBIMPE_LIQUIDAZIONI);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_DAL, PPQRY_PARAMETRI232, "A.PARNUMLIQDAL", "PARNUMLIQDAL", 1, 6, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_LIST, 104);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_LIST, "Al");
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_FORM, 196, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_FORM, 20);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_AL, MyGlb.PANEL_FORM, "Al");
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_AL, -1, GRP_RETTISUBIMPE_LIQUIDAZIONI);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_AL, PPQRY_PARAMETRI232, "A.PARANUMLIQAL", "PARANUMLIQAL", 1, 6, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_LIST, 244, 52, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_FORM, 320, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_LABEVUOTMAND, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_LABEVUOTMAND, -1, GRP_RETTISUBIMPE_LIQUIDAZIONI);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_LABEVUOTMAND, -1, "", "LABEVUOTMAND", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 92);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_LIST, "Nv. S. Imp.");
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 20, 108, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 128);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NUOVOSUBIMPE, MyGlb.PANEL_FORM, "Nuovo Sub-Impegno");
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_NUOVOSUBIMPE, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_NUOVOSUBIMPE, PPQRY_PARAMETRI232, "A.PARANUMESUBI", "PARANUMESUBI", 1, 5, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 80);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 220, 108, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 120);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "Anno Subimpegno");
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_ANNOSUBIMPEG, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_ANNOSUBIMPEG, PPQRY_PARAMETRI232, "A.PARAANNOSUBI", "PARAANNOSUBI", 1, 5, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_LIST, 244, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_FORM, 268, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_SCELTAIMPEGN, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_LIST, 264, 132, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_FORM, 284, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_INFOIMPEGNO, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_LIST, 144, 128, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_FORM, 200, 108, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_BARRA, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_LIST, 260, 104, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_FORM, 324, 84, 8, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLAB1, MyGlb.PANEL_FORM, 4);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_NEWPANELLAB1, -1, GRP_RETTISUBIMPE_RIFEALBILCAP);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_FORM, 240, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_ELABORA, -1, -1);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_LIST, 28, 152, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_RETTISUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_FORM, 28, 84, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTISUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_RETTISUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTISUBIMPE_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_RETTISUBIMPE.SetFieldPage(PFL_RETTISUBIMPE_NEWPANELLABE, -1, -1);
    PAN_RETTISUBIMPE.SetFieldPanel(PFL_RETTISUBIMPE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
  }

  private void PAN_RETTISUBIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTISUBIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTISUBIMPE.SetIMDB(IMDB, "PQRY_PARAMETRI232", true);
    PAN_RETTISUBIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_RETTISUBIMPE.SetQueryIMDB(PPQRY_PARAMETRI232, IMDBDef14.PQRY_PARAMETRI232_RS, IMDBDef5.TBL_PARAMETRI166);
    JustLoaded = true;
    PAN_RETTISUBIMPE.SetFieldPrimaryIndex(PFL_RETTISUBIMPE_DAL, IMDBDef5.FLD_PARAMETRI166_PARNUMLIQDAL);
    PAN_RETTISUBIMPE.SetFieldPrimaryIndex(PFL_RETTISUBIMPE_AL, IMDBDef5.FLD_PARAMETRI166_PARANUMLIQAL);
    PAN_RETTISUBIMPE.SetFieldPrimaryIndex(PFL_RETTISUBIMPE_NUOVOSUBIMPE, IMDBDef5.FLD_PARAMETRI166_PARANUMESUBI);
    PAN_RETTISUBIMPE.SetFieldPrimaryIndex(PFL_RETTISUBIMPE_ANNOSUBIMPEG, IMDBDef5.FLD_PARAMETRI166_PARAANNOSUBI);
    PAN_RETTISUBIMPE.SetMasterTable(0, "PARAMETRI166");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTISUBIMPE.Status() == 2)
    {
      int oldListQBE = PAN_RETTISUBIMPE.iUseListQBE;
      PAN_RETTISUBIMPE.iUseListQBE = 0;
      PAN_RETTISUBIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTISUBIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_RETTISUBIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETTISUBIMPE) PAN_RETTISUBIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTISUBIMPE) PAN_RETTISUBIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTISUBIMPE) PAN_RETTISUBIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTISUBIMPE) PAN_RETTISUBIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RETTISUBIMPE) PAN_RETTISUBIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
