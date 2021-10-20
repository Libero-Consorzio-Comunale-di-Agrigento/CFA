// **********************************************
// Crea File XML Comunicazione Fatture
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CreaFileXMLComunicazioneFatture extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARSCFXML_ESERCIZIO = 0;
  private static int PFL_PARSCFXML_ES = 1;
  private static int PFL_PARSCFXML_DATARIF = 2;
  private static int PFL_PARSCFXML_CODIFISCDICH = 3;
  private static int PFL_PARSCFXML_CODICARIDICH = 4;
  private static int PFL_PARSCFXML_PERIODO = 5;
  private static int PFL_PARSCFXML_ETICHEELABOR = 6;
  private static int PFL_PARSCFXML_DESCRIPERIOD = 7;
  private static int PFL_PARSCFXML_DESCRIZIONE = 8;

  private static int PPQRY_PARSCFXML2 = 0;


  IDPanel PAN_PARSCFXML;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARSCFXML3(IMDB);
    //
    //
    Init_PQRY_PARSCFXML2(IMDB);
    Init_PQRY_PARSCFXML2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARSCFXML3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARSCFXML3, 9);
    IMDB.set_TblCode(IMDBDef2.TBL_PARSCFXML3, "TBL_PARSCFXML3");
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, "NOMOGGDATRIF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI, "NOMOGGCOFIDI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI,5,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI, "NOMOGGCOCADI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, "NOMOGGXMLOAN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER, "NOMOGGDESPER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER,5,100,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSCFXML3,IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE,9,2000,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARSCFXML3, 0);
  }

  private static void Init_PQRY_PARSCFXML2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARSCFXML2, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARSCFXML2, "PQRY_PARSCFXML2");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDATRIF, "NOMOGGDATRIF");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDATRIF,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI, "NOMOGGCOFIDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI, "NOMOGGCOCADI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDESPER, "NOMOGGDESPER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDESPER,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2,IMDBDef10.PQSL_PARSCFXML2_DESCRIZIONE,9,2000,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARSCFXML2, 0);
  }

  private static void Init_PQRY_PARSCFXML2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARSCFXML2_RS, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARSCFXML2_RS, "PQRY_PARSCFXML2_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDATRIF, "NOMOGGDATRIF");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDATRIF,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI, "NOMOGGCOFIDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI, "NOMOGGCOCADI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDESPER, "NOMOGGDESPER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_NOMOGGDESPER,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSCFXML2_RS,IMDBDef10.PQSL_PARSCFXML2_DESCRIZIONE,9,2000,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CreaFileXMLComunicazioneFatture(MyWebEntryPoint w, IMDBObj imdb)
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
  public CreaFileXMLComunicazioneFatture()
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
    FormIdx = MyGlb.FRM_CREFILXMCOFA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7AF48233-C301-4F92-9227-BFCA4591AFA0";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 940;
    DesignHeight = 274;
    set_Caption(new IDVariant("Crea File XML"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 940;
    Frames[1].Height = 248;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars CFXML";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 248;
    PAN_PARSCFXML = new IDPanel(w, this, 1, "PAN_PARSCFXML");
    Frames[1].Content = PAN_PARSCFXML;
    PAN_PARSCFXML.Lockable = false;
    PAN_PARSCFXML.iLocked = false;
    PAN_PARSCFXML.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARSCFXML.VS = MainFrm.VisualStyleList;
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 248-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "43793BB4-BB27-4253-861D-5A5994713A63");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 788, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARSCFXML.InitStatus = 1;
    PAN_PARSCFXML_Init();
    PAN_PARSCFXML_InitFields();
    PAN_PARSCFXML_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARSCFXML3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CREFILXMCOFA_PARSCFXML2();
      }
      PAN_PARSCFXML.UpdatePanel(MainFrm);
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
    return (obj instanceof CreaFileXMLComunicazioneFatture);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CreaFileXMLComunicazioneFatture.class.getName() : (Glb.ClassWithPackage(CreaFileXMLComunicazioneFatture.class) ? CreaFileXMLComunicazioneFatture.class.getName().substring(CreaFileXMLComunicazioneFatture.class.getPackage().getName().length() + 1) : CreaFileXMLComunicazioneFatture.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Indicare il Codice Fiscale dichiarante"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Indicare il Codice carica dichiarante"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, 0).equals((new IDVariant("X")), true))
      {
        MainFrm.Cf4armDBObject.COMUNICAZIONEFATTURECREAFILEXML(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, 0), IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0), IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI, 0), IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE, 0));
      }
      else
      {
        MainFrm.Cf4armDBObject.COMUNICAZIONEFATTURECREA_FILE_ANNULLI(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, 0), IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0), IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOFIDI, 0), IMDB.Value(IMDBDef10.PQRY_PARSCFXML2, IMDBDef10.PQSL_PARSCFXML2_NOMOGGCOCADI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CreaFileXMLComunicazioneFatture", "EtichettaElabora", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI, 0, IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COD_FISCALE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI, 0, (new IDVariant(14)));
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, 0).equals((new IDVariant("X")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Crea File XML"));
        v_CAPTION = new IDVariant(S);
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Crea File Annulli"));
        v_CAPTION = new IDVariant(S);
      }
      set_Caption(new IDVariant(v_CAPTION));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0))))
      {
        if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0).equals((new IDVariant(2017)), true))
        {
          if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate((new IDVariant(2017)), (new IDVariant(6)), (new IDVariant(30))));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate((new IDVariant(2017)), (new IDVariant(12)), (new IDVariant(31))));
          }
        }
        else if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0).equals((new IDVariant(2018)), true))
        {
          if (MainFrm.PERINVCOMFAT.equals((new IDVariant("SEMESTRALE")), true))
          {
            if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(6)), (new IDVariant(30))));
            }
            else
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(12)), (new IDVariant(31))));
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(3)), (new IDVariant(31))));
            }
            else if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(2)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(6)), (new IDVariant(30))));
            }
            else if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(3)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(9)), (new IDVariant(30))));
            }
            else
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(12)), (new IDVariant(31))));
            }
          }
        }
        else
        {
          // 
          //  Esterometro
          // 
          // 
          if (MainFrm.PERINVCOFAES.equals((new IDVariant("SEMESTRALE")), true))
          {
            if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(6)), (new IDVariant(30))));
            }
            else
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(12)), (new IDVariant(31))));
            }
          }
          else if (MainFrm.PERINVCOFAES.equals((new IDVariant("TRIMESTRALE")), true))
          {
            if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(3)), (new IDVariant(31))));
            }
            else if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(2)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(6)), (new IDVariant(30))));
            }
            else if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0).equals((new IDVariant(3)), true))
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(9)), (new IDVariant(30))));
            }
            else
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), (new IDVariant(12)), (new IDVariant(31))));
            }
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  LAST_DAY(TO_DATE((1)||'/'||(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")||'/'||(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "),'dd/mm/yyyy')) as LADTDNOENOP1 ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, QV.Get("LADTDNOENOP1", IDVariant.DATETIME));
            }
            QV.Close();
          }
        }
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COMUNICAZIONE_FATTURE.GET_DESCR_PERIODO_D_DATA(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CFGDPDDNODRN ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER, 0, QV.Get("CFGDPDDNODRN", IDVariant.STRING));
      }
      QV.Close();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CreaFileXMLComunicazioneFatture", "Load", _e);
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
      if ((MainFrm.GetForm(MyGlb.FRM_ELENFATDAINV, 0, false)!=null))
      {
        ((ElencoFattureDaInviare)MainFrm.GetForm(MyGlb.FRM_ELENFATDAINV,0)).PAN_FATTURE.PanelCommand(Glb.PCM_REQUERY);
      }
      if ((MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI, 0, false)!=null))
      {
        ((ElencoFileInviati)MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI,0)).PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, 0).equals((new IDVariant("A")), true))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_DETTFATTINVI, 0, false)!=null))
        {
          ((DettaglioFattureInviate)MainFrm.GetForm(MyGlb.FRM_DETTFATTINVI,0)).PAN_DOCUMENTI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      UNLOAD_PARSCFXMDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CreaFileXMLComunicazioneFatture", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars CFXML: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSCFXMDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE, 0, new IDVariant());
  }

  // **********************************************************************
  // Pars CFXML
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CREFILXMCOFA_PARSCFXML2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARSCFXML2_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARSCFXML3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARSCFXML3, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARSCFXML2_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARSCFXML2_RS, 0, IMDBDef2.TBL_PARSCFXML3, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 0, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 1, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 2, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 3, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 4, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 5, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 6, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSCFXML2_RS, 7, 0, IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARSCFXML3, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARSCFXML3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARSCFXML3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARSCFXML2_RS, 0);
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
  private void PAN_PARSCFXML_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARSCFXML, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARSCFXML_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARSCFXML, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARSCFXML_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARSCFXML);
    // Stub
  }

  private void PAN_PARSCFXML_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARSCFXML_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARSCFXML.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARSCFXML_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARSCFXML_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARSCFXML_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARSCFXML_Init()
  {

    PAN_PARSCFXML.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARSCFXML.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARSCFXML.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, "C2A54260-988F-4B47-BD05-E534AB334EAF");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, "Esercizio");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, "15BCB389-B49B-4AF5-A471-3BB7A9E8D50D");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, "ES");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, "3B926889-D209-4437-8D3A-468D7FE4D243");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, "Data Rif.");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.VIS_NORMALFIELDS);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, "FA38F972-866D-47C8-A42F-8F890771486D");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, "Codice Fiscale dichiarante");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.VIS_NORMALFIELDS);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, "F2B3EB21-D5C8-40CB-9E0B-2B75B8640F3C");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, "Codice carica dichiarante");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, "Codice Carica Dichiarante");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.VIS_NORMFIELBUTT);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, "A7FC9256-901C-443A-93BA-5CBD469DBCD5");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, "Periodo");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, "83D70AD4-7D3F-4A74-9442-F82BF5BDD766");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, "Elabora");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARSCFXML.SetImage(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, "78BD9815-1B2B-4AC5-AA2E-42A484E33697");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, "Periodo");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSCFXML.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, "28577503-3D33-4E8D-997C-806B0CACD001");
    PAN_PARSCFXML.set_Header(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, "Descrizione");
    PAN_PARSCFXML.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, "");
    PAN_PARSCFXML.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARSCFXML.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARSCFXML_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_FORM, 100, 16, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_ESERCIZIO, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_ESERCIZIO, PPQRY_PARSCFXML2, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_LIST, "ES");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_FORM, 200, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_FORM, 128);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ES, MyGlb.PANEL_FORM, "ES");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_ES, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_ES, PPQRY_PARSCFXML2, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_LIST, 56);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_LIST, "Data Rif.");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_FORM, 376, 16, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_FORM, 60);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DATARIF, MyGlb.PANEL_FORM, "Data Rif.");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_DATARIF, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_DATARIF, PPQRY_PARSCFXML2, "A.NOMOGGDATRIF", "NOMOGGDATRIF", 6, 16, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_LIST, 156);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_LIST, "Codice Fiscale dichiarante");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_FORM, 636, 16, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_FORM, 156);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODIFISCDICH, MyGlb.PANEL_FORM, "Codice Fiscale dichiarante");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_CODIFISCDICH, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_CODIFISCDICH, PPQRY_PARSCFXML2, "A.NOMOGGCOFIDI", "NOMOGGCOFIDI", 5, 16, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_LIST, 4, 164, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_LIST, 128);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_LIST, "Cod. car. dichiarante");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_FORM, 8, 40, 904, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_FORM, 152);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_CODICARIDICH, MyGlb.PANEL_FORM, "Codice carica dichiarante");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_CODICARIDICH, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_CODICARIDICH, PPQRY_PARSCFXML2, "A.NOMOGGCOCADI", "NOMOGGCOCADI", 1, 3, 0, -13997);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(1)), "1 - Rappresentante legale, negoziale o di fatto, socio amministratore", "1 - Rappresentante legale, negoziale o di fatto, socio amministratore", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(2)), "2 - Rappresentante di minore, inabilitato o interdetto, ovvero curatore eredità giacente, amministratore dell'eredità", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(3)), "3 - Curatore fallimentare", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(4)), "4 - Commissario liquidatore", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(5)), "5 - Commissario giudiziale", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(6)), "6 - Rappresentante fiscale di soggetto non residente", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(7)), "7 - Erede", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(8)), "8 - Liquidatore - liquidazione volontaria", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(9)), "9 - Soggetto tenuto a presentare dichiarazione in caso di operazioni straordinarie", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(11)), "11 - Soggetto esercente l'attività tutoria del minore o interdetto in relazione alla funzione istituzionale rivestita", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(12)), "12 - Liquidatore - liquidazione volontaria di ditta individuale periodo ante messa in liquidazione", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(13)), "13 - Amministratore di condominio", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(14)), "14 - Soggetto che sottoscrive la dichiarazione per conto di una pubblica amministrazione", "", "", -1);
    PAN_PARSCFXML.SetValueListItem(PFL_PARSCFXML_CODICARIDICH, (new IDVariant(15)), "15 - Commissario liquidatore di una pubblica amministrazione", "", "", -1);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_FORM, 380, 16, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_FORM, 56);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_PERIODO, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_PERIODO, PPQRY_PARSCFXML2, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 1, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_LIST, 608, 92, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_FORM, 436, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_ETICHEELABOR, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_LIST, 120);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_LIST, "Periodo");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_FORM, 380, 16, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_FORM, 56);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_FORM, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIPERIOD, MyGlb.PANEL_FORM, "Periodo");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_DESCRIPERIOD, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_DESCRIPERIOD, PPQRY_PARSCFXML2, "A.NOMOGGDESPER", "NOMOGGDESPER", 5, 100, 0, -13997);
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARSCFXML.SetRect(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_FORM, 84, 76, 828, 100, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSCFXML.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARSCFXML.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_FORM, 7);
    PAN_PARSCFXML.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSCFXML_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARSCFXML.SetFieldPage(PFL_PARSCFXML_DESCRIZIONE, -1, -1);
    PAN_PARSCFXML.SetFieldPanel(PFL_PARSCFXML_DESCRIZIONE, PPQRY_PARSCFXML2, "A.DESCRIZIONE", "DESCRIZIONE", 9, 2000, 0, -13997);
  }

  private void PAN_PARSCFXML_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARSCFXML.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARSCFXML.SetIMDB(IMDB, "PQRY_PARSCFXML2", true);
    PAN_PARSCFXML.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARSCFXML.SetQueryIMDB(PPQRY_PARSCFXML2, IMDBDef10.PQRY_PARSCFXML2_RS, IMDBDef2.TBL_PARSCFXML3);
    JustLoaded = true;
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_ESERCIZIO, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_ES, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_DATARIF, IMDBDef2.FLD_PARSCFXML3_NOMOGGDATRIF);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_CODIFISCDICH, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOFIDI);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_CODICARIDICH, IMDBDef2.FLD_PARSCFXML3_NOMOGGCOCADI);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_PERIODO, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_DESCRIPERIOD, IMDBDef2.FLD_PARSCFXML3_NOMOGGDESPER);
    PAN_PARSCFXML.SetFieldPrimaryIndex(PFL_PARSCFXML_DESCRIZIONE, IMDBDef2.FLD_PARSCFXML3_DESCRIZIONE);
    PAN_PARSCFXML.SetMasterTable(0, "PARSCFXML3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARSCFXML.Status() == 2)
    {
      int oldListQBE = PAN_PARSCFXML.iUseListQBE;
      PAN_PARSCFXML.iUseListQBE = 0;
      PAN_PARSCFXML.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARSCFXML.PanelCommand(Glb.PCM_FIND);
      PAN_PARSCFXML.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARSCFXML) PAN_PARSCFXML_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARSCFXML) PAN_PARSCFXML_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARSCFXML) PAN_PARSCFXML_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARSCFXML) PAN_PARSCFXML_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARSCFXML) PAN_PARSCFXML_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
