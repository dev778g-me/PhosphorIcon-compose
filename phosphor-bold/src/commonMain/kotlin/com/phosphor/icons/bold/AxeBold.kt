package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AxeBold: ImageVector
    get() {
        if (_AxeBold != null) {
            return _AxeBold!!
        }
        _AxeBold = ImageVector.Builder(
            name = "Bold.AxeBold",
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
                moveTo(164.47f, 185.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.6f, -4.68f)
                curveToRelative(-7.09f, -53.14f, -42.41f, -83.8f, -59.45f, -95.76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.33f, 73f)
                lineTo(129f, 34.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.2f, 1.09f)
                curveToRelative(12f, 17f, 42.62f, 52.36f, 95.76f, 59.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.68f, 13.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128.93f, 123.35f)
                lineTo(46.14f, 206.14f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.28f, -28.28f)
                lineToRelative(84.31f, -84.32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(149.54f, 46.17f)
                lineToRelative(16.32f, -16.31f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.28f, 28.28f)
                lineTo(179.35f, 72.93f)
            }
        }.build()

        return _AxeBold!!
    }

@Suppress("ObjectPropertyName")
private var _AxeBold: ImageVector? = null
