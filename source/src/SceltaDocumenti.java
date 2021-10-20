// **********************************************
// Scelta Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDocumenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DOCUMENTI_NUMERODOC = 0;
  private static int PFL_DOCUMENTI_DDATADOC = 1;
  private static int PFL_DOCUMENTI_TIPO = 2;
  private static int PFL_DOCUMENTI_DALIQUIDARE = 3;
  private static int PFL_DOCUMENTI_NUMEROPROT = 4;
  private static int PFL_DOCUMENTI_DDATAPROT = 5;
  private static int PFL_DOCUMENTI_SCADENZA = 6;
  private static int PFL_DOCUMENTI_QUIETANZA = 7;
  private static int PFL_DOCUMENTI_UFFICIO = 8;
  private static int PFL_DOCUMENTI_CIG = 9;
  private static int PFL_DOCUMENTI_CUP = 10;
  private static int PFL_DOCUMENTI_LABELDOCUMEN = 11;
  private static int PFL_DOCUMENTI_LABELPROTOCO = 12;
  private static int PFL_DOCUMENTI_ANNODOC = 13;
  private static int PFL_DOCUMENTI_ANNOPROG = 14;
  private static int PFL_DOCUMENTI_NUMEROPROG = 15;
  private static int PFL_DOCUMENTI_CODICE = 16;

  private static int PPQRY_FAT12 = 0;


  IDPanel PAN_DOCUMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI310(IMDB);
    //
    //
    Init_PQRY_FAT12(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI310(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI310, 7);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI310, "TBL_PARAMETRI310");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMSOGGETT, "PARAMSOGGETT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMSOGGETT,1,6,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMANNODOC, "PARAMANNODOC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMANNODOC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMNUMEDOC, "PARAMNUMEDOC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMTUTTI, "PARAMTUTTI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMTUTTI,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMBUONI, "PARAMBUONI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMBUONI,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMSTORNO, "PARAMSTORNO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI310,IMDBDef1.FLD_PARAMETRI310_PARAMSTORNO,1,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI310, 0);
  }

  private static void Init_PQRY_FAT12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_FAT12, 25);
    IMDB.set_TblCode(IMDBDef7.PQRY_FAT12, "PQRY_FAT12");
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_RIF, "NUMERO_RIF");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_RIF,5,20,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATTIPO, "FATTIPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATTIPO,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATDALIQUIDA, "FATDALIQUIDA");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATDALIQUIDA,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_PROT, "NUMERO_PROT");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUMERO_PROT,1,7,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_DATA_PROT, "D_DATA_PROT");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_DATA_PROT,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_SCADENZA, "D_SCADENZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_D_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATQUIETANZA, "FATQUIETANZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATUFFICIO, "FATUFFICIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATUFFICIO,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_CODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FABERASOESES, "FABERASOESES");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FABERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_UFFICIO_INVIO, "UFFICIO_INVIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_UFFICIO_INVIO,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_CATEGORIA,5,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATT08DESCRI, "FATT08DESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATT08DESCRI,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_IMPUTATO, "IMPUTATO");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_IMPUTATO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_RIF, "ANNO_RIF");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_ANNO_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATCIG, "FATCIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATCIG,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATCUP, "FATCUP");
    IMDB.SetFldParams(IMDBDef7.PQRY_FAT12,IMDBDef7.PQSL_FAT12_FATCUP,5,15,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_FAT12, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDocumenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDocumenti()
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
    FormIdx = MyGlb.FRM_SCELTADOCUME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "97F29E28-4BA2-49F3-AE6D-5CA3D6069A1E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 980;
    DesignHeight = 374;
    set_Caption(new IDVariant("Scelta Documenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 980;
    Frames[1].Height = 348;
    Frames[1].Caption = "Documenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_DOCUMENTI = new IDPanel(w, this, 1, "PAN_DOCUMENTI");
    Frames[1].Content = PAN_DOCUMENTI;
    PAN_DOCUMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 980-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AE9FE5CE-8E16-49D5-AD20-8CEDDA175192");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1512, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI.InitStatus = 1;
    PAN_DOCUMENTI_Init();
    PAN_DOCUMENTI_InitFields();
    PAN_DOCUMENTI_InitQueries();
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
      PAN_DOCUMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDocumenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDocumenti.class.getName() : (Glb.ClassWithPackage(SceltaDocumenti.class) ? SceltaDocumenti.class.getName().substring(SceltaDocumenti.class.getPackage().getName().length() + 1) : SceltaDocumenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Documenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DOCUMENTI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti After Find Event Body
      // Procedure Body
      // 
      Ordinamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDocumenti", "DocumentiAfterFindEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Documenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDocumenti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinamento
  // **********************************************************************
  public int Ordinamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinamento Body
      // Procedure Body
      // 
      PAN_DOCUMENTI.ResetSortList();
      if (MainFrm.ORDIELENDOCU.equals((new IDVariant(0)), true))
      {
        PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_ANNODOC, (new IDVariant(-1)).booleanValue()); 
        PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NUMERODOC, (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_DDATAPROT, (new IDVariant(-1)).booleanValue()); 
        PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_NUMEROPROT, (new IDVariant(-1)).booleanValue()); 
      }
      PAN_DOCUMENTI.EnableSorting();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDocumenti", "Ordinamento", _e);
      return -1;
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
  private void PAN_DOCUMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DOCUMENTI);
    // Stub
  }

  private void PAN_DOCUMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DOCUMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DOCUMENTI_Init()
  {

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "3AD522C4-B95C-4295-8671-0D3770631FFF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "NUMERO DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "147EEB0F-F8EF-496E-B573-4A45FBD4D4E2");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "D DATA DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, "838D6223-6721-425C-B2BA-975301ACD9BD");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, "Tipo");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, "61F5D5A6-8E3B-4ADC-B631-6970E346F686");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, "Da liquidare");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "43F219CA-D71C-4F06-BD80-B9B23866727C");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "NUMERO PROT");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "A58B273D-D52F-4FCC-984B-2B77C1BF0796");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "D DATA PROT");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, "36AB3397-645C-4352-977A-263437195EC9");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, "Scadenza");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, "23AC8114-0CA4-4E22-A758-6CD05D8E7C16");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, "Quietanza");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, "7533BCFC-2BA1-48C5-88A5-DCCD99D7D8F3");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, "Ufficio");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, "0CDC7FFA-6618-4FB6-83D2-2379FD43B6AE");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, "Cig");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, "7088E03F-CBEB-45B0-B817-0FB11CF1E151");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, "Cup");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, "F2C15FC0-CD18-4A8F-8D18-3CB0A7778897");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, "Documento");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, "00C2E47B-BC33-4299-BA0A-78EEA7BB1653");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, "Protocollo");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "8D29B06C-445E-4EF2-AF4A-B8F95919E694");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "ANNO DOC");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "C1020AD4-5983-4723-AF3D-07A29A0B8F73");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "ANNO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "03990C6D-F70A-4F8A-86CE-2EB1A460EC72");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "NUMERO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, "4B25DA90-CDF0-444F-B43B-A9354D847854");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, "CODICE");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, 0, -1);
  }

  private void PAN_DOCUMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 4, 76, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMERODOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMERODOC, PPQRY_FAT12, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 148, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 4, 508, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DDATADOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DDATADOC, PPQRY_FAT12, "A.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_LIST, 228, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_FORM, 4, 124, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_TIPO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_TIPO, PPQRY_FAT12, "G.DESCRIZIONE", "FATTIPO", 5, 40, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_LIST, 436, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_LIST, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_LIST, "Da liquidare");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_FORM, 4, 532, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_FORM, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DALIQUIDARE, MyGlb.PANEL_FORM, "Da liq.");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DALIQUIDARE, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_DALIQUIDARE, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DALIQUIDARE, PPQRY_FAT12, "NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0)", "FATDALIQUIDA", 3, 28, 6, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 556, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_LIST, "NUMERO PROT");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 4, 148, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROT, MyGlb.PANEL_FORM, "NUM. PROT");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROT, PPQRY_FAT12, "A.NUMERO_PROT", "NUMERO_PROT", 1, 7, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 612, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_LIST, "D DATA PROT");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DDATAPROT, MyGlb.PANEL_FORM, "D DT. PROT");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DDATAPROT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DDATAPROT, PPQRY_FAT12, "A.D_DATA_PROT", "D_DATA_PROT", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_LIST, 692, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_FORM, 4, 196, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SCADENZA, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SCADENZA, PPQRY_FAT12, "A.D_SCADENZA", "D_SCADENZA", 6, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_LIST, 772, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_FORM, 4, 220, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_QUIETANZA, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_QUIETANZA, PPQRY_FAT12, "D.DESCRIZIONE", "FATQUIETANZA", 5, 40, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_LIST, 980, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_FORM, 4, 244, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_UFFICIO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_UFFICIO, PPQRY_FAT12, "E.DESCRIZIONE", "FATUFFICIO", 5, 60, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_LIST, 1288, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_LIST, 28);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_FORM, 4, 556, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_FORM, 28);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CIG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CIG, PPQRY_FAT12, "A.CIG", "FATCIG", 5, 15, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_LIST, 1400, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_LIST, 32);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_FORM, 4, 580, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_FORM, 32);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CUP, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CUP, PPQRY_FAT12, "A.CUP", "FATCUP", 5, 15, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_LIST, 0, 0, 228, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_FORM, 4, 0, 220, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELDOCUMEN, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_LABELDOCUMEN, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_LABELDOCUMEN, -1, "", "LABELDOCUMEN", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_LIST, 556, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_FORM, 12, 8, 220, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_LABELPROTOCO, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_LABELPROTOCO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_LABELPROTOCO, -1, "", "LABELPROTOCO", 0, 0, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 4, 556, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNODOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNODOC, PPQRY_FAT12, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 4, 556, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNOPROG, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNOPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNOPROG, PPQRY_FAT12, "A.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 4, 556, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 84);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMEROPROG, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMEROPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMEROPROG, PPQRY_FAT12, "A.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_FORM, 4, 556, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_CODICE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_CODICE, PPQRY_FAT12, "A.CODICE", "CODICE", 1, 6, 0, -13997);
  }

  private void PAN_DOCUMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DOCUMENTI.SetIMDB(IMDB, "PQRY_FAT12", true);
    PAN_DOCUMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "FAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  A.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.NUMERO_RIF as NUMERO_RIF, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  G.DESCRIZIONE as FATTIPO, ");
    SQL.append("  NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0) as FATDALIQUIDA, ");
    SQL.append("  A.NUMERO_PROT as NUMERO_PROT, ");
    SQL.append("  A.D_DATA_PROT as D_DATA_PROT, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  D.DESCRIZIONE as FATQUIETANZA, ");
    SQL.append("  E.DESCRIZIONE as FATUFFICIO, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as FABERASOESES, ");
    SQL.append("  A.UFFICIO_INVIO as UFFICIO_INVIO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  F.DESCRIZIONE as FATT08DESCRI, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.IMPUTATO as IMPUTATO, ");
    SQL.append("  A.ANNO_RIF as ANNO_RIF, ");
    SQL.append("  A.CIG as FATCIG, ");
    SQL.append("  A.CUP as FATCUP ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  T53 E, ");
    SQL.append("  T08 F, ");
    SQL.append("  T03 G ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.CODICE_DOC IN (1, 5, 7) AND ~~TBL_PARAMETRI310.PARAENTRSPES~~ = 'S') OR (A.CODICE_DOC IN (2, 3, 6, 8) AND ~~TBL_PARAMETRI310.PARAENTRSPES~~ = 'E')) ");
    SQL.append("and   (A.STORNO = ~~TBL_PARAMETRI310.PARAMSTORNO~~) ");
    SQL.append("and   ((A.CODICE BETWEEN ~~TBL_PARAMETRI310.PARAMSOGGETT~~ AND DECODE(~~TBL_PARAMETRI310.PARAMSOGGETT~~, 0, 999999, ~~TBL_PARAMETRI310.PARAMSOGGETT~~))) ");
    SQL.append("and   ((NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0)) > 0) ");
    SQL.append("and   (A.ANNO_DOC = DECODE(~~TBL_PARAMETRI310.PARAMTUTTI~~, 'T', A.ANNO_DOC, ~~TBL_PARAMETRI310.PARAMANNODOC~~)) ");
    SQL.append("and   (A.NUMERO_DOC = DECODE(~~TBL_PARAMETRI310.PARAMTUTTI~~, 'T', A.NUMERO_DOC, ~~TBL_PARAMETRI310.PARAMNUMEDOC~~)) ");
    SQL.append("and   ((((LPAD(TO_CHAR ( A.ANNO_PROG ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_PROG ), 5, SUBSTR('0', 1, 1))) NOT IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  LPAD(TO_CHAR ( H.ANNO_PROG ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( H.NUMERO_PROG ), 5, SUBSTR('0', 1, 1)) ");
    SQL.append("from ");
    SQL.append("  FATTURE_BUONI H ");
    SQL.append(")) AND ~~TBL_PARAMETRI310.PARAMBUONI~~ = 'B') OR (~~TBL_PARAMETRI310.PARAMBUONI~~ = 'F')) ");
    SQL.append("and   ((((LPAD(TO_CHAR ( A.ANNO_PROG ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_PROG ), 5, SUBSTR('0', 1, 1))) NOT IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  LPAD(TO_CHAR ( I.ANNO_PROG_FAT ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( I.NUMERO_PROG_FAT ), 5, SUBSTR('0', 1, 1)) ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA I ");
    SQL.append("where (NOT ((I.ANNO_PROG_FAT IS NULL)) AND NOT ((I.NUMERO_PROG_FAT IS NULL))) ");
    SQL.append(")) AND ~~TBL_PARAMETRI310.PARAMBUONI~~ = 'B' AND " + IDL.CSql(MainFrm.ATTILIQ, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') OR (~~TBL_PARAMETRI310.PARAMBUONI~~ = 'F' OR NVL(" + IDL.CSql(MainFrm.ATTILIQ, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'NO')) ");
    SQL.append("and   (A.CODICE = B.CODICE) ");
    SQL.append("and   (A.CODICE = C.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = C.NUM_QUIETANZA(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.UFFICIO_INVIO = E.CODICE(+)) ");
    SQL.append("and   (A.CATEGORIA = F.CODICE(+)) ");
    SQL.append("and   (A.CODICE_DOC = G.CODICE) ");
    SQL.append("and   (A.STORNO = G.STORNO) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_FAT12, 5, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_FAT12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(0, "FAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI.iUseListQBE;
      PAN_DOCUMENTI.iUseListQBE = 0;
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
