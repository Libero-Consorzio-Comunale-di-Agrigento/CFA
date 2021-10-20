// **********************************************
// Document Orientation Meta Data Library
// **********************************************

import java.util.*;
import java.io.*;
import com.progamma.*;
import com.progamma.doc.*;

public class MyMDOInit extends MDOInit implements Serializable
{
  // **********************************************
  // Create a new document
  // **********************************************
  public static IDDocument CreateDocument(String DOName) { return CreateDocument(DOName, null); }
  public static IDDocument CreateDocument(String DOName, Object mainfrmCF)
  {
    if (DOName.equals("BIL")) return new BIL();
    if (DOName.equals("BPR")) return new BPR();
    if (DOName.equals("Cronoprogramma")) return new Cronoprogramma();
    if (DOName.equals("ImputazioniCrono")) return new ImputazioniCrono();
    if (DOName.equals("Piani")) return new Piani();
    if (DOName.equals("EntrateCronoprogrammi")) return new EntrateCronoprogrammi();
    if (DOName.equals("Varpiani")) return new Varpiani();
    if (DOName.equals("VarDef")) return new VarDef();
    if (DOName.equals("VarProvv")) return new VarProvv();
    if (DOName.equals("PvbSchedeObiettiviProv")) return new PvbSchedeObiettiviProv();
    if (DOName.equals("Afc")) return new Afc();
    //
    return null;
  }


  // **********************************************
  // Get MD By Name
  // **********************************************
  public static DOMDObj GetMetaData(String DOName) throws Exception
  {
    if (DOName.equals("BIL")) return BIL.GetDOMD_BIL();
    if (DOName.equals("BPR")) return BPR.GetDOMD_BPR();
    if (DOName.equals("Cronoprogramma")) return Cronoprogramma.GetDOMD_Cronoprogramma();
    if (DOName.equals("ImputazioniCrono")) return ImputazioniCrono.GetDOMD_ImputazioniCrono();
    if (DOName.equals("Piani")) return Piani.GetDOMD_Piani();
    if (DOName.equals("EntrateCronoprogrammi")) return EntrateCronoprogrammi.GetDOMD_EntrateCronoprogrammi();
    if (DOName.equals("Varpiani")) return Varpiani.GetDOMD_Varpiani();
    if (DOName.equals("VarDef")) return VarDef.GetDOMD_VarDef();
    if (DOName.equals("VarProvv")) return VarProvv.GetDOMD_VarProvv();
    if (DOName.equals("PvbSchedeObiettiviProv")) return PvbSchedeObiettiviProv.GetDOMD_PvbSchedeObiettiviProv();
    if (DOName.equals("Afc")) return Afc.GetDOMD_Afc();
    //
    throw new Exception("ERR " + DOERR_NOCLASS + ": [" + DOName + "] Classe Sconosciuta");
  }
}
