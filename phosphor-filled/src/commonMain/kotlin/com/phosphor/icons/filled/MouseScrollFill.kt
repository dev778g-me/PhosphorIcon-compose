package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MouseScrollFill: ImageVector
    get() {
        if (_MouseScrollFill != null) {
            return _MouseScrollFill!!
        }
        _MouseScrollFill = ImageVector.Builder(
            name = "Filled.MouseScrollFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 16f)
                lineTo(112f, 16f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                horizontalLineToRelative(32f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
                lineTo(208f, 80f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 16f)
                close()
                moveTo(146.34f, 162.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(120f, 172.69f)
                lineTo(120f, 83.31f)
                lineTo(109.66f, 93.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.34f, 82.34f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(136f, 83.31f)
                verticalLineToRelative(89.38f)
                close()
            }
        }.build()

        return _MouseScrollFill!!
    }

@Suppress("ObjectPropertyName")
private var _MouseScrollFill: ImageVector? = null
