package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PenFill: ImageVector
    get() {
        if (_PenFill != null) {
            return _PenFill!!
        }
        _PenFill = ImageVector.Builder(
            name = "Filled.PenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(36.69f, 152f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 219.31f)
                lineToRelative(83.67f, -83.66f)
                lineToRelative(3.48f, 13.9f)
                lineToRelative(-36.8f, 36.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 11.32f)
                lineToRelative(40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, -7.6f)
                lineToRelative(-6.9f, -27.61f)
                lineTo(227.32f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.32f, 73.37f)
                close()
                moveTo(192f, 108.69f)
                lineTo(147.32f, 64f)
                lineToRelative(24f, -24f)
                lineTo(216f, 84.69f)
                close()
            }
        }.build()

        return _PenFill!!
    }

@Suppress("ObjectPropertyName")
private var _PenFill: ImageVector? = null
