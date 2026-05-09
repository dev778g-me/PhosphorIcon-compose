package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsLeftRightFill: ImageVector
    get() {
        if (_ArrowsLeftRightFill != null) {
            return _ArrowsLeftRightFill!!
        }
        _ArrowsLeftRightFill = ImageVector.Builder(
            name = "Filled.ArrowsLeftRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 181.66f)
                lineToRelative(-32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 208f)
                lineTo(168f, 184f)
                lineTo(48f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(168f, 168f)
                lineTo(168f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.66f, 181.66f)
                close()
                moveTo(74.34f, 117.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 112f)
                lineTo(88f, 88f)
                lineTo(208f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(88f, 72f)
                lineTo(88f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                close()
            }
        }.build()

        return _ArrowsLeftRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsLeftRightFill: ImageVector? = null
