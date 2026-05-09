package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HourglassHighFill: ImageVector
    get() {
        if (_HourglassHighFill != null) {
            return _HourglassHighFill!!
        }
        _HourglassHighFill = ImageVector.Builder(
            name = "Filled.HourglassHighFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 75.64f)
                lineTo(200f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(72f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                lineTo(56f, 76f)
                arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 12.8f)
                lineTo(114.67f, 128f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 180f)
                verticalLineToRelative(36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(184f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(200f, 180.36f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.35f, -12.77f)
                lineTo(141.27f, 128f)
                lineToRelative(52.38f, -39.59f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 75.64f)
                close()
                moveTo(184f, 40f)
                lineTo(184f, 64f)
                lineTo(72f, 64f)
                lineTo(72f, 40f)
                close()
                moveTo(184f, 216f)
                lineTo(72f, 216f)
                lineTo(72f, 180f)
                lineToRelative(56f, -42f)
                lineToRelative(56f, 42.35f)
                close()
            }
        }.build()

        return _HourglassHighFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassHighFill: ImageVector? = null
