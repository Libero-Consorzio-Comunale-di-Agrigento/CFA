// **********************************************
// Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Ordinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_ORDINATIVI = 0;
  private static int GRP_PARAM_ACCERTAMENTI = 1;

  private static int PFL_PARAM_OK = 0;
  private static int PFL_PARAM_ANNULLA = 1;
  private static int PFL_PARAM_DESCRIZIONE = 2;
  private static int PFL_PARAM_DATA = 3;
  private static int PFL_PARAM_UFFICIO = 4;
  private static int PFL_PARAM_CAUSALE = 5;
  private static int PFL_PARAM_BOLLO = 6;
  private static int PFL_PARAM_SPESE = 7;
  private static int PFL_PARAM_COMMISSIONI = 8;
  private static int PFL_PARAM_ALLEGATI = 9;
  private static int PFL_PARAM_INFOTESORIER = 10;
  private static int PFL_PARAM_INFOALLEGATI = 11;
  private static int PFL_PARAM_INFOTESORIE1 = 12;
  private static int PFL_PARAM_NEWPANELLABE = 13;
  private static int PFL_PARAM_INEMISSIONE = 14;
  private static int PFL_PARAM_IMPUTAECONOM = 15;
  private static int PFL_PARAM_DEBITSUACCER = 16;
  private static int PFL_PARAM_DEBITORE = 17;
  private static int PFL_PARAM_CODICEDEBITO = 18;
  private static int PFL_PARAM_CONTROPAPATR = 19;
  private static int PFL_PARAM_FATTORDESCRI = 20;
  private static int PFL_PARAM_SELEZICONTRO = 21;
  private static int PFL_PARAM_SELEZISOGGET = 22;
  private static int PFL_PARAM_INFOSOGGETTI = 23;
  private static int PFL_PARAM_LABEL = 24;
  private static int PFL_PARAM_LABEL1 = 25;

  private static int PPQRY_PARAM22 = 0;

  private static int PPQRY_FATTORI = 1;

  private static int PPQRY_T53 = 2;
  private static int PPQRY_T58 = 3;
  private static int PPQRY_T60 = 4;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM39(IMDB);
    //
    //
    Init_PQRY_PARAM22(IMDB);
    Init_PQRY_PARAM22_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM39, 27);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM39, "TBL_PARAM39");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, "ROWNAMEQUALI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEQUALI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECONTR, "ROWNAMECONTR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMECONTR,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEISCON, "ROWNAMEISCON");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEISCON,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEPROGR,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEDEBIT,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, "ROWNAMDEBOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODDOC, "ROWNAMCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODDOC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDATDOC, "ROWNAMDATDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMDATDOC,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMANNDOC, "ROWNAMANNDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMANNDOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODFOR, "ROWNAMCODFOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM39,IMDBDef2.FLD_PARAM39_ROWNAMEQUIET,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM39, 0);
  }

  private static void Init_PQRY_PARAM22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM22, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM22, "PQRY_PARAM22");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, "ROWNAMECONTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMECONTR,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22,IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM22, 0);
  }

  private static void Init_PQRY_PARAM22_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM22_RS, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM22_RS, "PQRY_PARAM22_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMDESUAC, "ROWNAMDESUAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMDESUAC,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, "ROWNAMECONTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMECONTR,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM22_RS,IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Ordinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public Ordinativi()
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
    FormIdx = MyGlb.FRM_ORDINATIVI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B8C5351C-493D-4243-BCC3-C95AA68750CB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 604;
    DesignHeight = 526;
    set_Caption(new IDVariant("Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 604;
    Frames[1].Height = 500;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 500;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 500-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2496B6EE-91FC-4ED6-AD54-5CD169B81F40");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2108, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM39, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINATIVI_PARAM22();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZICONTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZISOGGET) {
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
    return (obj instanceof Ordinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Ordinativi.class.getName() : (Glb.ClassWithPackage(Ordinativi.class) ? Ordinativi.class.getName().substring(Ordinativi.class.getPackage().getName().length() + 1) : Ordinativi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_COMMISSIONE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ALLEGATI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INFOTESO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EMISS = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SRILEVANTEEC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SCODIMPECO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NACCDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NACCA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MESSAGE = (new IDVariant("Operazione terminata.", IDVariant.STRING));
      // 
      // OK Body
      // Procedure Body
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_EMISENCODLI5 = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
      v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
      IDVariant v_SENZACODLIV5 = new IDVariant(0,IDVariant.STRING);
      v_SENZACODLIV5 = (new IDVariant(""));
      v_SPESE = (new IDVariant());
      v_COMMISSIONE = (new IDVariant());
      v_ALLEGATI = (new IDVariant());
      v_INFOTESO = (new IDVariant());
      v_STATOSIOPE = (new IDVariant());
      v_MESSAGE = IDL.Add(v_MESSAGE, (new IDVariant("<BR/>")));
      if (IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMESCADE, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data Ordinativi non compatibile con Esercizio Finanziario!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Descrizione obbligatoria.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEINEMI, 0).equals((new IDVariant("SI")), true))
      {
        v_EMISS = (new IDVariant(1));
      }
      else
      {
        v_EMISS = (new IDVariant(0));
      }
      if (MainFrm.MODAIMPUENTR.compareTo((new IDVariant("FA")), true)!=0)
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))
        {
          v_SRILEVANTEEC = (new IDVariant("SI"));
          v_SCODIMPECO = IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0);
        }
        else
        {
          v_SRILEVANTEEC = (new IDVariant());
          v_SCODIMPECO = (new IDVariant());
        }
      }
      else
      {
        v_SRILEVANTEEC = (new IDVariant());
        v_SCODIMPECO = (new IDVariant());
      }
      if (MainFrm.Licenza((new IDVariant("MIF"))))
      {
        v_SPESE = IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMESPESE, 0);
        v_COMMISSIONE = IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECOMMI, 0);
        v_ALLEGATI = IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG, 0);
        v_INFOTESO = IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMINFTES, 0);
      }
      else
      {
        v_SPESE = (new IDVariant());
        v_COMMISSIONE = (new IDVariant());
        v_ALLEGATI = (new IDVariant());
        v_INFOTESO = (new IDVariant());
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ORDEMISSIMPUTAZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEPROGR, 0), IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEBOLLO, 0), IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEUFFIC, 0), IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECAUSA, 0), v_EMISS, IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODFOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNDOC, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMDOC, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUIET, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO, 0), v_NORDDA, v_NORDA, v_NACCDA, v_NACCA, v_SVARACC, IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMESCADE, 0), v_SRILEVANTEEC, v_SCODIMPECO, v_COMMISSIONE, v_INFOTESO, v_SPESE, v_ALLEGATI, v_STATOSIOPE, v_NSUPDISPPURO, v_EMISENCODLI5);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if (v_STATOSIOPE.equals((new IDVariant(1)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale.", IDVariant.STRING));
        v_SSTATOSIOPE = IDL.Add(v_SMS, (new IDVariant("<BR/>")));
      }
      else
      {
        v_SSTATOSIOPE = (new IDVariant(""));
      }
      if (v_EMISENCODLI5.equals((new IDVariant(1)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello V."));
        v_SENZACODLIV5 = IDL.Add(v_SMS, (new IDVariant("<BR/>")));
      }
      else
      {
        v_SENZACODLIV5 = (new IDVariant(""));
      }
      if (v_NORDDA.compareTo(v_NORDA, true)<0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
        IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
        v_SMS1 = (new IDVariant(" a ", IDVariant.STRING));
        v_MESSAGE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGE, v_SMS), IDL.ToString(v_NORDDA)), v_SMS1), IDL.ToString(v_NORDA)), (new IDVariant("."))), (new IDVariant("<BR/>")));
      }
      else
      {
        if (v_NORDDA.equals(v_NORDA, true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Emesso ordinativo ", IDVariant.STRING));
          v_MESSAGE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGE, v_SMS), IDL.ToString(v_NORDDA)), (new IDVariant("."))), (new IDVariant("<BR/>")));
        }
        else
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Non sono stati emessi Ordinativi.", IDVariant.STRING));
          v_MESSAGE = IDL.Add(IDL.Add(v_MESSAGE, v_SMS), (new IDVariant("<BR/>")));
        }
      }
      if (v_NACCDA.compareTo(v_NACCA, true)<0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Emessi accertamenti da ", IDVariant.STRING));
        IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
        v_SMS1 = (new IDVariant(" a ", IDVariant.STRING));
        v_MESSAGE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGE, v_SMS), IDL.ToString(v_NACCDA)), v_SMS1), IDL.ToString(v_NACCA)), (new IDVariant("."))), (new IDVariant("<BR/>")));
      }
      else
      {
        if (v_NACCDA.equals(v_NACCA, true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Emesso accertamento ", IDVariant.STRING));
          v_MESSAGE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGE, v_SMS), IDL.ToString(v_NACCDA)), (new IDVariant("."))), (new IDVariant("<BR/>")));
        }
        else
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Non sono stati emessi Accertamenti.", IDVariant.STRING));
          v_MESSAGE = IDL.Add(IDL.Add(v_MESSAGE, v_SMS), (new IDVariant("<BR/>")));
        }
      }
      if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Emesse Variazioni agli Accertamenti: ", IDVariant.STRING));
        v_MESSAGE = IDL.Add(IDL.Add(v_MESSAGE, v_SMS), IDL.SubStr(v_SVARACC, (new IDVariant(0)), (new IDVariant(2))));
      }
      v_MESSAGE = IDL.Add(IDL.Add(v_MESSAGE, v_SSTATOSIOPE), v_SENZACODLIV5);
      if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
      {
        v_MESSAGE = IDL.Add(IDL.Add(v_MESSAGE, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
      }
      MainFrm.set_AlertMessage(v_MESSAGE); 
      ((Imputazioni)MainFrm.GetForm(MyGlb.FRM_IMPUTAZIONI,0)).PAN_IMPUTAZIONI.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Allegati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAllegati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Allegati", IDVariant.STRING));
      // 
      // Info Allegati Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "InfoAllegati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Tesoriere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoTesoriere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Tesoriere", IDVariant.STRING));
      // 
      // Info Tesoriere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMINFTES, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "InfoTesoriere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Soggetti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "SelezioneSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetti
  // Explain which processing is carried out by this procedure
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "InfoSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Fattore
  // **********************************************************************
  public int ApriSceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "ApriSceltaFattore", _e);
      return -1;
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
      if (IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0, IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0));
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0, (new IDVariant()));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0))))
      {
        IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO as FATTORITIPO ");
        SQL.append("from ");
        SQL.append("  FATTORI A ");
        SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_TIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_TIPO.equals((new IDVariant("E")), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Impossibile inserire un fattore economico!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0, (new IDVariant()));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "ParamOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0)))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "ParamOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      SelettoreBeneficiario v_SELETTBENEFI = new SelettoreBeneficiario(MainFrm,IMDB);
      if (Column.equals((new IDVariant(PFL_PARAM_DEBITORE)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0))))
          {
            IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0, IDL.Upper(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0)));
            v_SELETTBENEFI.AzzeraValori();
            v_SELETTBENEFI.SetParam(IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0), (new IDVariant("FAT")), (new IDVariant(0)), (new IDVariant()));
            if (!(IDL.IsNull(v_SELETTBENEFI.GetTrovato())))
            {
              if (v_SELETTBENEFI.GetTrovato().equals((new IDVariant("SI")), true))
              {
                IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0, v_SELETTBENEFI.GetBeneficiario());
                IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0, v_SELETTBENEFI.GetRagioneSociale());
              }
              else
              {
                IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0, (new IDVariant()));
              }
            }
            else
            {
              return;
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, 0, IMDB.Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "ParamOnUpdatingRow", _e);
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
    IDVariant v_CODIMPECO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (!(MainFrm.Licenza((new IDVariant("MIF")))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (MainFrm.GESTIOALLEGA.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.COD_IMP_ECO as FATCODIMPECO ");
      SQL.append("from ");
      SQL.append("  FAT A ");
      SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODIMPECO = QV.Get("FATCODIMPECO", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0, new IDVariant(v_CODIMPECO));
      if (MainFrm.MODAIMPUENTR.equals((new IDVariant("FA")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, 0, (new IDVariant("NO")));
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, 0, (new IDVariant("SI")));
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECONTR, 0, IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, 0, (new IDVariant("NO")));
        }
      }
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMESCADE, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue() && IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue() && IMDB.Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, 0).equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMEDEBIT, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM22, IMDBDef10.PQSL_PARAM22_ROWNAMECONTR, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "EndModalEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ordinativi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMESCADE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMESPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECOMMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEALLEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUALI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEINEMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDESUAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECONTR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEISCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODDEB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEDEBIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDEBOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMNUMDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDATDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMANNDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODFOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEQUIET, 0, new IDVariant());
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINATIVI_PARAM22() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM22_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM39, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM39, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM22_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM22_RS, 0, IMDBDef2.TBL_PARAM39, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 0, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 1, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 2, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 3, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 4, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMESCADE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 5, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 6, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 7, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 8, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMINFTES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 9, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEINEMI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 10, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 11, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMDESUAC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 12, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMECONTR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 13, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMEDEBIT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM22_RS, 14, 0, IMDBDef2.TBL_PARAM39, IMDBDef2.FLD_PARAM39_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM39, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM39, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM39, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM22_RS, 0);
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

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOALLEGATI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAllegati();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOTESORIE1)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoTesoriere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZICONTRO)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZISOGGET)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOSOGGETTI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, "BEE25428-B94B-461A-B469-F534AE5C1AAB");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, "Ordinativi");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, MyGlb.PANEL_FORM, 12, 3, 564, 217, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, 0, 55);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, "22738DAB-C7C4-4A96-A0B3-A595FD51B66E");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, "Accertamenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 308, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, MyGlb.PANEL_FORM, 12, 223, 563, 141, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, 0, 77);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "F0E3D9F8-5CA2-49B5-9C2C-7E3AFB490F5C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "OK");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "FF3549E7-13A2-482F-8C2F-06833F976D48");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "Annulla");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "5C0BF868-2965-4DEE-91AA-E45B1DD5CFF0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "Descrizione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "3096DCF7-AF28-4B5A-A833-D2AD724DCFB0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "Data");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "7CA99AF6-937A-418C-89DF-5814B478FCFF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "Ufficio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "8BD59D7B-9DB2-4484-BBFE-60A6633C1267");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "Causale");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "903BCDE9-1AE9-42B9-9DDD-387CD7375A49");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "Bollo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "04B0EDB3-7460-4EB3-946F-3E9177A4F03B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "Spese");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "0EF5BC8A-E77B-4AEE-9CAA-DB96299367B7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "Commissioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "677FAD1C-9DA6-4F05-99E5-F3966E633D71");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "Allegati");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "427DAD9D-3510-4DA7-ADC4-02317FB47611");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "Info Tesoriere");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, "E4B9870C-66EB-45D4-BDE9-CF5C7544AE43");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, 0, "nota scritta.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, "3D7CD92D-9239-4FD8-BAB8-36707431936D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, 0, "nota scritta.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, "18DE4710-AFF8-43BB-BC00-7FC6759B25FC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "3A0C1035-8144-4813-B582-869687527025");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "In emissione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, "0AC1588A-3E5E-4089-AA51-3AD2A8E386DE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, "Imputazione Economica");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, "3DBB4D1D-10D2-4990-A5A4-0D97D2E1C6CB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, "Debitore su Accertamenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "4C09BBC9-72E3-40C2-B2EC-33A04AA20918");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "B19E4758-EB08-4D53-8D87-60B6BB273CD6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "Codice Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "1BF0CE1C-D787-4878-9B3F-E47F615B8BE0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "Contropartita Patr.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "6EE146AE-CA39-440E-98C8-2037AB2C95FE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, "38C80BDC-7779-40FF-9622-A7CCB06551FE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, "5B6F8ABF-1B47-4236-9925-AAD62D4C85E4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, "A9D97CD9-A5A9-4416-A43D-8EE9F9261A18");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "4CD595FC-3E45-4F52-A200-A257A65BD92A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, "Emissione Automatica Variazioni per mancata");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, "92C6C029-CFE9-4823-9826-DF496507D3B7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, "disponibilità su Accertamento (solo Competenza)");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 172, 196, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 408, 384, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 180, 204, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 496, 384, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNULLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 252, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 28, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIZIONE, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIZIONE, PPQRY_PARAM22, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 48, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATA, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATA, PPQRY_PARAM22, "A.ROWNAMESCADE", "ROWNAMESCADE", 6, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 52, 76, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UFFICIO, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UFFICIO, PPQRY_PARAM22, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 44, 100, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAUSALE, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAUSALE, PPQRY_PARAM22, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 48, 124, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_BOLLO, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BOLLO, PPQRY_PARAM22, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 60, 148, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SPESE, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SPESE, PPQRY_PARAM22, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 10, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SPESE, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SPESE, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SPESE, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, "Commis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 332, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARAM.SetFieldPage(PFL_PARAM_COMMISSIONI, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_COMMISSIONI, PPQRY_PARAM22, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 10, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 52, 172, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ALLEGATI, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ALLEGATI, PPQRY_PARAM22, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 16, 196, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTESORIER, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTESORIER, PPQRY_PARAM22, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 264, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 528, 176, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOALLEGATI, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOALLEGATI, -1, "", "INFOALLEGATI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 272, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 528, 200, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTESORIE1, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTESORIE1, -1, "", "INFOTESORIE1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 440, 140, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 560, 144, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NEWPANELLABE, -1, GRP_PARAM_ORDINATIVI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, "In emiss.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 364, 248, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, "In emiss.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_INEMISSIONE, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INEMISSIONE, PPQRY_PARAM22, "A.ROWNAMEINEMI", "ROWNAMEINEMI", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_INEMISSIONE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imput. Economica");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_FORM, 20, 280, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_FORM, 144);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imputazione Economica");
    PAN_PARAM.SetFieldPage(PFL_PARAM_IMPUTAECONOM, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_IMPUTAECONOM, PPQRY_PARAM22, "A.ROWNAMIMPECO", "ROWNAMIMPECO", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_IMPUTAECONOM, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_LIST, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_LIST, "Debit. su Accert.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_FORM, 204, 280, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_FORM, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITSUACCER, MyGlb.PANEL_FORM, "Debitore su Accertamenti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEBITSUACCER, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEBITSUACCER, PPQRY_PARAM22, "A.ROWNAMDESUAC", "ROWNAMDESUAC", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DEBITSUACCER, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DEBITSUACCER, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 72, 312, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEBITORE, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEBITORE, PPQRY_PARAM22, "A.ROWNAMEDEBIT", "ROWNAMEDEBIT", 5, 40, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, "Cod. Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 460, 312, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, "Cod. Debitore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CODICEDEBITO, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CODICEDEBITO, PPQRY_PARAM22, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 8, 44, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, "Contr. Ptr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 16, 340, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CONTROPAPATR, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CONTROPAPATR, PPQRY_PARAM22, "A.ROWNAMECONTR", "ROWNAMECONTR", 5, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 208, 340, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FATTORDESCRI, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_LIST, 36, 284, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_FORM, 536, 340, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZICONTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZICONTRO, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZICONTRO, -1, "", "SELEZICONTRO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_LIST, 580, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_FORM, 536, 316, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZISOGGET, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZISOGGET, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZISOGGET, -1, "", "SELEZISOGGET", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_LIST, 588, 60, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_FORM, 555, 316, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOSOGGETTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOSOGGETTI, -1, GRP_PARAM_ACCERTAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOSOGGETTI, -1, "", "INFOSOGGETTI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 20, 268, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 132, 240, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 28, 276, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 68, 256, 292, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABEL1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMECONTR~~) ");
    PAN_PARAM.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAM_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAM_UFFICIO, "");
    PAN_PARAM.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAM_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAM_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARAM.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAM_BOLLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM22", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM22, IMDBDef10.PQRY_PARAM22_RS, IMDBDef2.TBL_PARAM39);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIZIONE, IMDBDef2.FLD_PARAM39_ROWNAMEDESCR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATA, IMDBDef2.FLD_PARAM39_ROWNAMESCADE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UFFICIO, IMDBDef2.FLD_PARAM39_ROWNAMEUFFIC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAUSALE, IMDBDef2.FLD_PARAM39_ROWNAMECAUSA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_BOLLO, IMDBDef2.FLD_PARAM39_ROWNAMEBOLLO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SPESE, IMDBDef2.FLD_PARAM39_ROWNAMESPESE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_COMMISSIONI, IMDBDef2.FLD_PARAM39_ROWNAMECOMMI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ALLEGATI, IMDBDef2.FLD_PARAM39_ROWNAMEALLEG);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_INFOTESORIER, IMDBDef2.FLD_PARAM39_ROWNAMINFTES);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_INEMISSIONE, IMDBDef2.FLD_PARAM39_ROWNAMEINEMI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_IMPUTAECONOM, IMDBDef2.FLD_PARAM39_ROWNAMIMPECO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DEBITSUACCER, IMDBDef2.FLD_PARAM39_ROWNAMDESUAC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DEBITORE, IMDBDef2.FLD_PARAM39_ROWNAMEDEBIT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CODICEDEBITO, IMDBDef2.FLD_PARAM39_ROWNAMCODDEB);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CONTROPAPATR, IMDBDef2.FLD_PARAM39_ROWNAMECONTR);
    PAN_PARAM.SetMasterTable(0, "PARAM39");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
