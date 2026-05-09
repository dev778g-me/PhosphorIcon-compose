package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UsbFill: ImageVector
    get() {
        if (_UsbFill != null) {
            return _UsbFill!!
        }
        _UsbFill = ImageVector.Builder(
            name = "Filled.UsbFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(252f, 128f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, 3.33f)
                lineToRelative(-48f, 32f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 160f)
                verticalLineTo(136f)
                horizontalLineTo(72f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-8f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -12f)
                horizontalLineToRelative(32f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                verticalLineToRelative(32f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                horizontalLineTo(120f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
                verticalLineToRelative(-8f)
                horizontalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(136f)
                horizontalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(56f)
                verticalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 56f)
                horizontalLineToRelative(37.17f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(72f)
                verticalLineToRelative(48f)
                horizontalLineTo(196f)
                verticalLineTo(96f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.22f, -3.33f)
                lineToRelative(48f, 32f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 252f, 128f)
                close()
            }
        }.build()

        return _UsbFill!!
    }

@Suppress("ObjectPropertyName")
private var _UsbFill: ImageVector? = null
