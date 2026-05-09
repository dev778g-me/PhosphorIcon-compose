package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BoatFill: ImageVector
    get() {
        if (_BoatFill != null) {
            return _BoatFill!!
        }
        _BoatFill = ImageVector.Builder(
            name = "Filled.BoatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.06f, 110.59f)
                lineTo(208f, 106.23f)
                lineTo(208f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(136f, 40f)
                lineTo(136f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 40f)
                lineTo(64f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 56f)
                verticalLineToRelative(50.23f)
                lineToRelative(-13.06f, 4.36f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 125.77f)
                lineTo(24f, 152f)
                curveToRelative(0f, 61.54f, 97.89f, 86.72f, 102.06f, 87.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.88f, 0f)
                curveTo(134.11f, 238.72f, 232f, 213.54f, 232f, 152f)
                lineTo(232f, 125.77f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.06f, 110.59f)
                close()
                moveTo(136f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 104.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(192f, 100.9f)
                lineTo(130.53f, 80.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.06f, 0f)
                lineTo(64f, 100.9f)
                lineTo(64f, 56f)
                lineTo(192f, 56f)
                close()
            }
        }.build()

        return _BoatFill!!
    }

@Suppress("ObjectPropertyName")
private var _BoatFill: ImageVector? = null
