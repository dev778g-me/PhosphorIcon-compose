package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DroneFill: ImageVector
    get() {
        if (_DroneFill != null) {
            return _DroneFill!!
        }
        _DroneFill = ImageVector.Builder(
            name = "Filled.DroneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(189.66f, 77.66f)
                lineTo(160f, 107.31f)
                verticalLineToRelative(41.38f)
                lineToRelative(29.66f, 29.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(148.69f, 160f)
                lineTo(107.31f, 160f)
                lineTo(77.66f, 189.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(96f, 148.69f)
                lineTo(96f, 107.31f)
                lineTo(66.34f, 77.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.66f, 66.34f)
                lineTo(107.31f, 96f)
                horizontalLineToRelative(41.38f)
                lineToRelative(29.65f, -29.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
                moveTo(143.38f, 71.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.21f, -4.87f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 35.74f, 35.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 118f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, -0.46f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56.16f, -56.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 143.38f, 71.54f)
                close()
                moveTo(194.67f, 138.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.34f, 15.08f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -35.74f, 35.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.08f, 5.34f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56.16f, -56.16f)
                close()
                moveTo(112.67f, 184.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.21f, 4.87f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -35.74f, -35.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.34f, -15.08f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56.16f, 56.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112.62f, 184.46f)
                close()
                moveTo(61.38f, 117.54f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 118f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, -15.54f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 35.74f, -35.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.08f, -5.34f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56.16f, 56.16f)
                close()
            }
        }.build()

        return _DroneFill!!
    }

@Suppress("ObjectPropertyName")
private var _DroneFill: ImageVector? = null
