// **********************************************
// Parametri Elenco Proposte Sospese Annullate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriElencoProposteSospeseAnnullate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONTRODISPON_SOSPESANNULL = 0;
  private static int PFL_CONTRODISPON_ESERCIZIO = 1;
  private static int PFL_CONTRODISPON_SUDPERTIPVAR = 2;
  private static int PFL_CONTRODISPON_ELABORA = 3;

  private static int PPQRY_PAR53 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_CONTRODISPON;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR71(IMDB);
    Init_TBL_IN4(IMDB);
    //
    //
    Init_PQRY_PAR53(IMDB);
    Init_PQRY_PAR53_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR71(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR71, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR71, "TBL_PAR71");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_ROWNAMSOSANN, "ROWNAMSOSANN");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR71,IMDBDef4.FLD_PAR71_ROWNAMSOSANN,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR71, 0);
  }

  private static void Init_TBL_IN4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN4, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_IN4, "TBL_IN4");
    IMDB.set_FldCode(IMDBDef4.TBL_IN4,IMDBDef4.FLD_IN4_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef4.TBL_IN4,IMDBDef4.FLD_IN4_ROWNAMEBOZZA,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN4,IMDBDef4.FLD_IN4_ROWNAMEFIRST, "ROWNAMEFIRST");
    IMDB.SetFldParams(IMDBDef4.TBL_IN4,IMDBDef4.FLD_IN4_ROWNAMEFIRST,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN4, 0);
  }

  private static void Init_PQRY_PAR53(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR53, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR53, "PQRY_PAR53");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_ROWNAMSOSANN, "ROWNAMSOSANN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53,IMDBDef12.PQSL_PAR53_ROWNAMSOSANN,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR53, 0);
  }

  private static void Init_PQRY_PAR53_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR53_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR53_RS, "PQRY_PAR53_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_ROWNAMSOSANN, "ROWNAMSOSANN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR53_RS,IMDBDef12.PQSL_PAR53_ROWNAMSOSANN,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriElencoProposteSospeseAnnullate(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriElencoProposteSospeseAnnullate()
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
    FormIdx = MyGlb.FRM_PARELEPRSOAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "922CE7E9-B3A1-4653-8B5D-42A5F10B462A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 392;
    DesignHeight = 182;
    set_Caption(new IDVariant("Parametri Elenco Proposte Sospese Annullate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 392;
    Frames[1].Height = 156;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Controllo Disponibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 156;
    PAN_CONTRODISPON = new IDPanel(w, this, 1, "PAN_CONTRODISPON");
    Frames[1].Content = PAN_CONTRODISPON;
    PAN_CONTRODISPON.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTRODISPON.VS = MainFrm.VisualStyleList;
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 392-MyGlb.PAN_OFFS_X, 156-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "198A903D-6335-4AED-A1DE-260D717CBB47");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 224, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTRODISPON.InitStatus = 2;
    PAN_CONTRODISPON_Init();
    PAN_CONTRODISPON_InitFields();
    PAN_CONTRODISPON_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PAR71, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARELEPRSOAN_PAR53();
      }
      PAN_CONTRODISPON.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriElencoProposteSospeseAnnullate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriElencoProposteSospeseAnnullate.class.getName() : (Glb.ClassWithPackage(ParametriElencoProposteSospeseAnnullate.class) ? ParametriElencoProposteSospeseAnnullate.class.getName().substring(ParametriElencoProposteSospeseAnnullate.class.getPackage().getName().length() + 1) : ParametriElencoProposteSospeseAnnullate.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // STAMPA
  // **********************************************************************
  public int STAMPA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // STAMPA Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMSOSANN, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Campo Sospese/Annullate obbligatorio", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMEESERC, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Esercizio obbligatorio", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLWORKBOZZAANN(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef4.TBL_IN4, IMDBDef4.FLD_IN4_ROWNAMEBOZZA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMEESERC, 0), IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMSOSANN, 0), IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_RONASUPETIVA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMTIPVAR, 0, IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_RONASUPETIVA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMANNOSO, 0, IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMSOSANN, 0));
        IMDB.set_Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMEESERC, 0, IMDB.Value(IMDBDef12.PQRY_PAR53, IMDBDef12.PQSL_PAR53_ROWNAMEESERC, 0));
        MainFrm.Show(MyGlb.FRM_ELEPROSOSANN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriElencoProposteSospeseAnnullate", "STAMPA", _e);
      return -1;
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant(" Elenco Proposte Sospese Annullate", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPT));
      IMDB.set_Value(IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_RONASUPETIVA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_IN4, IMDBDef4.FLD_IN4_ROWNAMEFIRST, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_ROWNAMSOSANN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriElencoProposteSospeseAnnullate", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Controllo Disponibilità After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CONTRODISPON_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SEOBIETTIVI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Disponibilità After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef4.TBL_IN4, IMDBDef4.FLD_IN4_ROWNAMEFIRST, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_IN4, IMDBDef4.FLD_IN4_ROWNAMEFIRST, 0, (new IDVariant("NO")));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A_GET_SE_OBIETTIVI_POL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGESEOBPOSEE ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SEOBIETTIVI = QV.Get("AGESEOBPOSEE", IDVariant.INTEGER) ;
        }
        QV.Close();
        // 
        // OBIETTIVI GESTITI
        // 
        if (v_SEOBIETTIVI.compareTo((new IDVariant(0)), true)!=0)
        {
        }
        else
        {
          // 
          // Obiettivi non gestiti
          // 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriElencoProposteSospeseAnnullate", "ControlloDisponibilitàAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PARELEPRSOAN_PAR53() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR53_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAR71, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAR71, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR53_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR53_RS, 0, IMDBDef4.TBL_PAR71, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR53_RS, 0, 0, IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR53_RS, 1, 0, IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_RONASUPETIVA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR53_RS, 2, 0, IMDBDef4.TBL_PAR71, IMDBDef4.FLD_PAR71_ROWNAMSOSANN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PAR71, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAR71, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAR71, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR53_RS, 0);
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
  private void PAN_CONTRODISPON_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTRODISPON, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTRODISPON_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTRODISPON, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTRODISPON_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTRODISPON);
    // Stub
  }

  private void PAN_CONTRODISPON_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONTRODISPON_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONTRODISPON.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      STAMPA();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONTRODISPON_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTRODISPON_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTRODISPON_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTRODISPON_Init()
  {

    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, "D34D098C-CCB5-4805-B11D-CD38CD654009");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, "Sospese Annullate");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.VIS_OPTIONBUTTON);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "F0DBF8AA-7693-4D8D-9177-8FDC248FDCEF");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "Esercizio");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, "1A19B381-BE3A-4566-86DA-C960043E032D");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, "Suddivisione Per Tipo Variazione");
    PAN_CONTRODISPON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, "");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRODISPON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, "C96458E2-E41E-49EE-BA1D-F86CCF324B00");
    PAN_CONTRODISPON.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, "Elabora");
    PAN_CONTRODISPON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONTRODISPON.SetImage(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, 0, "button1.gif", false);
    PAN_CONTRODISPON.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_CONTRODISPON_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_LIST, 96);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_LIST, "Sospese Annullate");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_FORM, 196, 16, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_FORM, 96);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SOSPESANNULL, MyGlb.PANEL_FORM, "Sosp. Annullate");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_SOSPESANNULL, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_SOSPESANNULL, PPQRY_PAR53, "A.ROWNAMSOSANN", "ROWNAMSOSANN", 5, 1, 0, -13997);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOSPESANNULL, (new IDVariant("S")), "Sospese", "", "", -1);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SOSPESANNULL, (new IDVariant("N")), "Annullate", "", "", -1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 120, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 108, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 84);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_ESERCIZIO, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_ESERCIZIO, PPQRY_PAR53, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_LIST, 200, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_LIST, 136);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_LIST, "Sdd. Pr. Tp. Var.");
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_FORM, 0, 64, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_FORM, 192);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_SUDPERTIPVAR, MyGlb.PANEL_FORM, "Suddivisione Per Tipo Variazione");
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_SUDPERTIPVAR, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_SUDPERTIPVAR, PPQRY_PAR53, "A.RONASUPETIVA", "RONASUPETIVA", 5, 2, 0, -13997);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SUDPERTIPVAR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CONTRODISPON.SetValueListItem(PFL_CONTRODISPON_SUDPERTIPVAR, (new IDVariant()), "Null", "", "", -1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 212, 80, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONTRODISPON.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 256, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRODISPON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONTRODISPON.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRODISPON_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONTRODISPON.SetFieldPage(PFL_CONTRODISPON_ELABORA, -1, -1);
    PAN_CONTRODISPON.SetFieldPanel(PFL_CONTRODISPON_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_CONTRODISPON_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTRODISPON.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~ROWNAMEESERC~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_CONTRODISPON.SetQuery(PPQRY_DUAL, 0, SQL, PFL_CONTRODISPON_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_CONTRODISPON.SetQuery(PPQRY_DUAL, 1, SQL, PFL_CONTRODISPON_ESERCIZIO, "");
    PAN_CONTRODISPON.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTRODISPON.SetIMDB(IMDB, "PQRY_PAR53", true);
    PAN_CONTRODISPON.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONTRODISPON.SetQueryIMDB(PPQRY_PAR53, IMDBDef12.PQRY_PAR53_RS, IMDBDef4.TBL_PAR71);
    JustLoaded = true;
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_SOSPESANNULL, IMDBDef4.FLD_PAR71_ROWNAMSOSANN);
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_ESERCIZIO, IMDBDef4.FLD_PAR71_ROWNAMEESERC);
    PAN_CONTRODISPON.SetFieldPrimaryIndex(PFL_CONTRODISPON_SUDPERTIPVAR, IMDBDef4.FLD_PAR71_RONASUPETIVA);
    PAN_CONTRODISPON.SetMasterTable(0, "PAR71");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTRODISPON.Status() == 2)
    {
      int oldListQBE = PAN_CONTRODISPON.iUseListQBE;
      PAN_CONTRODISPON.iUseListQBE = 0;
      PAN_CONTRODISPON.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTRODISPON.PanelCommand(Glb.PCM_FIND);
      PAN_CONTRODISPON.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CONTRODISPON) PAN_CONTRODISPON_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
