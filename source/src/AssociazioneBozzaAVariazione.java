// **********************************************
// Associazione Bozza A Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AssociazioneBozzaAVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ASSOBOZZAVAR_BOZZADESCR = 0;
  private static int PFL_ASSOBOZZAVAR_VARIAZIONE = 1;
  private static int PFL_ASSOBOZZAVAR_ASSOCIA = 2;

  private static int PPQRY_PANNELLO6 = 0;

  private static int PPQRY_POLVARBILPEG = 1;


  IDPanel PAN_ASSOBOZZAVAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS11(IMDB);
    Init_TBL_PANNELLO9(IMDB);
    //
    //
    Init_PQRY_PANNELLO6(IMDB);
    Init_PQRY_PANNELLO6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS11, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS11, "TBL_PARS11");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS11,IMDBDef4.FLD_PARS11_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS11,IMDBDef4.FLD_PARS11_ROWNAMBOVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS11, 0);
  }

  private static void Init_TBL_PANNELLO9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PANNELLO9, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PANNELLO9, "TBL_PANNELLO9");
    IMDB.set_FldCode(IMDBDef4.TBL_PANNELLO9,IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_PANNELLO9,IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PANNELLO9,IMDBDef4.FLD_PANNELLO9_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PANNELLO9,IMDBDef4.FLD_PANNELLO9_ROWNAMTIPVAR,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PANNELLO9, 0);
  }

  private static void Init_PQRY_PANNELLO6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO6, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO6, "PQRY_PANNELLO6");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO6,IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ, "RECORDVARIAZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO6,IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ,1,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO6, 0);
  }

  private static void Init_PQRY_PANNELLO6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO6_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO6_RS, "PQRY_PANNELLO6_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO6_RS,IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ, "RECORDVARIAZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO6_RS,IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AssociazioneBozzaAVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public AssociazioneBozzaAVariazione()
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
    FormIdx = MyGlb.FRM_ASSOBOZZAVAR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D939769C-57E3-42FC-8E72-462629825187";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 448;
    DesignHeight = 222;
    set_Caption(new IDVariant("Associazione Bozza A Variazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 448;
    Frames[1].Height = 196;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Associazione Bozza A Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 196;
    PAN_ASSOBOZZAVAR = new IDPanel(w, this, 1, "PAN_ASSOBOZZAVAR");
    Frames[1].Content = PAN_ASSOBOZZAVAR;
    PAN_ASSOBOZZAVAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ASSOBOZZAVAR.VS = MainFrm.VisualStyleList;
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 448-MyGlb.PAN_OFFS_X, 196-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ASSOBOZZAVAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C475E15-B4F1-44C0-8E77-2C3B1277F03C");
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 284, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ASSOBOZZAVAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ASSOBOZZAVAR.InitStatus = 2;
    PAN_ASSOBOZZAVAR_Init();
    PAN_ASSOBOZZAVAR_InitFields();
    PAN_ASSOBOZZAVAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PANNELLO9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ASSOBOZZAVAR_PANNELLO6();
      }
      PAN_ASSOBOZZAVAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAVARIAZ && flRis && IdxPanelActived == PAN_ASSOBOZZAVAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_ASSOBOZZAVAR_VARIAZIONE) {
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
    return (obj instanceof AssociazioneBozzaAVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AssociazioneBozzaAVariazione.class.getName() : (Glb.ClassWithPackage(AssociazioneBozzaAVariazione.class) ? AssociazioneBozzaAVariazione.class.getName().substring(AssociazioneBozzaAVariazione.class.getPackage().getName().length() + 1) : AssociazioneBozzaAVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scegli Variazione
  // **********************************************************************
  public int ScegliVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Variazione Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVARIAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "ScegliVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Associa
  // **********************************************************************
  public int Associa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Associa Body
      // Procedure Body
      // 
      // if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PANNELLO6, IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ, 0)))
      // {
      // }
      // 
      // ---------------------------------CASO TIPO VARIAZIONE
      // P----------------------
      // 
      if (IMDB.Value(IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMTIPVAR, 0).equals((new IDVariant("P")), true))
      {
        IDVariant v_CONTVARBILSI = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CONTVARBILNO = new IDVariant(0,IDVariant.INTEGER);
        // 
        // -------------record con var_bil null--------------
        // ------
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        SQL.append("and   ((A.VAR_BIL IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTVARBILNO = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        // 
        // ------- tutti i record hanno var bil = SI
        // 
        if (v_CONTVARBILNO.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Sulla bozza sono presenti solo variazioni di Bilancio: l'associazione a variazione di P.e.g. non  è possibile", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        // 
        // Se sono arrivato qui esiste almeno un record con var
        // bil = null controllo ora se esiste un record almeno
        // con var bil SI
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        SQL.append("and   (A.VAR_BIL = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTVARBILSI = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTVARBILSI.compareTo((new IDVariant(0)), true)>0)
        {
          // 
          // richiesta di conferma se OK vado avanti e lancio la
          // procedure
          // 
          if (RichiestaDiConfermaSuP())
          {
            AssociaProcedure();
          }
          else
          {
            // 
            // inutile 
            // 
            return 0;
          }
        }
        else
        {
          AssociaProcedure();
        }
      }
      else
      {
        // 
        // ----------------------CASO TIPO VARIAZIONE B------
        // ---------------
        // 
        IDVariant v_CONTATORESI = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CONTATORENO = new IDVariant(0,IDVariant.INTEGER);
        // 
        // record con var bil = SI
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        SQL.append("and   (A.VAR_BIL = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORESI = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORESI.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Sulla bozza sono presenti solo variazioni di P.e.g.: l'associazione a variazione di Bilancio non  è possibile", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        // 
        // ho almeno un record con variazione di bilancio = si
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        SQL.append("and   ((A.VAR_BIL IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORENO = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORENO.compareTo((new IDVariant(0)), true)>0)
        {
          if (RichiestaDiConfermaSuB())
          {
            AssociaProcedure();
          }
          else
          {
            // 
            // inutile 
            // 
            return 0;
          }
        }
        else
        {
          AssociaProcedure();
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "Associa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Associa Procedure
  // **********************************************************************
  public int AssociaProcedure ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Associa Procedure Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLASSOCIABOZZAVAR(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IMDB.Value(IMDBDef12.PQRY_PANNELLO6, IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "AssociaProcedure", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Richiesta Di Conferma Su P
  // **********************************************************************
  public boolean RichiestaDiConfermaSuP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGCONFER = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGCONFER = (new IDVariant("Sulla bozza sono presenti sia variazioni di Bilancio che di P.e.g.: alla variazione saranno associate solo le variazioni di P.e.g.", IDVariant.STRING));
      // 
      // Richiesta Di Conferma Su P Body
      // Procedure Body
      // 
      if (!(MainFrm.MessageConfirm(v_MESSAGCONFER)))
      {
        v_RET = (new IDVariant(0));
        return v_RET.booleanValue();
      }
      v_RET = (new IDVariant(-1));
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "RichiestaDiConfermaSuP", _e);
      return false;
    }
  }

  // **********************************************************************
  // Richiesta Di Conferma Su B
  // **********************************************************************
  public boolean RichiestaDiConfermaSuB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGCONFER = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGCONFER = (new IDVariant("Sulla bozza sono presenti sia variazioni di Bilancio che di P.e.g.: alla variazione saranno associate solo le variazioni di Bilancio", IDVariant.STRING));
      // 
      // Richiesta Di Conferma Su B Body
      // Procedure Body
      // 
      if (!(MainFrm.MessageConfirm(v_MESSAGCONFER)))
      {
        v_RET = (new IDVariant(0));
        return v_RET.booleanValue();
      }
      v_RET = (new IDVariant(-1));
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "RichiestaDiConfermaSuB", _e);
      return false;
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
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A ");
      SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLBOZVARDES", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_ASSOBOZZAVAR.set_FieldText(PFL_ASSOBOZZAVAR_BOZZADESCR, new IDVariant(v_DESC).stringValue());
      IMDB.set_Value(IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMTIPVAR, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVARIAZ)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PANNELLO6, IMDBDef12.PQSL_PANNELLO6_RECORDVARIAZ, 0, IMDB.Value(IMDBDef7.PQRY_POLVARBILPE2, IMDBDef7.PQSL_POLVARBILPE2_VARIAZIONE_ID, 0));
        IMDB.set_Value(IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID, 0, IMDB.Value(IMDBDef7.PQRY_POLVARBILPE2, IMDBDef7.PQSL_POLVARBILPE2_VARIAZIONE_ID, 0));
        IMDB.set_Value(IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMTIPVAR, 0, IMDB.Value(IMDBDef7.PQRY_POLVARBILPE2, IMDBDef7.PQSL_POLVARBILPE2_BIL_PEG, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "EndModalEvent", _e);
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
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZE.PanelCommand(Glb.PCM_REQUERY);
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Associazione Bozza A Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ASSOBOZZAVAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ASSOBOZZAVAR);
      // 
      // Associazione Bozza A Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ASSOBOZZAVAR.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSOBOZZAVAR_VARIAZIONE,(new IDVariant(PAN_ASSOBOZZAVAR.FieldText(PFL_ASSOBOZZAVAR_VARIAZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneBozzaAVariazione", "AssociazioneBozzaAVariazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void ASSOBOZZAVAR_PANNELLO6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANNELLO6_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PANNELLO9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PANNELLO9, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO6_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANNELLO6_RS, 0, IMDBDef4.TBL_PANNELLO9, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO6_RS, 0, 0, IMDBDef4.TBL_PANNELLO9, IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PANNELLO9, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PANNELLO9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PANNELLO9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANNELLO6_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ASSOBOZZAVAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ASSOBOZZAVAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ASSOBOZZAVAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ASSOBOZZAVAR, Cancel);
    // Stub
  }

  private void PAN_ASSOBOZZAVAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ASSOBOZZAVAR_VARIAZIONE)
    {
      this.IdxPanelActived = this.PAN_ASSOBOZZAVAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliVariazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ASSOBOZZAVAR_ASSOCIA)
    {
      this.IdxPanelActived = this.PAN_ASSOBOZZAVAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Associa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ASSOBOZZAVAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ASSOBOZZAVAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ASSOBOZZAVAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ASSOBOZZAVAR_Init()
  {

    PAN_ASSOBOZZAVAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ASSOBOZZAVAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ASSOBOZZAVAR.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_ASSOBOZZAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, "F6A59BC8-749D-48F8-8AC7-30809427B3D7");
    PAN_ASSOBOZZAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, "");
    PAN_ASSOBOZZAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.VIS_ETICHEGRASSE);
    PAN_ASSOBOZZAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ASSOBOZZAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, "E1EB1235-C01F-4468-98D6-08B35B955101");
    PAN_ASSOBOZZAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, "Variazione");
    PAN_ASSOBOZZAVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, "");
    PAN_ASSOBOZZAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSOBOZZAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSOBOZZAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, "94D0ED21-2417-43C8-87BA-DF5890314417");
    PAN_ASSOBOZZAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, "Associa");
    PAN_ASSOBOZZAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.VIS_STATICBUTTON);
    PAN_ASSOBOZZAVAR.SetImage(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, 0, "button1.gif", false);
    PAN_ASSOBOZZAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ASSOBOZZAVAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_LIST, 8, 12, 412, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_LIST, 0);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_LIST, 2);
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_FORM, 8, 12, 392, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_FORM, 0);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_BOZZADESCR, MyGlb.PANEL_FORM, 2);
    PAN_ASSOBOZZAVAR.SetFieldPage(PFL_ASSOBOZZAVAR_BOZZADESCR, -1, -1);
    PAN_ASSOBOZZAVAR.SetFieldPanel(PFL_ASSOBOZZAVAR_BOZZADESCR, -1, "", "BOZZADESCR", 0, 0, 0, -13997);
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_LIST, 72);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ASSOBOZZAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_LIST, "Variazione");
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_FORM, 16, 60, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ASSOBOZZAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_VARIAZIONE, MyGlb.PANEL_FORM, "Variazione");
    PAN_ASSOBOZZAVAR.SetFieldPage(PFL_ASSOBOZZAVAR_VARIAZIONE, -1, -1);
    PAN_ASSOBOZZAVAR.SetFieldPanel(PFL_ASSOBOZZAVAR_VARIAZIONE, PPQRY_PANNELLO6, "A.ROWNAMEVARID", "RECORDVARIAZ", 1, 8, 0, -13997);
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_LIST, 304, 104, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_LIST, 0);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_LIST, 1);
    PAN_ASSOBOZZAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_FORM, 312, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSOBOZZAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_FORM, 0);
    PAN_ASSOBOZZAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSOBOZZAVAR_ASSOCIA, MyGlb.PANEL_FORM, 1);
    PAN_ASSOBOZZAVAR.SetFieldPage(PFL_ASSOBOZZAVAR_ASSOCIA, -1, -1);
    PAN_ASSOBOZZAVAR.SetFieldPanel(PFL_ASSOBOZZAVAR_ASSOCIA, -1, "", "ASSOCIA", 0, 0, 0, -13997);
  }

  private void PAN_ASSOBOZZAVAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_ASSOBOZZAVAR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VARIAZIONE_ID as POVABIPEVAID, ");
    SQL.append("  A.DESCRIZIONE as POLVARBIPEDE ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.VARIAZIONE_ID = ~~RECORDVARIAZ~~) ");
    PAN_ASSOBOZZAVAR.SetQuery(PPQRY_POLVARBILPEG, 0, SQL, PFL_ASSOBOZZAVAR_VARIAZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VARIAZIONE_ID as POVABIPEVAID, ");
    SQL.append("  A.DESCRIZIONE as POLVARBIPEDE ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    PAN_ASSOBOZZAVAR.SetQuery(PPQRY_POLVARBILPEG, 1, SQL, PFL_ASSOBOZZAVAR_VARIAZIONE, "");
    PAN_ASSOBOZZAVAR.SetQueryDB(PPQRY_POLVARBILPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSOBOZZAVAR.SetIMDB(IMDB, "PQRY_PANNELLO6", true);
    PAN_ASSOBOZZAVAR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_ASSOBOZZAVAR.SetQueryIMDB(PPQRY_PANNELLO6, IMDBDef12.PQRY_PANNELLO6_RS, IMDBDef4.TBL_PANNELLO9);
    JustLoaded = true;
    PAN_ASSOBOZZAVAR.SetFieldPrimaryIndex(PFL_ASSOBOZZAVAR_VARIAZIONE, IMDBDef4.FLD_PANNELLO9_ROWNAMEVARID);
    PAN_ASSOBOZZAVAR.SetMasterTable(0, "PANNELLO9");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ASSOBOZZAVAR.Status() == 2)
    {
      int oldListQBE = PAN_ASSOBOZZAVAR.iUseListQBE;
      PAN_ASSOBOZZAVAR.iUseListQBE = 0;
      PAN_ASSOBOZZAVAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_ASSOBOZZAVAR.PanelCommand(Glb.PCM_FIND);
      PAN_ASSOBOZZAVAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ASSOBOZZAVAR) PAN_ASSOBOZZAVAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSOBOZZAVAR) PAN_ASSOBOZZAVAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ASSOBOZZAVAR) PAN_ASSOBOZZAVAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSOBOZZAVAR) PAN_ASSOBOZZAVAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ASSOBOZZAVAR) PAN_ASSOBOZZAVAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
