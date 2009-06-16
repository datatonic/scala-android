package scala.android.view

import _root_.android.graphics.drawable.Drawable

/**
 * This class adds syntactic sugar to the Android Menu interface. It can be
 * used as a replacement for that interface, even though it does not implement
 * the interface, by using implicits to convert back and forth.
 */
class RichMenu(menu:_root_.android.view.Menu){
  import scala.collection.mutable.HashMap
  private val items = HashMap.empty[_root_.android.view.MenuItem, MenuItem]
  
  /**
   * This selects a MenuItem. If there is a function associated to the 
   * MenuItem, that function is invoked.
   */
  def select(item:_root_.android.view.MenuItem) = if (items.contains(item)) items(item).handler.apply else None
  
  /**
   * Adds a MenuItem by using a case class for convenience. Returns the
   * MenuItem added.
   */
  def +=(menuItem:MenuItem){
    val item = 
      menu.add(menuItem.groupId, menuItem.itemId, menuItem.order, 
               menuItem.titleResource)
    items += (item -> menuItem)
    item
  }
  /**
   * Adds a MenuItem with just a title. Returns the MenuItem.
   */
  def +=(menuItemTitle:CharSequence) = menu.add(menuItemTitle)
  /**
   * Adds a SubMenu by using a case class for convenience. Returns the SubMenu.
   */
  def +=(subMenu:SubMenu) = menu.addSubMenu(subMenu.groupId, subMenu.itemId, subMenu.order, subMenu.titleRes)
  /**
   * Retrieves a MenuItem. Tries to retrieve by id first, and then by index second.
   * Returns null if both id and index fail.
   */
  def apply(id:Int) = if (menu.findItem(id) != null) menu.findItem(id) else menu.getItem(id)
  /**
   * Removes a MenuItem by using a case class for convenience. If an itemId is
   * supplied, it is used and the item is removed. If only a groupId is 
   * supplied, then the group is removed.
   */
  def -=(menuItem:MenuItem) = menuItem.itemId match {
    case -1 => menu.removeGroup(menuItem.groupId)
    case _ => menu.removeItem(menuItem.itemId)
  }
  def qwertyMode_=(isQwerty:Boolean) = menu.setQwertyMode(isQwerty)
  /**
   * The base Android menu
   */
  def base = menu
}

/**
 * This class adds syntactic sugar to the Android SubMenu interface. It can be
 * used as a replacement for that interface, even though it does not implement
 * the interface, by using implicits to convert back and forth.
 */
class RichSubMenu(subMenu:_root_.android.view.SubMenu){
  def item = subMenu.getItem
  def headerIcon_=(iconRes:Int) = subMenu.setHeaderIcon(iconRes)
  def headerTitle_=(titleRes:Int) = subMenu.setHeaderTitle(titleRes)
  def headerTitle_=(title:CharSequence) = subMenu.setHeaderTitle(title)
  def headerView_=(view:_root_.android.view.View) = subMenu.setHeaderView(view)
  def icon_=(icon:Drawable) = subMenu.setIcon(icon)
  def icon_=(iconRes:Int) = subMenu.setIcon(iconRes)
  /**
   * The base Android SubMenu
   */
  def base = subMenu
}

/**
 * This is a case class for encapsulating the Android MenuItem data
 * structure. It can be used with RichMenu to add/remmove items to a Menu. This 
 * class cannot be used as a replacement for MenuItem, and is only intended
 * to be used to simplify APIs.
 */
case class MenuItem(groupId:Int, itemId:Int, order:Int, titleResource:Int, 
                         handler: () => Unit){
	def this(groupId:Int, itemId:Int) = this(groupId, itemId, -1, -1, null)
	def this(groupId:Int) = this(groupId, -1, -1, -1, null)
}
/**
 * This is a case class for encapsulating the Android SubMenu data structure.
 * It can be used with RichMenu to add SubMenus. It cannot be used as a 
 * replacement for the Android SubMenu class, and is only intended to be used
 * to simplify APIs.
 */
case class SubMenu(groupId:Int, itemId:Int, order:Int, titleRes:Int)

/**
 * This class adds syntactic sugar to the Android MenuItem interface. It can be
 * used as a replacement for that interface, even though it does not implement
 * the interface, by using implicits to convert back and forth.
 */
class RichMenuItem(menuItem:_root_.android.view.MenuItem){
  import _root_.android.content.Intent
  import _root_.android.view.MenuItem._
  
  def alphabeticShortcut = menuItem.getAlphabeticShortcut
  def groupId = menuItem.getGroupId
  def icon = menuItem.getIcon
  def intent = menuItem.getIntent
  def itemId = menuItem.getItemId
  def menuInfo = menuItem.getMenuInfo
  def numericShortcut = menuItem.getNumericShortcut
  def order = menuItem.getOrder
  def subMenu = menuItem.getSubMenu
  def title = menuItem.getTitle
  def titleCondensed = menuItem.getTitleCondensed
  def alphabeticShortcut_=(alphaChar:Char) = menuItem.setAlphabeticShortcut(alphaChar)
  def checkable_=(checkable:Boolean) = menuItem.setCheckable(checkable)
  def checked_=(checked:Boolean) = menuItem.setChecked(checked)
  def enabled_=(enabled:Boolean) = menuItem.setEnabled(enabled)
  def icon_=(icon:Drawable) = menuItem.setIcon(icon)
  def intent_=(intent:Intent) = menuItem.setIntent(intent)
  def numericShortcut_=(numericChar:Char) = menuItem.setNumericShortcut(numericChar)
  /**
   * This allows you to use a closure to handle click events on a menu item.
   */
  def onClick_=( handler:(_root_.android.view.MenuItem) => Boolean) = {
    menuItem.setOnMenuItemClickListener(new OnMenuItemClickListener(){
        override def onMenuItemClick(item:_root_.android.view.MenuItem) = handler.apply(item)                             
    })
  }
  def shortcut_=(numericChar:Char, alphaChar:Char) = menuItem.setShortcut(numericChar, alphaChar)
  def title_=(title:Int) = menuItem.setTitle(title)
  def title_=(title:CharSequence) = menuItem.setTitle(title)
  def titleCondensed_=(title:CharSequence) = menuItem.setTitleCondensed(title)
  def visible_=(visible:Boolean) = menuItem.setVisible(visible)
  /**
   * The base Android MenuItem
   */
  def base = menuItem
}