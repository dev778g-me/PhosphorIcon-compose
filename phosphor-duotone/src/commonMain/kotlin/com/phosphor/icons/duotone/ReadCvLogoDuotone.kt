package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ReadCvLogoDuotone: ImageVector
    get() {
        if (_ReadCvLogoDuotone != null) {
            return _ReadCvLogoDuotone!!
        }
        _ReadCvLogoDuotone = ImageVector.Builder(
            name = "Duotone.ReadCvLogoDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(79.19f, 24.14f)
                lineTo(209.45f, 47.16f)
                arcTo(8f, 8f, 54.83f, isMoreThanHalf = false, isPositiveArc = true, 215.93f, 56.43f)
                lineTo(186.08f, 225.4f)
                arcTo(8f, 8f, 122.04f, isMoreThanHalf = false, isPositiveArc = true, 176.81f, 231.89f)
                lineTo(46.55f, 208.87f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 40.07f, 199.6f)
                lineTo(69.92f, 30.63f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 79.19f, 24.14f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(79.19f, 24.14f)
                lineTo(209.45f, 47.16f)
                arcTo(8f, 8f, 54.83f, isMoreThanHalf = false, isPositiveArc = true, 215.93f, 56.43f)
                lineTo(186.08f, 225.4f)
                arcTo(8f, 8f, 122.04f, isMoreThanHalf = false, isPositiveArc = true, 176.81f, 231.89f)
                lineTo(46.55f, 208.87f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 40.07f, 199.6f)
                lineTo(69.92f, 30.63f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 79.19f, 24.14f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(97.22f, 59.81f)
                lineTo(180.2f, 74.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(174.66f, 105.98f)
                lineTo(91.67f, 91.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(127.62f, 130.17f)
                lineTo(86.13f, 122.84f)
            }
        }.build()

        return _ReadCvLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ReadCvLogoDuotone: ImageVector? = null
