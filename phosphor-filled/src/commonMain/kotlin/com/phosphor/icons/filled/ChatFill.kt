package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatFill: ImageVector
    get() {
        if (_ChatFill != null) {
            return _ChatFill!!
        }
        _ChatFill = ImageVector.Builder(
            name = "Filled.ChatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 64f)
                verticalLineTo(192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(83f)
                lineToRelative(-32.6f, 28.16f)
                lineToRelative(-0.09f, 0.07f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 240f)
                arcToRelative(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.79f, -1.52f)
                arcTo(15.84f, 15.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 224f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 64f)
                close()
            }
        }.build()

        return _ChatFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatFill: ImageVector? = null
