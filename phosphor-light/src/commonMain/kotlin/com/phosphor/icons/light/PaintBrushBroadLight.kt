package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PaintBrushBroadLight: ImageVector
    get() {
        if (_PaintBrushBroadLight != null) {
            return _PaintBrushBroadLight!!
        }
        _PaintBrushBroadLight = ImageVector.Builder(
            name = "Light.PaintBrushBroadLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 112f)
                lineTo(216f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                horizontalLineTo(216f)
                verticalLineTo(136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.92f, 9.13f)
                lineTo(152f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                lineToRelative(7.92f, -46.87f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 32f)
                lineTo(184f, 80f)
            }
        }.build()

        return _PaintBrushBroadLight!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushBroadLight: ImageVector? = null
