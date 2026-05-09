package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BackspaceFill: ImageVector
    get() {
        if (_BackspaceFill != null) {
            return _BackspaceFill!!
        }
        _BackspaceFill = ImageVector.Builder(
            name = "Filled.BackspaceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(68.53f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.72f, 7.77f)
                lineTo(9.14f, 123.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.24f)
                lineToRelative(45.67f, 76.11f)
                horizontalLineToRelative(0f)
                arcTo(16.11f, 16.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 68.53f, 216f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(165.66f, 146.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(136f, 139.31f)
                lineToRelative(-18.35f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, -11.32f)
                lineTo(124.69f, 128f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.31f, -11.32f)
                lineTo(136f, 116.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(147.31f, 128f)
                close()
            }
        }.build()

        return _BackspaceFill!!
    }

@Suppress("ObjectPropertyName")
private var _BackspaceFill: ImageVector? = null
