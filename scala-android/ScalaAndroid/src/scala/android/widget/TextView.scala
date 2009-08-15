package scala.android.widget

import _root_.android.text._
import _root_.android.graphics.drawable.Drawable
import _root_.android.graphics.{Rect,Typeface}
import _root_.android.text.TextUtils.TruncateAt
import _root_.android.view.inputmethod.ExtractedText
import _root_.android.text.method._
import _root_.android.content.res.ColorStateList
import _root_.android.content.Context
import _root_.android.view._
import _root_.android.widget.Scroller


class TextView(baseTextView:_root_.android.widget.TextView) extends scala.android.view.View(baseTextView){  
  import _root_.android.widget.TextView._
  def +=(watcher:TextWatcher){
    baseTextView.addTextChangedListener(watcher)
  }
  def -=(watcher:TextWatcher){
    baseTextView.removeTextChangedListener(watcher)
  }
  def +=(text:CharSequence) {
    baseTextView.append(text)
  }
  def +=(tuple:Tuple3[CharSequence, Int, Int]){
    baseTextView.append(tuple._1, tuple._2, tuple._3)
  }
  def autoLineMask = baseTextView.getAutoLinkMask
  override def baseline = baseTextView.getBaseline
  def compoundDrawablePadding = baseTextView.getCompoundDrawablePadding
  def compoundDrawables = baseTextView.getCompoundDrawables
  def compoundPaddingBottom = baseTextView.getCompoundPaddingBottom
  def compoundPaddingLeft = baseTextView.getCompoundPaddingLeft
  def compoundPaddingRight = baseTextView.getCompoundPaddingRight
  def compoundPaddingTop = baseTextView.getCompoundPaddingTop
  def currentHintTextColor = baseTextView.getCurrentHintTextColor
  def currentTextColor = baseTextView.getCurrentTextColor
  def editableText = baseTextView.getEditableText
  def ellipsize = baseTextView.getEllipsize
  def error = baseTextView.getError
  def extendedPaddingBottom = baseTextView.getExtendedPaddingBottom
  def extendedPaddingTop = baseTextView.getExtendedPaddingTop
  def filters = baseTextView.getFilters
  def freezesText = baseTextView.getFreezesText
  def gravity = baseTextView.getGravity
  def hint = baseTextView.getHint
  def hintTextColors = baseTextView.getHintTextColors
  def imeActionId = baseTextView.getImeActionId
  def imeActionLabel = baseTextView.getImeActionLabel
  def imeOptions = baseTextView.getImeOptions
  def inputType = baseTextView.getInputType
  def keyListener = baseTextView.getKeyListener
  def lineCount = baseTextView.getLineCount
  def lineHeight = baseTextView.getLineHeight
  def linkTextColors = baseTextView.getLinkTextColors
  def linksClickable = baseTextView.getLinksClickable
  def movementMethod = baseTextView.getMovementMethod
  def paint = baseTextView.getPaint
  def paintFlags = baseTextView.getPaintFlags
  def privateImeOptions = baseTextView.getPrivateImeOptions
  def selectionEnd = baseTextView.getSelectionEnd
  def text = baseTextView.getText
  def textColors = baseTextView.getTextColors
  def textScaleX = baseTextView.getTextScaleX
  def textSize = baseTextView.getTextSize
  def totalPaddingBottom = baseTextView.getTotalPaddingBottom
  def totalPaddingLeft = baseTextView.getTotalPaddingLeft
  def totalPaddingRight= baseTextView.getTotalPaddingRight
  def totalPaddingTop = baseTextView.getTotalPaddingTop
  def transformationMethod = baseTextView.getTransformationMethod
  def typeface = baseTextView.getTypeface
  def urls = baseTextView.getUrls
  def autoLinkMask_=(mask:Int) = baseTextView.setAutoLinkMask(mask)
  def compoundDrawablePadding_=(pad:Int) = baseTextView.setCompoundDrawablePadding(pad)
  def compoundDrawablesWithIntrinsicBounds_=[T <% Either[Int, Drawable]](bounds:Tuple4[T,T,T,T]){
	  bounds._1 match {
	    case Left => baseTextView.setCompoundDrawablesWithIntrinsicBounds(bounds._1.left.get, bounds._2.left.get, 
                                                                      bounds._3.left.get, bounds._4.left.get)
        case Right => baseTextView.setCompoundDrawablesWithIntrinsicBounds(bounds._1.right.get, bounds._2.right.get, 
                                                                      bounds._3.right.get, bounds._4.right.get)
	  }
  }
  def cursorVisible_=(visible:Boolean) = baseTextView.setCursorVisible(visible)
  def editableFactor_=(factory:Editable.Factory) = baseTextView.setEditableFactory(factory)
  def ellipsize_=(where:TruncateAt) = baseTextView.setEllipsize(where)
  def ems_=(ems:Int) = baseTextView.setEms(ems)
  def error_=(error:CharSequence) = baseTextView.setError(error)
  def error_=(err:Tuple2[CharSequence,Drawable]){
    baseTextView.setError(err._1, err._2)
  }
  def extractedText_=(text:ExtractedText) = baseTextView.setExtractedText(text)
  def filters_=(filters:List[InputFilter]) = baseTextView.setFilters(filters.toArray)
  def freezesText_=(shouldFreezeText:Boolean) = baseTextView.setFreezesText(shouldFreezeText)
  def gravity_=(gravity:Int) = baseTextView.setGravity(gravity)
  def height_=(height:Int) = baseTextView.setHeight(height)
  def highlightColor_=(color:Int) = baseTextView.setHighlightColor(color)
  def hint_=(text:CharSequence) = baseTextView.setHint(text)
  def hint_=(resourceId:Int) = baseTextView.setHint(resourceId)
  def hintTextColor_=(color:Int) = baseTextView.setHintTextColor(color)
  def horizontallyScrolling_=(whether:Boolean) = baseTextView.setHorizontallyScrolling(whether)
  def imeActionLabel_=(actionLabel:Tuple2[CharSequence,Int]) = baseTextView.setImeActionLabel(actionLabel._1, actionLabel._2)
  def imeOptions_=(options:Int) = baseTextView.setImeOptions(options)
  def includeFontPadding_=(includePad:Boolean) = baseTextView.setIncludeFontPadding(includePad)
  def inputExtras_=(resourceId:Int) = baseTextView.setInputExtras(resourceId)
  def inputType_=(inType:Int) = baseTextView.setInputType(inType)
  def keyListener_=(listener:KeyListener) = baseTextView.setKeyListener(listener)
  def lineSpacing_=(spacing:Tuple2[Float,Float]) = baseTextView.setLineSpacing(spacing._1, spacing._2)
  def lines_=(lines:Int) = baseTextView.setLines(lines)
  def linkTextColor_=(colors:ColorStateList) = baseTextView.setLinkTextColor(colors)
  def linkTextColor_=(color:Int) = baseTextView.setLinkTextColor(color)
  def linksClickable_=(clickable:Boolean) = baseTextView.setLinksClickable(clickable)
  def marqeeRepeatLimit_=(limit:Int) = baseTextView.setMarqueeRepeatLimit(limit)
  def maxEms_=(width:Int) = baseTextView.setMaxEms(width)
  def maxHeight_=(height:Int) = baseTextView.setMaxHeight(height)
  def maxLines_=(lines:Int) = baseTextView.setMaxLines(lines)
  def maxWidth_=(width:Int) = baseTextView.setMaxWidth(width)
  def minEms_=(width:Int) = baseTextView.setMinEms(width)
  def minHeight_=(height:Int) = baseTextView.setMinHeight(height)
  def minLines_=(lines:Int) = baseTextView.setMinLines(lines)
  def minWidth_=(width:Int) = baseTextView.setMinWidth(width)
  def movementMethod_=(method:MovementMethod) = baseTextView.setMovementMethod(method)
  def editActionListener_=(f:(_root_.android.widget.TextView, Int, KeyEvent) => Boolean){
    baseTextView.setOnEditorActionListener(new OnEditorActionListener(){
    	override def onEditorAction(v:_root_.android.widget.TextView, actionId:Int, event:KeyEvent) = f(v,actionId,event)
    })
  }
  override def padding_=(padding:Tuple4[Int,Int,Int,Int]) = baseTextView.setPadding(padding._1, padding._2, padding._3, padding._4)
  def paintFlags_=(flags:Int) = baseTextView.setPaintFlags(flags)
  def privateImeOptions_=(optionsType:String) = baseTextView.setPrivateImeOptions(optionsType)
  def rawInputType_=(rawType:Int) = baseTextView.setRawInputType(rawType)
  def scroller_=(scroller:Scroller) = baseTextView.setScroller(scroller)
  def selectAllOnFocus_=(selectAll:Boolean) = baseTextView.setSelectAllOnFocus(selectAll)
  def selected_=(selected:Boolean) = baseTextView.setSelected(selected)
  def shadowLayer_=(layer:Tuple4[Float,Float,Float,Int]) = baseTextView.setShadowLayer(layer._1, layer._2, layer._3, layer._4)
  def singeLine_=(singleLine:Boolean) = baseTextView.setSingleLine(singleLine)
  def spannableFactory_=(factory:Spannable.Factory) = baseTextView.setSpannableFactory(factory)
  def text_=(resourceId:Int) = baseTextView.setText(resourceId)
  def text_=(text:CharSequence) = baseTextView.setText(text)
  def textAppearance_=(appearance:Tuple2[Context,Int]) = baseTextView.setTextAppearance(appearance._1,appearance._2)
  def textColor_=(resourceId:Int) = baseTextView.setTextColor(resourceId)
  def textColor_=(colors:ColorStateList) = baseTextView.setTextColor(colors)
  def textKeepState_=(text:CharSequence) = baseTextView.setTextKeepState(text)
  def textScaleX_=(size:Float) = baseTextView.setTextScaleX(size)
  def textSize_=(unitAndSize:Tuple2[Int,Float]) = baseTextView.setTextSize(unitAndSize._1, unitAndSize._2)
  def textSize_=(size:Float) = baseTextView.setTextSize(size)
  def transformationMethod_=(method:TransformationMethod) = baseTextView.setTransformationMethod(method)
  def transformationMethod_=(t:(CharSequence, View) => CharSequence) = {
    baseTextView.setTransformationMethod(new TransformationMethod(){
      def getTransformation(source:CharSequence, view:View) = t.apply(source,view)
      def onFocusChanged(view:View, source:CharSequence, focused:Boolean, direction:Int, previous:Rect){}
    })
  }
  def typeface_=(tf:Typeface) = baseTextView.setTypeface(tf)
  def typeface_=(typeAndStyle:Tuple2[Typeface,Int]) = baseTextView.setTypeface(typeAndStyle._1, typeAndStyle._2)
  def width_=(pixels:Int) = baseTextView.setWidth(pixels)
}

object TextView{
  implicit def int2Left(x:Int) = Left(x)
  implicit def drawable2Rigt(y:Drawable) = Right(y)
}

trait TextViewDelegate extends _root_.android.widget.TextView{
  import _root_.android.view.inputmethod.{CompletionInfo, EditorInfo,InputConnection}
  
  import _root_.android.os.{Bundle, Parcelable}
  
  var checkIsTextEditor:()=>Boolean = null
  override def onCheckIsTextEditor:Boolean =
    if (checkIsTextEditor != null) checkIsTextEditor.apply() else super.onCheckIsTextEditor()
  var commitCompletion: CompletionInfo => Unit = null
  override def onCommitCompletion(info:CompletionInfo){
    if (commitCompletion != null) commitCompletion(info) else super.onCommitCompletion(info)
  }
  var createInputConnection: EditorInfo => InputConnection
  override def onCreateInputConnection(info:EditorInfo) =
    if (createInputConnection != null) createInputConnection(info) else super.onCreateInputConnection(info)
  var editorAction: Int => Unit = null
  override def onEditorAction(actionCode:Int){
    if (editorAction != null) editorAction(actionCode) else super.onEditorAction(actionCode)
  }
  var finishTemporaryDetach: () => Unit = null
  override def onFinishTemporaryDetach{
    if (finishTemporaryDetach != null) finishTemporaryDetach.apply() else super.onFinishTemporaryDetach()
  }
  var keyDown : (Int,KeyEvent) => Boolean = null
  override def onKeyDown(keyCode:Int, event:KeyEvent) = 
    if (keyDown != null) keyDown(keyCode, event) else super.onKeyDown(keyCode,event)
  var keyMultiple : (Int,Int,KeyEvent) => Boolean = null
  override def onKeyMultiple(code:Int,count:Int,event:KeyEvent) = 
    if (keyMultiple != null) keyMultiple(code,count,event) else super.onKeyMultiple(code,count,event)
  var keyShortcut : (Int,KeyEvent) => Boolean = null
  override def onKeyShortcut(code:Int, event:KeyEvent) = 
    if (keyShortcut != null) keyShortcut(code,event) else super.onKeyShortcut(code,event)
  var keyUp : (Int,KeyEvent) => Boolean = null
  override def onKeyUp(code:Int, event:KeyEvent) = 
    if (keyUp != null) keyUp(code,event) else super.onKeyUp(code,event)
  var preDraw : () => Boolean = null
  override def onPreDraw = 
    if (preDraw != null) preDraw.apply() else super.onPreDraw()
  var privateImeCommand : (String, Bundle) => Boolean = null
  override def onPrivateIMECommand(action:String, data:Bundle) = 
    if (privateImeCommand != null) privateImeCommand(action,data) else super.onPrivateIMECommand(action,data)
  var restoreInstanceState :  Parcelable => Unit = null
  override def onRestoreInstanceState(state:Parcelable) {
    if (restoreInstanceState != null) restoreInstanceState(state) else super.onRestoreInstanceState(state)
  }
  var saveInstanceState : () => Parcelable = null
  override def onSaveInstanceState = 
    if (saveInstanceState != null) saveInstanceState.apply() else super.onSaveInstanceState()
  var startTemporaryDetach : () => Unit = null
  override def onStartTemporaryDetach {
    if (startTemporaryDetach != null) startTemporaryDetach() else super.onStartTemporaryDetach()
  }
  var textContextMenuItem : Int => Boolean = null
  override def onTextContextMenuItem(id:Int) = 
    if (textContextMenuItem != null) textContextMenuItem(id) else super.onTextContextMenuItem(id)
  var touchEvent : MotionEvent => Boolean = null
  override def onTouchEvent(event:MotionEvent) = 
    if (touchEvent != null) touchEvent(event) else super.onTouchEvent(event)
  var trackballEvent : MotionEvent => Boolean = null
  override def onTrackballEvent(event:MotionEvent) =
    if (trackballEvent != null) trackballEvent(event) else super.onTrackballEvent(event)
  var windowFocusChanged : Boolean => Unit = null
  override def onWindowFocusChanged(hasFocus:Boolean){
    if (windowFocusChanged != null) windowFocusChanged(hasFocus) else super.onWindowFocusChanged(hasFocus)
  }
  
}
