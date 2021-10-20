// **********************************************
// Situazione Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMENTRI_ANTICIPAZION = 0;
  private static int PFL_PARAMENTRI_AL = 1;

  private static int PPQRY_PARAMENTRI2 = 0;


  IDPanel PAN_PARAMENTRI;
  private static int GRP_SITUAZICASSA_ORDINATIVI = 0;
  private static int GRP_SITUAZICASSA_MANDATI = 1;

  private static int PFL_SITUAZICASSA_RESIDUO = 0;
  private static int PFL_SITUAZICASSA_COMPETENZA1 = 1;
  private static int PFL_SITUAZICASSA_ORDIRISCCOMP = 2;
  private static int PFL_SITUAZICASSA_ORDIRISCRESI = 3;
  private static int PFL_SITUAZICASSA_FONDODICASSA = 4;
  private static int PFL_SITUAZICASSA_FONDDICASRIS = 5;
  private static int PFL_SITUAZICASSA_TOTALE1 = 6;
  private static int PFL_SITUAZICASSA_TOTAORDIRISC = 7;
  private static int PFL_SITUAZICASSA_RESIDUI = 8;
  private static int PFL_SITUAZICASSA_COMPETENZA = 9;
  private static int PFL_SITUAZICASSA_PAGAMECOMPET = 10;
  private static int PFL_SITUAZICASSA_PAGAMERESIDU = 11;
  private static int PFL_SITUAZICASSA_TOTALE = 12;
  private static int PFL_SITUAZICASSA_TOTAMANDPAGA = 13;
  private static int PFL_SITUAZICASSA_LIQUIDICASSA = 14;
  private static int PFL_SITUAZICASSA_LIQUIDITESOR = 15;
  private static int PFL_SITUAZICASSA_EMESSI = 16;
  private static int PFL_SITUAZICASSA_PAGATI = 17;
  private static int PFL_SITUAZICASSA_EMESSI1 = 18;
  private static int PFL_SITUAZICASSA_RISCOSSI = 19;

  private static int PPQRY_DATIINPANNE1 = 0;


  IDPanel PAN_SITUAZICASSA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMENTRI3(IMDB);
    Init_TBL_DATIINPANNEL(IMDB);
    //
    //
    Init_PQRY_PARAMENTRI2(IMDB);
    Init_PQRY_PARAMENTRI2_RS(IMDB);
    Init_PQRY_DATIINPANNE1(IMDB);
    Init_PQRY_DATIINPANNE1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMENTRI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMENTRI3, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMENTRI3, "TBL_PARAMENTRI3");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMENTRI3,IMDBDef6.FLD_PARAMENTRI3_ROWNAMEANTIC, "ROWNAMEANTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMENTRI3,IMDBDef6.FLD_PARAMENTRI3_ROWNAMEANTIC,1,12,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMENTRI3,IMDBDef6.FLD_PARAMENTRI3_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMENTRI3,IMDBDef6.FLD_PARAMENTRI3_ROWNAMEAL,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMENTRI3, 0);
  }

  private static void Init_TBL_DATIINPANNEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_DATIINPANNEL, 16);
    IMDB.set_TblCode(IMDBDef6.TBL_DATIINPANNEL, "TBL_DATIINPANNEL");
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMCO, "ROWNAMMAEMCO");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMRE, "ROWNAMMAEMRE");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGCOM, "ROWNAMPAGCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGRES, "ROWNAMPAGRES");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGRES,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM, "ROWNAMTOMAEM");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMCO, "ROWNAMOREMCO");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMRE, "ROWNAMOREMRE");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRICO, "ROWNAMORRICO");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRICO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRIRE, "ROWNAMORRIRE");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRIRE,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM, "RONAFODICAEM");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI, "RONAFODICARI");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM, "ROWNAMTOOREM");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDICA, "ROWNAMLIDICA");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDICA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDITE, "ROWNAMLIDITE");
    IMDB.SetFldParams(IMDBDef6.TBL_DATIINPANNEL,IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDITE,3,14,2);
    IMDB.TblAddNew(IMDBDef6.TBL_DATIINPANNEL, 0);
  }

  private static void Init_PQRY_PARAMENTRI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMENTRI2, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMENTRI2, "PQRY_PARAMENTRI2");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMENTRI2,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEANTIC, "ROWNAMEANTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMENTRI2,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEANTIC,1,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMENTRI2,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMENTRI2,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL,6,19,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAMENTRI2, 0);
  }

  private static void Init_PQRY_PARAMENTRI2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMENTRI2_RS, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMENTRI2_RS, "PQRY_PARAMENTRI2_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMENTRI2_RS,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEANTIC, "ROWNAMEANTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMENTRI2_RS,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEANTIC,1,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMENTRI2_RS,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMENTRI2_RS,IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL,6,19,0);
  }

  private static void Init_PQRY_DATIINPANNE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_DATIINPANNE1, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_DATIINPANNE1, "PQRY_DATIINPANNE1");
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMCO, "ROWNAMMAEMCO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMRE, "ROWNAMMAEMRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGCOM, "ROWNAMPAGCOM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGRES, "ROWNAMPAGRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGRES,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAEM, "ROWNAMTOMAEM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMCO, "ROWNAMOREMCO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMRE, "ROWNAMOREMRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRICO, "ROWNAMORRICO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRICO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRIRE, "ROWNAMORRIRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRIRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICAEM, "RONAFODICAEM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICARI, "RONAFODICARI");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICARI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOOREM, "ROWNAMTOOREM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOOREM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOORRI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDICA, "ROWNAMLIDICA");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDICA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDITE, "ROWNAMLIDITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDITE,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_DATIINPANNE1, 0);
  }

  private static void Init_PQRY_DATIINPANNE1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_DATIINPANNE1_RS, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_DATIINPANNE1_RS, "PQRY_DATIINPANNE1_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMCO, "ROWNAMMAEMCO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMRE, "ROWNAMMAEMRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGCOM, "ROWNAMPAGCOM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGRES, "ROWNAMPAGRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGRES,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAEM, "ROWNAMTOMAEM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMCO, "ROWNAMOREMCO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMCO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMRE, "ROWNAMOREMRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRICO, "ROWNAMORRICO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRICO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRIRE, "ROWNAMORRIRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRIRE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICAEM, "RONAFODICAEM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICARI, "RONAFODICARI");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_RONAFODICARI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOOREM, "ROWNAMTOOREM");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOOREM,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMTOORRI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDICA, "ROWNAMLIDICA");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDICA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDITE, "ROWNAMLIDITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_DATIINPANNE1_RS,IMDBDef16.PQSL_DATIINPANNE1_ROWNAMLIDITE,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneCassa()
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
    FormIdx = MyGlb.FRM_SITUAZICASSA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FC8EBA80-07B1-4CBF-98EA-4B2F8BF6ECA6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 486;
    set_Caption(new IDVariant("Situazione Cassa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.121739;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 532;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Paramentri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMENTRI = new IDPanel(w, this, 2, "PAN_PARAMENTRI");
    Frames[2].Content = PAN_PARAMENTRI;
    PAN_PARAMENTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMENTRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AD4FEA9C-25C0-4F8C-B2A6-FEFB8E7CC7BD");
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 216, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMENTRI.InitStatus = 2;
    PAN_PARAMENTRI_Init();
    PAN_PARAMENTRI_InitFields();
    PAN_PARAMENTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 532;
    Frames[3].Height = 404;
    Frames[3].Caption = "Situazione Cassa";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 404;
    PAN_SITUAZICASSA = new IDPanel(w, this, 3, "PAN_SITUAZICASSA");
    Frames[3].Content = PAN_SITUAZICASSA;
    PAN_SITUAZICASSA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZICASSA.VS = MainFrm.VisualStyleList;
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "213B9F02-0795-4267-B5F2-F143A1F3DD87");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1408, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZICASSA.InitStatus = 2;
    PAN_SITUAZICASSA_Init();
    PAN_SITUAZICASSA_InitFields();
    PAN_SITUAZICASSA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA6+BaseCmdLinIdx)
      {
        Stampa();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMENTRI3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZICASSA_PARAMENTRI2();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_DATIINPANNEL, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZICASSA_DATIINPANNE1();
      }
      PAN_PARAMENTRI.UpdatePanel(MainFrm);
      PAN_SITUAZICASSA.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneCassa.class.getName() : (Glb.ClassWithPackage(SituazioneCassa.class) ? SituazioneCassa.class.getName().substring(SituazioneCassa.class.getPackage().getName().length() + 1) : SituazioneCassa.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMENTRI3, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEAL, 0, IDL.Today());
      PAN_SITUAZICASSA.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SITUAZICASSA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SITUAZICASSA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SITUAZICASSA.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassa", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Cassa After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SITUAZICASSA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Cassa After Find Event Body
      // Procedure Body
      // 
      RiempiTabella();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassa", "SituazioneCassaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Paramentri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMENTRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMENTRI, Cancel);
      // 
      // Paramentri On Validate Row Event Body
      // Procedure Body
      // 
      PAN_SITUAZICASSA.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassa", "ParamentriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi Tabella
  // **********************************************************************
  public int RiempiTabella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MANDATIEMESS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MANCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MANDEMESRESI = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MANRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAGAMECOMPET = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAGAMERESIDU = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDIEMESCOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ORDCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDIEMESRESI = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ORDRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INCASSRESIDU = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INCASSICOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INCASSCOMPET = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INCASSIRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FONDDICASEME = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      v_MANCOMP = (new IDVariant("MAN_COMP", IDVariant.STRING));
      v_MANRES = (new IDVariant("MAN_RES", IDVariant.STRING));
      v_PAGCOMP = (new IDVariant("PAG_COMP", IDVariant.STRING));
      v_PAGRES = (new IDVariant("PAG_RES", IDVariant.STRING));
      v_ORDCOMP = (new IDVariant("ORD_COMP", IDVariant.STRING));
      v_ORDRES = (new IDVariant("ORD_RES", IDVariant.STRING));
      v_INCASSICOMP = (new IDVariant("INCASSI_COMP", IDVariant.STRING));
      v_INCASSIRES = (new IDVariant("INCASSI_RES", IDVariant.STRING));
      // 
      // Riempi Tabella Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S',to_number(NULL)," + IDL.CSql(v_MANCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MANDATIEMESS = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S',to_number(NULL)," + IDL.CSql(v_MANRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MANDEMESRESI = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S',to_number(NULL)," + IDL.CSql(v_PAGCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGAMECOMPET = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S',to_number(NULL)," + IDL.CSql(v_PAGRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGAMERESIDU = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E',to_number(NULL)," + IDL.CSql(v_ORDCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDIEMESCOMP = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E',to_number(NULL)," + IDL.CSql(v_ORDRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDIEMESRESI = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E',to_number(NULL)," + IDL.CSql(v_INCASSIRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSRESIDU = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E',to_number(NULL)," + IDL.CSql(v_INCASSICOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSCOMPET = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMCO, 0, IDL.NullValue(v_MANDATIEMESS,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMRE, 0, IDL.NullValue(v_MANDEMESRESI,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGCOM, 0, IDL.NullValue(v_PAGAMECOMPET,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGRES, 0, IDL.NullValue(v_PAGAMERESIDU,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMCO, 0, IDL.NullValue(v_ORDIEMESCOMP,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMRE, 0, IDL.NullValue(v_ORDIEMESRESI,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRIRE, 0, IDL.NullValue(v_INCASSRESIDU,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRICO, 0, IDL.NullValue(v_INCASSCOMPET,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM, 0, IDL.Add(IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMCO, 0), IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMMAEMRE, 0)));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA, 0, IDL.Add(IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGRES, 0), IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMPAGCOM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM, 0, IDL.Add(IDL.Add(IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMRE, 0), IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMOREMCO, 0)), IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI, 0, IDL.Add(IDL.Add(IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRIRE, 0), IMDB.Value(IMDBDef16.PQRY_DATIINPANNE1, IMDBDef16.PQSL_DATIINPANNE1_ROWNAMORRICO, 0)), IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI, 0)));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as BISTINCOBIVC ");
      SQL.append("from ");
      SQL.append("  BIL A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = 9999999999999998.0) ");
      SQL.append("and   (");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  COUNT(*) ");
      SQL.append("from ");
      SQL.append("  ORD B ");
      SQL.append("where (B.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.CAPITOLO = 9999999999999998.0) ");
      SQL.append(") = 0) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_FONDDICASEME = QV.Get("BISTINCOBIVC", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM, 0, IDL.NullValue(v_FONDDICASEME,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI, 0, IDL.NullValue(v_FONDDICASEME,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDICA, 0, IDL.Sub(IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM, 0), IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDITE, 0, IDL.Sub(IDL.Sub(IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI, 0), IMDB.Value(IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA, 0)), IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMENTRI3, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEANTIC, 0),(new IDVariant(0)))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassa", "RiempiTabella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("AL")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANTICIPAZIONE")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMENTRI2, IMDBDef16.PQSL_PARAMENTRI2_ROWNAMEANTIC, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Situazione_Cassa")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassa", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Paramentri
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZICASSA_PARAMENTRI2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAMENTRI2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMENTRI3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMENTRI3, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAMENTRI2_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAMENTRI2_RS, 0, IMDBDef6.TBL_PARAMENTRI3, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMENTRI2_RS, 0, 0, IMDBDef6.TBL_PARAMENTRI3, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEANTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMENTRI2_RS, 1, 0, IMDBDef6.TBL_PARAMENTRI3, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMENTRI3, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMENTRI3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMENTRI3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAMENTRI2_RS, 0);
  }

  // **********************************************************************
  // Dati In Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZICASSA_DATIINPANNE1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_DATIINPANNE1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_DATIINPANNEL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_DATIINPANNEL, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_DATIINPANNE1_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_DATIINPANNE1_RS, 0, IMDBDef6.TBL_DATIINPANNEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 0, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMCO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 1, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMRE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 2, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGCOM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 3, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGRES, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 4, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 5, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 6, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMCO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 7, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMRE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 8, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRICO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 9, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRIRE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 10, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 11, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 12, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 13, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 14, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDICA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_DATIINPANNE1_RS, 15, 0, IMDBDef6.TBL_DATIINPANNEL, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDITE, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_DATIINPANNEL, 0);
      if (IMDB.Eof(IMDBDef6.TBL_DATIINPANNEL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_DATIINPANNEL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_DATIINPANNE1_RS, 0);
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
  private void PAN_PARAMENTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMENTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMENTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMENTRI);
    // Stub
  }

  private void PAN_PARAMENTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMENTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMENTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMENTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SITUAZICASSA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZICASSA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZICASSA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZICASSA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZICASSA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITUAZICASSA);
    // Stub
  }

  private void PAN_SITUAZICASSA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITUAZICASSA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZICASSA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZICASSA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMENTRI_Init()
  {

    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, "5B58A9EC-B5BE-4AB4-9860-E7BD9C26A885");
    PAN_PARAMENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, "Anticipazione");
    PAN_PARAMENTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, "");
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, "2E28CBBC-34CE-4F02-B9AF-EC259EFBB0B8");
    PAN_PARAMENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, "Al");
    PAN_PARAMENTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, "");
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMENTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_LIST, 72);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_LIST, 1);
    PAN_PARAMENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_LIST, "Anticipazione");
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_FORM, 8, 8, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_FORM, 84);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_FORM, 1);
    PAN_PARAMENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANTICIPAZION, MyGlb.PANEL_FORM, "Anticipazione");
    PAN_PARAMENTRI.SetFieldPage(PFL_PARAMENTRI_ANTICIPAZION, -1, -1);
    PAN_PARAMENTRI.SetFieldPanel(PFL_PARAMENTRI_ANTICIPAZION, PPQRY_PARAMENTRI2, "A.ROWNAMEANTIC", "ROWNAMEANTIC", 1, 12, 0, -13997);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_LIST, 112, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_FORM, 372, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_FORM, 24);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMENTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMENTRI.SetFieldPage(PFL_PARAMENTRI_AL, -1, -1);
    PAN_PARAMENTRI.SetFieldPanel(PFL_PARAMENTRI_AL, PPQRY_PARAMENTRI2, "A.ROWNAMEAL", "ROWNAMEAL", 6, 19, 0, -13997);
  }

  private void PAN_PARAMENTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMENTRI.SetIMDB(IMDB, "PQRY_PARAMENTRI2", true);
    PAN_PARAMENTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMENTRI.SetQueryIMDB(PPQRY_PARAMENTRI2, IMDBDef16.PQRY_PARAMENTRI2_RS, IMDBDef6.TBL_PARAMENTRI3);
    JustLoaded = true;
    PAN_PARAMENTRI.SetFieldPrimaryIndex(PFL_PARAMENTRI_ANTICIPAZION, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEANTIC);
    PAN_PARAMENTRI.SetFieldPrimaryIndex(PFL_PARAMENTRI_AL, IMDBDef6.FLD_PARAMENTRI3_ROWNAMEAL);
    PAN_PARAMENTRI.SetMasterTable(0, "PARAMENTRI3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMENTRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMENTRI.iUseListQBE;
      PAN_PARAMENTRI.iUseListQBE = 0;
      PAN_PARAMENTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMENTRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMENTRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SITUAZICASSA_Init()
  {

    PAN_SITUAZICASSA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZICASSA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, "572034AA-0B85-4C6D-A790-304659170E83");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, "Ordinativi");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, MyGlb.PANEL_LIST, 528, -9999, 704, 16, 0, 0);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, MyGlb.PANEL_FORM, 4, 119, 476, 121, 0, 0);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, 0, 55);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, 1, 13);
    PAN_SITUAZICASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, 0, 4);
    PAN_SITUAZICASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, 1, 4);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, "B4E39B2F-7BF0-40B4-8DF8-B954512EC8E6");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, "Mandati");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 528, 16, 0, 0);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, MyGlb.PANEL_FORM, 4, 11, 476, 97, 0, 0);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, 0, 46);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, 1, 13);
    PAN_SITUAZICASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, 0, 4);
    PAN_SITUAZICASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, 1, 4);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_GROUP, GRP_SITUAZICASSA_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITUAZICASSA.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, "E6487073-1FBD-4ACD-93FA-88581B7D8A00");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, "Residuo");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, "1326A7D5-96E6-47EE-B5CE-DDDF856CC870");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, "Competenza");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, "29EA1EEF-256E-40E0-BDA5-778CAD710482");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, "Ordinativi Riscossi Competenza");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, "C4915D4D-8142-4523-A8CC-734D3C070405");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, "Ordinativi Riscossi Residuo");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, "831A356D-2A80-404F-9976-69C60EC02487");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, "Fondo di Cassa");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, "F3A62524-AA88-4275-A1E5-6B82BE1245A7");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, "Fondo Di Cassa Riscossi");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, "32AB3C1B-E2E9-4C7A-BD96-521425CFD9C4");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, "Totale");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, "55439589-84B5-44FA-9A06-C848EE6646BB");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, "Totale Ordinativi Riscossi");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, "25462ECF-F399-45D9-B1D1-75B2FC5188E6");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, "Residui");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, "E31857AC-A5AB-48AF-8600-3D27C211E51A");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, "Competenza");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, "C74F0259-3E88-405E-881F-F9830770B6FF");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, "Pagamenti Competenze");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, "F882999A-5370-46A2-8573-37561A470B7A");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, "Pagamenti Residuo");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, "DC89558B-59EF-4E4A-BF89-496ECA3E3D4E");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, "Totale");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, "03CB0D2E-97B1-453E-BCC8-56BEA8915938");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, "Totale Mandati Pagati");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, "78F2792B-C8C1-491C-AF5C-93A474FB1E10");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, "Liquidità Di CASSA");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, "773BA3B8-1621-4EEC-B11D-36C4F5B175DF");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, "Liquidità Di TESORERIA");
    PAN_SITUAZICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, "");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.VIS_NORMALFIELDS);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, "9170A27E-6D8A-4BD7-B5B8-22317693391B");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, "Emessi");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, "D948B1F7-A2CF-4FB7-98AD-771F26ABFF88");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, "Pagati");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, "D4725094-9AC8-4DAA-AB5A-C25B2FFFC167");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, "Emessi");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, "34293A63-0972-46A5-9D3C-1773EC07E4FE");
    PAN_SITUAZICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, "Riscossi");
    PAN_SITUAZICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_SITUAZICASSA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_LIST, 616, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_LIST, "Residuo");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_FORM, 56, 144, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_FORM, 68);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUO, MyGlb.PANEL_FORM, "Residuo");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_RESIDUO, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_RESIDUO, PPQRY_DATIINPANNE1, "A.ROWNAMOREMRE", "ROWNAMOREMRE", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_LIST, 528, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_LIST, "Competenza");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_FORM, 36, 168, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA1, MyGlb.PANEL_FORM, "Competenza");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_COMPETENZA1, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_COMPETENZA1, PPQRY_DATIINPANNE1, "A.ROWNAMOREMCO", "ROWNAMOREMCO", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_LIST, 704, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_LIST, 136);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_LIST, "Ord. Rsc. Cmp.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_FORM, 376, 168, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCCOMP, MyGlb.PANEL_FORM, "Ordin. Risc. Competenza");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_ORDIRISCCOMP, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_ORDIRISCCOMP, PPQRY_DATIINPANNE1, "A.ROWNAMORRICO", "ROWNAMORRICO", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_LIST, 792, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_LIST, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_LIST, "Ord. Risc. Res.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_FORM, 376, 144, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_ORDIRISCRESI, MyGlb.PANEL_FORM, "Ordinativi Riscossi Residuo");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_ORDIRISCRESI, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_ORDIRISCRESI, PPQRY_DATIINPANNE1, "A.ROWNAMORRIRE", "ROWNAMORRIRE", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_LIST, 880, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_LIST, "Fon. di Cassa");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_FORM, 8, 192, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDODICASSA, MyGlb.PANEL_FORM, "Fondo di Cassa");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_FONDODICASSA, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_FONDODICASSA, PPQRY_DATIINPANNE1, "A.RONAFODICAEM", "RONAFODICAEM", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_LIST, 968, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_LIST, 124);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_LIST, "Fn. D. Cas. Rsc.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_FORM, 376, 192, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_FONDDICASRIS, MyGlb.PANEL_FORM, "Fondo Di Cassa Riscossi");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_FONDDICASRIS, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_FONDDICASRIS, PPQRY_DATIINPANNE1, "A.RONAFODICARI", "RONAFODICARI", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_LIST, 1056, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_LIST, 124);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_LIST, "Totale");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_FORM, 68, 216, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_FORM, 56);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE1, MyGlb.PANEL_FORM, "Totale");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_TOTALE1, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_TOTALE1, PPQRY_DATIINPANNE1, "A.ROWNAMTOOREM", "ROWNAMTOOREM", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 1144, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 128);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, "Tot. Ord. Risc.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 376, 216, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, "Totale Ordinativi Riscossi");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_TOTAORDIRISC, -1, GRP_SITUAZICASSA_ORDINATIVI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_TOTAORDIRISC, PPQRY_DATIINPANNE1, "A.ROWNAMTOORRI", "ROWNAMTOORRI", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_LIST, 88, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_FORM, 56, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_FORM, 68);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_RESIDUI, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_RESIDUI, PPQRY_DATIINPANNE1, "A.ROWNAMMAEMRE", "ROWNAMMAEMRE", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_LIST, "Competenza");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_FORM, 8, 60, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_COMPETENZA, MyGlb.PANEL_FORM, "Competenza");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_COMPETENZA, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_COMPETENZA, PPQRY_DATIINPANNE1, "A.ROWNAMMAEMCO", "ROWNAMMAEMCO", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_LIST, 176, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_LIST, 124);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_LIST, "Pagam. Comp.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_FORM, 376, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMECOMPET, MyGlb.PANEL_FORM, "Pagamenti Competenze");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_PAGAMECOMPET, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_PAGAMECOMPET, PPQRY_DATIINPANNE1, "A.ROWNAMPAGCOM", "ROWNAMPAGCOM", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_LIST, 264, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_LIST, "Pagam. Res.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_FORM, 376, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_FORM, 112);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGAMERESIDU, MyGlb.PANEL_FORM, "Pagam. Residuo");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_PAGAMERESIDU, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_PAGAMERESIDU, PPQRY_DATIINPANNE1, "A.ROWNAMPAGRES", "ROWNAMPAGRES", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_LIST, 352, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_LIST, 116);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_FORM, 60, 84, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_TOTALE, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_TOTALE, PPQRY_DATIINPANNE1, "A.ROWNAMTOMAEM", "ROWNAMTOMAEM", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 440, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 112);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, "Tot. Mnd. Pag.");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 376, 84, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, "Tot. Mandati Pagati");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_TOTAMANDPAGA, -1, GRP_SITUAZICASSA_MANDATI);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_TOTAMANDPAGA, PPQRY_DATIINPANNE1, "A.ROWNAMTOMAPA", "ROWNAMTOMAPA", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_LIST, 1232, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_LIST, "Liquidità Di CASSA");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_FORM, 4, 260, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDICASSA, MyGlb.PANEL_FORM, "Liquidità Di CASSA");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_LIQUIDICASSA, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_LIQUIDICASSA, PPQRY_DATIINPANNE1, "A.ROWNAMLIDICA", "ROWNAMLIDICA", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_LIST, 1320, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_LIST, "Liquidità Di TESORERIA");
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_FORM, 236, 260, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_LIQUIDITESOR, MyGlb.PANEL_FORM, "Liquidità Di TESORERIA");
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_LIQUIDITESOR, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_LIQUIDITESOR, PPQRY_DATIINPANNE1, "A.ROWNAMLIDITE", "ROWNAMLIDITE", 3, 14, 2, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_LIST, 108, 16, 92, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_FORM, 160, 16, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_EMESSI, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_EMESSI, -1, "", "EMESSI", 0, 0, 0, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_LIST, 116, 24, 92, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_FORM, 404, 16, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_PAGATI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_PAGATI, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_PAGATI, -1, "", "PAGATI", 0, 0, 0, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_LIST, 120, 120, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_FORM, 152, 124, 56, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_EMESSI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_EMESSI1, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_EMESSI1, -1, "", "EMESSI1", 0, 0, 0, -13997);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_LIST, 128, 128, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_FORM, 400, 124, 56, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZICASSA_RISCOSSI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZICASSA.SetFieldPage(PFL_SITUAZICASSA_RISCOSSI, -1, -1);
    PAN_SITUAZICASSA.SetFieldPanel(PFL_SITUAZICASSA_RISCOSSI, -1, "", "RISCOSSI", 0, 0, 0, -13997);
  }

  private void PAN_SITUAZICASSA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZICASSA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZICASSA.SetIMDB(IMDB, "PQRY_DATIINPANNE1", true);
    PAN_SITUAZICASSA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SITUAZICASSA.SetQueryIMDB(PPQRY_DATIINPANNE1, IMDBDef16.PQRY_DATIINPANNE1_RS, IMDBDef6.TBL_DATIINPANNEL);
    JustLoaded = true;
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_RESIDUO, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMRE);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_COMPETENZA1, IMDBDef6.FLD_DATIINPANNEL_ROWNAMOREMCO);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_ORDIRISCCOMP, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRICO);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_ORDIRISCRESI, IMDBDef6.FLD_DATIINPANNEL_ROWNAMORRIRE);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_FONDODICASSA, IMDBDef6.FLD_DATIINPANNEL_RONAFODICAEM);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_FONDDICASRIS, IMDBDef6.FLD_DATIINPANNEL_RONAFODICARI);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_TOTALE1, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOOREM);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_TOTAORDIRISC, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOORRI);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_RESIDUI, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMRE);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_COMPETENZA, IMDBDef6.FLD_DATIINPANNEL_ROWNAMMAEMCO);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_PAGAMECOMPET, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGCOM);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_PAGAMERESIDU, IMDBDef6.FLD_DATIINPANNEL_ROWNAMPAGRES);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_TOTALE, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAEM);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_TOTAMANDPAGA, IMDBDef6.FLD_DATIINPANNEL_ROWNAMTOMAPA);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_LIQUIDICASSA, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDICA);
    PAN_SITUAZICASSA.SetFieldPrimaryIndex(PFL_SITUAZICASSA_LIQUIDITESOR, IMDBDef6.FLD_DATIINPANNEL_ROWNAMLIDITE);
    PAN_SITUAZICASSA.SetMasterTable(0, "DATIINPANNEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZICASSA.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZICASSA.iUseListQBE;
      PAN_SITUAZICASSA.iUseListQBE = 0;
      PAN_SITUAZICASSA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZICASSA.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZICASSA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_ValidateRow(Cancel);
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_DynamicProperties();
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SITUAZICASSA) PAN_SITUAZICASSA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
