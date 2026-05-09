package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatsCircleFill: ImageVector
    get() {
        if (_ChatsCircleFill != null) {
            return _ChatsCircleFill!!
        }
        _ChatsCircleFill = ImageVector.Builder(
            name = "Filled.ChatsCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232.07f, 186.76f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -62.5f, -114.17f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 23.93f, 138.76f)
                lineToRelative(-7.27f, 24.71f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.87f, 19.87f)
                lineToRelative(24.71f, -7.27f)
                arcToRelative(80.39f, 80.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.18f, 7.35f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108.34f, 40.65f)
                lineToRelative(24.71f, 7.27f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.87f, -19.86f)
                close()
                moveTo(215.82f, 188.23f)
                lineTo(224f, 216f)
                lineToRelative(-27.76f, -8.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0.63f)
                arcToRelative(64.05f, 64.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -85.87f, -24.88f)
                arcTo(79.93f, 79.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174.7f, 89.71f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.75f, 92.48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.82f, 188.23f)
                close()
            }
        }.build()

        return _ChatsCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsCircleFill: ImageVector? = null
