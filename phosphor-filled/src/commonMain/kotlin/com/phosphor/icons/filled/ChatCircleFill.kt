package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatCircleFill: ImageVector
    get() {
        if (_ChatCircleFill != null) {
            return _ChatCircleFill!!
        }
        _ChatCircleFill = ImageVector.Builder(
            name = "Filled.ChatCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.12f, 219.82f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 128f)
                close()
            }
        }.build()

        return _ChatCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleFill: ImageVector? = null
