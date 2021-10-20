function istouch()
{
  var s = navigator.userAgent;
  return s.indexOf("iPad")>-1 || s.indexOf("iPhone")>-1 || s.indexOf("Android")>-1;
}

var lastOrient;
function changeorient(orient)
{
  var dev = document.getElementById("dev");
  var app = document.getElementById("app");
  var res = document.getElementById("reset");
  var car = document.getElementById("carurl");
  var deb = document.getElementById("debug");
  var cqr = document.getElementById("carqr");
  var bak = document.getElementById("back");
  var md = document.getElementById("mdplatform");
  var ios = document.getElementById("iosplatform");
  //
  if (CaravelUrl != "")
    car.style.display = "";
  //
  // If it is already a touch device, run redirect
  if (istouch())
  {
    window.location.href = LoginURL;
    return;
  }
  else
  {
    if (app.src=="")
      app.src = LoginURL;
  }
  //
  if (orient==undefined)
  {
    if (window.location.search.length>1)
      orient = window.location.search.substring(1,2);
    else
      orient = "h";
  }
  //
  if (orient=="t")
    orient = (lastOrient=="h"?"v":"h");
  if (lastOrient!=orient)
  {
    if (orient=="h")
    {
      dev.src = simImgHoriz;
      app.className = "ho";
      //
	  res.style.left = simWidthHoriz;
      res.style.top = simHeightHoriz;
      //
	  cqr.style.left = simCarQRLeftHoriz;
      cqr.style.top = simCarQRTopHoriz;
	  //
	  car.style.left = simCarUrlLeftHoriz;
	  car.style.top = simCarUrlTopHoriz;
	  //
	  deb.style.left = simDebugLeftHoriz;
	  deb.style.top = simDebugTopHoriz;
      //
      ios.style.left = simIosLeftHoriz;
      ios.style.top = simIosToptHoriz;
      //
      md.style.left = simAndroidLeftHoriz;
      md.style.top = simAndroidToptHoriz;
      if (bak)
      {
        bak.style.left = simBackLeftHoriz;
        bak.style.top = simBackTopHoriz;
      }
    }
    else
    {
      dev.src = simImgVert;
      app.className = "vo";
	  //
      res.style.left = simWidthVert;
      res.style.top = simHeightVert;
      //
	  cqr.style.left = simCarQRLeftVert;
      cqr.style.top = simCarQRTopVert;
	  //
	  car.style.left = simCarUrlLeftVert;
	  car.style.top = simCarUrlTopVert;
	  //
	  deb.style.left = simDebugLeftVert;
	  deb.style.top = simDebugTopVert;
      //
      ios.style.left = simIosLeftVert;
      ios.style.top = simIosTopVert;
      //
      md.style.left = simAndroidLeftVert;
      md.style.top = simAndroidTopVert;
      if (bak)
      {
        bak.style.left = simBackLeftVert;
        bak.style.top = simBackTopVert;
      }
    }
    lastOrient = orient;
    //
    dev.style.display = "";
    if (bak)
      bak.style.display = "";
  }
  //
  if (CaravelUrl!="")
  {
    try
    {
      showcarQR();
    }
    catch (ex) {}
  }
  //
  if (window.localStorage.getItem("platform") === "ios")
  {
    ios.src="images/apple-selected.png";
    ios.style.opacity = 1;
	md.src="images/android.png";
    md.style.opacity = 0.40;	
  }
  else 
  {
	ios.src="images/apple.png";
    ios.style.opacity = 0.40;
    md.src="images/android-selected.png";
    md.style.opacity = 1;
  }
}

function opendebug()
{
  var app = document.getElementById("app");
  if (app.contentWindow.RD4_Enabled)
    var ev = new app.contentWindow.IDEvent("IWDTT", "", null, app.contentWindow.RD3_Glb.EVENT_ACTIVE);
  else
  {
    var url = LoginURL+"?WCI=IWDTT&WCE=";
    window.open(url, "debug");
  }
}

function resetapp()
{
  var app = document.getElementById("app");
  app.contentWindow.RD3_DesktopManager.WebEntryPoint.OnCloseApp();
  //
  // Force page reload
  top.location.reload(true);
}    

function backbutton()
{
  var app = document.getElementById("app");
  app.contentWindow.RD3_DesktopManager.WebEntryPoint.OnBackButton();
}

function showcarurl()
{
  alert(CaravelUrl);
}

var req = null;
function showcarQR()
{
  // If the web app is on www.progamma.com or www.instantdeveloper.com web site, check with ServiceDirectory
  var myurl = window.location.href.toLowerCase();
  if (req == null && (myurl.indexOf("www.progamma.com") != -1 || myurl.indexOf("www.instantdeveloper.com") != -1))
  {
    var svcurl = "http://directory.progamma.com/ServiceDirectory.aspx?WCI=OWA&WCE=SVCDATA&DEV=1&URL=" + myurl;
    req = new XMLHttpRequest();
    req.reqType = 1;      // Service Directory Query
    req.onreadystatechange = showcarQR_OnResponse;
    req.open("GET", svcurl, true);
    req.send();
    return;
  }
  //
  // Caravel QRCode
  var url = "https://chart.googleapis.com/chart?cht=qr&chs=60x60&chl=" + encodeURIComponent(CaravelUrl) + "&chld=L|1";
  req = new XMLHttpRequest();
  req.url = url;
  req.reqType = 3;        // Google QRCode
  req.onreadystatechange = showcarQR_OnResponse;
  req.open("GET", url, true);
  req.responseType = "blob";
  req.send();
}
function showcarQR_OnResponse()
{
  // If response completed
  if (req && req.readyState == 4)
  {
    // If request to ServiceDirectory
    if (req.reqType == 1 || req.reqType == 2)
    {
      // If the service directory knows the service, use its bundle
      var found = false;
      if (req.responseXML && req.responseXML.firstChild)
      {
        for (var i=0; i<req.responseXML.firstChild.childNodes.length; i++)
        {
          var n = req.responseXML.firstChild.childNodes[i];
          if (n.nodeType == 1 && n.getAttribute("Bundle"))
          {
            CaravelUrl = n.getAttribute("Bundle");
            found = true;
            break;
          }
        }
      }
      //
      // If not found
      if (!found && req.reqType == 1)
      {
        // Before giving up, try with the other one (www.instantdeveloper.com or www.progamma.com)
        var myurl = window.location.href.toLowerCase();
        var svcurl = "http://directory.progamma.com/ServiceDirectory.aspx?WCI=OWA&WCE=SVCDATA&DEV=1&URL=";
        if (myurl.indexOf("www.progamma.com") != -1)
          svcurl += myurl.replace("www.progamma.com", "www.instantdeveloper.com");
        else
          svcurl += myurl.replace("www.instantdeveloper.com", "www.progamma.com");
        //
        req = new XMLHttpRequest();
        req.reqType = 2;      // Service Directory Query
        req.onreadystatechange = showcarQR_OnResponse;
        req.open("GET", svcurl, true);
        req.send();
        return;
      }
      //
      // Now, show the QRCode image
      showcarQR();
    }
    else if (req.reqType == 3) // Request for QRCode
    {
      var img = document.getElementById("carqr");
      img.src = (window.URL ? URL.createObjectURL(req.response) : req.url);
      img.style.display = "";
    }
  }
}

function changePlatform(platform) 
{
  // Scrivo la piattaforma da usare nel localstorage
  try {
    if (window.localStorage)
      window.localStorage.setItem("platform", platform);
    //
    var app = document.getElementById("app");
    app.contentWindow.RD3_DesktopManager.WebEntryPoint.OnCloseApp();
    //
    // Force page reload
    top.location.reload(true);
  }
  catch(ex) {}
}
