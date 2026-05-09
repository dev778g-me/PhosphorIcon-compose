package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DeviceRotateFill: ImageVector
    get() {
        if (_DeviceRotateFill != null) {
            return _DeviceRotateFill!!
        }
        _DeviceRotateFill = ImageVector.Builder(
            name = "Filled.DeviceRotateFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(205.66f, 221.66f)
                lineToRelative(-24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 240f)
                verticalLineTo(224f)
                horizontalLineTo(80f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(88f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 205.66f, 221.66f)
                close()
                moveTo(80f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(48f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(88f)
                verticalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 72f)
                close()
            }
        }.build()

        return _DeviceRotateFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceRotateFill: ImageVector? = null
