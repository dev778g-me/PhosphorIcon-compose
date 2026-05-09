package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HourglassSimpleMediumFill: ImageVector
    get() {
        if (_HourglassSimpleMediumFill != null) {
            return _HourglassSimpleMediumFill!!
        }
        _HourglassSimpleMediumFill = ImageVector.Builder(
            name = "Filled.HourglassSimpleMediumFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.18f, 196.56f)
                lineTo(139.57f, 128f)
                lineToRelative(71.61f, -68.56f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -0.13f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 32f)
                lineTo(56f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.69f, 59.31f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 0.13f)
                lineTo(116.43f, 128f)
                lineTo(44.82f, 196.56f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.13f, 0.13f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 224f)
                lineTo(200f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -27.31f)
                arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.18f, 196.56f)
                close()
                moveTo(56f, 48f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(0f)
                close()
                moveTo(200f, 48f)
                lineTo(174.92f, 72f)
                lineTo(81.08f, 72f)
                lineTo(56f, 48f)
                close()
                moveTo(56f, 208f)
                lineToRelative(64f, -61.26f)
                lineTo(120f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 146.74f)
                lineTo(200f, 208f)
                close()
            }
        }.build()

        return _HourglassSimpleMediumFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleMediumFill: ImageVector? = null
