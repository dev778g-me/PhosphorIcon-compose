package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ClockClockwiseFill: ImageVector
    get() {
        if (_ClockClockwiseFill != null) {
            return _ClockClockwiseFill!!
        }
        _ClockClockwiseFill = ImageVector.Builder(
            name = "Filled.ClockClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 80f)
                verticalLineToRelative(43.47f)
                lineToRelative(36.12f, 21.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.24f, 13.72f)
                lineToRelative(-40f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 128f)
                lineTo(120f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(227.06f, 56.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(206f, 70.71f)
                curveToRelative(-3.23f, -3.51f, -6.56f, -7f, -10.1f, -10.59f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 137.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -11.64f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 184.54f, 71.4f)
                curveToRelative(3.54f, 3.58f, 6.87f, 7.1f, 10.11f, 10.63f)
                lineTo(178.34f, 98.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 112f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.06f, 56.61f)
                close()
            }
        }.build()

        return _ClockClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClockClockwiseFill: ImageVector? = null
