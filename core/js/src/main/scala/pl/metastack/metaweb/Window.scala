package pl.metastack.metaweb

import org.scalajs.dom

object Window {
  def dragEnd: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondragend = _)
  def keyDown: DomEvent[dom.KeyboardEvent] =
    new DomEvent(dom.window.onkeydown = _)
  def dragOver: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondragover = _)
  def keyUp: DomEvent[dom.KeyboardEvent] =
    new DomEvent(dom.window.onkeyup = _)
  def reset: DomEvent[dom.Event] =
    new DomEvent(dom.window.onreset = _)
  def mouseUp: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onmouseup = _)
  def dragStart: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondragstart = _)
  def drag: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondrag = _)
  def mouseOver: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onmouseover = _)
  def dragLeave: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondragleave = _)
  def afterPrint: DomEvent[dom.Event] =
    new DomEvent(dom.window.onafterprint = _)
  def pause: DomEvent[dom.Event] =
    new DomEvent(dom.window.onpause = _)
  def beforePrint: DomEvent[dom.Event] =
    new DomEvent(dom.window.onbeforeprint = _)
  def mouseDown: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onmousedown = _)
  def seeked: DomEvent[dom.Event] =
    new DomEvent(dom.window.onseeked = _)
  def click: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onclick = _)
  def waiting: DomEvent[dom.Event] =
    new DomEvent(dom.window.onwaiting = _)
  def online: DomEvent[dom.Event] =
    new DomEvent(dom.window.ononline = _)
  def durationChange: DomEvent[dom.Event] =
    new DomEvent(dom.window.ondurationchange = _)
  def blur: DomEvent[dom.FocusEvent] =
    new DomEvent(dom.window.onblur = _)
  def emptied: DomEvent[dom.Event] =
    new DomEvent(dom.window.onemptied = _)
  def seeking: DomEvent[dom.Event] =
    new DomEvent(dom.window.onseeking = _)
  def canPlay: DomEvent[dom.Event] =
    new DomEvent(dom.window.oncanplay = _)
  def stalled: DomEvent[dom.Event] =
    new DomEvent(dom.window.onstalled = _)
  def mouseMove: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onmousemove = _)
  def offline: DomEvent[dom.Event] =
    new DomEvent(dom.window.onoffline = _)
  def beforeUnload: DomEvent[dom.BeforeUnloadEvent] =
    new DomEvent(dom.window.onbeforeunload = _)
  def rateChange: DomEvent[dom.Event] =
    new DomEvent(dom.window.onratechange = _)
  def storage: DomEvent[dom.StorageEvent] =
    new DomEvent(dom.window.onstorage = _)
  def loadStart: DomEvent[dom.Event] =
    new DomEvent(dom.window.onloadstart = _)
  def dragEnter: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondragenter = _)
  def submit: DomEvent[dom.Event] =
    new DomEvent(dom.window.onsubmit = _)
  // def progress: DomEventHandler[scala.scalajs.js.Any] =
  //   new DomEventHandler(dom.window.onprogress = _)
  def dblClick: DomEvent[dom.MouseEvent] =
  new DomEvent(dom.window.ondblclick = _)
  def contextMenu: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.oncontextmenu = _)
  def change: DomEvent[dom.Event] =
    new DomEvent(dom.window.onchange = _)
  def loadedMetadata: DomEvent[dom.Event] =
    new DomEvent(dom.window.onloadedmetadata = _)
  def play: DomEvent[dom.Event] =
    new DomEvent(dom.window.onplay = _)
  // def error: DomEventHandler[dom.Event] =
  //   new DomEventHandler(dom.window.onerror = _)
  def playing: DomEvent[dom.Event] =
  new DomEvent(dom.window.onplaying = _)
  def canPlayThrough: DomEvent[dom.Event] =
    new DomEvent(dom.window.oncanplaythrough = _)
  def abort: DomEvent[dom.UIEvent] =
    new DomEvent(dom.window.onabort = _)
  def readyStateChange: DomEvent[dom.Event] =
    new DomEvent(dom.window.onreadystatechange = _)
  def keyPress: DomEvent[dom.KeyboardEvent] =
    new DomEvent(dom.window.onkeypress = _)
  def loadedData: DomEvent[dom.Event] =
    new DomEvent(dom.window.onloadeddata = _)
  def suspend: DomEvent[dom.Event] =
    new DomEvent(dom.window.onsuspend = _)
  def focus: DomEvent[dom.FocusEvent] =
    new DomEvent(dom.window.onfocus = _)
  def message: DomEvent[dom.MessageEvent] =
    new DomEvent(dom.window.onmessage = _)
  def timeUpdate: DomEvent[dom.Event] =
    new DomEvent(dom.window.ontimeupdate = _)
  def resize: DomEvent[dom.UIEvent] =
    new DomEvent(dom.window.onresize = _)
  def select: DomEvent[dom.UIEvent] =
    new DomEvent(dom.window.onselect = _)
  def drop: DomEvent[dom.DragEvent] =
    new DomEvent(dom.window.ondrop = _)
  def mouseOut: DomEvent[dom.MouseEvent] =
    new DomEvent(dom.window.onmouseout = _)
  def ended: DomEvent[dom.Event] =
    new DomEvent(dom.window.onended = _)
  def hashChange: DomEvent[dom.HashChangeEvent] =
    new DomEvent(dom.window.onhashchange = _)
  def unload: DomEvent[dom.Event] =
    new DomEvent(dom.window.onunload = _)
  def scroll: DomEvent[dom.UIEvent] =
    new DomEvent(dom.window.onscroll = _)
  def mouseWheel: DomEvent[dom.WheelEvent] =
    new DomEvent(dom.window.onmousewheel = _)
  def load: DomEvent[dom.Event] =
    new DomEvent(dom.window.onload = _)
  def volumeChange: DomEvent[dom.Event] =
    new DomEvent(dom.window.onvolumechange = _)
  def input: DomEvent[dom.Event] =
    new DomEvent(dom.window.oninput = _)
  def popState: DomEvent[dom.PopStateEvent] =
    new DomEvent(dom.window.onpopstate = _)
}
