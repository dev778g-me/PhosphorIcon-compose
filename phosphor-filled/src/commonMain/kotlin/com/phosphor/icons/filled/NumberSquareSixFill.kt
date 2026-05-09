package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberSquareSixFill: ImageVector
    get() {
        if (_NumberSquareSixFill != null) {
            return _NumberSquareSixFill!!
        }
        _NumberSquareSixFill = ImageVector.Builder(
            name = "Filled.NumberSquareSixFill",
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
                moveTo(224f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                horizontalLineTo(208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
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

        return _NumberSquareSixFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareSixFill: ImageVector? = null
