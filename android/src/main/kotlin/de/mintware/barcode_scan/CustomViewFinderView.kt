package de.mintware.barcode_scan

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.TypedValue
import me.dm7.barcodescanner.core.ViewFinderView

class CustomViewFinderView : ViewFinderView {
    val PAINT = Paint()

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        init()
    }

    private fun init() {
        PAINT.color = Color.WHITE
        PAINT.isAntiAlias = true
        val textPixelSize = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            TRADE_MARK_TEXT_SIZE_SP.toFloat(),
            resources.displayMetrics
        )
        PAINT.textSize = textPixelSize
        setSquareViewFinder(true)

        val mainColor = Color.parseColor("#E6C8A0");
        setLaserColor(mainColor)
        setBorderColor(mainColor)
        setLaserEnabled(true)
    }

    companion object {
        const val TRADE_MARK_TEXT = "ZXing"
        const val TRADE_MARK_TEXT_SIZE_SP = 40
    }
}