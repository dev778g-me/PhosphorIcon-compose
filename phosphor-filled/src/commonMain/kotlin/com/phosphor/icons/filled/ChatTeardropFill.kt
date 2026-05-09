package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatTeardropFill: ImageVector
    get() {
        if (_ChatTeardropFill != null) {
            return _ChatTeardropFill!!
        }
        _ChatTeardropFill = ImageVector.Builder(
            name = "Filled.ChatTeardropFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 124f)
                arcTo(100.11f, 100.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 224f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(124f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 0f)
                close()
            }
        }.build()

        return _ChatTeardropFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropFill: ImageVector? = null
