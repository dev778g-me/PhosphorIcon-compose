package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SeatFill: ImageVector
    get() {
        if (_SeatFill != null) {
            return _SeatFill!!
        }
        _SeatFill = ImageVector.Builder(
            name = "Filled.SeatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(112f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(216f, 224f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 232f)
                close()
                moveTo(208f, 144f)
                lineTo(143.78f, 144f)
                lineTo(112f, 80f)
                lineToRelative(14.19f, -26.32f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, -0.22f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 119.15f, 32f)
                lineToRelative(-0.47f, -0.22f)
                lineTo(85f, 17.57f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.8f, 24.84f)
                lineToRelative(-22.12f, 44f)
                arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.32f)
                lineToRelative(58.11f, 116f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 114.11f, 208f)
                lineTo(208f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 160f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                close()
            }
        }.build()

        return _SeatFill!!
    }

@Suppress("ObjectPropertyName")
private var _SeatFill: ImageVector? = null
