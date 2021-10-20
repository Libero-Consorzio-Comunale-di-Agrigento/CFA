// **********************************************
// Associazione Tipi Costo E PCF
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AssociazioneTipiCostoEPCF extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_TIPICOSTO_PIANCONTFINA = 0;
  private static int GRP_TIPICOSTO_TIPOCOSTO = 1;

  private static int PFL_TIPICOSTO_ES = 0;
  private static int PFL_TIPICOSTO_DUALENTRSPES = 1;
  private static int PFL_TIPICOSTO_LIVELLOMACRO = 2;
  private static int PFL_TIPICOSTO_CODICEMACRO = 3;
  private static int PFL_TIPICOSTO_DESCCODIMACR = 4;
  private static int PFL_TIPICOSTO_ETICHELBLGRP = 5;
  private static int PFL_TIPICOSTO_ETICHELBLGR1 = 6;
  private static int PFL_TIPICOSTO_TIPICOSTO = 7;
  private static int PFL_TIPICOSTO_ETICHELBLGRT = 8;
  private static int PFL_TIPICOSTO_ETICHELBLGR2 = 9;
  private static int PFL_TIPICOSTO_ORDINE = 10;

  private static int PPQRY_GPSPCFTIPCOS = 0;

  private static int PPQRY_VISTSTRURICL = 1;
  private static int PPQRY_ES = 2;

  private static int PPQRY_GPSTIPICOSTO = 3;


  IDPanel PAN_TIPICOSTO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_GPSPCFTIPCOS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_GPSPCFTIPCOS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_GPSPCFTIPCOS, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_GPSPCFTIPCOS, "PQRY_GPSPCFTIPCOS");
    IMDB.set_FldCode(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, "LIVELLO_MACRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, "CODICE_MACRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_TIPI_COSTO, "TIPI_COSTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_TIPI_COSTO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_ORDINE, "ORDINE");
    IMDB.SetFldParams(IMDBDef9.PQRY_GPSPCFTIPCOS,IMDBDef9.PQSL_GPSPCFTIPCOS_ORDINE,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_GPSPCFTIPCOS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AssociazioneTipiCostoEPCF(MyWebEntryPoint w, IMDBObj imdb)
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
  public AssociazioneTipiCostoEPCF()
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
    FormIdx = MyGlb.FRM_ASSTIPCOSEPC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B2BA232B-844C-4704-8A1A-4AD03751D3AA";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 720;
    DesignHeight = 466;
    set_Caption(new IDVariant("Associazione Tipi Costo e PCF"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 720;
    Frames[1].Height = 440;
    Frames[1].Caption = "Tipi Costo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_TIPICOSTO = new IDPanel(w, this, 1, "PAN_TIPICOSTO");
    Frames[1].Content = PAN_TIPICOSTO;
    PAN_TIPICOSTO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPICOSTO.VS = MainFrm.VisualStyleList;
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 720-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EB3B2CD2-E572-4A76-87D2-CBDBAE6FEF7B");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 20, 4, 632, 328, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 40);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPICOSTO.InitStatus = 2;
    PAN_TIPICOSTO_Init();
    PAN_TIPICOSTO_InitFields();
    PAN_TIPICOSTO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ELIMINA8+BaseCmdLinIdx)
      {
        Elimina();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVO24+BaseCmdLinIdx)
      {
        Inserisci();
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
      PAN_TIPICOSTO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_TIPICOSTO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPICOSTO_CODICEMACRO) {
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
    return (obj instanceof AssociazioneTipiCostoEPCF);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AssociazioneTipiCostoEPCF.class.getName() : (Glb.ClassWithPackage(AssociazioneTipiCostoEPCF.class) ? AssociazioneTipiCostoEPCF.class.getName().substring(AssociazioneTipiCostoEPCF.class.getPackage().getName().length() + 1) : AssociazioneTipiCostoEPCF.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Costo On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPICOSTO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0, (new IDVariant(4)));
          IMDB.set_Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0, (new IDVariant("S")));
        }
        PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_ES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_ES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((Column.equals((new IDVariant(PFL_TIPICOSTO_CODICEMACRO)), true) || Column.equals((new IDVariant(PFL_TIPICOSTO_LIVELLOMACRO)), true) || Column.equals((new IDVariant(PFL_TIPICOSTO_ES)), true)) && FieldWasModified.booleanValue())
      {
        if (!(ControlloCodiceStruttura(IDL.ToInteger(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0)), IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0), IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0))))
        {
          IDVariant v_VMSGE = new IDVariant(0,IDVariant.STRING);
          v_VMSGE = (new IDVariant("Codice non presente in struttura"));
          MainFrm.set_AlertMessage(v_VMSGE); 
          IMDB.set_Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPICOSTO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        PAN_TIPICOSTO.set_Layout((new IDVariant(1)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoOnCommand", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo On Change Layout
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPICOSTO_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo On Change Layout Body
      // Corpo Procedura
      // 
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        PAN_TIPICOSTO.set_Locked((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_TIPICOSTO.set_Locked((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoOnChangeLayout", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPICOSTO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPICOSTO);
      // 
      // Tipi Costo On Dynamic Properties Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_TIPICOSTO.Layout())).equals((new IDVariant(0)), true))
      {
        MainFrm.CmdObj.SetCmdVisible(MyGlb.CMDS_COMMANDSET31+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_ELIMINA8+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.SetCmdVisible(MyGlb.CMDS_COMMANDSET31+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_NUOVO24+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        MainFrm.CmdObj.SetCmdVisible(MyGlb.CMDS_COMMANDSET31+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_ELIMINA8+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.SetCmdVisible(MyGlb.CMDS_COMMANDSET31+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_NUOVO24+BaseCmdLinIdx].GetIndex()).intValue(), (new IDVariant(0)).booleanValue()); 
        if (PAN_TIPICOSTO.IsNewRow())
        {
          PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_ES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_ES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPICOSTO.SetFlags (Glb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPICOSTO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VMSGERR = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VERR = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_TIPI_COSTO, 0)))
      {
        v_VMSGERR = (new IDVariant("Tipo Costo non indicato"));
        v_VERR = (new IDVariant(-1));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Entrata/Spesa non indicata")));
        v_VERR = (new IDVariant(-1));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Livello non indicato")));
        v_VERR = (new IDVariant(-1));
      }
      else
      {
        IDVariant v_PLIV = null;
        v_PLIV = IDL.ToInteger(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0));
        if (v_PLIV.compareTo((new IDVariant(2)), true)<0 || v_PLIV.compareTo((new IDVariant(4)), true)>0)
        {
          v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Livello non compreso tra i valori 2,3,4")));
          v_VERR = (new IDVariant(-1));
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Codice Piano dei Conti Finanziario non indicato")));
        v_VERR = (new IDVariant(-1));
      }
      if (!(ControlloSovrapposizioneCodici(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0), IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0), IDL.ToInteger(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))))
      {
        v_VMSGERR = IDL.Add(IDL.Add(IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Esiste una sovrapposizione di codici tra i livelli"))), (new IDVariant("</br>"))), (new IDVariant("Impossibile inserire l'associazione")));
        v_VERR = (new IDVariant(-1));
      }
      if (v_VERR.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
        MainFrm.set_AlertMessage(v_VMSGERR); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPICOSTO_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo Before Update Body
      // Corpo Procedura
      // 
      IDVariant v_VMSGERR = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VERR = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_TIPI_COSTO, 0)))
      {
        v_VMSGERR = (new IDVariant("Tipo Costo non indicato"));
        v_VERR = (new IDVariant(-1));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Entrata/Spesa non indicata")));
        v_VERR = (new IDVariant(-1));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Livello non indicato")));
        v_VERR = (new IDVariant(-1));
      }
      else
      {
        IDVariant v_PLIV = null;
        v_PLIV = IDL.ToInteger(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0));
        if (v_PLIV.compareTo((new IDVariant(2)), true)<0 || v_PLIV.compareTo((new IDVariant(4)), true)>0)
        {
          v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Livello non compreso tra i valori 2,3,4")));
          v_VERR = (new IDVariant(-1));
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0)))
      {
        v_VMSGERR = IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Codice Piano dei Conti Finanziario non indicato")));
        v_VERR = (new IDVariant(-1));
      }
      if (!(ControlloSovrapposizioneCodici(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0), IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0), IDL.ToInteger(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))))
      {
        v_VMSGERR = IDL.Add(IDL.Add(IDL.Add(((v_VMSGERR.equals((new IDVariant("")), true))?(new IDVariant("")):IDL.Add(v_VMSGERR, (new IDVariant("</br>")))), (new IDVariant("Esiste una sovrapposizione di codici tra i livelli"))), (new IDVariant("</br>"))), (new IDVariant("Impossibile inserire l'associazione")));
        v_VERR = (new IDVariant(-1));
      }
      if (v_VERR.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
        MainFrm.set_AlertMessage(v_VMSGERR); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Tipi Costo After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_TIPICOSTO_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Costo After Commit Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_TIPICOSTO.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_TIPICOSTO.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "TipiCostoAfterCommit", _e);
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
      PAN_TIPICOSTO.set_Locked((new IDVariant(-1)).booleanValue());
      PAN_TIPICOSTO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "Load", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_CODICE_MACRO, 0, IDL.ToString(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Riclassificazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaRiclassificazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Riclassificazioni Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0)))
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Indicare Entrata/Spesa"));
        MainFrm.set_AlertMessage(v_VMSG); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0)))
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Indicare il livello"));
        MainFrm.set_AlertMessage(v_VMSG); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, IMDB.Value(IMDBDef9.PQRY_GPSPCFTIPCOS, IMDBDef9.PQSL_GPSPCFTIPCOS_LIVELLO_MACRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "ApriSceltaRiclassificazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Codice Struttura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Codice - Input
  // p Livello - Input
  // p Es - Input
  // **********************************************************************
  public boolean ControlloCodiceStruttura (IDVariant pCodice, IDVariant pLivello, IDVariant pEs)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Codice Struttura Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(pCodice) || IDL.IsNull(pLivello) || IDL.IsNull(pEs))
      {
        return (new IDVariant(-1)).booleanValue();
      }
      // 
      // Controllo coerenza codice con livello e tipo entrata
      // spesa
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  VISTA_STRUTTURA_RICL A ");
      SQL.append("where (A.CODICE = TRUNC(TO_NUMBER(A.CODICE))) ");
      SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
      SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append("and   (A.E_S = " + IDL.CSql(pEs, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(0)).booleanValue();
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "ControlloCodiceStruttura", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllo Sovrapposizione Codici
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Codice Macro - Input
  // p Es - Input
  // p Livello - Input
  // **********************************************************************
  public boolean ControlloSovrapposizioneCodici (IDVariant pCodiceMacro, IDVariant pEs, IDVariant pLivello)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Sovrapposizione Codici Body
      // Corpo Procedura
      // 
      IDVariant v_VRET = null;
      v_VRET = (new IDVariant(-1));
      if (IDL.IsNull(pCodiceMacro) || IDL.IsNull(pLivello) || IDL.IsNull(pEs))
      {
        return v_VRET.booleanValue();
      }
      // 
      // Livelli possibili 2,3,4
      // 
      if (pLivello.compareTo((new IDVariant(2)), true)<0 || pLivello.compareTo((new IDVariant(4)), true)>0)
      {
        return (new IDVariant(0)).booleanValue();
      }
      // 
      // Controllo sovrapposizione codici sui vari livelli diversi
      // da quello corrente
      // con esclusione di quello passato
      // per confrontarli prendo il minimo livello tra il codice
      // passato e quello della tabella e confronto la stringa
      // del codice passato
      // e del codice macro per i primi livello + 1 caratteri
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  GPS_PCF_TIPI_COSTO A ");
      SQL.append("where (A.CODICE_MACRO <> " + IDL.CSql(pCodiceMacro, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(pEs, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO_MACRO <> " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SUBSTR(A.CODICE_MACRO, 1, CASE WHEN TRUNC(TO_NUMBER(NVL(A.LIVELLO_MACRO, 0))) < " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN TRUNC(TO_NUMBER(NVL(A.LIVELLO_MACRO, 0))) ELSE " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END + 1) = SUBSTR(" + IDL.CSql(pCodiceMacro, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, CASE WHEN TRUNC(TO_NUMBER(NVL(A.LIVELLO_MACRO, 0))) < " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN TRUNC(TO_NUMBER(NVL(A.LIVELLO_MACRO, 0))) ELSE " + IDL.CSql(pLivello, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END + 1)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        v_VRET = (new IDVariant(0));
      }
      return v_VRET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "ControlloSovrapposizioneCodici", _e);
      return false;
    }
  }

  // **********************************************************************
  // Inserisci
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  private int Inserisci ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Body
      // Corpo Procedura
      // 
      PAN_TIPICOSTO.PanelCommand(Glb.PCM_INSERT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "Inserisci", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elimina
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  private int Elimina ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Body
      // Corpo Procedura
      // 
      PAN_TIPICOSTO.PanelCommand(Glb.PCM_DELETE);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociazioneTipiCostoEPCF", "Elimina", _e);
      return -1;
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
  private void PAN_TIPICOSTO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPICOSTO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPICOSTO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPICOSTO, Cancel);
    // Stub
  }

  private void PAN_TIPICOSTO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_TIPICOSTO_CODICEMACRO)
    {
      this.IdxPanelActived = this.PAN_TIPICOSTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaRiclassificazioni();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_TIPICOSTO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPICOSTO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPICOSTO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPICOSTO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPICOSTO_Init()
  {

    PAN_TIPICOSTO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPICOSTO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, "45E7584E-DDC7-49F4-A8EC-DFCB248ACB6B");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, "Piano Conti Finanziario");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, MyGlb.VIS_GROUPSTYLE);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, MyGlb.PANEL_LIST, 20, -9999, 460, 20, 0, 0);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, MyGlb.PANEL_FORM, 20, 15, 680, 121, 0, 0);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, 0, 127);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, 1, 13);
    PAN_TIPICOSTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, 0, 4);
    PAN_TIPICOSTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, 1, 4);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_PIANCONTFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, "85D38AFA-0245-4384-8C24-9D42F30ADD65");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, "Tipo Costo");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, MyGlb.VIS_GROUPSTYLE);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, MyGlb.PANEL_LIST, 480, -9999, 172, 20, 0, 0);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, MyGlb.PANEL_FORM, 20, 147, 680, 81, 0, 0);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, 0, 59);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, 1, 13);
    PAN_TIPICOSTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, 0, 4);
    PAN_TIPICOSTO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, 1, 4);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPICOSTO_TIPOCOSTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPICOSTO.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, "90D318DF-09A6-41FC-9E0F-8483002EDCA1");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, "Entrata/Spesa");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, "D3126180-9CE7-49FD-B548-65D50E5CC47A");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, "Entrata/Spesa");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, "CB3C9014-F3FC-47DC-AF58-6D9F920CC90E");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, "Livello");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.VIS_NORMFIELBUTT);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, "67BB747B-DBA8-4AFA-8C8D-9F1C6E7E5873");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, "Codice");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, "0F8E04CF-AF05-4C53-B62A-D45A40D4F735");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, "Descrizione Codice Macro");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, "FCA3548C-9B21-49FA-927A-90A6EF60FC18");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, " ");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, "lblGrP");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.VIS_LABELFIELD);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, "2D6F9876-31D7-47E0-828F-5DD834E9BC47");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, " ");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, "lblGrP");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.VIS_LABELFIELD);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, "151E5954-FBF6-4F44-8FF2-0B7BCE8918DB");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, "Codice");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, "26FF589C-5D0A-4E74-B407-9A7E0657D36A");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, " ");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, "lblGrP");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.VIS_LABELFIELD);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, "3D1D8964-D96D-4330-A8E7-547CD4FF9AF5");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, " ");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, "lblGrP");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.VIS_LABELFIELD);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPICOSTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, "F4D111F8-9653-4F7B-8637-14398B0B0E90");
    PAN_TIPICOSTO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, "Ordine");
    PAN_TIPICOSTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, "");
    PAN_TIPICOSTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPICOSTO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPICOSTO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_LIST, 220, 44, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_LIST, 24);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_LIST, "Entrata/Spesa");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_FORM, 100, 52, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_FORM, 24);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ES, MyGlb.PANEL_FORM, "E. S.");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ES, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ES, PPQRY_GPSPCFTIPCOS, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_LIST, 20, 48, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_LIST, 120);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_LIST, "Entrata/Spesa");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_FORM, 120);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DUALENTRSPES, MyGlb.PANEL_FORM, "Entrata/Spesa");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_DUALENTRSPES, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_DUALENTRSPES, PPQRY_ES, "~~E_S~~", "ENTRATASPESA", 5, 1, 0, -13997);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_DUALENTRSPES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_DUALENTRSPES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_LIST, 112, 48, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_LIST, 96);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_LIST, "Livello");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_FORM, 252, 52, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_FORM, 44);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_LIVELLOMACRO, MyGlb.PANEL_FORM, "Livello");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_LIVELLOMACRO, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_LIVELLOMACRO, PPQRY_GPSPCFTIPCOS, "A.LIVELLO_MACRO", "LIVELLO_MACRO", 1, 2, 0, -13997);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_LIVELLOMACRO, (new IDVariant(2)), "2", "", "", -1);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_LIVELLOMACRO, (new IDVariant(3)), "3", "", "", -1);
    PAN_TIPICOSTO.SetValueListItem(PFL_TIPICOSTO_LIVELLOMACRO, (new IDVariant(4)), "4", "", "", -1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_LIST, 156, 48, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_LIST, 96);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_FORM, 48, 84, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_FORM, 48);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_CODICEMACRO, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_CODICEMACRO, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_CODICEMACRO, PPQRY_GPSPCFTIPCOS, "A.CODICE_MACRO", "CODICE_MACRO", 5, 10, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_LIST, 252, 48, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_LIST, 220);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_LIST, "Descrizione Codice Macro");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_FORM, 252, 84, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_FORM, 220);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_DESCCODIMACR, MyGlb.PANEL_FORM, "Descrizione Codice Macro");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_DESCCODIMACR, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_DESCCODIMACR, PPQRY_VISTSTRURICL, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 224, 136, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 672, 112, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRP, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ETICHELBLGRP, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ETICHELBLGRP, -1, "", "ETICHELBLGRP", 0, 0, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_LIST, 232, 144, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_LIST, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_FORM, 24, 40, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_FORM, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR1, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ETICHELBLGR1, -1, GRP_TIPICOSTO_PIANCONTFINA);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ETICHELBLGR1, -1, "", "ETICHELBLGR1", 0, 0, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_LIST, 480, 48, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_LIST, 72);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_FORM, 48, 184, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_FORM, 48);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_TIPICOSTO, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_TIPICOSTO, -1, GRP_TIPICOSTO_TIPOCOSTO);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_TIPICOSTO, PPQRY_GPSPCFTIPCOS, "A.TIPI_COSTO", "TIPI_COSTO", 5, 1, 0, -13999);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_LIST, 240, 152, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_LIST, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_FORM, 24, 172, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_FORM, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGRT, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ETICHELBLGRT, -1, GRP_TIPICOSTO_TIPOCOSTO);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ETICHELBLGRT, -1, "", "ETICHELBLGRT", 0, 0, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_LIST, 248, 160, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_LIST, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_FORM, 672, 204, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_FORM, 0);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ETICHELBLGR2, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ETICHELBLGR2, -1, GRP_TIPICOSTO_TIPOCOSTO);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ETICHELBLGR2, -1, "", "ETICHELBLGR2", 0, 0, 0, -13997);
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_LIST, 0, 44, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_LIST, 48);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_LIST, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_LIST, "Ordine");
    PAN_TIPICOSTO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_FORM, 4, 224, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICOSTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_FORM, 48);
    PAN_TIPICOSTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_FORM, 1);
    PAN_TIPICOSTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICOSTO_ORDINE, MyGlb.PANEL_FORM, "Ordine");
    PAN_TIPICOSTO.SetFieldPage(PFL_TIPICOSTO_ORDINE, -1, -1);
    PAN_TIPICOSTO.SetFieldUnbound(PFL_TIPICOSTO_ORDINE, true);
    PAN_TIPICOSTO.SetFieldPanel(PFL_TIPICOSTO_ORDINE, PPQRY_GPSPCFTIPCOS, "RPAD(A.CODICE_MACRO, 7, SUBSTR('0', 1, 1))", "ORDINE", 5, 99, 0, -13997);
  }

  private void PAN_TIPICOSTO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPICOSTO.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES, ");
    SQL.append("  A.CODICE as VISSTRRICCOD ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = ~~LIVELLO_MACRO~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (A.CODICE = TRUNC(TO_NUMBER(~~CODICE_MACRO~~))) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPICOSTO.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, -1, "");
    PAN_TIPICOSTO.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICOSTO.SetMasterTable(PPQRY_VISTSTRURICL, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~E_S~~ as ENTRATASPESA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_TIPICOSTO.SetQuery(PPQRY_ES, 0, SQL, -1, "");
    PAN_TIPICOSTO.SetQueryDB(PPQRY_ES, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICOSTO.SetMasterTable(PPQRY_ES, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as GPSTIPCOSCOD, ");
    SQL.append("  A.DESCRIZIONE as GPSTIPCOSDE1, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as GPSTIPCOSCO1 ");
    SQL.append("from ");
    SQL.append("  GPS_TIPI_COSTO A ");
    SQL.append("where (A.CODICE = ~~TIPI_COSTO~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSTIPICOSTO, 0, SQL, PFL_TIPICOSTO_TIPICOSTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as GPSTIPCOSCOD, ");
    SQL.append("  A.DESCRIZIONE as GPSTIPCOSDE1, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as GPSTIPCOSCO1 ");
    SQL.append("from ");
    SQL.append("  GPS_TIPI_COSTO A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSTIPICOSTO, 1, SQL, PFL_TIPICOSTO_TIPICOSTO, "");
    PAN_TIPICOSTO.SetQueryDB(PPQRY_GPSTIPICOSTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICOSTO.SetIMDB(IMDB, "PQRY_GPSPCFTIPCOS", true);
    PAN_TIPICOSTO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO_MACRO as LIVELLO_MACRO, ");
    SQL.append("  A.CODICE_MACRO as CODICE_MACRO, ");
    SQL.append("  A.TIPI_COSTO as TIPI_COSTO, ");
    SQL.append("  RPAD(A.CODICE_MACRO, 7, SUBSTR('0', 1, 1)) as ORDINE ");
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  GPS_PCF_TIPI_COSTO A ");
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 5 ");
    PAN_TIPICOSTO.SetQuery(PPQRY_GPSPCFTIPCOS, 5, SQL, -1, "");
    PAN_TIPICOSTO.SetQueryDB(PPQRY_GPSPCFTIPCOS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICOSTO.SetMasterTable(0, "GPS_PCF_TIPI_COSTO");
    PAN_TIPICOSTO.AddToSortList(PFL_TIPICOSTO_ORDINE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPICOSTO.Status() == 2)
    {
      int oldListQBE = PAN_TIPICOSTO.iUseListQBE;
      PAN_TIPICOSTO.iUseListQBE = 0;
      PAN_TIPICOSTO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPICOSTO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPICOSTO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_OnChangeLayout(NewLayout, Cancel);
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
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPICOSTO) PAN_TIPICOSTO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
