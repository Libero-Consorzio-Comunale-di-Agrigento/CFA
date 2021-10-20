// **********************************************
// Emissione Liquidazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneLiquidazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ANNODISTINTA = 0;
  private static int PFL_PARAMETRI_NUMERODISTIN = 1;
  private static int PFL_PARAMETRI_INTESTALABEL = 2;
  private static int PFL_PARAMETRI_ELABORALABEL = 3;

  private static int PPQRY_PARAMETRI402 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI684(IMDB);
    //
    //
    Init_PQRY_PARAMETRI402(IMDB);
    Init_PQRY_PARAMETRI402_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI684(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI684, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI684, "TBL_PARAMETRI684");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_PARAFATTSPRC, "PARAFATTSPRC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI684,IMDBDef5.FLD_PARAMETRI684_PARAFATTSPRC,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI684, 0);
  }

  private static void Init_PQRY_PARAMETRI402(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI402, 2);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI402, "PQRY_PARAMETRI402");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI402,IMDBDef14.PQSL_PARAMETRI402_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI402,IMDBDef14.PQSL_PARAMETRI402_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI402,IMDBDef14.PQSL_PARAMETRI402_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI402,IMDBDef14.PQSL_PARAMETRI402_NUMERO_DISTINTA,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI402, 0);
  }

  private static void Init_PQRY_PARAMETRI402_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI402_RS, 2);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI402_RS, "PQRY_PARAMETRI402_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI402_RS,IMDBDef14.PQSL_PARAMETRI402_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI402_RS,IMDBDef14.PQSL_PARAMETRI402_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI402_RS,IMDBDef14.PQSL_PARAMETRI402_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI402_RS,IMDBDef14.PQSL_PARAMETRI402_NUMERO_DISTINTA,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneLiquidazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneLiquidazioni()
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
    FormIdx = MyGlb.FRM_EMISSILIQUID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CE18FB9B-C0FB-49FC-925C-C664E580AE1B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 432;
    DesignHeight = 166;
    set_Caption(new IDVariant("Emissione Liquidazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 432;
    Frames[1].Height = 140;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 140;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 432-MyGlb.PAN_OFFS_X, 140-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EAA32068-E483-484C-A5EF-798413E94A3E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI684, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSILIQUID_PARAMETRI402();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneLiquidazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneLiquidazioni.class.getName() : (Glb.ClassWithPackage(EmissioneLiquidazioni.class) ? EmissioneLiquidazioni.class.getName().substring(EmissioneLiquidazioni.class.getPackage().getName().length() + 1) : EmissioneLiquidazioni.class.getName()));
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
    IDVariant v_EMISSIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_EMISSIONE = (new IDVariant("Emissione Liquidazioni per la Distinta ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Controllare l'importo iva delle fatture in SP/RC"));
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_INTESTALABEL, IDL.Add(IDL.Add(IDL.Add(v_EMISSIONE, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0))).stringValue());
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_PARAFATTSPRC, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_INTESTALABEL, IDL.Add(IDL.Add((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_INTESTALABEL))), (new IDVariant("<BR/>"))), v_AVVISO).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioni", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_DATA_DISTINTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_PARAFATTSPRC, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOFINANZIAME = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMLIQUIDATE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ULTIMALIQUID = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_AVVISI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQSENZACGU = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQSENZAFIN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANTFIN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQUNICA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOLIQ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EMESSEN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DALLANUMERO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ALLANUMERO = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      v_LIQSENZACGU = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Gestionale", IDVariant.STRING));
      v_LIQSENZAFIN = (new IDVariant("Sono state emesse liquidazioni senza finanziamento", IDVariant.STRING));
      v_ANTFIN = (new IDVariant("Sono presenti casi di anticipazione sui finanziamenti", IDVariant.STRING));
      v_LIQUNICA = (new IDVariant("Emessa liquidazione numero ", IDVariant.STRING));
      v_NOLIQ = (new IDVariant("Nessuna liquidazione emessa", IDVariant.STRING));
      v_EMESSEN = (new IDVariant("Emesse n° ", IDVariant.STRING));
      v_LIQUIDAZIONI = (new IDVariant(" liquidazioni.", IDVariant.STRING));
      v_DALLANUMERO = (new IDVariant("Dalla numero ", IDVariant.STRING));
      v_ALLANUMERO = (new IDVariant(" alla numero ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_LIQSENZALIV5 = new IDVariant(0,IDVariant.STRING);
      v_LIQSENZALIV5 = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Livello 5"));
      IDVariant v_LIQSENZACOFO = new IDVariant(0,IDVariant.STRING);
      v_LIQSENZACOFO = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Cofog"));
      IDVariant v_LIQSENZAEU = new IDVariant(0,IDVariant.STRING);
      v_LIQSENZAEU = (new IDVariant("Attenzione: sono state emesse liquidazioni senza Codice Europeo"));
      v_AVVISI = (new IDVariant());
      v_MESSAGGIO = (new IDVariant());
      // 
      // Controllo variazioni non esecutive
      // 
      {
        IDVariant v_IMPEGNI = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNI = (new IDVariant("Sugli Impegni: "));
        IDVariant v_SUBIMPEGNI = new IDVariant(0,IDVariant.STRING);
        v_SUBIMPEGNI = (new IDVariant("Sui Subimpegni: "));
        IDVariant v_PROSEGUIRE = new IDVariant(0,IDVariant.STRING);
        v_PROSEGUIRE = (new IDVariant("Sono presenti variazioni non esecutive, si desidera proseguire?"));
        IDVariant v_MESSANONBLOC = null;
        v_MESSANONBLOC = (new IDVariant());
        IDVariant v_ELENCOIMPEGN = null;
        v_ELENCOIMPEGN = (new IDVariant());
        IDVariant v_ELENCSUBIMPE = null;
        v_ELENCSUBIMPE = (new IDVariant());
        IDVariant v_VARSENZADEL = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  A.ANNO_IMP as ANNOIMP, ");
        SQL.append("  A.NUMERO_IMP as NUMEROIMP, ");
        SQL.append("  A.ANNO_SUBIMP as ANNOSUBIMP, ");
        SQL.append("  A.NUMERO_SUBIMP as NUMEROSUBIMP ");
        SQL.append("from ");
        SQL.append("  WRK_LIQ_DISTINTA A ");
        SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C3.EOF()) C3.MoveNext();
        while (!C3.EOF())
        {
          if (IDL.IsNull(C3.Get("ANNOSUBIMP")) || IDL.IsNull(C3.Get("NUMEROSUBIMP")))
          {
            v_VARSENZADEL = MainFrm.VariazioniImpSubSenzaDelibera(C3.Get("ANNOIMP"), C3.Get("NUMEROIMP"), (new IDVariant("I")));
            if (v_VARSENZADEL.compareTo((new IDVariant(0)), true)>0)
            {
              if (IDL.IsNull(v_ELENCOIMPEGN))
              {
                v_ELENCOIMPEGN = IDL.Add(IDL.Add(IDL.ToString(C3.Get("NUMEROIMP")), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNOIMP")));
              }
              else
              {
                v_ELENCOIMPEGN = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ELENCOIMPEGN, (new IDVariant(" - "))), IDL.ToString(C3.Get("NUMEROIMP"))), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNOIMP")));
              }
            }
          }
          else
          {
            v_VARSENZADEL = MainFrm.VariazioniImpSubSenzaDelibera(C3.Get("ANNOSUBIMP"), C3.Get("NUMEROSUBIMP"), (new IDVariant("S")));
            if (v_VARSENZADEL.compareTo((new IDVariant(0)), true)>0)
            {
              if (IDL.IsNull(v_ELENCSUBIMPE))
              {
                v_ELENCSUBIMPE = IDL.Add(IDL.Add(IDL.ToString(C3.Get("NUMEROSUBIMP")), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNOSUBIMP")));
              }
              else
              {
                v_ELENCSUBIMPE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ELENCSUBIMPE, (new IDVariant(" - "))), IDL.ToString(C3.Get("NUMEROSUBIMP"))), (new IDVariant("/"))), IDL.ToString(C3.Get("ANNOSUBIMP")));
              }
            }
          }
          C3.MoveNext();
        }
        C3.Close();
        if (!(IDL.IsNull(v_ELENCOIMPEGN)))
        {
          v_MESSANONBLOC = IDL.Add(IDL.Add(v_IMPEGNI, v_ELENCOIMPEGN), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_ELENCSUBIMPE)))
        {
          v_MESSANONBLOC = IDL.Add(IDL.Add(IDL.Add(v_MESSANONBLOC, v_SUBIMPEGNI), v_ELENCSUBIMPE), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_MESSANONBLOC)))
        {
          if (!(MainFrm.MessageConfirm(IDL.Add(v_MESSANONBLOC, v_PROSEGUIRE))))
          {
            return 0;
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BeginTrans();
      IDVariant v_NOVLIVELLO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NOCODCOFOG = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NOCODEU = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.LIQUIDAWRKLIQDISTINTA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_DATA_DISTINTA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NOFINANZIAME, v_STATOSIOPE, v_ANTICIPAZION, v_NUMLIQUIDATE, v_ULTIMALIQUID, v_NOVLIVELLO, v_NOCODCOFOG, v_NOCODEU);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_BLOCCNONBLOC = null;
        v_BLOCCNONBLOC = (new IDVariant());
        if (IDL.IsNull(MainFrm.CONTRCASSLIQ))
        {
          v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A, ");
          SQL.append("  BIL B ");
          SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'EM') < 0) ");
          SQL.append("and   (NOT ((A.ANNO_MAND IS NULL))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
        else
        {
          v_BLOCCNONBLOC = new IDVariant(MainFrm.CONTRCASSLIQ);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A, ");
          SQL.append("  BIL B ");
          SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'LI') < 0) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0 && !(IDL.IsNull(v_BLOCCNONBLOC)))
        {
          if (v_BLOCCNONBLOC.equals((new IDVariant(1)), true))
          {
            IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
            v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
            MainFrm.Cf4armDBObject.RollbackTrans();
            MainFrm.set_AlertMessage(v_S1); 
            return 0;
          }
          else
          {
            IDVariant v_RISP = null;
            v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
            if (IDL.IsNull(v_RISP))
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
            if (v_RISP.equals((new IDVariant(-1)), true))
            {
              MainFrm.Cf4armDBObject.CommitTrans();
            }
            else
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
            IMDB.set_Value(IMDBDef5.TBL_PARS37, IMDBDef5.FLD_PARS37_NOMOGGNUMDIS, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARS37, IMDBDef5.FLD_PARS37_NOMOGGANNDIS, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0));
            MainFrm.Show(MyGlb.FRM_CACODINEDIOR, (new IDVariant(-1)).intValue(), this); 
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.CommitTrans();
        }
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          if (v_NOFINANZIAME.compareTo((new IDVariant(0)), true)!=0)
          {
            v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZAFIN), (new IDVariant("<BR/>")));
          }
          if (v_ANTICIPAZION.compareTo((new IDVariant(0)), true)!=0)
          {
            v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_ANTFIN), (new IDVariant("<BR/>")));
          }
        }
        if (v_STATOSIOPE.equals((new IDVariant(1)), true))
        {
          // if (MainFrm.SIOPEATTIARM.booleanValue())
          // {
            // v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZALIV5), (new IDVariant("<BR/>")));
          // }
          // else
          // {
          // }
          v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZACGU), (new IDVariant("<BR/>")));
        }
        if (v_NOVLIVELLO.compareTo((new IDVariant(0)), true)>0)
        {
          v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZALIV5), (new IDVariant("<BR/>")));
        }
        if (v_NOCODCOFOG.compareTo((new IDVariant(0)), true)>0)
        {
          v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZACOFO), (new IDVariant("<BR/>")));
        }
        if (v_NOCODEU.compareTo((new IDVariant(0)), true)>0)
        {
          v_AVVISI = IDL.Add(IDL.Add(v_AVVISI, v_LIQSENZAEU), (new IDVariant("<BR/>")));
        }
        if (v_NUMLIQUIDATE.equals((new IDVariant(1)), true))
        {
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_LIQUNICA, IDL.ToString(v_ULTIMALIQUID)), (new IDVariant("<BR/>"))), v_AVVISI);
        }
        else
        {
          if (v_NUMLIQUIDATE.equals((new IDVariant(0)), true))
          {
            v_MESSAGGIO = new IDVariant(v_NOLIQ);
          }
          else
          {
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_EMESSEN, IDL.ToString(v_NUMLIQUIDATE)), v_LIQUIDAZIONI), (new IDVariant("<BR/>"))), v_DALLANUMERO), IDL.ToString(IDL.Add(IDL.Sub(v_ULTIMALIQUID, v_NUMLIQUIDATE), (new IDVariant(1))))), v_ALLANUMERO), IDL.ToString(v_ULTIMALIQUID)), (new IDVariant("<BR/>"))), v_AVVISI);
          }
        }
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSILIQUID_PARAMETRI402() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI402_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI684, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI684, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI402_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI402_RS, 0, IMDBDef5.TBL_PARAMETRI684, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI402_RS, 0, 0, IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI402_RS, 1, 0, IMDBDef5.TBL_PARAMETRI684, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI684, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI684, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI684, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI402_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "E1A10BDB-15CB-4169-A956-4DC094346099");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "ANNO DISTINTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "15BB5D0C-A7D2-417F-B208-4A4E76E154AC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "NUMERO DISTINTA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, "0BD0755A-9036-43C4-BE2F-A2E75B83D8F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.VIS_ETICGRASCENT);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "3640CFB4-51C8-4084-BFAF-4BE61251690B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 72, 60, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, "ANNO DISTINTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODISTINTA, PPQRY_PARAMETRI402, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 72, 84, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, "NUMERO DISTINTA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODISTIN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODISTIN, PPQRY_PARAMETRI402, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_LIST, 12, 4, 324, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_FORM, 12, 4, 412, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTESTALABEL, MyGlb.PANEL_FORM, 3);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INTESTALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 120, 72, 96, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 328, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI402", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI402, IMDBDef14.PQRY_PARAMETRI402_RS, IMDBDef5.TBL_PARAMETRI684);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODISTINTA, IMDBDef5.FLD_PARAMETRI684_ANNO_DISTINTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODISTIN, IMDBDef5.FLD_PARAMETRI684_NUMERO_DISTINTA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI684");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
