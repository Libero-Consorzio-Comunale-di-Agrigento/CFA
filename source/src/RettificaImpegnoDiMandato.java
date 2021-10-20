// **********************************************
// Rettifica Impegno Di Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaImpegnoDiMandato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RETTIMPDIMAN_MANDATI = 0;
  private static int GRP_RETTIMPDIMAN_IMPEGNO = 1;

  private static int PFL_RETTIMPDIMAN_DAL = 0;
  private static int PFL_RETTIMPDIMAN_AL = 1;
  private static int PFL_RETTIMPDIMAN_LABEVUOTMAND = 2;
  private static int PFL_RETTIMPDIMAN_NUOVOIMPEGNO = 3;
  private static int PFL_RETTIMPDIMAN_ANNOIMPEGNO = 4;
  private static int PFL_RETTIMPDIMAN_SCELTAIMPEGN = 5;
  private static int PFL_RETTIMPDIMAN_INFOIMPEGNO = 6;
  private static int PFL_RETTIMPDIMAN_BARRA = 7;
  private static int PFL_RETTIMPDIMAN_LABVUOVOCPEG = 8;
  private static int PFL_RETTIMPDIMAN_ELABORA = 9;

  private static int PPQRY_PARAMETRI147 = 0;


  IDPanel PAN_RETTIMPDIMAN;

  // Definition of Global Variables
  private IDVariant CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant ARTICOLO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI151(IMDB);
    //
    //
    Init_PQRY_PARAMETRI147(IMDB);
    Init_PQRY_PARAMETRI147_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI151(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI151, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI151, "TBL_PARAMETRI151");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI151,IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI151, 0);
  }

  private static void Init_PQRY_PARAMETRI147(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI147, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI147, "PQRY_PARAMETRI147");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147,IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI147, 0);
  }

  private static void Init_PQRY_PARAMETRI147_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI147_RS, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI147_RS, "PQRY_PARAMETRI147_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, "PARANUMEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, "PARAANNOIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI147_RS,IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaImpegnoDiMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaImpegnoDiMandato()
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
    FormIdx = MyGlb.FRM_RETTIMPDIMAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7FF23ACC-60D3-4FF0-AE16-53258808E2CE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 0;
    DesignHeight = 242;
    set_Caption(new IDVariant("Rettifica Impegno Di Mandato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 312;
    Frames[1].Height = 216;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Rettifica Impegno Di Mandato";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 216;
    PAN_RETTIMPDIMAN = new IDPanel(w, this, 1, "PAN_RETTIMPDIMAN");
    Frames[1].Content = PAN_RETTIMPDIMAN;
    PAN_RETTIMPDIMAN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIMPDIMAN.VS = MainFrm.VisualStyleList;
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 312-MyGlb.PAN_OFFS_X, 216-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2CF6B8DD-75A5-40DE-B354-2253B60E1B0B");
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIMPDIMAN.InitStatus = 2;
    PAN_RETTIMPDIMAN_Init();
    PAN_RETTIMPDIMAN_InitFields();
    PAN_RETTIMPDIMAN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI151, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIMPDIMAN_PARAMETRI147();
      }
      PAN_RETTIMPDIMAN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_RETTIMPDIMAN.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIMPDIMAN_SCELTAIMPEGN) {
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
    return (obj instanceof RettificaImpegnoDiMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaImpegnoDiMandato.class.getName() : (Glb.ClassWithPackage(RettificaImpegnoDiMandato.class) ? RettificaImpegnoDiMandato.class.getName().substring(RettificaImpegnoDiMandato.class.getPackage().getName().length() + 1) : RettificaImpegnoDiMandato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.  ", IDVariant.STRING));
        CAPITOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_CAPITOLO, 0);
        ARTICOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ARTICOLO, 0);
        v_CAPITOLOART = IDL.Add(IDL.Add(IDL.Add(v_CAPITOLOART, IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        PAN_RETTIMPDIMAN.set_Header(Glb.OBJ_GROUP,GRP_RETTIMPDIMAN_IMPEGNO,v_CAPITOLOART.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "EndModalEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Rettifica Impegno di Mandato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARNUMMANDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARANUMMANAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE, 0, new IDVariant());
  }

  // **********************************************************************
  // Rettifica Impegno Di Mandato On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETTIMPDIMAN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifica Impegno Di Mandato On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_RETTIMPDIMAN_NUOVOIMPEGNO)), true) || Column.equals((new IDVariant(PFL_RETTIMPDIMAN_ANNOIMPEGNO)), true))
      {
        IDVariant v_VOCEPEG = new IDVariant(0,IDVariant.STRING);
        v_VOCEPEG = (new IDVariant("Voce P.e.g.   ", IDVariant.STRING));
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0)))
        {
          PAN_RETTIMPDIMAN.set_Header(Glb.OBJ_GROUP,GRP_RETTIMPDIMAN_IMPEGNO,v_VOCEPEG.stringValue()); 
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0))))
          {
            SettaVocePEG(new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "RettificaImpegnoDiMandatoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifica Impegno Di Mandato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIMPDIMAN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIMPDIMAN);
      // 
      // Rettifica Impegno Di Mandato On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0))))
      {
        PAN_RETTIMPDIMAN.SetFlags (Glb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETTIMPDIMAN.SetFlags (Glb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "RettificaImpegnoDiMandatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta Impegno RIM
  // **********************************************************************
  public int SceltaImpegnoRIM ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Impegno RIM Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "SceltaImpegnoRIM", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0));
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0)))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Voce P E G
  // Numero Impegno:  - Input
  // Anno Impegno:  - Input
  // Esercizio:  - Input
  // **********************************************************************
  public int SettaVocePEG (IDVariant NumeroImpegno, IDVariant AnnoImpegno, IDVariant Esercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Setta Voce P E G Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_IMP as ESEIMANNOIMP, ");
      SQL.append("  A.NUMERO_IMP as ESEIMNUMEIMP, ");
      SQL.append("  A.CAPITOLO as ESEIMPCAPITO, ");
      SQL.append("  A.ARTICOLO as ESEIMPARTICO ");
      SQL.append("from ");
      SQL.append("  ESEIMP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(AnnoImpegno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ANNOIMP = QV.Get("ESEIMANNOIMP", IDVariant.INTEGER) ;
        v_NUMEROIMP = QV.Get("ESEIMNUMEIMP", IDVariant.DECIMAL) ;
        CAPITOLO = QV.Get("ESEIMPCAPITO", IDVariant.DECIMAL) ;
        ARTICOLO = QV.Get("ESEIMPARTICO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_ANNOIMP.equals(AnnoImpegno, true) && v_NUMEROIMP.equals(NumeroImpegno, true))
      {
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.  ", IDVariant.STRING));
        v_CAPITOLOART = IDL.Add(IDL.Add(IDL.Add(v_CAPITOLOART, IDL.ToString(CAPITOLO)), (new IDVariant(" / "))), IDL.ToString(ARTICOLO));
        PAN_RETTIMPDIMAN.set_Header(Glb.OBJ_GROUP,GRP_RETTIMPDIMAN_IMPEGNO,v_CAPITOLOART.stringValue()); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Impegno di Spesa non previsto in Bilancio!", IDVariant.STRING));
        IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
        v_CAPITOLOART = (new IDVariant("Capitolo/Art.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0, (new IDVariant()));
        CAPITOLO = (new IDVariant());
        ARTICOLO = (new IDVariant());
        PAN_RETTIMPDIMAN.set_Header(Glb.OBJ_GROUP,GRP_RETTIMPDIMAN_IMPEGNO,v_CAPITOLOART.stringValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "SettaVocePEG", _e);
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
    IDVariant v_ESISTEMANDAT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0)))
      {
        IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
        v_ERRORE = (new IDVariant("Estremi elaborazione incompleti!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRORE); 
        return 0;
      }
      if (ControlloEsistenzaSubImpegni(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, 0), v_ESISTEMANDAT).equals((new IDVariant(0)), true))
      {
        if (v_ESISTEMANDAT.booleanValue())
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Sui mandati sono presenti liquidazioni di sub-impegno: l'elaborazione non può essere eseguita!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
        else
        {
          IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);
          if (RilevantiControlloEco(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARAANNOIMPE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMEIMPE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Attenzione: sono presenti Mandati senza imputazione economica e il nuovo impegno non ha rilevanza economica. Le imputazioni economiche dovranno essere inserite manualmente sui Mandati.", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
          }
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.RETTIFICAMAN(IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARNUMMANDAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI147, IMDBDef14.PQSL_PARAMETRI147_PARANUMMANAL, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), CAPITOLO, ARTICOLO, IMDB.Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE, 0), IDL.ToString(MainFrm.PROGRESESSIO), v_ERRORE);
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
              v_TERMINAZIONE = (new IDVariant("Elaborazione terminata. Finanziamenti annullati sulle liquidazioni in quanto non previsti sul nuovo Impegno.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_TERMINAZIONE); 
            }
            else
            {
              IDVariant v_TERMINAZIONE = new IDVariant(0,IDVariant.STRING);
              v_TERMINAZIONE = (new IDVariant("Elaborazione terminata.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_TERMINAZIONE); 
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Esistenza Sub Impegni
  // Esercizio:  - Input
  // Mandati Dal:  - Input
  // Mandati Al:  - Input
  // Esistenza Mandati:  - Input/Output
  // **********************************************************************
  public IDVariant ControlloEsistenzaSubImpegni (IDVariant Esercizio, IDVariant MandatiDal, IDVariant MandatiAl, IDVariant EsistenzaMandati)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUM = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Esistenza Sub Impegni Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  1 as UNO ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  LIQ B ");
      SQL.append("where (B.ANNO_MAND = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.NUMERO_MAND BETWEEN " + IDL.CSql(MandatiDal, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(MandatiAl, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (NOT ((B.ANNO_SUBIMP IS NULL))) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUM = QV.Get("UNO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUM.equals((new IDVariant(1)), true))
      {
        EsistenzaMandati.set((new IDVariant(-1)));
      }
      else
      {
        EsistenzaMandati.set((new IDVariant(0)));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "ControlloEsistenzaSubImpegni", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Rilevanti Controllo Eco
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Numero Mand Dal:  - Input
  // Numero Mand Al:  - Input
  // **********************************************************************
  public IDVariant RilevantiControlloEco (IDVariant AnnoImp, IDVariant NumeroImp, IDVariant NumeroMandDal, IDVariant NumeroMandAl)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RILEVAECOIMP = new IDVariant(0,IDVariant.STRING);
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
      SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RILEVAECOIMP = QV.Get("IMPRILEVAECO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_RILEVAECOIMP,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (LPAD(TO_CHAR ( A.ANNO_IMP ), 4, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_IMP ), 5, SUBSTR(' ', 1, 1)) IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  LPAD(TO_CHAR ( B.ANNO_IMP ), 4, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( B.NUMERO_IMP ), 5, SUBSTR(' ', 1, 1)) ");
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
          v_RILEVAECOLIQ = QV.Get("IMPRILEVAECO", IDVariant.STRING) ;
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
      MainFrm.ErrObj.ProcError ("RettificaImpegnoDiMandato", "RilevantiControlloEco", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIMPDIMAN_PARAMETRI147() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI147_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI151, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI151, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI147_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI147_RS, 0, IMDBDef5.TBL_PARAMETRI151, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI147_RS, 0, 0, IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARNUMMANDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI147_RS, 1, 0, IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARANUMMANAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI147_RS, 2, 0, IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI147_RS, 3, 0, IMDBDef5.TBL_PARAMETRI151, IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI151, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI151, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI151, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI147_RS, 0);
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
  private void PAN_RETTIMPDIMAN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIMPDIMAN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RETTIMPDIMAN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RETTIMPDIMAN, Cancel);
    // Stub
  }

  private void PAN_RETTIMPDIMAN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETTIMPDIMAN_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_RETTIMPDIMAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImpegnoRIM();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIMPDIMAN_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_RETTIMPDIMAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIMPDIMAN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RETTIMPDIMAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETTIMPDIMAN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RETTIMPDIMAN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIMPDIMAN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETTIMPDIMAN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETTIMPDIMAN_Init()
  {

    PAN_RETTIMPDIMAN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIMPDIMAN.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, "CBDF9741-C4BB-4F82-8231-82EC1F04B37A");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, "Mandati");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, MyGlb.PANEL_FORM, 12, 15, 260, 57, 0, 0);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, 0, 46);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, 1, 13);
    PAN_RETTIMPDIMAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, 0, 4);
    PAN_RETTIMPDIMAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, 1, 4);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, "0267FBF0-B5D7-444C-9EC4-D7957BFC5D8F");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, "Impegno");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, MyGlb.PANEL_FORM, 12, 88, 260, 40, 0, 0);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, 0, 51);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, 1, 13);
    PAN_RETTIMPDIMAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, 0, 4);
    PAN_RETTIMPDIMAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, 1, 1);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_GROUP, GRP_RETTIMPDIMAN_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RETTIMPDIMAN.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, "81E2A9E7-FE86-450D-9EF3-56098B62BC82");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, "Dal");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, "33F8A036-6C56-4C53-BF4F-1DC612EDDF71");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, "Al");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, "D937D057-5316-46FD-9425-D5897F25119A");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, "A36A91F7-1D77-4947-8C4C-4719C6F3323D");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, "Nuovo Impegno");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, "F85566F2-BF25-43AC-B5DB-86763E416971");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, "Anno Impegno");
    PAN_RETTIMPDIMAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, "76351DEF-F55D-4E92-8C59-FFDF749F6D01");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIMPDIMAN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, "EA0CA058-FFE5-4C33-B1ED-5D3724FAAA30");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIMPDIMAN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, 0, "info.gif", false);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, "F81EBB3E-C2B9-4EBC-A852-25C4EB51BF5C");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, "/");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, "52F6CF47-0E45-4695-8A51-EB55EF35A17E");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, "");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.VIS_SFONEBORDTRA);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RETTIMPDIMAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, "5BA9C1AC-8935-4867-8F79-C6CD90191A40");
    PAN_RETTIMPDIMAN.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, "Elabora");
    PAN_RETTIMPDIMAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RETTIMPDIMAN.SetImage(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, 0, "button1.gif", false);
    PAN_RETTIMPDIMAN.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RETTIMPDIMAN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_LIST, 108);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_FORM, 16, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_FORM, 84);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_DAL, -1, GRP_RETTIMPDIMAN_MANDATI);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_DAL, PPQRY_PARAMETRI147, "A.PARNUMMANDAL", "PARNUMMANDAL", 1, 5, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_LIST, 104);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_LIST, "Al");
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_FORM, 164, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_FORM, 20);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_AL, MyGlb.PANEL_FORM, "Al");
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_AL, -1, GRP_RETTIMPDIMAN_MANDATI);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_AL, PPQRY_PARAMETRI147, "A.PARANUMMANAL", "PARANUMMANAL", 1, 5, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_LIST, 244, 52, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_FORM, 256, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABEVUOTMAND, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_LABEVUOTMAND, -1, GRP_RETTIMPDIMAN_MANDATI);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_LABEVUOTMAND, -1, "", "LABEVUOTMAND", 0, 0, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_LIST, "N. Im.");
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 16, 92, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 100);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_NUOVOIMPEGNO, MyGlb.PANEL_FORM, "Nuovo Impegno");
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_NUOVOIMPEGNO, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_NUOVOIMPEGNO, PPQRY_PARAMETRI147, "A.PARANUMEIMPE", "PARANUMEIMPE", 1, 5, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_LIST, "A. Im.");
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 188, 92, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Anno Impegno");
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_ANNOIMPEGNO, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_ANNOIMPEGNO, PPQRY_PARAMETRI147, "A.PARAANNOIMPE", "PARAANNOIMPE", 1, 5, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 244, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 236, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_SCELTAIMPEGN, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_LIST, 264, 132, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_FORM, 252, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_INFOIMPEGNO, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_LIST, 144, 128, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_FORM, 168, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_BARRA, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_LIST, 252, 60, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_FORM, 260, 116, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_LABVUOVOCPEG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_LABVUOVOCPEG, -1, GRP_RETTIMPDIMAN_IMPEGNO);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_LABVUOVOCPEG, -1, "", "LABVUOVOCPEG", 0, 0, 0, -13997);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIMPDIMAN.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_FORM, 192, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIMPDIMAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIMPDIMAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIMPDIMAN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIMPDIMAN.SetFieldPage(PFL_RETTIMPDIMAN_ELABORA, -1, -1);
    PAN_RETTIMPDIMAN.SetFieldPanel(PFL_RETTIMPDIMAN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_RETTIMPDIMAN_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIMPDIMAN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTIMPDIMAN.SetIMDB(IMDB, "PQRY_PARAMETRI147", true);
    PAN_RETTIMPDIMAN.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_RETTIMPDIMAN.SetQueryIMDB(PPQRY_PARAMETRI147, IMDBDef14.PQRY_PARAMETRI147_RS, IMDBDef5.TBL_PARAMETRI151);
    JustLoaded = true;
    PAN_RETTIMPDIMAN.SetFieldPrimaryIndex(PFL_RETTIMPDIMAN_DAL, IMDBDef5.FLD_PARAMETRI151_PARNUMMANDAL);
    PAN_RETTIMPDIMAN.SetFieldPrimaryIndex(PFL_RETTIMPDIMAN_AL, IMDBDef5.FLD_PARAMETRI151_PARANUMMANAL);
    PAN_RETTIMPDIMAN.SetFieldPrimaryIndex(PFL_RETTIMPDIMAN_NUOVOIMPEGNO, IMDBDef5.FLD_PARAMETRI151_PARANUMEIMPE);
    PAN_RETTIMPDIMAN.SetFieldPrimaryIndex(PFL_RETTIMPDIMAN_ANNOIMPEGNO, IMDBDef5.FLD_PARAMETRI151_PARAANNOIMPE);
    PAN_RETTIMPDIMAN.SetMasterTable(0, "PARAMETRI151");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIMPDIMAN.Status() == 2)
    {
      int oldListQBE = PAN_RETTIMPDIMAN.iUseListQBE;
      PAN_RETTIMPDIMAN.iUseListQBE = 0;
      PAN_RETTIMPDIMAN.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIMPDIMAN.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIMPDIMAN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETTIMPDIMAN) PAN_RETTIMPDIMAN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIMPDIMAN) PAN_RETTIMPDIMAN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTIMPDIMAN) PAN_RETTIMPDIMAN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIMPDIMAN) PAN_RETTIMPDIMAN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RETTIMPDIMAN) PAN_RETTIMPDIMAN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
