// **********************************************
// Parametri Bilancio Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriBilancioCons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTABILANC_ESERCIZIO = 0;
  private static int PFL_SCELTABILANC_DATAAPPCONS = 1;
  private static int PFL_SCELTABILANC_ABITANTI = 2;
  private static int PFL_SCELTABILANC_SUPERFICITOT = 3;
  private static int PFL_SCELTABILANC_SUPERFICIURB = 4;

  private static int PPQRY_ESERCIFINANZ = 0;


  IDPanel PAN_SCELTABILANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ESERCIFINANZ(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ESERCIFINANZ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_ESERCIFINANZ, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_ESERCIFINANZ, "PQRY_ESERCIFINANZ");
    IMDB.set_FldCode(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_DATA_APP_CONS, "DATA_APP_CONS");
    IMDB.SetFldParams(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_DATA_APP_CONS,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_SUPERFICIE_TOT, "SUPERFICIE_TOT");
    IMDB.SetFldParams(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_SUPERFICIE_TOT,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_SUPERFICIE_URB, "SUPERFICIE_URB");
    IMDB.SetFldParams(IMDBDef12.PQRY_ESERCIFINANZ,IMDBDef12.PQSL_ESERCIFINANZ_SUPERFICIE_URB,1,7,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_ESERCIFINANZ, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriBilancioCons(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriBilancioCons()
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
    FormIdx = MyGlb.FRM_PARABILACONS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "51FEF188-5F34-41EF-8C1A-6C413630EBFA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 408;
    DesignHeight = 242;
    set_Caption(new IDVariant("Parametri Bilancio e Certificato Consuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 408;
    Frames[1].Height = 216;
    Frames[1].Caption = "Scelta Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 216;
    PAN_SCELTABILANC = new IDPanel(w, this, 1, "PAN_SCELTABILANC");
    Frames[1].Content = PAN_SCELTABILANC;
    PAN_SCELTABILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTABILANC.FocusEventDef = RD3Glb.EVENT_ACTIVE;
    PAN_SCELTABILANC.VS = MainFrm.VisualStyleList;
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 216-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5322E73D-3BEC-4509-93B7-456EF2FEA155");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 360, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTABILANC.InitStatus = 2;
    PAN_SCELTABILANC_Init();
    PAN_SCELTABILANC_InitFields();
    PAN_SCELTABILANC_InitQueries();
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
      PAN_SCELTABILANC.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriBilancioCons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriBilancioCons.class.getName() : (Glb.ClassWithPackage(ParametriBilancioCons.class) ? ParametriBilancioCons.class.getName().substring(ParametriBilancioCons.class.getPackage().getName().length() + 1) : ParametriBilancioCons.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Bilancio On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_SCELTABILANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SCELTABILANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Scelta Bilancio On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioCons", "SceltaBilancioOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Scelta Bilancio On Focus
  // Evento notificato dal pannello quando un campo acquista
  // o perde il fuoco
  // Field Index - Input
  // Got Focus - Input
  // **********************************************************************
  private void PAN_SCELTABILANC_OnFocus(IDVariant FieldIndex, IDVariant GotFocus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Bilancio On Focus Body
      // Corpo Procedura
      // 
      // if (FieldIndex.equals((new IDVariant(PFL_SCELTABILANC_DATAAPPCONS)), true) && GotFocus.booleanValue())
      // {
        // IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
        // v_TOOLTIP = (new IDVariant("Corrisponde al codice 1010 del Certificato Consuntivo"));
        // MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Data Approvazione Bilancio")).stringValue(),new IDVariant(PAN_SCELTABILANC.bFields(PFL_SCELTABILANC_DATAAPPCONS).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
      // }
      // if (FieldIndex.equals((new IDVariant(PFL_SCELTABILANC_ABITANTI)), true) && GotFocus.booleanValue())
      // {
        // IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
        // v_TOOLTIP = (new IDVariant("Corrisponde al codice 1020 del Certificato Consuntivo"));
        // MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Numero di Abitanti")).stringValue(),new IDVariant(PAN_SCELTABILANC.bFields(PFL_SCELTABILANC_ABITANTI).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
      // }
      // if (FieldIndex.equals((new IDVariant(PFL_SCELTABILANC_SUPERFICITOT)), true) && GotFocus.booleanValue())
      // {
        // IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
        // v_TOOLTIP = (new IDVariant("Corrisponde al codice 1030 del Certificato Consuntivo"));
        // MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Superficie Totale (Kmq)")).stringValue(),new IDVariant(PAN_SCELTABILANC.bFields(PFL_SCELTABILANC_SUPERFICITOT).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
      // }
      // if (FieldIndex.equals((new IDVariant(PFL_SCELTABILANC_SUPERFICIURB)), true) && GotFocus.booleanValue())
      // {
        // IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
        // v_TOOLTIP = (new IDVariant("Corrisponde al codice 1040 del Certificato Consuntivo"));
        // MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Superficie Urbana (Kmq)")).stringValue(),new IDVariant(PAN_SCELTABILANC.bFields(PFL_SCELTABILANC_SUPERFICIURB).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioCons", "SceltaBilancioOnFocus", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_SCELTABILANC.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      PAN_SCELTABILANC.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriBilancioCons", "Load", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTABILANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTABILANC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTABILANC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCELTABILANC);
    // Stub
  }

  private void PAN_SCELTABILANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTABILANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTABILANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTABILANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTABILANC_Init()
  {

    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "8463D4AC-CD36-4C28-9653-4A63B6AED0BB");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "ESERCIZIO");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, "");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, "B0F1B79F-A7E2-4405-B966-A44DA62B1AF1");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, "Data Approvazione Consuntivo");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, "Corrisponde al codice 1010 del Certificato Consuntivo");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, "D7899F1A-504B-4466-AF30-BF975E0DF31E");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, "Numero di Abitanti");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, "Corrisponde al codice 1020 del Certificato Consuntivo");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, "B0D3136F-281A-4B55-940B-4D0DE1410E98");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, "Superficie Totale (Ha)");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, "Corrisponde al codice 1030 del Certificato Consuntivo");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTABILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, "3F3AED56-0CE9-40D5-8718-4C99EF713B6A");
    PAN_SCELTABILANC.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, "Superficie Urbana (Ha)");
    PAN_SCELTABILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, "Corrisponde al codice 1040 del Certificato Consuntivo");
    PAN_SCELTABILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTABILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTABILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 144);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ESERCIZIO, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ESERCIZIO, PPQRY_ESERCIFINANZ, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_LIST, 96);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_LIST, "Dt. Approv. Consuntivo");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_FORM, 32, 32, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_FORM, 184);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_DATAAPPCONS, MyGlb.PANEL_FORM, "Data Approvazione Consuntivo");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_DATAAPPCONS, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_DATAAPPCONS, PPQRY_ESERCIFINANZ, "A.DATA_APP_CONS", "DATA_APP_CONS", 6, 10, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_LIST, 64);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_LIST, "Numero di Abitanti");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_FORM, 92, 60, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_FORM, 124);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_ABITANTI, MyGlb.PANEL_FORM, "Numero di Abitanti");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_ABITANTI, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_ABITANTI, PPQRY_ESERCIFINANZ, "A.ABITANTI", "ABITANTI", 1, 7, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_LIST, 100);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_LIST, "Superficie Totale (Ha)");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_FORM, 72, 88, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_FORM, 144);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICITOT, MyGlb.PANEL_FORM, "Superficie Totale (Ha)");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_SUPERFICITOT, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_SUPERFICITOT, PPQRY_ESERCIFINANZ, "A.SUPERFICIE_TOT", "SUPERFICIE_TOT", 1, 7, 0, -13997);
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_LIST, 100);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_LIST, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_LIST, "Superficie Urbana (Ha)");
    PAN_SCELTABILANC.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_FORM, 72, 116, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTABILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_FORM, 144);
    PAN_SCELTABILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_FORM, 1);
    PAN_SCELTABILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTABILANC_SUPERFICIURB, MyGlb.PANEL_FORM, "Superficie Urbana (Ha)");
    PAN_SCELTABILANC.SetFieldPage(PFL_SCELTABILANC_SUPERFICIURB, -1, -1);
    PAN_SCELTABILANC.SetFieldPanel(PFL_SCELTABILANC_SUPERFICIURB, PPQRY_ESERCIFINANZ, "A.SUPERFICIE_URB", "SUPERFICIE_URB", 1, 7, 0, -13997);
  }

  private void PAN_SCELTABILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTABILANC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTABILANC.SetIMDB(IMDB, "PQRY_ESERCIFINANZ", true);
    PAN_SCELTABILANC.set_SetString(MyGlb.MASTER_ROWNAME, "ESEFIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.DATA_APP_CONS as DATA_APP_CONS, ");
    SQL.append("  A.ABITANTI as ABITANTI, ");
    SQL.append("  A.SUPERFICIE_TOT as SUPERFICIE_TOT, ");
    SQL.append("  A.SUPERFICIE_URB as SUPERFICIE_URB ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTABILANC.SetQuery(PPQRY_ESERCIFINANZ, 5, SQL, -1, "");
    PAN_SCELTABILANC.SetQueryDB(PPQRY_ESERCIFINANZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTABILANC.SetMasterTable(0, "ESEFIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTABILANC.Status() == 2)
    {
      int oldListQBE = PAN_SCELTABILANC.iUseListQBE;
      PAN_SCELTABILANC.iUseListQBE = 0;
      PAN_SCELTABILANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTABILANC.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTABILANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_SCELTABILANC) PAN_SCELTABILANC_OnFocus(Field, GotFocus);
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
