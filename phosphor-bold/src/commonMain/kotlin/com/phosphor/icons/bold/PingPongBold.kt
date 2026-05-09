package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PingPongBold: ImageVector
    get() {
        if (_PingPongBold != null) {
            return _PingPongBold!!
        }
        _PingPongBold = ImageVector.Builder(
            name = "Bold.PingPongBold",
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
                moveTo(134.58f, 206.59f)
                arcTo(31.78f, 31.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106f, 215.41f)
                curveTo(63.4f, 207f, 31.38f, 167.92f, 32f, 122.69f)
                curveToRelative(0.69f, -49.55f, 41.13f, -90f, 90.68f, -90.68f)
                curveToRelative(45.23f, -0.63f, 84.27f, 31.39f, 92.72f, 74f)
                arcToRelative(31.78f, 31.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.82f, 28.58f)
                lineTo(185f, 156.21f)
                lineToRelative(43.69f, 34.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12.16f)
                lineTo(203f, 229.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.16f, -1f)
                lineTo(156.21f, 185f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(203.68f, 76.32f)
                lineTo(76.32f, 203.68f)
            }
        }.build()

        return _PingPongBold!!
    }

@Suppress("ObjectPropertyName")
private var _PingPongBold: ImageVector? = null
