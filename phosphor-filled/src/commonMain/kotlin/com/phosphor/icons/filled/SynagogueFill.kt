package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SynagogueFill: ImageVector
    get() {
        if (_SynagogueFill != null) {
            return _SynagogueFill!!
        }
        _SynagogueFill = ImageVector.Builder(
            name = "Filled.SynagogueFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 57.38f)
                lineTo(208f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(192f, 57.38f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 80f)
                verticalLineToRelative(42.21f)
                lineTo(136f, 99.36f)
                lineTo(136f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 99.36f)
                lineTo(80f, 122.21f)
                lineTo(80f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 57.38f)
                lineTo(64f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(48f, 57.38f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 80f)
                lineTo(32f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(112f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(224f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 57.38f)
                close()
                moveTo(64f, 208f)
                lineTo(48f, 208f)
                lineTo(48f, 112f)
                lineTo(64f, 112f)
                close()
                moveTo(208f, 208f)
                lineTo(192f, 208f)
                lineTo(192f, 112f)
                horizontalLineToRelative(16f)
                close()
            }
        }.build()

        return _SynagogueFill!!
    }

@Suppress("ObjectPropertyName")
private var _SynagogueFill: ImageVector? = null
