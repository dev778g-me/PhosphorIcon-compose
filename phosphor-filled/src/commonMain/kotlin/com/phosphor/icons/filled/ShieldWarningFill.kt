package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShieldWarningFill: ImageVector
    get() {
        if (_ShieldWarningFill != null) {
            return _ShieldWarningFill!!
        }
        _ShieldWarningFill = ImageVector.Builder(
            name = "Filled.ShieldWarningFill",
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
                moveTo(120f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 184f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                close()
            }
        }.build()

        return _ShieldWarningFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldWarningFill: ImageVector? = null
