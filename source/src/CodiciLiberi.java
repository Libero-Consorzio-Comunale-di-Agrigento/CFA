// **********************************************
// Codici Liberi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciLiberi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TABS;
  private static int PFL_TIPICODICE_CODICE1 = 0;
  private static int PFL_TIPICODICE_DESCRIZIONE1 = 1;
  private static int PFL_TIPICODICE_ACRONIMO = 2;

  private static int PPQRY_TIPICODICE2 = 0;


  IDPanel PAN_TIPICODICE;
  private static int PFL_VALORICODICE_TIPOCODICE1 = 0;
  private static int PFL_VALORICODICE_CODICE = 1;
  private static int PFL_VALORICODICE_DESCRIZIONE = 2;
  private static int PFL_VALORICODICE_LABEL1 = 3;

  private static int PPQRY_VALOTIPICOD2 = 0;


  IDPanel PAN_VALORICODICE;
  private static int PFL_CONTROCODICE_LABEL = 0;
  private static int PFL_CONTROCODICE_TIPOCONTROLL = 1;
  private static int PFL_CONTROCODICE_VALOCONTCHEC = 2;
  private static int PFL_CONTROCODICE_VALORELIBERO = 3;
  private static int PFL_CONTROCODICE_TIPOCODICE = 4;
  private static int PFL_CONTROCODICE_VALORECODICE = 5;
  private static int PFL_CONTROCODICE_TIPOVALORE = 6;
  private static int PFL_CONTROCODICE_INSERIAGGIOR = 7;
  private static int PFL_CONTROCODICE_VALORELABEL = 8;

  private static int PPQRY_VALOCONTCOD2 = 0;

  private static int PPQRY_TIPICONTCODI = 1;

  private static int PPQRY_TIPICODICE = 2;


  IDPanel PAN_CONTROCODICE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VALORI_CONTROLLO_CODICI(IMDB);
    //
    //
    Init_PQRY_TIPICODICE2(IMDB);
    Init_PQRY_VALOTIPICOD2(IMDB);
    Init_PQRY_VALOCONTCOD2(IMDB);
    Init_PQRY_VALOCONTCOD2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VALORI_CONTROLLO_CODICI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, "TBL_VALORI_CONTROLLO_CODICI");
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE, "TIPO_CODICE");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE, "VALORE_CODICE");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO, "CODICE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO,1,3,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO, "VALORE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO,5,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL, "VACOCOVACOVL");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL,5,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG, "VALCONCOINAG");
    IMDB.SetFldParams(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG,1,1,0);
  }

  private static void Init_PQRY_TIPICODICE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPICODICE2, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPICODICE2, "PQRY_TIPICODICE2");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_TIPO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_ACRONIMO, "ACRONIMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPICODICE2,IMDBDef8.PQSL_TIPICODICE2_ACRONIMO,5,3,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPICODICE2, 0);
  }

  private static void Init_PQRY_VALOTIPICOD2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VALOTIPICOD2, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_VALOTIPICOD2, "PQRY_VALOTIPICOD2");
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_TIPO_CODICE, "TIPO_CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_TIPO_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOTIPICOD2,IMDBDef8.PQSL_VALOTIPICOD2_DESCRIZIONE,5,300,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VALOTIPICOD2, 0);
  }

  private static void Init_PQRY_VALOCONTCOD2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VALOCONTCOD2, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_VALOCONTCOD2, "PQRY_VALOCONTCOD2");
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, "CODICE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL, "VACOCOVACOVL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL,5,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_TIPO_CODICE, "TIPO_CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_TIPO_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CODICE, "VALORE_CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO, "VALORE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO,5,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, "VALCONCOINAG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2,IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG,1,1,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VALOCONTCOD2, 0);
  }

  private static void Init_PQRY_VALOCONTCOD2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_VALOCONTCOD2_RS, "PQRY_VALOCONTCOD2_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, "CODICE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL, "VACOCOVACOVL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL,5,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_TIPO_CODICE, "TIPO_CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_TIPO_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CODICE, "VALORE_CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO, "VALORE_CONTROLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO,5,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, "VALCONCOINAG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VALOCONTCOD2_RS,IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciLiberi(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciLiberi()
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
    FormIdx = MyGlb.FRM_CODICILIBERI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "59514E29-1485-4D6A-AAAB-C43E0150CE47";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 446;
    set_Caption(new IDVariant("Codici Liberi"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 420;
    Frames[1].Caption = "Tabs";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 420;
    TAB_TABS = new OTabView(this);
    Frames[1].Content = TAB_TABS;
    TAB_TABS.iGuid = "DFD1D280-93F8-4417-81F1-9BFCD70FBB6C";
    TAB_TABS.SetItemCount(3);
    TAB_TABS.Placement = 1;
    TAB_TABS.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Tipi Codice";
    Frames[2].Parent = this;
    PAN_TIPICODICE = new IDPanel(w, this, 2, "PAN_TIPICODICE");
    Frames[2].Content = PAN_TIPICODICE;
    PAN_TIPICODICE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPICODICE.VS = MainFrm.VisualStyleList;
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_TIPICODICE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "82241FF1-4C42-4102-895E-F69575AA195B");
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 632, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPICODICE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPICODICE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPICODICE.InitStatus = 2;
    PAN_TIPICODICE_Init();
    PAN_TIPICODICE_InitFields();
    PAN_TIPICODICE_InitQueries();
    TAB_TABS.SetItem(1, Frames[2], 0, "", "Tipi Codice", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Valori Codice";
    Frames[3].Parent = this;
    PAN_VALORICODICE = new IDPanel(w, this, 3, "PAN_VALORICODICE");
    Frames[3].Content = PAN_VALORICODICE;
    PAN_VALORICODICE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALORICODICE.VS = MainFrm.VisualStyleList;
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VALORICODICE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2FC18519-6193-47B7-8075-E10FEE404F9E");
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 44, 604, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VALORICODICE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALORICODICE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALORICODICE.InitStatus = 2;
    PAN_VALORICODICE_Init();
    PAN_VALORICODICE_InitFields();
    PAN_VALORICODICE_InitQueries();
    TAB_TABS.SetItem(2, Frames[3], 0, "", "Valori Codice", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Controlli Codice";
    Frames[4].Parent = this;
    PAN_CONTROCODICE = new IDPanel(w, this, 4, "PAN_CONTROCODICE");
    Frames[4].Content = PAN_CONTROCODICE;
    PAN_CONTROCODICE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTROCODICE.VS = MainFrm.VisualStyleList;
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "345F0879-AFB9-4018-8D19-F2AC9C4F6F38");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 364, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTROCODICE.InitStatus = 2;
    PAN_CONTROCODICE_Init();
    PAN_CONTROCODICE_InitFields();
    PAN_CONTROCODICE_InitQueries();
    TAB_TABS.SetItem(3, Frames[4], 0, "", "Controlli Codice", "");
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
      if (CmdIdx==MyGlb.CMD_REGISLEMODI1+BaseCmdLinIdx)
      {
        UPDATE();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCLARIGSE1+BaseCmdLinIdx)
      {
        DELETE();
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
      if (IMDB.TblModified(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CODICILIBERI_VALOCONTCOD2();
      }
      PAN_TIPICODICE.UpdatePanel(MainFrm);
      PAN_VALORICODICE.UpdatePanel(MainFrm);
      PAN_CONTROCODICE.UpdatePanel(MainFrm);
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
    return (obj instanceof CodiciLiberi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciLiberi.class.getName() : (Glb.ClassWithPackage(CodiciLiberi.class) ? CodiciLiberi.class.getName().substring(CodiciLiberi.class.getPackage().getName().length() + 1) : CodiciLiberi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Riempi IMDB
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_VALCONCODDEL();
      RIEMPIIMDB_VACOCOININSE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // VALORI CONTROLLO CODICI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VALCONCODDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI);
  }

  // **********************************************************************
  // VALORI CONTROLLO CODICI: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VACOCOININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE_CONTROLLO as VALCONCOCOCO, ");
    SQL.append("  A.TIPO_CODICE as VALCONCOTICO, ");
    SQL.append("  A.VALORE_CODICE as VALCONCOVACO, ");
    SQL.append("  CASE WHEN B.TIPO_VALORE = 'SI' OR B.TIPO_VALORE = 'NO' THEN A.VALORE_CONTROLLO ELSE NULL END as ITCCTVSOTCCT, ");
    SQL.append("  CASE WHEN NVL(B.TIPO_VALORE, '-1') <> 'SI' AND NVL(B.TIPO_VALORE, '-1') <> 'NO' THEN A.VALORE_CONTROLLO ELSE NULL END as INVTCCTV1SAN, ");
    SQL.append("  to_number(NULL) as NULL1 ");
    SQL.append("from ");
    SQL.append("  VALORI_CONTROLLO_CODICI A, ");
    SQL.append("  TIPI_CONTROLLO_CODICI B ");
    SQL.append("where (A.TIPO_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.VALORE_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_CODICE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.CODICE = A.CODICE_CONTROLLO) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE_CONTROLLO ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0);
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE,0,RS.Get(3));
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO,0,RS.Get(4));
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL,0,RS.Get(5));
      IMDB.set_Value(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI,IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG,0,RS.Get(6));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // UPDATE
  // **********************************************************************
  public int UPDATE ()
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
      // UPDATE Body
      // Corpo Procedura
      // 
      PAN_CONTROCODICE.PanelCommand(Glb.PCM_UPDATE);
      IMDB.TblMoveFirst (IMDBDef8.PQRY_VALOCONTCOD2_RS, 0);
      while (!IMDB.Eof(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0))
      {
        if (IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, 0).equals((new IDVariant(1)), true))
        {
          try
          {
            IDVariant v_TIPOVAL = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO_VALORE as TIPCONCOTIVA ");
            SQL.append("from ");
            SQL.append("  TIPI_CONTROLLO_CODICI A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_TIPOVAL = QV.Get("TIPCONCOTIVA", IDVariant.STRING) ;
            }
            QV.Close();
            SQL = new StringBuffer();
            SQL.append("insert into VALORI_CONTROLLO_CODICI ");
            SQL.append("( ");
            SQL.append("  TIPO_CODICE, ");
            SQL.append("  VALORE_CODICE, ");
            SQL.append("  CODICE_CONTROLLO, ");
            SQL.append("  VALORE_CONTROLLO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_CODICE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  CASE WHEN " + IDL.CSql(v_TIPOVAL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI' OR " + IDL.CSql(v_TIPOVAL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'NO' THEN NVL(" + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') ELSE " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " END ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
            PAN_CONTROCODICE.SetModified(MainFrm);
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, 0).equals((new IDVariant(2)), true))
        {
          try
          {
            IDVariant v_TIPOVAL = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO_VALORE as TIPCONCOTIVA ");
            SQL.append("from ");
            SQL.append("  TIPI_CONTROLLO_CODICI A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_TIPOVAL = QV.Get("TIPCONCOTIVA", IDVariant.STRING) ;
            }
            QV.Close();
            SQL = new StringBuffer();
            SQL.append("update VALORI_CONTROLLO_CODICI set ");
            SQL.append("  VALORE_CONTROLLO = CASE WHEN " + IDL.CSql(v_TIPOVAL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI' OR " + IDL.CSql(v_TIPOVAL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'NO' THEN NVL(" + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') ELSE " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " END ");
            SQL.append("where (TIPO_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (VALORE_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_CODICE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CODICE_CONTROLLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
            PAN_CONTROCODICE.SetModified(MainFrm);
            return 0;
          }
        }
        IMDB.TblMoveNext(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0);
      }
      PAN_CONTROCODICE.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "UPDATE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DELETE
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DELETE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DELETE Body
      // Corpo Procedura
      // 
      try
      {
        SQL = new StringBuffer();
        SQL.append("delete from VALORI_CONTROLLO_CODICI ");
        SQL.append("where (TIPO_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_TIPO_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (VALORE_CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CODICE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CODICE_CONTROLLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_CODICE_CONTROLLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage(new IDVariant(e3.getMessage())); 
      }
      PAN_CONTROCODICE.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "DELETE", _e);
      return -1;
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
      // PAN_CONTROCODICE.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_CONTROCODICE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_CONTROCODICE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Codice On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPICODICE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPICODICE);
      // 
      // Tipi Codice On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_TIPICODICE.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPICODICE_DESCRIZIONE1,(new IDVariant(PAN_TIPICODICE.FieldText(PFL_TIPICODICE_DESCRIZIONE1))).stringValue()); 
      if (PAN_TIPICODICE.IsNewRow())
      {
        PAN_TIPICODICE.SetFlags (Glb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPICODICE.SetFlags (Glb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "TipiCodiceOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Codice On Database Error Event
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
  private void PAN_TIPICODICE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPICODICE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Codice On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "TipiCodiceOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Codice Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_VALORICODICE_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valori Codice Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_TIPO_CODICE, 0, IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ValoriCodiceBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Codice On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALORICODICE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VALORICODICE);
      // 
      // Valori Codice On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VALORICODICE.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORICODICE_DESCRIZIONE,(new IDVariant(PAN_VALORICODICE.FieldText(PFL_VALORICODICE_DESCRIZIONE))).stringValue()); 
      if (PAN_VALORICODICE.IsNewRow())
      {
        PAN_VALORICODICE.SetFlags (Glb.OBJ_FIELD, PFL_VALORICODICE_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VALORICODICE.SetFlags (Glb.OBJ_FIELD, PFL_VALORICODICE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ValoriCodiceOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Codice On Database Error Event
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
  private void PAN_VALORICODICE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VALORICODICE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Valori Codice On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ValoriCodiceOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tabs Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TABS_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tabs Change Page Event Body
      // Procedure Body
      // 
      if (PreviousPage.equals((new IDVariant(PAN_TIPICODICE.FrIndex)), true) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Selezionare un codice", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
      PAN_VALORICODICE.set_FieldText(PFL_VALORICODICE_LABEL1, IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0)), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_DESCRIZIONE, 0)).stringValue());
      if (new IDVariant(TAB_TABS.SelectedPageIndex()).equals((new IDVariant(PAN_CONTROCODICE.FrIndex)), true) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_CODICE, 0)))
      {
        IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
        v_ERR1 = (new IDVariant("Selezionare un valore"));
        MainFrm.set_AlertMessage(v_ERR1); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
      RiempiIMDB();
      PAN_CONTROCODICE.set_FieldText(PFL_CONTROCODICE_LABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef8.PQRY_TIPICODICE2, IMDBDef8.PQSL_TIPICODICE2_TIPO, 0)), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_CODICE, 0)), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_VALOTIPICOD2, IMDBDef8.PQSL_VALOTIPICOD2_DESCRIZIONE, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "TabsChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Controlli Codice On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_CONTROCODICE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CONTROCODICE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Controlli Codice On Database Error Body
      // Corpo Procedura
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ControlliCodiceOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Controlli Codice On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTROCODICE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTROCODICE);
      // 
      // Controlli Codice On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_CONTROCODICE.IsNewRow())
      {
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((new IDVariant(PAN_CONTROCODICE.FieldText(PFL_CONTROCODICE_TIPOVALORE))).equals((new IDVariant("SI")), true) || (new IDVariant(PAN_CONTROCODICE.FieldText(PFL_CONTROCODICE_TIPOVALORE))).equals((new IDVariant("NO")), true))
      {
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTROCODICE.SetFlags (Glb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ControlliCodiceOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Controlli Codice On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CONTROCODICE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Codice On Updating Row Body
      // Corpo Procedura
      // 
      // if (Column.equals((new IDVariant(PFL_CONTROCODICE_TIPOCONTROLL)), true) && FieldWasModified.booleanValue())
      // {
      // }
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, 0, (new IDVariant(1)));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_VALCONCOINAG, 0, (new IDVariant(2)));
      }
      if ((new IDVariant(PAN_CONTROCODICE.FieldText(PFL_CONTROCODICE_TIPOVALORE))).equals((new IDVariant("SI")), true) || (new IDVariant(PAN_CONTROCODICE.FieldText(PFL_CONTROCODICE_TIPOVALORE))).equals((new IDVariant("NO")), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_VACOCOVACOVL, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_VALOCONTCOD2, IMDBDef8.PQSL_VALOCONTCOD2_VALORE_CONTROLLO, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ControlliCodiceOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Controlli Codice After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CONTROCODICE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Codice After Find Body
      // Corpo Procedura
      // 
      // RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ControlliCodiceAfterFind", _e);
    }
  }

  // **********************************************************************
  // Controlli Codice On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CONTROCODICE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Codice On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true))
      {
        RiempiIMDB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciLiberi", "ControlliCodiceOnCommand", _e);
    }
  }

  // **********************************************************************
  // VALORI CONTROLLO CODICI
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CODICILIBERI_VALOCONTCOD2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_VALOCONTCOD2_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 1, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 2, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 3, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 4, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_VALOCONTCOD2_RS, 5, 0, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0);
      if (IMDB.Eof(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_VALORI_CONTROLLO_CODICI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_VALOCONTCOD2_RS, 0);
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
  private void TAB_TABS_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TABS_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPICODICE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPICODICE, Cancel);
    // Stub
  }

  private void PAN_TIPICODICE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPICODICE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPICODICE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPICODICE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALORICODICE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALORICODICE, Cancel);
    // Stub
  }

  private void PAN_VALORICODICE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VALORICODICE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VALORICODICE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALORICODICE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTROCODICE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTROCODICE, Cancel);
    // Stub
  }

  private void PAN_CONTROCODICE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTROCODICE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CONTROCODICE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CONTROCODICE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTROCODICE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPICODICE_Init()
  {

    PAN_TIPICODICE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPICODICE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPICODICE.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_TIPICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, "B5A3EB19-62A5-4245-A3AC-3342E5804F51");
    PAN_TIPICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, "Codice");
    PAN_TIPICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, "");
    PAN_TIPICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_TIPICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, "BF78371D-4D5D-488D-BEDD-5135DD38558A");
    PAN_TIPICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, "Descrizione");
    PAN_TIPICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, "");
    PAN_TIPICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, "C4A17903-4CAD-4FDF-9470-D4C9877CC39D");
    PAN_TIPICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, "Acronimo");
    PAN_TIPICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, "");
    PAN_TIPICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPICODICE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_LIST, 32);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_FORM, 40, 4, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_FORM, 40);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_CODICE1, MyGlb.PANEL_FORM, "Cod.");
    PAN_TIPICODICE.SetFieldPage(PFL_TIPICODICE_CODICE1, -1, -1);
    PAN_TIPICODICE.SetFieldPanel(PFL_TIPICODICE_CODICE1, PPQRY_TIPICODICE2, "A.TIPO", "TIPO", 1, 3, 0, -13997);
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_LIST, 48, 36, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 488, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_FORM, 3);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPICODICE.SetFieldPage(PFL_TIPICODICE_DESCRIZIONE1, -1, -1);
    PAN_TIPICODICE.SetFieldPanel(PFL_TIPICODICE_DESCRIZIONE1, PPQRY_TIPICODICE2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_LIST, 568, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_LIST, 72);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_LIST, 1);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_LIST, "Acronimo");
    PAN_TIPICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_FORM, 4, 84, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_FORM, 72);
    PAN_TIPICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_FORM, 1);
    PAN_TIPICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICODICE_ACRONIMO, MyGlb.PANEL_FORM, "Acronimo");
    PAN_TIPICODICE.SetFieldPage(PFL_TIPICODICE_ACRONIMO, -1, -1);
    PAN_TIPICODICE.SetFieldPanel(PFL_TIPICODICE_ACRONIMO, PPQRY_TIPICODICE2, "A.ACRONIMO", "ACRONIMO", 5, 3, 0, -13997);
  }

  private void PAN_TIPICODICE_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPICODICE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPICODICE.SetIMDB(IMDB, "PQRY_TIPICODICE2", true);
    PAN_TIPICODICE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ACRONIMO as ACRONIMO ");
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_CODICE A ");
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO ");
    PAN_TIPICODICE.SetQuery(PPQRY_TIPICODICE2, 5, SQL, -1, "");
    PAN_TIPICODICE.SetQueryDB(PPQRY_TIPICODICE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICODICE.SetMasterTable(0, "TIPI_CODICE");
    PAN_TIPICODICE.AddToSortList(PFL_TIPICODICE_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPICODICE.Status() == 2)
    {
      int oldListQBE = PAN_TIPICODICE.iUseListQBE;
      PAN_TIPICODICE.iUseListQBE = 0;
      PAN_TIPICODICE.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPICODICE.PanelCommand(Glb.PCM_FIND);
      PAN_TIPICODICE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VALORICODICE_Init()
  {

    PAN_VALORICODICE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALORICODICE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VALORICODICE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_VALORICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, "1FFE963F-B0B8-416E-A2B6-CB0810366A2C");
    PAN_VALORICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, "TIPO CODICE");
    PAN_VALORICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, "");
    PAN_VALORICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VALORICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VALORICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, "C474570E-5EBD-49AA-B7C9-D844EDF9B36B");
    PAN_VALORICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, "Codice");
    PAN_VALORICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, "");
    PAN_VALORICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VALORICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, "474B00F9-635B-45BF-A5EE-CF1BDB1129A2");
    PAN_VALORICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, "Descrizione");
    PAN_VALORICODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, "");
    PAN_VALORICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VALORICODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, "1A0403BF-7316-4C91-AC38-9F0594C22342");
    PAN_VALORICODICE.set_Header(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, "");
    PAN_VALORICODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.VIS_ETICHEGRASSE);
    PAN_VALORICODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VALORICODICE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_LIST, 76);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_LIST, 1);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_LIST, "TIPO CODICE");
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_FORM, 76);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_FORM, 1);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_TIPOCODICE1, MyGlb.PANEL_FORM, "TP. CODICE");
    PAN_VALORICODICE.SetFieldPage(PFL_VALORICODICE_TIPOCODICE1, -1, -1);
    PAN_VALORICODICE.SetFieldPanel(PFL_VALORICODICE_TIPOCODICE1, PPQRY_VALOTIPICOD2, "A.TIPO_CODICE", "TIPO_CODICE", 1, 3, 0, -13997);
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_LIST, 0, 80, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_FORM, 32, 8, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VALORICODICE.SetFieldPage(PFL_VALORICODICE_CODICE, -1, -1);
    PAN_VALORICODICE.SetFieldPanel(PFL_VALORICODICE_CODICE, PPQRY_VALOTIPICOD2, "A.CODICE", "CODICE", 5, 10, 0, -13997);
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_LIST, 84, 80, 520, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 32, 484, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_VALORICODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORICODICE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VALORICODICE.SetFieldPage(PFL_VALORICODICE_DESCRIZIONE, -1, -1);
    PAN_VALORICODICE.SetFieldPanel(PFL_VALORICODICE_DESCRIZIONE, PPQRY_VALOTIPICOD2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 300, 0, -13997);
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_LIST, 0, 4, 604, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_LIST, 2);
    PAN_VALORICODICE.SetRect(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_FORM, 4, 2, 548, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORICODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_VALORICODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORICODICE_LABEL1, MyGlb.PANEL_FORM, 2);
    PAN_VALORICODICE.SetFieldPage(PFL_VALORICODICE_LABEL1, -1, -1);
    PAN_VALORICODICE.SetFieldPanel(PFL_VALORICODICE_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
  }

  private void PAN_VALORICODICE_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALORICODICE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VALORICODICE.SetIMDB(IMDB, "PQRY_VALOTIPICOD2", true);
    PAN_VALORICODICE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_CODICE as TIPO_CODICE, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VALORI_TIPI_CODICE A ");
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_CODICE = ~~PQRY_TIPICODICE2.TIPO~~) ");
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORICODICE.SetQuery(PPQRY_VALOTIPICOD2, 5, SQL, -1, "");
    PAN_VALORICODICE.SetQueryDB(PPQRY_VALOTIPICOD2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORICODICE.SetMasterTable(0, "VALORI_TIPI_CODICE");
    PAN_VALORICODICE.AddToSortList(PFL_VALORICODICE_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALORICODICE.Status() == 2)
    {
      int oldListQBE = PAN_VALORICODICE.iUseListQBE;
      PAN_VALORICODICE.iUseListQBE = 0;
      PAN_VALORICODICE.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALORICODICE.PanelCommand(Glb.PCM_FIND);
      PAN_VALORICODICE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONTROCODICE_Init()
  {

    PAN_CONTROCODICE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTROCODICE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTROCODICE.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, "3064757D-FE8E-43A8-BCD8-2B8D1BA3078A");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, "26B90A73-FBD4-4754-A0FF-F6379E6C15F7");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, "Tipo Controllo");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, "497ABEEA-4290-4B47-8E5E-CA8EEE6AC195");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, "VALORE CONTROLLO Checkbox");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.VIS_CHECKSTYLE);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, "008634D5-FC2D-4F24-B37C-232AE7CD61F0");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, "Valore libero");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, "Valore");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, "66393787-6CBB-4C2E-974A-B6982D58DF7B");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, "TIPO CODICE");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, "F7962639-1341-4202-B409-BF81B1254DE3");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, "VALORE CODICE");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, "590A1DCC-0BC1-4F5B-91D0-645168B9754D");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, "Tipo Valore");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, "9E80A02B-33A4-4919-B7F1-4157CCB154DA");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, "Inserimento Aggiornamento");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, "");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROCODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, "54E756BC-27E2-471A-A3BD-583FBAA022DB");
    PAN_CONTROCODICE.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, "Valore");
    PAN_CONTROCODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, "Valore");
    PAN_CONTROCODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_CONTROCODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CONTROCODICE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_LIST, 0, 4, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_FORM, 8, 14, 592, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_LABEL, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_LIST, 0, 84, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_LIST, 120);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_LIST, "Tipo Controllo");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_FORM, 4, 42, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_FORM, 120);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCONTROLL, MyGlb.PANEL_FORM, "Tipo Controllo");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_TIPOCONTROLL, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_TIPOCONTROLL, PPQRY_VALOCONTCOD2, "A.CODICE_CONTROLLO", "CODICE_CONTROLLO", 1, 3, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_LIST, 292, 84, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_LIST, 180);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_LIST, "V. C. C.");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_FORM, 4, 90, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_FORM, 180);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALOCONTCHEC, MyGlb.PANEL_FORM, "VALORE CONTROLLO Checkbox");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_VALOCONTCHEC, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_VALOCONTCHEC, PPQRY_VALOCONTCOD2, "A.VALORE_CONTROLLO", "VALORE_CONTROLLO", 5, 5, 0, -13997);
    PAN_CONTROCODICE.SetValueListItem(PFL_CONTROCODICE_VALOCONTCHEC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CONTROCODICE.SetValueListItem(PFL_CONTROCODICE_VALOCONTCHEC, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_LIST, 316, 84, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_LIST, 120);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_LIST, "Valore libero");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_FORM, 4, 66, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_FORM, 120);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELIBERO, MyGlb.PANEL_FORM, "Valore libero");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_VALORELIBERO, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_VALORELIBERO, PPQRY_VALOCONTCOD2, "A.VACOCOVACOVL", "VACOCOVACOVL", 5, 5, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_LIST, 140, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_LIST, 80);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_LIST, "TIPO CODICE");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_FORM, 4, 90, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_FORM, 80);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOCODICE, MyGlb.PANEL_FORM, "TIPO CODICE");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_TIPOCODICE, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_TIPOCODICE, PPQRY_VALOCONTCOD2, "A.TIPO_CODICE", "TIPO_CODICE", 1, 3, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_LIST, 140, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_LIST, 96);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_LIST, "VALORE CODICE");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_FORM, 4, 114, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_FORM, 96);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORECODICE, MyGlb.PANEL_FORM, "VALORE CODICE");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_VALORECODICE, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_VALORECODICE, PPQRY_VALOCONTCOD2, "A.VALORE_CODICE", "VALORE_CODICE", 5, 10, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_LIST, 424, 84, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_LIST, 220);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_LIST, "Tipo Valore");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_FORM, 4, 90, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_FORM, 220);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_TIPOVALORE, MyGlb.PANEL_FORM, "Tipo Valore");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_TIPOVALORE, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_TIPOVALORE, PPQRY_TIPICONTCODI, "A.TIPO_VALORE", "TIPCONCOTIVA", 5, 5, 0, -13997);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_LIST, 348, 84, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_LIST, 172);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_LIST, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_LIST, "Inserimento Aggiornamento");
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_FORM, 4, 114, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_FORM, 172);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_FORM, 1);
    PAN_CONTROCODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_INSERIAGGIOR, MyGlb.PANEL_FORM, "Inserimento Aggiornamento");
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_INSERIAGGIOR, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_INSERIAGGIOR, PPQRY_VALOCONTCOD2, "A.VALCONCOINAG", "VALCONCOINAG", 1, 1, 0, -13997);
    PAN_CONTROCODICE.SetValueListItem(PFL_CONTROCODICE_INSERIAGGIOR, (new IDVariant(1)), "1", "", "", -1);
    PAN_CONTROCODICE.SetValueListItem(PFL_CONTROCODICE_INSERIAGGIOR, (new IDVariant(2)), "2", "", "", -1);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_LIST, 292, 48, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_LIST, 0);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_LIST, 2);
    PAN_CONTROCODICE.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_FORM, 292, 42, 60, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROCODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_FORM, 0);
    PAN_CONTROCODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROCODICE_VALORELABEL, MyGlb.PANEL_FORM, 2);
    PAN_CONTROCODICE.SetFieldPage(PFL_CONTROCODICE_VALORELABEL, -1, -1);
    PAN_CONTROCODICE.SetFieldPanel(PFL_CONTROCODICE_VALORELABEL, -1, "", "VALORELABEL", 0, 0, 0, -13997);
  }

  private void PAN_CONTROCODICE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTROCODICE.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_VALORE as TIPCONCOTIVA ");
    SQL.append("from ");
    SQL.append("  TIPI_CONTROLLO_CODICI A ");
    SQL.append("where (A.CODICE = ~~CODICE_CONTROLLO~~) ");
    PAN_CONTROCODICE.SetQuery(PPQRY_TIPICONTCODI, 0, SQL, -1, "");
    PAN_CONTROCODICE.SetQueryDB(PPQRY_TIPICONTCODI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTROCODICE.SetMasterTable(PPQRY_TIPICONTCODI, "TIPI_CONTROLLO_CODICI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPTIPCOCOCO, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPICODIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_CONTROLLO_CODICI A ");
    SQL.append("where (A.CODICE = ~~CODICE_CONTROLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CONTROCODICE.SetQuery(PPQRY_TIPICODICE, 0, SQL, PFL_CONTROCODICE_TIPOCONTROLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPTIPCOCOCO, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPICODIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_CONTROLLO_CODICI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CONTROCODICE.SetQuery(PPQRY_TIPICODICE, 1, SQL, PFL_CONTROCODICE_TIPOCONTROLL, "");
    PAN_CONTROCODICE.SetQueryDB(PPQRY_TIPICODICE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTROCODICE.SetIMDB(IMDB, "PQRY_VALOCONTCOD2", true);
    PAN_CONTROCODICE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_CONTROCODICE.SetQueryIMDB(PPQRY_VALOCONTCOD2, IMDBDef8.PQRY_VALOCONTCOD2_RS, IMDBDef1.TBL_VALORI_CONTROLLO_CODICI);
    JustLoaded = true;
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_TIPOCONTROLL, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO);
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_VALOCONTCHEC, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO);
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_VALORELIBERO, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL);
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_TIPOCODICE, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE);
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_VALORECODICE, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE);
    PAN_CONTROCODICE.SetFieldPrimaryIndex(PFL_CONTROCODICE_INSERIAGGIOR, IMDBDef1.FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG);
    PAN_CONTROCODICE.SetMasterTable(0, "VALORI_CONTROLLO_CODICI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTROCODICE.Status() == 2)
    {
      int oldListQBE = PAN_CONTROCODICE.iUseListQBE;
      PAN_CONTROCODICE.iUseListQBE = 0;
      PAN_CONTROCODICE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTROCODICE.PanelCommand(Glb.PCM_FIND);
      PAN_CONTROCODICE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPICODICE) PAN_TIPICODICE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICODICE) PAN_TIPICODICE_ValidateRow(Cancel);
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_ValidateRow(Cancel);
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPICODICE) PAN_TIPICODICE_DynamicProperties();
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_DynamicProperties();
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICODICE) PAN_TIPICODICE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPICODICE) PAN_TIPICODICE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VALORICODICE) PAN_VALORICODICE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CONTROCODICE) PAN_CONTROCODICE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABS) TAB_TABS_Click(PreviousPage, Cancel);
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
