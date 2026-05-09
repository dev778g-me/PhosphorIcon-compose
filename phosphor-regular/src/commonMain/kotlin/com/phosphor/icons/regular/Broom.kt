package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "Regular.Broom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 224f)
                arcToRelative(95.2f, 95.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -29f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 152f)
                curveToRelative(0f, 31.67f, 13.31f, 59f, 40f, 72f)
                horizontalLineTo(61f)
                arcTo(103.65f, 103.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 152f)
                curveToRelative(0f, -28.21f, 11.23f, -50.89f, 29.47f, -69.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.67f, -1.81f)
                lineTo(95.52f, 90.83f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.82f, -9f)
                lineToRelative(21f, -53.11f)
                curveToRelative(4.15f, -10f, 15.47f, -15.32f, 25.63f, -11.53f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.51f, 26.4f)
                lineTo(153.13f, 96.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.93f, 20.76f)
                lineTo(187f, 127.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7.43f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(43.93f, 105.57f)
                lineTo(192.8f, 165.12f)
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null
