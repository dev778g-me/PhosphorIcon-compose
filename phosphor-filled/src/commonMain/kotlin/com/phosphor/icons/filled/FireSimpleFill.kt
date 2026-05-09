package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FireSimpleFill: ImageVector
    get() {
        if (_FireSimpleFill != null) {
            return _FireSimpleFill!!
        }
        _FireSimpleFill = ImageVector.Builder(
            name = "Filled.FireSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(143.38f, 17.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.63f, 3.41f)
                lineToRelative(-22f, 60.41f)
                lineTo(84.59f, 58.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.93f, 0.89f)
                curveTo(51f, 87.53f, 40f, 116.08f, 40f, 144f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                curveTo(216f, 84.55f, 165.21f, 36f, 143.38f, 17.85f)
                close()
            }
        }.build()

        return _FireSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _FireSimpleFill: ImageVector? = null
