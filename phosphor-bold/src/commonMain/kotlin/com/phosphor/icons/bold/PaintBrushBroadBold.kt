package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PaintBrushBroadBold: ImageVector
    get() {
        if (_PaintBrushBroadBold != null) {
            return _PaintBrushBroadBold!!
        }
        _PaintBrushBroadBold = ImageVector.Builder(
            name = "Bold.PaintBrushBroadBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 108f)
                lineTo(216f, 108f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.92f, 9.13f)
                lineTo(152f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                lineToRelative(3.92f, -46.87f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100f, 152f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                horizontalLineTo(216f)
                verticalLineTo(136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172f, 32f)
                lineTo(172f, 68f)
            }
        }.build()

        return _PaintBrushBroadBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushBroadBold: ImageVector? = null
