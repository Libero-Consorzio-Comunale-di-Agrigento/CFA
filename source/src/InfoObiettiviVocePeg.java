// **********************************************
// Info Obiettivi Voce Peg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoObiettiviVocePeg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROGETOBIETT_PROGRAMMA = 0;
  private static int PFL_PROGETOBIETT_PROGETTO = 1;
  private static int PFL_PROGETOBIETT_OBIETTIVO = 2;
  private static int PFL_PROGETOBIETT_DESCRIZIONE = 3;
  private static int PFL_PROGETOBIETT_STANZINIZIAL = 4;
  private static int PFL_PROGETOBIETT_VARIAZIONI = 5;
  private static int PFL_PROGETOBIETT_STANZDEFINIT = 6;
  private static int PFL_PROGETOBIETT_IMPACC = 7;
  private static int PFL_PROGETOBIETT_DISPONIBILIT = 8;

  private static int PPQRY_POLDETSTNPRO = 0;


  IDPanel PAN_PROGETOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM42(IMDB);
    //
    //
    Init_PQRY_POLDETSTNPRO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM42(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM42, 5);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM42, "TBL_PARAM42");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMERISOR, "ROWNAMERISOR");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMERISOR,1,7,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM42,IMDBDef1.FLD_PARAM42_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM42, 0);
  }

  private static void Init_PQRY_POLDETSTNPRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_POLDETSTNPRO, 9);
    IMDB.set_TblCode(IMDBDef8.PQRY_POLDETSTNPRO, "PQRY_POLDETSTNPRO");
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_PROGETTO, "PROGETTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_PROGETTO,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_DES_OBIETTIVO, "DES_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_DES_OBIETTIVO,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_StanzIniziale, "StanzIniziale");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_StanzIniziale,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_variazioni, "variazioni");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_variazioni,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_stanzDefinitivo, "stanzDefinitivo");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_stanzDefinitivo,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_ImpAcc, "ImpAcc");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_ImpAcc,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_Disponibilit_, "Disponibilità");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPRO,IMDBDef8.PQSL_POLDETSTNPRO_Disponibilit_,2,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_POLDETSTNPRO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoObiettiviVocePeg(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoObiettiviVocePeg()
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
    FormIdx = MyGlb.FRM_INFOBIVOCPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "299CC17D-2344-49AC-901B-FAEA4335B6FE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 366;
    set_Caption(new IDVariant("Info Obiettivi Voce Peg"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 340;
    Frames[1].Caption = "Progetti Obiettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_PROGETOBIETT = new IDPanel(w, this, 1, "PAN_PROGETOBIETT");
    Frames[1].Content = PAN_PROGETOBIETT;
    PAN_PROGETOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGETOBIETT.VS = MainFrm.VisualStyleList;
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1FE0F2FA-8F73-4821-BFA7-1C54DAEFF958");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 952, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROGETOBIETT.InitStatus = 2;
    PAN_PROGETOBIETT_Init();
    PAN_PROGETOBIETT_InitFields();
    PAN_PROGETOBIETT_InitQueries();
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
      PAN_PROGETOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoObiettiviVocePeg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoObiettiviVocePeg.class.getName() : (Glb.ClassWithPackage(InfoObiettiviVocePeg.class) ? InfoObiettiviVocePeg.class.getName().substring(InfoObiettiviVocePeg.class.getPackage().getName().length() + 1) : InfoObiettiviVocePeg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Progetti Obiettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROGETOBIETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROGETOBIETT);
      // 
      // Progetti Obiettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROGETOBIETT.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGETOBIETT_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_POLDETSTNPRO, IMDBDef8.PQSL_POLDETSTNPRO_DES_OBIETTIVO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoObiettiviVocePeg", "ProgettiObiettiviOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Progetti/Obiettivi", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Impegnato", IDVariant.STRING));
      v_CAPTION2 = (new IDVariant("Accertato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMEESERC, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
      if (IMDB.Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_PROGETOBIETT.set_Header(Glb.OBJ_FIELD,PFL_PROGETOBIETT_IMPACC, new IDVariant(v_CAPTION1).stringValue());
      }
      else
      {
        PAN_PROGETOBIETT.set_Header(Glb.OBJ_FIELD,PFL_PROGETOBIETT_IMPACC, new IDVariant(v_CAPTION2).stringValue());
      }
      Frames[PAN_PROGETOBIETT.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoObiettiviVocePeg", "LoadEvent", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoObiettiviVocePeg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMEES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMERISOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM42, IMDBDef1.FLD_PARAM42_ROWNAMEARTIC, 0, new IDVariant());
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PROGETOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROGETOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROGETOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROGETOBIETT, Cancel);
    // Stub
  }

  private void PAN_PROGETOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROGETOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROGETOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROGETOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROGETOBIETT_Init()
  {

    PAN_PROGETOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROGETOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROGETOBIETT.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, "3EA9BCAB-2249-4EC1-A9EE-5A219219DEFF");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, "Programma");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, "3219706A-31D9-4BFC-87EE-9EDDE77B2FE2");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, "Obiettivo Operativo");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, "2ACE973A-8B0F-4786-8D34-0E09AFCFF1CF");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, "Obiettivo Gestionale");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, "2941E855-6FD2-4ECA-A92B-C97E0E598777");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, "Descrizione");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, "CA66F8DA-C5A7-478E-AC45-395215BDB1E5");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, "Stanz. Iniziale");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, "10C41992-3AF0-4EC3-B524-53BB97A3B76F");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, "Variazioni");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, "B6C41E82-FA1C-4EDB-B996-1EED4B712368");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, "Stanz. Definitivo");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, "FA1301BB-60BB-4371-AC4E-3B40482FE470");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, "Imp Acc");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, "CE820F4B-3FB3-4017-A935-96F72496CD4B");
    PAN_PROGETOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, "Disponibilità");
    PAN_PROGETOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, "");
    PAN_PROGETOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROGETOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 276, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGRAMMA, MyGlb.PANEL_FORM, "Progr.");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_PROGRAMMA, -1, -1);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_PROGRAMMA, PPQRY_POLDETSTNPRO, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_LIST, 76, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_LIST, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_FORM, 420, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_FORM, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_PROGETTO, MyGlb.PANEL_FORM, "Ob. Oper.");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_PROGETTO, -1, -1);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_PROGETTO, PPQRY_POLDETSTNPRO, "A.PROGETTO", "PROGETTO", 5, 4, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 144, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_OBIETTIVO, MyGlb.PANEL_FORM, "Ob. Gest.");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_OBIETTIVO, -1, -1);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_OBIETTIVO, PPQRY_POLDETSTNPRO, "A.OBIETTIVO", "OBIETTIVO", 5, 10, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 216, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_DESCRIZIONE, -1, -1);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_DESCRIZIONE, PPQRY_POLDETSTNPRO, "A.DES_OBIETTIVO", "DES_OBIETTIVO", 5, 100, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_LIST, 472, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_LIST, 72);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_LIST, "Stanz. Iniziale");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_FORM, 4, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_FORM, 72);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZINIZIAL, MyGlb.PANEL_FORM, "St. Iniziale");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_STANZINIZIAL, -1, -1);
    PAN_PROGETOBIETT.SetFieldUnbound(PFL_PROGETOBIETT_STANZINIZIAL, true);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_STANZINIZIAL, PPQRY_POLDETSTNPRO, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0)", "StanzIniziale", 2, 19, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_LIST, 568, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_FORM, 4, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_FORM, 56);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_VARIAZIONI, MyGlb.PANEL_FORM, "Variaz.");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_VARIAZIONI, -1, -1);
    PAN_PROGETOBIETT.SetFieldUnbound(PFL_PROGETOBIETT_VARIAZIONI, true);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_VARIAZIONI, PPQRY_POLDETSTNPRO, "NVL(A.VAR_DEF, 0)", "variazioni", 2, 19, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_LIST, 664, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_LIST, 84);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_FORM, 4, 28, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_FORM, 84);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_STANZDEFINIT, MyGlb.PANEL_FORM, "St. Definitivo");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_STANZDEFINIT, -1, -1);
    PAN_PROGETOBIETT.SetFieldUnbound(PFL_PROGETOBIETT_STANZDEFINIT, true);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_STANZDEFINIT, PPQRY_POLDETSTNPRO, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0)", "stanzDefinitivo", 2, 19, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_LIST, 760, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_LIST, 48);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_LIST, "Imp Acc");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_FORM, 48);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_IMPACC, MyGlb.PANEL_FORM, "Im. Acc");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_IMPACC, -1, -1);
    PAN_PROGETOBIETT.SetFieldUnbound(PFL_PROGETOBIETT_IMPACC, true);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_IMPACC, PPQRY_POLDETSTNPRO, "NVL(A.IMP_ACC, 0)", "ImpAcc", 2, 19, 0, -13997);
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 856, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_PROGETOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 64);
    PAN_PROGETOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_PROGETOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETOBIETT_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon.");
    PAN_PROGETOBIETT.SetFieldPage(PFL_PROGETOBIETT_DISPONIBILIT, -1, -1);
    PAN_PROGETOBIETT.SetFieldUnbound(PFL_PROGETOBIETT_DISPONIBILIT, true);
    PAN_PROGETOBIETT.SetFieldPanel(PFL_PROGETOBIETT_DISPONIBILIT, PPQRY_POLDETSTNPRO, "NVL(A.DISP, 0)", "Disponibilità", 2, 19, 0, -13997);
  }

  private void PAN_PROGETOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGETOBIETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROGETOBIETT.SetIMDB(IMDB, "PQRY_POLDETSTNPRO", true);
    PAN_PROGETOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "POL DETTAGLIO STN PROG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.PROGETTO as PROGETTO, ");
    SQL.append("  A.OBIETTIVO as OBIETTIVO, ");
    SQL.append("  A.DES_OBIETTIVO as DES_OBIETTIVO, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) as StanzIniziale, ");
    SQL.append("  NVL(A.VAR_DEF, 0) as variazioni, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0) as stanzDefinitivo, ");
    SQL.append("  NVL(A.IMP_ACC, 0) as ImpAcc, ");
    SQL.append("  NVL(A.DISP, 0) as Disponibilità ");
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_DETTAGLIO_STN_OB A ");
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = NVL(~~TBL_PARAM42.ROWNAMEESERC~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.ESERCIZIO_STN = NVL(~~TBL_PARAM42.ROWNAMEESERC~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAM42.ROWNAMEES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAM42.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAM42.ROWNAMEARTIC~~) ");
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETOBIETT.SetQuery(PPQRY_POLDETSTNPRO, 5, SQL, -1, "");
    PAN_PROGETOBIETT.SetQueryDB(PPQRY_POLDETSTNPRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGETOBIETT.SetMasterTable(0, "POL_DETTAGLIO_STN_OB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROGETOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_PROGETOBIETT.iUseListQBE;
      PAN_PROGETOBIETT.iUseListQBE = 0;
      PAN_PROGETOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROGETOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_PROGETOBIETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROGETOBIETT) PAN_PROGETOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETOBIETT) PAN_PROGETOBIETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROGETOBIETT) PAN_PROGETOBIETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETOBIETT) PAN_PROGETOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROGETOBIETT) PAN_PROGETOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
