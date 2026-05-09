package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FireFill: ImageVector
    get() {
        if (_FireFill != null) {
            return _FireFill!!
        }
        _FireFill = ImageVector.Builder(
            name = "Filled.FireFill",
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
                moveTo(183.89f, 153.34f)
                arcToRelative(57.6f, 57.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.56f, 46.55f)
                arcTo(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -15.89f)
                curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.78f, 2.68f)
                close()
            }
        }.build()

        return _FireFill!!
    }

@Suppress("ObjectPropertyName")
private var _FireFill: ImageVector? = null
