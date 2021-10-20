// **********************************************
// Estrazione IVA Excel
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneIVAExcel extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESTIVATIPRE1_CODICE1 = 0;
  private static int PFL_ESTIVATIPRE1_RAGIONSOCIA1 = 1;
  private static int PFL_ESTIVATIPRE1_TRATTAMENIV1 = 2;
  private static int PFL_ESTIVATIPRE1_NUMEROREG1 = 3;
  private static int PFL_ESTIVATIPRE1_DATAREG1 = 4;
  private static int PFL_ESTIVATIPRE1_NUMERODOC1 = 5;
  private static int PFL_ESTIVATIPRE1_DATADOC1 = 6;
  private static int PFL_ESTIVATIPRE1_DESCRDOC1 = 7;
  private static int PFL_ESTIVATIPRE1_IMPONIBILE1 = 8;
  private static int PFL_ESTIVATIPRE1_IVA1 = 9;
  private static int PFL_ESTIVATIPRE1_PERCENTUALE1 = 10;
  private static int PFL_ESTIVATIPRE1_ESENZIONE1 = 11;

  private static int PPQRY_FAT5 = 0;


  IDPanel PAN_ESTIVATIPRE1;
  private static int PFL_ESTIVATIPRE2_CODICE2 = 0;
  private static int PFL_ESTIVATIPRE2_RAGIONSOCIA2 = 1;
  private static int PFL_ESTIVATIPRE2_TRATTAMENIV2 = 2;
  private static int PFL_ESTIVATIPRE2_NUMEROREG2 = 3;
  private static int PFL_ESTIVATIPRE2_DATAREG2 = 4;
  private static int PFL_ESTIVATIPRE2_NUMERODOC2 = 5;
  private static int PFL_ESTIVATIPRE2_DATADOC2 = 6;
  private static int PFL_ESTIVATIPRE2_DESCRDOC2 = 7;
  private static int PFL_ESTIVATIPRE2_IMPONIBILE2 = 8;
  private static int PFL_ESTIVATIPRE2_IVA2 = 9;
  private static int PFL_ESTIVATIPRE2_PERCENTUALE2 = 10;
  private static int PFL_ESTIVATIPRE2_ESENZIONE2 = 11;

  private static int PPQRY_FAT6 = 0;


  IDPanel PAN_ESTIVATIPRE2;
  private static int PFL_ESTIVATIPRE5_CODICE = 0;
  private static int PFL_ESTIVATIPRE5_RAGIONSOCIAL = 1;
  private static int PFL_ESTIVATIPRE5_TRATTAMENIVA = 2;
  private static int PFL_ESTIVATIPRE5_NUMEROREG3 = 3;
  private static int PFL_ESTIVATIPRE5_DATAREG = 4;
  private static int PFL_ESTIVATIPRE5_NUMERODOC3 = 5;
  private static int PFL_ESTIVATIPRE5_DATADOC = 6;
  private static int PFL_ESTIVATIPRE5_DESCRDOC3 = 7;
  private static int PFL_ESTIVATIPRE5_IMPONIBILE3 = 8;
  private static int PFL_ESTIVATIPRE5_IVA3 = 9;
  private static int PFL_ESTIVATIPRE5_PERCENTUALE3 = 10;
  private static int PFL_ESTIVATIPRE5_ESENZIONE3 = 11;

  private static int PPQRY_FAT13 = 0;


  IDPanel PAN_ESTIVATIPRE5;
  private static int PFL_ESTIVATIPRE6_NUMEROREG = 0;
  private static int PFL_ESTIVATIPRE6_NUMERODOC = 1;
  private static int PFL_ESTIVATIPRE6_DESCRDOC = 2;
  private static int PFL_ESTIVATIPRE6_IMPONIBILE = 3;
  private static int PFL_ESTIVATIPRE6_IVA = 4;
  private static int PFL_ESTIVATIPRE6_PERCENTUALE = 5;
  private static int PFL_ESTIVATIPRE6_ESENZIONE = 6;

  private static int PPQRY_FAT14 = 0;


  IDPanel PAN_ESTIVATIPRE6;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FAT5(IMDB);
    Init_PQRY_FAT6(IMDB);
    Init_PQRY_FAT13(IMDB);
    Init_PQRY_FAT14(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FAT5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT5, 12);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT5, "PQRY_FAT5");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDCODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORAGISOCI, "RECORAGISOCI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORAGISOCI,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORTRATIVA, "RECORTRATIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORTRATIVA,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECIVANUMREG, "RECIVANUMREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECIVANUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECIVADDATRE, "RECIVADDATRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECIVADDATRE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORNUMEDOC, "RECORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDATADOC, "RECORDATADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDESCDOC, "RECORDESCDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDESCDOC,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDIVA, "RECORDIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDPERCEN, "RECORDPERCEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_RECORDPERCEN,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_ESENZIONE, "ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT5,IMDBDef10.PQSL_FAT5_ESENZIONE,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT5, 0);
  }

  private static void Init_PQRY_FAT6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT6, 12);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT6, "PQRY_FAT6");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDCODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORAGISOCI, "RECORAGISOCI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORAGISOCI,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORTRATIVA, "RECORTRATIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORTRATIVA,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECIVANUMREG, "RECIVANUMREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECIVANUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECIVADDATRE, "RECIVADDATRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECIVADDATRE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORNUMEDOC, "RECORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDATADOC, "RECORDATADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDESCDOC, "RECORDESCDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDESCDOC,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDIVA, "RECORDIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDPERCEN, "RECORDPERCEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_RECORDPERCEN,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_ESENZIONE, "ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT6,IMDBDef10.PQSL_FAT6_ESENZIONE,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT6, 0);
  }

  private static void Init_PQRY_FAT13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT13, 12);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT13, "PQRY_FAT13");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDCODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORAGISOCI, "RECORAGISOCI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORAGISOCI,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORTRATIVA, "RECORTRATIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORTRATIVA,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECIVANUMREG, "RECIVANUMREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECIVANUMREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECIVADDATRE, "RECIVADDATRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECIVADDATRE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORNUMEDOC, "RECORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDATADOC, "RECORDATADOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDATADOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDESCDOC, "RECORDESCDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDESCDOC,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDIVA, "RECORDIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDPERCEN, "RECORDPERCEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_RECORDPERCEN,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_ESENZIONE, "ESENZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT13,IMDBDef10.PQSL_FAT13_ESENZIONE,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT13, 0);
  }

  private static void Init_PQRY_FAT14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FAT14, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_FAT14, "PQRY_FAT14");
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORNUMEREG, "RECORNUMEREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORNUMEREG,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORNUMEDOC, "RECORNUMEDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORNUMEDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDESCDOC, "RECORDESCDOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDESCDOC,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDIVA, "RECORDIVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDPERCEN, "RECORDPERCEN");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORDPERCEN,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORT06DESC, "RECORT06DESC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FAT14,IMDBDef10.PQSL_FAT14_RECORT06DESC,5,30,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FAT14, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneIVAExcel(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneIVAExcel()
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
    FormIdx = MyGlb.FRM_ESTRAIVAEXCE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C9A555EC-1AF5-4A84-891C-F00A827E29E5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 486;
    set_Caption(new IDVariant("Estrazione IVA Excel"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.295652;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 712;
    Frames[2].Height = 136;
    Frames[2].Caption = "Estrazione IVA";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 136;
    PAN_ESTIVATIPRE1 = new IDPanel(w, this, 2, "PAN_ESTIVATIPRE1");
    Frames[2].Content = PAN_ESTIVATIPRE1;
    PAN_ESTIVATIPRE1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTIVATIPRE1.VS = MainFrm.VisualStyleList;
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 136-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E1816805-496D-412F-ABAB-DFEC64A731C0");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1448, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTIVATIPRE1.InitStatus = 2;
    PAN_ESTIVATIPRE1_Init();
    PAN_ESTIVATIPRE1_InitFields();
    PAN_ESTIVATIPRE1_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 712;
    Frames[3].Height = 324;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.333333;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 712;
    Frames[4].Height = 108;
    Frames[4].Caption = "Estrazione IVA";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 108;
    PAN_ESTIVATIPRE2 = new IDPanel(w, this, 4, "PAN_ESTIVATIPRE2");
    Frames[4].Content = PAN_ESTIVATIPRE2;
    PAN_ESTIVATIPRE2.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTIVATIPRE2.VS = MainFrm.VisualStyleList;
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 108-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6698467E-AF93-415A-B670-728E5FAB52D8");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1448, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTIVATIPRE2.InitStatus = 2;
    PAN_ESTIVATIPRE2_Init();
    PAN_ESTIVATIPRE2_InitFields();
    PAN_ESTIVATIPRE2_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 712;
    Frames[5].Height = 216;
    Frames[5].Vertical = true;
    Frames[5].FormFactor = 0.685185;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 712;
    Frames[6].Height = 148;
    Frames[6].Caption = "Estrazione IVA";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 148;
    PAN_ESTIVATIPRE5 = new IDPanel(w, this, 6, "PAN_ESTIVATIPRE5");
    Frames[6].Content = PAN_ESTIVATIPRE5;
    PAN_ESTIVATIPRE5.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTIVATIPRE5.VS = MainFrm.VisualStyleList;
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 148-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A71120E3-1843-41A5-846A-6D24074E0099");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1448, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTIVATIPRE5.InitStatus = 2;
    PAN_ESTIVATIPRE5_Init();
    PAN_ESTIVATIPRE5_InitFields();
    PAN_ESTIVATIPRE5_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 712;
    Frames[7].Height = 68;
    Frames[7].Caption = "Estrazione IVA";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 68;
    PAN_ESTIVATIPRE6 = new IDPanel(w, this, 7, "PAN_ESTIVATIPRE6");
    Frames[7].Content = PAN_ESTIVATIPRE6;
    PAN_ESTIVATIPRE6.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTIVATIPRE6.VS = MainFrm.VisualStyleList;
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ACB00AE0-1E75-4D3B-972F-866899F5B17B");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 892, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTIVATIPRE6.InitStatus = 2;
    PAN_ESTIVATIPRE6_Init();
    PAN_ESTIVATIPRE6_InitFields();
    PAN_ESTIVATIPRE6_InitQueries();
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
      PAN_ESTIVATIPRE1.UpdatePanel(MainFrm);
      PAN_ESTIVATIPRE2.UpdatePanel(MainFrm);
      PAN_ESTIVATIPRE5.UpdatePanel(MainFrm);
      PAN_ESTIVATIPRE6.UpdatePanel(MainFrm);
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
    return (obj instanceof EstrazioneIVAExcel);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneIVAExcel.class.getName() : (Glb.ClassWithPackage(EstrazioneIVAExcel.class) ? EstrazioneIVAExcel.class.getName().substring(EstrazioneIVAExcel.class.getPackage().getName().length() + 1) : EstrazioneIVAExcel.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Estrazione IVA Tipo registro 1 After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTIVATIPRE1_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione IVA Tipo registro 1 After Find Body
      // Corpo Procedura
      // 
      if ((IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true)) || (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true)))
      {
        new IDVariant(PAN_ESTIVATIPRE1.ExportData((new IDVariant(-1)).booleanValue(),false)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneIVAExcel", "EstrazioneIVATiporegistro1AfterFind", _e);
    }
  }

  // **********************************************************************
  // Estrazione IVA Tipo Registro 2 After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTIVATIPRE2_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione IVA Tipo Registro 2 After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        new IDVariant(PAN_ESTIVATIPRE2.ExportData((new IDVariant(-1)).booleanValue(),false)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneIVAExcel", "EstrazioneIVATipoRegistro2AfterFind", _e);
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
      if ((IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true)) || (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true)))
      {
        PAN_ESTIVATIPRE1.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ESTIVATIPRE2.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE5.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE6.set_Visible((new IDVariant(0)).booleanValue());
      }
      else if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        PAN_ESTIVATIPRE1.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE2.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE5.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ESTIVATIPRE6.set_Visible((new IDVariant(0)).booleanValue());
      }
      else if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        PAN_ESTIVATIPRE1.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE2.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE5.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE6.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_ESTIVATIPRE1.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE2.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ESTIVATIPRE5.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ESTIVATIPRE6.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneIVAExcel", "Load", _e);
    }
  }

  // **********************************************************************
  // Estrazione IVA Tipo Registro 5 After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTIVATIPRE5_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione IVA Tipo Registro 5 After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        new IDVariant(PAN_ESTIVATIPRE5.ExportData((new IDVariant(-1)).booleanValue(),false)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneIVAExcel", "EstrazioneIVATipoRegistro5AfterFind", _e);
    }
  }

  // **********************************************************************
  // Estrazione IVA Tipo Registro 6 After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTIVATIPRE6_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estrazione IVA Tipo Registro 6 After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_T16, IMDBDef10.PQSL_T16_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        new IDVariant(PAN_ESTIVATIPRE6.ExportData((new IDVariant(-1)).booleanValue(),false)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneIVAExcel", "EstrazioneIVATipoRegistro6AfterFind", _e);
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
  private void PAN_ESTIVATIPRE1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTIVATIPRE1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTIVATIPRE1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTIVATIPRE1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTIVATIPRE1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTIVATIPRE1);
    // Stub
  }

  private void PAN_ESTIVATIPRE1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTIVATIPRE1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTIVATIPRE1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTIVATIPRE1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTIVATIPRE2_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTIVATIPRE2, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTIVATIPRE2_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTIVATIPRE2, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTIVATIPRE2_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTIVATIPRE2);
    // Stub
  }

  private void PAN_ESTIVATIPRE2_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTIVATIPRE2_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTIVATIPRE2_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTIVATIPRE2_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTIVATIPRE5_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTIVATIPRE5, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTIVATIPRE5_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTIVATIPRE5, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTIVATIPRE5_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTIVATIPRE5);
    // Stub
  }

  private void PAN_ESTIVATIPRE5_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTIVATIPRE5_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTIVATIPRE5_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTIVATIPRE5_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTIVATIPRE6_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTIVATIPRE6, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTIVATIPRE6_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTIVATIPRE6, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTIVATIPRE6_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTIVATIPRE6);
    // Stub
  }

  private void PAN_ESTIVATIPRE6_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTIVATIPRE6_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTIVATIPRE6_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTIVATIPRE6_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESTIVATIPRE1_Init()
  {

    PAN_ESTIVATIPRE1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTIVATIPRE1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTIVATIPRE1.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, "5DC5B576-7161-48E2-A72E-F870E1620688");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, "Codice");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.VIS_NORFIEINTLUN);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, "35F18E97-47AA-4706-925D-F376EA9F3DDD");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, "Ragione Sociale");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, "E7EB80BE-8AD8-4A83-8DCB-5CEFEECAD18B");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, "Trattamento IVA");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, "9BF119DA-3EA3-4DCE-9A1A-4AB006751F53");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, "Numero Reg");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, "0599102C-75AA-498E-B40C-C677968CD1DA");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, "Data Reg");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, "083399A3-3DD0-4AFA-8DF4-A7181CDA46B5");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, "Numero Doc");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, "33AF9725-3FD0-4FA2-B591-9AB08E8F1911");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, "Data doc");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, "97D23455-A0D4-4C2A-A7AD-EB768B600776");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, "Descr Doc");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, "22AF7548-9C74-48C0-A547-FB2BBC31C432");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, "Imponibile");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, "762F996C-BFFA-44A8-92F9-0FA2DCC30ABA");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, "Iva");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, "D525AEEE-4E79-4D93-8A31-66F03452C9FF");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, "%");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, "%");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, "CF811DB5-94B2-4100-9B2F-FC8E1C997D3C");
    PAN_ESTIVATIPRE1.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, "Esenzione");
    PAN_ESTIVATIPRE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, "");
    PAN_ESTIVATIPRE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE1.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTIVATIPRE1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_CODICE1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_CODICE1, PPQRY_FAT5, "A.CODICE", "RECORDCODICE", 1, 6, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_LIST, 72, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_LIST, 108);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_FORM, 4, 28, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_FORM, 108);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_RAGIONSOCIA1, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_RAGIONSOCIA1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_RAGIONSOCIA1, PPQRY_FAT5, "B.RAGIONE_SOCIALE", "RECORAGISOCI", 5, 40, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_LIST, 280, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_LIST, 116);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_LIST, "Trattamento IVA");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_FORM, 4, 268, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_FORM, 116);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_TRATTAMENIV1, MyGlb.PANEL_FORM, "Trattamento IVA");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_TRATTAMENIV1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_TRATTAMENIV1, PPQRY_FAT5, "A.TRATTAMENTO_IVA", "RECORTRATIVA", 5, 4, 0, -14253);
    PAN_ESTIVATIPRE1.SetValueListItem(PFL_ESTIVATIPRE1_TRATTAMENIV1, (new IDVariant("SP")), "Split Payment", "", "", -1);
    PAN_ESTIVATIPRE1.SetValueListItem(PFL_ESTIVATIPRE1_TRATTAMENIV1, (new IDVariant("RC")), "Reverse Charge", "", "", -1);
    PAN_ESTIVATIPRE1.SetValueListItem(PFL_ESTIVATIPRE1_TRATTAMENIV1, (new IDVariant()), "Standard", "", "", -1);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_LIST, 396, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_LIST, 80);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_LIST, "Numero Reg");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_FORM, 4, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_FORM, 80);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMEROREG1, MyGlb.PANEL_FORM, "Numero Reg");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_NUMEROREG1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_NUMEROREG1, PPQRY_FAT5, "C.NUMERO_REG", "RECIVANUMREG", 1, 5, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_LIST, 476, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_LIST, "Data Reg");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATAREG1, MyGlb.PANEL_FORM, "Data Reg");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_DATAREG1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_DATAREG1, PPQRY_FAT5, "C.D_DATA_REG", "RECIVADDATRE", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_LIST, 556, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_NUMERODOC1, MyGlb.PANEL_FORM, "Numero Doc");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_NUMERODOC1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_NUMERODOC1, PPQRY_FAT5, "A.NUMERO_DOC", "RECORNUMEDOC", 5, 20, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_LIST, 664, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_LIST, "Data doc");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DATADOC1, MyGlb.PANEL_FORM, "Data doc");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_DATADOC1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_DATADOC1, PPQRY_FAT5, "A.D_DATA_DOC", "RECORDATADOC", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_LIST, 744, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_LIST, "Descr Doc");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_FORM, 4, 148, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_DESCRDOC1, MyGlb.PANEL_FORM, "Descr Doc");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_DESCRDOC1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_DESCRDOC1, PPQRY_FAT5, "A.DESCRIZIONE", "RECORDESCDOC", 5, 60, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_LIST, 1052, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IMPONIBILE1, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_IMPONIBILE1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldUnbound(PFL_ESTIVATIPRE1_IMPONIBILE1, true);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_IMPONIBILE1, PPQRY_FAT5, "C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIMPONI", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_LIST, 1132, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_LIST, 28);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_LIST, "Iva");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_FORM, 28);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_IVA1, MyGlb.PANEL_FORM, "Iva");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_IVA1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldUnbound(PFL_ESTIVATIPRE1_IVA1, true);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_IVA1, PPQRY_FAT5, "C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIVA", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_LIST, 1212, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_LIST, 68);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_LIST, "%");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_FORM, 68);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_PERCENTUALE1, MyGlb.PANEL_FORM, "%");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_PERCENTUALE1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_PERCENTUALE1, PPQRY_FAT5, "C.ALIQUOTA", "RECORDPERCEN", 1, 2, 0, -13997);
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_LIST, 1280, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_LIST, 64);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_LIST, "Esenzione");
    PAN_ESTIVATIPRE1.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_FORM, 4, 244, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_FORM, 64);
    PAN_ESTIVATIPRE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE1_ESENZIONE1, MyGlb.PANEL_FORM, "Esenzione");
    PAN_ESTIVATIPRE1.SetFieldPage(PFL_ESTIVATIPRE1_ESENZIONE1, -1, -1);
    PAN_ESTIVATIPRE1.SetFieldUnbound(PFL_ESTIVATIPRE1_ESENZIONE1, true);
    PAN_ESTIVATIPRE1.SetFieldPanel(PFL_ESTIVATIPRE1_ESENZIONE1, PPQRY_FAT5, "CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END", "ESENZIONE", 5, 99, 0, -13997);
  }

  private void PAN_ESTIVATIPRE1_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTIVATIPRE1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTIVATIPRE1.SetIMDB(IMDB, "PQRY_FAT5", true);
    PAN_ESTIVATIPRE1.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  B.RAGIONE_SOCIALE as RECORAGISOCI, ");
    SQL.append("  A.TRATTAMENTO_IVA as RECORTRATIVA, ");
    SQL.append("  C.NUMERO_REG as RECIVANUMREG, ");
    SQL.append("  C.D_DATA_REG as RECIVADDATRE, ");
    SQL.append("  A.NUMERO_DOC as RECORNUMEDOC, ");
    SQL.append("  A.D_DATA_DOC as RECORDATADOC, ");
    SQL.append("  A.DESCRIZIONE as RECORDESCDOC, ");
    SQL.append("  C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIMPONI, ");
    SQL.append("  C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIVA, ");
    SQL.append("  C.ALIQUOTA as RECORDPERCEN, ");
    SQL.append("  CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END as ESENZIONE ");
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A, ");
    SQL.append("  BEN B, ");
    SQL.append("  IVA C, ");
    SQL.append("  T06 D, ");
    SQL.append("  T03 E ");
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE = B.CODICE(+)) ");
    SQL.append("and   (C.CODICE_ESENZIONE = D.CODICE(+)) ");
    SQL.append("and   (A.CODICE_DOC = E.CODICE(+)) ");
    SQL.append("and   (A.STORNO = E.STORNO(+)) ");
    SQL.append("and   (A.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (C.SERVIZIO = ~~PQRY_T16.TIPO_BOLLATO~~) ");
    SQL.append("and   (C.ANNO_REG = ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    SQL.append("and   (C.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   ((C.D_DATA_REG BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) ");
    SQL.append("and   (NOT ((C.NUMERO_REG IS NULL))) ");
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE1.SetQuery(PPQRY_FAT5, 5, SQL, -1, "");
    PAN_ESTIVATIPRE1.SetQueryDB(PPQRY_FAT5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTIVATIPRE1.SetMasterTable(0, "FAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTIVATIPRE1.Status() == 2)
    {
      int oldListQBE = PAN_ESTIVATIPRE1.iUseListQBE;
      PAN_ESTIVATIPRE1.iUseListQBE = 0;
      PAN_ESTIVATIPRE1.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTIVATIPRE1.PanelCommand(Glb.PCM_FIND);
      PAN_ESTIVATIPRE1.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ESTIVATIPRE2_Init()
  {

    PAN_ESTIVATIPRE2.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTIVATIPRE2.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTIVATIPRE2.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, "36C0349E-A199-4F7F-A81B-4C7111BF1079");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, "Codice");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.VIS_NORFIEINTLUN);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, "DA00E162-B155-45A6-9F20-DA226BDED9C2");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, "Ragione Sociale");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, "541B0F4A-4381-4CFC-ACD3-3789344DE886");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, "Trattamento IVA");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, "268F41E8-B89D-4B65-BB5A-E69C8D4E503E");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, "Numero Reg");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, "5B5AD2E8-5F96-47A5-B19E-3FD1D2853F8F");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, "Data Reg");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, "031A786B-1FF5-448B-AEB7-21B3D0E11DF1");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, "Numero Doc");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, "41FDBFC8-392F-4D15-B9C0-8199E22C3D3A");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, "Data doc");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, "FA8D3C45-17D0-4504-80EB-804F9C19FF28");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, "Descr Doc");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, "EF7DC581-0751-4E78-9C83-222C46EE1D6F");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, "Imponibile");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, "4FFC06BB-B5A7-404A-AE4A-EBCDAFE83EEC");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, "Iva");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, "D93481DC-059B-48B2-B9C5-CCDB5ABC64CB");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, "%");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, "%");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, "D7D1BE55-391C-4F88-9F6B-9E12EF10D78D");
    PAN_ESTIVATIPRE2.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, "Esenzione");
    PAN_ESTIVATIPRE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, "");
    PAN_ESTIVATIPRE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE2.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTIVATIPRE2_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_LIST, 52);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_LIST, "Codice");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_FORM, 52);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_CODICE2, MyGlb.PANEL_FORM, "Codice");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_CODICE2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_CODICE2, PPQRY_FAT6, "A.CODICE", "RECORDCODICE", 1, 6, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_LIST, 72, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_LIST, 108);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_FORM, 4, 28, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_FORM, 108);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_RAGIONSOCIA2, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_RAGIONSOCIA2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_RAGIONSOCIA2, PPQRY_FAT6, "B.RAGIONE_SOCIALE", "RECORAGISOCI", 5, 40, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_LIST, 280, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_LIST, 116);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_LIST, "Trattamento IVA");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_FORM, 4, 268, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_FORM, 116);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_TRATTAMENIV2, MyGlb.PANEL_FORM, "Trattamento IVA");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_TRATTAMENIV2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_TRATTAMENIV2, PPQRY_FAT6, "A.TRATTAMENTO_IVA", "RECORTRATIVA", 5, 4, 0, -14253);
    PAN_ESTIVATIPRE2.SetValueListItem(PFL_ESTIVATIPRE2_TRATTAMENIV2, (new IDVariant("SP")), "Split Payment", "", "", -1);
    PAN_ESTIVATIPRE2.SetValueListItem(PFL_ESTIVATIPRE2_TRATTAMENIV2, (new IDVariant("RC")), "Reverse Charge", "", "", -1);
    PAN_ESTIVATIPRE2.SetValueListItem(PFL_ESTIVATIPRE2_TRATTAMENIV2, (new IDVariant()), "Standard", "", "", -1);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_LIST, 396, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_LIST, 80);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_LIST, "Numero Reg");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_FORM, 4, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_FORM, 80);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMEROREG2, MyGlb.PANEL_FORM, "Numero Reg");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_NUMEROREG2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_NUMEROREG2, PPQRY_FAT6, "C.NUMERO_REG", "RECIVANUMREG", 1, 5, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_LIST, 476, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_LIST, "Data Reg");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATAREG2, MyGlb.PANEL_FORM, "Data Reg");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_DATAREG2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_DATAREG2, PPQRY_FAT6, "C.D_DATA_REG", "RECIVADDATRE", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_LIST, 556, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_NUMERODOC2, MyGlb.PANEL_FORM, "Numero Doc");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_NUMERODOC2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_NUMERODOC2, PPQRY_FAT6, "A.NUMERO_DOC", "RECORNUMEDOC", 5, 20, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_LIST, 664, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_LIST, "Data doc");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DATADOC2, MyGlb.PANEL_FORM, "Data doc");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_DATADOC2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_DATADOC2, PPQRY_FAT6, "A.D_DATA_DOC", "RECORDATADOC", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_LIST, 744, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_LIST, "Descr Doc");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_FORM, 4, 148, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_DESCRDOC2, MyGlb.PANEL_FORM, "Descr Doc");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_DESCRDOC2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_DESCRDOC2, PPQRY_FAT6, "A.DESCRIZIONE", "RECORDESCDOC", 5, 60, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_LIST, 1052, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IMPONIBILE2, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_IMPONIBILE2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldUnbound(PFL_ESTIVATIPRE2_IMPONIBILE2, true);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_IMPONIBILE2, PPQRY_FAT6, "C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIMPONI", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_LIST, 1132, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_LIST, 28);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_LIST, "Iva");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_FORM, 28);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_IVA2, MyGlb.PANEL_FORM, "Iva");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_IVA2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldUnbound(PFL_ESTIVATIPRE2_IVA2, true);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_IVA2, PPQRY_FAT6, "C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIVA", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_LIST, 1212, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_LIST, 68);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_LIST, "%");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_FORM, 68);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_PERCENTUALE2, MyGlb.PANEL_FORM, "%");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_PERCENTUALE2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_PERCENTUALE2, PPQRY_FAT6, "C.ALIQUOTA", "RECORDPERCEN", 1, 2, 0, -13997);
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_LIST, 1280, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_LIST, 64);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_LIST, "Esenzione");
    PAN_ESTIVATIPRE2.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_FORM, 4, 244, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_FORM, 64);
    PAN_ESTIVATIPRE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE2_ESENZIONE2, MyGlb.PANEL_FORM, "Esenzione");
    PAN_ESTIVATIPRE2.SetFieldPage(PFL_ESTIVATIPRE2_ESENZIONE2, -1, -1);
    PAN_ESTIVATIPRE2.SetFieldUnbound(PFL_ESTIVATIPRE2_ESENZIONE2, true);
    PAN_ESTIVATIPRE2.SetFieldPanel(PFL_ESTIVATIPRE2_ESENZIONE2, PPQRY_FAT6, "CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END", "ESENZIONE", 5, 99, 0, -13997);
  }

  private void PAN_ESTIVATIPRE2_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTIVATIPRE2.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTIVATIPRE2.SetIMDB(IMDB, "PQRY_FAT6", true);
    PAN_ESTIVATIPRE2.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  B.RAGIONE_SOCIALE as RECORAGISOCI, ");
    SQL.append("  A.TRATTAMENTO_IVA as RECORTRATIVA, ");
    SQL.append("  C.NUMERO_REG as RECIVANUMREG, ");
    SQL.append("  C.D_DATA_REG as RECIVADDATRE, ");
    SQL.append("  A.NUMERO_DOC as RECORNUMEDOC, ");
    SQL.append("  A.D_DATA_DOC as RECORDATADOC, ");
    SQL.append("  A.DESCRIZIONE as RECORDESCDOC, ");
    SQL.append("  C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIMPONI, ");
    SQL.append("  C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIVA, ");
    SQL.append("  C.ALIQUOTA as RECORDPERCEN, ");
    SQL.append("  CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END as ESENZIONE ");
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A, ");
    SQL.append("  BEN B, ");
    SQL.append("  IVA C, ");
    SQL.append("  T06 D, ");
    SQL.append("  T03 E ");
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE = B.CODICE(+)) ");
    SQL.append("and   (C.CODICE_ESENZIONE = D.CODICE(+)) ");
    SQL.append("and   (A.CODICE_DOC = E.CODICE(+)) ");
    SQL.append("and   (A.STORNO = E.STORNO(+)) ");
    SQL.append("and   (A.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (C.ANNO_REG_S = ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    SQL.append("and   (C.TIPO_REGISTRO_S = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   (C.TIPO_BOLLATO_S = ~~PQRY_T16.TIPO_BOLLATO~~) ");
    SQL.append("and   ((C.D_DATA_REG_S BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) ");
    SQL.append("and   (NOT ((C.NUMERO_REG_S IS NULL))) ");
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE2.SetQuery(PPQRY_FAT6, 5, SQL, -1, "");
    PAN_ESTIVATIPRE2.SetQueryDB(PPQRY_FAT6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTIVATIPRE2.SetMasterTable(0, "FAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTIVATIPRE2.Status() == 2)
    {
      int oldListQBE = PAN_ESTIVATIPRE2.iUseListQBE;
      PAN_ESTIVATIPRE2.iUseListQBE = 0;
      PAN_ESTIVATIPRE2.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTIVATIPRE2.PanelCommand(Glb.PCM_FIND);
      PAN_ESTIVATIPRE2.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ESTIVATIPRE5_Init()
  {

    PAN_ESTIVATIPRE5.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTIVATIPRE5.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTIVATIPRE5.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, "CC3B81AF-396E-4D2D-A613-F4B28BDDDDE8");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, "Codice");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.VIS_NORFIEINTLUN);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, "C8EF5A1B-997A-444D-8DE4-2AC2C8D82281");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, "89E47F07-A259-4688-A39D-807CC6BBBFCF");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, "Trattamento IVA");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, "31A23077-897A-44C5-A77C-755EEB31A20D");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, "Numero Reg");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, "080E1370-BFCE-4775-A615-3070FB9E534D");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, "Data Reg");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, "95FFF759-847B-452C-8FE1-1778440608B1");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, "Numero Doc");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, "E1E35C57-E8D5-4B53-8429-D61D43489D57");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, "Data doc");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, "ED88E1B5-1490-427E-AF39-F7C4A3AE2199");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, "Descr Doc");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, "F25574A0-9534-4AE4-BCD9-06E4F4EBB2C5");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, "Imponibile");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, "14EBC533-4241-43A3-8FF8-D8A56BF8524C");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, "Iva");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, "AD9556E1-29A0-4625-AAF7-1619D47C7AE2");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, "%");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, "%");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, "1B87E6D3-1A8D-4095-87E4-64FCEDCA77FF");
    PAN_ESTIVATIPRE5.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, "Esenzione");
    PAN_ESTIVATIPRE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, "");
    PAN_ESTIVATIPRE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE5.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTIVATIPRE5_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_FORM, 4, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_CODICE, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_CODICE, PPQRY_FAT13, "A.CODICE", "RECORDCODICE", 1, 6, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_LIST, 72, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 28, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_RAGIONSOCIAL, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_RAGIONSOCIAL, PPQRY_FAT13, "B.RAGIONE_SOCIALE", "RECORAGISOCI", 5, 40, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_LIST, 280, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_LIST, 116);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_LIST, "Trattamento IVA");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_FORM, 4, 268, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_FORM, 116);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_TRATTAMENIVA, MyGlb.PANEL_FORM, "Trattamento IVA");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_TRATTAMENIVA, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_TRATTAMENIVA, PPQRY_FAT13, "A.TRATTAMENTO_IVA", "RECORTRATIVA", 5, 4, 0, -14253);
    PAN_ESTIVATIPRE5.SetValueListItem(PFL_ESTIVATIPRE5_TRATTAMENIVA, (new IDVariant("SP")), "Split Payment", "", "", -1);
    PAN_ESTIVATIPRE5.SetValueListItem(PFL_ESTIVATIPRE5_TRATTAMENIVA, (new IDVariant("RC")), "Reverse Charge", "", "", -1);
    PAN_ESTIVATIPRE5.SetValueListItem(PFL_ESTIVATIPRE5_TRATTAMENIVA, (new IDVariant()), "Standard", "", "", -1);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_LIST, 396, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_LIST, 80);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_LIST, "Numero Reg");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_FORM, 4, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_FORM, 80);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMEROREG3, MyGlb.PANEL_FORM, "Numero Reg");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_NUMEROREG3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_NUMEROREG3, PPQRY_FAT13, "C.NUMERO_REG", "RECIVANUMREG", 1, 5, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_LIST, 476, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_LIST, "Data Reg");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_DATAREG, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_DATAREG, PPQRY_FAT13, "C.D_DATA_REG", "RECIVADDATRE", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_LIST, 556, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_NUMERODOC3, MyGlb.PANEL_FORM, "Numero Doc");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_NUMERODOC3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_NUMERODOC3, PPQRY_FAT13, "A.NUMERO_DOC", "RECORNUMEDOC", 5, 20, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_LIST, 664, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_LIST, "Data doc");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DATADOC, MyGlb.PANEL_FORM, "Data doc");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_DATADOC, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_DATADOC, PPQRY_FAT13, "A.D_DATA_DOC", "RECORDATADOC", 6, 10, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_LIST, 744, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_LIST, "Descr Doc");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_FORM, 4, 148, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_DESCRDOC3, MyGlb.PANEL_FORM, "Descr Doc");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_DESCRDOC3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_DESCRDOC3, PPQRY_FAT13, "A.DESCRIZIONE", "RECORDESCDOC", 5, 60, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_LIST, 1052, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IMPONIBILE3, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_IMPONIBILE3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldUnbound(PFL_ESTIVATIPRE5_IMPONIBILE3, true);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_IMPONIBILE3, PPQRY_FAT13, "C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIMPONI", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_LIST, 1132, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_LIST, 28);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_LIST, "Iva");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_FORM, 28);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_IVA3, MyGlb.PANEL_FORM, "Iva");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_IVA3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldUnbound(PFL_ESTIVATIPRE5_IVA3, true);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_IVA3, PPQRY_FAT13, "C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1)", "RECORDIVA", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_LIST, 1212, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_LIST, 68);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_LIST, "%");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_FORM, 68);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_PERCENTUALE3, MyGlb.PANEL_FORM, "%");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_PERCENTUALE3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_PERCENTUALE3, PPQRY_FAT13, "C.ALIQUOTA", "RECORDPERCEN", 1, 2, 0, -13997);
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_LIST, 1280, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_LIST, 64);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_LIST, "Esenzione");
    PAN_ESTIVATIPRE5.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_FORM, 4, 244, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_FORM, 64);
    PAN_ESTIVATIPRE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE5_ESENZIONE3, MyGlb.PANEL_FORM, "Esenzione");
    PAN_ESTIVATIPRE5.SetFieldPage(PFL_ESTIVATIPRE5_ESENZIONE3, -1, -1);
    PAN_ESTIVATIPRE5.SetFieldUnbound(PFL_ESTIVATIPRE5_ESENZIONE3, true);
    PAN_ESTIVATIPRE5.SetFieldPanel(PFL_ESTIVATIPRE5_ESENZIONE3, PPQRY_FAT13, "CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END", "ESENZIONE", 5, 99, 0, -13997);
  }

  private void PAN_ESTIVATIPRE5_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTIVATIPRE5.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTIVATIPRE5.SetIMDB(IMDB, "PQRY_FAT13", true);
    PAN_ESTIVATIPRE5.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  B.RAGIONE_SOCIALE as RECORAGISOCI, ");
    SQL.append("  A.TRATTAMENTO_IVA as RECORTRATIVA, ");
    SQL.append("  C.NUMERO_REG as RECIVANUMREG, ");
    SQL.append("  C.D_DATA_REG as RECIVADDATRE, ");
    SQL.append("  A.NUMERO_DOC as RECORNUMEDOC, ");
    SQL.append("  A.D_DATA_DOC as RECORDATADOC, ");
    SQL.append("  A.DESCRIZIONE as RECORDESCDOC, ");
    SQL.append("  C.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIMPONI, ");
    SQL.append("  C.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, C.CODICE_DOC, 1, -1) as RECORDIVA, ");
    SQL.append("  C.ALIQUOTA as RECORDPERCEN, ");
    SQL.append("  CASE WHEN NOT ((C.IVA_INDED IS NULL)) THEN 'Indeducibile' ELSE D.DESCRIZIONE END as ESENZIONE ");
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT A, ");
    SQL.append("  BEN B, ");
    SQL.append("  IVA C, ");
    SQL.append("  T06 D, ");
    SQL.append("  T03 E ");
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE = B.CODICE(+)) ");
    SQL.append("and   (C.CODICE_ESENZIONE = D.CODICE(+)) ");
    SQL.append("and   (A.CODICE_DOC = E.CODICE(+)) ");
    SQL.append("and   (A.STORNO = E.STORNO(+)) ");
    SQL.append("and   (A.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (C.SERVIZIO = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   (C.ANNO_REG < ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    SQL.append("and   (C.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   ((C.D_DATA_LIQ BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) ");
    SQL.append("and   ((C.D_DATA_REG < ~~TBL_PARAMETRI394.ROWNAMEDATAA~~) OR (TO_NUMBER(TO_CHAR(~~TBL_PARAMETRI394.ROWNAMEDATDA~~, 'dd')) = 1 AND TO_NUMBER(TO_CHAR(~~TBL_PARAMETRI394.ROWNAMEDATDA~~, 'mm' )) = 1)) ");
    SQL.append("and   (NOT ((C.NUMERO_REG IS NULL))) ");
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE5.SetQuery(PPQRY_FAT13, 5, SQL, -1, "");
    PAN_ESTIVATIPRE5.SetQueryDB(PPQRY_FAT13, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTIVATIPRE5.SetMasterTable(0, "FAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTIVATIPRE5.Status() == 2)
    {
      int oldListQBE = PAN_ESTIVATIPRE5.iUseListQBE;
      PAN_ESTIVATIPRE5.iUseListQBE = 0;
      PAN_ESTIVATIPRE5.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTIVATIPRE5.PanelCommand(Glb.PCM_FIND);
      PAN_ESTIVATIPRE5.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ESTIVATIPRE6_Init()
  {

    PAN_ESTIVATIPRE6.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTIVATIPRE6.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTIVATIPRE6.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, "310BB2AA-25FB-4C2F-B2E7-0F150BDE2720");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, "Numero Reg");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, "Brief description of field content.");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, "9173E593-416A-4B16-9C3D-E13D361493BF");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, "Numero Doc");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, "Brief description of field content.");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, "76A5C2FF-36F9-4B2F-9613-A5B1DA22A45C");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, "Descr Doc");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, "Brief description of field content.");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, "CF9E8DD8-3427-42B6-843A-B43FC33067BE");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, "Imponibile");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, "");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, "C813B520-75B7-49A5-B4B7-8A79606BC4E1");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, "Iva");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, "");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, "BD780C6C-2147-45AA-A246-B865CF9C5A1D");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, "%");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, "%");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTIVATIPRE6.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, "D327A2DC-BD97-4529-A42B-545AF76257D2");
    PAN_ESTIVATIPRE6.set_Header(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, "Esenzione");
    PAN_ESTIVATIPRE6.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, "");
    PAN_ESTIVATIPRE6.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_ESTIVATIPRE6.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_ESTIVATIPRE6_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_LIST, 80);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_LIST, "Numero Reg");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_FORM, 4, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_FORM, 80);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMEROREG, MyGlb.PANEL_FORM, "Numero Reg");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_NUMEROREG, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_NUMEROREG, PPQRY_FAT14, "A.NUMERO_REG", "RECORNUMEREG", 1, 5, 0, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_LIST, 80, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_FORM, 4, 100, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_NUMERODOC, MyGlb.PANEL_FORM, "Numero Doc");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_NUMERODOC, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_NUMERODOC, PPQRY_FAT14, "A.NUMERO_DOC", "RECORNUMEDOC", 5, 20, 0, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_LIST, 188, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_LIST, 84);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_LIST, "Descr Doc");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_FORM, 4, 148, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_FORM, 84);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_DESCRDOC, MyGlb.PANEL_FORM, "Descr Doc");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_DESCRDOC, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_DESCRDOC, PPQRY_FAT14, "A.DESCRIZIONE", "RECORDESCDOC", 5, 40, 0, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_LIST, 496, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_LIST, 76);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_FORM, 4, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_FORM, 76);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_IMPONIBILE, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldUnbound(PFL_ESTIVATIPRE6_IMPONIBILE, true);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_IMPONIBILE, PPQRY_FAT14, "B.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, B.CODICE_DOC, 1, -1)", "RECORDIMPONI", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_LIST, 576, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_LIST, 28);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_LIST, "Iva");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_FORM, 28);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_IVA, MyGlb.PANEL_FORM, "Iva");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_IVA, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldUnbound(PFL_ESTIVATIPRE6_IVA, true);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_IVA, PPQRY_FAT14, "B.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, B.CODICE_DOC, 1, -1)", "RECORDIVA", 3, 28, 6, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_LIST, 656, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_LIST, 68);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_LIST, "%");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_FORM, 68);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_PERCENTUALE, MyGlb.PANEL_FORM, "%");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_PERCENTUALE, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_PERCENTUALE, PPQRY_FAT14, "B.ALIQUOTA", "RECORDPERCEN", 1, 2, 0, -13997);
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_LIST, 724, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_LIST, 64);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_LIST, "Esenzione");
    PAN_ESTIVATIPRE6.SetRect(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_FORM, 4, 244, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTIVATIPRE6.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ESTIVATIPRE6.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ESTIVATIPRE6.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTIVATIPRE6_ESENZIONE, MyGlb.PANEL_FORM, "Esenzione");
    PAN_ESTIVATIPRE6.SetFieldPage(PFL_ESTIVATIPRE6_ESENZIONE, -1, -1);
    PAN_ESTIVATIPRE6.SetFieldPanel(PFL_ESTIVATIPRE6_ESENZIONE, PPQRY_FAT14, "C.DESCRIZIONE", "RECORT06DESC", 5, 30, 0, -13997);
  }

  private void PAN_ESTIVATIPRE6_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTIVATIPRE6.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTIVATIPRE6.SetIMDB(IMDB, "PQRY_FAT14", true);
    PAN_ESTIVATIPRE6.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_REG as RECORNUMEREG, ");
    SQL.append("  A.NUMERO_DOC as RECORNUMEDOC, ");
    SQL.append("  A.DESCRIZIONE as RECORDESCDOC, ");
    SQL.append("  B.IMPONIBILE * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, B.CODICE_DOC, 1, -1) as RECORDIMPONI, ");
    SQL.append("  B.IVA * CASE WHEN (A.CODICE_DOC = 2) OR (A.CODICE_DOC = 4) THEN -1 ELSE 1 END * DECODE(A.CODICE_DOC, B.CODICE_DOC, 1, -1) as RECORDIVA, ");
    SQL.append("  B.ALIQUOTA as RECORDPERCEN, ");
    SQL.append("  C.DESCRIZIONE as RECORT06DESC ");
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATPRI A, ");
    SQL.append("  IVAPRI B, ");
    SQL.append("  T06 C, ");
    SQL.append("  T03 D ");
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE_ESENZIONE = C.CODICE(+)) ");
    SQL.append("and   (A.CODICE_DOC = D.CODICE(+)) ");
    SQL.append("and   (D.STORNO = 0) ");
    SQL.append("and   (A.ANNO_PROG = B.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = B.NUMERO_PROG) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_T16.TIPO_REGISTRO~~) ");
    SQL.append("and   (A.ANNO_REG = ~~PQRY_PARAMETRI535.ROWNAMEESERC~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_T16.TIPO_BOLLATO~~) ");
    SQL.append("and   ((A.DATA_DOC BETWEEN ~~TBL_PARAMETRI394.ROWNAMEDATDA~~ AND ~~TBL_PARAMETRI394.ROWNAMEDATAA~~)) ");
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NUMERO_REG ");
    PAN_ESTIVATIPRE6.SetQuery(PPQRY_FAT14, 5, SQL, -1, "");
    PAN_ESTIVATIPRE6.SetQueryDB(PPQRY_FAT14, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTIVATIPRE6.SetMasterTable(0, "FATPRI");
    PAN_ESTIVATIPRE6.AddToSortList(PFL_ESTIVATIPRE6_NUMEROREG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTIVATIPRE6.Status() == 2)
    {
      int oldListQBE = PAN_ESTIVATIPRE6.iUseListQBE;
      PAN_ESTIVATIPRE6.iUseListQBE = 0;
      PAN_ESTIVATIPRE6.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTIVATIPRE6.PanelCommand(Glb.PCM_FIND);
      PAN_ESTIVATIPRE6.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_DynamicProperties();
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_DynamicProperties();
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_DynamicProperties();
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_AfterFind(CmdFind);
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_AfterFind(CmdFind);
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_AfterFind(CmdFind);
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ESTIVATIPRE1) PAN_ESTIVATIPRE1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ESTIVATIPRE2) PAN_ESTIVATIPRE2_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ESTIVATIPRE5) PAN_ESTIVATIPRE5_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ESTIVATIPRE6) PAN_ESTIVATIPRE6_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
