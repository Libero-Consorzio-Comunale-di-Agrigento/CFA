// **********************************************
// Corrispondenza Regioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CorrispondenzaRegioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CORRISREGION_REGIONE = 0;
  private static int PFL_CORRISREGION_BENRAGIOSOCI = 1;
  private static int PFL_CORRISREGION_CODICE = 2;
  private static int PFL_CORRISREGION_SOGGETTO = 3;

  private static int PPQRY_SOGGETREGION = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_REGIONI = 2;


  IDPanel PAN_CORRISREGION;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_SOGGETREGION(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_SOGGETREGION(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SOGGETREGION, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_SOGGETREGION, "PQRY_SOGGETREGION");
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETREGION,IMDBDef9.PQSL_SOGGETREGION_REGIONE, "REGIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETREGION,IMDBDef9.PQSL_SOGGETREGION_REGIONE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SOGGETREGION,IMDBDef9.PQSL_SOGGETREGION_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SOGGETREGION,IMDBDef9.PQSL_SOGGETREGION_CODICE,1,6,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_SOGGETREGION, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CorrispondenzaRegioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public CorrispondenzaRegioni()
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
    FormIdx = MyGlb.FRM_CORRISREGION;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "75A6EAC0-CEEC-4E66-A952-6F8351BED280";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 636;
    DesignHeight = 338;
    set_Caption(new IDVariant("Corrispondenza Regioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 636;
    Frames[1].Height = 312;
    Frames[1].Caption = "Corrispondenza Regioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 312;
    PAN_CORRISREGION = new IDPanel(w, this, 1, "PAN_CORRISREGION");
    Frames[1].Content = PAN_CORRISREGION;
    PAN_CORRISREGION.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CORRISREGION.VS = MainFrm.VisualStyleList;
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CORRISREGION.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "435F437E-DEC1-4FEF-97CD-1C54C612668C");
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 464, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CORRISREGION.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CORRISREGION.InitStatus = 2;
    PAN_CORRISREGION_Init();
    PAN_CORRISREGION_InitFields();
    PAN_CORRISREGION_InitQueries();
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
      PAN_CORRISREGION.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_CORRISREGION.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISREGION_CODICE) {
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
    return (obj instanceof CorrispondenzaRegioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CorrispondenzaRegioni.class.getName() : (Glb.ClassWithPackage(CorrispondenzaRegioni.class) ? CorrispondenzaRegioni.class.getName().substring(CorrispondenzaRegioni.class.getPackage().getName().length() + 1) : CorrispondenzaRegioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Corrispondenza Regioni On Database Error Event
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
  private void PAN_CORRISREGION_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CORRISREGION, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Corrispondenza Regioni On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzaRegioni", "CorrispondenzaRegioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Corrispondenza Regioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CORRISREGION_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CORRISREGION);
      // 
      // Corrispondenza Regioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CORRISREGION.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISREGION_BENRAGIOSOCI,(new IDVariant(PAN_CORRISREGION.FieldText(PFL_CORRISREGION_BENRAGIOSOCI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzaRegioni", "CorrispondenzaRegioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Soggetto
  // **********************************************************************
  public int ApriSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzaRegioni", "ApriSoggetto", _e);
      return -1;
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_SOGGETREGION, IMDBDef9.PQSL_SOGGETREGION_CODICE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0),IDVariant.INTEGER));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzaRegioni", "EndModalEvent", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CORRISREGION_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CORRISREGION, Cancel);
    // Stub
  }

  private void PAN_CORRISREGION_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CORRISREGION_CODICE)
    {
      this.IdxPanelActived = this.PAN_CORRISREGION.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CORRISREGION_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CORRISREGION_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CORRISREGION_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CORRISREGION_Init()
  {

    PAN_CORRISREGION.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CORRISREGION.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CORRISREGION.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CORRISREGION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, "FED542CD-F812-4E8B-A2A3-69A1936DB0AD");
    PAN_CORRISREGION.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, "Regione");
    PAN_CORRISREGION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, "");
    PAN_CORRISREGION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISREGION.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISREGION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, "11C59F10-30F4-4F02-AD7B-431E83D03DD0");
    PAN_CORRISREGION.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, "BEN RAGIONE SOCIALE");
    PAN_CORRISREGION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, "");
    PAN_CORRISREGION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CORRISREGION.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CORRISREGION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, "E009AE64-F4AD-4DCC-A8F0-A1DB436B0CB5");
    PAN_CORRISREGION.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, "CODICE");
    PAN_CORRISREGION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, "");
    PAN_CORRISREGION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISREGION.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CORRISREGION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, "82D90B82-94FC-45E9-8378-FF303AE954D0");
    PAN_CORRISREGION.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, "Soggetto");
    PAN_CORRISREGION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISREGION.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CORRISREGION_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_LIST, 56);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_LIST, "Regione");
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_FORM, 4, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_FORM, 56);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_REGIONE, MyGlb.PANEL_FORM, "Regione");
    PAN_CORRISREGION.SetFieldPage(PFL_CORRISREGION_REGIONE, -1, -1);
    PAN_CORRISREGION.SetFieldPanel(PFL_CORRISREGION_REGIONE, PPQRY_SOGGETREGION, "A.REGIONE", "REGIONE", 1, 3, 0, -13997);
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_LIST, 148, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_LIST, 124);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_LIST, "BEN RAGIONE SOCIALE");
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_FORM, 4, 52, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_FORM, 124);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_BENRAGIOSOCI, MyGlb.PANEL_FORM, "BEN RAG. SOCIALE");
    PAN_CORRISREGION.SetFieldPage(PFL_CORRISREGION_BENRAGIOSOCI, -1, -1);
    PAN_CORRISREGION.SetFieldPanel(PFL_CORRISREGION_BENRAGIOSOCI, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_LIST, 400, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_FORM, 4, 28, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CORRISREGION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISREGION_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_CORRISREGION.SetFieldPage(PFL_CORRISREGION_CODICE, -1, -1);
    PAN_CORRISREGION.SetFieldPanel(PFL_CORRISREGION_CODICE, PPQRY_SOGGETREGION, "A.CODICE", "CODICE", 1, 6, 0, -13997);
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_LIST, 148, 0, 316, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_LIST, 0);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISREGION.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_FORM, 148, 0, 316, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISREGION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_FORM, 0);
    PAN_CORRISREGION.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISREGION_SOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISREGION.SetFieldPage(PFL_CORRISREGION_SOGGETTO, -1, -1);
    PAN_CORRISREGION.SetFieldPanel(PFL_CORRISREGION_SOGGETTO, -1, "", "SOGGETTO", 0, 0, 0, -13997);
  }

  private void PAN_CORRISREGION_InitQueries()
  {
    StringBuffer SQL;

    PAN_CORRISREGION.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~CODICE~~) ");
    PAN_CORRISREGION.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_CORRISREGION.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISREGION.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_REGIONE as REGIOIDREGIO, ");
    SQL.append("  A.DENOMINAZIONE as REGIONDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_REGIONI A ");
    SQL.append("where (A.ID_REGIONE = ~~REGIONE~~) ");
    SQL.append("order by ");
    SQL.append("  A.DENOMINAZIONE ");
    PAN_CORRISREGION.SetQuery(PPQRY_REGIONI, 0, SQL, PFL_CORRISREGION_REGIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_REGIONE as REGIOIDREGIO, ");
    SQL.append("  A.DENOMINAZIONE as REGIONDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_REGIONI A ");
    SQL.append("order by ");
    SQL.append("  A.DENOMINAZIONE ");
    PAN_CORRISREGION.SetQuery(PPQRY_REGIONI, 1, SQL, PFL_CORRISREGION_REGIONE, "");
    PAN_CORRISREGION.SetQueryDB(PPQRY_REGIONI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISREGION.SetIMDB(IMDB, "PQRY_SOGGETREGION", true);
    PAN_CORRISREGION.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.REGIONE as REGIONE, ");
    SQL.append("  A.CODICE as CODICE ");
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SOGGETTI_REGIONI A ");
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISREGION.SetQuery(PPQRY_SOGGETREGION, 5, SQL, -1, "");
    PAN_CORRISREGION.SetQueryDB(PPQRY_SOGGETREGION, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISREGION.SetMasterTable(0, "SOGGETTI_REGIONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CORRISREGION.Status() == 2)
    {
      int oldListQBE = PAN_CORRISREGION.iUseListQBE;
      PAN_CORRISREGION.iUseListQBE = 0;
      PAN_CORRISREGION.PanelCommand(Glb.PCM_SEARCH);
      PAN_CORRISREGION.PanelCommand(Glb.PCM_FIND);
      PAN_CORRISREGION.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CORRISREGION) PAN_CORRISREGION_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISREGION) PAN_CORRISREGION_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CORRISREGION) PAN_CORRISREGION_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISREGION) PAN_CORRISREGION_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CORRISREGION) PAN_CORRISREGION_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
