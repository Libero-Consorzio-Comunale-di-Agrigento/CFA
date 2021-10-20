// **********************************************
// Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Incassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_INCASSI_DEBITORE = 0;
  private static int PFL_INCASSI_INCASSO = 1;
  private static int PFL_INCASSI_DATA = 2;
  private static int PFL_INCASSI_NUMERO = 3;
  private static int PFL_INCASSI_FATNUMERODOC = 4;
  private static int PFL_INCASSI_FATDDATADOC = 5;
  private static int PFL_INCASSI_QUIETANZA = 6;
  private static int PFL_INCASSI_TOTALE = 7;
  private static int PFL_INCASSI_DOCUMENLABEL = 8;
  private static int PFL_INCASSI_ANNOPRE = 9;
  private static int PFL_INCASSI_NUMEROPRE = 10;
  private static int PFL_INCASSI_ORDINATIVO = 11;
  private static int PFL_INCASSI_IMPORTO = 12;
  private static int PFL_INCASSI_UTENTEINSERI = 13;
  private static int PFL_INCASSI_DATAINSERIME = 14;
  private static int PFL_INCASSI_UTENTULTIAGG = 15;
  private static int PFL_INCASSI_DATAULTIMAGG = 16;
  private static int PFL_INCASSI_PROGRESSIVO = 17;

  private static int PPQRY_INCASSI1 = 0;

  private static int PPQRY_DEBITORE = 1;
  private static int PPQRY_QUIETANZA = 2;
  private static int PPQRY_DOCUMENTO = 3;


  IDPanel PAN_INCASSI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI229(IMDB);
    //
    //
    Init_PQRY_INCASSI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI229(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI229, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI229, "TBL_PARAMETRI229");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMANNOORD, "PARAMANNOORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMANNOORD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMNUMEORD, "PARAMNUMEORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMNUMEORD,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMDATAORD, "PARAMDATAORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMDATAORD,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMIMPOORD, "PARAMIMPOORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMIMPOORD,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMINFO, "PARAMINFO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI229,IMDBDef5.FLD_PARAMETRI229_PARAMINFO,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI229, 0);
  }

  private static void Init_PQRY_INCASSI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_INCASSI1, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_INCASSI1, "PQRY_INCASSI1");
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_INC, "DATA_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_INC,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_INC, "NUMERO_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_NUMERO_INC,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_ESTRATTO_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_INC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_CCP, "D_DATA_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_CCP,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_ESTRATTO_CCP, "D_DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_D_DATA_ESTRATTO_CCP,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI1,IMDBDef15.PQSL_INCASSI1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_INCASSI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Incassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public Incassi()
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
    FormIdx = MyGlb.FRM_INCASSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F8A9711E-615E-4C9D-AE25-65A2FBE3F5E6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 824;
    DesignHeight = 430;
    set_Caption(new IDVariant("Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 824;
    Frames[1].Height = 404;
    Frames[1].Caption = "Incassi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 404;
    PAN_INCASSI = new IDPanel(w, this, 1, "PAN_INCASSI");
    Frames[1].Content = PAN_INCASSI;
    PAN_INCASSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INCASSI.VS = MainFrm.VisualStyleList;
    PAN_INCASSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "33D4BC2E-6199-4CEF-816C-87702E6F097D");
    PAN_INCASSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 56, 772, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INCASSI.InitStatus = 2;
    PAN_INCASSI_Init();
    PAN_INCASSI_InitFields();
    PAN_INCASSI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ELIMINA3+BaseCmdLinIdx)
      {
        Elimina();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI44+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG123+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI44+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVIINCASSI+BaseCmdLinIdx)
      {
        ApriNuoviIncassi();
        break fine;
      }
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
      PAN_INCASSI.UpdatePanel(MainFrm);
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
    return (obj instanceof Incassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Incassi.class.getName() : (Glb.ClassWithPackage(Incassi.class) ? Incassi.class.getName().substring(Incassi.class.getPackage().getName().length() + 1) : Incassi.class.getName()));
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
    IDVariant v_ORDINATIVO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ORDINATIVO = (new IDVariant("Ordinativo ", IDVariant.STRING));
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_INCASSI.set_FieldText(PFL_INCASSI_ORDINATIVO, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ORDINATIVO, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMNUMEORD, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMANNOORD, 0))), (new IDVariant(" "))), (new IDVariant("del "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMDATAORD, 0))).stringValue());
      PAN_INCASSI.set_FieldText(PFL_INCASSI_IMPORTO, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMIMPOORD, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_DEBITORE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMINFO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_INCASSI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_INCASSI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_INCASSI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETINCA+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_INCASSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_INCASSI.SetFlags (Glb.OBJ_FIELD, PFL_INCASSI_NUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_NUOVIINCASSI)), true) && Result.booleanValue())
      {
        PAN_INCASSI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef7.TBL_AGGIOSUATTIV, IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOPANE, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Incassi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INCASSI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_INCASSI);
      // 
      // Incassi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_DEBITORE,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_DEBITORE))).stringValue()); 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_QUIETANZA,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_QUIETANZA))).stringValue()); 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_FATNUMERODOC,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_FATNUMERODOC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "IncassiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Incassi On Database Error Event
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
  private void PAN_INCASSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_INCASSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Incassi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "IncassiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Incassi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_INCASSI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incassi On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_INCASSI_INCASSO)), true) && FieldModified.booleanValue())
      {
        PAN_INCASSI.set_FieldText(PFL_INCASSI_TOTALE, IDL.Format(PAN_INCASSI.GetFieldSum(PFL_INCASSI_INCASSO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "IncassiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Incassi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_INCASSI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incassi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_INCASSI.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "IncassiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Incassi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_INCASSI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incassi After Find Event Body
      // Procedure Body
      // 
      PAN_INCASSI.set_FieldText(PFL_INCASSI_TOTALE, IDL.Format(PAN_INCASSI.GetFieldSum(PFL_INCASSI_INCASSO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "IncassiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Nuovi Incassi
  // **********************************************************************
  public int ApriNuoviIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Nuovi Incassi Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_INCASSI.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Modifiche in sospeso. Salvare le modifiche?", IDVariant.STRING));
        if (!(MainFrm.MessageConfirm(v_MSG)))
        {
          return 0;
        }
        PAN_INCASSI.PanelCommand(Glb.PCM_UPDATE);
      }
      PAN_INCASSI.PanelCommand(Glb.PCM_UPDATE);
      if (new IDVariant(PAN_INCASSI.Status()).equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI230, IMDBDef5.FLD_PARAMETRI230_PARAMANNOORD, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMANNOORD, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI230, IMDBDef5.FLD_PARAMETRI230_PARAMNUMEORD, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI229, IMDBDef5.FLD_PARAMETRI229_PARAMNUMEORD, 0));
        MainFrm.Show(MyGlb.FRM_NUOVIINCASSI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "ApriNuoviIncassi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elimina
  // **********************************************************************
  public int Elimina ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG1 = (new IDVariant("Incasso preordini in Ordinativo", IDVariant.STRING));
      v_MSG2 = (new IDVariant("Eliminazione della registrazione?", IDVariant.STRING));
      v_MSG3 = (new IDVariant("Incasso Preordinativo ", IDVariant.STRING));
      // 
      // Elimina Body
      // Procedure Body
      // 
      v_AVVISO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2), (new IDVariant("<BR/>"))), v_MSG3), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_NUMERO_PRE, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_ANNO_PRE, 0)));
      if (!(MainFrm.MessageConfirm(v_AVVISO)))
      {
        return 0;
      }
      else
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from INCASSI ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_INCASSI1, IMDBDef15.PQSL_INCASSI1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          PAN_INCASSI.PanelCommand(Glb.PCM_REQUERY);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Incassi", "Elimina", _e);
      return -1;
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
  private void PAN_INCASSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INCASSI, Cancel);
    // Stub
  }

  private void PAN_INCASSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INCASSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_INCASSI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_INCASSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INCASSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INCASSI_Init()
  {

    PAN_INCASSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INCASSI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INCASSI.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "BFBCCBFB-8432-40D2-9323-EEAF030C5EEE");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "Debitore");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "28CE3E92-67F0-4023-944D-B7993660EEA9");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "Incasso");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "01D44C24-EE84-4290-8668-67CD785566A0");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "Data");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "385E6DE3-0A4A-4A30-9ABE-C4A3E4037845");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "Numero");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "5594EB9B-F2D2-464E-B5A6-B9D9AEC2D3A1");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "FAT NUMERO DOC");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "FBF298A8-E197-4E2F-BFB3-743393FB8700");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "FAT D DATA DOC");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "988C2B69-6B19-4EE3-9481-11FFD97BFAD9");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "Quietanza");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, "155E605D-DFC2-4723-A05A-A84E185C4A38");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.VIS_CAMPTOTADISA);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, "5F214F4B-9E76-4593-B8FE-85229A70FFFF");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, "Documento");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "649955D6-2E80-4FDB-93BE-57AE8A9254B4");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "ANNO PRE");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.VIS_NONNULLAFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, 0, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "76081BFB-30B9-4699-877E-420167347356");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "NUMERO PRE");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.VIS_NONNULLAFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, 0, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, "C02FA87A-3FC0-43F9-A376-CCB5CC2D3F01");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.VIS_ETICGRASLEFT);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, "97445D69-51C6-41EB-BB0A-1491B5B12754");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.VIS_ETICGRASRIGH);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "533C93E5-6490-4572-877D-D5C343058E24");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "151FF28F-49BE-4A4D-B1D1-8B164CCE5B61");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "2352990A-92D2-4E4F-8060-6C08EB5B1F48");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "3E63DA81-C777-499F-BF81-55E2D0D25797");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "A9111D35-C124-45CD-9F86-17992B097BBE");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "PROGRESSIVO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_INCASSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 0, 92, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 124);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 4, 292, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 124);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DEBITORE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DEBITORE, PPQRY_DEBITORE, "B.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 164, 92, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 56);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, "Incasso");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, "Incasso");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_INCASSO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_INCASSO, PPQRY_INCASSI1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 252, 92, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATA, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATA, PPQRY_INCASSI1, "A.D_DATA_INC", "D_DATA_INC", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 332, 92, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_NUMERO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_NUMERO, PPQRY_INCASSI1, "A.NUMERO_INC", "NUMERO_INC", 5, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 412, 92, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, "FAT NUMERO DOC");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 340, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, "FAT NUM. DOC");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_FATNUMERODOC, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_FATNUMERODOC, PPQRY_DOCUMENTO, "B.NUMERO_DOC", "FATNUMERODOC", 5, 20, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 500, 92, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 92);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, "FAT D DATA DOC");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 4, 364, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 92);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, "FAT D DT. DOC");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_FATDDATADOC, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_FATDDATADOC, PPQRY_DOCUMENTO, "B.D_DATA_DOC", "FATDDATADOC", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 584, 92, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 4, 316, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_QUIETANZA, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_QUIETANZA, PPQRY_QUIETANZA, "C.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_LIST, 164, 300, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_LIST, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_FORM, 164, 304, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_FORM, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_TOTALE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_TOTALE, -1, "", "TOTALE", 0, 0, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 412, 56, 172, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 592, 0, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DOCUMENLABEL, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 60);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 60);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_ANNOPRE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_ANNOPRE, PPQRY_INCASSI1, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 76);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, "NUMERO PRE");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 4, 388, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 76);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, "NUM. PRE");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_NUMEROPRE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_NUMEROPRE, PPQRY_INCASSI1, "A.NUMERO_PRE", "NUMERO_PRE", 1, 5, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_LIST, 0, 16, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_LIST, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_FORM, 4, 16, 408, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_FORM, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDINATIVO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_ORDINATIVO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_ORDINATIVO, -1, "", "ORDINATIVO", 0, 0, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_LIST, 584, 16, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_FORM, 12, 24, 408, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_IMPORTO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_IMPORTO, -1, "", "IMPORTO", 0, 0, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 388, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_UTENTEINSERI, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_UTENTEINSERI, PPQRY_INCASSI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 388, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATAINSERIME, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATAINSERIME, PPQRY_INCASSI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_UTENTULTIAGG, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_UTENTULTIAGG, PPQRY_INCASSI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 388, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATAULTIMAGG, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATAULTIMAGG, PPQRY_INCASSI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 388, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_PROGRESSIVO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_PROGRESSIVO, PPQRY_INCASSI1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_INCASSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_INCASSI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  BEN B ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    PAN_INCASSI.SetQuery(PPQRY_DEBITORE, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_DEBITORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_DEBITORE, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  QTN B, ");
    SQL.append("  T02 C ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (B.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (C.CODICE(+) = B.TIPO_QUIETANZA) ");
    PAN_INCASSI.SetQuery(PPQRY_QUIETANZA, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_QUIETANZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_QUIETANZA, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  B.D_DATA_DOC as FATDDATADOC ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  FAT B ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
    PAN_INCASSI.SetQuery(PPQRY_DOCUMENTO, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_DOCUMENTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_DOCUMENTO, "PRE");
    PAN_INCASSI.SetIMDB(IMDB, "PQRY_INCASSI1", true);
    PAN_INCASSI.set_SetString(MyGlb.MASTER_ROWNAME, "INCASSI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  A.DATA_INC as DATA_INC, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_INC as NUMERO_INC, ");
    SQL.append("  A.DATA_CCP as DATA_CCP, ");
    SQL.append("  A.DATA_ESTRATTO_CCP as DATA_ESTRATTO_CCP, ");
    SQL.append("  A.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  A.D_DATA_CCP as D_DATA_CCP, ");
    SQL.append("  A.D_DATA_ESTRATTO_CCP as D_DATA_ESTRATTO_CCP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  INCASSI A ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = ~~TBL_PARAMETRI229.PARAMANNOORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~TBL_PARAMETRI229.PARAMNUMEORD~~) ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCASSI.SetQuery(PPQRY_INCASSI1, 5, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_INCASSI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(0, "INCASSI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INCASSI.Status() == 2)
    {
      int oldListQBE = PAN_INCASSI.iUseListQBE;
      PAN_INCASSI.iUseListQBE = 0;
      PAN_INCASSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_INCASSI.PanelCommand(Glb.PCM_FIND);
      PAN_INCASSI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
