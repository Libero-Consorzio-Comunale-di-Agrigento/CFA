// **********************************************
// Nuovi Pagamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class NuoviPagamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NUOVIPAGAMEN_BENEFICIARI1 = 0;
  private static int PFL_NUOVIPAGAMEN_IMPORTO = 1;
  private static int PFL_NUOVIPAGAMEN_PAGATO = 2;
  private static int PFL_NUOVIPAGAMEN_PAGAMENTO = 3;
  private static int PFL_NUOVIPAGAMEN_DATAPAGAMEOK = 4;
  private static int PFL_NUOVIPAGAMEN_NUMERODOC = 5;
  private static int PFL_NUOVIPAGAMEN_DDATADOC = 6;
  private static int PFL_NUOVIPAGAMEN_QUIETANZA = 7;
  private static int PFL_NUOVIPAGAMEN_DIVERSBENEFI = 8;
  private static int PFL_NUOVIPAGAMEN_ANNOLIQ = 9;
  private static int PFL_NUOVIPAGAMEN_NUMEROLIQ = 10;
  private static int PFL_NUOVIPAGAMEN_SEDEDEL = 11;
  private static int PFL_NUOVIPAGAMEN_NUMERODEL = 12;
  private static int PFL_NUOVIPAGAMEN_ANNODEL = 13;
  private static int PFL_NUOVIPAGAMEN_BENEFICIARIO = 14;
  private static int PFL_NUOVIPAGAMEN_ANNODOC = 15;
  private static int PFL_NUOVIPAGAMEN_NUMQUIETANZA = 16;
  private static int PFL_NUOVIPAGAMEN_DIVERSOBEN = 17;
  private static int PFL_NUOVIPAGAMEN_NUMQUIDIVBEN = 18;
  private static int PFL_NUOVIPAGAMEN_DESCRIZIONE2 = 19;
  private static int PFL_NUOVIPAGAMEN_CAUSALE = 20;
  private static int PFL_NUOVIPAGAMEN_DESCRIZIONE3 = 21;
  private static int PFL_NUOVIPAGAMEN_ANNOIMP = 22;
  private static int PFL_NUOVIPAGAMEN_NUMEROIMP = 23;
  private static int PFL_NUOVIPAGAMEN_ANNOSUBIMP = 24;
  private static int PFL_NUOVIPAGAMEN_NUMEROSUBIMP = 25;
  private static int PFL_NUOVIPAGAMEN_CAPITOLO = 26;
  private static int PFL_NUOVIPAGAMEN_ARTICOLO = 27;
  private static int PFL_NUOVIPAGAMEN_S = 28;
  private static int PFL_NUOVIPAGAMEN_RITENUTE = 29;
  private static int PFL_NUOVIPAGAMEN_NUMEROCONTAB = 30;
  private static int PFL_NUOVIPAGAMEN_DATACONTABIL = 31;
  private static int PFL_NUOVIPAGAMEN_DDATAREG = 32;
  private static int PFL_NUOVIPAGAMEN_PROGRESSTESO = 33;
  private static int PFL_NUOVIPAGAMEN_SOMMPAGALABE = 34;
  private static int PFL_NUOVIPAGAMEN_DATAPAGAM = 35;
  private static int PFL_NUOVIPAGAMEN_NUMEROPAGAM = 36;
  private static int PFL_NUOVIPAGAMEN_DOCUMENLABEL = 37;

  private static int PPQRY_LIQ12 = 0;


  IDPanel PAN_NUOVIPAGAMEN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALUES2(IMDB);
    //
    //
    Init_PQRY_LIQ12(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALUES2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_OLDVALUES2, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_OLDVALUES2, "TBL_OLDVALUES2");
    IMDB.set_FldCode(IMDBDef5.TBL_OLDVALUES2,IMDBDef5.FLD_OLDVALUES2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_OLDVALUES2,IMDBDef5.FLD_OLDVALUES2_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef5.TBL_OLDVALUES2, 0);
  }

  private static void Init_PQRY_LIQ12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ12, 36);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ12, "PQRY_LIQ12");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_IMPORTO_PAGAM, "IMPORTO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_IMPORTO_PAGAM,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DIVERSO_BEN, "DIVERSO_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DIVERSO_BEN,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECBERASOES2, "RECBERASOES2");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECBERASOES2,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUM_QUIETANZA_DIV_BEN, "NUM_QUIETANZA_DIV_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUM_QUIETANZA_DIV_BEN,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDDESCR2, "RECORDDESCR2");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDDESCR2,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDDESCR3, "RECORDDESCR3");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDDESCR3,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_S, "S");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_S,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDPAGAME, "RECORDPAGAME");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_RECORDPAGAME,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATA_PAGAM, "DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATA_PAGAM,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_PAGAM, "NUMERO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_NUMERO_PAGAM,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATAPAGAMEOK, "DATAPAGAMEOK");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ12,IMDBDef14.PQSL_LIQ12_DATAPAGAMEOK,6,0,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ12, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public NuoviPagamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public NuoviPagamenti()
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
    FormIdx = MyGlb.FRM_NUOVIPAGAMEN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "59F98C00-DEDB-4AD6-B930-FC196FB388D8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 410;
    set_Caption(new IDVariant("Nuovi Pagamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 384;
    Frames[1].Caption = "Nuovi Pagamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    PAN_NUOVIPAGAMEN = new IDPanel(w, this, 1, "PAN_NUOVIPAGAMEN");
    Frames[1].Content = PAN_NUOVIPAGAMEN;
    PAN_NUOVIPAGAMEN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUOVIPAGAMEN.VS = MainFrm.VisualStyleList;
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4A340AE0-8898-4375-B12C-B4D831FA5E46");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUOVIPAGAMEN.InitStatus = 2;
    PAN_NUOVIPAGAMEN_Init();
    PAN_NUOVIPAGAMEN_InitFields();
    PAN_NUOVIPAGAMEN_InitQueries();
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
      PAN_NUOVIPAGAMEN.UpdatePanel(MainFrm);
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
    return (obj instanceof NuoviPagamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? NuoviPagamenti.class.getName() : (Glb.ClassWithPackage(NuoviPagamenti.class) ? NuoviPagamenti.class.getName().substring(NuoviPagamenti.class.getPackage().getName().length() + 1) : NuoviPagamenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Nuovi Pagamenti On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Pagamenti On Updating Row Event Body
      // Procedure Body
      // 
      // 
      // gestione old values
      // 
      {
        if (IMDB.Value(IMDBDef5.TBL_OLDVALUES2, IMDBDef5.FLD_OLDVALUES2_IMPORTO, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0).compareTo((IDL.Sub(IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_IMPORTO, 0), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_IMPORTO_PAGAM, 0),(new IDVariant(0))))), true)>0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Pagamento superiore al residuo da pagare!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0, IMDB.Value(IMDBDef5.TBL_OLDVALUES2, IMDBDef5.FLD_OLDVALUES2_IMPORTO, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_OLDVALUES2, IMDBDef5.FLD_OLDVALUES2_IMPORTO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0));
          }
        }
        // 
        // gestione label somma
        // 
        {
          PAN_NUOVIPAGAMEN.set_FieldText(PFL_NUOVIPAGAMEN_SOMMPAGALABE, IDL.ToString(PAN_NUOVIPAGAMEN.GetFieldSum(PFL_NUOVIPAGAMEN_IMPORTO)).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "NuoviPagamentiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Pagamenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Pagamenti After Find Event Body
      // Procedure Body
      // 
      // 
      // gestione label somma
      // 
      {
        PAN_NUOVIPAGAMEN.set_FieldText(PFL_NUOVIPAGAMEN_SOMMPAGALABE, IDL.ToString(IDL.NullValue(PAN_NUOVIPAGAMEN.GetFieldSum(PFL_NUOVIPAGAMEN_IMPORTO),(new IDVariant(0)))).stringValue());
        if ((new IDVariant(PAN_NUOVIPAGAMEN.FieldText(PFL_NUOVIPAGAMEN_SOMMPAGALABE))).equals((new IDVariant("")), true))
        {
          PAN_NUOVIPAGAMEN.set_FieldText(PFL_NUOVIPAGAMEN_SOMMPAGALABE, IDL.ToString((new IDVariant(0))).stringValue());
        }
      }
      // 
      // gestione old values
      // 
      {
        IMDB.set_Value(IMDBDef5.TBL_OLDVALUES2, IMDBDef5.FLD_OLDVALUES2_IMPORTO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "NuoviPagamentiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Pagamenti On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovi Pagamenti On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_OLDVALUES2, IMDBDef5.FLD_OLDVALUES2_IMPORTO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ12, IMDBDef14.PQSL_LIQ12_RECORDPAGAME, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "NuoviPagamentiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Pagamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NUOVIPAGAMEN);
      // 
      // Nuovi Pagamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_NUOVIPAGAMEN.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIPAGAMEN_BENEFICIARI1,(new IDVariant(PAN_NUOVIPAGAMEN.FieldText(PFL_NUOVIPAGAMEN_BENEFICIARI1))).stringValue()); 
      PAN_NUOVIPAGAMEN.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIPAGAMEN_NUMERODOC,(new IDVariant(PAN_NUOVIPAGAMEN.FieldText(PFL_NUOVIPAGAMEN_NUMERODOC))).stringValue()); 
      PAN_NUOVIPAGAMEN.set_ToolTip(Glb.OBJ_FIELD,PFL_NUOVIPAGAMEN_DIVERSBENEFI,(new IDVariant(PAN_NUOVIPAGAMEN.FieldText(PFL_NUOVIPAGAMEN_DIVERSBENEFI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "NuoviPagamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovi Pagamenti On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_NUOVIPAGAMEN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Nuovi Pagamenti On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "NuoviPagamentiOnDatabaseErrorEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "EndModalEvent", _e);
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
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.booleanValue())
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_NUOVIPAGAMEN.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_NUOVIPAGAMEN.GotoFirst();
        while (!PAN_NUOVIPAGAMEN.RSEOF())
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (PAN_NUOVIPAGAMEN.IsRowSelected(I.intValue()))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into PAGAMENTI ");
              SQL.append("( ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  ANNO_MAND, ");
              SQL.append("  NUMERO_MAND, ");
              SQL.append("  ANNO_LIQ, ");
              SQL.append("  NUMERO_LIQ, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  D_DATA_PAGAM, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  DATA_PAGAM, ");
              SQL.append("  NUMERO_PAGAM ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  to_number(NULL), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("RECORDPAGAME"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("DATAPAGAMEOK"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  " + IDL.CSql(C3.Get("DATA_PAGAM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C3.Get("NUMERO_PAGAM"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              Cancel.set((new IDVariant(-1)));
              return;
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_NUOVIPAGAMEN.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        MainFrm.Cf4armDBObject.CommitTrans();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "UnloadEvent", _e);
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
      v_NOMECAPTION = (new IDVariant("Nuovi Pagamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      PAN_NUOVIPAGAMEN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_NUOVIPAGAMEN.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_NUOVIPAGAMEN.SetFieldValidation(PFL_NUOVIPAGAMEN_PAGAMENTO, (new IDVariant(-1)).booleanValue()); 
      PAN_NUOVIPAGAMEN.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuoviPagamenti", "LoadEvent", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NUOVIPAGAMEN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUOVIPAGAMEN, Cancel);
    // Stub
  }

  private void PAN_NUOVIPAGAMEN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NUOVIPAGAMEN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_NUOVIPAGAMEN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_NUOVIPAGAMEN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUOVIPAGAMEN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NUOVIPAGAMEN_Init()
  {

    PAN_NUOVIPAGAMEN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUOVIPAGAMEN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NUOVIPAGAMEN.SetSize(MyGlb.OBJ_FIELD, 38);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, "E1FCB8B4-C9C5-4A76-AD7D-0113C7E3E57B");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, "Beneficiario");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, "507F807B-75DE-41CE-A673-EC4D227B81C5");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, "Importo");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, "5B003F15-CB5F-4424-B283-A9B20F7CC061");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, "Pagato");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, "1F6776DB-ACEF-4C6C-9ED0-2F74BB1B5D67");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, "Pagamento");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, "0E05351B-D6AE-4441-A8AC-5F752E7778F0");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, "Data Pagamento");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, "48D02C6D-4E72-4641-9F51-6FBD45BC8B1E");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, "NUMERO DOC");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, "555DC556-754C-48F0-A920-56D8CF5F6BA4");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, "D DATA DOC");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, "2A8287BE-0A4E-492C-9E3D-5B24A994A567");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, "Quietanza");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, "BCE4C6C1-111A-46AF-BC41-A18D7A8F8240");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, "62DFB0EB-FC7D-463C-ACCA-0A8A1DD4C941");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, "ANNO LIQ");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, "A1C1EED2-A584-4E25-AD2A-EF6171ED40D0");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, "NUMERO LIQ");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, "CDC2EE5B-D21B-4A28-B7C1-03487B59D498");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, "SEDE DEL");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, "2A8C2057-D04B-4AAB-9532-B712D869D218");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, "NUMERO DEL");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, "5A030BFA-0C2F-417F-9AC0-2070134C14E4");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, "ANNO DEL");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, "ED59AD4F-769C-4C8C-B54B-88DB28E63AC4");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, "BENEFICIARIO");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, "AF3CDF7C-96A0-470F-AC2F-11D0207BE706");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, "ANNO DOC");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, "D6B6B9A7-3EBF-41E8-BF5A-718306999AF1");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, "91DBD724-2656-4669-BDFA-ECE3EA948742");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, "DIVERSO BEN");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, "C19DED2D-B094-486D-A1C7-07B87E548D4A");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, "NUM QUIETANZA DIV BEN");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, "8601ECD0-FC9F-44DD-AC22-6222315D006C");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, "DESCRIZIONE 2");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, "BA6B4C45-1935-417A-A814-A495C3ED80FB");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, "CAUSALE");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, "0C38A696-DB39-4D68-A300-E775780856C9");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, "DESCRIZIONE 3");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, "7FAA072E-C509-4CF2-A70A-352EB850F17A");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, "ANNO IMP");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, "A7C446DD-9D45-487D-ADD4-29E2A7A7A9E1");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, "NUMERO IMP");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, "1B6A6669-3250-4000-AF34-AE13EFCB8B30");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, "3EE94E56-3091-452B-B37B-DE31F3817697");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, "0F7A7D29-F559-4E50-AF7A-FB4B00368398");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, "CAPITOLO");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, "55B216AA-4A95-41B6-9753-F908CA422420");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, "ARTICOLO");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, "A523BBF8-8A8B-4565-A78C-08A9DCC49517");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, "S");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, "1F5B7867-E073-425D-8858-9457C9293C6D");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, "RITENUTE");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, "2A570196-7550-4F6F-93E0-2291E9220D0B");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, "NUMERO CONTABILE");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, "356A08B0-2EA6-4B0E-A145-894C65E7D28A");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, "DATA CONTABILE");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, "C058A238-31AD-48F2-91B9-8B915BA6BD4F");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, "D DATA REG");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, "11B7F65F-5E59-4909-8605-66654AE7F9ED");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, "PROGRESSIVO TESO");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, "B162BC3C-0BA9-4260-81A0-F858A51ADBA8");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.VIS_CAMPOTOTALE);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, 0, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, "97736C10-AF96-4BDE-AFDB-F004D260A9D5");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, "DATA PAGAM");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, "D32D112D-3932-46E0-886E-2FF462C42986");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, "NUMERO PAGAM");
    PAN_NUOVIPAGAMEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, "");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVIPAGAMEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, "435BE50B-2CC5-4043-9FCF-A289488987F1");
    PAN_NUOVIPAGAMEN.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, "Documento");
    PAN_NUOVIPAGAMEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_NUOVIPAGAMEN.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_NUOVIPAGAMEN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_LIST, 100);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_FORM, 4, 208, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_FORM, 100);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_BENEFICIARI1, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_BENEFICIARI1, PPQRY_LIQ12, "B.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_LIST, 132, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_IMPORTO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_IMPORTO, PPQRY_LIQ12, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_LIST, 212, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_LIST, 96);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_FORM, 4, 28, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_FORM, 96);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_PAGATO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_PAGATO, PPQRY_LIQ12, "A.IMPORTO_PAGAM", "IMPORTO_PAGAM", 3, 14, 2, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_LIST, 308, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_LIST, "Pagamento");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_FORM, 4, 808, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PAGAMENTO, MyGlb.PANEL_FORM, "Pagamento");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_PAGAMENTO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldUnbound(PFL_NUOVIPAGAMEN_PAGAMENTO, true);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_PAGAMENTO, PPQRY_LIQ12, "A.IMPORTO - NVL(A.IMPORTO_PAGAM, 0)", "RECORDPAGAME", 3, 28, 6, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_LIST, 404, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_LIST, 124);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_LIST, "Data Pagamento");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_FORM, 4, 928, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_FORM, 124);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAMEOK, MyGlb.PANEL_FORM, "Data Pagamento");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DATAPAGAMEOK, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldUnbound(PFL_NUOVIPAGAMEN_DATAPAGAMEOK, true);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DATAPAGAMEOK, PPQRY_LIQ12, "CASE WHEN A.ANNO_MAND = TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) THEN TRUNC( SYSDATE ) ELSE TO_DATE((31)||'/'||(12)||'/'||(A.ANNO_MAND),'dd/mm/yyyy') END", "DATAPAGAMEOK", 6, 0, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_LIST, 488, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_LIST, "NUM. DOC");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_FORM, 4, 880, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMERODOC, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMERODOC, PPQRY_LIQ12, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_LIST, 540, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_FORM, 4, 904, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DDATADOC, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DDATADOC, PPQRY_LIQ12, "I.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_LIST, 604, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_FORM, 4, 328, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_QUIETANZA, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_QUIETANZA, PPQRY_LIQ12, "D.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_LIST, 732, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_LIST, 100);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_LIST, "Diverso Beneficiario");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_FORM, 4, 376, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_FORM, 100);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSBENEFI, MyGlb.PANEL_FORM, "Div. Beneficiario");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DIVERSBENEFI, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DIVERSBENEFI, PPQRY_LIQ12, "E.RAGIONE_SOCIALE_ESTESA", "RECBERASOES2", 5, 60, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_LIST, 1160, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ANNOLIQ, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ANNOLIQ, PPQRY_LIQ12, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_LIST, "NUMERO LIQ");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMEROLIQ, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMEROLIQ, PPQRY_LIQ12, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_LIST, 1160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_FORM, 4, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_SEDEDEL, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_SEDEDEL, PPQRY_LIQ12, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_FORM, 4, 124, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMERODEL, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMERODEL, PPQRY_LIQ12, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_LIST, 1160, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ANNODEL, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ANNODEL, PPQRY_LIQ12, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_LIST, 1160, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 232, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_BENEFICIARIO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_BENEFICIARIO, PPQRY_LIQ12, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_LIST, 1160, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ANNODOC, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ANNODOC, PPQRY_LIQ12, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_LIST, 1160, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 304, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMQUIETANZA, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMQUIETANZA, PPQRY_LIQ12, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_LIST, 1160, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_LIST, "DIVERSO BEN");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_FORM, 4, 352, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DIVERSOBEN, MyGlb.PANEL_FORM, "DIV. BEN");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DIVERSOBEN, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DIVERSOBEN, PPQRY_LIQ12, "A.DIVERSO_BEN", "DIVERSO_BEN", 2, 15, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 1160, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 136);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_LIST, "NUM QUIETANZA DIV BEN");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 4, 400, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 136);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, MyGlb.PANEL_FORM, "NUM QUIET. DIV BEN");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, PPQRY_LIQ12, "A.NUM_QUIETANZA_DIV_BEN", "NUM_QUIETANZA_DIV_BEN", 1, 2, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_LIST, 1160, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_LIST, "DESCRIZIONE 2");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 424, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE2, MyGlb.PANEL_FORM, "DESCR. 2");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DESCRIZIONE2, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DESCRIZIONE2, PPQRY_LIQ12, "G.DESCRIZIONE", "RECORDDESCR2", 5, 40, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_LIST, 1160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_FORM, 4, 448, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_CAUSALE, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_CAUSALE, PPQRY_LIQ12, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_LIST, 1160, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_LIST, "DESCRIZIONE 3");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_FORM, 4, 472, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DESCRIZIONE3, MyGlb.PANEL_FORM, "DESCR. 3");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DESCRIZIONE3, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DESCRIZIONE3, PPQRY_LIQ12, "H.DESCRIZIONE", "RECORDDESCR3", 5, 50, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_LIST, 1160, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_FORM, 4, 496, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ANNOIMP, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ANNOIMP, PPQRY_LIQ12, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_LIST, 1160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 520, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMEROIMP, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMEROIMP, PPQRY_LIQ12, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1160, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 544, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ANNOSUBIMP, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ANNOSUBIMP, PPQRY_LIQ12, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1160, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 568, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMEROSUBIMP, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMEROSUBIMP, PPQRY_LIQ12, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_LIST, 1160, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_FORM, 4, 616, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_CAPITOLO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_CAPITOLO, PPQRY_LIQ12, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_LIST, 1160, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_ARTICOLO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_ARTICOLO, PPQRY_LIQ12, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_LIST, 1160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_LIST, 16);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_LIST, "S");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_FORM, 4, 664, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_FORM, 16);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_S, MyGlb.PANEL_FORM, "S");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_S, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_S, PPQRY_LIQ12, "A.S", "S", 5, 1, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_LIST, 1160, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_LIST, "RITENUTE");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_FORM, 4, 688, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_RITENUTE, MyGlb.PANEL_FORM, "RITENUTE");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_RITENUTE, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_RITENUTE, PPQRY_LIQ12, "A.RITENUTE", "RITENUTE", 3, 14, 2, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_LIST, 1160, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_LIST, 112);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_LIST, "NUMERO CONTABILE");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 712, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_FORM, 112);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROCONTAB, MyGlb.PANEL_FORM, "NUM. CONTABILE");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMEROCONTAB, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMEROCONTAB, PPQRY_LIQ12, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_LIST, 1160, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_LIST, 96);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_LIST, "DATA CONTABILE");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_FORM, 4, 736, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_FORM, 96);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATACONTABIL, MyGlb.PANEL_FORM, "DT. CONTABILE");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DATACONTABIL, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DATACONTABIL, PPQRY_LIQ12, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_LIST, 1160, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_LIST, 68);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_FORM, 4, 760, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_FORM, 68);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DDATAREG, MyGlb.PANEL_FORM, "D DT. REG");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DDATAREG, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DDATAREG, PPQRY_LIQ12, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_LIST, 1308, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_LIST, 108);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_LIST, "PROGRESSIVO TESO");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_FORM, 108);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_PROGRESSTESO, MyGlb.PANEL_FORM, "PROGR. TESO");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_PROGRESSTESO, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_PROGRESSTESO, PPQRY_LIQ12, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_LIST, 196, 252, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_LIST, 0);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_FORM, 292, 256, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_FORM, 0);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_SOMMPAGALABE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_SOMMPAGALABE, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_SOMMPAGALABE, -1, "", "SOMMPAGALABE", 0, 0, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_LIST, 956, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_LIST, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_LIST, "DATA PAGAM");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_FORM, 4, 880, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_FORM, 76);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DATAPAGAM, MyGlb.PANEL_FORM, "DT. PAGAM");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DATAPAGAM, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DATAPAGAM, PPQRY_LIQ12, "A.DATA_PAGAM", "DATA_PAGAM", 1, 7, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_LIST, 956, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_LIST, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_LIST, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_LIST, "NUMERO PAGAM");
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_FORM, 4, 880, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_FORM, 92);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_FORM, 1);
    PAN_NUOVIPAGAMEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_NUMEROPAGAM, MyGlb.PANEL_FORM, "NUM. PAGAM");
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_NUMEROPAGAM, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_NUMEROPAGAM, PPQRY_LIQ12, "A.NUMERO_PAGAM", "NUMERO_PAGAM", 5, 10, 0, -13997);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_LIST, 488, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_NUOVIPAGAMEN.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_FORM, 436, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVIPAGAMEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_NUOVIPAGAMEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVIPAGAMEN_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_NUOVIPAGAMEN.SetFieldPage(PFL_NUOVIPAGAMEN_DOCUMENLABEL, -1, -1);
    PAN_NUOVIPAGAMEN.SetFieldPanel(PFL_NUOVIPAGAMEN_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
  }

  private void PAN_NUOVIPAGAMEN_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUOVIPAGAMEN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NUOVIPAGAMEN.SetIMDB(IMDB, "PQRY_LIQ12", true);
    PAN_NUOVIPAGAMEN.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPORTO_PAGAM as IMPORTO_PAGAM, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  D.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DIVERSO_BEN as DIVERSO_BEN, ");
    SQL.append("  E.RAGIONE_SOCIALE_ESTESA as RECBERASOES2, ");
    SQL.append("  A.NUM_QUIETANZA_DIV_BEN as NUM_QUIETANZA_DIV_BEN, ");
    SQL.append("  G.DESCRIZIONE as RECORDDESCR2, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  H.DESCRIZIONE as RECORDDESCR3, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  A.NUMERO_CONTABILE as NUMERO_CONTABILE, ");
    SQL.append("  A.DATA_CONTABILE as DATA_CONTABILE, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  I.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.IMPORTO - NVL(A.IMPORTO_PAGAM, 0) as RECORDPAGAME, ");
    SQL.append("  A.PROGRESSIVO_TESO as PROGRESSIVO_TESO, ");
    SQL.append("  A.DATA_PAGAM as DATA_PAGAM, ");
    SQL.append("  A.NUMERO_PAGAM as NUMERO_PAGAM, ");
    SQL.append("  CASE WHEN A.ANNO_MAND = TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) THEN TRUNC( SYSDATE ) ELSE TO_DATE((31)||'/'||(12)||'/'||(A.ANNO_MAND),'dd/mm/yyyy') END as DATAPAGAMEOK ");
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  BEN E, ");
    SQL.append("  QTN F, ");
    SQL.append("  T02 G, ");
    SQL.append("  T58 H, ");
    SQL.append("  FAT I ");
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_PARANUOVPAGA.ANNO_MAND~~ AND A.NUMERO_MAND = ~~TBL_PARANUOVPAGA.NUMERO_MAND~~) ");
    SQL.append("and   (A.IMPORTO > NVL(A.IMPORTO_PAGAM, 0)) ");
    SQL.append("and   (A.BENEFICIARIO = B.CODICE(+)) ");
    SQL.append("and   (A.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = C.NUM_QUIETANZA(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.DIVERSO_BEN = E.CODICE(+)) ");
    SQL.append("and   (A.DIVERSO_BEN = F.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA_DIV_BEN = F.NUM_QUIETANZA(+)) ");
    SQL.append("and   (F.TIPO_QUIETANZA = G.CODICE(+)) ");
    SQL.append("and   (A.CAUSALE = H.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = I.ANNO_PROG(+)) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = I.NUMERO_PROG(+)) ");
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO_TESO, ");
    SQL.append("  A.BENEFICIARIO, ");
    SQL.append("  A.NUM_QUIETANZA, ");
    SQL.append("  A.DIVERSO_BEN, ");
    SQL.append("  A.NUM_QUIETANZA_DIV_BEN, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_NUOVIPAGAMEN.SetQuery(PPQRY_LIQ12, 5, SQL, -1, "");
    PAN_NUOVIPAGAMEN.SetQueryDB(PPQRY_LIQ12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NUOVIPAGAMEN.SetMasterTable(0, "LIQ");
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_PROGRESSTESO, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_BENEFICIARIO, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_NUMQUIETANZA, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_DIVERSOBEN, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_NUMQUIDIVBEN, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_ANNOLIQ, true);
    PAN_NUOVIPAGAMEN.AddToSortList(PFL_NUOVIPAGAMEN_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUOVIPAGAMEN.Status() == 2)
    {
      int oldListQBE = PAN_NUOVIPAGAMEN.iUseListQBE;
      PAN_NUOVIPAGAMEN.iUseListQBE = 0;
      PAN_NUOVIPAGAMEN.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUOVIPAGAMEN.PanelCommand(Glb.PCM_FIND);
      PAN_NUOVIPAGAMEN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_OnChangeRow();
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
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_NUOVIPAGAMEN) PAN_NUOVIPAGAMEN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
