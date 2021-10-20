// **********************************************
// Dettagli Fatture Spesa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliFattureSpesa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DETTESTRCONT_DISTINTALIQ = 0;
  private static int PFL_DETTESTRCONT_LIQUIDAZIONE = 1;
  private static int PFL_DETTESTRCONT_MANDATO = 2;
  private static int PFL_DETTESTRCONT_IMPORTO1 = 3;
  private static int PFL_DETTESTRCONT_RITENUTE = 4;
  private static int PFL_DETTESTRCONT_DELIBERA = 5;
  private static int PFL_DETTESTRCONT_CAPITOLO = 6;
  private static int PFL_DETTESTRCONT_IMP1 = 7;
  private static int PFL_DETTESTRCONT_DELIMP = 8;
  private static int PFL_DETTESTRCONT_SUBIMP = 9;
  private static int PFL_DETTESTRCONT_DELSUBIMP = 10;
  private static int PFL_DETTESTRCONT_IMPEGNO = 11;
  private static int PFL_DETTESTRCONT_SUBIMPEGNO = 12;
  private static int PFL_DETTESTRCONT_UFFICIO = 13;
  private static int PFL_DETTESTRCONT_QUIETANZA = 14;
  private static int PFL_DETTESTRCONT_INFOQUIETANZ = 15;
  private static int PFL_DETTESTRCONT_DIVERSBENEFI = 16;
  private static int PFL_DETTESTRCONT_DISTINTA = 17;
  private static int PFL_DETTESTRCONT_DESCRIZIONE1 = 18;
  private static int PFL_DETTESTRCONT_TOTALELIQUID = 19;
  private static int PFL_DETTESTRCONT_SOMMAIMPORTO = 20;
  private static int PFL_DETTESTRCONT_TOTALEPAGATO = 21;
  private static int PFL_DETTESTRCONT_SOMMAPAGATO = 22;
  private static int PFL_DETTESTRCONT_PAGATO = 23;
  private static int PFL_DETTESTRCONT_CODICE = 24;
  private static int PFL_DETTESTRCONT_NUMQUIETANZA = 25;
  private static int PFL_DETTESTRCONT_LABEL = 26;

  private static int PPQRY_LIQ21 = 0;


  IDPanel PAN_DETTESTRCONT;
  private static int PFL_RETTIFICHE_DOCUMECOLLEG = 0;
  private static int PFL_RETTIFICHE_IMPORTO = 1;
  private static int PFL_RETTIFICHE_DATAREG = 2;
  private static int PFL_RETTIFICHE_DESCRIZIONE = 3;
  private static int PFL_RETTIFICHE_DOCFAT = 4;

  private static int PPQRY_RETFAT2 = 0;


  IDPanel PAN_RETTIFICHE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM87(IMDB);
    //
    //
    Init_PQRY_LIQ21(IMDB);
    Init_PQRY_RETFAT2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM87(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM87, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM87, "TBL_PARAM87");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMNUMPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMEBENEF, "ROWNAMEBENEF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMEBENEF,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMFATNAC, "ROWNAMFATNAC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM87,IMDBDef2.FLD_PARAM87_ROWNAMFATNAC,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM87, 0);
  }

  private static void Init_PQRY_LIQ21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_LIQ21, 22);
    IMDB.set_TblCode(IMDBDef9.PQRY_LIQ21, "PQRY_LIQ21");
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_DISTINTALIQ, "DISTINTALIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_DISTINTALIQ,5,81,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQCAPITOLO, "LIQCAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQCAPITOLO,5,81,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQPAGATO, "LIQPAGATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQPAGATO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBSUBI, "LIQDELIBSUBI");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBSUBI,5,337,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQIMPEGNO,5,81,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQLIQUIDAZI,5,81,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQMANDATO, "LIQMANDATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQMANDATO,5,47,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQSUBIMPEGN, "LIQSUBIMPEGN");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQSUBIMPEGN,5,81,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBEIMP, "LIQDELIBEIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBEIMP,5,337,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBERA, "LIQDELIBERA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDELIBERA,5,337,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDIVERSBEN, "LIQDIVERSBEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDIVERSBEN,5,103,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDISTINTA, "LIQDISTINTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQDISTINTA,5,52,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQQUIETANZA, "LIQQUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQUFFICIO, "LIQUFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQUFFICIO,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQRITENUTE, "LIQRITENUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQRITENUTE,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_NUMEROLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_DESCRIZIOLIQ, "DESCRIZIOLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_DESCRIZIOLIQ,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQCODICEQTN, "LIQCODICEQTN");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQCODICEQTN,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQNUMENOQTN, "LIQNUMENOQTN");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQNUMENOQTN,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQINFOQUIET, "LIQINFOQUIET");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ21,IMDBDef9.PQSL_LIQ21_LIQINFOQUIET,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_LIQ21, 0);
  }

  private static void Init_PQRY_RETFAT2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_RETFAT2, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_RETFAT2, "PQRY_RETFAT2");
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATIMPORT, "RETFATIMPORT");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFADATAREG, "RETFADATAREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFADATAREG,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATANNRIF, "RETFATANNRIF");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATANNRIF,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATNUMRIF, "RETFATNUMRIF");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATNUMRIF,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATNUMDOC, "RETFATNUMDOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFAFATDESC, "RETFAFATDESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFAFATDESC,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFAFATIMPO, "RETFAFATIMPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFAFATIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATPROGRE, "RETFATPROGRE");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATDOCFAT, "RETFATDOCFAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATDOCFAT,5,122,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFDOCUCOLL, "RETFDOCUCOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFDOCUCOLL,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATCODREC, "RETFATCODREC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT2,IMDBDef9.PQSL_RETFAT2_RETFATCODREC,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_RETFAT2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliFattureSpesa(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliFattureSpesa()
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
    FormIdx = MyGlb.FRM_DETTFATTSPES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AA48E320-5F84-43ED-BEA3-0592BD754E38";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 744;
    DesignHeight = 494;
    set_Caption(new IDVariant("Dettagli Estratto Conto"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 744;
    Frames[1].Height = 468;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.615385;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 744;
    Frames[2].Height = 288;
    Frames[2].Caption = "Dettagli Estratto Conto";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 288;
    PAN_DETTESTRCONT = new IDPanel(w, this, 2, "PAN_DETTESTRCONT");
    Frames[2].Content = PAN_DETTESTRCONT;
    PAN_DETTESTRCONT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTESTRCONT.VS = MainFrm.VisualStyleList;
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F4595511-C48D-4828-AA11-805FCA0EF85F");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 1976, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTESTRCONT.InitStatus = 2;
    PAN_DETTESTRCONT_Init();
    PAN_DETTESTRCONT_InitFields();
    PAN_DETTESTRCONT_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 744;
    Frames[3].Height = 180;
    Frames[3].Caption = "Rettifiche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 180;
    PAN_RETTIFICHE = new IDPanel(w, this, 3, "PAN_RETTIFICHE");
    Frames[3].Content = PAN_RETTIFICHE;
    PAN_RETTIFICHE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIFICHE.VS = MainFrm.VisualStyleList;
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 180-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "855408A0-157A-46BE-BEDA-43356B3D0C83");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIFICHE.InitStatus = 2;
    PAN_RETTIFICHE_Init();
    PAN_RETTIFICHE_InitFields();
    PAN_RETTIFICHE_InitQueries();
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
      PAN_DETTESTRCONT.UpdatePanel(MainFrm);
      PAN_RETTIFICHE.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliFattureSpesa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliFattureSpesa.class.getName() : (Glb.ClassWithPackage(DettagliFattureSpesa.class) ? DettagliFattureSpesa.class.getName().substring(DettagliFattureSpesa.class.getPackage().getName().length() + 1) : DettagliFattureSpesa.class.getName()));
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
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(5)), true))
      {
        PAN_RETTIFICHE.set_Visible((new IDVariant(0)).booleanValue());
      }
      PAN_DETTESTRCONT.set_FieldText(PFL_DETTESTRCONT_LABEL, IDL.Add(IDL.Add(IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, 0), (new IDVariant(" "))), IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "LoadEvent", _e);
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
      UNLOADEVENT_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMEBENEF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMFATNAC, 0, new IDVariant());
  }

  // **********************************************************************
  // Dettagli Estratto Conto On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTESTRCONT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTESTRCONT);
      // 
      // Dettagli Estratto Conto On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_UFFICIO,IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_LIQUFFICIO, 0).stringValue()); 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_QUIETANZA,IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_LIQQUIETANZA, 0).stringValue()); 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_DIVERSBENEFI,IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_LIQDIVERSBEN, 0).stringValue()); 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_DESCRIZIONE1,IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_DESCRIZIOLIQ, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "DettagliEstrattoContoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Estratto Conto After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTESTRCONT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Estratto Conto After Find Event Body
      // Procedure Body
      // 
      SettaImporti();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "DettagliEstrattoContoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIFICHE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIFICHE);
      // 
      // Rettifiche On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_RETTIFICHE.set_ToolTip(Glb.OBJ_FIELD,PFL_RETTIFICHE_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_RETFAT2, IMDBDef9.PQSL_RETFAT2_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "RettificheOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Cmd Info Quietanza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdInfoQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Info Quietanza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_LIQCODICEQTN, 0),IDVariant.FLOAT));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA, 0, IMDB.Value(IMDBDef9.PQRY_LIQ21, IMDBDef9.PQSL_LIQ21_LIQNUMENOQTN, 0));
      MainFrm.Show(MyGlb.FRM_INFOQUIETANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "CmdInfoQuietanza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImporti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMAIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMAPAGATO = new IDVariant(0,IDVariant.DECIMAL);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Setta Importi Body
      // Procedure Body
      // 
      C2 = PAN_DETTESTRCONT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_DETTESTRCONT.GotoFirst();
      while (!PAN_DETTESTRCONT.RSEOF())
      {
        if (!(IDL.IsNull(C2.Get("NUMEROLIQ"))))
        {
          v_SOMMAIMPORTO = IDL.Add(v_SOMMAIMPORTO, IDL.NullValue(C2.Get("LIQIMPORTO"),(new IDVariant(0))));
          v_SOMMAPAGATO = new IDVariant(IDL.Add(v_SOMMAPAGATO, IDL.NullValue(C2.Get("LIQPAGATO"),(new IDVariant(0)))),IDVariant.DECIMAL);
        }
        PAN_DETTESTRCONT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_DETTESTRCONT.set_FieldText(PFL_DETTESTRCONT_SOMMAIMPORTO, IDL.ToString(IDL.NullValue(v_SOMMAIMPORTO,(new IDVariant(0)))).stringValue());
      PAN_DETTESTRCONT.set_FieldText(PFL_DETTESTRCONT_SOMMAPAGATO, IDL.ToString(IDL.NullValue(v_SOMMAPAGATO,(new IDVariant(0)))).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureSpesa", "SettaImporti", _e);
      return -1;
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
  private void PAN_DETTESTRCONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTESTRCONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTESTRCONT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTESTRCONT, Cancel);
    // Stub
  }

  private void PAN_DETTESTRCONT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTESTRCONT_INFOQUIETANZ)
    {
      this.IdxPanelActived = this.PAN_DETTESTRCONT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdInfoQuietanza();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTESTRCONT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTESTRCONT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTESTRCONT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_RETTIFICHE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIFICHE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RETTIFICHE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RETTIFICHE, Cancel);
    // Stub
  }

  private void PAN_RETTIFICHE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RETTIFICHE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIFICHE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_RETFAT2, IMDBDef9.PQSL_RETFAT2_RETFADATAREG, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_RETFAT2, IMDBDef9.PQSL_RETFAT2_RETFADATAREG, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_RETTIFICHE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTESTRCONT_Init()
  {

    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, "B387970E-AAAF-4685-B507-EB03848E9635");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, "Distinta Liq.");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, "2402ADED-BA3F-4C02-9827-D256EC3AA527");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, "Liquidazione");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, "7E2D1DCE-E0F6-4477-B81D-034C86445158");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, "Mandato");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "E47485B5-A79C-4A37-8A42-E095FD29F1A6");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "Importo");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, "3B6548D1-D1A1-4F27-95B1-7849C937C348");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, "Ritenute");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, "443005AE-7A51-41E0-B7EA-7A8CAA1F62BE");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, "Delibera");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "8E07CBA1-FBC5-41AE-AB04-983544F99239");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "Capitolo");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, "6D57E084-6792-461B-9D4A-032AAA2BCB0B");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, "Imp");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, "49038671-091A-476F-9416-F6799808A782");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, "DelImp");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, "4187CE57-0E18-427D-A59A-DAD69DDD809D");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, "Subimp");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, "580672A9-B382-4F68-A61D-CC2C64795C5D");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, "Delsubimp");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, "307C2AF5-CB38-4102-B1F2-20EAE2A75F79");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, "Impegno");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, "EC6D25DD-0E9D-4413-9B54-F03CB6D5BE16");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, "Subimpegno");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "222BA6B1-FE88-4819-B02D-9A0CC3914C7C");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "Ufficio");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "CB012582-0781-4730-BB19-54383A415601");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "Quietanza");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, "B2A6BD26-CCFE-4F7B-9C6F-A4337E34FF00");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, " ");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, "513F103A-4973-4E45-A779-15771CA36729");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "F3083F11-F17C-4E2A-96E2-5A59E718582E");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "Distinta");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "1D17B73F-214C-4791-BD8F-BEE77A014A93");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "Descrizione");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, "225B7F05-974E-4DFB-8055-0E407F2D5BD1");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, "Totale Liquidato");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, "CF40BD5A-AA4A-4E60-84B9-69F6C25085BC");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, "DDCFA0B4-18E6-4856-83D7-84E4BEA70AD7");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, "Totale Pagato");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, "63440010-93D4-4560-9713-D703B1A2E5A2");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, "BAF33F60-3E6A-4913-BD8D-050171CA3D3D");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, "Pagato");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, "E30C398A-062E-45FE-B447-C68681922EEC");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, "CODICE");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "05BDAD00-680F-4918-8B63-36405C36FD52");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, "0AA6C617-81B4-4911-91DB-0AB99C376B6C");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTESTRCONT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_LIST, 0, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_LIST, 84);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_LIST, "Distinta Liq.");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_FORM, 4, 736, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_FORM, 84);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTALIQ, MyGlb.PANEL_FORM, "Distinta Liq.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DISTINTALIQ, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DISTINTALIQ, PPQRY_LIQ21, "A.DISTINTA_LIQ", "DISTINTALIQ", 5, 81, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 88, 68, 80, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 36);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 76, 456, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 24);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Lq.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_LIQUIDAZIONE, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_LIQUIDAZIONE, PPQRY_LIQ21, "A.LIQUIDAZIONE", "LIQLIQUIDAZI", 5, 81, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_LIST, 168, 68, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_LIST, 36);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_FORM, 4, 124, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_FORM, 36);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_MANDATO, MyGlb.PANEL_FORM, "Mnd.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_MANDATO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_MANDATO, PPQRY_LIQ21, "A.MANDATO", "LIQMANDATO", 5, 47, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 288, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 4, 172, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_IMPORTO1, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_IMPORTO1, PPQRY_LIQ21, "A.IMPORTO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_LIST, 392, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_RITENUTE, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_RITENUTE, PPQRY_LIQ21, "A.RITENUTE", "LIQRITENUTE", 2, 15, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_LIST, 496, 68, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_LIST, 36);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_FORM, 4, 220, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_FORM, 36);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIBERA, MyGlb.PANEL_FORM, "Del.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DELIBERA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DELIBERA, PPQRY_LIQ21, "A.DELIBERA", "LIQDELIBERA", 5, 337, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 588, 68, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 52);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 4, 268, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 52);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_CAPITOLO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_CAPITOLO, PPQRY_LIQ21, "A.CAPITOLO", "LIQCAPITOLO", 5, 81, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_LIST, 728, 68, 64, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_LIST, 28);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_LIST, "Imp");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_FORM, 4, 316, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_FORM, 28);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMP1, MyGlb.PANEL_FORM, "Im.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_IMP1, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_IMP1, PPQRY_LIQ21, "A.IMPEGNO", "LIQIMPEGNO", 5, 81, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_LIST, 792, 68, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_LIST, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_LIST, "DelImp");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_FORM, 4, 364, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_FORM, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELIMP, MyGlb.PANEL_FORM, "Del.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DELIMP, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DELIMP, PPQRY_LIQ21, "A.DELIBERA_IMP", "LIQDELIBEIMP", 5, 337, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_LIST, 884, 68, 64, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_LIST, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_LIST, "Subimp");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_FORM, 4, 412, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_FORM, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMP, MyGlb.PANEL_FORM, "Sub.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_SUBIMP, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_SUBIMP, PPQRY_LIQ21, "A.SUBIMPEGNO", "LIQSUBIMPEGN", 5, 81, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_LIST, 948, 68, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_LIST, 60);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_LIST, "Delsubimp");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_FORM, 4, 460, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_FORM, 60);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DELSUBIMP, MyGlb.PANEL_FORM, "Dels.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DELSUBIMP, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DELSUBIMP, PPQRY_LIQ21, "A.DELIBERA_SUBIMP", "LIQDELIBSUBI", 5, 337, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_LIST, 728, 32, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_FORM, 688, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_IMPEGNO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_LIST, 884, 32, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_FORM, 696, 8, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_SUBIMPEGNO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 1040, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 4, 508, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_UFFICIO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_UFFICIO, PPQRY_LIQ21, "A.UFFICIO", "LIQUFFICIO", 5, 60, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 1236, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 4, 532, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_QUIETANZA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_QUIETANZA, PPQRY_LIQ21, "A.QUIETANZA", "LIQQUIETANZA", 5, 40, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_LIST, 1432, 68, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_LIST, 80);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_LIST, " ");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_FORM, 4, 556, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_FORM, 80);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_INFOQUIETANZ, MyGlb.PANEL_FORM, " ");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_INFOQUIETANZ, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_INFOQUIETANZ, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_INFOQUIETANZ, PPQRY_LIQ21, "CASE WHEN (A.NUMENO_QTN IS NULL) THEN '' ELSE 'I' END", "LIQINFOQUIET", 5, 99, 0, -13997);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTESTRCONT.SetValueListItem(PFL_DETTESTRCONT_INFOQUIETANZ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_LIST, 1456, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_LIST, 80);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_LIST, "Diverso Beneficiario");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_FORM, 4, 604, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_FORM, 80);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DIVERSBENEFI, MyGlb.PANEL_FORM, "Diverso Beneficiario");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DIVERSBENEFI, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DIVERSBENEFI, PPQRY_LIQ21, "A.DIVERSO_BEN", "LIQDIVERSBEN", 5, 103, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 1652, 68, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, "Distinta");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 4, 652, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DISTINTA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DISTINTA, PPQRY_LIQ21, "A.DISTINTA", "LIQDISTINTA", 5, 52, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1780, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 700, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DESCRIZIONE1, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DESCRIZIONE1, PPQRY_LIQ21, "A.DESCRIZIONE_LIQ", "DESCRIZIOLIQ", 5, 140, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_LIST, 76, 140, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_FORM, 180, 248, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_TOTALELIQUID, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_TOTALELIQUID, -1, "", "TOTALELIQUID", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 180, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 188, 256, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_SOMMAIMPORTO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_SOMMAIMPORTO, -1, "", "SOMMAIMPORTO", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_LIST, 288, 140, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_FORM, 188, 256, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_TOTALEPAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_TOTALEPAGATO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_TOTALEPAGATO, -1, "", "TOTALEPAGATO", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_LIST, 388, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_FORM, 196, 264, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_SOMMAPAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_SOMMAPAGATO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_SOMMAPAGATO, -1, "", "SOMMAPAGATO", 0, 0, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_LIST, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_FORM, 4, 736, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_FORM, 44);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_PAGATO, MyGlb.PANEL_FORM, "Pag.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_PAGATO, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_PAGATO, PPQRY_LIQ21, "A.PAGATO", "LIQPAGATO", 2, 15, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_FORM, 4, 736, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_CODICE, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_CODICE, PPQRY_LIQ21, "A.CODICE_QTN", "LIQCODICEQTN", 1, 6, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_NUMQUIETANZA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_NUMQUIETANZA, PPQRY_LIQ21, "A.NUMENO_QTN", "LIQNUMENOQTN", 1, 2, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 0, 4, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 0, 0, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_LABEL, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
  }

  private void PAN_DETTESTRCONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTESTRCONT.SetIMDB(IMDB, "PQRY_LIQ21", true);
    PAN_DETTESTRCONT.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DISTINTA_LIQ as DISTINTALIQ, ");
    SQL.append("  A.CAPITOLO as LIQCAPITOLO, ");
    SQL.append("  A.IMPORTO as LIQIMPORTO, ");
    SQL.append("  A.PAGATO as LIQPAGATO, ");
    SQL.append("  A.DELIBERA_SUBIMP as LIQDELIBSUBI, ");
    SQL.append("  A.IMPEGNO as LIQIMPEGNO, ");
    SQL.append("  A.LIQUIDAZIONE as LIQLIQUIDAZI, ");
    SQL.append("  A.MANDATO as LIQMANDATO, ");
    SQL.append("  A.SUBIMPEGNO as LIQSUBIMPEGN, ");
    SQL.append("  A.DELIBERA_IMP as LIQDELIBEIMP, ");
    SQL.append("  A.DELIBERA as LIQDELIBERA, ");
    SQL.append("  A.DIVERSO_BEN as LIQDIVERSBEN, ");
    SQL.append("  A.DISTINTA as LIQDISTINTA, ");
    SQL.append("  A.QUIETANZA as LIQQUIETANZA, ");
    SQL.append("  A.UFFICIO as LIQUFFICIO, ");
    SQL.append("  A.RITENUTE as LIQRITENUTE, ");
    SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMEROLIQ, ");
    SQL.append("  A.DESCRIZIONE_LIQ as DESCRIZIOLIQ, ");
    SQL.append("  A.CODICE_QTN as LIQCODICEQTN, ");
    SQL.append("  A.NUMENO_QTN as LIQNUMENOQTN, ");
    SQL.append("  CASE WHEN (A.NUMENO_QTN IS NULL) THEN '' ELSE 'I' END as LIQINFOQUIET ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESTRATTO_CONTO_DETT_S A ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~TBL_PARAM87.ROWNAMANNPRO~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARAM87.ROWNAMNUMPRO~~) ");
    SQL.append("and   (A.BENEFICIARIO = ~~TBL_PARAM87.ROWNAMEBENEF~~) ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ21, 5, SQL, -1, "");
    PAN_DETTESTRCONT.SetQueryDB(PPQRY_LIQ21, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTESTRCONT.SetMasterTable(0, "ESTRATTO_CONTO_DETT_S");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTESTRCONT.Status() == 2)
    {
      int oldListQBE = PAN_DETTESTRCONT.iUseListQBE;
      PAN_DETTESTRCONT.iUseListQBE = 0;
      PAN_DETTESTRCONT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTESTRCONT.PanelCommand(Glb.PCM_FIND);
      PAN_DETTESTRCONT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_RETTIFICHE_Init()
  {

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "E918430A-22B2-44DB-87D4-7DC6CDA4137E");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "Documento Collegato");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "2D470BD1-9E4E-439F-A961-B1AB169B09CF");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "Importo");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "A94512A6-A292-41EB-899C-42FDA5C79AB6");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "Data Reg.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "0DF9C33D-1A76-4037-A778-0CFDB7441AF3");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "Descrizione");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "F46AF93A-B040-4842-A730-BBE2CCEABECC");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "docFat");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RETTIFICHE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, "Documento Collegato");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 4, 28, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, "Doc. Coll.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DOCUMECOLLEG, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_DOCUMECOLLEG, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DOCUMECOLLEG, PPQRY_RETFAT2, "CASE WHEN (B.NUMERO_DOC IS NULL) THEN '' ELSE B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) END", "RETFDOCUCOLL", 5, 99, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 136, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_IMPORTO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_IMPORTO, PPQRY_RETFAT2, "A.IMPORTO", "RETFATIMPORT", 3, 14, 2, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 236, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DATAREG, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DATAREG, PPQRY_RETFAT2, "A.D_DATA_REG", "RETFADATAREG", 8, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 304, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 124, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DESCRIZIONE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DESCRIZIONE, PPQRY_RETFAT2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, "docFat");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 4, 148, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, "docFat");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DOCFAT, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_DOCFAT, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DOCFAT, PPQRY_RETFAT2, "B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC )", "RETFATDOCFAT", 5, 122, 0, -13997);
  }

  private void PAN_RETTIFICHE_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTIFICHE.SetIMDB(IMDB, "PQRY_RETFAT2", true);
    PAN_RETTIFICHE.set_SetString(MyGlb.MASTER_ROWNAME, "RETFAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as RETFATIMPORT, ");
    SQL.append("  A.D_DATA_REG as RETFADATAREG, ");
    SQL.append("  B.ANNO_RIF as RETFATANNRIF, ");
    SQL.append("  B.NUMERO_RIF as RETFATNUMRIF, ");
    SQL.append("  B.NUMERO_DOC as RETFATNUMDOC, ");
    SQL.append("  B.DESCRIZIONE as RETFAFATDESC, ");
    SQL.append("  B.IMPORTO as RETFAFATIMPO, ");
    SQL.append("  A.PROGRESSIVO as RETFATPROGRE, ");
    SQL.append("  B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) as RETFATDOCFAT, ");
    SQL.append("  CASE WHEN (B.NUMERO_DOC IS NULL) THEN '' ELSE B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) END as RETFDOCUCOLL, ");
    SQL.append("  A.COD_REC as RETFATCODREC ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  RETFAT A, ");
    SQL.append("  FAT B ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_PROG(+) = DECODE(~~TBL_PARAM87.ROWNAMFATNAC~~, 'N', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC)) ");
    SQL.append("and   (B.NUMERO_PROG(+) = DECODE(~~TBL_PARAM87.ROWNAMFATNAC~~, 'N', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC)) ");
    SQL.append("and   ((A.COD_REC IS NULL)) ");
    SQL.append("and   (DECODE(~~TBL_PARAM87.ROWNAMFATNAC~~, 'F', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC) = ~~TBL_PARAM87.ROWNAMANNPRO~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAM87.ROWNAMFATNAC~~, 'F', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC) = ~~TBL_PARAM87.ROWNAMNUMPRO~~) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT2, 5, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_RETFAT2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(0, "RETFAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIFICHE.Status() == 2)
    {
      int oldListQBE = PAN_RETTIFICHE.iUseListQBE;
      PAN_RETTIFICHE.iUseListQBE = 0;
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIFICHE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_ValidateRow(Cancel);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_DynamicProperties();
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
