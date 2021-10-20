// ***************************************************
// Aggiusta l'HTML prodotto dal server in modo che sia
// adatto al rendering differenziale
// ***************************************************
function ChangeTarget()
{
	var f1 = GetFrame(window.parent.frames,"Main");
	var browser = (document && document.all) ? 1 : 2;
	//
	// Chiamo il changetarget sempre dal lato MAIN...
	if(window.name=="RD")
	{
		if (f1!=undefined && f1.ChangeTarget!=undefined)
		  f1.ChangeTarget();
		return ;
	}
	//
	var oldst=window.defaultStatus;
	//	
	var f=GetFrame(window.parent.frames,'RD').document.getElementById('theform');
	var rdn = IsUndefined(f);
	//
	// calcolo elementi da aggiornare
	if (chtall)
	{
		cht = new Array();
		cht[0]=document;
	}
	//
	t1=new Date();
	var UseFK = UseFK;
	var UseDB = UseDBLCLK;
	//
	var j=0,zz=0;
	var zt = cht.length;
	for (j=0;j<zt;j++)
	{
		var c,z;
		try
		{
			c = cht[j].all ? cht[j].all : GetAll(cht[j]);
			z = c.length;
		}
		catch(ex)
		{
			z=0;
		}
		//
  	// Reset del modulo di D&D
  	if (cht[j]==document || cht[j].id=="ActiveForm")
    	ResetDD('');
    else
    {
      // Risalgo la catena del DOM finchè trovo un oggetto il cui id comincia con 'F'
      var oo=cht[j];
      while (oo && (oo.id==undefined || oo.id.substring(0,1)!='F'))
        oo = oo.parentNode;
      //
      // Se è della forma F#I# allora è un FrameContainer
      if (oo && oo.id.indexOf('I')>0)
        ResetDD('F' + oo.id.substring(oo.id.indexOf('I')+1) + 'B');
    }
    //
		var i;
		zz=zz+z;
		for(i = 0; i < z; i++)
		{
			var o=c[i];
			var tn=o.tagName;
			var ak = "";
			try
			{
				ak=o.getAttribute("isactive");
			}
			catch(ex) {}
			//
			switch (tn)
			{
				case 'A': // Hyperlink
				case 'AREA': // Mappa di zone cliccabili
				//
				// Tutti gli hyperlink che non aprono un altra finestra (target="")...
				if (o.target=='' || o.target=='RD')
				{
					var anj = o.href.substr(0,4)!='java';
					if (rdn) // In questo caso il frame RD non è ancora stato inizializzato
					{
						if (anj && ak!="no") // Se non ha un java script lo redirigo sull'altro frame
							o.target = 'RD';
					}
					else
					{
						// Il frame RD è già stato inizializzato, allora uso l'RD completo
						if (anj && ak!="no")
						{
							var s=o.href;
							var p=s.indexOf('?');
							o.href='javascript:pb("'+s.substr(p+1)+'")';
							AddFKTip(o);
						}
					}
					//
					// Per D&D di nodi di alberi
					if (ak=='')
					{
						o.setAttribute("onmousedown", (browser==1)? new Function("onmousedown", "return TreeMouseDown(event)") : "return TreeMouseDown(event)");
						o.setAttribute("ondragstart", (browser==1)? new Function("ondragstart", "return TreeDragStart(event)") : "return TreeDragStart(event)");
						o.setAttribute("ondragenter", (browser==1)? new Function("ondragenter", "return TreeDragOver(event)")  : "return TreeDragOver(event)");
						o.setAttribute("ondragover",  (browser==1)? new Function("ondragover",  "return TreeDragOver(event)")  : "return TreeDragOver(event)");
						o.setAttribute("ondragend",   (browser==1)? new Function("ondragend",   "return TreeDragEnd(event)")   : "return TreeDragEnd(event)");
						o.setAttribute("ondrop",      (browser==1)? new Function("ondrop",      "return TreeDrop(event)")      : "return TreeDrop(event)");
					}
					else
					{
					  if (o.onclick==undefined)
					  	o.setAttribute("onclick", (browser==1)? new Function("onclick", "return ClickHandler(event)") : "return ClickHandler(event)");
					}
				}
				break;
				
				case 'INPUT':
				{
					var ot=o.type;
					if (ot=='image' || ot=='submit')
					{
					  o.setAttribute("onclick", (browser==1)? new Function("onclick", "return ClickHandler(event)") : "return ClickHandler(event)");
						AddFKTip(o);
					}
					else if (ot=='radio' || ot=='checkbox')
					{
					  o.setAttribute("onclick", (browser==1)? new Function("onclick", "return ChangeHandler(event)") : "return ChangeHandler(event)");
					  o.setAttribute("onkeypress", (browser==1)? new Function("onkeypress", "return KeyHandler(event)") : "return KeyHandler(event)");
						//
						// Questo è necessario anche per i radio
						// così è possibile comunicare correttamente
						// al server quale oggetto era attivo
						if (o.onfocus==null)
							o.setAttribute("onfocus", (browser==1)? new Function("onfocus", "return FocusHandler(event)") : "return FocusHandler(event)");
						if (o.onblur==null)
							o.setAttribute("onblur", (browser==1)? new Function("onblur", "return BlurHandler(event)") : "return BlurHandler(event)");
					}
					else if (ot=='hidden')
					{
						if (o.id.substr(0,3)=="FCK") // Registro subito che è cambiato!
							RegChgObj(o);
					}
					else
					{
						//o.onkeypress=KeyHandler;
						o.setAttribute("onchange", (browser==1)? new Function("onchange", "return ChangeHandler(event)") : "return ChangeHandler(event)");
					  o.setAttribute("onkeypress", (browser==1)? new Function("onkeypress", "return KeyHandler(event)") : "return KeyHandler(event)");
						if (UseDB)
							o.setAttribute("ondblclick", (browser==1)? new Function("ondblclick", "return DblHandler(event)") : "return DblHandler(event)");
						if (o.name!='cmd')
						{
							if (o.onfocus==null)
								o.setAttribute("onfocus", (browser==1)? new Function("onfocus", "return FocusHandler(event)") : "return FocusHandler(event)");
							if (o.onblur==null)
								o.setAttribute("onblur", (browser==1)? new Function("onblur", "return BlurHandler(event)") : "return BlurHandler(event)");
						}
					}
				}
				break;
				
				case 'FORM':
				o.setAttribute("onkeypress", (browser==1)? new Function("onkeypress", "return FormKeyHandler(event)") : "return FormKeyHandler(event)");
				if (o.action.substr(0,4)!='java')
			  {
					var s=o.action;
					var p=s.indexOf('?');
					s=s.substr(p+1);
					if (rdn || o.encoding=='multipart/form-data') // Uploading
					{
						o.target = 'RD';
						if (o.encoding=='multipart/form-data')
						{
							// Segnalo che non devo effettuare l'evento di unload
							GetFrame(window.parent.frames,'Main').WasClosed=1;
							GetFrame(window.parent.frames,'RD').WasClosed=1;
						}
					}
					else
					{
						o.action='javascript:pb("'+s+'")';
					}
				}
				break;
				
				case 'TEXTAREA':
					o.setAttribute("onchange", (browser==1)? new Function("onchange", "return ChangeHandler(event)") : "return ChangeHandler(event)");
					o.setAttribute("onfocus", (browser==1)? new Function("onfocus", "return FocusHandler(event)") : "return FocusHandler(event)");
					o.setAttribute("onblur", (browser==1)? new Function("onblur", "return BlurHandler(event)") : "return BlurHandler(event)");				
				break;
				
				case 'SELECT':
					o.setAttribute("onchange", (browser==1)? new Function("onchange", "return ChangeHandler(event)") : "return ChangeHandler(event)");
					o.setAttribute("onfocus", (browser==1)? new Function("onfocus", "return FocusHandler(event)") : "return FocusHandler(event)");
					o.setAttribute("onblur", (browser==1)? new Function("onblur", "return BlurHandler(event)") : "return BlurHandler(event)");				
					o.setAttribute("onkeypress", (browser==1)? new Function("onkeypress", "return KeyHandler(event)") : "return KeyHandler(event)");					
					if (ak=="R")
						RegChgObj(o);
				break;			
				
				case 'DIV': // DIV di book (D&D and Transform)
					if (ak!=undefined && ak.indexOf('A')!=-1)
					  AddDrag(o);
					if (ak!=undefined && ak.indexOf('O')!=-1)
					  AddDrop(o);
					if (ak!=undefined && ak.indexOf('T')!=-1)
					  AddTrans(o);
				break;
			}
		}
	}
	//
	chtall = rdn;
	cht = new Array();
	t2=new Date();
	//
	// Fine della Reset D&D
	EndResetDD();
	//
	if ((zz>0 && t2-t1>99) || false)
	{
		var n=zz/(t2-t1);
		window.defaultStatus=oldst+", NC="+zz+", TC:"+(t2-t1)+", PI:"+n.toFixed(0);
	}
	else
	{
		window.defaultStatus=oldst;
	}
	//
	// Al termine abilito i click!
	//EnableClick=1;
}

// ****************************************************
// Restituisce un frame per nome (cross-browser)
// ****************************************************
function GetFrame(af, nome)
{
  var fr = null;
	if (document && document.all)
		fr = af[nome];
	else
	{
    for ( i = 0; i< af.length; i++ ) 
    {
			var s=af[i].name;
			if (s.indexOf(nome)!=-1) 
			{
				fr = af[i];
				break;
			}
		}
	}
	//
	return (fr) ? fr : window;
}

// ***************************************************
// Gestisco pressione tasto enter su form
// ***************************************************
function FormKeyHandler(evento)
{
	var f1 = GetFrame(window.parent.frames,"Main");
	var eve = f1.event ? f1.event : evento;
	var code = evento.keyCode? evento.keyCode : evento.charCode;
	var ok = true;
	//
	// enter
	if (code==13)
	{
		ok = false;
		try
		{
			if (document.all)
			{
				if (f1.document.activeElement.tagName=='TEXTAREA')
					ok=true; // E' possibile premere ENTER su Text Area
			}
			else
			{
				if (evento.target.tagName=='TEXTAREA')
					ok=true; // E' possibile premere ENTER su Text Area
			}
		}
		catch(ex)
		{
		}
	}
	// tab
	if (code==9)
	{
  	try
  	{
  		if (eve.ctrlKey)
  		{
  		  // CTRL-TAB scorre la form list
  		  var frmList = f1.document.getElementById('FormList').getElementsByTagName('TD');
  		  if (frmList.length>1)
  		  {
  			  var ss = frmList.length;
  			  var foundSel = false;
  			  for (var giro=0; giro<2; giro++)
  			  {
  				  for (var i=0; i<ss; i++)
  				  {
  				    var frm = frmList[i];
  				    //
  				    // Prima cerco quello selezionato
  				    if (frm.className=='FLSelItem') 
  				      foundSel = true;
  				    //
  				    // Se ho trovato quello selezionato prendo il prossimo Item
  				    if (foundSel && frm.className=='FLItem')
  				    {
  				      var lnk = frm.getElementsByTagName('A')[0];
  				      f1.ActiveObjects[f1.document]=lnk;
  				      lnk.click();
    					  cancel = true;
    					  break;
  				    }
  				  }
  				  //
  				  // Se ho già cliccato... ho finito
  				  if (cancel)
  					  break;
  				  //
  				  // Se non l'ho ancora trovato... al secondo giro mi va bene la prima form che trovo
  				  // (forse quella selezionata è l'ultima della lista)
  				  foundSel = true;
  				}
  			}
  		}
  		else
  	  {
  			ChangeActiveColumn((eve.shiftKey)?-1:1);
  			cancel=true;
  			if (attobj.onkeydown==null || attobj.onkeydown.toString().indexOf("idro")==-1)
  				selall=true;
  		}
  	}
  	catch(ex)
  	{
  		// Non lo gestisco
  		return true;
  	}
  }
  //
	return ok;
}

function SpostaADestra(obj)
{
  try
  {
    var div = document.getElementById('pagediv');
    var forms = div.getElementsByTagName('form');
    //
    //
    forms[0].className = 'pageform2';
  }
  catch(e) {}
}

// ***************************************************
// Gestione complessiva del fuoco fra campi
// ***************************************************
function FocusHandler(evento)
{
	var f1 = GetFrame(window.parent.frames,"Main");
	LastActiveElement = window.event ? f1.event.srcElement : evento.target;
	f1.ActiveObjects[f1.document] = LastActiveElement;
	LastActiveControl = LastActiveElement;
	var s=LastActiveElement.onkeydown+"";
	if (s.indexOf("idro")<=0 && LastActiveElement.tagName=="INPUT" && LastActiveElement.type!="radio")
	{
	  if (HLColorEDFlt!="")
	  {
	    LastBkFlt=LastActiveElement.style.filter;
	    LastActiveElement.style.filter=HLColorEDFlt;
	  }
		else if (HLColorED!="" && HLColorED!="transparent")
		{
			LastBkCol=LastActiveElement.style.backgroundColor;
			LastActiveElement.style.backgroundColor=HLColorED;
			//
			// Salvo anche il filtro... altrimenti copre il colore di background
	    LastBkFlt=LastActiveElement.style.filter;
	    LastActiveElement.style.filter="";
		}
		else
		{
			btw=GetStyleProp(LastActiveElement,"borderTopWidth");
			bbw=GetStyleProp(LastActiveElement,"borderBottomWidth");
			blw=GetStyleProp(LastActiveElement,"borderLeftWidth");
			brw=GetStyleProp(LastActiveElement,"borderRightWidth");
			LastActiveElement.style.borderWidth=2;
			if (f1.StrictHTML && LastActiveElement.type!="checkbox")
			{
			  LastActiveElement.style.pixelWidth -= 2;
			  LastActiveElement.style.pixelHeight -= 2;
			}
		}	
	}
	if (f1.t2==null || (new Date()).getTime()-f1.t2.getTime()>1000)
	{
		if (LastActiveElement.title!="")
			window.defaultStatus = LastActiveElement.title;
		else
		{
			// Tento di recuperare il title dell'header...
			try
			{
				var cp = LastActiveElement.name.indexOf("C");
				var rp = LastActiveElement.name.indexOf("R");
				var s = LastActiveElement.name.substr(0,rp); s = s.substr(0,cp) + "H" + s.substr(cp+1);
				var obj = f1.document.getElementById(s);
				window.defaultStatus = obj.title;
			}
			catch(ex) { }
		}
	}
	//
	// Gestione cambio riga automatico
	f1.GetActiveFrame(LastActiveElement.name);
  var o = LastActiveElement;
  while (o && o.id != "PC"+f1.ActiveFrame)
  {
    o = o.parentElement;
  }
  var pc = o;
	var attr = (pc==null ? null : pc.getAttribute("actrow"));
	if (f1.ActiveRow>=0 && attr!=null && f1.ChangeRowDelay>0)
	{
		if (f1.ChangeRowID!=0)
			f1.clearTimeout(f1.ChangeRowID);
		if (attr!=f1.ActiveRow)
		{
			f1.ChangeRowID = f1.setTimeout("ChangeRowHandler()",f1.ChangeRowDelay);
		}
	}
}

// ****************************************************
// Aggiorna la riga attiva di un pannello
// ****************************************************
function UpdateActRow(NumPan, AttR)
{
	var f1 = window;
	//
	try
	{
	  f1 = GetFrame(window.parent.frames,"Main");
	}
	catch(ex) {}
	//
	var f = f1.document.getElementById("ActiveForm");
	var obj = f.getElementsByTagName("div");
	var pc = null;
	var i = 0;
	var l = obj.length;
	for (i = 0; i < l; i++)
	{
	  if (obj[i].id == "PC"+NumPan)
	  {
	    pc = obj[i];
  	  break;
	  }
	}
  //
  if (pc)
    pc.setAttribute("actrow", AttR);
}

// *****************
// chiude l'applicazione o il wizard se dentro IN.DE
// *****************
function Logoff(INDE)
{
  if (INDE)
    setTimeout("LogoffINDE();", 200);
  //
  pb('WCI=IWLogoff');
}

function LogoffINDE()
{
  try
  {
    var x = new ActiveXObject("instdev.pgidx");
    x.idAction(10000);
  }
  catch (e) {}
}


// ***************************************************
// Aggiorna le altezza della tabella
// ***************************************************
function ResizeTables()
{
	var f1 = window;
	//
	try
	{
		f1 = GetFrame(window.parent.frames,"Main");
	}
	catch(ex) {}
	//
	// Resetto altezza flbottom: serve per ricalcolare l'altezza complessiva del body
	var flb = f1.document.getElementById("FLBottom");
	if (flb!=undefined)
		flb.style.height=0;
	//
	var ext = f1.document.getElementById("ExtTable");
	ext.style.height = 1 + "px"; // resetto altezza ext per eliminare scrollbar inutili
	//
	var wel = f1.document.getElementById("welcome");
	//
	var hdr = f1.document.getElementById("hdr");
	var hdrh= 0;
	var hdrw= 0;
	if (hdr!=undefined && hdr.innerHTML!="")
	{
		hdrh = hdr.offsetHeight;
		hdrw = hdr.offsetWidth;
	}
	//
	var rt = f1.document.getElementById("RightTable");
	if (rt==undefined)
		rt = f1.document.getElementById("ActiveForm");
	//
	var hbs = 0;
	//
	if (wel==undefined)
	{
		hbs=f1.document.body.scrollHeight;
		if (f1.StrictHTML)
			hbs = rt.offsetHeight+hdrh;
	}
	var hbo = f1.document.body.offsetHeight;
	if (f1.StrictHTML)
		hbo = f1.document.documentElement.offsetHeight;
	//
	// Mozilla
	if (!document.all)
	{
		hbo = f1.innerHeight;
	}
	//
	var hb  = (hbs>hbo)?hbs:hbo;
	var hh = hdrh;
	//
	if (ext.offsetWidth>hdrw && hbs<=hbo)
	{
		f1.document.body.style.height = (f1.document.body.offsetHeight - 20)+"px";
		hb -= 20;
	}
	if (hb-hh-6>0)
		ext.style.height = (hb-hh-6)+"px";
	//
	if (f1.StrictHTML)
		f1.document.body.style.width = f1.document.documentElement.clientWidth+"px";
	//
	if (flb!=undefined)
	{
		try
		{
			flb.style.height = (hb-hh-6-(f1.document.getElementById("Menu").offsetHeight-flb.offsetHeight)-(f1.StrictHTML?16:0)) - 4 + "px";
		}
		catch(ex) {}
	}
	//
	var vali = f1.document.getElementById("valImg");
	if (vali!=undefined)
		vali.style.visibility = "visible";
	//
	if (wel!=undefined)
		wel.height = (wel.parentNode.offsetHeight-5)+"px";
}