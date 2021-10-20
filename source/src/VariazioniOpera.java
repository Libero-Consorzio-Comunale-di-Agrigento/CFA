// **********************************************
// Variazioni Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAZIOPERA_CAPITOLO = 0;
  private static int PFL_VARIAZIOPERA_ARTICOLO = 1;
  private static int PFL_VARIAZIOPERA_IMPORTO = 2;
  private static int PFL_VARIAZIOPERA_FINANZIAMEN1 = 3;
  private static int PFL_VARIAZIOPERA_DESCRIZIONE = 4;
  private static int PFL_VARIAZIOPERA_DATA = 5;
  private static int PFL_VARIAZIOPERA_SEDEDEL = 6;
  private static int PFL_VARIAZIOPERA_NUMERODEL = 7;
  private static int PFL_VARIAZIOPERA_ANNODEL = 8;
  private static int PFL_VARIAZIOPERA_UNITAPROPONE = 9;
  private static int PFL_VARIAZIOPERA_NUMEROPROPOS = 10;
  private static int PFL_VARIAZIOPERA_ANNOPROPOSTA = 11;
  private static int PFL_VARIAZIOPERA_PROGETTO = 12;
  private static int PFL_VARIAZIOPERA_LABELCAPITOL = 13;
  private static int PFL_VARIAZIOPERA_LABELFINANZI = 14;
  private static int PFL_VARIAZIOPERA_LABELDELIBER = 15;
  private static int PFL_VARIAZIOPERA_LABELPROPOST = 16;
  private static int PFL_VARIAZIOPERA_RIFBILANCPEG = 17;
  private static int PFL_VARIAZIOPERA_FINANZIAMENT = 18;
  private static int PFL_VARIAZIOPERA_DELIBERA = 19;
  private static int PFL_VARIAZIOPERA_PROPOSTA = 20;

  private static int PPQRY_VARCOM4 = 0;


  IDPanel PAN_VARIAZIOPERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI23(IMDB);
    //
    //
    Init_PQRY_VARCOM4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI23, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI23, "TBL_PARAMETRI23");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI23,IMDBDef1.FLD_PARAMETRI23_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI23, 0);
  }

  private static void Init_PQRY_VARCOM4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VARCOM4, 17);
    IMDB.set_TblCode(IMDBDef8.PQRY_VARCOM4, "PQRY_VARCOM4");
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARRIFBILPEG, "VARRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARRIFBILPEG,5,203,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMFINANZ, "VARCOMFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMFINANZ,5,304,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMDELIBE, "VARCOMDELIBE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMDELIBE,5,463,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMPROPOS, "VARCOMPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_VARCOMPROPOS,5,461,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM4,IMDBDef8.PQSL_VARCOM4_FINANZIAMENTO,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VARCOM4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniOpera()
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
    FormIdx = MyGlb.FRM_VARIAZIOPERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "99D5D161-6BEA-4206-9825-6F0DA09CCF8A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 956;
    DesignHeight = 358;
    set_Caption(new IDVariant("Variazioni Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 956;
    Frames[1].Height = 332;
    Frames[1].Caption = "Variazioni Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_VARIAZIOPERA = new IDPanel(w, this, 1, "PAN_VARIAZIOPERA");
    Frames[1].Content = PAN_VARIAZIOPERA;
    PAN_VARIAZIOPERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIOPERA.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 956-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "89278EB0-0305-4EF0-924B-7240C6A5538F");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 884, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIOPERA.InitStatus = 2;
    PAN_VARIAZIOPERA_Init();
    PAN_VARIAZIOPERA_InitFields();
    PAN_VARIAZIOPERA_InitQueries();
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
      PAN_VARIAZIOPERA.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniOpera.class.getName() : (Glb.ClassWithPackage(VariazioniOpera.class) ? VariazioniOpera.class.getName().substring(VariazioniOpera.class.getPackage().getName().length() + 1) : VariazioniOpera.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIOPERA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIOPERA);
      // 
      // Variazioni Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIAZIOPERA.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIOPERA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_VARCOM4, IMDBDef8.PQSL_VARCOM4_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOpera", "VariazioniOperaOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_VARIAZIOPERA.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_VARIAZIOPERA.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniOpera", "LoadEvent", _e);
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
  private void PAN_VARIAZIOPERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIOPERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIOPERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIOPERA, Cancel);
    // Stub
  }

  private void PAN_VARIAZIOPERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZIOPERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIOPERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_VARCOM4, IMDBDef8.PQSL_VARCOM4_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_VARCOM4, IMDBDef8.PQSL_VARCOM4_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZIOPERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIOPERA_Init()
  {

    PAN_VARIAZIOPERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIOPERA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIOPERA.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, "ACF88320-CEDE-4B9A-8479-89A8566308B8");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, "CAPITOLO");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, "5C5CE7BC-7D9E-4D28-9DE4-BD2C759854E4");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, "71BDE2D6-8530-4335-8535-8D975C0532AA");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, "Importo");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, "F7B3774E-D52B-41AF-BAA8-4E169E25286E");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, "3E6651E5-0FC2-4AE7-8ED3-9502699F76CB");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, "72A4B758-CC1D-4CA2-8B66-9202BE3E505F");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, "Data");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, "FFB24900-F613-4535-819B-155DBDD16781");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, "SEDE DEL");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, "4E178140-D329-4990-B28B-B33A27938DC8");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, "NUMERO DEL");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, "6D8DB7CF-2BDC-4BAC-A703-6B16DB71ECF6");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, "ANNO DEL");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, "27BC3048-55D3-46C4-9CA4-0D434BE3483A");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, "FE17C209-F00B-4A92-BAE3-DC45E8566795");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, "58DF01A4-D30E-4D24-840B-5676922CFCC2");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, "BBA599E3-9918-40E5-8868-2C342377A381");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, "Obiettivo Operativo");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, "");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, "4B264665-36CA-4149-B993-F2EF5BAF7CE3");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, "Capitolo/Art.");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, "EF9AC81D-E4E5-42C4-9A2B-6C24EC6461BA");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, "Finanziamento");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, "906E682C-586E-4B6A-B860-E93359EC1340");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, "Delibera");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, "445ED8D2-61B0-4EB5-8951-BED6785473CC");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, "Proposta");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, "7453FBE1-D82D-48AF-917A-768992F62FD7");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, "To String (VARCOM CAPITOLO) + \" \" + \" / \" + \" \" + To String (VARCOM ARTICOLO)");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, "53DB74BA-D9C5-4FDB-8121-FEC4EC96060E");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, "To String (VARCOM FINANZIAMENTO) + \" \" + \" - \" + \" \" + FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, "118B9A1A-BCF1-4DA1-90B1-CB78F98B9453");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, "Delibera");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, "VARCOM SEDE DEL + \" \" + \" - \" + \" \" + To String (VARCOM NUMERO DEL) + \" \" + \" / \" + \" \" + To String (VARCOM ANNO DEL)");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIOPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, "25BF8686-6C16-4A7C-A86E-65E2394DCFD7");
    PAN_VARIAZIOPERA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, "Proposta");
    PAN_VARIAZIOPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, "VARCOM UNITA PROPONENTE + \" \" + \" - \" + \" \" + To String (VARCOM NUMERO PROPOSTA) + \" / \" + To String (VARCOM ANNO PROPOSTA)");
    PAN_VARIAZIOPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIOPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIOPERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_CAPITOLO, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_CAPITOLO, PPQRY_VARCOM4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_FORM, 4, 376, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_ARTICOLO, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_ARTICOLO, PPQRY_VARCOM4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_LIST, 136, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_FORM, 4, 160, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_IMPORTO, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_IMPORTO, PPQRY_VARCOM4, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_LIST, 240, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINAN.");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 400, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_FINANZIAMEN1, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_FINANZIAMEN1, PPQRY_VARCOM4, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 284, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 424, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_DESCRIZIONE, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_DESCRIZIONE, PPQRY_VARCOM4, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_LIST, 428, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_FORM, 4, 184, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_DATA, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_DATA, PPQRY_VARCOM4, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_LIST, 500, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_FORM, 4, 460, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_SEDEDEL, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_SEDEDEL, PPQRY_VARCOM4, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_LIST, 540, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_FORM, 4, 484, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_NUMERODEL, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_NUMERODEL, PPQRY_VARCOM4, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_LIST, 588, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_FORM, 4, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_ANNODEL, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_ANNODEL, PPQRY_VARCOM4, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_LIST, 628, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 532, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_UNITAPROPONE, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_UNITAPROPONE, PPQRY_VARCOM4, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PRP.");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 556, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_NUMEROPROPOS, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_NUMEROPROPOS, PPQRY_VARCOM4, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 772, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 580, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_ANNOPROPOSTA, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_ANNOPROPOSTA, PPQRY_VARCOM4, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_LIST, 808, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_FORM, 4, 208, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_PROGETTO, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_PROGETTO, PPQRY_VARCOM4, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_LABELCAPITOL, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_LIST, 240, 0, 188, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_FORM, 8, 8, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_LABELFINANZI, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_LIST, 500, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_LABELDELIBER, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_LIST, 628, 0, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_LABELPROPOST, -1, -1);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 604, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_RIFBILANCPEG, -1, -1);
    PAN_VARIAZIOPERA.SetFieldUnbound(PFL_VARIAZIOPERA_RIFBILANCPEG, true);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_RIFBILANCPEG, PPQRY_VARCOM4, "TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO )", "VARRIFBILPEG", 5, 203, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 604, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_FINANZIAMENT, -1, -1);
    PAN_VARIAZIOPERA.SetFieldUnbound(PFL_VARIAZIOPERA_FINANZIAMENT, true);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_FINANZIAMENT, PPQRY_VARCOM4, "TO_CHAR ( A.FINANZIAMENTO ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE", "VARCOMFINANZ", 5, 304, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_FORM, 4, 604, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_DELIBERA, -1, -1);
    PAN_VARIAZIOPERA.SetFieldUnbound(PFL_VARIAZIOPERA_DELIBERA, true);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_DELIBERA, PPQRY_VARCOM4, "A.SEDE_DEL || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL )", "VARCOMDELIBE", 5, 463, 0, -13997);
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZIOPERA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_FORM, 4, 604, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIOPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_VARIAZIOPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIOPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIOPERA_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_VARIAZIOPERA.SetFieldPage(PFL_VARIAZIOPERA_PROPOSTA, -1, -1);
    PAN_VARIAZIOPERA.SetFieldUnbound(PFL_VARIAZIOPERA_PROPOSTA, true);
    PAN_VARIAZIOPERA.SetFieldPanel(PFL_VARIAZIOPERA_PROPOSTA, PPQRY_VARCOM4, "A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA )", "VARCOMPROPOS", 5, 461, 0, -13997);
  }

  private void PAN_VARIAZIOPERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIOPERA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZIOPERA.SetIMDB(IMDB, "PQRY_VARCOM4", true);
    PAN_VARIAZIOPERA.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO ) as VARRIFBILPEG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as VARCOMFINANZ, ");
    SQL.append("  A.SEDE_DEL || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL ) as VARCOMDELIBE, ");
    SQL.append("  A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA ) as VARCOMPROPOS, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO ");
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A, ");
    SQL.append("  FINANZIAMENTI B ");
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FINANZIAMENTO = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.E_S = ~~TBL_PARAMETRI23.PARAMES~~ AND A.OPERA = ~~TBL_PARAMETRI23.PARAMOPERA~~) ");
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_VARIAZIOPERA.SetQuery(PPQRY_VARCOM4, 5, SQL, -1, "");
    PAN_VARIAZIOPERA.SetQueryDB(PPQRY_VARCOM4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIOPERA.SetMasterTable(0, "VARCOM");
    PAN_VARIAZIOPERA.AddToSortList(PFL_VARIAZIOPERA_CAPITOLO, true);
    PAN_VARIAZIOPERA.AddToSortList(PFL_VARIAZIOPERA_ARTICOLO, true);
    PAN_VARIAZIOPERA.AddToSortList(PFL_VARIAZIOPERA_DATA, true);
    PAN_VARIAZIOPERA.AddToSortList(PFL_VARIAZIOPERA_FINANZIAMEN1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIOPERA.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIOPERA.iUseListQBE;
      PAN_VARIAZIOPERA.iUseListQBE = 0;
      PAN_VARIAZIOPERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIOPERA.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIOPERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIOPERA) PAN_VARIAZIOPERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIOPERA) PAN_VARIAZIOPERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIOPERA) PAN_VARIAZIOPERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIOPERA) PAN_VARIAZIOPERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIOPERA) PAN_VARIAZIOPERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
