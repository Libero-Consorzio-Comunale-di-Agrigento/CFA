// **********************************************
// Scelta Testi Mail
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaTestiMail extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TESTIMAIL_CODICE = 0;
  private static int PFL_TESTIMAIL_DESCRIZIONE = 1;
  private static int PFL_TESTIMAIL_TESTO = 2;
  private static int PFL_TESTIMAIL_TESTOMAILID = 3;
  private static int PFL_TESTIMAIL_TESTOMAIL = 4;

  private static int PPQRY_POLTESTIMAI1 = 0;

  private static int PPQRY_TESTOMAIL = 1;


  IDPanel PAN_TESTIMAIL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR101(IMDB);
    //
    //
    Init_PQRY_POLTESTIMAI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR101(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PAR101, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PAR101, "TBL_PAR101");
    IMDB.set_FldCode(IMDBDef1.TBL_PAR101,IMDBDef1.FLD_PAR101_ROWNAMTIPEVE, "ROWNAMTIPEVE");
    IMDB.SetFldParams(IMDBDef1.TBL_PAR101,IMDBDef1.FLD_PAR101_ROWNAMTIPEVE,5,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PAR101, 0);
  }

  private static void Init_PQRY_POLTESTIMAI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_POLTESTIMAI1, 4);
    IMDB.set_TblCode(IMDBDef7.PQRY_POLTESTIMAI1, "PQRY_POLTESTIMAI1");
    IMDB.set_FldCode(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_TESTO, "TESTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_TESTO,5,2000,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_TESTO_MAIL_ID, "TESTO_MAIL_ID");
    IMDB.SetFldParams(IMDBDef7.PQRY_POLTESTIMAI1,IMDBDef7.PQSL_POLTESTIMAI1_TESTO_MAIL_ID,1,3,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_POLTESTIMAI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaTestiMail(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaTestiMail()
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
    FormIdx = MyGlb.FRM_SCELTESTMAIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0CD000D2-836E-44A9-AB1B-C134DF3CB203";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 536;
    DesignHeight = 394;
    set_Caption(new IDVariant("Scelta Testi Mail"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 536;
    Frames[1].Height = 368;
    Frames[1].Caption = "Testi Mail";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_TESTIMAIL = new IDPanel(w, this, 1, "PAN_TESTIMAIL");
    Frames[1].Content = PAN_TESTIMAIL;
    PAN_TESTIMAIL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TESTIMAIL.VS = MainFrm.VisualStyleList;
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 536-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "386F28AF-A8AA-438A-83F9-ED10BB929077");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 484, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TESTIMAIL.InitStatus = 2;
    PAN_TESTIMAIL_Init();
    PAN_TESTIMAIL_InitFields();
    PAN_TESTIMAIL_InitQueries();
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
      PAN_TESTIMAIL.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaTestiMail);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaTestiMail.class.getName() : (Glb.ClassWithPackage(SceltaTestiMail.class) ? SceltaTestiMail.class.getName().substring(SceltaTestiMail.class.getPackage().getName().length() + 1) : SceltaTestiMail.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Testi Mail On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TESTIMAIL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TESTIMAIL);
      // 
      // Testi Mail On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_TESTIMAIL.set_ToolTip(Glb.OBJ_FIELD,PFL_TESTIMAIL_DESCRIZIONE,(new IDVariant(PAN_TESTIMAIL.FieldText(PFL_TESTIMAIL_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTestiMail", "TestiMailOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Testo
  // **********************************************************************
  public int ApriTesto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Testo Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef7.PQRY_POLTESTIMAI1, IMDBDef7.PQSL_POLTESTIMAI1_TESTO, 0), (new IDVariant(PAN_TESTIMAIL.Header(Glb.OBJ_FIELD,PFL_TESTIMAIL_TESTOMAIL))), (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTestiMail", "ApriTesto", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef7.PQRY_POLTESTIMAI1, IMDBDef7.PQSL_POLTESTIMAI1_TESTO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTestiMail", "EndModalEvent", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TESTIMAIL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TESTIMAIL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TESTIMAIL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TESTIMAIL, Cancel);
    // Stub
  }

  private void PAN_TESTIMAIL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_TESTIMAIL_TESTOMAIL)
    {
      this.IdxPanelActived = this.PAN_TESTIMAIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriTesto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_TESTIMAIL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TESTIMAIL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TESTIMAIL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TESTIMAIL_Init()
  {

    PAN_TESTIMAIL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TESTIMAIL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TESTIMAIL.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, "7D74E143-84D2-47ED-8666-642ADE5AE1A3");
    PAN_TESTIMAIL.set_Header(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, "Codice");
    PAN_TESTIMAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, "");
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, "476D3A5B-4E97-480C-888F-80C3EF01D8F4");
    PAN_TESTIMAIL.set_Header(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, "Descrizione");
    PAN_TESTIMAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, "");
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, "7F3061C9-0CCD-43C2-9C79-8C3DDB7E9C53");
    PAN_TESTIMAIL.set_Header(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, "TESTO");
    PAN_TESTIMAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, "");
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.VIS_NORMALFIELDS);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, 0, -1);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, "2987A1BA-31EF-465F-B857-58AABB6F9C0F");
    PAN_TESTIMAIL.set_Header(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, "TESTO MAIL ID");
    PAN_TESTIMAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, "");
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TESTIMAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, "23E69EF0-DD13-42FB-8852-DF2611E05D32");
    PAN_TESTIMAIL.set_Header(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, "Testo Mail");
    PAN_TESTIMAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, "Testo Mail");
    PAN_TESTIMAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.VIS_HYPELINKIMMA);
    PAN_TESTIMAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TESTIMAIL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_FORM, 4, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TESTIMAIL.SetFieldPage(PFL_TESTIMAIL_CODICE, -1, -1);
    PAN_TESTIMAIL.SetFieldPanel(PFL_TESTIMAIL_CODICE, PPQRY_POLTESTIMAI1, "A.CODICE", "CODICE", 5, 10, 0, -13997);
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 60, 36, 368, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TESTIMAIL.SetFieldPage(PFL_TESTIMAIL_DESCRIZIONE, -1, -1);
    PAN_TESTIMAIL.SetFieldPanel(PFL_TESTIMAIL_DESCRIZIONE, PPQRY_POLTESTIMAI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_LIST, 568, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_LIST, 40);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_LIST, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_LIST, "TESTO");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_FORM, 4, 52, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_FORM, 40);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_FORM, 2);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTO, MyGlb.PANEL_FORM, "TES.");
    PAN_TESTIMAIL.SetFieldPage(PFL_TESTIMAIL_TESTO, -1, -1);
    PAN_TESTIMAIL.SetFieldPanel(PFL_TESTIMAIL_TESTO, PPQRY_POLTESTIMAI1, "A.TESTO", "TESTO", 5, 2000, 0, -13997);
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_LIST, 568, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_LIST, 84);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_LIST, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_LIST, "TESTO MAIL ID");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_FORM, 4, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_FORM, 84);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_FORM, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAILID, MyGlb.PANEL_FORM, "TES. MAIL ID");
    PAN_TESTIMAIL.SetFieldPage(PFL_TESTIMAIL_TESTOMAILID, -1, -1);
    PAN_TESTIMAIL.SetFieldPanel(PFL_TESTIMAIL_TESTOMAILID, PPQRY_POLTESTIMAI1, "A.TESTO_MAIL_ID", "TESTO_MAIL_ID", 1, 3, 0, -13997);
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_LIST, 428, 36, 56, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_LIST, 140);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_LIST, 1);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_LIST, "Testo Mail");
    PAN_TESTIMAIL.SetRect(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_FORM, 4, 52, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTIMAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_FORM, 140);
    PAN_TESTIMAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_FORM, 2);
    PAN_TESTIMAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTIMAIL_TESTOMAIL, MyGlb.PANEL_FORM, "Testo Mail");
    PAN_TESTIMAIL.SetFieldPage(PFL_TESTIMAIL_TESTOMAIL, -1, -1);
    PAN_TESTIMAIL.SetFieldPanel(PFL_TESTIMAIL_TESTOMAIL, PPQRY_TESTOMAIL, "CASE WHEN NOT ((~~TESTO_MAIL_ID~~ IS NULL)) THEN CASE WHEN NOT ((~~TESTO~~ IS NULL)) THEN 'P' ELSE 'N' END ELSE '' END", "ROWNAMNEWEXP", 5, 99, 0, -13997);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_TESTIMAIL.SetValueListItem(PFL_TESTIMAIL_TESTOMAIL, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
  }

  private void PAN_TESTIMAIL_InitQueries()
  {
    StringBuffer SQL;

    PAN_TESTIMAIL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((~~TESTO_MAIL_ID~~ IS NULL)) THEN CASE WHEN NOT ((~~TESTO~~ IS NULL)) THEN 'P' ELSE 'N' END ELSE '' END as ROWNAMNEWEXP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_TESTIMAIL.SetQuery(PPQRY_TESTOMAIL, 0, SQL, -1, "");
    PAN_TESTIMAIL.SetQueryDB(PPQRY_TESTOMAIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TESTIMAIL.SetMasterTable(PPQRY_TESTOMAIL, "DUAL");
    PAN_TESTIMAIL.SetIMDB(IMDB, "PQRY_POLTESTIMAI1", true);
    PAN_TESTIMAIL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TESTO as TESTO, ");
    SQL.append("  A.TESTO_MAIL_ID as TESTO_MAIL_ID ");
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_TESTI_MAIL A ");
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_EVENTO = ~~TBL_PAR101.ROWNAMTIPEVE~~) ");
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TESTIMAIL.SetQuery(PPQRY_POLTESTIMAI1, 5, SQL, -1, "");
    PAN_TESTIMAIL.SetQueryDB(PPQRY_POLTESTIMAI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TESTIMAIL.SetMasterTable(0, "POL_TESTI_MAIL");
    PAN_TESTIMAIL.AddToSortList(PFL_TESTIMAIL_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TESTIMAIL.Status() == 2)
    {
      int oldListQBE = PAN_TESTIMAIL.iUseListQBE;
      PAN_TESTIMAIL.iUseListQBE = 0;
      PAN_TESTIMAIL.PanelCommand(Glb.PCM_SEARCH);
      PAN_TESTIMAIL.PanelCommand(Glb.PCM_FIND);
      PAN_TESTIMAIL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TESTIMAIL) PAN_TESTIMAIL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTIMAIL) PAN_TESTIMAIL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TESTIMAIL) PAN_TESTIMAIL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TESTIMAIL) PAN_TESTIMAIL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TESTIMAIL) PAN_TESTIMAIL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
