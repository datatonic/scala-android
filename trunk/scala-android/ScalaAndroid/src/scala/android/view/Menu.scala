package scala.android.view

class Menu(menu:_root_.android.view.Menu){
  import scala.collection.mutable.HashMap
  val items = HashMap.empty[_root_.android.view.MenuItem, MenuItem]
  
  def apply(item:_root_.android.view.MenuItem) = items(item).handler.apply
  
  def +=(menuItem:MenuItem){
    val item = 
      menu.add(menuItem.groupId, menuItem.itemId, menuItem.order, 
               menuItem.titleResource)
    items += (item -> menuItem)
  }
}

case class MenuItem(groupId:Int, itemId:Int, order:Int, titleResource:Int, 
                         handler: () => Unit)