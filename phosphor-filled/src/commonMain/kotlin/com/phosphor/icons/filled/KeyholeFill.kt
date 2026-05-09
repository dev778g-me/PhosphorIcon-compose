package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.KeyholeFill: ImageVector
    get() {
        if (_KeyholeFill != null) {
            return _KeyholeFill!!
        }
        _KeyholeFill = ImageVector.Builder(
            name = "Filled.KeyholeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(157.52f, 170.39f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.66f, 5.61f)
                lineTo(102.14f, 176f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.66f, -5.61f)
                lineTo(112f, 139.72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                close()
            }
        }.build()

        return _KeyholeFill!!
    }

@Suppress("ObjectPropertyName")
private var _KeyholeFill: ImageVector? = null
