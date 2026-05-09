package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShieldStarFill: ImageVector
    get() {
        if (_ShieldStarFill != null) {
            return _ShieldStarFill!!
        }
        _ShieldStarFill = ImageVector.Builder(
            name = "Filled.ShieldStarFill",
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
                curveToRelative(23.06f, 18.86f, 46f, 25.27f, 47f, 25.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                curveToRelative(1f, -0.26f, 23.91f, -6.67f, 47f, -25.53f)
                curveTo(198.48f, 196.67f, 224f, 164.72f, 224f, 112f)
                lineTo(224f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                close()
                moveTo(171f, 127.43f)
                lineTo(140.69f, 139.55f)
                lineTo(158.4f, 163.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.8f, 9.6f)
                lineTo(128f, 149.33f)
                lineTo(110.4f, 172.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.8f, -9.6f)
                lineToRelative(17.74f, -23.65f)
                lineTo(85f, 127.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 91f, 112.57f)
                lineToRelative(29f, 11.61f)
                lineTo(120f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(28.18f)
                lineToRelative(29f, -11.61f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 171f, 127.43f)
                close()
            }
        }.build()

        return _ShieldStarFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldStarFill: ImageVector? = null
