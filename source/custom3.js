// ********************************************************************************
// Funzione per evento Organigramma in Flex
// ********************************************************************************
function show_info(param){
	var ev = new IDEvent("cmd", this.Identifier, ev, RD3_Glb.EVENT_ACTIVE, "CLICKFC&NI="+param);
}

// ********************************************************************************
// Dummy function per customizzazione header... può essere ridefinita in CUSTOM3.JS
// ********************************************************************************
WebEntryPoint.prototype.CustomizeHeader = function(parent)
{
	this.CommandBox.parentNode.removeChild(this.CommandBox);
	//this.DebugImageBox.parentNode.removeChild(this.DebugImageBox); 
}

WebEntryPoint.prototype.OnHelpButton = function(evento)
{
	//************
  var ev = new IDEvent("cmd", this.Identifier, ev, RD3_Glb.EVENT_ACTIVE, "HELP");
	//************
}

function RD3_CustomInit()
{
  RD3_ClientParams.DelayDlgTime = 5000;
}


//-------------------------------------CUSTOMIZZAZIONE TOOLBAR -------------------------------------------------------
IDPanel.prototype.RealizeToolbar = function()
{
  // Chiamo la classe base
  WebFrame.prototype.RealizeToolbar.call(this);
  //
  // Creo le zone
  this.TBZones = new Array();
  for (var i=0;i<=10;i++) // MAX TB ZONES
  {
    this.TBZones[i] = document.createElement("span");
    this.TBZones[i].className = (this.SmallIcons) ? "panel-toolbarsmall-zone" : "panel-toolbar-zone";
    this.ToolbarBox.appendChild(this.TBZones[i]);
  }
  //
  // La zona ZERO e' invisibile...
  this.TBZones[0].style.display = "none";
  //
  // Sposto i bottoni standard nelle zone
  this.ToolbarBox.removeChild(this.CollapseButton);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_COLLAPSE];
  this.TBZones[i].appendChild(this.CollapseButton);
  this.CollapseButton.style.marginLeft = "";
  //
  this.ToolbarBox.removeChild(this.LockButton);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_LOCK];
  this.TBZones[i].appendChild(this.LockButton);
  //  
  this.ToolbarBox.removeChild(this.IconImg);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_STATUSBAR];
  this.TBZones[i].appendChild(this.IconImg);
  //  
  this.ToolbarBox.removeChild(this.CaptionTxt);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_STATUSBAR];
  this.TBZones[i].appendChild(this.CaptionTxt);
  //
  // Creo la Status Bar
  this.StatusBar = document.createElement("span");
  this.StatusBar.setAttribute("id", this.Identifier+":status");
  this.StatusBar.className = (this.SmallIcons) ? "panel-toolbarsmall-status" : "panel-toolbar-status";
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_STATUSBAR];
  this.TBZones[i].appendChild(this.StatusBar);
  //
  // Creo l'immagine per i QBETip e il MessageTooltip
  this.QBETIcon = document.createElement("img");
  this.QBETIcon.src = RD3_Glb.GetImgSrc("images/qbef.gif");
  this.QBETIcon.setAttribute("id", this.Identifier+":qbetip");
  this.QBETIcon.className = (this.SmallIcons) ? "panel-toolbarsmall-qbetip" : "panel-toolbar-qbetip";
  this.QBETIcon.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnMouseOverObj', ev)");
  this.QBETIcon.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnMouseOutObj', ev)");
  this.QBETipBox = new MessageTooltip(this);
  this.QBETipBox.SetTitle(ClientMessages.TIP_TITLE_QBETIP);
  this.QBETipBox.SetStyle("info");
  this.QBETipBox.SetObj(this.QBETIcon);
  this.QBETipBox.SetDelay(0,0);
  this.QBETipBox.SetPosition(2);
  this.QBETipBox.SetCanClose(false);
  if (!this.QBETipAnimDef)
    this.QBETipBox.SetAnimDef(RD3_ClientParams.GFXDef["qbetip"]);
  else
    this.QBETipBox.SetAnimDef(this.QBETipAnimDef);
  this.TBZones[i].appendChild(this.QBETIcon);
  //
  // Pulsanti di navigazione
  this.TopButton = document.createElement("img");
  this.TopButton.setAttribute("id", this.Identifier+":top");
  this.TopButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.TopButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'top')");
  this.TopButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.TopButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.TopButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.TopButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.TopButton, RD3_ServerParams.PanelInizio);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_NAVIGATE];
  this.TBZones[i].appendChild(this.TopButton);
  //
  this.PrevButton = document.createElement("img");
  this.PrevButton.setAttribute("id", this.Identifier+":prev");
  this.PrevButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.PrevButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'prev')");
  this.PrevButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.PrevButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.PrevButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.PrevButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.PrevButton, RD3_ServerParams.PanelPaginaPrec);
  this.TBZones[i].appendChild(this.PrevButton);
  //
  this.NextButton = document.createElement("img");
  this.NextButton.setAttribute("id", this.Identifier+":next");
  this.NextButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.NextButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'next')");
  this.NextButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.NextButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.NextButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.NextButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.NextButton, RD3_ServerParams.PanelPaginaSucc);
  this.TBZones[i].appendChild(this.NextButton);
  //
  this.BottomButton = document.createElement("img");
  this.BottomButton.setAttribute("id", this.Identifier+":bottom");
  this.BottomButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.BottomButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'bottom')");
  this.BottomButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.BottomButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.BottomButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.BottomButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.BottomButton, RD3_ServerParams.PanelFine);
  this.TBZones[i].appendChild(this.BottomButton);
  //
  // Pulsante di cerca
  this.SearchButton = document.createElement("img");
  this.SearchButton.setAttribute("id", this.Identifier+":search");
  this.SearchButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.SearchButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'search')");
  this.SearchButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.SearchButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.SearchButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.SearchButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.SearchButton, RD3_ServerParams.TooltipCerca + RD3_KBManager.GetFKTip(RD3_ClientParams.FKEnterQBE));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_SEARCH];
  this.TBZones[i].appendChild(this.SearchButton);
  //
  // Pulsante di trova
  this.FindButton = document.createElement("img");
  this.FindButton.setAttribute("id", this.Identifier+":find");
  this.FindButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.FindButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'find')");
  this.FindButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.FindButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.FindButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.FindButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.FindButton, RD3_ServerParams.TooltipTrova + RD3_KBManager.GetFKTip(RD3_ClientParams.FKFindData));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_FIND];
  this.TBZones[i].appendChild(this.FindButton);
  //
  // Pulsante di form/list
  this.FormListButton = document.createElement("img");
  this.FormListButton.setAttribute("id", this.Identifier+":formlist");
  this.FormListButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.FormListButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'list')");
  this.FormListButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.FormListButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.FormListButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.FormListButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.FormListButton, RD3_ServerParams.TooltipFormList + RD3_KBManager.GetFKTip(RD3_ClientParams.FKFormList));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_FORMLIST];
  this.TBZones[i].appendChild(this.FormListButton);
  //
  // Pulsante di CANCEL
  this.CancelButton = document.createElement("img");
  this.CancelButton.setAttribute("id", this.Identifier+":cancel");
  this.CancelButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.CancelButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'cancel')");
  this.CancelButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.CancelButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.CancelButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.CancelButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.CancelButton, RD3_ServerParams.TooltipCancel + RD3_KBManager.GetFKTip(RD3_ClientParams.FKCancel));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_CANCEL];
  this.TBZones[i].appendChild(this.CancelButton);
  //
  // Pulsante di refresh
  this.RefreshButton = document.createElement("img");
  this.RefreshButton.setAttribute("id", this.Identifier+":refresh");
  this.RefreshButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.RefreshButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'refresh')");
  this.RefreshButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.RefreshButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.RefreshButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.RefreshButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.RefreshButton, RD3_ServerParams.TooltipRefresh + RD3_KBManager.GetFKTip(RD3_ClientParams.FKRefresh));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_REQUERY];
  this.TBZones[i].appendChild(this.RefreshButton);
  //
   // Pulsante di cancellazione
  this.DelButton = document.createElement("img");
  this.DelButton.setAttribute("id", this.Identifier+":del");
  this.DelButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.DelButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'delete')");
  this.DelButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.DelButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.DelButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.DelButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.DelButton, RD3_ServerParams.TooltipDelete + RD3_KBManager.GetFKTip(RD3_ClientParams.FKDelete));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_DELETE];
  this.TBZones[i].appendChild(this.DelButton);
  //
  // Pulsante di inserimento
  this.NewButton = document.createElement("img");
  this.NewButton.setAttribute("id", this.Identifier+":new");
  this.NewButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.NewButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'insert')");
  this.NewButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.NewButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.NewButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.NewButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.NewButton, RD3_ServerParams.TooltipInsert + RD3_KBManager.GetFKTip(RD3_ClientParams.FKInsert));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_INSERT];
  this.TBZones[i].appendChild(this.NewButton);
  //
  // Pulsante di duplicazione
  this.DuplButton = document.createElement("img");
  this.DuplButton.setAttribute("id", this.Identifier+":dupl");
  this.DuplButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.DuplButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'dupl')");
  this.DuplButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.DuplButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.DuplButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.DuplButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.DuplButton, RD3_ServerParams.TooltipDuplicate + RD3_KBManager.GetFKTip(RD3_ClientParams.FKDuplicate));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_DUPLICATE];
  this.TBZones[i].appendChild(this.DuplButton);
  //
  // Pulsante di salvataggio
  this.SaveButton = document.createElement("img");
  this.SaveButton.setAttribute("id", this.Identifier+":save");
  this.SaveButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.SaveButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'save')");
  this.SaveButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.SaveButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.SaveButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.SaveButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.SaveButton, RD3_ServerParams.TooltipUpdate + RD3_KBManager.GetFKTip(RD3_ClientParams.FKUpdate));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_UPDATE];
  this.TBZones[i].appendChild(this.SaveButton);
  //
  this.PrintButton = document.createElement("img");
  this.PrintButton.setAttribute("id", this.Identifier+":print");
  this.PrintButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.PrintButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'print')");
  this.PrintButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.PrintButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.PrintButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.PrintButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.PrintButton, RD3_ServerParams.Print + RD3_KBManager.GetFKTip(RD3_ClientParams.FKPrint));
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_PRINT];
  this.TBZones[i].appendChild(this.PrintButton);
  //
  // Imposto il pulsante di Esportazione
  this.CsvButton = document.createElement("img");
  this.CsvButton.setAttribute("id", this.Identifier+":csv");
  this.CsvButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.CsvButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'csv')");
  this.CsvButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.CsvButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.CsvButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.CsvButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.CsvButton, RD3_ServerParams.TooltipExport);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_CSV];
  this.TBZones[i].appendChild(this.CsvButton);
  //
  // Imposto il pulsante di Allegati
  this.AttachButton = document.createElement("img");
  this.AttachButton.setAttribute("id", this.Identifier+":attach");
  this.AttachButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.AttachButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'attach')");
  this.AttachButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.AttachButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.AttachButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.AttachButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.AttachButton, RD3_ServerParams.ComandoAllegati);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_ATTACH];
  this.TBZones[i].appendChild(this.AttachButton);
  //
  // Imposto il pulsante di Allegati
  this.GroupButton = document.createElement("img");
  this.GroupButton.setAttribute("id", this.Identifier+":group");
  this.GroupButton.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.GroupButton.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'group')");
  this.GroupButton.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.GroupButton.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.GroupButton.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.GroupButton.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  RD3_TooltipManager.SetObjTitle(this.GroupButton, RD3_ServerParams.ComandoAllegati);
  i = RD3_DesktopManager.WebEntryPoint.CommandZones[RD3_Glb.CZ_GROUP];
  this.TBZones[i].appendChild(this.GroupButton);
  //
  // Imposto i custom commands
  var a = RD3_DesktopManager.WebEntryPoint.CustomCommands;
  var n = a.length;
  //
  if (n>0) 
    this.CustomButtons = new Array();
  //
  for (var i=0; i<n; i++)
  {
    var cb = document.createElement("img");
    cb.setAttribute("id", this.Identifier+":custom"+i);
    cb.className = "panel-toolbar-button" + ((this.SmallIcons)? "-small" : "");
    cb.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'cb"+ i +"')");
    cb.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
    cb.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
    cb.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
    cb.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
    RD3_TooltipManager.SetObjTitle(cb, a[i].Tooltip + RD3_KBManager.GetFKTip(a[i].FKNum));
    var j = RD3_DesktopManager.WebEntryPoint.CommandZones[18+i];
    this.TBZones[j].appendChild(cb);
    this.CustomButtons[i] = cb;
  }
  //
  // Tolgo le zone vuote
  var n = this.TBZones.length;
  for (var i=0; i<n; i++)
  {
    if (!this.TBZones[i].hasChildNodes())
      this.ToolbarBox.removeChild(this.TBZones[i]);
  }
  //*****************************************************************
  // MODIFICA
  //	this.TBZones[i].appendChild(document.createElement("BR"));
  //alert('prova');
	var d = document.createElement("DIV");
	d.style.display = "inline";
	 var dis = "inline";
		 if (RD3_Glb.IsChrome())
			dis = "inline-block";
	d.innerHTML = "<table style=\"display:"+dis+";vertical-align: middle;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr height=16><td style=\"background-image: url('images/cornerAS.gif'); background-repeat: no-repeat;\"></td><td style=\"background-image: url('images/BarTop.gif'); background-repeat: repeat-x;\"></td><td style=\"background-image: url('images/cornerAD.gif'); background-repeat: no-repeat;\"></td></tr><tr style=\"background-color:#FFFFFF;\"><td style=\"background-image: url('images/BarLeft.gif'); background-repeat: repeat-y;\"><img src=\"images/cornerBlank.gif\" /></td><td id='cont" + this.Identifier + "'></td><td style=\"background-image: url('images/BarRight.gif'); background-repeat: repeat-y;\"><img src=\"images/blank.gif\" /></td></tr><tr><td style=\"background-image: url('images/cornerBS.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td><td style=\"background-image: url('images/BarBottom.gif'); background-repeat: repeat-x;\"><img src=\"images/blank.gif\" /></td><td style=\"background-image: url('images/cornerBD.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td></tr></table>";
  document.body.appendChild(d);
	var cont = document.getElementById("cont" + this.Identifier);
	this.ToolbarBox.appendChild(d);
	for (var i=0; i<n; i++)
			cont.appendChild(this.TBZones[i]);
	//
	this.ToolbarTable = d;
	//********************************************************************
}


Command.prototype.Realize = function(parentm, parentt)
{
  //********************************************
  this.ParentTable = null;
  //********************************************
  //
	// realizzo i miei oggetti visuali
	if (this.IsMenu)
	{
		// Non realizzo i separatori nei dispositivi touch
		if (RD3_Glb.IsTouch() && this.IsSeparator())
			return;
		//
	 	if (RD3_DesktopManager.WebEntryPoint.MenuType!=RD3_Glb.MENUTYPE_MENUBAR)
	 	{
			this.RealizeSideMenu(parentm);
		}
		else
		{
			if (this.Level==1)
				this.RealizeMenuBar(parentm);
		}	
	}
	if (this.IsToolbar)
	{
		this.RealizeToolbar(parentt);
	}
	//
  // Poi chiedo ai miei figli di realizzarsi
  var n = this.Commands.length;
  for(var i=0; i<n; i++)
  {
    // Se sono un commandset di secondo livello contenuto in un cmdset di primo livello il mio 
    // flag IsToolbar e' sempre false, non creo un mio oggetto visuale e passo ai miei figli il parentt
    if (this.MyToolBox == null)
      this.MyToolBox = parentt;
    //
    this.Commands[i].Realize(this.MenuBox, this.MyToolBox);
  }
  //
  //********************************************
  if (this.ParentTable)
    this.MyToolBox = this.ParentTable;
  //********************************************
  //
  // Eseguo l'impostazione iniziale delle mie proprieta' (quelle che cambiano l'aspetto visuale)
  this.Realized = true;
  this.SetCaption();
  this.SetTooltip();
  this.SetToolName();
  this.SetExpanded();
  this.SetImage();
  this.SetEnabled();
  this.SetVisible();
}

//-------------------------------------------------------------------------------------------
// gio 18/06/2015 Intervento Progamma
// Problema:  toolbar su alberi disegnate e posizionate male
// Assistenza:000689-2015
// Autore:    Diego Pierangeli
// Intevento: Command.ActiveFormChanged() personalizzato
//-------------------------------------------------------------------------------------------

Command.prototype.ActiveFormChanged = function()
{ 
  // Attenzione: questa toolbar e' di form... mettiamo i comandi nel posto giusto
  // Opero solo per toolbar globali
  if (this.ToolCont >= 0 && this.IsToolbar)
  {
    // Se e' di form la metto nella toolbar sopra la formcaption
    if (this.ToolCont == 0)
    {
      var f = RD3_DesktopManager.ObjectMap["frm:"+this.FormIndex];
      if (f && f.Realized)
      {
        if (!this.MyToolBox && RD3_Glb.IsMobile())
        {
        	// Nel caso mobile, la toolbar di frame non e' inizializzata. Lo faccio ora
        	this.RealizeToolbar(f.CaptionBox);
				  for(var i=0; i<this.Commands.length; i++)
				  {
				  	this.Commands[i].RealizeToolbar(this.MyToolBox);
				  	this.Commands[i].Realize(this.MenuBox, this.MyToolBox);
				  }
        }
        f.AttachToolbar(this);
        //
        if (!this.IsToolBarLoaded()) 
        {
          // Le immagini della toolbar non sono state ancora caricate: attivo un timer che ogni 500 milli
          // controlla se sono state caricate: se lo sono rifaccio l'adaptLayout della form
          this.ToolTimer = window.setTimeout(new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'ToolbarLoadedUpdate', ev, true)"), 100);
        }
      }
    }
    //
    // Se e' legata a un pannello la metto nella toolbar del pannello stesso
    if (this.ToolCont > 0)
    {
      var f = RD3_DesktopManager.ObjectMap["frm:"+this.FormIndex];
      if (f)
      {
        var fr = f.Frames[this.ToolCont-1];
        //
        if (fr && fr.ToolbarBox && !this.MyToolBox && RD3_Glb.IsMobile())
        {
        	// Nel caso mobile, la toolbar di frame non e' inizializzata. Lo faccio ora
        	this.RealizeToolbar(fr.ToolbarBox);
				  for(var i=0; i<this.Commands.length; i++)
				  {
				  	this.Commands[i].RealizeToolbar(this.MyToolBox);
				  	this.Commands[i].Realize(this.MenuBox, this.MyToolBox);
				  }
        }
        //
        if (fr && fr.ToolbarBox && this.MyToolBox && this.MyToolBox.parentNode != fr.ToolbarBox)
        {
          if (this.MyToolBox.parentNode)
            this.MyToolBox.parentNode.removeChild(this.MyToolBox);
          //
          // Nel caso di pannello devo tenere conto delle zone
          if (fr instanceof IDPanel)
            fr.AppendCmsToToolbar(this.MyToolBox);
          else
		  {
		    //********************************************************
			// Diego Pierangeli 18/06/2015
		    // Devo tenere conto della personalizzazione
			
		    var cont = document.getElementById("cont" + fr.Identifier);
			if (cont)
			  cont.appendChild(this.MyToolBox);
			else
              fr.ToolbarBox.appendChild(this.MyToolBox);
		    //**********************************************************
		  }
        }
      }
    }
  }
  //
  this.SetVisible();
  this.SetEnabled();
  //
  var cmdl = this.Commands.length;
  for (var i = 0; i<cmdl; i++ )
  {
    this.Commands[i].ActiveFormChanged();
  }
}

Tree.prototype.RealizeToolbar = function()
{
  // Chiamo il metodo base
  WebFrame.prototype.RealizeToolbar.call(this);
  //
  // Creo la tabella che circonda la toolbar
  var d = document.createElement("DIV");
  d.style.display = "inline";
  var dis = "inline";
  if (RD3_Glb.IsChrome())
    dis = "inline-block";
  d.innerHTML = "<table style=\"display:"+dis+";vertical-align: middle;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr height=16><td style=\"background-image: url('images/cornerAS.gif'); background-repeat: no-repeat;\"></td><td style=\"background-image: url('images/BarTop.gif'); background-repeat: repeat-x;\"></td><td style=\"background-image: url('images/cornerAD.gif'); background-repeat: no-repeat;\"></td></tr><tr style=\"background-color:#FFFFFF;\"><td style=\"background-image: url('images/BarLeft.gif'); background-repeat: repeat-y;\"><img src=\"images/cornerBlank.gif\" /></td><td id='cont" + this.Identifier + "'></td><td style=\"background-image: url('images/BarRight.gif'); background-repeat: repeat-y;\"><img src=\"images/blank.gif\" /></td></tr><tr><td style=\"background-image: url('images/cornerBS.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td><td style=\"background-image: url('images/BarBottom.gif'); background-repeat: repeat-x;\"><img src=\"images/blank.gif\" /></td><td style=\"background-image: url('images/cornerBD.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td></tr></table>";
  //
  // Appendo la tabella al DOM e trovo l'elemento centrale (la appendo al dom temporaneamente: mi serve solo per fare la GetElementByID)
  document.body.appendChild(d);
  var cont = document.getElementById("cont" + this.Identifier);
  //
  // Appendo tutti i membri della toolbar dell'albero all'elemento centrale
  cont.appendChild(this.CollapseButton);
  cont.appendChild(this.LockButton);
  cont.appendChild(this.IconImg);
  cont.appendChild(this.CaptionTxt);
  //
  // Adesso tolgo la tabella dal DOM e la metto al posto giusto: nella toolbar dell'albero
  this.ToolbarBox.appendChild(d);
}

Book.prototype.RealizeToolbar = function()
{
  // Chiamo il metodo base
  WebFrame.prototype.RealizeToolbar.call(this);
  //
  // Creo gli oggetti Dom Specifici di questa Toolbar
  this.StatusBarTxt = document.createElement("span")
  this.ToolbarNav = document.createElement("span");
  this.NextImg = document.createElement("img");
  this.PrevImg = document.createElement("img");
  this.BeginImg = document.createElement("img");
  this.EndImg = document.createElement("img");
  this.PrintImg = document.createElement("img");
  this.ExportImg = document.createElement("img");
  this.ToolbarSeparator1 = document.createElement("span");
  this.ToolbarSeparator2 = document.createElement("span");
	//  
  this.BeginImg.setAttribute("id", this.Identifier+":top");
  this.PrevImg.setAttribute("id", this.Identifier+":next");
  this.NextImg.setAttribute("id", this.Identifier+":prev");
  this.EndImg.setAttribute("id", this.Identifier+":bottom");
  this.ExportImg.setAttribute("id", this.Identifier+":print");
  //
  // Imposto le classi
  this.StatusBarTxt.className = (this.SmallIcons) ? "book-toolbarsmall-status" : "book-toolbar-status";
  this.NextImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.PrevImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.BeginImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.EndImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.PrintImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.ExportImg.className = "book-toolbar-button" + ((this.SmallIcons)? "-small" : "");
  this.ToolbarSeparator1.className = "book-toolbar-sep";
  this.ToolbarSeparator2.className = "book-toolbar-sep";
  //
  // Assegno i Tooltip RTC
  RD3_TooltipManager.SetObjTitle(this.NextImg, RD3_ServerParams.BookPaginaSucc);
  RD3_TooltipManager.SetObjTitle(this.PrevImg, RD3_ServerParams.BookPaginaPrec);
  RD3_TooltipManager.SetObjTitle(this.BeginImg, RD3_ServerParams.BookInizio);
  RD3_TooltipManager.SetObjTitle(this.EndImg, RD3_ServerParams.BookFine);
  RD3_TooltipManager.SetObjTitle(this.PrintImg, RD3_ServerParams.CreatePDF);
  RD3_TooltipManager.SetObjTitle(this.ExportImg, RD3_ServerParams.TooltipExport);
  //
  // Imposto la gestione dei vari click
  this.NextImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'next')");
  this.PrevImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'prev')");
  this.BeginImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'top')");
  this.EndImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'bottom')");
  this.PrintImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'print')");
  this.ExportImg.onclick = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolbarClick', ev, 'csv')");
  //
  // Gestione provvisoria Hilight bottoni
  this.NextImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.NextImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.NextImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.NextImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  this.PrevImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.PrevImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.PrevImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.PrevImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  this.BeginImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.BeginImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.BeginImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.BeginImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  this.EndImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.EndImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.EndImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.EndImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  this.PrintImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.PrintImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.PrintImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.PrintImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  this.ExportImg.onmouseover = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");
  this.ExportImg.onmousedown = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'down')");
  this.ExportImg.onmouseout = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, '')");
  this.ExportImg.onmouseup = new Function("ev","return RD3_DesktopManager.CallEventHandler('"+this.Identifier+"', 'OnToolMouseUse', ev, 'hover')");  
  //
  // Aggiungo gli elementi al DOM
  this.ToolbarNav.appendChild(this.BeginImg);
  this.ToolbarNav.appendChild(this.PrevImg);
  this.ToolbarNav.appendChild(this.NextImg);
  this.ToolbarNav.appendChild(this.EndImg);
  //
  // Creo la tabella che circonda la toolbar
  var d = document.createElement("DIV");
  d.style.display = "inline";
  var dis = "inline";
  if (RD3_Glb.IsChrome())
    dis = "inline-block";
  d.innerHTML = "<table style=\"display:"+dis+";vertical-align: middle;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr height=16><td style=\"background-image: url('images/cornerAS.gif'); background-repeat: no-repeat;\"></td><td style=\"background-image: url('images/BarTop.gif'); background-repeat: repeat-x;\"></td><td style=\"background-image: url('images/cornerAD.gif'); background-repeat: no-repeat;\"></td></tr><tr style=\"background-color:#FFFFFF;\"><td style=\"background-image: url('images/BarLeft.gif'); background-repeat: repeat-y;\"><img src=\"images/cornerBlank.gif\" /></td><td id='cont" + this.Identifier + "'></td><td style=\"background-image: url('images/BarRight.gif'); background-repeat: repeat-y;\"><img src=\"images/blank.gif\" /></td></tr><tr><td style=\"background-image: url('images/cornerBS.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td><td style=\"background-image: url('images/BarBottom.gif'); background-repeat: repeat-x;\"><img src=\"images/blank.gif\" /></td><td style=\"background-image: url('images/cornerBD.gif'); background-repeat: no-repeat;\"><img src=\"images/cornerBlank.gif\"></td></tr></table>";
  //
  // Appendo la tabella al DOM e trovo l'elemento centrale (la appendo al dom temporaneamente: mi serve solo per fare la GetElementByID)
  document.body.appendChild(d);
  var cont = document.getElementById("cont" + this.Identifier);
  //
  // Appendo tutti i membri della toolbar del frame all'elemento centrale
  cont.appendChild(this.CollapseButton);
  cont.appendChild(this.LockButton);
  cont.appendChild(this.IconImg);
  cont.appendChild(this.CaptionTxt);
  //
  // Adesso aggiungo anche i pulsanti specifici del book
  cont.appendChild(this.StatusBarTxt);
  cont.appendChild(this.ToolbarSeparator1);
  cont.appendChild(this.ToolbarNav);
  cont.appendChild(this.ToolbarSeparator2);
  cont.appendChild(this.PrintImg);
  cont.appendChild(this.ExportImg);
  //
  // Adesso tolgo la tabella dal DOM e la metto al posto giusto: nella toolbar del book
  this.ToolbarBox.appendChild(d);
}


// *********************************************************
// Imposta il titolo dei tooltip negli alberi a null
// *********************************************************
TreeNode.prototype.GetTooltip = function(tip, obj)
{
  if (this.Tooltip == "")
    return false;
  //
  tip.SetObj(this.NodeBox);
  tip.SetImage("");
  tip.SetText(this.Tooltip);
  tip.SetAutoAnchor(true);
  tip.SetPosition(2);
  return true;
}

//********************************************************
// 001439-2014 - combo cliccabili in nuova riga
PCell.prototype.RenderDisabledCombo = function(vs, parent, cloned)
{
  var pf = this.ParentField;
  var pp = pf.ParentPanel;
  var inqbe = this.PValue.InQBE();
  var ie = RD3_Glb.IsIE();
  //
  var created = false;
  //
  // Se il controllo presente nella cella non e' DISABLEDCOMBO devo svuotare tutta la cella
  if (this.ControlType != 30)
  {
    // Se c'e' gia' un controllo... e' sicuramente quello sbagliato!
    if (this.ControlType != -1)
      this.ClearElement(true);
  }
  //
  // Se il controllo presente nella cella non e' DISABLEDCOMBO... lo creo
  var img = null;
  var span = null;
  if (this.ControlType != 30)
  {
    // Creo un DIV che contiene il controllo
    this.IntCtrl = document.createElement("div");
    this.IntCtrl.className = (this.InList && this.ParentField.ListList ? "panel-field-value-list" : "panel-field-value-form");
    parent.appendChild(this.IntCtrl);
    //
    // Creo l'immagine
    img = document.createElement("img");
    this.IntCtrl.appendChild(img);
    img.className = "combo-img-dis";
    if (RD3_Glb.IsMobile() && pf.VisOnlyIcon())
      img.style.position = "absolute";
    else
      img.style.position = "relative";
    if (RD3_Glb.IsIE(10, false))
      img.style.verticalAlign = "text-bottom";
    //
    // Creo lo span
    span = document.createElement("span");
    span.className = "combo-input";
    this.IntCtrl.appendChild(span);
    //
    // Alle combo disabilitate metto sempre l'ellipsis
    if (RD3_Glb.IsMobile() || RD3_Glb.IsTouch())
      RD3_Glb.AddClass(this.IntCtrl, "panel-value-html");
    //
    // Ora questo e' il controllo di questa cella
    this.ControlType = 30;
    //
    // Ho creato il controllo
    created = true;
  }
  else
  {
    // La combo disabled esiste gia'... Recupero i puntatori agli oggetti interni
    img = this.IntCtrl.firstChild;
    span = img.nextSibling;
  }
  //
  // Ora recupero i dati
  var vl = this.PValue.GetValueList();
  var selit = (vl ? vl.FindItemsByValue(this.PValue.Text, false) : null);
  var newtxt;
  var newimg;
  var newtip;
  if (!selit || selit.length==0)
  {
    // Se non c'e' piu' la lista o non ho trovato il valore -> la cella e' vuota,
    // ma se il VS dice che devo mostrare la descrizione mostro comunque il Text del PValue
    newtxt = (pf.ShowDescription(vs) ? this.PValue.Text : "");
    newimg = "";
    newtip = "";
  }
  else
  {
    // Recupero i dettagli dall'item selezionato
    newtxt = (pf.ShowDescription(vs) ? selit[0].Name : "");
    newimg = (selit[0].Image != "" && vs.ShowImage() ? selit[0].Image : "");
    newtip = selit[0].Tooltip;
  }
  //
  // Aggiorno l'immagine (uso il LEFT per ricordarmi che non la voglio vedere (vedi HideCellContent))
  if (newimg != "")
  {
    img.src = RD3_Glb.GetImgSrc("images/"+newimg);
    img.style.display = "";
    img.style.left = "";
  }
  else
  {
    img.style.display = "none";
    img.style.left = "-999px";
  }
  //
  // Aggiorno il testo
  if (this.Text != newtxt)
  {
    this.Text = newtxt;
    //
    if (RD3_Glb.IsIE(10, false))
      span.innerText = newtxt;
    else
      span.textContent = newtxt;
    //
    // Preparo per l'editing della combo che viene renderizzata come disabilitata
    if (RD3_Glb.IsMobile())
      span.value = newtxt;
  }
  //
  // Aggiorno il tooltip
  this.SetTooltip(newtip);
  //
  var act = this.ParentField.ParentPanel.ActualPosition;
  var row = this.PValue.Index - act;
  //
  // In un pannello gruppato per sapere a quale riga sono devo: trovare la riga equivalente al PValue 
  // e sottrarre la riga equivalente dell'ActualPosition nella visione compatta
  if (this.ParentField.ParentPanel.IsGrouped() && this.ParentField.InList && this.ParentField.ListList)
    row = this.ParentField.ParentPanel.GetRowForIndex(this.PValue.Index);
  var newRow = this.ParentField.ParentPanel.IsNewRow(act, row);
  //
  // Click sulla combo disabilitata
  //*****************************************
  // Vogliamo che le Combo siano cliccabili su nuova riga
  var canclick = (pf.CanActivate && pf.ActivableDisabled) && pf.VisHyperLink(vs); // && !newRow;
  //*****************************************
  if (canclick != this.IsCellClickable || created || cloned)
  {
    this.IsCellClickable = canclick;
    //
    var curs;
    if (canclick)
    {
      var parentContext = this.ParentField;
      var fo = function(ev) { parentContext.OnClickActivator(ev); };
      //
      // I vari browser non gestiscono l'onfocus se non su un INPUT/TEXTAREA/SELECT
      // Quindi attacco l'onclick al div!
      this.IntCtrl.onclick = fo;
      curs = "pointer";
    }
    else
    {
      this.IntCtrl.onclick = null;
      curs = "default";
    }
    //
    if (RD3_Glb.IsMobile())
    {
      if (canclick)
        RD3_Glb.AddClass(this.IntCtrl,"panel-value-clickable");
      else
        RD3_Glb.RemoveClass(this.IntCtrl,"panel-value-clickable");
    }
    //
    this.IntCtrl.style.cursor = curs;
    //
    if ((selit && selit.length>0) || (newtxt && newtxt.length>0) || cloned)
    {
      img.style.cursor = curs;
      span.style.cursor = curs;
    }
  }
  //
  if (this.PValue.Badge != this.Badge)
  {
    this.Badge = this.PValue.Badge;
    //
    if (this.Badge == "")
    {
      if (this.BadgeObj != null && this.BadgeObj.parentNode)
        this.BadgeObj.parentNode.removeChild(this.BadgeObj);
      //  
      this.BadgeObj = null;
      this.BadgeObjX = null;
      this.BadgeObjY = null;    
    }
    else
    {
      if (this.BadgeObj == null)
      {
        this.BadgeObj = document.createElement("div");
        this.BadgeObj.className = "badge-grey";
        this.BadgeObj.style.position = "absolute";
        //
        if (RD3_Glb.IsMobile())
          this.BadgeObj.style.marginTop = "6pt";
        //
        this.SetZIndex(this.BadgeObj);
        parent.appendChild(this.BadgeObj);
      }
      //
      this.BadgeObj.innerHTML = this.Badge;
    }
  }
  //
  // Aggiorno lo stato ENABLED
  this.IsEnabled = false;
  //
  // Applico lo stile visuale
  this.UpdateVisualStyle(vs);
  //
  // Se non ho una immagine non ho bisogno del padding
  if (RD3_Glb.IsMobile() && newimg == "")
    span.style.paddingLeft = "0px";
  //
  // Aggiorno le dimensioni dell'oggetto
  this.UpdateDims();
  //
  return created;
}
// 001439-2014 - combo cliccabili in nuova riga
//********************************************************

// 000963-2015
// Personalizzazione per focus in combo lunghe

IDCombo.prototype.SetComboValue = function(value, doFocus)
{
  // ************************************
  // 000963-2015
	if (this.ComboInput.value !== value)
    this.ComboInput.value = value;
	if ((this.Enabled && doFocus))
      setCursorPos(this.ComboInput, 0);
  //***************************************
  // 
	if (this.ComboInput.tagName=="DIV")
		this.ComboInput.textContent = value;
}


IDCombo.prototype.Close = function(undo)
{
  // Semaforo di chiusura per combo mobile
  if (RD3_Glb.IsMobile() && this.ClosingCombo)
    return;
  //
  // Se la combo era aperta
  if (this.ComboPopup && this.ComboPopup.style.display=="")
  {
    // Chiudiamo la combo con l'animazione..
    if (RD3_Glb.IsMobile())
    {
      // Tolgo il fuoco dall'input
      if (this.ComboPopupInput)
        this.ComboPopupInput.blur();
      //
      if (!this.IsPopOver())
      {
        this.ClosingCombo = true;
        this.ShowMobileCombo(false);
      }
      else
      {
        this.ShowPopOverCombo(false);
      }
    }
    else
    {
      var fx = new GFX("combo", false, this, RD3_Glb.IsFirefox(3));
      RD3_GFXManager.AddEffect(fx);
    }
  }
  //
  // Se il dummy input era visibile
  if (this.ComboPopupInput && !RD3_Glb.IsMobile())
    this.ComboPopupInput.style.display = "none";
  //
  // Se il timer e' in esecuzione, lo fermo
  if (this.ComboPopupTimer!=0)
  {
    window.clearInterval(this.ComboPopupTimer);
    this.ComboPopupTimer = 0;
  }
  //
  // Confermo il valore all'Owner
  if (undo)
  {
    // Cerco se nella lista c'e', per caso, il valore originale della combo
    if (this.OptionList && !this.ListOwner)
    {
      var list = this.OptionList.ItemList;
      var last = list[list.length-1];
      if (last && last.Value=="LKEPREC")
        this.OriginalText = (this.ShowValue ? last.Value : last.Name);
    }
    //
    // Ripristino il valore presente al momento dell'apertura
    // Se ho un testo originale uso quello, altrimenti uso il testo vuoto
    // Se sono MultiSel e chiusa voglio acquisire comunque il valore
    if (!this.MultiSel || !this.IsOpen)
      this.SetText(this.OriginalText!=undefined ? this.OriginalText : "", this.ShowValue);
  }
  else
  {
    // Se ho un item selezionato lo valido
    if (this.SelItems.length>0)
    {
      // Aggiorno il valore dell'input
      //********************************************
      // Porto il cursore all'inizio 000963-2015
      this.SetComboValue(this.GetComboFinalName(this.ShowValue), true);
      //
      // Memorizzo il testo attualmente presente nell'input (per gestire bene il KeyUp)
      this.PreviousInputText = this.ComboInput.value;
      //
      // Memorizzo il testo originale presente nell'input
      this.OriginalText = this.ComboInput.value;
    }
    //
    // Se non ho un item selezionato
    if (this.SelItems.length==0)
    {
      // Non c'e' un item selezionato: se c'e' del testo dentro all'input vedo se la combo permette testo libero.
      // Se non lo permette, ripristino il valore originale (se c'e')
      if (this.ComboInput.value!="" && !this.AllowFreeText)
        this.SetText(this.OriginalText!=undefined ? this.OriginalText : "", this.ShowValue);
      //
      // Se non c'e' un valore ma la combo non ammette il valore opzionale, ripristino il valore originale
      if (this.ComboInput.value=="" && !this.IsOptional)
        this.SetText(this.OriginalText!=undefined ? this.OriginalText : "", this.ShowValue);
    }
  }
  //
  // Aggiorno l'immagine
  this.UpdateImage();
  //
  // Do' il fuoco all'input, se non sono al tocco
  if (!RD3_Glb.IsTouch() && this.Writable)
    this.ComboInput.focus();
  //
  // Ora la combo non e' piu' aperta
  RD3_DDManager.OpenCombo = null;
  this.IsOpen = false;
  //
  // Se il primo item selezionato ha uno stile lo applico
  // Devo aggiornare il VS di PValue siccome e' lui che comanda
  if (this.SelItems.length>0 && this.SelItems[0].VisualStyle && this.Owner.PValue)
  {
    this.Owner.PValue.SetVisualStyle(this.SelItems[0].VisualStyle);
    this.Owner.PValue.UpdateScreen();
  }
  //
  // Informo l'owner che e' cambiato il valore
  if (this.Owner.OnComboChange)
  {
    // Se non sono list-owner e chiudo la combo, devo comunque informare il server di quel che ho fatto/selezionato
    if (!this.ListOwner)
      this.Owner.OnComboChange(true, true);
    else
      this.Owner.OnComboChange(!undo);
  }
  //
  if (this.Owner.OnMultipleComboChange)
  {
    this.Owner.OnMultipleComboChange(this);
  }
}


PCell.prototype.Focus = function(selall, evento)
{
  // Le celle vuote non possono prendere il fuoco
  if ((this.PValue == null) || (this.ControlType==999)|| (this.ControlType==-1))
    return;
  //
  // Nel mobile non do il fuoco ad un campo readonly
  if (RD3_Glb.IsMobile() && (this.IsReadOnly || !this.IsEnabled))
    return;
  //
  // Se sto dando il fuoco ad una form docked devo verificare che sia visibile nel Mobile.. infatti nel caso di dispositivo in verticale
  // la form potrebbe essere invibile.. e dargli il fuoco non e' corretto (darebbe anche problemi di scroll)
  var parfrm = this.ParentField.ParentPanel.WebForm.GetMasterForm();
  var st = (parfrm.FramesBox && parfrm.FramesBox.parentNode ? parfrm.FramesBox.parentNode.style : null);
  if (RD3_Glb.IsMobile() && parfrm.Docked && st && st.display=="none")
  {
    RD3_KBManager.CheckFocus = true;
    //
    return false;
  }
  //
  // Eseguo impostazione
  try
  {
    // Rendo visibile questa cella scrollando il pannello (solo in orizzontale)
    var parf = this.ParentField;
    var parp = parf.ParentPanel;
    var fixc = parp.FixedColumns;
    var listidx = parf.ListTabOrder==-1 ? parf.Index : parf.ListTabOrder;
    // 
    // Non mi occupo dello scroll se sono un campo in listlist, il pannello ha le fixed col e io sono nell'area di scroll; 
    // questo caso e' gia' gestito dal framework
    var handled = (parf.ListList && fixc>0 && listidx>fixc);
    if (!handled)
    {
      // Calcolo il mio left ed il mio right
      var l = this.CtrlRectX + (parp.PanelMode==RD3_Glb.PANEL_LIST && parf.InList && parf.ListList ? parf.ListLeft : 0);
      var r = l + parf.GetValueWidth(this.InList);
      //
      // La posizione finale della mia cella e' visibile nel pannello? 
      if ((r-parp.ContentBox.scrollLeft) > parp.ContentBox.clientWidth)
      {
        // Non ci sto, devo scrollare!
        var scrl = r-parp.ContentBox.clientWidth+1;
        //
        // Controllo se il left esce da SX. In questo caso scrollo meno a meno che non sia RightAligned
        if (l<scrl && this.ValueAlign=="left") scrl = l;
        //
        // Non vado sotto 0
        if (scrl<0) scrl = 0;
        //            
        parp.ContentBox.scrollLeft = scrl;
      }
      else if (parp.ContentBox.scrollLeft>l && (this.ValueAlign=="left" || parf.GetValueWidth(this.InList)<parp.ContentBox.clientWidth))
      {
        parp.ContentBox.scrollLeft = l;
      }
    }
    if (RD3_Glb.IsMobile())
    {
      // Controllo di essere visibile e se no sposto il pannello con la traslazione 3d
      var objp = (parp.PanelMode==RD3_Glb.PANEL_LIST)? parp.ListBox : parp.FormBox;
      var yt = RD3_Glb.TranslateY(objp);
      var h = objp.parentNode.offsetHeight;
      var newt = 0;
      var hc = this.ParentField.GetValueHeight(this.InList);
      var okt = false;
      if (this.CtrlRectY+yt<0)
      {
        // Il campo e' sopra la parte visibile, lo porto dentro
        newt = this.CtrlRectY;
        okt = true;
      }
      if (this.CtrlRectY+hc+yt>h)
      {
        // Il campo e' sotto la parte visibile, lo porto dentro
        newt = this.CtrlRectY+hc-h;
        okt = true;
      }
      if (okt)
        RD3_Glb.SetTransform(objp, "translate3d(0px,-"+newt+"px,0px)");
    }
    //
    // Fuoco l'oggetto giusto
    var obj = this.GetDOMObj();
    //
    // Nel caso di Check devo dare il fuoco all'oggetto interno..
    if (this.ControlType == 4)
      obj = this.SubIntCtrl;
    //
    // Nel caso Radio devo dare il fuoco all'oggetto Interno
    if (this.ControlType == 5 && obj.childNodes.length>0)
    {
      // Innanzitutto prendiamo il primo oggetto (e' sempre un input)
      var intObj = obj.childNodes[0];
      //
      // Adesso cicliamo e cerchiamo l'input checked se c'e'
      for (var intId=0; intId<obj.childNodes.length; intId++)
      {
        if (obj.childNodes[intId].checked)
        {
          intObj = obj.childNodes[intId];
          break;
        }
      }
      //
      obj = intObj;
    }
    //
    // Se sono un intestazione di gruppo fuoco l'input
    if (this.ControlType == 111)
      obj = this.GroupLabel;
    //
    // Questa, a volte, fuoca il menu'... specialmente all'avvio dell'applicazione
    // Quindi meglio farne 2... tanto se la prima ha avuto successo... la seconda non fa nulla
    obj.focus();
    obj.focus();
    //
    // Se e' INPUT o COMBO
    if ((this.ControlType==2 && !this.IsReadOnly) || this.ControlType==3)
    {
      // Ho fuocato a mano il campo e non faro' gestire il focus al KBManager... quindi
      // devo gestire io a mano l'applicazione della maschera
      var en = this.IsEnabled;
      var msk = this.Mask;
      var mskt = this.MaskType;
      //
      // Vedi KBManager.IDRO_GetFocus
      if (en && msk && mskt)
        mc(msk, mskt, null, this.GetDOMObj());
      //
      // Eseguo selezione completa se richiesto
      if (en)
      {
        var proceed = true;
        //
        if (this.HasWatermark)
          selall = false;
        //
        // Se il campo e' abilitato verifico se devo impostare una posizione particolare
        if (RD3_DesktopManager.SelFld && RD3_DesktopManager.SelFld == this.ParentField.Identifier && !this.HasWatermark)
        {
          try
          {
            var start = parseInt(RD3_DesktopManager.SelSt);
            var end = parseInt(RD3_DesktopManager.SelEn);
            //
            if (obj.createTextRange)
            {
              var t = obj.createTextRange();
              t.move("character",start-1);
              t.moveEnd("character",(end-start+1));
              t.select();
            }
            else
            {
              obj.selectionStart = start-1;
              obj.selectionEnd = end;
            }
            //
            proceed = false;
          }
          catch(ex)
          {
            //proceed = true;
          }
        }
        //
        if (proceed)
        {
          if (selall)
          {
            if (obj.createTextRange)
            {
              var t = obj.createTextRange();
              t.select();
            }
            else
            {
              obj.selectionStart = 0;
              obj.selectionEnd = obj.value.length;
            }
            //
            this.ParentField.SendtextSelChange(this.GetDOMObj(true));
            if (RD3_KBManager.SelTextTimer)
            {
              window.clearTimeout(RD3_KBManager.SelTextTimer);
              RD3_KBManager.SelTextSrc = null;
              RD3_KBManager.SelTextObj = null;
              RD3_KBManager.SelTextTimer = null;
            }
          }
          else
          {
            if (this.HasWatermark)
            {
              setCursorPos(obj, 0);
              obj.scrollLeft = 0;
            }
            else if (obj.createTextRange)
            {
              // Se la cella contiene qualcosa ed il cursore e' all'inizio, elimino l'eventuale selezione
              //***********************************************
              // NO per le Combo 000963-2015
              if (this.ControlType != 3 && this.Text!="" && ((this.NumRows==1 && getCursorPos(obj)<=0) || (this.NumRows>1 && RD3_Glb.getTextAreaSelection(obj, false)<=0)))
              {
                //var t = obj.createTextRange();
                //t.collapse(false);
                //t.select();
              }
            }
          }
        }
        //
        // Annullo le proprieta' della selezione, sia che l'ho gestita o meno
        RD3_DesktopManager.SelFld = null;
        RD3_DesktopManager.SelSt = null;
        RD3_DesktopManager.SelEn = null;
      }
      else if (evento && (RD3_Glb.IsChrome() || RD3_Glb.IsSafari()))  // Gestiamo il cursore solo se c'e' l'evento: abbiamo visto che l'evento arriva solo nel caso di navKey, e non nel caso di Mouse click
      {
        // Se stiamo dando il fuoco ad un'input readonly o non abilitato su safari o chrome porto il cursore all'inizio del campo
        setCursorPos(obj, 0);
        obj.scrollLeft = 0;
      }
    }
    else if (this.ControlType==101 && !RD3_ServerParams.UseIDEditor)     // CKEDITOR
    {
      if (RD3_DesktopManager.SelFld && RD3_DesktopManager.SelFld == this.ParentField.Identifier)
      {
        var nm = this.ParentField.Identifier + (this.InList ? ":lcke" : ":fcke" );
        var inst = CKEDITOR.instances[nm];
        //
        var start = parseInt(RD3_DesktopManager.SelSt);
        var end = parseInt(RD3_DesktopManager.SelEn);
        //
        inst.focus();
        //
        // Su IE
        if (RD3_Glb.IsIE())
        {
          inst.document.$.selection.empty();
          var range = inst.document.$.selection.createRange();
          range.moveStart('character', start-1);
          range.moveEnd('character', end-1);
          range.select();
        }
        else // Altri
        {
          var startPos = new Object();
          startPos.node = inst.document.$.body;
          startPos.currPos = start-1;
          //
          var endPos = new Object();
          endPos.node = inst.document.$.body;
          endPos.currPos = end;
          //
          var p1 = this.SearchRangeNode(startPos);
          var p2 = this.SearchRangeNode(endPos);
          //
          var range = inst.document.$.createRange();
          range.setStart(p1.node, p1.pos);
          range.setEnd(p2.node, p2.pos);
          //
          var sel = inst.document.getWindow().$.getSelection();
          sel.removeAllRanges();
          sel.addRange(range);
        }
      }
      //
      // Annullo le proprieta' della selezione, sia che l'ho gestita o meno
      RD3_DesktopManager.SelFld = null;
      RD3_DesktopManager.SelSt = null;
      RD3_DesktopManager.SelEn = null;
    }
    else if (this.ControlType==101 && RD3_ServerParams.UseIDEditor)     // IDEditor
    {
      this.IntCtrl.Focus();
    }
    //
    // Convinco il KB manager a non controllare il fuoco per un po'
    // visto che l'ho appena dato io con successo all'elemento
    RD3_KBManager.CheckFocus = false;
    //
    // Se c'e' un timer di fuoco pendente, lo mangio.. ho gia' dato il fuoco a chi di dovere!
    if (RD3_KBManager.FocusFieldTimerId)
    {
      window.clearTimeout(RD3_KBManager.FocusFieldTimerId);
      RD3_KBManager.FocusFieldTimerId = 0;
    }
    //
    return true;
  }
  catch(ex)
  {
    RD3_KBManager.CheckFocus = true;
    //
    return false;
  }
}

//****************************************************
// 000151-2016 Problema del copia-incolla di valori decimali con virgola. Da togliere nella versione successiva alla 15.0
function hk(evento,forcekey)
{
  var ok,ch; 
  var keyCode;
  var altKey;
  var ctrlKey;
  //
  if (evento!=null)
  {
    keyCode = window.event ? evento.keyCode : evento.which;
    altKey = evento.altKey;
    ctrlKey = evento.ctrlKey;
  }
  //
  ok = false;
  ch=keyCode;
  //
  if (forcekey!=undefined)
  {
    ch = forcekey;
    altKey=false;
    ctrlKey=false;
  }
  else
  {
    glbVirtualPos = -1;
  }
  //
  if (RD3_Glb && RD3_Glb.IsIphone())
  {
    // Conversione di alcuni tasti che sull'iphone sono diversi
    // dall'ipad
    if (ch>=44 && ch<=47)
      ch+=144;
    if (ch==127)
      ch = 8;
  }
  //
  // Su Firefox i tasti + e - hanno keyCode differenti
  if (RD3_Glb && RD3_Glb.IsFirefox())
  {
    if (ch == 173)
      ch = 109;
    if (ch == 171)
      ch = 107;
  }
  //
  // Gestione tastierino num.
  if (ch>=96 && ch<=105)
    ch-=48;
  if (ch>=107 && ch<=110)
    ch+=80;
  //
  if (ch==17 || ch==18 || altKey)
    return true; // Tasto CTRL/ALT, lascio premere
  //
  if (ctrlKey && ch>=64 && ch<=95)
  {
    var s=String.fromCharCode(ch);
    if (s=="C" || s=="X" || s=="V")
    {
      // in questo caso, seleziono TUTTO il campo...
      if (document.all)
        glbObjInput.createTextRange().select();
      else 
      {
        glbObjInput.selectionStart=0;
        glbObjInput.selectionEnd=glbObjInput.value.length;
      }
    }
    if (glbMaskType=="N" && s=="V") {
      window.setTimeout(function () {
      if (!glbObjInput)
        return;
      //
      // Per prima cosa eseguiamo il trim
      if (glbObjInput.value)
        glbObjInput.value = glbObjInput.value.trim();
      //
      // Verifichiamo se il valore e' un numero, se non lo e' svuotiamo il campo
      var v = glbObjInput.value;
      //********************************************************
      if (glbDecSep === ",") {
        // Il parseFloat non prende bene il separatore decimale con la , ...
        v = v.replace(/\./g, "");
        v = v.replace(",", ".");
      }
      //********************************************************
      try {
       if (!((v - parseFloat(v) + 1) >= 0))
         glbObjInput.value = "";
      }
      catch(ex) {
        glbObjInput.value = "";
      }
      }, 0);
    }
    //
    return true; // Ctrl-Lettera, lascio passare
  }
  //
  if (ch == 8)
    deleteChars(-1);
  else if (ch == 46)
    deleteChars(0);
  else if (ch >=33 && ch<=40)
    ok = true;
  else if (ch == 9 || ch==13)
    ok = true;
  else
    insertChar(glbObjInput, ch, glbMask, glbMaskType);
  return ok;
}