package scala.android.app

import _root_.scala.android.view._

trait Activity extends _root_.android.app.Activity{
  import ActivityHelper._
  
  protected var menu:Menu = null
  
  override def onCreateOptionsMenu(menu:_root_.android.view.Menu) = {
	this.menu = new Menu(menu)
    true
  }
  
  override def onMenuItemSelected(featureId:Int, item:_root_.android.view.MenuItem) = {
    this.menu(item)
    true
  }
  
}

object ActivityHelper{
  import _root_.android.view.View.OnClickListener
  
  implicit def funcToClicker1(f:_root_.android.view.View => Unit):OnClickListener = 
    new OnClickListener(){ def onClick(v:_root_.android.view.View)=f.apply(v)}
  
  implicit def funcToClicker0(f:() => Unit):OnClickListener = 
    new OnClickListener() { def onClick(v:_root_.android.view.View)=f.apply}
}

