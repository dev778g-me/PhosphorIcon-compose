package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberCircleSixFill: ImageVector
    get() {
        if (_NumberCircleSixFill != null) {
            return _NumberCircleSixFill!!
        }
        _NumberCircleSixFill = ImageVector.Builder(
            name = "Filled.NumberCircleSixFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(148f, 148f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 148f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(164f, 148f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36f, -36f)
                curveToRelative(-0.61f, 0f, -1.22f, 0f, -1.82f, 0f)
                lineTo(142.87f, 84.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.74f, -8.2f)
                reflectiveCurveToRelative(-32.4f, 54.28f, -32.47f, 54.42f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 164f, 148f)
                close()
            }
        }.build()

        return _NumberCircleSixFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleSixFill: ImageVector? = null
