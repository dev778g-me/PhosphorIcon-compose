package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LampFill: ImageVector
    get() {
        if (_LampFill != null) {
            return _LampFill!!
        }
        _LampFill = ImageVector.Builder(
            name = "Filled.LampFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(246.68f, 156.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 160f)
                horizontalLineTo(208f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(160f)
                horizontalLineTo(136f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                verticalLineTo(160f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.35f, -11.15f)
                lineToRelative(48f, -112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 32f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.35f, 4.85f)
                lineToRelative(48f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 246.68f, 156.4f)
                close()
            }
        }.build()

        return _LampFill!!
    }

@Suppress("ObjectPropertyName")
private var _LampFill: ImageVector? = null
