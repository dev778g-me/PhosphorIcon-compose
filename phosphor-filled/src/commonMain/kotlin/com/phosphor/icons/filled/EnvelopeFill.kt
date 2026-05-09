package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EnvelopeFill: ImageVector
    get() {
        if (_EnvelopeFill != null) {
            return _EnvelopeFill!!
        }
        _EnvelopeFill = ImageVector.Builder(
            name = "Filled.EnvelopeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                lineTo(32f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(24f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                close()
                moveTo(98.71f, 128f)
                lineTo(40f, 181.81f)
                lineTo(40f, 74.19f)
                close()
                moveTo(110.55f, 138.85f)
                lineTo(122.55f, 149.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.82f, 0f)
                lineToRelative(12f, -11.05f)
                lineToRelative(58f, 53.15f)
                lineTo(52.57f, 192f)
                close()
                moveTo(157.29f, 128f)
                lineTo(216f, 74.18f)
                lineTo(216f, 181.82f)
                close()
            }
        }.build()

        return _EnvelopeFill!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeFill: ImageVector? = null
