// **********************************************
// Global parameters
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;

import java.io.*;
import java.util.*;
import java.sql.*;


// **********************************************
// Classe base della servlet
// **********************************************
public class MyParams extends Params implements Serializable
{
  // Compilation Predefined Constants
  public String LANGUAGE = "ITA";
  public String PanelsUseTab = "YES";
  public String PanelsSortAlways = "NO";
  public String PanelsLikeSearch = "YES";
  public String PanelNewInsertMode = "YES";
  public String AutoSaveType = "DENY";
  public String UseFK = "YES";
  public String PanelsShowCombo = "YES";
  public String AutoRollback = "YES";
  public String PanelImageCombo = "AUTO";
  public int ResponseBufferSize = 48;
  public String CompressResponse = "YES";
  public String PanelFreezeWhenHidden = "YES";
  public String IWCacheControl = "CACHE";
  public String UseFastRowSelector = "YES";
  public String UseCollassableFrames = "NO";
  public String MTIType = "NONE";
  public String PanelIsLockable = "NO";
  public String InfoMessages = "NO";
  public int AutoDynRows = 0;
  public int ActImgWidth = 15;
  public String UseSmallIcon = "NO";
  public String Theme = "seattle";
  public String NativeBlob = "NO";
  public String UseClientMask = "YES";
  public String UseDecimalDot = "NO";
  public String PanelConfirmDelete = "YES";
  public String ShowDisabledFieldActivator = "YES";
  public String ShowFieldImageInValue = "YES";
  public String UseRD = "YES";
  public String TruePopup = "YES";
  public String UseIDTag = "YES";
  public String ShowRD = "NO";
  public String UseDoubleClick = "YES";
  public String EnablePanelMultiSelection = "NO";
  public String ShowPanelMultiSelection = "NO";
  public String PanelQBEEmpty = "NO";
  public String HtmlConstraints = "NONE";
  public String ActivePanelMultiSelection = "NO";
  public String ToolbarPosition = "LEFT";
  public String UseRD3 = "YES";
  public String UseCollapsableFrames = "NO";
  public String ConvertNullToValue = "YES";
  public int ChangeRowDelay = 300;
  public String SmartLookupIcon = "NO";
  public String ShowDisabledIcons = "NO";
  public String RightAlignedIcons = "NO";
  public String AllowMasterPanelNav = "YES";
  public String BorderType = "DEFAULT";
  public int TooltipErrorMode = 1;
  public String EnableGFX = "YES";
  public String EnableSound = "NO";
  public String EnableRichTooltip = "YES";
  public String MultiSelectionComboBox = "YES";
  public String UseCollapsableGroups = "NO";
  public String PanelHighlightDelete = "YES";
  public String SelectAllOnlyVisible = "NO";
  public String TooltipOnEachRow = "NO";
  public String EnableFrameResize = "YES";
  public String QBETrueLessThan = "NO";
  public String PanelEnableInsertWhenLocked = "NO";
  public String LKEDOAllProperties = "YES";
  public String LoadingPolicy = "AUTO";
  public String PullToRefresh = "YES";
  public String UseHTML5Upload = "YES";
  public String CompletePanelBorders = "NO";
  public String UseZones = "NO";
  public String EnableVoice = "NO";
  public String UseIDEditor = "NO";
  public String EnterChangeFocus = "NO";
  public String PanelsLikeMode = "STARTSWITH";
  public String PanelRefreshOnSort = "NO";
  public String PanelListQBE = "NO";
  public String IonicDarkMode = "AUTO";
  public String PanelFixActiveRowWhenScrolled = "NO";
    public boolean UseRD4 = false;
    public boolean UseDynVS = true;

  
  public MyParams()
  {
    super.MAX_FORMS = MyGlb.MAX_FORMS;
    super.MAX_INDICATORS = MyGlb.MAX_INDICATORS;
    super.MAX_COMMANDS = MyGlb.MAX_COMMANDS;
    super.MAX_COMMAND_SETS = MyGlb.MAX_COMMAND_SETS;
    super.MAX_TIMERS = MyGlb.MAX_TIMERS;
    super.ICDebug = this.ICDebug;
    super.DemoMode = this.DemoMode;
    super.UseFastRowSelector = this.UseFastRowSelector.equals("YES");
    super.PanelIsLockable = this.PanelIsLockable.equals("YES");
    super.InfoMessages = this.InfoMessages.equals("YES");
    super.AutoDynRows = 0;
    super.ActImgWidth = 15;
    super.Theme = this.Theme;
    super.UseSmallIcon = (("NO").equals("YES"));
    super.NativeBlob = this.NativeBlob.equals("YES");
    super.UseClientMask = this.UseClientMask.equals("YES");
    super.DefaultDateMask = "dd/mm/yyyy";
    super.DefaultTimeMask = "hh:nn";
    super.DefaultCurrencyMask = "#,###,###,##0.00";
    super.DefaultFloatMask = "#,###,###,###.####";
    super.UseDecimalDot = this.UseDecimalDot.equals("YES");
    super.PanelConfirmDelete = this.PanelConfirmDelete.equals("YES");
    super.PanelHighlightDelete = this.PanelHighlightDelete.equals("YES");
    super.ShowFieldImageInValue = this.ShowFieldImageInValue.equals("YES");
    super.ShowDisabledFieldActivator = this.ShowDisabledFieldActivator.equals("YES");
    super.ConvertNullToValue = this.ConvertNullToValue.equals("YES");
    super.IWCacheControl = this.IWCacheControl;
    super.AutoSaveType = this.AutoSaveType;
    super.UseRD = this.UseRD.equals("YES");
    super.TruePopup = this.TruePopup.equals("YES");
    super.UseIDTag = this.UseIDTag.equals("YES");
    super.ShowRD = this.ShowRD.equals("YES");
    super.UseFK = this.UseFK.equals("YES");
    super.UseDoubleClick = this.UseDoubleClick.equals("YES");
    super.PanelsSortAlways = this.PanelsSortAlways.equals("YES");
    super.EditUpdErrorMode = 2;
    super.EditInsErrorMode = 2;
    super.FinalUpdErrorMode = 1;
    super.FinalInsErrorMode = 1;
    super.PanelCommandMask = -1;
    super.EnablePanelMultiSelection = this.EnablePanelMultiSelection.equals("YES");
    super.ShowPanelMultiSelection = this.ShowPanelMultiSelection.equals("YES");
    super.ActivePanelMultiSelection = this.ActivePanelMultiSelection.equals("YES");
    super.SelectAllOnlyVisible = this.SelectAllOnlyVisible.equals("YES");
    super.PanelQBEEmpty = this.PanelQBEEmpty.equals("YES");
    super.HelpFeatures = "";
    super.UseCollapsableFrames = this.UseCollapsableFrames.equals("YES");
    super.HtmlConstraints = this.HtmlConstraints.equals("NONE")?MyGlb.WEBVALID_NONE:MyGlb.WEBVALID_STRICT;
    super.ChangeRowDelay = this.ChangeRowDelay;
    super.SmartLookupIcon = this.SmartLookupIcon;
    super.ShowDisabledIcons = this.ShowDisabledIcons.equals("YES");
    super.RightAlignedIcons = this.RightAlignedIcons.equals("YES");
    super.AllowMasterPanelNav = this.AllowMasterPanelNav.equals("YES");
    super.PanelsLikeSearch = this.PanelsLikeSearch.equals("YES");
    super.UseRD3 = this.UseRD3.equals("YES");
    super.UseRD4 = this.UseRD4;
    super.PullToRefresh = this.PullToRefresh.equals("YES");
    if (this.LoadingPolicy.equals("MANUAL"))
      super.LoadingPolicy = 0;
    if (this.LoadingPolicy.equals("AUTO"))
      super.LoadingPolicy = 1;
    if (this.LoadingPolicy.equals("CONTINUOUS"))
      super.LoadingPolicy = 2;
    //
    if (this.ToolbarPosition.equals("NONE"))
      super.ToolbarPosition = MyGlb.FORMTOOL_NONE;
    if (this.ToolbarPosition.equals("LEFT"))
      super.ToolbarPosition = MyGlb.FORMTOOL_LEFT;
    if (this.ToolbarPosition.equals("RIGHT"))
      super.ToolbarPosition = MyGlb.FORMTOOL_RIGHT;
    if (this.ToolbarPosition.equals("DISTRIBUTED"))
      super.ToolbarPosition = MyGlb.FORMTOOL_DISTRUB;
    //
    super.BorderType = Theme.equals("seattle") ? MyGlb.BORDER_THICK : MyGlb.BORDER_THIN;
    if (this.BorderType.equals("NONE"))
      super.BorderType = MyGlb.BORDER_NONE;
    if (this.BorderType.equals("THICK"))
      super.BorderType = MyGlb.BORDER_THICK;
    if (this.BorderType.equals("THIN"))
      super.BorderType = MyGlb.BORDER_THIN;
    //
    super.TooltipErrorMode = this.TooltipErrorMode;
    super.MaxRequestSize = 102400;
    super.UseDynVS = this.UseDynVS;
    super.EnableGFX = this.EnableGFX.equals("YES");
    super.EnableSound = this.EnableSound.equals("YES");
    super.EnableRichTooltip = this.EnableRichTooltip.equals("YES");
    super.MultiSelectionComboBox = this.MultiSelectionComboBox.equals("YES");
    super.UseCollapsableGroups = this.UseCollapsableGroups.equals("YES");
    super.TooltipOnEachRow = this.TooltipOnEachRow.equals("YES");
    //
    super.EnableFrameResize = this.EnableFrameResize.equals("YES"); 
    super.QBETrueLessThan = this.QBETrueLessThan.equals("YES");
    super.PanelEnableInsertWhenLocked = this.PanelEnableInsertWhenLocked.equals("YES");
    super.PanelFixActiveRowWhenScrolled = this.PanelFixActiveRowWhenScrolled.equals("YES");
    //
    super.LKEDOAllProperties = this.LKEDOAllProperties.equals("YES");
    //
    super.UseHTML5Upload = this.UseHTML5Upload.equals("YES");
    super.CompletePanelBorders = this.CompletePanelBorders.equals("YES");
    super.UseZones = this.UseZones.equals("YES");
    super.EnableVoice = this.EnableVoice.equals("YES");
    super.UseIDEditor = this.UseIDEditor.equals("YES");
    super.EnterChangeFocus = this.EnterChangeFocus.equals("YES");
    //
    if (this.PanelsLikeMode.equals("STARTSWITH"))
      super.PanelsLikeMode = MyGlb.PAN_LIKESTARTS;
    else if (this.PanelsLikeMode.equals("CONTAINS"))
      super.PanelsLikeMode = MyGlb.PAN_LIKECONTAINS;
    //
    super.PanelRefreshOnSort = this.PanelRefreshOnSort.equals("YES");
    super.PanelListQBE = this.PanelListQBE.equals("YES") ? -1 : (this.PanelListQBE.equals("ROW") ? -2 : 0);
    //
    super.IonicDarkMode = this.IonicDarkMode;
    //
    // Se non sono in un componente (ma sono parte main app, quella senza package)
    if (!Glb.ClassWithPackage(this.getClass()))
    {
      IDVariant.ConvertNullToValue = super.ConvertNullToValue;
      IDVariant.InitDefaultMasks(super.DefaultDateMask, super.DefaultTimeMask);
    }
  }
}
