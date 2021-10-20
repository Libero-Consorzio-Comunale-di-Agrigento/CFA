// **********************************************
// Rettifica Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_VECCHIIMPEGN = 0;
  private static int PFL_PARAM_ANNOIMPEGNO = 1;
  private static int PFL_PARAM_NUOVOIMPEGNO = 2;
  private static int PFL_PARAM_ANNOIMPENUOV = 3;
  private static int PFL_PARAM_SEPARATORE = 4;
  private static int PFL_PARAM_SCELTAIMPEGN = 5;
  private static int PFL_PARAM_OK = 6;
  private static int PFL_PARAM_ANNULLA = 7;
  private static int PFL_PARAM_SEPARATORE1 = 8;
  private static int PFL_PARAM_SCELNUOVIMPE = 9;

  private static int PPQRY_PARAM60 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM43(IMDB);
    //
    //
    Init_PQRY_PARAM60(IMDB);
    Init_PQRY_PARAM60_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM43(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM43, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM43, "TBL_PARAM43");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMEMODIF,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMANIMNU, "ROWNAMANIMNU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMANIMNU,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMNUIMNU, "ROWNAMNUIMNU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM43,IMDBDef2.FLD_PARAM43_ROWNAMNUIMNU,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM43, 0);
  }

  private static void Init_PQRY_PARAM60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM60, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM60, "PQRY_PARAM60");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, "ROWNAMANIMNU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, "ROWNAMNUIMNU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60,IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM60, 0);
  }

  private static void Init_PQRY_PARAM60_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM60_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM60_RS, "PQRY_PARAM60_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, "ROWNAMANIMNU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, "ROWNAMNUIMNU");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM60_RS,IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaImpegno()
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
    FormIdx = MyGlb.FRM_RETTIFIMPEGN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BE09F7EB-6A9A-4BF8-9E50-B28050ABD15A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 300;
    DesignHeight = 166;
    set_Caption(new IDVariant("Rettifica Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 300;
    Frames[1].Height = 140;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 140;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 300-MyGlb.PAN_OFFS_X, 140-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0162157E-6A3A-4957-836A-93475AB82639");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 316, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM43, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIFIMPEGN_PARAM60();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELIMPEORDI && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCELTAIMPEGN) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCELNUOVIMPE) {
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
    return (obj instanceof RettificaImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaImpegno.class.getName() : (Glb.ClassWithPackage(RettificaImpegno.class) ? RettificaImpegno.class.getName().substring(RettificaImpegno.class.getPackage().getName().length() + 1) : RettificaImpegno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Impegno non presente sull'ordine!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VISTA_IMP_UO_UT A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
        SQL.append("and   ((A.SCADENZA_UO IS NULL) OR A.SCADENZA_UO >= TRUNC( SYSDATE )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Impegno non presente!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "ParamOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Vecchio Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneVecchioImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Vecchio Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI327, IMDBDef1.FLD_PARAMETRI327_ROWNAMANNBUO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI327, IMDBDef1.FLD_PARAMETRI327_ROWNAMNUMBUO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      MainFrm.Show(MyGlb.FRM_SCELIMPEORDI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "SelezioneVecchioImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Nuovo Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneNuovoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Nuovo Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "SelezioneNuovoImpegno", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELIMPEORDI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_DETTIMPEBUO1, IMDBDef7.PQSL_DETTIMPEBUO1_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_DETTIMPEBUO1, IMDBDef7.PQSL_DETTIMPEBUO1_NUMERO_IMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "EndModalEvent", _e);
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
      if (IMDB.Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMEMODIF, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMANNIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMNUMIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMEMODIF, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMNUIMNU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMANIMNU, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Dati incompleti! Impossibile procedere.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.RETTIFICAIMPBUONIWEB(IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0), IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0), IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANNIMP, 0), IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUMIMP, 0), IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMANIMNU, 0), IMDB.Value(IMDBDef10.PQRY_PARAM60, IMDBDef10.PQSL_PARAM60_ROWNAMNUIMNU, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegno", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIFIMPEGN_PARAM60() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM60_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM43, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM43, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM60_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM60_RS, 0, IMDBDef2.TBL_PARAM43, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM60_RS, 0, 0, IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMANNIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM60_RS, 1, 0, IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMNUMIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM60_RS, 2, 0, IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMANIMNU, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM60_RS, 3, 0, IMDBDef2.TBL_PARAM43, IMDBDef2.FLD_PARAM43_ROWNAMNUIMNU, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM43, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM43, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM43, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM60_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneVecchioImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SCELNUOVIMPE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneNuovoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, "B8D09D8B-6FE1-4BC7-865D-C913C3E45B15");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, "Vecchio Impegno");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, "F47E3F94-A3A3-4433-B482-92A7F12B1D73");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, "Anno Impegno");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, "5CA47CAA-CB49-4F2F-970A-1A8275D2867E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, "Nuovo Impegno");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, "412789A2-05D7-404E-9F92-33A57E47B3C3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, "Anno Impegno Nuovo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, "B69B0A5C-AD84-4B42-843B-98D91D27A6E2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, "1C9A1686-1394-47FA-B1DD-A1019B323E0F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "7FD0176C-373C-4ABD-B3B0-809A6D9B833A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "OK");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "AB23C4C4-CDF0-4508-B98E-427ADEE34562");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "Annulla");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, "80B0C8A2-1E0E-439B-886B-47797F4E43CB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, "7EB2068A-D461-4894-ABEF-45E546B77395");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_LIST, "Vecc. Imp.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_FORM, 4, 12, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VECCHIIMPEGN, MyGlb.PANEL_FORM, "Vecchio Impegno");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VECCHIIMPEGN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VECCHIIMPEGN, PPQRY_PARAM60, "A.ROWNAMNUMIMP", "ROWNAMNUMIMP", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Ann. Imp.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_FORM, 196, 12, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Anno Impegno");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOIMPEGNO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOIMPEGNO, PPQRY_PARAM60, "A.ROWNAMANNIMP", "ROWNAMANNIMP", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_LIST, "Nuovo Impegno");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 12, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVOIMPEGNO, MyGlb.PANEL_FORM, "Nuovo Impegno");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVOIMPEGNO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVOIMPEGNO, PPQRY_PARAM60, "A.ROWNAMNUIMNU", "ROWNAMNUIMNU", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_LIST, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_LIST, "Anno Impegno Nuovo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_FORM, 196, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOIMPENUOV, MyGlb.PANEL_FORM, "Ann. Imp. Nuovo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOIMPENUOV, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOIMPENUOV, PPQRY_PARAM60, "A.ROWNAMANIMNU", "ROWNAMANIMNU", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_LIST, 164, 44, 12, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_FORM, 176, 12, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SEPARATORE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SEPARATORE, -1, "", "SEPARATORE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_LIST, 220, 12, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_FORM, 248, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCELTAIMPEGN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 92, 48, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 96, 72, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 100, 56, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 184, 72, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNULLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_LIST, 172, 52, 12, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_FORM, 176, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SEPARATORE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SEPARATORE1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SEPARATORE1, -1, "", "SEPARATORE1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_LIST, 228, 20, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_FORM, 248, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELNUOVIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCELNUOVIMPE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCELNUOVIMPE, -1, "", "SCELNUOVIMPE", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM60", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM60, IMDBDef10.PQRY_PARAM60_RS, IMDBDef2.TBL_PARAM43);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VECCHIIMPEGN, IMDBDef2.FLD_PARAM43_ROWNAMNUMIMP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOIMPEGNO, IMDBDef2.FLD_PARAM43_ROWNAMANNIMP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUOVOIMPEGNO, IMDBDef2.FLD_PARAM43_ROWNAMNUIMNU);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOIMPENUOV, IMDBDef2.FLD_PARAM43_ROWNAMANIMNU);
    PAN_PARAM.SetMasterTable(0, "PARAM43");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
