package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TestTubeFill: ImageVector
    get() {
        if (_TestTubeFill != null) {
            return _TestTubeFill!!
        }
        _TestTubeFill = ImageVector.Builder(
            name = "Filled.TestTubeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 86.34f)
                lineToRelative(-60f, -60f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(37.11f, 155.57f)
                arcToRelative(44.77f, 44.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.32f, 63.32f)
                lineTo(212.32f, 107f)
                lineToRelative(22.21f, -7.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, -13.25f)
                close()
                moveTo(205.47f, 92.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.13f, 1.93f)
                lineToRelative(-39.57f, 39.57f)
                curveToRelative(-8.47f, 2.9f, -21.75f, 4f, -39.07f, -5f)
                curveToRelative(-10.6f, -5.54f, -20.18f, -8f, -28.56f, -8.73f)
                lineTo(172f, 43.31f)
                lineTo(217.19f, 88.5f)
                close()
            }
        }.build()

        return _TestTubeFill!!
    }

@Suppress("ObjectPropertyName")
private var _TestTubeFill: ImageVector? = null
