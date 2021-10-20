// **********************************************
// Controllo Soggetti Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloSoggettiLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPORTFILE_IMPORTBUTTON = 0;
  private static int PFL_IMPORTFILE_PROGRESSIVO = 1;
  private static int PFL_IMPORTFILE_SESSIONE = 2;
  private static int PFL_IMPORTFILE_FASE = 3;
  private static int PFL_IMPORTFILE_FILEDATI = 4;
  private static int PFL_IMPORTFILE_ETICHETLABEL = 5;

  private static int PPQRY_IMPORTFILE3 = 0;


  IDPanel PAN_IMPORTFILE;
  private static int PFL_PARAMETRI_TIPPAGPERCAS = 0;

  private static int PPQRY_PARAMETRI430 = 0;

  private static int PPQRY_T02 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI552(IMDB);
    //
    //
    Init_PQRY_IMPORTFILE3(IMDB);
    Init_PQRY_PARAMETRI430(IMDB);
    Init_PQRY_PARAMETRI430_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI552(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI552, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI552, "TBL_PARAMETRI552");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMPEFIBL, "ROWNAMPEFIBL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMPEFIBL,9,8000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMBLOINS,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMEPROGR,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI552,IMDBDef5.FLD_PARAMETRI552_RONATIPAPECA,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI552, 0);
  }

  private static void Init_PQRY_IMPORTFILE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPORTFILE3, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPORTFILE3, "PQRY_IMPORTFILE3");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPORTFILE3,IMDBDef14.PQSL_IMPORTFILE3_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPORTFILE3, 0);
  }

  private static void Init_PQRY_PARAMETRI430(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI430, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI430, "PQRY_PARAMETRI430");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI430,IMDBDef14.PQSL_PARAMETRI430_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI430,IMDBDef14.PQSL_PARAMETRI430_RONATIPAPECA,1,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI430, 0);
  }

  private static void Init_PQRY_PARAMETRI430_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI430_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI430_RS, "PQRY_PARAMETRI430_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI430_RS,IMDBDef14.PQSL_PARAMETRI430_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI430_RS,IMDBDef14.PQSL_PARAMETRI430_RONATIPAPECA,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloSoggettiLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloSoggettiLiq()
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
    FormIdx = MyGlb.FRM_CONTRSOGGLIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "60789949-27BA-4AC3-B249-63E0980DB3DF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 552;
    DesignHeight = 298;
    set_Caption(new IDVariant("Controllo Soggetti/Liquidazioni"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Import File";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_IMPORTFILE = new IDPanel(w, this, 1, "PAN_IMPORTFILE");
    Frames[1].Content = PAN_IMPORTFILE;
    PAN_IMPORTFILE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPORTFILE.VS = MainFrm.VisualStyleList;
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9C292040-763F-4312-8AFB-98F9B8BBD71B");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPORTFILE.InitStatus = 2;
    PAN_IMPORTFILE_Init();
    PAN_IMPORTFILE_InitFields();
    PAN_IMPORTFILE_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_IMPORTFILE.SetSubFrame(PFL_IMPORTFILE_ETICHETLABEL,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CC71AA05-14BD-4C8A-9E22-70C895A855C7");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI552, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTRSOGGLIQ_PARAMETRI430();
      }
      PAN_IMPORTFILE.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloSoggettiLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloSoggettiLiq.class.getName() : (Glb.ClassWithPackage(ControlloSoggettiLiq.class) ? ControlloSoggettiLiq.class.getName().substring(ControlloSoggettiLiq.class.getPackage().getName().length() + 1) : ControlloSoggettiLiq.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_RONATIPAPECA, 0, (new IDVariant()));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEPROGR, 0, PredisposizioneWORDEXPORTID());
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0, (new IDVariant("AUSO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Import File After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_IMPORTFILE_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Import File After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_IMPORTFILE.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IMPORTFILE.GotoFirst();
      while (!PAN_IMPORTFILE.RSEOF())
      {
        if (IMDB.Value(IMDBDef14.PQRY_IMPORTFILE3, IMDBDef14.PQSL_IMPORTFILE3_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),IDL.Add(IDL.Add((new IDVariant("Soggetti_chek")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEPROGR, 0))));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMPEFIBL, 0, new IDVariant(v_PERCORSO));
        }
        PAN_IMPORTFILE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "ImportFileAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Import File On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_IMPORTFILE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPORTFILE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Import File On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "ImportFileOnDatabaseErrorEvent", _e);
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
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // la procedura funziona solo se è stato selezionato un file attraverso il campo blob
      // 
      {
        if (!(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMBLOINS, 0).equals((new IDVariant("SI")), true)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Selezionare un file"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      // 
      // apro il file gestendo un'eventuale eccezione
      // 
      {
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMPEFIBL, 0), v_FD); 
        }
        catch (Exception e7)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Errore nella lettura file!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      // 
      // copio i caratteri del file nella tabella selezionata in maniera ordinata utilizzando come supporto buffer1 e buffer2
      // 
      {
        IDVariant v_CURRNUMBERCH = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTROLLASEF = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_PROG = new IDVariant(0,IDVariant.INTEGER);
        v_CONTROLLASEF = (new IDVariant(-1));
        // 
        // inserisco ogni riga del file in WORK EXPORT TESO
        // 
        {
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            // 
            // pulisco la tabella workesportteso prima di effettuare
            // l'inserimento
            // 
            SQL = new StringBuffer();
            SQL.append("delete from WORK_EXPORT_TESO ");
            SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
            SQL.append("and   (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e12)
          {
            MainFrm.set_AlertMessage(new IDVariant(e12.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          while (!(MainFrm.VBFile.EOF(v_FD)))
          {
            v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
            v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
            // 
            // controllo se il file è vuoto ed eventualmente lo gestisco
            // 
            {
              if (v_CONTROLLASEF.booleanValue())
              {
                v_CONTROLLASEF = (new IDVariant(0));
                if (v_CURRNUMBERCH.equals((new IDVariant(0)), true))
                {
                  IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                  v_MSG = (new IDVariant("Il file è vuoto!", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MSG); 
                  return 0;
                }
              }
            }
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into WORK_EXPORT_TESO ");
              SQL.append("( ");
              SQL.append("  SESSIONE, ");
              SQL.append("  DATI, ");
              SQL.append("  DATI2, ");
              SQL.append("  FASE, ");
              SQL.append("  PROGRESSIVO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 4000), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 4001, 4000), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_PROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROG = IDL.Add(v_PROG, (new IDVariant(1)));
            }
            catch (Exception e20)
            {
              MainFrm.set_AlertMessage(new IDVariant(e20.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          MainFrm.Cf4armDBObject.CommitTrans();
          MainFrm.VBFile.Close(v_FD); 
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.SOGLIQCONTROLLO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI430, IMDBDef14.PQSL_PARAMETRI430_RONATIPAPECA, 0), (new IDVariant("SI")), v_ERRORE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        return 0;
      }
      if (v_ERRORE.compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant v_STAMPACAPTIO = new IDVariant(0,IDVariant.STRING);
        v_STAMPACAPTIO = (new IDVariant("Stampa Anomalie "));
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, (new IDVariant()));
      }
      else
      {
        // 
        // se non ci sono errori
        // 
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Controllo Eseguito. Non sono presenti anomalie.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
      // 
      // ripulisco la tabella workexportteso
      // 
      {
        PulisciWorkExportTeso();
      }
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ERRORI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Predisposizione WORDEXPORTID
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneWORDEXPORTID ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID Body
      // Procedure Body
      // 
      v_IFASE = IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0);
      v_ISESSIONE = new IDVariant(MainFrm.PROGRESESSIO);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(NVL(A.PROGRESSIVO, 0) + 1) as MANUVAWEIP0U ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MANUVAWEIP0U", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  FASE, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_ISESSIONE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return new IDVariant(v_DARESTITUIRE,IDVariant.INTEGER);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Pulisci Work Export Teso
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int PulisciWorkExportTeso ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pulisci Work Export Teso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggettiLiq", "PulisciWorkExportTeso", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTRSOGGLIQ_PARAMETRI430() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI430_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI552, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI552, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI430_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI430_RS, 0, IMDBDef5.TBL_PARAMETRI552, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI430_RS, 0, 0, IMDBDef5.TBL_PARAMETRI552, IMDBDef5.FLD_PARAMETRI552_RONATIPAPECA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI552, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI552, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI552, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI430_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPORTFILE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPORTFILE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPORTFILE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPORTFILE);
    // Stub
  }

  private void PAN_IMPORTFILE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPORTFILE_IMPORTBUTTON)
    {
      this.IdxPanelActived = this.PAN_IMPORTFILE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPORTFILE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPORTFILE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPORTFILE3, IMDBDef14.PQSL_IMPORTFILE3_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_IMPORTFILE3, IMDBDef14.PQSL_IMPORTFILE3_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_IMPORTFILE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPORTFILE_Init()
  {

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "2AB6823D-76F8-4BD6-AD0D-D2C5776A580E");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "Elabora");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_IMPORTFILE.SetImage(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0, "button1.gif", false);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "2F3FB0D6-B560-446E-B940-EDB5A17026E7");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "PROGRESSIVO");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "A41782AD-F4A6-47CB-BF4D-7B4F98086EF2");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "SESSIONE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, 0, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "091CA121-1D2C-46E4-9FD4-7172D6084413");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "FASE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "91C9BC16-2A59-4AE4-86B6-34303C3CCFF4");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "FILE DATI");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, "AD4842B7-BC9E-4BAF-91C3-95CA20634CB3");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, "label");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.VIS_LABELFIELD);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_IMPORTFILE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 376, 68, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 428, 208, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_IMPORTBUTTON, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_IMPORTBUTTON, -1, "", "IMPORTBUTTON", 0, 0, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_PROGRESSIVO, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_PROGRESSIVO, PPQRY_IMPORTFILE3, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 4, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_SESSIONE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_SESSIONE, PPQRY_IMPORTFILE3, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 4, 140, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FASE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FASE, PPQRY_IMPORTFILE3, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, "FILE DATI");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 8, 8, 500, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 7);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, "FILE DATI");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FILEDATI, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FILEDATI, PPQRY_IMPORTFILE3, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 20, 144, 324, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 6);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 68, 136, 456, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 3);
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_ETICHETLABEL, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
  }

  private void PAN_IMPORTFILE_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPORTFILE.SetIMDB(IMDB, "PQRY_IMPORTFILE3", true);
    PAN_IMPORTFILE.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT TESO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETRI552.ROWNAMEPROGR~~) ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE3, 5, SQL, -1, "");
    PAN_IMPORTFILE.SetQueryDB(PPQRY_IMPORTFILE3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPORTFILE.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPORTFILE.Status() == 2)
    {
      int oldListQBE = PAN_IMPORTFILE.iUseListQBE;
      PAN_IMPORTFILE.iUseListQBE = 0;
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_FIND);
      PAN_IMPORTFILE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "D7E937AF-7337-4ED5-94E9-6672E6B483D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, "T. Pg. p. C.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 0, 12, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 172);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPPAGPERCAS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPPAGPERCAS, PPQRY_PARAMETRI430, "A.RONATIPAPECA", "RONATIPAPECA", 1, 2, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T02CODICE1 ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~RONATIPAPECA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 0, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T02CODICE1 ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 1, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI430", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI430, IMDBDef14.PQRY_PARAMETRI430_RS, IMDBDef5.TBL_PARAMETRI552);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPPAGPERCAS, IMDBDef5.FLD_PARAMETRI552_RONATIPAPECA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI552");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
