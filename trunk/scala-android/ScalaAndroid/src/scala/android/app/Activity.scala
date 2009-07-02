package scala.android.app

import _root_.scala.android.view._

trait Activity extends _root_.android.app.Activity{
  import ActivityHelper._
  
  protected var menu:RichMenu = null
  
  override def onCreateOptionsMenu(menu:_root_.android.view.Menu) = {
	this.menu = menu
    true
  }
  
  override def onMenuItemSelected(featureId:Int, item:_root_.android.view.MenuItem) = {
    this.menu.select(item)
    true
  }
  
}

object ActivityHelper{
  import _root_.android.view.View._
  import _root_.android.view.{MenuItem, Menu, SubMenu, KeyEvent, MotionEvent}
  import scala.android.view._
  
  implicit def funcToClicker1(f:_root_.android.view.View => Unit):OnClickListener = 
    new OnClickListener(){ def onClick(v:_root_.android.view.View)=f.apply(v)}
  
  implicit def funcToClicker0(f:() => Unit):OnClickListener = 
    new OnClickListener() { def onClick(v:_root_.android.view.View)=f.apply}
  
  implicit def funcToLongClicker0(f:() => Boolean):OnLongClickListener =
    new OnLongClickListener() { def onLongClick(v:_root_.android.view.View) = f.apply}
  
  implicit def funcToLongClicker1(f:_root_.android.view.View => Boolean):OnLongClickListener = 
    new OnLongClickListener() { def onLongClick(v:_root_.android.view.View) = f.apply(v)}
  
  implicit def funcToFocusChanger1(f:Boolean => Unit):OnFocusChangeListener =
    new OnFocusChangeListener() { def onFocusChange(v:_root_.android.view.View, 
                                        hasFocus:Boolean) = f.apply(hasFocus)}
  
  implicit def funcToFocusChanger2(f:(_root_.android.view.View, Boolean) => Unit):OnFocusChangeListener =
    new OnFocusChangeListener() { def onFocusChange(v:_root_.android.view.View, 
                                        hasFocus:Boolean) = f.apply(v,hasFocus)}
  
  implicit def funcToKeyListener2(f:(Int, KeyEvent) => Boolean):OnKeyListener =
    new OnKeyListener() { 
      def onKey(v:_root_.android.view.View, keyCode:Int, event:KeyEvent) = 
        f.apply(keyCode,event)
    }
  
  implicit def funcToKeyListener3(f:(_root_.android.view.View, Int, KeyEvent) => Boolean):OnKeyListener =
    new OnKeyListener() { 
      def onKey(v:_root_.android.view.View, keyCode:Int, event:KeyEvent) = 
        f.apply(v,keyCode,event)
    }
  
  implicit def funcToTouchListener1(f:MotionEvent => Boolean):OnTouchListener =
    new OnTouchListener(){ 
      def onTouch(v:_root_.android.view.View, event:MotionEvent) = 
        f.apply(event)
    }
  
  implicit def viewToRichView(v:_root_.android.view.View):scala.android.view.View = new scala.android.view.View(v)
  implicit def richViewToView(v:scala.android.view.View):_root_.android.view.View = v.base
  implicit def menuItemToRichMenuItem(item:MenuItem):RichMenuItem = new RichMenuItem(item)
  implicit def richMenuItemToMenuItem(item:RichMenuItem):MenuItem = item.base
  implicit def menuToRichMenu(menu:Menu):RichMenu = new RichMenu(menu)
  implicit def richMenuToMenu(menu:RichMenu):Menu = menu.base
  implicit def subMenuToRichSubMenu(menu:SubMenu):RichSubMenu = new scala.android.view.RichSubMenu(menu)
  implicit def richSubMenuToSubMenu(menu:RichSubMenu):SubMenu = menu.base
}

