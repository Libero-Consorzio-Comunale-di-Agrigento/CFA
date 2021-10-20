// **********************************************
// Statistiche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Statistiche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RICERCA_CODICEESTRAZ = 0;
  private static int PFL_RICERCA_ANCHEELIMINA = 1;
  private static int PFL_RICERCA_VALIDEAL = 2;

  private static int PPQRY_PARAMETRI678 = 0;


  IDPanel PAN_RICERCA;
  OTabView TAB_STATISTICHE;
  private static int PFL_STATESECQUER_IDSELECT = 0;
  private static int PFL_STATESECQUER_CODICE1 = 1;
  private static int PFL_STATESECQUER_TITOLO1 = 2;
  private static int PFL_STATESECQUER_DESCRIZIONE1 = 3;
  private static int PFL_STATESECQUER_ESECUZIONI = 4;
  private static int PFL_STATESECQUER_TEMPOESECUZ1 = 5;
  private static int PFL_STATESECQUER_DATAINIZVALI = 6;
  private static int PFL_STATESECQUER_DATAFINEVALI = 7;
  private static int PFL_STATESECQUER_INUSO = 8;

  private static int PPQRY_CFESTRASTAT1 = 0;


  IDPanel PAN_STATESECQUER;
  private static int PFL_LOGESECUZION_CODICE2 = 0;
  private static int PFL_LOGESECUZION_DATAESECUZIO = 1;
  private static int PFL_LOGESECUZION_UTENTEESECUZ = 2;
  private static int PFL_LOGESECUZION_IDSELECT2 = 3;
  private static int PFL_LOGESECUZION_TITOLO2 = 4;
  private static int PFL_LOGESECUZION_QUERY = 5;
  private static int PFL_LOGESECUZION_INFO = 6;
  private static int PFL_LOGESECUZION_DATIESTRATTI = 7;
  private static int PFL_LOGESECUZION_TEMPOESECUZI = 8;
  private static int PFL_LOGESECUZION_DESCRIZIONE = 9;
  private static int PFL_LOGESECUZION_IDESECUZIONE = 10;

  private static int PPQRY_LOGESECUQUER = 0;


  IDPanel PAN_LOGESECUZION;
  private static int PFL_LOGCREAZMODI_IDSELECT3 = 0;
  private static int PFL_LOGCREAZMODI_CODICE = 1;
  private static int PFL_LOGCREAZMODI_TIPO = 2;
  private static int PFL_LOGCREAZMODI_DATAINSERIME = 3;
  private static int PFL_LOGCREAZMODI_UTENTEINSERI = 4;
  private static int PFL_LOGCREAZMODI_TITOLO = 5;
  private static int PFL_LOGCREAZMODI_VECCHIAQUERY = 6;
  private static int PFL_LOGCREAZMODI_INFOVECCQUER = 7;
  private static int PFL_LOGCREAZMODI_NUOVAQUERY = 8;
  private static int PFL_LOGCREAZMODI_INFONUOVQUER = 9;
  private static int PFL_LOGCREAZMODI_IDLOGMODIFIC = 10;

  private static int PPQRY_LOGCREMODQUE = 0;


  IDPanel PAN_LOGCREAZMODI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI99(IMDB);
    //
    //
    Init_PQRY_CFESTRASTAT1(IMDB);
    Init_PQRY_LOGESECUQUER(IMDB);
    Init_PQRY_LOGCREMODQUE(IMDB);
    Init_PQRY_PARAMETRI678(IMDB);
    Init_PQRY_PARAMETRI678_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI99(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI99, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI99, "TBL_PARAMETRI99");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMOGGANCELI, "NOMOGGANCELI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMOGGANCELI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMOGGCODSEL, "NOMOGGCODSEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMOGGCODSEL,9,20,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI99,IMDBDef7.FLD_PARAMETRI99_NOMEOGGVALAL,6,10,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI99, 0);
  }

  private static void Init_PQRY_CFESTRASTAT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASTAT1, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASTAT1, "PQRY_CFESTRASTAT1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_CODICE,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_ESECUZIONI, "ESECUZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_ESECUZIONI,3,38,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_TEMPO_ESECUZIONE, "TEMPO_ESECUZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_TEMPO_ESECUZIONE,3,38,4);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_ID_SELECT,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DATA_INIZIO_VALIDITA, "DATA_INIZIO_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DATA_INIZIO_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DATA_FINE_VALIDITA, "DATA_FINE_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_DATA_FINE_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_IN_USO, "IN_USO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_IN_USO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASTAT1,IMDBDef17.PQSL_CFESTRASTAT1_TITOLO,5,4000,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASTAT1, 0);
  }

  private static void Init_PQRY_LOGESECUQUER(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_LOGESECUQUER, 11);
    IMDB.set_TblCode(IMDBDef17.PQRY_LOGESECUQUER, "PQRY_LOGESECUQUER");
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUIE, "RECFESESQUIE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUIE,3,38,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUD1, "RECFESESQUD1");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUD1,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUUE, "RECFESESQUUE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUUE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTESQU, "RECCFESTESQU");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTESQU,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUIS, "RECFESESQUIS");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUIS,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUDE, "RECFESESQUDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUDE,10,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUTE, "RECFESESQUTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUTE,3,38,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSECO, "RECCFESTSECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSECO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSETI, "RECCFESTSETI");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSETI,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSEDE, "RECCFESTSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_RECCFESTSEDE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_INFO, "INFO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGESECUQUER,IMDBDef17.PQSL_LOGESECUQUER_INFO,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_LOGESECUQUER, 0);
  }

  private static void Init_PQRY_LOGCREMODQUE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_LOGCREMODQUE, 12);
    IMDB.set_TblCode(IMDBDef17.PQRY_LOGCREMODQUE, "PQRY_LOGCREMODQUE");
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_VECCHIA_QUERY, "VECCHIA_QUERY");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_VECCHIA_QUERY,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_NUOVA_QUERY, "NUOVA_QUERY");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_NUOVA_QUERY,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_ID_SELECT,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_INFOVECCQUER, "INFOVECCQUER");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_INFOVECCQUER,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_INFONUOVQUER, "INFONUOVQUER");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_INFONUOVQUER,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_ID_LOG_MODIFICA, "ID_LOG_MODIFICA");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_ID_LOG_MODIFICA,3,38,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSECO, "RECCFESTSECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSECO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSETI, "RECCFESTSETI");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSETI,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSEDE, "RECCFESTSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_LOGCREMODQUE,IMDBDef17.PQSL_LOGCREMODQUE_RECCFESTSEDE,5,4000,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_LOGCREMODQUE, 0);
  }

  private static void Init_PQRY_PARAMETRI678(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI678, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI678, "PQRY_PARAMETRI678");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMOGGANCELI, "NOMOGGANCELI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMOGGANCELI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL, "NOMOGGCODSEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL,9,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678,IMDBDef17.PQSL_PARAMETRI678_NOMEOGGVALAL,6,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI678, 0);
  }

  private static void Init_PQRY_PARAMETRI678_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI678_RS, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI678_RS, "PQRY_PARAMETRI678_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMOGGANCELI, "NOMOGGANCELI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMOGGANCELI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL, "NOMOGGCODSEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL,9,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMEOGGVALAL, "NOMEOGGVALAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI678_RS,IMDBDef17.PQSL_PARAMETRI678_NOMEOGGVALAL,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Statistiche(MyWebEntryPoint w, IMDBObj imdb)
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
  public Statistiche()
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
    FormIdx = MyGlb.FRM_STATISTICHE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7844170C-D223-4D39-A4AF-A715CF5A3B7D";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1228;
    DesignHeight = 658;
    set_Caption(new IDVariant("Statistiche"));
    //
    Frames = new AFrame[7];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1228;
    Frames[1].Height = 632;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.136076;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1228;
    Frames[2].Height = 86;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Ricerca";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 86;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_RICERCA = new IDPanel(w, this, 2, "PAN_RICERCA");
    Frames[2].Content = PAN_RICERCA;
    PAN_RICERCA.ShowToolbar = false;
    PAN_RICERCA.ShowStatusbar = false;
    PAN_RICERCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RICERCA.VS = MainFrm.VisualStyleList;
    PAN_RICERCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1228-MyGlb.PAN_OFFS_X, 86-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA257DCB-BDA6-4854-A8E9-5178FAE0BE6D");
    PAN_RICERCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RICERCA.InitStatus = 2;
    PAN_RICERCA_Init();
    PAN_RICERCA_InitFields();
    PAN_RICERCA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1228;
    Frames[3].Height = 546;
    Frames[3].Caption = "Statistiche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 546;
    TAB_STATISTICHE = new OTabView(this);
    Frames[3].Content = TAB_STATISTICHE;
    TAB_STATISTICHE.iGuid = "9CBC65D9-92DD-425F-AED3-FA0B0C50FF2B";
    TAB_STATISTICHE.SetItemCount(3);
    TAB_STATISTICHE.Placement = 1;
    TAB_STATISTICHE.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Statistiche Esecuzione Query";
    Frames[4].Parent = this;
    PAN_STATESECQUER = new IDPanel(w, this, 4, "PAN_STATESECQUER");
    Frames[4].Content = PAN_STATESECQUER;
    PAN_STATESECQUER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STATESECQUER.VS = MainFrm.VisualStyleList;
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1228-MyGlb.PAN_OFFS_X, 546-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DCEA22ED-15B5-4B94-B4AD-4643D11076AD");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1368, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE, -1);
    PAN_STATESECQUER.InitStatus = 2;
    PAN_STATESECQUER_Init();
    PAN_STATESECQUER_InitFields();
    PAN_STATESECQUER_InitQueries();
    TAB_STATISTICHE.SetItem(1, Frames[4], 0, "", "Statistiche Esecuzione Query", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Log Esecuzione";
    Frames[5].Parent = this;
    PAN_LOGESECUZION = new IDPanel(w, this, 5, "PAN_LOGESECUZION");
    Frames[5].Content = PAN_LOGESECUZION;
    PAN_LOGESECUZION.set_ShowGroups(true);
    PAN_LOGESECUZION.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LOGESECUZION.VS = MainFrm.VisualStyleList;
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1228-MyGlb.PAN_OFFS_X, 546-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0785E480-39C8-48BF-BBE9-E7003D6014F0");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1188, 456, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LOGESECUZION.InitStatus = 2;
    PAN_LOGESECUZION_Init();
    PAN_LOGESECUZION_InitFields();
    PAN_LOGESECUZION_InitQueries();
    TAB_STATISTICHE.SetItem(2, Frames[5], 0, "", "Log Esecuzione", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].Caption = "Log Creazione Modifica";
    Frames[6].Parent = this;
    PAN_LOGCREAZMODI = new IDPanel(w, this, 6, "PAN_LOGCREAZMODI");
    Frames[6].Content = PAN_LOGCREAZMODI;
    PAN_LOGCREAZMODI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LOGCREAZMODI.VS = MainFrm.VisualStyleList;
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1228-MyGlb.PAN_OFFS_X, 546-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "08F81193-2E4F-4A62-B9BE-F685559EEDEE");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1604, 496, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE, -1);
    PAN_LOGCREAZMODI.InitStatus = 2;
    PAN_LOGCREAZMODI_Init();
    PAN_LOGCREAZMODI_InitFields();
    PAN_LOGCREAZMODI_InitQueries();
    TAB_STATISTICHE.SetItem(3, Frames[6], 0, "", "Log Creazione Modifica", "");
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI99, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STATISTICHE_PARAMETRI678();
      }
      PAN_STATESECQUER.UpdatePanel(MainFrm);
      PAN_LOGESECUZION.UpdatePanel(MainFrm);
      PAN_LOGCREAZMODI.UpdatePanel(MainFrm);
      PAN_RICERCA.UpdatePanel(MainFrm);
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
    return (obj instanceof Statistiche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Statistiche.class.getName() : (Glb.ClassWithPackage(Statistiche.class) ? Statistiche.class.getName().substring(Statistiche.class.getPackage().getName().length() + 1) : Statistiche.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Statistiche Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_STATISTICHE_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Statistiche Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_STATISTICHE.SelectedPageIndex()).compareTo((new IDVariant(PAN_STATESECQUER.FrIndex)), true)!=0)
      {
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (PreviousPage.equals((new IDVariant(PAN_STATESECQUER.FrIndex)), true))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI678, IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRASTAT1, IMDBDef17.PQSL_CFESTRASTAT1_CODICE, 0));
          PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI678, IMDBDef17.PQSL_PARAMETRI678_NOMOGGCODSEL, 0, (new IDVariant()));
        PAN_RICERCA.SetFlags (Glb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Statistiche", "StatisticheChangePage", _e);
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
      PAN_LOGESECUZION.SetFieldBlobSize(PFL_LOGESECUZION_DATIESTRATTI, (new IDVariant(0)).intValue(), (new IDVariant(-1)).intValue(), (new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI99, IMDBDef7.FLD_PARAMETRI99_NOMEOGGVALAL, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Statistiche", "Load", _e);
    }
  }

  // **********************************************************************
  // Apri Info Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Select Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI687, IMDBDef7.FLD_PARAMETRI687_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_LOGESECUQUER, IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUIE, 0));
      MainFrm.Show(MyGlb.FRM_VISUASELELOG, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Statistiche", "ApriInfoSelect", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Vecchia Query
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoVecchiaQuery ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Vecchia Query Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI, IMDBDef7.FLD_PARAMETRI_NOMEOGGEQUER, 0, (new IDVariant("Vecchia")));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI, IMDBDef7.FLD_PARAMETRI_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_ID_LOG_MODIFICA, 0));
      MainFrm.Show(MyGlb.FRM_VISUINFOQUER, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Statistiche", "ApriInfoVecchiaQuery", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Nuova Query
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoNuovaQuery ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Nuova Query Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI, IMDBDef7.FLD_PARAMETRI_NOMEOGGEQUER, 0, (new IDVariant("Nuova")));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI, IMDBDef7.FLD_PARAMETRI_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_ID_LOG_MODIFICA, 0));
      MainFrm.Show(MyGlb.FRM_VISUINFOQUER, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Statistiche", "ApriInfoNuovaQuery", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STATISTICHE_PARAMETRI678() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI678_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI99, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI99, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI678_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI678_RS, 0, IMDBDef7.TBL_PARAMETRI99, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI678_RS, 0, 0, IMDBDef7.TBL_PARAMETRI99, IMDBDef7.FLD_PARAMETRI99_NOMOGGANCELI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI678_RS, 1, 0, IMDBDef7.TBL_PARAMETRI99, IMDBDef7.FLD_PARAMETRI99_NOMOGGCODSEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI678_RS, 2, 0, IMDBDef7.TBL_PARAMETRI99, IMDBDef7.FLD_PARAMETRI99_NOMEOGGVALAL, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI99, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI99, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI99, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI678_RS, 0);
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
  private void PAN_RICERCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RICERCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RICERCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RICERCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RICERCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RICERCA);
    // Stub
  }

  private void PAN_RICERCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RICERCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RICERCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RICERCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_STATISTICHE_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_STATISTICHE_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_STATESECQUER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STATESECQUER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STATESECQUER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STATESECQUER, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STATESECQUER_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_STATESECQUER);
    // Stub
  }

  private void PAN_STATESECQUER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STATESECQUER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STATESECQUER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STATESECQUER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LOGESECUZION_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LOGESECUZION, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LOGESECUZION_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LOGESECUZION, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LOGESECUZION_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LOGESECUZION);
    // Stub
  }

  private void PAN_LOGESECUZION_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LOGESECUZION_INFO)
    {
      this.IdxPanelActived = this.PAN_LOGESECUZION.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSelect();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LOGESECUZION_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LOGESECUZION_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_LOGESECUQUER, IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUD1, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_LOGESECUQUER, IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUD1, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_LOGESECUQUER, IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUDE, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_LOGESECUQUER, IMDBDef17.PQSL_LOGESECUQUER_RECFESESQUDE, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_LOGESECUZION_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LOGCREAZMODI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LOGCREAZMODI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LOGCREAZMODI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LOGCREAZMODI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LOGCREAZMODI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LOGCREAZMODI);
    // Stub
  }

  private void PAN_LOGCREAZMODI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LOGCREAZMODI_INFOVECCQUER)
    {
      this.IdxPanelActived = this.PAN_LOGCREAZMODI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVecchiaQuery();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LOGCREAZMODI_INFONUOVQUER)
    {
      this.IdxPanelActived = this.PAN_LOGCREAZMODI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoNuovaQuery();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LOGCREAZMODI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LOGCREAZMODI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_TIPO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_TIPO, 0, (new IDVariant("INSERIMENTO")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_DATA_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_LOGCREMODQUE, IMDBDef17.PQSL_LOGCREMODQUE_DATA_INSERIMENTO, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_LOGCREAZMODI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STATESECQUER_Init()
  {

    PAN_STATESECQUER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STATESECQUER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STATESECQUER.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, "270A4742-8C47-4F27-9C56-A1779FF4CC0F");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, "Id Select");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, "480BBD46-7B4A-460F-A462-467ACA334E5D");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, "Codice");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, "3C56E9D2-D18E-489E-83B9-52A81DA1EB96");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, "Titolo");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, "B23E6924-CB69-45C2-99AD-D5B292B3A5DC");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, "Descrizione");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, "2B4C11EC-1774-4CDF-B350-A1B71534FFB3");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, "Numero Esecuzioni");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, "4DD93111-BD97-4E4F-9B51-E34062C4BFA2");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, "Tempo Medio Esecuzione (Espresso in Secondi)");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, "F4AED912-9FF6-49D6-9A38-F0CEF871BD97");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, "Inizio Validità");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, "37429B24-5504-4C59-8CD1-995C758F39F1");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, "Fine Validità");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STATESECQUER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, "7476DC9D-EF3F-40A6-AF5E-27BF04B87D2D");
    PAN_STATESECQUER.set_Header(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, "In Uso");
    PAN_STATESECQUER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, "");
    PAN_STATESECQUER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.VIS_NORMALFIELDS);
    PAN_STATESECQUER.SetFlags(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STATESECQUER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_LIST, 64);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_LIST, "Id Select");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_FORM, 64);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_IDSELECT, MyGlb.PANEL_FORM, "Id Select");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_IDSELECT, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_IDSELECT, PPQRY_CFESTRASTAT1, "A.ID_SELECT", "ID_SELECT", 1, 19, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_FORM, 4, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_CODICE1, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_CODICE1, PPQRY_CFESTRASTAT1, "A.CODICE", "CODICE", 5, 20, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_LIST, 108, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_LIST, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_FORM, 4, 196, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_FORM, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TITOLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_TITOLO1, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_TITOLO1, PPQRY_CFESTRASTAT1, "A.TITOLO", "TITOLO", 5, 4000, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_LIST, 368, 36, 532, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_DESCRIZIONE1, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_DESCRIZIONE1, PPQRY_CFESTRASTAT1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_LIST, 900, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_LIST, 76);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_LIST, "Numero Esecuzioni");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_FORM, 4, 76, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_FORM, 76);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_ESECUZIONI, MyGlb.PANEL_FORM, "Num. Esec.");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_ESECUZIONI, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_ESECUZIONI, PPQRY_CFESTRASTAT1, "A.ESECUZIONI", "ESECUZIONI", 3, 38, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_LIST, 1020, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_LIST, 116);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_LIST, "Tempo Medio Esecuzione (Espresso in Secondi)");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_FORM, 4, 100, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_FORM, 116);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_TEMPOESECUZ1, MyGlb.PANEL_FORM, "T. Md. Esc. Esp. i. Sc.");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_TEMPOESECUZ1, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_TEMPOESECUZ1, PPQRY_CFESTRASTAT1, "A.TEMPO_ESECUZIONE", "TEMPO_ESECUZIONE", 3, 38, 4, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_LIST, 1172, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_LIST, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_LIST, "Inizio Validità");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_FORM, 4, 124, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_FORM, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAINIZVALI, MyGlb.PANEL_FORM, "Inizio Validità");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_DATAINIZVALI, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_DATAINIZVALI, PPQRY_CFESTRASTAT1, "A.DATA_INIZIO_VALIDITA", "DATA_INIZIO_VALIDITA", 6, 10, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_LIST, 1236, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_LIST, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_LIST, "Fine Validità");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_FORM, 4, 148, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_FORM, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_DATAFINEVALI, MyGlb.PANEL_FORM, "Fine Validità");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_DATAFINEVALI, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_DATAFINEVALI, PPQRY_CFESTRASTAT1, "A.DATA_FINE_VALIDITA", "DATA_FINE_VALIDITA", 6, 10, 0, -13997);
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_LIST, 1300, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_LIST, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_LIST, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_LIST, "In Uso");
    PAN_STATESECQUER.SetRect(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_FORM, 4, 172, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STATESECQUER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_FORM, 88);
    PAN_STATESECQUER.SetNumRow(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_FORM, 1);
    PAN_STATESECQUER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STATESECQUER_INUSO, MyGlb.PANEL_FORM, "In Uso");
    PAN_STATESECQUER.SetFieldPage(PFL_STATESECQUER_INUSO, -1, -1);
    PAN_STATESECQUER.SetFieldPanel(PFL_STATESECQUER_INUSO, PPQRY_CFESTRASTAT1, "A.IN_USO", "IN_USO", 5, 2, 0, -13997);
  }

  private void PAN_STATESECQUER_InitQueries()
  {
    StringBuffer SQL;

    PAN_STATESECQUER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STATESECQUER.SetIMDB(IMDB, "PQRY_CFESTRASTAT1", true);
    PAN_STATESECQUER.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ESECUZIONI as ESECUZIONI, ");
    SQL.append("  A.TEMPO_ESECUZIONE as TEMPO_ESECUZIONE, ");
    SQL.append("  A.ID_SELECT as ID_SELECT, ");
    SQL.append("  A.DATA_INIZIO_VALIDITA as DATA_INIZIO_VALIDITA, ");
    SQL.append("  A.DATA_FINE_VALIDITA as DATA_FINE_VALIDITA, ");
    SQL.append("  A.IN_USO as IN_USO, ");
    SQL.append("  A.TITOLO as TITOLO ");
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_STATISTICHE A ");
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((DECODE(~~PQRY_PARAMETRI678.NOMEOGGVALAL~~, to_date(NULL), TRUNC( SYSDATE ), ~~PQRY_PARAMETRI678.NOMEOGGVALAL~~) BETWEEN DECODE(~~PQRY_PARAMETRI678.NOMEOGGVALAL~~, to_date(NULL), TRUNC( SYSDATE ), DECODE(A.DATA_INIZIO_VALIDITA, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), A.DATA_INIZIO_VALIDITA)) AND DECODE(~~PQRY_PARAMETRI678.NOMEOGGVALAL~~, to_date(NULL), TRUNC( SYSDATE ), DECODE(A.DATA_FINE_VALIDITA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.DATA_FINE_VALIDITA)))) ");
    SQL.append("and   (A.IN_USO = DECODE(~~PQRY_PARAMETRI678.NOMOGGANCELI~~, 'SI', A.IN_USO, 'SI')) ");
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ESECUZIONI desc ");
    PAN_STATESECQUER.SetQuery(PPQRY_CFESTRASTAT1, 5, SQL, -1, "");
    PAN_STATESECQUER.SetQueryDB(PPQRY_CFESTRASTAT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STATESECQUER.SetMasterTable(0, "CF_ESTRAI_STATISTICHE");
    PAN_STATESECQUER.AddToSortList(PFL_STATESECQUER_ESECUZIONI, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STATESECQUER.Status() == 2)
    {
      int oldListQBE = PAN_STATESECQUER.iUseListQBE;
      PAN_STATESECQUER.iUseListQBE = 0;
      PAN_STATESECQUER.PanelCommand(Glb.PCM_SEARCH);
      PAN_STATESECQUER.PanelCommand(Glb.PCM_FIND);
      PAN_STATESECQUER.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LOGESECUZION_Init()
  {

    PAN_LOGESECUZION.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LOGESECUZION.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LOGESECUZION.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, "D6705362-8459-4F09-A962-76BF8CD6AB38");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, "Codice");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, "4066259B-575E-4B83-9E42-D26842069D98");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, "Data Esecuzione");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, "EC1625F4-17DD-4AEB-928E-503F4240261E");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, "Utente");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, "ADD82C56-6841-41F5-A4CD-93B2408D18CA");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, "Id Select");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, "8343A149-8B24-4237-AF62-1A291A649751");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, "Titolo");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, "FD475767-C922-4BAC-A23B-1F5278F11EC7");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, "Query");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, "0397FCD8-75BF-47C9-9354-33BCBE86E929");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, " ");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, "53DBBB43-000A-4BD4-94D6-0EDCF3E9B20B");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, "Dati Estratti");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, "C61EF696-A891-4248-879A-DD144AE49A89");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, "Tmp Medio Esecuzione (Espresso in Secondi)");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, "33BF92B3-89AA-499D-8811-D47B8B210519");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, "Descrizione");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGESECUZION.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, "1F54C0FE-A261-4045-9D79-0E6516558CEB");
    PAN_LOGESECUZION.set_Header(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, "ID ESECUZIONE");
    PAN_LOGESECUZION.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, "");
    PAN_LOGESECUZION.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOGESECUZION.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_LOGESECUZION_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_LIST, 52);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_LIST, "Codice");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_FORM, 88, 12, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_FORM, 52);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_CODICE2, MyGlb.PANEL_FORM, "Codice");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_CODICE2, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_CODICE2, PPQRY_LOGESECUQUER, "B.CODICE", "RECCFESTSECO", 5, 20, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_LIST, 104, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_LIST, 112);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_LIST, "Data Esecuzione");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_FORM, 264, 12, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_FORM, 112);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATAESECUZIO, MyGlb.PANEL_FORM, "Data Esecuzione");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_DATAESECUZIO, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_DATAESECUZIO, PPQRY_LOGESECUQUER, "A.DATA_ESECUZIONE", "RECFESESQUD1", 8, 19, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_LIST, 200, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_LIST, 120);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_LIST, "Utente");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_FORM, 496, 12, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_FORM, 120);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_UTENTEESECUZ, MyGlb.PANEL_FORM, "Utente");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_UTENTEESECUZ, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_UTENTEESECUZ, PPQRY_LOGESECUQUER, "A.UTENTE_ESECUZIONE", "RECFESESQUUE", 5, 8, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_LIST, 216, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_LIST, 64);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_LIST, "Id Select");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_FORM, 76, 312, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_FORM, 64);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDSELECT2, MyGlb.PANEL_FORM, "Id Select");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_IDSELECT2, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_IDSELECT2, PPQRY_LOGESECUQUER, "A.ID_SELECT", "RECFESESQUIS", 3, 19, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_LIST, 300, 36, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_LIST, 52);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_LIST, "Titolo");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_FORM, 88, 40, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_FORM, 52);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TITOLO2, MyGlb.PANEL_FORM, "Titolo");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_TITOLO2, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_TITOLO2, PPQRY_LOGESECUQUER, "B.TITOLO", "RECCFESTSETI", 5, 100, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_LIST, 692, 36, 344, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_LIST, 48);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_LIST, "Query");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_FORM, 92, 148, 576, 128, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_FORM, 48);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_FORM, 9);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_QUERY, MyGlb.PANEL_FORM, "Query");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_QUERY, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_QUERY, PPQRY_LOGESECUQUER, "A.QUERY", "RECCFESTESQU", 9, 9999, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_LIST, 1036, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_LIST, 36);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_LIST, " ");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_FORM, 4, 408, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_FORM, 36);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_INFO, MyGlb.PANEL_FORM, " ");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_INFO, -1, -1);
    PAN_LOGESECUZION.SetFieldUnbound(PFL_LOGESECUZION_INFO, true);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_INFO, PPQRY_LOGESECUQUER, "CASE WHEN NOT ((A.ID_ESECUZIONE IS NULL)) THEN 'I' ELSE NULL END", "INFO", 5, 99, 0, -13997);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LOGESECUZION.SetValueListItem(PFL_LOGESECUZION_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LOGESECUZION.set_ImageResizeMode(PFL_LOGESECUZION_INFO, 2);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_LIST, 1152, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_LIST, 96);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_LIST, "Dati Estratti");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_FORM, 44, 284, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_FORM, 96);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DATIESTRATTI, MyGlb.PANEL_FORM, "Dati Estratti");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_DATIESTRATTI, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_DATIESTRATTI, PPQRY_LOGESECUQUER, "A.DATI_ESTRATTI", "RECFESESQUDE", 10, 9999, 0, -16384);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_LIST, 1060, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_LIST, 116);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_LIST, "Tmp Med. Esecuzione Espresso in Secondi");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_FORM, 340, 312, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_FORM, 264);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_TEMPOESECUZI, MyGlb.PANEL_FORM, "Tmp Medio Esecuzione (Espresso in Secondi)");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_TEMPOESECUZI, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_TEMPOESECUZI, PPQRY_LOGESECUQUER, "A.TEMPO_ESECUZIONE", "RECFESESQUTE", 3, 38, 6, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_FORM, 56, 68, 612, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_FORM, 5);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_DESCRIZIONE, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_DESCRIZIONE, PPQRY_LOGESECUQUER, "B.DESCRIZIONE", "RECCFESTSEDE", 5, 4000, 0, -13997);
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_LIST, 0, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_LIST, 92);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_LIST, "ID ESECUZIONE");
    PAN_LOGESECUZION.SetRect(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_FORM, 4, 408, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGESECUZION.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_FORM, 92);
    PAN_LOGESECUZION.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_FORM, 1);
    PAN_LOGESECUZION.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGESECUZION_IDESECUZIONE, MyGlb.PANEL_FORM, "ID ESECUZIONE");
    PAN_LOGESECUZION.SetFieldPage(PFL_LOGESECUZION_IDESECUZIONE, -1, -1);
    PAN_LOGESECUZION.SetFieldPanel(PFL_LOGESECUZION_IDESECUZIONE, PPQRY_LOGESECUQUER, "A.ID_ESECUZIONE", "RECFESESQUIE", 3, 38, 0, -13997);
  }

  private void PAN_LOGESECUZION_InitQueries()
  {
    StringBuffer SQL;

    PAN_LOGESECUZION.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LOGESECUZION.SetIMDB(IMDB, "PQRY_LOGESECUQUER", true);
    PAN_LOGESECUZION.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_ESECUZIONE as RECFESESQUIE, ");
    SQL.append("  A.DATA_ESECUZIONE as RECFESESQUD1, ");
    SQL.append("  A.UTENTE_ESECUZIONE as RECFESESQUUE, ");
    SQL.append("  A.QUERY as RECCFESTESQU, ");
    SQL.append("  A.ID_SELECT as RECFESESQUIS, ");
    SQL.append("  A.DATI_ESTRATTI as RECFESESQUDE, ");
    SQL.append("  A.TEMPO_ESECUZIONE as RECFESESQUTE, ");
    SQL.append("  B.CODICE as RECCFESTSECO, ");
    SQL.append("  B.TITOLO as RECCFESTSETI, ");
    SQL.append("  B.DESCRIZIONE as RECCFESTSEDE, ");
    SQL.append("  CASE WHEN NOT ((A.ID_ESECUZIONE IS NULL)) THEN 'I' ELSE NULL END as INFO ");
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A, ");
    SQL.append("  CF_ESTRAI_SELECT B ");
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ID = A.ID_SELECT) ");
    SQL.append("and   (B.CODICE = NVL(~~TBL_PARAMETRI99.NOMOGGCODSEL~~, B.CODICE)) ");
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA_ESECUZIONE ");
    PAN_LOGESECUZION.SetQuery(PPQRY_LOGESECUQUER, 5, SQL, -1, "");
    PAN_LOGESECUZION.SetQueryDB(PPQRY_LOGESECUQUER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LOGESECUZION.SetMasterTable(0, "CF_ESTRAI_ESECUZIONE_QUERY");
    PAN_LOGESECUZION.AddToSortList(PFL_LOGESECUZION_DATAESECUZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LOGESECUZION.Status() == 2)
    {
      int oldListQBE = PAN_LOGESECUZION.iUseListQBE;
      PAN_LOGESECUZION.iUseListQBE = 0;
      PAN_LOGESECUZION.PanelCommand(Glb.PCM_SEARCH);
      PAN_LOGESECUZION.PanelCommand(Glb.PCM_FIND);
      PAN_LOGESECUZION.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LOGCREAZMODI_Init()
  {

    PAN_LOGCREAZMODI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LOGCREAZMODI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LOGCREAZMODI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, "7E5DB8EB-3119-4F8F-B47D-F17A5A450C78");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, "Id Select");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, "8613ED17-09CF-405C-8BFC-3F45BAB863C0");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, "Codice");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, "B3503246-619F-4A35-A231-52C1874F774C");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, "Tipo Azione");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, "0A9D7A1B-FD89-4732-8082-1FC3445D29EF");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, "Data Modifica");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, "7B2E161C-C960-4ED3-92AA-108B301D33C7");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, "Utente Modifica");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, "28AEF753-D814-4F53-872F-68C2F94DC190");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, "Titolo");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, "C71A1341-52E4-456F-8094-F1BFBADB5006");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, "Vecchia Query");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, "0A9E9724-EA00-4761-9494-DF0333DDD919");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, " ");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.VIS_HYPELINKIMMA);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, "57ADEC1F-B01D-4C3B-BB00-DA76890D9164");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, "Nuova Query");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, "8BF151E8-5705-43AF-B936-547F29E1866B");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, " ");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.VIS_HYPELINKIMMA);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCREAZMODI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, "2698611F-71BE-4105-9371-66CC35D5A0CF");
    PAN_LOGCREAZMODI.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, "ID LOG MODIFICA");
    PAN_LOGCREAZMODI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, "");
    PAN_LOGCREAZMODI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.VIS_NORMFIELPADR);
    PAN_LOGCREAZMODI.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LOGCREAZMODI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_LIST, 64);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_LIST, "Id Select");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_FORM, 4, 244, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_FORM, 64);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDSELECT3, MyGlb.PANEL_FORM, "Id Select");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_IDSELECT3, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_IDSELECT3, PPQRY_LOGCREMODQUE, "A.ID_SELECT", "ID_SELECT", 3, 19, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_CODICE, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_CODICE, PPQRY_LOGCREMODQUE, "B.CODICE", "RECCFESTSECO", 5, 20, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_LIST, 100, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_LIST, "Tipo Azione");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_FORM, 4, 28, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TIPO, MyGlb.PANEL_FORM, "T. Az.");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_TIPO, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_TIPO, PPQRY_LOGCREMODQUE, "A.TIPO", "TIPO", 5, 50, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_LIST, 228, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_LIST, "Data Modifica");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 148, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_DATAINSERIME, MyGlb.PANEL_FORM, "Data Modifica");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_DATAINSERIME, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_DATAINSERIME, PPQRY_LOGCREMODQUE, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_LIST, 324, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente Modifica");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 172, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente Modifica");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_UTENTEINSERI, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_UTENTEINSERI, PPQRY_LOGCREMODQUE, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_LIST, 412, 36, 312, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_LIST, 52);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_FORM, 4, 220, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_FORM, 52);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_TITOLO, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_TITOLO, PPQRY_LOGCREMODQUE, "B.TITOLO", "RECCFESTSETI", 5, 100, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_LIST, 724, 36, 420, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_LIST, 96);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_LIST, "Vecchia Query");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_FORM, 4, 52, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_FORM, 96);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_FORM, 2);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_VECCHIAQUERY, MyGlb.PANEL_FORM, "Vecchia Query");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_VECCHIAQUERY, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_VECCHIAQUERY, PPQRY_LOGCREMODQUE, "A.VECCHIA_QUERY", "VECCHIA_QUERY", 9, 9999, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_LIST, 1144, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_LIST, 116);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_LIST, " ");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_FORM, 4, 244, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_FORM, 116);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFOVECCQUER, MyGlb.PANEL_FORM, " ");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_INFOVECCQUER, -1, -1);
    PAN_LOGCREAZMODI.SetFieldUnbound(PFL_LOGCREAZMODI_INFOVECCQUER, true);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_INFOVECCQUER, PPQRY_LOGCREMODQUE, "CASE WHEN NOT ((A.VECCHIA_QUERY IS NULL)) THEN 'I' ELSE NULL END", "INFOVECCQUER", 5, 99, 0, -13997);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFOVECCQUER, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LOGCREAZMODI.set_ImageResizeMode(PFL_LOGCREAZMODI_INFOVECCQUER, 2);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_LIST, 1164, 36, 420, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_LIST, 88);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_LIST, "Nuova Query");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_FORM, 4, 100, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_FORM, 88);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_FORM, 2);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_NUOVAQUERY, MyGlb.PANEL_FORM, "Nuova Query");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_NUOVAQUERY, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_NUOVAQUERY, PPQRY_LOGCREMODQUE, "A.NUOVA_QUERY", "NUOVA_QUERY", 9, 9999, 0, -13997);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_LIST, 1584, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_LIST, 108);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_LIST, " ");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_FORM, 4, 244, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_FORM, 108);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_INFONUOVQUER, MyGlb.PANEL_FORM, " ");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_INFONUOVQUER, -1, -1);
    PAN_LOGCREAZMODI.SetFieldUnbound(PFL_LOGCREAZMODI_INFONUOVQUER, true);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_INFONUOVQUER, PPQRY_LOGCREMODQUE, "CASE WHEN NOT ((A.NUOVA_QUERY IS NULL)) THEN 'I' ELSE NULL END", "INFONUOVQUER", 5, 99, 0, -13997);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LOGCREAZMODI.SetValueListItem(PFL_LOGCREAZMODI_INFONUOVQUER, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_LIST, 0, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_LIST, 108);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_LIST, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_LIST, "ID LOG MODIFICA");
    PAN_LOGCREAZMODI.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_FORM, 4, 244, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCREAZMODI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_FORM, 108);
    PAN_LOGCREAZMODI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_FORM, 1);
    PAN_LOGCREAZMODI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCREAZMODI_IDLOGMODIFIC, MyGlb.PANEL_FORM, "ID LOG MODIFICA");
    PAN_LOGCREAZMODI.SetFieldPage(PFL_LOGCREAZMODI_IDLOGMODIFIC, -1, -1);
    PAN_LOGCREAZMODI.SetFieldPanel(PFL_LOGCREAZMODI_IDLOGMODIFIC, PPQRY_LOGCREMODQUE, "A.ID_LOG_MODIFICA", "ID_LOG_MODIFICA", 3, 38, 0, -13997);
  }

  private void PAN_LOGCREAZMODI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LOGCREAZMODI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LOGCREAZMODI.SetIMDB(IMDB, "PQRY_LOGCREMODQUE", true);
    PAN_LOGCREAZMODI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.VECCHIA_QUERY as VECCHIA_QUERY, ");
    SQL.append("  A.NUOVA_QUERY as NUOVA_QUERY, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.ID_SELECT as ID_SELECT, ");
    SQL.append("  CASE WHEN NOT ((A.VECCHIA_QUERY IS NULL)) THEN 'I' ELSE NULL END as INFOVECCQUER, ");
    SQL.append("  CASE WHEN NOT ((A.NUOVA_QUERY IS NULL)) THEN 'I' ELSE NULL END as INFONUOVQUER, ");
    SQL.append("  A.ID_LOG_MODIFICA as ID_LOG_MODIFICA, ");
    SQL.append("  B.CODICE as RECCFESTSECO, ");
    SQL.append("  B.TITOLO as RECCFESTSETI, ");
    SQL.append("  B.DESCRIZIONE as RECCFESTSEDE ");
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_LOG_MODIFICA A, ");
    SQL.append("  CF_ESTRAI_SELECT B ");
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ID = A.ID_SELECT) ");
    SQL.append("and   (B.CODICE = NVL(~~TBL_PARAMETRI99.NOMOGGCODSEL~~, B.CODICE)) ");
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA_INSERIMENTO ");
    PAN_LOGCREAZMODI.SetQuery(PPQRY_LOGCREMODQUE, 5, SQL, -1, "");
    PAN_LOGCREAZMODI.SetQueryDB(PPQRY_LOGCREMODQUE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LOGCREAZMODI.SetMasterTable(0, "CF_ESTRAI_LOG_MODIFICA");
    PAN_LOGCREAZMODI.AddToSortList(PFL_LOGCREAZMODI_DATAINSERIME, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LOGCREAZMODI.Status() == 2)
    {
      int oldListQBE = PAN_LOGCREAZMODI.iUseListQBE;
      PAN_LOGCREAZMODI.iUseListQBE = 0;
      PAN_LOGCREAZMODI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LOGCREAZMODI.PanelCommand(Glb.PCM_FIND);
      PAN_LOGCREAZMODI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_RICERCA_Init()
  {

    PAN_RICERCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RICERCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RICERCA.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, "19AF9A65-74E3-425A-8B0F-08F9AC1BDF79");
    PAN_RICERCA.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, "Codice Estrazione");
    PAN_RICERCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, "");
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, "4946A1DB-C72C-4680-A886-F335ACB98536");
    PAN_RICERCA.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, "Anche Eliminate");
    PAN_RICERCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, "");
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.VIS_CHECKSTYLE);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RICERCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, "152E32BE-59EE-4032-9AF0-AE57B56B1CEE");
    PAN_RICERCA.set_Header(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, "Valide Al");
    PAN_RICERCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, "");
    PAN_RICERCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.VIS_NORMFIELPADR);
    PAN_RICERCA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RICERCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_LIST, 60);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_LIST, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_LIST, "Codice Estrazione");
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_FORM, 8, 44, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_FORM, 188);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_FORM, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_CODICEESTRAZ, MyGlb.PANEL_FORM, "Codice Estrazione");
    PAN_RICERCA.SetFieldPage(PFL_RICERCA_CODICEESTRAZ, -1, -1);
    PAN_RICERCA.SetFieldPanel(PFL_RICERCA_CODICEESTRAZ, PPQRY_PARAMETRI678, "A.NOMOGGCODSEL", "NOMOGGCODSEL", 9, 20, 0, -13997);
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_LIST, 96);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_LIST, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_LIST, "Anche Eliminate");
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_FORM, 196, 12, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_FORM, 108);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_FORM, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_ANCHEELIMINA, MyGlb.PANEL_FORM, "Anche Eliminate");
    PAN_RICERCA.SetFieldPage(PFL_RICERCA_ANCHEELIMINA, -1, -1);
    PAN_RICERCA.SetFieldPanel(PFL_RICERCA_ANCHEELIMINA, PPQRY_PARAMETRI678, "A.NOMOGGANCELI", "NOMOGGANCELI", 5, 2, 0, -13997);
    PAN_RICERCA.SetValueListItem(PFL_RICERCA_ANCHEELIMINA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_RICERCA.SetValueListItem(PFL_RICERCA_ANCHEELIMINA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_LIST, 56);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_LIST, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_LIST, "Valide Al");
    PAN_RICERCA.SetRect(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_FORM, 36, 12, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICERCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_FORM, 56);
    PAN_RICERCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_FORM, 1);
    PAN_RICERCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICERCA_VALIDEAL, MyGlb.PANEL_FORM, "Valide Al");
    PAN_RICERCA.SetFieldPage(PFL_RICERCA_VALIDEAL, -1, -1);
    PAN_RICERCA.SetFieldPanel(PFL_RICERCA_VALIDEAL, PPQRY_PARAMETRI678, "A.NOMEOGGVALAL", "NOMEOGGVALAL", 6, 10, 0, -13997);
  }

  private void PAN_RICERCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_RICERCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RICERCA.SetIMDB(IMDB, "PQRY_PARAMETRI678", true);
    PAN_RICERCA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_RICERCA.SetQueryIMDB(PPQRY_PARAMETRI678, IMDBDef17.PQRY_PARAMETRI678_RS, IMDBDef7.TBL_PARAMETRI99);
    JustLoaded = true;
    PAN_RICERCA.SetFieldPrimaryIndex(PFL_RICERCA_CODICEESTRAZ, IMDBDef7.FLD_PARAMETRI99_NOMOGGCODSEL);
    PAN_RICERCA.SetFieldPrimaryIndex(PFL_RICERCA_ANCHEELIMINA, IMDBDef7.FLD_PARAMETRI99_NOMOGGANCELI);
    PAN_RICERCA.SetFieldPrimaryIndex(PFL_RICERCA_VALIDEAL, IMDBDef7.FLD_PARAMETRI99_NOMEOGGVALAL);
    PAN_RICERCA.SetMasterTable(0, "PARAMETRI99");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RICERCA.Status() == 2)
    {
      int oldListQBE = PAN_RICERCA.iUseListQBE;
      PAN_RICERCA.iUseListQBE = 0;
      PAN_RICERCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_RICERCA.PanelCommand(Glb.PCM_FIND);
      PAN_RICERCA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STATESECQUER) PAN_STATESECQUER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LOGESECUZION) PAN_LOGESECUZION_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LOGCREAZMODI) PAN_LOGCREAZMODI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STATESECQUER) PAN_STATESECQUER_ValidateRow(Cancel);
    if (SrcObj == PAN_LOGESECUZION) PAN_LOGESECUZION_ValidateRow(Cancel);
    if (SrcObj == PAN_LOGCREAZMODI) PAN_LOGCREAZMODI_ValidateRow(Cancel);
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STATESECQUER) PAN_STATESECQUER_DynamicProperties();
    if (SrcObj == PAN_LOGESECUZION) PAN_LOGESECUZION_DynamicProperties();
    if (SrcObj == PAN_LOGCREAZMODI) PAN_LOGCREAZMODI_DynamicProperties();
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STATESECQUER) PAN_STATESECQUER_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LOGESECUZION) PAN_LOGESECUZION_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LOGCREAZMODI) PAN_LOGCREAZMODI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STATESECQUER) PAN_STATESECQUER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LOGESECUZION) PAN_LOGESECUZION_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LOGCREAZMODI) PAN_LOGCREAZMODI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_RICERCA) PAN_RICERCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_STATISTICHE) TAB_STATISTICHE_Click(PreviousPage, Cancel);
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
