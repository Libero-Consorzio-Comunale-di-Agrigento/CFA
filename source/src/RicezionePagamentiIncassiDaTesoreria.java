// **********************************************
// Ricezione Pagamenti Incassi Da Tesoreria
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RicezionePagamentiIncassiDaTesoreria extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPORTFILE_IMPORTBUTTON = 0;
  private static int PFL_IMPORTFILE_PROGRESSIVO = 1;
  private static int PFL_IMPORTFILE_SESSIONE = 2;
  private static int PFL_IMPORTFILE_FASE = 3;
  private static int PFL_IMPORTFILE_NEWPANELLABE = 4;
  private static int PFL_IMPORTFILE_FILEDATI = 5;

  private static int PPQRY_IMPORTFILE2 = 0;


  IDPanel PAN_IMPORTFILE;
  private static int PFL_PANNELLO_SOLOSTADICON = 0;

  private static int PPQRY_PARAMETRI428 = 0;


  IDPanel PAN_PANNELLO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI66(IMDB);
    //
    //
    Init_PQRY_IMPORTFILE2(IMDB);
    Init_PQRY_PARAMETRI428(IMDB);
    Init_PQRY_PARAMETRI428_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI66(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI66, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI66, "TBL_PARAMETRI66");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_RONASOSTDICO, "RONASOSTDICO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_RONASOSTDICO,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMPEFIBL, "ROWNAMPEFIBL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMPEFIBL,9,8000,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMBLOINS,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMEPROGR,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI66,IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE,5,49,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI66, 0);
  }

  private static void Init_PQRY_IMPORTFILE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMPORTFILE2, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMPORTFILE2, "PQRY_IMPORTFILE2");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPORTFILE2,IMDBDef15.PQSL_IMPORTFILE2_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMPORTFILE2, 0);
  }

  private static void Init_PQRY_PARAMETRI428(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI428, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI428, "PQRY_PARAMETRI428");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI428,IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, "RONASOSTDICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI428,IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI428, 0);
  }

  private static void Init_PQRY_PARAMETRI428_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI428_RS, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI428_RS, "PQRY_PARAMETRI428_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI428_RS,IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, "RONASOSTDICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI428_RS,IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RicezionePagamentiIncassiDaTesoreria(MyWebEntryPoint w, IMDBObj imdb)
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
  public RicezionePagamentiIncassiDaTesoreria()
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
    FormIdx = MyGlb.FRM_RICPAGINDATE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0728A5D8-E50D-431D-9B13-59A9DDFDBB5E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 556;
    DesignHeight = 246;
    set_Caption(new IDVariant("Ricezione Pagamenti Incassi Da Tesoreria"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 556;
    Frames[1].Height = 220;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Import File";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 220;
    PAN_IMPORTFILE = new IDPanel(w, this, 1, "PAN_IMPORTFILE");
    Frames[1].Content = PAN_IMPORTFILE;
    PAN_IMPORTFILE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPORTFILE.VS = MainFrm.VisualStyleList;
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5485C049-3EE3-4363-85B0-51D3A2081005");
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
    PAN_IMPORTFILE.SetSubFrame(PFL_IMPORTFILE_NEWPANELLABE,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pannello";
    Frames[2].Parent = this;
    PAN_PANNELLO = new IDPanel(w, this, 2, "PAN_PANNELLO");
    Frames[2].Content = PAN_PANNELLO;
    PAN_PANNELLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLO.VS = MainFrm.VisualStyleList;
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D74BE74C-ECEF-49CD-9890-F7BAA07FE614");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 256, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELLO.InitStatus = 2;
    PAN_PANNELLO_Init();
    PAN_PANNELLO_InitFields();
    PAN_PANNELLO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI66, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RICPAGINDATE_PARAMETRI428();
      }
      PAN_IMPORTFILE.UpdatePanel(MainFrm);
      PAN_PANNELLO.UpdatePanel(MainFrm);
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
    return (obj instanceof RicezionePagamentiIncassiDaTesoreria);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RicezionePagamentiIncassiDaTesoreria.class.getName() : (Glb.ClassWithPackage(RicezionePagamentiIncassiDaTesoreria.class) ? RicezionePagamentiIncassiDaTesoreria.class.getName().substring(RicezionePagamentiIncassiDaTesoreria.class.getPackage().getName().length() + 1) : RicezionePagamentiIncassiDaTesoreria.class.getName()));
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
      Nomecaption();
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEPROGR, 0, PredisposizioneWORDEXPORTID());
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_RONASOSTDICO, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "LoadEvent", _e);
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
        if (IMDB.Value(IMDBDef15.PQRY_IMPORTFILE2, IMDBDef15.PQSL_IMPORTFILE2_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),IDL.Add(IDL.Add((new IDVariant("prova")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEPROGR, 0))));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMPEFIBL, 0, new IDVariant(v_PERCORSO));
        }
        PAN_IMPORTFILE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "ImportFileAfterBLOBUpdateEvent", _e);
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
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "ImportFileOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Controlloerrore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant Controlloerrore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STAMPACAPTIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STAMPACAPTIO = (new IDVariant("Stampa Anomalie ", IDVariant.STRING));
      // 
      // Controlloerrore Body
      // Procedure Body
      // 
      v_STAMPACAPTIO = IDL.Add(v_STAMPACAPTIO, (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(1)))? new IDVariant("Pagamenti") : IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(2)))? new IDVariant("Incassi") :  new IDVariant()));
      // 
      // se trovo qualche record si è verificato un errore
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, ((IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0).equals((new IDVariant("SI"))))?(new IDVariant()):(new IDVariant("SI"))));
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "Controlloerrore", _e);
      return new IDVariant();
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
      IDVariant v_PROGELABOPI = new IDVariant(0,IDVariant.INTEGER);
      // 
      // la procedura funziona solo se è stato selezionato un file attraverso il campo blob
      // 
      {
        if (!(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMBLOINS, 0).equals((new IDVariant("SI")), true)))
        {
          return 0;
        }
      }
      if (MainFrm.TIPO_INC_PAG.equals((new IDVariant("OPI")), true) && IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("MINF")), true))
      {
        // 
        // Gestione Giornale Cassa OPI tramite tabella ELABORAZIONI OPI
        // 
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.INSELABOPIDAWORKEXPORT(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEPROGR, 0), v_PROGELABOPI);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
        }
      }
      else
      {
        // 
        // Vecchia Gestione Giornale Cassa con Tabella WORK_EXOPORT
        // TESO
        // 
        // 
        // apro il file gestendo un'eventuale eccezione
        // 
        {
          try
          {
            v_FD = MainFrm.VBFile.FreeFile();
            MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMPEFIBL, 0), v_FD); 
          }
          catch (Exception e12)
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
              SQL.append("and   (FASE = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e17)
            {
              MainFrm.set_AlertMessage(new IDVariant(e17.getMessage())); 
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
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_PROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                v_PROG = IDL.Add(v_PROG, (new IDVariant(1)));
              }
              catch (Exception e25)
              {
                MainFrm.set_AlertMessage(new IDVariant(e25.getMessage())); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
            }
            MainFrm.Cf4armDBObject.CommitTrans();
            MainFrm.VBFile.Close(v_FD); 
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("MINF")), true))
        {
          MainFrm.Cf4armDBObject.CARICAPAGAMINFTESO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0), v_PROGELABOPI);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")), true))
        {
          MainFrm.Cf4armDBObject.CARICAPAGAMENTITESO(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
        {
          if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("MINF")), true))
          {
            MainFrm.Cf4armDBObject.CARICAINCASSIINFTESO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0), v_PROGELABOPI);
          }
          if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("INCASSI")), true))
          {
            MainFrm.Cf4armDBObject.CARICAINCASSITESO(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0));
          }
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        return 0;
      }
      if (Controlloerrore().equals((new IDVariant(-1)), true))
      {
        PulisciWorkExportTeso();
        // 
        // 1
        // 
        return 0;
      }
      // 
      // se non ci sono errori
      // 
      {
        IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
        v_MSG1 = (new IDVariant("Nessuna presenza di Anomalie nel tracciato.", IDVariant.STRING));
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Caricamento eseguito.", IDVariant.STRING));
        if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI428, IMDBDef15.PQSL_PARAMETRI428_RONASOSTDICO, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.set_AlertMessage(v_MSG1); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_MSG2); 
        }
      }
      // 
      // ripulisco la tabella workexportteso
      // 
      {
        PulisciWorkExportTeso();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "Elabora", _e);
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
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID Body
      // Procedure Body
      // 
      v_IFASE = IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0);
      v_ISESSIONE = new IDVariant(new IDVariant(MainFrm.PROGRESESSIO),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO + 1) as MAWOEXIDPRUN ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAWOEXIDPRUN", IDVariant.INTEGER) ;
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
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Nomecaption
  // **********************************************************************
  public int Nomecaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nomecaption Body
      // Procedure Body
      // 
      // 
      // setto nome caption e valori di default
      // 
      {
        IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
        v_NOMECAPTION = (new IDVariant("Ricezione ", IDVariant.STRING));
        IDVariant v_SUBNOMECAPTI = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SUBCAPTION3 = new IDVariant(0,IDVariant.STRING);
        IDVariant v_DA = new IDVariant(0,IDVariant.STRING);
        v_DA = (new IDVariant("da Tesoreria", IDVariant.STRING));
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("INCASSI")), true) || IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")), true))
        {
          v_SUBCAPTION3 = new IDVariant(v_DA);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")), true))
        {
          IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
          v_NOME = (new IDVariant("Pagamenti", IDVariant.STRING));
          v_SUBNOMECAPTI = IDL.Add((new IDVariant(" ")), v_NOME);
        }
        v_SUBNOMECAPTI = (IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(1)))? new IDVariant("Pagamenti") : IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMETIPO, 0).equals((new IDVariant(2)))? new IDVariant("Incassi") :  new IDVariant());
        set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_NOMECAPTION, v_SUBNOMECAPTI), (new IDVariant(" "))), v_DA), MainFrm.ESERCIZIO));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "Nomecaption", _e);
      return -1;
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
      SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RicezionePagamentiIncassiDaTesoreria", "PulisciWorkExportTeso", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RICPAGINDATE_PARAMETRI428() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI428_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI66, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI66, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI428_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI428_RS, 0, IMDBDef6.TBL_PARAMETRI66, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI428_RS, 0, 0, IMDBDef6.TBL_PARAMETRI66, IMDBDef6.FLD_PARAMETRI66_RONASOSTDICO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI66, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI66, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI66, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI428_RS, 0);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_IMPORTFILE2, IMDBDef15.PQSL_IMPORTFILE2_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_IMPORTFILE2, IMDBDef15.PQSL_IMPORTFILE2_FILE_DATI, 0, (new IDVariant()));
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
  private void PAN_PANNELLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELLO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELLO);
    // Stub
  }

  private void PAN_PANNELLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNELLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLO_IntValidateRow(Cancel);
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
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "29CD5826-7A3E-4B3A-AE05-1EA33608FEB3");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "Elabora");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_IMPORTFILE.SetImage(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0, "button1.gif", false);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "36DB69F5-919E-4F78-AF46-9ED9EA255AD6");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "PROGRESSIVO");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "7746ABAE-2BFF-4D2E-9BE4-FB8881A10FE2");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "SESSIONE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, 0, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "583B88FD-EC49-4479-9B1C-AE727233C269");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "FASE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, "BA8FCF66-3A31-4698-A1EB-4E4B4BD787F4");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, "Text to show here");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "58D9AA3B-D39A-4A51-AF1B-7906E19A8691");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "FILE DATI");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPORTFILE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 376, 68, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 428, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_PROGRESSIVO, PPQRY_IMPORTFILE2, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 4, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_SESSIONE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_SESSIONE, PPQRY_IMPORTFILE2, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 4, 140, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FASE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FASE, PPQRY_IMPORTFILE2, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_LIST, 16, 136, 208, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_LIST, 4);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_FORM, 44, 132, 208, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_NEWPANELLABE, MyGlb.PANEL_FORM, 4);
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_NEWPANELLABE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, "FILE DATI");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 8, 8, 500, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 7);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, "FILE DATI");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FILEDATI, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FILEDATI, PPQRY_IMPORTFILE2, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
  }

  private void PAN_IMPORTFILE_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPORTFILE.SetIMDB(IMDB, "PQRY_IMPORTFILE2", true);
    PAN_IMPORTFILE.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT TESO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETRI66.ROWNAMEPROGR~~) ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE2, 5, SQL, -1, "");
    PAN_IMPORTFILE.SetQueryDB(PPQRY_IMPORTFILE2, MainFrm.Cf4armDBObject.DB, 4);
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

  private void PAN_PANNELLO_Init()
  {

    PAN_PANNELLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, "8F518A2A-FDE4-4633-97CF-AC4AF87B1176");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, "Solo stampa di controllo");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.VIS_CHECKSTYLE);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PANNELLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_LIST, 128);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_LIST, "Solo stampa di controllo");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_FORM, 28, 0, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_FORM, 144);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOSTADICON, MyGlb.PANEL_FORM, "Solo stampa di controllo");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_SOLOSTADICON, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_SOLOSTADICON, PPQRY_PARAMETRI428, "A.RONASOSTDICO", "RONASOSTDICO", 5, 49, 0, -13997);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOSTADICON, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOSTADICON, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PANNELLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELLO.SetIMDB(IMDB, "PQRY_PARAMETRI428", true);
    PAN_PANNELLO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PANNELLO.SetQueryIMDB(PPQRY_PARAMETRI428, IMDBDef15.PQRY_PARAMETRI428_RS, IMDBDef6.TBL_PARAMETRI66);
    JustLoaded = true;
    PAN_PANNELLO.SetFieldPrimaryIndex(PFL_PANNELLO_SOLOSTADICON, IMDBDef6.FLD_PARAMETRI66_RONASOSTDICO);
    PAN_PANNELLO.SetMasterTable(0, "PARAMETRI66");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLO.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLO.iUseListQBE;
      PAN_PANNELLO.iUseListQBE = 0;
      PAN_PANNELLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLO.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_DynamicProperties();
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
