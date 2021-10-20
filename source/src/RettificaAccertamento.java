// **********************************************
// Rettifica Accertamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaAccertamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RETTIFACCERT_ORDINATIVI = 0;
  private static int GRP_RETTIFACCERT_VOCEPEG = 1;

  private static int PFL_RETTIFACCERT_ELABORA = 0;
  private static int PFL_RETTIFACCERT_DAL = 1;
  private static int PFL_RETTIFACCERT_AL = 2;
  private static int PFL_RETTIFACCERT_NEWPANELLABE = 3;
  private static int PFL_RETTIFACCERT_NUOVOACCERT = 4;
  private static int PFL_RETTIFACCERT_ANNOACC = 5;
  private static int PFL_RETTIFACCERT_APRI = 6;
  private static int PFL_RETTIFACCERT_SLASHLABEL = 7;
  private static int PFL_RETTIFACCERT_INFO = 8;

  private static int PPQRY_RETTIFACCER1 = 0;


  IDPanel PAN_RETTIFACCERT;

  // Definition of Global Variables
  private IDVariant NDISPONIBACC = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant NTOTALE = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant IMPORTOVAR = new IDVariant(0,IDVariant.DECIMAL);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_RETTIFACCERT(IMDB);
    //
    //
    Init_PQRY_RETTIFACCER1(IMDB);
    Init_PQRY_RETTIFACCER1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_RETTIFACCERT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_RETTIFACCERT, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_RETTIFACCERT, "TBL_RETTIFACCERT");
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef6.TBL_RETTIFACCERT,IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_RETTIFACCERT, 0);
  }

  private static void Init_PQRY_RETTIFACCER1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_RETTIFACCER1, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_RETTIFACCER1, "PQRY_RETTIFACCER1");
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC,1,4,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_RETTIFACCER1, 0);
  }

  private static void Init_PQRY_RETTIFACCER1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_RETTIFACCER1_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_RETTIFACCER1_RS, "PQRY_RETTIFACCER1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_RETTIFACCER1_RS,IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaAccertamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaAccertamento()
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
    FormIdx = MyGlb.FRM_RETTIFACCERT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "47D12B68-0F19-401A-A65C-9FC0C4E4B3D3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 292;
    DesignHeight = 222;
    set_Caption(new IDVariant("Rettifica Accertamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 292;
    Frames[1].Height = 196;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Rettifica Accertamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 196;
    PAN_RETTIFACCERT = new IDPanel(w, this, 1, "PAN_RETTIFACCERT");
    Frames[1].Content = PAN_RETTIFACCERT;
    PAN_RETTIFACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIFACCERT.VS = MainFrm.VisualStyleList;
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 292-MyGlb.PAN_OFFS_X, 196-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4D922A46-74C2-42EA-AA11-16DD1019447A");
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 192, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIFACCERT.InitStatus = 2;
    PAN_RETTIFACCERT_Init();
    PAN_RETTIFACCERT_InitFields();
    PAN_RETTIFACCERT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_RETTIFACCERT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIFACCERT_RETTIFACCER1();
      }
      PAN_RETTIFACCERT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_RETTIFACCERT.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIFACCERT_APRI) {
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
    return (obj instanceof RettificaAccertamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaAccertamento.class.getName() : (Glb.ClassWithPackage(RettificaAccertamento.class) ? RettificaAccertamento.class.getName().substring(RettificaAccertamento.class.getPackage().getName().length() + 1) : RettificaAccertamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri
  // **********************************************************************
  public int Apri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "Apri", _e);
      return -1;
    }
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

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, 0)))
      {
        IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
        v_STR = (new IDVariant("Intervallo ordinativi non indicato", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_STR); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Nuovo Accertamento non indicato", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          if (!(Checkacc()))
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Accertamento non esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERR); 
            return 0;
          }
          v_MESSAGGIO = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
          if ((new IDVariant(CheckNuovoAcc())).equals((new IDVariant(-1)), true))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Attenzione: sono presenti ordinativi senza imputazione economica e il nuovo accertamento non ha rilevanza economica. Le imputazioni economiche dovranno essere inserite manualmente sugli ordinativi", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_MSG), (new IDVariant("<BR/>")));
          }
          // 
          // ULTIMO CONTROLLO non bloccante
          // 
          if ((new IDVariant(CheckDisponibilità())).equals((new IDVariant(-1)), true))
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.INTEGER);
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.RETTIFICAORD(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, 0), IMDB.Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, 0), IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.Today(), v_ERR, IMPORTOVAR);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              if (v_ERR.equals((new IDVariant(1)), true))
              {
                IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
                v_STR = (new IDVariant("Opere annullate sugli Ordinativi in quanto non previste sul nuovo Accertamento", IDVariant.STRING));
                v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_STR);
              }
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi Label
  // **********************************************************************
  public int RiempiLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Label Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0))))
      {
        IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as ESEACCCAPITO, ");
        SQL.append("  A.ARTICOLO as ESEACCARTICO, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ESEACC A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CAPITOLO = QV.Get("ESEACCCAPITO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("ESEACCARTICO", IDVariant.INTEGER) ;
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, 0, new IDVariant(new IDVariant(v_CAPITOLO),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, 0, new IDVariant(v_ARTICOLO));
        }
        else
        {
          IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, 0, (new IDVariant()));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "RiempiLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // info Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Check Nuovo Acc
  // **********************************************************************
  public boolean CheckNuovoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SRILEVANTE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Check Nuovo Acc Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RILEVANTE_ECO as ACCRILEVAECO ");
      SQL.append("from ");
      SQL.append("  ACC A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SRILEVANTE = QV.Get("ACCRILEVAECO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_SRILEVANTE,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        IDVariant v_SRILEVANTORD = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  A.RILEVANTE_ECO as ACCRILEVAECO ");
        SQL.append("from ");
        SQL.append("  ACC A ");
        SQL.append("where ((A.ANNO_ACC) IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  B.ANNO_ACC ");
        SQL.append("from ");
        SQL.append("  ORD B ");
        SQL.append("where (B.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append(")) ");
        SQL.append("and   (A.NUMERO_ACC IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  C.NUMERO_ACC ");
        SQL.append("from ");
        SQL.append("  ORD C ");
        SQL.append("where ((C.NUMERO_ORD BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (C.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append(")) ");
        SQL.append("and   (NOT ((A.RILEVANTE_ECO IS NULL))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SRILEVANTORD = QV.Get("ACCRILEVAECO", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_SRILEVANTORD,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          v_RETVALUE = (new IDVariant(-1));
          return v_RETVALUE.booleanValue();
        }
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "CheckNuovoAcc", _e);
      return false;
    }
  }

  // **********************************************************************
  // Check Disponibilità
  // **********************************************************************
  public boolean CheckDisponibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NDISPONIBACC = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NTOTALE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Check Disponibilità Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_DISPONIBILITA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E',to_number(NULL),to_number(NULL)," + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",to_number(NULL),to_number(NULL),to_number(NULL),UPPER('Esercizio'),to_number(NULL),to_number(NULL),to_number(NULL)) as AGD1SEENNRNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NDISPONIBACC = QV.Get("AGD1SEENNRNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      // 
      // -----------------------------------------
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NULVASUORIM0 ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where ((A.NUMERO_ORD BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NTOTALE = QV.Get("NULVASUORIM0", IDVariant.DECIMAL) ;
      }
      QV.Close();
      NDISPONIBACC = new IDVariant(v_NDISPONIBACC);
      NTOTALE = new IDVariant(v_NTOTALE);
      IMPORTOVAR = (new IDVariant());
      if (v_NTOTALE.compareTo(v_NDISPONIBACC, true)>0)
      {
        if (IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          if ((new IDVariant(Fake())).equals((new IDVariant(-1)), true))
          {
            IMPORTOVAR = IDL.Sub(NTOTALE, IDL.NullValue(NDISPONIBACC,(new IDVariant(0))));
            v_RETVALUE = (new IDVariant(-1));
          }
          else
          {
            v_RETVALUE = (new IDVariant(0));
          }
        }
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "CheckDisponibilità", _e);
      return false;
    }
  }

  // **********************************************************************
  // Fake
  // **********************************************************************
  public boolean Fake ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ST2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STR = (new IDVariant("Importo Ordinativi superiore alla disponibilita dell'accertamento", IDVariant.STRING));
      v_ST2 = (new IDVariant("Inserire la variazione ?", IDVariant.STRING));
      // 
      // Fake Body
      // Procedure Body
      // 
      v_STR = IDL.Add(IDL.Add(v_STR, (new IDVariant("<BR/>"))), v_ST2);
      v_RETVAL = (new IDVariant(-1));
      if (!(MainFrm.MessageConfirm(v_STR)))
      {
        v_RETVAL = (new IDVariant(0));
        return v_RETVAL.booleanValue();
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "Fake", _e);
      return false;
    }
  }

  // **********************************************************************
  // Insert
  // **********************************************************************
  public boolean Insert ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NIMPORTOVARA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PTIPOVAR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Insert Body
      // Procedure Body
      // 
      v_NIMPORTOVARA = IDL.Sub(NTOTALE, IDL.NullValue(NDISPONIBACC,(new IDVariant(0))));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINT56CODICE ");
      SQL.append("from ");
      SQL.append("  T56 A ");
      SQL.append("where (A.VAR_AUTO = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PTIPOVAR = QV.Get("MINT56CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.IsNull(v_PTIPOVAR))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINT56CODICE ");
        SQL.append("from ");
        SQL.append("  T56 A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PTIPOVAR = QV.Get("MINT56CODICE", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      try
      {
        SQL = new StringBuffer();
        SQL.append("insert into VARACC ");
        SQL.append("( ");
        SQL.append("  COD_REC, ");
        SQL.append("  ANNO_VAR, ");
        SQL.append("  CAPITOLO, ");
        SQL.append("  ARTICOLO, ");
        SQL.append("  ANNO_ACC, ");
        SQL.append("  NUMERO_ACC, ");
        SQL.append("  D_DATA_REG, ");
        SQL.append("  IMPORTO, ");
        SQL.append("  DESCRIZIONE, ");
        SQL.append("  TIPO_VAR, ");
        SQL.append("  PROGRESSIVO, ");
        SQL.append("  UTENTE_INSERIMENTO, ");
        SQL.append("  DATA_INSERIMENTO ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  1, ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  TO_DATE(TRUNC( SYSDATE )), ");
        SQL.append("  " + IDL.CSql(v_NIMPORTOVARA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  'Maggiore Entrata', ");
        SQL.append("  " + IDL.CSql(v_PTIPOVAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  to_number(NULL), ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  TRUNC( SYSDATE ) ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e4)
      {
        MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
        return (new IDVariant(0)).booleanValue();
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "Insert", _e);
      return false;
    }
  }

  // **********************************************************************
  // Checkacc
  // **********************************************************************
  public boolean Checkacc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Checkacc Body
      // Procedure Body
      // 
      v_RET = (new IDVariant(-1));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ESEACC A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        v_RET = (new IDVariant(0));
        return v_RET.booleanValue();
      }
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "Checkacc", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_RETTIFACCERT.set_Header(Glb.OBJ_GROUP,GRP_RETTIFACCERT_VOCEPEG,(new IDVariant("")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        RiempiLabel();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "EndModalEvent", _e);
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
      UNLOADEVENT_RETACCDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Accertamento: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_RETACCDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEART, 0, new IDVariant());
  }

  // **********************************************************************
  // Rettifica Accertamento On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETTIFACCERT_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_RETTIFACCERT, Cancel);
      // 
      // Rettifica Accertamento On Validate Row Event Body
      // Procedure Body
      // 
      RiempiLabel();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "RettificaAccertamentoOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Accertamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIFACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIFACCERT);
      // 
      // Rettifica Accertamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_RETTIFACCER1, IMDBDef15.PQSL_RETTIFACCER1_ROWNAMANNACC, 0))))
      {
        PAN_RETTIFACCERT.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETTIFACCERT.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaAccertamento", "RettificaAccertamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Accertamento
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIFACCERT_RETTIFACCER1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_RETTIFACCER1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_RETTIFACCERT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_RETTIFACCERT, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_RETTIFACCER1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_RETTIFACCER1_RS, 0, IMDBDef6.TBL_RETTIFACCERT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_RETTIFACCER1_RS, 0, 0, IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_RETTIFACCER1_RS, 1, 0, IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_RETTIFACCER1_RS, 2, 0, IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_RETTIFACCER1_RS, 3, 0, IMDBDef6.TBL_RETTIFACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_RETTIFACCERT, 0);
      if (IMDB.Eof(IMDBDef6.TBL_RETTIFACCERT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_RETTIFACCERT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_RETTIFACCER1_RS, 0);
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
  private void PAN_RETTIFACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIFACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_RETTIFACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETTIFACCERT_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RETTIFACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFACCERT_APRI)
    {
      this.IdxPanelActived = this.PAN_RETTIFACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Apri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFACCERT_INFO)
    {
      this.IdxPanelActived = this.PAN_RETTIFACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETTIFACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIFACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETTIFACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETTIFACCERT_Init()
  {

    PAN_RETTIFACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIFACCERT.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, "F6504953-18D9-4A74-BC18-D6DD6ECA2C88");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, "Ordinativi");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 8, 3, 236, 53, 0, 0);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, 0, 55);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, 1, 13);
    PAN_RETTIFACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, 0, 4);
    PAN_RETTIFACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, 1, 4);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, "D31B102C-BC92-4A2D-9886-7EBD259A45FA");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, "Voce P.e.g. ");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, MyGlb.PANEL_LIST, 80, -9999, 112, 16, 0, 0);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, MyGlb.PANEL_FORM, 8, 63, 236, 49, 0, 0);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, 0, 63);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, 1, 13);
    PAN_RETTIFACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, 0, 4);
    PAN_RETTIFACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, 1, 4);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIFACCERT_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIFACCERT.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, "B90CF3CC-67C1-44E5-A112-351E3F4CA9DF");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, "Elabora");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIFACCERT.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, 0, "button1.gif", false);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, "823179B9-6A82-4F78-8F2A-B4E1859694B5");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, "Dal");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, "A18FB754-188A-4B56-83D9-879CF420B8DC");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, "Al");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, "E217E835-D532-458A-B717-A74D67494411");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, "6DE84CFA-9DD4-47C6-9DDF-1AE0E4057962");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, "Nuovo Accert.");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, "E1280125-918D-4927-AB21-C055FF7A5ADA");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, "Anno Acc");
    PAN_RETTIFACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, "DAD91059-01C0-40BE-9D5C-474BAB7F501E");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_RETTIFACCERT.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, 0, "wsearch1.gif", false);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, "66DE99B2-17A3-49A1-93A5-1984F97672B5");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, "/");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, "E5FB1813-DF6A-4900-9E51-7A3497A569D6");
    PAN_RETTIFACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, "");
    PAN_RETTIFACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_RETTIFACCERT.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, 0, "info.gif", false);
    PAN_RETTIFACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RETTIFACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_LIST, 100, 116, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_FORM, 168, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_ELABORA, -1, -1);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_LIST, 24);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_FORM, 12, 32, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_FORM, 28);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_DAL, -1, GRP_RETTIFACCERT_ORDINATIVI);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_DAL, PPQRY_RETTIFACCER1, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 6, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_LIST, 20);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_LIST, "Al");
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_FORM, 132, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_FORM, 24);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_AL, MyGlb.PANEL_FORM, "Al");
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_AL, -1, GRP_RETTIFACCERT_ORDINATIVI);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_AL, PPQRY_RETTIFACCER1, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_LIST, 132, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_FORM, 228, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_NEWPANELLABE, -1, GRP_RETTIFACCERT_ORDINATIVI);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_LIST, 68);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_LIST, "N. Ac.");
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_FORM, 12, 88, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_FORM, 84);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_NUOVOACCERT, MyGlb.PANEL_FORM, "Nuovo Accert.");
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_NUOVOACCERT, -1, GRP_RETTIFACCERT_VOCEPEG);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_NUOVOACCERT, PPQRY_RETTIFACCER1, "A.ROWNAMNUMACC", "ROWNAMNUMACC", 1, 5, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_LIST, 120, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_LIST, "Anno Acc");
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_FORM, 160, 88, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_ANNOACC, MyGlb.PANEL_FORM, "Anno Acc");
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_ANNOACC, -1, GRP_RETTIFACCERT_VOCEPEG);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_ANNOACC, PPQRY_RETTIFACCER1, "A.ROWNAMANNACC", "ROWNAMANNACC", 1, 4, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_LIST, 188, 84, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_FORM, 208, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_APRI, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_APRI, -1, GRP_RETTIFACCERT_VOCEPEG);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_LIST, 104, 100, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_FORM, 144, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_SLASHLABEL, -1, GRP_RETTIFACCERT_VOCEPEG);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_LIST, 196, 92, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_FORM, 224, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFACCERT_INFO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFACCERT.SetFieldPage(PFL_RETTIFACCERT_INFO, -1, GRP_RETTIFACCERT_VOCEPEG);
    PAN_RETTIFACCERT.SetFieldPanel(PFL_RETTIFACCERT_INFO, -1, "", "INFO", 0, 0, 0, -13997);
  }

  private void PAN_RETTIFACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIFACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTIFACCERT.SetIMDB(IMDB, "PQRY_RETTIFACCER1", true);
    PAN_RETTIFACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_RETTIFACCERT.SetQueryIMDB(PPQRY_RETTIFACCER1, IMDBDef15.PQRY_RETTIFACCER1_RS, IMDBDef6.TBL_RETTIFACCERT);
    JustLoaded = true;
    PAN_RETTIFACCERT.SetFieldPrimaryIndex(PFL_RETTIFACCERT_DAL, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEDAL);
    PAN_RETTIFACCERT.SetFieldPrimaryIndex(PFL_RETTIFACCERT_AL, IMDBDef6.FLD_RETTIFACCERT_ROWNAMEAL);
    PAN_RETTIFACCERT.SetFieldPrimaryIndex(PFL_RETTIFACCERT_NUOVOACCERT, IMDBDef6.FLD_RETTIFACCERT_ROWNAMNUMACC);
    PAN_RETTIFACCERT.SetFieldPrimaryIndex(PFL_RETTIFACCERT_ANNOACC, IMDBDef6.FLD_RETTIFACCERT_ROWNAMANNACC);
    PAN_RETTIFACCERT.SetMasterTable(0, "RETTIFACCERT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIFACCERT.Status() == 2)
    {
      int oldListQBE = PAN_RETTIFACCERT.iUseListQBE;
      PAN_RETTIFACCERT.iUseListQBE = 0;
      PAN_RETTIFACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIFACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIFACCERT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETTIFACCERT) PAN_RETTIFACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFACCERT) PAN_RETTIFACCERT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTIFACCERT) PAN_RETTIFACCERT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFACCERT) PAN_RETTIFACCERT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RETTIFACCERT) PAN_RETTIFACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
