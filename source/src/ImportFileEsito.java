// **********************************************
// Import File Esito
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImportFileEsito extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_WORKEXPORTID_PROGRESSIVO = 0;
  private static int PFL_WORKEXPORTID_SESSIONE = 1;
  private static int PFL_WORKEXPORTID_FASE = 2;
  private static int PFL_WORKEXPORTID_ELABORA = 3;
  private static int PFL_WORKEXPORTID_PATH = 4;

  private static int PPQRY_PARAMETRI597 = 0;


  IDPanel PAN_WORKEXPORTID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI598(IMDB);
    //
    //
    Init_PQRY_PARAMETRI597(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI598(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI598, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI598, "TBL_PARAMETRI598");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARPERFILBLO, "PARPERFILBLO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARPERFILBLO,9,8000,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARABLOBINSE, "PARABLOBINSE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARABLOBINSE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMPROGRES, "PARAMPROGRES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMPROGRES,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMFASE, "PARAMFASE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMFASE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARAMTIPO,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI598,IMDBDef2.FLD_PARAMETRI598_PARANOMEFILE,9,256,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI598, 0);
  }

  private static void Init_PQRY_PARAMETRI597(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI597, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI597, "PQRY_PARAMETRI597");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI597,IMDBDef10.PQSL_PARAMETRI597_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI597, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImportFileEsito(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImportFileEsito()
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
    FormIdx = MyGlb.FRM_IMPOFILEESIT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4B83AA9E-93F3-4A92-AA0C-1FAE7AA92F66";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2113;
    DesignWidth = 552;
    DesignHeight = 190;
    set_Caption(new IDVariant("Import File Esito"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "WORK EXPORT ID";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_WORKEXPORTID = new IDPanel(w, this, 1, "PAN_WORKEXPORTID");
    Frames[1].Content = PAN_WORKEXPORTID;
    PAN_WORKEXPORTID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_WORKEXPORTID.VS = MainFrm.VisualStyleList;
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4B4CAA3D-8027-4426-83E8-F4798446D97E");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_WORKEXPORTID.InitStatus = 2;
    PAN_WORKEXPORTID_Init();
    PAN_WORKEXPORTID_InitFields();
    PAN_WORKEXPORTID_InitQueries();
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
      PAN_WORKEXPORTID.UpdatePanel(MainFrm);
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
    return (obj instanceof ImportFileEsito);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImportFileEsito.class.getName() : (Glb.ClassWithPackage(ImportFileEsito.class) ? ImportFileEsito.class.getName().substring(ImportFileEsito.class.getPackage().getName().length() + 1) : ImportFileEsito.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // WORK EXPORT ID After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
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
      // WORK EXPORT ID After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_WORKEXPORTID.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_WORKEXPORTID.GotoFirst();
      while (!PAN_WORKEXPORTID.RSEOF())
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI597, IMDBDef10.PQSL_PARAMETRI597_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),new IDVariant(com.progamma.GUID.DocID2GUID (com.progamma.doc.MDOInit.GetNewDocID().stringValue())));
          // v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))));
          MainFrm.AddTempFile(v_PERCORSO.stringValue()); 
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARPERFILBLO, 0, new IDVariant(v_PERCORSO));
        }
        PAN_WORKEXPORTID.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARABLOBINSE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARABLOBINSE, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "WORKEXPORTIDAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // WORK EXPORT ID On Database Error Event
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
  private void PAN_WORKEXPORTID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_WORKEXPORTID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // WORK EXPORT ID On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "WORKEXPORTIDOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // WORK EXPORT ID Before BLOB Update
  // Evento notificato dal pannello prima di effettuare
  // la registrazione nel database di un blob appena caricato
  // dall'utente.
  // Cancel - Input/Output
  // Column - Input
  // Size - Input
  // Extension - Input
  // FilePath - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_BeforeBlobUpdate (IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // WORK EXPORT ID Before BLOB Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARANOMEFILE, 0, new IDVariant(FilePath));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "WORKEXPORTIDBeforeBLOBUpdate", _e);
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
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_NUMREC = (new IDVariant(0));
      // 
      // 
      // 
      // 
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      // 
      // apro il file gestendo un'eventuale eccezione
      // 
      {
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARPERFILBLO, 0), v_FD); 
        }
        catch (Exception e4)
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
        // inserisco ogni riga
        // 
        {
          // 
          // 
          // 
          // 
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            SQL = new StringBuffer();
            SQL.append("delete from WORK_EXPORT_TESO ");
            SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          IDVariant v_VMAX = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(MAX(NVL(A.PROGRESSIVO, 0)), 0) as NUVMNVWETP00 ");
          SQL.append("from ");
          SQL.append("  WORK_EXPORT_TESO A ");
          SQL.append("where (A.FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMAX = QV.Get("NUVMNVWETP00", IDVariant.DECIMAL) ;
          }
          QV.Close();
          while (!(MainFrm.VBFile.EOF(v_FD)))
          {
            v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
            v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
            I = IDL.Add(I, (new IDVariant(1)));
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
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  return 0;
                }
              }
            }
            if (v_CURRNUMBERCH.compareTo((new IDVariant(0)), true)>0)
            {
              v_PROG = (new IDVariant());
              try
              {
                v_VMAX = IDL.Add(IDL.NullValue(v_VMAX,(new IDVariant(0))), (new IDVariant(1)));
                SQL = new StringBuffer();
                SQL.append("insert into WORK_EXPORT_TESO ");
                SQL.append("( ");
                SQL.append("  FASE, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  SESSIONE, ");
                SQL.append("  DATI, ");
                SQL.append("  DATI2 ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_VMAX, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
                SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 4000), ");
                SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 4001, 4000) ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              catch (Exception e18)
              {
                MainFrm.set_AlertMessage(new IDVariant(e18.getMessage())); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
            }
          }
          MainFrm.Cf4armDBObject.CommitTrans();
          MainFrm.VBFile.Close(v_FD); 
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.COMUNICAZIONEFATTUREIMPORT_FILE_ESITO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARANOMEFILE, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione Eseguita"))); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "Elabora", _e);
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
      v_IFASE = IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0);
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
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMPROGRES, 0, PredisposizioneWORDEXPORTID());
      PAN_WORKEXPORTID.SetFieldBlobExtensions(PFL_WORKEXPORTID_PATH, (new IDVariant("*.xml;*.XML")).stringValue(), (new IDVariant("XML")).stringValue()); 
      IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
      v_MAX = (new IDVariant(5242880));
      PAN_WORKEXPORTID.SetFieldBlobSize(PFL_WORKEXPORTID_PATH, (new IDVariant(0)).intValue(), v_MAX.intValue(), (new IDVariant(-1)).booleanValue()); 
      PAN_WORKEXPORTID.SetFieldActive(PFL_WORKEXPORTID_PATH,true);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMEDELETE();
      ((ElencoFileInviati)MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI,0)).PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARPERFILBLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARABLOBINSE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMPROGRES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARANOMEFILE, 0, new IDVariant());
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
      v_STAMPACAPTIO = (new IDVariant("STAMPA AN", IDVariant.STRING));
      // 
      // Controlloerrore Body
      // Procedure Body
      // 
      v_STAMPACAPTIO = IDL.Add(v_STAMPACAPTIO, IDL.Upper(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMTIPO, 0)));
      // 
      // se trovo qualche record si è verificato un errore
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMPROGRES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, (new IDVariant("NO")));
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportFileEsito", "Controlloerrore", _e);
      return new IDVariant();
    }
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
  private void PAN_WORKEXPORTID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_WORKEXPORTID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_WORKEXPORTID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_WORKEXPORTID);
    // Stub
  }

  private void PAN_WORKEXPORTID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_WORKEXPORTID_ELABORA)
    {
      this.IdxPanelActived = this.PAN_WORKEXPORTID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_WORKEXPORTID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_WORKEXPORTID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI597, IMDBDef10.PQSL_PARAMETRI597_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI597, IMDBDef10.PQSL_PARAMETRI597_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_WORKEXPORTID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_WORKEXPORTID_Init()
  {

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "6720861A-F285-46FF-9CDD-0A8817F4F2CB");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "PROGRESSIVO");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "E314D7B7-1BB6-4F7A-915A-C6B4C04BA299");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "SESSIONE");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, 0, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, "559D1596-E157-4355-A301-35ACB61D3E6D");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, "FASE");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, "9B6E4064-3604-4F1D-A95F-7B49B83F6813");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, "Elabora");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_WORKEXPORTID.SetImage(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, 0, "button1.gif", false);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, "BFE41636-B513-4705-94B2-9CC283F0FEE7");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, "Path");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_WORKEXPORTID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 136, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PROGRESSIVO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PROGRESSIVO, PPQRY_PARAMETRI597, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 4, 160, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 60);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_SESSIONE, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_SESSIONE, PPQRY_PARAMETRI597, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_LIST, 36);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_FORM, 4, 184, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_FORM, 36);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_FASE, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_FASE, PPQRY_PARAMETRI597, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 376, 68, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 428, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_ELABORA, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_LIST, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_LIST, "Path");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_FORM, 8, 12, 500, 92, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_FORM, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_FORM, 6);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PATH, MyGlb.PANEL_FORM, "Path");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PATH, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PATH, PPQRY_PARAMETRI597, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
  }

  private void PAN_WORKEXPORTID_InitQueries()
  {
    StringBuffer SQL;

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WORKEXPORTID.SetIMDB(IMDB, "PQRY_PARAMETRI597", true);
    PAN_WORKEXPORTID.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETRI598.PARAMPROGRES~~) ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_PARAMETRI597, 5, SQL, -1, "");
    PAN_WORKEXPORTID.SetQueryDB(PPQRY_PARAMETRI597, MainFrm.Cf4armDBObject.DB, 4);
    PAN_WORKEXPORTID.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_WORKEXPORTID.Status() == 2)
    {
      int oldListQBE = PAN_WORKEXPORTID.iUseListQBE;
      PAN_WORKEXPORTID.iUseListQBE = 0;
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_SEARCH);
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_FIND);
      PAN_WORKEXPORTID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_BeforeBlobUpdate(Cancel, Column, Size, Extension, FilePath);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
