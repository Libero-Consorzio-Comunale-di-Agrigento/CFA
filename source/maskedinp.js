// ************************************
// Pro Gamma Instant Developer
// masked input client library
// (c) 1999-2003 Pro Gamma Srl
// all rights reserved
// www.progamma.com
// ***********************************

var glbDecSep  = ",";
var glbThoSep  = ".";
var glbPrompt  = "_";
var glbMask    = "";
var glbMaskType= "";
var glbObjInput;
var glbInitValue;
var glbVirtualPos = -1;

function cleardebug()
{
  //document.getElementById("debug").innerHTML = "";
}

function debug(s)
{
  //document.getElementById("debug").insertAdjacentHTML("beforeEnd",s);
  //document.getElementById("debug").insertAdjacentHTML("beforeEnd","<BR>");
}

function getCursorPos(objInput)
{
  if (glbVirtualPos>-1)
    return glbVirtualPos;
  //
  if( typeof(objInput.selectionStart) != "undefined" )
    return objInput.selectionStart;
  else 
  {
    try
    {
      var t1 = document.selection.createRange();
      var t2 = objInput.createTextRange();
      var i1 = 0;
      while (t2.compareEndPoints("StartToStart",t1))
      {
        i1++;
        t2.moveStart("character");
      }
      return i1;
    }
    catch (ex)
    {
      // In IE non si riesce a sapere la posizione del cursore nelle TEXTAREA
      return -1;
    }
  }
}

function setCursorPos(objInput, newpos)
{
  if (glbVirtualPos>-1)
  {
    if (newpos<0)
      newpos=0;
    glbVirtualPos = newpos;
    return;
  }
  //
  try
  {
    if( typeof(objInput.selectionStart) != "undefined" )
    {
      objInput.select();
      objInput.selectionStart=newpos;
      objInput.selectionEnd=newpos;
    }
    else
    {  
      var t = objInput.createTextRange();
      t.move("character",newpos);
      t.select();
    }
  }
  catch (ex) {}
}

function setToken(ris,mask,token,value)
{
  var s = value.toString();
  while (s.length<token.length)
    s = "0" + s;
  s = s.substring(0,token.length);
  var i = mask.indexOf(token);
  if (i>-1)
  {
    ris = ris.substr(0,i) + s + ris.substr(i + token.length);
  }
  return ris;
}

function getToken(ris,mask,token)
{
  var i = mask.indexOf(token);
  var s;
  if (i==-1)
    return i;
  else
  {
    s = ris.substr(i,token.length);
    while (s.length > 0 && s.charAt(0)=="0")
      s = s.substr(1);
    return parseInt(s);
  }
}

function unmask(s)
{
  var r,i,c;
  i=0;
  r="";
  while (i<s.length)
  {
    c=s.charAt(i);
    if ((c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z') || c=='-' || c==glbDecSep)
    {
      r+=c;
    }
    i++;
  }
  return r;
}

function formatNumber(s,mask)
{
  var rdec, rint, segno;
  var decm, decv;
  //
  // Calcolo segno
  segno = "";
  if (s.length>0 && s.charAt(0)=="-")
  {
    segno = "-";
    s=s.substr(1);
  }
  //
  // Estraggo 0 iniziali
  // Posso arrivare fino primo numero dopo la virgola
  var limite=s.length-1;
  decm = s.indexOf(glbDecSep);
  if (decm>-1)
    limite=decm-1;
  //
  decm = 0;
  while (decm<limite && s.charAt(decm)=="0")
    decm++;
  if (decm>0)
    s=s.substr(decm);
  //
  // Applico maschera decimale
  decm = mask.indexOf(glbDecSep);
  decv = s.indexOf(glbDecSep);
  rdec = "";
  rint = "";
  // 
  while (decm>-1 && decm<mask.length)
  {
    var c=mask.charAt(decm);
    if (c=="0" || c=="#")
    {
      if (decv>-1 && decv<s.length-1)
        rdec += s.charAt(++decv);
      else if (c=="0") 
        rdec += c;
      else
        break; // Non seguo pi� la maschera!
    }
    else
    {
      rdec += c;
    }
    decm++;
  }
  //
  // Applico maschera intera
  decm = mask.indexOf(glbDecSep);
  decv = s.indexOf(glbDecSep);
  if (decm==-1) decm = mask.length;
  decm--;
  if (decv==-1) decv = s.length;
  decv--;
  //
  while (decm>=0)
  {
    c=mask.charAt(decm);
    if (c=="0" || c=="#")
    {
      if (decv>=0)
        rint = s.charAt(decv--) + rint;
      else if (c=="0") 
        rint = c + rint;
      else
        break; // Maschera finita
    }
    else
    {
      rint = c + rint;
    }
    decm--;
  }
  //
  // Aggiustamenti finali
  //
  if (rint.length>0 && rint.charAt(0)==glbThoSep)
    rint = rint.substr(1);
  //
  // Se l'ultimo carattere � una "virgola" allora devo toglierlo
  if (rdec.length==1)
    rdec = "";
  //
  return segno + rint + rdec;
}

function isMaskToken(c, masktype)
{
  switch(masktype)
  {
    case 'D':
      if (c=='g' || c=='m' || c=='a' || c=='y' || c=='d' || c=='h' || c=='n' || c=='s')
        return true;
    break;
    
    case 'A':
      if (c=='a' || c=='A' || c=='#' || c=='&')
        return true;
    break;

    case 'N':
      if (c=='#' || c=='0')
        return true;
    break;
  }        
  return false;
}

function skipMaskChars(mask, attpos, masktype)
{
  var c;
  if (masktype!="N")
  {
    while (attpos<mask.length)
    {
      c = mask.charAt(attpos);
      if (isMaskToken(c,masktype))
        return attpos;
      attpos++;
    }
  }
  return attpos;
}

function isNumber(ch)
{
  return (ch>=48 && ch<=57);
}

function isAlfa(ch)
{
  return (ch>=65 && ch<=90);
}

function checkValue(ris, attpos, mask, masktype)
{
  var c, i1, i2, vt, ok;
  
  c = mask.charAt(attpos);
  i1 = attpos;
  i2 = attpos;
  while (i1>=0)
  {
    if (mask.charAt(i1)!=c)
    {
      i1++;
      break;
    }
    i1--;
  }
  while (i2<mask.length)
  {
    if (mask.charAt(i2)!=c)
    {
      i2--;
      break;
    }
    i2++;
  }
  vt = parseInt(ris.substring(i1,i2+1));
  ok = true;
  switch(masktype)
  {
    case 'D':
      if (c=='g' || c=='d')
      {
        if (vt>31)
        {
          vt=31; ok = false;
        }
      }
      if (c=='m')
      {
        if (vt>12)
        {
          vt=12; ok = false;
        }
      }
      if (c=='h')
      {
        if (vt>23)
        {
          vt=23; ok = false;
        }
      }
      if (c=='n' || c=='s')
      {
        if (vt>59)
        {
          vt=59; ok = false;
        }
      }
    break;
  }
  if (!ok)
  {
    ris = ris.substr(0,i1) + vt.toString() + ris.substr(i2+1);
  }
  return ris;
}

function nextDay(ris,mask,offset)
{
  var Oggi = new Date();
  var i;
  //
  cleardebug();
  i=getToken(ris,mask,"yyyy");
  if (i>0)
  {
    Oggi.setFullYear(i);
    debug ("FullYear = "+i.toString());
  }
  else
  {
    i=getToken(ris,mask,"yy");
    if (i>0)
    {
      Oggi.setFullYear(i)%100;
      debug ("Year = "+i.toString());
    }
  }
  i=getToken(ris,mask,"aaaa");
  if (i>0)
  {
    Oggi.setFullYear(i);
    debug ("FullYear = "+i.toString());
  }
  else
  {
    i=getToken(ris,mask,"aa");
    if (i>0) 
    {
      Oggi.setFullYear(i)%100;
      debug ("Year = "+i.toString());
    }
  }
  i=getToken(ris,mask,"mm");
  if (i>0)
  {
    Oggi.setMonth(i-1);
    debug ("Month = "+i.toString());
  }
  i=getToken(ris,mask,"dd");        
  if (i>0)
  {
    Oggi.setDate(i+offset);
    debug ("Day = "+i.toString());
  }
  i=getToken(ris,mask,"gg");
  if (i>0)
  {
    Oggi.setDate(i+offset);
    debug ("Day = "+i.toString());
  }
  //
  i=getToken(ris,mask,"hh");
  if (i>=0) Oggi.setHours(i);
  i=getToken(ris,mask,"nn");
  if (i>=0) Oggi.setMinutes(i);
  i=getToken(ris,mask,"ss");
  if (i>=0) Oggi.setSeconds(i);
  //
  ris = setToken(ris, mask, "yyyy", Oggi.getFullYear());
  if (getToken(ris,mask,"yyyy")==0)
    ris = setToken(ris, mask, "yy", Oggi.getFullYear()%100);
  ris = setToken(ris, mask, "aaaa", Oggi.getFullYear());
  if (getToken(ris,mask,"aaaa")==0)
    ris = setToken(ris, mask, "aa", Oggi.getFullYear()%100);
  ris = setToken(ris, mask, "mm", Oggi.getMonth()+1);
  ris = setToken(ris, mask, "dd", Oggi.getDate());
  ris = setToken(ris, mask, "gg", Oggi.getDate());
  ris = setToken(ris, mask, "hh", Oggi.getHours());
  ris = setToken(ris, mask, "nn", Oggi.getMinutes());
  ris = setToken(ris, mask, "ss", Oggi.getSeconds());
  //
  return ris;
}

function insertChar(objInput, ch, mask, masktype)
{
  var ris,attpos,c,ok,l1,l2,dec,t1;
  //
  // Gli input type number non possono essere mascherati, non prendono bene i separatori
  if (objInput && objInput.tagName == "INPUT" && objInput.type == "number")
    return;
  //
  if (isNumber(ch) || isAlfa(ch))
  {
    if (typeof(objInput.selectionStart) != "undefined")
    {
      if (objInput.selectionStart!=objInput.selectionEnd)
        deleteChars(0);
    }
    else
    {
      t1 = document.selection.createRange();
      if (t1.text.length>0)
        deleteChars(0);
    }
  }
  //
  ris = objInput.value;
  attpos = getCursorPos(objInput);
  //
  attpos = skipMaskChars(mask, attpos, masktype);
  ok = false;
  //
  // Se il campo e' pieno ma il primo carattere e' un '-' accetto comunque la pressione del tasto
  if (attpos<mask.length || (attpos==mask.length && ris.length>0 && ris.charAt(0)=='-'))
  {
    c = mask.charAt(attpos);
    switch (masktype)
    {
      case 'D':
      if (isMaskToken(c,masktype))
      {
        if (isNumber(ch))
        {
          ris = ris.substr(0,attpos) + String.fromCharCode(ch) + ris.substr(attpos+1);
          ris = checkValue(ris, attpos, mask, masktype);
          ok = true;
        }
        if (ch==187 || ch==61) // + = today
          ris = nextDay(ris,mask,1);
        if (ch==189) // - = today
          ris = nextDay(ris,mask,-1);
      }
      break;
      
      case 'A':
      if (c=='&')
      {
        if (isAlfa(ch) || isNumber(ch))
        {
          ris = ris.substr(0,attpos) + String.fromCharCode(ch).toUpperCase() + ris.substr(attpos+1);
          ok = true;
        }
      }
      if (c=='a')
      {
        if (isAlfa(ch))
        {
          ris = ris.substr(0,attpos) + String.fromCharCode(ch).toLowerCase() + ris.substr(attpos+1);
          ok = true;
        }
      }
      if (c=='A')
      {
        if (isAlfa(ch))
        {
          ris = ris.substr(0,attpos) + String.fromCharCode(ch).toUpperCase() + ris.substr(attpos+1);
          ok = true;
        }
      }
      if (c=='#')
      {
        if (isNumber(ch))
        {
          ris = ris.substr(0,attpos) + String.fromCharCode(ch) + ris.substr(attpos+1);
          ok = true;
        }
      }
      break;
      
      case 'N':
        if (isNumber(ch))
        {
          dec=ris.indexOf(glbDecSep);
          if (attpos>dec && dec!=-1)
            ris = ris.substr(0,attpos) + String.fromCharCode(ch) + ris.substr(attpos+1);
          else if (ris.length<mask.length || (ris.length==mask.length && ris.charAt(0)=='-'))
            ris = ris.substr(0,attpos) + String.fromCharCode(ch) + ris.substr(attpos);
          else if (ris.length==mask.length && dec !== attpos)
            ris = ris.substr(0,attpos) + String.fromCharCode(ch) + ris.substr(attpos+1);
          //
          l1=ris.length;
          ris = formatNumber(unmask(ris),mask);
          l2=ris.length;
          attpos+=l2-l1+1;
        }
        if (ch==188 || ch==190)
        {
          dec=ris.indexOf(glbDecSep);
          if (dec>-1)
            attpos=dec+1;
          else
          {
            if (mask.indexOf(glbDecSep)>-1)
            {
              ris += glbDecSep;
              attpos=ris.length;
            }
          }
        }
        if (ch==189 || (ch==187 && RD3_Glb && RD3_Glb.IsIphone()))
        {
          if (ris.substr(0,1)=="-")
          {
            attpos--;
            ris = ris.substr(1);
          }
          else
          {
            attpos++;
            ris = "-" + ris;
          }
        }
      break;
    }
  }
  //
  if (ok)
  {
    attpos++;
    attpos = skipMaskChars(mask, attpos, masktype);
  }
  objInput.value = ris;
  setCursorPos(objInput, attpos);
  return false;
}

function deleteChar(objInput, attpos, offs, mask, masktype)
{
  var ris,dc,l1,l2,dec,decm;
  
  ris = objInput.value;
  if (attpos>=0 && attpos<ris.length)
  {
    dc = mask.substr(attpos,1);
    switch (masktype)
    {
      case "A":
        if (isMaskToken(dc,masktype))
          dc = glbPrompt;
      break;
      
      case "N":
        var ch = ris.charAt(attpos);
        dec=ris.indexOf(glbDecSep);
        if (dec==-1)
          dec = ris.length;
        decm=mask.indexOf(glbDecSep);
        if (decm==-1)
          decm = mask.length;
        dc = mask.substr(decm+(attpos-dec),1);
        if (attpos<dec || dec==-1)
        { 
          offs=0;
        }
        else
        {
          if (offs==-1 && dc=="#")
            offs=1;
        }
        l1=ris.length;
        if (isMaskToken(dc,masktype) || ch=="-")
          ris = unmask(ris.substr(0,attpos) + ris.substr(attpos+1));
        else
          ris = unmask(ris);
      break;
    }
    if (masktype!="N")
      ris = ris.substr(0,attpos) + dc + ris.substr(attpos+1);
    else
    {
      ris = formatNumber(ris,mask);
      l2=ris.length;
      attpos+=l2-l1+1+offs;
      if (attpos<0)
        attpos=0;
      if (attpos>l2)
        attpos=l2;
    }
  }
  objInput.value = ris;
  return attpos;
}

function deleteChars(offs)
{
  var ris,startpos,endpos,t1,i,moveto,nsd,attpos;
  
  startpos = getCursorPos(glbObjInput);
  //
  if (typeof(glbObjInput.selectionEnd) != "undefined")
  {
    endpos=glbObjInput.selectionEnd;
  }
  else
  {
    t1 = document.selection.createRange();
    endpos=startpos+t1.text.length;
  }
  if (glbVirtualPos>=0)
    endpos = glbVirtualPos;
  //
  // Controllo presenza caratteri sep decimale nell'intervallo
  if (glbMaskType=="N")
  {
    nsd=0;
    ris=glbObjInput.value;
    for (i=endpos-1;i>=startpos;i--)
      if (ris.charAt(i)==glbThoSep)
        nsd++;
    startpos+=nsd;
  }
  //
  if (endpos>startpos)
  {
    attpos=endpos-1;
    for (i=endpos-1;i>=startpos;i--)
    {
      if (glbMaskType=="N")
      {
        moveto = deleteChar(glbObjInput, attpos, -1, glbMask, glbMaskType);
        attpos = moveto-1;
      }
      else
        moveto = deleteChar(glbObjInput, i, offs, glbMask, glbMaskType);
    }
  }
  else
  {
    startpos+=offs;
    moveto = deleteChar(glbObjInput, startpos, offs, glbMask, glbMaskType);
  }
  setCursorPos(glbObjInput, moveto);
}

function hk(evento,forcekey)
{
  // NPQ03109
  if (RD3_Glb && RD3_Glb.IsAndroid() && !(RD3_Glb.IsMobile() && glbMaskType == "N"))
    return true;
  //
  var ok,ch; 
  var keyCode;
  var altKey;
  var ctrlKey;
  //
  if (evento!=null)
  {
    keyCode = window.event ? evento.keyCode : evento.which;
    altKey = evento.altKey;
    ctrlKey = evento.ctrlKey || evento.metaKey;
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
  if (ch==17 || ch==18 || (altKey && !ctrlKey))
    return true; // Tasto CTRL/ALT, lascio premere - MA NON ALTGR
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
      if (glbDecSep === ",") {
        // Il parseFloat non gestisce correttamente la numerazione "all'italiana", vuole il formato x,xxx.xx o xxxx.xx
        v = v.replace(/\./g, "");
        v = v.replace(",", ".");
      }
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
  // Gli input type number non possono essere mascherati, non prendono bene i separatori
  if (glbObjInput && glbObjInput.tagName == "INPUT" && glbObjInput.type == "number")
    return true;
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

function GetInitValue(mask, masktype)
{
  var dc,ris,i;
  
  ris = "";
  for (i=0;i<mask.length;i++)
  {
    dc = mask.charAt(i);
    switch(masktype)
    {
      case "N":
        if (dc==glbDecSep || dc == "0")
          ris+=dc;
      break;
      
      case "A":
        if (isMaskToken(dc,masktype))
          ris+=glbPrompt;
        else
          ris+=dc;
      break;
      
      case "D":
        ris+=dc;
      break;
    }
  }
  //
  // Se l'ultimo carattere � una "virgola" allora devo toglierlo
  if (masktype=="N" && ris.length>0 && ris.substr(ris.length-1)==glbDecSep)
    ris = ris.substr(0,ris.length-1);
  return ris;
}

function mc(mask, masktype, evento, srcele, usevirt)
{
  // NPQ03109
  if (RD3_Glb && RD3_Glb.IsAndroid() && !(RD3_Glb.IsMobile() && masktype == "N"))
  {
    // Memorizzo comunque il masktype, in modo che se scatta l'hk sullo stesso input non faccia niente
    // (questa stessa protezione e' presente su hk, quindi se scatta queesta scatta anche quella - a mano che non sia 
    // scattato unb nuovo mc su un N, e in quel caso va bene)
    glbMaskType = masktype;
    return;
  }
  //
  var dec,s;
  var srcElement = srcele;
  //
  if (!srcElement)
    srcElement = window.event ? event.srcElement : evento.target;
  //
  glbObjInput = srcElement;
  glbMask = mask;
  glbMaskType = masktype;
  s = glbObjInput.value;
  glbInitValue=s;
  glbVirtualPos = usevirt?0:-1;
  //
  // Gli input type number non possono essere mascherati, non prendono bene i separatori
  if (glbObjInput && glbObjInput.tagName == "INPUT" && glbObjInput.type == "number")
    return;
  //
  if (s == "")
  {
    s = GetInitValue(mask,masktype);
    glbObjInput.value = s;
    //
    if (masktype=="N")
    {
      dec=s.indexOf(glbDecSep);
      if (dec>-1)
      {
        setTimeout("setCursorPos(glbObjInput, " + dec + ");", 10);
        if (usevirt)
          glbVirtualPos = dec;
      }
      else
      {
        setTimeout("setCursorPos(glbObjInput, " + s.length + ");", 10);
        if (usevirt)
          glbVirtualPos = s.length;
      }
    }
    else
    {
      setTimeout("setCursorPos(glbObjInput,0);", 10);
      if (usevirt)
        glbVirtualPos = 0;
    }
  }
  else
  {
    // Se ho dovuto completare la maschera, risistemo il fuoco...
    if (masktype=="A" && mask.length>s.length) // Complete with mask...
    {
      s += GetInitValue(mask,masktype).substr(s.length);
      glbObjInput.value = s;
      setTimeout("setCursorPos(glbObjInput,0);", 10);
      if (usevirt)
        glbVirtualPos = 0;
    }
    else if (masktype=="N")
    {
      // Se il cursore � all'inizio della stringa lo porto avanti
      // fino al primo carattere diverso da '0'
      if (getCursorPos(glbObjInput)==0)
      {
        if (usevirt)
        {
          dec=s.indexOf(glbDecSep);
          if (dec>-1)
            glbVirtualPos = dec;
          else
            glbVirtualPos = s.length;
        }
        else
        {
          var p = 0;
          while (p<s.length && s.substr(p,1)=='0')
            p++;
          //
          if (p>0)
            setTimeout("setCursorPos(glbObjInput," + p + ");", 10);
        }
      }
    }
  }
  //
  // Gestione focus globale
  try
  {
    FocusHandler(evento);
  }
  catch(ex)
  {
  }
}

function umc(evento)
{
  if (!glbObjInput)
    return;
  //
  // Gli input type number non possono essere mascherati, non prendono bene i separatori
  if (glbObjInput && glbObjInput.tagName == "INPUT" && glbObjInput.type == "number")
    return;
  //
  // Se l'ultimo carattere � una "virgola" allora devo toglierlo
  try
  {
    if (glbMaskType=="N" && glbObjInput.value.length>0 && glbObjInput.value.substr(glbObjInput.value.length-1)==glbDecSep)
    {
      glbObjInput.value = glbObjInput.value.substr(0,glbObjInput.value.length-1);
    }
  }
  catch (ex) {}
  //
  var s = GetInitValue(glbMask,glbMaskType);
  if (glbObjInput.value == s && glbMaskType!="A")
    glbObjInput.value = "";
  if (glbMaskType=="A")
  {
    s = glbObjInput.value;
    //
    // Partendo da DX, rimuovo tutti i prompt e tutti i caratteri uguali alla maschera
    for (var j=Math.min(s.length-1, glbMask.length-1); j>=0; j--)
    {
      var ss = s.substr(j,1);
      //
      // Se questo carattere concide con il prompt... lo salto... lo rimuovo alla fine
      if (ss == glbPrompt)
        continue;
      //
      // Il carattere non e' il prompt... verifico se coincide con il carattere della maschera
      var sm = glbMask.substr(j, 1);
      if (ss==sm)
      {
        // Bene... il carattere coincide con il corrispondente carattere della masck...
        // Lo sostituisco con il prompt solo se il carattere della mask chiedeva una lettera...
        // In quel caso c'e' gia' il prompt e non voglio sostituire inutilmente
        if (sm!='A' && sm!='a')
          s = s.substr(0, j) + glbPrompt + s.substr(j+1);
      }
      else
      {
        // Il carattere non corrisponde a quello della maschera... se e' diverso anche dal prompt
        // ho finito
        if (ss!=glbPrompt)
          break;
      }
    }
    //
    // Ora elimino tutti i prompt, partendo dal fondo
    for (var j=s.length-1; j>=0; j--)
      if (s.substr(j, 1)==glbPrompt)
        s = s.substring(0, j);
    //
    glbObjInput.value = s;
  }    
  //
  // Se il campo � una data ed c'� ancora la maschera
  if (glbMaskType=="D" && glbObjInput.value.length>0)
  {
    var now = new Date();
    //
    // Se � stato specificato il giorno
    if (!isNaN(getToken(glbObjInput.value, glbMask, "dd")))
    {
      // Ma non il mese, gli metto il mese corrente
      if (isNaN(getToken(glbObjInput.value, glbMask, "mm")))
        glbObjInput.value = setToken(glbObjInput.value, glbMask, "mm", now.getMonth()+1);
      //
      // Se l'anno non � stato specificato gli metto l'anno corrente
      var yy = getToken(glbObjInput.value, glbMask, "yyyy");
      if (yy==-1)
      {
        yy=getToken(glbObjInput.value, glbMask, "yy");
        if (isNaN(yy))
          glbObjInput.value = setToken(glbObjInput.value, glbMask, "yy", now.getFullYear().toString().substr(2,2));
      }
      else
      {
        if (isNaN(yy))
          glbObjInput.value = setToken(glbObjInput.value, glbMask, "yyyy", now.getFullYear().toString().substr(0,4));
      }
    }
    //
    // La maschera contiene una porzione ora, devo verificare se riempirla
    if (glbMask.indexOf("hh") != -1 || glbMask.indexOf("nn") != -1) {
      // Se � stata specificata l'ora
      if (!isNaN(getToken(glbObjInput.value, glbMask, "hh"))) {
        // Ma non i minuti, gli metto 00
        if (isNaN(getToken(glbObjInput.value, glbMask, "nn")))
          glbObjInput.value = setToken(glbObjInput.value, glbMask, "nn", now.getMinutes());
      }
      else if (!isNaN(getToken(glbObjInput.value, glbMask, "nn"))) {  // Se sono stati specificati i minuti
        // Ma non lora metto l'ora corrente
        if (isNaN(getToken(glbObjInput.value, glbMask, "hh")))
          glbObjInput.value = setToken(glbObjInput.value, glbMask, "hh", now.getHours());
      }
      else {
        // Non ci sono ne' minuti ne' ore, provo a popolarli entrambi
        // (la SetToken protegge il caso che il token non esista nella maschera)
        glbObjInput.value = setToken(glbObjInput.value, glbMask, "hh", now.getHours());
        glbObjInput.value = setToken(glbObjInput.value, glbMask, "nn", now.getMinutes());
      }
    }
  }
  //
  if (glbObjInput.value!=glbInitValue)
  {
    // Tento di mandare il messaggio al kbmanager, se non ci riesco provo
    // in modalit� RD2
    var kbex = true;
    try
    {
      if (evento)
        RD3_KBManager.IDRO_OnChange(evento);
    }
    catch(ex)
    {
      kbex = false;
    }
    //
    if (!kbex)
    {
      try
      {
        glbObjInput.onchange(evento);
      }
      catch(ex) { }
    }
  }
  //
  // Gestione focus globale
  try
  {
    BlurHandler();
  }
  catch(ex) { }
}
