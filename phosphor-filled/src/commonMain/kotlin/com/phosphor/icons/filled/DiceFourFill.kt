package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DiceFourFill: ImageVector
    get() {
        if (_DiceFourFill != null) {
            return _DiceFourFill!!
        }
        _DiceFourFill = ImageVector.Builder(
            name = "Filled.DiceFourFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 32f)
                lineTo(64f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
                lineTo(32f, 192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                lineTo(192f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(224f, 64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                close()
                moveTo(100f, 168f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 168f)
                close()
                moveTo(100f, 112f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 112f)
                close()
                moveTo(156f, 168f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 168f)
                close()
                moveTo(156f, 112f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 112f)
                close()
            }
        }.build()

        return _DiceFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiceFourFill: ImageVector? = null
