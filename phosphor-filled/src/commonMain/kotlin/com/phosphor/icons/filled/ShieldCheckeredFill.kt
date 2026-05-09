package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShieldCheckeredFill: ImageVector
    get() {
        if (_ShieldCheckeredFill != null) {
            return _ShieldCheckeredFill!!
        }
        _ShieldCheckeredFill = ImageVector.Builder(
            name = "Filled.ShieldCheckeredFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 40f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46f, 25.27f, 47f, 25.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                curveToRelative(1f, -0.26f, 23.91f, -6.67f, 47f, -25.53f)
                curveTo(198.48f, 196.67f, 224f, 164.72f, 224f, 112f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                close()
                moveTo(128f, 223.62f)
                arcToRelative(128.25f, 128.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.92f, -21.81f)
                curveTo(65.83f, 182.79f, 52.37f, 158f, 48.9f, 128f)
                horizontalLineTo(128f)
                verticalLineTo(56f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(56f)
                arcToRelative(141.24f, 141.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 16f)
                horizontalLineTo(128f)
                verticalLineToRelative(95.62f)
                close()
            }
        }.build()

        return _ShieldCheckeredFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCheckeredFill: ImageVector? = null
