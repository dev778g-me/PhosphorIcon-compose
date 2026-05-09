package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.GavelBold: ImageVector
    get() {
        if (_GavelBold != null) {
            return _GavelBold!!
        }
        _GavelBold = ImageVector.Builder(
            name = "Bold.GavelBold",
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
                moveTo(58.35f, 82.34f)
                lineTo(122.35f, 18.34f)
                arcTo(8f, 8f, 102.11f, isMoreThanHalf = false, isPositiveArc = true, 133.67f, 18.34f)
                lineTo(149.67f, 34.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 149.67f, 45.65f)
                lineTo(85.67f, 109.65f)
                arcTo(8f, 8f, 49.93f, isMoreThanHalf = false, isPositiveArc = true, 74.35f, 109.65f)
                lineTo(58.35f, 93.65f)
                arcTo(8f, 8f, 60.95f, isMoreThanHalf = false, isPositiveArc = true, 58.35f, 82.34f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(146.35f, 170.34f)
                lineTo(210.35f, 106.34f)
                arcTo(8f, 8f, 93.56f, isMoreThanHalf = false, isPositiveArc = true, 221.67f, 106.34f)
                lineTo(237.67f, 122.34f)
                arcTo(8f, 8f, 93.56f, isMoreThanHalf = false, isPositiveArc = true, 237.67f, 133.65f)
                lineTo(173.67f, 197.65f)
                arcTo(8f, 8f, 60.95f, isMoreThanHalf = false, isPositiveArc = true, 162.36f, 197.65f)
                lineTo(146.35f, 181.65f)
                arcTo(8f, 8f, 60.95f, isMoreThanHalf = false, isPositiveArc = true, 146.35f, 170.34f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(145.66f, 49.66f)
                lineTo(206.34f, 110.34f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(89.66f, 105.66f)
                lineTo(150.34f, 166.34f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(134.14f, 150.14f)
                lineToRelative(-68f, 68f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.28f, -28.28f)
                lineToRelative(68f, -68f)
            }
        }.build()

        return _GavelBold!!
    }

@Suppress("ObjectPropertyName")
private var _GavelBold: ImageVector? = null
