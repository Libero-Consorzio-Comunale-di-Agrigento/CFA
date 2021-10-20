// **********************************************
// Rettifica Sub Impegno Di Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaSubImpegnoDiMandato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RETSUBIMDIMA_MANDATI = 0;
  private static int GRP_RETSUBIMDIMA_SUBIMPEGNO = 1;

  private static int PFL_RETSUBIMDIMA_DAL = 0;
  private static int PFL_RETSUBIMDIMA_AL = 1;
  private static int PFL_RETSUBIMDIMA_LABEVUOTMAND = 2;
  private static int PFL_RETSUBIMDIMA_NUOVOSUBIMPE = 3;
  private static int PFL_RETSUBIMDIMA_ANNOSUBIMPEG = 4;
  private static int PFL_RETSUBIMDIMA_SCELTAIMPEGN = 5;
  private static int PFL_RETSUBIMDIMA_INFOIMPEGNO = 6;
  private static int PFL_RETSUBIMDIMA_BARRA = 7;
  private static int PFL_RETSUBIMDIMA_LABVUOVOCPEG = 8;
  private static int PFL_RETSUBIMDIMA_ELABORA = 9;

  private static int PPQRY_PARAMETRI149 = 0;


  IDPanel PAN_RETSUBIMDIMA;

  // Definition of Global Variables
  private IDVariant CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant ARTICOLO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI153(IMDB);
    //
    //
    Init_PQRY_PARAMETRI149(IMDB);
    Init_PQRY_PARAMETRI149_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI153(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI153, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI153, "TBL_PARAMETRI153");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARNUMSUBIMP, "PARNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARANNSUBIMP, "PARANNSUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI153,IMDBDef5.FLD_PARAMETRI153_PARANNSUBIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI153, 0);
  }

  private static void Init_PQRY_PARAMETRI149(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI149, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI149, "PQRY_PARAMETRI149");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, "PARNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, "PARANNSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149,IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI149, 0);
  }

  private static void Init_PQRY_PARAMETRI149_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI149_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI149_RS, "PQRY_PARAMETRI149_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, "PARNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, "PARANNSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI149_RS,IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaSubImpegnoDiMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaSubImpegnoDiMandato()
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
    FormIdx = MyGlb.FRM_RETSUBIMDIMA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "373B8519-0938-4DC3-8FD8-B8F90423AFC6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 332;
    DesignHeight = 234;
    set_Caption(new IDVariant("Rettifica Sub Impegno Di Mandato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 332;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Rettifica Sub Impegno Di Mandato";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_RETSUBIMDIMA = new IDPanel(w, this, 1, "PAN_RETSUBIMDIMA");
    Frames[1].Content = PAN_RETSUBIMDIMA;
    PAN_RETSUBIMDIMA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETSUBIMDIMA.VS = MainFrm.VisualStyleList;
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 332-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F975D9D1-E042-4405-8728-646B9ED01B01");
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETSUBIMDIMA.InitStatus = 2;
    PAN_RETSUBIMDIMA_Init();
    PAN_RETSUBIMDIMA_InitFields();
    PAN_RETSUBIMDIMA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI153, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETSUBIMDIMA_PARAMETRI149();
      }
      PAN_RETSUBIMDIMA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_RETSUBIMDIMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETSUBIMDIMA_SCELTAIMPEGN) {
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
    return (obj instanceof RettificaSubImpegnoDiMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaSubImpegnoDiMandato.class.getName() : (Glb.ClassWithPackage(RettificaSubImpegnoDiMandato.class) ? RettificaSubImpegnoDiMandato.class.getName().substring(RettificaSubImpegnoDiMandato.class.getPackage().getName().length() + 1) : RettificaSubImpegnoDiMandato.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Rettifica Sub-Impegno di Mandato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.  ", IDVariant.STRING));
        CAPITOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_CAPITOLO, 0);
        ARTICOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ARTICOLO, 0);
        v_CAPITOLOART = IDL.Add(IDL.Add(IDL.Add(v_CAPITOLOART, IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
        PAN_RETSUBIMDIMA.set_Header(Glb.OBJ_GROUP,GRP_RETSUBIMDIMA_SUBIMPEGNO,v_CAPITOLOART.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Sub Impegno Di Mandato On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETSUBIMDIMA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifica Sub Impegno Di Mandato On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_RETSUBIMDIMA_NUOVOSUBIMPE)), true) || Column.equals((new IDVariant(PFL_RETSUBIMDIMA_ANNOSUBIMPEG)), true))
      {
        IDVariant v_VOCEPEG = new IDVariant(0,IDVariant.STRING);
        v_VOCEPEG = (new IDVariant("Voce P.e.g.   ", IDVariant.STRING));
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0)))
        {
          PAN_RETSUBIMDIMA.set_Header(Glb.OBJ_GROUP,GRP_RETSUBIMDIMA_SUBIMPEGNO,v_VOCEPEG.stringValue()); 
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0))))
          {
            SettaVocePEG(new IDVariant(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "RettificaSubImpegnoDiMandatoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Sub Impegno Di Mandato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETSUBIMDIMA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETSUBIMDIMA);
      // 
      // Rettifica Sub Impegno Di Mandato On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0))))
      {
        PAN_RETSUBIMDIMA.SetFlags (Glb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETSUBIMDIMA.SetFlags (Glb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "RettificaSubImpegnoDiMandatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta Sub Impegno RIM
  // **********************************************************************
  public int SceltaSubImpegnoRIM ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Sub Impegno RIM Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "SceltaSubImpegnoRIM", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0));
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Voce P E G
  // Numero Sub Impegno:  - Input
  // Anno Sub Impegno:  - Input
  // Esercizio:  - Input
  // **********************************************************************
  public int SettaVocePEG (IDVariant NumeroSubImpegno, IDVariant AnnoSubImpegno, IDVariant Esercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOSUBIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROSUBIMP = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Setta Voce P E G Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_SUBIMP as ESESANNOSUBI, ");
      SQL.append("  A.NUMERO_SUBIMP as ESESNUMESUBI, ");
      SQL.append("  A.CAPITOLO as ESESUBCAPITO, ");
      SQL.append("  A.ARTICOLO as ESESUBARTICO ");
      SQL.append("from ");
      SQL.append("  ESESUB A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubImpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubImpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ANNOSUBIMP = QV.Get("ESESANNOSUBI", IDVariant.INTEGER) ;
        v_NUMEROSUBIMP = QV.Get("ESESNUMESUBI", IDVariant.DECIMAL) ;
        CAPITOLO = QV.Get("ESESUBCAPITO", IDVariant.DECIMAL) ;
        ARTICOLO = QV.Get("ESESUBARTICO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_ANNOSUBIMP.equals(AnnoSubImpegno, true) && v_NUMEROSUBIMP.equals(NumeroSubImpegno, true))
      {
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.  ", IDVariant.STRING));
        v_CAPITOLOART = IDL.Add(IDL.Add(IDL.Add(v_CAPITOLOART, IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        PAN_RETSUBIMDIMA.set_Header(Glb.OBJ_GROUP,GRP_RETSUBIMDIMA_SUBIMPEGNO,v_CAPITOLOART.stringValue()); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Sub-Impegno di Spesa non previsto in Bilancio!", IDVariant.STRING));
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0, (new IDVariant()));
        CAPITOLO = (new IDVariant());
        ARTICOLO = (new IDVariant());
        PAN_RETSUBIMDIMA.set_Header(Glb.OBJ_GROUP,GRP_RETSUBIMDIMA_SUBIMPEGNO,v_CAPITOLOART.stringValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "SettaVocePEG", _e);
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
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0)))
      {
        IDVariant v_ERRORE1 = new IDVariant(0,IDVariant.STRING);
        v_ERRORE1 = (new IDVariant("Estremi elaborazione incompleti!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRORE1); 
        return 0;
      }
      if (RilevantiControlloEco(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL, 0)).equals((new IDVariant(-1)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Attenzione: sono presenti Mandati senza imputazione economica e il nuovo Sub-Impegno non ha rilevanza economica. Le imputazioni economiche dovranno essere inserite manualmente sui Mandati.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.RETTIFICAMANSUB(IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMMANDAL, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANUMMANAL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARNUMSUBIMP, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI149, IMDBDef15.PQSL_PARAMETRI149_PARANNSUBIMP, 0), v_ERRORE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        if (v_ERRORE.equals((new IDVariant(1)), true))
        {
          IDVariant v_TERMINAZIONE = new IDVariant(0,IDVariant.STRING);
          v_TERMINAZIONE = (new IDVariant("Elaborazione terminata. Finanziamenti annullati sulle liquidazioni in quanto non previsti sul nuovo Sub-Impegno.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_TERMINAZIONE); 
        }
        else
        {
          IDVariant v_TERMINAZIONE = new IDVariant(0,IDVariant.STRING);
          v_TERMINAZIONE = (new IDVariant("Elaborazione terminata.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_TERMINAZIONE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Mandato
  // Capitolo:  - Input
  // Articolo:  - Input
  // Numero Sub Imp:  - Input
  // Anno Sub Imp:  - Input
  // Mandati Dal:  - Input
  // Mandati Al:  - Input
  // **********************************************************************
  public IDVariant ControlloMandato (IDVariant Capitolo, IDVariant Articolo, IDVariant NumeroSubImp, IDVariant AnnoSubImp, IDVariant MandatiDal, IDVariant MandatiAl)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOIMPMAND = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERIMPMAND = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Mandato Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
      SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP ");
      SQL.append("from ");
      SQL.append("  SUBIMP A ");
      SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ANNOIMP = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
        v_NUMEROIMP = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where ((A.NUMERO_MAND BETWEEN " + IDL.CSql(MandatiDal, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(MandatiAl, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMREC.compareTo((new IDVariant(0)), true)!=0)
      {
        while (MandatiDal.compareTo(MandatiAl, true)<=0)
        {
          v_ANNOIMPMAND = (new IDVariant());
          v_NUMERIMPMAND = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.ANNO_IMP as MANANNOIMP, ");
          SQL.append("  A.NUMERO_IMP as MANNUMEROIMP ");
          SQL.append("from ");
          SQL.append("  MAN A ");
          SQL.append("where (A.NUMERO_MAND = " + IDL.CSql(MandatiDal, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_ANNOIMPMAND = QV.Get("MANANNOIMP", IDVariant.INTEGER) ;
            v_NUMERIMPMAND = QV.Get("MANNUMEROIMP", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (!(IDL.IsNull(v_ANNOIMPMAND)))
          {
            if (v_NUMERIMPMAND.compareTo(v_NUMEROIMP, true)!=0)
            {
              return (new IDVariant(-1));
            }
          }
          MandatiDal = IDL.Add(MandatiDal, (new IDVariant(1)));
        }
        return (new IDVariant(0));
      }
      return (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "ControlloMandato", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Rilevanti Controllo Eco
  // Anno Sub Imp:  - Input
  // Numero Sub Imp:  - Input
  // Numero Mand Dal:  - Input
  // Numero Mand Al:  - Input
  // **********************************************************************
  public IDVariant RilevantiControlloEco (IDVariant AnnoSubImp, IDVariant NumeroSubImp, IDVariant NumeroMandDal, IDVariant NumeroMandAl)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RILECOSUBIMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RILEVAECOLIQ = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Rilevanti Controllo Eco Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RILEVANTE_ECO as SUBIMRILEECO ");
      SQL.append("from ");
      SQL.append("  SUBIMP A ");
      SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RILECOSUBIMP = QV.Get("SUBIMRILEECO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_RILECOSUBIMP,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  A.RILEVANTE_ECO as SUBIMRILEECO ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (LPAD(TO_CHAR ( A.ANNO_SUBIMP ), 4, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_SUBIMP ), 5, SUBSTR(' ', 1, 1)) IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  LPAD(TO_CHAR ( B.ANNO_SUBIMP ), 4, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_SUBIMP ), 5, SUBSTR(' ', 1, 1)) ");
        SQL.append("from ");
        SQL.append("  LIQ B ");
        SQL.append("where (B.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((B.NUMERO_MAND BETWEEN " + IDL.CSql(NumeroMandDal, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(NumeroMandAl, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append(")) ");
        SQL.append("and   (NOT ((A.RILEVANTE_ECO IS NULL))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_RILEVAECOLIQ = QV.Get("SUBIMRILEECO", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_RILEVAECOLIQ,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          return (new IDVariant(-1));
        }
        else
        {
          return (new IDVariant(1));
        }
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaSubImpegnoDiMandato", "RilevantiControlloEco", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETSUBIMDIMA_PARAMETRI149() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI149_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI153, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI153, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI149_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI149_RS, 0, IMDBDef5.TBL_PARAMETRI153, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI149_RS, 0, 0, IMDBDef5.TBL_PARAMETRI153, IMDBDef5.FLD_PARAMETRI153_PARNUMMANDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI149_RS, 1, 0, IMDBDef5.TBL_PARAMETRI153, IMDBDef5.FLD_PARAMETRI153_PARANUMMANAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI149_RS, 2, 0, IMDBDef5.TBL_PARAMETRI153, IMDBDef5.FLD_PARAMETRI153_PARNUMSUBIMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI149_RS, 3, 0, IMDBDef5.TBL_PARAMETRI153, IMDBDef5.FLD_PARAMETRI153_PARANNSUBIMP, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI153, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI153, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI153, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI149_RS, 0);
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
  private void PAN_RETSUBIMDIMA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETSUBIMDIMA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RETSUBIMDIMA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RETSUBIMDIMA, Cancel);
    // Stub
  }

  private void PAN_RETSUBIMDIMA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETSUBIMDIMA_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_RETSUBIMDIMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubImpegnoRIM();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETSUBIMDIMA_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_RETSUBIMDIMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETSUBIMDIMA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RETSUBIMDIMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETSUBIMDIMA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RETSUBIMDIMA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RETSUBIMDIMA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETSUBIMDIMA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETSUBIMDIMA_Init()
  {

    PAN_RETSUBIMDIMA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETSUBIMDIMA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, "7E63D49E-EA50-4BF7-8EB6-3F7029D6FE98");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, "Mandati");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, MyGlb.PANEL_FORM, 12, 15, 288, 57, 0, 0);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, 0, 46);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, 1, 13);
    PAN_RETSUBIMDIMA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, 0, 4);
    PAN_RETSUBIMDIMA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, 1, 4);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, "4CA57359-E414-4585-BCBC-17F6103F64F5");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, "Sub Impegno");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, MyGlb.PANEL_FORM, 12, 88, 288, 40, 0, 0);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, 0, 75);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, 1, 13);
    PAN_RETSUBIMDIMA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, 0, 4);
    PAN_RETSUBIMDIMA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, 1, 1);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_GROUP, GRP_RETSUBIMDIMA_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETSUBIMDIMA.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, "BD964247-1FB2-45CE-9C07-D875D6583A44");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, "Dal");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, "C176C788-F357-4427-B3CF-E09733F7F26A");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, "Al");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, "07C269C6-4A7B-41AC-AB9E-4D5F19A33F92");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, "6F622F6E-595F-4465-93EC-3D83DEA48DA3");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, "Nuovo Sub-Impegno");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.VIS_NORMALFIELDS);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, "F0BF2DD6-7E87-429B-881A-E014DC39EC29");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, "Anno Sub Impegno");
    PAN_RETSUBIMDIMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, "530EE683-FA8A-44EE-BCDD-FDD879C39946");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_RETSUBIMDIMA.SetImage(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, "A50C3A36-0CC0-4C20-8A06-6CEAEC18C770");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_RETSUBIMDIMA.SetImage(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, 0, "info.gif", false);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, "ED3BBBC3-0FA3-4153-A8C8-2FCC2DB25C65");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, "/");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, "CF7FA1B4-162E-46A3-BCF8-45D790988CEA");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, "");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETSUBIMDIMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, "F2CBBAD3-738A-42BB-AB72-A4554A692541");
    PAN_RETSUBIMDIMA.set_Header(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, "Elabora");
    PAN_RETSUBIMDIMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RETSUBIMDIMA.SetImage(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, 0, "button1.gif", false);
    PAN_RETSUBIMDIMA.SetFlags(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RETSUBIMDIMA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_LIST, 108);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_FORM, 16, 40, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_FORM, 108);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_DAL, -1, GRP_RETSUBIMDIMA_MANDATI);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_DAL, PPQRY_PARAMETRI149, "A.PARNUMMANDAL", "PARNUMMANDAL", 1, 5, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_LIST, 104);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_LIST, "Al");
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_FORM, 188, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_FORM, 20);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_AL, MyGlb.PANEL_FORM, "Al");
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_AL, -1, GRP_RETSUBIMDIMA_MANDATI);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_AL, PPQRY_PARAMETRI149, "A.PARANUMMANAL", "PARANUMMANAL", 1, 5, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_LIST, 244, 52, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_FORM, 284, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABEVUOTMAND, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_LABEVUOTMAND, -1, GRP_RETSUBIMDIMA_MANDATI);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_LABEVUOTMAND, -1, "", "LABEVUOTMAND", 0, 0, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 92);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_LIST, "N. S. I.");
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 16, 92, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 124);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_NUOVOSUBIMPE, MyGlb.PANEL_FORM, "Nuovo Sub-Impegno");
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_NUOVOSUBIMPE, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_NUOVOSUBIMPE, PPQRY_PARAMETRI149, "A.PARNUMSUBIMP", "PARNUMSUBIMP", 1, 5, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 80);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "A. S. I.");
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 212, 92, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 120);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "Anno Sub Impegno");
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_ANNOSUBIMPEG, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_ANNOSUBIMPEG, PPQRY_PARAMETRI149, "A.PARANNSUBIMP", "PARANNSUBIMP", 1, 5, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 244, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 260, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_SCELTAIMPEGN, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_LIST, 264, 132, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_FORM, 276, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_INFOIMPEGNO, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_LIST, 144, 128, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_FORM, 192, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_BARRA, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_LIST, 252, 60, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_FORM, 288, 116, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_LABVUOVOCPEG, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_LABVUOVOCPEG, -1, GRP_RETSUBIMDIMA_SUBIMPEGNO);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_LABVUOVOCPEG, -1, "", "LABVUOVOCPEG", 0, 0, 0, -13997);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RETSUBIMDIMA.SetRect(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_FORM, 220, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETSUBIMDIMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RETSUBIMDIMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETSUBIMDIMA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RETSUBIMDIMA.SetFieldPage(PFL_RETSUBIMDIMA_ELABORA, -1, -1);
    PAN_RETSUBIMDIMA.SetFieldPanel(PFL_RETSUBIMDIMA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_RETSUBIMDIMA_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETSUBIMDIMA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETSUBIMDIMA.SetIMDB(IMDB, "PQRY_PARAMETRI149", true);
    PAN_RETSUBIMDIMA.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_RETSUBIMDIMA.SetQueryIMDB(PPQRY_PARAMETRI149, IMDBDef15.PQRY_PARAMETRI149_RS, IMDBDef5.TBL_PARAMETRI153);
    JustLoaded = true;
    PAN_RETSUBIMDIMA.SetFieldPrimaryIndex(PFL_RETSUBIMDIMA_DAL, IMDBDef5.FLD_PARAMETRI153_PARNUMMANDAL);
    PAN_RETSUBIMDIMA.SetFieldPrimaryIndex(PFL_RETSUBIMDIMA_AL, IMDBDef5.FLD_PARAMETRI153_PARANUMMANAL);
    PAN_RETSUBIMDIMA.SetFieldPrimaryIndex(PFL_RETSUBIMDIMA_NUOVOSUBIMPE, IMDBDef5.FLD_PARAMETRI153_PARNUMSUBIMP);
    PAN_RETSUBIMDIMA.SetFieldPrimaryIndex(PFL_RETSUBIMDIMA_ANNOSUBIMPEG, IMDBDef5.FLD_PARAMETRI153_PARANNSUBIMP);
    PAN_RETSUBIMDIMA.SetMasterTable(0, "PARAMETRI153");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETSUBIMDIMA.Status() == 2)
    {
      int oldListQBE = PAN_RETSUBIMDIMA.iUseListQBE;
      PAN_RETSUBIMDIMA.iUseListQBE = 0;
      PAN_RETSUBIMDIMA.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETSUBIMDIMA.PanelCommand(Glb.PCM_FIND);
      PAN_RETSUBIMDIMA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETSUBIMDIMA) PAN_RETSUBIMDIMA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETSUBIMDIMA) PAN_RETSUBIMDIMA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETSUBIMDIMA) PAN_RETSUBIMDIMA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETSUBIMDIMA) PAN_RETSUBIMDIMA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RETSUBIMDIMA) PAN_RETSUBIMDIMA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
