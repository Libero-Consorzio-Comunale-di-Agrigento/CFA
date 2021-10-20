// **********************************************
// Riepilogo I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RiepilogoIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNINFOFATT_LABEINFOFATT = 0;

  private static int PPQRY_MASTERQUERY5 = 0;


  IDPanel PAN_PANNINFOFATT;
  private static int GRP_IVACOMMERCIA_IVAATTESESI1 = 0;
  private static int GRP_IVACOMMERCIA_IVADEFINITI1 = 1;

  private static int PFL_IVACOMMERCIA_IMPONIBILE1 = 0;
  private static int PFL_IVACOMMERCIA_IVA1 = 1;
  private static int PFL_IVACOMMERCIA_TIPOREGISTR1 = 2;
  private static int PFL_IVACOMMERCIA_TIPOBOLLATO1 = 3;
  private static int PFL_IVACOMMERCIA_TIPOREGISTR2 = 4;
  private static int PFL_IVACOMMERCIA_SERVIZIO1 = 5;
  private static int PFL_IVACOMMERCIA_TIPOBOLLATT1 = 6;
  private static int PFL_IVACOMMERCIA_TIPOBOLLADE1 = 7;

  private static int PPQRY_VISTARIEPIVA = 0;

  private static int PPQRY_T6 = 1;
  private static int PPQRY_T7 = 2;


  IDPanel PAN_IVACOMMERCIA;
  private static int GRP_IVAISTITUZIO_IVAATTESESIG = 0;
  private static int GRP_IVAISTITUZIO_IVADEFINITIV = 1;

  private static int PFL_IVAISTITUZIO_IMPONIBILE = 0;
  private static int PFL_IVAISTITUZIO_IVA = 1;
  private static int PFL_IVAISTITUZIO_TIPOREGISTRS = 2;
  private static int PFL_IVAISTITUZIO_TIPOBOLLATOS = 3;
  private static int PFL_IVAISTITUZIO_TIPOREGISTRO = 4;
  private static int PFL_IVAISTITUZIO_SERVIZIO = 5;
  private static int PFL_IVAISTITUZIO_TIPOBOLLATTE = 6;
  private static int PFL_IVAISTITUZIO_TIPOBOLLADEF = 7;

  private static int PPQRY_IVA11 = 0;

  private static int PPQRY_T04 = 1;
  private static int PPQRY_T5 = 2;


  IDPanel PAN_IVAISTITUZIO;
  private static int PFL_PANNELLOTOT_ETICTOTAIMPO = 0;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP1 = 1;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP2 = 2;
  private static int PFL_PANNELLOTOT_ETICHTOTAIVA = 3;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP4 = 4;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP5 = 5;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP6 = 6;
  private static int PFL_PANNELLOTOT_ETITOTIMPCOM = 7;
  private static int PFL_PANNELLOTOT_ETITOTIMPIST = 8;
  private static int PFL_PANNELLOTOT_ETICHTOTIMPO = 9;
  private static int PFL_PANNELLOTOT_ETITOTIVACOM = 10;
  private static int PFL_PANNELLOTOT_ETITOTIVAIST = 11;
  private static int PFL_PANNELLOTOT_ETICHETOTIVA = 12;
  private static int PFL_PANNELLOTOT_ETICHETTATOT = 13;
  private static int PFL_PANNELLOTOT_ANNOPROGFAT = 14;
  private static int PFL_PANNELLOTOT_NUMERPROGFAT = 15;
  private static int PFL_PANNELLOTOT_TOTOCOMM = 16;
  private static int PFL_PANNELLOTOT_ETICTOTAIMP7 = 17;
  private static int PFL_PANNELLOTOT_ETITOTIVACO1 = 18;
  private static int PFL_PANNELLOTOT_ETITOTIVAIS1 = 19;

  private static int PPQRY_PARS82 = 0;


  IDPanel PAN_PANNELLOTOT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS83(IMDB);
    //
    //
    Init_PQRY_MASTERQUERY5(IMDB);
    Init_PQRY_VISTARIEPIVA(IMDB);
    Init_PQRY_IVA11(IMDB);
    Init_PQRY_PARS82(IMDB);
    Init_PQRY_PARS82_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS83(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARS83, 3);
    IMDB.set_TblCode(IMDBDef2.TBL_PARS83, "TBL_PARS83");
    IMDB.set_FldCode(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGANPRFA, "NOMOGGANPRFA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGANPRFA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, "NOMOGGNUPRFA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGNUPRFA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGCODDOC, "NOMOGGCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARS83,IMDBDef2.FLD_PARS83_NOMOGGCODDOC,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARS83, 0);
  }

  private static void Init_PQRY_MASTERQUERY5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_MASTERQUERY5, 0);
    IMDB.set_TblCode(IMDBDef10.PQRY_MASTERQUERY5, "PQRY_MASTERQUERY5");
    IMDB.TblAddNew(IMDBDef10.PQRY_MASTERQUERY5, 0);
  }

  private static void Init_PQRY_VISTARIEPIVA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_VISTARIEPIVA, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_VISTARIEPIVA, "PQRY_VISTARIEPIVA");
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIIVIM, "RECVISRIIVIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIIVIM,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIEIVA, "RECVISRIEIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIEIVA,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIRS, "REVIRIIVTIRS");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIRS,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIBS, "REVIRIIVTIBS");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIBS,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIRE, "REVIRIIVTIRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_REVIRIIVTIRE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIIVSE, "RECVISRIIVSE");
    IMDB.SetFldParams(IMDBDef10.PQRY_VISTARIEPIVA,IMDBDef10.PQSL_VISTARIEPIVA_RECVISRIIVSE,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_VISTARIEPIVA, 0);
  }

  private static void Init_PQRY_IVA11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_IVA11, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_IVA11, "PQRY_IVA11");
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVIMVR, "REVIRIIVIMVR");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVIMVR,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVVIRI, "REVIRIIVVIRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVVIRI,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIRS, "REVIRIIVTIRS");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIRS,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIBS, "REVIRIIVTIBS");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIBS,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIRE, "REVIRIIVTIRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_REVIRIIVTIRE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_RECVISRIIVSE, "RECVISRIIVSE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVA11,IMDBDef10.PQSL_IVA11_RECVISRIIVSE,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_IVA11, 0);
  }

  private static void Init_PQRY_PARS82(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARS82, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARS82, "PQRY_PARS82");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARS82,IMDBDef10.PQSL_PARS82_RENOOGANPRFA, "RENOOGANPRFA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARS82,IMDBDef10.PQSL_PARS82_RENOOGANPRFA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARS82,IMDBDef10.PQSL_PARS82_RENOOGNUPRFA, "RENOOGNUPRFA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARS82,IMDBDef10.PQSL_PARS82_RENOOGNUPRFA,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARS82, 0);
  }

  private static void Init_PQRY_PARS82_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARS82_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARS82_RS, "PQRY_PARS82_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARS82_RS,IMDBDef10.PQSL_PARS82_RENOOGANPRFA, "RENOOGANPRFA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARS82_RS,IMDBDef10.PQSL_PARS82_RENOOGANPRFA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARS82_RS,IMDBDef10.PQSL_PARS82_RENOOGNUPRFA, "RENOOGNUPRFA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARS82_RS,IMDBDef10.PQSL_PARS82_RENOOGNUPRFA,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RiepilogoIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public RiepilogoIVA()
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
    FormIdx = MyGlb.FRM_RIEPILOGOIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DB293431-D3D5-4D61-BA37-EDEB86916EE6";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1408;
    DesignHeight = 454;
    set_Caption(new IDVariant("Riepilogo IVA"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1408;
    Frames[1].Height = 428;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.102804;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1408;
    Frames[2].Height = 44;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pannello INFO Fattura";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 44;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PANNINFOFATT = new IDPanel(w, this, 2, "PAN_PANNINFOFATT");
    Frames[2].Content = PAN_PANNINFOFATT;
    PAN_PANNINFOFATT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNINFOFATT.VS = MainFrm.VisualStyleList;
    PAN_PANNINFOFATT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1408-MyGlb.PAN_OFFS_X, 44-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNINFOFATT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "075F18FA-C13C-4A7F-B336-2DF2FD773FE6");
    PAN_PANNINFOFATT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNINFOFATT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNINFOFATT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNINFOFATT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNINFOFATT.InitStatus = 2;
    PAN_PANNINFOFATT_Init();
    PAN_PANNINFOFATT_InitFields();
    PAN_PANNINFOFATT_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1408;
    Frames[3].Height = 384;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.760417;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 1408;
    Frames[4].Height = 292;
    Frames[4].FormFactor = 0.5;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[4].ChildFrame1 = Frames[5];
    Frames[5].Width = 704;
    Frames[5].Height = 292;
    Frames[5].Caption = "Iva Commerciale";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 292;
    PAN_IVACOMMERCIA = new IDPanel(w, this, 5, "PAN_IVACOMMERCIA");
    Frames[5].Content = PAN_IVACOMMERCIA;
    PAN_IVACOMMERCIA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IVACOMMERCIA.VS = MainFrm.VisualStyleList;
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 704-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "878E1650-F661-413B-B1CE-74DB0DCBD36F");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 672, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IVACOMMERCIA.InitStatus = 2;
    PAN_IVACOMMERCIA_Init();
    PAN_IVACOMMERCIA_InitFields();
    PAN_IVACOMMERCIA_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[4].ChildFrame2 = Frames[6];
    Frames[6].Width = 704;
    Frames[6].Height = 292;
    Frames[6].Caption = "Iva Istituzionale";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 292;
    PAN_IVAISTITUZIO = new IDPanel(w, this, 6, "PAN_IVAISTITUZIO");
    Frames[6].Content = PAN_IVAISTITUZIO;
    PAN_IVAISTITUZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IVAISTITUZIO.VS = MainFrm.VisualStyleList;
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 704-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AB36E6EB-7062-4C41-B8E1-50E6ECFAA855");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 672, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IVAISTITUZIO.InitStatus = 2;
    PAN_IVAISTITUZIO_Init();
    PAN_IVAISTITUZIO_InitFields();
    PAN_IVAISTITUZIO_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[3].ChildFrame2 = Frames[7];
    Frames[7].Width = 1408;
    Frames[7].Height = 92;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "Pannello TOT";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 92;
    Frames[7].MinHeight = Frames[7].Height;
    Frames[7].MaxHeight = Frames[7].Height;
    PAN_PANNELLOTOT = new IDPanel(w, this, 7, "PAN_PANNELLOTOT");
    Frames[7].Content = PAN_PANNELLOTOT;
    PAN_PANNELLOTOT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLOTOT.VS = MainFrm.VisualStyleList;
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1408-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E0CDEC30-9450-45CC-88E6-50598144464A");
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 108, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELLOTOT.InitStatus = 2;
    PAN_PANNELLOTOT_Init();
    PAN_PANNELLOTOT_InitFields();
    PAN_PANNELLOTOT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARS83, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RIEPILOGOIVA_PARS82();
      }
      PAN_PANNINFOFATT.UpdatePanel(MainFrm);
      PAN_IVACOMMERCIA.UpdatePanel(MainFrm);
      PAN_IVAISTITUZIO.UpdatePanel(MainFrm);
      PAN_PANNELLOTOT.UpdatePanel(MainFrm);
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
    return (obj instanceof RiepilogoIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RiepilogoIVA.class.getName() : (Glb.ClassWithPackage(RiepilogoIVA.class) ? RiepilogoIVA.class.getName().substring(RiepilogoIVA.class.getPackage().getName().length() + 1) : RiepilogoIVA.class.getName()));
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

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoIVA", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGCODDOC, 0, new IDVariant());
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
      IDVariant v_VCFATTURA = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VFATCODICDOC = null;
      v_VFATCODICDOC = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  'Fattura' || ' ' || A.NUMERO_DOC || ' del ' || TO_CHAR ( A.D_DATA_DOC,'dd/mm/yyyy') || ' - ' || TO_CHAR ( A.CODICE ) || ' - ' || B.RAGIONE_SOCIALE as CFFNDDTCFDDD, ");
      SQL.append("  A.CODICE_DOC as FATCODICEDOC ");
      SQL.append("from ");
      SQL.append("  FAT A, ");
      SQL.append("  BEN B ");
      SQL.append("where (B.CODICE = A.CODICE) ");
      SQL.append("and   (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCFATTURA = QV.Get("CFFNDDTCFDDD", IDVariant.STRING) ;
        v_VFATCODICDOC = QV.Get("FATCODICEDOC", IDVariant.INTEGER) ;
      }
      QV.Close();
      PAN_PANNINFOFATT.set_FieldText(PFL_PANNINFOFATT_LABEINFOFATT, new IDVariant(v_VCFATTURA).stringValue());
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGCODDOC, 0, new IDVariant(v_VFATCODICDOC));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoIVA", "Load", _e);
    }
  }

  // **********************************************************************
  // Iva Commerciale On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IVACOMMERCIA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IVACOMMERCIA);
      // 
      // Iva Commerciale On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_IVACOMMERCIA.set_ToolTip(Glb.OBJ_FIELD,PFL_IVACOMMERCIA_TIPOBOLLATT1,(new IDVariant(PAN_IVACOMMERCIA.FieldText(PFL_IVACOMMERCIA_TIPOBOLLATT1))).stringValue()); 
      PAN_IVACOMMERCIA.set_ToolTip(Glb.OBJ_FIELD,PFL_IVACOMMERCIA_TIPOBOLLADE1,(new IDVariant(PAN_IVACOMMERCIA.FieldText(PFL_IVACOMMERCIA_TIPOBOLLADE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoIVA", "IvaCommercialeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Iva Istituzionale On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IVAISTITUZIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IVAISTITUZIO);
      // 
      // Iva Istituzionale On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_IVAISTITUZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_IVAISTITUZIO_TIPOBOLLATTE,(new IDVariant(PAN_IVAISTITUZIO.FieldText(PFL_IVAISTITUZIO_TIPOBOLLATTE))).stringValue()); 
      PAN_IVAISTITUZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_IVAISTITUZIO_TIPOBOLLADEF,(new IDVariant(PAN_IVAISTITUZIO.FieldText(PFL_IVAISTITUZIO_TIPOBOLLADEF))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoIVA", "IvaIstituzionaleOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Pannello TOT After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_PANNELLOTOT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pannello TOT After Find Body
      // Corpo Procedura
      // 
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIMPCOM, IDL.Format(IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IMPONIBILE1),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIMPIST, IDL.Format(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IMPONIBILE),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETICHTOTIMPO, IDL.Format(IDL.Add(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IMPONIBILE),(new IDVariant(0))), IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IMPONIBILE1),(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIVACOM, IDL.Format(IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IVA1),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIVAIST, IDL.Format(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IVA),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETICHETOTIVA, IDL.Format(IDL.Add(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IVA),(new IDVariant(0))), IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IVA1),(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETICHETTATOT, IDL.Format(IDL.Add(IDL.Add(IDL.Add(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IMPONIBILE),(new IDVariant(0))), IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IMPONIBILE1),(new IDVariant(0)))), IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IVA),(new IDVariant(0)))), IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IVA1),(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIVACO1, IDL.Format(IDL.Add(IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IMPONIBILE1),(new IDVariant(0))), IDL.NullValue(PAN_IVACOMMERCIA.GetFieldSum(PFL_IVACOMMERCIA_IVA1),(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_PANNELLOTOT.set_FieldText(PFL_PANNELLOTOT_ETITOTIVAIS1, IDL.Format(IDL.Add(IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IMPONIBILE),(new IDVariant(0))), IDL.NullValue(PAN_IVAISTITUZIO.GetFieldSum(PFL_IVAISTITUZIO_IVA),(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoIVA", "PannelloTOTAfterFind", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void RIEPILOGOIVA_PARS82() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARS82_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARS83, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARS83, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARS82_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARS82_RS, 0, IMDBDef2.TBL_PARS83, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARS82_RS, 0, 0, IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARS82_RS, 1, 0, IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARS83, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARS83, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARS83, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARS82_RS, 0);
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
  private void PAN_PANNINFOFATT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNINFOFATT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNINFOFATT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNINFOFATT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNINFOFATT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNINFOFATT);
    // Stub
  }

  private void PAN_PANNINFOFATT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNINFOFATT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNINFOFATT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNINFOFATT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IVACOMMERCIA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IVACOMMERCIA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IVACOMMERCIA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IVACOMMERCIA, Cancel);
    // Stub
  }

  private void PAN_IVACOMMERCIA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IVACOMMERCIA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IVACOMMERCIA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IVACOMMERCIA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IVAISTITUZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IVAISTITUZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IVAISTITUZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IVAISTITUZIO, Cancel);
    // Stub
  }

  private void PAN_IVAISTITUZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IVAISTITUZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IVAISTITUZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IVAISTITUZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PANNELLOTOT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLOTOT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELLOTOT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELLOTOT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLOTOT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELLOTOT);
    // Stub
  }

  private void PAN_PANNELLOTOT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNELLOTOT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLOTOT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLOTOT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNINFOFATT_Init()
  {

    PAN_PANNINFOFATT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNINFOFATT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNINFOFATT.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PANNINFOFATT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, "A0FC08B3-20D5-4FB7-83B9-EB9A6D7D3DD6");
    PAN_PANNINFOFATT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, "Fattura 115/A del 15/12/2015 - 2555 XENO");
    PAN_PANNINFOFATT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.VIS_ETICHEGRASSE);
    PAN_PANNINFOFATT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PANNINFOFATT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNINFOFATT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_LIST, 16, 12, 868, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNINFOFATT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_LIST, 0);
    PAN_PANNINFOFATT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_LIST, 1);
    PAN_PANNINFOFATT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_FORM, 16, 4, 996, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNINFOFATT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_FORM, 0);
    PAN_PANNINFOFATT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNINFOFATT_LABEINFOFATT, MyGlb.PANEL_FORM, 2);
    PAN_PANNINFOFATT.SetFieldPage(PFL_PANNINFOFATT_LABEINFOFATT, -1, -1);
    PAN_PANNINFOFATT.SetFieldPanel(PFL_PANNINFOFATT_LABEINFOFATT, -1, "", "LABEINFOFATT", 0, 0, 0, -13997);
  }

  private void PAN_PANNINFOFATT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNINFOFATT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNINFOFATT.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNINFOFATT.Status() == 2)
    {
      int oldListQBE = PAN_PANNINFOFATT.iUseListQBE;
      PAN_PANNINFOFATT.iUseListQBE = 0;
      PAN_PANNINFOFATT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNINFOFATT.PanelCommand(Glb.PCM_FIND);
      PAN_PANNINFOFATT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IVACOMMERCIA_Init()
  {

    PAN_IVACOMMERCIA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IVACOMMERCIA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, "41F7016D-7FA4-4B70-8A2C-322CACE0A14A");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, "Iva Attesa Esigibilità");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, MyGlb.PANEL_LIST, 208, -9999, 232, 16, 0, 0);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, MyGlb.PANEL_FORM, 0, 159, 476, 61, 0, 0);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, 0, 116);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, 1, 13);
    PAN_IVACOMMERCIA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, 0, 4);
    PAN_IVACOMMERCIA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, 1, 4);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVAATTESESI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, "F10262CF-1AB2-40FE-BF5A-29CEAA71E9A1");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, "IVA Definitiva");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, MyGlb.PANEL_LIST, 440, -9999, 232, 16, 0, 0);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, MyGlb.PANEL_FORM, 0, 195, 476, 61, 0, 0);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, 0, 77);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, 1, 13);
    PAN_IVACOMMERCIA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, 0, 4);
    PAN_IVACOMMERCIA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, 1, 4);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_GROUP, GRP_IVACOMMERCIA_IVADEFINITI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IVACOMMERCIA.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, "34A503A9-52B9-45DB-BA6E-F9EA09FC3C12");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, "Imponibile");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, "B4981273-7650-4AA6-848B-AB22BCABB5B6");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, "IVA");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, "Iva Commerciale o Ist.");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, "A9BCA9A2-408A-4026-96A4-AB0CC7287017");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, "TIPO REGISTRO S");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.VIS_NORMFIELPADR);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, "76141230-7706-4FAB-BFF6-DB06C34C028C");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, "TIPO BOLLATO S");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.VIS_NORMFIELPADR);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, "D64043C6-B3DD-4B2B-8377-BC99A8EAA675");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, "TIPO REGISTRO");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.VIS_NORMFIELPADR);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, "7DBF9D55-3252-452F-92BE-082756F3CAC2");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, "SERVIZIO");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, "41566994-976A-4FF7-9ECC-C7C32AC89AC1");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, "Tipo Bollato");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.VIS_VISULOOUPCF4);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVACOMMERCIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, "21F0A7FE-5B85-43FA-905C-5B94D53CFC99");
    PAN_IVACOMMERCIA.set_Header(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, "Tipo Bollato");
    PAN_IVACOMMERCIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, "");
    PAN_IVACOMMERCIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_IVACOMMERCIA.SetFlags(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IVACOMMERCIA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_LIST, 76);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_LIST, "Imponibile");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_FORM, 4, 40, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_FORM, 76);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IMPONIBILE1, MyGlb.PANEL_FORM, "Imponibile");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_IMPONIBILE1, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_IMPONIBILE1, PPQRY_VISTARIEPIVA, "A.IMPONIBILE", "RECVISRIIVIM", 2, 15, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_LIST, 128, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_LIST, 28);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_LIST, "IVA");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_FORM, 4, 64, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_FORM, 28);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_IVA1, MyGlb.PANEL_FORM, "IVA");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_IVA1, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_IVA1, PPQRY_VISTARIEPIVA, "A.IVA", "RECVISRIEIVA", 2, 15, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_LIST, 208, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_LIST, 108);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_LIST, "TIPO REGISTRO S");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_FORM, 4, 88, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_FORM, 108);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR1, MyGlb.PANEL_FORM, "TIPO REGISTRO S");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_TIPOREGISTR1, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_TIPOREGISTR1, PPQRY_VISTARIEPIVA, "A.TIPO_REGISTRO_S", "REVIRIIVTIRS", 1, 2, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_LIST, 316, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_LIST, 100);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_LIST, "TIPO BOLLATO S");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_FORM, 4, 112, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_FORM, 100);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATO1, MyGlb.PANEL_FORM, "TIPO BOLLATO S");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_TIPOBOLLATO1, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_TIPOBOLLATO1, PPQRY_VISTARIEPIVA, "A.TIPO_BOLLATO_S", "REVIRIIVTIBS", 1, 2, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_LIST, 208, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_LIST, 96);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_FORM, 4, 136, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_FORM, 96);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOREGISTR2, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_TIPOREGISTR2, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_TIPOREGISTR2, PPQRY_VISTARIEPIVA, "A.TIPO_REGISTRO", "REVIRIIVTIRE", 1, 2, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_LIST, 304, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_LIST, "SERVIZIO");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_FORM, 4, 160, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_SERVIZIO1, MyGlb.PANEL_FORM, "SERVIZIO");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_SERVIZIO1, -1, -1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_SERVIZIO1, PPQRY_VISTARIEPIVA, "A.SERVIZIO", "RECVISRIIVSE", 1, 2, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_LIST, 208, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_LIST, 104);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_FORM, 4, 184, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_FORM, 104);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_FORM, 2);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLATT1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_TIPOBOLLATT1, -1, GRP_IVACOMMERCIA_IVAATTESESI1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_TIPOBOLLATT1, PPQRY_T7, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04REGISTDEF", 5, 142, 0, -13997);
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_LIST, 440, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_LIST, 104);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_LIST, 1);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_IVACOMMERCIA.SetRect(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_FORM, 4, 220, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVACOMMERCIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_FORM, 104);
    PAN_IVACOMMERCIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_FORM, 2);
    PAN_IVACOMMERCIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVACOMMERCIA_TIPOBOLLADE1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_IVACOMMERCIA.SetFieldPage(PFL_IVACOMMERCIA_TIPOBOLLADE1, -1, GRP_IVACOMMERCIA_IVADEFINITI1);
    PAN_IVACOMMERCIA.SetFieldPanel(PFL_IVACOMMERCIA_TIPOBOLLADE1, PPQRY_T6, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04REGISTDEF", 5, 142, 0, -13997);
  }

  private void PAN_IVACOMMERCIA_InitQueries()
  {
    StringBuffer SQL;

    PAN_IVACOMMERCIA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04REGISTDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~REVIRIIVTIRE~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~RECVISRIIVSE~~) ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_T6, 0, SQL, -1, "");
    PAN_IVACOMMERCIA.SetQueryDB(PPQRY_T6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVACOMMERCIA.SetMasterTable(PPQRY_T6, "T04");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04REGISTDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~REVIRIIVTIRS~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~REVIRIIVTIBS~~) ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_T7, 0, SQL, -1, "");
    PAN_IVACOMMERCIA.SetQueryDB(PPQRY_T7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVACOMMERCIA.SetMasterTable(PPQRY_T7, "T04");
    PAN_IVACOMMERCIA.SetIMDB(IMDB, "PQRY_VISTARIEPIVA", true);
    PAN_IVACOMMERCIA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPONIBILE as RECVISRIIVIM, ");
    SQL.append("  A.IVA as RECVISRIEIVA, ");
    SQL.append("  A.TIPO_REGISTRO_S as REVIRIIVTIRS, ");
    SQL.append("  A.TIPO_BOLLATO_S as REVIRIIVTIBS, ");
    SQL.append("  A.TIPO_REGISTRO as REVIRIIVTIRE, ");
    SQL.append("  A.SERVIZIO as RECVISRIIVSE ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_RIEPILOGO_IVA A ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~TBL_PARS83.NOMOGGANPRFA~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARS83.NOMOGGNUPRFA~~) ");
    SQL.append("and   (A.ATTIVITA_IST = 'NO') ");
    SQL.append("and   (NOT ((NVL(A.TIPO_REGISTRO, A.TIPO_REGISTRO_S) IS NULL))) ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO_S, ");
    SQL.append("  A.TIPO_BOLLATO_S, ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.SERVIZIO ");
    PAN_IVACOMMERCIA.SetQuery(PPQRY_VISTARIEPIVA, 5, SQL, -1, "");
    PAN_IVACOMMERCIA.SetQueryDB(PPQRY_VISTARIEPIVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVACOMMERCIA.SetMasterTable(0, "VISTA_RIEPILOGO_IVA");
    PAN_IVACOMMERCIA.AddToSortList(PFL_IVACOMMERCIA_TIPOREGISTR1, true);
    PAN_IVACOMMERCIA.AddToSortList(PFL_IVACOMMERCIA_TIPOBOLLATO1, true);
    PAN_IVACOMMERCIA.AddToSortList(PFL_IVACOMMERCIA_TIPOREGISTR2, true);
    PAN_IVACOMMERCIA.AddToSortList(PFL_IVACOMMERCIA_SERVIZIO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IVACOMMERCIA.Status() == 2)
    {
      int oldListQBE = PAN_IVACOMMERCIA.iUseListQBE;
      PAN_IVACOMMERCIA.iUseListQBE = 0;
      PAN_IVACOMMERCIA.PanelCommand(Glb.PCM_SEARCH);
      PAN_IVACOMMERCIA.PanelCommand(Glb.PCM_FIND);
      PAN_IVACOMMERCIA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IVAISTITUZIO_Init()
  {

    PAN_IVAISTITUZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IVAISTITUZIO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, "127134B1-A936-4BD7-89E0-B516C908C17C");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, "Iva Attesa Esigibilità");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, MyGlb.PANEL_LIST, 208, -9999, 232, 16, 0, 0);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, MyGlb.PANEL_FORM, 0, 159, 476, 61, 0, 0);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, 0, 116);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, 1, 13);
    PAN_IVAISTITUZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, 0, 4);
    PAN_IVAISTITUZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, 1, 4);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVAATTESESIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, "3BA11663-8F4D-4ABB-9DC2-19CE306B8ED8");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, "IVA Definitiva");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, MyGlb.VIS_DEFAPANESTYL);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, MyGlb.PANEL_LIST, 440, -9999, 232, 16, 0, 0);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, MyGlb.PANEL_FORM, 0, 195, 476, 61, 0, 0);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, 0, 77);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, 1, 13);
    PAN_IVAISTITUZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, 0, 4);
    PAN_IVAISTITUZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, 1, 4);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_GROUP, GRP_IVAISTITUZIO_IVADEFINITIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IVAISTITUZIO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, "F942A61E-BF18-44E9-BDA4-7DBC48BCCAEC");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, "Imponibile");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, "53FE5347-4FDD-4B15-86F0-3A5D2CEC4085");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, "IVA");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, "VISTA RIEPILOGO IVA (VISTA RIEPILOGO) * If Equal (VISTA RIEPILOGO IVA CODICE DOC (VISTA RIEPILOGO), Nome Oggetto CODICE DOC, 1, -1)");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, "F583848E-8523-4A82-A11D-AC6D476E4669");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, "TIPO REGISTRO S");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.VIS_NORMFIELPADR);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, "CC02194A-C6ED-4371-8C65-79B6C012C392");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, "TIPO BOLLATO S");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.VIS_NORMFIELPADR);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, "2F4F695B-6598-4707-BE8F-2B71ADB88DE1");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, "ACD4C1B0-6622-476B-827B-86AD17825FB5");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, "SERVIZIO");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, "D718DA80-03B9-4FF5-BE05-819B80EBBADD");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, "Tipo Bollato");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.VIS_VISULOOUPCF4);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IVAISTITUZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, "C5B4B7D5-3B07-4D11-A995-5976CFEA2AC7");
    PAN_IVAISTITUZIO.set_Header(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, "Tipo Bollato");
    PAN_IVAISTITUZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, "");
    PAN_IVAISTITUZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.VIS_VISULOOUPCF4);
    PAN_IVAISTITUZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IVAISTITUZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_LIST, 76);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_FORM, 4, 40, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_FORM, 76);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_IMPONIBILE, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_IMPONIBILE, PPQRY_IVA11, "A.IMPONIBILE", "REVIRIIVIMVR", 2, 15, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_LIST, 128, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_LIST, 28);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_LIST, "IVA");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_FORM, 4, 64, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_FORM, 28);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_IVA, MyGlb.PANEL_FORM, "IVA");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_IVA, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_IVA, PPQRY_IVA11, "A.IVA", "REVIRIIVVIRI", 2, 15, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_LIST, 208, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_LIST, 108);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_LIST, "TIPO REGISTRO S");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_FORM, 4, 88, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_FORM, 108);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRS, MyGlb.PANEL_FORM, "TIPO REGISTRO S");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_TIPOREGISTRS, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_TIPOREGISTRS, PPQRY_IVA11, "A.TIPO_REGISTRO_S", "REVIRIIVTIRS", 1, 2, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_LIST, 316, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_LIST, 100);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_LIST, "TIPO BOLLATO S");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_FORM, 4, 112, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_FORM, 100);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATOS, MyGlb.PANEL_FORM, "TIPO BOLLATO S");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_TIPOBOLLATOS, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_TIPOBOLLATOS, PPQRY_IVA11, "A.TIPO_BOLLATO_S", "REVIRIIVTIBS", 1, 2, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_LIST, 208, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_LIST, 96);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 136, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOREGISTRO, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_TIPOREGISTRO, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_TIPOREGISTRO, PPQRY_IVA11, "A.TIPO_REGISTRO", "REVIRIIVTIRE", 1, 2, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_LIST, 304, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_LIST, 64);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_LIST, "SERVIZIO");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_FORM, 4, 160, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_FORM, 64);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_SERVIZIO, MyGlb.PANEL_FORM, "SERVIZIO");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_SERVIZIO, -1, -1);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_SERVIZIO, PPQRY_IVA11, "A.SERVIZIO", "RECVISRIIVSE", 1, 2, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_LIST, 208, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_LIST, 104);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_FORM, 4, 184, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_FORM, 104);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_FORM, 2);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLATTE, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_TIPOBOLLATTE, -1, GRP_IVAISTITUZIO_IVAATTESESIG);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_TIPOBOLLATTE, PPQRY_T5, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04REGISTDEF", 5, 142, 0, -13997);
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_LIST, 440, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_LIST, 104);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_LIST, 1);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_IVAISTITUZIO.SetRect(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_FORM, 4, 220, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IVAISTITUZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_FORM, 104);
    PAN_IVAISTITUZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_FORM, 2);
    PAN_IVAISTITUZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IVAISTITUZIO_TIPOBOLLADEF, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_IVAISTITUZIO.SetFieldPage(PFL_IVAISTITUZIO_TIPOBOLLADEF, -1, GRP_IVAISTITUZIO_IVADEFINITIV);
    PAN_IVAISTITUZIO.SetFieldPanel(PFL_IVAISTITUZIO_TIPOBOLLADEF, PPQRY_T04, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04REGISTDEF", 5, 142, 0, -13997);
  }

  private void PAN_IVAISTITUZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IVAISTITUZIO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04REGISTDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~REVIRIIVTIRE~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~RECVISRIIVSE~~) ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_IVAISTITUZIO.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVAISTITUZIO.SetMasterTable(PPQRY_T04, "T04");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04REGISTDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~REVIRIIVTIRS~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~REVIRIIVTIBS~~) ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_T5, 0, SQL, -1, "");
    PAN_IVAISTITUZIO.SetQueryDB(PPQRY_T5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVAISTITUZIO.SetMasterTable(PPQRY_T5, "T04");
    PAN_IVAISTITUZIO.SetIMDB(IMDB, "PQRY_IVA11", true);
    PAN_IVAISTITUZIO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPONIBILE as REVIRIIVIMVR, ");
    SQL.append("  A.IVA as REVIRIIVVIRI, ");
    SQL.append("  A.TIPO_REGISTRO_S as REVIRIIVTIRS, ");
    SQL.append("  A.TIPO_BOLLATO_S as REVIRIIVTIBS, ");
    SQL.append("  A.TIPO_REGISTRO as REVIRIIVTIRE, ");
    SQL.append("  A.SERVIZIO as RECVISRIIVSE ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_RIEPILOGO_IVA A ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = ~~TBL_PARS83.NOMOGGANPRFA~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARS83.NOMOGGNUPRFA~~) ");
    SQL.append("and   (A.ATTIVITA_IST = 'SI') ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO_S, ");
    SQL.append("  A.TIPO_BOLLATO_S, ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.SERVIZIO ");
    PAN_IVAISTITUZIO.SetQuery(PPQRY_IVA11, 5, SQL, -1, "");
    PAN_IVAISTITUZIO.SetQueryDB(PPQRY_IVA11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IVAISTITUZIO.SetMasterTable(0, "VISTA_RIEPILOGO_IVA");
    PAN_IVAISTITUZIO.AddToSortList(PFL_IVAISTITUZIO_TIPOREGISTRS, true);
    PAN_IVAISTITUZIO.AddToSortList(PFL_IVAISTITUZIO_TIPOBOLLATOS, true);
    PAN_IVAISTITUZIO.AddToSortList(PFL_IVAISTITUZIO_TIPOREGISTRO, true);
    PAN_IVAISTITUZIO.AddToSortList(PFL_IVAISTITUZIO_SERVIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IVAISTITUZIO.Status() == 2)
    {
      int oldListQBE = PAN_IVAISTITUZIO.iUseListQBE;
      PAN_IVAISTITUZIO.iUseListQBE = 0;
      PAN_IVAISTITUZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IVAISTITUZIO.PanelCommand(Glb.PCM_FIND);
      PAN_IVAISTITUZIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANNELLOTOT_Init()
  {

    PAN_PANNELLOTOT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLOTOT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLOTOT.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, "63DC2036-B562-4D8C-9DAF-EA051F191EA7");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, "Totale Imponibile Commerciale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, "66C63C76-7008-44C0-B639-A639B0A46EDB");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, "Totale Imponibile Istituzionale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, "BC23B56B-4C69-4B6E-92B2-8385D8205188");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, "Totale Imponibile:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, "EB5E1391-3AF3-4AD7-B322-A5EF67AB87B8");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, "Totale IVA Commerciale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, "1688091A-BBE2-4A51-9B72-E3C6112C4B6C");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, "Totale IVA Istituzionale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, "E56FE394-0479-479B-9730-ED8885502AB0");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, "Totale IVA:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, "D99541AC-FFF8-490C-BEF7-A0D99BB8F83F");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, "Totale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, "CCBF7ED2-0A92-4680-BD29-C4656DB17BDD");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, "Tot Imp Commerciale");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, "5135E53E-E23E-496E-B150-AB7811DDB65E");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, "Tot Imp Istituzionale");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, "29264D37-482F-4801-89F4-6F035034894D");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, "Tot Imponibile");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, "09F7E04A-FBC2-4AD3-8FCA-9E19690AF1EA");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, "Tot IVA COmm");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, "2386D05F-7B96-4106-80AF-F2C9E2968F0C");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, "Tot IVA IST");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, "2A01FDDA-8C69-489C-959C-D552C8FB132B");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, "Tot IVA");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, "B1AF5DDC-429C-4776-B1CC-3A9140C0E5CE");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, "Tot");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, "D39454FF-7B54-481D-B7AD-7453503CDF91");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, "Anno Prog FAT");
    PAN_PANNELLOTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, "");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, "636628B7-B70C-4658-BC13-81D6268B2227");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, "Numero Prog FAT");
    PAN_PANNELLOTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, "");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, "373312DF-90C0-4CCB-94FA-4BCDBAC5B084");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, "Tot. Commerciale:");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, "BA1C8FE0-FF9E-4FD8-9DCA-906229264285");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, "Tot. Istituzionale:");
    PAN_PANNELLOTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, "");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.VIS_VUOTONORMALE);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, "FBFAECB3-4265-4159-AD87-085D09858835");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, "Tot IVA COmm");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PANNELLOTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, "B0CBF997-B8BA-4DBD-AAED-F9E4E5EA72E7");
    PAN_PANNELLOTOT.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, "Tot IVA IST");
    PAN_PANNELLOTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.VIS_CAMPTOTADISA);
    PAN_PANNELLOTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PANNELLOTOT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_LIST, 24, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_FORM, 24, 8, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMPO, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMPO, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMPO, -1, "", "ETICTOTAIMPO", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_LIST, 32, 24, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_FORM, 28, 32, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP1, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP1, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP1, -1, "", "ETICTOTAIMP1", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_LIST, 40, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_FORM, 28, 56, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP2, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP2, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP2, -1, "", "ETICTOTAIMP2", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_LIST, 32, 24, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_FORM, 348, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTAIVA, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICHTOTAIVA, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICHTOTAIVA, -1, "", "ETICHTOTAIVA", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_LIST, 40, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_FORM, 348, 32, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP4, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP4, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP4, -1, "", "ETICTOTAIMP4", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_LIST, 48, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_FORM, 348, 56, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP5, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP5, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP5, -1, "", "ETICTOTAIMP5", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_LIST, 56, 48, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_FORM, 684, 56, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP6, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP6, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP6, -1, "", "ETICTOTAIMP6", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_LIST, 220, 8, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_FORM, 220, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPCOM, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIMPCOM, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIMPCOM, -1, "", "ETITOTIMPCOM", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_LIST, 228, 16, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_FORM, 220, 32, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIMPIST, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIMPIST, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIMPIST, -1, "", "ETITOTIMPIST", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_LIST, 236, 24, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_FORM, 220, 56, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHTOTIMPO, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICHTOTIMPO, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICHTOTIMPO, -1, "", "ETICHTOTIMPO", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_LIST, 244, 32, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_FORM, 500, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACOM, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIVACOM, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIVACOM, -1, "", "ETITOTIVACOM", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_LIST, 252, 40, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_FORM, 500, 32, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIVAIST, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIVAIST, -1, "", "ETITOTIVAIST", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_LIST, 260, 48, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_FORM, 500, 56, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETOTIVA, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICHETOTIVA, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICHETOTIVA, -1, "", "ETICHETOTIVA", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_LIST, 268, 56, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_FORM, 744, 56, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICHETTATOT, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICHETTATOT, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICHETTATOT, -1, "", "ETICHETTATOT", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_LIST, 92);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_LIST, "Anno Prog FAT");
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_FORM, 4, 80, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_FORM, 92);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ANNOPROGFAT, MyGlb.PANEL_FORM, "Anno Prog FAT");
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ANNOPROGFAT, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ANNOPROGFAT, PPQRY_PARS82, "A.NOMOGGANPRFA", "RENOOGANPRFA", 1, 4, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_LIST, 108);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_LIST, "Numero Prog FAT");
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_FORM, 4, 104, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_FORM, 108);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_NUMERPROGFAT, MyGlb.PANEL_FORM, "Numero Prog FAT");
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_NUMERPROGFAT, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_NUMERPROGFAT, PPQRY_PARS82, "A.NOMOGGNUPRFA", "RENOOGNUPRFA", 1, 5, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_LIST, 40, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_FORM, 632, 8, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_TOTOCOMM, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_TOTOCOMM, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_TOTOCOMM, -1, "", "TOTOCOMM", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_LIST, 48, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_FORM, 632, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETICTOTAIMP7, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETICTOTAIMP7, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETICTOTAIMP7, -1, "", "ETICTOTAIMP7", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_LIST, 252, 40, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_FORM, 744, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVACO1, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIVACO1, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIVACO1, -1, "", "ETITOTIVACO1", 0, 0, 0, -13997);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_LIST, 260, 48, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_LIST, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLOTOT.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_FORM, 744, 32, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLOTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_FORM, 0);
    PAN_PANNELLOTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLOTOT_ETITOTIVAIS1, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLOTOT.SetFieldPage(PFL_PANNELLOTOT_ETITOTIVAIS1, -1, -1);
    PAN_PANNELLOTOT.SetFieldPanel(PFL_PANNELLOTOT_ETITOTIVAIS1, -1, "", "ETITOTIVAIS1", 0, 0, 0, -13997);
  }

  private void PAN_PANNELLOTOT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLOTOT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELLOTOT.SetIMDB(IMDB, "PQRY_PARS82", true);
    PAN_PANNELLOTOT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PANNELLOTOT.SetQueryIMDB(PPQRY_PARS82, IMDBDef10.PQRY_PARS82_RS, IMDBDef2.TBL_PARS83);
    JustLoaded = true;
    PAN_PANNELLOTOT.SetFieldPrimaryIndex(PFL_PANNELLOTOT_ANNOPROGFAT, IMDBDef2.FLD_PARS83_NOMOGGANPRFA);
    PAN_PANNELLOTOT.SetFieldPrimaryIndex(PFL_PANNELLOTOT_NUMERPROGFAT, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA);
    PAN_PANNELLOTOT.SetMasterTable(0, "PARS83");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLOTOT.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLOTOT.iUseListQBE;
      PAN_PANNELLOTOT.iUseListQBE = 0;
      PAN_PANNELLOTOT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLOTOT.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLOTOT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNINFOFATT) PAN_PANNINFOFATT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IVACOMMERCIA) PAN_IVACOMMERCIA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IVAISTITUZIO) PAN_IVAISTITUZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNINFOFATT) PAN_PANNINFOFATT_ValidateRow(Cancel);
    if (SrcObj == PAN_IVACOMMERCIA) PAN_IVACOMMERCIA_ValidateRow(Cancel);
    if (SrcObj == PAN_IVAISTITUZIO) PAN_IVAISTITUZIO_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNINFOFATT) PAN_PANNINFOFATT_DynamicProperties();
    if (SrcObj == PAN_IVACOMMERCIA) PAN_IVACOMMERCIA_DynamicProperties();
    if (SrcObj == PAN_IVAISTITUZIO) PAN_IVAISTITUZIO_DynamicProperties();
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNINFOFATT) PAN_PANNINFOFATT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IVACOMMERCIA) PAN_IVACOMMERCIA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IVAISTITUZIO) PAN_IVAISTITUZIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PANNINFOFATT) PAN_PANNINFOFATT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IVACOMMERCIA) PAN_IVACOMMERCIA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IVAISTITUZIO) PAN_IVAISTITUZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANNELLOTOT) PAN_PANNELLOTOT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
