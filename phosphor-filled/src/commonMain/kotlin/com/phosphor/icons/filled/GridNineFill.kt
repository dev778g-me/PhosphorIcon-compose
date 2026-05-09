package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GridNineFill: ImageVector
    get() {
        if (_GridNineFill != null) {
            return _GridNineFill!!
        }
        _GridNineFill = ImageVector.Builder(
            name = "Filled.GridNineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(84f, 52f)
                lineTo(84f, 92f)
                lineTo(28f, 92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(24f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                lineTo(80f, 48f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 52f)
                close()
                moveTo(100f, 204f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(156f, 164f)
                lineTo(100f, 164f)
                close()
                moveTo(24f, 168f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(80f, 208f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(84f, 164f)
                lineTo(28f, 164f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 168f)
                close()
                moveTo(24f, 112f)
                verticalLineToRelative(32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(84f, 148f)
                lineTo(84f, 108f)
                lineTo(28f, 108f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 112f)
                close()
                moveTo(152f, 48f)
                lineTo(104f, 48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                lineTo(100f, 92f)
                horizontalLineToRelative(56f)
                lineTo(156f, 52f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 48f)
                close()
                moveTo(228f, 108f)
                lineTo(172f, 108f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(232f, 112f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228f, 108f)
                close()
                moveTo(100f, 148f)
                horizontalLineToRelative(56f)
                lineTo(156f, 108f)
                lineTo(100f, 108f)
                close()
                moveTo(216f, 48f)
                lineTo(176f, 48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                lineTo(172f, 92f)
                horizontalLineToRelative(56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(232f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(228f, 164f)
                lineTo(172f, 164f)
                verticalLineToRelative(40f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 168f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228f, 164f)
                close()
            }
        }.build()

        return _GridNineFill!!
    }

@Suppress("ObjectPropertyName")
private var _GridNineFill: ImageVector? = null
