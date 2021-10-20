// **********************************************
// Mandati Emessi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiEmessi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MANDATEMESSI_NUMEROMAND = 0;
  private static int PFL_MANDATEMESSI_ANNOMAND = 1;
  private static int PFL_MANDATEMESSI_DATA = 2;
  private static int PFL_MANDATEMESSI_IMPORTO = 3;
  private static int PFL_MANDATEMESSI_PAGATO = 4;
  private static int PFL_MANDATEMESSI_CAPITOLO = 5;
  private static int PFL_MANDATEMESSI_ARTICOLO = 6;
  private static int PFL_MANDATEMESSI_NUMEROIMP = 7;
  private static int PFL_MANDATEMESSI_ANNOIMP = 8;
  private static int PFL_MANDATEMESSI_LABELMANDATO = 9;
  private static int PFL_MANDATEMESSI_CAPITOLLABEL = 10;
  private static int PFL_MANDATEMESSI_LABELIMPEGNO = 11;
  private static int PFL_MANDATEMESSI_MANDATO = 12;
  private static int PFL_MANDATEMESSI_RIFBILANCPEG = 13;
  private static int PFL_MANDATEMESSI_IMPEGNO = 14;

  private static int PPQRY_LIQ49 = 0;


  IDPanel PAN_MANDATEMESSI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI50(IMDB);
    //
    //
    Init_PQRY_LIQ49(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI50(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI50, 8);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI50, "TBL_PARAMETRI50");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMDATA,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMTIPO,5,15,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMANNOIMP, "PARAMANNOIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMANNOIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMNUMEIMP, "PARAMNUMEIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAANNOSUBI, "PARAANNOSUBI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARAANNOSUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARANUMESUBI, "PARANUMESUBI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARANUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARESEANNMAN, "PARESEANNMAN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI50,IMDBDef1.FLD_PARAMETRI50_PARESEANNMAN,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI50, 0);
  }

  private static void Init_PQRY_LIQ49(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQ49, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQ49, "PQRY_LIQ49");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQMANDATO, "LIQMANDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQMANDATO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_PAGATO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQRIFBILPEG, "LIQRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_LIQIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ49,IMDBDef8.PQSL_LIQ49_ANNO_IMP,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQ49, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiEmessi(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiEmessi()
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
    FormIdx = MyGlb.FRM_MANDATEMESSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "40713B60-609D-4124-857B-A15025253DE4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 664;
    DesignHeight = 406;
    set_Caption(new IDVariant("Mandati Emessi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 664;
    Frames[1].Height = 380;
    Frames[1].Caption = "Mandati Emessi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_MANDATEMESSI = new IDPanel(w, this, 1, "PAN_MANDATEMESSI");
    Frames[1].Content = PAN_MANDATEMESSI;
    PAN_MANDATEMESSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATEMESSI.VS = MainFrm.VisualStyleList;
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 664-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A91F76D4-7117-4B08-BBC8-9217E60D7861");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 600, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATEMESSI.InitStatus = 2;
    PAN_MANDATEMESSI_Init();
    PAN_MANDATEMESSI_InitFields();
    PAN_MANDATEMESSI_InitQueries();
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
      PAN_MANDATEMESSI.UpdatePanel(MainFrm);
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
    return (obj instanceof MandatiEmessi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiEmessi.class.getName() : (Glb.ClassWithPackage(MandatiEmessi.class) ? MandatiEmessi.class.getName().substring(MandatiEmessi.class.getPackage().getName().length() + 1) : MandatiEmessi.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0))))
      {
        Frames[PAN_MANDATEMESSI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_MANDATEMESSI.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), (new IDVariant("Finanziamento")))))).stringValue());
        set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("Finanziamento")), MainFrm.ESERCIZIO))))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiEmessi", "LoadEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiEmessi", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMANNOIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMNUMEIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAANNOSUBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARANUMESUBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARESEANNMAN, 0, new IDVariant());
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
  private void PAN_MANDATEMESSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDATEMESSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATEMESSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATEMESSI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATEMESSI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANDATEMESSI);
    // Stub
  }

  private void PAN_MANDATEMESSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MANDATEMESSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATEMESSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQ49, IMDBDef8.PQSL_LIQ49_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_LIQ49, IMDBDef8.PQSL_LIQ49_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MANDATEMESSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MANDATEMESSI_Init()
  {

    PAN_MANDATEMESSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATEMESSI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANDATEMESSI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, "FC33E0C0-9BBD-4D0B-9CDF-6AEF1BA36482");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, "NUMERO MAND");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, "FF7775B0-0E6C-42AF-94E0-704CEDB59AE3");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, "ANNO MAND");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, "292B1DFD-1791-4BDD-B48F-FC84DB7E2ED1");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, "Data");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, "FE953247-49D3-420F-A4C5-416EE2344661");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, "Importo");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, "9D2CBA40-3B62-436E-B9CD-7B3B4975B207");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, "Pagato");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, "18BA8037-9F1D-4AA5-B0DB-C65FDB15747C");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, "CAPITOLO");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, "3F3F4C4F-798B-4E0D-8A6B-D6ECEE4705B5");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, "ARTICOLO");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, "126BAC40-769B-4BD2-8AC0-51758FE74AA5");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, "NUMERO IMP");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, "FAFE7112-6A6A-4835-91A6-3E4F3B4FA16E");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, "ANNO IMP");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, "53E8CAE6-B3AE-443C-9C22-DF23861B9BF3");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, "Mandato");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, "7BD02350-BE3C-4041-9CC1-016437B8AB91");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, "Capitolo");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, "E1139871-910D-4EF8-83D8-92FB0CE4759B");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, "Impegno");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, "445806B2-FF00-4382-98BF-28472BF625AC");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, "Mandato");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, "8F64101A-33B2-4771-B346-05DF8EF89D7B");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, "Rif Bilancio PEG");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATEMESSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, "D94C8C92-40FB-4244-A68B-CA5CAD3F5341");
    PAN_MANDATEMESSI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, "Impegno");
    PAN_MANDATEMESSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, "");
    PAN_MANDATEMESSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATEMESSI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANDATEMESSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_LIST, 0, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 724, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_NUMEROMAND, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_NUMEROMAND, PPQRY_LIQ49, "B.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_LIST, 44, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_FORM, 4, 748, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_ANNOMAND, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_ANNOMAND, PPQRY_LIQ49, "B.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_LIST, 84, 40, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_LIST, 80);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_FORM, 4, 556, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_FORM, 80);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_DATA, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_DATA, PPQRY_LIQ49, "B.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_LIST, 156, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_FORM, 4, 580, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_IMPORTO, -1, -1);
    PAN_MANDATEMESSI.SetFieldUnbound(PFL_MANDATEMESSI_IMPORTO, true);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_IMPORTO, PPQRY_LIQ49, "SUM(A.IMPORTO)", "LIQIMPORTO", 3, 28, 6, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_LIST, 256, 40, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_FORM, 4, 604, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_FORM, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_PAGATO, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_PAGATO, PPQRY_LIQ49, "B.PAGATO", "PAGATO", 3, 14, 2, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 356, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 4, 796, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_CAPITOLO, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_CAPITOLO, PPQRY_LIQ49, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 496, 40, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 4, 820, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_ARTICOLO, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_ARTICOLO, PPQRY_LIQ49, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_LIST, 520, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 844, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_NUMEROIMP, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_NUMEROIMP, PPQRY_LIQ49, "B.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_LIST, 564, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_FORM, 4, 868, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_ANNOIMP, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_ANNOIMP, PPQRY_LIQ49, "B.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_LIST, 0, 4, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_LIST, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_FORM, 0, 0, 84, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_FORM, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELMANDATO, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_LABELMANDATO, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_LABELMANDATO, -1, "", "LABELMANDATO", 0, 0, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_LIST, 356, 4, 164, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_FORM, 8, 8, 84, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_CAPITOLLABEL, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_CAPITOLLABEL, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_CAPITOLLABEL, -1, "", "CAPITOLLABEL", 0, 0, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_LIST, 520, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_FORM, 16, 16, 84, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_LABELIMPEGNO, -1, -1);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_FORM, 12, 900, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_FORM, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_MANDATO, MyGlb.PANEL_FORM, "Mand.");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_MANDATO, -1, -1);
    PAN_MANDATEMESSI.SetFieldUnbound(PFL_MANDATEMESSI_MANDATO, true);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_MANDATO, PPQRY_LIQ49, "TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND )", "LIQMANDATO", 5, 201, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 84);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio PEG");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 892, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 84);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio PEG");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_RIFBILANCPEG, -1, -1);
    PAN_MANDATEMESSI.SetFieldUnbound(PFL_MANDATEMESSI_RIFBILANCPEG, true);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_RIFBILANCPEG, PPQRY_LIQ49, "TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO )", "LIQRIFBILPEG", 5, 201, 0, -13997);
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_MANDATEMESSI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_FORM, 4, 892, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATEMESSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_MANDATEMESSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MANDATEMESSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATEMESSI_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDATEMESSI.SetFieldPage(PFL_MANDATEMESSI_IMPEGNO, -1, -1);
    PAN_MANDATEMESSI.SetFieldUnbound(PFL_MANDATEMESSI_IMPEGNO, true);
    PAN_MANDATEMESSI.SetFieldPanel(PFL_MANDATEMESSI_IMPEGNO, PPQRY_LIQ49, "TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP )", "LIQIMPEGNO", 5, 201, 0, -13997);
  }

  private void PAN_MANDATEMESSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATEMESSI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MANDATEMESSI.SetIMDB(IMDB, "PQRY_LIQ49", true);
    PAN_MANDATEMESSI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND ) as LIQMANDATO, ");
    SQL.append("  B.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  SUM(A.IMPORTO) as LIQIMPORTO, ");
    SQL.append("  B.PAGATO as PAGATO, ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO ) as LIQRIFBILPEG, ");
    SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ) as LIQIMPEGNO, ");
    SQL.append("  B.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  B.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP ");
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  MAN B ");
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
    SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
    SQL.append("and   (B.ANNO_MAND = NVL(~~TBL_PARAMETRI50.PARESEANNMAN~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   ((DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'a Residuo', B.ANNO_IMP, 1) < DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'a Residuo', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2)) AND (DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'di Competenza', B.ANNO_IMP, 1) = DECODE(~~TBL_PARAMETRI50.PARAMTIPO~~, 'di Competenza', ~~TBL_DATISESSIONE.SESSIOESERCI~~, 1)) OR (~~TBL_PARAMETRI50.PARAMTIPO~~ IS NULL)) ");
    SQL.append("and   (B.D_DATA_MAND <= NVL(~~TBL_PARAMETRI50.PARAMDATA~~, TRUNC( SYSDATE ))) ");
    SQL.append("and   (NVL(A.FINANZIAMENTO, -1) = NVL(~~TBL_PARAMETRI50.PARAMFINANZI~~, NVL(A.FINANZIAMENTO, -1))) ");
    SQL.append("and   (A.ANNO_IMP = NVL(~~TBL_PARAMETRI50.PARAMANNOIMP~~, A.ANNO_IMP)) ");
    SQL.append("and   (A.NUMERO_IMP = NVL(~~TBL_PARAMETRI50.PARAMNUMEIMP~~, A.NUMERO_IMP)) ");
    SQL.append("and   (NVL(A.ANNO_SUBIMP, -1) = NVL(~~TBL_PARAMETRI50.PARAANNOSUBI~~, NVL(A.ANNO_SUBIMP, -1))) ");
    SQL.append("and   (NVL(A.NUMERO_SUBIMP, -1) = NVL(~~TBL_PARAMETRI50.PARANUMESUBI~~, NVL(A.NUMERO_SUBIMP, -1))) ");
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND ), ");
    SQL.append("  B.D_DATA_MAND, ");
    SQL.append("  B.PAGATO, ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO ), ");
    SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ), ");
    SQL.append("  B.NUMERO_MAND, ");
    SQL.append("  B.ANNO_MAND, ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.NUMERO_IMP, ");
    SQL.append("  B.ANNO_IMP ");
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_MAND, ");
    SQL.append("  B.NUMERO_MAND ");
    PAN_MANDATEMESSI.SetQuery(PPQRY_LIQ49, 5, SQL, -1, "");
    PAN_MANDATEMESSI.SetQueryDB(PPQRY_LIQ49, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATEMESSI.SetMasterTable(0, "LIQ");
    PAN_MANDATEMESSI.AddToSortList(PFL_MANDATEMESSI_ANNOMAND, true);
    PAN_MANDATEMESSI.AddToSortList(PFL_MANDATEMESSI_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDATEMESSI.Status() == 2)
    {
      int oldListQBE = PAN_MANDATEMESSI.iUseListQBE;
      PAN_MANDATEMESSI.iUseListQBE = 0;
      PAN_MANDATEMESSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATEMESSI.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATEMESSI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MANDATEMESSI) PAN_MANDATEMESSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATEMESSI) PAN_MANDATEMESSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDATEMESSI) PAN_MANDATEMESSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATEMESSI) PAN_MANDATEMESSI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDATEMESSI) PAN_MANDATEMESSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
