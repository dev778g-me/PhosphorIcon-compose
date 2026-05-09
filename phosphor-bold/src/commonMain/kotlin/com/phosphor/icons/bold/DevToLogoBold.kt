package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DevToLogoBold: ImageVector
    get() {
        if (_DevToLogoBold != null) {
            return _DevToLogoBold!!
        }
        _DevToLogoBold = ImageVector.Builder(
            name = "Bold.DevToLogoBold",
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
                moveTo(24f, 64f)
                lineTo(232f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 72f)
                lineTo(240f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 192f)
                lineTo(24f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 184f)
                lineTo(16f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 100f)
                lineToRelative(-20f, 0f)
                lineToRelative(0f, 56f)
                lineToRelative(20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132f, 128f)
                lineTo(120f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172f, 100f)
                lineToRelative(16f, 56f)
                lineToRelative(16f, -56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 100f)
                horizontalLineTo(64f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                verticalLineToRelative(8f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineTo(52f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                verticalLineTo(100f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 100f)
                close()
            }
        }.build()

        return _DevToLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _DevToLogoBold: ImageVector? = null
