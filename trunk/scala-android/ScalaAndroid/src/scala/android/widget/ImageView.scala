package scala.android.widget

class ImageView(baseImageView:_root_.android.widget.ImageView) extends scala.android.view.View(baseImageView){
	import _root_.android.graphics._
	import _root_.android.net.Uri
	import PorterDuff.Mode
 
	def baseline = baseImageView.getBaseline
	def drawable = baseImageView.getDrawable
	def imageMatrix = baseImageView.getImageMatrix
	def scaleType = baseImageView.getScaleType
	def adjustViewBounds_=(shouldAdjust:Boolean){
	  baseImageView.setAdjustViewBounds(shouldAdjust)
	}
	def alpha_=(alpha:Int){
	  baseImageView.setAlpha(alpha)
	}
	def colorFilter_=(cf:ColorFilter){
	  baseImageView.setColorFilter(cf)
	}
	def colorFilter_=(colorAndMode:Tuple2[Int, Mode]){
	  baseImageView.setColorFilter(colorAndMode._1, colorAndMode._2)
	}
	def imageBitmap_=(bm:Bitmap){
	  baseImageView.setImageBitmap(bm)
	}
	def imageLevel_=(level:Int){
	  baseImageView.setImageLevel(level)
	}
	def imageMatrix_=(matrix:Matrix){
	  baseImageView.setImageMatrix(matrix)
	}
	def imageResource_=(resourceId:Int){
	  baseImageView.setImageResource(resourceId)
	}
	def imageUri_=(uri:Uri){
	  baseImageView.setImageURI(uri)
	}
	def maxHeight_=(height:Int){
	  baseImageView.setMaxHeight(height)
	}
	def maxWidth_=(width:Int){
	  baseImageView.setMaxWidth(width)
	}
	def selected_=(isSelected:Boolean){
	  baseImageView.setSelected(isSelected)
	}
}
