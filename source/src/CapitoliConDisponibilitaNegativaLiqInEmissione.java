// **********************************************
// Capitoli Con Disponibilita Negativa Liq In Emissione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CapitoliConDisponibilitaNegativaLiqInEmissione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAPITOLI_CAPITOLO = 0;
  private static int PFL_CAPITOLI_ARTICOLO = 1;
  private static int PFL_CAPITOLI_TOTALEIMPORT = 2;
  private static int PFL_CAPITOLI_DISPONIBILIT = 3;
  private static int PFL_CAPITOLI_VARPROVVISOR = 4;
  private static int PFL_CAPITOLI_DUALDISPRISU = 5;

  private static int PPQRY_BIL6 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_CAPITOLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS51(IMDB);
    //
    //
    Init_PQRY_BIL6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS51(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS51, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS51, "TBL_PARS51");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMOGGCADINE, "NOMOGGCADINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMOGGCADINE,1,12,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMEOGGEVPRO, "NOMEOGGEVPRO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMEOGGEVPRO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMEOGGEUFFI, "NOMEOGGEUFFI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS51,IMDBDef5.FLD_PARS51_NOMEOGGEUFFI,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS51, 0);
  }

  private static void Init_PQRY_BIL6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_BIL6, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_BIL6, "PQRY_BIL6");
    IMDB.set_FldCode(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_RECORBILCAPI, "RECORBILCAPI");
    IMDB.SetFldParams(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_RECORBILCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_RECORBILARTI, "RECORBILARTI");
    IMDB.SetFldParams(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_RECORBILARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_TOTALEIMPORT, "TOTALEIMPORT");
    IMDB.SetFldParams(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_TOTALEIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_DISPONIBILIT, "DISPONIBILIT");
    IMDB.SetFldParams(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_DISPONIBILIT,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_VARPROVVISOR, "VARPROVVISOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_BIL6,IMDBDef14.PQSL_BIL6_VARPROVVISOR,3,28,6);
    IMDB.TblAddNew(IMDBDef14.PQRY_BIL6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CapitoliConDisponibilitaNegativaLiqInEmissione(MyWebEntryPoint w, IMDBObj imdb)
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
  public CapitoliConDisponibilitaNegativaLiqInEmissione()
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
    FormIdx = MyGlb.FRM_CACODINELIIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E24E2E77-9654-4E83-85F2-CF0EA8D02953";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 374;
    set_Caption(new IDVariant("Capitoli con disponibilità negativa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 348;
    Frames[1].Caption = "Capitoli";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_CAPITOLI = new IDPanel(w, this, 1, "PAN_CAPITOLI");
    Frames[1].Content = PAN_CAPITOLI;
    PAN_CAPITOLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPITOLI.VS = MainFrm.VisualStyleList;
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "296DD810-5F6A-4583-92DC-5594E44DB8A0");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 732, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPITOLI.InitStatus = 2;
    PAN_CAPITOLI_Init();
    PAN_CAPITOLI_InitFields();
    PAN_CAPITOLI_InitQueries();
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
      PAN_CAPITOLI.UpdatePanel(MainFrm);
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
    return (obj instanceof CapitoliConDisponibilitaNegativaLiqInEmissione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CapitoliConDisponibilitaNegativaLiqInEmissione.class.getName() : (Glb.ClassWithPackage(CapitoliConDisponibilitaNegativaLiqInEmissione.class) ? CapitoliConDisponibilitaNegativaLiqInEmissione.class.getName().substring(CapitoliConDisponibilitaNegativaLiqInEmissione.class.getPackage().getName().length() + 1) : CapitoliConDisponibilitaNegativaLiqInEmissione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARSDELETE();
      // IDVariant v_VT99COCAVPLI = null;
      // v_VT99COCAVPLI = (new IDVariant());
      // IDVariant v_VT9COCAVPINE = null;
      // v_VT9COCAVPINE = (new IDVariant());
      // SQL = new StringBuffer();
      // SQL.append("select ");
      // SQL.append("  A.CONTROLLO_CASSA_VPRO_LIQ as T99CONCAVPLI, ");
      // SQL.append("  NVL(A.CONTROLLO_CASSA_VPRO_IN_EMISS, 1) as NUVAT9CCVIEB ");
      // SQL.append("from ");
      // SQL.append("  T99 A ");
      // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      // if (!QV.EOF()) QV.MoveNext();
      // if (!QV.EOF())
      // {
      //   v_VT99COCAVPLI = QV.Get("T99CONCAVPLI", IDVariant.INTEGER) ;
      //   v_VT9COCAVPINE = QV.Get("NUVAT9CCVIEB", IDVariant.INTEGER) ;
      // }
      // QV.Close();
      // IDVariant v_BLOCCANTONON = new IDVariant(0,IDVariant.INTEGER);
      // if (!(IDL.IsNull(v_VT99COCAVPLI)))
      // {
        // v_BLOCCANTONON = new IDVariant(v_VT99COCAVPLI);
      // }
      // else
      // {
        // v_BLOCCANTONON = new IDVariant(v_VT9COCAVPINE);
      // }
      // IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      // C4 = PAN_CAPITOLI.MasterRS();
      // if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      // if (!C4.Bof()) PAN_CAPITOLI.GotoFirst();
      // while (!PAN_CAPITOLI.RSEOF())
      // {
        // if (C4.Get("DISPONIBILIT").compareTo((new IDVariant(0)), true)<0)
        // {
          // I = IDL.Add(I, (new IDVariant(1)));
        // }
      //   PAN_CAPITOLI.GotoNext();
      // }
      // if (CurPos>0) C4.absolute(CurPos);
      // IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMOGGCADINE, 0, new IDVariant(I));
      // IDVariant v_COMMIT = new IDVariant(0,IDVariant.INTEGER);
      // if (IMDB.Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMOGGCADINE, 0).equals((new IDVariant(0)), true))
      // {
        // v_COMMIT = (new IDVariant(-1));
      // }
      // else
      // {
        // if (v_BLOCCANTONON.equals((new IDVariant(1)), true))
        // {
          // v_COMMIT = (new IDVariant(0));
        // }
        // else
        // {
          // IDVariant S = new IDVariant(0,IDVariant.STRING);
          // S = (new IDVariant("Si confermano le modifiche?"));
          // IDVariant v_RISPOSTA = null;
          // v_RISPOSTA = (new IDVariant(MainFrm.MessageConfirmEx(S)));
          // if (IDL.IsNull(v_RISPOSTA))
          // {
            // return;
          // }
          // if (v_RISPOSTA.equals((new IDVariant(-1)), true))
          // {
            // v_COMMIT = (new IDVariant(-1));
          // }
          // else
          // {
            // v_COMMIT = (new IDVariant(0));
          // }
        // }
      // }
      // if (v_COMMIT.booleanValue())
      // {
      // }
      // else
      // {
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConDisponibilitaNegativaLiqInEmissione", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMOGGCADINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMEOGGEVPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMEOGGEUFFI, 0, new IDVariant());
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
      IDVariant v_VT99COCAVPLI = null;
      v_VT99COCAVPLI = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CONTROLLO_CASSA_VPRO_LIQ as T99CONCAVPLI ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VT99COCAVPLI = QV.Get("T99CONCAVPLI", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMEOGGEVPRO, 0, ((!(IDL.IsNull(v_VT99COCAVPLI)))?(new IDVariant("SI")):(new IDVariant("NO"))));
      IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMEOGGEUFFI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConDisponibilitaNegativaLiqInEmissione", "Load", _e);
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
  private void PAN_CAPITOLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPITOLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPITOLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPITOLI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPITOLI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CAPITOLI);
    // Stub
  }

  private void PAN_CAPITOLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPITOLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPITOLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPITOLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAPITOLI_Init()
  {

    PAN_CAPITOLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPITOLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPITOLI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, "8DE9E0EA-ACF4-40B4-BE29-B37B1C6991C5");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, "Capitolo");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, "42B956F7-F8F8-4A1C-A0E6-6C3F54FDD8BA");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, "Art.");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, "263E3BBC-3B2F-4C5C-9BBF-BC0297E90CF8");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, "Totale Importi");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, "8DB0174F-E6A9-44F0-ABC0-652EE4E5F257");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, "Disponibilità");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, "EDB605C2-71C7-4B25-8B7C-040641DBFD3F");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, "Var Provvisorie");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, "5559E4A6-56AC-4B3F-AAD2-57475A35FCE3");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, "Disponibilità Risultante");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAPITOLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_CAPITOLO, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_CAPITOLO, PPQRY_BIL6, "C.CAPITOLO", "RECORBILCAPI", 3, 16, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_LIST, 140, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_ARTICOLO, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_ARTICOLO, PPQRY_BIL6, "C.ARTICOLO", "RECORBILARTI", 1, 2, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_LIST, 172, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_LIST, 92);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_LIST, "Totale Importi");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_FORM, 4, 52, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_FORM, 92);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEIMPORT, MyGlb.PANEL_FORM, "Totale Importi");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_TOTALEIMPORT, -1, -1);
    PAN_CAPITOLI.SetFieldUnbound(PFL_CAPITOLI_TOTALEIMPORT, true);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_TOTALEIMPORT, PPQRY_BIL6, "SUM(B.IMPORTO)", "TOTALEIMPORT", 3, 28, 6, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_LIST, 312, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_LIST, 80);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 76, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_FORM, 80);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_DISPONIBILIT, -1, -1);
    PAN_CAPITOLI.SetFieldUnbound(PFL_CAPITOLI_DISPONIBILIT, true);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_DISPONIBILIT, PPQRY_BIL6, "MAX(C.DISPONIBILITA_CA)", "DISPONIBILIT", 3, 28, 6, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_LIST, 452, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_LIST, 96);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_LIST, "Var Provvisorie");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_FORM, 4, 100, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_FORM, 96);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARPROVVISOR, MyGlb.PANEL_FORM, "Var Provvisorie");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_VARPROVVISOR, -1, -1);
    SQL = new StringBuffer();
    SQL.append("MAX(( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(NVL(A.IMPORTO_CASSA, 0)), 0) ");
  SQL.append("from ");
  SQL.append("  VARCOMPRO A ");
  SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (A.E_S = 'S') ");
  SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
  SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
  SQL.append("))");
    PAN_CAPITOLI.SetFieldUnbound(PFL_CAPITOLI_VARPROVVISOR, true);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_VARPROVVISOR, PPQRY_BIL6, SQL.toString(), "VARPROVVISOR", 3, 28, 6, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_LIST, 592, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_LIST, 172);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_LIST, "Disponibilità Risultante");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_FORM, 4, 124, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_FORM, 172);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DUALDISPRISU, MyGlb.PANEL_FORM, "Disponibilità Risultante");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_DUALDISPRISU, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_DUALDISPRISU, PPQRY_DUAL, "NVL(~~DISPONIBILIT~~, 0) + NVL(~~VARPROVVISOR~~, 0)", "DISPONRISULT", 3, 28, 6, -13997);
  }

  private void PAN_CAPITOLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPITOLI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~DISPONIBILIT~~, 0) + NVL(~~VARPROVVISOR~~, 0) as DISPONRISULT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORBILCAPI~~ IS NULL))) ");
    PAN_CAPITOLI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_CAPITOLI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPITOLI.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_CAPITOLI.SetIMDB(IMDB, "PQRY_BIL6", true);
    PAN_CAPITOLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.CAPITOLO as RECORBILCAPI, ");
    SQL.append("  C.ARTICOLO as RECORBILARTI, ");
    SQL.append("  SUM(B.IMPORTO) as TOTALEIMPORT, ");
    SQL.append("  MAX(C.DISPONIBILITA_CA) as DISPONIBILIT, ");
    SQL.append("  MAX(( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(NVL(A.IMPORTO_CASSA, 0)), 0) ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append(")) as VARPROVVISOR ");
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ B, ");
    SQL.append("  BIL C ");
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = 'S') ");
    SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(C.ESERCIZIO,C.CAPITOLO,C.ARTICOLO,'EM') < 0) ");
    SQL.append("and   (B.ANNO_LIQ = C.ESERCIZIO) ");
    SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(~~TBL_PARS51.NOMEOGGEUFFI~~, -1), -1, NVL(B.UFFICIO, -1), ~~TBL_PARS51.NOMEOGGEUFFI~~)) ");
    SQL.append("and   (NOT ((B.ANNO_MAND IS NULL))) ");
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO ");
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO ");
    PAN_CAPITOLI.SetQuery(PPQRY_BIL6, 5, SQL, -1, "");
    PAN_CAPITOLI.SetQueryDB(PPQRY_BIL6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPITOLI.SetMasterTable(0, "BIL");
    PAN_CAPITOLI.AddToSortList(PFL_CAPITOLI_CAPITOLO, true);
    PAN_CAPITOLI.AddToSortList(PFL_CAPITOLI_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPITOLI.Status() == 2)
    {
      int oldListQBE = PAN_CAPITOLI.iUseListQBE;
      PAN_CAPITOLI.iUseListQBE = 0;
      PAN_CAPITOLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPITOLI.PanelCommand(Glb.PCM_FIND);
      PAN_CAPITOLI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
