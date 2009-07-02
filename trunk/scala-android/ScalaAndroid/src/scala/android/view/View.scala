package scala.android.view

import _root_.android.view.View
import _root_.android.view.animation.Animation
import _root_.android.graphics.drawable.Drawable
import View._
import _root_.android.view.ViewGroup._
import _root_.android.view.TouchDelegate
import scala.android.app.ActivityHelper._

class View(base:_root_.android.view.View) {
  def animation = base.getAnimation
  def applicationWindowToken = base.getApplicationWindowToken
  def background = base.getBackground
  def baseline = base.getBaseline
  def bottom = base.getBottom
  def context = base.getContext
  def drawableState = base.getDrawableState
  def drawingCache = base.getDrawingCache
  def drawingCacheBackgroundColor = base.getDrawingCacheBackgroundColor
  def drawingTime = base.getDrawingTime
  def handler = base.getHandler
  def height = base.getHeight
  def horizontalFadingEdgeLength = base.getHorizontalFadingEdgeLength
  def id = base.getId
  def keepScreenOn = base.getKeepScreenOn
  def layoutParams = base.getLayoutParams
  def left = base.getLeft
  def measuredHeight = base.getMeasuredHeight
  def measuredWidth = base.getMeasuredWidth
  def nextFocusDownId = base.getNextFocusDownId
  def nextFocusLeftId = base.getNextFocusLeftId
  def nextFocusRightId = base.getNextFocusRightId
  def nextFocusUpId = base.getNextFocusUpId
  def paddingBottom = base.getPaddingBottom
  def paddingLeft = base.getPaddingLeft
  def paddingRight = base.getPaddingRight
  def paddingTop = base.getPaddingTop
  def parent = base.getParent
  def resources = base.getResources
  def right = base.getRight
  def rootView = base.getRootView
  def scrollBarStyle = base.getScrollBarStyle
  def scrollX = base.getScrollX
  def scrollY = base.getScrollY
  def tag = base.getTag
  def top = base.getTop
  def touchDelegate = base.getTouchDelegate
  def touchables = base.getTouchables
  def verticalFadingEdgeLength = base.getVerticalFadingEdgeLength
  def verticalScrollbarWidth = base.getVerticalScrollbarWidth
  def viewTreeObserver = base.getViewTreeObserver
  def visibility = base.getVisibility
  def width = base.getWidth
  def windowToken = base.getWindowToken
  def windowVisibility = base.getWindowVisibility
  def focus = base.hasFocus
  def focusable = base.hasFocusable
  def windowFocus = base.hasWindowFocus
  def clickable = base.isClickable
  def drawingCacheEnabled = base.isDrawingCacheEnabled
  def duplicateParentStateEnabled = base.isDuplicateParentStateEnabled
  def enabled = base.isEnabled
  def focusableInTouchMode = base.isFocusableInTouchMode
  def focused = base.isFocused
  def hapticFeedbackEnabled = base.isHapticFeedbackEnabled
  def horizontalFadingEdgeEnabled = base.isHorizontalFadingEdgeEnabled
  def horizontalScrollBarEnabled = base.isHorizontalScrollBarEnabled
  def inEditMode = base.isInEditMode
  def inTouchMode = base.isInTouchMode
  def layoutRequested = base.isLayoutRequested
  def longClickable = base.isLongClickable
  def pressed = base.isPressed
  def saveEnabled = base.isSaveEnabled
  def selected = base.isSelected
  def shown = base.isShown
  def soundEffectsEnabled = base.isSoundEffectsEnabled
  def verticalFadingEdgeEnabled = base.isVerticalFadingEdgeEnabled
  def verticalScrollBarEnabled = base.isVerticalScrollBarEnabled
  def layout_=(pos:Tuple4[Int,Int,Int,Int]) = base.layout(pos._1, pos._2, pos._3, pos._4)
  def layout = (base.getLeft, base.getTop, base.getBottom, base.getRight)
  def offsetLeftAndRight_=(offset:Int) = base.offsetLeftAndRight(offset)
  def offsetTopAndBottom_=(offset:Int) = base.offsetTopAndBottom(offset)
  def post( f:() => Unit) {
    val task = new Runnable() {
      override def run = f.apply
    }
    base.post(task)
  }
  def postDelayed( f:()=>Unit, delayMillis:Long){
    val task = new Runnable() {
      override def run = f.apply
    }
    base.postDelayed(task, delayMillis)    
  }
  def removeCallbacks( f:()=>Unit){
    val task = new Runnable(){
      override def run = f.apply
    }
    base.removeCallbacks(task)
  }
  def animation_=(anim:Animation) = base.setAnimation(anim)
  def backgroundColor_=(color:Int) = base.setBackgroundColor(color)
  def backgroundDrawable_=(d:Drawable) = base.setBackgroundDrawable(d)
  def backgroundResource_=(resId:Int) = base.setBackgroundResource(resId)
  def clickable_=(canClick:Boolean) = base.setClickable(canClick)
  def drawingCacheBackgroundColor_=(color:Int) = base.setDrawingCacheBackgroundColor(color)
  def drawingCacheEnabled_=(enabled:Boolean) = base.setDrawingCacheEnabled(enabled)
  def drawingCacheQuality_=(quality:Int) = base.setDrawingCacheQuality(quality)
  def duplicateParentStateEnabled_=(enabled:Boolean) = base.setDuplicateParentStateEnabled(enabled)
  def enabled_=(enable:Boolean) = base.setEnabled(enable)
  def fadingEdgeLength_=(length:Int) = base.setFadingEdgeLength(length)
  def focusable_=(focusable:Boolean) = base.setFocusable(focusable)
  def focusableInTouchMode_=(focusable:Boolean) = base.setFocusableInTouchMode(focusable)
  def hapticFeedbackEnabled_=(enabled:Boolean) = base.setHapticFeedbackEnabled(enabled)
  def horizontalFadingEdgeEnabled_=(enabled:Boolean) = base.setHorizontalFadingEdgeEnabled(enabled)
  def horizontalScrollBarEnabled_=(enabled:Boolean) = base.setHorizontalScrollBarEnabled(enabled)
  def id_=(id:Int) = base.setId(id)
  def keepScreenOn_=(keepOn:Boolean) = base.setKeepScreenOn(keepOn)
  def layoutParams_=(params:LayoutParams) = base.setLayoutParams(params)
  def longClickable_=(clickable:Boolean) = base.setLongClickable(clickable)
  def minimumHeight_=(minHeight:Int) = base.setMinimumHeight(minHeight)
  def minimumWidth_=(minWidth:Int) = base.setMinimumWidth(minWidth)
  def nextFocusDownId_=(downId:Int) = base.setNextFocusDownId(downId)
  def nextFocusLeftId_=(id:Int) = base.setNextFocusLeftId(id)
  def nextFocusRightId_=(id:Int) = base.setNextFocusRightId(id)
  def nextFocusUpId_=(id:Int) = base.setNextFocusUpId(id)
  def padding = (base.getPaddingLeft, base.getPaddingTop, base.getPaddingRight, base.getPaddingBottom)
  def padding_=(t:Tuple4[Int,Int,Int,Int]) = base.setPadding(t._1, t._2, t._3, t._4)
  def pressed_=(pressIt:Boolean) = base.setPressed(pressIt)
  def saveEnabled_=(enabled:Boolean) = base.setSaveEnabled(enabled)
  def scrollBarStyle_=(style:Int) = base.setScrollBarStyle(style)
  def scrollContainer_=(isScrollContainer:Boolean) = base.setScrollContainer(isScrollContainer)
  def tag_=(value:Any) = base.setTag(value)
  def touchDelegate_=(delegate:TouchDelegate) = base.setTouchDelegate(delegate)
  def verticalFadingEdgeEnabled_=(enabled:Boolean) = base.setVerticalFadingEdgeEnabled(enabled)
  def verticalScrollBarEnabled_=(enabled:Boolean) = base.setVerticalScrollBarEnabled(enabled)
  def visibility_=(visibilityState:Int) = base.setVisibility(visibilityState)
  def willNotCacheDrawing_=(willNotCache:Boolean) = base.setWillNotCacheDrawing(willNotCache)
}

case class Position(x:Int, y:Int)
