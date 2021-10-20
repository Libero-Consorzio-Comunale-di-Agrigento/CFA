// **********************************************
// Parametri Obiettivo Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriObiettivoPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESERRIF_ESEPARDEFPRE = 0;
  private static int PFL_PARAMESERRIF_ESERCIZIO1 = 1;
  private static int PFL_PARAMESERRIF_ETICHEMODIFI = 2;

  private static int PPQRY_ESEFIN = 0;


  IDPanel PAN_PARAMESERRIF;
  private static int PFL_PARAMEOBIETT_ESERCIZIO = 0;
  private static int PFL_PARAMEOBIETT_PARAMETRO = 1;
  private static int PFL_PARAMEOBIETT_CODICESTAMPA = 2;
  private static int PFL_PARAMEOBIETT_DESCRIZIONE = 3;
  private static int PFL_PARAMEOBIETT_VALORE = 4;
  private static int PFL_PARAMEOBIETT_SOGLIA = 5;
  private static int PFL_PARAMEOBIETT_SEGNOPOSITIV = 6;
  private static int PFL_PARAMEOBIETT_POSITINEGATI = 7;

  private static int PPQRY_PARDEFPREVAL = 0;

  private static int PPQRY_PARAMDEFPREV = 1;


  IDPanel PAN_PARAMEOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMTRI1(IMDB);
    //
    //
    Init_PQRY_ESEFIN(IMDB);
    Init_PQRY_PARDEFPREVAL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMTRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMTRI1, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMTRI1, "TBL_PARAMTRI1");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMTRI1,IMDBDef3.FLD_PARAMTRI1_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMTRI1, 0);
  }

  private static void Init_PQRY_ESEFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_ESEFIN, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_ESEFIN, "PQRY_ESEFIN");
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN,IMDBDef11.PQSL_ESEFIN_RECESEPADEPR, "RECESEPADEPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN,IMDBDef11.PQSL_ESEFIN_RECESEPADEPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_ESEFIN,IMDBDef11.PQSL_ESEFIN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_ESEFIN,IMDBDef11.PQSL_ESEFIN_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_ESEFIN, 0);
  }

  private static void Init_PQRY_PARDEFPREVAL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARDEFPREVAL, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARDEFPREVAL, "PQRY_PARDEFPREVAL");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_PARAMETRO, "PARAMETRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_PARAMETRO,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_SEGNO_POSITIVITA, "SEGNO_POSITIVITA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_SEGNO_POSITIVITA,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_VALORE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_SOGLIA, "SOGLIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_SOGLIA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO, "POSITIVO_NEGATIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARDEFPREVAL,IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARDEFPREVAL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriObiettivoPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriObiettivoPrev()
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
    FormIdx = MyGlb.FRM_PARAOBIEPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7E552CA8-217F-4F55-B77E-85B87D99E8D4";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 920;
    DesignHeight = 382;
    set_Caption(new IDVariant("Parametri Obiettivi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 920;
    Frames[1].Height = 356;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.101124;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 920;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Esercizio Rif";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMESERRIF = new IDPanel(w, this, 2, "PAN_PARAMESERRIF");
    Frames[2].Content = PAN_PARAMESERRIF;
    PAN_PARAMESERRIF.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESERRIF.VS = MainFrm.VisualStyleList;
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESERRIF.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F064AE68-6123-42BA-9F2A-D4AD46DB632C");
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 192, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMESERRIF.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESERRIF.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESERRIF.InitStatus = 2;
    PAN_PARAMESERRIF_Init();
    PAN_PARAMESERRIF_InitFields();
    PAN_PARAMESERRIF_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 920;
    Frames[3].Height = 320;
    Frames[3].Caption = "Parametri Obiettivi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 320;
    PAN_PARAMEOBIETT = new IDPanel(w, this, 3, "PAN_PARAMEOBIETT");
    Frames[3].Content = PAN_PARAMEOBIETT;
    PAN_PARAMEOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEOBIETT.VS = MainFrm.VisualStyleList;
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "79FDC990-C691-4FB5-86AE-93B5656B2F5C");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 860, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEOBIETT.InitStatus = 2;
    PAN_PARAMEOBIETT_Init();
    PAN_PARAMEOBIETT_InitFields();
    PAN_PARAMEOBIETT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA21+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG197+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUFUNZAGG2+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG197+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RICALCVALOR1+BaseCmdLinIdx)
      {
        RicalcolaValori();
        break fine;
      }
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
      PAN_PARAMESERRIF.UpdatePanel(MainFrm);
      PAN_PARAMEOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriObiettivoPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriObiettivoPrev.class.getName() : (Glb.ClassWithPackage(ParametriObiettivoPrev.class) ? ParametriObiettivoPrev.class.getName().substring(ParametriObiettivoPrev.class.getPackage().getName().length() + 1) : ParametriObiettivoPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Esercizio Rif After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_PARAMESERRIF_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Esercizio Rif After Find Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKBILPREVPIANOIND(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_ESEFIN, IMDBDef11.PQSL_ESEFIN_RECESEPADEPR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant()));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "ParametriEsercizioRifAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametri Obiettivi On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEOBIETT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Obiettivi On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMEOBIETT_VALORE)), true) || Column.equals((new IDVariant(PFL_PARAMEOBIETT_SOGLIA)), true) || Column.equals((new IDVariant(PFL_PARAMEOBIETT_SEGNOPOSITIV)), true)) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_SEGNO_POSITIVITA, 0).equals((new IDVariant(">")), true))
        {
          if (IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_VALORE, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_SOGLIA, 0), true)>0)
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO, 0, (new IDVariant("NO")));
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_VALORE, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_SOGLIA, 0), true)<0)
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO, 0, (new IDVariant("NO")));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "ParametriObiettiviOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri Obiettivi On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEOBIETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMEOBIETT);
      // 
      // Parametri Obiettivi On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PARAMEOBIETT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMEOBIETT_DESCRIZIONE,(new IDVariant(PAN_PARAMEOBIETT.FieldText(PFL_PARAMEOBIETT_DESCRIZIONE))).stringValue()); 
      if (IMDB.Value(IMDBDef11.PQRY_PARDEFPREVAL, IMDBDef11.PQSL_PARDEFPREVAL_PARAMETRO, 0).equals((new IDVariant("P99")), true))
      {
        PAN_PARAMEOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMEOBIETT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "ParametriObiettiviOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Obiettivi On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_PARAMEOBIETT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Obiettivi On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_PARAMEOBIETT.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR6+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_TOOLBAR6+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "ParametriObiettiviOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOTESTAM, 0), (new IDVariant()));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARSTANUDIPA, 0)));
      MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOMEFILE, 0), (new IDVariant("pdf")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ricalcola Valori
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RicalcolaValori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricalcola Valori Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Verranno ricalcolati i valori degli indicatori presenti in elenco con esercizio di riferimento "));
      IDVariant v_CONTINUARE = new IDVariant(0,IDVariant.STRING);
      v_CONTINUARE = (new IDVariant(". Continuare?"));
      if (MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_ESEFIN, IMDBDef11.PQSL_ESEFIN_RECESEPADEPR, 0))), v_CONTINUARE)))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.WORKBILPREVPIANOIND(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_ESEFIN, IMDBDef11.PQSL_ESEFIN_RECESEPADEPR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant("SI")));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          PAN_PARAMEOBIETT.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "RicalcolaValori", _e);
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
      PAN_PARAMEOBIETT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriObiettivoPrev", "Load", _e);
    }
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
  private void PAN_PARAMESERRIF_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESERRIF, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESERRIF_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESERRIF, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESERRIF_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMESERRIF);
    // Stub
  }

  private void PAN_PARAMESERRIF_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMESERRIF_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESERRIF_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESERRIF_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEOBIETT, Cancel);
    // Stub
  }

  private void PAN_PARAMEOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMEOBIETT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESERRIF_Init()
  {

    PAN_PARAMESERRIF.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESERRIF.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESERRIF.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMESERRIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, "B78B0941-2196-4BE1-8C86-365FD54EB1BB");
    PAN_PARAMESERRIF.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, "Esercizio Rif. per calcolo da Indicatori");
    PAN_PARAMESERRIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, "");
    PAN_PARAMESERRIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESERRIF.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESERRIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, "85BE6D4A-3D6A-4B3B-9470-35D16897D3CC");
    PAN_PARAMESERRIF.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, "ESERCIZIO");
    PAN_PARAMESERRIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, "");
    PAN_PARAMESERRIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMESERRIF.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMESERRIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, "A81F0BF6-E33E-4DC3-9B48-70F822A49942");
    PAN_PARAMESERRIF.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, "(Modificabile su Parametri Bilancio Previsione)");
    PAN_PARAMESERRIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMESERRIF.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMESERRIF_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_LIST, 192);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESERRIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_LIST, "Esercizio Rif. per calcolo da Indicatori");
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_FORM, 4, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_FORM, 228);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESERRIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESEPARDEFPRE, MyGlb.PANEL_FORM, "Esercizio Rif. per calcolo da Indicatori");
    PAN_PARAMESERRIF.SetFieldPage(PFL_PARAMESERRIF_ESEPARDEFPRE, -1, -1);
    PAN_PARAMESERRIF.SetFieldUnbound(PFL_PARAMESERRIF_ESEPARDEFPRE, true);
    PAN_PARAMESERRIF.SetFieldPanel(PFL_PARAMESERRIF_ESEPARDEFPRE, PPQRY_ESEFIN, "NVL(A.ESERCIZIO_PARAMETRI_DEF_PREV, ~~TBL_DATISESSIONE.SESSIOESERCI~~)", "RECESEPADEPR", 1, 19, 0, -13997);
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESERRIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_FORM, 68);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESERRIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_PARAMESERRIF.SetFieldPage(PFL_PARAMESERRIF_ESERCIZIO1, -1, -1);
    PAN_PARAMESERRIF.SetFieldPanel(PFL_PARAMESERRIF_ESERCIZIO1, PPQRY_ESEFIN, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_LIST, 20, 32, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESERRIF.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_FORM, 292, 4, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESERRIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESERRIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESERRIF_ETICHEMODIFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESERRIF.SetFieldPage(PFL_PARAMESERRIF_ETICHEMODIFI, -1, -1);
    PAN_PARAMESERRIF.SetFieldPanel(PFL_PARAMESERRIF_ETICHEMODIFI, -1, "", "ETICHEMODIFI", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESERRIF_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESERRIF.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMESERRIF.SetIMDB(IMDB, "PQRY_ESEFIN", true);
    PAN_PARAMESERRIF.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.ESERCIZIO_PARAMETRI_DEF_PREV, ~~TBL_DATISESSIONE.SESSIOESERCI~~) as RECESEPADEPR, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMESERRIF.SetQuery(PPQRY_ESEFIN, 5, SQL, -1, "");
    PAN_PARAMESERRIF.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESERRIF.SetMasterTable(0, "ESEFIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESERRIF.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESERRIF.iUseListQBE;
      PAN_PARAMESERRIF.iUseListQBE = 0;
      PAN_PARAMESERRIF.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESERRIF.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESERRIF.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEOBIETT_Init()
  {

    PAN_PARAMEOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEOBIETT.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, "FA5ED40C-B0D3-46B0-93A1-D34DDD8F083F");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, "ESERCIZIO");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, "84050D1A-F94A-4C70-99FB-7CEFE931BF2C");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, "Parametro");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, "78A4F061-2CF7-4CDC-9E02-8DA6895D22CE");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, "Parametro");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, "1B96EE37-F998-48E2-B803-D3A16E3F7145");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, "Descrizione");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, "CC08DED5-41AA-4DF6-A35C-00D74F6BF5E0");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, "Valore");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, "E91557F9-965D-4880-BC3C-E78EC4BAD8C5");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, "Soglia");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, "BA5C637F-6310-4A92-8BB4-621FC8F65182");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, "Positività");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, "E4368AE6-D3D0-498B-94FB-9E554BBE5EDE");
    PAN_PARAMEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, "SI/NO");
    PAN_PARAMEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, "");
    PAN_PARAMEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMEOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_ESERCIZIO, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_ESERCIZIO, PPQRY_PARDEFPREVAL, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_LIST, "Parametro");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_FORM, 4, 28, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_PARAMETRO, MyGlb.PANEL_FORM, "Parametro");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_PARAMETRO, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_PARAMETRO, PPQRY_PARDEFPREVAL, "A.PARAMETRO", "PARAMETRO", 5, 10, 0, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_LIST, 224);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_LIST, "Parametro");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_FORM, 4, 172, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_FORM, 224);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_CODICESTAMPA, MyGlb.PANEL_FORM, "Parametro");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_CODICESTAMPA, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_CODICESTAMPA, PPQRY_PARAMDEFPREV, "A.CODICE_STAMPA", "PARDEFPRCOST", 5, 20, 0, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 84, 36, 408, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_DESCRIZIONE, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_DESCRIZIONE, PPQRY_PARDEFPREVAL, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_LIST, 492, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_LIST, 52);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_LIST, "Valore");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_VALORE, MyGlb.PANEL_FORM, "Valore");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_VALORE, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_VALORE, PPQRY_PARDEFPREVAL, "A.VALORE", "VALORE", 3, 14, 2, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_LIST, 576, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_LIST, "Soglia");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SOGLIA, MyGlb.PANEL_FORM, "Soglia");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_SOGLIA, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_SOGLIA, PPQRY_PARDEFPREVAL, "A.SOGLIA", "SOGLIA", 3, 14, 2, -13997);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_LIST, 660, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_LIST, 116);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_LIST, "Positività");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_SEGNOPOSITIV, MyGlb.PANEL_FORM, "Positività");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_SEGNOPOSITIV, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_SEGNOPOSITIV, PPQRY_PARDEFPREVAL, "A.SEGNO_POSITIVITA", "SEGNO_POSITIVITA", 5, 10, 0, -13997);
    PAN_PARAMEOBIETT.SetValueListItem(PFL_PARAMEOBIETT_SEGNOPOSITIV, (new IDVariant(">")), "Positivo se > soglia", "", "", -1);
    PAN_PARAMEOBIETT.SetValueListItem(PFL_PARAMEOBIETT_SEGNOPOSITIV, (new IDVariant("<")), "Positivo se < soglia", "", "", -1);
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_LIST, 780, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_LIST, 124);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_LIST, "SI/NO");
    PAN_PARAMEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOBIETT_POSITINEGATI, MyGlb.PANEL_FORM, "SI/NO");
    PAN_PARAMEOBIETT.SetFieldPage(PFL_PARAMEOBIETT_POSITINEGATI, -1, -1);
    PAN_PARAMEOBIETT.SetFieldPanel(PFL_PARAMEOBIETT_POSITINEGATI, PPQRY_PARDEFPREVAL, "A.POSITIVO_NEGATIVO", "POSITIVO_NEGATIVO", 5, 2, 0, -13997);
    PAN_PARAMEOBIETT.SetValueListItem(PFL_PARAMEOBIETT_POSITINEGATI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMEOBIETT.SetValueListItem(PFL_PARAMEOBIETT_POSITINEGATI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMEOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEOBIETT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE_STAMPA as PARDEFPRCOST ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_DEF_PREV A ");
    SQL.append("where (A.PARAMETRO = ~~PARAMETRO~~) ");
    SQL.append("and   (A.TIPO_ENTE = NVL(" + IDL.CSql(MainFrm.TIPOENTE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'C')) ");
    SQL.append("and   ((~~ESERCIZIO~~ BETWEEN A.ESERCIZIO_DA AND NVL(A.ESERCIZIO_A, 9999))) ");
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARAMDEFPREV, 0, SQL, -1, "");
    PAN_PARAMEOBIETT.SetQueryDB(PPQRY_PARAMDEFPREV, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEOBIETT.SetMasterTable(PPQRY_PARAMDEFPREV, "PARAMETRI_DEF_PREV");
    PAN_PARAMEOBIETT.SetIMDB(IMDB, "PQRY_PARDEFPREVAL", true);
    PAN_PARAMEOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "PARAMETRI DEF PREV VALORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PARAMETRO as PARAMETRO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SEGNO_POSITIVITA as SEGNO_POSITIVITA, ");
    SQL.append("  A.VALORE as VALORE, ");
    SQL.append("  A.SOGLIA as SOGLIA, ");
    SQL.append("  A.POSITIVO_NEGATIVO as POSITIVO_NEGATIVO ");
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAMETRI_DEF_PREV_VALORI A ");
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PARAMETRO ");
    PAN_PARAMEOBIETT.SetQuery(PPQRY_PARDEFPREVAL, 5, SQL, -1, "");
    PAN_PARAMEOBIETT.SetQueryDB(PPQRY_PARDEFPREVAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEOBIETT.SetMasterTable(0, "PARAMETRI_DEF_PREV_VALORI");
    PAN_PARAMEOBIETT.AddToSortList(PFL_PARAMEOBIETT_PARAMETRO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEOBIETT.iUseListQBE;
      PAN_PARAMEOBIETT.iUseListQBE = 0;
      PAN_PARAMEOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEOBIETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_DynamicProperties();
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMESERRIF) PAN_PARAMESERRIF_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEOBIETT) PAN_PARAMEOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
