package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GpsFixFill: ImageVector
    get() {
        if (_GpsFixFill != null) {
            return _GpsFixFill!!
        }
        _GpsFixFill = ImageVector.Builder(
            name = "Filled.GpsFixFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 120f)
                lineTo(215.63f, 120f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 40.37f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 40.37f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.37f, 120f)
                lineTo(16f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(40.37f, 136f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 215.63f)
                lineTo(120f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 215.63f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.63f, 136f)
                lineTo(240f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(128f, 200f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, -72f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 200f)
                close()
                moveTo(168f, 128f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 128f)
                close()
            }
        }.build()

        return _GpsFixFill!!
    }

@Suppress("ObjectPropertyName")
private var _GpsFixFill: ImageVector? = null
