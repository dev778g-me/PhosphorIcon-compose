package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShieldCheckFill: ImageVector
    get() {
        if (_ShieldCheckFill != null) {
            return _ShieldCheckFill!!
        }
        _ShieldCheckFill = ImageVector.Builder(
            name = "Filled.ShieldCheckFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 40f)
                lineTo(48f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46f, 25.26f, 47f, 25.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                curveToRelative(1f, -0.27f, 23.91f, -6.67f, 47f, -25.53f)
                curveTo(198.48f, 196.67f, 224f, 164.72f, 224f, 112f)
                lineTo(224f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                close()
                moveTo(173.68f, 109.66f)
                lineTo(117.68f, 165.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(112f, 148.69f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _ShieldCheckFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCheckFill: ImageVector? = null
