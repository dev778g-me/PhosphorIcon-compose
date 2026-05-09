package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PaintBrushBroadFill: ImageVector
    get() {
        if (_PaintBrushBroadFill != null) {
            return _PaintBrushBroadFill!!
        }
        _PaintBrushBroadFill = ImageVector.Builder(
            name = "Filled.PaintBrushBroadFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 24f)
                horizontalLineTo(72f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
                verticalLineToRelative(72f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(48f)
                lineToRelative(-7.89f, 46.67f)
                arcTo(8.42f, 8.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 208f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                arcToRelative(8.42f, 8.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.11f, -1.33f)
                lineTo(152f, 160f)
                horizontalLineToRelative(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 24f)
                close()
                moveTo(72f, 40f)
                horizontalLineTo(176f)
                verticalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(40f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(72f)
                horizontalLineTo(48f)
                verticalLineTo(64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 40f)
                close()
            }
        }.build()

        return _PaintBrushBroadFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushBroadFill: ImageVector? = null
