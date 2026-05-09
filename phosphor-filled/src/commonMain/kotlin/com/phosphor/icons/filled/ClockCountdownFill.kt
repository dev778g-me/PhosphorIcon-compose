package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ClockCountdownFill: ImageVector
    get() {
        if (_ClockCountdownFill != null) {
            return _ClockCountdownFill!!
        }
        _ClockCountdownFill = ImageVector.Builder(
            name = "Filled.ClockCountdownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 136.66f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 119.34f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120.66f, 40f)
                arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 216f, 135.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 136.66f)
                close()
                moveTo(160f, 48f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 48f)
                close()
                moveTo(196f, 72f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 72f)
                close()
                moveTo(220f, 108f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 220f, 108f)
                close()
                moveTo(128f, 56f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 72f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 56f)
                close()
                moveTo(120f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(136f, 120f)
                lineTo(136f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                close()
            }
        }.build()

        return _ClockCountdownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCountdownFill: ImageVector? = null
