// **********************************************
// Rettifica Capitolo Imp
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaCapitoloImp extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUOVOCAPITOL = 0;
  private static int GRP_PARAMETRI_IMPEESERPREC = 1;

  private static int PFL_PARAMETRI_CAP = 0;
  private static int PFL_PARAMETRI_ART = 1;
  private static int PFL_PARAMETRI_TRATTINLABEL = 2;
  private static int PFL_PARAMETRI_APRSELCAPBUT = 3;
  private static int PFL_PARAMETRI_APRINFCAPBUT = 4;
  private static int PFL_PARAMETRI_NEWPANELABE3 = 5;
  private static int PFL_PARAMETRI_CAPDESCRIZI1 = 6;
  private static int PFL_PARAMETRI_ELABORBUTTON = 7;
  private static int PFL_PARAMETRI_IMPEGNO = 8;
  private static int PFL_PARAMETRI_CAPIMP = 9;
  private static int PFL_PARAMETRI_ARTIMP = 10;
  private static int PFL_PARAMETRI_CAPDESCRIZIO = 11;
  private static int PFL_PARAMETRI_ACCOPEDESCRI = 12;
  private static int PFL_PARAMETRI_OBIETTOPERAT = 13;
  private static int PFL_PARAMETRI_CGU = 14;
  private static int PFL_PARAMETRI_CODIGESTDESC = 15;
  private static int PFL_PARAMETRI_IVLIVELLO = 16;
  private static int PFL_PARAMETRI_VIRICADECOST = 17;
  private static int PFL_PARAMETRI_VISSTRRICCOD = 18;
  private static int PFL_PARAMETRI_VISSTRRICDES = 19;
  private static int PFL_PARAMETRI_FINOPE = 20;
  private static int PFL_PARAMETRI_CGU1 = 21;
  private static int PFL_PARAMETRI_CODIGESTDES1 = 22;
  private static int PFL_PARAMETRI_VLIVELLO = 23;
  private static int PFL_PARAMETRI_VISSTRRICDE1 = 24;
  private static int PFL_PARAMETRI_NUMIMPPREORI = 25;
  private static int PFL_PARAMETRI_ANNIMPPREORI = 26;
  private static int PFL_PARAMETRI_APRINFIMPROR = 27;
  private static int PFL_PARAMETRI_TRATTILABEL1 = 28;
  private static int PFL_PARAMETRI_ETICHETTINFO = 29;
  private static int PFL_PARAMETRI_FINANZIAMENT = 30;
  private static int PFL_PARAMETRI_OPERA = 31;
  private static int PFL_PARAMETRI_ETICSCELACCE = 32;
  private static int PFL_PARAMETRI_NUMERIMPPREC = 33;
  private static int PFL_PARAMETRI_SLASH = 34;
  private static int PFL_PARAMETRI_ANNOIMPPREC = 35;
  private static int PFL_PARAMETRI_SELEZIMPPREC = 36;
  private static int PFL_PARAMETRI_APRINFIMPPRE = 37;
  private static int PFL_PARAMETRI_ETICHELBLGRP = 38;
  private static int PFL_PARAMETRI_ETICHELBLGR1 = 39;
  private static int PFL_PARAMETRI_OBIETTOPERA1 = 40;

  private static int PPQRY_PARAMETRI371 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_IMPFIN = 2;
  private static int PPQRY_PROGETTI = 3;
  private static int PPQRY_IMP = 4;
  private static int PPQRY_VISTARICLCAP = 5;
  private static int PPQRY_VISTSTRURICL = 6;
  private static int PPQRY_BILFIN = 7;
  private static int PPQRY_CODICIGESTIO = 8;
  private static int PPQRY_VISTSTRURIC1 = 9;
  private static int PPQRY_CAPNUOVO = 10;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant PROCPERSATTI = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant MODIFILIVEL5 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI515(IMDB);
    //
    //
    Init_PQRY_PARAMETRI371(IMDB);
    Init_PQRY_PARAMETRI371_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI515(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI515, 18);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI515, "TBL_PARAMETRI515");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, "RONAANIMPROR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, "RONANUIMPROR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU, "ROWNAMECGU");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, "ROWNAMLIV4CA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, "ROWNAMVLIVIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, "ROWNAMCGUIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, "ROWNAMCAPIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, "ROWNAMARTIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, "ROWNAMOBOPIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR, "ROWNAMANIMPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR, "ROWNAMNUIMPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI515,IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI515, 0);
  }

  private static void Init_PQRY_PARAMETRI371(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI371, 14);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI371, "PQRY_PARAMETRI371");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_RONAANIMPROR, "RONAANIMPROR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_RONAANIMPROR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_RONANUIMPROR, "RONANUIMPROR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_RONANUIMPROR,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU, "ROWNAMECGU");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP, "ROWNAMCAPIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP, "ROWNAMARTIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, "ROWNAMANIMPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, "ROWNAMNUIMPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371,IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR,1,5,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI371, 0);
  }

  private static void Init_PQRY_PARAMETRI371_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI371_RS, 14);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI371_RS, "PQRY_PARAMETRI371_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, "ROWNAMEART");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_RONAANIMPROR, "RONAANIMPROR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_RONAANIMPROR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_RONANUIMPROR, "RONANUIMPROR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_RONANUIMPROR,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE, "ROWNAMOBIOPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE,5,9,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU, "ROWNAMECGU");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, "ROWNAMEVLIVE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP, "ROWNAMCAPIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP, "ROWNAMARTIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, "ROWNAMANIMPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, "ROWNAMNUIMPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI371_RS,IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaCapitoloImp(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaCapitoloImp()
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
    FormIdx = MyGlb.FRM_RETTICAPIIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FB7962A9-F38C-49BA-93D8-58782557BCD3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 562;
    set_Caption(new IDVariant("Rettifica Capitolo Imp"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 536;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 536;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 536-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E7DB9CA6-3E99-45DC-97C6-47B37880554A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5472, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI515, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTICAPIIMP_PARAMETRI371();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRSELCAPBUT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECODGECOFI && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_CGU1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_VLIVELLO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELIMPEANNO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_ETICSCELACCE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEIMPANNPRE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SELEZIMPPREC) {
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
    return (obj instanceof RettificaCapitoloImp);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaCapitoloImp.class.getName() : (Glb.ClassWithPackage(RettificaCapitoloImp.class) ? RettificaCapitoloImp.class.getName().substring(RettificaCapitoloImp.class.getPackage().getName().length() + 1) : RettificaCapitoloImp.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Impegno Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_IMPEGNO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Impegno Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0))))
      {
        IDVariant v_CAPITOLO = null;
        v_CAPITOLO = (new IDVariant());
        IDVariant v_ARTICOLO = null;
        v_ARTICOLO = (new IDVariant());
        IDVariant v_CODICEGESTIO = null;
        v_CODICEGESTIO = (new IDVariant());
        IDVariant v_PROGETTO = null;
        v_PROGETTO = (new IDVariant());
        IDVariant v_CODLIV5 = null;
        v_CODLIV5 = (new IDVariant());
        IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_VNUMEROIMPPR = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_VANNOIMPPREC = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
        SQL.append("  A.ARTICOLO as IMPARTICOLO, ");
        SQL.append("  A.CODICE_GESTIONALE as IMPCODICGEST, ");
        SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
        SQL.append("  A.NUMERO_IMP_PREC as NUMERIMPPREC, ");
        SQL.append("  A.ANNO_IMP_PREC as ANNOIMPPREC, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO, ");
        SQL.append("  A.CODICE_GESTIONALE, ");
        SQL.append("  A.COD_LIVELLO_5, ");
        SQL.append("  A.NUMERO_IMP_PREC, ");
        SQL.append("  A.ANNO_IMP_PREC ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
          v_CODICEGESTIO = QV.Get("IMPCODICGEST", IDVariant.INTEGER) ;
          v_CODLIV5 = QV.Get("IMPCODLIVEL5", IDVariant.INTEGER) ;
          v_VNUMEROIMPPR = QV.Get("NUMERIMPPREC", IDVariant.INTEGER) ;
          v_VANNOIMPPREC = QV.Get("ANNOIMPPREC", IDVariant.INTEGER) ;
          v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTA.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, (new IDVariant()));
          MainFrm.set_AlertMessage((new IDVariant("Impegno non presente"))); 
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0, (new IDVariant()));
        }
        else
        {
          if ((v_CAPITOLO.equals(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), true)) && (v_ARTICOLO.equals(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), true)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Il nuovo capitolo coincide con l'attuale"))); 
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, new IDVariant(new IDVariant(v_CODLIV5),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, new IDVariant(v_CODICEGESTIO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, new IDVariant(v_ARTICOLO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, new IDVariant(v_PROGETTO));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, new IDVariant(v_VANNOIMPPREC));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, new IDVariant(v_VNUMEROIMPPR));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP, 0, new IDVariant(v_ARTICOLO));
          IDVariant v_CONTAFIN = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  IMP_FIN A ");
          SQL.append("where (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTAFIN = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTAFIN.compareTo((new IDVariant(1)), true)>0)
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMCAPIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMARTIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ParametriImpegnoValidate", _e);
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
      v_NOMECAPTION = (new IDVariant("Rettifica Capitolo", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARAMEDELETE();
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CGU1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(MainFrm.PROCEDPERSON,(new IDVariant(1))).equals((new IDVariant(0)), true))
      {
        PROCPERSATTI = (new IDVariant(-1));
      }
      else
      {
        PROCPERSATTI = (new IDVariant(0));
      }
      if (PROCPERSATTI.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR, 0, new IDVariant());
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
      if ((new IDVariant(LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true))).equals((new IDVariant(-1)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCECODGECOFI)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU, 0, IMDB.Value(IMDBDef7.PQRY_RICLASSIGEST, IMDBDef7.PQSL_RICLASSIGEST_CODICE, 0));
      }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      // if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPROGIND1)), true)) && Result.booleanValue())
      // {
        // IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI4, IMDBDef7.PQSL_PROGETTI4_PROGETTO_ID, 0));
      // }
      if ((LookupForm.equals((new IDVariant(MyGlb.FRM_SCELIMPEANNO)), true)) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_NUMERO_IMP, 0));
        if (PROCPERSATTI.booleanValue())
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_ESEANNIMPPRE, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP2, IMDBDef7.PQSL_ESEIMP2_ESENUMIMPPRE, 0));
          PAN_PARAMETRI.UpdatePanel(MainFrm);
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEIMPANNPRE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0, IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0, IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_NUMERO_IMP, 0));
        PAN_PARAMETRI.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MODIFILIVEL5.booleanValue())
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (PROCPERSATTI.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_CAP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ART)), true)) && FieldModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0, (new IDVariant()));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
        {
          IDVariant v_NRIGHE = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NRIGHE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NRIGHE.compareTo((new IDVariant(0)), true)<=0 || (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Codifica non presente nel Piano dei Conti !", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0, (new IDVariant()));
            return;
          }
          if ((IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0).equals(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0), true)) && (IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0).equals(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0), true)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Il nuovo capitolo coincide con l'attuale"))); 
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0, (new IDVariant()));
            return;
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0)));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0, new IDVariant(MainFrm.GetLiv5DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0)),IDVariant.DECIMAL));
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0)))
          {
            MODIFILIVEL5 = (new IDVariant(-1));
          }
          else
          {
            MODIFILIVEL5 = (new IDVariant(0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0))))
          {
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  VISTA_STRUTTURA_RICL A ");
            SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (A.LIVELLO = 2) ");
            SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND A.ESERCIZIO_SCADENZA)) ");
            SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0 OR A.CODICE_PADRE = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0));
            }
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0, (new IDVariant()));
        }
      }
      if (FieldWasModified.booleanValue() && (Column.equals((new IDVariant(PFL_PARAMETRI_NUMERIMPPREC)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOIMPPREC)), true)))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0))))
        {
          // 
          // Controllo correttezza rispetto al capitolo
          // 
          if (!(MainFrm.ChkImpPrec(new IDVariant(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
          {
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Imp Prec
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoImpPrec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Imp Prec Body
      // Procedure Body
      // 
      if (!(PROCPERSATTI.booleanValue()))
      {
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_INFORMIMPEGN, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_INFORMIMPEGN,(new IDVariant(0)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ApriInfoImpPrec", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Imp Prec Ori
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoImpPrecOri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Imp Prec Ori Body
      // Procedure Body
      // 
      if (!(PROCPERSATTI.booleanValue()))
      {
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_INFORMIMPEGN, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_INFORMIMPEGN,(new IDVariant(0)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ApriInfoImpPrecOri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Livello 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaLivello5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Livello 5 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0),IDVariant.DECIMAL));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ApriSceltaLivello5", _e);
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
    IDVariant v_ERROR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0)))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Indicare l'Impegno", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Indicare il nuovo capitolo"))); 
        return 0;
      }
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant());
      v_MESSAGGIO = ControlliCapitolo();
      if (!(IDL.IsNull(v_MESSAGGIO)))
      {
        IDVariant v_CONFERMA = null;
        v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(v_MESSAGGIO)));
        if (!(v_CONFERMA.booleanValue()))
        {
          return 0;
        }
        else
        {
          // 
          // 
          // 
          // 
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.RETTIFICAPEGIMP(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0), v_ERROR);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          ELABORA_PARAMEDELET1();
        }
      }
      else
      {
        // 
        // 
        // 
        // 
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.RETTIFICAPEGIMP(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEFINAN, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEOPERA, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMOBIOPE, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECGU, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEVLIVE, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMANIMPR, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMNUIMPR, 0), v_ERROR);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        ELABORA_PARAMEDELETE();
      }
      // if (v_ERROR.equals((new IDVariant(1)), true))
      // {
        // MainFrm.set_AlertMessage(v_MSG); 
        // return 0;
      // }
      // if (v_ERROR.equals((new IDVariant(2)), true))
      // {
        // MainFrm.set_AlertMessage(v_MSG); 
        // return 0;
      // }
      // if (v_ERROR.compareTo((new IDVariant(1)), true)!=0 && v_ERROR.compareTo((new IDVariant(2)), true)!=0)
      // {
        // MainFrm.set_AlertMessage(v_MSG); 
      // }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ELABORA_PARAMEDELET1() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ELABORA_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMVLIVIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCGUIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBOPIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Info
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAM162, IMDBDef4.FLD_PARAM162_PARAMNUMEIMP, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM162, IMDBDef4.FLD_PARAM162_PARAMANNOIMP, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_FINANZIAMEN1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "EtichettaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI518, IMDBDef1.FLD_PARAMETRI518_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI518, IMDBDef1.FLD_PARAMETRI518_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELIMPEANNO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "EtichettaSceltaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta CGU
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCGU ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta CGU Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
      {
        IDVariant v_VOCEECON = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VOCE_ECON as CAPVOCEECON ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VOCEECON = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAVOCEECON, 0, new IDVariant(v_VOCEECON));
        MainFrm.UnloadForm(MyGlb.FRM_SCECODGECOFI,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_SCECODGECOFI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "SceltaCGU", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Impegno Prec
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneImpegnoPrec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Impegno Prec Body
      // Procedure Body
      // 
      if (!(PROCPERSATTI.booleanValue()))
      {
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_SCEIMPANNPRE, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCEIMPANNPRE,(new IDVariant(0)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRSIAP, IMDBDef1.FLD_PARAMETRSIAP_ROWNAMECAPIT, 0, new IDVariant(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRSIAP, IMDBDef1.FLD_PARAMETRSIAP_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0));
        MainFrm.Show(MyGlb.FRM_SCEIMPANNPRE, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "SelezioneImpegnoPrec", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "SelezioneCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDVariant ControlliCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Capitolo Body
      // Corpo Procedura
      // 
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant());
      IDVariant v_CODSTRCAPIMP = null;
      v_CODSTRCAPIMP = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODSTRCAPIMP = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
      }
      QV.Close();
      // 
      // 
      // 
      // 
      IDVariant v_CODSTRNUOCAP = null;
      v_CODSTRNUOCAP = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODSTRNUOCAP = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_CODSTRCAPIMP.compareTo(v_CODSTRNUOCAP, true)!=0)
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice struttura "))), v_CODSTRNUOCAP), (new IDVariant(" diverso dal codice struttura "))), v_CODSTRCAPIMP), (new IDVariant(" dell'attuale capitolo"))), IDL.CHR((new IDVariant(10)))), IDL.CHR((new IDVariant(13))));
      }
      IDVariant v_CODLIVNUOCAP = null;
      v_CODLIVNUOCAP = MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMECAP, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEART, 0));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0).compareTo(v_CODLIVNUOCAP, true)!=0)
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice riclassificazione IV "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0))), (new IDVariant(" diverso dal codice riclassificazione IV "))), IDL.ToString(v_CODLIVNUOCAP)), (new IDVariant(" dell'attuale capitolo"))), IDL.CHR((new IDVariant(10)))), IDL.CHR((new IDVariant(13))));
      }
      IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI371, IMDBDef13.PQSL_PARAMETRI371_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT ((A.ANNO_MAND IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((v_CONTA.compareTo((new IDVariant(0)), true)>0) && (IMDB.Value(IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMLIV4CA, 0).compareTo(v_CODLIVNUOCAP, true)!=0))
      {
        v_MESSAGGIO = IDL.Add(v_MESSAGGIO, (new IDVariant("Il nuovo capitolo ha codice riclassificazione IV diverso da quello dell'attuale capitolo e sull'impegno sono presenti liquidazioni già emesse in mandato")));
      }
      return v_MESSAGGIO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaCapitoloImp", "ControlliCapitolo", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETTICAPIIMP_PARAMETRI371() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI371_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI515, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI515, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI371_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI371_RS, 0, IMDBDef4.TBL_PARAMETRI515, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 0, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 1, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEART, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 2, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 3, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 4, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 5, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 6, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 7, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 8, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 9, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 10, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 11, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 12, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI371_RS, 13, 0, IMDBDef4.TBL_PARAMETRI515, IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI515, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI515, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI515, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI371_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRSELCAPBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFCAPBUT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_CGU1)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCGU();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_VLIVELLO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaLivello5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFIMPROR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpPrecOri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHETTINFO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICSCELACCE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SELEZIMPPREC)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneImpegnoPrec();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRINFIMPPRE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpPrec();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_IMPEGNO)
      {
        PFL_PARAMETRI_IMPEGNO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "4539A797-A5AB-4683-846B-909D7DC63E3E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "Nuovo Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, MyGlb.PANEL_FORM, 100, 224, 676, 38, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0, 84);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVOCAPITOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, "F3B9848A-C9E8-4F9E-9771-DCA79BBF56AC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, "Impegno Esercizio Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, MyGlb.PANEL_FORM, 100, 343, 672, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, 0, 171);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_IMPEESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 41);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "65A6900E-37F4-4EFE-A38F-AD20F268C5DA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "Capitolo/Art.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "C2A84DAE-A5D1-448B-98D0-480FD5566300");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "Art");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "EC1C5739-2FFB-43EB-897C-941D0908C959");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, "24BC5C62-EF17-440C-8CC4-4A9D9BBDA36D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, "56378A6F-82E2-44B6-B9EE-F602C30A54E3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "07C011C7-4673-43B1-BFDE-B2D2971029EE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "E4F00EC4-122C-4D94-A80D-6314BCFE8CAB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "CAP DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "67320ED0-AAB9-429F-9469-8CCF2C019949");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, "5C97563B-A5C4-478F-80B1-B64541354099");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, "Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, "5910F4D9-C1F9-4C5A-B1AC-3A0F10CC0A04");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, "Capitolo/Art.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, "363DDE5C-B592-4E62-AC5D-5E03708D47BB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, "Art Imp");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "66E720DE-BDBA-4EE4-AD42-900294B7B6C6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "3F76FF2E-2745-4FFE-8299-D5090EED4607");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "Finanziamento - Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "D4E8B584-D9CE-4E8E-AFFE-819E7994E6B9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "Obiettivo Operativo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, "CB3BD0D1-04AB-429F-95C0-EF88696A95FA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, "CGU");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "D07DB0FF-E253-41A4-8E76-8A483D005A06");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "937A5D9F-D65B-4132-88FF-5918521B96CE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "IV Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "02D91D35-228E-47E5-AF16-EC6F92D116B2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "A0BDA4C1-2F58-47BC-9A37-E0CE6B7625D2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "V Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "92B1EFA3-7686-4220-9383-82D93B93F10A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "BD01A277-93F3-4EDE-9735-649CB5CD5637");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "Finanziamento - Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, "AC214B6A-9483-4961-9AEB-780CDE5609F8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, "CGU");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "52977A86-A4D1-4BFD-9177-E36BE6317BF3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "CODICI GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "9C858653-8D3E-468F-9A7A-046B2BB96C59");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "V Livello");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.VIS_INTE10NORFIE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "8CD0013F-6FAC-4E13-B363-0D0B27AF8924");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "VISTA STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, "1B3E5384-0CDA-4F6A-BA33-60D7AA95B361");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, "Impegno esercizio precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, "4066784B-5D54-4EEF-BA72-407E6900BC08");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, "10CFE9BB-4A05-4DEA-B7C6-83797462F2E7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, "Informazioni Impegno Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "CBE0BB18-341F-4F38-B123-6CBE2485E2CC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, "22AE5C8E-5BEA-46E8-B5A8-7C123EA125C7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "187AA3DB-43C7-416D-BE94-47E8B93F5CAA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "C082FC25-2B32-476A-8DDE-F2B463645229");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "Opera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, "471AC785-C657-4F4D-A97B-A0DF8B63925B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, 0, "wsearch.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, "F068B65D-31C6-425D-B8B3-84101545EA8B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, "Numero/Anno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "671B1D7E-DCD8-470C-B553-B44BD1497903");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, " /");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, "lblgrp");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, "074DEAF0-5940-4154-8ED6-4B862102D734");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, "Anno Imp Prec");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, "1AD5103D-770E-4580-A8B9-3AEF61B36C7B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, "Seleziona Impegno Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, "67372C7B-26C0-41B4-AD99-C2C0BBC622AD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, "Informazioni Impegno Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, "E2AD2D25-5174-4D75-8DAC-19765C0AA7C0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, "lblgrp");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, "F2DB54A9-98AE-4409-BD7E-B27D27530B30");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, "lblgrp");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.VIS_LABELFIELD);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, "26EEC515-61F8-4E93-BCDB-A524F30FBBFC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, "Obiettivo Operativo 1");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 64, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_LIST, "Cap. Art");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 104, 238, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAP, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAP, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAP, PPQRY_PARAMETRI371, "A.ROWNAMECAP", "ROWNAMECAP", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_LIST, "Art");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 352, 238, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ART, MyGlb.PANEL_FORM, "Art");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ART, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ART, PPQRY_PARAMETRI371, "A.ROWNAMEART", "ROWNAMEART", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 48, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 332, 238, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 120, 80, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 740, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRSELCAPBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRSELCAPBUT, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRSELCAPBUT, -1, "", "APRSELCAPBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_APRSELCAPBUT, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 756, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFCAPBUT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFCAPBUT, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFCAPBUT, -1, "", "APRINFCAPBUT", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_APRINFCAPBUT, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 96, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 172, 238, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE3, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_LIST, "CAP DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 376, 238, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZI1, MyGlb.PANEL_FORM, "CAP DESCR. 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPDESCRIZI1, -1, GRP_PARAMETRI_NUOVOCAPITOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPDESCRIZI1, PPQRY_CAPNUOVO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 216, 152, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 656, 404, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_FORM, 96, 12, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPEGNO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPEGNO, PPQRY_PARAMETRI371, "A.ROWNAMEIMPEG", "ROWNAMEIMPEG", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_FORM, 104, 36, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPIMP, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPIMP, PPQRY_PARAMETRI371, "A.ROWNAMCAPIMP", "ROWNAMCAPIMP", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_LIST, "Art Imp");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_FORM, 352, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTIMP, MyGlb.PANEL_FORM, "Art Imp");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTIMP, PPQRY_PARAMETRI371, "A.ROWNAMARTIMP", "ROWNAMARTIMP", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 380, 36, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPDESCRIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_LIST, "Finanziamento - Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 52, 60, 684, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCOPEDESCRI, MyGlb.PANEL_FORM, "Finanziamento - Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ACCOPEDESCRI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ACCOPEDESCRI, PPQRY_IMPFIN, "LPAD(TO_CHAR ( D.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( E.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || D.DESCRIZIONE || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 545, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 64, 84, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERAT, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OBIETTOPERAT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OBIETTOPERAT, PPQRY_PROGETTI, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~TBL_PARAMETRI515.ROWNAMECAP~~,~~TBL_PARAMETRI515.ROWNAMEART~~,TRUNC( SYSDATE ),'NO')", "PROGEPROGEID", 5, 99, 0, -13997);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_OBIETTOPERAT, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_LIST, "CGU");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_FORM, 88, 108, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU, MyGlb.PANEL_FORM, "CGU");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CGU, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CGU, PPQRY_IMP, "A.CODICE", "ACCCODGESCOD", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 284, 108, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDESC, MyGlb.PANEL_FORM, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODIGESTDESC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODIGESTDESC, PPQRY_IMP, "A.DESCRIZIONE", "ACCCODGESDES", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 0, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 228);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_LIST, "IV Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 76, 132, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IVLIVELLO, MyGlb.PANEL_FORM, "IV Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IVLIVELLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IVLIVELLO, PPQRY_VISTARICLCAP, "A.CODICE", "VISRICCAPCOD", 3, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 320);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_LIST, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 284, 132, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 320);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VIRICADECOST, MyGlb.PANEL_FORM, "VISTA RICLASSIFICAZIONI CAP DES CODICE STRUTTURA");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VIRICADECOST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VIRICADECOST, PPQRY_VISTARICLCAP, "A.DES_CODICE_STRUTTURA", "VIRICADECOST", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_LIST, "V Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 60, 156, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICCOD, MyGlb.PANEL_FORM, "V Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICCOD, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICCOD, PPQRY_VISTSTRURICL, "A.CODICE", "VISSTRRICCOD", 1, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 284, 156, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDES, MyGlb.PANEL_FORM, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICDES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICDES, PPQRY_VISTSTRURICL, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_LIST, "Finanziamento - Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 48, 268, 688, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINOPE, MyGlb.PANEL_FORM, "Finanziamento - Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINOPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINOPE, PPQRY_BILFIN, "LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE", "DESCRIZIONE", 5, 605, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_LIST, "CGU");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_FORM, 140, 292, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CGU1, MyGlb.PANEL_FORM, "CGU");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CGU1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CGU1, PPQRY_PARAMETRI371, "A.ROWNAMECGU", "ROWNAMECGU", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 284, 292, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODIGESTDES1, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODIGESTDES1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODIGESTDES1, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_LIST, "V Livello");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 132, 316, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VLIVELLO, MyGlb.PANEL_FORM, "V Livello");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VLIVELLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VLIVELLO, PPQRY_PARAMETRI371, "A.ROWNAMEVLIVE", "ROWNAMEVLIVE", 3, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 284, 316, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 220);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VISSTRRICDE1, MyGlb.PANEL_FORM, "VIS. STRUTTURA RICL DESCRIZIONE 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VISSTRRICDE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VISSTRRICDE1, PPQRY_VISTSTRURIC1, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_LIST, "Impegno esercizio precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_FORM, 8, 180, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_FORM, 180);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMIMPPREORI, MyGlb.PANEL_FORM, "Impegno esercizio precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMIMPPREORI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMIMPPREORI, PPQRY_PARAMETRI371, "A.RONANUIMPROR", "RONANUIMPROR", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_FORM, 240, 180, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNIMPPREORI, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNIMPPREORI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNIMPPREORI, PPQRY_PARAMETRI371, "A.RONAANIMPROR", "RONAANIMPROR", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_LIST, 144, 104, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_FORM, 308, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPROR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFIMPROR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFIMPROR, -1, "", "APRINFIMPROR", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_APRINFIMPROR, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 56, 52, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 332, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTILABEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTILABEL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTILABEL1, -1, "", "TRATTILABEL1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 668, 64, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 740, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTINFO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTINFO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTINFO, -1, "", "ETICHETTINFO", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_ETICHETTINFO, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINANZIAMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINANZIAMENT, PPQRY_PARAMETRI371, "A.ROWNAMEFINAN", "ROWNAMEFINAN", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 4, 376, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OPERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OPERA, PPQRY_PARAMETRI371, "A.ROWNAMEOPERA", "ROWNAMEOPERA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 676, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 236, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSCELACCE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSCELACCE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSCELACCE, -1, "", "ETICSCELACCE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_ETICSCELACCE, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_LIST, "Numero/Anno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_FORM, 192, 368, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERIMPPREC, MyGlb.PANEL_FORM, "Numero/Anno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERIMPPREC, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERIMPPREC, PPQRY_PARAMETRI371, "A.ROWNAMNUIMPR", "ROWNAMNUIMPR", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 408, 376, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 236, 368, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASH, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_LIST, "Anno Imp Prec");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_FORM, 256, 368, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMPPREC, MyGlb.PANEL_FORM, "Anno Imp Prec");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOIMPPREC, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOIMPPREC, PPQRY_PARAMETRI371, "A.ROWNAMANIMPR", "ROWNAMANIMPR", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_LIST, 128, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_FORM, 300, 368, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELEZIMPPREC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SELEZIMPPREC, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SELEZIMPPREC, -1, "", "SELEZIMPPREC", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_SELEZIMPPREC, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_LIST, 136, 96, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_FORM, 320, 368, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRINFIMPPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRINFIMPPRE, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRINFIMPPRE, -1, "", "APRINFIMPPRE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_APRINFIMPPRE, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_LIST, 392, 360, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_FORM, 104, 372, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGRP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHELBLGRP, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHELBLGRP, -1, "", "ETICHELBLGRP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_LIST, 400, 368, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_FORM, 744, 372, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHELBLGR1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHELBLGR1, -1, GRP_PARAMETRI_IMPEESERPREC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHELBLGR1, -1, "", "ETICHELBLGR1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_LIST, "Obiettivo Operativo 1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_FORM, 4, 464, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OBIETTOPERA1, MyGlb.PANEL_FORM, "Obiet. Operativo 1");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OBIETTOPERA1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OBIETTOPERA1, PPQRY_PARAMETRI371, "A.ROWNAMOBIOPE", "ROWNAMOBIOPE", 5, 9, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 11);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI515.ROWNAMCAPIMP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI515.ROWNAMARTIMP~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( D.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( E.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || D.DESCRIZIONE || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  IMP_FIN B, ");
    SQL.append("  FINANZIAMENTI D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (A.ANNO_IMP = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~ROWNAMEIMPEG~~) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (D.CODICE = B.FINANZIAMENTO) ");
    SQL.append("and   (E.CODICE = B.OPERA) ");
    SQL.append("and   (");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  IMP_FIN C ");
    SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append(") = 1) ");
    PAN_PARAMETRI.SetQuery(PPQRY_IMPFIN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_IMPFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_IMPFIN, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~TBL_PARAMETRI515.ROWNAMECAP~~,~~TBL_PARAMETRI515.ROWNAMEART~~,TRUNC( SYSDATE ),'NO') as PROGEPROGEID ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~TBL_PARAMETRI515.ROWNAMOBOPIM~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ACCCODGESCOD, ");
    SQL.append("  A.DESCRIZIONE as ACCCODGESDES ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~TBL_PARAMETRI515.ROWNAMCGUIMP~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_PARAMETRI.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_IMP, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISRICCAPCOD, ");
    SQL.append("  A.DES_CODICE_STRUTTURA as VIRICADECOST ");
    SQL.append("from ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI515.ROWNAMCAPIMP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI515.ROWNAMARTIMP~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTARICLCAP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTARICLCAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTARICLCAP, "VISTA_RICLASSIFICAZIONI_CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES, ");
    SQL.append("  A.CODICE as VISSTRRICCOD ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~TBL_PARAMETRI515.ROWNAMVLIVIM~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTSTRURICL, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.CODICE as BILFINFINCOD, ");
    SQL.append("  C.CODICE as BILFINOPECOD, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.OPERA = ~~ROWNAMEOPERA~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~ROWNAMEFINAN~~) ");
    SQL.append("and   (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_BILFIN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BILFIN, "BIL_FIN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BILFIN, PFL_PARAMETRI_FINANZIAMENT, "BILFINFINCOD");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BILFIN, PFL_PARAMETRI_OPERA, "BILFINOPECOD");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.CODICE as BILFINFINCOD, ");
    SQL.append("  C.CODICE as BILFINOPECOD, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_BILFIN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BILFIN, "DESCRIZIONE", "Descrizione");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECGU~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~ROWNAMEVLIVE~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((NVL(~~TBL_PARAMETRI515.ROWNAMLIV4CA~~, 0) = 0 OR A.CODICE_PADRE = ~~TBL_PARAMETRI515.ROWNAMLIV4CA~~)) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTSTRURIC1, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTSTRURIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VISTSTRURIC1, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~ROWNAMECAP~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEART~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAPNUOVO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAPNUOVO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CAPNUOVO, "CAP");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI371", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI371, IMDBDef13.PQRY_PARAMETRI371_RS, IMDBDef4.TBL_PARAMETRI515);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAP, IMDBDef4.FLD_PARAMETRI515_ROWNAMECAP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ART, IMDBDef4.FLD_PARAMETRI515_ROWNAMEART);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPEGNO, IMDBDef4.FLD_PARAMETRI515_ROWNAMEIMPEG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPIMP, IMDBDef4.FLD_PARAMETRI515_ROWNAMCAPIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTIMP, IMDBDef4.FLD_PARAMETRI515_ROWNAMARTIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CGU1, IMDBDef4.FLD_PARAMETRI515_ROWNAMECGU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VLIVELLO, IMDBDef4.FLD_PARAMETRI515_ROWNAMEVLIVE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMIMPPREORI, IMDBDef4.FLD_PARAMETRI515_RONANUIMPROR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNIMPPREORI, IMDBDef4.FLD_PARAMETRI515_RONAANIMPROR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FINANZIAMENT, IMDBDef4.FLD_PARAMETRI515_ROWNAMEFINAN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_OPERA, IMDBDef4.FLD_PARAMETRI515_ROWNAMEOPERA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERIMPPREC, IMDBDef4.FLD_PARAMETRI515_ROWNAMNUIMPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOIMPPREC, IMDBDef4.FLD_PARAMETRI515_ROWNAMANIMPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_OBIETTOPERA1, IMDBDef4.FLD_PARAMETRI515_ROWNAMOBIOPE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI515");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
