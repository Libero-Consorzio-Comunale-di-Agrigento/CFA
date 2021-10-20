// **********************************************
// Emissione Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_DATADOCUMENT = 0;

  private static int PFL_PARAM_TIPOREGIBOLL = 0;
  private static int PFL_PARAM_TIPOREGISTRO = 1;
  private static int PFL_PARAM_TIPOBOLLATO = 2;
  private static int PFL_PARAM_DAL = 3;
  private static int PFL_PARAM_AL = 4;
  private static int PFL_PARAM_DEBITORE = 5;
  private static int PFL_PARAM_CODICE = 6;
  private static int PFL_PARAM_SCEGBENFBUTT = 7;

  private static int PPQRY_PARAM13 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T04 = 2;


  IDPanel PAN_PARAM;
  private static int PFL_IMPUTDAEMETT_IMPORTO = 0;
  private static int PFL_IMPUTDAEMETT_RAGIONSOCIAL = 1;
  private static int PFL_IMPUTDAEMETT_NUMERODOC = 2;
  private static int PFL_IMPUTDAEMETT_DDATADOC = 3;
  private static int PFL_IMPUTDAEMETT_DESCRIZIONE1 = 4;
  private static int PFL_IMPUTDAEMETT_DOCUMENTO = 5;
  private static int PFL_IMPUTDAEMETT_DESCRIZIONE = 6;
  private static int PFL_IMPUTDAEMETT_CAPITOLO1 = 7;
  private static int PFL_IMPUTDAEMETT_ARTICOLO = 8;
  private static int PFL_IMPUTDAEMETT_INFOPEG = 9;
  private static int PFL_IMPUTDAEMETT_CAPITOLO = 10;

  private static int PPQRY_CFA1 = 0;


  IDPanel PAN_IMPUTDAEMETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM35(IMDB);
    //
    //
    Init_PQRY_PARAM13(IMDB);
    Init_PQRY_PARAM13_RS(IMDB);
    Init_PQRY_CFA1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM35(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM35, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM35, "TBL_PARAM35");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAREGIBOLL, "PARAREGIBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARATIPOREGI, "PARATIPOREGI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARATIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARATIPOBOLL, "PARATIPOBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARATIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM35,IMDBDef2.FLD_PARAM35_PARAMCODICE,2,15,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM35, 0);
  }

  private static void Init_PQRY_PARAM13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM13, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM13, "PQRY_PARAM13");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAREGIBOLL, "PARAREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARATIPOREGI, "PARATIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARATIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARATIPOBOLL, "PARATIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARATIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13,IMDBDef9.PQSL_PARAM13_PARAMCODICE,2,15,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM13, 0);
  }

  private static void Init_PQRY_PARAM13_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM13_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM13_RS, "PQRY_PARAM13_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAREGIBOLL, "PARAREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARATIPOREGI, "PARATIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARATIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARATIPOBOLL, "PARATIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARATIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM13_RS,IMDBDef9.PQSL_PARAM13_PARAMCODICE,2,15,0);
  }

  private static void Init_PQRY_CFA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CFA1, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_CFA1, "PQRY_CFA1");
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFBERASOESES, "CFBERASOESES");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFAT03DESCRI, "CFAT03DESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFAT03DESCRI,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFAINFOPEG, "CFAINFOPEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_CFAINFOPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA1,IMDBDef9.PQSL_CFA1_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_CFA1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneAccertamenti()
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
    FormIdx = MyGlb.FRM_EMISSIACCERT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1BFB37A6-5BCD-425B-933B-F4B095E6FB8D";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1056;
    DesignHeight = 562;
    set_Caption(new IDVariant("Emissione Accertamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1056;
    Frames[1].Height = 536;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.201493;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1056;
    Frames[2].Height = 108;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 108;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1056-MyGlb.PAN_OFFS_X, 108-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FD520E8C-444F-403D-96B4-12A90E2CFAAE");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 820, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1056;
    Frames[3].Height = 428;
    Frames[3].Caption = "Imputazioni Da Emettere";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    PAN_IMPUTDAEMETT = new IDPanel(w, this, 3, "PAN_IMPUTDAEMETT");
    Frames[3].Content = PAN_IMPUTDAEMETT;
    PAN_IMPUTDAEMETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPUTDAEMETT.VS = MainFrm.VisualStyleList;
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1056-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7FF626D4-91E0-4F6D-9170-9BFA3DC76B6A");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 812, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPUTDAEMETT.InitStatus = 1;
    PAN_IMPUTDAEMETT_Init();
    PAN_IMPUTDAEMETT_InitFields();
    PAN_IMPUTDAEMETT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIU9+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI26+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIU9+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIACCERT+BaseCmdLinIdx)
      {
        CmdEmissioneAccertamenti();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM35, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSIACCERT_PARAM13();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_IMPUTDAEMETT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCEGBENFBUTT) {
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
    return (obj instanceof EmissioneAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneAccertamenti.class.getName() : (Glb.ClassWithPackage(EmissioneAccertamenti.class) ? EmissioneAccertamenti.class.getName().substring(EmissioneAccertamenti.class.getPackage().getName().length() + 1) : EmissioneAccertamenti.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAREGIBOLL, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_IMPUTDAEMETT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMCODICE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMCODICE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMCODICE, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMCODICE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "EndModalEvent", _e);
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
      PAN_PARAM.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAREGIBOLL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOREGI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOBOLL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMCODICE, 0, new IDVariant());
  }

  // **********************************************************************
  // Param Tipo Registro Bollato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_TIPOREGIBOLL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Tipo Registro Bollato Validate Event Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAREGIBOLL, 0),(new IDVariant("-1"))).compareTo((new IDVariant("-1")), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOREGI, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAREGIBOLL, 0), (new IDVariant(0)), (new IDVariant(1)))));
        IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOBOLL, 0, IDL.ToInteger(IDL.Trim(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAREGIBOLL, 0), (new IDVariant(2)), (new IDVariant(2))), true, true)));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOREGI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOBOLL, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ParamTipoRegistroBollatoValidateEvent", _e);
    }
  }

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
      PAN_IMPUTDAEMETT.Freezed = (new IDVariant(0)).booleanValue();
      PAN_PARAM.UpdatePanel(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ParamOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni Da Emettere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP = (new IDVariant("Info Voce P.e.g.", IDVariant.STRING));
      MainFrm.DynamicProperties(PAN_IMPUTDAEMETT);
      // 
      // Imputazioni Da Emettere On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_IMPUTDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPUTDAEMETT_RAGIONSOCIAL,IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_CFBERASOESES, 0).stringValue()); 
      PAN_IMPUTDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPUTDAEMETT_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_DESCRIZIONE, 0).stringValue()); 
      PAN_IMPUTDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPUTDAEMETT_DESCRIZIONE1,IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_CFAT03DESCRI, 0).stringValue()); 
      PAN_IMPUTDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPUTDAEMETT_INFOPEG,v_TOOLTIP.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ImputazioniDaEmettereOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni Da Emettere On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni Da Emettere On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_IMPUTDAEMETT.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI41+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI41+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ImputazioniDaEmettereOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Imputazioni Da Emettere On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Imputazioni Da Emettere On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAM_DEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DEBITORE))), IDL.Today(), (new IDVariant("DOC")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ImputazioniDaEmettereOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Scegli Benficiario Button
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ScegliBenficiarioButton ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Benficiario Button Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "ScegliBenficiarioButton", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef9.PQRY_CFA1, IMDBDef9.PQSL_CFA1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "InfoPeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Emissione Accertamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdEmissioneAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Cmd Emissione Accertamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOREGI, 0, IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARATIPOREGI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOBOLL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARATIPOBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDAL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMDAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMAL, 0, IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMAL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARACODIDEBI, 0, IMDB.Value(IMDBDef9.PQRY_PARAM13, IMDBDef9.PQSL_PARAM13_PARAMCODICE, 0));
      CMDEMISSACCE_CFADELETROWS();
      C2 = PAN_IMPUTDAEMETT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IMPUTDAEMETT.GotoFirst();
      while (!PAN_IMPUTDAEMETT.RSEOF())
      {
        CMDEMISSACCE_CFAINSERVALU(C2.Get("PROGRESSIVO"));
        PAN_IMPUTDAEMETT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      MainFrm.Show(MyGlb.FRM_EMISSACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAccertamenti", "CmdEmissioneAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CFA: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void CMDEMISSACCE_CFADELETROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_CFA);
  }

  // **********************************************************************
  // CFA: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void CMDEMISSACCE_CFAINSERVALU(IDVariant C2_PROGRESSIVO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_CFA, 0);
    IMDB.set_Value(IMDBDef2.TBL_CFA, IMDBDef2.FLD_CFA_ROWNAMEPROGR, 0, C2_PROGRESSIVO);
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSIACCERT_PARAM13() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM13_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM35, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM35, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM13_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM13_RS, 0, IMDBDef2.TBL_PARAM35, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 0, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAREGIBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 1, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOREGI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 2, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARATIPOBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 3, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 4, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM13_RS, 5, 0, IMDBDef2.TBL_PARAM35, IMDBDef2.FLD_PARAM35_PARAMCODICE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM35, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM35, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM35, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM13_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAM_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliBenficiarioButton();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_TIPOREGIBOLL)
      {
        PFL_PARAM_TIPOREGIBOLL_ValidateCell(Cancel);
      }
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPUTDAEMETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPUTDAEMETT, Cancel);
    // Stub
  }

  private void PAN_IMPUTDAEMETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPUTDAEMETT_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_IMPUTDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPUTDAEMETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPUTDAEMETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPUTDAEMETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "B51FEE31-1FF6-4F5B-AE6E-0D4EF16184B8");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "Data Documenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.PANEL_LIST, 288, -9999, 208, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.PANEL_FORM, 688, 7, 120, 73, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0, 91);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "671605EA-7C1C-46D9-AFC2-60A4B915061A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.VIS_NORFIECFHELE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "01FCE434-0B5B-42B5-9890-ACB0EB6F7CCE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "Tipo Registro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "AC7FDDDE-198E-4A95-B38C-E2CA368D6F89");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "Tipo Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "68506E16-B14B-4F23-A487-9C73D5AC91BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "Dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "91958226-F59B-4584-B379-E5D91A00AEF5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "Al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "A6E5641C-D557-4907-803A-6569C37D2D9E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, "9E273669-93DF-4593-B336-D574E3D5D015");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, "Codice");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "BF085C09-17FF-44F5-A474-B217C218871B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 24, 8, 208, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGIBOLL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGIBOLL, PPQRY_PARAM13, "A.PARAREGIBOLL", "PARAREGIBOLL", 5, 50, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 208, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 412, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGISTRO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGISTRO, PPQRY_PARAM13, "A.PARATIPOREGI", "PARATIPOREGI", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 248, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 412, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOBOLLATO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOBOLLATO, PPQRY_PARAM13, "A.PARATIPOBOLL", "PARATIPOBOLL", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 692, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DAL, -1, GRP_PARAM_DATADOCUMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DAL, PPQRY_PARAM13, "A.PARAMDAL", "PARAMDAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 392, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 700, 56, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL, -1, GRP_PARAM_DATADOCUMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL, PPQRY_PARAM13, "A.PARAMAL", "PARAMAL", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 232, 32, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEBITORE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_FORM, 568, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_FORM, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICE, MyGlb.PANEL_FORM, "Cod.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CODICE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CODICE, PPQRY_PARAM13, "A.PARAMCODICE", "PARAMCODICE", 2, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 632, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCEGBENFBUTT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARAMCODICE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAM.SetQueryLKE(PPQRY_BEN, PFL_PARAM_CODICE, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) = ~~PARAREGIBOLL~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5 OR A.TIPO_REGISTRO = 6) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAREGIBOLL~~ = '-1') ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 0, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5 OR A.TIPO_REGISTRO = 6) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 1, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM13", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM13, IMDBDef9.PQRY_PARAM13_RS, IMDBDef2.TBL_PARAM35);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGIBOLL, IMDBDef2.FLD_PARAM35_PARAREGIBOLL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGISTRO, IMDBDef2.FLD_PARAM35_PARATIPOREGI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOBOLLATO, IMDBDef2.FLD_PARAM35_PARATIPOBOLL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DAL, IMDBDef2.FLD_PARAM35_PARAMDAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL, IMDBDef2.FLD_PARAM35_PARAMAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CODICE, IMDBDef2.FLD_PARAM35_PARAMCODICE);
    PAN_PARAM.SetMasterTable(0, "PARAM35");
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

  private void PAN_IMPUTDAEMETT_Init()
  {

    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "448E9893-0D3E-4106-89D9-63E5B3D66EAF");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "Importo");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "CC63D2DA-FBA1-4E43-866A-0ABDA072891A");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "Ragione Sociale");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "43AFF0A7-12D8-41F2-8450-9A5E14D820FA");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "NUMERO DOC");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "785B57AF-06C2-4524-9BC0-BA48D14F234F");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "D DATA DOC");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "2DCCBB76-ACB5-4A87-A6B5-F7FB0481D2E0");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "DESCRIZIONE");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, "DE084B27-F675-4167-8080-C706D1A4298A");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, "Documento");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "882C419A-6F4D-4923-8FB7-320716B030C7");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "Descrizione");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "E8FC1BD5-92A3-4847-A5D4-3430568D3322");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "CAPITOLO");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "FE2286E5-EB32-466A-9C16-572C8107562E");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "ARTICOLO");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, "4B845A6A-DD27-4A32-8F6A-D5E20E71E0B0");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, "Info Peg");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, "Info");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, "9223B3E6-0580-4421-995C-2210B161EC1B");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, "Capitolo");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_IMPUTDAEMETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 188, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_IMPORTO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_IMPORTO, PPQRY_CFA1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 88, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 100);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_RAGIONSOCIAL, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_RAGIONSOCIAL, PPQRY_CFA1, "C.RAGIONE_SOCIALE_ESTESA", "CFBERASOESES", 5, 60, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 236, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 4, 316, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_NUMERODOC, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_NUMERODOC, PPQRY_CFA1, "B.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 300, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 4, 340, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DDATADOC, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DDATADOC, PPQRY_CFA1, "B.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 368, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 364, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, "DESCR.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DESCRIZIONE1, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldUnbound(PFL_IMPUTDAEMETT_DESCRIZIONE1, true);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DESCRIZIONE1, PPQRY_CFA1, "D.DESCRIZIONE", "CFAT03DESCRI", 5, 40, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 236, 0, 408, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 300, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DOCUMENTO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DOCUMENTO, -1, "", "DOCUMENTO", 0, 0, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 496, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 388, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DESCRIZIONE, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DESCRIZIONE, PPQRY_CFA1, "E.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 644, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 4, 436, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_CAPITOLO1, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_CAPITOLO1, PPQRY_CFA1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 760, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 4, 460, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_ARTICOLO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_ARTICOLO, PPQRY_CFA1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_LIST, 788, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_LIST, 52);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_LIST, "In. Pg.");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_FORM, 4, 484, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_FORM, 52);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_INFOPEG, MyGlb.PANEL_FORM, "Info Peg");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_INFOPEG, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldUnbound(PFL_IMPUTDAEMETT_INFOPEG, true);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_INFOPEG, PPQRY_CFA1, "'I'", "CFAINFOPEG", 5, 1, 0, -13997);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_IMPUTDAEMETT.SetValueListItem(PFL_IMPUTDAEMETT_INFOPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 644, 0, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 644, 0, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_CAPITOLO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_CAPITOLO, -1, "", "CAPITOLO", 0, 0, 0, -13997);
  }

  private void PAN_IMPUTDAEMETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPUTDAEMETT.SetIMDB(IMDB, "PQRY_CFA1", true);
    PAN_IMPUTDAEMETT.set_SetString(MyGlb.MASTER_ROWNAME, "CFA");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as CFBERASOESES, ");
    SQL.append("  B.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  B.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  D.DESCRIZIONE as CFAT03DESCRI, ");
    SQL.append("  E.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  'I' as CFAINFOPEG, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFA A, ");
    SQL.append("  FAT B, ");
    SQL.append("  BEN C, ");
    SQL.append("  T03 D, ");
    SQL.append("  T04 E ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = B.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = B.NUMERO_PROG) ");
    SQL.append("and   (B.CODICE = C.CODICE(+)) ");
    SQL.append("and   (B.CODICE_DOC = D.CODICE(+)) ");
    SQL.append("and   (B.STORNO = D.STORNO(+)) ");
    SQL.append("and   (GESTIONE_IVA.FAT_PRIMO_TIPO_REGISTRO(B.ANNO_PROG,B.NUMERO_PROG) = E.TIPO_REGISTRO) ");
    SQL.append("and   (GESTIONE_IVA.FAT_PRIMO_TIPO_BOLLATO(B.ANNO_PROG,B.NUMERO_PROG) = E.TIPO_BOLLATO) ");
    SQL.append("and   ((A.ANNO_ACC IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   ((A.FLAG_LIQUIDATO IS NULL)) ");
    SQL.append("and   ((~~PQRY_PARAM13.PARAMCODICE~~ IS NULL) OR B.CODICE = ~~PQRY_PARAM13.PARAMCODICE~~) ");
    SQL.append("and   (B.CODICE_DOC = 3 OR B.CODICE_DOC = 6 OR B.CODICE_DOC = 8) ");
    SQL.append("and   (B.D_DATA_DOC >= ~~PQRY_PARAM13.PARAMDAL~~) ");
    SQL.append("and   (B.D_DATA_DOC <= ~~PQRY_PARAM13.PARAMAL~~) ");
    SQL.append("and   ((~~TBL_PARAM35.PARATIPOREGI~~ IS NULL) OR E.TIPO_REGISTRO = ~~TBL_PARAM35.PARATIPOREGI~~) ");
    SQL.append("and   ((~~TBL_PARAM35.PARATIPOBOLL~~ IS NULL) OR E.TIPO_BOLLATO = ~~TBL_PARAM35.PARATIPOBOLL~~) ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.ANNO_DOC, ");
    SQL.append("  B.NUMERO_DOC ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA1, 5, SQL, -1, "");
    PAN_IMPUTDAEMETT.SetQueryDB(PPQRY_CFA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTDAEMETT.SetMasterTable(0, "CFA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPUTDAEMETT.Status() == 2)
    {
      int oldListQBE = PAN_IMPUTDAEMETT.iUseListQBE;
      PAN_IMPUTDAEMETT.iUseListQBE = 0;
      PAN_IMPUTDAEMETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPUTDAEMETT.PanelCommand(Glb.PCM_FIND);
      PAN_IMPUTDAEMETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
