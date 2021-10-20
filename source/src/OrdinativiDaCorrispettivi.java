// **********************************************
// Ordinativi Da Corrispettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiDaCorrispettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDINDACORRI_CORRISPETTIV = 0;
  private static int GRP_ORDINDACORRI_ORDINATIVI = 1;
  private static int GRP_ORDINDACORRI_ACCERTAMENTI = 2;

  private static int PFL_ORDINDACORRI_BOLLATO = 0;
  private static int PFL_ORDINDACORRI_DAL = 1;
  private static int PFL_ORDINDACORRI_AL = 2;
  private static int PFL_ORDINDACORRI_NEWPANELLAB1 = 3;
  private static int PFL_ORDINDACORRI_NEWPANELABE1 = 4;
  private static int PFL_ORDINDACORRI_BENDEBITORE = 5;
  private static int PFL_ORDINDACORRI_CODICEDEBITO = 6;
  private static int PFL_ORDINDACORRI_DATA = 7;
  private static int PFL_ORDINDACORRI_CAUSALE = 8;
  private static int PFL_ORDINDACORRI_BOLLO = 9;
  private static int PFL_ORDINDACORRI_UFFICIO = 10;
  private static int PFL_ORDINDACORRI_SPESE = 11;
  private static int PFL_ORDINDACORRI_COMMISSIONI = 12;
  private static int PFL_ORDINDACORRI_ALLEGATI = 13;
  private static int PFL_ORDINDACORRI_INFOTESORIER = 14;
  private static int PFL_ORDINDACORRI_NOTE2 = 15;
  private static int PFL_ORDINDACORRI_NOTE1 = 16;
  private static int PFL_ORDINDACORRI_SCEGBENFBUTT = 17;
  private static int PFL_ORDINDACORRI_INFOBENFBUTT = 18;
  private static int PFL_ORDINDACORRI_EMAUVPMDSASC = 19;
  private static int PFL_ORDINDACORRI_IMPUTAECONOM = 20;
  private static int PFL_ORDINDACORRI_CONTROPAPATR = 21;
  private static int PFL_ORDINDACORRI_FATTORDESCRI = 22;
  private static int PFL_ORDINDACORRI_ELABORA = 23;

  private static int PPQRY_ORDINDACORR5 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_BEN = 2;

  private static int PPQRY_T04 = 3;
  private static int PPQRY_T58 = 4;
  private static int PPQRY_T60 = 5;
  private static int PPQRY_T53 = 6;
  private static int PPQRY_TIPISPESMINF = 7;


  IDPanel PAN_ORDINDACORRI;

  // Definition of Global Variables
  private IDVariant END1 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ORDINDACORR3(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR5(IMDB);
    Init_PQRY_ORDINDACORR5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ORDINDACORR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_ORDINDACORR3, 15);
    IMDB.set_TblCode(IMDBDef6.TBL_ORDINDACORR3, "TBL_ORDINDACORR3");
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDACORR3,IMDBDef6.FLD_ORDINDACORR3_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef6.TBL_ORDINDACORR3, 0);
  }

  private static void Init_PQRY_ORDINDACORR5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR5, 15);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR5, "PQRY_ORDINDACORR5");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR5, 0);
  }

  private static void Init_PQRY_ORDINDACORR5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR5_RS, 15);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR5_RS, "PQRY_ORDINDACORR5_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR5_RS,IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiDaCorrispettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiDaCorrispettivi()
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
    FormIdx = MyGlb.FRM_ORDINDACORRI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "998E0914-8663-40EF-8029-06C7BCA17491";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 600;
    DesignHeight = 630;
    set_Caption(new IDVariant("Ordinativi Da Corrispettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 600;
    Frames[1].Height = 604;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Da Corrispettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 604;
    PAN_ORDINDACORRI = new IDPanel(w, this, 1, "PAN_ORDINDACORRI");
    Frames[1].Content = PAN_ORDINDACORRI;
    PAN_ORDINDACORRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINDACORRI.VS = MainFrm.VisualStyleList;
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 600-MyGlb.PAN_OFFS_X, 604-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A1D1E567-9C16-442C-8F8B-D8A7867AF586");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1776, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINDACORRI.InitStatus = 2;
    PAN_ORDINDACORRI_Init();
    PAN_ORDINDACORRI_InitFields();
    PAN_ORDINDACORRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_ORDINDACORR3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINDACORRI_ORDINDACORR5();
      }
      PAN_ORDINDACORRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_ORDINDACORRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINDACORRI_SCEGBENFBUTT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_ORDINDACORRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDINDACORRI_CONTROPAPATR) {
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
    return (obj instanceof OrdinativiDaCorrispettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiDaCorrispettivi.class.getName() : (Glb.ClassWithPackage(OrdinativiDaCorrispettivi.class) ? OrdinativiDaCorrispettivi.class.getName().substring(OrdinativiDaCorrispettivi.class.getPackage().getName().length() + 1) : OrdinativiDaCorrispettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Indicare l'intervallo di date dei corrispettivi", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data degli ordinativi non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NACCDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NACCA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SENZALIV5 = new IDVariant(0,IDVariant.INTEGER);
          v_NORDDA = (new IDVariant());
          v_NACCDA = (new IDVariant());
          v_NORDA = (new IDVariant());
          v_NACCA = (new IDVariant());
          v_SVARACC = (new IDVariant());
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.ORDEMISSCORRISPETTIVI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDAL, 0)), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEAL, 0)), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEDATA, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECAUSA, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLO, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEUFFIC, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_RNEAVPMDSASC, 0), v_NORDDA, v_NORDA, v_NACCDA, v_NACCA, v_SVARACC, ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEBOLLA, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant())), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO, 0).equals((new IDVariant(1)), true))?IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, 0):(new IDVariant())), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMECOMMI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMESPESE, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG, 0), v_NSTATOSIOPE, v_NSUPDISPPURO, v_SENZALIV5);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant v_SIOPE = new IDVariant(0,IDVariant.STRING);
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Elaborazione Eseguita", IDVariant.STRING));
            IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
            v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
            IDVariant v_SENLIVSTRMSG = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>")));
            if (v_NSTATOSIOPE.equals((new IDVariant(1)), true) && !(MainFrm.SIOPEATTIARM.booleanValue()))
            {
              IDVariant v_STRCGE = new IDVariant(0,IDVariant.STRING);
              v_STRCGE = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale", IDVariant.STRING));
              v_SIOPE = IDL.Add(v_STRCGE, (new IDVariant("<BR/>")));
            }
            else
            {
              v_SIOPE = (new IDVariant(""));
            }
            if (v_SENZALIV5.equals((new IDVariant(1)), true))
            {
              IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
              v_STR = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello V"));
              v_SENLIVSTRMSG = IDL.Add(v_STR, (new IDVariant("<BR/>")));
            }
            else
            {
              v_SENLIVSTRMSG = (new IDVariant(""));
            }
            if (v_NORDDA.compareTo(v_NORDA, true)<=0)
            {
              IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
              v_ST = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NORDA)), (new IDVariant("<BR/>")));
            }
            else
            {
              IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
              v_ST = (new IDVariant("Non sono stati emessi Ordinativi ", IDVariant.STRING));
              v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), (new IDVariant("<BR/>")));
            }
            if (v_NACCDA.compareTo(v_NACCA, true)<=0)
            {
              IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
              v_ST = (new IDVariant("Emessi accertamenti da ", IDVariant.STRING));
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.ToString(v_NACCDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NACCA)), (new IDVariant("<BR/>")));
            }
            else
            {
              IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
              v_ST = (new IDVariant("Non sono stati emessi accertamenti", IDVariant.STRING));
              v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), (new IDVariant("<BR/>")));
            }
            if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_ST = new IDVariant(0,IDVariant.STRING);
              v_ST = (new IDVariant("Emesse Variazioni agli Accertamenti ", IDVariant.STRING));
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_ST), IDL.SubStr(v_SVARACC, (new IDVariant(0)), (new IDVariant(2)))), (new IDVariant("<BR/>")));
            }
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_SIOPE), v_SENLIVSTRMSG);
            if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
            }
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti
  // **********************************************************************
  public int SelezionaSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "SelezionaSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Visibilità
  // **********************************************************************
  public int ControllaVisibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlla Visibilità Body
      // Procedure Body
      // 
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(-1)), true))
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO, 0, (new IDVariant(1)));
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO, 0, (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "ControllaVisibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      END1 = (new IDVariant(0));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEALLEG, 0), (new IDVariant("Allegati")), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note 1
  // **********************************************************************
  public int ApriNote1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note 1 Body
      // Procedure Body
      // 
      END1 = (new IDVariant(1));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMINFTES, 0), (new IDVariant(PAN_ORDINDACORRI.Header(Glb.OBJ_FIELD,PFL_ORDINDACORRI_INFOTESORIER))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "ApriNote1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Licenza
  // **********************************************************************
  public int ControlloLicenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Licenza Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))))).equals((new IDVariant(-1)), true))
      {
        if (MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "ControlloLicenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetti
  // **********************************************************************
  public int InfoSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "InfoSoggetti", _e);
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
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_SPESE = (new IDVariant());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC, 0, (new IDVariant(0)));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPSPEMINCOD ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_E = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SPESE = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE, 0, new IDVariant(v_SPESE));
      ControllaVisibilità();
      ControlloLicenza();
      PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END1.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END1.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "EndModalEvent", _e);
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
      PAN_ORDINDACORRI.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_ORDDACORDERO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_ORDDACORDERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECOMMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINDACORRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINDACORRI);
      // 
      // Ordinativi Da Corrispettivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMIMPECO, 0).equals((new IDVariant(1)), true))
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_FATTORDESCRI,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_FATTORDESCRI))).stringValue()); 
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_ALLEGATI,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_ALLEGATI))).stringValue()); 
      PAN_ORDINDACORRI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDACORRI_INFOTESORIER,(new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_INFOTESORIER))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMCODDEB, 0))))
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINDACORRI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "OrdinativiDaCorrispettiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_ORDINDACORRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Da Corrispettivi On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_ORDINDACORRI_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_ORDINDACORRI.FieldText(PFL_ORDINDACORRI_BENDEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "OrdinativiDaCorrispettiviOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Contropartita Patr Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ORDINDACORRI_CONTROPAPATR_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Contropartita Patr Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FATTORI A ");
        SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
        SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Fattore non presente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_STR); 
          IMDB.set_Value(IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR5, IMDBDef15.PQSL_ORDINDACORR5_ROWNAMEFATTO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaCorrispettivi", "AccertamentiContropartitaPatrValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINDACORRI_ORDINDACORR5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDINDACORR5_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDACORR3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_ORDINDACORR3, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR5_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDINDACORR5_RS, 0, IMDBDef6.TBL_ORDINDACORR3, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 0, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 1, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 2, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 3, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 4, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 5, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 6, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 7, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 8, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 9, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 10, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 11, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 12, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 13, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR5_RS, 14, 0, IMDBDef6.TBL_ORDINDACORR3, IMDBDef6.FLD_ORDINDACORR3_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_ORDINDACORR3, 0);
      if (IMDB.Eof(IMDBDef6.TBL_ORDINDACORR3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDACORR3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDINDACORR5_RS, 0);
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
  private void PAN_ORDINDACORRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINDACORRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINDACORRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINDACORRI, Cancel);
    // Stub
  }

  private void PAN_ORDINDACORRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINDACORRI_NOTE2)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_NOTE1)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_INFOBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDACORRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINDACORRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINDACORRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ORDINDACORRI_CONTROPAPATR)
      {
        PFL_ORDINDACORRI_CONTROPAPATR_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINDACORRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINDACORRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINDACORRI_Init()
  {

    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, "E03C16FE-08CF-4459-8513-CFEC0F6489A8");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, "Corrispettivi");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, MyGlb.PANEL_LIST, 0, -9999, 248, 16, 0, 0);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, MyGlb.PANEL_FORM, 36, 7, 500, 77, 0, 0);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, 0, 70);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, 1, 13);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, 0, 4);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, 1, 4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_CORRISPETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "CF723A6D-8623-4746-B734-84825690C451");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "Ordinativi");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 944, 16, 0, 0);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, MyGlb.PANEL_FORM, 36, 107, 500, 241, 0, 0);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0, 55);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 1, 13);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0, 4);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 1, 4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "48960609-0378-4DBA-B3EE-658B65A8008B");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "Accertamenti");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 1064, 16, 0, 0);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 36, 351, 500, 121, 0, 0);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0, 77);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 1, 13);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0, 4);
    PAN_ORDINDACORRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 1, 4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDACORRI_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "0EE356D9-6549-4AB8-95FC-03448EB61031");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "Bollato");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, "CD0CEB7D-6F92-4E3D-B038-633D3B135BDA");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, "Dal");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, "ED4819CC-E719-47DC-B731-AACBEC1F9958");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, "Al");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, "479E2D81-E66E-45D4-8C2B-0CAACC66C2E1");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, "F96BFC88-033D-4068-B923-5D549B94D50A");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, "2D824C30-1799-4253-B05B-E514E15287CB");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, "Debitore");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, "2BF9DE5C-ADCC-4143-96A6-3A7653D3BBD5");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, "Codice Debitore");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "828049AC-235D-46D1-AABC-E980A841D9AA");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "Data");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "C1D0D4F7-69B2-4A33-84B9-5CDBFC76F6F4");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "Causale");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "EB686D65-3AC0-4FDC-A7F0-0A22BA7AFFAD");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "Bollo");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "9690FF4F-6D24-4BAB-975D-098CDF87989C");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "Ufficio");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "DD8BDEE5-5C18-42C4-AB0F-F1820DFE8D6F");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "Spese");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "2594F2E7-EB9E-487E-9B5D-C60C046AB80A");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "Commissioni");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "B7495F44-07E9-4174-B4D0-86B9DCAC345B");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "Allegati");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "905BDADA-C3A9-4B54-A4C4-4000145D4B67");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "Info Tesoriere");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, "D3754D2F-E0C8-4BCA-9206-7ADB601EE744");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, 0, "testo1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, "2015225A-A916-4A30-AABC-5F4ACB5CD1E0");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, 0, "testo1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, "CF54F4C5-F87F-4611-97E2-CB93EBD5BF31");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, "4CF11F2E-F69F-4AB8-80D8-D07124CF4955");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, 0, "info.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "8D79699B-B987-4876-BCFF-40BA525EFE01");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenze)");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "CEA8B829-3BF1-4024-9CC3-9C6E77E27651");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "Imputazione Economica");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "980BA0E1-9B59-4EB3-AF05-8B6CE6EB543A");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "Contropartita Patr.");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "54495AFD-2F81-41AB-A957-11522F6395A8");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_ORDINDACORRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, "");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDACORRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, "E357840C-738C-4212-9148-47C405F6061F");
    PAN_ORDINDACORRI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, "Elabora");
    PAN_ORDINDACORRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINDACORRI.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, 0, "button1.gif", false);
    PAN_ORDINDACORRI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDINDACORRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_LIST, "Boll.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 68, 32, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLATO, MyGlb.PANEL_FORM, "Bollato");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_BOLLATO, -1, GRP_ORDINDACORRI_CORRISPETTIV);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_BOLLATO, PPQRY_ORDINDACORR5, "A.ROWNAMEBOLLA", "ROWNAMEBOLLA", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_LIST, 40, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_FORM, 88, 60, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_DAL, -1, GRP_ORDINDACORRI_CORRISPETTIV);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_DAL, PPQRY_ORDINDACORR5, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_LIST, 144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_FORM, 252, 60, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_AL, -1, GRP_ORDINDACORRI_CORRISPETTIV);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_AL, PPQRY_ORDINDACORR5, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 292, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 520, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NEWPANELLAB1, -1, GRP_ORDINDACORRI_CORRISPETTIV);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_LIST, 300, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_FORM, 40, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NEWPANELABE1, -1, GRP_ORDINDACORRI_CORRISPETTIV);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_FORM, 48, 132, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BENDEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_BENDEBITORE, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_FORM, 356, 132, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_CODICEDEBITO, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_CODICEDEBITO, PPQRY_ORDINDACORR5, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 88, 156, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_DATA, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_DATA, PPQRY_ORDINDACORR5, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 72, 180, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_CAUSALE, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_CAUSALE, PPQRY_ORDINDACORR5, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 88, 204, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_BOLLO, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_BOLLO, PPQRY_ORDINDACORR5, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 80, 228, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_UFFICIO, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_UFFICIO, PPQRY_ORDINDACORR5, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 472, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 76, 252, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 52);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_SPESE, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_SPESE, PPQRY_ORDINDACORR5, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 512, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 48, 276, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_COMMISSIONI, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_COMMISSIONI, PPQRY_ORDINDACORR5, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 616, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 72, 300, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_ALLEGATI, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_ALLEGATI, PPQRY_ORDINDACORR5, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 49, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 824, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 40, 324, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_INFOTESORIER, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_INFOTESORIER, PPQRY_ORDINDACORR5, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 49, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 476, 308, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 516, 304, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NOTE2, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NOTE2, -1, "", "NOTE2", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 484, 316, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 516, 328, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_NOTE1, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_FORM, 420, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_SCEGBENFBUTT, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_FORM, 436, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_INFOBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_INFOBENFBUTT, -1, GRP_ORDINDACORRI_ORDINATIVI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_INFOBENFBUTT, -1, "", "INFOBENFBUTT", 0, 0, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 944, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 452);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_LIST, "E. A. V. P. M. D. S. A. S. C.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 212, 376, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 296);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenze)");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_EMAUVPMDSASC, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_EMAUVPMDSASC, PPQRY_ORDINDACORR5, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 1, 1, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 984, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_LIST, "Im. E.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 364, 412, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 144);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imputazione Economica");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_IMPUTAECONOM, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_IMPUTAECONOM, PPQRY_ORDINDACORR5, "A.ROWNAMIMPECO", "ROWNAMIMPECO", 1, 2, 0, -13997);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_IMPUTAECONOM, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDACORRI.SetValueListItem(PFL_ORDINDACORRI_IMPUTAECONOM, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 1024, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 44);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_LIST, "Cn. P.");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 40, 448, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_CONTROPAPATR, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_CONTROPAPATR, PPQRY_ORDINDACORR5, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 16, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 296, 448, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_FATTORDESCRI, -1, GRP_ORDINDACORRI_ACCERTAMENTI);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDACORRI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 456, 480, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDACORRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDACORRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDACORRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDACORRI.SetFieldPage(PFL_ORDINDACORRI_ELABORA, -1, -1);
    PAN_ORDINDACORRI.SetFieldPanel(PFL_ORDINDACORRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ORDINDACORRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINDACORRI.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDACORRI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDACORRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_ORDINDACORRI.SetQueryLKE(PPQRY_BEN, PFL_ORDINDACORRI_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_ORDINDACORRI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_ORDINDACORRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_ORDINDACORRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~ROWNAMEBOLLA~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T04, 0, SQL, PFL_ORDINDACORRI_BOLLATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T04, 1, SQL, PFL_ORDINDACORRI_BOLLATO, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECAUSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T58, 0, SQL, PFL_ORDINDACORRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T58, 1, SQL, PFL_ORDINDACORRI_CAUSALE, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T60, 0, SQL, PFL_ORDINDACORRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T60, 1, SQL, PFL_ORDINDACORRI_BOLLO, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T53, 0, SQL, PFL_ORDINDACORRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_T53, 1, SQL, PFL_ORDINDACORRI_UFFICIO, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_ORDINDACORRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDACORRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_ORDINDACORRI_SPESE, "");
    PAN_ORDINDACORRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDACORRI.SetIMDB(IMDB, "PQRY_ORDINDACORR5", true);
    PAN_ORDINDACORRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINDACORRI.SetQueryIMDB(PPQRY_ORDINDACORR5, IMDBDef15.PQRY_ORDINDACORR5_RS, IMDBDef6.TBL_ORDINDACORR3);
    JustLoaded = true;
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_BOLLATO, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLA);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_DAL, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDAL);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_AL, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEAL);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_CODICEDEBITO, IMDBDef6.FLD_ORDINDACORR3_ROWNAMCODDEB);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_DATA, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEDATA);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_CAUSALE, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECAUSA);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_BOLLO, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEBOLLO);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_UFFICIO, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEUFFIC);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_SPESE, IMDBDef6.FLD_ORDINDACORR3_ROWNAMESPESE);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_COMMISSIONI, IMDBDef6.FLD_ORDINDACORR3_ROWNAMECOMMI);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_ALLEGATI, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEALLEG);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_INFOTESORIER, IMDBDef6.FLD_ORDINDACORR3_ROWNAMINFTES);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_EMAUVPMDSASC, IMDBDef6.FLD_ORDINDACORR3_RNEAVPMDSASC);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_IMPUTAECONOM, IMDBDef6.FLD_ORDINDACORR3_ROWNAMIMPECO);
    PAN_ORDINDACORRI.SetFieldPrimaryIndex(PFL_ORDINDACORRI_CONTROPAPATR, IMDBDef6.FLD_ORDINDACORR3_ROWNAMEFATTO);
    PAN_ORDINDACORRI.SetMasterTable(0, "ORDINDACORR3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINDACORRI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINDACORRI.iUseListQBE;
      PAN_ORDINDACORRI.iUseListQBE = 0;
      PAN_ORDINDACORRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINDACORRI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINDACORRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_ORDINDACORRI) PAN_ORDINDACORRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
