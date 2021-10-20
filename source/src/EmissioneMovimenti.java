// **********************************************
// Emissione Movimenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneMovimenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_EMISSIMOVIME_DESCRIZIONE = 0;
  private static int PFL_EMISSIMOVIME_ELABORALABEL = 1;

  private static int PPQRY_NOTEFUNZION6 = 0;


  IDPanel PAN_EMISSIMOVIME;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI648(IMDB);
    //
    //
    Init_PQRY_NOTEFUNZION6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI648(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI648, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI648, "TBL_PARAMETRI648");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI648,IMDBDef5.FLD_PARAMETRI648_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI648,IMDBDef5.FLD_PARAMETRI648_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI648,IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI648,IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI,5,20,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI648, 0);
  }

  private static void Init_PQRY_NOTEFUNZION6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NOTEFUNZION6, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_NOTEFUNZION6, "PQRY_NOTEFUNZION6");
    IMDB.set_FldCode(IMDBDef14.PQRY_NOTEFUNZION6,IMDBDef14.PQSL_NOTEFUNZION6_RECNOTFUNDES, "RECNOTFUNDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_NOTEFUNZION6,IMDBDef14.PQSL_NOTEFUNZION6_RECNOTFUNDES,9,9999,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_NOTEFUNZION6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneMovimenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneMovimenti()
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
    FormIdx = MyGlb.FRM_EMISSIMOVIME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A43A4127-D112-4CAA-B4FA-6D15F8D7D162";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 628;
    DesignHeight = 182;
    set_Caption(new IDVariant("Emissione Movimenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 628;
    Frames[1].Height = 156;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissione Movimenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 156;
    PAN_EMISSIMOVIME = new IDPanel(w, this, 1, "PAN_EMISSIMOVIME");
    Frames[1].Content = PAN_EMISSIMOVIME;
    PAN_EMISSIMOVIME.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIMOVIME.VS = MainFrm.VisualStyleList;
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 628-MyGlb.PAN_OFFS_X, 156-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIMOVIME.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "00944DDA-51F9-493B-9588-311F19956E7B");
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_EMISSIMOVIME.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIMOVIME.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIMOVIME.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIMOVIME.InitStatus = 1;
    PAN_EMISSIMOVIME_Init();
    PAN_EMISSIMOVIME_InitFields();
    PAN_EMISSIMOVIME_InitQueries();
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
      PAN_EMISSIMOVIME.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneMovimenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneMovimenti.class.getName() : (Glb.ClassWithPackage(EmissioneMovimenti.class) ? EmissioneMovimenti.class.getName().substring(EmissioneMovimenti.class.getPackage().getName().length() + 1) : EmissioneMovimenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_STATCENTCOMO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
      v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
      IDVariant v_ACCDA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ACCA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ACCDAA = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DALNUMERO = new IDVariant(0,IDVariant.STRING);
      v_DALNUMERO = (new IDVariant("dal numero "));
      IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
      v_AL = (new IDVariant(" al "));
      IDVariant v_NESSUNO = new IDVariant(0,IDVariant.STRING);
      v_NESSUNO = (new IDVariant("Nessuno"));
      IDVariant v_TERMINANATA = new IDVariant(0,IDVariant.STRING);
      v_TERMINANATA = (new IDVariant("Procedura terminata."));
      IDVariant v_EMESSI = new IDVariant(0,IDVariant.STRING);
      v_EMESSI = (new IDVariant(" emessi: "));
      IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.IMPORTMOVIMENTIDAFILEEMISSIONEMOVGRUPPI(IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARACODIGRUP, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_ACCDA, v_ACCA, v_NSUPDISPPURO, v_STATCENTCOMO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if (v_STATCENTCOMO.equals((new IDVariant(1)), true))
      {
        IDVariant v_AVVISTOSTATI = new IDVariant(0,IDVariant.STRING);
        v_AVVISTOSTATI = (new IDVariant("Attenzione: E' stato utilizzato il centro di comodo per uno o più movimenti creati", IDVariant.STRING));
        v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_AVVISTOSTATI), (new IDVariant("<BR/>")));
      }
      if (v_ACCDA.compareTo(v_ACCA, true)>0)
      {
        v_ACCDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_ACCDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_ACCDA)), v_AL), IDL.ToString(v_ACCA));
      }
      v_CONFERMA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CONFERMA, v_TERMINANATA), (new IDVariant("<BR/>"))), (IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant())), v_EMESSI), v_ACCDAA), (new IDVariant("<BR/>")));
      if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
      {
        v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
      }
      MainFrm.set_AlertMessage(v_CONFERMA); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMovimenti", "Elabora", _e);
      return -1;
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
      IDVariant v_EMISSIONE = new IDVariant(0,IDVariant.STRING);
      v_EMISSIONE = (new IDVariant("Emissione "));
      set_Caption(IDL.Add(v_EMISSIONE, (IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant())));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMovimenti", "Load", _e);
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
  private void PAN_EMISSIMOVIME_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIMOVIME, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIMOVIME_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIMOVIME, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIMOVIME_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_EMISSIMOVIME);
    // Stub
  }

  private void PAN_EMISSIMOVIME_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIMOVIME_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_EMISSIMOVIME.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIMOVIME_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIMOVIME_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIMOVIME_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIMOVIME_Init()
  {

    PAN_EMISSIMOVIME.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIMOVIME.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_EMISSIMOVIME.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_EMISSIMOVIME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, "62652B66-6810-4592-98EC-89AE394C9EDC");
    PAN_EMISSIMOVIME.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, "DESCRIZIONE");
    PAN_EMISSIMOVIME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, "");
    PAN_EMISSIMOVIME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_EMISSIMOVIME.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIMOVIME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, "804278C6-E597-42FB-97CD-CB942EFC6284");
    PAN_EMISSIMOVIME.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, "Elabora");
    PAN_EMISSIMOVIME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIMOVIME.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, 0, "button1.gif", false);
    PAN_EMISSIMOVIME.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_EMISSIMOVIME_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIMOVIME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_EMISSIMOVIME.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_EMISSIMOVIME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 12, 572, 80, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIMOVIME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_EMISSIMOVIME.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_FORM, 6);
    PAN_EMISSIMOVIME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_EMISSIMOVIME.SetFieldPage(PFL_EMISSIMOVIME_DESCRIZIONE, -1, -1);
    PAN_EMISSIMOVIME.SetFieldPanel(PFL_EMISSIMOVIME_DESCRIZIONE, PPQRY_NOTEFUNZION6, "A.DESCRIZIONE", "RECNOTFUNDES", 9, 9999, 0, -13997);
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_LIST, 424, 416, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIMOVIME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIMOVIME.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIMOVIME.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_FORM, 516, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIMOVIME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIMOVIME.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIMOVIME_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIMOVIME.SetFieldPage(PFL_EMISSIMOVIME_ELABORALABEL, -1, -1);
    PAN_EMISSIMOVIME.SetFieldPanel(PFL_EMISSIMOVIME_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
  }

  private void PAN_EMISSIMOVIME_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIMOVIME.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_EMISSIMOVIME.SetIMDB(IMDB, "PQRY_NOTEFUNZION6", true);
    PAN_EMISSIMOVIME.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as RECNOTFUNDES ");
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = 'CFA') ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_EMISSIMOVIME,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = DECODE(~~TBL_PARAMETRI648.PARATIPOMOVI~~, 'ACC', 'Accertamenti', 'IMP', 'Impegni', 'SUBIMP', 'Subimpegni', 'ORD', 'Ordinativi', 'LIQ', 'Liquidazioni')) ");
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISSIMOVIME.SetQuery(PPQRY_NOTEFUNZION6, 5, SQL, -1, "");
    PAN_EMISSIMOVIME.SetQueryDB(PPQRY_NOTEFUNZION6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIMOVIME.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIMOVIME.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIMOVIME.iUseListQBE;
      PAN_EMISSIMOVIME.iUseListQBE = 0;
      PAN_EMISSIMOVIME.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIMOVIME.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIMOVIME.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIMOVIME) PAN_EMISSIMOVIME_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIMOVIME) PAN_EMISSIMOVIME_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIMOVIME) PAN_EMISSIMOVIME_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIMOVIME) PAN_EMISSIMOVIME_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIMOVIME) PAN_EMISSIMOVIME_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
