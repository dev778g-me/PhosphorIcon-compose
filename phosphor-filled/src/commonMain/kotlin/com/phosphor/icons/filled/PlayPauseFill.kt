package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PlayPauseFill: ImageVector
    get() {
        if (_PlayPauseFill != null) {
            return _PlayPauseFill!!
        }
        _PlayPauseFill = ImageVector.Builder(
            name = "Filled.PlayPauseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 64f)
                lineTo(184f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(168f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(224f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(216f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(232f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 56f)
                close()
                moveTo(136.67f, 114.66f)
                lineTo(48.48f, 58.51f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 71.85f)
                verticalLineToRelative(112.3f)
                arcTo(15.83f, 15.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.23f, 198f)
                arcToRelative(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.25f, -0.53f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -26.68f)
                close()
            }
        }.build()

        return _PlayPauseFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlayPauseFill: ImageVector? = null
