// **********************************************
// Scelta Subimpegno Provenienza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaSubimpegnoProvenienza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTASUBIMP_SUBIMPEGNO = 0;
  private static int GRP_SCELTASUBIMP_PROPOSTA = 1;
  private static int GRP_SCELTASUBIMP_DELIBERA = 2;

  private static int PFL_SCELTASUBIMP_NUMEROSUBIMP = 0;
  private static int PFL_SCELTASUBIMP_ANNOSUBIMP = 1;
  private static int PFL_SCELTASUBIMP_CAPITOLO = 2;
  private static int PFL_SCELTASUBIMP_ARTICOLO = 3;
  private static int PFL_SCELTASUBIMP_DDATAREG = 4;
  private static int PFL_SCELTASUBIMP_DESCRIZIONE = 5;
  private static int PFL_SCELTASUBIMP_TIPOVAR = 6;
  private static int PFL_SCELTASUBIMP_UNITAPROPONE = 7;
  private static int PFL_SCELTASUBIMP_NUMEROPROPOS = 8;
  private static int PFL_SCELTASUBIMP_ANNOPROPOSTA = 9;
  private static int PFL_SCELTASUBIMP_SEDEDEL = 10;
  private static int PFL_SCELTASUBIMP_NUMERODEL = 11;
  private static int PFL_SCELTASUBIMP_ANNODEL = 12;
  private static int PFL_SCELTASUBIMP_IMPORTO = 13;
  private static int PFL_SCELTASUBIMP_CODICEGESTIO = 14;
  private static int PFL_SCELTASUBIMP_CODICECOFOG = 15;
  private static int PFL_SCELTASUBIMP_CODICEEUROPE = 16;
  private static int PFL_SCELTASUBIMP_CODLIVELLO5 = 17;
  private static int PFL_SCELTASUBIMP_BENEFICIARIO = 18;
  private static int PFL_SCELTASUBIMP_CAUSALE = 19;
  private static int PFL_SCELTASUBIMP_TITOLOGIURID = 20;
  private static int PFL_SCELTASUBIMP_CENTRO = 21;
  private static int PFL_SCELTASUBIMP_FATTORE = 22;
  private static int PFL_SCELTASUBIMP_COMPETENZDAL = 23;
  private static int PFL_SCELTASUBIMP_COMPETENZAAL = 24;
  private static int PFL_SCELTASUBIMP_NOTE = 25;
  private static int PFL_SCELTASUBIMP_RILEVANTEECO = 26;
  private static int PFL_SCELTASUBIMP_CODIMPECO = 27;
  private static int PFL_SCELTASUBIMP_COMUNEZONA = 28;
  private static int PFL_SCELTASUBIMP_PROVINCIZONA = 29;
  private static int PFL_SCELTASUBIMP_CUP = 30;
  private static int PFL_SCELTASUBIMP_CIG = 31;
  private static int PFL_SCELTASUBIMP_FINANZIAMENT = 32;
  private static int PFL_SCELTASUBIMP_PROGRESSIVO = 33;
  private static int PFL_SCELTASUBIMP_SUBIMPOBBLIG = 34;

  private static int PPQRY_VARSUB6 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_SCELTASUBIMP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM137(IMDB);
    //
    //
    Init_PQRY_VARSUB6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM137(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM137, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM137, "TBL_PARAM137");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMANNOIMP, "PARAMANNOIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMNUMEIMP, "PARAMNUMEIMP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM137,IMDBDef1.FLD_PARAM137_PARAMNUMEIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM137, 0);
  }

  private static void Init_PQRY_VARSUB6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VARSUB6, 35);
    IMDB.set_TblCode(IMDBDef7.PQRY_VARSUB6, "PQRY_VARSUB6");
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSNUMESUBI, "VARSNUMESUBI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSNUMESUBI,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSANNOSUBI, "VARSANNOSUBI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBICAPI, "VARSSUBICAPI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBICAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBIARTI, "VARSSUBIARTI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBIARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSDDATAREG, "VARSDDATAREG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSDDATAREG,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBDESCRI, "VARSUBDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUTIPOVAR, "VARSUTIPOVAR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUTIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUNITPROP, "VARSUNITPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSNUMEPROP, "VARSNUMEPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSNUMEPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSANNOPROP, "VARSANNOPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUSEDEDEL, "VARSUSEDEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUNUMEDEL, "VARSUNUMEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUANNODEL, "VARSUANNODEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPORT, "VARSUBIMPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODGES, "VARIMPCODGES");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODGES,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODCOF, "VARIMPCODCOF");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODCOF,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODEUR, "VARIMPCODEUR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODLI5, "VARIMPCODLI5");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCODLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPBENE, "VARSUIMPBENE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPCAUS, "VARSUIMPCAUS");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPCAUS,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPTITGIU, "VARIMPTITGIU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPTITGIU,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPCENT, "VARSUIMPCENT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPCENT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPFATT, "VARSUIMPFATT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCOMDAL, "VARIMPCOMDAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCOMDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSIMPCOMAL, "VARSIMPCOMAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSIMPCOMAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPNOTE, "VARSUIMPNOTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUIMPNOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPRILECO, "VARIMPRILECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARCODIMPECO, "VARCODIMPECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARCODIMPECO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCOMZON, "VARIMPCOMZON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPCOMZON,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPPROZON, "VARIMPPROZON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARIMPPROZON,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPCUP, "VARSUBIMPCUP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPCUP,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPCIG, "VARSUBIMPCIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBIMPCIG,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBFINANZ, "VARSUBFINANZ");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBFINANZ,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBPROGRE, "VARSUBPROGRE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSUBPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBIOBBL, "VARSSUBIOBBL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARSUB6,IMDBDef7.PQSL_VARSUB6_VARSSUBIOBBL,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VARSUB6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaSubimpegnoProvenienza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaSubimpegnoProvenienza()
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
    FormIdx = MyGlb.FRM_SCELSUBIPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CE6E5B69-B867-445C-8172-DAC6F3F7D626";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1032;
    DesignHeight = 358;
    set_Caption(new IDVariant("Scelta Subimpegno "));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1032;
    Frames[1].Height = 332;
    Frames[1].Caption = "Scelta SubImpegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_SCELTASUBIMP = new IDPanel(w, this, 1, "PAN_SCELTASUBIMP");
    Frames[1].Content = PAN_SCELTASUBIMP;
    PAN_SCELTASUBIMP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTASUBIMP.VS = MainFrm.VisualStyleList;
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1032-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "86F06791-EB23-426B-91F9-BCE6CA49CC33");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 944, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTASUBIMP.InitStatus = 1;
    PAN_SCELTASUBIMP_Init();
    PAN_SCELTASUBIMP_InitFields();
    PAN_SCELTASUBIMP_InitQueries();
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
      PAN_SCELTASUBIMP.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaSubimpegnoProvenienza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaSubimpegnoProvenienza.class.getName() : (Glb.ClassWithPackage(SceltaSubimpegnoProvenienza.class) ? SceltaSubimpegnoProvenienza.class.getName().substring(SceltaSubimpegnoProvenienza.class.getPackage().getName().length() + 1) : SceltaSubimpegnoProvenienza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta SubImpegno On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_SCELTASUBIMP_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta SubImpegno On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_SCELTASUBIMP.Status()).equals((new IDVariant(1)), true))
      {
        PAN_SCELTASUBIMP.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_SCELTASUBIMP.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubimpegnoProvenienza", "SceltaSubImpegnoOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Scelta SubImpegno On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTASUBIMP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTASUBIMP);
      // 
      // Scelta SubImpegno On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTASUBIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTASUBIMP_DESCRIZIONE,(new IDVariant(PAN_SCELTASUBIMP.FieldText(PFL_SCELTASUBIMP_DESCRIZIONE))).stringValue()); 
      PAN_SCELTASUBIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTASUBIMP_TIPOVAR,(new IDVariant(PAN_SCELTASUBIMP.FieldText(PFL_SCELTASUBIMP_TIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubimpegnoProvenienza", "SceltaSubImpegnoOnDynamicProperties", _e);
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
      PAN_SCELTASUBIMP.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubimpegnoProvenienza", "Load", _e);
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
  private void PAN_SCELTASUBIMP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTASUBIMP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTASUBIMP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTASUBIMP, Cancel);
    // Stub
  }

  private void PAN_SCELTASUBIMP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTASUBIMP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTASUBIMP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_VARSUB6, IMDBDef7.PQSL_VARSUB6_VARSDDATAREG, 0)))
      {
        IMDB.set_Value(IMDBDef7.PQRY_VARSUB6, IMDBDef7.PQSL_VARSUB6_VARSDDATAREG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_SCELTASUBIMP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTASUBIMP_Init()
  {

    PAN_SCELTASUBIMP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTASUBIMP.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, "BF5221D4-ECE3-481B-867A-26F1294A8E02");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, "Sub-Impegno");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, MyGlb.PANEL_FORM, 0, 39, 132, 73, 0, 0);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, 0, 77);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, 1, 13);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, 0, 4);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, 1, 4);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, "46E361E0-8510-4A2F-B88F-8B71F4ACD31E");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, "Proposta");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, MyGlb.PANEL_LIST, 608, -9999, 200, 16, 0, 0);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, MyGlb.PANEL_FORM, 0, 159, 172, 97, 0, 0);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, 0, 51);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, 1, 13);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, 0, 4);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, 1, 4);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, "E1A18AC7-0339-47B5-AFA7-072E34F894E3");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, "Delibera");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, MyGlb.PANEL_LIST, 808, -9999, 136, 16, 0, 0);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, MyGlb.PANEL_FORM, 0, 231, 132, 97, 0, 0);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, 0, 47);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, 1, 13);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, 0, 4);
    PAN_SCELTASUBIMP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, 1, 4);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTASUBIMP_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTASUBIMP.SetSize(MyGlb.OBJ_FIELD, 35);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, "D35AEDC0-133C-463E-B8A0-574CA5DB7F54");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, "Numero");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, "31ADCE24-0F48-40EA-BE2B-A484B85E469A");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, "Anno");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, "44074827-E3F2-4C6F-9CA3-9EB0B2DA75B5");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, "Capitolo");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, "1F49D828-0AD9-4163-859E-0B40A67FD587");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, "Art.");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, "49BFF72A-E5E7-4309-9571-72527B09E3FF");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, "Data Reg.");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, "8BAF76A5-7DA4-42BF-B1C8-DAE54E0DAA19");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, "Descrizione");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, "079B86BA-ECB8-4BBE-87B2-EB7893C2679E");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, "Tipo Variazione");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, "48A29B97-189A-430A-BD64-0DE2246ADF2B");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, "Unità Prop.");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, "5648AB82-F509-452D-91DE-8FA03900F137");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, "Numero");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, "BACABB5C-C6DA-4ABA-A8B5-05B7A6C5FE10");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, "Anno");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, "1296499D-C5F8-4BE4-A143-7C13EC968F5E");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, "Sede");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, "33B50B26-3C51-4D19-B8F6-2ECF6C32C146");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, "Numero");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, "B3F490D0-F18C-404F-B7E5-FDE51FA482C3");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, "Anno");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, "C93C68A8-684C-4EFF-95A4-15C3C97EA853");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, "IMPORTO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, 0, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, "62CA54F4-5757-49BD-ADB8-9CF15122F493");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, "9912EA69-5FDE-4284-9785-527174A8662D");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, "Cod. Cofog");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, "C989B507-7242-41BE-B64C-4F27CE3E6C0D");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, "Cod. Europeo");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, "4BCFB2C8-D86D-41AB-B1A6-1EF16895BB23");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, "Cod. V livello");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, "50A07CCB-0EB6-4DCB-A255-F8B8C2B19361");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, "BENEFICIARIO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, "61438BCE-2F8C-4710-9FB5-CE682958F8F8");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, "CAUSALE");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, "0F8BC21E-0DF8-4623-9273-AB30C8981FD8");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, "TITOLO GIURIDICO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, "8D85D340-2DD9-4215-BC12-FBE6A3153598");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, "CENTRO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, "8A5E27B5-C899-424A-BFF6-9B5AA03A0CA3");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, "FATTORE");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, "F7E3BA01-E052-4496-8A4E-F0F58FC7839B");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, "COMPETENZA DAL");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, "68D8A5B0-71F9-487C-BA40-32260FDED5F7");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, "COMPETENZA AL");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, "CB1AFE6C-7C2E-41FC-A0A5-BF5D889A913C");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, "NOTE");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, "2FBE20D2-4B55-4D2C-AD12-46E52794B9D9");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, "RILEVANTE ECO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, "5B728FDB-7ED1-4A12-9AE9-DA41122327A6");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, "COD IMP ECO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, "11604049-37FE-45DE-BBCE-530D6E949B38");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, "COMUNE ZONA");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, "93CE531E-DC8A-4B76-AE22-7A5E8460A053");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, "PROVINCIA ZONA");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, "863A6FDD-CE52-4532-BAB8-235EB434F9EC");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, "CUP");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, "8B68D520-4D0B-40D7-82DE-A25E70C1A5F7");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, "CIG");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, "A42E8918-A5F9-4B87-A4DC-6047FFC9D5DF");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, "FINANZIAMENTO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, "B59B725F-5432-48C1-AE48-CA4335F2136E");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, "PROGRESSIVO");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, "A0DE0F58-A1A0-4113-A091-E64B3A8BC4DF");
    PAN_SCELTASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, "SUBIMP OBBLIG");
    PAN_SCELTASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, "");
    PAN_SCELTASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTASUBIMP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 64, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_NUMEROSUBIMP, -1, GRP_SCELTASUBIMP_SUBIMPEGNO);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_NUMEROSUBIMP, PPQRY_VARSUB6, "B.NUMERO_SUBIMP", "VARSNUMESUBI", 1, 5, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 60, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_ANNOSUBIMP, -1, GRP_SCELTASUBIMP_SUBIMPEGNO);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_ANNOSUBIMP, PPQRY_VARSUB6, "B.ANNO_SUBIMP", "VARSANNOSUBI", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_LIST, 100, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CAPITOLO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CAPITOLO, PPQRY_VARSUB6, "B.CAPITOLO", "VARSSUBICAPI", 3, 16, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_LIST, 212, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_FORM, 4, 136, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_ARTICOLO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_ARTICOLO, PPQRY_VARSUB6, "B.ARTICOLO", "VARSSUBIARTI", 1, 2, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_FORM, 4, 160, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DDATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_DDATAREG, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_DDATAREG, PPQRY_VARSUB6, "A.D_DATA_REG", "VARSDDATAREG", 6, 19, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 312, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_DESCRIZIONE, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_DESCRIZIONE, PPQRY_VARSUB6, "A.DESCRIZIONE", "VARSUBDESCRI", 5, 140, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_LIST, 480, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_FORM, 4, 328, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TIPOVAR, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_TIPOVAR, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_TIPOVAR, PPQRY_VARSUB6, "A.TIPO_VAR", "VARSUTIPOVAR", 1, 2, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_LIST, 608, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Prop.");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 184, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità Prop.");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_UNITAPROPONE, -1, GRP_SCELTASUBIMP_PROPOSTA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_UNITAPROPONE, PPQRY_VARSUB6, "A.UNITA_PROPONENTE", "VARSUNITPROP", 5, 8, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_LIST, 716, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 208, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_NUMEROPROPOS, -1, GRP_SCELTASUBIMP_PROPOSTA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_NUMEROPROPOS, PPQRY_VARSUB6, "A.NUMERO_PROPOSTA", "VARSNUMEPROP", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 768, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 232, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_ANNOPROPOSTA, -1, GRP_SCELTASUBIMP_PROPOSTA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_ANNOPROPOSTA, PPQRY_VARSUB6, "A.ANNO_PROPOSTA", "VARSANNOPROP", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_LIST, 808, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_FORM, 4, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_SEDEDEL, -1, GRP_SCELTASUBIMP_DELIBERA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_SEDEDEL, PPQRY_VARSUB6, "A.SEDE_DEL", "VARSUSEDEDEL", 5, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_LIST, 848, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_NUMERODEL, -1, GRP_SCELTASUBIMP_DELIBERA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_NUMERODEL, PPQRY_VARSUB6, "A.NUMERO_DEL", "VARSUNUMEDEL", 1, 6, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_LIST, 904, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_ANNODEL, -1, GRP_SCELTASUBIMP_DELIBERA);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_ANNODEL, PPQRY_VARSUB6, "A.ANNO_DEL", "VARSUANNODEL", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_LIST, 812, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_LIST, "IMPORTO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_FORM, 4, 328, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_IMPORTO, MyGlb.PANEL_FORM, "IMPORTO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_IMPORTO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_IMPORTO, PPQRY_VARSUB6, "A.IMPORTO", "VARSUBIMPORT", 3, 14, 2, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 376, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEGESTIO, MyGlb.PANEL_FORM, "CODICE GESTIONALE");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CODICEGESTIO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CODICEGESTIO, PPQRY_VARSUB6, "B.CODICE_GESTIONALE", "VARIMPCODGES", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_LIST, 812, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_FORM, 4, 400, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CODICECOFOG, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CODICECOFOG, PPQRY_VARSUB6, "B.CODICE_COFOG", "VARIMPCODCOF", 1, 3, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_LIST, 812, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 424, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CODICEEUROPE, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CODICEEUROPE, PPQRY_VARSUB6, "B.CODICE_EUROPEO", "VARIMPCODEUR", 1, 1, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 448, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CODLIVELLO5, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CODLIVELLO5, PPQRY_VARSUB6, "B.COD_LIVELLO_5", "VARIMPCODLI5", 3, 10, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFICIARIO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 328, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFICIARIO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_BENEFICIARIO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_BENEFICIARIO, PPQRY_VARSUB6, "B.BENEFICIARIO", "VARSUIMPBENE", 2, 15, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_LIST, 900, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CAUSALE, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CAUSALE, PPQRY_VARSUB6, "B.CAUSALE", "VARSUIMPCAUS", 1, 4, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_LIST, 1540, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_LIST, 116);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_LIST, "TITOLO GIURIDICO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_FORM, 4, 520, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_FORM, 116);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_TITOLOGIURID, MyGlb.PANEL_FORM, "TITOLO GIURIDICO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_TITOLOGIURID, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_TITOLOGIURID, PPQRY_VARSUB6, "B.TITOLO_GIURIDICO", "VARIMPTITGIU", 5, 60, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_LIST, 2008, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_FORM, 4, 592, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CENTRO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CENTRO, PPQRY_VARSUB6, "B.CENTRO", "VARSUIMPCENT", 5, 16, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_LIST, 2060, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_FORM, 4, 616, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_FATTORE, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_FATTORE, PPQRY_VARSUB6, "B.FATTORE", "VARSUIMPFATT", 5, 16, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_LIST, 2120, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_LIST, 108);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 640, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_FORM, 108);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPETENZA DAL");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_COMPETENZDAL, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_COMPETENZDAL, PPQRY_VARSUB6, "B.COMPETENZA_DAL", "VARIMPCOMDAL", 6, 19, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_LIST, 2228, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_LIST, 100);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 664, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_FORM, 100);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPETENZA AL");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_COMPETENZAAL, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_COMPETENZAAL, PPQRY_VARSUB6, "B.COMPETENZA_AL", "VARSIMPCOMAL", 6, 19, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_LIST, 2332, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_FORM, 4, 688, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_NOTE, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_NOTE, PPQRY_VARSUB6, "B.NOTE", "VARSUIMPNOTE", 5, 2000, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_LIST, 2764, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_LIST, "RILEVANTE ECO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEVANTE ECO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_RILEVANTEECO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_RILEVANTEECO, PPQRY_VARSUB6, "B.RILEVANTE_ECO", "VARIMPRILECO", 5, 2, 0, -13997);
    PAN_SCELTASUBIMP.SetValueListItem(PFL_SCELTASUBIMP_RILEVANTEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTASUBIMP.SetValueListItem(PFL_SCELTASUBIMP_RILEVANTEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_LIST, 2856, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_LIST, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_LIST, "COD IMP ECO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_FORM, 4, 760, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_FORM, 80);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CODIMPECO, MyGlb.PANEL_FORM, "COD IMP ECO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CODIMPECO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CODIMPECO, PPQRY_VARSUB6, "B.COD_IMP_ECO", "VARCODIMPECO", 5, 8, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_LIST, 3068, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_LIST, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_LIST, "COMUNE ZONA");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_FORM, 4, 832, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_FORM, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_COMUNEZONA, MyGlb.PANEL_FORM, "COMUNE ZONA");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_COMUNEZONA, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_COMUNEZONA, PPQRY_VARSUB6, "B.COMUNE_ZONA", "VARIMPCOMZON", 1, 3, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_LIST, 3156, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_LIST, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_LIST, "PROVINCIA ZONA");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_FORM, 4, 856, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_FORM, 104);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROVINCIZONA, MyGlb.PANEL_FORM, "PROVINCIA ZONA");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_PROVINCIZONA, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_PROVINCIZONA, PPQRY_VARSUB6, "B.PROVINCIA_ZONA", "VARIMPPROZON", 1, 3, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_LIST, 3328, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_LIST, 32);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_LIST, "CUP");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_FORM, 4, 904, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_FORM, 32);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CUP, MyGlb.PANEL_FORM, "CUP");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CUP, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CUP, PPQRY_VARSUB6, "B.CUP", "VARSUBIMPCUP", 5, 15, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_LIST, 3728, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_LIST, 28);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_LIST, "CIG");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_FORM, 4, 976, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_FORM, 28);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_CIG, MyGlb.PANEL_FORM, "CIG");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_CIG, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_CIG, PPQRY_VARSUB6, "B.CIG", "VARSUBIMPCIG", 5, 15, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_LIST, 812, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_FINANZIAMENT, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_FINANZIAMENT, PPQRY_VARSUB6, "A.FINANZIAMENTO", "VARSUBFINANZ", 1, 5, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 328, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_PROGRESSIVO, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_PROGRESSIVO, PPQRY_VARSUB6, "A.PROGRESSIVO", "VARSUBPROGRE", 3, 10, 0, -13997);
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_LIST, 96);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_LIST, "SUBIMP OBBLIG");
    PAN_SCELTASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_FORM, 4, 352, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_FORM, 96);
    PAN_SCELTASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTASUBIMP_SUBIMPOBBLIG, MyGlb.PANEL_FORM, "SUBIMP OBBLIG");
    PAN_SCELTASUBIMP.SetFieldPage(PFL_SCELTASUBIMP_SUBIMPOBBLIG, -1, -1);
    PAN_SCELTASUBIMP.SetFieldPanel(PFL_SCELTASUBIMP_SUBIMPOBBLIG, PPQRY_VARSUB6, "B.SUBIMP_OBBLIG", "VARSSUBIOBBL", 5, 2, 0, -13997);
    PAN_SCELTASUBIMP.SetValueListItem(PFL_SCELTASUBIMP_SUBIMPOBBLIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTASUBIMP.SetValueListItem(PFL_SCELTASUBIMP_SUBIMPOBBLIG, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_SCELTASUBIMP_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTASUBIMP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~VARSUTIPOVAR~~) ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_T55, 0, SQL, PFL_SCELTASUBIMP_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_T55, 1, SQL, PFL_SCELTASUBIMP_TIPOVAR, "");
    PAN_SCELTASUBIMP.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTASUBIMP.SetIMDB(IMDB, "PQRY_VARSUB6", true);
    PAN_SCELTASUBIMP.set_SetString(MyGlb.MASTER_ROWNAME, "VARSUB");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.NUMERO_SUBIMP as VARSNUMESUBI, ");
    SQL.append("  B.ANNO_SUBIMP as VARSANNOSUBI, ");
    SQL.append("  B.CAPITOLO as VARSSUBICAPI, ");
    SQL.append("  B.ARTICOLO as VARSSUBIARTI, ");
    SQL.append("  A.D_DATA_REG as VARSDDATAREG, ");
    SQL.append("  A.DESCRIZIONE as VARSUBDESCRI, ");
    SQL.append("  A.TIPO_VAR as VARSUTIPOVAR, ");
    SQL.append("  A.UNITA_PROPONENTE as VARSUNITPROP, ");
    SQL.append("  A.NUMERO_PROPOSTA as VARSNUMEPROP, ");
    SQL.append("  A.ANNO_PROPOSTA as VARSANNOPROP, ");
    SQL.append("  A.SEDE_DEL as VARSUSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as VARSUNUMEDEL, ");
    SQL.append("  A.ANNO_DEL as VARSUANNODEL, ");
    SQL.append("  A.IMPORTO as VARSUBIMPORT, ");
    SQL.append("  B.CODICE_GESTIONALE as VARIMPCODGES, ");
    SQL.append("  B.CODICE_COFOG as VARIMPCODCOF, ");
    SQL.append("  B.CODICE_EUROPEO as VARIMPCODEUR, ");
    SQL.append("  B.COD_LIVELLO_5 as VARIMPCODLI5, ");
    SQL.append("  B.BENEFICIARIO as VARSUIMPBENE, ");
    SQL.append("  B.CAUSALE as VARSUIMPCAUS, ");
    SQL.append("  B.TITOLO_GIURIDICO as VARIMPTITGIU, ");
    SQL.append("  B.CENTRO as VARSUIMPCENT, ");
    SQL.append("  B.FATTORE as VARSUIMPFATT, ");
    SQL.append("  B.COMPETENZA_DAL as VARIMPCOMDAL, ");
    SQL.append("  B.COMPETENZA_AL as VARSIMPCOMAL, ");
    SQL.append("  B.NOTE as VARSUIMPNOTE, ");
    SQL.append("  B.RILEVANTE_ECO as VARIMPRILECO, ");
    SQL.append("  B.COD_IMP_ECO as VARCODIMPECO, ");
    SQL.append("  B.COMUNE_ZONA as VARIMPCOMZON, ");
    SQL.append("  B.PROVINCIA_ZONA as VARIMPPROZON, ");
    SQL.append("  B.CUP as VARSUBIMPCUP, ");
    SQL.append("  B.CIG as VARSUBIMPCIG, ");
    SQL.append("  A.FINANZIAMENTO as VARSUBFINANZ, ");
    SQL.append("  A.PROGRESSIVO as VARSUBPROGRE, ");
    SQL.append("  B.SUBIMP_OBBLIG as VARSSUBIOBBL ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARSUB A, ");
    SQL.append("  SUBIMP B ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
    SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
    SQL.append("and   (B.ANNO_IMP = ~~TBL_PARAM137.PARAMANNOIMP~~) ");
    SQL.append("and   (B.NUMERO_IMP = ~~TBL_PARAM137.PARAMNUMEIMP~~) ");
    SQL.append("and   ((A.SUBIMP_GENERATO IS NULL)) ");
    SQL.append("and   (A.ANNO_ESIGIBILITA = ~~TBL_PARAM137.PARAMESERCIZ~~) ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_SUBIMP, ");
    SQL.append("  B.NUMERO_SUBIMP ");
    PAN_SCELTASUBIMP.SetQuery(PPQRY_VARSUB6, 5, SQL, -1, "");
    PAN_SCELTASUBIMP.SetQueryDB(PPQRY_VARSUB6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTASUBIMP.SetMasterTable(0, "VARSUB");
    PAN_SCELTASUBIMP.AddToSortList(PFL_SCELTASUBIMP_ANNOSUBIMP, true);
    PAN_SCELTASUBIMP.AddToSortList(PFL_SCELTASUBIMP_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTASUBIMP.Status() == 2)
    {
      int oldListQBE = PAN_SCELTASUBIMP.iUseListQBE;
      PAN_SCELTASUBIMP.iUseListQBE = 0;
      PAN_SCELTASUBIMP.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTASUBIMP.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTASUBIMP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_SCELTASUBIMP) PAN_SCELTASUBIMP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
