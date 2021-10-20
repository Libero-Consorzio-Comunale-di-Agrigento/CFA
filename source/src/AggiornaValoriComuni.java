// **********************************************
// Aggiorna Valori Comuni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornaValoriComuni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPOVAR_TIPOVARIAZIO = 0;
  private static int PFL_TIPOVAR_TIPOVARESIGI = 1;
  private static int PFL_TIPOVAR_TIPOAVANZO = 2;
  private static int PFL_TIPOVAR_ETICVERRAGGI = 3;
  private static int PFL_TIPOVAR_ETICHEELABOR = 4;
  private static int PFL_TIPOVAR_GESTIOAVANZO = 5;

  private static int PPQRY_TIPOVAR1 = 0;

  private static int PPQRY_T55 = 1;

  private static int PPQRY_T56 = 2;
  private static int PPQRY_T57 = 3;
  private static int PPQRY_TIPIAVANZO = 4;


  IDPanel PAN_TIPOVAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_TIPOVAR(IMDB);
    //
    //
    Init_PQRY_TIPOVAR1(IMDB);
    Init_PQRY_TIPOVAR1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_TIPOVAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_TIPOVAR, 6);
    IMDB.set_TblCode(IMDBDef5.TBL_TIPOVAR, "TBL_TIPOVAR");
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIPVAR,1,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIVAES, "NOMOGGTIVAES");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIVAES,1,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI, "NOMOGGVAESDI");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGMOSLAB, "NOMOGGMOSLAB");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGMOSLAB,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef5.TBL_TIPOVAR,IMDBDef5.FLD_TIPOVAR_NOMOGGTIPAVA,1,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_TIPOVAR, 0);
  }

  private static void Init_PQRY_TIPOVAR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_TIPOVAR1, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_TIPOVAR1, "PQRY_TIPOVAR1");
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES, "NOMOGGTIVAES");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA,1,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_TIPOVAR1, 0);
  }

  private static void Init_PQRY_TIPOVAR1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_TIPOVAR1_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_TIPOVAR1_RS, "PQRY_TIPOVAR1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES, "NOMOGGTIVAES");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, "NOMOGGTIPAVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_TIPOVAR1_RS,IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA,1,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornaValoriComuni(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornaValoriComuni()
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
    FormIdx = MyGlb.FRM_AGGIVALOCOM1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "592A3ED8-854F-4460-9BA2-99DA7F8692C9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 640;
    DesignHeight = 198;
    set_Caption(new IDVariant("Aggiorna Valori Comuni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 640;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Tipo Var";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_TIPOVAR = new IDPanel(w, this, 1, "PAN_TIPOVAR");
    Frames[1].Content = PAN_TIPOVAR;
    PAN_TIPOVAR.Lockable = false;
    PAN_TIPOVAR.iLocked = false;
    PAN_TIPOVAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPOVAR.VS = MainFrm.VisualStyleList;
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E23A7A48-31DC-46E9-AD5D-97BD9C1B0E0B");
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 240, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPOVAR.InitStatus = 1;
    PAN_TIPOVAR_Init();
    PAN_TIPOVAR_InitFields();
    PAN_TIPOVAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_TIPOVAR, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIVALOCOM1_TIPOVAR1();
      }
      PAN_TIPOVAR.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornaValoriComuni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornaValoriComuni.class.getName() : (Glb.ClassWithPackage(AggiornaValoriComuni.class) ? AggiornaValoriComuni.class.getName().substring(AggiornaValoriComuni.class.getPackage().getName().length() + 1) : AggiornaValoriComuni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipo Var On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPOVAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPOVAR);
      // 
      // Tipo Var On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue((new IDVariant(PAN_TIPOVAR.FieldText(PFL_TIPOVAR_GESTIOAVANZO))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, 0)))
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuni", "TipoVarOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipo Var On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPOVAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipo Var On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_TIPOVAR_TIPOVARIAZIO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_VT55GESTAVAN = null;
        v_VT55GESTAVAN = (new IDVariant());
        if (IMDB.Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO ");
          SQL.append("from ");
          SQL.append("  T55 A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
          }
          QV.Close();
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO ");
          SQL.append("from ");
          SQL.append("  T56 A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
          }
          QV.Close();
        }
        if (v_VT55GESTAVAN.equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuni", "TipoVarOnUpdatingRow", _e);
    }
  }

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
      IDArray v_IDA = null;
      v_IDA = MainFrm.VALORICOMUNI;
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, 0))))
      {
        IDVariant I = new IDVariant(0,IDVariant.INTEGER);
        for (; I.compareTo(new IDVariant(v_IDA.Size()), true)<0; I = IDL.Add(I, (new IDVariant(1))))
        {
          try
          {
            IDVariant v_PROGRESSIVO = null;
            v_PROGRESSIVO = v_IDA.get_Value(I);
            IDVariant v_VANNOESIG = null;
            v_VANNOESIG = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.ANNO_ESIGIBILITA as PRORIAANNESI ");
            SQL.append("from ");
            SQL.append("  PROPOSTE_RIACC A ");
            SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VANNOESIG = QV.Get("PRORIAANNESI", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (IDL.IsNull(v_VANNOESIG))
            {
              IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
              // 
              // Aggiorno il Tipo Variazione
              // 
              SQL = new StringBuffer();
              SQL.append("update PROPOSTE_RIACC set ");
              SQL.append("  TIPO_VAR = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPVAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", PROPOSTE_RIACC.TIPO_VAR) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              // 
              // Aggiorno il Tipo Avanzo
              // 
              if (IMDB.Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
              {
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  T55 A, ");
                SQL.append("  PROPOSTE_RIACC B ");
                SQL.append("where (A.CODICE = B.TIPO_VAR) ");
                SQL.append("and   (B.PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NVL(B.IMPORTO_RAG, B.IMPORTO_UFF) < 0) ");
                SQL.append("and   ((B.NUMERO_SUBIMP IS NULL)) ");
                SQL.append("and   (NVL(A.GESTIONE_AVANZO, 'NO') = 'SI') ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
                {
                  SQL = new StringBuffer();
                  SQL.append("update PROPOSTE_RIACC set ");
                  SQL.append("  TIPO_AVANZO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", PROPOSTE_RIACC.TIPO_AVANZO) ");
                  SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              else
              {
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  T56 A, ");
                SQL.append("  PROPOSTE_RIACC B ");
                SQL.append("where (A.CODICE = B.TIPO_VAR) ");
                SQL.append("and   (B.PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NVL(B.IMPORTO_RAG, B.IMPORTO_UFF) > 0) ");
                SQL.append("and   (NVL(A.GESTIONE_AVANZO, 'NO') = 'SI') ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
                {
                  SQL = new StringBuffer();
                  SQL.append("update PROPOSTE_RIACC set ");
                  SQL.append("  TIPO_AVANZO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIPAVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", PROPOSTE_RIACC.TIPO_AVANZO) ");
                  SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
            }
            else
            {
              // 
              // /ANNO ESIG NON NULLO
              // 
              SQL = new StringBuffer();
              SQL.append("update PROPOSTE_RIACC set ");
              SQL.append("  TIPO_VAR = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_TIPOVAR1, IMDBDef14.PQSL_TIPOVAR1_NOMOGGTIVAES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", PROPOSTE_RIACC.TIPO_VAR) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          catch (Exception e11)
          {
            MainFrm.set_AlertMessage(new IDVariant(e11.getMessage())); 
          }
        }
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        MainFrm.VALORICOMUNI.Clear();
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare un valore"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuni", "EtichettaElabora", _e);
      return -1;
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
      UNLOAD_TIPOVARDELET();
      if (Confirm.booleanValue())
      {
        ((ProposteVariazioniImpegniSubimpegni)MainFrm.GetForm(MyGlb.FRM_PROVARIMPSUB,0)).PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Tipo Var: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_TIPOVARDELET() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIVAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGMOSLAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPAVA, 0, new IDVariant());
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
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGMOSLAB, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPOVAR.SetFlags (Glb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuni", "Load", _e);
    }
  }

  // **********************************************************************
  // Tipo Var
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGIVALOCOM1_TIPOVAR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_TIPOVAR1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_TIPOVAR, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_TIPOVAR, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_TIPOVAR1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_TIPOVAR1_RS, 0, IMDBDef5.TBL_TIPOVAR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_TIPOVAR1_RS, 0, 0, IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_TIPOVAR1_RS, 1, 0, IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIVAES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_TIPOVAR1_RS, 2, 0, IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPAVA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_TIPOVAR, 0);
      if (IMDB.Eof(IMDBDef5.TBL_TIPOVAR, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_TIPOVAR, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_TIPOVAR1_RS, 0);
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
  private void PAN_TIPOVAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPOVAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPOVAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPOVAR, Cancel);
    // Stub
  }

  private void PAN_TIPOVAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_TIPOVAR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_TIPOVAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_TIPOVAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPOVAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPOVAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPOVAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPOVAR_Init()
  {

    PAN_TIPOVAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPOVAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPOVAR.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, "E060F09E-5F83-48C1-885C-0B48A7C758A4");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, "Tipo Var. Economia");
    PAN_TIPOVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, "");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, "219E22CA-7A47-49CF-9021-E29CEC88E4D8");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, "Tipo Var. Esigibilità");
    PAN_TIPOVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, "");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, "BC8BC6C4-A824-41B1-BAD4-254AFE16058A");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, "Tipo Avanzo");
    PAN_TIPOVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, "");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, "71DB73AA-F63A-4FD8-86B2-E78B0FB57C2D");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, "I Tipi Variazione verranno aggiornati sulle proposte in cui il tipo variazione non è indicato\nIl Tipo Avanzo verrà aggiornato sulle proposte in cui è ammesso");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.VIS_ETICHEGRASSE);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, "4E3CCE83-B30B-4E42-9E70-57599FD447D3");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, "Elabora");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_TIPOVAR.SetImage(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPOVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, "7968D7E4-EDEE-446C-9F14-FD3DB5D4F9D7");
    PAN_TIPOVAR.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, "GESTIONE AVANZO");
    PAN_TIPOVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, "");
    PAN_TIPOVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_TIPOVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPOVAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 96);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var Econ.");
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 12, 12, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 116);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Var. Economia");
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_TIPOVARIAZIO, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_TIPOVARIAZIO, PPQRY_TIPOVAR1, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 1, 10, 0, -13997);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_LIST, 112);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_LIST, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_LIST, "Tipo Var. Esigibilità");
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_FORM, 12, 36, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_FORM, 116);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_FORM, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOVARESIGI, MyGlb.PANEL_FORM, "Tipo Var. Esigibilità");
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_TIPOVARESIGI, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_TIPOVARESIGI, PPQRY_TIPOVAR1, "A.NOMOGGTIVAES", "NOMOGGTIVAES", 1, 10, 0, -13997);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_LIST, 80);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_FORM, 48, 60, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_FORM, 80);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_TIPOAVANZO, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_TIPOAVANZO, PPQRY_TIPOVAR1, "A.NOMOGGTIPAVA", "NOMOGGTIPAVA", 1, 10, 0, -13997);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_LIST, 32, 76, 284, 76, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_LIST, 0);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_LIST, 5);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_FORM, 12, 100, 512, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_FORM, 0);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICVERRAGGI, MyGlb.PANEL_FORM, 2);
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_ETICVERRAGGI, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_ETICVERRAGGI, -1, "", "ETICVERRAGGI", 0, 0, 0, -13997);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_LIST, 244, 44, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_FORM, 532, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_ETICHEELABOR, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_LIST, 136);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_LIST, "GESTIONE AVANZO");
    PAN_TIPOVAR.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_FORM, 4, 140, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_FORM, 136);
    PAN_TIPOVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_TIPOVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOVAR_GESTIOAVANZO, MyGlb.PANEL_FORM, "GESTIONE AVANZO");
    PAN_TIPOVAR.SetFieldPage(PFL_TIPOVAR_GESTIOAVANZO, -1, -1);
    PAN_TIPOVAR.SetFieldPanel(PFL_TIPOVAR_GESTIOAVANZO, PPQRY_T55, "A.GESTIONE_AVANZO", "T55GESTIAVAN", 5, 2, 0, -13997);
    PAN_TIPOVAR.SetValueListItem(PFL_TIPOVAR_GESTIOAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPOVAR.SetValueListItem(PFL_TIPOVAR_GESTIOAVANZO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_TIPOVAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPOVAR.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.GESTIONE_AVANZO as T55GESTIAVAN ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.GESTIONE_AVANZO ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'E') ");
    PAN_TIPOVAR.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_TIPOVAR.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPOVAR.SetMasterTable(PPQRY_T55, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NOT (NVL(A.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC'))) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NOT (NVL(B.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC'))) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_TIPOVAR.SetQuery(PPQRY_T56, 0, SQL, PFL_TIPOVAR_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NOT (NVL(A.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC'))) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NOT (NVL(B.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC'))) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_TIPOVAR.SetQuery(PPQRY_T56, 1, SQL, PFL_TIPOVAR_TIPOVARIAZIO, "");
    PAN_TIPOVAR.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIVAES~~) ");
    SQL.append("and   (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NVL(A.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC')) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~NOMOGGTIVAES~~) ");
    SQL.append("and   (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NVL(B.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC')) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_TIPOVAR.SetQuery(PPQRY_T57, 0, SQL, PFL_TIPOVAR_TIPOVARESIGI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NVL(A.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC')) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   (NVL(B.MOTIVO, 'ZZ') IN ('EAN', 'EA', 'EC')) ");
    SQL.append("and   (~~TBL_TIPOVAR.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_TIPOVAR.SetQuery(PPQRY_T57, 1, SQL, PFL_TIPOVAR_TIPOVARESIGI, "");
    PAN_TIPOVAR.SetQueryDB(PPQRY_T57, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPAVA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOVAR.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_TIPOVAR_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOVAR.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_TIPOVAR_TIPOAVANZO, "");
    PAN_TIPOVAR.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPOVAR.SetIMDB(IMDB, "PQRY_TIPOVAR1", true);
    PAN_TIPOVAR.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_TIPOVAR.SetQueryIMDB(PPQRY_TIPOVAR1, IMDBDef14.PQRY_TIPOVAR1_RS, IMDBDef5.TBL_TIPOVAR);
    JustLoaded = true;
    PAN_TIPOVAR.SetFieldPrimaryIndex(PFL_TIPOVAR_TIPOVARIAZIO, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPVAR);
    PAN_TIPOVAR.SetFieldPrimaryIndex(PFL_TIPOVAR_TIPOVARESIGI, IMDBDef5.FLD_TIPOVAR_NOMOGGTIVAES);
    PAN_TIPOVAR.SetFieldPrimaryIndex(PFL_TIPOVAR_TIPOAVANZO, IMDBDef5.FLD_TIPOVAR_NOMOGGTIPAVA);
    PAN_TIPOVAR.SetMasterTable(0, "TIPOVAR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPOVAR.Status() == 2)
    {
      int oldListQBE = PAN_TIPOVAR.iUseListQBE;
      PAN_TIPOVAR.iUseListQBE = 0;
      PAN_TIPOVAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPOVAR.PanelCommand(Glb.PCM_FIND);
      PAN_TIPOVAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPOVAR) PAN_TIPOVAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPOVAR) PAN_TIPOVAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPOVAR) PAN_TIPOVAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPOVAR) PAN_TIPOVAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPOVAR) PAN_TIPOVAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
