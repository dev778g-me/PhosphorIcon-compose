package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberSquareZeroFill: ImageVector
    get() {
        if (_NumberSquareZeroFill != null) {
            return _NumberSquareZeroFill!!
        }
        _NumberSquareZeroFill = ImageVector.Builder(
            name = "Filled.NumberSquareZeroFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 128f)
                curveToRelative(0f, 14.86f, -5.9f, 40f, -28f, 40f)
                reflectiveCurveToRelative(-28f, -25.14f, -28f, -40f)
                reflectiveCurveToRelative(5.9f, -40f, 28f, -40f)
                reflectiveCurveTo(156f, 113.14f, 156f, 128f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(172f, 128f)
                curveToRelative(0f, -14.25f, -3.56f, -27.53f, -10f, -37.39f)
                curveTo(154f, 78.44f, 142.23f, 72f, 128f, 72f)
                reflectiveCurveToRelative(-26f, 6.44f, -34f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10f, 23.14f, -10f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10f, 37.39f)
                curveToRelative(8f, 12.17f, 19.74f, 18.61f, 34f, 18.61f)
                reflectiveCurveToRelative(26f, -6.44f, 34f, -18.61f)
                curveTo(168.44f, 155.53f, 172f, 142.25f, 172f, 128f)
                close()
            }
        }.build()

        return _NumberSquareZeroFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareZeroFill: ImageVector? = null
