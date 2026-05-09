package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsVerticalFill: ImageVector
    get() {
        if (_ArrowsVerticalFill != null) {
            return _ArrowsVerticalFill!!
        }
        _ArrowsVerticalFill = ImageVector.Builder(
            name = "Filled.ArrowsVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(167.39f, 196.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.73f, 8.72f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 192f)
                horizontalLineToRelative(24f)
                verticalLineTo(64f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 64f)
                horizontalLineTo(136f)
                verticalLineTo(192f)
                horizontalLineToRelative(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167.39f, 196.94f)
                close()
            }
        }.build()

        return _ArrowsVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsVerticalFill: ImageVector? = null
