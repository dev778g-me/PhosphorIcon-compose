package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CaretLineRightFill: ImageVector
    get() {
        if (_CaretLineRightFill != null) {
            return _CaretLineRightFill!!
        }
        _CaretLineRightFill = ImageVector.Builder(
            name = "Filled.CaretLineRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.66f, 122.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-80f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 208f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                close()
                moveTo(184f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                close()
            }
        }.build()

        return _CaretLineRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineRightFill: ImageVector? = null
